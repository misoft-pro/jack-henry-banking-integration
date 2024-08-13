
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TrnFraudRuleSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnFraudRuleSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="TrnFraudCatType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudCatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudRuleStatType" type="{http://jackhenry.com/jxchange/TPG/2008}FraudRuleStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudRuleSrchArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudRuleSrchArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "TrnFraudRuleSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "trnFraudCatType",
    "fraudRuleStatType",
    "trnFraudRuleSrchArray",
    "custom",
    "ver1",
    "any"
})
public class TrnFraudRuleSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "TrnFraudCatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnFraudCatTypeType> trnFraudCatType;
    @XmlElementRef(name = "FraudRuleStatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudRuleStatTypeType> fraudRuleStatType;
    @XmlElementRef(name = "TrnFraudRuleSrchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnFraudRuleSrchArrayAType> trnFraudRuleSrchArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public SrchMsgRsHdrCType getSrchMsgRsHdr() {
        return srchMsgRsHdr;
    }

    /**
     * Sets the value of the srchMsgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public void setSrchMsgRsHdr(SrchMsgRsHdrCType value) {
        this.srchMsgRsHdr = value;
    }

    /**
     * Gets the value of the trnFraudCatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudCatTypeType }{@code >}
     *     
     */
    public JAXBElement<TrnFraudCatTypeType> getTrnFraudCatType() {
        return trnFraudCatType;
    }

    /**
     * Sets the value of the trnFraudCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudCatTypeType }{@code >}
     *     
     */
    public void setTrnFraudCatType(JAXBElement<TrnFraudCatTypeType> value) {
        this.trnFraudCatType = value;
    }

    /**
     * Gets the value of the fraudRuleStatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FraudRuleStatTypeType }{@code >}
     *     
     */
    public JAXBElement<FraudRuleStatTypeType> getFraudRuleStatType() {
        return fraudRuleStatType;
    }

    /**
     * Sets the value of the fraudRuleStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FraudRuleStatTypeType }{@code >}
     *     
     */
    public void setFraudRuleStatType(JAXBElement<FraudRuleStatTypeType> value) {
        this.fraudRuleStatType = value;
    }

    /**
     * Gets the value of the trnFraudRuleSrchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudRuleSrchArrayAType }{@code >}
     *     
     */
    public JAXBElement<TrnFraudRuleSrchArrayAType> getTrnFraudRuleSrchArray() {
        return trnFraudRuleSrchArray;
    }

    /**
     * Sets the value of the trnFraudRuleSrchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudRuleSrchArrayAType }{@code >}
     *     
     */
    public void setTrnFraudRuleSrchArray(JAXBElement<TrnFraudRuleSrchArrayAType> value) {
        this.trnFraudRuleSrchArray = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
