
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
 * <p>Java class for Benf_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Benf_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BenfCustId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfCustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfTaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfSpousCode" type="{http://jackhenry.com/jxchange/TPG/2008}BenfSpousCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BenfBirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfDeceasedDt" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDeceasedDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfPctDist" type="{http://jackhenry.com/jxchange/TPG/2008}BenfPctDist_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfGender" type="{http://jackhenry.com/jxchange/TPG/2008}BenfGender_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfAge" type="{http://jackhenry.com/jxchange/TPG/2008}BenfAge_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfIncMail" type="{http://jackhenry.com/jxchange/TPG/2008}BenfIncMail_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfDistAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDistAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfDistDt" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDistDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfFedWith" type="{http://jackhenry.com/jxchange/TPG/2008}BenfFedWith_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfStateWith" type="{http://jackhenry.com/jxchange/TPG/2008}BenfStateWith_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BenfName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="BenfDesigId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDesigId_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Benf_CType", propOrder = {
    "benfCustId",
    "benfTaxId",
    "benfSpousCode",
    "benfBirthDt",
    "benfDeceasedDt",
    "benfPctDist",
    "benfGender",
    "benfAge",
    "benfIncMail",
    "benfDistAmt",
    "benfDistDt",
    "benfFedWith",
    "benfStateWith",
    "benfAddr",
    "ver1",
    "benfName",
    "ver2",
    "benfDesigId",
    "ver3",
    "any"
})
public class BenfCType {

    @XmlElementRef(name = "BenfCustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfCustIdType> benfCustId;
    @XmlElementRef(name = "BenfTaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfTaxIdType> benfTaxId;
    @XmlElementRef(name = "BenfSpousCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfSpousCodeType> benfSpousCode;
    @XmlElementRef(name = "BenfBirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfBirthDtType> benfBirthDt;
    @XmlElementRef(name = "BenfDeceasedDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfDeceasedDtType> benfDeceasedDt;
    @XmlElementRef(name = "BenfPctDist", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfPctDistType> benfPctDist;
    @XmlElementRef(name = "BenfGender", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfGenderType> benfGender;
    @XmlElementRef(name = "BenfAge", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfAgeType> benfAge;
    @XmlElementRef(name = "BenfIncMail", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfIncMailType> benfIncMail;
    @XmlElementRef(name = "BenfDistAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfDistAmtType> benfDistAmt;
    @XmlElementRef(name = "BenfDistDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfDistDtType> benfDistDt;
    @XmlElementRef(name = "BenfFedWith", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfFedWithType> benfFedWith;
    @XmlElementRef(name = "BenfStateWith", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfStateWithType> benfStateWith;
    @XmlElement(name = "BenfAddr")
    protected AddrCType benfAddr;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "BenfName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> benfName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "BenfDesigId")
    protected BenfDesigIdType benfDesigId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the benfCustId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfCustIdType }{@code >}
     *     
     */
    public JAXBElement<BenfCustIdType> getBenfCustId() {
        return benfCustId;
    }

    /**
     * Sets the value of the benfCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfCustIdType }{@code >}
     *     
     */
    public void setBenfCustId(JAXBElement<BenfCustIdType> value) {
        this.benfCustId = value;
    }

    /**
     * Gets the value of the benfTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfTaxIdType }{@code >}
     *     
     */
    public JAXBElement<BenfTaxIdType> getBenfTaxId() {
        return benfTaxId;
    }

    /**
     * Sets the value of the benfTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfTaxIdType }{@code >}
     *     
     */
    public void setBenfTaxId(JAXBElement<BenfTaxIdType> value) {
        this.benfTaxId = value;
    }

    /**
     * Gets the value of the benfSpousCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfSpousCodeType }{@code >}
     *     
     */
    public JAXBElement<BenfSpousCodeType> getBenfSpousCode() {
        return benfSpousCode;
    }

    /**
     * Sets the value of the benfSpousCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfSpousCodeType }{@code >}
     *     
     */
    public void setBenfSpousCode(JAXBElement<BenfSpousCodeType> value) {
        this.benfSpousCode = value;
    }

    /**
     * Gets the value of the benfBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfBirthDtType }{@code >}
     *     
     */
    public JAXBElement<BenfBirthDtType> getBenfBirthDt() {
        return benfBirthDt;
    }

    /**
     * Sets the value of the benfBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfBirthDtType }{@code >}
     *     
     */
    public void setBenfBirthDt(JAXBElement<BenfBirthDtType> value) {
        this.benfBirthDt = value;
    }

    /**
     * Gets the value of the benfDeceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfDeceasedDtType }{@code >}
     *     
     */
    public JAXBElement<BenfDeceasedDtType> getBenfDeceasedDt() {
        return benfDeceasedDt;
    }

    /**
     * Sets the value of the benfDeceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfDeceasedDtType }{@code >}
     *     
     */
    public void setBenfDeceasedDt(JAXBElement<BenfDeceasedDtType> value) {
        this.benfDeceasedDt = value;
    }

    /**
     * Gets the value of the benfPctDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfPctDistType }{@code >}
     *     
     */
    public JAXBElement<BenfPctDistType> getBenfPctDist() {
        return benfPctDist;
    }

    /**
     * Sets the value of the benfPctDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfPctDistType }{@code >}
     *     
     */
    public void setBenfPctDist(JAXBElement<BenfPctDistType> value) {
        this.benfPctDist = value;
    }

    /**
     * Gets the value of the benfGender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfGenderType }{@code >}
     *     
     */
    public JAXBElement<BenfGenderType> getBenfGender() {
        return benfGender;
    }

    /**
     * Sets the value of the benfGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfGenderType }{@code >}
     *     
     */
    public void setBenfGender(JAXBElement<BenfGenderType> value) {
        this.benfGender = value;
    }

    /**
     * Gets the value of the benfAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfAgeType }{@code >}
     *     
     */
    public JAXBElement<BenfAgeType> getBenfAge() {
        return benfAge;
    }

    /**
     * Sets the value of the benfAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfAgeType }{@code >}
     *     
     */
    public void setBenfAge(JAXBElement<BenfAgeType> value) {
        this.benfAge = value;
    }

    /**
     * Gets the value of the benfIncMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfIncMailType }{@code >}
     *     
     */
    public JAXBElement<BenfIncMailType> getBenfIncMail() {
        return benfIncMail;
    }

    /**
     * Sets the value of the benfIncMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfIncMailType }{@code >}
     *     
     */
    public void setBenfIncMail(JAXBElement<BenfIncMailType> value) {
        this.benfIncMail = value;
    }

    /**
     * Gets the value of the benfDistAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfDistAmtType }{@code >}
     *     
     */
    public JAXBElement<BenfDistAmtType> getBenfDistAmt() {
        return benfDistAmt;
    }

    /**
     * Sets the value of the benfDistAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfDistAmtType }{@code >}
     *     
     */
    public void setBenfDistAmt(JAXBElement<BenfDistAmtType> value) {
        this.benfDistAmt = value;
    }

    /**
     * Gets the value of the benfDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfDistDtType }{@code >}
     *     
     */
    public JAXBElement<BenfDistDtType> getBenfDistDt() {
        return benfDistDt;
    }

    /**
     * Sets the value of the benfDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfDistDtType }{@code >}
     *     
     */
    public void setBenfDistDt(JAXBElement<BenfDistDtType> value) {
        this.benfDistDt = value;
    }

    /**
     * Gets the value of the benfFedWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfFedWithType }{@code >}
     *     
     */
    public JAXBElement<BenfFedWithType> getBenfFedWith() {
        return benfFedWith;
    }

    /**
     * Sets the value of the benfFedWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfFedWithType }{@code >}
     *     
     */
    public void setBenfFedWith(JAXBElement<BenfFedWithType> value) {
        this.benfFedWith = value;
    }

    /**
     * Gets the value of the benfStateWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfStateWithType }{@code >}
     *     
     */
    public JAXBElement<BenfStateWithType> getBenfStateWith() {
        return benfStateWith;
    }

    /**
     * Sets the value of the benfStateWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfStateWithType }{@code >}
     *     
     */
    public void setBenfStateWith(JAXBElement<BenfStateWithType> value) {
        this.benfStateWith = value;
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
