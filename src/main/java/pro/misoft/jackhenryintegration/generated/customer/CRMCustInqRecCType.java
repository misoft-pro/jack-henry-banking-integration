
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
 * <p>Java class for CRMCustInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMCustInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMCustInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMCustInfoRec_CType"/&gt;
 *         &lt;element name="CRMClientId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMClientId_CType"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustProfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustProfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HouseHoldProfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldProfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustSatfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustSatfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CRMCustInqRec_CType", propOrder = {
    "crmCustInfoRec",
    "crmClientId",
    "custId",
    "crmRelCode",
    "taxId",
    "crmRelDesc",
    "custProfDesc",
    "houseHoldProfDesc",
    "custSatfDesc",
    "custom",
    "ver1",
    "any"
})
public class CRMCustInqRecCType {

    @XmlElement(name = "CRMCustInfoRec", required = true)
    protected CRMCustInfoRecCType crmCustInfoRec;
    @XmlElement(name = "CRMClientId", required = true)
    protected CRMClientIdCType crmClientId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CRMRelCode")
    protected AcctRelCodeType crmRelCode;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CRMRelDesc")
    protected AcctRelDescType crmRelDesc;
    @XmlElement(name = "CustProfDesc")
    protected CustProfDescType custProfDesc;
    @XmlElement(name = "HouseHoldProfDesc")
    protected HouseHoldProfDescType houseHoldProfDesc;
    @XmlElement(name = "CustSatfDesc")
    protected CustSatfDescType custSatfDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the crmCustInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRMCustInfoRecCType }
     *     
     */
    public CRMCustInfoRecCType getCRMCustInfoRec() {
        return crmCustInfoRec;
    }

    /**
     * Sets the value of the crmCustInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMCustInfoRecCType }
     *     
     */
    public void setCRMCustInfoRec(CRMCustInfoRecCType value) {
        this.crmCustInfoRec = value;
    }

    /**
     * Gets the value of the crmClientId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMClientIdCType }
     *     
     */
    public CRMClientIdCType getCRMClientId() {
        return crmClientId;
    }

    /**
     * Sets the value of the crmClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMClientIdCType }
     *     
     */
    public void setCRMClientId(CRMClientIdCType value) {
        this.crmClientId = value;
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
     * Gets the value of the crmRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelCodeType }
     *     
     */
    public AcctRelCodeType getCRMRelCode() {
        return crmRelCode;
    }

    /**
     * Sets the value of the crmRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelCodeType }
     *     
     */
    public void setCRMRelCode(AcctRelCodeType value) {
        this.crmRelCode = value;
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
     * Gets the value of the crmRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelDescType }
     *     
     */
    public AcctRelDescType getCRMRelDesc() {
        return crmRelDesc;
    }

    /**
     * Sets the value of the crmRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelDescType }
     *     
     */
    public void setCRMRelDesc(AcctRelDescType value) {
        this.crmRelDesc = value;
    }

    /**
     * Gets the value of the custProfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustProfDescType }
     *     
     */
    public CustProfDescType getCustProfDesc() {
        return custProfDesc;
    }

    /**
     * Sets the value of the custProfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustProfDescType }
     *     
     */
    public void setCustProfDesc(CustProfDescType value) {
        this.custProfDesc = value;
    }

    /**
     * Gets the value of the houseHoldProfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link HouseHoldProfDescType }
     *     
     */
    public HouseHoldProfDescType getHouseHoldProfDesc() {
        return houseHoldProfDesc;
    }

    /**
     * Sets the value of the houseHoldProfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseHoldProfDescType }
     *     
     */
    public void setHouseHoldProfDesc(HouseHoldProfDescType value) {
        this.houseHoldProfDesc = value;
    }

    /**
     * Gets the value of the custSatfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustSatfDescType }
     *     
     */
    public CustSatfDescType getCustSatfDesc() {
        return custSatfDesc;
    }

    /**
     * Sets the value of the custSatfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSatfDescType }
     *     
     */
    public void setCustSatfDesc(CustSatfDescType value) {
        this.custSatfDesc = value;
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
