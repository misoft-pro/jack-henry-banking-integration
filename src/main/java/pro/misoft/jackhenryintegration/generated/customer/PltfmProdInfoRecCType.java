
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
 * <p>Java class for PltfmProdInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmProdInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAcctTypeInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCatCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdCompareCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCustType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntTerm" type="{http://jackhenry.com/jxchange/TPG/2008}IntTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}IntTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktgMsg" type="{http://jackhenry.com/jxchange/TPG/2008}Msg_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinIntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxIntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="InitIntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="InitIntRateTerm" type="{http://jackhenry.com/jxchange/TPG/2008}IntTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="InitIntRateTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}IntTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustProfCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustProfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasis_Type" minOccurs="0"/&gt;
 *         &lt;element name="DestProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmProdImg" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmProdImg_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmProdImgFormat" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmProdImgFormatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrstHTML" type="{http://jackhenry.com/jxchange/TPG/2008}PrstHTML_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdTermArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProdTermArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdSvcOptArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProdSvcOptArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdFeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProdFeeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="DiscArray" type="{http://jackhenry.com/jxchange/TPG/2008}DiscArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CrossSellProdArray" type="{http://jackhenry.com/jxchange/TPG/2008}CrossSellProdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdCompareArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCompareArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="RateTypeArray" type="{http://jackhenry.com/jxchange/TPG/2008}RateTypeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="DepItems" type="{http://jackhenry.com/jxchange/TPG/2008}DepItems_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepItems" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepItems_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnItems" type="{http://jackhenry.com/jxchange/TPG/2008}LnItems_CType" minOccurs="0"/&gt;
 *         &lt;element name="SafeBoxItems" type="{http://jackhenry.com/jxchange/TPG/2008}SafeBoxItems_CType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmProdInfoRec_CType", propOrder = {
    "pltfmAcctType",
    "regionCode",
    "brCode",
    "pltfmCatCode",
    "pltfmProdCode",
    "prodCompareCode",
    "pltfmCustType",
    "intTerm",
    "intTermUnits",
    "mktgMsg",
    "prodEffDt",
    "prodExpDt",
    "minIntRate",
    "maxIntRate",
    "initIntRate",
    "initIntRateTerm",
    "initIntRateTermUnits",
    "custProfCode",
    "intBasis",
    "destProdCode",
    "pltfmProdImg",
    "pltfmProdImgFormat",
    "prstHTML",
    "prodTermArray",
    "prodSvcOptArray",
    "prodFeeArray",
    "discArray",
    "crossSellProdArray",
    "prodCompareArray",
    "rateTypeArray",
    "depItems",
    "timeDepItems",
    "lnItems",
    "safeBoxItems",
    "ver1",
    "any"
})
public class PltfmProdInfoRecCType {

    @XmlElement(name = "PltfmAcctType")
    protected PltfmAcctTypeInfoCType pltfmAcctType;
    @XmlElement(name = "RegionCode")
    protected RegionCodeType regionCode;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "PltfmCatCode")
    protected PltfmCatCodeType pltfmCatCode;
    @XmlElement(name = "PltfmProdCode")
    protected ProdCodeType pltfmProdCode;
    @XmlElement(name = "ProdCompareCode")
    protected ProdCodeType prodCompareCode;
    @XmlElement(name = "PltfmCustType")
    protected PltfmCustTypeType pltfmCustType;
    @XmlElement(name = "IntTerm")
    protected IntTermType intTerm;
    @XmlElement(name = "IntTermUnits")
    protected IntTermUnitsType intTermUnits;
    @XmlElement(name = "MktgMsg")
    protected MsgType mktgMsg;
    @XmlElement(name = "ProdEffDt")
    protected EffDtType prodEffDt;
    @XmlElement(name = "ProdExpDt")
    protected ExpDtType prodExpDt;
    @XmlElement(name = "MinIntRate")
    protected IntRateType minIntRate;
    @XmlElement(name = "MaxIntRate")
    protected IntRateType maxIntRate;
    @XmlElement(name = "InitIntRate")
    protected IntRateType initIntRate;
    @XmlElement(name = "InitIntRateTerm")
    protected IntTermType initIntRateTerm;
    @XmlElement(name = "InitIntRateTermUnits")
    protected IntTermUnitsType initIntRateTermUnits;
    @XmlElement(name = "CustProfCode")
    protected CustProfCodeType custProfCode;
    @XmlElement(name = "IntBasis")
    protected IntBasisType intBasis;
    @XmlElement(name = "DestProdCode")
    protected ProdCodeType destProdCode;
    @XmlElement(name = "PltfmProdImg")
    protected PltfmProdImgType pltfmProdImg;
    @XmlElement(name = "PltfmProdImgFormat")
    protected PltfmProdImgFormatTypeType pltfmProdImgFormat;
    @XmlElement(name = "PrstHTML")
    protected PrstHTMLType prstHTML;
    @XmlElement(name = "ProdTermArray")
    protected ProdTermArrayAType prodTermArray;
    @XmlElement(name = "ProdSvcOptArray")
    protected ProdSvcOptArrayAType prodSvcOptArray;
    @XmlElement(name = "ProdFeeArray")
    protected ProdFeeArrayAType prodFeeArray;
    @XmlElement(name = "DiscArray")
    protected DiscArrayAType discArray;
    @XmlElement(name = "CrossSellProdArray")
    protected CrossSellProdArrayAType crossSellProdArray;
    @XmlElement(name = "ProdCompareArray")
    protected ProdCompareArrayAType prodCompareArray;
    @XmlElement(name = "RateTypeArray")
    protected RateTypeArrayAType rateTypeArray;
    @XmlElement(name = "DepItems")
    protected DepItemsCType depItems;
    @XmlElement(name = "TimeDepItems")
    protected TimeDepItemsCType timeDepItems;
    @XmlElement(name = "LnItems")
    protected LnItemsCType lnItems;
    @XmlElement(name = "SafeBoxItems")
    protected SafeBoxItemsCType safeBoxItems;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the prodCompareCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getProdCompareCode() {
        return prodCompareCode;
    }

    /**
     * Sets the value of the prodCompareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setProdCompareCode(ProdCodeType value) {
        this.prodCompareCode = value;
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
     * Gets the value of the mktgMsg property.
     * 
     * @return
     *     possible object is
     *     {@link MsgType }
     *     
     */
    public MsgType getMktgMsg() {
        return mktgMsg;
    }

    /**
     * Sets the value of the mktgMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgType }
     *     
     */
    public void setMktgMsg(MsgType value) {
        this.mktgMsg = value;
    }

    /**
     * Gets the value of the prodEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getProdEffDt() {
        return prodEffDt;
    }

    /**
     * Sets the value of the prodEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setProdEffDt(EffDtType value) {
        this.prodEffDt = value;
    }

    /**
     * Gets the value of the prodExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getProdExpDt() {
        return prodExpDt;
    }

    /**
     * Sets the value of the prodExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setProdExpDt(ExpDtType value) {
        this.prodExpDt = value;
    }

    /**
     * Gets the value of the minIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getMinIntRate() {
        return minIntRate;
    }

    /**
     * Sets the value of the minIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setMinIntRate(IntRateType value) {
        this.minIntRate = value;
    }

    /**
     * Gets the value of the maxIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getMaxIntRate() {
        return maxIntRate;
    }

    /**
     * Sets the value of the maxIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setMaxIntRate(IntRateType value) {
        this.maxIntRate = value;
    }

    /**
     * Gets the value of the initIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getInitIntRate() {
        return initIntRate;
    }

    /**
     * Sets the value of the initIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setInitIntRate(IntRateType value) {
        this.initIntRate = value;
    }

    /**
     * Gets the value of the initIntRateTerm property.
     * 
     * @return
     *     possible object is
     *     {@link IntTermType }
     *     
     */
    public IntTermType getInitIntRateTerm() {
        return initIntRateTerm;
    }

    /**
     * Sets the value of the initIntRateTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTermType }
     *     
     */
    public void setInitIntRateTerm(IntTermType value) {
        this.initIntRateTerm = value;
    }

    /**
     * Gets the value of the initIntRateTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link IntTermUnitsType }
     *     
     */
    public IntTermUnitsType getInitIntRateTermUnits() {
        return initIntRateTermUnits;
    }

    /**
     * Sets the value of the initIntRateTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTermUnitsType }
     *     
     */
    public void setInitIntRateTermUnits(IntTermUnitsType value) {
        this.initIntRateTermUnits = value;
    }

    /**
     * Gets the value of the custProfCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustProfCodeType }
     *     
     */
    public CustProfCodeType getCustProfCode() {
        return custProfCode;
    }

    /**
     * Sets the value of the custProfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustProfCodeType }
     *     
     */
    public void setCustProfCode(CustProfCodeType value) {
        this.custProfCode = value;
    }

    /**
     * Gets the value of the intBasis property.
     * 
     * @return
     *     possible object is
     *     {@link IntBasisType }
     *     
     */
    public IntBasisType getIntBasis() {
        return intBasis;
    }

    /**
     * Sets the value of the intBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntBasisType }
     *     
     */
    public void setIntBasis(IntBasisType value) {
        this.intBasis = value;
    }

    /**
     * Gets the value of the destProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getDestProdCode() {
        return destProdCode;
    }

    /**
     * Sets the value of the destProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setDestProdCode(ProdCodeType value) {
        this.destProdCode = value;
    }

    /**
     * Gets the value of the pltfmProdImg property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmProdImgType }
     *     
     */
    public PltfmProdImgType getPltfmProdImg() {
        return pltfmProdImg;
    }

    /**
     * Sets the value of the pltfmProdImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmProdImgType }
     *     
     */
    public void setPltfmProdImg(PltfmProdImgType value) {
        this.pltfmProdImg = value;
    }

    /**
     * Gets the value of the pltfmProdImgFormat property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmProdImgFormatTypeType }
     *     
     */
    public PltfmProdImgFormatTypeType getPltfmProdImgFormat() {
        return pltfmProdImgFormat;
    }

    /**
     * Sets the value of the pltfmProdImgFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmProdImgFormatTypeType }
     *     
     */
    public void setPltfmProdImgFormat(PltfmProdImgFormatTypeType value) {
        this.pltfmProdImgFormat = value;
    }

    /**
     * Gets the value of the prstHTML property.
     * 
     * @return
     *     possible object is
     *     {@link PrstHTMLType }
     *     
     */
    public PrstHTMLType getPrstHTML() {
        return prstHTML;
    }

    /**
     * Sets the value of the prstHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrstHTMLType }
     *     
     */
    public void setPrstHTML(PrstHTMLType value) {
        this.prstHTML = value;
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
     * Gets the value of the prodSvcOptArray property.
     * 
     * @return
     *     possible object is
     *     {@link ProdSvcOptArrayAType }
     *     
     */
    public ProdSvcOptArrayAType getProdSvcOptArray() {
        return prodSvcOptArray;
    }

    /**
     * Sets the value of the prodSvcOptArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdSvcOptArrayAType }
     *     
     */
    public void setProdSvcOptArray(ProdSvcOptArrayAType value) {
        this.prodSvcOptArray = value;
    }

    /**
     * Gets the value of the prodFeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link ProdFeeArrayAType }
     *     
     */
    public ProdFeeArrayAType getProdFeeArray() {
        return prodFeeArray;
    }

    /**
     * Sets the value of the prodFeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdFeeArrayAType }
     *     
     */
    public void setProdFeeArray(ProdFeeArrayAType value) {
        this.prodFeeArray = value;
    }

    /**
     * Gets the value of the discArray property.
     * 
     * @return
     *     possible object is
     *     {@link DiscArrayAType }
     *     
     */
    public DiscArrayAType getDiscArray() {
        return discArray;
    }

    /**
     * Sets the value of the discArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscArrayAType }
     *     
     */
    public void setDiscArray(DiscArrayAType value) {
        this.discArray = value;
    }

    /**
     * Gets the value of the crossSellProdArray property.
     * 
     * @return
     *     possible object is
     *     {@link CrossSellProdArrayAType }
     *     
     */
    public CrossSellProdArrayAType getCrossSellProdArray() {
        return crossSellProdArray;
    }

    /**
     * Sets the value of the crossSellProdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossSellProdArrayAType }
     *     
     */
    public void setCrossSellProdArray(CrossSellProdArrayAType value) {
        this.crossSellProdArray = value;
    }

    /**
     * Gets the value of the prodCompareArray property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCompareArrayAType }
     *     
     */
    public ProdCompareArrayAType getProdCompareArray() {
        return prodCompareArray;
    }

    /**
     * Sets the value of the prodCompareArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCompareArrayAType }
     *     
     */
    public void setProdCompareArray(ProdCompareArrayAType value) {
        this.prodCompareArray = value;
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
     * Gets the value of the depItems property.
     * 
     * @return
     *     possible object is
     *     {@link DepItemsCType }
     *     
     */
    public DepItemsCType getDepItems() {
        return depItems;
    }

    /**
     * Sets the value of the depItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepItemsCType }
     *     
     */
    public void setDepItems(DepItemsCType value) {
        this.depItems = value;
    }

    /**
     * Gets the value of the timeDepItems property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepItemsCType }
     *     
     */
    public TimeDepItemsCType getTimeDepItems() {
        return timeDepItems;
    }

    /**
     * Sets the value of the timeDepItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepItemsCType }
     *     
     */
    public void setTimeDepItems(TimeDepItemsCType value) {
        this.timeDepItems = value;
    }

    /**
     * Gets the value of the lnItems property.
     * 
     * @return
     *     possible object is
     *     {@link LnItemsCType }
     *     
     */
    public LnItemsCType getLnItems() {
        return lnItems;
    }

    /**
     * Sets the value of the lnItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnItemsCType }
     *     
     */
    public void setLnItems(LnItemsCType value) {
        this.lnItems = value;
    }

    /**
     * Gets the value of the safeBoxItems property.
     * 
     * @return
     *     possible object is
     *     {@link SafeBoxItemsCType }
     *     
     */
    public SafeBoxItemsCType getSafeBoxItems() {
        return safeBoxItems;
    }

    /**
     * Sets the value of the safeBoxItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeBoxItemsCType }
     *     
     */
    public void setSafeBoxItems(SafeBoxItemsCType value) {
        this.safeBoxItems = value;
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
