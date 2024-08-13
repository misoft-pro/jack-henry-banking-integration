
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
 * <p>Java class for PromoXferSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromoXferSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferRecText" type="{http://jackhenry.com/jxchange/TPG/2008}XferRecText_Type" minOccurs="0"/&gt;
 *         &lt;element name="PromoCode" type="{http://jackhenry.com/jxchange/TPG/2008}PromoCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdFrom_CType" minOccurs="0"/&gt;
 *         &lt;element name="CrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdTo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFirstDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFirstDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFreq" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="ForcePostType" type="{http://jackhenry.com/jxchange/TPG/2008}ForcePostType_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferLastDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferLastDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PromoXferSrchRec_CType", propOrder = {
    "xferRecText",
    "promoCode",
    "drAcctId",
    "crAcctId",
    "amt",
    "xferFirstDt",
    "xferExpDt",
    "xferFreq",
    "xferFreqUnits",
    "forcePostType",
    "xferLastDt",
    "custom",
    "ver1",
    "any"
})
public class PromoXferSrchRecCType {

    @XmlElement(name = "XferRecText")
    protected XferRecTextType xferRecText;
    @XmlElement(name = "PromoCode")
    protected PromoCodeType promoCode;
    @XmlElement(name = "DrAcctId")
    protected AcctIdFromCType drAcctId;
    @XmlElement(name = "CrAcctId")
    protected AcctIdToCType crAcctId;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "XferFirstDt")
    protected FutXferFirstDtType xferFirstDt;
    @XmlElement(name = "XferExpDt")
    protected FutXferExpDtType xferExpDt;
    @XmlElement(name = "XferFreq")
    protected FutXferFreqType xferFreq;
    @XmlElement(name = "XferFreqUnits")
    protected FutXferFreqUnitsType xferFreqUnits;
    @XmlElement(name = "ForcePostType")
    protected ForcePostTypeType forcePostType;
    @XmlElement(name = "XferLastDt")
    protected FutXferLastDtType xferLastDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xferRecText property.
     * 
     * @return
     *     possible object is
     *     {@link XferRecTextType }
     *     
     */
    public XferRecTextType getXferRecText() {
        return xferRecText;
    }

    /**
     * Sets the value of the xferRecText property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferRecTextType }
     *     
     */
    public void setXferRecText(XferRecTextType value) {
        this.xferRecText = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link PromoCodeType }
     *     
     */
    public PromoCodeType getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoCodeType }
     *     
     */
    public void setPromoCode(PromoCodeType value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the drAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdFromCType }
     *     
     */
    public AcctIdFromCType getDrAcctId() {
        return drAcctId;
    }

    /**
     * Sets the value of the drAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdFromCType }
     *     
     */
    public void setDrAcctId(AcctIdFromCType value) {
        this.drAcctId = value;
    }

    /**
     * Gets the value of the crAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdToCType }
     *     
     */
    public AcctIdToCType getCrAcctId() {
        return crAcctId;
    }

    /**
     * Sets the value of the crAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdToCType }
     *     
     */
    public void setCrAcctId(AcctIdToCType value) {
        this.crAcctId = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the xferFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFirstDtType }
     *     
     */
    public FutXferFirstDtType getXferFirstDt() {
        return xferFirstDt;
    }

    /**
     * Sets the value of the xferFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFirstDtType }
     *     
     */
    public void setXferFirstDt(FutXferFirstDtType value) {
        this.xferFirstDt = value;
    }

    /**
     * Gets the value of the xferExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferExpDtType }
     *     
     */
    public FutXferExpDtType getXferExpDt() {
        return xferExpDt;
    }

    /**
     * Sets the value of the xferExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferExpDtType }
     *     
     */
    public void setXferExpDt(FutXferExpDtType value) {
        this.xferExpDt = value;
    }

    /**
     * Gets the value of the xferFreq property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqType }
     *     
     */
    public FutXferFreqType getXferFreq() {
        return xferFreq;
    }

    /**
     * Sets the value of the xferFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqType }
     *     
     */
    public void setXferFreq(FutXferFreqType value) {
        this.xferFreq = value;
    }

    /**
     * Gets the value of the xferFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public FutXferFreqUnitsType getXferFreqUnits() {
        return xferFreqUnits;
    }

    /**
     * Sets the value of the xferFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public void setXferFreqUnits(FutXferFreqUnitsType value) {
        this.xferFreqUnits = value;
    }

    /**
     * Gets the value of the forcePostType property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePostTypeType }
     *     
     */
    public ForcePostTypeType getForcePostType() {
        return forcePostType;
    }

    /**
     * Sets the value of the forcePostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePostTypeType }
     *     
     */
    public void setForcePostType(ForcePostTypeType value) {
        this.forcePostType = value;
    }

    /**
     * Gets the value of the xferLastDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferLastDtType }
     *     
     */
    public FutXferLastDtType getXferLastDt() {
        return xferLastDt;
    }

    /**
     * Sets the value of the xferLastDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferLastDtType }
     *     
     */
    public void setXferLastDt(FutXferLastDtType value) {
        this.xferLastDt = value;
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
