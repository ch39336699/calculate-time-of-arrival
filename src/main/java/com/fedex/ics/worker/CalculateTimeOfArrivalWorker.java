package com.fedex.ics.worker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.fedex.ics.entity.Shipment;
import com.fedex.ics.jpa.CalculateTimeOfArrivalRepository;

@Component
public class CalculateTimeOfArrivalWorker {
  
  private static final Log logger = LogFactory.getLog(CalculateTimeOfArrivalWorker.class);
  @Autowired
  private CalculateTimeOfArrivalRepository repo;  
  
  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;
  private String streamID;
  private String appID;
  private String shipment;
  
  public String toLower(String message) {
    return message.toLowerCase();
  }
  
  public void doWork(String streamID, String appID, String shipment) {
    this.streamID = streamID;
    this.appID = appID;
    this.shipment = shipment;
    logger.info(
        "streamID: "
            + streamID);
    String importantInfo[] = {"10 secs...", "20 secs..."};

    for (int i = 0; i < importantInfo.length; i++) {
      // Pause for 4 seconds
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      // Print a message
      logger.info(importantInfo[i]);
    }
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    // Get the date today using Calendar object.
    Date today = Calendar.getInstance().getTime();
    // Using DateFormat format method we can create a string
    // representation of a date with the defined format.
    String reportDate = df.format(today);
    int app = Integer.parseInt(appID);
    logger.info("Writing to Test Database");
    String message = "APPID " + appID + " Processed shipment " + shipment;
    this.sendRespose();
  }

  public void sendRespose() {
    Message<String> message = MessageBuilder
        .withPayload(this.streamID + ":" + shipment)
          .setHeader(KafkaHeaders.TOPIC, "toOrch")
          .setHeader(KafkaHeaders.MESSAGE_KEY, appID)
          // .setHeader(KafkaHeaders.MESSAGE_KEY, messageKey)
          .setHeader(KafkaHeaders.PARTITION_ID, 0)
          .setHeader("X-Custom-Header", "Sending Custom Header with Spring Kafka")
          .build();
    kafkaTemplate.send(message);
    logger.info(
        "Sent streamID: "
            + streamID
            + " appID: "
            + appID);
  }


  public Shipment getShipmentByOid(Long oid) {
	    return repo.getShipId(oid);
  }

}
