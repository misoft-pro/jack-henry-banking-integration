
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for IntnetCashMgmtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetCashMgmtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtcPriorDayBalData" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcPriorDayBalData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcFileName" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcFileName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcPriorDayTrnData" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcPriorDayTrnData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcFileType" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcFileType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcCurDayBalData" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcCurDayBalData_Type" minOccurs="0"/&gt;
 *         &lt;element name="BAIRecipSecId" type="{http://jackhenry.com/jxchange/TPG/2008}BAIRecipSecId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BAIRecipId" type="{http://jackhenry.com/jxchange/TPG/2008}BAIRecipId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHBatchAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ACHBatchAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeChgAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="ACHChgAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntnetMonthAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetMonthAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetMonthFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetMonthFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHItemAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHItemAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHItemFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHItemFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetMonthChgFreq" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetMonthChgFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHBatchFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHBatchFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHBatchAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHBatchAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireActAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireActAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="ACHExtrFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExtrFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHExtrAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExtrAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHChgStmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHChgStmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CashMgmtAcctInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}CashMgmtAcctInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="WireRepTrnEntryAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireRepTrnEntryAlw_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireTrnEntryAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnEntryAlw_Type" minOccurs="0"/&gt;
 *           &lt;element name="StmtSerChg" type="{http://jackhenry.com/jxchange/TPG/2008}StmtSerChg_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrinPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}PrinPmtAlw_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}IntPmtAlw_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetCashMgmtInfoRec_CType", propOrder = {
    "extcPriorDayBalData",
    "extcFileName",
    "extcPriorDayTrnData",
    "extcFileType",
    "extcCurDayBalData",
    "baiRecipSecId",
    "baiRecipId",
    "achBatchAlw",
    "achCompName",
    "feeChgAcctId",
    "achChgAcctId",
    "intnetMonthAnlysId",
    "intnetMonthFeeAmt",
    "achItemAnlysId",
    "achItemFeeAmt",
    "intnetMonthChgFreq",
    "achBatchFeeAmt",
    "achBatchAnlysId",
    "wireActAlw",
    "wireOrignName",
    "achExtrFeeAmt",
    "achExtrAnlysId",
    "achChgStmtType",
    "cashMgmtAcctInfoArray",
    "ver1",
    "wireRepTrnEntryAlw",
    "wireTrnEntryAlw",
    "stmtSerChg",
    "prinPmtAlw",
    "intPmtAlw",
    "ver2",
    "any"
})
public class IntnetCashMgmtInfoRecCType {

    @XmlElement(name = "ExtcPriorDayBalData")
    protected ExtcPriorDayBalDataType extcPriorDayBalData;
    @XmlElement(name = "ExtcFileName")
    protected ExtcFileNameType extcFileName;
    @XmlElement(name = "ExtcPriorDayTrnData")
    protected ExtcPriorDayTrnDataType extcPriorDayTrnData;
    @XmlElement(name = "ExtcFileType")
    protected ExtcFileTypeType extcFileType;
    @XmlElement(name = "ExtcCurDayBalData")
    protected ExtcCurDayBalDataType extcCurDayBalData;
    @XmlElement(name = "BAIRecipSecId")
    protected BAIRecipSecIdType baiRecipSecId;
    @XmlElement(name = "BAIRecipId")
    protected BAIRecipIdType baiRecipId;
    @XmlElement(name = "ACHBatchAlw")
    protected ACHBatchAlwType achBatchAlw;
    @XmlElement(name = "ACHCompName")
    protected ACHCompNameType achCompName;
    @XmlElement(name = "FeeChgAcctId")
    protected AccountIdCType feeChgAcctId;
    @XmlElement(name = "ACHChgAcctId")
    protected AccountIdCType achChgAcctId;
    @XmlElement(name = "IntnetMonthAnlysId")
    protected IntnetMonthAnlysIdType intnetMonthAnlysId;
    @XmlElement(name = "IntnetMonthFeeAmt")
    protected IntnetMonthFeeAmtType intnetMonthFeeAmt;
    @XmlElement(name = "ACHItemAnlysId")
    protected ACHItemAnlysIdType achItemAnlysId;
    @XmlElement(name = "ACHItemFeeAmt")
    protected ACHItemFeeAmtType achItemFeeAmt;
    @XmlElement(name = "IntnetMonthChgFreq")
    protected IntnetMonthChgFreqType intnetMonthChgFreq;
    @XmlElement(name = "ACHBatchFeeAmt")
    protected ACHBatchFeeAmtType achBatchFeeAmt;
    @XmlElement(name = "ACHBatchAnlysId")
    protected ACHBatchAnlysIdType achBatchAnlysId;
    @XmlElement(name = "WireActAlw")
    protected WireActAlwType wireActAlw;
    @XmlElement(name = "WireOrignName")
    protected PersonNameCType wireOrignName;
    @XmlElement(name = "ACHExtrFeeAmt")
    protected ACHExtrFeeAmtType achExtrFeeAmt;
    @XmlElement(name = "ACHExtrAnlysId")
    protected ACHExtrAnlysIdType achExtrAnlysId;
    @XmlElement(name = "ACHChgStmtType")
    protected ACHChgStmtTypeType achChgStmtType;
    @XmlElement(name = "CashMgmtAcctInfoArray")
    protected CashMgmtAcctInfoArrayAType cashMgmtAcctInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "WireRepTrnEntryAlw")
    protected WireRepTrnEntryAlwType wireRepTrnEntryAlw;
    @XmlElement(name = "WireTrnEntryAlw")
    protected WireTrnEntryAlwType wireTrnEntryAlw;
    @XmlElement(name = "StmtSerChg")
    protected StmtSerChgType stmtSerChg;
    @XmlElement(name = "PrinPmtAlw")
    protected PrinPmtAlwType prinPmtAlw;
    @XmlElement(name = "IntPmtAlw")
    protected IntPmtAlwType intPmtAlw;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the extcPriorDayBalData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtcPriorDayBalDataType }
     *     
     */
    public ExtcPriorDayBalDataType getExtcPriorDayBalData() {
        return extcPriorDayBalData;
    }

    /**
     * Sets the value of the extcPriorDayBalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtcPriorDayBalDataType }
     *     
     */
    public void setExtcPriorDayBalData(ExtcPriorDayBalDataType value) {
        this.extcPriorDayBalData = value;
    }

    /**
     * Gets the value of the extcFileName property.
     * 
     * @return
     *     possible object is
     *     {@link ExtcFileNameType }
     *     
     */
    public ExtcFileNameType getExtcFileName() {
        return extcFileName;
    }

    /**
     * Sets the value of the extcFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtcFileNameType }
     *     
     */
    public void setExtcFileName(ExtcFileNameType value) {
        this.extcFileName = value;
    }

    /**
     * Gets the value of the extcPriorDayTrnData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtcPriorDayTrnDataType }
     *     
     */
    public ExtcPriorDayTrnDataType getExtcPriorDayTrnData() {
        return extcPriorDayTrnData;
    }

    /**
     * Sets the value of the extcPriorDayTrnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtcPriorDayTrnDataType }
     *     
     */
    public void setExtcPriorDayTrnData(ExtcPriorDayTrnDataType value) {
        this.extcPriorDayTrnData = value;
    }

    /**
     * Gets the value of the extcFileType property.
     * 
     * @return
     *     possible object is
     *     {@link ExtcFileTypeType }
     *     
     */
    public ExtcFileTypeType getExtcFileType() {
        return extcFileType;
    }

    /**
     * Sets the value of the extcFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtcFileTypeType }
     *     
     */
    public void setExtcFileType(ExtcFileTypeType value) {
        this.extcFileType = value;
    }

    /**
     * Gets the value of the extcCurDayBalData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtcCurDayBalDataType }
     *     
     */
    public ExtcCurDayBalDataType getExtcCurDayBalData() {
        return extcCurDayBalData;
    }

    /**
     * Sets the value of the extcCurDayBalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtcCurDayBalDataType }
     *     
     */
    public void setExtcCurDayBalData(ExtcCurDayBalDataType value) {
        this.extcCurDayBalData = value;
    }

    /**
     * Gets the value of the baiRecipSecId property.
     * 
     * @return
     *     possible object is
     *     {@link BAIRecipSecIdType }
     *     
     */
    public BAIRecipSecIdType getBAIRecipSecId() {
        return baiRecipSecId;
    }

    /**
     * Sets the value of the baiRecipSecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BAIRecipSecIdType }
     *     
     */
    public void setBAIRecipSecId(BAIRecipSecIdType value) {
        this.baiRecipSecId = value;
    }

    /**
     * Gets the value of the baiRecipId property.
     * 
     * @return
     *     possible object is
     *     {@link BAIRecipIdType }
     *     
     */
    public BAIRecipIdType getBAIRecipId() {
        return baiRecipId;
    }

    /**
     * Sets the value of the baiRecipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BAIRecipIdType }
     *     
     */
    public void setBAIRecipId(BAIRecipIdType value) {
        this.baiRecipId = value;
    }

    /**
     * Gets the value of the achBatchAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ACHBatchAlwType }
     *     
     */
    public ACHBatchAlwType getACHBatchAlw() {
        return achBatchAlw;
    }

    /**
     * Sets the value of the achBatchAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHBatchAlwType }
     *     
     */
    public void setACHBatchAlw(ACHBatchAlwType value) {
        this.achBatchAlw = value;
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
     * Gets the value of the feeChgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getFeeChgAcctId() {
        return feeChgAcctId;
    }

    /**
     * Sets the value of the feeChgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setFeeChgAcctId(AccountIdCType value) {
        this.feeChgAcctId = value;
    }

    /**
     * Gets the value of the achChgAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getACHChgAcctId() {
        return achChgAcctId;
    }

    /**
     * Sets the value of the achChgAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setACHChgAcctId(AccountIdCType value) {
        this.achChgAcctId = value;
    }

    /**
     * Gets the value of the intnetMonthAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetMonthAnlysIdType }
     *     
     */
    public IntnetMonthAnlysIdType getIntnetMonthAnlysId() {
        return intnetMonthAnlysId;
    }

    /**
     * Sets the value of the intnetMonthAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetMonthAnlysIdType }
     *     
     */
    public void setIntnetMonthAnlysId(IntnetMonthAnlysIdType value) {
        this.intnetMonthAnlysId = value;
    }

    /**
     * Gets the value of the intnetMonthFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetMonthFeeAmtType }
     *     
     */
    public IntnetMonthFeeAmtType getIntnetMonthFeeAmt() {
        return intnetMonthFeeAmt;
    }

    /**
     * Sets the value of the intnetMonthFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetMonthFeeAmtType }
     *     
     */
    public void setIntnetMonthFeeAmt(IntnetMonthFeeAmtType value) {
        this.intnetMonthFeeAmt = value;
    }

    /**
     * Gets the value of the achItemAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHItemAnlysIdType }
     *     
     */
    public ACHItemAnlysIdType getACHItemAnlysId() {
        return achItemAnlysId;
    }

    /**
     * Sets the value of the achItemAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHItemAnlysIdType }
     *     
     */
    public void setACHItemAnlysId(ACHItemAnlysIdType value) {
        this.achItemAnlysId = value;
    }

    /**
     * Gets the value of the achItemFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHItemFeeAmtType }
     *     
     */
    public ACHItemFeeAmtType getACHItemFeeAmt() {
        return achItemFeeAmt;
    }

    /**
     * Sets the value of the achItemFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHItemFeeAmtType }
     *     
     */
    public void setACHItemFeeAmt(ACHItemFeeAmtType value) {
        this.achItemFeeAmt = value;
    }

    /**
     * Gets the value of the intnetMonthChgFreq property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetMonthChgFreqType }
     *     
     */
    public IntnetMonthChgFreqType getIntnetMonthChgFreq() {
        return intnetMonthChgFreq;
    }

    /**
     * Sets the value of the intnetMonthChgFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetMonthChgFreqType }
     *     
     */
    public void setIntnetMonthChgFreq(IntnetMonthChgFreqType value) {
        this.intnetMonthChgFreq = value;
    }

    /**
     * Gets the value of the achBatchFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHBatchFeeAmtType }
     *     
     */
    public ACHBatchFeeAmtType getACHBatchFeeAmt() {
        return achBatchFeeAmt;
    }

    /**
     * Sets the value of the achBatchFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHBatchFeeAmtType }
     *     
     */
    public void setACHBatchFeeAmt(ACHBatchFeeAmtType value) {
        this.achBatchFeeAmt = value;
    }

    /**
     * Gets the value of the achBatchAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHBatchAnlysIdType }
     *     
     */
    public ACHBatchAnlysIdType getACHBatchAnlysId() {
        return achBatchAnlysId;
    }

    /**
     * Sets the value of the achBatchAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHBatchAnlysIdType }
     *     
     */
    public void setACHBatchAnlysId(ACHBatchAnlysIdType value) {
        this.achBatchAnlysId = value;
    }

    /**
     * Gets the value of the wireActAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireActAlwType }
     *     
     */
    public WireActAlwType getWireActAlw() {
        return wireActAlw;
    }

    /**
     * Sets the value of the wireActAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireActAlwType }
     *     
     */
    public void setWireActAlw(WireActAlwType value) {
        this.wireActAlw = value;
    }

    /**
     * Gets the value of the wireOrignName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getWireOrignName() {
        return wireOrignName;
    }

    /**
     * Sets the value of the wireOrignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setWireOrignName(PersonNameCType value) {
        this.wireOrignName = value;
    }

    /**
     * Gets the value of the achExtrFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExtrFeeAmtType }
     *     
     */
    public ACHExtrFeeAmtType getACHExtrFeeAmt() {
        return achExtrFeeAmt;
    }

    /**
     * Sets the value of the achExtrFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExtrFeeAmtType }
     *     
     */
    public void setACHExtrFeeAmt(ACHExtrFeeAmtType value) {
        this.achExtrFeeAmt = value;
    }

    /**
     * Gets the value of the achExtrAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExtrAnlysIdType }
     *     
     */
    public ACHExtrAnlysIdType getACHExtrAnlysId() {
        return achExtrAnlysId;
    }

    /**
     * Sets the value of the achExtrAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExtrAnlysIdType }
     *     
     */
    public void setACHExtrAnlysId(ACHExtrAnlysIdType value) {
        this.achExtrAnlysId = value;
    }

    /**
     * Gets the value of the achChgStmtType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHChgStmtTypeType }
     *     
     */
    public ACHChgStmtTypeType getACHChgStmtType() {
        return achChgStmtType;
    }

    /**
     * Sets the value of the achChgStmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHChgStmtTypeType }
     *     
     */
    public void setACHChgStmtType(ACHChgStmtTypeType value) {
        this.achChgStmtType = value;
    }

    /**
     * Gets the value of the cashMgmtAcctInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link CashMgmtAcctInfoArrayAType }
     *     
     */
    public CashMgmtAcctInfoArrayAType getCashMgmtAcctInfoArray() {
        return cashMgmtAcctInfoArray;
    }

    /**
     * Sets the value of the cashMgmtAcctInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMgmtAcctInfoArrayAType }
     *     
     */
    public void setCashMgmtAcctInfoArray(CashMgmtAcctInfoArrayAType value) {
        this.cashMgmtAcctInfoArray = value;
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
     * Gets the value of the wireRepTrnEntryAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireRepTrnEntryAlwType }
     *     
     */
    public WireRepTrnEntryAlwType getWireRepTrnEntryAlw() {
        return wireRepTrnEntryAlw;
    }

    /**
     * Sets the value of the wireRepTrnEntryAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireRepTrnEntryAlwType }
     *     
     */
    public void setWireRepTrnEntryAlw(WireRepTrnEntryAlwType value) {
        this.wireRepTrnEntryAlw = value;
    }

    /**
     * Gets the value of the wireTrnEntryAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnEntryAlwType }
     *     
     */
    public WireTrnEntryAlwType getWireTrnEntryAlw() {
        return wireTrnEntryAlw;
    }

    /**
     * Sets the value of the wireTrnEntryAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnEntryAlwType }
     *     
     */
    public void setWireTrnEntryAlw(WireTrnEntryAlwType value) {
        this.wireTrnEntryAlw = value;
    }

    /**
     * Gets the value of the stmtSerChg property.
     * 
     * @return
     *     possible object is
     *     {@link StmtSerChgType }
     *     
     */
    public StmtSerChgType getStmtSerChg() {
        return stmtSerChg;
    }

    /**
     * Sets the value of the stmtSerChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtSerChgType }
     *     
     */
    public void setStmtSerChg(StmtSerChgType value) {
        this.stmtSerChg = value;
    }

    /**
     * Gets the value of the prinPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link PrinPmtAlwType }
     *     
     */
    public PrinPmtAlwType getPrinPmtAlw() {
        return prinPmtAlw;
    }

    /**
     * Sets the value of the prinPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrinPmtAlwType }
     *     
     */
    public void setPrinPmtAlw(PrinPmtAlwType value) {
        this.prinPmtAlw = value;
    }

    /**
     * Gets the value of the intPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link IntPmtAlwType }
     *     
     */
    public IntPmtAlwType getIntPmtAlw() {
        return intPmtAlw;
    }

    /**
     * Sets the value of the intPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPmtAlwType }
     *     
     */
    public void setIntPmtAlw(IntPmtAlwType value) {
        this.intPmtAlw = value;
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
