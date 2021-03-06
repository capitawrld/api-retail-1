
package com.opl.retail.api.model.cibil_integration.truelink.ds.sch.report.truelink.v5;

import javax.xml.bind.annotation.*;


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
 *       &lt;/sequence>
 *       &lt;attribute name="miscInformation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "MiscPublicRecord")
public class MiscPublicRecord {

    @XmlAttribute(name = "miscInformation")
    protected String miscInformation;

    /**
     * Gets the value of the miscInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscInformation() {
        return miscInformation;
    }

    /**
     * Sets the value of the miscInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscInformation(String value) {
        this.miscInformation = value;
    }

}
