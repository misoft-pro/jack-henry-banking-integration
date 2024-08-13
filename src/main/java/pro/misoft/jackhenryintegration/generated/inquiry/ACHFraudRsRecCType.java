
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
 * <p>Java class for ACHFraudRsRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHFraudRsRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHBatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTraceId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTraceId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHIndvName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvName_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSusRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ACHFraudRsRec_CType", propOrder = {
    "achBatchNum",
    "achCompName",
    "achCompId",
    "achEffDt",
    "achStdEntryClass",
    "achTraceId",
    "achIndvName",
    "amt",
    "fraudSusRmkArray",
    "custom",
    "ver1",
    "any"
})
public class ACHFraudRsRecCType {

    @XmlElement(name = "ACHBatchNum")
    protected BatchNumType achBatchNum;
    @XmlElement(name = "ACHCompName")
    protected ACHCompNameType achCompName;
    @XmlElement(name = "ACHCompId")
    protected ACHCompIdType achCompId;
    @XmlElement(name = "ACHEffDt")
    protected EffDtType achEffDt;
    @XmlElement(name = "ACHStdEntryClass")
    protected ACHStdEntryClassType achStdEntryClass;
    @XmlElement(name = "ACHTraceId")
    protected ACHTraceIdType achTraceId;
    @XmlElement(name = "ACHIndvName")
    protected ACHIndvNameType achIndvName;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "FraudSusRmkArray")
    protected RmkAType fraudSusRmkArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achBatchNum property.
     * 
     * @return
     *     possible object is
     *     {@link BatchNumType }
     *     
     */
    public BatchNumType getACHBatchNum() {
        return achBatchNum;
    }

    /**
     * Sets the value of the achBatchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchNumType }
     *     
     */
    public void setACHBatchNum(BatchNumType value) {
        this.achBatchNum = value;
    }

    /**
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompNameType }
     *     
     */
    public ACHCompNameType getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompNameType }
     *     
     */
    public void setACHCompName(ACHCompNameType value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the achCompId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompIdType }
     *     
     */
    public ACHCompIdType getACHCompId() {
        return achCompId;
    }

    /**
     * Sets the value of the achCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompIdType }
     *     
     */
    public void setACHCompId(ACHCompIdType value) {
        this.achCompId = value;
    }

    /**
     * Gets the value of the achEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getACHEffDt() {
        return achEffDt;
    }

    /**
     * Sets the value of the achEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setACHEffDt(EffDtType value) {
        this.achEffDt = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public ACHStdEntryClassType getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public void setACHStdEntryClass(ACHStdEntryClassType value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the achTraceId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTraceIdType }
     *     
     */
    public ACHTraceIdType getACHTraceId() {
        return achTraceId;
    }

    /**
     * Sets the value of the achTraceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTraceIdType }
     *     
     */
    public void setACHTraceId(ACHTraceIdType value) {
        this.achTraceId = value;
    }

    /**
     * Gets the value of the achIndvName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIndvNameType }
     *     
     */
    public ACHIndvNameType getACHIndvName() {
        return achIndvName;
    }

    /**
     * Sets the value of the achIndvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIndvNameType }
     *     
     */
    public void setACHIndvName(ACHIndvNameType value) {
        this.achIndvName = value;
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
     * Gets the value of the fraudSusRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getFraudSusRmkArray() {
        return fraudSusRmkArray;
    }

    /**
     * Sets the value of the fraudSusRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setFraudSusRmkArray(RmkAType value) {
        this.fraudSusRmkArray = value;
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
