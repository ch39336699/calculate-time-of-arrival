package com.fedex.ics.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the SHIPMENT database table.
 * 
 */
@Entity
@Table (schema="CIM_ACE")
@NamedQuery(name="Shipment.findAll", query="SELECT s FROM Shipment s")
public class Shipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ShipmentPK id;

	@Column(name="ACI_DOWNLOAD_FLG")
	private String aciDownloadFlg;

	@Column(name="AWB_NBR")
	private String awbNbr;

	@Column(name="BASE_CHARGE_AMT")
	private BigDecimal baseChargeAmt;

	@Column(name="BROKER_DEST_LOC_CD")
	private String brokerDestLocCd;

	@Column(name="CARGO_DESC")
	private String cargoDesc;

	@Column(name="CARGO_QTY")
	private BigDecimal cargoQty;

	@Column(name="CARRIAGE_VALUE_AMT")
	private BigDecimal carriageValueAmt;

	@Column(name="CASH_IN_ADVANCE_FLG")
	private String cashInAdvanceFlg;

	@Column(name="CI_IMAGE_FLG")
	private String ciImageFlg;

	@Column(name="CI_SEQ_NBR")
	private String ciSeqNbr;

	@Column(name="COMAT_FLG")
	private String comatFlg;

	@Column(name="CONSOLIDATED_FREIGHT_FLG")
	private String consolidatedFreightFlg;

	@Column(name="CONTAINER_NBR")
	private String containerNbr;

	@Column(name="CONTRACT_WGT_TYPE_CD")
	private String contractWgtTypeCd;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DT")
	private Date createDt;

	@Column(name="CSA_FLG")
	private String csaFlg;

	@Column(name="CUSTOMER_SEQ_NBR")
	private BigDecimal customerSeqNbr;

	@Column(name="CUSTOMS_CLEARANCE_CD")
	private String customsClearanceCd;

	@Column(name="CUSTOMS_CLEARANCE_ENTRY_FLG")
	private String customsClearanceEntryFlg;

	@Column(name="CUSTOMS_VALUE_AMT")
	private BigDecimal customsValueAmt;

	@Column(name="DANG_GOODS_CD")
	private String dangGoodsCd;

	@Column(name="DATA_ENTRY_LOCATION_CD")
	private String dataEntryLocationCd;

	@Column(name="DELETED_FLG")
	private String deletedFlg;

	@Column(name="DEST_CUSTOMS_CURRENCY_CD")
	private String destCustomsCurrencyCd;

	@Column(name="DEST_CUSTOMS_VALUE_AMT")
	private BigDecimal destCustomsValueAmt;

	@Column(name="DEST_EEC_FLG")
	private String destEecFlg;

	@Column(name="DEST_LOC_CITY_NM")
	private String destLocCityNm;

	@Column(name="DEST_LOC_CNTRY_CD")
	private String destLocCntryCd;

	@Column(name="DEST_LOC_STATE_CD")
	private String destLocStateCd;

	@Column(name="DEST_LOCATION_CD")
	private String destLocationCd;

	@Column(name="DIM_HEIGHT_QTY")
	private BigDecimal dimHeightQty;

	@Column(name="DIM_LENGTH_QTY")
	private BigDecimal dimLengthQty;

	@Column(name="DIM_SHIPMENT_FLG")
	private String dimShipmentFlg;

	@Column(name="DIM_WGT")
	private BigDecimal dimWgt;

	@Column(name="DIM_WIDTH_QTY")
	private BigDecimal dimWidthQty;

	@Column(name="DISCHARGE_LOCATION_CD")
	private String dischargeLocationCd;

	@Column(name="DROP_DSCNT_CD")
	private String dropDscntCd;

	@Column(name="DUTIABLE_FLG")
	private String dutiableFlg;

	@Column(name="DUTY_BILL_TO_ACCT_NBR")
	private BigDecimal dutyBillToAcctNbr;

	@Column(name="DUTY_BILL_TO_CD")
	private String dutyBillToCd;

	@Column(name="DUTY_CASH_FLG")
	private String dutyCashFlg;

	@Column(name="DUTY_CREDIT_CARD_FLG")
	private String dutyCreditCardFlg;

	@Column(name="ECS_FILING_STATUS_CD")
	private String ecsFilingStatusCd;

	@Column(name="ETL_TMSTP")
	private Timestamp etlTmstp;

	@Column(name="EXPORT_COUNTRY_CD")
	private String exportCountryCd;

	@Column(name="EXPORT_LICENSE_FLG")
	private String exportLicenseFlg;

	@Column(name="FDA_CONFIRMATION_FLG")
	private String fdaConfirmationFlg;

	@Column(name="FEDEX_ASSIGNED_MAWB_NBR")
	private String fedexAssignedMawbNbr;

	@Column(name="FINAL_IMPORT_CLEARANCE_LOC_CD")
	private String finalImportClearanceLocCd;

	@Column(name="FORM_TYPE_CD")
	private String formTypeCd;

	@Column(name="FREE_DOMICILE_CD")
	private String freeDomicileCd;

	@Column(name="FREIGHT_CHARGE_AMT")
	private BigDecimal freightChargeAmt;

	@Column(name="FTSR_NBR")
	private BigDecimal ftsrNbr;

	@Column(name="GOODS_CLASS_CD")
	private String goodsClassCd;

	@Column(name="HAL_FLG")
	private String halFlg;

	@Column(name="HAL_PHONE_NBR")
	private String halPhoneNbr;

	@Column(name="HANDLING_UNIT_QTY")
	private BigDecimal handlingUnitQty;

	@Column(name="HAWB_SERIAL_NBR")
	private BigDecimal hawbSerialNbr;

	@Column(name="IMAGE_FOLDER_ID_CD")
	private String imageFolderIdCd;

	@Temporal(TemporalType.DATE)
	@Column(name="INPUT_TMSTP")
	private Date inputTmstp;

	@Column(name="INTERMEDIATE_CONSIGNEE_CD")
	private String intermediateConsigneeCd;

	@Column(name="INVOICE_CD")
	private String invoiceCd;

	@Column(name="KEYED_CURRENCY_CD")
	private String keyedCurrencyCd;

	@Column(name="KEYER_NM")
	private String keyerNm;

	@Column(name="LAST_MODIFIED_NM")
	private String lastModifiedNm;

	@Column(name="LAST_MODIFIED_TMSTP")
	private Timestamp lastModifiedTmstp;

	@Column(name="LOCAL_CUSTOMS_CURRENCY_CD")
	private String localCustomsCurrencyCd;

	@Column(name="LOCAL_CUSTOMS_VALUE_AMT")
	private BigDecimal localCustomsValueAmt;

	@Column(name="MANIFEST_STATUS_CD")
	private String manifestStatusCd;

	@Column(name="MANUF_ORIG_CNTRY_CD")
	private String manufOrigCntryCd;

	@Column(name="MDE_SOURCE_CD")
	private String mdeSourceCd;

	@Column(name="METER_NBR")
	private BigDecimal meterNbr;

	@Column(name="ODA_CHARGE_FLG")
	private String odaChargeFlg;

	@Column(name="OPA_CHARGE_FLG")
	private String opaChargeFlg;

	@Column(name="ORIGIN_EEC_FLG")
	private String originEecFlg;

	@Column(name="ORIGIN_LOC_CITY_NM")
	private String originLocCityNm;

	@Column(name="ORIGIN_LOC_CNTRY_CD")
	private String originLocCntryCd;

	@Column(name="ORIGIN_LOC_STATE_CD")
	private String originLocStateCd;

	@Column(name="ORIGIN_LOCATION_CD")
	private String originLocationCd;

	@Column(name="OUTBOUND_TRACK_NBR")
	private String outboundTrackNbr;

	@Column(name="PACKAGE_MOVEMENT_SCAN_CD")
	private String packageMovementScanCd;

	@Column(name="PACKAGING_TYPE_CD")
	private String packagingTypeCd;

	@Column(name="PIECE_QTY")
	private BigDecimal pieceQty;

	@Column(name="PKG_MARK_DESC")
	private String pkgMarkDesc;

	@Column(name="PLANNED_CLEARANCE_LOCATION_CD")
	private String plannedClearanceLocationCd;

	@Column(name="PRIOR_NOTICE_NBR")
	private String priorNoticeNbr;

	@Column(name="RAMP_TRANSFER_FLG")
	private String rampTransferFlg;

	@Column(name="RECORD_STATUS_CD")
	private String recordStatusCd;

	@Column(name="RETURN_MERCH_AUTH_NBR")
	private String returnMerchAuthNbr;

	@Column(name="RETURN_REASON_CD")
	private String returnReasonCd;

	@Column(name="RETURN_TYPE_CD")
	private String returnTypeCd;

	@Column(name="REVENUE_AUTH_ID")
	private String revenueAuthId;

	@Column(name="ROD_FLG")
	private String rodFlg;

	@Column(name="RPL_FLG")
	private String rplFlg;

	@Column(name="SDL_FLG")
	private String sdlFlg;

	@Column(name="SED_CD")
	private String sedCd;

	@Column(name="SED_EXEMPT_NBR")
	private String sedExemptNbr;

	@Column(name="SERVICE_CD")
	private String serviceCd;

	@Column(name="SERVICE_TYPE_CD")
	private String serviceTypeCd;

	@Temporal(TemporalType.DATE)
	@Column(name="SHIP_DT")
	private Date shipDt;

	@Column(name="SHIPMENT_CONTROL_NBR")
	private String shipmentControlNbr;

	@Column(name="SHIPMENT_DESC")
	private String shipmentDesc;

	@Column(name="SHIPMENT_ID_NBR")
	private BigDecimal shipmentIdNbr;

	@Column(name="SHIPPER_REFERENCE_DESC")
	private String shipperReferenceDesc;

	@Column(name="SPLIT_BILLING_ADDRESS_AMT")
	private BigDecimal splitBillingAddressAmt;

	@Column(name="SPLIT_BILLING_KILO_WGT")
	private BigDecimal splitBillingKiloWgt;

	@Column(name="SPLIT_SHIPMENT_FLG")
	private String splitShipmentFlg;

	@Column(name="SPU_FLG")
	private String spuFlg;

	@Column(name="TOTAL_WGT")
	private BigDecimal totalWgt;

	@Column(name="TOTAL_WGT_UOM_CD")
	private String totalWgtUomCd;

	@Column(name="TRACKING_ID_NBR")
	private String trackingIdNbr;

	@Column(name="TRACKING_ID_QUAL_NBR")
	private String trackingIdQualNbr;

	@Column(name="TRAN_DATA_SOURCE_CD")
	private String tranDataSourceCd;

	@Column(name="TRANSACTION_SEQ_TMSTP")
	private Timestamp transactionSeqTmstp;

	@Column(name="TRPRT_BILL_TO_ACCT_NBR")
	private BigDecimal trprtBillToAcctNbr;

	@Column(name="TRPRT_BILL_TO_CD")
	private String trprtBillToCd;

	@Column(name="TRPRT_BILL_TO_PYMT_METHOD_CD")
	private BigDecimal trprtBillToPymtMethodCd;

	@Column(name="TRPRT_CREDIT_CARD_FLG")
	private String trprtCreditCardFlg;

	@Column(name="UNASSIGN_REASON_CD")
	private String unassignReasonCd;

	@Column(name="UNLOADING_USA_PORT_CD")
	private String unloadingUsaPortCd;

	@Column(name="VALUE_CHANGED_FLG")
	private String valueChangedFlg;

	@Column(name="VISA_TRANS_CD")
	private String visaTransCd;

	@Column(name="WEEKDAY_DELIVERY_FLG")
	private String weekdayDeliveryFlg;

	@Column(name="XTN_NBR")
	private String xtnNbr;

	public Shipment() {
	}

	public ShipmentPK getId() {
		return this.id;
	}

	public void setId(ShipmentPK id) {
		this.id = id;
	}

	public String getAciDownloadFlg() {
		return this.aciDownloadFlg;
	}

	public void setAciDownloadFlg(String aciDownloadFlg) {
		this.aciDownloadFlg = aciDownloadFlg;
	}

	public String getAwbNbr() {
		return this.awbNbr;
	}

	public void setAwbNbr(String awbNbr) {
		this.awbNbr = awbNbr;
	}

	public BigDecimal getBaseChargeAmt() {
		return this.baseChargeAmt;
	}

	public void setBaseChargeAmt(BigDecimal baseChargeAmt) {
		this.baseChargeAmt = baseChargeAmt;
	}

	public String getBrokerDestLocCd() {
		return this.brokerDestLocCd;
	}

	public void setBrokerDestLocCd(String brokerDestLocCd) {
		this.brokerDestLocCd = brokerDestLocCd;
	}

	public String getCargoDesc() {
		return this.cargoDesc;
	}

	public void setCargoDesc(String cargoDesc) {
		this.cargoDesc = cargoDesc;
	}

	public BigDecimal getCargoQty() {
		return this.cargoQty;
	}

	public void setCargoQty(BigDecimal cargoQty) {
		this.cargoQty = cargoQty;
	}

	public BigDecimal getCarriageValueAmt() {
		return this.carriageValueAmt;
	}

	public void setCarriageValueAmt(BigDecimal carriageValueAmt) {
		this.carriageValueAmt = carriageValueAmt;
	}

	public String getCashInAdvanceFlg() {
		return this.cashInAdvanceFlg;
	}

	public void setCashInAdvanceFlg(String cashInAdvanceFlg) {
		this.cashInAdvanceFlg = cashInAdvanceFlg;
	}

	public String getCiImageFlg() {
		return this.ciImageFlg;
	}

	public void setCiImageFlg(String ciImageFlg) {
		this.ciImageFlg = ciImageFlg;
	}

	public String getCiSeqNbr() {
		return this.ciSeqNbr;
	}

	public void setCiSeqNbr(String ciSeqNbr) {
		this.ciSeqNbr = ciSeqNbr;
	}

	public String getComatFlg() {
		return this.comatFlg;
	}

	public void setComatFlg(String comatFlg) {
		this.comatFlg = comatFlg;
	}

	public String getConsolidatedFreightFlg() {
		return this.consolidatedFreightFlg;
	}

	public void setConsolidatedFreightFlg(String consolidatedFreightFlg) {
		this.consolidatedFreightFlg = consolidatedFreightFlg;
	}

	public String getContainerNbr() {
		return this.containerNbr;
	}

	public void setContainerNbr(String containerNbr) {
		this.containerNbr = containerNbr;
	}

	public String getContractWgtTypeCd() {
		return this.contractWgtTypeCd;
	}

	public void setContractWgtTypeCd(String contractWgtTypeCd) {
		this.contractWgtTypeCd = contractWgtTypeCd;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getCsaFlg() {
		return this.csaFlg;
	}

	public void setCsaFlg(String csaFlg) {
		this.csaFlg = csaFlg;
	}

	public BigDecimal getCustomerSeqNbr() {
		return this.customerSeqNbr;
	}

	public void setCustomerSeqNbr(BigDecimal customerSeqNbr) {
		this.customerSeqNbr = customerSeqNbr;
	}

	public String getCustomsClearanceCd() {
		return this.customsClearanceCd;
	}

	public void setCustomsClearanceCd(String customsClearanceCd) {
		this.customsClearanceCd = customsClearanceCd;
	}

	public String getCustomsClearanceEntryFlg() {
		return this.customsClearanceEntryFlg;
	}

	public void setCustomsClearanceEntryFlg(String customsClearanceEntryFlg) {
		this.customsClearanceEntryFlg = customsClearanceEntryFlg;
	}

	public BigDecimal getCustomsValueAmt() {
		return this.customsValueAmt;
	}

	public void setCustomsValueAmt(BigDecimal customsValueAmt) {
		this.customsValueAmt = customsValueAmt;
	}

	public String getDangGoodsCd() {
		return this.dangGoodsCd;
	}

	public void setDangGoodsCd(String dangGoodsCd) {
		this.dangGoodsCd = dangGoodsCd;
	}

	public String getDataEntryLocationCd() {
		return this.dataEntryLocationCd;
	}

	public void setDataEntryLocationCd(String dataEntryLocationCd) {
		this.dataEntryLocationCd = dataEntryLocationCd;
	}

	public String getDeletedFlg() {
		return this.deletedFlg;
	}

	public void setDeletedFlg(String deletedFlg) {
		this.deletedFlg = deletedFlg;
	}

	public String getDestCustomsCurrencyCd() {
		return this.destCustomsCurrencyCd;
	}

	public void setDestCustomsCurrencyCd(String destCustomsCurrencyCd) {
		this.destCustomsCurrencyCd = destCustomsCurrencyCd;
	}

	public BigDecimal getDestCustomsValueAmt() {
		return this.destCustomsValueAmt;
	}

	public void setDestCustomsValueAmt(BigDecimal destCustomsValueAmt) {
		this.destCustomsValueAmt = destCustomsValueAmt;
	}

	public String getDestEecFlg() {
		return this.destEecFlg;
	}

	public void setDestEecFlg(String destEecFlg) {
		this.destEecFlg = destEecFlg;
	}

	public String getDestLocCityNm() {
		return this.destLocCityNm;
	}

	public void setDestLocCityNm(String destLocCityNm) {
		this.destLocCityNm = destLocCityNm;
	}

	public String getDestLocCntryCd() {
		return this.destLocCntryCd;
	}

	public void setDestLocCntryCd(String destLocCntryCd) {
		this.destLocCntryCd = destLocCntryCd;
	}

	public String getDestLocStateCd() {
		return this.destLocStateCd;
	}

	public void setDestLocStateCd(String destLocStateCd) {
		this.destLocStateCd = destLocStateCd;
	}

	public String getDestLocationCd() {
		return this.destLocationCd;
	}

	public void setDestLocationCd(String destLocationCd) {
		this.destLocationCd = destLocationCd;
	}

	public BigDecimal getDimHeightQty() {
		return this.dimHeightQty;
	}

	public void setDimHeightQty(BigDecimal dimHeightQty) {
		this.dimHeightQty = dimHeightQty;
	}

	public BigDecimal getDimLengthQty() {
		return this.dimLengthQty;
	}

	public void setDimLengthQty(BigDecimal dimLengthQty) {
		this.dimLengthQty = dimLengthQty;
	}

	public String getDimShipmentFlg() {
		return this.dimShipmentFlg;
	}

	public void setDimShipmentFlg(String dimShipmentFlg) {
		this.dimShipmentFlg = dimShipmentFlg;
	}

	public BigDecimal getDimWgt() {
		return this.dimWgt;
	}

	public void setDimWgt(BigDecimal dimWgt) {
		this.dimWgt = dimWgt;
	}

	public BigDecimal getDimWidthQty() {
		return this.dimWidthQty;
	}

	public void setDimWidthQty(BigDecimal dimWidthQty) {
		this.dimWidthQty = dimWidthQty;
	}

	public String getDischargeLocationCd() {
		return this.dischargeLocationCd;
	}

	public void setDischargeLocationCd(String dischargeLocationCd) {
		this.dischargeLocationCd = dischargeLocationCd;
	}

	public String getDropDscntCd() {
		return this.dropDscntCd;
	}

	public void setDropDscntCd(String dropDscntCd) {
		this.dropDscntCd = dropDscntCd;
	}

	public String getDutiableFlg() {
		return this.dutiableFlg;
	}

	public void setDutiableFlg(String dutiableFlg) {
		this.dutiableFlg = dutiableFlg;
	}

	public BigDecimal getDutyBillToAcctNbr() {
		return this.dutyBillToAcctNbr;
	}

	public void setDutyBillToAcctNbr(BigDecimal dutyBillToAcctNbr) {
		this.dutyBillToAcctNbr = dutyBillToAcctNbr;
	}

	public String getDutyBillToCd() {
		return this.dutyBillToCd;
	}

	public void setDutyBillToCd(String dutyBillToCd) {
		this.dutyBillToCd = dutyBillToCd;
	}

	public String getDutyCashFlg() {
		return this.dutyCashFlg;
	}

	public void setDutyCashFlg(String dutyCashFlg) {
		this.dutyCashFlg = dutyCashFlg;
	}

	public String getDutyCreditCardFlg() {
		return this.dutyCreditCardFlg;
	}

	public void setDutyCreditCardFlg(String dutyCreditCardFlg) {
		this.dutyCreditCardFlg = dutyCreditCardFlg;
	}

	public String getEcsFilingStatusCd() {
		return this.ecsFilingStatusCd;
	}

	public void setEcsFilingStatusCd(String ecsFilingStatusCd) {
		this.ecsFilingStatusCd = ecsFilingStatusCd;
	}

	public Timestamp getEtlTmstp() {
		return this.etlTmstp;
	}

	public void setEtlTmstp(Timestamp etlTmstp) {
		this.etlTmstp = etlTmstp;
	}

	public String getExportCountryCd() {
		return this.exportCountryCd;
	}

	public void setExportCountryCd(String exportCountryCd) {
		this.exportCountryCd = exportCountryCd;
	}

	public String getExportLicenseFlg() {
		return this.exportLicenseFlg;
	}

	public void setExportLicenseFlg(String exportLicenseFlg) {
		this.exportLicenseFlg = exportLicenseFlg;
	}

	public String getFdaConfirmationFlg() {
		return this.fdaConfirmationFlg;
	}

	public void setFdaConfirmationFlg(String fdaConfirmationFlg) {
		this.fdaConfirmationFlg = fdaConfirmationFlg;
	}

	public String getFedexAssignedMawbNbr() {
		return this.fedexAssignedMawbNbr;
	}

	public void setFedexAssignedMawbNbr(String fedexAssignedMawbNbr) {
		this.fedexAssignedMawbNbr = fedexAssignedMawbNbr;
	}

	public String getFinalImportClearanceLocCd() {
		return this.finalImportClearanceLocCd;
	}

	public void setFinalImportClearanceLocCd(String finalImportClearanceLocCd) {
		this.finalImportClearanceLocCd = finalImportClearanceLocCd;
	}

	public String getFormTypeCd() {
		return this.formTypeCd;
	}

	public void setFormTypeCd(String formTypeCd) {
		this.formTypeCd = formTypeCd;
	}

	public String getFreeDomicileCd() {
		return this.freeDomicileCd;
	}

	public void setFreeDomicileCd(String freeDomicileCd) {
		this.freeDomicileCd = freeDomicileCd;
	}

	public BigDecimal getFreightChargeAmt() {
		return this.freightChargeAmt;
	}

	public void setFreightChargeAmt(BigDecimal freightChargeAmt) {
		this.freightChargeAmt = freightChargeAmt;
	}

	public BigDecimal getFtsrNbr() {
		return this.ftsrNbr;
	}

	public void setFtsrNbr(BigDecimal ftsrNbr) {
		this.ftsrNbr = ftsrNbr;
	}

	public String getGoodsClassCd() {
		return this.goodsClassCd;
	}

	public void setGoodsClassCd(String goodsClassCd) {
		this.goodsClassCd = goodsClassCd;
	}

	public String getHalFlg() {
		return this.halFlg;
	}

	public void setHalFlg(String halFlg) {
		this.halFlg = halFlg;
	}

	public String getHalPhoneNbr() {
		return this.halPhoneNbr;
	}

	public void setHalPhoneNbr(String halPhoneNbr) {
		this.halPhoneNbr = halPhoneNbr;
	}

	public BigDecimal getHandlingUnitQty() {
		return this.handlingUnitQty;
	}

	public void setHandlingUnitQty(BigDecimal handlingUnitQty) {
		this.handlingUnitQty = handlingUnitQty;
	}

	public BigDecimal getHawbSerialNbr() {
		return this.hawbSerialNbr;
	}

	public void setHawbSerialNbr(BigDecimal hawbSerialNbr) {
		this.hawbSerialNbr = hawbSerialNbr;
	}

	public String getImageFolderIdCd() {
		return this.imageFolderIdCd;
	}

	public void setImageFolderIdCd(String imageFolderIdCd) {
		this.imageFolderIdCd = imageFolderIdCd;
	}

	public Date getInputTmstp() {
		return this.inputTmstp;
	}

	public void setInputTmstp(Date inputTmstp) {
		this.inputTmstp = inputTmstp;
	}

	public String getIntermediateConsigneeCd() {
		return this.intermediateConsigneeCd;
	}

	public void setIntermediateConsigneeCd(String intermediateConsigneeCd) {
		this.intermediateConsigneeCd = intermediateConsigneeCd;
	}

	public String getInvoiceCd() {
		return this.invoiceCd;
	}

	public void setInvoiceCd(String invoiceCd) {
		this.invoiceCd = invoiceCd;
	}

	public String getKeyedCurrencyCd() {
		return this.keyedCurrencyCd;
	}

	public void setKeyedCurrencyCd(String keyedCurrencyCd) {
		this.keyedCurrencyCd = keyedCurrencyCd;
	}

	public String getKeyerNm() {
		return this.keyerNm;
	}

	public void setKeyerNm(String keyerNm) {
		this.keyerNm = keyerNm;
	}

	public String getLastModifiedNm() {
		return this.lastModifiedNm;
	}

	public void setLastModifiedNm(String lastModifiedNm) {
		this.lastModifiedNm = lastModifiedNm;
	}

	public Timestamp getLastModifiedTmstp() {
		return this.lastModifiedTmstp;
	}

	public void setLastModifiedTmstp(Timestamp lastModifiedTmstp) {
		this.lastModifiedTmstp = lastModifiedTmstp;
	}

	public String getLocalCustomsCurrencyCd() {
		return this.localCustomsCurrencyCd;
	}

	public void setLocalCustomsCurrencyCd(String localCustomsCurrencyCd) {
		this.localCustomsCurrencyCd = localCustomsCurrencyCd;
	}

	public BigDecimal getLocalCustomsValueAmt() {
		return this.localCustomsValueAmt;
	}

	public void setLocalCustomsValueAmt(BigDecimal localCustomsValueAmt) {
		this.localCustomsValueAmt = localCustomsValueAmt;
	}

	public String getManifestStatusCd() {
		return this.manifestStatusCd;
	}

	public void setManifestStatusCd(String manifestStatusCd) {
		this.manifestStatusCd = manifestStatusCd;
	}

	public String getManufOrigCntryCd() {
		return this.manufOrigCntryCd;
	}

	public void setManufOrigCntryCd(String manufOrigCntryCd) {
		this.manufOrigCntryCd = manufOrigCntryCd;
	}

	public String getMdeSourceCd() {
		return this.mdeSourceCd;
	}

	public void setMdeSourceCd(String mdeSourceCd) {
		this.mdeSourceCd = mdeSourceCd;
	}

	public BigDecimal getMeterNbr() {
		return this.meterNbr;
	}

	public void setMeterNbr(BigDecimal meterNbr) {
		this.meterNbr = meterNbr;
	}

	public String getOdaChargeFlg() {
		return this.odaChargeFlg;
	}

	public void setOdaChargeFlg(String odaChargeFlg) {
		this.odaChargeFlg = odaChargeFlg;
	}

	public String getOpaChargeFlg() {
		return this.opaChargeFlg;
	}

	public void setOpaChargeFlg(String opaChargeFlg) {
		this.opaChargeFlg = opaChargeFlg;
	}

	public String getOriginEecFlg() {
		return this.originEecFlg;
	}

	public void setOriginEecFlg(String originEecFlg) {
		this.originEecFlg = originEecFlg;
	}

	public String getOriginLocCityNm() {
		return this.originLocCityNm;
	}

	public void setOriginLocCityNm(String originLocCityNm) {
		this.originLocCityNm = originLocCityNm;
	}

	public String getOriginLocCntryCd() {
		return this.originLocCntryCd;
	}

	public void setOriginLocCntryCd(String originLocCntryCd) {
		this.originLocCntryCd = originLocCntryCd;
	}

	public String getOriginLocStateCd() {
		return this.originLocStateCd;
	}

	public void setOriginLocStateCd(String originLocStateCd) {
		this.originLocStateCd = originLocStateCd;
	}

	public String getOriginLocationCd() {
		return this.originLocationCd;
	}

	public void setOriginLocationCd(String originLocationCd) {
		this.originLocationCd = originLocationCd;
	}

	public String getOutboundTrackNbr() {
		return this.outboundTrackNbr;
	}

	public void setOutboundTrackNbr(String outboundTrackNbr) {
		this.outboundTrackNbr = outboundTrackNbr;
	}

	public String getPackageMovementScanCd() {
		return this.packageMovementScanCd;
	}

	public void setPackageMovementScanCd(String packageMovementScanCd) {
		this.packageMovementScanCd = packageMovementScanCd;
	}

	public String getPackagingTypeCd() {
		return this.packagingTypeCd;
	}

	public void setPackagingTypeCd(String packagingTypeCd) {
		this.packagingTypeCd = packagingTypeCd;
	}

	public BigDecimal getPieceQty() {
		return this.pieceQty;
	}

	public void setPieceQty(BigDecimal pieceQty) {
		this.pieceQty = pieceQty;
	}

	public String getPkgMarkDesc() {
		return this.pkgMarkDesc;
	}

	public void setPkgMarkDesc(String pkgMarkDesc) {
		this.pkgMarkDesc = pkgMarkDesc;
	}

	public String getPlannedClearanceLocationCd() {
		return this.plannedClearanceLocationCd;
	}

	public void setPlannedClearanceLocationCd(String plannedClearanceLocationCd) {
		this.plannedClearanceLocationCd = plannedClearanceLocationCd;
	}

	public String getPriorNoticeNbr() {
		return this.priorNoticeNbr;
	}

	public void setPriorNoticeNbr(String priorNoticeNbr) {
		this.priorNoticeNbr = priorNoticeNbr;
	}

	public String getRampTransferFlg() {
		return this.rampTransferFlg;
	}

	public void setRampTransferFlg(String rampTransferFlg) {
		this.rampTransferFlg = rampTransferFlg;
	}

	public String getRecordStatusCd() {
		return this.recordStatusCd;
	}

	public void setRecordStatusCd(String recordStatusCd) {
		this.recordStatusCd = recordStatusCd;
	}

	public String getReturnMerchAuthNbr() {
		return this.returnMerchAuthNbr;
	}

	public void setReturnMerchAuthNbr(String returnMerchAuthNbr) {
		this.returnMerchAuthNbr = returnMerchAuthNbr;
	}

	public String getReturnReasonCd() {
		return this.returnReasonCd;
	}

	public void setReturnReasonCd(String returnReasonCd) {
		this.returnReasonCd = returnReasonCd;
	}

	public String getReturnTypeCd() {
		return this.returnTypeCd;
	}

	public void setReturnTypeCd(String returnTypeCd) {
		this.returnTypeCd = returnTypeCd;
	}

	public String getRevenueAuthId() {
		return this.revenueAuthId;
	}

	public void setRevenueAuthId(String revenueAuthId) {
		this.revenueAuthId = revenueAuthId;
	}

	public String getRodFlg() {
		return this.rodFlg;
	}

	public void setRodFlg(String rodFlg) {
		this.rodFlg = rodFlg;
	}

	public String getRplFlg() {
		return this.rplFlg;
	}

	public void setRplFlg(String rplFlg) {
		this.rplFlg = rplFlg;
	}

	public String getSdlFlg() {
		return this.sdlFlg;
	}

	public void setSdlFlg(String sdlFlg) {
		this.sdlFlg = sdlFlg;
	}

	public String getSedCd() {
		return this.sedCd;
	}

	public void setSedCd(String sedCd) {
		this.sedCd = sedCd;
	}

	public String getSedExemptNbr() {
		return this.sedExemptNbr;
	}

	public void setSedExemptNbr(String sedExemptNbr) {
		this.sedExemptNbr = sedExemptNbr;
	}

	public String getServiceCd() {
		return this.serviceCd;
	}

	public void setServiceCd(String serviceCd) {
		this.serviceCd = serviceCd;
	}

	public String getServiceTypeCd() {
		return this.serviceTypeCd;
	}

	public void setServiceTypeCd(String serviceTypeCd) {
		this.serviceTypeCd = serviceTypeCd;
	}

	public Date getShipDt() {
		return this.shipDt;
	}

	public void setShipDt(Date shipDt) {
		this.shipDt = shipDt;
	}

	public String getShipmentControlNbr() {
		return this.shipmentControlNbr;
	}

	public void setShipmentControlNbr(String shipmentControlNbr) {
		this.shipmentControlNbr = shipmentControlNbr;
	}

	public String getShipmentDesc() {
		return this.shipmentDesc;
	}

	public void setShipmentDesc(String shipmentDesc) {
		this.shipmentDesc = shipmentDesc;
	}

	public BigDecimal getShipmentIdNbr() {
		return this.shipmentIdNbr;
	}

	public void setShipmentIdNbr(BigDecimal shipmentIdNbr) {
		this.shipmentIdNbr = shipmentIdNbr;
	}

	public String getShipperReferenceDesc() {
		return this.shipperReferenceDesc;
	}

	public void setShipperReferenceDesc(String shipperReferenceDesc) {
		this.shipperReferenceDesc = shipperReferenceDesc;
	}

	public BigDecimal getSplitBillingAddressAmt() {
		return this.splitBillingAddressAmt;
	}

	public void setSplitBillingAddressAmt(BigDecimal splitBillingAddressAmt) {
		this.splitBillingAddressAmt = splitBillingAddressAmt;
	}

	public BigDecimal getSplitBillingKiloWgt() {
		return this.splitBillingKiloWgt;
	}

	public void setSplitBillingKiloWgt(BigDecimal splitBillingKiloWgt) {
		this.splitBillingKiloWgt = splitBillingKiloWgt;
	}

	public String getSplitShipmentFlg() {
		return this.splitShipmentFlg;
	}

	public void setSplitShipmentFlg(String splitShipmentFlg) {
		this.splitShipmentFlg = splitShipmentFlg;
	}

	public String getSpuFlg() {
		return this.spuFlg;
	}

	public void setSpuFlg(String spuFlg) {
		this.spuFlg = spuFlg;
	}

	public BigDecimal getTotalWgt() {
		return this.totalWgt;
	}

	public void setTotalWgt(BigDecimal totalWgt) {
		this.totalWgt = totalWgt;
	}

	public String getTotalWgtUomCd() {
		return this.totalWgtUomCd;
	}

	public void setTotalWgtUomCd(String totalWgtUomCd) {
		this.totalWgtUomCd = totalWgtUomCd;
	}

	public String getTrackingIdNbr() {
		return this.trackingIdNbr;
	}

	public void setTrackingIdNbr(String trackingIdNbr) {
		this.trackingIdNbr = trackingIdNbr;
	}

	public String getTrackingIdQualNbr() {
		return this.trackingIdQualNbr;
	}

	public void setTrackingIdQualNbr(String trackingIdQualNbr) {
		this.trackingIdQualNbr = trackingIdQualNbr;
	}

	public String getTranDataSourceCd() {
		return this.tranDataSourceCd;
	}

	public void setTranDataSourceCd(String tranDataSourceCd) {
		this.tranDataSourceCd = tranDataSourceCd;
	}

	public Timestamp getTransactionSeqTmstp() {
		return this.transactionSeqTmstp;
	}

	public void setTransactionSeqTmstp(Timestamp transactionSeqTmstp) {
		this.transactionSeqTmstp = transactionSeqTmstp;
	}

	public BigDecimal getTrprtBillToAcctNbr() {
		return this.trprtBillToAcctNbr;
	}

	public void setTrprtBillToAcctNbr(BigDecimal trprtBillToAcctNbr) {
		this.trprtBillToAcctNbr = trprtBillToAcctNbr;
	}

	public String getTrprtBillToCd() {
		return this.trprtBillToCd;
	}

	public void setTrprtBillToCd(String trprtBillToCd) {
		this.trprtBillToCd = trprtBillToCd;
	}

	public BigDecimal getTrprtBillToPymtMethodCd() {
		return this.trprtBillToPymtMethodCd;
	}

	public void setTrprtBillToPymtMethodCd(BigDecimal trprtBillToPymtMethodCd) {
		this.trprtBillToPymtMethodCd = trprtBillToPymtMethodCd;
	}

	public String getTrprtCreditCardFlg() {
		return this.trprtCreditCardFlg;
	}

	public void setTrprtCreditCardFlg(String trprtCreditCardFlg) {
		this.trprtCreditCardFlg = trprtCreditCardFlg;
	}

	public String getUnassignReasonCd() {
		return this.unassignReasonCd;
	}

	public void setUnassignReasonCd(String unassignReasonCd) {
		this.unassignReasonCd = unassignReasonCd;
	}

	public String getUnloadingUsaPortCd() {
		return this.unloadingUsaPortCd;
	}

	public void setUnloadingUsaPortCd(String unloadingUsaPortCd) {
		this.unloadingUsaPortCd = unloadingUsaPortCd;
	}

	public String getValueChangedFlg() {
		return this.valueChangedFlg;
	}

	public void setValueChangedFlg(String valueChangedFlg) {
		this.valueChangedFlg = valueChangedFlg;
	}

	public String getVisaTransCd() {
		return this.visaTransCd;
	}

	public void setVisaTransCd(String visaTransCd) {
		this.visaTransCd = visaTransCd;
	}

	public String getWeekdayDeliveryFlg() {
		return this.weekdayDeliveryFlg;
	}

	public void setWeekdayDeliveryFlg(String weekdayDeliveryFlg) {
		this.weekdayDeliveryFlg = weekdayDeliveryFlg;
	}

	public String getXtnNbr() {
		return this.xtnNbr;
	}

	public void setXtnNbr(String xtnNbr) {
		this.xtnNbr = xtnNbr;
	}



}