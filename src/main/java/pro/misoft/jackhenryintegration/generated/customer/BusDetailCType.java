
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
 * <p>Java class for BusDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GroupCode" type="{http://jackhenry.com/jxchange/TPG/2008}GroupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AbbrCustDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AbbrCustDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="InsiderCode" type="{http://jackhenry.com/jxchange/TPG/2008}InsiderCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustImporCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustImporCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LeaseSecCode" type="{http://jackhenry.com/jxchange/TPG/2008}LeaseSecCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NetWorth" type="{http://jackhenry.com/jxchange/TPG/2008}NetWorth_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustCycleCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustCycleCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MailDirCode" type="{http://jackhenry.com/jxchange/TPG/2008}MailDirCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProfAnlys" type="{http://jackhenry.com/jxchange/TPG/2008}ProfAnlys_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinStmtWavCode" type="{http://jackhenry.com/jxchange/TPG/2008}FinStmtWavCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinStmtWavDt" type="{http://jackhenry.com/jxchange/TPG/2008}FinStmtWavDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastFinStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastFinStmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinStmtExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}FinStmtExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastFinStmtLtrDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastFinStmtLtrDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalesPerson" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPerson_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BnkRptcyInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyInfoRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LangType" type="{http://jackhenry.com/jxchange/TPG/2008}LangType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LastConDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastConDt_Type" minOccurs="0"/&gt;
 *               &lt;element name="OrigOwnCustId" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnCustId_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="NetWorthAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NetWorthAmt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
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
@XmlType(name = "BusDetail_CType", propOrder = {
    "offCode",
    "brCode",
    "custCode",
    "groupCode",
    "abbrCustDesc",
    "userDefInfoArray",
    "insiderCode",
    "custImporCode",
    "leaseSecCode",
    "netWorth",
    "custCycleCode",
    "mailDirCode",
    "profAnlys",
    "finStmtWavCode",
    "finStmtWavDt",
    "lastFinStmtDt",
    "finStmtExpDt",
    "lastFinStmtLtrDt",
    "salesPerson",
    "custom",
    "ver1",
    "bnkRptcyInfoRec",
    "offInfoArray",
    "ver2",
    "langType",
    "ver3",
    "lastConDt",
    "origOwnCustId",
    "ver4",
    "netWorthAmt",
    "ver5",
    "any"
})
public class BusDetailCType {

    @XmlElementRef(name = "OffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> offCode;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "CustCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustCodeType> custCode;
    @XmlElementRef(name = "GroupCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupCodeType> groupCode;
    @XmlElementRef(name = "AbbrCustDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AbbrCustDescType> abbrCustDesc;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElementRef(name = "InsiderCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InsiderCodeType> insiderCode;
    @XmlElementRef(name = "CustImporCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustImporCodeType> custImporCode;
    @XmlElementRef(name = "LeaseSecCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LeaseSecCodeType> leaseSecCode;
    @XmlElementRef(name = "NetWorth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NetWorthType> netWorth;
    @XmlElementRef(name = "CustCycleCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustCycleCodeType> custCycleCode;
    @XmlElementRef(name = "MailDirCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MailDirCodeType> mailDirCode;
    @XmlElementRef(name = "ProfAnlys", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfAnlysType> profAnlys;
    @XmlElementRef(name = "FinStmtWavCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FinStmtWavCodeType> finStmtWavCode;
    @XmlElementRef(name = "FinStmtWavDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FinStmtWavDtType> finStmtWavDt;
    @XmlElementRef(name = "LastFinStmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastFinStmtDtType> lastFinStmtDt;
    @XmlElementRef(name = "FinStmtExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FinStmtExpDtType> finStmtExpDt;
    @XmlElementRef(name = "LastFinStmtLtrDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastFinStmtLtrDtType> lastFinStmtLtrDt;
    @XmlElementRef(name = "SalesPerson", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SalesPersonType> salesPerson;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BnkRptcyInfoRec")
    protected BnkRptcyInfoRecCType bnkRptcyInfoRec;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "LangType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LangTypeType> langType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "LastConDt")
    protected LastConDtType lastConDt;
    @XmlElement(name = "OrigOwnCustId")
    protected OrigOwnCustIdType origOwnCustId;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "NetWorthAmt")
    protected NetWorthAmtType netWorthAmt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the custCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustCodeType }{@code >}
     *     
     */
    public JAXBElement<CustCodeType> getCustCode() {
        return custCode;
    }

    /**
     * Sets the value of the custCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustCodeType }{@code >}
     *     
     */
    public void setCustCode(JAXBElement<CustCodeType> value) {
        this.custCode = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupCodeType }{@code >}
     *     
     */
    public JAXBElement<GroupCodeType> getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupCodeType }{@code >}
     *     
     */
    public void setGroupCode(JAXBElement<GroupCodeType> value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the abbrCustDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbbrCustDescType }{@code >}
     *     
     */
    public JAXBElement<AbbrCustDescType> getAbbrCustDesc() {
        return abbrCustDesc;
    }

    /**
     * Sets the value of the abbrCustDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbbrCustDescType }{@code >}
     *     
     */
    public void setAbbrCustDesc(JAXBElement<AbbrCustDescType> value) {
        this.abbrCustDesc = value;
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
     * Gets the value of the insiderCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsiderCodeType }{@code >}
     *     
     */
    public JAXBElement<InsiderCodeType> getInsiderCode() {
        return insiderCode;
    }

    /**
     * Sets the value of the insiderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsiderCodeType }{@code >}
     *     
     */
    public void setInsiderCode(JAXBElement<InsiderCodeType> value) {
        this.insiderCode = value;
    }

    /**
     * Gets the value of the custImporCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustImporCodeType }{@code >}
     *     
     */
    public JAXBElement<CustImporCodeType> getCustImporCode() {
        return custImporCode;
    }

    /**
     * Sets the value of the custImporCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustImporCodeType }{@code >}
     *     
     */
    public void setCustImporCode(JAXBElement<CustImporCodeType> value) {
        this.custImporCode = value;
    }

    /**
     * Gets the value of the leaseSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LeaseSecCodeType }{@code >}
     *     
     */
    public JAXBElement<LeaseSecCodeType> getLeaseSecCode() {
        return leaseSecCode;
    }

    /**
     * Sets the value of the leaseSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LeaseSecCodeType }{@code >}
     *     
     */
    public void setLeaseSecCode(JAXBElement<LeaseSecCodeType> value) {
        this.leaseSecCode = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetWorthType }{@code >}
     *     
     */
    public JAXBElement<NetWorthType> getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetWorthType }{@code >}
     *     
     */
    public void setNetWorth(JAXBElement<NetWorthType> value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the custCycleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustCycleCodeType }{@code >}
     *     
     */
    public JAXBElement<CustCycleCodeType> getCustCycleCode() {
        return custCycleCode;
    }

    /**
     * Sets the value of the custCycleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustCycleCodeType }{@code >}
     *     
     */
    public void setCustCycleCode(JAXBElement<CustCycleCodeType> value) {
        this.custCycleCode = value;
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
     * Gets the value of the profAnlys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfAnlysType }{@code >}
     *     
     */
    public JAXBElement<ProfAnlysType> getProfAnlys() {
        return profAnlys;
    }

    /**
     * Sets the value of the profAnlys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfAnlysType }{@code >}
     *     
     */
    public void setProfAnlys(JAXBElement<ProfAnlysType> value) {
        this.profAnlys = value;
    }

    /**
     * Gets the value of the finStmtWavCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinStmtWavCodeType }{@code >}
     *     
     */
    public JAXBElement<FinStmtWavCodeType> getFinStmtWavCode() {
        return finStmtWavCode;
    }

    /**
     * Sets the value of the finStmtWavCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinStmtWavCodeType }{@code >}
     *     
     */
    public void setFinStmtWavCode(JAXBElement<FinStmtWavCodeType> value) {
        this.finStmtWavCode = value;
    }

    /**
     * Gets the value of the finStmtWavDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinStmtWavDtType }{@code >}
     *     
     */
    public JAXBElement<FinStmtWavDtType> getFinStmtWavDt() {
        return finStmtWavDt;
    }

    /**
     * Sets the value of the finStmtWavDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinStmtWavDtType }{@code >}
     *     
     */
    public void setFinStmtWavDt(JAXBElement<FinStmtWavDtType> value) {
        this.finStmtWavDt = value;
    }

    /**
     * Gets the value of the lastFinStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastFinStmtDtType }{@code >}
     *     
     */
    public JAXBElement<LastFinStmtDtType> getLastFinStmtDt() {
        return lastFinStmtDt;
    }

    /**
     * Sets the value of the lastFinStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastFinStmtDtType }{@code >}
     *     
     */
    public void setLastFinStmtDt(JAXBElement<LastFinStmtDtType> value) {
        this.lastFinStmtDt = value;
    }

    /**
     * Gets the value of the finStmtExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinStmtExpDtType }{@code >}
     *     
     */
    public JAXBElement<FinStmtExpDtType> getFinStmtExpDt() {
        return finStmtExpDt;
    }

    /**
     * Sets the value of the finStmtExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinStmtExpDtType }{@code >}
     *     
     */
    public void setFinStmtExpDt(JAXBElement<FinStmtExpDtType> value) {
        this.finStmtExpDt = value;
    }

    /**
     * Gets the value of the lastFinStmtLtrDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastFinStmtLtrDtType }{@code >}
     *     
     */
    public JAXBElement<LastFinStmtLtrDtType> getLastFinStmtLtrDt() {
        return lastFinStmtLtrDt;
    }

    /**
     * Sets the value of the lastFinStmtLtrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastFinStmtLtrDtType }{@code >}
     *     
     */
    public void setLastFinStmtLtrDt(JAXBElement<LastFinStmtLtrDtType> value) {
        this.lastFinStmtLtrDt = value;
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
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
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
     * Gets the value of the bnkRptcyInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link BnkRptcyInfoRecCType }
     *     
     */
    public BnkRptcyInfoRecCType getBnkRptcyInfoRec() {
        return bnkRptcyInfoRec;
    }

    /**
     * Sets the value of the bnkRptcyInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BnkRptcyInfoRecCType }
     *     
     */
    public void setBnkRptcyInfoRec(BnkRptcyInfoRecCType value) {
        this.bnkRptcyInfoRec = value;
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
     * Gets the value of the langType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public JAXBElement<LangTypeType> getLangType() {
        return langType;
    }

    /**
     * Sets the value of the langType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public void setLangType(JAXBElement<LangTypeType> value) {
        this.langType = value;
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
     * Gets the value of the lastConDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastConDtType }
     *     
     */
    public LastConDtType getLastConDt() {
        return lastConDt;
    }

    /**
     * Sets the value of the lastConDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastConDtType }
     *     
     */
    public void setLastConDt(LastConDtType value) {
        this.lastConDt = value;
    }

    /**
     * Gets the value of the origOwnCustId property.
     * 
     * @return
     *     possible object is
     *     {@link OrigOwnCustIdType }
     *     
     */
    public OrigOwnCustIdType getOrigOwnCustId() {
        return origOwnCustId;
    }

    /**
     * Sets the value of the origOwnCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigOwnCustIdType }
     *     
     */
    public void setOrigOwnCustId(OrigOwnCustIdType value) {
        this.origOwnCustId = value;
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
     * Gets the value of the netWorthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetWorthAmtType }
     *     
     */
    public NetWorthAmtType getNetWorthAmt() {
        return netWorthAmt;
    }

    /**
     * Sets the value of the netWorthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWorthAmtType }
     *     
     */
    public void setNetWorthAmt(NetWorthAmtType value) {
        this.netWorthAmt = value;
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
