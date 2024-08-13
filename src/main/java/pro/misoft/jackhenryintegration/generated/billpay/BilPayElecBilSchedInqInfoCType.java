
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a electronic bill schedule
 *    
 * 
 * <p>Java class for BilPayElecBilSchedInqInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayElecBilSchedInqInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecBilPayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilStat" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPmtMthd" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPmtMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPmtAuto" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPmtAuto_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtBal" type="{http://jackhenry.com/jxchange/TPG/2008}StmtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmtDue" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmtDue_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ElecBilPayeeAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="WebPgURL" type="{http://jackhenry.com/jxchange/TPG/2008}WebPgURL_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="WebPgURLNoToken" type="{http://jackhenry.com/jxchange/TPG/2008}WebPgURL_Type" minOccurs="0"/&gt;
 *               &lt;element name="WebPgToken" type="{http://jackhenry.com/jxchange/TPG/2008}WebPgToken_Type" minOccurs="0"/&gt;
 *               &lt;element name="TokenExpTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}TokenExpTimeDt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayElecBilSchedInqInfo_CType", propOrder = {
    "elecBilPayeeName",
    "elecBilStat",
    "elecBilPmtMthd",
    "elecBilPmtAuto",
    "pmtCmnt",
    "stmtDt",
    "pmtDueDt",
    "stmtBal",
    "curBal",
    "pmtAmtDue",
    "minPmtAmt",
    "custom",
    "ver1",
    "elecBilPayeeAcctId",
    "ver2",
    "webPgURL",
    "ver3",
    "webPgURLNoToken",
    "webPgToken",
    "tokenExpTimeDt",
    "ver4",
    "any"
})
public class BilPayElecBilSchedInqInfoCType {

    @XmlElement(name = "ElecBilPayeeName")
    protected PayeeNameType elecBilPayeeName;
    @XmlElement(name = "ElecBilStat")
    protected ElecBilStatType elecBilStat;
    @XmlElement(name = "ElecBilPmtMthd")
    protected ElecBilPmtMthdType elecBilPmtMthd;
    @XmlElement(name = "ElecBilPmtAuto")
    protected ElecBilPmtAutoType elecBilPmtAuto;
    @XmlElement(name = "PmtCmnt")
    protected PmtCmntType pmtCmnt;
    @XmlElement(name = "StmtDt")
    protected StmtDtType stmtDt;
    @XmlElement(name = "PmtDueDt")
    protected PmtDueDtType pmtDueDt;
    @XmlElement(name = "StmtBal")
    protected StmtBalType stmtBal;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "PmtAmtDue")
    protected PmtAmtDueType pmtAmtDue;
    @XmlElement(name = "MinPmtAmt")
    protected MinPmtAmtType minPmtAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ElecBilPayeeAcctId")
    protected AcctIdType elecBilPayeeAcctId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "WebPgURL")
    protected WebPgURLType webPgURL;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "WebPgURLNoToken")
    protected WebPgURLType webPgURLNoToken;
    @XmlElement(name = "WebPgToken")
    protected WebPgTokenType webPgToken;
    @XmlElement(name = "TokenExpTimeDt")
    protected TokenExpTimeDtType tokenExpTimeDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elecBilPayeeName property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeNameType }
     *     
     */
    public PayeeNameType getElecBilPayeeName() {
        return elecBilPayeeName;
    }

    /**
     * Sets the value of the elecBilPayeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeNameType }
     *     
     */
    public void setElecBilPayeeName(PayeeNameType value) {
        this.elecBilPayeeName = value;
    }

    /**
     * Gets the value of the elecBilStat property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilStatType }
     *     
     */
    public ElecBilStatType getElecBilStat() {
        return elecBilStat;
    }

    /**
     * Sets the value of the elecBilStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilStatType }
     *     
     */
    public void setElecBilStat(ElecBilStatType value) {
        this.elecBilStat = value;
    }

    /**
     * Gets the value of the elecBilPmtMthd property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPmtMthdType }
     *     
     */
    public ElecBilPmtMthdType getElecBilPmtMthd() {
        return elecBilPmtMthd;
    }

    /**
     * Sets the value of the elecBilPmtMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPmtMthdType }
     *     
     */
    public void setElecBilPmtMthd(ElecBilPmtMthdType value) {
        this.elecBilPmtMthd = value;
    }

    /**
     * Gets the value of the elecBilPmtAuto property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPmtAutoType }
     *     
     */
    public ElecBilPmtAutoType getElecBilPmtAuto() {
        return elecBilPmtAuto;
    }

    /**
     * Sets the value of the elecBilPmtAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPmtAutoType }
     *     
     */
    public void setElecBilPmtAuto(ElecBilPmtAutoType value) {
        this.elecBilPmtAuto = value;
    }

    /**
     * Gets the value of the pmtCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCmntType }
     *     
     */
    public PmtCmntType getPmtCmnt() {
        return pmtCmnt;
    }

    /**
     * Sets the value of the pmtCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCmntType }
     *     
     */
    public void setPmtCmnt(PmtCmntType value) {
        this.pmtCmnt = value;
    }

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link StmtDtType }
     *     
     */
    public StmtDtType getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtDtType }
     *     
     */
    public void setStmtDt(StmtDtType value) {
        this.stmtDt = value;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDueDtType }
     *     
     */
    public PmtDueDtType getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDueDtType }
     *     
     */
    public void setPmtDueDt(PmtDueDtType value) {
        this.pmtDueDt = value;
    }

    /**
     * Gets the value of the stmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link StmtBalType }
     *     
     */
    public StmtBalType getStmtBal() {
        return stmtBal;
    }

    /**
     * Sets the value of the stmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtBalType }
     *     
     */
    public void setStmtBal(StmtBalType value) {
        this.stmtBal = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the pmtAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtDueType }
     *     
     */
    public PmtAmtDueType getPmtAmtDue() {
        return pmtAmtDue;
    }

    /**
     * Sets the value of the pmtAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtDueType }
     *     
     */
    public void setPmtAmtDue(PmtAmtDueType value) {
        this.pmtAmtDue = value;
    }

    /**
     * Gets the value of the minPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinPmtAmtType }
     *     
     */
    public MinPmtAmtType getMinPmtAmt() {
        return minPmtAmt;
    }

    /**
     * Sets the value of the minPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinPmtAmtType }
     *     
     */
    public void setMinPmtAmt(MinPmtAmtType value) {
        this.minPmtAmt = value;
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
     * Gets the value of the elecBilPayeeAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getElecBilPayeeAcctId() {
        return elecBilPayeeAcctId;
    }

    /**
     * Sets the value of the elecBilPayeeAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setElecBilPayeeAcctId(AcctIdType value) {
        this.elecBilPayeeAcctId = value;
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
     * Gets the value of the webPgURL property.
     * 
     * @return
     *     possible object is
     *     {@link WebPgURLType }
     *     
     */
    public WebPgURLType getWebPgURL() {
        return webPgURL;
    }

    /**
     * Sets the value of the webPgURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPgURLType }
     *     
     */
    public void setWebPgURL(WebPgURLType value) {
        this.webPgURL = value;
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
     * Gets the value of the webPgURLNoToken property.
     * 
     * @return
     *     possible object is
     *     {@link WebPgURLType }
     *     
     */
    public WebPgURLType getWebPgURLNoToken() {
        return webPgURLNoToken;
    }

    /**
     * Sets the value of the webPgURLNoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPgURLType }
     *     
     */
    public void setWebPgURLNoToken(WebPgURLType value) {
        this.webPgURLNoToken = value;
    }

    /**
     * Gets the value of the webPgToken property.
     * 
     * @return
     *     possible object is
     *     {@link WebPgTokenType }
     *     
     */
    public WebPgTokenType getWebPgToken() {
        return webPgToken;
    }

    /**
     * Sets the value of the webPgToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebPgTokenType }
     *     
     */
    public void setWebPgToken(WebPgTokenType value) {
        this.webPgToken = value;
    }

    /**
     * Gets the value of the tokenExpTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link TokenExpTimeDtType }
     *     
     */
    public TokenExpTimeDtType getTokenExpTimeDt() {
        return tokenExpTimeDt;
    }

    /**
     * Sets the value of the tokenExpTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenExpTimeDtType }
     *     
     */
    public void setTokenExpTimeDt(TokenExpTimeDtType value) {
        this.tokenExpTimeDt = value;
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
     * {@link Element }
     * {@link Object }
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
