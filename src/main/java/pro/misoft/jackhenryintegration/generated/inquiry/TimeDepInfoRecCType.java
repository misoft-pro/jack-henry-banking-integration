
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
 * <p>Java class for TimeDepInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastConDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastConDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CDTerm" type="{http://jackhenry.com/jxchange/TPG/2008}CDTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="CDTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}CDTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CertifId" type="{http://jackhenry.com/jxchange/TPG/2008}CertifId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalesPerson" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPerson_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TINInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TINInfo_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="AliasCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="ClsRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ClsRsnCode_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepInfoRec_CType", propOrder = {
    "brCode",
    "acctTitleArray",
    "prodCode",
    "acctStat",
    "openDt",
    "clsDt",
    "offCode",
    "acctClsfCode",
    "lastConDt",
    "matDt",
    "cdTerm",
    "cdTermUnits",
    "custId",
    "origBal",
    "plnCode",
    "certifId",
    "salesPerson",
    "ver1",
    "tinInfo",
    "ver2",
    "aliasAcctName",
    "ver3",
    "offInfoArray",
    "ver4",
    "aliasCustName",
    "ver5",
    "clsRsnCode",
    "ver6",
    "brandCode",
    "ver7",
    "any"
})
public class TimeDepInfoRecCType {

    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElement(name = "AcctTitleArray")
    protected AcctTitleAType acctTitleArray;
    @XmlElementRef(name = "ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> prodCode;
    @XmlElementRef(name = "AcctStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctStatType> acctStat;
    @XmlElementRef(name = "OpenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenDtType> openDt;
    @XmlElementRef(name = "ClsDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsDtType> clsDt;
    @XmlElementRef(name = "OffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> offCode;
    @XmlElementRef(name = "AcctClsfCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctClsfCodeType> acctClsfCode;
    @XmlElementRef(name = "LastConDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastConDtType> lastConDt;
    @XmlElementRef(name = "MatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MatDtType> matDt;
    @XmlElementRef(name = "CDTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CDTermType> cdTerm;
    @XmlElementRef(name = "CDTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CDTermUnitsType> cdTermUnits;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "OrigBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigBalType> origBal;
    @XmlElementRef(name = "PlnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnCodeType> plnCode;
    @XmlElementRef(name = "CertifId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CertifIdType> certifId;
    @XmlElementRef(name = "SalesPerson", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesPersonType> salesPerson;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TINInfo")
    protected TINInfoCType tinInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "AliasAcctName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AliasAcctNameType> aliasAcctName;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "AliasCustName")
    protected PersonNameCType aliasCustName;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "ClsRsnCode")
    protected ClsRsnCodeType clsRsnCode;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "BrandCode")
    protected BrandCodeType brandCode;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the acctTitleArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleAType }
     *     
     */
    public AcctTitleAType getAcctTitleArray() {
        return acctTitleArray;
    }

    /**
     * Sets the value of the acctTitleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleAType }
     *     
     */
    public void setAcctTitleArray(AcctTitleAType value) {
        this.acctTitleArray = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ProdCodeType> getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public void setProdCode(JAXBElement<ProdCodeType> value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctStatType }{@code >}
     *     
     */
    public JAXBElement<AcctStatType> getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctStatType }{@code >}
     *     
     */
    public void setAcctStat(JAXBElement<AcctStatType> value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpenDtType }{@code >}
     *     
     */
    public JAXBElement<OpenDtType> getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpenDtType }{@code >}
     *     
     */
    public void setOpenDt(JAXBElement<OpenDtType> value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the clsDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsDtType }{@code >}
     *     
     */
    public JAXBElement<ClsDtType> getClsDt() {
        return clsDt;
    }

    /**
     * Sets the value of the clsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsDtType }{@code >}
     *     
     */
    public void setClsDt(JAXBElement<ClsDtType> value) {
        this.clsDt = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setOffCode(JAXBElement<OffCodeType> value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the acctClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctClsfCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctClsfCodeType> getAcctClsfCode() {
        return acctClsfCode;
    }

    /**
     * Sets the value of the acctClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctClsfCodeType }{@code >}
     *     
     */
    public void setAcctClsfCode(JAXBElement<AcctClsfCodeType> value) {
        this.acctClsfCode = value;
    }

    /**
     * Gets the value of the lastConDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastConDtType }{@code >}
     *     
     */
    public JAXBElement<LastConDtType> getLastConDt() {
        return lastConDt;
    }

    /**
     * Sets the value of the lastConDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastConDtType }{@code >}
     *     
     */
    public void setLastConDt(JAXBElement<LastConDtType> value) {
        this.lastConDt = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MatDtType }{@code >}
     *     
     */
    public JAXBElement<MatDtType> getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MatDtType }{@code >}
     *     
     */
    public void setMatDt(JAXBElement<MatDtType> value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the cdTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CDTermType }{@code >}
     *     
     */
    public JAXBElement<CDTermType> getCDTerm() {
        return cdTerm;
    }

    /**
     * Sets the value of the cdTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CDTermType }{@code >}
     *     
     */
    public void setCDTerm(JAXBElement<CDTermType> value) {
        this.cdTerm = value;
    }

    /**
     * Gets the value of the cdTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CDTermUnitsType }{@code >}
     *     
     */
    public JAXBElement<CDTermUnitsType> getCDTermUnits() {
        return cdTermUnits;
    }

    /**
     * Sets the value of the cdTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CDTermUnitsType }{@code >}
     *     
     */
    public void setCDTermUnits(JAXBElement<CDTermUnitsType> value) {
        this.cdTermUnits = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public JAXBElement<CustIdType> getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public void setCustId(JAXBElement<CustIdType> value) {
        this.custId = value;
    }

    /**
     * Gets the value of the origBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigBalType }{@code >}
     *     
     */
    public JAXBElement<OrigBalType> getOrigBal() {
        return origBal;
    }

    /**
     * Sets the value of the origBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigBalType }{@code >}
     *     
     */
    public void setOrigBal(JAXBElement<OrigBalType> value) {
        this.origBal = value;
    }

    /**
     * Gets the value of the plnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnCodeType }{@code >}
     *     
     */
    public JAXBElement<PlnCodeType> getPlnCode() {
        return plnCode;
    }

    /**
     * Sets the value of the plnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnCodeType }{@code >}
     *     
     */
    public void setPlnCode(JAXBElement<PlnCodeType> value) {
        this.plnCode = value;
    }

    /**
     * Gets the value of the certifId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertifIdType }{@code >}
     *     
     */
    public JAXBElement<CertifIdType> getCertifId() {
        return certifId;
    }

    /**
     * Sets the value of the certifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertifIdType }{@code >}
     *     
     */
    public void setCertifId(JAXBElement<CertifIdType> value) {
        this.certifId = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalesPersonType }{@code >}
     *     
     */
    public JAXBElement<SalesPersonType> getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalesPersonType }{@code >}
     *     
     */
    public void setSalesPerson(JAXBElement<SalesPersonType> value) {
        this.salesPerson = value;
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
     * Gets the value of the tinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoCType }
     *     
     */
    public TINInfoCType getTINInfo() {
        return tinInfo;
    }

    /**
     * Sets the value of the tinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoCType }
     *     
     */
    public void setTINInfo(TINInfoCType value) {
        this.tinInfo = value;
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
     * Gets the value of the aliasAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AliasAcctNameType }{@code >}
     *     
     */
    public JAXBElement<AliasAcctNameType> getAliasAcctName() {
        return aliasAcctName;
    }

    /**
     * Sets the value of the aliasAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AliasAcctNameType }{@code >}
     *     
     */
    public void setAliasAcctName(JAXBElement<AliasAcctNameType> value) {
        this.aliasAcctName = value;
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
     * Gets the value of the offInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public OffInfoArrayAType getOffInfoArray() {
        return offInfoArray;
    }

    /**
     * Sets the value of the offInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public void setOffInfoArray(OffInfoArrayAType value) {
        this.offInfoArray = value;
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
     * Gets the value of the aliasCustName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getAliasCustName() {
        return aliasCustName;
    }

    /**
     * Sets the value of the aliasCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setAliasCustName(PersonNameCType value) {
        this.aliasCustName = value;
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
     * Gets the value of the clsRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClsRsnCodeType }
     *     
     */
    public ClsRsnCodeType getClsRsnCode() {
        return clsRsnCode;
    }

    /**
     * Sets the value of the clsRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsRsnCodeType }
     *     
     */
    public void setClsRsnCode(ClsRsnCodeType value) {
        this.clsRsnCode = value;
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
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrandCodeType }
     *     
     */
    public BrandCodeType getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandCodeType }
     *     
     */
    public void setBrandCode(BrandCodeType value) {
        this.brandCode = value;
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
