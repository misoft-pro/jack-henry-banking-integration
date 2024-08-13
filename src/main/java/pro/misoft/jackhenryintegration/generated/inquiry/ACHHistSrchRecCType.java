
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
 * <p>Java class for ACHHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHSvcClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHSvcClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompDiscrData" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompDiscrData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompEntryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompEntryDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompDtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompDtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDtSttl" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDtSttl_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHIndvId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHIndvName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHIndvDiscrData" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvDiscrData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTraceNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTraceNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHRetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHRetRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHTraceId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTraceId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ACHAddeType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAddeType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "ACHHistSrchRec_CType", propOrder = {
    "achSvcClass",
    "achCompName",
    "achCompDiscrData",
    "achCompId",
    "achStdEntryClass",
    "achCompEntryDesc",
    "achCompDtDesc",
    "achEffDt",
    "achDtSttl",
    "achTrnCode",
    "achTrnDesc",
    "achIndvId",
    "achIndvName",
    "achIndvDiscrData",
    "achTraceNum",
    "achRetRsnCode",
    "achRetRsnDesc",
    "ver1",
    "achTraceId",
    "ver2",
    "achAddeType",
    "ver3",
    "any"
})
public class ACHHistSrchRecCType {

    @XmlElement(name = "ACHSvcClass")
    protected ACHSvcClassType achSvcClass;
    @XmlElement(name = "ACHCompName")
    protected ACHCompNameType achCompName;
    @XmlElement(name = "ACHCompDiscrData")
    protected ACHCompDiscrDataType achCompDiscrData;
    @XmlElement(name = "ACHCompId")
    protected ACHCompIdType achCompId;
    @XmlElement(name = "ACHStdEntryClass")
    protected ACHStdEntryClassType achStdEntryClass;
    @XmlElement(name = "ACHCompEntryDesc")
    protected ACHCompEntryDescType achCompEntryDesc;
    @XmlElement(name = "ACHCompDtDesc")
    protected ACHCompDtDescType achCompDtDesc;
    @XmlElement(name = "ACHEffDt")
    protected EffDtType achEffDt;
    @XmlElement(name = "ACHDtSttl")
    protected ACHDtSttlType achDtSttl;
    @XmlElement(name = "ACHTrnCode")
    protected ACHTrnCodeType achTrnCode;
    @XmlElement(name = "ACHTrnDesc")
    protected ACHTrnDescType achTrnDesc;
    @XmlElement(name = "ACHIndvId")
    protected ACHIndvIdType achIndvId;
    @XmlElement(name = "ACHIndvName")
    protected ACHIndvNameType achIndvName;
    @XmlElement(name = "ACHIndvDiscrData")
    protected ACHIndvDiscrDataType achIndvDiscrData;
    @XmlElement(name = "ACHTraceNum")
    protected ACHTraceNumType achTraceNum;
    @XmlElement(name = "ACHRetRsnCode")
    protected ACHRetRsnCodeType achRetRsnCode;
    @XmlElement(name = "ACHRetRsnDesc")
    protected ACHRetRsnDescType achRetRsnDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ACHTraceId")
    protected ACHTraceIdType achTraceId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ACHAddeType")
    protected ACHAddeTypeType achAddeType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achSvcClass property.
     * 
     * @return
     *     possible object is
     *     {@link ACHSvcClassType }
     *     
     */
    public ACHSvcClassType getACHSvcClass() {
        return achSvcClass;
    }

    /**
     * Sets the value of the achSvcClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHSvcClassType }
     *     
     */
    public void setACHSvcClass(ACHSvcClassType value) {
        this.achSvcClass = value;
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
     * Gets the value of the achCompDiscrData property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompDiscrDataType }
     *     
     */
    public ACHCompDiscrDataType getACHCompDiscrData() {
        return achCompDiscrData;
    }

    /**
     * Sets the value of the achCompDiscrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompDiscrDataType }
     *     
     */
    public void setACHCompDiscrData(ACHCompDiscrDataType value) {
        this.achCompDiscrData = value;
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
     * Gets the value of the achCompEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompEntryDescType }
     *     
     */
    public ACHCompEntryDescType getACHCompEntryDesc() {
        return achCompEntryDesc;
    }

    /**
     * Sets the value of the achCompEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompEntryDescType }
     *     
     */
    public void setACHCompEntryDesc(ACHCompEntryDescType value) {
        this.achCompEntryDesc = value;
    }

    /**
     * Gets the value of the achCompDtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompDtDescType }
     *     
     */
    public ACHCompDtDescType getACHCompDtDesc() {
        return achCompDtDesc;
    }

    /**
     * Sets the value of the achCompDtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompDtDescType }
     *     
     */
    public void setACHCompDtDesc(ACHCompDtDescType value) {
        this.achCompDtDesc = value;
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
     * Gets the value of the achDtSttl property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDtSttlType }
     *     
     */
    public ACHDtSttlType getACHDtSttl() {
        return achDtSttl;
    }

    /**
     * Sets the value of the achDtSttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDtSttlType }
     *     
     */
    public void setACHDtSttl(ACHDtSttlType value) {
        this.achDtSttl = value;
    }

    /**
     * Gets the value of the achTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTrnCodeType }
     *     
     */
    public ACHTrnCodeType getACHTrnCode() {
        return achTrnCode;
    }

    /**
     * Sets the value of the achTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTrnCodeType }
     *     
     */
    public void setACHTrnCode(ACHTrnCodeType value) {
        this.achTrnCode = value;
    }

    /**
     * Gets the value of the achTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTrnDescType }
     *     
     */
    public ACHTrnDescType getACHTrnDesc() {
        return achTrnDesc;
    }

    /**
     * Sets the value of the achTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTrnDescType }
     *     
     */
    public void setACHTrnDesc(ACHTrnDescType value) {
        this.achTrnDesc = value;
    }

    /**
     * Gets the value of the achIndvId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIndvIdType }
     *     
     */
    public ACHIndvIdType getACHIndvId() {
        return achIndvId;
    }

    /**
     * Sets the value of the achIndvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIndvIdType }
     *     
     */
    public void setACHIndvId(ACHIndvIdType value) {
        this.achIndvId = value;
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
     * Gets the value of the achIndvDiscrData property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIndvDiscrDataType }
     *     
     */
    public ACHIndvDiscrDataType getACHIndvDiscrData() {
        return achIndvDiscrData;
    }

    /**
     * Sets the value of the achIndvDiscrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIndvDiscrDataType }
     *     
     */
    public void setACHIndvDiscrData(ACHIndvDiscrDataType value) {
        this.achIndvDiscrData = value;
    }

    /**
     * Gets the value of the achTraceNum property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTraceNumType }
     *     
     */
    public ACHTraceNumType getACHTraceNum() {
        return achTraceNum;
    }

    /**
     * Sets the value of the achTraceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTraceNumType }
     *     
     */
    public void setACHTraceNum(ACHTraceNumType value) {
        this.achTraceNum = value;
    }

    /**
     * Gets the value of the achRetRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRetRsnCodeType }
     *     
     */
    public ACHRetRsnCodeType getACHRetRsnCode() {
        return achRetRsnCode;
    }

    /**
     * Sets the value of the achRetRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRetRsnCodeType }
     *     
     */
    public void setACHRetRsnCode(ACHRetRsnCodeType value) {
        this.achRetRsnCode = value;
    }

    /**
     * Gets the value of the achRetRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRetRsnDescType }
     *     
     */
    public ACHRetRsnDescType getACHRetRsnDesc() {
        return achRetRsnDesc;
    }

    /**
     * Sets the value of the achRetRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRetRsnDescType }
     *     
     */
    public void setACHRetRsnDesc(ACHRetRsnDescType value) {
        this.achRetRsnDesc = value;
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
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
    }

    /**
     * Gets the value of the achAddeType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAddeTypeType }
     *     
     */
    public ACHAddeTypeType getACHAddeType() {
        return achAddeType;
    }

    /**
     * Sets the value of the achAddeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAddeTypeType }
     *     
     */
    public void setACHAddeType(ACHAddeTypeType value) {
        this.achAddeType = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
