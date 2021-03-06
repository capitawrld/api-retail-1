package com.opl.retail.api.model.loans.corporate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.opl.retail.api.model.loans.DataRequest;
import com.opl.retail.api.model.loans.ProductMasterRequest;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CorporateProductNewStructure extends ProductMasterRequest implements Serializable {
	private Integer currency;

	private Integer denomination;

	private Boolean isCollateralDisplay = false;

	private Boolean isCollateralMandatory = false;

	private Boolean isCreditRatingDisplay = false;

	private Boolean isCreditRatingMandatory = false;

	private Boolean isDebtEquityDisplay = false;

	private Boolean isDebtEquityMandatory = false;

	private Boolean isEstablishmentDisplay = false;

	private Boolean isEstablishmentMandatory = false;

	private Boolean isGeographicalDisplay = false;

	private Boolean isGeographicalMandatory = false;

	private Boolean isIndustrySectorDisplay = false;

	private Boolean isIndustrySectorMandatory = false;

	private Boolean isInvestmentSizeDisplay = false;

	private Boolean isInvestmentSizeMandatory = false;

	private Boolean isNetworthDisplay = false;

	private Boolean isNetworthMandatory = false;

	private Boolean isPastYearTurnoverDisplay = false;

	private Boolean isPastYearTurnoverMandatory = false;

	private Boolean isProfitabilityHistoryDisplay = false;

	private Boolean isProfitabilityHistoryMandatory = false;

	private Boolean isTenureDisplay = false;

	private Boolean isTenureMandatory = false;

	private Boolean isUnInterestedIndustryDisplay = false;

	private Boolean isUnInterestedIndustryMandatory = false;

	private Integer LongTermCreditRating;

	private Integer maxAgeEstablishment;

	private BigDecimal maxCollateral;

	private BigDecimal maxDebtEquity;

	private BigDecimal maxInvestSize;

	private BigDecimal maxNetworth;

	private BigDecimal maxPastTurnover;

	private Integer maxTenure;

	private Integer minAgeEstablishment;

	private BigDecimal minCollateral;

	private BigDecimal minDebtEquity;

	private BigDecimal minInvestSize;

	private BigDecimal minNetworth;

	private BigDecimal minPastTurnover;

	private Integer minTenure;

	private BigDecimal minTenureNtb;

	private BigDecimal maxTenureNtb;

	private Integer profitabilityHistory;

	private Integer shortTermCreditRating;

	private Long uninterestedIndustry;

	private BigDecimal minCurrentRatio;

	private BigDecimal maxCurrentRatio;

	private Boolean isCurrentRatioDisplay = false;

	private Boolean isCurrentRatioMandatory = false;

	private BigDecimal minInterestCoverage;

	private BigDecimal maxInterestCoverage;

	private Boolean isInterestCoverageDisplay = false;

	private Boolean isInterestCoverageMandatory = false;

	private BigDecimal minTolTnw;

	private BigDecimal maxTolTnw;

	private Boolean isTolTnwDisplay = false;

	private Boolean isTolTnwMandatory = false;

	private BigDecimal minTurnoverRatio;

	private BigDecimal maxTurnoverRatio;

	private Boolean isTurnoverRatioDisplay = false;

	private Boolean isTurnoverRatioMandatory = false;

	private BigDecimal minGrossCashAccuralsRatio;

	private BigDecimal maxGrossCashAccuralsRatio;

	private Boolean isGrossCashAccuralsRatioDisplay = false;

	private Boolean isGrossCashAccuralsRatioMandatory = false;

	private BigDecimal minCustomerConcentration;

	private BigDecimal maxCustomerConcentration;

	private Boolean isCustomerConcentrationDisplay = false;

	private Boolean isCustomerConcentrationMandatory = false;

	private Integer minRiskModelScore;

	private Integer maxRiskModelScore;

	private Boolean isRiskModelScoreDisplay = false;

	private Boolean isRiskModelScoreMandatory = false;

	private Integer netWorth;

	private Integer minChequeBounced;

	private Integer maxChequeBounced;

	private Boolean isChequeBouncedDisplay = false;

	private Boolean isChequeBouncedMandatory = false;

	private Integer minChequeBouncedLastSixMonths;

	private Integer maxChequeBouncedLastSixMonths;

	private Boolean isChequeBouncedLastSixMonthsDisplay = false;

	private Boolean isChequeBouncedLastSixMonthsMandatory = false;

	private Integer ddrFlow;

	private Integer individualCibil;

	private Boolean isIndividualCibilDisplay = false;

	private Boolean isIndividualCibilMandatory = false;

	private Integer commercialCibil;

	private Boolean isCommercialCibilDisplay = false;

	private Boolean isCommercialCibilMandatory = false;

	private Integer appstage;
	// -----------------------added eligibility method for product
	private Integer assessmentMethodId;

	private Long userOrgId;

	private BigDecimal minCgtmseCoverage;
	private BigDecimal maxCgtmseCoverage;
	private Boolean isCgtmseCoverageDisplay = false;
	private Boolean isCgtmseCoverageMandatory = false;
	private Boolean isMsmeFundingDisplay = false;
	private Boolean isMsmeFundingMandatory = false;
	private List<Integer> msmeFundingIds;

	private List<Long> nbfcRatioIds;

	private Integer cgtmseCoverage;

	private Integer cashMargin;

	private BigDecimal dscr;

	private Integer paybackPeriod;

	private BigDecimal promotorContri;

	private BigDecimal manufacturing;
	private BigDecimal service;
	private BigDecimal trading;

	/* ntb */

	private BigDecimal minAvrgAge;

	private BigDecimal maxAvrgAge;

	private BigDecimal minAvrgYearlyIncome;

	private BigDecimal maxAvrgYearlyIncome;

	private BigDecimal mincgtmse;

	private BigDecimal maxcgtmse;

	private BigDecimal minLoanToAsset;

	private BigDecimal maxLoanToAsset;

	private BigDecimal minAvgWorkExp;

	private BigDecimal maxAvgWorkExp;

	private BigDecimal minCurrentFoir;

	private BigDecimal maxCurrentFoir;

	private Boolean isAvrgAgeDisplay = false;

	private Boolean isAvrgAgeMandatory = false;

	private Boolean isAvrgYearlyIncomeDisplay = false;

	private Boolean isAvrgYearlyIncomeMandatory = false;

	private Boolean iscgtmseDisplay = false;

	private Boolean iscgtmseMandatory = false;

	private Boolean isLoanToAssetDisplay = false;

	private Boolean isLoanToAssetMandatory = false;

	private Boolean isAvgWorkExpDisplay = false;

	private Boolean isAvgWorkExpMandatory = false;

	private Boolean isCurrentFoirDisplay = false;

	private Boolean isCurrentFoirMandatory = false;

	private Integer userCreditRating;

	private BigDecimal maxDropInTurnover;

	private Boolean isMaxDropInTurnoverDisplay = false;

	private Boolean isMaxDropInTurnoverMandatory = false;

	private BigDecimal minUtilisationPercentage;

	private BigDecimal maxUtilisationPercentage;

	private Boolean isUtilisationPercentageDisplay = false;

	private Boolean isUtilisationPercentageMandatory = false;

	private BigDecimal minCreditSummation;

	private BigDecimal maxCreditSummation;

	private Boolean isCreditSummationDisplay = false;

	private Boolean isCreditSummationMandatory = false;

	private BigDecimal minCollateralCoverage;

	private BigDecimal maxCollateralCoverage;

	private Boolean isCollateralCoverageDisplay = false;

	private Boolean isCollateralCoverageMandatory = false;

	private BigDecimal newTolTnw;

	private BigDecimal newCollateralCoverage;

	private Boolean isNewCollateralCoverageCheck = false;

	private Boolean isNewTolTnwCheck = false;

	private Boolean wcReqCheck = false;

	private Integer kotakSubParameter;

	private Boolean isNewDscrCheck = false;

	private BigDecimal newDscrCheck;

	// projected sales
	private Boolean isNewHistoricSales = false;

	private BigDecimal newHistoricSales;

	private Boolean isHistoricGrowth = false;

	private BigDecimal newHistoricGrowth;
	// ends

	// total limits
	private List<Integer> loanArrangementIds;
	
	private Integer loanArrangementId;

	private BigDecimal minAdditionalLoan;

	private BigDecimal maxAdditionalLoan;

	private BigDecimal minTotalLoan;

	private BigDecimal maxTotalLoan;

	private Boolean isConservativeRatioDisplay = false;

	private Boolean isConservativeRatioMandatory = false;

	private BigDecimal maxConservativeRatio;

	private BigDecimal minConservativeRatio;

	private Integer mainIndividualCibil;

	private Boolean isMainIndividualCibilDisplay = false;

	private Boolean isMainIndividualCibilMandatory = false;

	private Integer commercialCibilFor3Month;

	private Boolean isCommercialCibilFor3MonthDisplay = false;

	private Boolean isCommercialCibilFor3MonthMandatory = false;

	// mfi parameter

	private Boolean isLoanAmountDisplay = false;

	private Boolean isLoanAmountMandatory = false;

	private Double minLoanAmount;

	private Double maxLoanAmount;

	// yearly income

	private Boolean isYearlyIncomeRangeDisplay = false;

	private Boolean isYearlyIncomeRangeMandatory = false;

	private Double minYearlyIncomeRange;

	private Double maxYearlyIncomeRange;

	// age of applicant

	private Boolean isAgeApplicantDisplay = false;

	private Boolean isAgeApplicantMandatory = false;

	private Double minApplicantAge;

	private Double maxApplicantAge;

	// bureau score

	private Boolean isBureauScoreDisplay = false;

	private Boolean isBureauScoreMandatory = false;

	private Double minBureauScore;

	// Less Than 6 month of Credit History
	private Integer minBureauScoreLessThan6Month;

	// No Credit History
	private Boolean noBureauCreditHistory = true;

	// activity experience

	private Boolean isActivityExperienceDisplay = false;

	private Boolean isActivityExperienceMandatory = false;

	private Double minActivityExperience;

	private Double maxActivityExperience;

	// geo graphical location

	private Boolean isGeographicalDisplayMFI = false;

	private Boolean isGeographicalMandatoryMFI = false;

	// co-origination new parameter
	private Boolean isMinNoCreditTransactionDisplay = false;

	private Boolean isMinNoCreditTransactionMandatory = false;

	private BigDecimal maxNoCreditTransaction;

	private BigDecimal minNoCreditTransaction;

	private Boolean isMinNoOverallTransactionDisplay = false;

	private Boolean isMinNoOverallTransactionMandatory = false;

	private BigDecimal maxNoOverallTransaction;

	private BigDecimal minNoOverallTransaction;

	private Boolean isMinSalesGrowthDisplay = false;

	private Boolean isMinSalesGrowthMandatory = false;

	private BigDecimal maxSalesGrowth;

	private BigDecimal minSalesGrowth;

	private Boolean isMinCashProfitGrowthDisplay = false;

	private Boolean isMinCashProfitGrowthMandatory = false;

	private BigDecimal maxCashProfitGrowth;

	private BigDecimal minCashProfitGrowth;

	private Boolean isMinMonthlyAvgBalDisplay = false;

	private Boolean isMinMonthlyAvgBalMandatory = false;

	private BigDecimal maxMonthlyAvgBal;

	private BigDecimal minMonthlyAvgBal;

	private Boolean isMinNoDebitTransactionDisplay = false;

	private Boolean isMinNoDebitTransactionMandatory = false;

	private BigDecimal maxNoDebitTransaction;

	private BigDecimal minNoDebitTransaction;

	private List<Integer> constitutionIds;
	
	private Boolean isConstitutionDisplay = false;

	private Boolean isConstitutionMandatory = false;
	
	private Boolean isMsmeRankingDisplay = false;

	private Boolean isMsmeRankingMandatory = false;

	private Integer msmeRanking;
	
	private Boolean isNoMsmeRanking = false;
	
	private Boolean isMaxAllowerBounceOneMonthDisplay = false;

	private Boolean isMaxAllowerBounceOneMonthMandatory = false;

	private Integer maxAllowerBounceOneMonth;
	
	private Boolean isMaxAllowerBounceSixMonthDisplay = false;

	private Boolean isMaxAllowerBounceSixMonthMandatory = false;

	private Integer maxAllowerBounceSixMonth;
	
	private Integer salesGrowthYearType;
	
	private Integer cashprofitGrowthYearType;

	private BigDecimal minInterestCoverageWithDepreciation;

	private BigDecimal maxInterestCoverageWithDepreciation;
	
	private Boolean isInterestCoverageWithDepreciationDisplay = false;
	
	private Boolean isInterestCoverageWithDepreciationMandatory= false;
	
	private BigDecimal individualBureauMaximumThreeMonthDPDs;

	private Boolean isIndividualBureauMaximumThreeMonthDPDsDisplay = false;
	
	private Boolean isIndividualBureauMaximumThreeMonthDPDsMandatory= false;
	
	private BigDecimal individualBureauMaximumSixMonthDPDs;
	
	private Boolean isIndividualBureauMaximumSixMonthDPDsDisplay = false;
	
	private Boolean isIndividualBureauMaximumSixMonthDPDsMandatory= false;
	
	private Boolean isMandatory= false;
	
	private Boolean isOptional= false;
	
//	private List<ProductParameterMappingRequest> parameterIds;
	
	private List<Long> manadatoryParameterIdList;
	private List<Long> optioanalParameterIdList;
	
	private List<ProductParameterMappingRequest> mandatoryParameters;
	
	private Long countryId;
	
	
	public Boolean getIsGeographicalDisplayMFI() {
		return isGeographicalDisplayMFI;
	}

	public void setIsGeographicalDisplayMFI(Boolean geographicalDisplayMFI) {
		isGeographicalDisplayMFI = geographicalDisplayMFI;
	}

	public Boolean getIsGeographicalMandatoryMFI() {
		return isGeographicalMandatoryMFI;
	}

	public void setIsGeographicalMandatoryMFI(Boolean geographicalMandatoryMFI) {
		isGeographicalMandatoryMFI = geographicalMandatoryMFI;
	}

	public Integer getMinBureauScoreLessThan6Month() {
		return minBureauScoreLessThan6Month;
	}

	public void setMinBureauScoreLessThan6Month(Integer minBureauScoreLessThan6Month) {
		this.minBureauScoreLessThan6Month = minBureauScoreLessThan6Month;
	}

	public Boolean getNoBureauCreditHistory() {
		return noBureauCreditHistory;
	}

	public void setNoBureauCreditHistory(Boolean noBureauCreditHistory) {
		this.noBureauCreditHistory = noBureauCreditHistory;
	}

	public Boolean getIsLoanAmountDisplay() {
		return isLoanAmountDisplay;
	}

	public void setIsLoanAmountDisplay(Boolean loanAmountDisplay) {
		isLoanAmountDisplay = loanAmountDisplay;
	}

	public Boolean getIsLoanAmountMandatory() {
		return isLoanAmountMandatory;
	}

	public void setIsLoanAmountMandatory(Boolean loanAmountMandatory) {
		isLoanAmountMandatory = loanAmountMandatory;
	}

	public Double getMinLoanAmount() {
		return minLoanAmount;
	}

	public void setMinLoanAmount(Double minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}

	public Double getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setIsMaxLoanAmount(Double maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public Boolean getIsYearlyIncomeRangeDisplay() {
		return isYearlyIncomeRangeDisplay;
	}

	public void setIsYearlyIncomeRangeDisplay(Boolean yearlyIncomeRangeDisplay) {
		isYearlyIncomeRangeDisplay = yearlyIncomeRangeDisplay;
	}

	public Boolean getIsYearlyIncomeRangeMandatory() {
		return isYearlyIncomeRangeMandatory;
	}

	public void setIsYearlyIncomeRangeMandatory(Boolean yearlyIncomeRangeMandatory) {
		isYearlyIncomeRangeMandatory = yearlyIncomeRangeMandatory;
	}

	public Double getMinYearlyIncomeRange() {
		return minYearlyIncomeRange;
	}

	public void setMinYearlyIncomeRange(Double minYearlyIncomeRange) {
		this.minYearlyIncomeRange = minYearlyIncomeRange;
	}

	public Double getMaxYearlyIncomeRange() {
		return maxYearlyIncomeRange;
	}

	public void setMaxYearlyIncomeRange(Double maxYearlyIncomeRange) {
		this.maxYearlyIncomeRange = maxYearlyIncomeRange;
	}

	public Boolean getIsAgeApplicantDisplay() {
		return isAgeApplicantDisplay;
	}

	public void setIsAgeApplicantDisplay(Boolean ageApplicantDisplay) {
		isAgeApplicantDisplay = ageApplicantDisplay;
	}

	public Boolean getIsAgeApplicantMandatory() {
		return isAgeApplicantMandatory;
	}

	public void setIsAgeApplicantMandatory(Boolean ageApplicantMandatory) {
		isAgeApplicantMandatory = ageApplicantMandatory;
	}

	public Double getMinApplicantAge() {
		return minApplicantAge;
	}

	public void setMinApplicantAge(Double minApplicantAge) {
		this.minApplicantAge = minApplicantAge;
	}

	public Double getMaxApplicantAge() {
		return maxApplicantAge;
	}

	public void setMaxApplicantAge(Double maxApplicantAge) {
		this.maxApplicantAge = maxApplicantAge;
	}

	public Boolean getIsBureauScoreDisplay() {
		return isBureauScoreDisplay;
	}

	public void setIsBureauScoreDisplay(Boolean bureauScoreDisplay) {
		isBureauScoreDisplay = bureauScoreDisplay;
	}

	public Boolean getIsBureauScoreMandatory() {
		return isBureauScoreMandatory;
	}

	public void setIsBureauScoreMandatory(Boolean bureauScoreMandatory) {
		isBureauScoreMandatory = bureauScoreMandatory;
	}

	public Double getMinBureauScore() {
		return minBureauScore;
	}

	public void setMinBureauScore(Double minBureauScore) {
		this.minBureauScore = minBureauScore;
	}

	public Boolean getIsActivityExperienceDisplay() {
		return isActivityExperienceDisplay;
	}

	public void setIsActivityExperienceDisplay(Boolean activityExperienceDisplay) {
		isActivityExperienceDisplay = activityExperienceDisplay;
	}

	public Boolean getIsActivityExperienceMandatory() {
		return isActivityExperienceMandatory;
	}

	public void setIsActivityExperienceMandatory(Boolean activityExperienceMandatory) {
		isActivityExperienceMandatory = activityExperienceMandatory;
	}

	public Double getMinActivityExperience() {
		return minActivityExperience;
	}

	public void setMinActivityExperience(Double minActivityExperience) {
		this.minActivityExperience = minActivityExperience;
	}

	public Double getMaxActivityExperience() {
		return maxActivityExperience;
	}

	public void setMaxActivityExperience(Double maxActivityExperience) {
		this.maxActivityExperience = maxActivityExperience;
	}

	public Integer getIndividualCibil() {
		return individualCibil;
	}

	public void setIndividualCibil(Integer individualCibil) {
		this.individualCibil = individualCibil;
	}

	public Boolean getIsIndividualCibilDisplay() {
		return isIndividualCibilDisplay;
	}

	public void setIsIndividualCibilDisplay(Boolean individualCibilDisplay) {
		isIndividualCibilDisplay = individualCibilDisplay;
	}

	public Boolean getIsIndividualCibilMandatory() {
		return isIndividualCibilMandatory;
	}

	public void setIsIndividualCibilMandatory(Boolean individualCibilMandatory) {
		isIndividualCibilMandatory = individualCibilMandatory;
	}

	public Integer getCommercialCibil() {
		return commercialCibil;
	}

	public void setCommercialCibil(Integer commercialCibil) {
		this.commercialCibil = commercialCibil;
	}

	public Boolean getIsCommercialCibilDisplay() {
		return isCommercialCibilDisplay;
	}

	public void setIsCommercialCibilDisplay(Boolean commercialCibilDisplay) {
		isCommercialCibilDisplay = commercialCibilDisplay;
	}

	public Boolean getIsCommercialCibilMandatory() {
		return isCommercialCibilMandatory;
	}

	public void setIsCommercialCibilMandatory(Boolean commercialCibilMandatory) {
		isCommercialCibilMandatory = commercialCibilMandatory;
	}

	public Integer getDdrFlow() {
		return ddrFlow;
	}

	public void setDdrFlow(Integer ddrFlow) {
		this.ddrFlow = ddrFlow;
	}

	public Integer getMinChequeBounced() {
		return minChequeBounced;
	}

	public void setMinChequeBounced(Integer minChequeBounced) {
		this.minChequeBounced = minChequeBounced;
	}

	public Integer getMaxChequeBounced() {
		return maxChequeBounced;
	}

	public void setMaxChequeBounced(Integer maxChequeBounced) {
		this.maxChequeBounced = maxChequeBounced;
	}

	public Boolean getIsChequeBouncedDisplay() {
		return isChequeBouncedDisplay;
	}

	public void setIsChequeBouncedDisplay(Boolean chequeBouncedDisplay) {
		isChequeBouncedDisplay = chequeBouncedDisplay;
	}

	public Boolean getIsChequeBouncedMandatory() {
		return isChequeBouncedMandatory;
	}

	public void setIsChequeBouncedMandatory(Boolean chequeBouncedMandatory) {
		isChequeBouncedMandatory = chequeBouncedMandatory;
	}

	public Integer getMinChequeBouncedLastSixMonths() {
		return minChequeBouncedLastSixMonths;
	}

	public void setMinChequeBouncedLastSixMonths(Integer minChequeBouncedLastSixMonths) {
		this.minChequeBouncedLastSixMonths = minChequeBouncedLastSixMonths;
	}

	public Integer getMaxChequeBouncedLastSixMonths() {
		return maxChequeBouncedLastSixMonths;
	}

	public void setMaxChequeBouncedLastSixMonths(Integer maxChequeBouncedLastSixMonths) {
		this.maxChequeBouncedLastSixMonths = maxChequeBouncedLastSixMonths;
	}

	public Boolean getIsChequeBouncedLastSixMonthsDisplay() {
		return isChequeBouncedLastSixMonthsDisplay;
	}

	public void setIsChequeBouncedLastSixMonthsDisplay(Boolean chequeBouncedLastSixMonthsDisplay) {
		isChequeBouncedLastSixMonthsDisplay = chequeBouncedLastSixMonthsDisplay;
	}

	public Boolean getIsChequeBouncedLastSixMonthsMandatory() {
		return isChequeBouncedLastSixMonthsMandatory;
	}

	public void setIsChequeBouncedLastSixMonthsMandatory(Boolean chequeBouncedLastSixMonthsMandatory) {
		isChequeBouncedLastSixMonthsMandatory = chequeBouncedLastSixMonthsMandatory;
	}

	public BigDecimal getMinCurrentRatio() {
		return minCurrentRatio;
	}

	public void setMinCurrentRatio(BigDecimal minCurrentRatio) {
		this.minCurrentRatio = minCurrentRatio;
	}

	public BigDecimal getMaxCurrentRatio() {
		return maxCurrentRatio;
	}

	public void setMaxCurrentRatio(BigDecimal maxCurrentRatio) {
		this.maxCurrentRatio = maxCurrentRatio;
	}

	public BigDecimal getMinInterestCoverage() {
		return minInterestCoverage;
	}

	public void setMinInterestCoverage(BigDecimal minInterestCoverage) {
		this.minInterestCoverage = minInterestCoverage;
	}

	public BigDecimal getMaxInterestCoverage() {
		return maxInterestCoverage;
	}

	public void setMaxInterestCoverage(BigDecimal maxInterestCoverage) {
		this.maxInterestCoverage = maxInterestCoverage;
	}

	public BigDecimal getMinTolTnw() {
		return minTolTnw;
	}

	public void setMinTolTnw(BigDecimal minTolTnw) {
		this.minTolTnw = minTolTnw;
	}

	public BigDecimal getMaxTolTnw() {
		return maxTolTnw;
	}

	public void setMaxTolTnw(BigDecimal maxTolTnw) {
		this.maxTolTnw = maxTolTnw;
	}

	public BigDecimal getMinTurnoverRatio() {
		return minTurnoverRatio;
	}

	public void setMinTurnoverRatio(BigDecimal minTurnoverRatio) {
		this.minTurnoverRatio = minTurnoverRatio;
	}

	public BigDecimal getMaxTurnoverRatio() {
		return maxTurnoverRatio;
	}

	public void setMaxTurnoverRatio(BigDecimal maxTurnoverRatio) {
		this.maxTurnoverRatio = maxTurnoverRatio;
	}

	public BigDecimal getMinGrossCashAccuralsRatio() {
		return minGrossCashAccuralsRatio;
	}

	public void setMinGrossCashAccuralsRatio(BigDecimal minGrossCashAccuralsRatio) {
		this.minGrossCashAccuralsRatio = minGrossCashAccuralsRatio;
	}

	public BigDecimal getMaxGrossCashAccuralsRatio() {
		return maxGrossCashAccuralsRatio;
	}

	public void setMaxGrossCashAccuralsRatio(BigDecimal maxGrossCashAccuralsRatio) {
		this.maxGrossCashAccuralsRatio = maxGrossCashAccuralsRatio;
	}

	public BigDecimal getMinCustomerConcentration() {
		return minCustomerConcentration;
	}

	public void setMinCustomerConcentration(BigDecimal minCustomerConcentration) {
		this.minCustomerConcentration = minCustomerConcentration;
	}

	public BigDecimal getMaxCustomerConcentration() {
		return maxCustomerConcentration;
	}

	public void setMaxCustomerConcentration(BigDecimal maxCustomerConcentration) {
		this.maxCustomerConcentration = maxCustomerConcentration;
	}

	public Integer getMinRiskModelScore() {
		return minRiskModelScore;
	}

	public void setMinRiskModelScore(Integer minRiskModelScore) {
		this.minRiskModelScore = minRiskModelScore;
	}

	public Integer getMaxRiskModelScore() {
		return maxRiskModelScore;
	}

	public void setMaxRiskModelScore(Integer maxRiskModelScore) {
		this.maxRiskModelScore = maxRiskModelScore;
	}

	public Integer getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(Integer netWorth) {
		this.netWorth = netWorth;
	}

	public Boolean getIsCurrentRatioDisplay() {
		return isCurrentRatioDisplay;
	}

	public void setIsCurrentRatioDisplay(Boolean currentRatioDisplay) {
		isCurrentRatioDisplay = currentRatioDisplay;
	}

	public Boolean getIsCurrentRatioMandatory() {
		return isCurrentRatioMandatory;
	}

	public void setIsCurrentRatioMandatory(Boolean currentRatioMandatory) {
		isCurrentRatioMandatory = currentRatioMandatory;
	}

	public Boolean getIsInterestCoverageDisplay() {
		return isInterestCoverageDisplay;
	}

	public void setIsInterestCoverageDisplay(Boolean interestCoverageDisplay) {
		isInterestCoverageDisplay = interestCoverageDisplay;
	}

	public Boolean getIsInterestCoverageMandatory() {
		return isInterestCoverageMandatory;
	}

	public void setIsInterestCoverageMandatory(Boolean interestCoverageMandatory) {
		isInterestCoverageMandatory = interestCoverageMandatory;
	}

	public Boolean getIsTolTnwDisplay() {
		return isTolTnwDisplay;
	}

	public void setIsTolTnwDisplay(Boolean tolTnwDisplay) {
		isTolTnwDisplay = tolTnwDisplay;
	}

	public Boolean getIsTolTnwMandatory() {
		return isTolTnwMandatory;
	}

	public void setIsTolTnwMandatory(Boolean tolTnwMandatory) {
		isTolTnwMandatory = tolTnwMandatory;
	}

	public Boolean getIsTurnoverRatioDisplay() {
		return isTurnoverRatioDisplay;
	}

	public void setIsTurnoverRatioDisplay(Boolean turnoverRatioDisplay) {
		isTurnoverRatioDisplay = turnoverRatioDisplay;
	}

	public Boolean getIsTurnoverRatioMandatory() {
		return isTurnoverRatioMandatory;
	}

	public void setIsTurnoverRatioMandatory(Boolean turnoverRatioMandatory) {
		isTurnoverRatioMandatory = turnoverRatioMandatory;
	}

	public Boolean getIsGrossCashAccuralsRatioDisplay() {
		return isGrossCashAccuralsRatioDisplay;
	}

	public void setIsGrossCashAccuralsRatioDisplay(Boolean grossCashAccuralsRatioDisplay) {
		isGrossCashAccuralsRatioDisplay = grossCashAccuralsRatioDisplay;
	}

	public Boolean getIsGrossCashAccuralsRatioMandatory() {
		return isGrossCashAccuralsRatioMandatory;
	}

	public void setIsGrossCashAccuralsRatioMandatory(Boolean grossCashAccuralsRatioMandatory) {
		isGrossCashAccuralsRatioMandatory = grossCashAccuralsRatioMandatory;
	}

	public Boolean getIsCustomerConcentrationDisplay() {
		return isCustomerConcentrationDisplay;
	}

	public void setIsCustomerConcentrationDisplay(Boolean customerConcentrationDisplay) {
		isCustomerConcentrationDisplay = customerConcentrationDisplay;
	}

	public Boolean getIsCustomerConcentrationMandatory() {
		return isCustomerConcentrationMandatory;
	}

	public void setIsCustomerConcentrationMandatory(Boolean customerConcentrationMandatory) {
		isCustomerConcentrationMandatory = customerConcentrationMandatory;
	}

	public Boolean getIsRiskModelScoreDisplay() {
		return isRiskModelScoreDisplay;
	}

	public void setIsRiskModelScoreDisplay(Boolean riskModelScoreDisplay) {
		isRiskModelScoreDisplay = riskModelScoreDisplay;
	}

	public Boolean getIsRiskModelScoreMandatory() {
		return isRiskModelScoreMandatory;
	}

	public void setIsRiskModelScoreMandatory(Boolean riskModelScoreMandatory) {
		isRiskModelScoreMandatory = riskModelScoreMandatory;
	}

	private List<DataRequest> industrylist = Collections.emptyList();

	private List<DataRequest> sectorlist = Collections.emptyList();

	private List<DataRequest> countryList = Collections.emptyList();

	private List<DataRequest> stateList = Collections.emptyList();

	private List<DataRequest> cityList = Collections.emptyList();

	private List<DataRequest> unInterestedIndustrylist = Collections.emptyList();

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public Integer getDenomination() {
		return denomination;
	}

	public void setDenomination(Integer denomination) {
		this.denomination = denomination;
	}

	public Boolean getIsCollateralDisplay() {
		return isCollateralDisplay;
	}

	public void setIsCollateralDisplay(Boolean isCollateralDisplay) {
		this.isCollateralDisplay = isCollateralDisplay;
	}

	public Boolean getIsCollateralMandatory() {
		return isCollateralMandatory;
	}

	public void setIsCollateralMandatory(Boolean isCollateralMandatory) {
		this.isCollateralMandatory = isCollateralMandatory;
	}

	public Boolean getIsCreditRatingDisplay() {
		return isCreditRatingDisplay;
	}

	public void setIsCreditRatingDisplay(Boolean isCreditRatingDisplay) {
		this.isCreditRatingDisplay = isCreditRatingDisplay;
	}

	public Boolean getIsCreditRatingMandatory() {
		return isCreditRatingMandatory;
	}

	public void setIsCreditRatingMandatory(Boolean isCreditRatingMandatory) {
		this.isCreditRatingMandatory = isCreditRatingMandatory;
	}

	public Boolean getIsDebtEquityDisplay() {
		return isDebtEquityDisplay;
	}

	public void setIsDebtEquityDisplay(Boolean isDebtEquityDisplay) {
		this.isDebtEquityDisplay = isDebtEquityDisplay;
	}

	public Boolean getIsDebtEquityMandatory() {
		return isDebtEquityMandatory;
	}

	public void setIsDebtEquityMandatory(Boolean isDebtEquityMandatory) {
		this.isDebtEquityMandatory = isDebtEquityMandatory;
	}

	public Boolean getIsEstablishmentDisplay() {
		return isEstablishmentDisplay;
	}

	public void setIsEstablishmentDisplay(Boolean isEstablishmentDisplay) {
		this.isEstablishmentDisplay = isEstablishmentDisplay;
	}

	public Boolean getIsEstablishmentMandatory() {
		return isEstablishmentMandatory;
	}

	public void setIsEstablishmentMandatory(Boolean isEstablishmentMandatory) {
		this.isEstablishmentMandatory = isEstablishmentMandatory;
	}

	public Boolean getIsGeographicalDisplay() {
		return isGeographicalDisplay;
	}

	public void setIsGeographicalDisplay(Boolean isGeographicalDisplay) {
		this.isGeographicalDisplay = isGeographicalDisplay;
	}

	public Boolean getIsGeographicalMandatory() {
		return isGeographicalMandatory;
	}

	public void setIsGeographicalMandatory(Boolean isGeographicalMandatory) {
		this.isGeographicalMandatory = isGeographicalMandatory;
	}

	public Boolean getIsIndustrySectorDisplay() {
		return isIndustrySectorDisplay;
	}

	public void setIsIndustrySectorDisplay(Boolean isIndustrySectorDisplay) {
		this.isIndustrySectorDisplay = isIndustrySectorDisplay;
	}

	public Boolean getIsIndustrySectorMandatory() {
		return isIndustrySectorMandatory;
	}

	public void setIsIndustrySectorMandatory(Boolean isIndustrySectorMandatory) {
		this.isIndustrySectorMandatory = isIndustrySectorMandatory;
	}

	public Boolean getIsInvestmentSizeDisplay() {
		return isInvestmentSizeDisplay;
	}

	public void setIsInvestmentSizeDisplay(Boolean isInvestmentSizeDisplay) {
		this.isInvestmentSizeDisplay = isInvestmentSizeDisplay;
	}

	public Boolean getIsInvestmentSizeMandatory() {
		return isInvestmentSizeMandatory;
	}

	public void setIsInvestmentSizeMandatory(Boolean isInvestmentSizeMandatory) {
		this.isInvestmentSizeMandatory = isInvestmentSizeMandatory;
	}

	public Boolean getIsNetworthDisplay() {
		return isNetworthDisplay;
	}

	public void setIsNetworthDisplay(Boolean isNetworthDisplay) {
		this.isNetworthDisplay = isNetworthDisplay;
	}

	public Boolean getIsNetworthMandatory() {
		return isNetworthMandatory;
	}

	public void setIsNetworthMandatory(Boolean isNetworthMandatory) {
		this.isNetworthMandatory = isNetworthMandatory;
	}

	public Boolean getIsPastYearTurnoverDisplay() {
		return isPastYearTurnoverDisplay;
	}

	public void setIsPastYearTurnoverDisplay(Boolean isPastYearTurnoverDisplay) {
		this.isPastYearTurnoverDisplay = isPastYearTurnoverDisplay;
	}

	public Boolean getIsPastYearTurnoverMandatory() {
		return isPastYearTurnoverMandatory;
	}

	public void setIsPastYearTurnoverMandatory(Boolean isPastYearTurnoverMandatory) {
		this.isPastYearTurnoverMandatory = isPastYearTurnoverMandatory;
	}

	public Boolean getIsProfitabilityHistoryDisplay() {
		return isProfitabilityHistoryDisplay;
	}

	public void setIsProfitabilityHistoryDisplay(Boolean isProfitabilityHistoryDisplay) {
		this.isProfitabilityHistoryDisplay = isProfitabilityHistoryDisplay;
	}

	public Boolean getIsProfitabilityHistoryMandatory() {
		return isProfitabilityHistoryMandatory;
	}

	public void setIsProfitabilityHistoryMandatory(Boolean isProfitabilityHistoryMandatory) {
		this.isProfitabilityHistoryMandatory = isProfitabilityHistoryMandatory;
	}

	public Boolean getIsTenureDisplay() {
		return isTenureDisplay;
	}

	public void setIsTenureDisplay(Boolean isTenureDisplay) {
		this.isTenureDisplay = isTenureDisplay;
	}

	public Boolean getIsTenureMandatory() {
		return isTenureMandatory;
	}

	public void setIsTenureMandatory(Boolean isTenureMandatory) {
		this.isTenureMandatory = isTenureMandatory;
	}

	public Integer getLongTermCreditRating() {
		return LongTermCreditRating;
	}

	public void setLongTermCreditRating(Integer longTermCreditRating) {
		LongTermCreditRating = longTermCreditRating;
	}

	public Integer getMaxAgeEstablishment() {
		return maxAgeEstablishment;
	}

	public void setMaxAgeEstablishment(Integer maxAgeEstablishment) {
		this.maxAgeEstablishment = maxAgeEstablishment;
	}

	public BigDecimal getMaxCollateral() {
		return maxCollateral;
	}

	public void setMaxCollateral(BigDecimal maxCollateral) {
		this.maxCollateral = maxCollateral;
	}

	public BigDecimal getMinCollateral() {
		return minCollateral;
	}

	public void setMinCollateral(BigDecimal minCollateral) {
		this.minCollateral = minCollateral;
	}

	public BigDecimal getMaxDebtEquity() {
		return maxDebtEquity;
	}

	public void setMaxDebtEquity(BigDecimal maxDebtEquity) {
		this.maxDebtEquity = maxDebtEquity;
	}

	public void setMinDebtEquity(BigDecimal minDebtEquity) {
		this.minDebtEquity = minDebtEquity;
	}

	public BigDecimal getMaxInvestSize() {
		return maxInvestSize;
	}

	public void setMaxInvestSize(BigDecimal maxInvestSize) {
		this.maxInvestSize = maxInvestSize;
	}

	public BigDecimal getMaxNetworth() {
		return maxNetworth;
	}

	public void setMaxNetworth(BigDecimal maxNetworth) {
		this.maxNetworth = maxNetworth;
	}

	public BigDecimal getMaxPastTurnover() {
		return maxPastTurnover;
	}

	public void setMaxPastTurnover(BigDecimal maxPastTurnover) {
		this.maxPastTurnover = maxPastTurnover;
	}

	public Integer getMaxTenure() {
		return maxTenure;
	}

	public void setMaxTenure(Integer maxTenure) {
		this.maxTenure = maxTenure;
	}

	public Integer getMinAgeEstablishment() {
		return minAgeEstablishment;
	}

	public void setMinAgeEstablishment(Integer minAgeEstablishment) {
		this.minAgeEstablishment = minAgeEstablishment;
	}

	public BigDecimal getMinDebtEquity() {
		return minDebtEquity;
	}

	public BigDecimal getMinInvestSize() {
		return minInvestSize;
	}

	public void setMinInvestSize(BigDecimal minInvestSize) {
		this.minInvestSize = minInvestSize;
	}

	public BigDecimal getMinNetworth() {
		return minNetworth;
	}

	public void setMinNetworth(BigDecimal minNetworth) {
		this.minNetworth = minNetworth;
	}

	public BigDecimal getMinPastTurnover() {
		return minPastTurnover;
	}

	public void setMinPastTurnover(BigDecimal minPastTurnover) {
		this.minPastTurnover = minPastTurnover;
	}

	public Integer getMinTenure() {
		return minTenure;
	}

	public void setMinTenure(Integer minTenure) {
		this.minTenure = minTenure;
	}

	public Integer getProfitabilityHistory() {
		return profitabilityHistory;
	}

	public void setProfitabilityHistory(Integer profitabilityHistory) {
		this.profitabilityHistory = profitabilityHistory;
	}

	public Integer getShortTermCreditRating() {
		return shortTermCreditRating;
	}

	public void setShortTermCreditRating(Integer shortTermCreditRating) {
		this.shortTermCreditRating = shortTermCreditRating;
	}

	public Long getUninterestedIndustry() {
		return uninterestedIndustry;
	}

	public void setUninterestedIndustry(Long uninterestedIndustry) {
		this.uninterestedIndustry = uninterestedIndustry;
	}

	public List<DataRequest> getIndustrylist() {
		return industrylist;
	}

	public void setIndustrylist(List<DataRequest> industrylist) {
		this.industrylist = industrylist;
	}

	public List<DataRequest> getSectorlist() {
		return sectorlist;
	}

	public void setSectorlist(List<DataRequest> sectorlist) {
		this.sectorlist = sectorlist;
	}

	public List<DataRequest> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<DataRequest> countryList) {
		this.countryList = countryList;
	}

	public List<DataRequest> getStateList() {
		return stateList;
	}

	public void setStateList(List<DataRequest> stateList) {
		this.stateList = stateList;
	}

	public List<DataRequest> getCityList() {
		return cityList;
	}

	public void setCityList(List<DataRequest> cityList) {
		this.cityList = cityList;
	}

	public List<DataRequest> getUnInterestedIndustrylist() {
		return unInterestedIndustrylist;
	}

	public void setUnInterestedIndustrylist(List<DataRequest> unInterestedIndustrylist) {
		this.unInterestedIndustrylist = unInterestedIndustrylist;
	}

	public Boolean getIsUnInterestedIndustryDisplay() {
		return isUnInterestedIndustryDisplay;
	}

	public void setIsUnInterestedIndustryDisplay(Boolean isUnInterestedIndustryDisplay) {
		this.isUnInterestedIndustryDisplay = isUnInterestedIndustryDisplay;
	}

	public Boolean getIsUnInterestedIndustryMandatory() {
		return isUnInterestedIndustryMandatory;
	}

	public void setIsUnInterestedIndustryMandatory(Boolean isUnInterestedIndustryMandatory) {
		this.isUnInterestedIndustryMandatory = isUnInterestedIndustryMandatory;
	}

	public Integer getAssessmentMethodId() {
		return assessmentMethodId;
	}

	public void setAssessmentMethodId(Integer assessmentMethodId) {
		this.assessmentMethodId = assessmentMethodId;
	}

	public Long getUserOrgId() {
		return userOrgId;
	}

	public void setUserOrgId(Long userOrgId) {
		this.userOrgId = userOrgId;
	}

	public Integer getAppstage() {
		return appstage;
	}

	public void setAppstage(Integer appstage) {
		this.appstage = appstage;
	}

	public BigDecimal getMinCgtmseCoverage() {
		return minCgtmseCoverage;
	}

	public void setMinCgtmseCoverage(BigDecimal minCgtmseCoverage) {
		this.minCgtmseCoverage = minCgtmseCoverage;
	}

	public BigDecimal getMaxCgtmseCoverage() {
		return maxCgtmseCoverage;
	}

	public void setMaxCgtmseCoverage(BigDecimal maxCgtmseCoverage) {
		this.maxCgtmseCoverage = maxCgtmseCoverage;
	}

	public List<Integer> getMsmeFundingIds() {
		return msmeFundingIds;
	}

	public void setMsmeFundingIds(List<Integer> msmeFundingIds) {
		this.msmeFundingIds = msmeFundingIds;
	}

	public Boolean getIsCgtmseCoverageDisplay() {
		return isCgtmseCoverageDisplay;
	}

	public void setIsCgtmseCoverageDisplay(Boolean isCgtmseCoverageDisplay) {
		this.isCgtmseCoverageDisplay = isCgtmseCoverageDisplay;
	}

	public Boolean getIsCgtmseCoverageMandatory() {
		return isCgtmseCoverageMandatory;
	}

	public void setIsCgtmseCoverageMandatory(Boolean isCgtmseCoverageMandatory) {
		this.isCgtmseCoverageMandatory = isCgtmseCoverageMandatory;
	}

	public Boolean getIsMsmeFundingDisplay() {
		return isMsmeFundingDisplay;
	}

	public void setIsMsmeFundingDisplay(Boolean isMsmeFundingDisplay) {
		this.isMsmeFundingDisplay = isMsmeFundingDisplay;
	}

	public Boolean getIsMsmeFundingMandatory() {
		return isMsmeFundingMandatory;
	}

	public void setIsMsmeFundingMandatory(Boolean isMsmeFundingMandatory) {
		this.isMsmeFundingMandatory = isMsmeFundingMandatory;
	}

	public BigDecimal getMinAvrgAge() {
		return minAvrgAge;
	}

	public void setMinAvrgAge(BigDecimal minAvrgAge) {
		this.minAvrgAge = minAvrgAge;
	}

	public BigDecimal getMaxAvrgAge() {
		return maxAvrgAge;
	}

	public void setMaxAvrgAge(BigDecimal maxAvrgAge) {
		this.maxAvrgAge = maxAvrgAge;
	}

	public BigDecimal getMinAvrgYearlyIncome() {
		return minAvrgYearlyIncome;
	}

	public void setMinAvrgYearlyIncome(BigDecimal minAvrgYearlyIncome) {
		this.minAvrgYearlyIncome = minAvrgYearlyIncome;
	}

	public BigDecimal getMaxAvrgYearlyIncome() {
		return maxAvrgYearlyIncome;
	}

	public void setMaxAvrgYearlyIncome(BigDecimal maxAvrgYearlyIncome) {
		this.maxAvrgYearlyIncome = maxAvrgYearlyIncome;
	}

	public BigDecimal getMincgtmse() {
		return mincgtmse;
	}

	public void setMincgtmse(BigDecimal mincgtmse) {
		this.mincgtmse = mincgtmse;
	}

	public BigDecimal getMaxcgtmse() {
		return maxcgtmse;
	}

	public void setMaxcgtmse(BigDecimal maxcgtmse) {
		this.maxcgtmse = maxcgtmse;
	}

	public BigDecimal getMinLoanToAsset() {
		return minLoanToAsset;
	}

	public void setMinLoanToAsset(BigDecimal minLoanToAsset) {
		this.minLoanToAsset = minLoanToAsset;
	}

	public BigDecimal getMaxLoanToAsset() {
		return maxLoanToAsset;
	}

	public void setMaxLoanToAsset(BigDecimal maxLoanToAsset) {
		this.maxLoanToAsset = maxLoanToAsset;
	}

	public BigDecimal getMinAvgWorkExp() {
		return minAvgWorkExp;
	}

	public void setMinAvgWorkExp(BigDecimal minAvgWorkExp) {
		this.minAvgWorkExp = minAvgWorkExp;
	}

	public BigDecimal getMaxAvgWorkExp() {
		return maxAvgWorkExp;
	}

	public void setMaxAvgWorkExp(BigDecimal maxAvgWorkExp) {
		this.maxAvgWorkExp = maxAvgWorkExp;
	}

	public BigDecimal getMinCurrentFoir() {
		return minCurrentFoir;
	}

	public void setMinCurrentFoir(BigDecimal minCurrentFoir) {
		this.minCurrentFoir = minCurrentFoir;
	}

	public BigDecimal getMaxCurrentFoir() {
		return maxCurrentFoir;
	}

	public void setMaxCurrentFoir(BigDecimal maxCurrentFoir) {
		this.maxCurrentFoir = maxCurrentFoir;
	}

	public Boolean getIsAvrgAgeDisplay() {
		return isAvrgAgeDisplay;
	}

	public void setIsAvrgAgeDisplay(Boolean isAvrgAgeDisplay) {
		this.isAvrgAgeDisplay = isAvrgAgeDisplay;
	}

	public Boolean getIsAvrgAgeMandatory() {
		return isAvrgAgeMandatory;
	}

	public void setIsAvrgAgeMandatory(Boolean isAvrgAgeMandatory) {
		this.isAvrgAgeMandatory = isAvrgAgeMandatory;
	}

	public Boolean getIsAvrgYearlyIncomeDisplay() {
		return isAvrgYearlyIncomeDisplay;
	}

	public void setIsAvrgYearlyIncomeDisplay(Boolean isAvrgYearlyIncomeDisplay) {
		this.isAvrgYearlyIncomeDisplay = isAvrgYearlyIncomeDisplay;
	}

	public Boolean getIsAvrgYearlyIncomeMandatory() {
		return isAvrgYearlyIncomeMandatory;
	}

	public void setIsAvrgYearlyIncomeMandatory(Boolean isAvrgYearlyIncomeMandatory) {
		this.isAvrgYearlyIncomeMandatory = isAvrgYearlyIncomeMandatory;
	}

	public Boolean getIscgtmseDisplay() {
		return iscgtmseDisplay;
	}

	public void setIscgtmseDisplay(Boolean iscgtmseDisplay) {
		this.iscgtmseDisplay = iscgtmseDisplay;
	}

	public Boolean getIscgtmseMandatory() {
		return iscgtmseMandatory;
	}

	public void setIscgtmseMandatory(Boolean iscgtmseMandatory) {
		this.iscgtmseMandatory = iscgtmseMandatory;
	}

	public Boolean getIsLoanToAssetDisplay() {
		return isLoanToAssetDisplay;
	}

	public void setIsLoanToAssetDisplay(Boolean isLoanToAssetDisplay) {
		this.isLoanToAssetDisplay = isLoanToAssetDisplay;
	}

	public Boolean getIsLoanToAssetMandatory() {
		return isLoanToAssetMandatory;
	}

	public void setIsLoanToAssetMandatory(Boolean isLoanToAssetMandatory) {
		this.isLoanToAssetMandatory = isLoanToAssetMandatory;
	}

	public Boolean getIsAvgWorkExpDisplay() {
		return isAvgWorkExpDisplay;
	}

	public void setIsAvgWorkExpDisplay(Boolean isAvgWorkExpDisplay) {
		this.isAvgWorkExpDisplay = isAvgWorkExpDisplay;
	}

	public Boolean getIsAvgWorkExpMandatory() {
		return isAvgWorkExpMandatory;
	}

	public void setIsAvgWorkExpMandatory(Boolean isAvgWorkExpMandatory) {
		this.isAvgWorkExpMandatory = isAvgWorkExpMandatory;
	}

	public Boolean getIsCurrentFoirDisplay() {
		return isCurrentFoirDisplay;
	}

	public void setIsCurrentFoirDisplay(Boolean isCurrentFoirDisplay) {
		this.isCurrentFoirDisplay = isCurrentFoirDisplay;
	}

	public Boolean getIsCurrentFoirMandatory() {
		return isCurrentFoirMandatory;
	}

	public void setIsCurrentFoirMandatory(Boolean isCurrentFoirMandatory) {
		this.isCurrentFoirMandatory = isCurrentFoirMandatory;
	}

	public BigDecimal getMinTenureNtb() {
		return minTenureNtb;
	}

	public void setMinTenureNtb(BigDecimal minTenureNtb) {
		this.minTenureNtb = minTenureNtb;
	}

	public BigDecimal getMaxTenureNtb() {
		return maxTenureNtb;
	}

	public void setMaxTenureNtb(BigDecimal maxTenureNtb) {
		this.maxTenureNtb = maxTenureNtb;
	}

	public Integer getCgtmseCoverage() {
		return cgtmseCoverage;
	}

	public void setCgtmseCoverage(Integer cgtmseCoverage) {
		this.cgtmseCoverage = cgtmseCoverage;
	}

	public Integer getCashMargin() {
		return cashMargin;
	}

	public void setCashMargin(Integer cashMargin) {
		this.cashMargin = cashMargin;
	}

	public BigDecimal getDscr() {
		return dscr;
	}

	public void setDscr(BigDecimal dscr) {
		this.dscr = dscr;
	}

	public Integer getPaybackPeriod() {
		return paybackPeriod;
	}

	public void setPaybackPeriod(Integer paybackPeriod) {
		this.paybackPeriod = paybackPeriod;
	}

	public BigDecimal getPromotorContri() {
		return promotorContri;
	}

	public void setPromotorContri(BigDecimal promotorContri) {
		this.promotorContri = promotorContri;
	}

	public BigDecimal getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(BigDecimal manufacturing) {
		this.manufacturing = manufacturing;
	}

	public BigDecimal getService() {
		return service;
	}

	public void setService(BigDecimal service) {
		this.service = service;
	}

	public BigDecimal getTrading() {
		return trading;
	}

	public void setTrading(BigDecimal trading) {
		this.trading = trading;
	}

	public Integer getUserCreditRating() {
		return userCreditRating;
	}

	public void setUserCreditRating(Integer userCreditRating) {
		this.userCreditRating = userCreditRating;
	}

	public BigDecimal getMaxDropInTurnover() {
		return maxDropInTurnover;
	}

	public void setMaxDropInTurnover(BigDecimal maxDropInTurnover) {
		this.maxDropInTurnover = maxDropInTurnover;
	}

	public Boolean getIsMaxDropInTurnoverDisplay() {
		return isMaxDropInTurnoverDisplay;
	}

	public void setIsMaxDropInTurnoverDisplay(Boolean isMaxDropInTurnoverDisplay) {
		this.isMaxDropInTurnoverDisplay = isMaxDropInTurnoverDisplay;
	}

	public Boolean getIsMaxDropInTurnoverMandatory() {
		return isMaxDropInTurnoverMandatory;
	}

	public void setIsMaxDropInTurnoverMandatory(Boolean isMaxDropInTurnoverMandatory) {
		this.isMaxDropInTurnoverMandatory = isMaxDropInTurnoverMandatory;
	}

	public BigDecimal getMinUtilisationPercentage() {
		return minUtilisationPercentage;
	}

	public void setMinUtilisationPercentage(BigDecimal minUtilisationPercentage) {
		this.minUtilisationPercentage = minUtilisationPercentage;
	}

	public BigDecimal getMaxUtilisationPercentage() {
		return maxUtilisationPercentage;
	}

	public void setMaxUtilisationPercentage(BigDecimal maxUtilisationPercentage) {
		this.maxUtilisationPercentage = maxUtilisationPercentage;
	}

	public Boolean getIsUtilisationPercentageDisplay() {
		return isUtilisationPercentageDisplay;
	}

	public void setIsUtilisationPercentageDisplay(Boolean isUtilisationPercentageDisplay) {
		this.isUtilisationPercentageDisplay = isUtilisationPercentageDisplay;
	}

	public Boolean getIsUtilisationPercentageMandatory() {
		return isUtilisationPercentageMandatory;
	}

	public void setIsUtilisationPercentageMandatory(Boolean isUtilisationPercentageMandatory) {
		this.isUtilisationPercentageMandatory = isUtilisationPercentageMandatory;
	}

	public BigDecimal getMinCreditSummation() {
		return minCreditSummation;
	}

	public void setMinCreditSummation(BigDecimal minCreditSummation) {
		this.minCreditSummation = minCreditSummation;
	}

	public BigDecimal getMaxCreditSummation() {
		return maxCreditSummation;
	}

	public void setMaxCreditSummation(BigDecimal maxCreditSummation) {
		this.maxCreditSummation = maxCreditSummation;
	}

	public Boolean getIsCreditSummationDisplay() {
		return isCreditSummationDisplay;
	}

	public void setIsCreditSummationDisplay(Boolean isCreditSummationDisplay) {
		this.isCreditSummationDisplay = isCreditSummationDisplay;
	}

	public Boolean getIsCreditSummationMandatory() {
		return isCreditSummationMandatory;
	}

	public void setIsCreditSummationMandatory(Boolean isCreditSummationMandatory) {
		this.isCreditSummationMandatory = isCreditSummationMandatory;
	}

	public BigDecimal getMinCollateralCoverage() {
		return minCollateralCoverage;
	}

	public void setMinCollateralCoverage(BigDecimal minCollateralCoverage) {
		this.minCollateralCoverage = minCollateralCoverage;
	}

	public BigDecimal getMaxCollateralCoverage() {
		return maxCollateralCoverage;
	}

	public void setMaxCollateralCoverage(BigDecimal maxCollateralCoverage) {
		this.maxCollateralCoverage = maxCollateralCoverage;
	}

	public Boolean getIsCollateralCoverageDisplay() {
		return isCollateralCoverageDisplay;
	}

	public void setIsCollateralCoverageDisplay(Boolean isCollateralCoverageDisplay) {
		this.isCollateralCoverageDisplay = isCollateralCoverageDisplay;
	}

	public Boolean getIsCollateralCoverageMandatory() {
		return isCollateralCoverageMandatory;
	}

	public void setIsCollateralCoverageMandatory(Boolean isCollateralCoverageMandatory) {
		this.isCollateralCoverageMandatory = isCollateralCoverageMandatory;
	}

	public BigDecimal getNewTolTnw() {
		return newTolTnw;
	}

	public void setNewTolTnw(BigDecimal newTolTnw) {
		this.newTolTnw = newTolTnw;
	}

	public BigDecimal getNewCollateralCoverage() {
		return newCollateralCoverage;
	}

	public void setNewCollateralCoverage(BigDecimal newCollateralCoverage) {
		this.newCollateralCoverage = newCollateralCoverage;
	}

	public Boolean getIsNewCollateralCoverageCheck() {
		return isNewCollateralCoverageCheck;
	}

	public void setIsNewCollateralCoverageCheck(Boolean isNewCollateralCoverageCheck) {
		this.isNewCollateralCoverageCheck = isNewCollateralCoverageCheck;
	}

	public Boolean getIsNewTolTnwCheck() {
		return isNewTolTnwCheck;
	}

	public void setIsNewTolTnwCheck(Boolean isNewTolTnwCheck) {
		this.isNewTolTnwCheck = isNewTolTnwCheck;
	}

	public Integer getKotakSubParameter() {
		return kotakSubParameter;
	}

	public void setKotakSubParameter(Integer kotakSubParameter) {
		this.kotakSubParameter = kotakSubParameter;
	}

	public Boolean getWcReqCheck() {
		return wcReqCheck;
	}

	public void setWcReqCheck(Boolean wcReqCheck) {
		this.wcReqCheck = wcReqCheck;
	}

	public Boolean getIsNewDscrCheck() {
		return isNewDscrCheck;
	}

	public BigDecimal getNewDscrCheck() {
		return newDscrCheck;
	}

	public void setIsNewDscrCheck(Boolean isNewDscrCheck) {
		this.isNewDscrCheck = isNewDscrCheck;
	}

	public void setNewDscrCheck(BigDecimal newDscrCheck) {
		this.newDscrCheck = newDscrCheck;
	}

	public Boolean getIsNewHistoricSales() {
		return isNewHistoricSales;
	}

	public void setIsNewHistoricSales(Boolean isNewHistoricSales) {
		this.isNewHistoricSales = isNewHistoricSales;
	}

	public BigDecimal getNewHistoricSales() {
		return newHistoricSales;
	}

	public void setNewHistoricSales(BigDecimal newHistoricSales) {
		this.newHistoricSales = newHistoricSales;
	}

	public Boolean getIsHistoricGrowth() {
		return isHistoricGrowth;
	}

	public void setIsHistoricGrowth(Boolean isHistoricGrowth) {
		this.isHistoricGrowth = isHistoricGrowth;
	}

	public BigDecimal getNewHistoricGrowth() {
		return newHistoricGrowth;
	}

	public void setNewHistoricGrowth(BigDecimal newHistoricGrowth) {
		this.newHistoricGrowth = newHistoricGrowth;
	}

	public List<Integer> getLoanArrangementIds() {
		return loanArrangementIds;
	}

	public void setLoanArrangementIds(List<Integer> loanArrangementIds) {
		this.loanArrangementIds = loanArrangementIds;
	}

	public BigDecimal getMinAdditionalLoan() {
		return minAdditionalLoan;
	}

	public void setMinAdditionalLoan(BigDecimal minAdditionalLoan) {
		this.minAdditionalLoan = minAdditionalLoan;
	}

	public BigDecimal getMaxAdditionalLoan() {
		return maxAdditionalLoan;
	}

	public void setMaxAdditionalLoan(BigDecimal maxAdditionalLoan) {
		this.maxAdditionalLoan = maxAdditionalLoan;
	}

	public BigDecimal getMinTotalLoan() {
		return minTotalLoan;
	}

	public void setMinTotalLoan(BigDecimal minTotalLoan) {
		this.minTotalLoan = minTotalLoan;
	}

	public BigDecimal getMaxTotalLoan() {
		return maxTotalLoan;
	}

	public void setMaxTotalLoan(BigDecimal maxTotalLoan) {
		this.maxTotalLoan = maxTotalLoan;
	}

	public Boolean getIsConservativeRatioDisplay() {
		return isConservativeRatioDisplay;
	}

	public void setIsConservativeRatioDisplay(Boolean isConservativeRatioDisplay) {
		this.isConservativeRatioDisplay = isConservativeRatioDisplay;
	}

	public Boolean getIsConservativeRatioMandatory() {
		return isConservativeRatioMandatory;
	}

	public void setIsConservativeRatioMandatory(Boolean isConservativeRatioMandatory) {
		this.isConservativeRatioMandatory = isConservativeRatioMandatory;
	}

	public BigDecimal getMaxConservativeRatio() {
		return maxConservativeRatio;
	}

	public void setMaxConservativeRatio(BigDecimal maxConservativeRatio) {
		this.maxConservativeRatio = maxConservativeRatio;
	}

	public BigDecimal getMinConservativeRatio() {
		return minConservativeRatio;
	}

	public void setMinConservativeRatio(BigDecimal minConservativeRatio) {
		this.minConservativeRatio = minConservativeRatio;
	}

	public Integer getMainIndividualCibil() {
		return mainIndividualCibil;
	}

	public void setMainIndividualCibil(Integer mainIndividualCibil) {
		this.mainIndividualCibil = mainIndividualCibil;
	}

	public Boolean getIsMainIndividualCibilDisplay() {
		return isMainIndividualCibilDisplay;
	}

	public void setIsMainIndividualCibilDisplay(Boolean isMainIndividualCibilDisplay) {
		this.isMainIndividualCibilDisplay = isMainIndividualCibilDisplay;
	}

	public Boolean getIsMainIndividualCibilMandatory() {
		return isMainIndividualCibilMandatory;
	}

	public void setIsMainIndividualCibilMandatory(Boolean isMainIndividualCibilMandatory) {
		this.isMainIndividualCibilMandatory = isMainIndividualCibilMandatory;
	}

	public Integer getCommercialCibilFor3Month() {
		return commercialCibilFor3Month;
	}

	public void setCommercialCibilFor3Month(Integer commercialCibilFor3Month) {
		this.commercialCibilFor3Month = commercialCibilFor3Month;
	}

	public Boolean getIsCommercialCibilFor3MonthDisplay() {
		return isCommercialCibilFor3MonthDisplay;
	}

	public void setIsCommercialCibilFor3MonthDisplay(Boolean isCommercialCibilFor3MonthDisplay) {
		this.isCommercialCibilFor3MonthDisplay = isCommercialCibilFor3MonthDisplay;
	}

	public Boolean getIsCommercialCibilFor3MonthMandatory() {
		return isCommercialCibilFor3MonthMandatory;
	}

	public void setIsCommercialCibilFor3MonthMandatory(Boolean isCommercialCibilFor3MonthMandatory) {
		this.isCommercialCibilFor3MonthMandatory = isCommercialCibilFor3MonthMandatory;
	}

	public List<Long> getNbfcRatioIds() {
		return nbfcRatioIds;
	}

	public void setNbfcRatioIds(List<Long> nbfcRatioIds) {
		this.nbfcRatioIds = nbfcRatioIds;
	}

	public void setMaxLoanAmount(Double maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public Boolean getIsMinNoCreditTransactionDisplay() {
		return isMinNoCreditTransactionDisplay;
	}

	public void setIsMinNoCreditTransactionDisplay(Boolean isMinNoCreditTransactionDisplay) {
		this.isMinNoCreditTransactionDisplay = isMinNoCreditTransactionDisplay;
	}

	public Boolean getIsMinNoCreditTransactionMandatory() {
		return isMinNoCreditTransactionMandatory;
	}

	public void setIsMinNoCreditTransactionMandatory(Boolean isMinNoCreditTransactionMandatory) {
		this.isMinNoCreditTransactionMandatory = isMinNoCreditTransactionMandatory;
	}

	public BigDecimal getMaxNoCreditTransaction() {
		return maxNoCreditTransaction;
	}

	public void setMaxNoCreditTransaction(BigDecimal maxNoCreditTransaction) {
		this.maxNoCreditTransaction = maxNoCreditTransaction;
	}

	public BigDecimal getMinNoCreditTransaction() {
		return minNoCreditTransaction;
	}

	public void setMinNoCreditTransaction(BigDecimal minNoCreditTransaction) {
		this.minNoCreditTransaction = minNoCreditTransaction;
	}

	public Boolean getIsMinNoOverallTransactionDisplay() {
		return isMinNoOverallTransactionDisplay;
	}

	public void setIsMinNoOverallTransactionDisplay(Boolean isMinNoOverallTransactionDisplay) {
		this.isMinNoOverallTransactionDisplay = isMinNoOverallTransactionDisplay;
	}

	public Boolean getIsMinNoOverallTransactionMandatory() {
		return isMinNoOverallTransactionMandatory;
	}

	public void setIsMinNoOverallTransactionMandatory(Boolean isMinNoOverallTransactionMandatory) {
		this.isMinNoOverallTransactionMandatory = isMinNoOverallTransactionMandatory;
	}

	public BigDecimal getMaxNoOverallTransaction() {
		return maxNoOverallTransaction;
	}

	public void setMaxNoOverallTransaction(BigDecimal maxNoOverallTransaction) {
		this.maxNoOverallTransaction = maxNoOverallTransaction;
	}

	public BigDecimal getMinNoOverallTransaction() {
		return minNoOverallTransaction;
	}

	public void setMinNoOverallTransaction(BigDecimal minNoOverallTransaction) {
		this.minNoOverallTransaction = minNoOverallTransaction;
	}

	public Boolean getIsMinSalesGrowthDisplay() {
		return isMinSalesGrowthDisplay;
	}

	public void setIsMinSalesGrowthDisplay(Boolean isMinSalesGrowthDisplay) {
		this.isMinSalesGrowthDisplay = isMinSalesGrowthDisplay;
	}

	public Boolean getIsMinSalesGrowthMandatory() {
		return isMinSalesGrowthMandatory;
	}

	public void setIsMinSalesGrowthMandatory(Boolean isMinSalesGrowthMandatory) {
		this.isMinSalesGrowthMandatory = isMinSalesGrowthMandatory;
	}

	public BigDecimal getMaxSalesGrowth() {
		return maxSalesGrowth;
	}

	public void setMaxSalesGrowth(BigDecimal maxSalesGrowth) {
		this.maxSalesGrowth = maxSalesGrowth;
	}

	public BigDecimal getMinSalesGrowth() {
		return minSalesGrowth;
	}

	public void setMinSalesGrowth(BigDecimal minSalesGrowth) {
		this.minSalesGrowth = minSalesGrowth;
	}

	public Boolean getIsMinCashProfitGrowthDisplay() {
		return isMinCashProfitGrowthDisplay;
	}

	public void setIsMinCashProfitGrowthDisplay(Boolean isMinCashProfitGrowthDisplay) {
		this.isMinCashProfitGrowthDisplay = isMinCashProfitGrowthDisplay;
	}

	public Boolean getIsMinCashProfitGrowthMandatory() {
		return isMinCashProfitGrowthMandatory;
	}

	public void setIsMinCashProfitGrowthMandatory(Boolean isMinCashProfitGrowthMandatory) {
		this.isMinCashProfitGrowthMandatory = isMinCashProfitGrowthMandatory;
	}

	public BigDecimal getMaxCashProfitGrowth() {
		return maxCashProfitGrowth;
	}

	public void setMaxCashProfitGrowth(BigDecimal maxCashProfitGrowth) {
		this.maxCashProfitGrowth = maxCashProfitGrowth;
	}

	public BigDecimal getMinCashProfitGrowth() {
		return minCashProfitGrowth;
	}

	public void setMinCashProfitGrowth(BigDecimal minCashProfitGrowth) {
		this.minCashProfitGrowth = minCashProfitGrowth;
	}

	public Boolean getIsMinMonthlyAvgBalDisplay() {
		return isMinMonthlyAvgBalDisplay;
	}

	public void setIsMinMonthlyAvgBalDisplay(Boolean isMinMonthlyAvgBalDisplay) {
		this.isMinMonthlyAvgBalDisplay = isMinMonthlyAvgBalDisplay;
	}

	public Boolean getIsMinMonthlyAvgBalMandatory() {
		return isMinMonthlyAvgBalMandatory;
	}

	public void setIsMinMonthlyAvgBalMandatory(Boolean isMinMonthlyAvgBalMandatory) {
		this.isMinMonthlyAvgBalMandatory = isMinMonthlyAvgBalMandatory;
	}

	public BigDecimal getMaxMonthlyAvgBal() {
		return maxMonthlyAvgBal;
	}

	public void setMaxMonthlyAvgBal(BigDecimal maxMonthlyAvgBal) {
		this.maxMonthlyAvgBal = maxMonthlyAvgBal;
	}

	public BigDecimal getMinMonthlyAvgBal() {
		return minMonthlyAvgBal;
	}

	public void setMinMonthlyAvgBal(BigDecimal minMonthlyAvgBal) {
		this.minMonthlyAvgBal = minMonthlyAvgBal;
	}

	public Boolean getIsMinNoDebitTransactionDisplay() {
		return isMinNoDebitTransactionDisplay;
	}

	public void setIsMinNoDebitTransactionDisplay(Boolean isMinNoDebitTransactionDisplay) {
		this.isMinNoDebitTransactionDisplay = isMinNoDebitTransactionDisplay;
	}

	public Boolean getIsMinNoDebitTransactionMandatory() {
		return isMinNoDebitTransactionMandatory;
	}

	public void setIsMinNoDebitTransactionMandatory(Boolean isMinNoDebitTransactionMandatory) {
		this.isMinNoDebitTransactionMandatory = isMinNoDebitTransactionMandatory;
	}

	public BigDecimal getMaxNoDebitTransaction() {
		return maxNoDebitTransaction;
	}

	public void setMaxNoDebitTransaction(BigDecimal maxNoDebitTransaction) {
		this.maxNoDebitTransaction = maxNoDebitTransaction;
	}

	public BigDecimal getMinNoDebitTransaction() {
		return minNoDebitTransaction;
	}

	public void setMinNoDebitTransaction(BigDecimal minNoDebitTransaction) {
		this.minNoDebitTransaction = minNoDebitTransaction;
	}

	public List<Integer> getConstitutionIds() {
		return constitutionIds;
	}

	public void setConstitutionIds(List<Integer> constitutionIds) {
		this.constitutionIds = constitutionIds;
	}

	public Boolean getIsConstitutionDisplay() {
		return isConstitutionDisplay;
	}

	public void setIsConstitutionDisplay(Boolean isConstitutionDisplay) {
		this.isConstitutionDisplay = isConstitutionDisplay;
	}

	public Boolean getIsConstitutionMandatory() {
		return isConstitutionMandatory;
	}

	public void setIsConstitutionMandatory(Boolean isConstitutionMandatory) {
		this.isConstitutionMandatory = isConstitutionMandatory;
	}

	public Boolean getIsMsmeRankingDisplay() {
		return isMsmeRankingDisplay;
	}

	public void setIsMsmeRankingDisplay(Boolean isMsmeRankingDisplay) {
		this.isMsmeRankingDisplay = isMsmeRankingDisplay;
	}

	public Boolean getIsMsmeRankingMandatory() {
		return isMsmeRankingMandatory;
	}

	public void setIsMsmeRankingMandatory(Boolean isMsmeRankingMandatory) {
		this.isMsmeRankingMandatory = isMsmeRankingMandatory;
	}

	public Integer getMsmeRanking() {
		return msmeRanking;
	}

	public void setMsmeRanking(Integer msmeRanking) {
		this.msmeRanking = msmeRanking;
	}

	public Boolean getIsNoMsmeRanking() {
		return isNoMsmeRanking;
	}

	public void setIsNoMsmeRanking(Boolean isNoMsmeRanking) {
		this.isNoMsmeRanking = isNoMsmeRanking;
	}

	public Boolean getIsMaxAllowerBounceOneMonthDisplay() {
		return isMaxAllowerBounceOneMonthDisplay;
	}

	public void setIsMaxAllowerBounceOneMonthDisplay(Boolean isMaxAllowerBounceOneMonthDisplay) {
		this.isMaxAllowerBounceOneMonthDisplay = isMaxAllowerBounceOneMonthDisplay;
	}

	public Boolean getIsMaxAllowerBounceOneMonthMandatory() {
		return isMaxAllowerBounceOneMonthMandatory;
	}

	public void setIsMaxAllowerBounceOneMonthMandatory(Boolean isMaxAllowerBounceOneMonthMandatory) {
		this.isMaxAllowerBounceOneMonthMandatory = isMaxAllowerBounceOneMonthMandatory;
	}

	public Integer getMaxAllowerBounceOneMonth() {
		return maxAllowerBounceOneMonth;
	}

	public void setMaxAllowerBounceOneMonth(Integer maxAllowerBounceOneMonth) {
		this.maxAllowerBounceOneMonth = maxAllowerBounceOneMonth;
	}

	public Boolean getIsMaxAllowerBounceSixMonthDisplay() {
		return isMaxAllowerBounceSixMonthDisplay;
	}

	public void setIsMaxAllowerBounceSixMonthDisplay(Boolean isMaxAllowerBounceSixMonthDisplay) {
		this.isMaxAllowerBounceSixMonthDisplay = isMaxAllowerBounceSixMonthDisplay;
	}

	public Boolean getIsMaxAllowerBounceSixMonthMandatory() {
		return isMaxAllowerBounceSixMonthMandatory;
	}

	public void setIsMaxAllowerBounceSixMonthMandatory(Boolean isMaxAllowerBounceSixMonthMandatory) {
		this.isMaxAllowerBounceSixMonthMandatory = isMaxAllowerBounceSixMonthMandatory;
	}

	public Integer getMaxAllowerBounceSixMonth() {
		return maxAllowerBounceSixMonth;
	}

	public void setMaxAllowerBounceSixMonth(Integer maxAllowerBounceSixMonth) {
		this.maxAllowerBounceSixMonth = maxAllowerBounceSixMonth;
	}

	/**
	 * @return the salesGrowthYearType
	 */
	public Integer getSalesGrowthYearType() {
		return salesGrowthYearType;
	}

	/**
	 * @return the cashprofitGrowthYearType
	 */
	public Integer getCashprofitGrowthYearType() {
		return cashprofitGrowthYearType;
	}

	/**
	 * @param salesGrowthYearType the salesGrowthYearType to set
	 */
	public void setSalesGrowthYearType(Integer salesGrowthYearType) {
		this.salesGrowthYearType = salesGrowthYearType;
	}

	/**
	 * @param cashprofitGrowthYearType the cashprofitGrowthYearType to set
	 */
	public void setCashprofitGrowthYearType(Integer cashprofitGrowthYearType) {
		this.cashprofitGrowthYearType = cashprofitGrowthYearType;
	}

	public BigDecimal getMinInterestCoverageWithDepreciation() {
		return minInterestCoverageWithDepreciation;
	}

	public void setMinInterestCoverageWithDepreciation(BigDecimal minInterestCoverageWithDepreciation) {
		this.minInterestCoverageWithDepreciation = minInterestCoverageWithDepreciation;
	}

	public BigDecimal getMaxInterestCoverageWithDepreciation() {
		return maxInterestCoverageWithDepreciation;
	}

	public void setMaxInterestCoverageWithDepreciation(BigDecimal maxInterestCoverageWithDepreciation) {
		this.maxInterestCoverageWithDepreciation = maxInterestCoverageWithDepreciation;
	}

	public Boolean getIsInterestCoverageWithDepreciationDisplay() {
		return isInterestCoverageWithDepreciationDisplay;
	}

	public void setIsInterestCoverageWithDepreciationDisplay(Boolean isInterestCoverageWithDepreciationDisplay) {
		this.isInterestCoverageWithDepreciationDisplay = isInterestCoverageWithDepreciationDisplay;
	}

	public Boolean getIsInterestCoverageWithDepreciationMandatory() {
		return isInterestCoverageWithDepreciationMandatory;
	}

	public void setIsInterestCoverageWithDepreciationMandatory(Boolean isInterestCoverageWithDepreciationMandatory) {
		this.isInterestCoverageWithDepreciationMandatory = isInterestCoverageWithDepreciationMandatory;
	}

	public BigDecimal getIndividualBureauMaximumThreeMonthDPDs() {
		return individualBureauMaximumThreeMonthDPDs;
	}

	public void setIndividualBureauMaximumThreeMonthDPDs(BigDecimal individualBureauMaximumThreeMonthDPDs) {
		this.individualBureauMaximumThreeMonthDPDs = individualBureauMaximumThreeMonthDPDs;
	}

	public Boolean getIsIndividualBureauMaximumThreeMonthDPDsDisplay() {
		return isIndividualBureauMaximumThreeMonthDPDsDisplay;
	}

	public void setIsIndividualBureauMaximumThreeMonthDPDsDisplay(Boolean isIndividualBureauMaximumThreeMonthDPDsDisplay) {
		this.isIndividualBureauMaximumThreeMonthDPDsDisplay = isIndividualBureauMaximumThreeMonthDPDsDisplay;
	}

	public Boolean getIsIndividualBureauMaximumThreeMonthDPDsMandatory() {
		return isIndividualBureauMaximumThreeMonthDPDsMandatory;
	}

	public void setIsIndividualBureauMaximumThreeMonthDPDsMandatory(
			Boolean isIndividualBureauMaximumThreeMonthDPDsMandatory) {
		this.isIndividualBureauMaximumThreeMonthDPDsMandatory = isIndividualBureauMaximumThreeMonthDPDsMandatory;
	}

	public BigDecimal getIndividualBureauMaximumSixMonthDPDs() {
		return individualBureauMaximumSixMonthDPDs;
	}

	public void setIndividualBureauMaximumSixMonthDPDs(BigDecimal individualBureauMaximumSixMonthDPDs) {
		this.individualBureauMaximumSixMonthDPDs = individualBureauMaximumSixMonthDPDs;
	}

	public Boolean getIsIndividualBureauMaximumSixMonthDPDsDisplay() {
		return isIndividualBureauMaximumSixMonthDPDsDisplay;
	}

	public void setIsIndividualBureauMaximumSixMonthDPDsDisplay(Boolean isIndividualBureauMaximumSixMonthDPDsDisplay) {
		this.isIndividualBureauMaximumSixMonthDPDsDisplay = isIndividualBureauMaximumSixMonthDPDsDisplay;
	}

	public Boolean getIsIndividualBureauMaximumSixMonthDPDsMandatory() {
		return isIndividualBureauMaximumSixMonthDPDsMandatory;
	}

	public void setIsIndividualBureauMaximumSixMonthDPDsMandatory(Boolean isIndividualBureauMaximumSixMonthDPDsMandatory) {
		this.isIndividualBureauMaximumSixMonthDPDsMandatory = isIndividualBureauMaximumSixMonthDPDsMandatory;
	}

	public Integer getLoanArrangementId() {
		return loanArrangementId;
	}

	public void setLoanArrangementId(Integer loanArrangementId) {
		this.loanArrangementId = loanArrangementId;
	}

	public Boolean getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public Boolean getIsOptional() {
		return isOptional;
	}

	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}

	public List<Long> getManadatoryParameterIdList() {
		return manadatoryParameterIdList;
	}

	public void setManadatoryParameterIdList(List<Long> manadatoryParameterIdList) {
		this.manadatoryParameterIdList = manadatoryParameterIdList;
	}

	public List<Long> getOptioanalParameterIdList() {
		return optioanalParameterIdList;
	}

	public void setOptioanalParameterIdList(List<Long> optioanalParameterIdList) {
		this.optioanalParameterIdList = optioanalParameterIdList;
	}

	public List<ProductParameterMappingRequest> getMandatoryParameters() {
		return mandatoryParameters;
	}

	public void setMandatoryParameters(List<ProductParameterMappingRequest> mandatoryParameters) {
		this.mandatoryParameters = mandatoryParameters;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
}
