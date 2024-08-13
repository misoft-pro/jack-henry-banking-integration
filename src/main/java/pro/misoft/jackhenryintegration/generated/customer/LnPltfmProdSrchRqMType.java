
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
 * This message is a documented filter statement. 
 * 
 * <p>Java class for LnPltfmProdSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPltfmProdSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="PltfmAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAcctTypeInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCustType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCatCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateType" type="{http://jackhenry.com/jxchange/TPG/2008}RateType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenFlrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FlrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenCeilAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CeilAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdTermFlr" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdTermCeil" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnTraitArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnTraitArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "LnPltfmProdSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "pltfmAcctType",
    "regionCode",
    "pltfmCustType",
    "brCode",
    "pltfmCatCode",
    "rateType",
    "collatCode",
    "purpCode",
    "openFlrAmt",
    "openCeilAmt",
    "plnType",
    "prodTermUnits",
    "prodTermFlr",
    "prodTermCeil",
    "lnTraitArray",
    "custom",
    "ver1",
    "any"
})
public class LnPltfmProdSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElementRef(name = "PltfmAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmAcctTypeInfoCType> pltfmAcctType;
    @XmlElementRef(name = "RegionCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionCodeType> regionCode;
    @XmlElementRef(name = "PltfmCustType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmCustTypeType> pltfmCustType;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "PltfmCatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmCatCodeType> pltfmCatCode;
    @XmlElementRef(name = "RateType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateTypeType> rateType;
    @XmlElementRef(name = "CollatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatCodeType> collatCode;
    @XmlElementRef(name = "PurpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PurpCodeType> purpCode;
    @XmlElementRef(name = "OpenFlrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FlrAmtType> openFlrAmt;
    @XmlElementRef(name = "OpenCeilAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CeilAmtType> openCeilAmt;
    @XmlElementRef(name = "PlnType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnTypeType> plnType;
    @XmlElementRef(name = "ProdTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> prodTermUnits;
    @XmlElementRef(name = "ProdTermFlr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> prodTermFlr;
    @XmlElementRef(name = "ProdTermCeil", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> prodTermCeil;
    @XmlElementRef(name = "LnTraitArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnTraitArrayAType> lnTraitArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public SrchMsgRqHdrCType getSrchMsgRqHdr() {
        return srchMsgRqHdr;
    }

    /**
     * Sets the value of the srchMsgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public void setSrchMsgRqHdr(SrchMsgRqHdrCType value) {
        this.srchMsgRqHdr = value;
    }

    /**
     * Gets the value of the pltfmAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmAcctTypeInfoCType }{@code >}
     *     
     */
    public JAXBElement<PltfmAcctTypeInfoCType> getPltfmAcctType() {
        return pltfmAcctType;
    }

    /**
     * Sets the value of the pltfmAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmAcctTypeInfoCType }{@code >}
     *     
     */
    public void setPltfmAcctType(JAXBElement<PltfmAcctTypeInfoCType> value) {
        this.pltfmAcctType = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionCodeType }{@code >}
     *     
     */
    public JAXBElement<RegionCodeType> getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionCodeType }{@code >}
     *     
     */
    public void setRegionCode(JAXBElement<RegionCodeType> value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the pltfmCustType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmCustTypeType }{@code >}
     *     
     */
    public JAXBElement<PltfmCustTypeType> getPltfmCustType() {
        return pltfmCustType;
    }

    /**
     * Sets the value of the pltfmCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmCustTypeType }{@code >}
     *     
     */
    public void setPltfmCustType(JAXBElement<PltfmCustTypeType> value) {
        this.pltfmCustType = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setBrCode(JAXBElement<BrCodeType> value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the pltfmCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmCatCodeType }{@code >}
     *     
     */
    public JAXBElement<PltfmCatCodeType> getPltfmCatCode() {
        return pltfmCatCode;
    }

    /**
     * Sets the value of the pltfmCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmCatCodeType }{@code >}
     *     
     */
    public void setPltfmCatCode(JAXBElement<PltfmCatCodeType> value) {
        this.pltfmCatCode = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateTypeType }{@code >}
     *     
     */
    public JAXBElement<RateTypeType> getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateTypeType }{@code >}
     *     
     */
    public void setRateType(JAXBElement<RateTypeType> value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the collatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatCodeType> getCollatCode() {
        return collatCode;
    }

    /**
     * Sets the value of the collatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public void setCollatCode(JAXBElement<CollatCodeType> value) {
        this.collatCode = value;
    }

    /**
     * Gets the value of the purpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PurpCodeType }{@code >}
     *     
     */
    public JAXBElement<PurpCodeType> getPurpCode() {
        return purpCode;
    }

    /**
     * Sets the value of the purpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurpCodeType }{@code >}
     *     
     */
    public void setPurpCode(JAXBElement<PurpCodeType> value) {
        this.purpCode = value;
    }

    /**
     * Gets the value of the openFlrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlrAmtType }{@code >}
     *     
     */
    public JAXBElement<FlrAmtType> getOpenFlrAmt() {
        return openFlrAmt;
    }

    /**
     * Sets the value of the openFlrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlrAmtType }{@code >}
     *     
     */
    public void setOpenFlrAmt(JAXBElement<FlrAmtType> value) {
        this.openFlrAmt = value;
    }

    /**
     * Gets the value of the openCeilAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CeilAmtType }{@code >}
     *     
     */
    public JAXBElement<CeilAmtType> getOpenCeilAmt() {
        return openCeilAmt;
    }

    /**
     * Sets the value of the openCeilAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CeilAmtType }{@code >}
     *     
     */
    public void setOpenCeilAmt(JAXBElement<CeilAmtType> value) {
        this.openCeilAmt = value;
    }

    /**
     * Gets the value of the plnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnTypeType }{@code >}
     *     
     */
    public JAXBElement<PlnTypeType> getPlnType() {
        return plnType;
    }

    /**
     * Sets the value of the plnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnTypeType }{@code >}
     *     
     */
    public void setPlnType(JAXBElement<PlnTypeType> value) {
        this.plnType = value;
    }

    /**
     * Gets the value of the prodTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getProdTermUnits() {
        return prodTermUnits;
    }

    /**
     * Sets the value of the prodTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setProdTermUnits(JAXBElement<TermUnitsType> value) {
        this.prodTermUnits = value;
    }

    /**
     * Gets the value of the prodTermFlr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getProdTermFlr() {
        return prodTermFlr;
    }

    /**
     * Sets the value of the prodTermFlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setProdTermFlr(JAXBElement<TermCntType> value) {
        this.prodTermFlr = value;
    }

    /**
     * Gets the value of the prodTermCeil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getProdTermCeil() {
        return prodTermCeil;
    }

    /**
     * Sets the value of the prodTermCeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setProdTermCeil(JAXBElement<TermCntType> value) {
        this.prodTermCeil = value;
    }

    /**
     * Gets the value of the lnTraitArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnTraitArrayAType }{@code >}
     *     
     */
    public JAXBElement<LnTraitArrayAType> getLnTraitArray() {
        return lnTraitArray;
    }

    /**
     * Sets the value of the lnTraitArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnTraitArrayAType }{@code >}
     *     
     */
    public void setLnTraitArray(JAXBElement<LnTraitArrayAType> value) {
        this.lnTraitArray = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
