
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
 * <p>Java class for LnRegRptInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRegRptInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StdIndustCode" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NAICSCode" type="{http://jackhenry.com/jxchange/TPG/2008}NAICSCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MltryApp" type="{http://jackhenry.com/jxchange/TPG/2008}MltryApp_Type" minOccurs="0"/&gt;
 *         &lt;element name="GroupCode" type="{http://jackhenry.com/jxchange/TPG/2008}GroupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRARec" type="{http://jackhenry.com/jxchange/TPG/2008}CRARec_CType" minOccurs="0"/&gt;
 *         &lt;element name="CallRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Req1098" type="{http://jackhenry.com/jxchange/TPG/2008}Req1098_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ExclRealEstateRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExclRealEstateRptCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="SBAGuarPct" type="{http://jackhenry.com/jxchange/TPG/2008}SBAGuarPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="HMDARpt" type="{http://jackhenry.com/jxchange/TPG/2008}HMDARpt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ARGOProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ARGOProdCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="RegLTVCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegLTVCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="SrLienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SrLienAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="SrLienOrigAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SrLienOrigAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="RegRiskId" type="{http://jackhenry.com/jxchange/TPG/2008}RegRiskId_Type" minOccurs="0"/&gt;
 *           &lt;element name="SBAGuarId" type="{http://jackhenry.com/jxchange/TPG/2008}SBAGuarId_Type" minOccurs="0"/&gt;
 *           &lt;element name="SBABasisPts" type="{http://jackhenry.com/jxchange/TPG/2008}SBABasisPts_Type" minOccurs="0"/&gt;
 *           &lt;element name="RegSeniorLienCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegSeniorLienCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="RegRptConvARMCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegRptConvARMCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="SCRANotCode" type="{http://jackhenry.com/jxchange/TPG/2008}SCRANotCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="SCRABegDt" type="{http://jackhenry.com/jxchange/TPG/2008}SCRABegDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="SCRAEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}SCRAEndDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnAppId" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppId_Type" minOccurs="0"/&gt;
 *             &lt;element name="SBAApprvDt" type="{http://jackhenry.com/jxchange/TPG/2008}SBAApprvDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="RiskRateDt" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateDt_Type" minOccurs="0"/&gt;
 *               &lt;element name="RiskRateCalcAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateCalcAmt_Type" minOccurs="0"/&gt;
 *               &lt;element name="LnRiskRateArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnRiskRateArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="SBACycleStat" type="{http://jackhenry.com/jxchange/TPG/2008}SBACycleStat_Type" minOccurs="0"/&gt;
 *                 &lt;element name="SBAPrevStat" type="{http://jackhenry.com/jxchange/TPG/2008}SBAPrevStat_Type" minOccurs="0"/&gt;
 *                 &lt;element name="RightToCureNotCnt" type="{http://jackhenry.com/jxchange/TPG/2008}RightToCureNotCnt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="LienPositCode" type="{http://jackhenry.com/jxchange/TPG/2008}LienPositCode_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="MltryLnActType" type="{http://jackhenry.com/jxchange/TPG/2008}MltryLnActType_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="FraudSusType" type="{http://jackhenry.com/jxchange/TPG/2008}FraudSusType_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="LnUnvId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnvId_Type" minOccurs="0"/&gt;
 *                         &lt;sequence minOccurs="0"&gt;
 *                           &lt;element name="Ver_9" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_9_CType"/&gt;
 *                           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                         &lt;/sequence&gt;
 *                       &lt;/sequence&gt;
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
@XmlType(name = "LnRegRptInfo_CType", propOrder = {
    "stdIndustCode",
    "naicsCode",
    "mltryApp",
    "groupCode",
    "glProdCode",
    "glCostCtr",
    "craRec",
    "callRptCode",
    "req1098",
    "ver1",
    "exclRealEstateRptCode",
    "sbaGuarPct",
    "hmdaRpt",
    "argoProdCode",
    "regLTVCode",
    "srLienAmt",
    "srLienOrigAmt",
    "regRiskId",
    "sbaGuarId",
    "sbaBasisPts",
    "regSeniorLienCode",
    "regRptConvARMCode",
    "ver2",
    "scraNotCode",
    "scraBegDt",
    "scraEndDt",
    "lnAppId",
    "sbaApprvDt",
    "ver3",
    "riskRateDt",
    "riskRateCalcAmt",
    "lnRiskRateArray",
    "ver4",
    "sbaCycleStat",
    "sbaPrevStat",
    "rightToCureNotCnt",
    "ver5",
    "lienPositCode",
    "ver6",
    "mltryLnActType",
    "ver7",
    "fraudSusType",
    "ver8",
    "lnUnvId",
    "ver9",
    "any"
})
public class LnRegRptInfoCType {

    @XmlElementRef(name = "StdIndustCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StdIndustCodeType> stdIndustCode;
    @XmlElementRef(name = "NAICSCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NAICSCodeType> naicsCode;
    @XmlElementRef(name = "MltryApp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MltryAppType> mltryApp;
    @XmlElementRef(name = "GroupCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupCodeType> groupCode;
    @XmlElementRef(name = "GLProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLProdCodeType> glProdCode;
    @XmlElementRef(name = "GLCostCtr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLCostCtrType> glCostCtr;
    @XmlElement(name = "CRARec")
    protected CRARecCType craRec;
    @XmlElementRef(name = "CallRptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CallRptCodeType> callRptCode;
    @XmlElementRef(name = "Req1098", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Req1098Type> req1098;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ExclRealEstateRptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExclRealEstateRptCodeType> exclRealEstateRptCode;
    @XmlElementRef(name = "SBAGuarPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SBAGuarPctType> sbaGuarPct;
    @XmlElementRef(name = "HMDARpt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HMDARptType> hmdaRpt;
    @XmlElementRef(name = "ARGOProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ARGOProdCodeType> argoProdCode;
    @XmlElementRef(name = "RegLTVCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegLTVCodeType> regLTVCode;
    @XmlElementRef(name = "SrLienAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrLienAmtType> srLienAmt;
    @XmlElementRef(name = "SrLienOrigAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrLienOrigAmtType> srLienOrigAmt;
    @XmlElementRef(name = "RegRiskId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegRiskIdType> regRiskId;
    @XmlElementRef(name = "SBAGuarId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SBAGuarIdType> sbaGuarId;
    @XmlElementRef(name = "SBABasisPts", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SBABasisPtsType> sbaBasisPts;
    @XmlElementRef(name = "RegSeniorLienCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegSeniorLienCodeType> regSeniorLienCode;
    @XmlElementRef(name = "RegRptConvARMCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegRptConvARMCodeType> regRptConvARMCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "SCRANotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SCRANotCodeType> scraNotCode;
    @XmlElementRef(name = "SCRABegDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SCRABegDtType> scraBegDt;
    @XmlElementRef(name = "SCRAEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SCRAEndDtType> scraEndDt;
    @XmlElementRef(name = "LnAppId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnAppIdType> lnAppId;
    @XmlElementRef(name = "SBAApprvDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SBAApprvDtType> sbaApprvDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "RiskRateDt")
    protected RiskRateDtType riskRateDt;
    @XmlElement(name = "RiskRateCalcAmt")
    protected RiskRateCalcAmtType riskRateCalcAmt;
    @XmlElement(name = "LnRiskRateArray")
    protected LnRiskRateArrayAType lnRiskRateArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "SBACycleStat")
    protected SBACycleStatType sbaCycleStat;
    @XmlElement(name = "SBAPrevStat")
    protected SBAPrevStatType sbaPrevStat;
    @XmlElement(name = "RightToCureNotCnt")
    protected RightToCureNotCntType rightToCureNotCnt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "LienPositCode")
    protected LienPositCodeType lienPositCode;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "MltryLnActType")
    protected MltryLnActTypeType mltryLnActType;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "FraudSusType")
    protected FraudSusTypeType fraudSusType;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "LnUnvId")
    protected LnUnvIdType lnUnvId;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the stdIndustCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StdIndustCodeType }{@code >}
     *     
     */
    public JAXBElement<StdIndustCodeType> getStdIndustCode() {
        return stdIndustCode;
    }

    /**
     * Sets the value of the stdIndustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StdIndustCodeType }{@code >}
     *     
     */
    public void setStdIndustCode(JAXBElement<StdIndustCodeType> value) {
        this.stdIndustCode = value;
    }

    /**
     * Gets the value of the naicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NAICSCodeType }{@code >}
     *     
     */
    public JAXBElement<NAICSCodeType> getNAICSCode() {
        return naicsCode;
    }

    /**
     * Sets the value of the naicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NAICSCodeType }{@code >}
     *     
     */
    public void setNAICSCode(JAXBElement<NAICSCodeType> value) {
        this.naicsCode = value;
    }

    /**
     * Gets the value of the mltryApp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MltryAppType }{@code >}
     *     
     */
    public JAXBElement<MltryAppType> getMltryApp() {
        return mltryApp;
    }

    /**
     * Sets the value of the mltryApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MltryAppType }{@code >}
     *     
     */
    public void setMltryApp(JAXBElement<MltryAppType> value) {
        this.mltryApp = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupCodeType }{@code >}
     *     
     */
    public JAXBElement<GroupCodeType> getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupCodeType }{@code >}
     *     
     */
    public void setGroupCode(JAXBElement<GroupCodeType> value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public JAXBElement<GLProdCodeType> getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public void setGLProdCode(JAXBElement<GLProdCodeType> value) {
        this.glProdCode = value;
    }

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public JAXBElement<GLCostCtrType> getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public void setGLCostCtr(JAXBElement<GLCostCtrType> value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the craRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRARecCType }
     *     
     */
    public CRARecCType getCRARec() {
        return craRec;
    }

    /**
     * Sets the value of the craRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRARecCType }
     *     
     */
    public void setCRARec(CRARecCType value) {
        this.craRec = value;
    }

    /**
     * Gets the value of the callRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallRptCodeType }{@code >}
     *     
     */
    public JAXBElement<CallRptCodeType> getCallRptCode() {
        return callRptCode;
    }

    /**
     * Sets the value of the callRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallRptCodeType }{@code >}
     *     
     */
    public void setCallRptCode(JAXBElement<CallRptCodeType> value) {
        this.callRptCode = value;
    }

    /**
     * Gets the value of the req1098 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Req1098Type }{@code >}
     *     
     */
    public JAXBElement<Req1098Type> getReq1098() {
        return req1098;
    }

    /**
     * Sets the value of the req1098 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Req1098Type }{@code >}
     *     
     */
    public void setReq1098(JAXBElement<Req1098Type> value) {
        this.req1098 = value;
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
     * Gets the value of the exclRealEstateRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExclRealEstateRptCodeType }{@code >}
     *     
     */
    public JAXBElement<ExclRealEstateRptCodeType> getExclRealEstateRptCode() {
        return exclRealEstateRptCode;
    }

    /**
     * Sets the value of the exclRealEstateRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExclRealEstateRptCodeType }{@code >}
     *     
     */
    public void setExclRealEstateRptCode(JAXBElement<ExclRealEstateRptCodeType> value) {
        this.exclRealEstateRptCode = value;
    }

    /**
     * Gets the value of the sbaGuarPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SBAGuarPctType }{@code >}
     *     
     */
    public JAXBElement<SBAGuarPctType> getSBAGuarPct() {
        return sbaGuarPct;
    }

    /**
     * Sets the value of the sbaGuarPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SBAGuarPctType }{@code >}
     *     
     */
    public void setSBAGuarPct(JAXBElement<SBAGuarPctType> value) {
        this.sbaGuarPct = value;
    }

    /**
     * Gets the value of the hmdaRpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HMDARptType }{@code >}
     *     
     */
    public JAXBElement<HMDARptType> getHMDARpt() {
        return hmdaRpt;
    }

    /**
     * Sets the value of the hmdaRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HMDARptType }{@code >}
     *     
     */
    public void setHMDARpt(JAXBElement<HMDARptType> value) {
        this.hmdaRpt = value;
    }

    /**
     * Gets the value of the argoProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ARGOProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ARGOProdCodeType> getARGOProdCode() {
        return argoProdCode;
    }

    /**
     * Sets the value of the argoProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ARGOProdCodeType }{@code >}
     *     
     */
    public void setARGOProdCode(JAXBElement<ARGOProdCodeType> value) {
        this.argoProdCode = value;
    }

    /**
     * Gets the value of the regLTVCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegLTVCodeType }{@code >}
     *     
     */
    public JAXBElement<RegLTVCodeType> getRegLTVCode() {
        return regLTVCode;
    }

    /**
     * Sets the value of the regLTVCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegLTVCodeType }{@code >}
     *     
     */
    public void setRegLTVCode(JAXBElement<RegLTVCodeType> value) {
        this.regLTVCode = value;
    }

    /**
     * Gets the value of the srLienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SrLienAmtType }{@code >}
     *     
     */
    public JAXBElement<SrLienAmtType> getSrLienAmt() {
        return srLienAmt;
    }

    /**
     * Sets the value of the srLienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SrLienAmtType }{@code >}
     *     
     */
    public void setSrLienAmt(JAXBElement<SrLienAmtType> value) {
        this.srLienAmt = value;
    }

    /**
     * Gets the value of the srLienOrigAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SrLienOrigAmtType }{@code >}
     *     
     */
    public JAXBElement<SrLienOrigAmtType> getSrLienOrigAmt() {
        return srLienOrigAmt;
    }

    /**
     * Sets the value of the srLienOrigAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SrLienOrigAmtType }{@code >}
     *     
     */
    public void setSrLienOrigAmt(JAXBElement<SrLienOrigAmtType> value) {
        this.srLienOrigAmt = value;
    }

    /**
     * Gets the value of the regRiskId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegRiskIdType }{@code >}
     *     
     */
    public JAXBElement<RegRiskIdType> getRegRiskId() {
        return regRiskId;
    }

    /**
     * Sets the value of the regRiskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegRiskIdType }{@code >}
     *     
     */
    public void setRegRiskId(JAXBElement<RegRiskIdType> value) {
        this.regRiskId = value;
    }

    /**
     * Gets the value of the sbaGuarId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SBAGuarIdType }{@code >}
     *     
     */
    public JAXBElement<SBAGuarIdType> getSBAGuarId() {
        return sbaGuarId;
    }

    /**
     * Sets the value of the sbaGuarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SBAGuarIdType }{@code >}
     *     
     */
    public void setSBAGuarId(JAXBElement<SBAGuarIdType> value) {
        this.sbaGuarId = value;
    }

    /**
     * Gets the value of the sbaBasisPts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SBABasisPtsType }{@code >}
     *     
     */
    public JAXBElement<SBABasisPtsType> getSBABasisPts() {
        return sbaBasisPts;
    }

    /**
     * Sets the value of the sbaBasisPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SBABasisPtsType }{@code >}
     *     
     */
    public void setSBABasisPts(JAXBElement<SBABasisPtsType> value) {
        this.sbaBasisPts = value;
    }

    /**
     * Gets the value of the regSeniorLienCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegSeniorLienCodeType }{@code >}
     *     
     */
    public JAXBElement<RegSeniorLienCodeType> getRegSeniorLienCode() {
        return regSeniorLienCode;
    }

    /**
     * Sets the value of the regSeniorLienCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegSeniorLienCodeType }{@code >}
     *     
     */
    public void setRegSeniorLienCode(JAXBElement<RegSeniorLienCodeType> value) {
        this.regSeniorLienCode = value;
    }

    /**
     * Gets the value of the regRptConvARMCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegRptConvARMCodeType }{@code >}
     *     
     */
    public JAXBElement<RegRptConvARMCodeType> getRegRptConvARMCode() {
        return regRptConvARMCode;
    }

    /**
     * Sets the value of the regRptConvARMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegRptConvARMCodeType }{@code >}
     *     
     */
    public void setRegRptConvARMCode(JAXBElement<RegRptConvARMCodeType> value) {
        this.regRptConvARMCode = value;
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
     * Gets the value of the scraNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCRANotCodeType }{@code >}
     *     
     */
    public JAXBElement<SCRANotCodeType> getSCRANotCode() {
        return scraNotCode;
    }

    /**
     * Sets the value of the scraNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCRANotCodeType }{@code >}
     *     
     */
    public void setSCRANotCode(JAXBElement<SCRANotCodeType> value) {
        this.scraNotCode = value;
    }

    /**
     * Gets the value of the scraBegDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCRABegDtType }{@code >}
     *     
     */
    public JAXBElement<SCRABegDtType> getSCRABegDt() {
        return scraBegDt;
    }

    /**
     * Sets the value of the scraBegDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCRABegDtType }{@code >}
     *     
     */
    public void setSCRABegDt(JAXBElement<SCRABegDtType> value) {
        this.scraBegDt = value;
    }

    /**
     * Gets the value of the scraEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCRAEndDtType }{@code >}
     *     
     */
    public JAXBElement<SCRAEndDtType> getSCRAEndDt() {
        return scraEndDt;
    }

    /**
     * Sets the value of the scraEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCRAEndDtType }{@code >}
     *     
     */
    public void setSCRAEndDt(JAXBElement<SCRAEndDtType> value) {
        this.scraEndDt = value;
    }

    /**
     * Gets the value of the lnAppId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnAppIdType }{@code >}
     *     
     */
    public JAXBElement<LnAppIdType> getLnAppId() {
        return lnAppId;
    }

    /**
     * Sets the value of the lnAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnAppIdType }{@code >}
     *     
     */
    public void setLnAppId(JAXBElement<LnAppIdType> value) {
        this.lnAppId = value;
    }

    /**
     * Gets the value of the sbaApprvDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SBAApprvDtType }{@code >}
     *     
     */
    public JAXBElement<SBAApprvDtType> getSBAApprvDt() {
        return sbaApprvDt;
    }

    /**
     * Sets the value of the sbaApprvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SBAApprvDtType }{@code >}
     *     
     */
    public void setSBAApprvDt(JAXBElement<SBAApprvDtType> value) {
        this.sbaApprvDt = value;
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
     * Gets the value of the riskRateDt property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRateDtType }
     *     
     */
    public RiskRateDtType getRiskRateDt() {
        return riskRateDt;
    }

    /**
     * Sets the value of the riskRateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRateDtType }
     *     
     */
    public void setRiskRateDt(RiskRateDtType value) {
        this.riskRateDt = value;
    }

    /**
     * Gets the value of the riskRateCalcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRateCalcAmtType }
     *     
     */
    public RiskRateCalcAmtType getRiskRateCalcAmt() {
        return riskRateCalcAmt;
    }

    /**
     * Sets the value of the riskRateCalcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRateCalcAmtType }
     *     
     */
    public void setRiskRateCalcAmt(RiskRateCalcAmtType value) {
        this.riskRateCalcAmt = value;
    }

    /**
     * Gets the value of the lnRiskRateArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnRiskRateArrayAType }
     *     
     */
    public LnRiskRateArrayAType getLnRiskRateArray() {
        return lnRiskRateArray;
    }

    /**
     * Sets the value of the lnRiskRateArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRiskRateArrayAType }
     *     
     */
    public void setLnRiskRateArray(LnRiskRateArrayAType value) {
        this.lnRiskRateArray = value;
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
     * Gets the value of the sbaCycleStat property.
     * 
     * @return
     *     possible object is
     *     {@link SBACycleStatType }
     *     
     */
    public SBACycleStatType getSBACycleStat() {
        return sbaCycleStat;
    }

    /**
     * Sets the value of the sbaCycleStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBACycleStatType }
     *     
     */
    public void setSBACycleStat(SBACycleStatType value) {
        this.sbaCycleStat = value;
    }

    /**
     * Gets the value of the sbaPrevStat property.
     * 
     * @return
     *     possible object is
     *     {@link SBAPrevStatType }
     *     
     */
    public SBAPrevStatType getSBAPrevStat() {
        return sbaPrevStat;
    }

    /**
     * Sets the value of the sbaPrevStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBAPrevStatType }
     *     
     */
    public void setSBAPrevStat(SBAPrevStatType value) {
        this.sbaPrevStat = value;
    }

    /**
     * Gets the value of the rightToCureNotCnt property.
     * 
     * @return
     *     possible object is
     *     {@link RightToCureNotCntType }
     *     
     */
    public RightToCureNotCntType getRightToCureNotCnt() {
        return rightToCureNotCnt;
    }

    /**
     * Sets the value of the rightToCureNotCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightToCureNotCntType }
     *     
     */
    public void setRightToCureNotCnt(RightToCureNotCntType value) {
        this.rightToCureNotCnt = value;
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
     * Gets the value of the lienPositCode property.
     * 
     * @return
     *     possible object is
     *     {@link LienPositCodeType }
     *     
     */
    public LienPositCodeType getLienPositCode() {
        return lienPositCode;
    }

    /**
     * Sets the value of the lienPositCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienPositCodeType }
     *     
     */
    public void setLienPositCode(LienPositCodeType value) {
        this.lienPositCode = value;
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
     * Gets the value of the mltryLnActType property.
     * 
     * @return
     *     possible object is
     *     {@link MltryLnActTypeType }
     *     
     */
    public MltryLnActTypeType getMltryLnActType() {
        return mltryLnActType;
    }

    /**
     * Sets the value of the mltryLnActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MltryLnActTypeType }
     *     
     */
    public void setMltryLnActType(MltryLnActTypeType value) {
        this.mltryLnActType = value;
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
     * Gets the value of the fraudSusType property.
     * 
     * @return
     *     possible object is
     *     {@link FraudSusTypeType }
     *     
     */
    public FraudSusTypeType getFraudSusType() {
        return fraudSusType;
    }

    /**
     * Sets the value of the fraudSusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudSusTypeType }
     *     
     */
    public void setFraudSusType(FraudSusTypeType value) {
        this.fraudSusType = value;
    }

    /**
     * Gets the value of the ver8 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver8CType }
     *     
     */
    public Ver8CType getVer8() {
        return ver8;
    }

    /**
     * Sets the value of the ver8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver8CType }
     *     
     */
    public void setVer8(Ver8CType value) {
        this.ver8 = value;
    }

    /**
     * Gets the value of the lnUnvId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnvIdType }
     *     
     */
    public LnUnvIdType getLnUnvId() {
        return lnUnvId;
    }

    /**
     * Sets the value of the lnUnvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnvIdType }
     *     
     */
    public void setLnUnvId(LnUnvIdType value) {
        this.lnUnvId = value;
    }

    /**
     * Gets the value of the ver9 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver9CType }
     *     
     */
    public Ver9CType getVer9() {
        return ver9;
    }

    /**
     * Sets the value of the ver9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver9CType }
     *     
     */
    public void setVer9(Ver9CType value) {
        this.ver9 = value;
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
