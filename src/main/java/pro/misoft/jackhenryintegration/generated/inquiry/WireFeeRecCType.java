
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
 * <p>Java class for WireFeeRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireFeeRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnType_Type"/&gt;
 *         &lt;element name="WireActType" type="{http://jackhenry.com/jxchange/TPG/2008}WireActType_Type"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysCode" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireFeeRec_CType", propOrder = {
    "wireTrnType",
    "wireActType",
    "trnCodeCode",
    "feeAmt",
    "anlysCode",
    "custom",
    "ver1",
    "any"
})
public class WireFeeRecCType {

    @XmlElement(name = "WireTrnType", required = true)
    protected WireTrnTypeType wireTrnType;
    @XmlElement(name = "WireActType", required = true)
    protected WireActTypeType wireActType;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "FeeAmt")
    protected FeeAmtType feeAmt;
    @XmlElement(name = "AnlysCode")
    protected AnlysCodeType anlysCode;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnTypeType }
     *     
     */
    public WireTrnTypeType getWireTrnType() {
        return wireTrnType;
    }

    /**
     * Sets the value of the wireTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnTypeType }
     *     
     */
    public void setWireTrnType(WireTrnTypeType value) {
        this.wireTrnType = value;
    }

    /**
     * Gets the value of the wireActType property.
     * 
     * @return
     *     possible object is
     *     {@link WireActTypeType }
     *     
     */
    public WireActTypeType getWireActType() {
        return wireActType;
    }

    /**
     * Sets the value of the wireActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireActTypeType }
     *     
     */
    public void setWireActType(WireActTypeType value) {
        this.wireActType = value;
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
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmtType }
     *     
     */
    public FeeAmtType getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmtType }
     *     
     */
    public void setFeeAmt(FeeAmtType value) {
        this.feeAmt = value;
    }

    /**
     * Gets the value of the anlysCode property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCodeType }
     *     
     */
    public AnlysCodeType getAnlysCode() {
        return anlysCode;
    }

    /**
     * Sets the value of the anlysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCodeType }
     *     
     */
    public void setAnlysCode(AnlysCodeType value) {
        this.anlysCode = value;
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
