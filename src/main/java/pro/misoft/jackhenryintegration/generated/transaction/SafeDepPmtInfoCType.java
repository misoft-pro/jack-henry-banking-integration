
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SafeDepPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeDepPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RentAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RentAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalesTaxDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalesTaxDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeDepPmtInfo_CType", propOrder = {
    "rentAmt",
    "salesTaxDueAmt",
    "lateChgDueAmt",
    "trnCodeCode",
    "nxtPayDt",
    "trnDescArray",
    "custom",
    "ver1",
    "any"
})
public class SafeDepPmtInfoCType {

    @XmlElement(name = "RentAmt")
    protected RentAmtType rentAmt;
    @XmlElement(name = "SalesTaxDueAmt")
    protected SalesTaxDueAmtType salesTaxDueAmt;
    @XmlElement(name = "LateChgDueAmt")
    protected LateChgDueAmtType lateChgDueAmt;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "NxtPayDt")
    protected NxtPayDtType nxtPayDt;
    @XmlElement(name = "TrnDescArray")
    protected RmkAType trnDescArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RentAmtType }
     *     
     */
    public RentAmtType getRentAmt() {
        return rentAmt;
    }

    /**
     * Sets the value of the rentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentAmtType }
     *     
     */
    public void setRentAmt(RentAmtType value) {
        this.rentAmt = value;
    }

    /**
     * Gets the value of the salesTaxDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxDueAmtType }
     *     
     */
    public SalesTaxDueAmtType getSalesTaxDueAmt() {
        return salesTaxDueAmt;
    }

    /**
     * Sets the value of the salesTaxDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxDueAmtType }
     *     
     */
    public void setSalesTaxDueAmt(SalesTaxDueAmtType value) {
        this.salesTaxDueAmt = value;
    }

    /**
     * Gets the value of the lateChgDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgDueAmtType }
     *     
     */
    public LateChgDueAmtType getLateChgDueAmt() {
        return lateChgDueAmt;
    }

    /**
     * Sets the value of the lateChgDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgDueAmtType }
     *     
     */
    public void setLateChgDueAmt(LateChgDueAmtType value) {
        this.lateChgDueAmt = value;
    }

    /**
     * Gets the value of the trnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getTrnCodeCode() {
        return trnCodeCode;
    }

    /**
     * Sets the value of the trnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setTrnCodeCode(TrnCodeCodeType value) {
        this.trnCodeCode = value;
    }

    /**
     * Gets the value of the nxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getNxtPayDt() {
        return nxtPayDt;
    }

    /**
     * Sets the value of the nxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setNxtPayDt(NxtPayDtType value) {
        this.nxtPayDt = value;
    }

    /**
     * Gets the value of the trnDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getTrnDescArray() {
        return trnDescArray;
    }

    /**
     * Sets the value of the trnDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setTrnDescArray(RmkAType value) {
        this.trnDescArray = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
    }

    /**
     * Gets the value of the ver1 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver1CType }
     *     
     */
    public Ver1CType getVer1() {
        return ver1;
    }

    /**
     * Sets the value of the ver1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver1CType }
     *     
     */
    public void setVer1(Ver1CType value) {
        this.ver1 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
