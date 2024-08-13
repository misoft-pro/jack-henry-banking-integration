
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
 * A package of data related to a bill pay product
 *                 type
 * 
 * <p>Java class for BilPayProdTypeInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayProdTypeInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilPayProdType" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDtModel" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDtModel_Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MaxPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxEmailPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MaxEmailPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxEmailDlyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MaxEmailDlyAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlwSecdPerson" type="{http://jackhenry.com/jxchange/TPG/2008}AlwSecdPerson_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlwAddPayFromAcct" type="{http://jackhenry.com/jxchange/TPG/2008}AlwAddPayFromAcct_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPayFeturInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayFeturInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="DlyElecRiskLmt" type="{http://jackhenry.com/jxchange/TPG/2008}DlyElecRiskLmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="MthlyElecRiskLmt" type="{http://jackhenry.com/jxchange/TPG/2008}MthlyElecRiskLmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="TaxIdReq" type="{http://jackhenry.com/jxchange/TPG/2008}TaxIdReq_Type" minOccurs="0"/&gt;
 *             &lt;element name="CanSetStartChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}CanSetStartChkNum_Type" minOccurs="0"/&gt;
 *             &lt;element name="CanPayFromSavAcct" type="{http://jackhenry.com/jxchange/TPG/2008}CanPayFromSavAcct_Type" minOccurs="0"/&gt;
 *             &lt;element name="DualSignOnReq" type="{http://jackhenry.com/jxchange/TPG/2008}DualSignOnReq_Type" minOccurs="0"/&gt;
 *             &lt;element name="SubLogInIdRstr" type="{http://jackhenry.com/jxchange/TPG/2008}SubLogInIdRstr_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CanAddPayFromOwnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CanAddPayFromOwnInfo_Type" minOccurs="0"/&gt;
 *               &lt;element name="ConsmOwnSubUsrPer" type="{http://jackhenry.com/jxchange/TPG/2008}ConsmOwnSubUsrPer_Type" minOccurs="0"/&gt;
 *               &lt;element name="AlwSubAssocUsrMgmtOptInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}AlwSubAssocUsrMgmtOptInfoArray_AType" minOccurs="0"/&gt;
 *               &lt;element name="HidSubAssocUsrConsmCustId" type="{http://jackhenry.com/jxchange/TPG/2008}HidSubAssocUsrConsmCustId_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="HidSubAssocUsrSubComId" type="{http://jackhenry.com/jxchange/TPG/2008}HidSubAssocUsrSubComId_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="AlwSubType" type="{http://jackhenry.com/jxchange/TPG/2008}AlwSubType_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="ElecMerAutoPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAutoPmtAlw_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="MaxIndvPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MaxIndvPmtAmt_Type" minOccurs="0"/&gt;
 *                       &lt;element name="MaxIndvDlyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MaxIndvDlyAmt_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;element name="AvlCardBINArray" type="{http://jackhenry.com/jxchange/TPG/2008}AvlCardBINArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayProdTypeInfo_CType", propOrder = {
    "bilPayProdType",
    "pmtDtModel",
    "maxPmtAmt",
    "maxEmailPmtAmt",
    "maxEmailDlyAmt",
    "alwSecdPerson",
    "alwAddPayFromAcct",
    "bilPayFeturInfoArray",
    "ver1",
    "dlyElecRiskLmt",
    "mthlyElecRiskLmt",
    "ver2",
    "taxIdReq",
    "canSetStartChkNum",
    "canPayFromSavAcct",
    "dualSignOnReq",
    "subLogInIdRstr",
    "ver3",
    "canAddPayFromOwnInfo",
    "consmOwnSubUsrPer",
    "alwSubAssocUsrMgmtOptInfoArray",
    "hidSubAssocUsrConsmCustId",
    "ver4",
    "hidSubAssocUsrSubComId",
    "ver5",
    "alwSubType",
    "ver6",
    "elecMerAutoPmtAlw",
    "ver7",
    "maxIndvPmtAmt",
    "maxIndvDlyAmt",
    "ver8",
    "avlCardBINArray",
    "ver9",
    "any"
})
public class BilPayProdTypeInfoCType {

    @XmlElement(name = "BilPayProdType")
    protected BilPayProdTypeType bilPayProdType;
    @XmlElement(name = "PmtDtModel")
    protected PmtDtModelType pmtDtModel;
    @XmlElement(name = "MaxPmtAmt")
    protected MaxPmtAmtType maxPmtAmt;
    @XmlElement(name = "MaxEmailPmtAmt")
    protected MaxEmailPmtAmtType maxEmailPmtAmt;
    @XmlElement(name = "MaxEmailDlyAmt")
    protected MaxEmailDlyAmtType maxEmailDlyAmt;
    @XmlElement(name = "AlwSecdPerson")
    protected AlwSecdPersonType alwSecdPerson;
    @XmlElement(name = "AlwAddPayFromAcct")
    protected AlwAddPayFromAcctType alwAddPayFromAcct;
    @XmlElement(name = "BilPayFeturInfoArray")
    protected BilPayFeturInfoArrayAType bilPayFeturInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "DlyElecRiskLmt")
    protected DlyElecRiskLmtType dlyElecRiskLmt;
    @XmlElement(name = "MthlyElecRiskLmt")
    protected MthlyElecRiskLmtType mthlyElecRiskLmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "TaxIdReq")
    protected TaxIdReqType taxIdReq;
    @XmlElement(name = "CanSetStartChkNum")
    protected CanSetStartChkNumType canSetStartChkNum;
    @XmlElement(name = "CanPayFromSavAcct")
    protected CanPayFromSavAcctType canPayFromSavAcct;
    @XmlElement(name = "DualSignOnReq")
    protected DualSignOnReqType dualSignOnReq;
    @XmlElement(name = "SubLogInIdRstr")
    protected SubLogInIdRstrCType subLogInIdRstr;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CanAddPayFromOwnInfo")
    protected CanAddPayFromOwnInfoType canAddPayFromOwnInfo;
    @XmlElement(name = "ConsmOwnSubUsrPer")
    protected ConsmOwnSubUsrPerType consmOwnSubUsrPer;
    @XmlElement(name = "AlwSubAssocUsrMgmtOptInfoArray")
    protected AlwSubAssocUsrMgmtOptInfoArrayAType alwSubAssocUsrMgmtOptInfoArray;
    @XmlElement(name = "HidSubAssocUsrConsmCustId")
    protected HidSubAssocUsrConsmCustIdType hidSubAssocUsrConsmCustId;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "HidSubAssocUsrSubComId")
    protected HidSubAssocUsrSubComIdType hidSubAssocUsrSubComId;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "AlwSubType")
    protected AlwSubTypeType alwSubType;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "ElecMerAutoPmtAlw")
    protected ElecMerAutoPmtAlwType elecMerAutoPmtAlw;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "MaxIndvPmtAmt")
    protected MaxIndvPmtAmtType maxIndvPmtAmt;
    @XmlElement(name = "MaxIndvDlyAmt")
    protected MaxIndvDlyAmtType maxIndvDlyAmt;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlElement(name = "AvlCardBINArray")
    protected AvlCardBINArrayAType avlCardBINArray;
    @XmlElement(name = "Ver_9")
    protected Ver9CType ver9;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bilPayProdType property.
     * 
     * @return
     *     possible object is
     *     {@link BilPayProdTypeType }
     *     
     */
    public BilPayProdTypeType getBilPayProdType() {
        return bilPayProdType;
    }

    /**
     * Sets the value of the bilPayProdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPayProdTypeType }
     *     
     */
    public void setBilPayProdType(BilPayProdTypeType value) {
        this.bilPayProdType = value;
    }

    /**
     * Gets the value of the pmtDtModel property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDtModelType }
     *     
     */
    public PmtDtModelType getPmtDtModel() {
        return pmtDtModel;
    }

    /**
     * Sets the value of the pmtDtModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDtModelType }
     *     
     */
    public void setPmtDtModel(PmtDtModelType value) {
        this.pmtDtModel = value;
    }

    /**
     * Gets the value of the maxPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxPmtAmtType }
     *     
     */
    public MaxPmtAmtType getMaxPmtAmt() {
        return maxPmtAmt;
    }

    /**
     * Sets the value of the maxPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxPmtAmtType }
     *     
     */
    public void setMaxPmtAmt(MaxPmtAmtType value) {
        this.maxPmtAmt = value;
    }

    /**
     * Gets the value of the maxEmailPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxEmailPmtAmtType }
     *     
     */
    public MaxEmailPmtAmtType getMaxEmailPmtAmt() {
        return maxEmailPmtAmt;
    }

    /**
     * Sets the value of the maxEmailPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxEmailPmtAmtType }
     *     
     */
    public void setMaxEmailPmtAmt(MaxEmailPmtAmtType value) {
        this.maxEmailPmtAmt = value;
    }

    /**
     * Gets the value of the maxEmailDlyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxEmailDlyAmtType }
     *     
     */
    public MaxEmailDlyAmtType getMaxEmailDlyAmt() {
        return maxEmailDlyAmt;
    }

    /**
     * Sets the value of the maxEmailDlyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxEmailDlyAmtType }
     *     
     */
    public void setMaxEmailDlyAmt(MaxEmailDlyAmtType value) {
        this.maxEmailDlyAmt = value;
    }

    /**
     * Gets the value of the alwSecdPerson property.
     * 
     * @return
     *     possible object is
     *     {@link AlwSecdPersonType }
     *     
     */
    public AlwSecdPersonType getAlwSecdPerson() {
        return alwSecdPerson;
    }

    /**
     * Sets the value of the alwSecdPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlwSecdPersonType }
     *     
     */
    public void setAlwSecdPerson(AlwSecdPersonType value) {
        this.alwSecdPerson = value;
    }

    /**
     * Gets the value of the alwAddPayFromAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AlwAddPayFromAcctType }
     *     
     */
    public AlwAddPayFromAcctType getAlwAddPayFromAcct() {
        return alwAddPayFromAcct;
    }

    /**
     * Sets the value of the alwAddPayFromAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlwAddPayFromAcctType }
     *     
     */
    public void setAlwAddPayFromAcct(AlwAddPayFromAcctType value) {
        this.alwAddPayFromAcct = value;
    }

    /**
     * Gets the value of the bilPayFeturInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link BilPayFeturInfoArrayAType }
     *     
     */
    public BilPayFeturInfoArrayAType getBilPayFeturInfoArray() {
        return bilPayFeturInfoArray;
    }

    /**
     * Sets the value of the bilPayFeturInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPayFeturInfoArrayAType }
     *     
     */
    public void setBilPayFeturInfoArray(BilPayFeturInfoArrayAType value) {
        this.bilPayFeturInfoArray = value;
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
     * Gets the value of the dlyElecRiskLmt property.
     * 
     * @return
     *     possible object is
     *     {@link DlyElecRiskLmtType }
     *     
     */
    public DlyElecRiskLmtType getDlyElecRiskLmt() {
        return dlyElecRiskLmt;
    }

    /**
     * Sets the value of the dlyElecRiskLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlyElecRiskLmtType }
     *     
     */
    public void setDlyElecRiskLmt(DlyElecRiskLmtType value) {
        this.dlyElecRiskLmt = value;
    }

    /**
     * Gets the value of the mthlyElecRiskLmt property.
     * 
     * @return
     *     possible object is
     *     {@link MthlyElecRiskLmtType }
     *     
     */
    public MthlyElecRiskLmtType getMthlyElecRiskLmt() {
        return mthlyElecRiskLmt;
    }

    /**
     * Sets the value of the mthlyElecRiskLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MthlyElecRiskLmtType }
     *     
     */
    public void setMthlyElecRiskLmt(MthlyElecRiskLmtType value) {
        this.mthlyElecRiskLmt = value;
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
     * Gets the value of the taxIdReq property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdReqType }
     *     
     */
    public TaxIdReqType getTaxIdReq() {
        return taxIdReq;
    }

    /**
     * Sets the value of the taxIdReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdReqType }
     *     
     */
    public void setTaxIdReq(TaxIdReqType value) {
        this.taxIdReq = value;
    }

    /**
     * Gets the value of the canSetStartChkNum property.
     * 
     * @return
     *     possible object is
     *     {@link CanSetStartChkNumType }
     *     
     */
    public CanSetStartChkNumType getCanSetStartChkNum() {
        return canSetStartChkNum;
    }

    /**
     * Sets the value of the canSetStartChkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanSetStartChkNumType }
     *     
     */
    public void setCanSetStartChkNum(CanSetStartChkNumType value) {
        this.canSetStartChkNum = value;
    }

    /**
     * Gets the value of the canPayFromSavAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CanPayFromSavAcctType }
     *     
     */
    public CanPayFromSavAcctType getCanPayFromSavAcct() {
        return canPayFromSavAcct;
    }

    /**
     * Sets the value of the canPayFromSavAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanPayFromSavAcctType }
     *     
     */
    public void setCanPayFromSavAcct(CanPayFromSavAcctType value) {
        this.canPayFromSavAcct = value;
    }

    /**
     * Gets the value of the dualSignOnReq property.
     * 
     * @return
     *     possible object is
     *     {@link DualSignOnReqType }
     *     
     */
    public DualSignOnReqType getDualSignOnReq() {
        return dualSignOnReq;
    }

    /**
     * Sets the value of the dualSignOnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DualSignOnReqType }
     *     
     */
    public void setDualSignOnReq(DualSignOnReqType value) {
        this.dualSignOnReq = value;
    }

    /**
     * Gets the value of the subLogInIdRstr property.
     * 
     * @return
     *     possible object is
     *     {@link SubLogInIdRstrCType }
     *     
     */
    public SubLogInIdRstrCType getSubLogInIdRstr() {
        return subLogInIdRstr;
    }

    /**
     * Sets the value of the subLogInIdRstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubLogInIdRstrCType }
     *     
     */
    public void setSubLogInIdRstr(SubLogInIdRstrCType value) {
        this.subLogInIdRstr = value;
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
     * Gets the value of the canAddPayFromOwnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CanAddPayFromOwnInfoType }
     *     
     */
    public CanAddPayFromOwnInfoType getCanAddPayFromOwnInfo() {
        return canAddPayFromOwnInfo;
    }

    /**
     * Sets the value of the canAddPayFromOwnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanAddPayFromOwnInfoType }
     *     
     */
    public void setCanAddPayFromOwnInfo(CanAddPayFromOwnInfoType value) {
        this.canAddPayFromOwnInfo = value;
    }

    /**
     * Gets the value of the consmOwnSubUsrPer property.
     * 
     * @return
     *     possible object is
     *     {@link ConsmOwnSubUsrPerType }
     *     
     */
    public ConsmOwnSubUsrPerType getConsmOwnSubUsrPer() {
        return consmOwnSubUsrPer;
    }

    /**
     * Sets the value of the consmOwnSubUsrPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsmOwnSubUsrPerType }
     *     
     */
    public void setConsmOwnSubUsrPer(ConsmOwnSubUsrPerType value) {
        this.consmOwnSubUsrPer = value;
    }

    /**
     * Gets the value of the alwSubAssocUsrMgmtOptInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link AlwSubAssocUsrMgmtOptInfoArrayAType }
     *     
     */
    public AlwSubAssocUsrMgmtOptInfoArrayAType getAlwSubAssocUsrMgmtOptInfoArray() {
        return alwSubAssocUsrMgmtOptInfoArray;
    }

    /**
     * Sets the value of the alwSubAssocUsrMgmtOptInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlwSubAssocUsrMgmtOptInfoArrayAType }
     *     
     */
    public void setAlwSubAssocUsrMgmtOptInfoArray(AlwSubAssocUsrMgmtOptInfoArrayAType value) {
        this.alwSubAssocUsrMgmtOptInfoArray = value;
    }

    /**
     * Gets the value of the hidSubAssocUsrConsmCustId property.
     * 
     * @return
     *     possible object is
     *     {@link HidSubAssocUsrConsmCustIdType }
     *     
     */
    public HidSubAssocUsrConsmCustIdType getHidSubAssocUsrConsmCustId() {
        return hidSubAssocUsrConsmCustId;
    }

    /**
     * Sets the value of the hidSubAssocUsrConsmCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HidSubAssocUsrConsmCustIdType }
     *     
     */
    public void setHidSubAssocUsrConsmCustId(HidSubAssocUsrConsmCustIdType value) {
        this.hidSubAssocUsrConsmCustId = value;
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
     * Gets the value of the hidSubAssocUsrSubComId property.
     * 
     * @return
     *     possible object is
     *     {@link HidSubAssocUsrSubComIdType }
     *     
     */
    public HidSubAssocUsrSubComIdType getHidSubAssocUsrSubComId() {
        return hidSubAssocUsrSubComId;
    }

    /**
     * Sets the value of the hidSubAssocUsrSubComId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HidSubAssocUsrSubComIdType }
     *     
     */
    public void setHidSubAssocUsrSubComId(HidSubAssocUsrSubComIdType value) {
        this.hidSubAssocUsrSubComId = value;
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
     * Gets the value of the alwSubType property.
     * 
     * @return
     *     possible object is
     *     {@link AlwSubTypeType }
     *     
     */
    public AlwSubTypeType getAlwSubType() {
        return alwSubType;
    }

    /**
     * Sets the value of the alwSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlwSubTypeType }
     *     
     */
    public void setAlwSubType(AlwSubTypeType value) {
        this.alwSubType = value;
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
     * Gets the value of the elecMerAutoPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerAutoPmtAlwType }
     *     
     */
    public ElecMerAutoPmtAlwType getElecMerAutoPmtAlw() {
        return elecMerAutoPmtAlw;
    }

    /**
     * Sets the value of the elecMerAutoPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerAutoPmtAlwType }
     *     
     */
    public void setElecMerAutoPmtAlw(ElecMerAutoPmtAlwType value) {
        this.elecMerAutoPmtAlw = value;
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
     * Gets the value of the maxIndvPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxIndvPmtAmtType }
     *     
     */
    public MaxIndvPmtAmtType getMaxIndvPmtAmt() {
        return maxIndvPmtAmt;
    }

    /**
     * Sets the value of the maxIndvPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxIndvPmtAmtType }
     *     
     */
    public void setMaxIndvPmtAmt(MaxIndvPmtAmtType value) {
        this.maxIndvPmtAmt = value;
    }

    /**
     * Gets the value of the maxIndvDlyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxIndvDlyAmtType }
     *     
     */
    public MaxIndvDlyAmtType getMaxIndvDlyAmt() {
        return maxIndvDlyAmt;
    }

    /**
     * Sets the value of the maxIndvDlyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxIndvDlyAmtType }
     *     
     */
    public void setMaxIndvDlyAmt(MaxIndvDlyAmtType value) {
        this.maxIndvDlyAmt = value;
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
     * Gets the value of the avlCardBINArray property.
     * 
     * @return
     *     possible object is
     *     {@link AvlCardBINArrayAType }
     *     
     */
    public AvlCardBINArrayAType getAvlCardBINArray() {
        return avlCardBINArray;
    }

    /**
     * Sets the value of the avlCardBINArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlCardBINArrayAType }
     *     
     */
    public void setAvlCardBINArray(AvlCardBINArrayAType value) {
        this.avlCardBINArray = value;
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
