
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
 * <p>Java class for TrnFraudRuleSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnFraudRuleSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnFraudRuleId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudRuleId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudCatType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudCatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudRuleStatType" type="{http://jackhenry.com/jxchange/TPG/2008}FraudRuleStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudRuleCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudRuleCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudRuleDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudRuleDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrnFraudRuleSrchRec_CType", propOrder = {
    "trnFraudRuleId",
    "trnFraudCatType",
    "fraudRuleStatType",
    "trnFraudRuleCode",
    "trnFraudRuleDesc",
    "custom",
    "ver1",
    "any"
})
public class TrnFraudRuleSrchRecCType {

    @XmlElement(name = "TrnFraudRuleId")
    protected TrnFraudRuleIdType trnFraudRuleId;
    @XmlElement(name = "TrnFraudCatType")
    protected TrnFraudCatTypeType trnFraudCatType;
    @XmlElement(name = "FraudRuleStatType")
    protected FraudRuleStatTypeType fraudRuleStatType;
    @XmlElement(name = "TrnFraudRuleCode")
    protected TrnFraudRuleCodeType trnFraudRuleCode;
    @XmlElement(name = "TrnFraudRuleDesc")
    protected TrnFraudRuleDescType trnFraudRuleDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trnFraudRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudRuleIdType }
     *     
     */
    public TrnFraudRuleIdType getTrnFraudRuleId() {
        return trnFraudRuleId;
    }

    /**
     * Sets the value of the trnFraudRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudRuleIdType }
     *     
     */
    public void setTrnFraudRuleId(TrnFraudRuleIdType value) {
        this.trnFraudRuleId = value;
    }

    /**
     * Gets the value of the trnFraudCatType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudCatTypeType }
     *     
     */
    public TrnFraudCatTypeType getTrnFraudCatType() {
        return trnFraudCatType;
    }

    /**
     * Sets the value of the trnFraudCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudCatTypeType }
     *     
     */
    public void setTrnFraudCatType(TrnFraudCatTypeType value) {
        this.trnFraudCatType = value;
    }

    /**
     * Gets the value of the fraudRuleStatType property.
     * 
     * @return
     *     possible object is
     *     {@link FraudRuleStatTypeType }
     *     
     */
    public FraudRuleStatTypeType getFraudRuleStatType() {
        return fraudRuleStatType;
    }

    /**
     * Sets the value of the fraudRuleStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudRuleStatTypeType }
     *     
     */
    public void setFraudRuleStatType(FraudRuleStatTypeType value) {
        this.fraudRuleStatType = value;
    }

    /**
     * Gets the value of the trnFraudRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudRuleCodeType }
     *     
     */
    public TrnFraudRuleCodeType getTrnFraudRuleCode() {
        return trnFraudRuleCode;
    }

    /**
     * Sets the value of the trnFraudRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudRuleCodeType }
     *     
     */
    public void setTrnFraudRuleCode(TrnFraudRuleCodeType value) {
        this.trnFraudRuleCode = value;
    }

    /**
     * Gets the value of the trnFraudRuleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudRuleDescType }
     *     
     */
    public TrnFraudRuleDescType getTrnFraudRuleDesc() {
        return trnFraudRuleDesc;
    }

    /**
     * Sets the value of the trnFraudRuleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudRuleDescType }
     *     
     */
    public void setTrnFraudRuleDesc(TrnFraudRuleDescType value) {
        this.trnFraudRuleDesc = value;
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
