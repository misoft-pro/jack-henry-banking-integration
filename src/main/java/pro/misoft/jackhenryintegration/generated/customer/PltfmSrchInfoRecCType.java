
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PltfmSrchInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmSrchInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAcctTypeInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCustType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCatCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenFlrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FlrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenCeilAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CeilAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateTypeArray" type="{http://jackhenry.com/jxchange/TPG/2008}RateTypeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CollatCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PurpCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}PurposeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdTermArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProdTermArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="LnTraitArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnTraitArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PltfmPkgArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmPkgArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PltfmProdDispType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmProdDispType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmSrchInfoRec_CType", propOrder = {
    "pltfmProdCode",
    "pltfmAcctType",
    "regionCode",
    "pltfmCustType",
    "brCode",
    "pltfmCatCode",
    "openFlrAmt",
    "openCeilAmt",
    "plnType",
    "rateTypeArray",
    "collatCodeArray",
    "purpCodeArray",
    "prodTermArray",
    "lnTraitArray",
    "ver1",
    "pltfmPkgArray",
    "ver2",
    "pltfmProdDispType",
    "ver3",
    "any"
})
public class PltfmSrchInfoRecCType {

    @XmlElement(name = "PltfmProdCode")
    protected ProdCodeType pltfmProdCode;
    @XmlElement(name = "PltfmAcctType")
    protected PltfmAcctTypeInfoCType pltfmAcctType;
    @XmlElement(name = "RegionCode")
    protected RegionCodeType regionCode;
    @XmlElement(name = "PltfmCustType")
    protected PltfmCustTypeType pltfmCustType;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "PltfmCatCode")
    protected PltfmCatCodeType pltfmCatCode;
    @XmlElement(name = "OpenFlrAmt")
    protected FlrAmtType openFlrAmt;
    @XmlElement(name = "OpenCeilAmt")
    protected CeilAmtType openCeilAmt;
    @XmlElement(name = "PlnType")
    protected PlnTypeType plnType;
    @XmlElement(name = "RateTypeArray")
    protected RateTypeArrayAType rateTypeArray;
    @XmlElement(name = "CollatCodeArray")
    protected CollatArrayAType collatCodeArray;
    @XmlElement(name = "PurpCodeArray")
    protected PurposeArrayAType purpCodeArray;
    @XmlElement(name = "ProdTermArray")
    protected ProdTermArrayAType prodTermArray;
    @XmlElement(name = "LnTraitArray")
    protected LnTraitArrayAType lnTraitArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PltfmPkgArray")
    protected PltfmPkgArrayAType pltfmPkgArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PltfmProdDispType")
    protected PltfmProdDispTypeType pltfmProdDispType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pltfmProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getPltfmProdCode() {
        return pltfmProdCode;
    }

    /**
     * Sets the value of the pltfmProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setPltfmProdCode(ProdCodeType value) {
        this.pltfmProdCode = value;
    }

    /**
     * Gets the value of the pltfmAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAcctTypeInfoCType }
     *     
     */
    public PltfmAcctTypeInfoCType getPltfmAcctType() {
        return pltfmAcctType;
    }

    /**
     * Sets the value of the pltfmAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAcctTypeInfoCType }
     *     
     */
    public void setPltfmAcctType(PltfmAcctTypeInfoCType value) {
        this.pltfmAcctType = value;
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
     * Gets the value of the pltfmCustType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmCustTypeType }
     *     
     */
    public PltfmCustTypeType getPltfmCustType() {
        return pltfmCustType;
    }

    /**
     * Sets the value of the pltfmCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmCustTypeType }
     *     
     */
    public void setPltfmCustType(PltfmCustTypeType value) {
        this.pltfmCustType = value;
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
     * Gets the value of the pltfmCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmCatCodeType }
     *     
     */
    public PltfmCatCodeType getPltfmCatCode() {
        return pltfmCatCode;
    }

    /**
     * Sets the value of the pltfmCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmCatCodeType }
     *     
     */
    public void setPltfmCatCode(PltfmCatCodeType value) {
        this.pltfmCatCode = value;
    }

    /**
     * Gets the value of the openFlrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FlrAmtType }
     *     
     */
    public FlrAmtType getOpenFlrAmt() {
        return openFlrAmt;
    }

    /**
     * Sets the value of the openFlrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlrAmtType }
     *     
     */
    public void setOpenFlrAmt(FlrAmtType value) {
        this.openFlrAmt = value;
    }

    /**
     * Gets the value of the openCeilAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CeilAmtType }
     *     
     */
    public CeilAmtType getOpenCeilAmt() {
        return openCeilAmt;
    }

    /**
     * Sets the value of the openCeilAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CeilAmtType }
     *     
     */
    public void setOpenCeilAmt(CeilAmtType value) {
        this.openCeilAmt = value;
    }

    /**
     * Gets the value of the plnType property.
     * 
     * @return
     *     possible object is
     *     {@link PlnTypeType }
     *     
     */
    public PlnTypeType getPlnType() {
        return plnType;
    }

    /**
     * Sets the value of the plnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnTypeType }
     *     
     */
    public void setPlnType(PlnTypeType value) {
        this.plnType = value;
    }

    /**
     * Gets the value of the rateTypeArray property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeArrayAType }
     *     
     */
    public RateTypeArrayAType getRateTypeArray() {
        return rateTypeArray;
    }

    /**
     * Sets the value of the rateTypeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeArrayAType }
     *     
     */
    public void setRateTypeArray(RateTypeArrayAType value) {
        this.rateTypeArray = value;
    }

    /**
     * Gets the value of the collatCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link CollatArrayAType }
     *     
     */
    public CollatArrayAType getCollatCodeArray() {
        return collatCodeArray;
    }

    /**
     * Sets the value of the collatCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatArrayAType }
     *     
     */
    public void setCollatCodeArray(CollatArrayAType value) {
        this.collatCodeArray = value;
    }

    /**
     * Gets the value of the purpCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeArrayAType }
     *     
     */
    public PurposeArrayAType getPurpCodeArray() {
        return purpCodeArray;
    }

    /**
     * Sets the value of the purpCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeArrayAType }
     *     
     */
    public void setPurpCodeArray(PurposeArrayAType value) {
        this.purpCodeArray = value;
    }

    /**
     * Gets the value of the prodTermArray property.
     * 
     * @return
     *     possible object is
     *     {@link ProdTermArrayAType }
     *     
     */
    public ProdTermArrayAType getProdTermArray() {
        return prodTermArray;
    }

    /**
     * Sets the value of the prodTermArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdTermArrayAType }
     *     
     */
    public void setProdTermArray(ProdTermArrayAType value) {
        this.prodTermArray = value;
    }

    /**
     * Gets the value of the lnTraitArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnTraitArrayAType }
     *     
     */
    public LnTraitArrayAType getLnTraitArray() {
        return lnTraitArray;
    }

    /**
     * Sets the value of the lnTraitArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnTraitArrayAType }
     *     
     */
    public void setLnTraitArray(LnTraitArrayAType value) {
        this.lnTraitArray = value;
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
     * Gets the value of the pltfmPkgArray property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmPkgArrayAType }
     *     
     */
    public PltfmPkgArrayAType getPltfmPkgArray() {
        return pltfmPkgArray;
    }

    /**
     * Sets the value of the pltfmPkgArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmPkgArrayAType }
     *     
     */
    public void setPltfmPkgArray(PltfmPkgArrayAType value) {
        this.pltfmPkgArray = value;
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
     * Gets the value of the pltfmProdDispType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmProdDispTypeType }
     *     
     */
    public PltfmProdDispTypeType getPltfmProdDispType() {
        return pltfmProdDispType;
    }

    /**
     * Sets the value of the pltfmProdDispType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmProdDispTypeType }
     *     
     */
    public void setPltfmProdDispType(PltfmProdDispTypeType value) {
        this.pltfmProdDispType = value;
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
