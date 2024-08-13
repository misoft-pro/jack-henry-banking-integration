
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * The complex for submission of a loan application that contains the
 *                 general information of the application
 * 
 * <p>Java class for PltfmAppLnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppLnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrAppCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrAppCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProceedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ProceedAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BallPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BallPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntCalcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnRePmtSrc" type="{http://jackhenry.com/jxchange/TPG/2008}LnRePmtSrc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateType" type="{http://jackhenry.com/jxchange/TPG/2008}RateType_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnAppType" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PltfmClsfPrimType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmClsfPrimType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppLnInfo_CType", propOrder = {
    "crAppCode",
    "custId",
    "prodCode",
    "brCode",
    "proceedAmt",
    "intRate",
    "rateIdxDesc",
    "pmtCode",
    "ballPmtAmt",
    "pmtTerm",
    "lnTerm",
    "intCalcCode",
    "firstPmtDt",
    "purpCode",
    "lnRePmtSrc",
    "ver1",
    "regionCode",
    "rateType",
    "lnAppType",
    "pltfmClsfPrimType",
    "ver2",
    "any"
})
public class PltfmAppLnInfoCType {

    @XmlElement(name = "CrAppCode")
    protected CrAppCodeType crAppCode;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "ProdCode")
    protected ProdCodeType prodCode;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "ProceedAmt")
    protected ProceedAmtType proceedAmt;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "RateIdxDesc")
    protected RateIdxDescType rateIdxDesc;
    @XmlElement(name = "PmtCode")
    protected PmtCodeType pmtCode;
    @XmlElement(name = "BallPmtAmt")
    protected BallPmtAmtType ballPmtAmt;
    @XmlElement(name = "PmtTerm")
    protected TermCType pmtTerm;
    @XmlElement(name = "LnTerm")
    protected TermCType lnTerm;
    @XmlElement(name = "IntCalcCode")
    protected IntCalcCodeType intCalcCode;
    @XmlElement(name = "FirstPmtDt")
    protected FirstPmtDtType firstPmtDt;
    @XmlElement(name = "PurpCode")
    protected PurpCodeType purpCode;
    @XmlElement(name = "LnRePmtSrc")
    protected LnRePmtSrcType lnRePmtSrc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RegionCode")
    protected RegionCodeType regionCode;
    @XmlElement(name = "RateType")
    protected RateTypeType rateType;
    @XmlElement(name = "LnAppType")
    protected LnAppTypeType lnAppType;
    @XmlElement(name = "PltfmClsfPrimType")
    protected PltfmClsfPrimTypeType pltfmClsfPrimType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crAppCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrAppCodeType }
     *     
     */
    public CrAppCodeType getCrAppCode() {
        return crAppCode;
    }

    /**
     * Sets the value of the crAppCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrAppCodeType }
     *     
     */
    public void setCrAppCode(CrAppCodeType value) {
        this.crAppCode = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setProdCode(ProdCodeType value) {
        this.prodCode = value;
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
     * Gets the value of the proceedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ProceedAmtType }
     *     
     */
    public ProceedAmtType getProceedAmt() {
        return proceedAmt;
    }

    /**
     * Sets the value of the proceedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProceedAmtType }
     *     
     */
    public void setProceedAmt(ProceedAmtType value) {
        this.proceedAmt = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the rateIdxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxDescType }
     *     
     */
    public RateIdxDescType getRateIdxDesc() {
        return rateIdxDesc;
    }

    /**
     * Sets the value of the rateIdxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxDescType }
     *     
     */
    public void setRateIdxDesc(RateIdxDescType value) {
        this.rateIdxDesc = value;
    }

    /**
     * Gets the value of the pmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCodeType }
     *     
     */
    public PmtCodeType getPmtCode() {
        return pmtCode;
    }

    /**
     * Sets the value of the pmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCodeType }
     *     
     */
    public void setPmtCode(PmtCodeType value) {
        this.pmtCode = value;
    }

    /**
     * Gets the value of the ballPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BallPmtAmtType }
     *     
     */
    public BallPmtAmtType getBallPmtAmt() {
        return ballPmtAmt;
    }

    /**
     * Sets the value of the ballPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BallPmtAmtType }
     *     
     */
    public void setBallPmtAmt(BallPmtAmtType value) {
        this.ballPmtAmt = value;
    }

    /**
     * Gets the value of the pmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getPmtTerm() {
        return pmtTerm;
    }

    /**
     * Sets the value of the pmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setPmtTerm(TermCType value) {
        this.pmtTerm = value;
    }

    /**
     * Gets the value of the lnTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getLnTerm() {
        return lnTerm;
    }

    /**
     * Sets the value of the lnTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setLnTerm(TermCType value) {
        this.lnTerm = value;
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
     * Gets the value of the firstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstPmtDtType }
     *     
     */
    public FirstPmtDtType getFirstPmtDt() {
        return firstPmtDt;
    }

    /**
     * Sets the value of the firstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstPmtDtType }
     *     
     */
    public void setFirstPmtDt(FirstPmtDtType value) {
        this.firstPmtDt = value;
    }

    /**
     * Gets the value of the purpCode property.
     * 
     * @return
     *     possible object is
     *     {@link PurpCodeType }
     *     
     */
    public PurpCodeType getPurpCode() {
        return purpCode;
    }

    /**
     * Sets the value of the purpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpCodeType }
     *     
     */
    public void setPurpCode(PurpCodeType value) {
        this.purpCode = value;
    }

    /**
     * Gets the value of the lnRePmtSrc property.
     * 
     * @return
     *     possible object is
     *     {@link LnRePmtSrcType }
     *     
     */
    public LnRePmtSrcType getLnRePmtSrc() {
        return lnRePmtSrc;
    }

    /**
     * Sets the value of the lnRePmtSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRePmtSrcType }
     *     
     */
    public void setLnRePmtSrc(LnRePmtSrcType value) {
        this.lnRePmtSrc = value;
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
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeType }
     *     
     */
    public RegionCodeType getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeType }
     *     
     */
    public void setRegionCode(RegionCodeType value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeType }
     *     
     */
    public RateTypeType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeType }
     *     
     */
    public void setRateType(RateTypeType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the lnAppType property.
     * 
     * @return
     *     possible object is
     *     {@link LnAppTypeType }
     *     
     */
    public LnAppTypeType getLnAppType() {
        return lnAppType;
    }

    /**
     * Sets the value of the lnAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAppTypeType }
     *     
     */
    public void setLnAppType(LnAppTypeType value) {
        this.lnAppType = value;
    }

    /**
     * Gets the value of the pltfmClsfPrimType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmClsfPrimTypeType }
     *     
     */
    public PltfmClsfPrimTypeType getPltfmClsfPrimType() {
        return pltfmClsfPrimType;
    }

    /**
     * Sets the value of the pltfmClsfPrimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmClsfPrimTypeType }
     *     
     */
    public void setPltfmClsfPrimType(PltfmClsfPrimTypeType value) {
        this.pltfmClsfPrimType = value;
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
