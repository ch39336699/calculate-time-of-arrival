package com.fedex.shipment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fedex.shipment.entity.ErrReprocess;
import com.fedex.shipment.entity.Shipment;
import com.fedex.shipment.worker.ShipmentWorker;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {
  
  @Autowired
  private ShipmentWorker shipmentWorker;
  
  @GetMapping("/hello")
  public String hello(@RequestParam String message) {
    
  return shipmentWorker.toLower(message); 
  }

  @GetMapping("/hello/{message}")
  public String helloWithPath(@PathVariable("message") String message) {
    if(message != null)
    {
      return shipmentWorker.toLower(message);
    }
    return null;
  }
  
  @PostMapping(value = {"/errorQueueUtility"})
  public String getQuerNameToReprocessMessage(@RequestBody ErrReprocess errReprocess) {
   // ResponseEntity<String> response = errReprocess.getMyString();
    
    return errReprocess.getNewMyString();
  }
  
  @GetMapping("/{id}")
  public Shipment getShipmentByOid(@PathVariable Long id) {
     return shipmentWorker.getShipmentByOid(id);
  }
  
}
