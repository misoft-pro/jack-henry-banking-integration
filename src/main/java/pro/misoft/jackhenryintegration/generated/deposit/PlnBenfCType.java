
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for PlnBenf_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlnBenf_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BenfName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="BenfAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="BenfRel" type="{http://jackhenry.com/jxchange/TPG/2008}BenfRel_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfDesigId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDesigId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfTaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BenfBirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfPctDist" type="{http://jackhenry.com/jxchange/TPG/2008}BenfPctDist_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfDeceasedDt" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDeceasedDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfIncMail" type="{http://jackhenry.com/jxchange/TPG/2008}BenfIncMail_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfGender" type="{http://jackhenry.com/jxchange/TPG/2008}BenfGender_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PlnBenf_CType", propOrder = {
    "benfName",
    "benfAddr",
    "benfRel",
    "benfDesigId",
    "benfTaxId",
    "benfBirthDt",
    "benfPctDist",
    "benfDeceasedDt",
    "benfIncMail",
    "benfGender",
    "ver1",
    "any"
})
public class PlnBenfCType {

    @XmlElementRef(name = "BenfName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> benfName;
    @XmlElement(name = "BenfAddr")
    protected AddrCType benfAddr;
    @XmlElement(name = "BenfRel")
    protected BenfRelType benfRel;
    @XmlElement(name = "BenfDesigId")
    protected BenfDesigIdType benfDesigId;
    @XmlElement(name = "BenfTaxId")
    protected BenfTaxIdType benfTaxId;
    @XmlElement(name = "BenfBirthDt")
    protected BenfBirthDtType benfBirthDt;
    @XmlElement(name = "BenfPctDist")
    protected BenfPctDistType benfPctDist;
    @XmlElement(name = "BenfDeceasedDt")
    protected BenfDeceasedDtType benfDeceasedDt;
    @XmlElement(name = "BenfIncMail")
    protected BenfIncMailType benfIncMail;
    @XmlElement(name = "BenfGender")
    protected BenfGenderType benfGender;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the benfName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public JAXBElement<PersonNameCType> getBenfName() {
        return benfName;
    }

    /**
     * Sets the value of the benfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public void setBenfName(JAXBElement<PersonNameCType> value) {
        this.benfName = value;
    }

    /**
     * Gets the value of the benfAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getBenfAddr() {
        return benfAddr;
    }

    /**
     * Sets the value of the benfAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setBenfAddr(AddrCType value) {
        this.benfAddr = value;
    }

    /**
     * Gets the value of the benfRel property.
     * 
     * @return
     *     possible object is
     *     {@link BenfRelType }
     *     
     */
    public BenfRelType getBenfRel() {
        return benfRel;
    }

    /**
     * Sets the value of the benfRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfRelType }
     *     
     */
    public void setBenfRel(BenfRelType value) {
        this.benfRel = value;
    }

    /**
     * Gets the value of the benfDesigId property.
     * 
     * @return
     *     possible object is
     *     {@link BenfDesigIdType }
     *     
     */
    public BenfDesigIdType getBenfDesigId() {
        return benfDesigId;
    }

    /**
     * Sets the value of the benfDesigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfDesigIdType }
     *     
     */
    public void setBenfDesigId(BenfDesigIdType value) {
        this.benfDesigId = value;
    }

    /**
     * Gets the value of the benfTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link BenfTaxIdType }
     *     
     */
    public BenfTaxIdType getBenfTaxId() {
        return benfTaxId;
    }

    /**
     * Sets the value of the benfTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfTaxIdType }
     *     
     */
    public void setBenfTaxId(BenfTaxIdType value) {
        this.benfTaxId = value;
    }

    /**
     * Gets the value of the benfBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BenfBirthDtType }
     *     
     */
    public BenfBirthDtType getBenfBirthDt() {
        return benfBirthDt;
    }

    /**
     * Sets the value of the benfBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfBirthDtType }
     *     
     */
    public void setBenfBirthDt(BenfBirthDtType value) {
        this.benfBirthDt = value;
    }

    /**
     * Gets the value of the benfPctDist property.
     * 
     * @return
     *     possible object is
     *     {@link BenfPctDistType }
     *     
     */
    public BenfPctDistType getBenfPctDist() {
        return benfPctDist;
    }

    /**
     * Sets the value of the benfPctDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfPctDistType }
     *     
     */
    public void setBenfPctDist(BenfPctDistType value) {
        this.benfPctDist = value;
    }

    /**
     * Gets the value of the benfDeceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link BenfDeceasedDtType }
     *     
     */
    public BenfDeceasedDtType getBenfDeceasedDt() {
        return benfDeceasedDt;
    }

    /**
     * Sets the value of the benfDeceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfDeceasedDtType }
     *     
     */
    public void setBenfDeceasedDt(BenfDeceasedDtType value) {
        this.benfDeceasedDt = value;
    }

    /**
     * Gets the value of the benfIncMail property.
     * 
     * @return
     *     possible object is
     *     {@link BenfIncMailType }
     *     
     */
    public BenfIncMailType getBenfIncMail() {
        return benfIncMail;
    }

    /**
     * Sets the value of the benfIncMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfIncMailType }
     *     
     */
    public void setBenfIncMail(BenfIncMailType value) {
        this.benfIncMail = value;
    }

    /**
     * Gets the value of the benfGender property.
     * 
     * @return
     *     possible object is
     *     {@link BenfGenderType }
     *     
     */
    public BenfGenderType getBenfGender() {
        return benfGender;
    }

    /**
     * Sets the value of the benfGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfGenderType }
     *     
     */
    public void setBenfGender(BenfGenderType value) {
        this.benfGender = value;
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
