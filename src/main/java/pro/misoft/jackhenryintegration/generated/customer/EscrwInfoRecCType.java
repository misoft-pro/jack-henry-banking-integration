
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
 * <p>Java class for EscrwInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwPmtAgentCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtAgentCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPmtCompCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtCompCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrTerm" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrDOM" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrDOM_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPayeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPayeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwStat" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwLastDistrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwLastDistrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwLastDistrDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwLastDistrDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwLastDistrRate" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwLastDistrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwLastDistrTaxAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwLastDistrTaxAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwLastDistrTaxRate" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwLastDistrTaxRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrRate" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrTaxAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrTaxAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrTaxRate" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrTaxRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwTaxRefId" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwTaxRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPrtNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPrtNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyOrigDt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyOrigDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyTerm" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyPremium" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyPremium_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyId" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyRenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropLegalInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PropLegalInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropParcelId" type="{http://jackhenry.com/jxchange/TPG/2008}PropParcelId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMICancelDt" type="{http://jackhenry.com/jxchange/TPG/2008}PMICancelDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMIExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}PMIExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMILTVNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PMILTVNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMICancelCode" type="{http://jackhenry.com/jxchange/TPG/2008}PMICancelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMICancelNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PMICancelNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ForcedPlaceInsur" type="{http://jackhenry.com/jxchange/TPG/2008}ForcedPlaceInsur_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PMIHOEPANotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PMIHOEPANotCode_Type" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *           &lt;element name="EscrwPrvdPropType" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPrvdPropType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PMIHighRiskType" type="{http://jackhenry.com/jxchange/TPG/2008}PMIHighRiskType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *             &lt;element name="InsurPlcyRebate" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyRebate_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *               &lt;element name="CurPMILTVRatio" type="{http://jackhenry.com/jxchange/TPG/2008}CurPMILTVRatio_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                 &lt;element name="OpenBal" type="{http://jackhenry.com/jxchange/TPG/2008}OpenBal_Type" minOccurs="0"/&gt;
 *                 &lt;element name="EscrwPmtStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtStartDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="EscrwDistrStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrStartDt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
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
@XmlType(name = "EscrwInfoRec_CType", propOrder = {
    "escrwPmtAgentCode",
    "escrwPmtCompCode",
    "escrwDistrTerm",
    "escrwDistrTermUnit",
    "escrwDistrDOM",
    "escrwPayeeCode",
    "escrwStat",
    "escrwLastDistrAmt",
    "escrwLastDistrDt",
    "escrwLastDistrRate",
    "escrwLastDistrTaxAmt",
    "escrwLastDistrTaxRate",
    "escrwDistrAmt",
    "escrwDistrDt",
    "escrwDistrRate",
    "escrwDistrTaxAmt",
    "escrwDistrTaxRate",
    "escrwTaxRefId",
    "escrwPrtNotCode",
    "insurPlcyExpDt",
    "insurPlcyOrigDt",
    "insurPlcyTerm",
    "insurPlcyTermUnit",
    "insurPlcyPremium",
    "insurPlcyId",
    "insurPlcyAmt",
    "insurPlcyRenDt",
    "propLegalInfo",
    "propParcelId",
    "pmiCancelDt",
    "pmiExpDt",
    "pmiltvNotCode",
    "pmiCancelCode",
    "pmiCancelNotCode",
    "forcedPlaceInsur",
    "ver1",
    "pmihoepaNotCode",
    "ver2",
    "escrwPrvdPropType",
    "pmiHighRiskType",
    "ver3",
    "insurPlcyRebate",
    "ver4",
    "curPMILTVRatio",
    "ver5",
    "openBal",
    "escrwPmtStartDt",
    "escrwDistrStartDt",
    "ver6",
    "any"
})
public class EscrwInfoRecCType {

    @XmlElementRef(name = "EscrwPmtAgentCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtAgentCodeType> escrwPmtAgentCode;
    @XmlElementRef(name = "EscrwPmtCompCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtCompCodeType> escrwPmtCompCode;
    @XmlElementRef(name = "EscrwDistrTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrTermType> escrwDistrTerm;
    @XmlElementRef(name = "EscrwDistrTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrTermUnitType> escrwDistrTermUnit;
    @XmlElementRef(name = "EscrwDistrDOM", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrDOMType> escrwDistrDOM;
    @XmlElementRef(name = "EscrwPayeeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPayeeCodeType> escrwPayeeCode;
    @XmlElementRef(name = "EscrwStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwStatType> escrwStat;
    @XmlElementRef(name = "EscrwLastDistrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwLastDistrAmtType> escrwLastDistrAmt;
    @XmlElementRef(name = "EscrwLastDistrDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwLastDistrDtType> escrwLastDistrDt;
    @XmlElementRef(name = "EscrwLastDistrRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwLastDistrRateType> escrwLastDistrRate;
    @XmlElementRef(name = "EscrwLastDistrTaxAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwLastDistrTaxAmtType> escrwLastDistrTaxAmt;
    @XmlElementRef(name = "EscrwLastDistrTaxRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwLastDistrTaxRateType> escrwLastDistrTaxRate;
    @XmlElementRef(name = "EscrwDistrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrAmtType> escrwDistrAmt;
    @XmlElementRef(name = "EscrwDistrDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrDtType> escrwDistrDt;
    @XmlElementRef(name = "EscrwDistrRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrRateType> escrwDistrRate;
    @XmlElementRef(name = "EscrwDistrTaxAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrTaxAmtType> escrwDistrTaxAmt;
    @XmlElementRef(name = "EscrwDistrTaxRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDistrTaxRateType> escrwDistrTaxRate;
    @XmlElementRef(name = "EscrwTaxRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwTaxRefIdType> escrwTaxRefId;
    @XmlElementRef(name = "EscrwPrtNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPrtNotCodeType> escrwPrtNotCode;
    @XmlElementRef(name = "InsurPlcyExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyExpDtType> insurPlcyExpDt;
    @XmlElementRef(name = "InsurPlcyOrigDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyOrigDtType> insurPlcyOrigDt;
    @XmlElementRef(name = "InsurPlcyTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyTermType> insurPlcyTerm;
    @XmlElementRef(name = "InsurPlcyTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyTermUnitType> insurPlcyTermUnit;
    @XmlElementRef(name = "InsurPlcyPremium", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyPremiumType> insurPlcyPremium;
    @XmlElementRef(name = "InsurPlcyId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyIdType> insurPlcyId;
    @XmlElementRef(name = "InsurPlcyAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyAmtType> insurPlcyAmt;
    @XmlElementRef(name = "InsurPlcyRenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsurPlcyRenDtType> insurPlcyRenDt;
    @XmlElementRef(name = "PropLegalInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropLegalInfoType> propLegalInfo;
    @XmlElementRef(name = "PropParcelId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropParcelIdType> propParcelId;
    @XmlElementRef(name = "PMICancelDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PMICancelDtType> pmiCancelDt;
    @XmlElementRef(name = "PMIExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PMIExpDtType> pmiExpDt;
    @XmlElementRef(name = "PMILTVNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PMILTVNotCodeType> pmiltvNotCode;
    @XmlElementRef(name = "PMICancelCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PMICancelCodeType> pmiCancelCode;
    @XmlElementRef(name = "PMICancelNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PMICancelNotCodeType> pmiCancelNotCode;
    @XmlElementRef(name = "ForcedPlaceInsur", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ForcedPlaceInsurType> forcedPlaceInsur;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "PMIHOEPANotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PMIHOEPANotCodeType> pmihoepaNotCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "EscrwPrvdPropType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPrvdPropTypeType> escrwPrvdPropType;
    @XmlElementRef(name = "PMIHighRiskType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PMIHighRiskTypeType> pmiHighRiskType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "InsurPlcyRebate")
    protected InsurPlcyRebateType insurPlcyRebate;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "CurPMILTVRatio")
    protected CurPMILTVRatioType curPMILTVRatio;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "OpenBal")
    protected OpenBalType openBal;
    @XmlElement(name = "EscrwPmtStartDt")
    protected EscrwPmtStartDtType escrwPmtStartDt;
    @XmlElement(name = "EscrwDistrStartDt")
    protected EscrwDistrStartDtType escrwDistrStartDt;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwPmtAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAgentCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtAgentCodeType> getEscrwPmtAgentCode() {
        return escrwPmtAgentCode;
    }

    /**
     * Sets the value of the escrwPmtAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAgentCodeType }{@code >}
     *     
     */
    public void setEscrwPmtAgentCode(JAXBElement<EscrwPmtAgentCodeType> value) {
        this.escrwPmtAgentCode = value;
    }

    /**
     * Gets the value of the escrwPmtCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtCompCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtCompCodeType> getEscrwPmtCompCode() {
        return escrwPmtCompCode;
    }

    /**
     * Sets the value of the escrwPmtCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtCompCodeType }{@code >}
     *     
     */
    public void setEscrwPmtCompCode(JAXBElement<EscrwPmtCompCodeType> value) {
        this.escrwPmtCompCode = value;
    }

    /**
     * Gets the value of the escrwDistrTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTermType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrTermType> getEscrwDistrTerm() {
        return escrwDistrTerm;
    }

    /**
     * Sets the value of the escrwDistrTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTermType }{@code >}
     *     
     */
    public void setEscrwDistrTerm(JAXBElement<EscrwDistrTermType> value) {
        this.escrwDistrTerm = value;
    }

    /**
     * Gets the value of the escrwDistrTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTermUnitType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrTermUnitType> getEscrwDistrTermUnit() {
        return escrwDistrTermUnit;
    }

    /**
     * Sets the value of the escrwDistrTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTermUnitType }{@code >}
     *     
     */
    public void setEscrwDistrTermUnit(JAXBElement<EscrwDistrTermUnitType> value) {
        this.escrwDistrTermUnit = value;
    }

    /**
     * Gets the value of the escrwDistrDOM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrDOMType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrDOMType> getEscrwDistrDOM() {
        return escrwDistrDOM;
    }

    /**
     * Sets the value of the escrwDistrDOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrDOMType }{@code >}
     *     
     */
    public void setEscrwDistrDOM(JAXBElement<EscrwDistrDOMType> value) {
        this.escrwDistrDOM = value;
    }

    /**
     * Gets the value of the escrwPayeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPayeeCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwPayeeCodeType> getEscrwPayeeCode() {
        return escrwPayeeCode;
    }

    /**
     * Sets the value of the escrwPayeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPayeeCodeType }{@code >}
     *     
     */
    public void setEscrwPayeeCode(JAXBElement<EscrwPayeeCodeType> value) {
        this.escrwPayeeCode = value;
    }

    /**
     * Gets the value of the escrwStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwStatType }{@code >}
     *     
     */
    public JAXBElement<EscrwStatType> getEscrwStat() {
        return escrwStat;
    }

    /**
     * Sets the value of the escrwStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwStatType }{@code >}
     *     
     */
    public void setEscrwStat(JAXBElement<EscrwStatType> value) {
        this.escrwStat = value;
    }

    /**
     * Gets the value of the escrwLastDistrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwLastDistrAmtType> getEscrwLastDistrAmt() {
        return escrwLastDistrAmt;
    }

    /**
     * Sets the value of the escrwLastDistrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrAmtType }{@code >}
     *     
     */
    public void setEscrwLastDistrAmt(JAXBElement<EscrwLastDistrAmtType> value) {
        this.escrwLastDistrAmt = value;
    }

    /**
     * Gets the value of the escrwLastDistrDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrDtType }{@code >}
     *     
     */
    public JAXBElement<EscrwLastDistrDtType> getEscrwLastDistrDt() {
        return escrwLastDistrDt;
    }

    /**
     * Sets the value of the escrwLastDistrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrDtType }{@code >}
     *     
     */
    public void setEscrwLastDistrDt(JAXBElement<EscrwLastDistrDtType> value) {
        this.escrwLastDistrDt = value;
    }

    /**
     * Gets the value of the escrwLastDistrRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrRateType }{@code >}
     *     
     */
    public JAXBElement<EscrwLastDistrRateType> getEscrwLastDistrRate() {
        return escrwLastDistrRate;
    }

    /**
     * Sets the value of the escrwLastDistrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrRateType }{@code >}
     *     
     */
    public void setEscrwLastDistrRate(JAXBElement<EscrwLastDistrRateType> value) {
        this.escrwLastDistrRate = value;
    }

    /**
     * Gets the value of the escrwLastDistrTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrTaxAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwLastDistrTaxAmtType> getEscrwLastDistrTaxAmt() {
        return escrwLastDistrTaxAmt;
    }

    /**
     * Sets the value of the escrwLastDistrTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrTaxAmtType }{@code >}
     *     
     */
    public void setEscrwLastDistrTaxAmt(JAXBElement<EscrwLastDistrTaxAmtType> value) {
        this.escrwLastDistrTaxAmt = value;
    }

    /**
     * Gets the value of the escrwLastDistrTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrTaxRateType }{@code >}
     *     
     */
    public JAXBElement<EscrwLastDistrTaxRateType> getEscrwLastDistrTaxRate() {
        return escrwLastDistrTaxRate;
    }

    /**
     * Sets the value of the escrwLastDistrTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwLastDistrTaxRateType }{@code >}
     *     
     */
    public void setEscrwLastDistrTaxRate(JAXBElement<EscrwLastDistrTaxRateType> value) {
        this.escrwLastDistrTaxRate = value;
    }

    /**
     * Gets the value of the escrwDistrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrAmtType> getEscrwDistrAmt() {
        return escrwDistrAmt;
    }

    /**
     * Sets the value of the escrwDistrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrAmtType }{@code >}
     *     
     */
    public void setEscrwDistrAmt(JAXBElement<EscrwDistrAmtType> value) {
        this.escrwDistrAmt = value;
    }

    /**
     * Gets the value of the escrwDistrDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrDtType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrDtType> getEscrwDistrDt() {
        return escrwDistrDt;
    }

    /**
     * Sets the value of the escrwDistrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrDtType }{@code >}
     *     
     */
    public void setEscrwDistrDt(JAXBElement<EscrwDistrDtType> value) {
        this.escrwDistrDt = value;
    }

    /**
     * Gets the value of the escrwDistrRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrRateType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrRateType> getEscrwDistrRate() {
        return escrwDistrRate;
    }

    /**
     * Sets the value of the escrwDistrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrRateType }{@code >}
     *     
     */
    public void setEscrwDistrRate(JAXBElement<EscrwDistrRateType> value) {
        this.escrwDistrRate = value;
    }

    /**
     * Gets the value of the escrwDistrTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTaxAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrTaxAmtType> getEscrwDistrTaxAmt() {
        return escrwDistrTaxAmt;
    }

    /**
     * Sets the value of the escrwDistrTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTaxAmtType }{@code >}
     *     
     */
    public void setEscrwDistrTaxAmt(JAXBElement<EscrwDistrTaxAmtType> value) {
        this.escrwDistrTaxAmt = value;
    }

    /**
     * Gets the value of the escrwDistrTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTaxRateType }{@code >}
     *     
     */
    public JAXBElement<EscrwDistrTaxRateType> getEscrwDistrTaxRate() {
        return escrwDistrTaxRate;
    }

    /**
     * Sets the value of the escrwDistrTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDistrTaxRateType }{@code >}
     *     
     */
    public void setEscrwDistrTaxRate(JAXBElement<EscrwDistrTaxRateType> value) {
        this.escrwDistrTaxRate = value;
    }

    /**
     * Gets the value of the escrwTaxRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwTaxRefIdType }{@code >}
     *     
     */
    public JAXBElement<EscrwTaxRefIdType> getEscrwTaxRefId() {
        return escrwTaxRefId;
    }

    /**
     * Sets the value of the escrwTaxRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwTaxRefIdType }{@code >}
     *     
     */
    public void setEscrwTaxRefId(JAXBElement<EscrwTaxRefIdType> value) {
        this.escrwTaxRefId = value;
    }

    /**
     * Gets the value of the escrwPrtNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrtNotCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwPrtNotCodeType> getEscrwPrtNotCode() {
        return escrwPrtNotCode;
    }

    /**
     * Sets the value of the escrwPrtNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrtNotCodeType }{@code >}
     *     
     */
    public void setEscrwPrtNotCode(JAXBElement<EscrwPrtNotCodeType> value) {
        this.escrwPrtNotCode = value;
    }

    /**
     * Gets the value of the insurPlcyExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyExpDtType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyExpDtType> getInsurPlcyExpDt() {
        return insurPlcyExpDt;
    }

    /**
     * Sets the value of the insurPlcyExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyExpDtType }{@code >}
     *     
     */
    public void setInsurPlcyExpDt(JAXBElement<InsurPlcyExpDtType> value) {
        this.insurPlcyExpDt = value;
    }

    /**
     * Gets the value of the insurPlcyOrigDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyOrigDtType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyOrigDtType> getInsurPlcyOrigDt() {
        return insurPlcyOrigDt;
    }

    /**
     * Sets the value of the insurPlcyOrigDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyOrigDtType }{@code >}
     *     
     */
    public void setInsurPlcyOrigDt(JAXBElement<InsurPlcyOrigDtType> value) {
        this.insurPlcyOrigDt = value;
    }

    /**
     * Gets the value of the insurPlcyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyTermType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyTermType> getInsurPlcyTerm() {
        return insurPlcyTerm;
    }

    /**
     * Sets the value of the insurPlcyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyTermType }{@code >}
     *     
     */
    public void setInsurPlcyTerm(JAXBElement<InsurPlcyTermType> value) {
        this.insurPlcyTerm = value;
    }

    /**
     * Gets the value of the insurPlcyTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyTermUnitType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyTermUnitType> getInsurPlcyTermUnit() {
        return insurPlcyTermUnit;
    }

    /**
     * Sets the value of the insurPlcyTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyTermUnitType }{@code >}
     *     
     */
    public void setInsurPlcyTermUnit(JAXBElement<InsurPlcyTermUnitType> value) {
        this.insurPlcyTermUnit = value;
    }

    /**
     * Gets the value of the insurPlcyPremium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyPremiumType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyPremiumType> getInsurPlcyPremium() {
        return insurPlcyPremium;
    }

    /**
     * Sets the value of the insurPlcyPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyPremiumType }{@code >}
     *     
     */
    public void setInsurPlcyPremium(JAXBElement<InsurPlcyPremiumType> value) {
        this.insurPlcyPremium = value;
    }

    /**
     * Gets the value of the insurPlcyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyIdType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyIdType> getInsurPlcyId() {
        return insurPlcyId;
    }

    /**
     * Sets the value of the insurPlcyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyIdType }{@code >}
     *     
     */
    public void setInsurPlcyId(JAXBElement<InsurPlcyIdType> value) {
        this.insurPlcyId = value;
    }

    /**
     * Gets the value of the insurPlcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyAmtType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyAmtType> getInsurPlcyAmt() {
        return insurPlcyAmt;
    }

    /**
     * Sets the value of the insurPlcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyAmtType }{@code >}
     *     
     */
    public void setInsurPlcyAmt(JAXBElement<InsurPlcyAmtType> value) {
        this.insurPlcyAmt = value;
    }

    /**
     * Gets the value of the insurPlcyRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyRenDtType }{@code >}
     *     
     */
    public JAXBElement<InsurPlcyRenDtType> getInsurPlcyRenDt() {
        return insurPlcyRenDt;
    }

    /**
     * Sets the value of the insurPlcyRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsurPlcyRenDtType }{@code >}
     *     
     */
    public void setInsurPlcyRenDt(JAXBElement<InsurPlcyRenDtType> value) {
        this.insurPlcyRenDt = value;
    }

    /**
     * Gets the value of the propLegalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropLegalInfoType }{@code >}
     *     
     */
    public JAXBElement<PropLegalInfoType> getPropLegalInfo() {
        return propLegalInfo;
    }

    /**
     * Sets the value of the propLegalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropLegalInfoType }{@code >}
     *     
     */
    public void setPropLegalInfo(JAXBElement<PropLegalInfoType> value) {
        this.propLegalInfo = value;
    }

    /**
     * Gets the value of the propParcelId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropParcelIdType }{@code >}
     *     
     */
    public JAXBElement<PropParcelIdType> getPropParcelId() {
        return propParcelId;
    }

    /**
     * Sets the value of the propParcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropParcelIdType }{@code >}
     *     
     */
    public void setPropParcelId(JAXBElement<PropParcelIdType> value) {
        this.propParcelId = value;
    }

    /**
     * Gets the value of the pmiCancelDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PMICancelDtType }{@code >}
     *     
     */
    public JAXBElement<PMICancelDtType> getPMICancelDt() {
        return pmiCancelDt;
    }

    /**
     * Sets the value of the pmiCancelDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PMICancelDtType }{@code >}
     *     
     */
    public void setPMICancelDt(JAXBElement<PMICancelDtType> value) {
        this.pmiCancelDt = value;
    }

    /**
     * Gets the value of the pmiExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PMIExpDtType }{@code >}
     *     
     */
    public JAXBElement<PMIExpDtType> getPMIExpDt() {
        return pmiExpDt;
    }

    /**
     * Sets the value of the pmiExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PMIExpDtType }{@code >}
     *     
     */
    public void setPMIExpDt(JAXBElement<PMIExpDtType> value) {
        this.pmiExpDt = value;
    }

    /**
     * Gets the value of the pmiltvNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PMILTVNotCodeType }{@code >}
     *     
     */
    public JAXBElement<PMILTVNotCodeType> getPMILTVNotCode() {
        return pmiltvNotCode;
    }

    /**
     * Sets the value of the pmiltvNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PMILTVNotCodeType }{@code >}
     *     
     */
    public void setPMILTVNotCode(JAXBElement<PMILTVNotCodeType> value) {
        this.pmiltvNotCode = value;
    }

    /**
     * Gets the value of the pmiCancelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PMICancelCodeType }{@code >}
     *     
     */
    public JAXBElement<PMICancelCodeType> getPMICancelCode() {
        return pmiCancelCode;
    }

    /**
     * Sets the value of the pmiCancelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PMICancelCodeType }{@code >}
     *     
     */
    public void setPMICancelCode(JAXBElement<PMICancelCodeType> value) {
        this.pmiCancelCode = value;
    }

    /**
     * Gets the value of the pmiCancelNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PMICancelNotCodeType }{@code >}
     *     
     */
    public JAXBElement<PMICancelNotCodeType> getPMICancelNotCode() {
        return pmiCancelNotCode;
    }

    /**
     * Sets the value of the pmiCancelNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PMICancelNotCodeType }{@code >}
     *     
     */
    public void setPMICancelNotCode(JAXBElement<PMICancelNotCodeType> value) {
        this.pmiCancelNotCode = value;
    }

    /**
     * Gets the value of the forcedPlaceInsur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ForcedPlaceInsurType }{@code >}
     *     
     */
    public JAXBElement<ForcedPlaceInsurType> getForcedPlaceInsur() {
        return forcedPlaceInsur;
    }

    /**
     * Sets the value of the forcedPlaceInsur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ForcedPlaceInsurType }{@code >}
     *     
     */
    public void setForcedPlaceInsur(JAXBElement<ForcedPlaceInsurType> value) {
        this.forcedPlaceInsur = value;
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
     * Gets the value of the pmihoepaNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PMIHOEPANotCodeType }{@code >}
     *     
     */
    public JAXBElement<PMIHOEPANotCodeType> getPMIHOEPANotCode() {
        return pmihoepaNotCode;
    }

    /**
     * Sets the value of the pmihoepaNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PMIHOEPANotCodeType }{@code >}
     *     
     */
    public void setPMIHOEPANotCode(JAXBElement<PMIHOEPANotCodeType> value) {
        this.pmihoepaNotCode = value;
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
     * Gets the value of the escrwPrvdPropType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrvdPropTypeType }{@code >}
     *     
     */
    public JAXBElement<EscrwPrvdPropTypeType> getEscrwPrvdPropType() {
        return escrwPrvdPropType;
    }

    /**
     * Sets the value of the escrwPrvdPropType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrvdPropTypeType }{@code >}
     *     
     */
    public void setEscrwPrvdPropType(JAXBElement<EscrwPrvdPropTypeType> value) {
        this.escrwPrvdPropType = value;
    }

    /**
     * Gets the value of the pmiHighRiskType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PMIHighRiskTypeType }{@code >}
     *     
     */
    public JAXBElement<PMIHighRiskTypeType> getPMIHighRiskType() {
        return pmiHighRiskType;
    }

    /**
     * Sets the value of the pmiHighRiskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PMIHighRiskTypeType }{@code >}
     *     
     */
    public void setPMIHighRiskType(JAXBElement<PMIHighRiskTypeType> value) {
        this.pmiHighRiskType = value;
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
     * Gets the value of the insurPlcyRebate property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyRebateType }
     *     
     */
    public InsurPlcyRebateType getInsurPlcyRebate() {
        return insurPlcyRebate;
    }

    /**
     * Sets the value of the insurPlcyRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyRebateType }
     *     
     */
    public void setInsurPlcyRebate(InsurPlcyRebateType value) {
        this.insurPlcyRebate = value;
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
     * Gets the value of the curPMILTVRatio property.
     * 
     * @return
     *     possible object is
     *     {@link CurPMILTVRatioType }
     *     
     */
    public CurPMILTVRatioType getCurPMILTVRatio() {
        return curPMILTVRatio;
    }

    /**
     * Sets the value of the curPMILTVRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurPMILTVRatioType }
     *     
     */
    public void setCurPMILTVRatio(CurPMILTVRatioType value) {
        this.curPMILTVRatio = value;
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
     * Gets the value of the openBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpenBalType }
     *     
     */
    public OpenBalType getOpenBal() {
        return openBal;
    }

    /**
     * Sets the value of the openBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenBalType }
     *     
     */
    public void setOpenBal(OpenBalType value) {
        this.openBal = value;
    }

    /**
     * Gets the value of the escrwPmtStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPmtStartDtType }
     *     
     */
    public EscrwPmtStartDtType getEscrwPmtStartDt() {
        return escrwPmtStartDt;
    }

    /**
     * Sets the value of the escrwPmtStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPmtStartDtType }
     *     
     */
    public void setEscrwPmtStartDt(EscrwPmtStartDtType value) {
        this.escrwPmtStartDt = value;
    }

    /**
     * Gets the value of the escrwDistrStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwDistrStartDtType }
     *     
     */
    public EscrwDistrStartDtType getEscrwDistrStartDt() {
        return escrwDistrStartDt;
    }

    /**
     * Sets the value of the escrwDistrStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwDistrStartDtType }
     *     
     */
    public void setEscrwDistrStartDt(EscrwDistrStartDtType value) {
        this.escrwDistrStartDt = value;
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
