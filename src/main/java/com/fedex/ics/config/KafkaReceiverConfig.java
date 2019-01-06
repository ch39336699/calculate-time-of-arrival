package com.fedex.ics.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.transaction.annotation.Transactional;

import com.fedex.ics.worker.CalculateTimeOfArrivalWorker;

@Configuration
@EnableKafka
public class KafkaReceiverConfig {
  private static final Log logger = LogFactory.getLog(KafkaReceiverConfig.class);
    
  @Value("localhost:9092")
  private String bootstrapServers;
  
  @Autowired
  private CalculateTimeOfArrivalWorker worker;
  

  @Bean
  public Map<String, Object> consumerConfigs() {
      Map<String, Object> props = new HashMap<>();
      props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
      props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
      props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
      props.put(ConsumerConfig.GROUP_ID_CONFIG, "timeOfArrival");
      props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
      return props;
  }

  @Bean
  public ConsumerFactory<String, String> consumerFactory() {
    return new DefaultKafkaConsumerFactory<>(consumerConfigs());
  }

  @Bean
  public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
    ConcurrentKafkaListenerContainerFactory<String, String> factory =
        new ConcurrentKafkaListenerContainerFactory<>();
    factory.setConsumerFactory(consumerFactory());
    return factory;
  }
  
  @Transactional
  @KafkaListener(topics = "fromOrch")
  public void receive(@Payload String payload,
                      @Header(KafkaHeaders.OFFSET) Long offset,
                     // @Header(KafkaHeaders.CONSUMER) KafkaConsumer<String, String> consumer,
                     // @Header(KafkaHeaders.TIMESTAMP_TYPE) String timestampType,
                      @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                      @Header(KafkaHeaders.RECEIVED_PARTITION_ID) Integer partitionId,
                      @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String appID
                     // @Header(KafkaHeaders.RECEIVED_TIMESTAMP) Long timestamp,
                      ) {
    String[] values = payload.split(":");
    logger.info("CalculateTimeOfArrival Recieved: " + values[0] + " appID: " + appID + " Shipment: " + values[1]);
    if(appID.contains("1002"))
    {
      logger.info("CalculateTimeOfArrival Processing... " + values[1]);
      worker.doWork(values[0], appID, values[1]);
    }
  }
}