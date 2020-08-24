//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.30 at 11:51:55 AM IST 
//


package com.opl.retail.api.model.cibil.highmark.commercial.response.issue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LINKED-ACCOUNTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LINKED-ACCOUNTS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT-DETAILS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="ACCT-NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CREDIT-GUARANTOR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ACCT-TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DATE-REPORTED" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OWNERSHIP-IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ACCOUNT-STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DISBURSED-AMT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DISBURSED-DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LAST-PAYMENT-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CLOSED-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTALLMENT-AMT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OVERDUE-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WRITE-OFF-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CURRENT-BAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CREDIT-LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCOUNT-REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SECURITY-STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ORIGINAL-TERM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TERM-TO-MATURITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACCT-IN-DISPUTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SETTLEMENT-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRINCIPAL-WRITE-OFF-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="REPAYMENT-TENURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INTEREST-RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SUIT-FILED_WILFUL-DEFAULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WRITTEN-OFF_SETTLED-STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CASH-LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ACTUAL-PAYMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SECURITY-DETAILS" type="{}SECURITY-DETAILS" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LINKED-ACCOUNTS", propOrder = {
    "accountdetails"
})
public class LINKEDACCOUNTS {

    @XmlElement(name = "ACCOUNT-DETAILS")
    protected List<ACCOUNTDETAILS> accountdetails;

    /**
     * Gets the value of the accountdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACCOUNTDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACCOUNTDETAILS }
     * 
     * 
     */
    public List<ACCOUNTDETAILS> getACCOUNTDETAILS() {
        if (accountdetails == null) {
            accountdetails = new ArrayList<ACCOUNTDETAILS>();
        }
        return this.accountdetails;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="ACCT-NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CREDIT-GUARANTOR" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ACCT-TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DATE-REPORTED" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OWNERSHIP-IND" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ACCOUNT-STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DISBURSED-AMT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DISBURSED-DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LAST-PAYMENT-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CLOSED-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTALLMENT-AMT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OVERDUE-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WRITE-OFF-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CURRENT-BAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CREDIT-LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCOUNT-REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SECURITY-STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FREQUENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ORIGINAL-TERM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TERM-TO-MATURITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACCT-IN-DISPUTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SETTLEMENT-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRINCIPAL-WRITE-OFF-AMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="REPAYMENT-TENURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INTEREST-RATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SUIT-FILED_WILFUL-DEFAULT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WRITTEN-OFF_SETTLED-STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CASH-LIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ACTUAL-PAYMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SECURITY-DETAILS" type="{}SECURITY-DETAILS" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ACCOUNTDETAILS {

        @XmlElement(name = "ACCT-NUMBER", required = true)
        protected String acctnumber;
        @XmlElement(name = "CREDIT-GUARANTOR", required = true)
        protected String creditguarantor;
        @XmlElement(name = "ACCT-TYPE", required = true)
        protected String accttype;
        @XmlElement(name = "DATE-REPORTED", required = true)
        protected String datereported;
        @XmlElement(name = "OWNERSHIP-IND", required = true)
        protected String ownershipind;
        @XmlElement(name = "ACCOUNT-STATUS", required = true)
        protected String accountstatus;
        @XmlElement(name = "DISBURSED-AMT", required = true)
        protected String disbursedamt;
        @XmlElement(name = "DISBURSED-DATE", required = true)
        protected String disburseddate;
        @XmlElement(name = "LAST-PAYMENT-DATE")
        protected String lastpaymentdate;
        @XmlElement(name = "CLOSED-DATE")
        protected String closeddate;
        @XmlElement(name = "INSTALLMENT-AMT", required = true)
        protected String installmentamt;
        @XmlElement(name = "OVERDUE-AMT")
        protected String overdueamt;
        @XmlElement(name = "WRITE-OFF-AMT")
        protected String writeoffamt;
        @XmlElement(name = "CURRENT-BAL", required = true)
        protected String currentbal;
        @XmlElement(name = "CREDIT-LIMIT")
        protected String creditlimit;
        @XmlElement(name = "ACCOUNT-REMARKS")
        protected String accountremarks;
        @XmlElement(name = "SECURITY-STATUS")
        protected String securitystatus;
        @XmlElement(name = "FREQUENCY")
        protected String frequency;
        @XmlElement(name = "ORIGINAL-TERM")
        protected String originalterm;
        @XmlElement(name = "TERM-TO-MATURITY")
        protected String termtomaturity;
        @XmlElement(name = "ACCT-IN-DISPUTE")
        protected String acctindispute;
        @XmlElement(name = "SETTLEMENT-AMT")
        protected String settlementamt;
        @XmlElement(name = "PRINCIPAL-WRITE-OFF-AMT")
        protected String principalwriteoffamt;
        @XmlElement(name = "REPAYMENT-TENURE")
        protected String repaymenttenure;
        @XmlElement(name = "INTEREST-RATE")
        protected String interestrate;
        @XmlElement(name = "SUIT-FILED_WILFUL-DEFAULT")
        protected String suitfiledwilfuldefault;
        @XmlElement(name = "WRITTEN-OFF_SETTLED-STATUS")
        protected String writtenoffsettledstatus;
        @XmlElement(name = "CASH-LIMIT")
        protected String cashlimit;
        @XmlElement(name = "ACTUAL-PAYMENT")
        protected String actualpayment;
        @XmlElement(name = "SECURITY-DETAILS")
        protected SECURITYDETAILS securitydetails;

        /**
         * Gets the value of the acctnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTNUMBER() {
            return acctnumber;
        }

        /**
         * Sets the value of the acctnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTNUMBER(String value) {
            this.acctnumber = value;
        }

        /**
         * Gets the value of the creditguarantor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREDITGUARANTOR() {
            return creditguarantor;
        }

        /**
         * Sets the value of the creditguarantor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREDITGUARANTOR(String value) {
            this.creditguarantor = value;
        }

        /**
         * Gets the value of the accttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTTYPE() {
            return accttype;
        }

        /**
         * Sets the value of the accttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTTYPE(String value) {
            this.accttype = value;
        }

        /**
         * Gets the value of the datereported property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDATEREPORTED() {
            return datereported;
        }

        /**
         * Sets the value of the datereported property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDATEREPORTED(String value) {
            this.datereported = value;
        }

        /**
         * Gets the value of the ownershipind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOWNERSHIPIND() {
            return ownershipind;
        }

        /**
         * Sets the value of the ownershipind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOWNERSHIPIND(String value) {
            this.ownershipind = value;
        }

        /**
         * Gets the value of the accountstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTSTATUS() {
            return accountstatus;
        }

        /**
         * Sets the value of the accountstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTSTATUS(String value) {
            this.accountstatus = value;
        }

        /**
         * Gets the value of the disbursedamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISBURSEDAMT() {
            return disbursedamt;
        }

        /**
         * Sets the value of the disbursedamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISBURSEDAMT(String value) {
            this.disbursedamt = value;
        }

        /**
         * Gets the value of the disburseddate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISBURSEDDATE() {
            return disburseddate;
        }

        /**
         * Sets the value of the disburseddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISBURSEDDATE(String value) {
            this.disburseddate = value;
        }

        /**
         * Gets the value of the lastpaymentdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTPAYMENTDATE() {
            return lastpaymentdate;
        }

        /**
         * Sets the value of the lastpaymentdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTPAYMENTDATE(String value) {
            this.lastpaymentdate = value;
        }

        /**
         * Gets the value of the closeddate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLOSEDDATE() {
            return closeddate;
        }

        /**
         * Sets the value of the closeddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLOSEDDATE(String value) {
            this.closeddate = value;
        }

        /**
         * Gets the value of the installmentamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTALLMENTAMT() {
            return installmentamt;
        }

        /**
         * Sets the value of the installmentamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTALLMENTAMT(String value) {
            this.installmentamt = value;
        }

        /**
         * Gets the value of the overdueamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVERDUEAMT() {
            return overdueamt;
        }

        /**
         * Sets the value of the overdueamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVERDUEAMT(String value) {
            this.overdueamt = value;
        }

        /**
         * Gets the value of the writeoffamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWRITEOFFAMT() {
            return writeoffamt;
        }

        /**
         * Sets the value of the writeoffamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWRITEOFFAMT(String value) {
            this.writeoffamt = value;
        }

        /**
         * Gets the value of the currentbal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCURRENTBAL() {
            return currentbal;
        }

        /**
         * Sets the value of the currentbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCURRENTBAL(String value) {
            this.currentbal = value;
        }

        /**
         * Gets the value of the creditlimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCREDITLIMIT() {
            return creditlimit;
        }

        /**
         * Sets the value of the creditlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCREDITLIMIT(String value) {
            this.creditlimit = value;
        }

        /**
         * Gets the value of the accountremarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTREMARKS() {
            return accountremarks;
        }

        /**
         * Sets the value of the accountremarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTREMARKS(String value) {
            this.accountremarks = value;
        }

        /**
         * Gets the value of the securitystatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSECURITYSTATUS() {
            return securitystatus;
        }

        /**
         * Sets the value of the securitystatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSECURITYSTATUS(String value) {
            this.securitystatus = value;
        }

        /**
         * Gets the value of the frequency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFREQUENCY() {
            return frequency;
        }

        /**
         * Sets the value of the frequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFREQUENCY(String value) {
            this.frequency = value;
        }

        /**
         * Gets the value of the originalterm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORIGINALTERM() {
            return originalterm;
        }

        /**
         * Sets the value of the originalterm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORIGINALTERM(String value) {
            this.originalterm = value;
        }

        /**
         * Gets the value of the termtomaturity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTERMTOMATURITY() {
            return termtomaturity;
        }

        /**
         * Sets the value of the termtomaturity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTERMTOMATURITY(String value) {
            this.termtomaturity = value;
        }

        /**
         * Gets the value of the acctindispute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTINDISPUTE() {
            return acctindispute;
        }

        /**
         * Sets the value of the acctindispute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTINDISPUTE(String value) {
            this.acctindispute = value;
        }

        /**
         * Gets the value of the settlementamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETTLEMENTAMT() {
            return settlementamt;
        }

        /**
         * Sets the value of the settlementamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETTLEMENTAMT(String value) {
            this.settlementamt = value;
        }

        /**
         * Gets the value of the principalwriteoffamt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRINCIPALWRITEOFFAMT() {
            return principalwriteoffamt;
        }

        /**
         * Sets the value of the principalwriteoffamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRINCIPALWRITEOFFAMT(String value) {
            this.principalwriteoffamt = value;
        }

        /**
         * Gets the value of the repaymenttenure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREPAYMENTTENURE() {
            return repaymenttenure;
        }

        /**
         * Sets the value of the repaymenttenure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREPAYMENTTENURE(String value) {
            this.repaymenttenure = value;
        }

        /**
         * Gets the value of the interestrate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERESTRATE() {
            return interestrate;
        }

        /**
         * Sets the value of the interestrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERESTRATE(String value) {
            this.interestrate = value;
        }

        /**
         * Gets the value of the suitfiledwilfuldefault property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUITFILEDWILFULDEFAULT() {
            return suitfiledwilfuldefault;
        }

        /**
         * Sets the value of the suitfiledwilfuldefault property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUITFILEDWILFULDEFAULT(String value) {
            this.suitfiledwilfuldefault = value;
        }

        /**
         * Gets the value of the writtenoffsettledstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWRITTENOFFSETTLEDSTATUS() {
            return writtenoffsettledstatus;
        }

        /**
         * Sets the value of the writtenoffsettledstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWRITTENOFFSETTLEDSTATUS(String value) {
            this.writtenoffsettledstatus = value;
        }

        /**
         * Gets the value of the cashlimit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCASHLIMIT() {
            return cashlimit;
        }

        /**
         * Sets the value of the cashlimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCASHLIMIT(String value) {
            this.cashlimit = value;
        }

        /**
         * Gets the value of the actualpayment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACTUALPAYMENT() {
            return actualpayment;
        }

        /**
         * Sets the value of the actualpayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACTUALPAYMENT(String value) {
            this.actualpayment = value;
        }

        /**
         * Gets the value of the securitydetails property.
         * 
         * @return
         *     possible object is
         *     {@link SECURITYDETAILS }
         *     
         */
        public SECURITYDETAILS getSECURITYDETAILS() {
            return securitydetails;
        }

        /**
         * Sets the value of the securitydetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link SECURITYDETAILS }
         *     
         */
        public void setSECURITYDETAILS(SECURITYDETAILS value) {
            this.securitydetails = value;
        }

    }

}
