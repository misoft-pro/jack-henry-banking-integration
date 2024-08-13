
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RateSchedRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateSchedRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NewRateEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}NewRateEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateType" type="{http://jackhenry.com/jxchange/TPG/2008}RateType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BaseRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewRate" type="{http://jackhenry.com/jxchange/TPG/2008}NewRate_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RateSchedRec_CType", propOrder = {
    "newRateEffDt",
    "rateType",
    "baseRate",
    "rateVar",
    "rateVarCode",
    "newRate",
    "custom",
    "ver1",
    "any"
})
public class RateSchedRecCType {

    @XmlElement(name = "NewRateEffDt")
    protected NewRateEffDtType newRateEffDt;
    @XmlElement(name = "RateType")
    protected RateTypeType rateType;
    @XmlElement(name = "BaseRate")
    protected IntRateType baseRate;
    @XmlElement(name = "RateVar")
    protected RateVarType rateVar;
    @XmlElement(name = "RateVarCode")
    protected RateVarCodeType rateVarCode;
    @XmlElement(name = "NewRate")
    protected NewRateType newRate;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the newRateEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link NewRateEffDtType }
     *     
     */
    public NewRateEffDtType getNewRateEffDt() {
        return newRateEffDt;
    }

    /**
     * Sets the value of the newRateEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRateEffDtType }
     *     
     */
    public void setNewRateEffDt(NewRateEffDtType value) {
        this.newRateEffDt = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeType }
     *     
     */
    public RateTypeType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeType }
     *     
     */
    public void setRateType(RateTypeType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setBaseRate(IntRateType value) {
        this.baseRate = value;
    }

    /**
     * Gets the value of the rateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getRateVar() {
        return rateVar;
    }

    /**
     * Sets the value of the rateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setRateVar(RateVarType value) {
        this.rateVar = value;
    }

    /**
     * Gets the value of the rateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getRateVarCode() {
        return rateVarCode;
    }

    /**
     * Sets the value of the rateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setRateVarCode(RateVarCodeType value) {
        this.rateVarCode = value;
    }

    /**
     * Gets the value of the newRate property.
     * 
     * @return
     *     possible object is
     *     {@link NewRateType }
     *     
     */
    public NewRateType getNewRate() {
        return newRate;
    }

    /**
     * Sets the value of the newRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRateType }
     *     
     */
    public void setNewRate(NewRateType value) {
        this.newRate = value;
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
