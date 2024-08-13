
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
 * <p>Java class for GLAcctInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLAcctInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctTitle" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLTotalLvl" type="{http://jackhenry.com/jxchange/TPG/2008}GLTotalLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtSumRpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtSumRpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtDlyRpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtDlyRpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdBalType" type="{http://jackhenry.com/jxchange/TPG/2008}StdBalType_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLPostFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}GLPostFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}StdTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffReqType" type="{http://jackhenry.com/jxchange/TPG/2008}OffReqType_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt1Code" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt2Code" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt3Code" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt4Code" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCnsldtAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclCnsldtType" type="{http://jackhenry.com/jxchange/TPG/2008}ExclCnsldtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DescReqType" type="{http://jackhenry.com/jxchange/TPG/2008}DescReqType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PODPostAllwType" type="{http://jackhenry.com/jxchange/TPG/2008}PODPostAllwType_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLSubjAcctRecon" type="{http://jackhenry.com/jxchange/TPG/2008}GLSubjAcctRecon_Type" minOccurs="0"/&gt;
 *         &lt;element name="CapitalRiskPct" type="{http://jackhenry.com/jxchange/TPG/2008}CapitalRiskPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCombStmtInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}GLCombStmtInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="GLMonthAmtInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}GLMonthAmtInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="GLQtrAmtInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}GLQtrAmtInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "GLAcctInfoRec_CType", propOrder = {
    "acctTitle",
    "acctType",
    "brCode",
    "glTotalLvl",
    "prtSumRpt",
    "prtDlyRpt",
    "stdBalType",
    "glPostFreqUnits",
    "stdTrnType",
    "offReqType",
    "glCostCtr",
    "glProdCode",
    "callRpt1Code",
    "callRpt2Code",
    "callRpt3Code",
    "callRpt4Code",
    "lastActDt",
    "glCnsldtAcctId",
    "acctStat",
    "exclCnsldtType",
    "offCode",
    "descReqType",
    "podPostAllwType",
    "glSubjAcctRecon",
    "capitalRiskPct",
    "openDt",
    "lastMainDt",
    "glCombStmtInfoArray",
    "glMonthAmtInfoArray",
    "glQtrAmtInfoArray",
    "userDefInfoArray",
    "ver1",
    "any"
})
public class GLAcctInfoRecCType {

    @XmlElement(name = "AcctTitle")
    protected AcctTitleType acctTitle;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "GLTotalLvl")
    protected GLTotalLvlType glTotalLvl;
    @XmlElement(name = "PrtSumRpt")
    protected PrtSumRptType prtSumRpt;
    @XmlElement(name = "PrtDlyRpt")
    protected PrtDlyRptType prtDlyRpt;
    @XmlElement(name = "StdBalType")
    protected StdBalTypeType stdBalType;
    @XmlElement(name = "GLPostFreqUnits")
    protected GLPostFreqUnitsType glPostFreqUnits;
    @XmlElement(name = "StdTrnType")
    protected StdTrnTypeType stdTrnType;
    @XmlElement(name = "OffReqType")
    protected OffReqTypeType offReqType;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "CallRpt1Code")
    protected CallRptCodeType callRpt1Code;
    @XmlElement(name = "CallRpt2Code")
    protected CallRptCodeType callRpt2Code;
    @XmlElement(name = "CallRpt3Code")
    protected CallRptCodeType callRpt3Code;
    @XmlElement(name = "CallRpt4Code")
    protected CallRptCodeType callRpt4Code;
    @XmlElement(name = "LastActDt")
    protected LastActDtType lastActDt;
    @XmlElement(name = "GLCnsldtAcctId")
    protected AcctIdType glCnsldtAcctId;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "ExclCnsldtType")
    protected ExclCnsldtTypeType exclCnsldtType;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "DescReqType")
    protected DescReqTypeType descReqType;
    @XmlElement(name = "PODPostAllwType")
    protected PODPostAllwTypeType podPostAllwType;
    @XmlElement(name = "GLSubjAcctRecon")
    protected GLSubjAcctReconType glSubjAcctRecon;
    @XmlElement(name = "CapitalRiskPct")
    protected CapitalRiskPctType capitalRiskPct;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "LastMainDt")
    protected LastMainDtType lastMainDt;
    @XmlElement(name = "GLCombStmtInfoArray")
    protected GLCombStmtInfoArrayAType glCombStmtInfoArray;
    @XmlElement(name = "GLMonthAmtInfoArray")
    protected GLMonthAmtInfoArrayAType glMonthAmtInfoArray;
    @XmlElement(name = "GLQtrAmtInfoArray")
    protected GLQtrAmtInfoArrayAType glQtrAmtInfoArray;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctTitle property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleType }
     *     
     */
    public AcctTitleType getAcctTitle() {
        return acctTitle;
    }

    /**
     * Sets the value of the acctTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleType }
     *     
     */
    public void setAcctTitle(AcctTitleType value) {
        this.acctTitle = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the glTotalLvl property.
     * 
     * @return
     *     possible object is
     *     {@link GLTotalLvlType }
     *     
     */
    public GLTotalLvlType getGLTotalLvl() {
        return glTotalLvl;
    }

    /**
     * Sets the value of the glTotalLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLTotalLvlType }
     *     
     */
    public void setGLTotalLvl(GLTotalLvlType value) {
        this.glTotalLvl = value;
    }

    /**
     * Gets the value of the prtSumRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PrtSumRptType }
     *     
     */
    public PrtSumRptType getPrtSumRpt() {
        return prtSumRpt;
    }

    /**
     * Sets the value of the prtSumRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtSumRptType }
     *     
     */
    public void setPrtSumRpt(PrtSumRptType value) {
        this.prtSumRpt = value;
    }

    /**
     * Gets the value of the prtDlyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PrtDlyRptType }
     *     
     */
    public PrtDlyRptType getPrtDlyRpt() {
        return prtDlyRpt;
    }

    /**
     * Sets the value of the prtDlyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtDlyRptType }
     *     
     */
    public void setPrtDlyRpt(PrtDlyRptType value) {
        this.prtDlyRpt = value;
    }

    /**
     * Gets the value of the stdBalType property.
     * 
     * @return
     *     possible object is
     *     {@link StdBalTypeType }
     *     
     */
    public StdBalTypeType getStdBalType() {
        return stdBalType;
    }

    /**
     * Sets the value of the stdBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdBalTypeType }
     *     
     */
    public void setStdBalType(StdBalTypeType value) {
        this.stdBalType = value;
    }

    /**
     * Gets the value of the glPostFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link GLPostFreqUnitsType }
     *     
     */
    public GLPostFreqUnitsType getGLPostFreqUnits() {
        return glPostFreqUnits;
    }

    /**
     * Sets the value of the glPostFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLPostFreqUnitsType }
     *     
     */
    public void setGLPostFreqUnits(GLPostFreqUnitsType value) {
        this.glPostFreqUnits = value;
    }

    /**
     * Gets the value of the stdTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link StdTrnTypeType }
     *     
     */
    public StdTrnTypeType getStdTrnType() {
        return stdTrnType;
    }

    /**
     * Sets the value of the stdTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdTrnTypeType }
     *     
     */
    public void setStdTrnType(StdTrnTypeType value) {
        this.stdTrnType = value;
    }

    /**
     * Gets the value of the offReqType property.
     * 
     * @return
     *     possible object is
     *     {@link OffReqTypeType }
     *     
     */
    public OffReqTypeType getOffReqType() {
        return offReqType;
    }

    /**
     * Sets the value of the offReqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffReqTypeType }
     *     
     */
    public void setOffReqType(OffReqTypeType value) {
        this.offReqType = value;
    }

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setGLCostCtr(GLCostCtrType value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdCodeType }
     *     
     */
    public GLProdCodeType getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdCodeType }
     *     
     */
    public void setGLProdCode(GLProdCodeType value) {
        this.glProdCode = value;
    }

    /**
     * Gets the value of the callRpt1Code property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptCodeType }
     *     
     */
    public CallRptCodeType getCallRpt1Code() {
        return callRpt1Code;
    }

    /**
     * Sets the value of the callRpt1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptCodeType }
     *     
     */
    public void setCallRpt1Code(CallRptCodeType value) {
        this.callRpt1Code = value;
    }

    /**
     * Gets the value of the callRpt2Code property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptCodeType }
     *     
     */
    public CallRptCodeType getCallRpt2Code() {
        return callRpt2Code;
    }

    /**
     * Sets the value of the callRpt2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptCodeType }
     *     
     */
    public void setCallRpt2Code(CallRptCodeType value) {
        this.callRpt2Code = value;
    }

    /**
     * Gets the value of the callRpt3Code property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptCodeType }
     *     
     */
    public CallRptCodeType getCallRpt3Code() {
        return callRpt3Code;
    }

    /**
     * Sets the value of the callRpt3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptCodeType }
     *     
     */
    public void setCallRpt3Code(CallRptCodeType value) {
        this.callRpt3Code = value;
    }

    /**
     * Gets the value of the callRpt4Code property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptCodeType }
     *     
     */
    public CallRptCodeType getCallRpt4Code() {
        return callRpt4Code;
    }

    /**
     * Sets the value of the callRpt4Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptCodeType }
     *     
     */
    public void setCallRpt4Code(CallRptCodeType value) {
        this.callRpt4Code = value;
    }

    /**
     * Gets the value of the lastActDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastActDtType }
     *     
     */
    public LastActDtType getLastActDt() {
        return lastActDt;
    }

    /**
     * Sets the value of the lastActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastActDtType }
     *     
     */
    public void setLastActDt(LastActDtType value) {
        this.lastActDt = value;
    }

    /**
     * Gets the value of the glCnsldtAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getGLCnsldtAcctId() {
        return glCnsldtAcctId;
    }

    /**
     * Sets the value of the glCnsldtAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setGLCnsldtAcctId(AcctIdType value) {
        this.glCnsldtAcctId = value;
    }

    /**
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setAcctStat(AcctStatType value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the exclCnsldtType property.
     * 
     * @return
     *     possible object is
     *     {@link ExclCnsldtTypeType }
     *     
     */
    public ExclCnsldtTypeType getExclCnsldtType() {
        return exclCnsldtType;
    }

    /**
     * Sets the value of the exclCnsldtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclCnsldtTypeType }
     *     
     */
    public void setExclCnsldtType(ExclCnsldtTypeType value) {
        this.exclCnsldtType = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the descReqType property.
     * 
     * @return
     *     possible object is
     *     {@link DescReqTypeType }
     *     
     */
    public DescReqTypeType getDescReqType() {
        return descReqType;
    }

    /**
     * Sets the value of the descReqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescReqTypeType }
     *     
     */
    public void setDescReqType(DescReqTypeType value) {
        this.descReqType = value;
    }

    /**
     * Gets the value of the podPostAllwType property.
     * 
     * @return
     *     possible object is
     *     {@link PODPostAllwTypeType }
     *     
     */
    public PODPostAllwTypeType getPODPostAllwType() {
        return podPostAllwType;
    }

    /**
     * Sets the value of the podPostAllwType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PODPostAllwTypeType }
     *     
     */
    public void setPODPostAllwType(PODPostAllwTypeType value) {
        this.podPostAllwType = value;
    }

    /**
     * Gets the value of the glSubjAcctRecon property.
     * 
     * @return
     *     possible object is
     *     {@link GLSubjAcctReconType }
     *     
     */
    public GLSubjAcctReconType getGLSubjAcctRecon() {
        return glSubjAcctRecon;
    }

    /**
     * Sets the value of the glSubjAcctRecon property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLSubjAcctReconType }
     *     
     */
    public void setGLSubjAcctRecon(GLSubjAcctReconType value) {
        this.glSubjAcctRecon = value;
    }

    /**
     * Gets the value of the capitalRiskPct property.
     * 
     * @return
     *     possible object is
     *     {@link CapitalRiskPctType }
     *     
     */
    public CapitalRiskPctType getCapitalRiskPct() {
        return capitalRiskPct;
    }

    /**
     * Sets the value of the capitalRiskPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalRiskPctType }
     *     
     */
    public void setCapitalRiskPct(CapitalRiskPctType value) {
        this.capitalRiskPct = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDtType }
     *     
     */
    public OpenDtType getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDtType }
     *     
     */
    public void setOpenDt(OpenDtType value) {
        this.openDt = value;
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
     * Gets the value of the glCombStmtInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link GLCombStmtInfoArrayAType }
     *     
     */
    public GLCombStmtInfoArrayAType getGLCombStmtInfoArray() {
        return glCombStmtInfoArray;
    }

    /**
     * Sets the value of the glCombStmtInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCombStmtInfoArrayAType }
     *     
     */
    public void setGLCombStmtInfoArray(GLCombStmtInfoArrayAType value) {
        this.glCombStmtInfoArray = value;
    }

    /**
     * Gets the value of the glMonthAmtInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link GLMonthAmtInfoArrayAType }
     *     
     */
    public GLMonthAmtInfoArrayAType getGLMonthAmtInfoArray() {
        return glMonthAmtInfoArray;
    }

    /**
     * Sets the value of the glMonthAmtInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLMonthAmtInfoArrayAType }
     *     
     */
    public void setGLMonthAmtInfoArray(GLMonthAmtInfoArrayAType value) {
        this.glMonthAmtInfoArray = value;
    }

    /**
     * Gets the value of the glQtrAmtInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link GLQtrAmtInfoArrayAType }
     *     
     */
    public GLQtrAmtInfoArrayAType getGLQtrAmtInfoArray() {
        return glQtrAmtInfoArray;
    }

    /**
     * Sets the value of the glQtrAmtInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLQtrAmtInfoArrayAType }
     *     
     */
    public void setGLQtrAmtInfoArray(GLQtrAmtInfoArrayAType value) {
        this.glQtrAmtInfoArray = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
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
