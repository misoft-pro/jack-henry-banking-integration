
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
 * <p>Java class for IntnetFinInstIdUsrInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstIdUsrInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashMgmtUsrState" type="{http://jackhenry.com/jxchange/TPG/2008}CashMgmtUsrState_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *         &lt;element name="CashMgmtUsrPswdId" type="{http://jackhenry.com/jxchange/TPG/2008}CashMgmtUsrPswdId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WirePIN" type="{http://jackhenry.com/jxchange/TPG/2008}WirePIN_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireActAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireActAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireModAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireModAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRepAddAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireRepAddAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRepModAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireRepModAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireCrtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireCrtAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAppAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireAppAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDspAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDspAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTrnAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHBatchAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ACHBatchAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHAppAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAppAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHExcAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExcAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurDayTrnAlw" type="{http://jackhenry.com/jxchange/TPG/2008}CurDayTrnAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorDayTrnAlw" type="{http://jackhenry.com/jxchange/TPG/2008}PriorDayTrnAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistAlw" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistFilterAlw" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistFilterAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtInqAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtInqAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtAddAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtAddAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="PosPayBatchAlw" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayBatchAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="PosPayExcAlw" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayExcAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctReconPosPayBatchAlw" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconPosPayBatchAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctReconPosPayExcAlw" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconPosPayExcAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctReconPosPayTrfAlw" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconPosPayTrfAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportAcctReconData" type="{http://jackhenry.com/jxchange/TPG/2008}ImportAcctReconData_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferAlw" type="{http://jackhenry.com/jxchange/TPG/2008}XferAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtRetrvAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StmtRetrvAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="AdminActAlw" type="{http://jackhenry.com/jxchange/TPG/2008}AdminActAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardStatAlw" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStatAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="BillPayAlw" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDocAddAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocAddAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="DspRateAlw" type="{http://jackhenry.com/jxchange/TPG/2008}DspRateAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="DspAppArray" type="{http://jackhenry.com/jxchange/TPG/2008}DspAppArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CashMgmtAcctIdAccessArray" type="{http://jackhenry.com/jxchange/TPG/2008}CashMgmtAcctIdAccessArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AcctReconExcpAlw" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconExcpAlw_Type" minOccurs="0"/&gt;
 *           &lt;element name="FirstAccessDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstAccessDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LastAccessDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastAccessDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LastAccessTime" type="{http://jackhenry.com/jxchange/TPG/2008}LastAccessTime_Type" minOccurs="0"/&gt;
 *           &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetFinInstIdUsrInfoRec_CType", propOrder = {
    "cashMgmtUsrState",
    "aliasAcctName",
    "cashMgmtUsrPswdId",
    "wireLmtAmt",
    "wirePIN",
    "wireActAlw",
    "wireModAlw",
    "wireRepAddAlw",
    "wireRepModAlw",
    "wireCrtAlw",
    "wireAppAlw",
    "achLmtAmt",
    "achAlw",
    "achDspAlw",
    "achTrnAlw",
    "achBatchAlw",
    "achAppAlw",
    "achExcAlw",
    "curDayTrnAlw",
    "priorDayTrnAlw",
    "trnHistAlw",
    "trnHistFilterAlw",
    "stopPmtInqAlw",
    "stopPmtAddAlw",
    "posPayBatchAlw",
    "posPayExcAlw",
    "acctReconPosPayBatchAlw",
    "acctReconPosPayExcAlw",
    "acctReconPosPayTrfAlw",
    "importAcctReconData",
    "xferAlw",
    "extcAlw",
    "stmtRetrvAlw",
    "adminActAlw",
    "eftCardStatAlw",
    "billPayAlw",
    "elecDocAddAlw",
    "dspRateAlw",
    "dspAppArray",
    "cashMgmtAcctIdAccessArray",
    "emailArray",
    "custom",
    "ver1",
    "acctReconExcpAlw",
    "firstAccessDt",
    "lastAccessDt",
    "lastAccessTime",
    "lastMainDt",
    "ver2",
    "any"
})
public class IntnetFinInstIdUsrInfoRecCType {

    @XmlElement(name = "CashMgmtUsrState")
    protected CashMgmtUsrStateType cashMgmtUsrState;
    @XmlElement(name = "AliasAcctName")
    protected AliasAcctNameType aliasAcctName;
    @XmlElement(name = "CashMgmtUsrPswdId")
    protected CashMgmtUsrPswdIdType cashMgmtUsrPswdId;
    @XmlElement(name = "WireLmtAmt")
    protected WireLmtAmtType wireLmtAmt;
    @XmlElement(name = "WirePIN")
    protected WirePINType wirePIN;
    @XmlElement(name = "WireActAlw")
    protected WireActAlwType wireActAlw;
    @XmlElement(name = "WireModAlw")
    protected WireModAlwType wireModAlw;
    @XmlElement(name = "WireRepAddAlw")
    protected WireRepAddAlwType wireRepAddAlw;
    @XmlElement(name = "WireRepModAlw")
    protected WireRepModAlwType wireRepModAlw;
    @XmlElement(name = "WireCrtAlw")
    protected WireCrtAlwType wireCrtAlw;
    @XmlElement(name = "WireAppAlw")
    protected WireAppAlwType wireAppAlw;
    @XmlElement(name = "ACHLmtAmt")
    protected ACHLmtAmtType achLmtAmt;
    @XmlElement(name = "ACHAlw")
    protected ACHAlwType achAlw;
    @XmlElement(name = "ACHDspAlw")
    protected ACHDspAlwType achDspAlw;
    @XmlElement(name = "ACHTrnAlw")
    protected ACHTrnAlwType achTrnAlw;
    @XmlElement(name = "ACHBatchAlw")
    protected ACHBatchAlwType achBatchAlw;
    @XmlElement(name = "ACHAppAlw")
    protected ACHAppAlwType achAppAlw;
    @XmlElement(name = "ACHExcAlw")
    protected ACHExcAlwType achExcAlw;
    @XmlElement(name = "CurDayTrnAlw")
    protected CurDayTrnAlwType curDayTrnAlw;
    @XmlElement(name = "PriorDayTrnAlw")
    protected PriorDayTrnAlwType priorDayTrnAlw;
    @XmlElement(name = "TrnHistAlw")
    protected TrnHistAlwType trnHistAlw;
    @XmlElement(name = "TrnHistFilterAlw")
    protected TrnHistFilterAlwType trnHistFilterAlw;
    @XmlElement(name = "StopPmtInqAlw")
    protected StopPmtInqAlwType stopPmtInqAlw;
    @XmlElement(name = "StopPmtAddAlw")
    protected StopPmtAddAlwType stopPmtAddAlw;
    @XmlElement(name = "PosPayBatchAlw")
    protected PosPayBatchAlwType posPayBatchAlw;
    @XmlElement(name = "PosPayExcAlw")
    protected PosPayExcAlwType posPayExcAlw;
    @XmlElement(name = "AcctReconPosPayBatchAlw")
    protected AcctReconPosPayBatchAlwType acctReconPosPayBatchAlw;
    @XmlElement(name = "AcctReconPosPayExcAlw")
    protected AcctReconPosPayExcAlwType acctReconPosPayExcAlw;
    @XmlElement(name = "AcctReconPosPayTrfAlw")
    protected AcctReconPosPayTrfAlwType acctReconPosPayTrfAlw;
    @XmlElement(name = "ImportAcctReconData")
    protected ImportAcctReconDataType importAcctReconData;
    @XmlElement(name = "XferAlw")
    protected XferAlwType xferAlw;
    @XmlElement(name = "ExtcAlw")
    protected ExtcAlwType extcAlw;
    @XmlElement(name = "StmtRetrvAlw")
    protected StmtRetrvAlwType stmtRetrvAlw;
    @XmlElement(name = "AdminActAlw")
    protected AdminActAlwType adminActAlw;
    @XmlElement(name = "EFTCardStatAlw")
    protected EFTCardStatAlwType eftCardStatAlw;
    @XmlElement(name = "BillPayAlw")
    protected BillPayAlwType billPayAlw;
    @XmlElement(name = "ElecDocAddAlw")
    protected ElecDocAddAlwType elecDocAddAlw;
    @XmlElement(name = "DspRateAlw")
    protected DspRateAlwType dspRateAlw;
    @XmlElement(name = "DspAppArray")
    protected DspAppArrayAType dspAppArray;
    @XmlElement(name = "CashMgmtAcctIdAccessArray")
    protected CashMgmtAcctIdAccessArrayAType cashMgmtAcctIdAccessArray;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AcctReconExcpAlw")
    protected AcctReconExcpAlwType acctReconExcpAlw;
    @XmlElement(name = "FirstAccessDt")
    protected FirstAccessDtType firstAccessDt;
    @XmlElement(name = "LastAccessDt")
    protected LastAccessDtType lastAccessDt;
    @XmlElement(name = "LastAccessTime")
    protected LastAccessTimeType lastAccessTime;
    @XmlElement(name = "LastMainDt")
    protected LastMainDtType lastMainDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the cashMgmtUsrState property.
     * 
     * @return
     *     possible object is
     *     {@link CashMgmtUsrStateType }
     *     
     */
    public CashMgmtUsrStateType getCashMgmtUsrState() {
        return cashMgmtUsrState;
    }

    /**
     * Sets the value of the cashMgmtUsrState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMgmtUsrStateType }
     *     
     */
    public void setCashMgmtUsrState(CashMgmtUsrStateType value) {
        this.cashMgmtUsrState = value;
    }

    /**
     * Gets the value of the aliasAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link AliasAcctNameType }
     *     
     */
    public AliasAcctNameType getAliasAcctName() {
        return aliasAcctName;
    }

    /**
     * Sets the value of the aliasAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasAcctNameType }
     *     
     */
    public void setAliasAcctName(AliasAcctNameType value) {
        this.aliasAcctName = value;
    }

    /**
     * Gets the value of the cashMgmtUsrPswdId property.
     * 
     * @return
     *     possible object is
     *     {@link CashMgmtUsrPswdIdType }
     *     
     */
    public CashMgmtUsrPswdIdType getCashMgmtUsrPswdId() {
        return cashMgmtUsrPswdId;
    }

    /**
     * Sets the value of the cashMgmtUsrPswdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMgmtUsrPswdIdType }
     *     
     */
    public void setCashMgmtUsrPswdId(CashMgmtUsrPswdIdType value) {
        this.cashMgmtUsrPswdId = value;
    }

    /**
     * Gets the value of the wireLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireLmtAmtType }
     *     
     */
    public WireLmtAmtType getWireLmtAmt() {
        return wireLmtAmt;
    }

    /**
     * Sets the value of the wireLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireLmtAmtType }
     *     
     */
    public void setWireLmtAmt(WireLmtAmtType value) {
        this.wireLmtAmt = value;
    }

    /**
     * Gets the value of the wirePIN property.
     * 
     * @return
     *     possible object is
     *     {@link WirePINType }
     *     
     */
    public WirePINType getWirePIN() {
        return wirePIN;
    }

    /**
     * Sets the value of the wirePIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirePINType }
     *     
     */
    public void setWirePIN(WirePINType value) {
        this.wirePIN = value;
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
     * Gets the value of the wireModAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireModAlwType }
     *     
     */
    public WireModAlwType getWireModAlw() {
        return wireModAlw;
    }

    /**
     * Sets the value of the wireModAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireModAlwType }
     *     
     */
    public void setWireModAlw(WireModAlwType value) {
        this.wireModAlw = value;
    }

    /**
     * Gets the value of the wireRepAddAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireRepAddAlwType }
     *     
     */
    public WireRepAddAlwType getWireRepAddAlw() {
        return wireRepAddAlw;
    }

    /**
     * Sets the value of the wireRepAddAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireRepAddAlwType }
     *     
     */
    public void setWireRepAddAlw(WireRepAddAlwType value) {
        this.wireRepAddAlw = value;
    }

    /**
     * Gets the value of the wireRepModAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireRepModAlwType }
     *     
     */
    public WireRepModAlwType getWireRepModAlw() {
        return wireRepModAlw;
    }

    /**
     * Sets the value of the wireRepModAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireRepModAlwType }
     *     
     */
    public void setWireRepModAlw(WireRepModAlwType value) {
        this.wireRepModAlw = value;
    }

    /**
     * Gets the value of the wireCrtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireCrtAlwType }
     *     
     */
    public WireCrtAlwType getWireCrtAlw() {
        return wireCrtAlw;
    }

    /**
     * Sets the value of the wireCrtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCrtAlwType }
     *     
     */
    public void setWireCrtAlw(WireCrtAlwType value) {
        this.wireCrtAlw = value;
    }

    /**
     * Gets the value of the wireAppAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireAppAlwType }
     *     
     */
    public WireAppAlwType getWireAppAlw() {
        return wireAppAlw;
    }

    /**
     * Sets the value of the wireAppAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAppAlwType }
     *     
     */
    public void setWireAppAlw(WireAppAlwType value) {
        this.wireAppAlw = value;
    }

    /**
     * Gets the value of the achLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHLmtAmtType }
     *     
     */
    public ACHLmtAmtType getACHLmtAmt() {
        return achLmtAmt;
    }

    /**
     * Sets the value of the achLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHLmtAmtType }
     *     
     */
    public void setACHLmtAmt(ACHLmtAmtType value) {
        this.achLmtAmt = value;
    }

    /**
     * Gets the value of the achAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAlwType }
     *     
     */
    public ACHAlwType getACHAlw() {
        return achAlw;
    }

    /**
     * Sets the value of the achAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAlwType }
     *     
     */
    public void setACHAlw(ACHAlwType value) {
        this.achAlw = value;
    }

    /**
     * Gets the value of the achDspAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDspAlwType }
     *     
     */
    public ACHDspAlwType getACHDspAlw() {
        return achDspAlw;
    }

    /**
     * Sets the value of the achDspAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDspAlwType }
     *     
     */
    public void setACHDspAlw(ACHDspAlwType value) {
        this.achDspAlw = value;
    }

    /**
     * Gets the value of the achTrnAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTrnAlwType }
     *     
     */
    public ACHTrnAlwType getACHTrnAlw() {
        return achTrnAlw;
    }

    /**
     * Sets the value of the achTrnAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTrnAlwType }
     *     
     */
    public void setACHTrnAlw(ACHTrnAlwType value) {
        this.achTrnAlw = value;
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
     * Gets the value of the achAppAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAppAlwType }
     *     
     */
    public ACHAppAlwType getACHAppAlw() {
        return achAppAlw;
    }

    /**
     * Sets the value of the achAppAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAppAlwType }
     *     
     */
    public void setACHAppAlw(ACHAppAlwType value) {
        this.achAppAlw = value;
    }

    /**
     * Gets the value of the achExcAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExcAlwType }
     *     
     */
    public ACHExcAlwType getACHExcAlw() {
        return achExcAlw;
    }

    /**
     * Sets the value of the achExcAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExcAlwType }
     *     
     */
    public void setACHExcAlw(ACHExcAlwType value) {
        this.achExcAlw = value;
    }

    /**
     * Gets the value of the curDayTrnAlw property.
     * 
     * @return
     *     possible object is
     *     {@link CurDayTrnAlwType }
     *     
     */
    public CurDayTrnAlwType getCurDayTrnAlw() {
        return curDayTrnAlw;
    }

    /**
     * Sets the value of the curDayTrnAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurDayTrnAlwType }
     *     
     */
    public void setCurDayTrnAlw(CurDayTrnAlwType value) {
        this.curDayTrnAlw = value;
    }

    /**
     * Gets the value of the priorDayTrnAlw property.
     * 
     * @return
     *     possible object is
     *     {@link PriorDayTrnAlwType }
     *     
     */
    public PriorDayTrnAlwType getPriorDayTrnAlw() {
        return priorDayTrnAlw;
    }

    /**
     * Sets the value of the priorDayTrnAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorDayTrnAlwType }
     *     
     */
    public void setPriorDayTrnAlw(PriorDayTrnAlwType value) {
        this.priorDayTrnAlw = value;
    }

    /**
     * Gets the value of the trnHistAlw property.
     * 
     * @return
     *     possible object is
     *     {@link TrnHistAlwType }
     *     
     */
    public TrnHistAlwType getTrnHistAlw() {
        return trnHistAlw;
    }

    /**
     * Sets the value of the trnHistAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnHistAlwType }
     *     
     */
    public void setTrnHistAlw(TrnHistAlwType value) {
        this.trnHistAlw = value;
    }

    /**
     * Gets the value of the trnHistFilterAlw property.
     * 
     * @return
     *     possible object is
     *     {@link TrnHistFilterAlwType }
     *     
     */
    public TrnHistFilterAlwType getTrnHistFilterAlw() {
        return trnHistFilterAlw;
    }

    /**
     * Sets the value of the trnHistFilterAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnHistFilterAlwType }
     *     
     */
    public void setTrnHistFilterAlw(TrnHistFilterAlwType value) {
        this.trnHistFilterAlw = value;
    }

    /**
     * Gets the value of the stopPmtInqAlw property.
     * 
     * @return
     *     possible object is
     *     {@link StopPmtInqAlwType }
     *     
     */
    public StopPmtInqAlwType getStopPmtInqAlw() {
        return stopPmtInqAlw;
    }

    /**
     * Sets the value of the stopPmtInqAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPmtInqAlwType }
     *     
     */
    public void setStopPmtInqAlw(StopPmtInqAlwType value) {
        this.stopPmtInqAlw = value;
    }

    /**
     * Gets the value of the stopPmtAddAlw property.
     * 
     * @return
     *     possible object is
     *     {@link StopPmtAddAlwType }
     *     
     */
    public StopPmtAddAlwType getStopPmtAddAlw() {
        return stopPmtAddAlw;
    }

    /**
     * Sets the value of the stopPmtAddAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPmtAddAlwType }
     *     
     */
    public void setStopPmtAddAlw(StopPmtAddAlwType value) {
        this.stopPmtAddAlw = value;
    }

    /**
     * Gets the value of the posPayBatchAlw property.
     * 
     * @return
     *     possible object is
     *     {@link PosPayBatchAlwType }
     *     
     */
    public PosPayBatchAlwType getPosPayBatchAlw() {
        return posPayBatchAlw;
    }

    /**
     * Sets the value of the posPayBatchAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPayBatchAlwType }
     *     
     */
    public void setPosPayBatchAlw(PosPayBatchAlwType value) {
        this.posPayBatchAlw = value;
    }

    /**
     * Gets the value of the posPayExcAlw property.
     * 
     * @return
     *     possible object is
     *     {@link PosPayExcAlwType }
     *     
     */
    public PosPayExcAlwType getPosPayExcAlw() {
        return posPayExcAlw;
    }

    /**
     * Sets the value of the posPayExcAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPayExcAlwType }
     *     
     */
    public void setPosPayExcAlw(PosPayExcAlwType value) {
        this.posPayExcAlw = value;
    }

    /**
     * Gets the value of the acctReconPosPayBatchAlw property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconPosPayBatchAlwType }
     *     
     */
    public AcctReconPosPayBatchAlwType getAcctReconPosPayBatchAlw() {
        return acctReconPosPayBatchAlw;
    }

    /**
     * Sets the value of the acctReconPosPayBatchAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconPosPayBatchAlwType }
     *     
     */
    public void setAcctReconPosPayBatchAlw(AcctReconPosPayBatchAlwType value) {
        this.acctReconPosPayBatchAlw = value;
    }

    /**
     * Gets the value of the acctReconPosPayExcAlw property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconPosPayExcAlwType }
     *     
     */
    public AcctReconPosPayExcAlwType getAcctReconPosPayExcAlw() {
        return acctReconPosPayExcAlw;
    }

    /**
     * Sets the value of the acctReconPosPayExcAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconPosPayExcAlwType }
     *     
     */
    public void setAcctReconPosPayExcAlw(AcctReconPosPayExcAlwType value) {
        this.acctReconPosPayExcAlw = value;
    }

    /**
     * Gets the value of the acctReconPosPayTrfAlw property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconPosPayTrfAlwType }
     *     
     */
    public AcctReconPosPayTrfAlwType getAcctReconPosPayTrfAlw() {
        return acctReconPosPayTrfAlw;
    }

    /**
     * Sets the value of the acctReconPosPayTrfAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconPosPayTrfAlwType }
     *     
     */
    public void setAcctReconPosPayTrfAlw(AcctReconPosPayTrfAlwType value) {
        this.acctReconPosPayTrfAlw = value;
    }

    /**
     * Gets the value of the importAcctReconData property.
     * 
     * @return
     *     possible object is
     *     {@link ImportAcctReconDataType }
     *     
     */
    public ImportAcctReconDataType getImportAcctReconData() {
        return importAcctReconData;
    }

    /**
     * Sets the value of the importAcctReconData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportAcctReconDataType }
     *     
     */
    public void setImportAcctReconData(ImportAcctReconDataType value) {
        this.importAcctReconData = value;
    }

    /**
     * Gets the value of the xferAlw property.
     * 
     * @return
     *     possible object is
     *     {@link XferAlwType }
     *     
     */
    public XferAlwType getXferAlw() {
        return xferAlw;
    }

    /**
     * Sets the value of the xferAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferAlwType }
     *     
     */
    public void setXferAlw(XferAlwType value) {
        this.xferAlw = value;
    }

    /**
     * Gets the value of the extcAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ExtcAlwType }
     *     
     */
    public ExtcAlwType getExtcAlw() {
        return extcAlw;
    }

    /**
     * Sets the value of the extcAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtcAlwType }
     *     
     */
    public void setExtcAlw(ExtcAlwType value) {
        this.extcAlw = value;
    }

    /**
     * Gets the value of the stmtRetrvAlw property.
     * 
     * @return
     *     possible object is
     *     {@link StmtRetrvAlwType }
     *     
     */
    public StmtRetrvAlwType getStmtRetrvAlw() {
        return stmtRetrvAlw;
    }

    /**
     * Sets the value of the stmtRetrvAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtRetrvAlwType }
     *     
     */
    public void setStmtRetrvAlw(StmtRetrvAlwType value) {
        this.stmtRetrvAlw = value;
    }

    /**
     * Gets the value of the adminActAlw property.
     * 
     * @return
     *     possible object is
     *     {@link AdminActAlwType }
     *     
     */
    public AdminActAlwType getAdminActAlw() {
        return adminActAlw;
    }

    /**
     * Sets the value of the adminActAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminActAlwType }
     *     
     */
    public void setAdminActAlw(AdminActAlwType value) {
        this.adminActAlw = value;
    }

    /**
     * Gets the value of the eftCardStatAlw property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStatAlwType }
     *     
     */
    public EFTCardStatAlwType getEFTCardStatAlw() {
        return eftCardStatAlw;
    }

    /**
     * Sets the value of the eftCardStatAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStatAlwType }
     *     
     */
    public void setEFTCardStatAlw(EFTCardStatAlwType value) {
        this.eftCardStatAlw = value;
    }

    /**
     * Gets the value of the billPayAlw property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayAlwType }
     *     
     */
    public BillPayAlwType getBillPayAlw() {
        return billPayAlw;
    }

    /**
     * Sets the value of the billPayAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayAlwType }
     *     
     */
    public void setBillPayAlw(BillPayAlwType value) {
        this.billPayAlw = value;
    }

    /**
     * Gets the value of the elecDocAddAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocAddAlwType }
     *     
     */
    public ElecDocAddAlwType getElecDocAddAlw() {
        return elecDocAddAlw;
    }

    /**
     * Sets the value of the elecDocAddAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocAddAlwType }
     *     
     */
    public void setElecDocAddAlw(ElecDocAddAlwType value) {
        this.elecDocAddAlw = value;
    }

    /**
     * Gets the value of the dspRateAlw property.
     * 
     * @return
     *     possible object is
     *     {@link DspRateAlwType }
     *     
     */
    public DspRateAlwType getDspRateAlw() {
        return dspRateAlw;
    }

    /**
     * Sets the value of the dspRateAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link DspRateAlwType }
     *     
     */
    public void setDspRateAlw(DspRateAlwType value) {
        this.dspRateAlw = value;
    }

    /**
     * Gets the value of the dspAppArray property.
     * 
     * @return
     *     possible object is
     *     {@link DspAppArrayAType }
     *     
     */
    public DspAppArrayAType getDspAppArray() {
        return dspAppArray;
    }

    /**
     * Sets the value of the dspAppArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DspAppArrayAType }
     *     
     */
    public void setDspAppArray(DspAppArrayAType value) {
        this.dspAppArray = value;
    }

    /**
     * Gets the value of the cashMgmtAcctIdAccessArray property.
     * 
     * @return
     *     possible object is
     *     {@link CashMgmtAcctIdAccessArrayAType }
     *     
     */
    public CashMgmtAcctIdAccessArrayAType getCashMgmtAcctIdAccessArray() {
        return cashMgmtAcctIdAccessArray;
    }

    /**
     * Sets the value of the cashMgmtAcctIdAccessArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMgmtAcctIdAccessArrayAType }
     *     
     */
    public void setCashMgmtAcctIdAccessArray(CashMgmtAcctIdAccessArrayAType value) {
        this.cashMgmtAcctIdAccessArray = value;
    }

    /**
     * Gets the value of the emailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getEmailArray() {
        return emailArray;
    }

    /**
     * Sets the value of the emailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setEmailArray(EmailArrayAType value) {
        this.emailArray = value;
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
     * Gets the value of the acctReconExcpAlw property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconExcpAlwType }
     *     
     */
    public AcctReconExcpAlwType getAcctReconExcpAlw() {
        return acctReconExcpAlw;
    }

    /**
     * Sets the value of the acctReconExcpAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconExcpAlwType }
     *     
     */
    public void setAcctReconExcpAlw(AcctReconExcpAlwType value) {
        this.acctReconExcpAlw = value;
    }

    /**
     * Gets the value of the firstAccessDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstAccessDtType }
     *     
     */
    public FirstAccessDtType getFirstAccessDt() {
        return firstAccessDt;
    }

    /**
     * Sets the value of the firstAccessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstAccessDtType }
     *     
     */
    public void setFirstAccessDt(FirstAccessDtType value) {
        this.firstAccessDt = value;
    }

    /**
     * Gets the value of the lastAccessDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastAccessDtType }
     *     
     */
    public LastAccessDtType getLastAccessDt() {
        return lastAccessDt;
    }

    /**
     * Sets the value of the lastAccessDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastAccessDtType }
     *     
     */
    public void setLastAccessDt(LastAccessDtType value) {
        this.lastAccessDt = value;
    }

    /**
     * Gets the value of the lastAccessTime property.
     * 
     * @return
     *     possible object is
     *     {@link LastAccessTimeType }
     *     
     */
    public LastAccessTimeType getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * Sets the value of the lastAccessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastAccessTimeType }
     *     
     */
    public void setLastAccessTime(LastAccessTimeType value) {
        this.lastAccessTime = value;
    }

    /**
     * Gets the value of the lastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getLastMainDt() {
        return lastMainDt;
    }

    /**
     * Sets the value of the lastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setLastMainDt(LastMainDtType value) {
        this.lastMainDt = value;
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
