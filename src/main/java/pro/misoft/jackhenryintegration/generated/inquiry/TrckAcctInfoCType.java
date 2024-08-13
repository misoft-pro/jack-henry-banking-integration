
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
 * <p>Java class for TrckAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrckAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmtDue" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmtDue_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalesPerson" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPerson_Type" minOccurs="0"/&gt;
 *         &lt;element name="MailDirCode" type="{http://jackhenry.com/jxchange/TPG/2008}MailDirCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctLvlSecCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PropAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="EscrwCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgDueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgDueAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Term" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurLnToValRatio" type="{http://jackhenry.com/jxchange/TPG/2008}CurLnToValRatio_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvailCr" type="{http://jackhenry.com/jxchange/TPG/2008}AvailCr_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AliasCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrckAcctInfo_CType", propOrder = {
    "custId",
    "brCode",
    "pmtAmt",
    "nxtPayDt",
    "pmtAmtDue",
    "lastPmtDt",
    "lastPmtAmt",
    "salesPerson",
    "mailDirCode",
    "incCombStmt",
    "acctLvlSecCode",
    "acctTitleArray",
    "userDefInfoArray",
    "curBal",
    "offInfoArray",
    "propAddr",
    "escrwCurBal",
    "escrwPmtAmt",
    "piAmt",
    "lateChgDueAmt",
    "origBal",
    "purpCode",
    "term",
    "prodCode",
    "openDt",
    "intRate",
    "curLnToValRatio",
    "availCr",
    "locLmt",
    "matDt",
    "ver1",
    "aliasCustName",
    "ver2",
    "brandCode",
    "ver3",
    "any"
})
public class TrckAcctInfoCType {

    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "PmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtAmtType> pmtAmt;
    @XmlElementRef(name = "NxtPayDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtPayDtType> nxtPayDt;
    @XmlElementRef(name = "PmtAmtDue", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtAmtDueType> pmtAmtDue;
    @XmlElementRef(name = "LastPmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastPmtDtType> lastPmtDt;
    @XmlElementRef(name = "LastPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastPmtAmtType> lastPmtAmt;
    @XmlElementRef(name = "SalesPerson", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesPersonType> salesPerson;
    @XmlElementRef(name = "MailDirCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MailDirCodeType> mailDirCode;
    @XmlElementRef(name = "IncCombStmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncCombStmtType> incCombStmt;
    @XmlElementRef(name = "AcctLvlSecCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctLvlSecCodeType> acctLvlSecCode;
    @XmlElement(name = "AcctTitleArray")
    protected AcctTitleAType acctTitleArray;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElementRef(name = "CurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurBalType> curBal;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "PropAddr")
    protected AddrCType propAddr;
    @XmlElementRef(name = "EscrwCurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwCurBalType> escrwCurBal;
    @XmlElementRef(name = "EscrwPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtAmtType> escrwPmtAmt;
    @XmlElementRef(name = "PIAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PIAmtType> piAmt;
    @XmlElementRef(name = "LateChgDueAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LateChgDueAmtType> lateChgDueAmt;
    @XmlElementRef(name = "OrigBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigBalType> origBal;
    @XmlElementRef(name = "PurpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PurpCodeType> purpCode;
    @XmlElementRef(name = "Term", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCType> term;
    @XmlElementRef(name = "ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> prodCode;
    @XmlElementRef(name = "OpenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OpenDtType> openDt;
    @XmlElementRef(name = "IntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateType> intRate;
    @XmlElementRef(name = "CurLnToValRatio", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurLnToValRatioType> curLnToValRatio;
    @XmlElementRef(name = "AvailCr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvailCrType> availCr;
    @XmlElementRef(name = "LOCLmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCLmtType> locLmt;
    @XmlElementRef(name = "MatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MatDtType> matDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AliasCustName")
    protected PersonNameCType aliasCustName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "BrandCode")
    protected BrandCodeType brandCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public JAXBElement<PmtAmtType> getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public void setPmtAmt(JAXBElement<PmtAmtType> value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the nxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NxtPayDtType }{@code >}
     *     
     */
    public JAXBElement<NxtPayDtType> getNxtPayDt() {
        return nxtPayDt;
    }

    /**
     * Sets the value of the nxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NxtPayDtType }{@code >}
     *     
     */
    public void setNxtPayDt(JAXBElement<NxtPayDtType> value) {
        this.nxtPayDt = value;
    }

    /**
     * Gets the value of the pmtAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtDueType }{@code >}
     *     
     */
    public JAXBElement<PmtAmtDueType> getPmtAmtDue() {
        return pmtAmtDue;
    }

    /**
     * Sets the value of the pmtAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtDueType }{@code >}
     *     
     */
    public void setPmtAmtDue(JAXBElement<PmtAmtDueType> value) {
        this.pmtAmtDue = value;
    }

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastPmtDtType }{@code >}
     *     
     */
    public JAXBElement<LastPmtDtType> getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastPmtDtType }{@code >}
     *     
     */
    public void setLastPmtDt(JAXBElement<LastPmtDtType> value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the lastPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<LastPmtAmtType> getLastPmtAmt() {
        return lastPmtAmt;
    }

    /**
     * Sets the value of the lastPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastPmtAmtType }{@code >}
     *     
     */
    public void setLastPmtAmt(JAXBElement<LastPmtAmtType> value) {
        this.lastPmtAmt = value;
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
     * Gets the value of the mailDirCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailDirCodeType }{@code >}
     *     
     */
    public JAXBElement<MailDirCodeType> getMailDirCode() {
        return mailDirCode;
    }

    /**
     * Sets the value of the mailDirCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailDirCodeType }{@code >}
     *     
     */
    public void setMailDirCode(JAXBElement<MailDirCodeType> value) {
        this.mailDirCode = value;
    }

    /**
     * Gets the value of the incCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public JAXBElement<IncCombStmtType> getIncCombStmt() {
        return incCombStmt;
    }

    /**
     * Sets the value of the incCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public void setIncCombStmt(JAXBElement<IncCombStmtType> value) {
        this.incCombStmt = value;
    }

    /**
     * Gets the value of the acctLvlSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctLvlSecCodeType> getAcctLvlSecCode() {
        return acctLvlSecCode;
    }

    /**
     * Sets the value of the acctLvlSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public void setAcctLvlSecCode(JAXBElement<AcctLvlSecCodeType> value) {
        this.acctLvlSecCode = value;
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
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public JAXBElement<CurBalType> getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public void setCurBal(JAXBElement<CurBalType> value) {
        this.curBal = value;
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
     * Gets the value of the propAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPropAddr() {
        return propAddr;
    }

    /**
     * Sets the value of the propAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPropAddr(AddrCType value) {
        this.propAddr = value;
    }

    /**
     * Gets the value of the escrwCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwCurBalType }{@code >}
     *     
     */
    public JAXBElement<EscrwCurBalType> getEscrwCurBal() {
        return escrwCurBal;
    }

    /**
     * Sets the value of the escrwCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwCurBalType }{@code >}
     *     
     */
    public void setEscrwCurBal(JAXBElement<EscrwCurBalType> value) {
        this.escrwCurBal = value;
    }

    /**
     * Gets the value of the escrwPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtAmtType> getEscrwPmtAmt() {
        return escrwPmtAmt;
    }

    /**
     * Sets the value of the escrwPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAmtType }{@code >}
     *     
     */
    public void setEscrwPmtAmt(JAXBElement<EscrwPmtAmtType> value) {
        this.escrwPmtAmt = value;
    }

    /**
     * Gets the value of the piAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PIAmtType }{@code >}
     *     
     */
    public JAXBElement<PIAmtType> getPIAmt() {
        return piAmt;
    }

    /**
     * Sets the value of the piAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PIAmtType }{@code >}
     *     
     */
    public void setPIAmt(JAXBElement<PIAmtType> value) {
        this.piAmt = value;
    }

    /**
     * Gets the value of the lateChgDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LateChgDueAmtType }{@code >}
     *     
     */
    public JAXBElement<LateChgDueAmtType> getLateChgDueAmt() {
        return lateChgDueAmt;
    }

    /**
     * Sets the value of the lateChgDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LateChgDueAmtType }{@code >}
     *     
     */
    public void setLateChgDueAmt(JAXBElement<LateChgDueAmtType> value) {
        this.lateChgDueAmt = value;
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
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCType }{@code >}
     *     
     */
    public JAXBElement<TermCType> getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCType }{@code >}
     *     
     */
    public void setTerm(JAXBElement<TermCType> value) {
        this.term = value;
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
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public JAXBElement<IntRateType> getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public void setIntRate(JAXBElement<IntRateType> value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the curLnToValRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurLnToValRatioType }{@code >}
     *     
     */
    public JAXBElement<CurLnToValRatioType> getCurLnToValRatio() {
        return curLnToValRatio;
    }

    /**
     * Sets the value of the curLnToValRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurLnToValRatioType }{@code >}
     *     
     */
    public void setCurLnToValRatio(JAXBElement<CurLnToValRatioType> value) {
        this.curLnToValRatio = value;
    }

    /**
     * Gets the value of the availCr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvailCrType }{@code >}
     *     
     */
    public JAXBElement<AvailCrType> getAvailCr() {
        return availCr;
    }

    /**
     * Sets the value of the availCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvailCrType }{@code >}
     *     
     */
    public void setAvailCr(JAXBElement<AvailCrType> value) {
        this.availCr = value;
    }

    /**
     * Gets the value of the locLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCLmtType }{@code >}
     *     
     */
    public JAXBElement<LOCLmtType> getLOCLmt() {
        return locLmt;
    }

    /**
     * Sets the value of the locLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCLmtType }{@code >}
     *     
     */
    public void setLOCLmt(JAXBElement<LOCLmtType> value) {
        this.locLmt = value;
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
