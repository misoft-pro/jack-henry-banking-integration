
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
 * <p>Java class for DepInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepInfoRec_CType"&gt;
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
 *         &lt;element name="SerChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgWav_Type" minOccurs="0"/&gt;
 *         &lt;element name="SigVerifyCode" type="{http://jackhenry.com/jxchange/TPG/2008}SigVerifyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TellerSICCode" type="{http://jackhenry.com/jxchange/TPG/2008}TellerSICCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalesPerson" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPerson_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SerChgWavRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgWavRsnCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="TINInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TINInfo_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="MICRAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}MICRAcctId_Type" minOccurs="0"/&gt;
 *             &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *             &lt;element name="DormantChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}DormantChgWav_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="ODPrvlgOptInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgOptInfoArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="ApprvOffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ApprvOffInfoArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="AliasCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="ClsRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ClsRsnCode_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DepInfoRec_CType", propOrder = {
    "brCode",
    "acctTitleArray",
    "prodCode",
    "acctStat",
    "openDt",
    "clsDt",
    "offCode",
    "acctClsfCode",
    "lastConDt",
    "serChgWav",
    "sigVerifyCode",
    "custId",
    "tellerSICCode",
    "salesPerson",
    "ver1",
    "serChgWavRsnCode",
    "tinInfo",
    "ver2",
    "micrAcctId",
    "aliasAcctName",
    "dormantChgWav",
    "ver3",
    "odPrvlgOptInfoArray",
    "ver4",
    "apprvOffInfoArray",
    "ver5",
    "offInfoArray",
    "ver6",
    "aliasCustName",
    "ver7",
    "clsRsnCode",
    "ver8",
    "brandCode",
    "ver9",
    "any"
})
public class DepInfoRecCType {

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
    @XmlElementRef(name = "SerChgWav", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgWavType> serChgWav;
    @XmlElementRef(name = "SigVerifyCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SigVerifyCodeType> sigVerifyCode;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "TellerSICCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TellerSICCodeType> tellerSICCode;
    @XmlElementRef(name = "SalesPerson", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesPersonType> salesPerson;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "SerChgWavRsnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgWavRsnCodeType> serChgWavRsnCode;
    @XmlElement(name = "TINInfo")
    protected TINInfoCType tinInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "MICRAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MICRAcctIdType> micrAcctId;
    @XmlElementRef(name = "AliasAcctName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AliasAcctNameType> aliasAcctName;
    @XmlElementRef(name = "DormantChgWav", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DormantChgWavType> dormantChgWav;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "ODPrvlgOptInfoArray")
    protected ODPrvlgOptInfoArrayAType odPrvlgOptInfoArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "ApprvOffInfoArray")
    protected ApprvOffInfoArrayAType apprvOffInfoArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "AliasCustName")
    protected PersonNameCType aliasCustName;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "ClsRsnCode")
    protected ClsRsnCodeType clsRsnCode;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "BrandCode")
    protected BrandCodeType brandCode;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
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
     * Gets the value of the serChgWav property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavType }{@code >}
     *     
     */
    public JAXBElement<SerChgWavType> getSerChgWav() {
        return serChgWav;
    }

    /**
     * Sets the value of the serChgWav property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavType }{@code >}
     *     
     */
    public void setSerChgWav(JAXBElement<SerChgWavType> value) {
        this.serChgWav = value;
    }

    /**
     * Gets the value of the sigVerifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SigVerifyCodeType }{@code >}
     *     
     */
    public JAXBElement<SigVerifyCodeType> getSigVerifyCode() {
        return sigVerifyCode;
    }

    /**
     * Sets the value of the sigVerifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SigVerifyCodeType }{@code >}
     *     
     */
    public void setSigVerifyCode(JAXBElement<SigVerifyCodeType> value) {
        this.sigVerifyCode = value;
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
     * Gets the value of the tellerSICCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TellerSICCodeType }{@code >}
     *     
     */
    public JAXBElement<TellerSICCodeType> getTellerSICCode() {
        return tellerSICCode;
    }

    /**
     * Sets the value of the tellerSICCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TellerSICCodeType }{@code >}
     *     
     */
    public void setTellerSICCode(JAXBElement<TellerSICCodeType> value) {
        this.tellerSICCode = value;
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
     * Gets the value of the serChgWavRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavRsnCodeType }{@code >}
     *     
     */
    public JAXBElement<SerChgWavRsnCodeType> getSerChgWavRsnCode() {
        return serChgWavRsnCode;
    }

    /**
     * Sets the value of the serChgWavRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavRsnCodeType }{@code >}
     *     
     */
    public void setSerChgWavRsnCode(JAXBElement<SerChgWavRsnCodeType> value) {
        this.serChgWavRsnCode = value;
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
     * Gets the value of the micrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MICRAcctIdType }{@code >}
     *     
     */
    public JAXBElement<MICRAcctIdType> getMICRAcctId() {
        return micrAcctId;
    }

    /**
     * Sets the value of the micrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MICRAcctIdType }{@code >}
     *     
     */
    public void setMICRAcctId(JAXBElement<MICRAcctIdType> value) {
        this.micrAcctId = value;
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
     * Gets the value of the dormantChgWav property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DormantChgWavType }{@code >}
     *     
     */
    public JAXBElement<DormantChgWavType> getDormantChgWav() {
        return dormantChgWav;
    }

    /**
     * Sets the value of the dormantChgWav property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DormantChgWavType }{@code >}
     *     
     */
    public void setDormantChgWav(JAXBElement<DormantChgWavType> value) {
        this.dormantChgWav = value;
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
     * Gets the value of the odPrvlgOptInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgOptInfoArrayAType }
     *     
     */
    public ODPrvlgOptInfoArrayAType getODPrvlgOptInfoArray() {
        return odPrvlgOptInfoArray;
    }

    /**
     * Sets the value of the odPrvlgOptInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgOptInfoArrayAType }
     *     
     */
    public void setODPrvlgOptInfoArray(ODPrvlgOptInfoArrayAType value) {
        this.odPrvlgOptInfoArray = value;
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
     * Gets the value of the apprvOffInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public ApprvOffInfoArrayAType getApprvOffInfoArray() {
        return apprvOffInfoArray;
    }

    /**
     * Sets the value of the apprvOffInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public void setApprvOffInfoArray(ApprvOffInfoArrayAType value) {
        this.apprvOffInfoArray = value;
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
