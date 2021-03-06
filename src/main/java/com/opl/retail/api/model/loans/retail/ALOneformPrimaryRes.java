package com.opl.retail.api.model.loans.retail;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ALOneformPrimaryRes implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	// RETAIL APPLICANT DETAILS FIELDS
	private Long applicationId;
	private Long userId;
	private Double loanAmountRequired;
	private Integer loanPurpose;
	private Integer detailLoanPurpose;
	private Integer loanPurposeQueType;
	private String loanPurposeQueValue;
	private String loanPurposeOther;
	private Integer tenureRequired;
	private Integer repaymentMode;
	private Integer employmentType;
	private Long borrowerContribution;
	private Double monthlyIncome;
	private Double grossMonthlyIncome;
	private Long clientId;  
	private Boolean isUserHaveAadhar;
	private String emailId;
	private String applicantName;
	private String coApplicantName;
	private String coApplicantPanNo;
	private boolean isCoApplicantIncomeConsider;
	private boolean isCoapplicant;
	private Integer relationWithApplicant;
	private String mobileNo;
	private String mobileTxt;
	private Integer associatedBank;
	private Long applicationStatus;
	private String pan;


	// Vehicle details
	private Integer vehicleType; 
	private Integer vehicleCategory; 
	private Integer vehicleSegment; 
	private Integer vehicleAge; 
	private Integer vehicleEngineVolume; 
	private Integer vehicleUse; 
	private Long vehicleExShowRoomPrice;
	private Long vehicleOnRoadPrice; 
	private Long vehicleAgreedPurchasePrice;
	private Boolean isVehicleHypothecation;
	private Long oemId;
	private Long vehicleNameId;
	private Long vehicleModelNoId;
	private Long vehicleInsuaranceCost;
	private Long vehicleRoadTaxCost;

	private String dealerName;
	private Integer dealerCityId;
	private Integer dealerStateId;

	private String oem;
	private String vehicleName;
	private String vehicleModelNo;

	// Declaration
	private Boolean isCheckOffDirectPayEmi;
	private Boolean isCheckOffAgreeToPayOutstanding;
	private Boolean isCheckOffShiftSalAcc;
	private Boolean isCheckOffPayOutstndAmount;
	private Boolean isCheckOffNotChangeSalAcc;
	
	private String currencyValue;

	//additional Parameters
	private Long manufacturerId;
	private Long assetModelId;
	private Integer assetMake;
	private Long supplierStateId;
	private Long supplierCityId;
	private Long supplierId;
	private String otherSuplierName;
	private String otherAssetModelName;
	private String otherManufacturerName;
	private Date modifiedDate;
	private String connectStage;
	private String status;
	private String applicationCode;
	private Double sanctionAmount;
	private Integer proposalType;

	public ALOneformPrimaryRes() {
		// TODO Auto-generated constructor stub
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Double getLoanAmountRequired() {
		return loanAmountRequired;
	}

	public void setLoanAmountRequired(Double loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}

	public Integer getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(Integer loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public Integer getLoanPurposeQueType() {
		return loanPurposeQueType;
	}

	public void setLoanPurposeQueType(Integer loanPurposeQueType) {
		this.loanPurposeQueType = loanPurposeQueType;
	}

	public String getLoanPurposeQueValue() {
		return loanPurposeQueValue;
	}

	public void setLoanPurposeQueValue(String loanPurposeQueValue) {
		this.loanPurposeQueValue = loanPurposeQueValue;
	}

	public String getLoanPurposeOther() {
		return loanPurposeOther;
	}

	public void setLoanPurposeOther(String loanPurposeOther) {
		this.loanPurposeOther = loanPurposeOther;
	}

	public Integer getTenureRequired() {
		return tenureRequired;
	}

	public void setTenureRequired(Integer tenureRequired) {
		this.tenureRequired = tenureRequired;
	}

	public Integer getRepaymentMode() {
		return repaymentMode;
	}

	public void setRepaymentMode(Integer repayment) {
		this.repaymentMode = repayment;
	}

	public Integer getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(Integer vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(Integer vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}

	public Integer getVehicleSegment() {
		return vehicleSegment;
	}

	public void setVehicleSegment(Integer vehicleSegment) {
		this.vehicleSegment = vehicleSegment;
	}

	public Integer getVehicleAge() {
		return vehicleAge;
	}

	public void setVehicleAge(Integer vehicleAge) {
		this.vehicleAge = vehicleAge;
	}

	public Integer getVehicleEngineVolume() {
		return vehicleEngineVolume;
	}

	public void setVehicleEngineVolume(Integer vehicleEngineVolume) {
		this.vehicleEngineVolume = vehicleEngineVolume;
	}

	public Integer getVehicleUse() {
		return vehicleUse;
	}

	public void setVehicleUse(Integer vechicleUse) {
		this.vehicleUse = vechicleUse;
	}

	public Long getVehicleExShowRoomPrice() {
		return vehicleExShowRoomPrice;
	}

	public void setVehicleExShowRoomPrice(Long vehicleExShowRoomPrice) {
		this.vehicleExShowRoomPrice = vehicleExShowRoomPrice;
	}

	public Long getVehicleOnRoadPrice() {
		return vehicleOnRoadPrice;
	}

	public void setVehicleOnRoadPrice(Long vehicleOnRoadPrice) {
		this.vehicleOnRoadPrice = vehicleOnRoadPrice;
	}

	public Long getVehicleAgreedPurchasePrice() {
		return vehicleAgreedPurchasePrice;
	}

	public void setVehicleAgreedPurchasePrice(Long vehicleAgreedPurchasePrice) {
		this.vehicleAgreedPurchasePrice = vehicleAgreedPurchasePrice;
	}

	public Boolean getIsVehicleHypothecation() {
		return isVehicleHypothecation;
	}

	public void setIsVehicleHypothecation(Boolean isVehicleHypothecation) {
		this.isVehicleHypothecation = isVehicleHypothecation;
	}

	public Integer getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(Integer employmentType) {
		this.employmentType = employmentType;
	}

	public Long getBorrowerContribution() {
		return borrowerContribution;
	}

	public void setBorrowerContribution(Long borrowerContribution) {
		this.borrowerContribution = borrowerContribution;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public Double getGrossMonthlyIncome() {
		return grossMonthlyIncome;
	}

	public void setGrossMonthlyIncome(Double grossMonthlyIncome) {
		this.grossMonthlyIncome = grossMonthlyIncome;
	}

	public Boolean getIsCheckOffDirectPayEmi() {
		return isCheckOffDirectPayEmi;
	}

	public void setIsCheckOffDirectPayEmi(Boolean isCheckOffDirectPayEmi) {
		this.isCheckOffDirectPayEmi = isCheckOffDirectPayEmi;
	}

	public Boolean getIsCheckOffAgreeToPayOutstanding() {
		return isCheckOffAgreeToPayOutstanding;
	}

	public void setIsCheckOffAgreeToPayOutstanding(Boolean isCheckOffAgreeToPayOutstanding) {
		this.isCheckOffAgreeToPayOutstanding = isCheckOffAgreeToPayOutstanding;
	}

	public Boolean getIsCheckOffShiftSalAcc() {
		return isCheckOffShiftSalAcc;
	}

	public void setIsCheckOffShiftSalAcc(Boolean isCheckOffShiftSalAcc) {
		this.isCheckOffShiftSalAcc = isCheckOffShiftSalAcc;
	}

	public Boolean getIsCheckOffPayOutstndAmount() {
		return isCheckOffPayOutstndAmount;
	}

	public void setIsCheckOffPayOutstndAmount(Boolean isCheckOffPayOutstndAmount) {
		this.isCheckOffPayOutstndAmount = isCheckOffPayOutstndAmount;
	}

	public Boolean getIsCheckOffNotChangeSalAcc() {
		return isCheckOffNotChangeSalAcc;
	}

	public void setIsCheckOffNotChangeSalAcc(Boolean isCheckOffNotChangeSalAcc) {
		this.isCheckOffNotChangeSalAcc = isCheckOffNotChangeSalAcc;
	}

	public String getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Boolean getIsUserHaveAadhar() {
		return isUserHaveAadhar;
	}

	public void setIsUserHaveAadhar(Boolean isUserHaveAadhar) {
		this.isUserHaveAadhar = isUserHaveAadhar;
	}

	public Long getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public Long getAssetModelId() {
		return assetModelId;
	}

	public void setAssetModelId(Long assetModelId) {
		this.assetModelId = assetModelId;
	}

	public Integer getAssetMake() {
		return assetMake;
	}

	public void setAssetMake(Integer assetMake) {
		this.assetMake = assetMake;
	}

	public Long getSupplierStateId() {
		return supplierStateId;
	}

	public void setSupplierStateId(Long supplierStateId) {
		this.supplierStateId = supplierStateId;
	}

	public Long getSupplierCityId() {
		return supplierCityId;
	}

	public void setSupplierCityId(Long supplierCityId) {
		this.supplierCityId = supplierCityId;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getOtherSuplierName() {
		return otherSuplierName;
	}

	public void setOtherSuplierName(String otherSuplierName) {
		this.otherSuplierName = otherSuplierName;
	}

	public String getOtherAssetModelName() {
		return otherAssetModelName;
	}

	public void setOtherAssetModelName(String otherAssetModelName) {
		this.otherAssetModelName = otherAssetModelName;
	}

	public String getOtherManufacturerName() {
		return otherManufacturerName;
	}

	public void setOtherManufacturerName(String otherManufacturerName) {
		this.otherManufacturerName = otherManufacturerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getCoApplicantName() {
		return coApplicantName;
	}

	public void setCoApplicantName(String coApplicantName) {
		this.coApplicantName = coApplicantName;
	}

	public String getCoApplicantPanNo() {
		return coApplicantPanNo;
	}

	public void setCoApplicantPanNo(String coApplicantPanNo) {
		this.coApplicantPanNo = coApplicantPanNo;
	}

	public boolean getIsCoApplicantIncomeConsider() {
		return isCoApplicantIncomeConsider;
	}

	public void setIsCoApplicantIncomeConsider(boolean coApplicantIncomeConsider) {
		isCoApplicantIncomeConsider = coApplicantIncomeConsider;
	}

	public Integer getRelationWithApplicant() {
		return relationWithApplicant;
	}

	public void setRelationWithApplicant(Integer relationWithApplicant) {
		this.relationWithApplicant = relationWithApplicant;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getOemId() {
		return oemId;
	}

	public void setOemId(Long oemId) {
		this.oemId = oemId;
	}

	public Long getVehicleNameId() {
		return vehicleNameId;
	}

	public void setVehicleNameId(Long vehicleNameId) {
		this.vehicleNameId = vehicleNameId;
	}

	public Long getVehicleModelNoId() {
		return vehicleModelNoId;
	}

	public void setVehicleModelNoId(Long vehicleModelNoId) {
		this.vehicleModelNoId = vehicleModelNoId;
	}

	public boolean getIsCoapplicant() {
		return isCoapplicant;
	}

	public void setIsCoapplicant(boolean coapplicant) {
		isCoapplicant = coapplicant;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getMobileTxt() {
		return mobileTxt;
	}

	public void setMobileTxt(String mobileTxt) {
		this.mobileTxt = mobileTxt;
	}

	public String getOem() {
		return oem;
	}

	public void setOem(String oem) {
		this.oem = oem;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleModelNo() {
		return vehicleModelNo;
	}

	public void setVehicleModelNo(String vehicleModelNo) {
		this.vehicleModelNo = vehicleModelNo;
	}

	public Integer getDetailLoanPurpose() {
		return detailLoanPurpose;
	}

	public void setDetailLoanPurpose(Integer detailLoanPurpose) {
		this.detailLoanPurpose = detailLoanPurpose;
	}

	public Integer getAssociatedBank() {
		return associatedBank;
	}

	public void setAssociatedBank(Integer associatedBank) {
		this.associatedBank = associatedBank;
	}

	public Long getVehicleInsuaranceCost() {
		return vehicleInsuaranceCost;
	}

	public void setVehicleInsuaranceCost(Long vehicleInsuaranceCost) {
		this.vehicleInsuaranceCost = vehicleInsuaranceCost;
	}

	public Long getVehicleRoadTaxCost() {
		return vehicleRoadTaxCost;
	}

	public void setVehicleRoadTaxCost(Long vehicleRoadTaxCost) {
		this.vehicleRoadTaxCost = vehicleRoadTaxCost;
	}


	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public Integer getDealerCityId() {
		return dealerCityId;
	}

	public void setDealerCityId(Integer dealerCityId) {
		this.dealerCityId = dealerCityId;
	}

	public Integer getDealerStateId() {
		return dealerStateId;
	}

	public void setDealerStateId(Integer dealerStateId) {
		this.dealerStateId = dealerStateId;
	}

	public String getConnectStage() {
		return connectStage;
	}

	public void setConnectStage(String connectStage) {
		this.connectStage = connectStage;
	}

	public Long getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(Long applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public Double getSanctionAmount() {
		return sanctionAmount;
	}

	public void setSanctionAmount(Double sanctionAmount) {
		this.sanctionAmount = sanctionAmount;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Integer getProposalType() {
		return proposalType;
	}

	public void setProposalType(Integer proposalType) {
		this.proposalType = proposalType;
	}
}
