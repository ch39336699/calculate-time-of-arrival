package com.fedex.shipment.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fedex.shipment.entity.Shipment;
import com.fedex.shipment.entity.ShipmentPK;

public interface ShipmentRepository extends JpaRepository<Shipment, ShipmentPK> {
	 @Query("SELECT s FROM Shipment s WHERE s.id.localShipmentOidNbr = ?1")
	Shipment getShipId(Long localShipmentOidNbr); 
}
