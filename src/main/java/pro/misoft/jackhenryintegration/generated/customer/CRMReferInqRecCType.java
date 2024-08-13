
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
 * <p>Java class for CRMReferInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMReferInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMReferInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMReferInfoRec_CType"/&gt;
 *         &lt;element name="ReferId" type="{http://jackhenry.com/jxchange/TPG/2008}ReferId_Type"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}CustRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTypeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ReferStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ModOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ModOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="ModTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}ModTimeDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="x_CRMAuditHistArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_CRMAuditHistArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "CRMReferInqRec_CType", propOrder = {
    "crmReferInfoRec",
    "referId",
    "custId",
    "custRelCode",
    "taxId",
    "brDesc",
    "acctTypeDesc",
    "crmProdDesc",
    "referCrtOffDesc",
    "referOffDesc",
    "referStatDesc",
    "custom",
    "ver1",
    "modOffCode",
    "modOffDesc",
    "modTimeDt",
    "xcrmAuditHistArray",
    "ver2",
    "any"
})
public class CRMReferInqRecCType {

    @XmlElement(name = "CRMReferInfoRec", required = true)
    protected CRMReferInfoRecCType crmReferInfoRec;
    @XmlElement(name = "ReferId", required = true)
    protected ReferIdType referId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CustRelCode")
    protected CustRelCodeType custRelCode;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "AcctTypeDesc")
    protected AcctTypeDescType acctTypeDesc;
    @XmlElement(name = "CRMProdDesc")
    protected ProdDescType crmProdDesc;
    @XmlElement(name = "ReferCrtOffDesc")
    protected CRMOffDescType referCrtOffDesc;
    @XmlElement(name = "ReferOffDesc")
    protected CRMOffDescType referOffDesc;
    @XmlElement(name = "ReferStatDesc")
    protected ReferStatDescType referStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ModOffCode")
    protected CRMOffCodeType modOffCode;
    @XmlElement(name = "ModOffDesc")
    protected CRMOffDescType modOffDesc;
    @XmlElement(name = "ModTimeDt")
    protected ModTimeDtType modTimeDt;
    @XmlElementRef(name = "x_CRMAuditHistArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XCRMAuditHistArrayAType> xcrmAuditHistArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crmReferInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRMReferInfoRecCType }
     *     
     */
    public CRMReferInfoRecCType getCRMReferInfoRec() {
        return crmReferInfoRec;
    }

    /**
     * Sets the value of the crmReferInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMReferInfoRecCType }
     *     
     */
    public void setCRMReferInfoRec(CRMReferInfoRecCType value) {
        this.crmReferInfoRec = value;
    }

    /**
     * Gets the value of the referId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferIdType }
     *     
     */
    public ReferIdType getReferId() {
        return referId;
    }

    /**
     * Sets the value of the referId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferIdType }
     *     
     */
    public void setReferId(ReferIdType value) {
        this.referId = value;
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
     * Gets the value of the custRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustRelCodeType }
     *     
     */
    public CustRelCodeType getCustRelCode() {
        return custRelCode;
    }

    /**
     * Sets the value of the custRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRelCodeType }
     *     
     */
    public void setCustRelCode(CustRelCodeType value) {
        this.custRelCode = value;
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
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the acctTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeDescType }
     *     
     */
    public AcctTypeDescType getAcctTypeDesc() {
        return acctTypeDesc;
    }

    /**
     * Sets the value of the acctTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeDescType }
     *     
     */
    public void setAcctTypeDesc(AcctTypeDescType value) {
        this.acctTypeDesc = value;
    }

    /**
     * Gets the value of the crmProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDescType }
     *     
     */
    public ProdDescType getCRMProdDesc() {
        return crmProdDesc;
    }

    /**
     * Sets the value of the crmProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDescType }
     *     
     */
    public void setCRMProdDesc(ProdDescType value) {
        this.crmProdDesc = value;
    }

    /**
     * Gets the value of the referCrtOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getReferCrtOffDesc() {
        return referCrtOffDesc;
    }

    /**
     * Sets the value of the referCrtOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setReferCrtOffDesc(CRMOffDescType value) {
        this.referCrtOffDesc = value;
    }

    /**
     * Gets the value of the referOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getReferOffDesc() {
        return referOffDesc;
    }

    /**
     * Sets the value of the referOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setReferOffDesc(CRMOffDescType value) {
        this.referOffDesc = value;
    }

    /**
     * Gets the value of the referStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ReferStatDescType }
     *     
     */
    public ReferStatDescType getReferStatDesc() {
        return referStatDesc;
    }

    /**
     * Sets the value of the referStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferStatDescType }
     *     
     */
    public void setReferStatDesc(ReferStatDescType value) {
        this.referStatDesc = value;
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
     * Gets the value of the modOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getModOffCode() {
        return modOffCode;
    }

    /**
     * Sets the value of the modOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setModOffCode(CRMOffCodeType value) {
        this.modOffCode = value;
    }

    /**
     * Gets the value of the modOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getModOffDesc() {
        return modOffDesc;
    }

    /**
     * Sets the value of the modOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setModOffDesc(CRMOffDescType value) {
        this.modOffDesc = value;
    }

    /**
     * Gets the value of the modTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link ModTimeDtType }
     *     
     */
    public ModTimeDtType getModTimeDt() {
        return modTimeDt;
    }

    /**
     * Sets the value of the modTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModTimeDtType }
     *     
     */
    public void setModTimeDt(ModTimeDtType value) {
        this.modTimeDt = value;
    }

    /**
     * Gets the value of the xcrmAuditHistArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XCRMAuditHistArrayAType }{@code >}
     *     
     */
    public JAXBElement<XCRMAuditHistArrayAType> getXCRMAuditHistArray() {
        return xcrmAuditHistArray;
    }

    /**
     * Sets the value of the xcrmAuditHistArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XCRMAuditHistArrayAType }{@code >}
     *     
     */
    public void setXCRMAuditHistArray(JAXBElement<XCRMAuditHistArrayAType> value) {
        this.xcrmAuditHistArray = value;
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
