
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
 * <p>Java class for ACHPndSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHPndSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="ACHTrnStat" type="{http://jackhenry.com/jxchange/TPG/2008}TrnStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompDiscrData" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompDiscrData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompEntryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompEntryDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHIndvId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHAltCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAltCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHAddendaArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAddendaArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CustomACHPndSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "ACHPndSrchRec_CType", propOrder = {
    "achAcctId",
    "achTrnStat",
    "achTrnCodeCode",
    "achTrnCodeDesc",
    "achTrnType",
    "amt",
    "effDt",
    "chkNum",
    "achCompDiscrData",
    "achCompEntryDesc",
    "achCompId",
    "achCompName",
    "achStdEntryClass",
    "achIndvId",
    "achAltCompName",
    "achAddendaArray",
    "customACHPndSrchRec",
    "ver1",
    "any"
})
public class ACHPndSrchRecCType {

    @XmlElement(name = "ACHAcctId", required = true)
    protected AccountIdCType achAcctId;
    @XmlElement(name = "ACHTrnStat")
    protected TrnStatType achTrnStat;
    @XmlElement(name = "ACHTrnCodeCode")
    protected TrnCodeCodeType achTrnCodeCode;
    @XmlElement(name = "ACHTrnCodeDesc")
    protected TrnCodeDescType achTrnCodeDesc;
    @XmlElement(name = "ACHTrnType")
    protected TrnTypeType achTrnType;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "ACHCompDiscrData")
    protected ACHCompDiscrDataType achCompDiscrData;
    @XmlElement(name = "ACHCompEntryDesc")
    protected ACHCompEntryDescType achCompEntryDesc;
    @XmlElement(name = "ACHCompId")
    protected ACHCompIdType achCompId;
    @XmlElement(name = "ACHCompName")
    protected ACHCompNameType achCompName;
    @XmlElement(name = "ACHStdEntryClass")
    protected ACHStdEntryClassType achStdEntryClass;
    @XmlElement(name = "ACHIndvId")
    protected ACHIndvIdType achIndvId;
    @XmlElement(name = "ACHAltCompName")
    protected ACHAltCompNameType achAltCompName;
    @XmlElement(name = "ACHAddendaArray")
    protected ACHAddendaArrayAType achAddendaArray;
    @XmlElement(name = "CustomACHPndSrchRec")
    protected CustomCType customACHPndSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getACHAcctId() {
        return achAcctId;
    }

    /**
     * Sets the value of the achAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setACHAcctId(AccountIdCType value) {
        this.achAcctId = value;
    }

    /**
     * Gets the value of the achTrnStat property.
     * 
     * @return
     *     possible object is
     *     {@link TrnStatType }
     *     
     */
    public TrnStatType getACHTrnStat() {
        return achTrnStat;
    }

    /**
     * Sets the value of the achTrnStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnStatType }
     *     
     */
    public void setACHTrnStat(TrnStatType value) {
        this.achTrnStat = value;
    }

    /**
     * Gets the value of the achTrnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getACHTrnCodeCode() {
        return achTrnCodeCode;
    }

    /**
     * Sets the value of the achTrnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setACHTrnCodeCode(TrnCodeCodeType value) {
        this.achTrnCodeCode = value;
    }

    /**
     * Gets the value of the achTrnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeDescType }
     *     
     */
    public TrnCodeDescType getACHTrnCodeDesc() {
        return achTrnCodeDesc;
    }

    /**
     * Sets the value of the achTrnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeDescType }
     *     
     */
    public void setACHTrnCodeDesc(TrnCodeDescType value) {
        this.achTrnCodeDesc = value;
    }

    /**
     * Gets the value of the achTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTypeType }
     *     
     */
    public TrnTypeType getACHTrnType() {
        return achTrnType;
    }

    /**
     * Sets the value of the achTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTypeType }
     *     
     */
    public void setACHTrnType(TrnTypeType value) {
        this.achTrnType = value;
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
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setEffDt(EffDtType value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setChkNum(ChkNumType value) {
        this.chkNum = value;
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
     * Gets the value of the achAltCompName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAltCompNameType }
     *     
     */
    public ACHAltCompNameType getACHAltCompName() {
        return achAltCompName;
    }

    /**
     * Sets the value of the achAltCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAltCompNameType }
     *     
     */
    public void setACHAltCompName(ACHAltCompNameType value) {
        this.achAltCompName = value;
    }

    /**
     * Gets the value of the achAddendaArray property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAddendaArrayAType }
     *     
     */
    public ACHAddendaArrayAType getACHAddendaArray() {
        return achAddendaArray;
    }

    /**
     * Sets the value of the achAddendaArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAddendaArrayAType }
     *     
     */
    public void setACHAddendaArray(ACHAddendaArrayAType value) {
        this.achAddendaArray = value;
    }

    /**
     * Gets the value of the customACHPndSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomACHPndSrchRec() {
        return customACHPndSrchRec;
    }

    /**
     * Sets the value of the customACHPndSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomACHPndSrchRec(CustomCType value) {
        this.customACHPndSrchRec = value;
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
