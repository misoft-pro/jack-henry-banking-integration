
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
 * <p>Java class for LOCSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="LOCAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCTotAdvaAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCTotAdvaAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCommBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCommBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPrtcpCode" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrtcpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPrtcpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrtcpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCParentAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCParentAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCParentAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCParentAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCMasterAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCMasterAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCMasterAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LOCMasterAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStat" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomLOCSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LtrOfCrType" type="{http://jackhenry.com/jxchange/TPG/2008}LtrOfCrType_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCAdjAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAdjAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCGdnceBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceBal_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCGdnceAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceAvlBal_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCPrincRedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrincRedAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCGdnceOrder" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceOrder_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LOCSrchRec_CType", propOrder = {
    "custId",
    "personName",
    "locAcctId",
    "locAcctType",
    "locExpDt",
    "locCode",
    "locDesc",
    "locTotAdvaAmt",
    "locAmt",
    "locAvlBal",
    "locCommBal",
    "locCurBal",
    "locPrtcpCode",
    "locPrtcpDesc",
    "locParentAcctId",
    "locParentAcctType",
    "locMasterAcctId",
    "locMasterAcctType",
    "locStat",
    "locStatDesc",
    "customLOCSrchRec",
    "ver1",
    "ltrOfCrType",
    "locAdjAmt",
    "locGdnceBal",
    "locGdnceAvlBal",
    "locPrincRedAmt",
    "locGdnceOrder",
    "ver2",
    "any"
})
public class LOCSrchRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "LOCAcctId")
    protected AcctIdType locAcctId;
    @XmlElement(name = "LOCAcctType")
    protected AcctTypeType locAcctType;
    @XmlElement(name = "LOCExpDt")
    protected LOCExpDtType locExpDt;
    @XmlElement(name = "LOCCode")
    protected LOCCodeType locCode;
    @XmlElement(name = "LOCDesc")
    protected LOCDescType locDesc;
    @XmlElement(name = "LOCTotAdvaAmt")
    protected LOCTotAdvaAmtType locTotAdvaAmt;
    @XmlElement(name = "LOCAmt")
    protected LOCAmtType locAmt;
    @XmlElement(name = "LOCAvlBal")
    protected LOCAvlBalType locAvlBal;
    @XmlElement(name = "LOCCommBal")
    protected LOCCommBalType locCommBal;
    @XmlElement(name = "LOCCurBal")
    protected LOCCurBalType locCurBal;
    @XmlElement(name = "LOCPrtcpCode")
    protected LOCPrtcpCodeType locPrtcpCode;
    @XmlElement(name = "LOCPrtcpDesc")
    protected LOCPrtcpDescType locPrtcpDesc;
    @XmlElement(name = "LOCParentAcctId")
    protected LOCParentAcctIdType locParentAcctId;
    @XmlElement(name = "LOCParentAcctType")
    protected LOCParentAcctTypeType locParentAcctType;
    @XmlElement(name = "LOCMasterAcctId")
    protected LOCMasterAcctIdType locMasterAcctId;
    @XmlElement(name = "LOCMasterAcctType")
    protected LOCMasterAcctTypeType locMasterAcctType;
    @XmlElement(name = "LOCStat")
    protected LOCStatType locStat;
    @XmlElement(name = "LOCStatDesc")
    protected LOCStatDescType locStatDesc;
    @XmlElement(name = "CustomLOCSrchRec")
    protected CustomCType customLOCSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "LtrOfCrType")
    protected LtrOfCrTypeType ltrOfCrType;
    @XmlElement(name = "LOCAdjAmt")
    protected LOCAdjAmtType locAdjAmt;
    @XmlElement(name = "LOCGdnceBal")
    protected LOCGdnceBalType locGdnceBal;
    @XmlElement(name = "LOCGdnceAvlBal")
    protected LOCGdnceAvlBalType locGdnceAvlBal;
    @XmlElement(name = "LOCPrincRedAmt")
    protected LOCPrincRedAmtType locPrincRedAmt;
    @XmlElement(name = "LOCGdnceOrder")
    protected LOCGdnceOrderType locGdnceOrder;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPersonName(PersonNameCType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the locAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getLOCAcctId() {
        return locAcctId;
    }

    /**
     * Sets the value of the locAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setLOCAcctId(AcctIdType value) {
        this.locAcctId = value;
    }

    /**
     * Gets the value of the locAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getLOCAcctType() {
        return locAcctType;
    }

    /**
     * Sets the value of the locAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setLOCAcctType(AcctTypeType value) {
        this.locAcctType = value;
    }

    /**
     * Gets the value of the locExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCExpDtType }
     *     
     */
    public LOCExpDtType getLOCExpDt() {
        return locExpDt;
    }

    /**
     * Sets the value of the locExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCExpDtType }
     *     
     */
    public void setLOCExpDt(LOCExpDtType value) {
        this.locExpDt = value;
    }

    /**
     * Gets the value of the locCode property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCodeType }
     *     
     */
    public LOCCodeType getLOCCode() {
        return locCode;
    }

    /**
     * Sets the value of the locCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCodeType }
     *     
     */
    public void setLOCCode(LOCCodeType value) {
        this.locCode = value;
    }

    /**
     * Gets the value of the locDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCDescType }
     *     
     */
    public LOCDescType getLOCDesc() {
        return locDesc;
    }

    /**
     * Sets the value of the locDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCDescType }
     *     
     */
    public void setLOCDesc(LOCDescType value) {
        this.locDesc = value;
    }

    /**
     * Gets the value of the locTotAdvaAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCTotAdvaAmtType }
     *     
     */
    public LOCTotAdvaAmtType getLOCTotAdvaAmt() {
        return locTotAdvaAmt;
    }

    /**
     * Sets the value of the locTotAdvaAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCTotAdvaAmtType }
     *     
     */
    public void setLOCTotAdvaAmt(LOCTotAdvaAmtType value) {
        this.locTotAdvaAmt = value;
    }

    /**
     * Gets the value of the locAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAmtType }
     *     
     */
    public LOCAmtType getLOCAmt() {
        return locAmt;
    }

    /**
     * Sets the value of the locAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAmtType }
     *     
     */
    public void setLOCAmt(LOCAmtType value) {
        this.locAmt = value;
    }

    /**
     * Gets the value of the locAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlBalType }
     *     
     */
    public LOCAvlBalType getLOCAvlBal() {
        return locAvlBal;
    }

    /**
     * Sets the value of the locAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlBalType }
     *     
     */
    public void setLOCAvlBal(LOCAvlBalType value) {
        this.locAvlBal = value;
    }

    /**
     * Gets the value of the locCommBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCommBalType }
     *     
     */
    public LOCCommBalType getLOCCommBal() {
        return locCommBal;
    }

    /**
     * Sets the value of the locCommBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCommBalType }
     *     
     */
    public void setLOCCommBal(LOCCommBalType value) {
        this.locCommBal = value;
    }

    /**
     * Gets the value of the locCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCurBalType }
     *     
     */
    public LOCCurBalType getLOCCurBal() {
        return locCurBal;
    }

    /**
     * Sets the value of the locCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCurBalType }
     *     
     */
    public void setLOCCurBal(LOCCurBalType value) {
        this.locCurBal = value;
    }

    /**
     * Gets the value of the locPrtcpCode property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPrtcpCodeType }
     *     
     */
    public LOCPrtcpCodeType getLOCPrtcpCode() {
        return locPrtcpCode;
    }

    /**
     * Sets the value of the locPrtcpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPrtcpCodeType }
     *     
     */
    public void setLOCPrtcpCode(LOCPrtcpCodeType value) {
        this.locPrtcpCode = value;
    }

    /**
     * Gets the value of the locPrtcpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPrtcpDescType }
     *     
     */
    public LOCPrtcpDescType getLOCPrtcpDesc() {
        return locPrtcpDesc;
    }

    /**
     * Sets the value of the locPrtcpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPrtcpDescType }
     *     
     */
    public void setLOCPrtcpDesc(LOCPrtcpDescType value) {
        this.locPrtcpDesc = value;
    }

    /**
     * Gets the value of the locParentAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCParentAcctIdType }
     *     
     */
    public LOCParentAcctIdType getLOCParentAcctId() {
        return locParentAcctId;
    }

    /**
     * Sets the value of the locParentAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCParentAcctIdType }
     *     
     */
    public void setLOCParentAcctId(LOCParentAcctIdType value) {
        this.locParentAcctId = value;
    }

    /**
     * Gets the value of the locParentAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCParentAcctTypeType }
     *     
     */
    public LOCParentAcctTypeType getLOCParentAcctType() {
        return locParentAcctType;
    }

    /**
     * Sets the value of the locParentAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCParentAcctTypeType }
     *     
     */
    public void setLOCParentAcctType(LOCParentAcctTypeType value) {
        this.locParentAcctType = value;
    }

    /**
     * Gets the value of the locMasterAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCMasterAcctIdType }
     *     
     */
    public LOCMasterAcctIdType getLOCMasterAcctId() {
        return locMasterAcctId;
    }

    /**
     * Sets the value of the locMasterAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCMasterAcctIdType }
     *     
     */
    public void setLOCMasterAcctId(LOCMasterAcctIdType value) {
        this.locMasterAcctId = value;
    }

    /**
     * Gets the value of the locMasterAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link LOCMasterAcctTypeType }
     *     
     */
    public LOCMasterAcctTypeType getLOCMasterAcctType() {
        return locMasterAcctType;
    }

    /**
     * Sets the value of the locMasterAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCMasterAcctTypeType }
     *     
     */
    public void setLOCMasterAcctType(LOCMasterAcctTypeType value) {
        this.locMasterAcctType = value;
    }

    /**
     * Gets the value of the locStat property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatType }
     *     
     */
    public LOCStatType getLOCStat() {
        return locStat;
    }

    /**
     * Sets the value of the locStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatType }
     *     
     */
    public void setLOCStat(LOCStatType value) {
        this.locStat = value;
    }

    /**
     * Gets the value of the locStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatDescType }
     *     
     */
    public LOCStatDescType getLOCStatDesc() {
        return locStatDesc;
    }

    /**
     * Sets the value of the locStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatDescType }
     *     
     */
    public void setLOCStatDesc(LOCStatDescType value) {
        this.locStatDesc = value;
    }

    /**
     * Gets the value of the customLOCSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomLOCSrchRec() {
        return customLOCSrchRec;
    }

    /**
     * Sets the value of the customLOCSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomLOCSrchRec(CustomCType value) {
        this.customLOCSrchRec = value;
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
     * Gets the value of the ltrOfCrType property.
     * 
     * @return
     *     possible object is
     *     {@link LtrOfCrTypeType }
     *     
     */
    public LtrOfCrTypeType getLtrOfCrType() {
        return ltrOfCrType;
    }

    /**
     * Sets the value of the ltrOfCrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtrOfCrTypeType }
     *     
     */
    public void setLtrOfCrType(LtrOfCrTypeType value) {
        this.ltrOfCrType = value;
    }

    /**
     * Gets the value of the locAdjAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAdjAmtType }
     *     
     */
    public LOCAdjAmtType getLOCAdjAmt() {
        return locAdjAmt;
    }

    /**
     * Sets the value of the locAdjAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAdjAmtType }
     *     
     */
    public void setLOCAdjAmt(LOCAdjAmtType value) {
        this.locAdjAmt = value;
    }

    /**
     * Gets the value of the locGdnceBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceBalType }
     *     
     */
    public LOCGdnceBalType getLOCGdnceBal() {
        return locGdnceBal;
    }

    /**
     * Sets the value of the locGdnceBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceBalType }
     *     
     */
    public void setLOCGdnceBal(LOCGdnceBalType value) {
        this.locGdnceBal = value;
    }

    /**
     * Gets the value of the locGdnceAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceAvlBalType }
     *     
     */
    public LOCGdnceAvlBalType getLOCGdnceAvlBal() {
        return locGdnceAvlBal;
    }

    /**
     * Sets the value of the locGdnceAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceAvlBalType }
     *     
     */
    public void setLOCGdnceAvlBal(LOCGdnceAvlBalType value) {
        this.locGdnceAvlBal = value;
    }

    /**
     * Gets the value of the locPrincRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPrincRedAmtType }
     *     
     */
    public LOCPrincRedAmtType getLOCPrincRedAmt() {
        return locPrincRedAmt;
    }

    /**
     * Sets the value of the locPrincRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPrincRedAmtType }
     *     
     */
    public void setLOCPrincRedAmt(LOCPrincRedAmtType value) {
        this.locPrincRedAmt = value;
    }

    /**
     * Gets the value of the locGdnceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceOrderType }
     *     
     */
    public LOCGdnceOrderType getLOCGdnceOrder() {
        return locGdnceOrder;
    }

    /**
     * Sets the value of the locGdnceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceOrderType }
     *     
     */
    public void setLOCGdnceOrder(LOCGdnceOrderType value) {
        this.locGdnceOrder = value;
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
