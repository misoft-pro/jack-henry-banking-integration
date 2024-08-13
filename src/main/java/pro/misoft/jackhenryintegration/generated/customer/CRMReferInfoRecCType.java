
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CRMReferInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMReferInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferDt" type="{http://jackhenry.com/jxchange/TPG/2008}ReferDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferCrtOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferRecv" type="{http://jackhenry.com/jxchange/TPG/2008}ReferRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}ReferStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ReferDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}ReferDueDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ReferBonusDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}ReferBonusDueDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRMProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CustProdOwn" type="{http://jackhenry.com/jxchange/TPG/2008}CustProdOwn_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRMEventId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventId_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRMOffArray" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PotSaleId" type="{http://jackhenry.com/jxchange/TPG/2008}PotSaleId_Type" minOccurs="0"/&gt;
 *             &lt;element name="EscltDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscltDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="SalesPrivType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMPrivType_Type" minOccurs="0"/&gt;
 *             &lt;element name="SalesOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="SalesStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}EventStatCode_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="WorkflowProcStat" type="{http://jackhenry.com/jxchange/TPG/2008}WorkflowProcStat_Type" minOccurs="0"/&gt;
 *               &lt;element name="ReferTime" type="{http://jackhenry.com/jxchange/TPG/2008}ReferTime_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMReferInfoRec_CType", propOrder = {
    "referDt",
    "referCrtOffCode",
    "referCmnt",
    "referRecv",
    "referOffCode",
    "referStatCode",
    "custom",
    "ver1",
    "brCode",
    "referDueDt",
    "referBonusDueDt",
    "acctId",
    "acctType",
    "crmProdCode",
    "custProdOwn",
    "crmEventId",
    "crmOffArray",
    "userDefInfoArray",
    "ver2",
    "potSaleId",
    "escltDt",
    "salesPrivType",
    "salesOffCode",
    "salesStatCode",
    "ver3",
    "workflowProcStat",
    "referTime",
    "ver4",
    "any"
})
public class CRMReferInfoRecCType {

    @XmlElement(name = "ReferDt")
    protected ReferDtType referDt;
    @XmlElement(name = "ReferCrtOffCode")
    protected CRMOffCodeType referCrtOffCode;
    @XmlElement(name = "ReferCmnt")
    protected CRMCmntType referCmnt;
    @XmlElement(name = "ReferRecv")
    protected ReferRecvType referRecv;
    @XmlElement(name = "ReferOffCode")
    protected CRMOffCodeType referOffCode;
    @XmlElement(name = "ReferStatCode")
    protected ReferStatCodeType referStatCode;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "ReferDueDt")
    protected ReferDueDtType referDueDt;
    @XmlElement(name = "ReferBonusDueDt")
    protected ReferBonusDueDtType referBonusDueDt;
    @XmlElement(name = "AcctId")
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "CRMProdCode")
    protected ProdCodeType crmProdCode;
    @XmlElement(name = "CustProdOwn")
    protected CustProdOwnType custProdOwn;
    @XmlElement(name = "CRMEventId")
    protected CRMEventIdType crmEventId;
    @XmlElement(name = "CRMOffArray")
    protected CRMOffArrayAType crmOffArray;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PotSaleId")
    protected PotSaleIdType potSaleId;
    @XmlElement(name = "EscltDt")
    protected EscltDtType escltDt;
    @XmlElement(name = "SalesPrivType")
    protected CRMPrivTypeType salesPrivType;
    @XmlElement(name = "SalesOffCode")
    protected CRMOffCodeType salesOffCode;
    @XmlElement(name = "SalesStatCode")
    protected EventStatCodeType salesStatCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "WorkflowProcStat")
    protected WorkflowProcStatType workflowProcStat;
    @XmlElement(name = "ReferTime")
    protected ReferTimeType referTime;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the referDt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferDtType }
     *     
     */
    public ReferDtType getReferDt() {
        return referDt;
    }

    /**
     * Sets the value of the referDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferDtType }
     *     
     */
    public void setReferDt(ReferDtType value) {
        this.referDt = value;
    }

    /**
     * Gets the value of the referCrtOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getReferCrtOffCode() {
        return referCrtOffCode;
    }

    /**
     * Sets the value of the referCrtOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setReferCrtOffCode(CRMOffCodeType value) {
        this.referCrtOffCode = value;
    }

    /**
     * Gets the value of the referCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMCmntType }
     *     
     */
    public CRMCmntType getReferCmnt() {
        return referCmnt;
    }

    /**
     * Sets the value of the referCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMCmntType }
     *     
     */
    public void setReferCmnt(CRMCmntType value) {
        this.referCmnt = value;
    }

    /**
     * Gets the value of the referRecv property.
     * 
     * @return
     *     possible object is
     *     {@link ReferRecvType }
     *     
     */
    public ReferRecvType getReferRecv() {
        return referRecv;
    }

    /**
     * Sets the value of the referRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferRecvType }
     *     
     */
    public void setReferRecv(ReferRecvType value) {
        this.referRecv = value;
    }

    /**
     * Gets the value of the referOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getReferOffCode() {
        return referOffCode;
    }

    /**
     * Sets the value of the referOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setReferOffCode(CRMOffCodeType value) {
        this.referOffCode = value;
    }

    /**
     * Gets the value of the referStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferStatCodeType }
     *     
     */
    public ReferStatCodeType getReferStatCode() {
        return referStatCode;
    }

    /**
     * Sets the value of the referStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferStatCodeType }
     *     
     */
    public void setReferStatCode(ReferStatCodeType value) {
        this.referStatCode = value;
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
     * Gets the value of the referDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferDueDtType }
     *     
     */
    public ReferDueDtType getReferDueDt() {
        return referDueDt;
    }

    /**
     * Sets the value of the referDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferDueDtType }
     *     
     */
    public void setReferDueDt(ReferDueDtType value) {
        this.referDueDt = value;
    }

    /**
     * Gets the value of the referBonusDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferBonusDueDtType }
     *     
     */
    public ReferBonusDueDtType getReferBonusDueDt() {
        return referBonusDueDt;
    }

    /**
     * Sets the value of the referBonusDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferBonusDueDtType }
     *     
     */
    public void setReferBonusDueDt(ReferBonusDueDtType value) {
        this.referBonusDueDt = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the crmProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getCRMProdCode() {
        return crmProdCode;
    }

    /**
     * Sets the value of the crmProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setCRMProdCode(ProdCodeType value) {
        this.crmProdCode = value;
    }

    /**
     * Gets the value of the custProdOwn property.
     * 
     * @return
     *     possible object is
     *     {@link CustProdOwnType }
     *     
     */
    public CustProdOwnType getCustProdOwn() {
        return custProdOwn;
    }

    /**
     * Sets the value of the custProdOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustProdOwnType }
     *     
     */
    public void setCustProdOwn(CustProdOwnType value) {
        this.custProdOwn = value;
    }

    /**
     * Gets the value of the crmEventId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventIdType }
     *     
     */
    public CRMEventIdType getCRMEventId() {
        return crmEventId;
    }

    /**
     * Sets the value of the crmEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventIdType }
     *     
     */
    public void setCRMEventId(CRMEventIdType value) {
        this.crmEventId = value;
    }

    /**
     * Gets the value of the crmOffArray property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public CRMOffArrayAType getCRMOffArray() {
        return crmOffArray;
    }

    /**
     * Sets the value of the crmOffArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public void setCRMOffArray(CRMOffArrayAType value) {
        this.crmOffArray = value;
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
     * Gets the value of the potSaleId property.
     * 
     * @return
     *     possible object is
     *     {@link PotSaleIdType }
     *     
     */
    public PotSaleIdType getPotSaleId() {
        return potSaleId;
    }

    /**
     * Sets the value of the potSaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotSaleIdType }
     *     
     */
    public void setPotSaleId(PotSaleIdType value) {
        this.potSaleId = value;
    }

    /**
     * Gets the value of the escltDt property.
     * 
     * @return
     *     possible object is
     *     {@link EscltDtType }
     *     
     */
    public EscltDtType getEscltDt() {
        return escltDt;
    }

    /**
     * Sets the value of the escltDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscltDtType }
     *     
     */
    public void setEscltDt(EscltDtType value) {
        this.escltDt = value;
    }

    /**
     * Gets the value of the salesPrivType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMPrivTypeType }
     *     
     */
    public CRMPrivTypeType getSalesPrivType() {
        return salesPrivType;
    }

    /**
     * Sets the value of the salesPrivType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMPrivTypeType }
     *     
     */
    public void setSalesPrivType(CRMPrivTypeType value) {
        this.salesPrivType = value;
    }

    /**
     * Gets the value of the salesOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getSalesOffCode() {
        return salesOffCode;
    }

    /**
     * Sets the value of the salesOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setSalesOffCode(CRMOffCodeType value) {
        this.salesOffCode = value;
    }

    /**
     * Gets the value of the salesStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatCodeType }
     *     
     */
    public EventStatCodeType getSalesStatCode() {
        return salesStatCode;
    }

    /**
     * Sets the value of the salesStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatCodeType }
     *     
     */
    public void setSalesStatCode(EventStatCodeType value) {
        this.salesStatCode = value;
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
     * Gets the value of the workflowProcStat property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowProcStatType }
     *     
     */
    public WorkflowProcStatType getWorkflowProcStat() {
        return workflowProcStat;
    }

    /**
     * Sets the value of the workflowProcStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowProcStatType }
     *     
     */
    public void setWorkflowProcStat(WorkflowProcStatType value) {
        this.workflowProcStat = value;
    }

    /**
     * Gets the value of the referTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReferTimeType }
     *     
     */
    public ReferTimeType getReferTime() {
        return referTime;
    }

    /**
     * Sets the value of the referTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferTimeType }
     *     
     */
    public void setReferTime(ReferTimeType value) {
        this.referTime = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
