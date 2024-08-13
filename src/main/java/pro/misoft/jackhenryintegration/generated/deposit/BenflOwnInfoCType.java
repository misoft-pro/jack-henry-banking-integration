
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for BenflOwnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenflOwnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TINCode" type="{http://jackhenry.com/jxchange/TPG/2008}TINCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenflOwnType" type="{http://jackhenry.com/jxchange/TPG/2008}BenflOwnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntlIndivTitle" type="{http://jackhenry.com/jxchange/TPG/2008}CntlIndivTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenflOwnPct" type="{http://jackhenry.com/jxchange/TPG/2008}PctOwned_Type" minOccurs="0"/&gt;
 *         &lt;element name="PassPortIssCntry" type="{http://jackhenry.com/jxchange/TPG/2008}PassPortIssCntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerifyArray" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BenflOwnInfo_CType", propOrder = {
    "custId",
    "personName",
    "addr",
    "birthDt",
    "taxId",
    "tinCode",
    "benflOwnType",
    "cntlIndivTitle",
    "benflOwnPct",
    "passPortIssCntry",
    "idVerifyArray",
    "dlt",
    "ver1",
    "any"
})
public class BenflOwnInfoCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "BirthDt")
    protected BirthDtType birthDt;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "TINCode")
    protected TINCodeType tinCode;
    @XmlElement(name = "BenflOwnType")
    protected BenflOwnTypeType benflOwnType;
    @XmlElement(name = "CntlIndivTitle")
    protected CntlIndivTitleType cntlIndivTitle;
    @XmlElement(name = "BenflOwnPct")
    protected PctOwnedType benflOwnPct;
    @XmlElement(name = "PassPortIssCntry")
    protected PassPortIssCntryType passPortIssCntry;
    @XmlElement(name = "IdVerifyArray")
    protected IdVerifyArrayAType idVerifyArray;
    @XmlElement(name = "Dlt")
    protected DltType dlt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAddr(AddrCType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtType }
     *     
     */
    public BirthDtType getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtType }
     *     
     */
    public void setBirthDt(BirthDtType value) {
        this.birthDt = value;
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
     * Gets the value of the tinCode property.
     * 
     * @return
     *     possible object is
     *     {@link TINCodeType }
     *     
     */
    public TINCodeType getTINCode() {
        return tinCode;
    }

    /**
     * Sets the value of the tinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINCodeType }
     *     
     */
    public void setTINCode(TINCodeType value) {
        this.tinCode = value;
    }

    /**
     * Gets the value of the benflOwnType property.
     * 
     * @return
     *     possible object is
     *     {@link BenflOwnTypeType }
     *     
     */
    public BenflOwnTypeType getBenflOwnType() {
        return benflOwnType;
    }

    /**
     * Sets the value of the benflOwnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenflOwnTypeType }
     *     
     */
    public void setBenflOwnType(BenflOwnTypeType value) {
        this.benflOwnType = value;
    }

    /**
     * Gets the value of the cntlIndivTitle property.
     * 
     * @return
     *     possible object is
     *     {@link CntlIndivTitleType }
     *     
     */
    public CntlIndivTitleType getCntlIndivTitle() {
        return cntlIndivTitle;
    }

    /**
     * Sets the value of the cntlIndivTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntlIndivTitleType }
     *     
     */
    public void setCntlIndivTitle(CntlIndivTitleType value) {
        this.cntlIndivTitle = value;
    }

    /**
     * Gets the value of the benflOwnPct property.
     * 
     * @return
     *     possible object is
     *     {@link PctOwnedType }
     *     
     */
    public PctOwnedType getBenflOwnPct() {
        return benflOwnPct;
    }

    /**
     * Sets the value of the benflOwnPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PctOwnedType }
     *     
     */
    public void setBenflOwnPct(PctOwnedType value) {
        this.benflOwnPct = value;
    }

    /**
     * Gets the value of the passPortIssCntry property.
     * 
     * @return
     *     possible object is
     *     {@link PassPortIssCntryType }
     *     
     */
    public PassPortIssCntryType getPassPortIssCntry() {
        return passPortIssCntry;
    }

    /**
     * Sets the value of the passPortIssCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassPortIssCntryType }
     *     
     */
    public void setPassPortIssCntry(PassPortIssCntryType value) {
        this.passPortIssCntry = value;
    }

    /**
     * Gets the value of the idVerifyArray property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyArrayAType }
     *     
     */
    public IdVerifyArrayAType getIdVerifyArray() {
        return idVerifyArray;
    }

    /**
     * Sets the value of the idVerifyArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyArrayAType }
     *     
     */
    public void setIdVerifyArray(IdVerifyArrayAType value) {
        this.idVerifyArray = value;
    }

    /**
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link DltType }
     *     
     */
    public DltType getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DltType }
     *     
     */
    public void setDlt(DltType value) {
        this.dlt = value;
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
