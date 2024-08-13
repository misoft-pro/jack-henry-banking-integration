
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TrancheInqLOCInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheInqLOCInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCCustId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCurBal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrancheInqLOCInfo_CType", propOrder = {
    "locCustId",
    "locAcctId",
    "locExpDt",
    "locAmt",
    "locAvlBal",
    "locCurBal",
    "custom",
    "ver1",
    "any"
})
public class TrancheInqLOCInfoCType {

    @XmlElement(name = "LOCCustId")
    protected LOCCustIdType locCustId;
    @XmlElement(name = "LOCAcctId")
    protected LOCAcctIdType locAcctId;
    @XmlElement(name = "LOCExpDt")
    protected LOCExpDtType locExpDt;
    @XmlElement(name = "LOCAmt")
    protected LOCAmtType locAmt;
    @XmlElement(name = "LOCAvlBal")
    protected LOCAvlBalType locAvlBal;
    @XmlElement(name = "LOCCurBal")
    protected LOCCurBalType locCurBal;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the locCustId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCustIdType }
     *     
     */
    public LOCCustIdType getLOCCustId() {
        return locCustId;
    }

    /**
     * Sets the value of the locCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCustIdType }
     *     
     */
    public void setLOCCustId(LOCCustIdType value) {
        this.locCustId = value;
    }

    /**
     * Gets the value of the locAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAcctIdType }
     *     
     */
    public LOCAcctIdType getLOCAcctId() {
        return locAcctId;
    }

    /**
     * Sets the value of the locAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAcctIdType }
     *     
     */
    public void setLOCAcctId(LOCAcctIdType value) {
        this.locAcctId = value;
    }

    /**
     * Gets the value of the locExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCExpDtType }
     *     
     */
    public LOCExpDtType getLOCExpDt() {
        return locExpDt;
    }

    /**
     * Sets the value of the locExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCExpDtType }
     *     
     */
    public void setLOCExpDt(LOCExpDtType value) {
        this.locExpDt = value;
    }

    /**
     * Gets the value of the locAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAmtType }
     *     
     */
    public LOCAmtType getLOCAmt() {
        return locAmt;
    }

    /**
     * Sets the value of the locAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAmtType }
     *     
     */
    public void setLOCAmt(LOCAmtType value) {
        this.locAmt = value;
    }

    /**
     * Gets the value of the locAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlBalType }
     *     
     */
    public LOCAvlBalType getLOCAvlBal() {
        return locAvlBal;
    }

    /**
     * Sets the value of the locAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlBalType }
     *     
     */
    public void setLOCAvlBal(LOCAvlBalType value) {
        this.locAvlBal = value;
    }

    /**
     * Gets the value of the locCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCurBalType }
     *     
     */
    public LOCCurBalType getLOCCurBal() {
        return locCurBal;
    }

    /**
     * Sets the value of the locCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCurBalType }
     *     
     */
    public void setLOCCurBal(LOCCurBalType value) {
        this.locCurBal = value;
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
     * {@link Object }
     * {@link Element }
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
