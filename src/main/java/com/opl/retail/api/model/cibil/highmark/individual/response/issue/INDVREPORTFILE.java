//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 12:06:19 PM IST 
//


package com.opl.retail.api.model.cibil.highmark.individual.response.issue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}INQUIRY-STATUS" minOccurs="0"/>
 *         &lt;element ref="{}INDV-REPORTS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inquirystatus",
    "indvreports"
})
@XmlRootElement(name = "INDV-REPORT-FILE")
public class INDVREPORTFILE {

    @XmlElement(name = "INQUIRY-STATUS")
    protected INQUIRYSTATUS inquirystatus;
    @XmlElement(name = "INDV-REPORTS")
    protected INDVREPORTS indvreports;

    /**
     * Gets the value of the inquirystatus property.
     * 
     * @return
     *     possible object is
     *     {@link INQUIRYSTATUS }
     *     
     */
    public INQUIRYSTATUS getINQUIRYSTATUS() {
        return inquirystatus;
    }

    /**
     * Sets the value of the inquirystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link INQUIRYSTATUS }
     *     
     */
    public void setINQUIRYSTATUS(INQUIRYSTATUS value) {
        this.inquirystatus = value;
    }

    /**
     * Gets the value of the indvreports property.
     * 
     * @return
     *     possible object is
     *     {@link INDVREPORTS }
     *     
     */
    public INDVREPORTS getINDVREPORTS() {
        return indvreports;
    }

    /**
     * Sets the value of the indvreports property.
     * 
     * @param value
     *     allowed object is
     *     {@link INDVREPORTS }
     *     
     */
    public void setINDVREPORTS(INDVREPORTS value) {
        this.indvreports = value;
    }

}
