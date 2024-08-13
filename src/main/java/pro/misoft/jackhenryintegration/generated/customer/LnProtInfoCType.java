
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for LnProtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnProtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StmtCycle" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProtBalZero" type="{http://jackhenry.com/jxchange/TPG/2008}ProtBalZero_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProtAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ProtAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProtAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ProtAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtPct" type="{http://jackhenry.com/jxchange/TPG/2008}PmtPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDDANSFCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDDANSFCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCnt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODProtPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}ODProtPmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MaxPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCTotAdvaAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCTotAdvaAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCTaxRefId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCTaxRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCHighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCDaysAtZero" type="{http://jackhenry.com/jxchange/TPG/2008}LOCDaysAtZero_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvg" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvg_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastStmtBal" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastAdvaDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastAdvaDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FrzPmtPastDue" type="{http://jackhenry.com/jxchange/TPG/2008}FrzPmtPastDue_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctHldDt" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctHldDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DDAMinBalAdv" type="{http://jackhenry.com/jxchange/TPG/2008}DDAMinBalAdv_Type" minOccurs="0"/&gt;
 *         &lt;element name="AdvaTot" type="{http://jackhenry.com/jxchange/TPG/2008}AdvaTot_Type" minOccurs="0"/&gt;
 *         &lt;element name="AdvaCnt" type="{http://jackhenry.com/jxchange/TPG/2008}AdvaCnt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LOCCycleAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCycleAcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCCycleAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCycleAcctType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LOCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCExpDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="ExclHldXferCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExclHldXferCode_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="ProtAcctArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProtAcctArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="ExclCustLOC" type="{http://jackhenry.com/jxchange/TPG/2008}ExclCustLOC_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="LOCHighAmtYTD" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHighAmtYTD_Type" minOccurs="0"/&gt;
 *                     &lt;element name="LOCHighAmtPrevYTD" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHighAmtPrevYTD_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/sequence&gt;
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
@XmlType(name = "LnProtInfo_CType", propOrder = {
    "stmtCycle",
    "protBalZero",
    "protAcctType",
    "protAcctId",
    "pmtPct",
    "pmtDDANSFCode",
    "pmtCnt",
    "odProtPmtCode",
    "minPmtAmt",
    "maxPmtAmt",
    "locTotAdvaAmt",
    "locTaxRefId",
    "locLowAmt",
    "locLmt",
    "locHighAmt",
    "locDaysAtZero",
    "locAvg",
    "lastStmtDt",
    "lastStmtBal",
    "lastAdvaDt",
    "frzPmtPastDue",
    "drAcctType",
    "drAcctId",
    "drAcctHldDt",
    "drAcctExpDt",
    "ddaMinBalAdv",
    "advaTot",
    "advaCnt",
    "ver1",
    "locCycleAcctId",
    "locCycleAcctType",
    "ver2",
    "locExpDt",
    "ver3",
    "exclHldXferCode",
    "ver4",
    "protAcctArray",
    "ver5",
    "exclCustLOC",
    "ver6",
    "locHighAmtYTD",
    "locHighAmtPrevYTD",
    "ver7",
    "any"
})
public class LnProtInfoCType {

    @XmlElementRef(name = "StmtCycle", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtCycleType> stmtCycle;
    @XmlElementRef(name = "ProtBalZero", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtBalZeroType> protBalZero;
    @XmlElementRef(name = "ProtAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtAcctTypeType> protAcctType;
    @XmlElementRef(name = "ProtAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtAcctIdType> protAcctId;
    @XmlElementRef(name = "PmtPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtPctType> pmtPct;
    @XmlElementRef(name = "PmtDDANSFCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtDDANSFCodeType> pmtDDANSFCode;
    @XmlElementRef(name = "PmtCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtCntType> pmtCnt;
    @XmlElementRef(name = "ODProtPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODProtPmtCodeType> odProtPmtCode;
    @XmlElementRef(name = "MinPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinPmtAmtType> minPmtAmt;
    @XmlElementRef(name = "MaxPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MaxPmtAmtType> maxPmtAmt;
    @XmlElementRef(name = "LOCTotAdvaAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCTotAdvaAmtType> locTotAdvaAmt;
    @XmlElementRef(name = "LOCTaxRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCTaxRefIdType> locTaxRefId;
    @XmlElementRef(name = "LOCLowAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCLowAmtType> locLowAmt;
    @XmlElementRef(name = "LOCLmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCLmtType> locLmt;
    @XmlElementRef(name = "LOCHighAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCHighAmtType> locHighAmt;
    @XmlElementRef(name = "LOCDaysAtZero", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCDaysAtZeroType> locDaysAtZero;
    @XmlElementRef(name = "LOCAvg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCAvgType> locAvg;
    @XmlElementRef(name = "LastStmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastStmtDtType> lastStmtDt;
    @XmlElementRef(name = "LastStmtBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastStmtBalType> lastStmtBal;
    @XmlElementRef(name = "LastAdvaDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastAdvaDtType> lastAdvaDt;
    @XmlElementRef(name = "FrzPmtPastDue", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FrzPmtPastDueType> frzPmtPastDue;
    @XmlElementRef(name = "DrAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DrAcctTypeType> drAcctType;
    @XmlElementRef(name = "DrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DrAcctIdType> drAcctId;
    @XmlElementRef(name = "DrAcctHldDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DrAcctHldDtType> drAcctHldDt;
    @XmlElementRef(name = "DrAcctExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DrAcctExpDtType> drAcctExpDt;
    @XmlElementRef(name = "DDAMinBalAdv", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DDAMinBalAdvType> ddaMinBalAdv;
    @XmlElementRef(name = "AdvaTot", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AdvaTotType> advaTot;
    @XmlElementRef(name = "AdvaCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AdvaCntType> advaCnt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "LOCCycleAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCCycleAcctIdType> locCycleAcctId;
    @XmlElementRef(name = "LOCCycleAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCCycleAcctTypeType> locCycleAcctType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "LOCExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCExpDtType> locExpDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "ExclHldXferCode")
    protected ExclHldXferCodeType exclHldXferCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "ProtAcctArray")
    protected ProtAcctArrayAType protAcctArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "ExclCustLOC")
    protected ExclCustLOCType exclCustLOC;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "LOCHighAmtYTD")
    protected LOCHighAmtYTDType locHighAmtYTD;
    @XmlElement(name = "LOCHighAmtPrevYTD")
    protected LOCHighAmtPrevYTDType locHighAmtPrevYTD;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the protBalZero property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProtBalZeroType }{@code >}
     *     
     */
    public JAXBElement<ProtBalZeroType> getProtBalZero() {
        return protBalZero;
    }

    /**
     * Sets the value of the protBalZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProtBalZeroType }{@code >}
     *     
     */
    public void setProtBalZero(JAXBElement<ProtBalZeroType> value) {
        this.protBalZero = value;
    }

    /**
     * Gets the value of the protAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProtAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<ProtAcctTypeType> getProtAcctType() {
        return protAcctType;
    }

    /**
     * Sets the value of the protAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProtAcctTypeType }{@code >}
     *     
     */
    public void setProtAcctType(JAXBElement<ProtAcctTypeType> value) {
        this.protAcctType = value;
    }

    /**
     * Gets the value of the protAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProtAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ProtAcctIdType> getProtAcctId() {
        return protAcctId;
    }

    /**
     * Sets the value of the protAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProtAcctIdType }{@code >}
     *     
     */
    public void setProtAcctId(JAXBElement<ProtAcctIdType> value) {
        this.protAcctId = value;
    }

    /**
     * Gets the value of the pmtPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtPctType }{@code >}
     *     
     */
    public JAXBElement<PmtPctType> getPmtPct() {
        return pmtPct;
    }

    /**
     * Sets the value of the pmtPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtPctType }{@code >}
     *     
     */
    public void setPmtPct(JAXBElement<PmtPctType> value) {
        this.pmtPct = value;
    }

    /**
     * Gets the value of the pmtDDANSFCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtDDANSFCodeType }{@code >}
     *     
     */
    public JAXBElement<PmtDDANSFCodeType> getPmtDDANSFCode() {
        return pmtDDANSFCode;
    }

    /**
     * Sets the value of the pmtDDANSFCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtDDANSFCodeType }{@code >}
     *     
     */
    public void setPmtDDANSFCode(JAXBElement<PmtDDANSFCodeType> value) {
        this.pmtDDANSFCode = value;
    }

    /**
     * Gets the value of the pmtCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtCntType }{@code >}
     *     
     */
    public JAXBElement<PmtCntType> getPmtCnt() {
        return pmtCnt;
    }

    /**
     * Sets the value of the pmtCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtCntType }{@code >}
     *     
     */
    public void setPmtCnt(JAXBElement<PmtCntType> value) {
        this.pmtCnt = value;
    }

    /**
     * Gets the value of the odProtPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODProtPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<ODProtPmtCodeType> getODProtPmtCode() {
        return odProtPmtCode;
    }

    /**
     * Sets the value of the odProtPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODProtPmtCodeType }{@code >}
     *     
     */
    public void setODProtPmtCode(JAXBElement<ODProtPmtCodeType> value) {
        this.odProtPmtCode = value;
    }

    /**
     * Gets the value of the minPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<MinPmtAmtType> getMinPmtAmt() {
        return minPmtAmt;
    }

    /**
     * Sets the value of the minPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinPmtAmtType }{@code >}
     *     
     */
    public void setMinPmtAmt(JAXBElement<MinPmtAmtType> value) {
        this.minPmtAmt = value;
    }

    /**
     * Gets the value of the maxPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaxPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<MaxPmtAmtType> getMaxPmtAmt() {
        return maxPmtAmt;
    }

    /**
     * Sets the value of the maxPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaxPmtAmtType }{@code >}
     *     
     */
    public void setMaxPmtAmt(JAXBElement<MaxPmtAmtType> value) {
        this.maxPmtAmt = value;
    }

    /**
     * Gets the value of the locTotAdvaAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCTotAdvaAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCTotAdvaAmtType> getLOCTotAdvaAmt() {
        return locTotAdvaAmt;
    }

    /**
     * Sets the value of the locTotAdvaAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCTotAdvaAmtType }{@code >}
     *     
     */
    public void setLOCTotAdvaAmt(JAXBElement<LOCTotAdvaAmtType> value) {
        this.locTotAdvaAmt = value;
    }

    /**
     * Gets the value of the locTaxRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCTaxRefIdType }{@code >}
     *     
     */
    public JAXBElement<LOCTaxRefIdType> getLOCTaxRefId() {
        return locTaxRefId;
    }

    /**
     * Sets the value of the locTaxRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCTaxRefIdType }{@code >}
     *     
     */
    public void setLOCTaxRefId(JAXBElement<LOCTaxRefIdType> value) {
        this.locTaxRefId = value;
    }

    /**
     * Gets the value of the locLowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCLowAmtType> getLOCLowAmt() {
        return locLowAmt;
    }

    /**
     * Sets the value of the locLowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCLowAmtType }{@code >}
     *     
     */
    public void setLOCLowAmt(JAXBElement<LOCLowAmtType> value) {
        this.locLowAmt = value;
    }

    /**
     * Gets the value of the locLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCLmtType }{@code >}
     *     
     */
    public JAXBElement<LOCLmtType> getLOCLmt() {
        return locLmt;
    }

    /**
     * Sets the value of the locLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCLmtType }{@code >}
     *     
     */
    public void setLOCLmt(JAXBElement<LOCLmtType> value) {
        this.locLmt = value;
    }

    /**
     * Gets the value of the locHighAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtType }{@code >}
     *     
     */
    public JAXBElement<LOCHighAmtType> getLOCHighAmt() {
        return locHighAmt;
    }

    /**
     * Sets the value of the locHighAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCHighAmtType }{@code >}
     *     
     */
    public void setLOCHighAmt(JAXBElement<LOCHighAmtType> value) {
        this.locHighAmt = value;
    }

    /**
     * Gets the value of the locDaysAtZero property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCDaysAtZeroType }{@code >}
     *     
     */
    public JAXBElement<LOCDaysAtZeroType> getLOCDaysAtZero() {
        return locDaysAtZero;
    }

    /**
     * Sets the value of the locDaysAtZero property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCDaysAtZeroType }{@code >}
     *     
     */
    public void setLOCDaysAtZero(JAXBElement<LOCDaysAtZeroType> value) {
        this.locDaysAtZero = value;
    }

    /**
     * Gets the value of the locAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCAvgType }{@code >}
     *     
     */
    public JAXBElement<LOCAvgType> getLOCAvg() {
        return locAvg;
    }

    /**
     * Sets the value of the locAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCAvgType }{@code >}
     *     
     */
    public void setLOCAvg(JAXBElement<LOCAvgType> value) {
        this.locAvg = value;
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
     * Gets the value of the lastStmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastStmtBalType }{@code >}
     *     
     */
    public JAXBElement<LastStmtBalType> getLastStmtBal() {
        return lastStmtBal;
    }

    /**
     * Sets the value of the lastStmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastStmtBalType }{@code >}
     *     
     */
    public void setLastStmtBal(JAXBElement<LastStmtBalType> value) {
        this.lastStmtBal = value;
    }

    /**
     * Gets the value of the lastAdvaDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastAdvaDtType }{@code >}
     *     
     */
    public JAXBElement<LastAdvaDtType> getLastAdvaDt() {
        return lastAdvaDt;
    }

    /**
     * Sets the value of the lastAdvaDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastAdvaDtType }{@code >}
     *     
     */
    public void setLastAdvaDt(JAXBElement<LastAdvaDtType> value) {
        this.lastAdvaDt = value;
    }

    /**
     * Gets the value of the frzPmtPastDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrzPmtPastDueType }{@code >}
     *     
     */
    public JAXBElement<FrzPmtPastDueType> getFrzPmtPastDue() {
        return frzPmtPastDue;
    }

    /**
     * Sets the value of the frzPmtPastDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrzPmtPastDueType }{@code >}
     *     
     */
    public void setFrzPmtPastDue(JAXBElement<FrzPmtPastDueType> value) {
        this.frzPmtPastDue = value;
    }

    /**
     * Gets the value of the drAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DrAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<DrAcctTypeType> getDrAcctType() {
        return drAcctType;
    }

    /**
     * Sets the value of the drAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DrAcctTypeType }{@code >}
     *     
     */
    public void setDrAcctType(JAXBElement<DrAcctTypeType> value) {
        this.drAcctType = value;
    }

    /**
     * Gets the value of the drAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DrAcctIdType }{@code >}
     *     
     */
    public JAXBElement<DrAcctIdType> getDrAcctId() {
        return drAcctId;
    }

    /**
     * Sets the value of the drAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DrAcctIdType }{@code >}
     *     
     */
    public void setDrAcctId(JAXBElement<DrAcctIdType> value) {
        this.drAcctId = value;
    }

    /**
     * Gets the value of the drAcctHldDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DrAcctHldDtType }{@code >}
     *     
     */
    public JAXBElement<DrAcctHldDtType> getDrAcctHldDt() {
        return drAcctHldDt;
    }

    /**
     * Sets the value of the drAcctHldDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DrAcctHldDtType }{@code >}
     *     
     */
    public void setDrAcctHldDt(JAXBElement<DrAcctHldDtType> value) {
        this.drAcctHldDt = value;
    }

    /**
     * Gets the value of the drAcctExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DrAcctExpDtType }{@code >}
     *     
     */
    public JAXBElement<DrAcctExpDtType> getDrAcctExpDt() {
        return drAcctExpDt;
    }

    /**
     * Sets the value of the drAcctExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DrAcctExpDtType }{@code >}
     *     
     */
    public void setDrAcctExpDt(JAXBElement<DrAcctExpDtType> value) {
        this.drAcctExpDt = value;
    }

    /**
     * Gets the value of the ddaMinBalAdv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DDAMinBalAdvType }{@code >}
     *     
     */
    public JAXBElement<DDAMinBalAdvType> getDDAMinBalAdv() {
        return ddaMinBalAdv;
    }

    /**
     * Sets the value of the ddaMinBalAdv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DDAMinBalAdvType }{@code >}
     *     
     */
    public void setDDAMinBalAdv(JAXBElement<DDAMinBalAdvType> value) {
        this.ddaMinBalAdv = value;
    }

    /**
     * Gets the value of the advaTot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdvaTotType }{@code >}
     *     
     */
    public JAXBElement<AdvaTotType> getAdvaTot() {
        return advaTot;
    }

    /**
     * Sets the value of the advaTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdvaTotType }{@code >}
     *     
     */
    public void setAdvaTot(JAXBElement<AdvaTotType> value) {
        this.advaTot = value;
    }

    /**
     * Gets the value of the advaCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdvaCntType }{@code >}
     *     
     */
    public JAXBElement<AdvaCntType> getAdvaCnt() {
        return advaCnt;
    }

    /**
     * Sets the value of the advaCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdvaCntType }{@code >}
     *     
     */
    public void setAdvaCnt(JAXBElement<AdvaCntType> value) {
        this.advaCnt = value;
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
     * Gets the value of the locCycleAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCCycleAcctIdType }{@code >}
     *     
     */
    public JAXBElement<LOCCycleAcctIdType> getLOCCycleAcctId() {
        return locCycleAcctId;
    }

    /**
     * Sets the value of the locCycleAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCCycleAcctIdType }{@code >}
     *     
     */
    public void setLOCCycleAcctId(JAXBElement<LOCCycleAcctIdType> value) {
        this.locCycleAcctId = value;
    }

    /**
     * Gets the value of the locCycleAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCCycleAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<LOCCycleAcctTypeType> getLOCCycleAcctType() {
        return locCycleAcctType;
    }

    /**
     * Sets the value of the locCycleAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCCycleAcctTypeType }{@code >}
     *     
     */
    public void setLOCCycleAcctType(JAXBElement<LOCCycleAcctTypeType> value) {
        this.locCycleAcctType = value;
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
     * Gets the value of the locExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCExpDtType }{@code >}
     *     
     */
    public JAXBElement<LOCExpDtType> getLOCExpDt() {
        return locExpDt;
    }

    /**
     * Sets the value of the locExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCExpDtType }{@code >}
     *     
     */
    public void setLOCExpDt(JAXBElement<LOCExpDtType> value) {
        this.locExpDt = value;
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
     * Gets the value of the exclHldXferCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExclHldXferCodeType }
     *     
     */
    public ExclHldXferCodeType getExclHldXferCode() {
        return exclHldXferCode;
    }

    /**
     * Sets the value of the exclHldXferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclHldXferCodeType }
     *     
     */
    public void setExclHldXferCode(ExclHldXferCodeType value) {
        this.exclHldXferCode = value;
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
     * Gets the value of the protAcctArray property.
     * 
     * @return
     *     possible object is
     *     {@link ProtAcctArrayAType }
     *     
     */
    public ProtAcctArrayAType getProtAcctArray() {
        return protAcctArray;
    }

    /**
     * Sets the value of the protAcctArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtAcctArrayAType }
     *     
     */
    public void setProtAcctArray(ProtAcctArrayAType value) {
        this.protAcctArray = value;
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
     * Gets the value of the exclCustLOC property.
     * 
     * @return
     *     possible object is
     *     {@link ExclCustLOCType }
     *     
     */
    public ExclCustLOCType getExclCustLOC() {
        return exclCustLOC;
    }

    /**
     * Sets the value of the exclCustLOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclCustLOCType }
     *     
     */
    public void setExclCustLOC(ExclCustLOCType value) {
        this.exclCustLOC = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
    }

    /**
     * Gets the value of the locHighAmtYTD property.
     * 
     * @return
     *     possible object is
     *     {@link LOCHighAmtYTDType }
     *     
     */
    public LOCHighAmtYTDType getLOCHighAmtYTD() {
        return locHighAmtYTD;
    }

    /**
     * Sets the value of the locHighAmtYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCHighAmtYTDType }
     *     
     */
    public void setLOCHighAmtYTD(LOCHighAmtYTDType value) {
        this.locHighAmtYTD = value;
    }

    /**
     * Gets the value of the locHighAmtPrevYTD property.
     * 
     * @return
     *     possible object is
     *     {@link LOCHighAmtPrevYTDType }
     *     
     */
    public LOCHighAmtPrevYTDType getLOCHighAmtPrevYTD() {
        return locHighAmtPrevYTD;
    }

    /**
     * Sets the value of the locHighAmtPrevYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCHighAmtPrevYTDType }
     *     
     */
    public void setLOCHighAmtPrevYTD(LOCHighAmtPrevYTDType value) {
        this.locHighAmtPrevYTD = value;
    }

    /**
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
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
