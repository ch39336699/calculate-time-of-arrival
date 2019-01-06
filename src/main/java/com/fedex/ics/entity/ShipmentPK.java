package com.fedex.ics.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the SHIPMENT database table.
 * 
 */
@Embeddable
public class ShipmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="LOCAL_SHIPMENT_OID_NBR")
	private long localShipmentOidNbr;

	@Column(name="SHIPMENT_TYPE_CD")
	private long shipmentTypeCd;

	public ShipmentPK() {
	}
	public long getLocalShipmentOidNbr() {
		return this.localShipmentOidNbr;
	}
	public void setLocalShipmentOidNbr(long localShipmentOidNbr) {
		this.localShipmentOidNbr = localShipmentOidNbr;
	}
	public long getShipmentTypeCd() {
		return this.shipmentTypeCd;
	}
	public void setShipmentTypeCd(long shipmentTypeCd) {
		this.shipmentTypeCd = shipmentTypeCd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ShipmentPK)) {
			return false;
		}
		ShipmentPK castOther = (ShipmentPK)other;
		return 
			(this.localShipmentOidNbr == castOther.localShipmentOidNbr)
			&& (this.shipmentTypeCd == castOther.shipmentTypeCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.localShipmentOidNbr ^ (this.localShipmentOidNbr >>> 32)));
		hash = hash * prime + ((int) (this.shipmentTypeCd ^ (this.shipmentTypeCd >>> 32)));
		
		return hash;
	}
}