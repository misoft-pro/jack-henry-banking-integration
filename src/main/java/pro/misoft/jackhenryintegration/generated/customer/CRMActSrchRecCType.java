
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
 * <p>Java class for CRMActSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMActSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMActType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActType_Type"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActCrtOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActOffArray" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ActCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActRecv" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMSvcActSrchCustom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CRMActRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ActCrtTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}ActCrtTimeDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CRMActStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActStatCode_Type" minOccurs="0"/&gt;
 *               &lt;element name="CRMActStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActStatDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CRMActSrchRec_CType", propOrder = {
    "crmActType",
    "accountId",
    "taxId",
    "custId",
    "crmActId",
    "crmActDt",
    "actCrtOffCode",
    "actCrtOffDesc",
    "actOffArray",
    "actCmnt",
    "crmActRecv",
    "crmSvcActSrchCustom",
    "ver1",
    "crmActRmk",
    "ver2",
    "actCrtTimeDt",
    "ver3",
    "crmActStatCode",
    "crmActStatDesc",
    "ver4",
    "any"
})
public class CRMActSrchRecCType {

    @XmlElement(name = "CRMActType", required = true)
    protected CRMActTypeType crmActType;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CRMActId")
    protected CRMActIdType crmActId;
    @XmlElement(name = "CRMActDt")
    protected CRMActDtType crmActDt;
    @XmlElement(name = "ActCrtOffCode")
    protected CRMOffCodeType actCrtOffCode;
    @XmlElement(name = "ActCrtOffDesc")
    protected CRMOffDescType actCrtOffDesc;
    @XmlElement(name = "ActOffArray")
    protected CRMOffArrayAType actOffArray;
    @XmlElement(name = "ActCmnt")
    protected CRMCmntType actCmnt;
    @XmlElement(name = "CRMActRecv")
    protected CRMActRecvType crmActRecv;
    @XmlElement(name = "CRMSvcActSrchCustom")
    protected CustomCType crmSvcActSrchCustom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CRMActRmk")
    protected RmkType crmActRmk;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ActCrtTimeDt")
    protected ActCrtTimeDtType actCrtTimeDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CRMActStatCode")
    protected CRMActStatCodeType crmActStatCode;
    @XmlElement(name = "CRMActStatDesc")
    protected CRMActStatDescType crmActStatDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the crmActType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActTypeType }
     *     
     */
    public CRMActTypeType getCRMActType() {
        return crmActType;
    }

    /**
     * Sets the value of the crmActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActTypeType }
     *     
     */
    public void setCRMActType(CRMActTypeType value) {
        this.crmActType = value;
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
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
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
     * Gets the value of the crmActId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActIdType }
     *     
     */
    public CRMActIdType getCRMActId() {
        return crmActId;
    }

    /**
     * Sets the value of the crmActId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActIdType }
     *     
     */
    public void setCRMActId(CRMActIdType value) {
        this.crmActId = value;
    }

    /**
     * Gets the value of the crmActDt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActDtType }
     *     
     */
    public CRMActDtType getCRMActDt() {
        return crmActDt;
    }

    /**
     * Sets the value of the crmActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActDtType }
     *     
     */
    public void setCRMActDt(CRMActDtType value) {
        this.crmActDt = value;
    }

    /**
     * Gets the value of the actCrtOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getActCrtOffCode() {
        return actCrtOffCode;
    }

    /**
     * Sets the value of the actCrtOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setActCrtOffCode(CRMOffCodeType value) {
        this.actCrtOffCode = value;
    }

    /**
     * Gets the value of the actCrtOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getActCrtOffDesc() {
        return actCrtOffDesc;
    }

    /**
     * Sets the value of the actCrtOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setActCrtOffDesc(CRMOffDescType value) {
        this.actCrtOffDesc = value;
    }

    /**
     * Gets the value of the actOffArray property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public CRMOffArrayAType getActOffArray() {
        return actOffArray;
    }

    /**
     * Sets the value of the actOffArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public void setActOffArray(CRMOffArrayAType value) {
        this.actOffArray = value;
    }

    /**
     * Gets the value of the actCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMCmntType }
     *     
     */
    public CRMCmntType getActCmnt() {
        return actCmnt;
    }

    /**
     * Sets the value of the actCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMCmntType }
     *     
     */
    public void setActCmnt(CRMCmntType value) {
        this.actCmnt = value;
    }

    /**
     * Gets the value of the crmActRecv property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActRecvType }
     *     
     */
    public CRMActRecvType getCRMActRecv() {
        return crmActRecv;
    }

    /**
     * Sets the value of the crmActRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActRecvType }
     *     
     */
    public void setCRMActRecv(CRMActRecvType value) {
        this.crmActRecv = value;
    }

    /**
     * Gets the value of the crmSvcActSrchCustom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCRMSvcActSrchCustom() {
        return crmSvcActSrchCustom;
    }

    /**
     * Sets the value of the crmSvcActSrchCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCRMSvcActSrchCustom(CustomCType value) {
        this.crmSvcActSrchCustom = value;
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
     * Gets the value of the crmActRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getCRMActRmk() {
        return crmActRmk;
    }

    /**
     * Sets the value of the crmActRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setCRMActRmk(RmkType value) {
        this.crmActRmk = value;
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
     * Gets the value of the actCrtTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link ActCrtTimeDtType }
     *     
     */
    public ActCrtTimeDtType getActCrtTimeDt() {
        return actCrtTimeDt;
    }

    /**
     * Sets the value of the actCrtTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActCrtTimeDtType }
     *     
     */
    public void setActCrtTimeDt(ActCrtTimeDtType value) {
        this.actCrtTimeDt = value;
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
     * Gets the value of the crmActStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActStatCodeType }
     *     
     */
    public CRMActStatCodeType getCRMActStatCode() {
        return crmActStatCode;
    }

    /**
     * Sets the value of the crmActStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActStatCodeType }
     *     
     */
    public void setCRMActStatCode(CRMActStatCodeType value) {
        this.crmActStatCode = value;
    }

    /**
     * Gets the value of the crmActStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActStatDescType }
     *     
     */
    public CRMActStatDescType getCRMActStatDesc() {
        return crmActStatDesc;
    }

    /**
     * Sets the value of the crmActStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActStatDescType }
     *     
     */
    public void setCRMActStatDesc(CRMActStatDescType value) {
        this.crmActStatDesc = value;
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
