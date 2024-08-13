
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
 * <p>Java class for TimeDepRenOvrrdRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepRenOvrrdRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeDepRenOvrrdType" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRenOvrrdType_Type"/&gt;
 *         &lt;element name="CDTerm" type="{http://jackhenry.com/jxchange/TPG/2008}CDTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="CDTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}CDTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntTerm" type="{http://jackhenry.com/jxchange/TPG/2008}IntTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}IntTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntCalcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntYrBaseCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntYrBaseCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EvenPayCode" type="{http://jackhenry.com/jxchange/TPG/2008}EvenPayCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayAllIntCode" type="{http://jackhenry.com/jxchange/TPG/2008}PayAllIntCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RenCode" type="{http://jackhenry.com/jxchange/TPG/2008}RenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateSchedCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateSchedCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPmtDtCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntPmtDtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrimeRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}PrimeRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PenCode" type="{http://jackhenry.com/jxchange/TPG/2008}PenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}MultiRateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiDrCode" type="{http://jackhenry.com/jxchange/TPG/2008}MultiDrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtPasCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtPasCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PapreLessCode" type="{http://jackhenry.com/jxchange/TPG/2008}PaperLessCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldMailCode" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepRenOvrrdRec_CType", propOrder = {
    "timeDepRenOvrrdType",
    "cdTerm",
    "cdTermUnits",
    "intTerm",
    "intTermUnits",
    "intCalcCode",
    "intYrBaseCode",
    "evenPayCode",
    "payAllIntCode",
    "renCode",
    "rateSchedCode",
    "intPmtDtCode",
    "primeRateIdx",
    "callRptCode",
    "glCostCtr",
    "glProdCode",
    "penCode",
    "multiRateCode",
    "multiDrCode",
    "stmtPasCode",
    "stmtFreqCode",
    "papreLessCode",
    "fedWithCode",
    "hldMailCode",
    "incCombStmt",
    "ver1",
    "any"
})
public class TimeDepRenOvrrdRecCType {

    @XmlElement(name = "TimeDepRenOvrrdType", required = true)
    protected TimeDepRenOvrrdTypeType timeDepRenOvrrdType;
    @XmlElement(name = "CDTerm")
    protected CDTermType cdTerm;
    @XmlElement(name = "CDTermUnits")
    protected CDTermUnitsType cdTermUnits;
    @XmlElement(name = "IntTerm")
    protected IntTermType intTerm;
    @XmlElement(name = "IntTermUnits")
    protected IntTermUnitsType intTermUnits;
    @XmlElement(name = "IntCalcCode")
    protected IntCalcCodeType intCalcCode;
    @XmlElement(name = "IntYrBaseCode")
    protected IntYrBaseCodeType intYrBaseCode;
    @XmlElement(name = "EvenPayCode")
    protected EvenPayCodeType evenPayCode;
    @XmlElement(name = "PayAllIntCode")
    protected PayAllIntCodeType payAllIntCode;
    @XmlElement(name = "RenCode")
    protected RenCodeType renCode;
    @XmlElement(name = "RateSchedCode")
    protected RateSchedCodeType rateSchedCode;
    @XmlElement(name = "IntPmtDtCode")
    protected IntPmtDtCodeType intPmtDtCode;
    @XmlElement(name = "PrimeRateIdx")
    protected PrimeRateIdxType primeRateIdx;
    @XmlElement(name = "CallRptCode")
    protected CallRptCodeType callRptCode;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "PenCode")
    protected PenCodeType penCode;
    @XmlElement(name = "MultiRateCode")
    protected MultiRateCodeType multiRateCode;
    @XmlElement(name = "MultiDrCode")
    protected MultiDrCodeType multiDrCode;
    @XmlElement(name = "StmtPasCode")
    protected StmtPasCodeType stmtPasCode;
    @XmlElement(name = "StmtFreqCode")
    protected StmtFreqCodeType stmtFreqCode;
    @XmlElement(name = "PapreLessCode")
    protected PaperLessCodeType papreLessCode;
    @XmlElement(name = "FedWithCode")
    protected FedWithCodeType fedWithCode;
    @XmlElement(name = "HldMailCode")
    protected HldMailCodeType hldMailCode;
    @XmlElement(name = "IncCombStmt")
    protected IncCombStmtType incCombStmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timeDepRenOvrrdType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepRenOvrrdTypeType }
     *     
     */
    public TimeDepRenOvrrdTypeType getTimeDepRenOvrrdType() {
        return timeDepRenOvrrdType;
    }

    /**
     * Sets the value of the timeDepRenOvrrdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepRenOvrrdTypeType }
     *     
     */
    public void setTimeDepRenOvrrdType(TimeDepRenOvrrdTypeType value) {
        this.timeDepRenOvrrdType = value;
    }

    /**
     * Gets the value of the cdTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CDTermType }
     *     
     */
    public CDTermType getCDTerm() {
        return cdTerm;
    }

    /**
     * Sets the value of the cdTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDTermType }
     *     
     */
    public void setCDTerm(CDTermType value) {
        this.cdTerm = value;
    }

    /**
     * Gets the value of the cdTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CDTermUnitsType }
     *     
     */
    public CDTermUnitsType getCDTermUnits() {
        return cdTermUnits;
    }

    /**
     * Sets the value of the cdTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDTermUnitsType }
     *     
     */
    public void setCDTermUnits(CDTermUnitsType value) {
        this.cdTermUnits = value;
    }

    /**
     * Gets the value of the intTerm property.
     * 
     * @return
     *     possible object is
     *     {@link IntTermType }
     *     
     */
    public IntTermType getIntTerm() {
        return intTerm;
    }

    /**
     * Sets the value of the intTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTermType }
     *     
     */
    public void setIntTerm(IntTermType value) {
        this.intTerm = value;
    }

    /**
     * Gets the value of the intTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link IntTermUnitsType }
     *     
     */
    public IntTermUnitsType getIntTermUnits() {
        return intTermUnits;
    }

    /**
     * Sets the value of the intTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTermUnitsType }
     *     
     */
    public void setIntTermUnits(IntTermUnitsType value) {
        this.intTermUnits = value;
    }

    /**
     * Gets the value of the intCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntCalcCodeType }
     *     
     */
    public IntCalcCodeType getIntCalcCode() {
        return intCalcCode;
    }

    /**
     * Sets the value of the intCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCalcCodeType }
     *     
     */
    public void setIntCalcCode(IntCalcCodeType value) {
        this.intCalcCode = value;
    }

    /**
     * Gets the value of the intYrBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntYrBaseCodeType }
     *     
     */
    public IntYrBaseCodeType getIntYrBaseCode() {
        return intYrBaseCode;
    }

    /**
     * Sets the value of the intYrBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntYrBaseCodeType }
     *     
     */
    public void setIntYrBaseCode(IntYrBaseCodeType value) {
        this.intYrBaseCode = value;
    }

    /**
     * Gets the value of the evenPayCode property.
     * 
     * @return
     *     possible object is
     *     {@link EvenPayCodeType }
     *     
     */
    public EvenPayCodeType getEvenPayCode() {
        return evenPayCode;
    }

    /**
     * Sets the value of the evenPayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvenPayCodeType }
     *     
     */
    public void setEvenPayCode(EvenPayCodeType value) {
        this.evenPayCode = value;
    }

    /**
     * Gets the value of the payAllIntCode property.
     * 
     * @return
     *     possible object is
     *     {@link PayAllIntCodeType }
     *     
     */
    public PayAllIntCodeType getPayAllIntCode() {
        return payAllIntCode;
    }

    /**
     * Sets the value of the payAllIntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayAllIntCodeType }
     *     
     */
    public void setPayAllIntCode(PayAllIntCodeType value) {
        this.payAllIntCode = value;
    }

    /**
     * Gets the value of the renCode property.
     * 
     * @return
     *     possible object is
     *     {@link RenCodeType }
     *     
     */
    public RenCodeType getRenCode() {
        return renCode;
    }

    /**
     * Sets the value of the renCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenCodeType }
     *     
     */
    public void setRenCode(RenCodeType value) {
        this.renCode = value;
    }

    /**
     * Gets the value of the rateSchedCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateSchedCodeType }
     *     
     */
    public RateSchedCodeType getRateSchedCode() {
        return rateSchedCode;
    }

    /**
     * Sets the value of the rateSchedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSchedCodeType }
     *     
     */
    public void setRateSchedCode(RateSchedCodeType value) {
        this.rateSchedCode = value;
    }

    /**
     * Gets the value of the intPmtDtCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntPmtDtCodeType }
     *     
     */
    public IntPmtDtCodeType getIntPmtDtCode() {
        return intPmtDtCode;
    }

    /**
     * Sets the value of the intPmtDtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPmtDtCodeType }
     *     
     */
    public void setIntPmtDtCode(IntPmtDtCodeType value) {
        this.intPmtDtCode = value;
    }

    /**
     * Gets the value of the primeRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeRateIdxType }
     *     
     */
    public PrimeRateIdxType getPrimeRateIdx() {
        return primeRateIdx;
    }

    /**
     * Sets the value of the primeRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeRateIdxType }
     *     
     */
    public void setPrimeRateIdx(PrimeRateIdxType value) {
        this.primeRateIdx = value;
    }

    /**
     * Gets the value of the callRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptCodeType }
     *     
     */
    public CallRptCodeType getCallRptCode() {
        return callRptCode;
    }

    /**
     * Sets the value of the callRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptCodeType }
     *     
     */
    public void setCallRptCode(CallRptCodeType value) {
        this.callRptCode = value;
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
     * Gets the value of the penCode property.
     * 
     * @return
     *     possible object is
     *     {@link PenCodeType }
     *     
     */
    public PenCodeType getPenCode() {
        return penCode;
    }

    /**
     * Sets the value of the penCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenCodeType }
     *     
     */
    public void setPenCode(PenCodeType value) {
        this.penCode = value;
    }

    /**
     * Gets the value of the multiRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link MultiRateCodeType }
     *     
     */
    public MultiRateCodeType getMultiRateCode() {
        return multiRateCode;
    }

    /**
     * Sets the value of the multiRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRateCodeType }
     *     
     */
    public void setMultiRateCode(MultiRateCodeType value) {
        this.multiRateCode = value;
    }

    /**
     * Gets the value of the multiDrCode property.
     * 
     * @return
     *     possible object is
     *     {@link MultiDrCodeType }
     *     
     */
    public MultiDrCodeType getMultiDrCode() {
        return multiDrCode;
    }

    /**
     * Sets the value of the multiDrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiDrCodeType }
     *     
     */
    public void setMultiDrCode(MultiDrCodeType value) {
        this.multiDrCode = value;
    }

    /**
     * Gets the value of the stmtPasCode property.
     * 
     * @return
     *     possible object is
     *     {@link StmtPasCodeType }
     *     
     */
    public StmtPasCodeType getStmtPasCode() {
        return stmtPasCode;
    }

    /**
     * Sets the value of the stmtPasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtPasCodeType }
     *     
     */
    public void setStmtPasCode(StmtPasCodeType value) {
        this.stmtPasCode = value;
    }

    /**
     * Gets the value of the stmtFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFreqCodeType }
     *     
     */
    public StmtFreqCodeType getStmtFreqCode() {
        return stmtFreqCode;
    }

    /**
     * Sets the value of the stmtFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFreqCodeType }
     *     
     */
    public void setStmtFreqCode(StmtFreqCodeType value) {
        this.stmtFreqCode = value;
    }

    /**
     * Gets the value of the papreLessCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaperLessCodeType }
     *     
     */
    public PaperLessCodeType getPapreLessCode() {
        return papreLessCode;
    }

    /**
     * Sets the value of the papreLessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperLessCodeType }
     *     
     */
    public void setPapreLessCode(PaperLessCodeType value) {
        this.papreLessCode = value;
    }

    /**
     * Gets the value of the fedWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link FedWithCodeType }
     *     
     */
    public FedWithCodeType getFedWithCode() {
        return fedWithCode;
    }

    /**
     * Sets the value of the fedWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedWithCodeType }
     *     
     */
    public void setFedWithCode(FedWithCodeType value) {
        this.fedWithCode = value;
    }

    /**
     * Gets the value of the hldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link HldMailCodeType }
     *     
     */
    public HldMailCodeType getHldMailCode() {
        return hldMailCode;
    }

    /**
     * Sets the value of the hldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldMailCodeType }
     *     
     */
    public void setHldMailCode(HldMailCodeType value) {
        this.hldMailCode = value;
    }

    /**
     * Gets the value of the incCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link IncCombStmtType }
     *     
     */
    public IncCombStmtType getIncCombStmt() {
        return incCombStmt;
    }

    /**
     * Sets the value of the incCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncCombStmtType }
     *     
     */
    public void setIncCombStmt(IncCombStmtType value) {
        this.incCombStmt = value;
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
