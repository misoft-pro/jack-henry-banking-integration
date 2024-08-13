
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for LnMtgInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnMtgInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgencyCaseId" type="{http://jackhenry.com/jxchange/TPG/2008}AgencyCaseId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PredatoryLnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PredatoryLnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBApprCode" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBApprCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HousingInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}HousingInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="FHLBDocCode" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBDocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeatureCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeatureCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHAVACode" type="{http://jackhenry.com/jxchange/TPG/2008}FHAVACode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstHomePur" type="{http://jackhenry.com/jxchange/TPG/2008}FirstHomePur_Type" minOccurs="0"/&gt;
 *         &lt;element name="HOEPAStat" type="{http://jackhenry.com/jxchange/TPG/2008}HOEPAStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnOrigSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnOrigSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBPurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBPurpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MERSId" type="{http://jackhenry.com/jxchange/TPG/2008}MERSId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MHPriceToOrigPct" type="{http://jackhenry.com/jxchange/TPG/2008}MHPriceToOrigPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="MoHouseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MoHouseAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MHOccupCode" type="{http://jackhenry.com/jxchange/TPG/2008}MHOccupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MHNumUnit" type="{http://jackhenry.com/jxchange/TPG/2008}MHNumUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="MHYrBuilt" type="{http://jackhenry.com/jxchange/TPG/2008}MHYrBuilt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgInsurCertifId" type="{http://jackhenry.com/jxchange/TPG/2008}MtgInsurCertifId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgInsurCode" type="{http://jackhenry.com/jxchange/TPG/2008}MtgInsurCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgInsurPct" type="{http://jackhenry.com/jxchange/TPG/2008}MtgInsurPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="MPFCommId" type="{http://jackhenry.com/jxchange/TPG/2008}MPFCommId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PledgeLnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PledgeLnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBPropCode" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBPropCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnProspectId" type="{http://jackhenry.com/jxchange/TPG/2008}LnProspectId_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedDocCode" type="{http://jackhenry.com/jxchange/TPG/2008}RedDocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlSecdMktgCode" type="{http://jackhenry.com/jxchange/TPG/2008}AvlSecdMktgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdMtgCode" type="{http://jackhenry.com/jxchange/TPG/2008}SecdMtgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ShareNatCrLn" type="{http://jackhenry.com/jxchange/TPG/2008}ShareNatCrLn_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBSICInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBSICInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SubDebtCode" type="{http://jackhenry.com/jxchange/TPG/2008}SubDebtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SynAgentId" type="{http://jackhenry.com/jxchange/TPG/2008}SynAgentId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SynMemberId" type="{http://jackhenry.com/jxchange/TPG/2008}SynMemberId_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumUnit" type="{http://jackhenry.com/jxchange/TPG/2008}NumUnit_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LnOrignId" type="{http://jackhenry.com/jxchange/TPG/2008}LnOrignId_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnOrignCompId" type="{http://jackhenry.com/jxchange/TPG/2008}LnOrignCompId_Type" minOccurs="0"/&gt;
 *           &lt;element name="StateApprLicId" type="{http://jackhenry.com/jxchange/TPG/2008}StateApprLicId_Type" minOccurs="0"/&gt;
 *           &lt;element name="StateSupvApprLicId" type="{http://jackhenry.com/jxchange/TPG/2008}StateSupvApprLicId_Type" minOccurs="0"/&gt;
 *           &lt;element name="ApprDocId" type="{http://jackhenry.com/jxchange/TPG/2008}ApprDocId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="HighPriceMtg" type="{http://jackhenry.com/jxchange/TPG/2008}HighPriceMtg_Type" minOccurs="0"/&gt;
 *             &lt;element name="HighPriceMtgRateVar" type="{http://jackhenry.com/jxchange/TPG/2008}HighPriceMtgRateVar_Type" minOccurs="0"/&gt;
 *             &lt;element name="QualMtgCode" type="{http://jackhenry.com/jxchange/TPG/2008}QualMtgCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="QualResMtgCode" type="{http://jackhenry.com/jxchange/TPG/2008}QualResMtgCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnMtgInfo_CType", propOrder = {
    "agencyCaseId",
    "predatoryLnCode",
    "fhlbApprCode",
    "housingInfoArray",
    "fhlbDocCode",
    "lnFeatureCode",
    "fhavaCode",
    "firstHomePur",
    "hoepaStat",
    "lnOrigSrcCode",
    "fhlbProdCode",
    "fhlbPurpCode",
    "mersId",
    "mhPriceToOrigPct",
    "moHouseAmt",
    "mhOccupCode",
    "mhNumUnit",
    "mhYrBuilt",
    "mtgInsurCertifId",
    "mtgInsurCode",
    "mtgInsurPct",
    "mpfCommId",
    "pledgeLnCode",
    "fhlbPropCode",
    "lnProspectId",
    "redDocCode",
    "avlSecdMktgCode",
    "secdMtgCode",
    "shareNatCrLn",
    "fhlbsicInfoArray",
    "subDebtCode",
    "synAgentId",
    "synMemberId",
    "numUnit",
    "ver1",
    "lnOrignId",
    "lnOrignCompId",
    "stateApprLicId",
    "stateSupvApprLicId",
    "apprDocId",
    "ver2",
    "highPriceMtg",
    "highPriceMtgRateVar",
    "qualMtgCode",
    "qualResMtgCode",
    "ver3",
    "any"
})
public class LnMtgInfoCType {

    @XmlElementRef(name = "AgencyCaseId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AgencyCaseIdType> agencyCaseId;
    @XmlElementRef(name = "PredatoryLnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PredatoryLnCodeType> predatoryLnCode;
    @XmlElementRef(name = "FHLBApprCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FHLBApprCodeType> fhlbApprCode;
    @XmlElement(name = "HousingInfoArray")
    protected HousingInfoArrayAType housingInfoArray;
    @XmlElementRef(name = "FHLBDocCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FHLBDocCodeType> fhlbDocCode;
    @XmlElementRef(name = "LnFeatureCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeatureCodeType> lnFeatureCode;
    @XmlElementRef(name = "FHAVACode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FHAVACodeType> fhavaCode;
    @XmlElementRef(name = "FirstHomePur", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstHomePurType> firstHomePur;
    @XmlElementRef(name = "HOEPAStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HOEPAStatType> hoepaStat;
    @XmlElementRef(name = "LnOrigSrcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnOrigSrcCodeType> lnOrigSrcCode;
    @XmlElementRef(name = "FHLBProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FHLBProdCodeType> fhlbProdCode;
    @XmlElementRef(name = "FHLBPurpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FHLBPurpCodeType> fhlbPurpCode;
    @XmlElementRef(name = "MERSId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MERSIdType> mersId;
    @XmlElementRef(name = "MHPriceToOrigPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MHPriceToOrigPctType> mhPriceToOrigPct;
    @XmlElementRef(name = "MoHouseAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MoHouseAmtType> moHouseAmt;
    @XmlElementRef(name = "MHOccupCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MHOccupCodeType> mhOccupCode;
    @XmlElementRef(name = "MHNumUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MHNumUnitType> mhNumUnit;
    @XmlElementRef(name = "MHYrBuilt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MHYrBuiltType> mhYrBuilt;
    @XmlElementRef(name = "MtgInsurCertifId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MtgInsurCertifIdType> mtgInsurCertifId;
    @XmlElementRef(name = "MtgInsurCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MtgInsurCodeType> mtgInsurCode;
    @XmlElementRef(name = "MtgInsurPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MtgInsurPctType> mtgInsurPct;
    @XmlElementRef(name = "MPFCommId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MPFCommIdType> mpfCommId;
    @XmlElementRef(name = "PledgeLnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PledgeLnCodeType> pledgeLnCode;
    @XmlElementRef(name = "FHLBPropCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FHLBPropCodeType> fhlbPropCode;
    @XmlElementRef(name = "LnProspectId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnProspectIdType> lnProspectId;
    @XmlElementRef(name = "RedDocCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedDocCodeType> redDocCode;
    @XmlElementRef(name = "AvlSecdMktgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvlSecdMktgCodeType> avlSecdMktgCode;
    @XmlElementRef(name = "SecdMtgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdMtgCodeType> secdMtgCode;
    @XmlElementRef(name = "ShareNatCrLn", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ShareNatCrLnType> shareNatCrLn;
    @XmlElement(name = "FHLBSICInfoArray")
    protected FHLBSICInfoArrayAType fhlbsicInfoArray;
    @XmlElementRef(name = "SubDebtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubDebtCodeType> subDebtCode;
    @XmlElementRef(name = "SynAgentId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SynAgentIdType> synAgentId;
    @XmlElementRef(name = "SynMemberId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SynMemberIdType> synMemberId;
    @XmlElementRef(name = "NumUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumUnitType> numUnit;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "LnOrignId")
    protected LnOrignIdType lnOrignId;
    @XmlElement(name = "LnOrignCompId")
    protected LnOrignCompIdType lnOrignCompId;
    @XmlElement(name = "StateApprLicId")
    protected StateApprLicIdType stateApprLicId;
    @XmlElement(name = "StateSupvApprLicId")
    protected StateSupvApprLicIdType stateSupvApprLicId;
    @XmlElement(name = "ApprDocId")
    protected ApprDocIdType apprDocId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "HighPriceMtg")
    protected HighPriceMtgType highPriceMtg;
    @XmlElement(name = "HighPriceMtgRateVar")
    protected HighPriceMtgRateVarType highPriceMtgRateVar;
    @XmlElement(name = "QualMtgCode")
    protected QualMtgCodeType qualMtgCode;
    @XmlElement(name = "QualResMtgCode")
    protected QualResMtgCodeType qualResMtgCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the agencyCaseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AgencyCaseIdType }{@code >}
     *     
     */
    public JAXBElement<AgencyCaseIdType> getAgencyCaseId() {
        return agencyCaseId;
    }

    /**
     * Sets the value of the agencyCaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AgencyCaseIdType }{@code >}
     *     
     */
    public void setAgencyCaseId(JAXBElement<AgencyCaseIdType> value) {
        this.agencyCaseId = value;
    }

    /**
     * Gets the value of the predatoryLnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PredatoryLnCodeType }{@code >}
     *     
     */
    public JAXBElement<PredatoryLnCodeType> getPredatoryLnCode() {
        return predatoryLnCode;
    }

    /**
     * Sets the value of the predatoryLnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PredatoryLnCodeType }{@code >}
     *     
     */
    public void setPredatoryLnCode(JAXBElement<PredatoryLnCodeType> value) {
        this.predatoryLnCode = value;
    }

    /**
     * Gets the value of the fhlbApprCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHLBApprCodeType }{@code >}
     *     
     */
    public JAXBElement<FHLBApprCodeType> getFHLBApprCode() {
        return fhlbApprCode;
    }

    /**
     * Sets the value of the fhlbApprCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHLBApprCodeType }{@code >}
     *     
     */
    public void setFHLBApprCode(JAXBElement<FHLBApprCodeType> value) {
        this.fhlbApprCode = value;
    }

    /**
     * Gets the value of the housingInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link HousingInfoArrayAType }
     *     
     */
    public HousingInfoArrayAType getHousingInfoArray() {
        return housingInfoArray;
    }

    /**
     * Sets the value of the housingInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link HousingInfoArrayAType }
     *     
     */
    public void setHousingInfoArray(HousingInfoArrayAType value) {
        this.housingInfoArray = value;
    }

    /**
     * Gets the value of the fhlbDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHLBDocCodeType }{@code >}
     *     
     */
    public JAXBElement<FHLBDocCodeType> getFHLBDocCode() {
        return fhlbDocCode;
    }

    /**
     * Sets the value of the fhlbDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHLBDocCodeType }{@code >}
     *     
     */
    public void setFHLBDocCode(JAXBElement<FHLBDocCodeType> value) {
        this.fhlbDocCode = value;
    }

    /**
     * Gets the value of the lnFeatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeatureCodeType }{@code >}
     *     
     */
    public JAXBElement<LnFeatureCodeType> getLnFeatureCode() {
        return lnFeatureCode;
    }

    /**
     * Sets the value of the lnFeatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeatureCodeType }{@code >}
     *     
     */
    public void setLnFeatureCode(JAXBElement<LnFeatureCodeType> value) {
        this.lnFeatureCode = value;
    }

    /**
     * Gets the value of the fhavaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHAVACodeType }{@code >}
     *     
     */
    public JAXBElement<FHAVACodeType> getFHAVACode() {
        return fhavaCode;
    }

    /**
     * Sets the value of the fhavaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHAVACodeType }{@code >}
     *     
     */
    public void setFHAVACode(JAXBElement<FHAVACodeType> value) {
        this.fhavaCode = value;
    }

    /**
     * Gets the value of the firstHomePur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstHomePurType }{@code >}
     *     
     */
    public JAXBElement<FirstHomePurType> getFirstHomePur() {
        return firstHomePur;
    }

    /**
     * Sets the value of the firstHomePur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstHomePurType }{@code >}
     *     
     */
    public void setFirstHomePur(JAXBElement<FirstHomePurType> value) {
        this.firstHomePur = value;
    }

    /**
     * Gets the value of the hoepaStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HOEPAStatType }{@code >}
     *     
     */
    public JAXBElement<HOEPAStatType> getHOEPAStat() {
        return hoepaStat;
    }

    /**
     * Sets the value of the hoepaStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HOEPAStatType }{@code >}
     *     
     */
    public void setHOEPAStat(JAXBElement<HOEPAStatType> value) {
        this.hoepaStat = value;
    }

    /**
     * Gets the value of the lnOrigSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnOrigSrcCodeType }{@code >}
     *     
     */
    public JAXBElement<LnOrigSrcCodeType> getLnOrigSrcCode() {
        return lnOrigSrcCode;
    }

    /**
     * Sets the value of the lnOrigSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnOrigSrcCodeType }{@code >}
     *     
     */
    public void setLnOrigSrcCode(JAXBElement<LnOrigSrcCodeType> value) {
        this.lnOrigSrcCode = value;
    }

    /**
     * Gets the value of the fhlbProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHLBProdCodeType }{@code >}
     *     
     */
    public JAXBElement<FHLBProdCodeType> getFHLBProdCode() {
        return fhlbProdCode;
    }

    /**
     * Sets the value of the fhlbProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHLBProdCodeType }{@code >}
     *     
     */
    public void setFHLBProdCode(JAXBElement<FHLBProdCodeType> value) {
        this.fhlbProdCode = value;
    }

    /**
     * Gets the value of the fhlbPurpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHLBPurpCodeType }{@code >}
     *     
     */
    public JAXBElement<FHLBPurpCodeType> getFHLBPurpCode() {
        return fhlbPurpCode;
    }

    /**
     * Sets the value of the fhlbPurpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHLBPurpCodeType }{@code >}
     *     
     */
    public void setFHLBPurpCode(JAXBElement<FHLBPurpCodeType> value) {
        this.fhlbPurpCode = value;
    }

    /**
     * Gets the value of the mersId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MERSIdType }{@code >}
     *     
     */
    public JAXBElement<MERSIdType> getMERSId() {
        return mersId;
    }

    /**
     * Sets the value of the mersId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MERSIdType }{@code >}
     *     
     */
    public void setMERSId(JAXBElement<MERSIdType> value) {
        this.mersId = value;
    }

    /**
     * Gets the value of the mhPriceToOrigPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MHPriceToOrigPctType }{@code >}
     *     
     */
    public JAXBElement<MHPriceToOrigPctType> getMHPriceToOrigPct() {
        return mhPriceToOrigPct;
    }

    /**
     * Sets the value of the mhPriceToOrigPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MHPriceToOrigPctType }{@code >}
     *     
     */
    public void setMHPriceToOrigPct(JAXBElement<MHPriceToOrigPctType> value) {
        this.mhPriceToOrigPct = value;
    }

    /**
     * Gets the value of the moHouseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MoHouseAmtType }{@code >}
     *     
     */
    public JAXBElement<MoHouseAmtType> getMoHouseAmt() {
        return moHouseAmt;
    }

    /**
     * Sets the value of the moHouseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MoHouseAmtType }{@code >}
     *     
     */
    public void setMoHouseAmt(JAXBElement<MoHouseAmtType> value) {
        this.moHouseAmt = value;
    }

    /**
     * Gets the value of the mhOccupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MHOccupCodeType }{@code >}
     *     
     */
    public JAXBElement<MHOccupCodeType> getMHOccupCode() {
        return mhOccupCode;
    }

    /**
     * Sets the value of the mhOccupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MHOccupCodeType }{@code >}
     *     
     */
    public void setMHOccupCode(JAXBElement<MHOccupCodeType> value) {
        this.mhOccupCode = value;
    }

    /**
     * Gets the value of the mhNumUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MHNumUnitType }{@code >}
     *     
     */
    public JAXBElement<MHNumUnitType> getMHNumUnit() {
        return mhNumUnit;
    }

    /**
     * Sets the value of the mhNumUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MHNumUnitType }{@code >}
     *     
     */
    public void setMHNumUnit(JAXBElement<MHNumUnitType> value) {
        this.mhNumUnit = value;
    }

    /**
     * Gets the value of the mhYrBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MHYrBuiltType }{@code >}
     *     
     */
    public JAXBElement<MHYrBuiltType> getMHYrBuilt() {
        return mhYrBuilt;
    }

    /**
     * Sets the value of the mhYrBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MHYrBuiltType }{@code >}
     *     
     */
    public void setMHYrBuilt(JAXBElement<MHYrBuiltType> value) {
        this.mhYrBuilt = value;
    }

    /**
     * Gets the value of the mtgInsurCertifId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MtgInsurCertifIdType }{@code >}
     *     
     */
    public JAXBElement<MtgInsurCertifIdType> getMtgInsurCertifId() {
        return mtgInsurCertifId;
    }

    /**
     * Sets the value of the mtgInsurCertifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MtgInsurCertifIdType }{@code >}
     *     
     */
    public void setMtgInsurCertifId(JAXBElement<MtgInsurCertifIdType> value) {
        this.mtgInsurCertifId = value;
    }

    /**
     * Gets the value of the mtgInsurCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MtgInsurCodeType }{@code >}
     *     
     */
    public JAXBElement<MtgInsurCodeType> getMtgInsurCode() {
        return mtgInsurCode;
    }

    /**
     * Sets the value of the mtgInsurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MtgInsurCodeType }{@code >}
     *     
     */
    public void setMtgInsurCode(JAXBElement<MtgInsurCodeType> value) {
        this.mtgInsurCode = value;
    }

    /**
     * Gets the value of the mtgInsurPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MtgInsurPctType }{@code >}
     *     
     */
    public JAXBElement<MtgInsurPctType> getMtgInsurPct() {
        return mtgInsurPct;
    }

    /**
     * Sets the value of the mtgInsurPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MtgInsurPctType }{@code >}
     *     
     */
    public void setMtgInsurPct(JAXBElement<MtgInsurPctType> value) {
        this.mtgInsurPct = value;
    }

    /**
     * Gets the value of the mpfCommId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MPFCommIdType }{@code >}
     *     
     */
    public JAXBElement<MPFCommIdType> getMPFCommId() {
        return mpfCommId;
    }

    /**
     * Sets the value of the mpfCommId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MPFCommIdType }{@code >}
     *     
     */
    public void setMPFCommId(JAXBElement<MPFCommIdType> value) {
        this.mpfCommId = value;
    }

    /**
     * Gets the value of the pledgeLnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PledgeLnCodeType }{@code >}
     *     
     */
    public JAXBElement<PledgeLnCodeType> getPledgeLnCode() {
        return pledgeLnCode;
    }

    /**
     * Sets the value of the pledgeLnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PledgeLnCodeType }{@code >}
     *     
     */
    public void setPledgeLnCode(JAXBElement<PledgeLnCodeType> value) {
        this.pledgeLnCode = value;
    }

    /**
     * Gets the value of the fhlbPropCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FHLBPropCodeType }{@code >}
     *     
     */
    public JAXBElement<FHLBPropCodeType> getFHLBPropCode() {
        return fhlbPropCode;
    }

    /**
     * Sets the value of the fhlbPropCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FHLBPropCodeType }{@code >}
     *     
     */
    public void setFHLBPropCode(JAXBElement<FHLBPropCodeType> value) {
        this.fhlbPropCode = value;
    }

    /**
     * Gets the value of the lnProspectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnProspectIdType }{@code >}
     *     
     */
    public JAXBElement<LnProspectIdType> getLnProspectId() {
        return lnProspectId;
    }

    /**
     * Sets the value of the lnProspectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnProspectIdType }{@code >}
     *     
     */
    public void setLnProspectId(JAXBElement<LnProspectIdType> value) {
        this.lnProspectId = value;
    }

    /**
     * Gets the value of the redDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedDocCodeType }{@code >}
     *     
     */
    public JAXBElement<RedDocCodeType> getRedDocCode() {
        return redDocCode;
    }

    /**
     * Sets the value of the redDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedDocCodeType }{@code >}
     *     
     */
    public void setRedDocCode(JAXBElement<RedDocCodeType> value) {
        this.redDocCode = value;
    }

    /**
     * Gets the value of the avlSecdMktgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvlSecdMktgCodeType }{@code >}
     *     
     */
    public JAXBElement<AvlSecdMktgCodeType> getAvlSecdMktgCode() {
        return avlSecdMktgCode;
    }

    /**
     * Sets the value of the avlSecdMktgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvlSecdMktgCodeType }{@code >}
     *     
     */
    public void setAvlSecdMktgCode(JAXBElement<AvlSecdMktgCodeType> value) {
        this.avlSecdMktgCode = value;
    }

    /**
     * Gets the value of the secdMtgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdMtgCodeType }{@code >}
     *     
     */
    public JAXBElement<SecdMtgCodeType> getSecdMtgCode() {
        return secdMtgCode;
    }

    /**
     * Sets the value of the secdMtgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdMtgCodeType }{@code >}
     *     
     */
    public void setSecdMtgCode(JAXBElement<SecdMtgCodeType> value) {
        this.secdMtgCode = value;
    }

    /**
     * Gets the value of the shareNatCrLn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShareNatCrLnType }{@code >}
     *     
     */
    public JAXBElement<ShareNatCrLnType> getShareNatCrLn() {
        return shareNatCrLn;
    }

    /**
     * Sets the value of the shareNatCrLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShareNatCrLnType }{@code >}
     *     
     */
    public void setShareNatCrLn(JAXBElement<ShareNatCrLnType> value) {
        this.shareNatCrLn = value;
    }

    /**
     * Gets the value of the fhlbsicInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link FHLBSICInfoArrayAType }
     *     
     */
    public FHLBSICInfoArrayAType getFHLBSICInfoArray() {
        return fhlbsicInfoArray;
    }

    /**
     * Sets the value of the fhlbsicInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHLBSICInfoArrayAType }
     *     
     */
    public void setFHLBSICInfoArray(FHLBSICInfoArrayAType value) {
        this.fhlbsicInfoArray = value;
    }

    /**
     * Gets the value of the subDebtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubDebtCodeType }{@code >}
     *     
     */
    public JAXBElement<SubDebtCodeType> getSubDebtCode() {
        return subDebtCode;
    }

    /**
     * Sets the value of the subDebtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubDebtCodeType }{@code >}
     *     
     */
    public void setSubDebtCode(JAXBElement<SubDebtCodeType> value) {
        this.subDebtCode = value;
    }

    /**
     * Gets the value of the synAgentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SynAgentIdType }{@code >}
     *     
     */
    public JAXBElement<SynAgentIdType> getSynAgentId() {
        return synAgentId;
    }

    /**
     * Sets the value of the synAgentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SynAgentIdType }{@code >}
     *     
     */
    public void setSynAgentId(JAXBElement<SynAgentIdType> value) {
        this.synAgentId = value;
    }

    /**
     * Gets the value of the synMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SynMemberIdType }{@code >}
     *     
     */
    public JAXBElement<SynMemberIdType> getSynMemberId() {
        return synMemberId;
    }

    /**
     * Sets the value of the synMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SynMemberIdType }{@code >}
     *     
     */
    public void setSynMemberId(JAXBElement<SynMemberIdType> value) {
        this.synMemberId = value;
    }

    /**
     * Gets the value of the numUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumUnitType }{@code >}
     *     
     */
    public JAXBElement<NumUnitType> getNumUnit() {
        return numUnit;
    }

    /**
     * Sets the value of the numUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumUnitType }{@code >}
     *     
     */
    public void setNumUnit(JAXBElement<NumUnitType> value) {
        this.numUnit = value;
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
     * Gets the value of the lnOrignId property.
     * 
     * @return
     *     possible object is
     *     {@link LnOrignIdType }
     *     
     */
    public LnOrignIdType getLnOrignId() {
        return lnOrignId;
    }

    /**
     * Sets the value of the lnOrignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnOrignIdType }
     *     
     */
    public void setLnOrignId(LnOrignIdType value) {
        this.lnOrignId = value;
    }

    /**
     * Gets the value of the lnOrignCompId property.
     * 
     * @return
     *     possible object is
     *     {@link LnOrignCompIdType }
     *     
     */
    public LnOrignCompIdType getLnOrignCompId() {
        return lnOrignCompId;
    }

    /**
     * Sets the value of the lnOrignCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnOrignCompIdType }
     *     
     */
    public void setLnOrignCompId(LnOrignCompIdType value) {
        this.lnOrignCompId = value;
    }

    /**
     * Gets the value of the stateApprLicId property.
     * 
     * @return
     *     possible object is
     *     {@link StateApprLicIdType }
     *     
     */
    public StateApprLicIdType getStateApprLicId() {
        return stateApprLicId;
    }

    /**
     * Sets the value of the stateApprLicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateApprLicIdType }
     *     
     */
    public void setStateApprLicId(StateApprLicIdType value) {
        this.stateApprLicId = value;
    }

    /**
     * Gets the value of the stateSupvApprLicId property.
     * 
     * @return
     *     possible object is
     *     {@link StateSupvApprLicIdType }
     *     
     */
    public StateSupvApprLicIdType getStateSupvApprLicId() {
        return stateSupvApprLicId;
    }

    /**
     * Sets the value of the stateSupvApprLicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateSupvApprLicIdType }
     *     
     */
    public void setStateSupvApprLicId(StateSupvApprLicIdType value) {
        this.stateSupvApprLicId = value;
    }

    /**
     * Gets the value of the apprDocId property.
     * 
     * @return
     *     possible object is
     *     {@link ApprDocIdType }
     *     
     */
    public ApprDocIdType getApprDocId() {
        return apprDocId;
    }

    /**
     * Sets the value of the apprDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprDocIdType }
     *     
     */
    public void setApprDocId(ApprDocIdType value) {
        this.apprDocId = value;
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
     * Gets the value of the highPriceMtg property.
     * 
     * @return
     *     possible object is
     *     {@link HighPriceMtgType }
     *     
     */
    public HighPriceMtgType getHighPriceMtg() {
        return highPriceMtg;
    }

    /**
     * Sets the value of the highPriceMtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighPriceMtgType }
     *     
     */
    public void setHighPriceMtg(HighPriceMtgType value) {
        this.highPriceMtg = value;
    }

    /**
     * Gets the value of the highPriceMtgRateVar property.
     * 
     * @return
     *     possible object is
     *     {@link HighPriceMtgRateVarType }
     *     
     */
    public HighPriceMtgRateVarType getHighPriceMtgRateVar() {
        return highPriceMtgRateVar;
    }

    /**
     * Sets the value of the highPriceMtgRateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighPriceMtgRateVarType }
     *     
     */
    public void setHighPriceMtgRateVar(HighPriceMtgRateVarType value) {
        this.highPriceMtgRateVar = value;
    }

    /**
     * Gets the value of the qualMtgCode property.
     * 
     * @return
     *     possible object is
     *     {@link QualMtgCodeType }
     *     
     */
    public QualMtgCodeType getQualMtgCode() {
        return qualMtgCode;
    }

    /**
     * Sets the value of the qualMtgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualMtgCodeType }
     *     
     */
    public void setQualMtgCode(QualMtgCodeType value) {
        this.qualMtgCode = value;
    }

    /**
     * Gets the value of the qualResMtgCode property.
     * 
     * @return
     *     possible object is
     *     {@link QualResMtgCodeType }
     *     
     */
    public QualResMtgCodeType getQualResMtgCode() {
        return qualResMtgCode;
    }

    /**
     * Sets the value of the qualResMtgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualResMtgCodeType }
     *     
     */
    public void setQualResMtgCode(QualResMtgCodeType value) {
        this.qualResMtgCode = value;
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
