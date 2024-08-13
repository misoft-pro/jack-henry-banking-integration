
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
 * <p>Java class for LnRealEstateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRealEstateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropStreet" type="{http://jackhenry.com/jxchange/TPG/2008}PropStreet_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropState" type="{http://jackhenry.com/jxchange/TPG/2008}PropState_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropPostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PropPostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropCity" type="{http://jackhenry.com/jxchange/TPG/2008}PropCity_Type" minOccurs="0"/&gt;
 *         &lt;element name="FloodInsurCode" type="{http://jackhenry.com/jxchange/TPG/2008}FloodInsurCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprVal" type="{http://jackhenry.com/jxchange/TPG/2008}ApprVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprDt" type="{http://jackhenry.com/jxchange/TPG/2008}ApprDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CondoPUDInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CondoPUDInfo_Type" minOccurs="0"/&gt;
 *           &lt;element name="ConstLnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ConstLnCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CorrBankCode" type="{http://jackhenry.com/jxchange/TPG/2008}CorrBankCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="OccupCode" type="{http://jackhenry.com/jxchange/TPG/2008}OccupCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ProjectCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProjectCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PropCounty" type="{http://jackhenry.com/jxchange/TPG/2008}PropCounty_Type" minOccurs="0"/&gt;
 *           &lt;element name="PropPurchaseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PropPurchaseAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="YrBuilt" type="{http://jackhenry.com/jxchange/TPG/2008}YrBuilt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FloodInsurExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}FloodInsurExpDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="AvgLeaseRate" type="{http://jackhenry.com/jxchange/TPG/2008}AvgLeaseRate_Type" minOccurs="0"/&gt;
 *               &lt;element name="CollatSrcValCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatSrcValCode_Type" minOccurs="0"/&gt;
 *               &lt;element name="CommPropSqFt" type="{http://jackhenry.com/jxchange/TPG/2008}CommPropSqFt_Type" minOccurs="0"/&gt;
 *               &lt;element name="NetOperIncm" type="{http://jackhenry.com/jxchange/TPG/2008}NetOperIncm_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropListAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PropListAmt_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropListDt" type="{http://jackhenry.com/jxchange/TPG/2008}PropListDt_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropMultiListId" type="{http://jackhenry.com/jxchange/TPG/2008}PropMultiListId_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropRelDt" type="{http://jackhenry.com/jxchange/TPG/2008}PropRelDt_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropRentSqFt" type="{http://jackhenry.com/jxchange/TPG/2008}PropRentSqFt_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropSqFt" type="{http://jackhenry.com/jxchange/TPG/2008}PropSqFt_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropSubDivName" type="{http://jackhenry.com/jxchange/TPG/2008}PropSubDivName_Type" minOccurs="0"/&gt;
 *               &lt;element name="PropVacRate" type="{http://jackhenry.com/jxchange/TPG/2008}PropVacRate_Type" minOccurs="0"/&gt;
 *               &lt;element name="RemNumUnit" type="{http://jackhenry.com/jxchange/TPG/2008}RemNumUnit_Type" minOccurs="0"/&gt;
 *               &lt;element name="RemUnitVal" type="{http://jackhenry.com/jxchange/TPG/2008}RemUnitVal_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="REOType" type="{http://jackhenry.com/jxchange/TPG/2008}REOType_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="TaxRptPropDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}TaxRptPropDescArray_AType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="CommOccupPct" type="{http://jackhenry.com/jxchange/TPG/2008}CommOccupPct_Type" minOccurs="0"/&gt;
 *                     &lt;element name="PropCondRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="FirstDefrComingDueNotDt" type="{http://jackhenry.com/jxchange/TPG/2008}DefrComingDueNotDt_Type" minOccurs="0"/&gt;
 *                       &lt;element name="SecdDefrComingDueNotDt" type="{http://jackhenry.com/jxchange/TPG/2008}DefrComingDueNotDt_Type" minOccurs="0"/&gt;
 *                       &lt;element name="DefrConDt" type="{http://jackhenry.com/jxchange/TPG/2008}DefrConDt_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LnRealEstateInfo_CType", propOrder = {
    "propStreet",
    "propState",
    "propPostalCode",
    "propCity",
    "floodInsurCode",
    "apprVal",
    "apprDt",
    "ver1",
    "condoPUDInfo",
    "constLnCode",
    "corrBankCode",
    "occupCode",
    "projectCode",
    "propCounty",
    "propPurchaseAmt",
    "yrBuilt",
    "ver2",
    "floodInsurExpDt",
    "ver3",
    "avgLeaseRate",
    "collatSrcValCode",
    "commPropSqFt",
    "netOperIncm",
    "propListAmt",
    "propListDt",
    "propMultiListId",
    "propRelDt",
    "propRentSqFt",
    "propSqFt",
    "propSubDivName",
    "propVacRate",
    "remNumUnit",
    "remUnitVal",
    "ver4",
    "reoType",
    "ver5",
    "taxRptPropDescArray",
    "ver6",
    "commOccupPct",
    "propCondRmk",
    "ver7",
    "firstDefrComingDueNotDt",
    "secdDefrComingDueNotDt",
    "defrConDt",
    "ver8",
    "any"
})
public class LnRealEstateInfoCType {

    @XmlElementRef(name = "PropStreet", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropStreetType> propStreet;
    @XmlElementRef(name = "PropState", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropStateType> propState;
    @XmlElementRef(name = "PropPostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropPostalCodeType> propPostalCode;
    @XmlElementRef(name = "PropCity", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropCityType> propCity;
    @XmlElementRef(name = "FloodInsurCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FloodInsurCodeType> floodInsurCode;
    @XmlElementRef(name = "ApprVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ApprValType> apprVal;
    @XmlElementRef(name = "ApprDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ApprDtType> apprDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CondoPUDInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CondoPUDInfoType> condoPUDInfo;
    @XmlElementRef(name = "ConstLnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConstLnCodeType> constLnCode;
    @XmlElementRef(name = "CorrBankCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CorrBankCodeType> corrBankCode;
    @XmlElementRef(name = "OccupCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OccupCodeType> occupCode;
    @XmlElementRef(name = "ProjectCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectCodeType> projectCode;
    @XmlElementRef(name = "PropCounty", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropCountyType> propCounty;
    @XmlElementRef(name = "PropPurchaseAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropPurchaseAmtType> propPurchaseAmt;
    @XmlElementRef(name = "YrBuilt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YrBuiltType> yrBuilt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "FloodInsurExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FloodInsurExpDtType> floodInsurExpDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "AvgLeaseRate")
    protected AvgLeaseRateType avgLeaseRate;
    @XmlElement(name = "CollatSrcValCode")
    protected CollatSrcValCodeType collatSrcValCode;
    @XmlElement(name = "CommPropSqFt")
    protected CommPropSqFtType commPropSqFt;
    @XmlElement(name = "NetOperIncm")
    protected NetOperIncmType netOperIncm;
    @XmlElement(name = "PropListAmt")
    protected PropListAmtType propListAmt;
    @XmlElement(name = "PropListDt")
    protected PropListDtType propListDt;
    @XmlElement(name = "PropMultiListId")
    protected PropMultiListIdType propMultiListId;
    @XmlElement(name = "PropRelDt")
    protected PropRelDtType propRelDt;
    @XmlElement(name = "PropRentSqFt")
    protected PropRentSqFtType propRentSqFt;
    @XmlElement(name = "PropSqFt")
    protected PropSqFtType propSqFt;
    @XmlElement(name = "PropSubDivName")
    protected PropSubDivNameType propSubDivName;
    @XmlElement(name = "PropVacRate")
    protected PropVacRateType propVacRate;
    @XmlElement(name = "RemNumUnit")
    protected RemNumUnitType remNumUnit;
    @XmlElement(name = "RemUnitVal")
    protected RemUnitValType remUnitVal;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "REOType")
    protected REOTypeType reoType;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "TaxRptPropDescArray")
    protected TaxRptPropDescArrayAType taxRptPropDescArray;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "CommOccupPct")
    protected CommOccupPctType commOccupPct;
    @XmlElement(name = "PropCondRmk")
    protected RmkType propCondRmk;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "FirstDefrComingDueNotDt")
    protected DefrComingDueNotDtType firstDefrComingDueNotDt;
    @XmlElement(name = "SecdDefrComingDueNotDt")
    protected DefrComingDueNotDtType secdDefrComingDueNotDt;
    @XmlElement(name = "DefrConDt")
    protected DefrConDtType defrConDt;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the propStreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropStreetType }{@code >}
     *     
     */
    public JAXBElement<PropStreetType> getPropStreet() {
        return propStreet;
    }

    /**
     * Sets the value of the propStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropStreetType }{@code >}
     *     
     */
    public void setPropStreet(JAXBElement<PropStreetType> value) {
        this.propStreet = value;
    }

    /**
     * Gets the value of the propState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropStateType }{@code >}
     *     
     */
    public JAXBElement<PropStateType> getPropState() {
        return propState;
    }

    /**
     * Sets the value of the propState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropStateType }{@code >}
     *     
     */
    public void setPropState(JAXBElement<PropStateType> value) {
        this.propState = value;
    }

    /**
     * Gets the value of the propPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropPostalCodeType }{@code >}
     *     
     */
    public JAXBElement<PropPostalCodeType> getPropPostalCode() {
        return propPostalCode;
    }

    /**
     * Sets the value of the propPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropPostalCodeType }{@code >}
     *     
     */
    public void setPropPostalCode(JAXBElement<PropPostalCodeType> value) {
        this.propPostalCode = value;
    }

    /**
     * Gets the value of the propCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropCityType }{@code >}
     *     
     */
    public JAXBElement<PropCityType> getPropCity() {
        return propCity;
    }

    /**
     * Sets the value of the propCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropCityType }{@code >}
     *     
     */
    public void setPropCity(JAXBElement<PropCityType> value) {
        this.propCity = value;
    }

    /**
     * Gets the value of the floodInsurCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FloodInsurCodeType }{@code >}
     *     
     */
    public JAXBElement<FloodInsurCodeType> getFloodInsurCode() {
        return floodInsurCode;
    }

    /**
     * Sets the value of the floodInsurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FloodInsurCodeType }{@code >}
     *     
     */
    public void setFloodInsurCode(JAXBElement<FloodInsurCodeType> value) {
        this.floodInsurCode = value;
    }

    /**
     * Gets the value of the apprVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApprValType }{@code >}
     *     
     */
    public JAXBElement<ApprValType> getApprVal() {
        return apprVal;
    }

    /**
     * Sets the value of the apprVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApprValType }{@code >}
     *     
     */
    public void setApprVal(JAXBElement<ApprValType> value) {
        this.apprVal = value;
    }

    /**
     * Gets the value of the apprDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApprDtType }{@code >}
     *     
     */
    public JAXBElement<ApprDtType> getApprDt() {
        return apprDt;
    }

    /**
     * Sets the value of the apprDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApprDtType }{@code >}
     *     
     */
    public void setApprDt(JAXBElement<ApprDtType> value) {
        this.apprDt = value;
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
     * Gets the value of the condoPUDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CondoPUDInfoType }{@code >}
     *     
     */
    public JAXBElement<CondoPUDInfoType> getCondoPUDInfo() {
        return condoPUDInfo;
    }

    /**
     * Sets the value of the condoPUDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CondoPUDInfoType }{@code >}
     *     
     */
    public void setCondoPUDInfo(JAXBElement<CondoPUDInfoType> value) {
        this.condoPUDInfo = value;
    }

    /**
     * Gets the value of the constLnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConstLnCodeType }{@code >}
     *     
     */
    public JAXBElement<ConstLnCodeType> getConstLnCode() {
        return constLnCode;
    }

    /**
     * Sets the value of the constLnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConstLnCodeType }{@code >}
     *     
     */
    public void setConstLnCode(JAXBElement<ConstLnCodeType> value) {
        this.constLnCode = value;
    }

    /**
     * Gets the value of the corrBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CorrBankCodeType }{@code >}
     *     
     */
    public JAXBElement<CorrBankCodeType> getCorrBankCode() {
        return corrBankCode;
    }

    /**
     * Sets the value of the corrBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CorrBankCodeType }{@code >}
     *     
     */
    public void setCorrBankCode(JAXBElement<CorrBankCodeType> value) {
        this.corrBankCode = value;
    }

    /**
     * Gets the value of the occupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OccupCodeType }{@code >}
     *     
     */
    public JAXBElement<OccupCodeType> getOccupCode() {
        return occupCode;
    }

    /**
     * Sets the value of the occupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OccupCodeType }{@code >}
     *     
     */
    public void setOccupCode(JAXBElement<OccupCodeType> value) {
        this.occupCode = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectCodeType }{@code >}
     *     
     */
    public JAXBElement<ProjectCodeType> getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectCodeType }{@code >}
     *     
     */
    public void setProjectCode(JAXBElement<ProjectCodeType> value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the propCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropCountyType }{@code >}
     *     
     */
    public JAXBElement<PropCountyType> getPropCounty() {
        return propCounty;
    }

    /**
     * Sets the value of the propCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropCountyType }{@code >}
     *     
     */
    public void setPropCounty(JAXBElement<PropCountyType> value) {
        this.propCounty = value;
    }

    /**
     * Gets the value of the propPurchaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropPurchaseAmtType }{@code >}
     *     
     */
    public JAXBElement<PropPurchaseAmtType> getPropPurchaseAmt() {
        return propPurchaseAmt;
    }

    /**
     * Sets the value of the propPurchaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropPurchaseAmtType }{@code >}
     *     
     */
    public void setPropPurchaseAmt(JAXBElement<PropPurchaseAmtType> value) {
        this.propPurchaseAmt = value;
    }

    /**
     * Gets the value of the yrBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YrBuiltType }{@code >}
     *     
     */
    public JAXBElement<YrBuiltType> getYrBuilt() {
        return yrBuilt;
    }

    /**
     * Sets the value of the yrBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YrBuiltType }{@code >}
     *     
     */
    public void setYrBuilt(JAXBElement<YrBuiltType> value) {
        this.yrBuilt = value;
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
     * Gets the value of the floodInsurExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FloodInsurExpDtType }{@code >}
     *     
     */
    public JAXBElement<FloodInsurExpDtType> getFloodInsurExpDt() {
        return floodInsurExpDt;
    }

    /**
     * Sets the value of the floodInsurExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FloodInsurExpDtType }{@code >}
     *     
     */
    public void setFloodInsurExpDt(JAXBElement<FloodInsurExpDtType> value) {
        this.floodInsurExpDt = value;
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
     * Gets the value of the avgLeaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link AvgLeaseRateType }
     *     
     */
    public AvgLeaseRateType getAvgLeaseRate() {
        return avgLeaseRate;
    }

    /**
     * Sets the value of the avgLeaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgLeaseRateType }
     *     
     */
    public void setAvgLeaseRate(AvgLeaseRateType value) {
        this.avgLeaseRate = value;
    }

    /**
     * Gets the value of the collatSrcValCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatSrcValCodeType }
     *     
     */
    public CollatSrcValCodeType getCollatSrcValCode() {
        return collatSrcValCode;
    }

    /**
     * Sets the value of the collatSrcValCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatSrcValCodeType }
     *     
     */
    public void setCollatSrcValCode(CollatSrcValCodeType value) {
        this.collatSrcValCode = value;
    }

    /**
     * Gets the value of the commPropSqFt property.
     * 
     * @return
     *     possible object is
     *     {@link CommPropSqFtType }
     *     
     */
    public CommPropSqFtType getCommPropSqFt() {
        return commPropSqFt;
    }

    /**
     * Sets the value of the commPropSqFt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPropSqFtType }
     *     
     */
    public void setCommPropSqFt(CommPropSqFtType value) {
        this.commPropSqFt = value;
    }

    /**
     * Gets the value of the netOperIncm property.
     * 
     * @return
     *     possible object is
     *     {@link NetOperIncmType }
     *     
     */
    public NetOperIncmType getNetOperIncm() {
        return netOperIncm;
    }

    /**
     * Sets the value of the netOperIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetOperIncmType }
     *     
     */
    public void setNetOperIncm(NetOperIncmType value) {
        this.netOperIncm = value;
    }

    /**
     * Gets the value of the propListAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PropListAmtType }
     *     
     */
    public PropListAmtType getPropListAmt() {
        return propListAmt;
    }

    /**
     * Sets the value of the propListAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropListAmtType }
     *     
     */
    public void setPropListAmt(PropListAmtType value) {
        this.propListAmt = value;
    }

    /**
     * Gets the value of the propListDt property.
     * 
     * @return
     *     possible object is
     *     {@link PropListDtType }
     *     
     */
    public PropListDtType getPropListDt() {
        return propListDt;
    }

    /**
     * Sets the value of the propListDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropListDtType }
     *     
     */
    public void setPropListDt(PropListDtType value) {
        this.propListDt = value;
    }

    /**
     * Gets the value of the propMultiListId property.
     * 
     * @return
     *     possible object is
     *     {@link PropMultiListIdType }
     *     
     */
    public PropMultiListIdType getPropMultiListId() {
        return propMultiListId;
    }

    /**
     * Sets the value of the propMultiListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropMultiListIdType }
     *     
     */
    public void setPropMultiListId(PropMultiListIdType value) {
        this.propMultiListId = value;
    }

    /**
     * Gets the value of the propRelDt property.
     * 
     * @return
     *     possible object is
     *     {@link PropRelDtType }
     *     
     */
    public PropRelDtType getPropRelDt() {
        return propRelDt;
    }

    /**
     * Sets the value of the propRelDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropRelDtType }
     *     
     */
    public void setPropRelDt(PropRelDtType value) {
        this.propRelDt = value;
    }

    /**
     * Gets the value of the propRentSqFt property.
     * 
     * @return
     *     possible object is
     *     {@link PropRentSqFtType }
     *     
     */
    public PropRentSqFtType getPropRentSqFt() {
        return propRentSqFt;
    }

    /**
     * Sets the value of the propRentSqFt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropRentSqFtType }
     *     
     */
    public void setPropRentSqFt(PropRentSqFtType value) {
        this.propRentSqFt = value;
    }

    /**
     * Gets the value of the propSqFt property.
     * 
     * @return
     *     possible object is
     *     {@link PropSqFtType }
     *     
     */
    public PropSqFtType getPropSqFt() {
        return propSqFt;
    }

    /**
     * Sets the value of the propSqFt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropSqFtType }
     *     
     */
    public void setPropSqFt(PropSqFtType value) {
        this.propSqFt = value;
    }

    /**
     * Gets the value of the propSubDivName property.
     * 
     * @return
     *     possible object is
     *     {@link PropSubDivNameType }
     *     
     */
    public PropSubDivNameType getPropSubDivName() {
        return propSubDivName;
    }

    /**
     * Sets the value of the propSubDivName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropSubDivNameType }
     *     
     */
    public void setPropSubDivName(PropSubDivNameType value) {
        this.propSubDivName = value;
    }

    /**
     * Gets the value of the propVacRate property.
     * 
     * @return
     *     possible object is
     *     {@link PropVacRateType }
     *     
     */
    public PropVacRateType getPropVacRate() {
        return propVacRate;
    }

    /**
     * Sets the value of the propVacRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropVacRateType }
     *     
     */
    public void setPropVacRate(PropVacRateType value) {
        this.propVacRate = value;
    }

    /**
     * Gets the value of the remNumUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RemNumUnitType }
     *     
     */
    public RemNumUnitType getRemNumUnit() {
        return remNumUnit;
    }

    /**
     * Sets the value of the remNumUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemNumUnitType }
     *     
     */
    public void setRemNumUnit(RemNumUnitType value) {
        this.remNumUnit = value;
    }

    /**
     * Gets the value of the remUnitVal property.
     * 
     * @return
     *     possible object is
     *     {@link RemUnitValType }
     *     
     */
    public RemUnitValType getRemUnitVal() {
        return remUnitVal;
    }

    /**
     * Sets the value of the remUnitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemUnitValType }
     *     
     */
    public void setRemUnitVal(RemUnitValType value) {
        this.remUnitVal = value;
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
     * Gets the value of the reoType property.
     * 
     * @return
     *     possible object is
     *     {@link REOTypeType }
     *     
     */
    public REOTypeType getREOType() {
        return reoType;
    }

    /**
     * Sets the value of the reoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOTypeType }
     *     
     */
    public void setREOType(REOTypeType value) {
        this.reoType = value;
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
     * Gets the value of the taxRptPropDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRptPropDescArrayAType }
     *     
     */
    public TaxRptPropDescArrayAType getTaxRptPropDescArray() {
        return taxRptPropDescArray;
    }

    /**
     * Sets the value of the taxRptPropDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRptPropDescArrayAType }
     *     
     */
    public void setTaxRptPropDescArray(TaxRptPropDescArrayAType value) {
        this.taxRptPropDescArray = value;
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
     * Gets the value of the commOccupPct property.
     * 
     * @return
     *     possible object is
     *     {@link CommOccupPctType }
     *     
     */
    public CommOccupPctType getCommOccupPct() {
        return commOccupPct;
    }

    /**
     * Sets the value of the commOccupPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommOccupPctType }
     *     
     */
    public void setCommOccupPct(CommOccupPctType value) {
        this.commOccupPct = value;
    }

    /**
     * Gets the value of the propCondRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getPropCondRmk() {
        return propCondRmk;
    }

    /**
     * Sets the value of the propCondRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setPropCondRmk(RmkType value) {
        this.propCondRmk = value;
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
     * Gets the value of the firstDefrComingDueNotDt property.
     * 
     * @return
     *     possible object is
     *     {@link DefrComingDueNotDtType }
     *     
     */
    public DefrComingDueNotDtType getFirstDefrComingDueNotDt() {
        return firstDefrComingDueNotDt;
    }

    /**
     * Sets the value of the firstDefrComingDueNotDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefrComingDueNotDtType }
     *     
     */
    public void setFirstDefrComingDueNotDt(DefrComingDueNotDtType value) {
        this.firstDefrComingDueNotDt = value;
    }

    /**
     * Gets the value of the secdDefrComingDueNotDt property.
     * 
     * @return
     *     possible object is
     *     {@link DefrComingDueNotDtType }
     *     
     */
    public DefrComingDueNotDtType getSecdDefrComingDueNotDt() {
        return secdDefrComingDueNotDt;
    }

    /**
     * Sets the value of the secdDefrComingDueNotDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefrComingDueNotDtType }
     *     
     */
    public void setSecdDefrComingDueNotDt(DefrComingDueNotDtType value) {
        this.secdDefrComingDueNotDt = value;
    }

    /**
     * Gets the value of the defrConDt property.
     * 
     * @return
     *     possible object is
     *     {@link DefrConDtType }
     *     
     */
    public DefrConDtType getDefrConDt() {
        return defrConDt;
    }

    /**
     * Sets the value of the defrConDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefrConDtType }
     *     
     */
    public void setDefrConDt(DefrConDtType value) {
        this.defrConDt = value;
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
