
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PmtHubUsrActInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubUsrActInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtRailType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRailType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubActType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubActType_Type" minOccurs="0"/&gt;
 *         &lt;element name="UsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="LegalEntityId" type="{http://jackhenry.com/jxchange/TPG/2008}LegalEntityId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LegalEntityIdType" type="{http://jackhenry.com/jxchange/TPG/2008}LegalEntityIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CrUsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrXferFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="DrUsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type" minOccurs="0"/&gt;
 *         &lt;element name="Alias" type="{http://jackhenry.com/jxchange/TPG/2008}Alias_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrXferFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnAcptTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAcptTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtBatchId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtBatchId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldOrigVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldNewVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="TrnFinalType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFinalType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RetryPmtRqId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="RetryTrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProjExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubHistActArray" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubHistActArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PmtHubUsrActInqRec_CType", propOrder = {
    "pmtRailType",
    "pmtHubActType",
    "usrToken",
    "accountId",
    "legalEntityId",
    "legalEntityIdType",
    "crAcctId",
    "crCustName",
    "crUsrToken",
    "crXferFinInstId",
    "drAcctId",
    "drCustName",
    "drUsrToken",
    "alias",
    "drXferFinInstId",
    "xferAmt",
    "trnAcptTimeDt",
    "pmtBatchId",
    "pmtRqId",
    "origVal",
    "newVal",
    "pmtRmkArray",
    "trnFinalType",
    "retryPmtRqId",
    "retryTrnRcptId",
    "projExpDt",
    "pmtHubHistActArray",
    "custom",
    "ver1",
    "any"
})
public class PmtHubUsrActInqRecCType {

    @XmlElement(name = "PmtRailType")
    protected PmtRailTypeType pmtRailType;
    @XmlElement(name = "PmtHubActType")
    protected PmtHubActTypeType pmtHubActType;
    @XmlElement(name = "UsrToken")
    protected UsrTokenType usrToken;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "LegalEntityId")
    protected LegalEntityIdType legalEntityId;
    @XmlElement(name = "LegalEntityIdType")
    protected LegalEntityIdTypeType legalEntityIdType;
    @XmlElement(name = "CrAcctId")
    protected AcctIdType crAcctId;
    @XmlElement(name = "CrCustName")
    protected PersonNameCType crCustName;
    @XmlElement(name = "CrUsrToken")
    protected UsrTokenType crUsrToken;
    @XmlElement(name = "CrXferFinInstId")
    protected InstRtIdType crXferFinInstId;
    @XmlElement(name = "DrAcctId")
    protected AcctIdType drAcctId;
    @XmlElement(name = "DrCustName")
    protected PersonNameCType drCustName;
    @XmlElement(name = "DrUsrToken")
    protected UsrTokenType drUsrToken;
    @XmlElement(name = "Alias")
    protected AliasType alias;
    @XmlElement(name = "DrXferFinInstId")
    protected InstRtIdType drXferFinInstId;
    @XmlElement(name = "XferAmt")
    protected AmtType xferAmt;
    @XmlElement(name = "TrnAcptTimeDt")
    protected TrnAcptTimeDtType trnAcptTimeDt;
    @XmlElement(name = "PmtBatchId")
    protected PmtBatchIdType pmtBatchId;
    @XmlElement(name = "PmtRqId")
    protected PmtIdType pmtRqId;
    @XmlElement(name = "OrigVal")
    protected FieldOrigValType origVal;
    @XmlElement(name = "NewVal")
    protected FieldNewValType newVal;
    @XmlElement(name = "PmtRmkArray")
    protected RmkAType pmtRmkArray;
    @XmlElement(name = "TrnFinalType")
    protected TrnFinalTypeType trnFinalType;
    @XmlElement(name = "RetryPmtRqId")
    protected PmtIdType retryPmtRqId;
    @XmlElement(name = "RetryTrnRcptId")
    protected TrnRcptIdType retryTrnRcptId;
    @XmlElement(name = "ProjExpDt")
    protected ExpDtType projExpDt;
    @XmlElement(name = "PmtHubHistActArray")
    protected PmtHubHistActArrayAType pmtHubHistActArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtRailType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRailTypeType }
     *     
     */
    public PmtRailTypeType getPmtRailType() {
        return pmtRailType;
    }

    /**
     * Sets the value of the pmtRailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRailTypeType }
     *     
     */
    public void setPmtRailType(PmtRailTypeType value) {
        this.pmtRailType = value;
    }

    /**
     * Gets the value of the pmtHubActType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtHubActTypeType }
     *     
     */
    public PmtHubActTypeType getPmtHubActType() {
        return pmtHubActType;
    }

    /**
     * Sets the value of the pmtHubActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtHubActTypeType }
     *     
     */
    public void setPmtHubActType(PmtHubActTypeType value) {
        this.pmtHubActType = value;
    }

    /**
     * Gets the value of the usrToken property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenType }
     *     
     */
    public UsrTokenType getUsrToken() {
        return usrToken;
    }

    /**
     * Sets the value of the usrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenType }
     *     
     */
    public void setUsrToken(UsrTokenType value) {
        this.usrToken = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the legalEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityIdType }
     *     
     */
    public LegalEntityIdType getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Sets the value of the legalEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityIdType }
     *     
     */
    public void setLegalEntityId(LegalEntityIdType value) {
        this.legalEntityId = value;
    }

    /**
     * Gets the value of the legalEntityIdType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityIdTypeType }
     *     
     */
    public LegalEntityIdTypeType getLegalEntityIdType() {
        return legalEntityIdType;
    }

    /**
     * Sets the value of the legalEntityIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityIdTypeType }
     *     
     */
    public void setLegalEntityIdType(LegalEntityIdTypeType value) {
        this.legalEntityIdType = value;
    }

    /**
     * Gets the value of the crAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getCrAcctId() {
        return crAcctId;
    }

    /**
     * Sets the value of the crAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setCrAcctId(AcctIdType value) {
        this.crAcctId = value;
    }

    /**
     * Gets the value of the crCustName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCrCustName() {
        return crCustName;
    }

    /**
     * Sets the value of the crCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCrCustName(PersonNameCType value) {
        this.crCustName = value;
    }

    /**
     * Gets the value of the crUsrToken property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenType }
     *     
     */
    public UsrTokenType getCrUsrToken() {
        return crUsrToken;
    }

    /**
     * Sets the value of the crUsrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenType }
     *     
     */
    public void setCrUsrToken(UsrTokenType value) {
        this.crUsrToken = value;
    }

    /**
     * Gets the value of the crXferFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getCrXferFinInstId() {
        return crXferFinInstId;
    }

    /**
     * Sets the value of the crXferFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setCrXferFinInstId(InstRtIdType value) {
        this.crXferFinInstId = value;
    }

    /**
     * Gets the value of the drAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getDrAcctId() {
        return drAcctId;
    }

    /**
     * Sets the value of the drAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setDrAcctId(AcctIdType value) {
        this.drAcctId = value;
    }

    /**
     * Gets the value of the drCustName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getDrCustName() {
        return drCustName;
    }

    /**
     * Sets the value of the drCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setDrCustName(PersonNameCType value) {
        this.drCustName = value;
    }

    /**
     * Gets the value of the drUsrToken property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenType }
     *     
     */
    public UsrTokenType getDrUsrToken() {
        return drUsrToken;
    }

    /**
     * Sets the value of the drUsrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenType }
     *     
     */
    public void setDrUsrToken(UsrTokenType value) {
        this.drUsrToken = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link AliasType }
     *     
     */
    public AliasType getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasType }
     *     
     */
    public void setAlias(AliasType value) {
        this.alias = value;
    }

    /**
     * Gets the value of the drXferFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getDrXferFinInstId() {
        return drXferFinInstId;
    }

    /**
     * Sets the value of the drXferFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setDrXferFinInstId(InstRtIdType value) {
        this.drXferFinInstId = value;
    }

    /**
     * Gets the value of the xferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getXferAmt() {
        return xferAmt;
    }

    /**
     * Sets the value of the xferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setXferAmt(AmtType value) {
        this.xferAmt = value;
    }

    /**
     * Gets the value of the trnAcptTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAcptTimeDtType }
     *     
     */
    public TrnAcptTimeDtType getTrnAcptTimeDt() {
        return trnAcptTimeDt;
    }

    /**
     * Sets the value of the trnAcptTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAcptTimeDtType }
     *     
     */
    public void setTrnAcptTimeDt(TrnAcptTimeDtType value) {
        this.trnAcptTimeDt = value;
    }

    /**
     * Gets the value of the pmtBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchIdType }
     *     
     */
    public PmtBatchIdType getPmtBatchId() {
        return pmtBatchId;
    }

    /**
     * Sets the value of the pmtBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchIdType }
     *     
     */
    public void setPmtBatchId(PmtBatchIdType value) {
        this.pmtBatchId = value;
    }

    /**
     * Gets the value of the pmtRqId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIdType }
     *     
     */
    public PmtIdType getPmtRqId() {
        return pmtRqId;
    }

    /**
     * Sets the value of the pmtRqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIdType }
     *     
     */
    public void setPmtRqId(PmtIdType value) {
        this.pmtRqId = value;
    }

    /**
     * Gets the value of the origVal property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOrigValType }
     *     
     */
    public FieldOrigValType getOrigVal() {
        return origVal;
    }

    /**
     * Sets the value of the origVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOrigValType }
     *     
     */
    public void setOrigVal(FieldOrigValType value) {
        this.origVal = value;
    }

    /**
     * Gets the value of the newVal property.
     * 
     * @return
     *     possible object is
     *     {@link FieldNewValType }
     *     
     */
    public FieldNewValType getNewVal() {
        return newVal;
    }

    /**
     * Sets the value of the newVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldNewValType }
     *     
     */
    public void setNewVal(FieldNewValType value) {
        this.newVal = value;
    }

    /**
     * Gets the value of the pmtRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getPmtRmkArray() {
        return pmtRmkArray;
    }

    /**
     * Sets the value of the pmtRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setPmtRmkArray(RmkAType value) {
        this.pmtRmkArray = value;
    }

    /**
     * Gets the value of the trnFinalType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFinalTypeType }
     *     
     */
    public TrnFinalTypeType getTrnFinalType() {
        return trnFinalType;
    }

    /**
     * Sets the value of the trnFinalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFinalTypeType }
     *     
     */
    public void setTrnFinalType(TrnFinalTypeType value) {
        this.trnFinalType = value;
    }

    /**
     * Gets the value of the retryPmtRqId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIdType }
     *     
     */
    public PmtIdType getRetryPmtRqId() {
        return retryPmtRqId;
    }

    /**
     * Sets the value of the retryPmtRqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIdType }
     *     
     */
    public void setRetryPmtRqId(PmtIdType value) {
        this.retryPmtRqId = value;
    }

    /**
     * Gets the value of the retryTrnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRcptIdType }
     *     
     */
    public TrnRcptIdType getRetryTrnRcptId() {
        return retryTrnRcptId;
    }

    /**
     * Sets the value of the retryTrnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRcptIdType }
     *     
     */
    public void setRetryTrnRcptId(TrnRcptIdType value) {
        this.retryTrnRcptId = value;
    }

    /**
     * Gets the value of the projExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getProjExpDt() {
        return projExpDt;
    }

    /**
     * Sets the value of the projExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setProjExpDt(ExpDtType value) {
        this.projExpDt = value;
    }

    /**
     * Gets the value of the pmtHubHistActArray property.
     * 
     * @return
     *     possible object is
     *     {@link PmtHubHistActArrayAType }
     *     
     */
    public PmtHubHistActArrayAType getPmtHubHistActArray() {
        return pmtHubHistActArray;
    }

    /**
     * Sets the value of the pmtHubHistActArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtHubHistActArrayAType }
     *     
     */
    public void setPmtHubHistActArray(PmtHubHistActArrayAType value) {
        this.pmtHubHistActArray = value;
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
