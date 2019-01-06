package com.fedex.ics.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fedex.ics.entity.Shipment;
import com.fedex.ics.entity.ShipmentPK;

public interface CalculateTimeOfArrivalRepository extends JpaRepository<Shipment, ShipmentPK> {
	 @Query("SELECT s FROM Shipment s WHERE s.id.localShipmentOidNbr = ?1")
	Shipment getShipId(Long localShipmentOidNbr); 
}
