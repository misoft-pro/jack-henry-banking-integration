
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
 * <p>Java class for AcctIdAccessInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctIdAccessInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccessAlw" type="{http://jackhenry.com/jxchange/TPG/2008}AccessAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Rmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctElecDocType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctElecDocType_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtAddAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtAddAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtAddFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtAddFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFromAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}XferFromAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFromFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}XferFromFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtRetrvAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}StmtRetrvAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtRetrvFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtRetrvFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeChgStmtType" type="{http://jackhenry.com/jxchange/TPG/2008}FeeChgStmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PlnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CkCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CkCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CkDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CkDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OTCCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OTCCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OTCDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OTCDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}XferCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}XferDrPostAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctIdAccessInfo_CType", propOrder = {
    "accountId",
    "accessAlw",
    "prodCode",
    "prodDesc",
    "acctRelCode",
    "acctRelDesc",
    "rmk",
    "aliasAcctName",
    "acctElecDocType",
    "stopPmtAddAnlysId",
    "stopPmtAddFeeAmt",
    "xferFromAnlysId",
    "xferFromFeeAmt",
    "stmtRetrvAnlysId",
    "stmtRetrvFeeAmt",
    "feeChgStmtType",
    "lnPmtAlw",
    "custId",
    "plnCode",
    "plnDesc",
    "achCrPostAmt",
    "achDrPostAmt",
    "ckCrPostAmt",
    "ckDrPostAmt",
    "otcCrPostAmt",
    "otcDrPostAmt",
    "wireCrPostAmt",
    "wireDrPostAmt",
    "xferCrPostAmt",
    "xferDrPostAmt",
    "ver1",
    "any"
})
public class AcctIdAccessInfoCType {

    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "AccessAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccessAlwType> accessAlw;
    @XmlElementRef(name = "ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> prodCode;
    @XmlElementRef(name = "ProdDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdDescType> prodDesc;
    @XmlElementRef(name = "AcctRelCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctRelCodeType> acctRelCode;
    @XmlElementRef(name = "AcctRelDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctRelDescType> acctRelDesc;
    @XmlElementRef(name = "Rmk", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RmkType> rmk;
    @XmlElementRef(name = "AliasAcctName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AliasAcctNameType> aliasAcctName;
    @XmlElementRef(name = "AcctElecDocType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctElecDocTypeType> acctElecDocType;
    @XmlElementRef(name = "StopPmtAddAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtAddAnlysIdType> stopPmtAddAnlysId;
    @XmlElementRef(name = "StopPmtAddFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtAddFeeAmtType> stopPmtAddFeeAmt;
    @XmlElementRef(name = "XferFromAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferFromAnlysIdType> xferFromAnlysId;
    @XmlElementRef(name = "XferFromFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferFromFeeAmtType> xferFromFeeAmt;
    @XmlElementRef(name = "StmtRetrvAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtRetrvAnlysIdType> stmtRetrvAnlysId;
    @XmlElementRef(name = "StmtRetrvFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtRetrvFeeAmtType> stmtRetrvFeeAmt;
    @XmlElementRef(name = "FeeChgStmtType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FeeChgStmtTypeType> feeChgStmtType;
    @XmlElementRef(name = "LnPmtAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnPmtAlwType> lnPmtAlw;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PlnCode")
    protected PlnCodeType plnCode;
    @XmlElement(name = "PlnDesc")
    protected PlnDescType plnDesc;
    @XmlElement(name = "ACHCrPostAmt")
    protected ACHCrPostAmtType achCrPostAmt;
    @XmlElement(name = "ACHDrPostAmt")
    protected ACHDrPostAmtType achDrPostAmt;
    @XmlElement(name = "CkCrPostAmt")
    protected CkCrPostAmtType ckCrPostAmt;
    @XmlElement(name = "CkDrPostAmt")
    protected CkDrPostAmtType ckDrPostAmt;
    @XmlElement(name = "OTCCrPostAmt")
    protected OTCCrPostAmtType otcCrPostAmt;
    @XmlElement(name = "OTCDrPostAmt")
    protected OTCDrPostAmtType otcDrPostAmt;
    @XmlElement(name = "WireCrPostAmt")
    protected WireCrPostAmtType wireCrPostAmt;
    @XmlElement(name = "WireDrPostAmt")
    protected WireDrPostAmtType wireDrPostAmt;
    @XmlElement(name = "XferCrPostAmt")
    protected XferCrPostAmtType xferCrPostAmt;
    @XmlElement(name = "XferDrPostAmt")
    protected XferDrPostAmtType xferDrPostAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accessAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccessAlwType }{@code >}
     *     
     */
    public JAXBElement<AccessAlwType> getAccessAlw() {
        return accessAlw;
    }

    /**
     * Sets the value of the accessAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccessAlwType }{@code >}
     *     
     */
    public void setAccessAlw(JAXBElement<AccessAlwType> value) {
        this.accessAlw = value;
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
     * Gets the value of the prodDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdDescType }{@code >}
     *     
     */
    public JAXBElement<ProdDescType> getProdDesc() {
        return prodDesc;
    }

    /**
     * Sets the value of the prodDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdDescType }{@code >}
     *     
     */
    public void setProdDesc(JAXBElement<ProdDescType> value) {
        this.prodDesc = value;
    }

    /**
     * Gets the value of the acctRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctRelCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctRelCodeType> getAcctRelCode() {
        return acctRelCode;
    }

    /**
     * Sets the value of the acctRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctRelCodeType }{@code >}
     *     
     */
    public void setAcctRelCode(JAXBElement<AcctRelCodeType> value) {
        this.acctRelCode = value;
    }

    /**
     * Gets the value of the acctRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctRelDescType }{@code >}
     *     
     */
    public JAXBElement<AcctRelDescType> getAcctRelDesc() {
        return acctRelDesc;
    }

    /**
     * Sets the value of the acctRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctRelDescType }{@code >}
     *     
     */
    public void setAcctRelDesc(JAXBElement<AcctRelDescType> value) {
        this.acctRelDesc = value;
    }

    /**
     * Gets the value of the rmk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RmkType }{@code >}
     *     
     */
    public JAXBElement<RmkType> getRmk() {
        return rmk;
    }

    /**
     * Sets the value of the rmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RmkType }{@code >}
     *     
     */
    public void setRmk(JAXBElement<RmkType> value) {
        this.rmk = value;
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
     * Gets the value of the acctElecDocType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctElecDocTypeType }{@code >}
     *     
     */
    public JAXBElement<AcctElecDocTypeType> getAcctElecDocType() {
        return acctElecDocType;
    }

    /**
     * Sets the value of the acctElecDocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctElecDocTypeType }{@code >}
     *     
     */
    public void setAcctElecDocType(JAXBElement<AcctElecDocTypeType> value) {
        this.acctElecDocType = value;
    }

    /**
     * Gets the value of the stopPmtAddAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<StopPmtAddAnlysIdType> getStopPmtAddAnlysId() {
        return stopPmtAddAnlysId;
    }

    /**
     * Sets the value of the stopPmtAddAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddAnlysIdType }{@code >}
     *     
     */
    public void setStopPmtAddAnlysId(JAXBElement<StopPmtAddAnlysIdType> value) {
        this.stopPmtAddAnlysId = value;
    }

    /**
     * Gets the value of the stopPmtAddFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<StopPmtAddFeeAmtType> getStopPmtAddFeeAmt() {
        return stopPmtAddFeeAmt;
    }

    /**
     * Sets the value of the stopPmtAddFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddFeeAmtType }{@code >}
     *     
     */
    public void setStopPmtAddFeeAmt(JAXBElement<StopPmtAddFeeAmtType> value) {
        this.stopPmtAddFeeAmt = value;
    }

    /**
     * Gets the value of the xferFromAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferFromAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<XferFromAnlysIdType> getXferFromAnlysId() {
        return xferFromAnlysId;
    }

    /**
     * Sets the value of the xferFromAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferFromAnlysIdType }{@code >}
     *     
     */
    public void setXferFromAnlysId(JAXBElement<XferFromAnlysIdType> value) {
        this.xferFromAnlysId = value;
    }

    /**
     * Gets the value of the xferFromFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferFromFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<XferFromFeeAmtType> getXferFromFeeAmt() {
        return xferFromFeeAmt;
    }

    /**
     * Sets the value of the xferFromFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferFromFeeAmtType }{@code >}
     *     
     */
    public void setXferFromFeeAmt(JAXBElement<XferFromFeeAmtType> value) {
        this.xferFromFeeAmt = value;
    }

    /**
     * Gets the value of the stmtRetrvAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<StmtRetrvAnlysIdType> getStmtRetrvAnlysId() {
        return stmtRetrvAnlysId;
    }

    /**
     * Sets the value of the stmtRetrvAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvAnlysIdType }{@code >}
     *     
     */
    public void setStmtRetrvAnlysId(JAXBElement<StmtRetrvAnlysIdType> value) {
        this.stmtRetrvAnlysId = value;
    }

    /**
     * Gets the value of the stmtRetrvFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<StmtRetrvFeeAmtType> getStmtRetrvFeeAmt() {
        return stmtRetrvFeeAmt;
    }

    /**
     * Sets the value of the stmtRetrvFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvFeeAmtType }{@code >}
     *     
     */
    public void setStmtRetrvFeeAmt(JAXBElement<StmtRetrvFeeAmtType> value) {
        this.stmtRetrvFeeAmt = value;
    }

    /**
     * Gets the value of the feeChgStmtType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeeChgStmtTypeType }{@code >}
     *     
     */
    public JAXBElement<FeeChgStmtTypeType> getFeeChgStmtType() {
        return feeChgStmtType;
    }

    /**
     * Sets the value of the feeChgStmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeeChgStmtTypeType }{@code >}
     *     
     */
    public void setFeeChgStmtType(JAXBElement<FeeChgStmtTypeType> value) {
        this.feeChgStmtType = value;
    }

    /**
     * Gets the value of the lnPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnPmtAlwType }{@code >}
     *     
     */
    public JAXBElement<LnPmtAlwType> getLnPmtAlw() {
        return lnPmtAlw;
    }

    /**
     * Sets the value of the lnPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnPmtAlwType }{@code >}
     *     
     */
    public void setLnPmtAlw(JAXBElement<LnPmtAlwType> value) {
        this.lnPmtAlw = value;
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
     * Gets the value of the plnCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCodeType }
     *     
     */
    public PlnCodeType getPlnCode() {
        return plnCode;
    }

    /**
     * Sets the value of the plnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCodeType }
     *     
     */
    public void setPlnCode(PlnCodeType value) {
        this.plnCode = value;
    }

    /**
     * Gets the value of the plnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PlnDescType }
     *     
     */
    public PlnDescType getPlnDesc() {
        return plnDesc;
    }

    /**
     * Sets the value of the plnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnDescType }
     *     
     */
    public void setPlnDesc(PlnDescType value) {
        this.plnDesc = value;
    }

    /**
     * Gets the value of the achCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCrPostAmtType }
     *     
     */
    public ACHCrPostAmtType getACHCrPostAmt() {
        return achCrPostAmt;
    }

    /**
     * Sets the value of the achCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCrPostAmtType }
     *     
     */
    public void setACHCrPostAmt(ACHCrPostAmtType value) {
        this.achCrPostAmt = value;
    }

    /**
     * Gets the value of the achDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrPostAmtType }
     *     
     */
    public ACHDrPostAmtType getACHDrPostAmt() {
        return achDrPostAmt;
    }

    /**
     * Sets the value of the achDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrPostAmtType }
     *     
     */
    public void setACHDrPostAmt(ACHDrPostAmtType value) {
        this.achDrPostAmt = value;
    }

    /**
     * Gets the value of the ckCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CkCrPostAmtType }
     *     
     */
    public CkCrPostAmtType getCkCrPostAmt() {
        return ckCrPostAmt;
    }

    /**
     * Sets the value of the ckCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CkCrPostAmtType }
     *     
     */
    public void setCkCrPostAmt(CkCrPostAmtType value) {
        this.ckCrPostAmt = value;
    }

    /**
     * Gets the value of the ckDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CkDrPostAmtType }
     *     
     */
    public CkDrPostAmtType getCkDrPostAmt() {
        return ckDrPostAmt;
    }

    /**
     * Sets the value of the ckDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CkDrPostAmtType }
     *     
     */
    public void setCkDrPostAmt(CkDrPostAmtType value) {
        this.ckDrPostAmt = value;
    }

    /**
     * Gets the value of the otcCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OTCCrPostAmtType }
     *     
     */
    public OTCCrPostAmtType getOTCCrPostAmt() {
        return otcCrPostAmt;
    }

    /**
     * Sets the value of the otcCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTCCrPostAmtType }
     *     
     */
    public void setOTCCrPostAmt(OTCCrPostAmtType value) {
        this.otcCrPostAmt = value;
    }

    /**
     * Gets the value of the otcDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OTCDrPostAmtType }
     *     
     */
    public OTCDrPostAmtType getOTCDrPostAmt() {
        return otcDrPostAmt;
    }

    /**
     * Sets the value of the otcDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTCDrPostAmtType }
     *     
     */
    public void setOTCDrPostAmt(OTCDrPostAmtType value) {
        this.otcDrPostAmt = value;
    }

    /**
     * Gets the value of the wireCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireCrPostAmtType }
     *     
     */
    public WireCrPostAmtType getWireCrPostAmt() {
        return wireCrPostAmt;
    }

    /**
     * Sets the value of the wireCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCrPostAmtType }
     *     
     */
    public void setWireCrPostAmt(WireCrPostAmtType value) {
        this.wireCrPostAmt = value;
    }

    /**
     * Gets the value of the wireDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireDrPostAmtType }
     *     
     */
    public WireDrPostAmtType getWireDrPostAmt() {
        return wireDrPostAmt;
    }

    /**
     * Sets the value of the wireDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDrPostAmtType }
     *     
     */
    public void setWireDrPostAmt(WireDrPostAmtType value) {
        this.wireDrPostAmt = value;
    }

    /**
     * Gets the value of the xferCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link XferCrPostAmtType }
     *     
     */
    public XferCrPostAmtType getXferCrPostAmt() {
        return xferCrPostAmt;
    }

    /**
     * Sets the value of the xferCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferCrPostAmtType }
     *     
     */
    public void setXferCrPostAmt(XferCrPostAmtType value) {
        this.xferCrPostAmt = value;
    }

    /**
     * Gets the value of the xferDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link XferDrPostAmtType }
     *     
     */
    public XferDrPostAmtType getXferDrPostAmt() {
        return xferDrPostAmt;
    }

    /**
     * Sets the value of the xferDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferDrPostAmtType }
     *     
     */
    public void setXferDrPostAmt(XferDrPostAmtType value) {
        this.xferDrPostAmt = value;
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
