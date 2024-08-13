
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for MLLLnBilSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MLLLnBilSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="BilDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}BilDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilAmtDue" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiLvlLndType" type="{http://jackhenry.com/jxchange/TPG/2008}MultiLvlLndType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MLLRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="MasterAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
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
@XmlType(name = "MLLLnBilSrchRec_CType", propOrder = {
    "acctId",
    "bilDueDt",
    "bilAmtDue",
    "multiLvlLndType",
    "mllRmkArray",
    "masterAcctId",
    "personName",
    "custom",
    "ver1",
    "any"
})
public class MLLLnBilSrchRecCType {

    @XmlElementRef(name = "AcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> acctId;
    @XmlElement(name = "BilDueDt")
    protected BilDueDtType bilDueDt;
    @XmlElement(name = "BilAmtDue")
    protected PmtAmtType bilAmtDue;
    @XmlElement(name = "MultiLvlLndType")
    protected MultiLvlLndTypeType multiLvlLndType;
    @XmlElement(name = "MLLRmkArray")
    protected RmkAType mllRmkArray;
    @XmlElement(name = "MasterAcctId")
    protected AccountIdCType masterAcctId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAcctId(JAXBElement<AccountIdCType> value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the bilDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link BilDueDtType }
     *     
     */
    public BilDueDtType getBilDueDt() {
        return bilDueDt;
    }

    /**
     * Sets the value of the bilDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilDueDtType }
     *     
     */
    public void setBilDueDt(BilDueDtType value) {
        this.bilDueDt = value;
    }

    /**
     * Gets the value of the bilAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getBilAmtDue() {
        return bilAmtDue;
    }

    /**
     * Sets the value of the bilAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setBilAmtDue(PmtAmtType value) {
        this.bilAmtDue = value;
    }

    /**
     * Gets the value of the multiLvlLndType property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLvlLndTypeType }
     *     
     */
    public MultiLvlLndTypeType getMultiLvlLndType() {
        return multiLvlLndType;
    }

    /**
     * Sets the value of the multiLvlLndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLvlLndTypeType }
     *     
     */
    public void setMultiLvlLndType(MultiLvlLndTypeType value) {
        this.multiLvlLndType = value;
    }

    /**
     * Gets the value of the mllRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getMLLRmkArray() {
        return mllRmkArray;
    }

    /**
     * Sets the value of the mllRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setMLLRmkArray(RmkAType value) {
        this.mllRmkArray = value;
    }

    /**
     * Gets the value of the masterAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getMasterAcctId() {
        return masterAcctId;
    }

    /**
     * Sets the value of the masterAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setMasterAcctId(AccountIdCType value) {
        this.masterAcctId = value;
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
