
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
 * <p>Java class for DepStmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepStmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtCycle" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntCycle" type="{http://jackhenry.com/jxchange/TPG/2008}IntCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgCycle" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgWavExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgWavExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtPasCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtPasCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvl" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="ItmTrunc" type="{http://jackhenry.com/jxchange/TPG/2008}ItmTrunc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtDay" type="{http://jackhenry.com/jxchange/TPG/2008}StmtDay_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtPrtCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtPrtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtSerChg" type="{http://jackhenry.com/jxchange/TPG/2008}StmtSerChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtFreq" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtCrInt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgPrtChkOrderCode" type="{http://jackhenry.com/jxchange/TPG/2008}ImgPrtChkOrderCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItemsPerPgCode" type="{http://jackhenry.com/jxchange/TPG/2008}ImgItemsPerPgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItemsFrntBackCode" type="{http://jackhenry.com/jxchange/TPG/2008}ImgItemsFrntBackCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgIncCrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ImgIncCrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtCycResetFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCycResetFreqCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtFormatCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFormatCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ElecStmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecStmtType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ElecStmtChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}ElecStmtChgWav_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ImgActFeeType" type="{http://jackhenry.com/jxchange/TPG/2008}ImgActFeeType_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrtAddeType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtAddeType_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrtAddeCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RecCnt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="ElecStmtSvcFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}ElecStmtSvcFeeCode_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="ChgBadAddrFeeType" type="{http://jackhenry.com/jxchange/TPG/2008}ChgBadAddrFeeType_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "DepStmtInfo_CType", propOrder = {
    "incCombStmt",
    "lastStmtDt",
    "stmtCycle",
    "intCycle",
    "serChgCycle",
    "serChgWavExpDt",
    "stmtPasCode",
    "serChgLvl",
    "itmTrunc",
    "nxtStmtDt",
    "stmtDay",
    "stmtFreqCode",
    "stmtPrtCode",
    "stmtSerChg",
    "stmtFreq",
    "stmtCrInt",
    "imgPrtChkOrderCode",
    "imgItemsPerPgCode",
    "imgItemsFrntBackCode",
    "imgIncCrCode",
    "stmtCycResetFreqCode",
    "stmtFormatCode",
    "ver1",
    "elecStmtType",
    "elecStmtChgWav",
    "ver2",
    "imgActFeeType",
    "prtAddeType",
    "prtAddeCnt",
    "ver3",
    "elecStmtSvcFeeCode",
    "ver4",
    "chgBadAddrFeeType",
    "ver5",
    "any"
})
public class DepStmtInfoCType {

    @XmlElementRef(name = "IncCombStmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncCombStmtType> incCombStmt;
    @XmlElementRef(name = "LastStmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastStmtDtType> lastStmtDt;
    @XmlElementRef(name = "StmtCycle", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtCycleType> stmtCycle;
    @XmlElementRef(name = "IntCycle", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntCycleType> intCycle;
    @XmlElementRef(name = "SerChgCycle", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgCycleType> serChgCycle;
    @XmlElementRef(name = "SerChgWavExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgWavExpDtType> serChgWavExpDt;
    @XmlElementRef(name = "StmtPasCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtPasCodeType> stmtPasCode;
    @XmlElementRef(name = "SerChgLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgLvlType> serChgLvl;
    @XmlElementRef(name = "ItmTrunc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ItmTruncType> itmTrunc;
    @XmlElementRef(name = "NxtStmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtStmtDtType> nxtStmtDt;
    @XmlElementRef(name = "StmtDay", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtDayType> stmtDay;
    @XmlElementRef(name = "StmtFreqCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtFreqCodeType> stmtFreqCode;
    @XmlElementRef(name = "StmtPrtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtPrtCodeType> stmtPrtCode;
    @XmlElementRef(name = "StmtSerChg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtSerChgType> stmtSerChg;
    @XmlElementRef(name = "StmtFreq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtFreqType> stmtFreq;
    @XmlElementRef(name = "StmtCrInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtCrIntType> stmtCrInt;
    @XmlElementRef(name = "ImgPrtChkOrderCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImgPrtChkOrderCodeType> imgPrtChkOrderCode;
    @XmlElementRef(name = "ImgItemsPerPgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImgItemsPerPgCodeType> imgItemsPerPgCode;
    @XmlElementRef(name = "ImgItemsFrntBackCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImgItemsFrntBackCodeType> imgItemsFrntBackCode;
    @XmlElementRef(name = "ImgIncCrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImgIncCrCodeType> imgIncCrCode;
    @XmlElementRef(name = "StmtCycResetFreqCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtCycResetFreqCodeType> stmtCycResetFreqCode;
    @XmlElementRef(name = "StmtFormatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtFormatCodeType> stmtFormatCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ElecStmtType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ElecStmtTypeType> elecStmtType;
    @XmlElementRef(name = "ElecStmtChgWav", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ElecStmtChgWavType> elecStmtChgWav;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ImgActFeeType")
    protected ImgActFeeTypeType imgActFeeType;
    @XmlElement(name = "PrtAddeType")
    protected PrtAddeTypeType prtAddeType;
    @XmlElement(name = "PrtAddeCnt")
    protected RecCntType prtAddeCnt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "ElecStmtSvcFeeCode")
    protected ElecStmtSvcFeeCodeType elecStmtSvcFeeCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "ChgBadAddrFeeType")
    protected ChgBadAddrFeeTypeType chgBadAddrFeeType;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the incCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public JAXBElement<IncCombStmtType> getIncCombStmt() {
        return incCombStmt;
    }

    /**
     * Sets the value of the incCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public void setIncCombStmt(JAXBElement<IncCombStmtType> value) {
        this.incCombStmt = value;
    }

    /**
     * Gets the value of the lastStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastStmtDtType }{@code >}
     *     
     */
    public JAXBElement<LastStmtDtType> getLastStmtDt() {
        return lastStmtDt;
    }

    /**
     * Sets the value of the lastStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastStmtDtType }{@code >}
     *     
     */
    public void setLastStmtDt(JAXBElement<LastStmtDtType> value) {
        this.lastStmtDt = value;
    }

    /**
     * Gets the value of the stmtCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtCycleType }{@code >}
     *     
     */
    public JAXBElement<StmtCycleType> getStmtCycle() {
        return stmtCycle;
    }

    /**
     * Sets the value of the stmtCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtCycleType }{@code >}
     *     
     */
    public void setStmtCycle(JAXBElement<StmtCycleType> value) {
        this.stmtCycle = value;
    }

    /**
     * Gets the value of the intCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntCycleType }{@code >}
     *     
     */
    public JAXBElement<IntCycleType> getIntCycle() {
        return intCycle;
    }

    /**
     * Sets the value of the intCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntCycleType }{@code >}
     *     
     */
    public void setIntCycle(JAXBElement<IntCycleType> value) {
        this.intCycle = value;
    }

    /**
     * Gets the value of the serChgCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgCycleType }{@code >}
     *     
     */
    public JAXBElement<SerChgCycleType> getSerChgCycle() {
        return serChgCycle;
    }

    /**
     * Sets the value of the serChgCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgCycleType }{@code >}
     *     
     */
    public void setSerChgCycle(JAXBElement<SerChgCycleType> value) {
        this.serChgCycle = value;
    }

    /**
     * Gets the value of the serChgWavExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavExpDtType }{@code >}
     *     
     */
    public JAXBElement<SerChgWavExpDtType> getSerChgWavExpDt() {
        return serChgWavExpDt;
    }

    /**
     * Sets the value of the serChgWavExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavExpDtType }{@code >}
     *     
     */
    public void setSerChgWavExpDt(JAXBElement<SerChgWavExpDtType> value) {
        this.serChgWavExpDt = value;
    }

    /**
     * Gets the value of the stmtPasCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtPasCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtPasCodeType> getStmtPasCode() {
        return stmtPasCode;
    }

    /**
     * Sets the value of the stmtPasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtPasCodeType }{@code >}
     *     
     */
    public void setStmtPasCode(JAXBElement<StmtPasCodeType> value) {
        this.stmtPasCode = value;
    }

    /**
     * Gets the value of the serChgLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlType }{@code >}
     *     
     */
    public JAXBElement<SerChgLvlType> getSerChgLvl() {
        return serChgLvl;
    }

    /**
     * Sets the value of the serChgLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlType }{@code >}
     *     
     */
    public void setSerChgLvl(JAXBElement<SerChgLvlType> value) {
        this.serChgLvl = value;
    }

    /**
     * Gets the value of the itmTrunc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItmTruncType }{@code >}
     *     
     */
    public JAXBElement<ItmTruncType> getItmTrunc() {
        return itmTrunc;
    }

    /**
     * Sets the value of the itmTrunc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItmTruncType }{@code >}
     *     
     */
    public void setItmTrunc(JAXBElement<ItmTruncType> value) {
        this.itmTrunc = value;
    }

    /**
     * Gets the value of the nxtStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NxtStmtDtType }{@code >}
     *     
     */
    public JAXBElement<NxtStmtDtType> getNxtStmtDt() {
        return nxtStmtDt;
    }

    /**
     * Sets the value of the nxtStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NxtStmtDtType }{@code >}
     *     
     */
    public void setNxtStmtDt(JAXBElement<NxtStmtDtType> value) {
        this.nxtStmtDt = value;
    }

    /**
     * Gets the value of the stmtDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtDayType }{@code >}
     *     
     */
    public JAXBElement<StmtDayType> getStmtDay() {
        return stmtDay;
    }

    /**
     * Sets the value of the stmtDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtDayType }{@code >}
     *     
     */
    public void setStmtDay(JAXBElement<StmtDayType> value) {
        this.stmtDay = value;
    }

    /**
     * Gets the value of the stmtFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtFreqCodeType> getStmtFreqCode() {
        return stmtFreqCode;
    }

    /**
     * Sets the value of the stmtFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqCodeType }{@code >}
     *     
     */
    public void setStmtFreqCode(JAXBElement<StmtFreqCodeType> value) {
        this.stmtFreqCode = value;
    }

    /**
     * Gets the value of the stmtPrtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtPrtCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtPrtCodeType> getStmtPrtCode() {
        return stmtPrtCode;
    }

    /**
     * Sets the value of the stmtPrtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtPrtCodeType }{@code >}
     *     
     */
    public void setStmtPrtCode(JAXBElement<StmtPrtCodeType> value) {
        this.stmtPrtCode = value;
    }

    /**
     * Gets the value of the stmtSerChg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtSerChgType }{@code >}
     *     
     */
    public JAXBElement<StmtSerChgType> getStmtSerChg() {
        return stmtSerChg;
    }

    /**
     * Sets the value of the stmtSerChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtSerChgType }{@code >}
     *     
     */
    public void setStmtSerChg(JAXBElement<StmtSerChgType> value) {
        this.stmtSerChg = value;
    }

    /**
     * Gets the value of the stmtFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqType }{@code >}
     *     
     */
    public JAXBElement<StmtFreqType> getStmtFreq() {
        return stmtFreq;
    }

    /**
     * Sets the value of the stmtFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqType }{@code >}
     *     
     */
    public void setStmtFreq(JAXBElement<StmtFreqType> value) {
        this.stmtFreq = value;
    }

    /**
     * Gets the value of the stmtCrInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtCrIntType }{@code >}
     *     
     */
    public JAXBElement<StmtCrIntType> getStmtCrInt() {
        return stmtCrInt;
    }

    /**
     * Sets the value of the stmtCrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtCrIntType }{@code >}
     *     
     */
    public void setStmtCrInt(JAXBElement<StmtCrIntType> value) {
        this.stmtCrInt = value;
    }

    /**
     * Gets the value of the imgPrtChkOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImgPrtChkOrderCodeType }{@code >}
     *     
     */
    public JAXBElement<ImgPrtChkOrderCodeType> getImgPrtChkOrderCode() {
        return imgPrtChkOrderCode;
    }

    /**
     * Sets the value of the imgPrtChkOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImgPrtChkOrderCodeType }{@code >}
     *     
     */
    public void setImgPrtChkOrderCode(JAXBElement<ImgPrtChkOrderCodeType> value) {
        this.imgPrtChkOrderCode = value;
    }

    /**
     * Gets the value of the imgItemsPerPgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImgItemsPerPgCodeType }{@code >}
     *     
     */
    public JAXBElement<ImgItemsPerPgCodeType> getImgItemsPerPgCode() {
        return imgItemsPerPgCode;
    }

    /**
     * Sets the value of the imgItemsPerPgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImgItemsPerPgCodeType }{@code >}
     *     
     */
    public void setImgItemsPerPgCode(JAXBElement<ImgItemsPerPgCodeType> value) {
        this.imgItemsPerPgCode = value;
    }

    /**
     * Gets the value of the imgItemsFrntBackCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImgItemsFrntBackCodeType }{@code >}
     *     
     */
    public JAXBElement<ImgItemsFrntBackCodeType> getImgItemsFrntBackCode() {
        return imgItemsFrntBackCode;
    }

    /**
     * Sets the value of the imgItemsFrntBackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImgItemsFrntBackCodeType }{@code >}
     *     
     */
    public void setImgItemsFrntBackCode(JAXBElement<ImgItemsFrntBackCodeType> value) {
        this.imgItemsFrntBackCode = value;
    }

    /**
     * Gets the value of the imgIncCrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImgIncCrCodeType }{@code >}
     *     
     */
    public JAXBElement<ImgIncCrCodeType> getImgIncCrCode() {
        return imgIncCrCode;
    }

    /**
     * Sets the value of the imgIncCrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImgIncCrCodeType }{@code >}
     *     
     */
    public void setImgIncCrCode(JAXBElement<ImgIncCrCodeType> value) {
        this.imgIncCrCode = value;
    }

    /**
     * Gets the value of the stmtCycResetFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtCycResetFreqCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtCycResetFreqCodeType> getStmtCycResetFreqCode() {
        return stmtCycResetFreqCode;
    }

    /**
     * Sets the value of the stmtCycResetFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtCycResetFreqCodeType }{@code >}
     *     
     */
    public void setStmtCycResetFreqCode(JAXBElement<StmtCycResetFreqCodeType> value) {
        this.stmtCycResetFreqCode = value;
    }

    /**
     * Gets the value of the stmtFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtFormatCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtFormatCodeType> getStmtFormatCode() {
        return stmtFormatCode;
    }

    /**
     * Sets the value of the stmtFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtFormatCodeType }{@code >}
     *     
     */
    public void setStmtFormatCode(JAXBElement<StmtFormatCodeType> value) {
        this.stmtFormatCode = value;
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
     * Gets the value of the elecStmtType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElecStmtTypeType }{@code >}
     *     
     */
    public JAXBElement<ElecStmtTypeType> getElecStmtType() {
        return elecStmtType;
    }

    /**
     * Sets the value of the elecStmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElecStmtTypeType }{@code >}
     *     
     */
    public void setElecStmtType(JAXBElement<ElecStmtTypeType> value) {
        this.elecStmtType = value;
    }

    /**
     * Gets the value of the elecStmtChgWav property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElecStmtChgWavType }{@code >}
     *     
     */
    public JAXBElement<ElecStmtChgWavType> getElecStmtChgWav() {
        return elecStmtChgWav;
    }

    /**
     * Sets the value of the elecStmtChgWav property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElecStmtChgWavType }{@code >}
     *     
     */
    public void setElecStmtChgWav(JAXBElement<ElecStmtChgWavType> value) {
        this.elecStmtChgWav = value;
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
     * Gets the value of the imgActFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link ImgActFeeTypeType }
     *     
     */
    public ImgActFeeTypeType getImgActFeeType() {
        return imgActFeeType;
    }

    /**
     * Sets the value of the imgActFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgActFeeTypeType }
     *     
     */
    public void setImgActFeeType(ImgActFeeTypeType value) {
        this.imgActFeeType = value;
    }

    /**
     * Gets the value of the prtAddeType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtAddeTypeType }
     *     
     */
    public PrtAddeTypeType getPrtAddeType() {
        return prtAddeType;
    }

    /**
     * Sets the value of the prtAddeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtAddeTypeType }
     *     
     */
    public void setPrtAddeType(PrtAddeTypeType value) {
        this.prtAddeType = value;
    }

    /**
     * Gets the value of the prtAddeCnt property.
     * 
     * @return
     *     possible object is
     *     {@link RecCntType }
     *     
     */
    public RecCntType getPrtAddeCnt() {
        return prtAddeCnt;
    }

    /**
     * Sets the value of the prtAddeCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCntType }
     *     
     */
    public void setPrtAddeCnt(RecCntType value) {
        this.prtAddeCnt = value;
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
     * Gets the value of the elecStmtSvcFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElecStmtSvcFeeCodeType }
     *     
     */
    public ElecStmtSvcFeeCodeType getElecStmtSvcFeeCode() {
        return elecStmtSvcFeeCode;
    }

    /**
     * Sets the value of the elecStmtSvcFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecStmtSvcFeeCodeType }
     *     
     */
    public void setElecStmtSvcFeeCode(ElecStmtSvcFeeCodeType value) {
        this.elecStmtSvcFeeCode = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
    }

    /**
     * Gets the value of the chgBadAddrFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChgBadAddrFeeTypeType }
     *     
     */
    public ChgBadAddrFeeTypeType getChgBadAddrFeeType() {
        return chgBadAddrFeeType;
    }

    /**
     * Sets the value of the chgBadAddrFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgBadAddrFeeTypeType }
     *     
     */
    public void setChgBadAddrFeeType(ChgBadAddrFeeTypeType value) {
        this.chgBadAddrFeeType = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
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
