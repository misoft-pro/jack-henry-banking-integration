
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
 * A package of data related to a scheduled payment
 * 
 * <p>Java class for BilPayPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtPayeeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayPmtPayeeInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PmtRushOptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}RushOptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PmtProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtEstArvDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtEstArvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtPayFromAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PayFromAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PmtCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkMemo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkMemo_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RecurPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayRecurPmtInfo_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="InvoiceInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceInfoArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="BilPaySvcFeeInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}BilPaySvcFeeInfoRec_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="SubCmntToPayee" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="PmtIntentType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtIntentType_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayPmtInfo_CType", propOrder = {
    "pmtPayeeInfo",
    "pmtRushOptInfo",
    "pmtProcDt",
    "pmtEstArvDt",
    "pmtAmt",
    "pmtPayFromAcctInfo",
    "pmtCmnt",
    "pmtChkMemo",
    "custom",
    "ver1",
    "recurPmtInfo",
    "ver2",
    "invoiceInfoArray",
    "ver3",
    "bilPaySvcFeeInfoRec",
    "ver4",
    "subCmntToPayee",
    "ver5",
    "pmtIntentType",
    "ver6",
    "any"
})
public class BilPayPmtInfoCType {

    @XmlElement(name = "PmtPayeeInfo")
    protected BilPayPmtPayeeInfoCType pmtPayeeInfo;
    @XmlElement(name = "PmtRushOptInfo")
    protected RushOptInfoCType pmtRushOptInfo;
    @XmlElement(name = "PmtProcDt")
    protected PmtProcDtType pmtProcDt;
    @XmlElement(name = "PmtEstArvDt")
    protected PmtEstArvDtType pmtEstArvDt;
    @XmlElement(name = "PmtAmt")
    protected PmtAmtType pmtAmt;
    @XmlElement(name = "PmtPayFromAcctInfo")
    protected PayFromAcctInfoCType pmtPayFromAcctInfo;
    @XmlElement(name = "PmtCmnt")
    protected PmtCmntType pmtCmnt;
    @XmlElement(name = "PmtChkMemo")
    protected PmtChkMemoType pmtChkMemo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RecurPmtInfo")
    protected BilPayRecurPmtInfoCType recurPmtInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "InvoiceInfoArray")
    protected InvoiceInfoArrayAType invoiceInfoArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "BilPaySvcFeeInfoRec")
    protected BilPaySvcFeeInfoRecCType bilPaySvcFeeInfoRec;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "SubCmntToPayee")
    protected RmkType subCmntToPayee;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "PmtIntentType")
    protected PmtIntentTypeType pmtIntentType;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BilPayPmtPayeeInfoCType }
     *     
     */
    public BilPayPmtPayeeInfoCType getPmtPayeeInfo() {
        return pmtPayeeInfo;
    }

    /**
     * Sets the value of the pmtPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPayPmtPayeeInfoCType }
     *     
     */
    public void setPmtPayeeInfo(BilPayPmtPayeeInfoCType value) {
        this.pmtPayeeInfo = value;
    }

    /**
     * Gets the value of the pmtRushOptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptInfoCType }
     *     
     */
    public RushOptInfoCType getPmtRushOptInfo() {
        return pmtRushOptInfo;
    }

    /**
     * Sets the value of the pmtRushOptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptInfoCType }
     *     
     */
    public void setPmtRushOptInfo(RushOptInfoCType value) {
        this.pmtRushOptInfo = value;
    }

    /**
     * Gets the value of the pmtProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtProcDtType }
     *     
     */
    public PmtProcDtType getPmtProcDt() {
        return pmtProcDt;
    }

    /**
     * Sets the value of the pmtProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtProcDtType }
     *     
     */
    public void setPmtProcDt(PmtProcDtType value) {
        this.pmtProcDt = value;
    }

    /**
     * Gets the value of the pmtEstArvDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEstArvDtType }
     *     
     */
    public PmtEstArvDtType getPmtEstArvDt() {
        return pmtEstArvDt;
    }

    /**
     * Sets the value of the pmtEstArvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEstArvDtType }
     *     
     */
    public void setPmtEstArvDt(PmtEstArvDtType value) {
        this.pmtEstArvDt = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setPmtAmt(PmtAmtType value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the pmtPayFromAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayFromAcctInfoCType }
     *     
     */
    public PayFromAcctInfoCType getPmtPayFromAcctInfo() {
        return pmtPayFromAcctInfo;
    }

    /**
     * Sets the value of the pmtPayFromAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayFromAcctInfoCType }
     *     
     */
    public void setPmtPayFromAcctInfo(PayFromAcctInfoCType value) {
        this.pmtPayFromAcctInfo = value;
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
     * Gets the value of the pmtChkMemo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkMemoType }
     *     
     */
    public PmtChkMemoType getPmtChkMemo() {
        return pmtChkMemo;
    }

    /**
     * Sets the value of the pmtChkMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkMemoType }
     *     
     */
    public void setPmtChkMemo(PmtChkMemoType value) {
        this.pmtChkMemo = value;
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
     * Gets the value of the recurPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BilPayRecurPmtInfoCType }
     *     
     */
    public BilPayRecurPmtInfoCType getRecurPmtInfo() {
        return recurPmtInfo;
    }

    /**
     * Sets the value of the recurPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPayRecurPmtInfoCType }
     *     
     */
    public void setRecurPmtInfo(BilPayRecurPmtInfoCType value) {
        this.recurPmtInfo = value;
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
     * Gets the value of the invoiceInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceInfoArrayAType }
     *     
     */
    public InvoiceInfoArrayAType getInvoiceInfoArray() {
        return invoiceInfoArray;
    }

    /**
     * Sets the value of the invoiceInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceInfoArrayAType }
     *     
     */
    public void setInvoiceInfoArray(InvoiceInfoArrayAType value) {
        this.invoiceInfoArray = value;
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
     * Gets the value of the bilPaySvcFeeInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link BilPaySvcFeeInfoRecCType }
     *     
     */
    public BilPaySvcFeeInfoRecCType getBilPaySvcFeeInfoRec() {
        return bilPaySvcFeeInfoRec;
    }

    /**
     * Sets the value of the bilPaySvcFeeInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPaySvcFeeInfoRecCType }
     *     
     */
    public void setBilPaySvcFeeInfoRec(BilPaySvcFeeInfoRecCType value) {
        this.bilPaySvcFeeInfoRec = value;
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
     * Gets the value of the subCmntToPayee property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getSubCmntToPayee() {
        return subCmntToPayee;
    }

    /**
     * Sets the value of the subCmntToPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setSubCmntToPayee(RmkType value) {
        this.subCmntToPayee = value;
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
     * Gets the value of the pmtIntentType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIntentTypeType }
     *     
     */
    public PmtIntentTypeType getPmtIntentType() {
        return pmtIntentType;
    }

    /**
     * Sets the value of the pmtIntentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIntentTypeType }
     *     
     */
    public void setPmtIntentType(PmtIntentTypeType value) {
        this.pmtIntentType = value;
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
