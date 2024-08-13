
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ValidateRsltInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateRsltInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddrChkType" type="{http://jackhenry.com/jxchange/TPG/2008}AddrChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AltAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltAddrArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BirthDtTaxIdChkType" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDtTaxIdChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDtChkType" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDtChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AltBirthDtArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltBirthDtArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="DriverLicChkType" type="{http://jackhenry.com/jxchange/TPG/2008}DriverLicChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AltDriverLicArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltDriverLicArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="MatchRecChkType" type="{http://jackhenry.com/jxchange/TPG/2008}MatchRecChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdChkOkType" type="{http://jackhenry.com/jxchange/TPG/2008}IdChkOkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Deceased" type="{http://jackhenry.com/jxchange/TPG/2008}Deceased_Type" minOccurs="0"/&gt;
 *         &lt;element name="NameChkType" type="{http://jackhenry.com/jxchange/TPG/2008}NameChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AltNameArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltNameArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="OFACHitChkType" type="{http://jackhenry.com/jxchange/TPG/2008}OFACHitChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PhoneChkType" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AltPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}AltPhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdChkType" type="{http://jackhenry.com/jxchange/TPG/2008}TaxIdChkType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdChkText" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="x_TextRptInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_TextRptInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="DocSetCode" type="{http://jackhenry.com/jxchange/TPG/2008}DocSetCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocSetArray" type="{http://jackhenry.com/jxchange/TPG/2008}DocSetArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ValidateRsltInfoRec_CType", propOrder = {
    "addrChkType",
    "altAddrArray",
    "birthDtTaxIdChkType",
    "birthDtChkType",
    "altBirthDtArray",
    "driverLicChkType",
    "altDriverLicArray",
    "matchRecChkType",
    "idChkOkType",
    "deceased",
    "nameChkType",
    "altNameArray",
    "ofacHitChkType",
    "phoneChkType",
    "altPhoneArray",
    "taxIdChkType",
    "taxIdChkText",
    "xTextRptInfoRec",
    "docSetCode",
    "docSetArray",
    "custom",
    "ver1",
    "any"
})
public class ValidateRsltInfoRecCType {

    @XmlElement(name = "AddrChkType")
    protected AddrChkTypeType addrChkType;
    @XmlElement(name = "AltAddrArray")
    protected AltAddrArrayAType altAddrArray;
    @XmlElement(name = "BirthDtTaxIdChkType")
    protected BirthDtTaxIdChkTypeType birthDtTaxIdChkType;
    @XmlElement(name = "BirthDtChkType")
    protected BirthDtChkTypeType birthDtChkType;
    @XmlElement(name = "AltBirthDtArray")
    protected AltBirthDtArrayAType altBirthDtArray;
    @XmlElement(name = "DriverLicChkType")
    protected DriverLicChkTypeType driverLicChkType;
    @XmlElement(name = "AltDriverLicArray")
    protected AltDriverLicArrayAType altDriverLicArray;
    @XmlElement(name = "MatchRecChkType")
    protected MatchRecChkTypeType matchRecChkType;
    @XmlElement(name = "IdChkOkType")
    protected IdChkOkTypeType idChkOkType;
    @XmlElement(name = "Deceased")
    protected DeceasedType deceased;
    @XmlElement(name = "NameChkType")
    protected NameChkTypeType nameChkType;
    @XmlElement(name = "AltNameArray")
    protected AltNameArrayAType altNameArray;
    @XmlElement(name = "OFACHitChkType")
    protected OFACHitChkTypeType ofacHitChkType;
    @XmlElement(name = "PhoneChkType")
    protected PhoneChkTypeType phoneChkType;
    @XmlElement(name = "AltPhoneArray")
    protected AltPhoneArrayAType altPhoneArray;
    @XmlElement(name = "TaxIdChkType")
    protected TaxIdChkTypeType taxIdChkType;
    @XmlElement(name = "TaxIdChkText")
    protected RmkType taxIdChkText;
    @XmlElement(name = "x_TextRptInfoRec")
    protected XTextRptInfoRecCType xTextRptInfoRec;
    @XmlElement(name = "DocSetCode")
    protected DocSetCodeType docSetCode;
    @XmlElement(name = "DocSetArray")
    protected DocSetArrayAType docSetArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the addrChkType property.
     * 
     * @return
     *     possible object is
     *     {@link AddrChkTypeType }
     *     
     */
    public AddrChkTypeType getAddrChkType() {
        return addrChkType;
    }

    /**
     * Sets the value of the addrChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrChkTypeType }
     *     
     */
    public void setAddrChkType(AddrChkTypeType value) {
        this.addrChkType = value;
    }

    /**
     * Gets the value of the altAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltAddrArrayAType }
     *     
     */
    public AltAddrArrayAType getAltAddrArray() {
        return altAddrArray;
    }

    /**
     * Sets the value of the altAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltAddrArrayAType }
     *     
     */
    public void setAltAddrArray(AltAddrArrayAType value) {
        this.altAddrArray = value;
    }

    /**
     * Gets the value of the birthDtTaxIdChkType property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtTaxIdChkTypeType }
     *     
     */
    public BirthDtTaxIdChkTypeType getBirthDtTaxIdChkType() {
        return birthDtTaxIdChkType;
    }

    /**
     * Sets the value of the birthDtTaxIdChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtTaxIdChkTypeType }
     *     
     */
    public void setBirthDtTaxIdChkType(BirthDtTaxIdChkTypeType value) {
        this.birthDtTaxIdChkType = value;
    }

    /**
     * Gets the value of the birthDtChkType property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtChkTypeType }
     *     
     */
    public BirthDtChkTypeType getBirthDtChkType() {
        return birthDtChkType;
    }

    /**
     * Sets the value of the birthDtChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtChkTypeType }
     *     
     */
    public void setBirthDtChkType(BirthDtChkTypeType value) {
        this.birthDtChkType = value;
    }

    /**
     * Gets the value of the altBirthDtArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltBirthDtArrayAType }
     *     
     */
    public AltBirthDtArrayAType getAltBirthDtArray() {
        return altBirthDtArray;
    }

    /**
     * Sets the value of the altBirthDtArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltBirthDtArrayAType }
     *     
     */
    public void setAltBirthDtArray(AltBirthDtArrayAType value) {
        this.altBirthDtArray = value;
    }

    /**
     * Gets the value of the driverLicChkType property.
     * 
     * @return
     *     possible object is
     *     {@link DriverLicChkTypeType }
     *     
     */
    public DriverLicChkTypeType getDriverLicChkType() {
        return driverLicChkType;
    }

    /**
     * Sets the value of the driverLicChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverLicChkTypeType }
     *     
     */
    public void setDriverLicChkType(DriverLicChkTypeType value) {
        this.driverLicChkType = value;
    }

    /**
     * Gets the value of the altDriverLicArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltDriverLicArrayAType }
     *     
     */
    public AltDriverLicArrayAType getAltDriverLicArray() {
        return altDriverLicArray;
    }

    /**
     * Sets the value of the altDriverLicArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltDriverLicArrayAType }
     *     
     */
    public void setAltDriverLicArray(AltDriverLicArrayAType value) {
        this.altDriverLicArray = value;
    }

    /**
     * Gets the value of the matchRecChkType property.
     * 
     * @return
     *     possible object is
     *     {@link MatchRecChkTypeType }
     *     
     */
    public MatchRecChkTypeType getMatchRecChkType() {
        return matchRecChkType;
    }

    /**
     * Sets the value of the matchRecChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchRecChkTypeType }
     *     
     */
    public void setMatchRecChkType(MatchRecChkTypeType value) {
        this.matchRecChkType = value;
    }

    /**
     * Gets the value of the idChkOkType property.
     * 
     * @return
     *     possible object is
     *     {@link IdChkOkTypeType }
     *     
     */
    public IdChkOkTypeType getIdChkOkType() {
        return idChkOkType;
    }

    /**
     * Sets the value of the idChkOkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdChkOkTypeType }
     *     
     */
    public void setIdChkOkType(IdChkOkTypeType value) {
        this.idChkOkType = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link DeceasedType }
     *     
     */
    public DeceasedType getDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeceasedType }
     *     
     */
    public void setDeceased(DeceasedType value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the nameChkType property.
     * 
     * @return
     *     possible object is
     *     {@link NameChkTypeType }
     *     
     */
    public NameChkTypeType getNameChkType() {
        return nameChkType;
    }

    /**
     * Sets the value of the nameChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameChkTypeType }
     *     
     */
    public void setNameChkType(NameChkTypeType value) {
        this.nameChkType = value;
    }

    /**
     * Gets the value of the altNameArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltNameArrayAType }
     *     
     */
    public AltNameArrayAType getAltNameArray() {
        return altNameArray;
    }

    /**
     * Sets the value of the altNameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltNameArrayAType }
     *     
     */
    public void setAltNameArray(AltNameArrayAType value) {
        this.altNameArray = value;
    }

    /**
     * Gets the value of the ofacHitChkType property.
     * 
     * @return
     *     possible object is
     *     {@link OFACHitChkTypeType }
     *     
     */
    public OFACHitChkTypeType getOFACHitChkType() {
        return ofacHitChkType;
    }

    /**
     * Sets the value of the ofacHitChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFACHitChkTypeType }
     *     
     */
    public void setOFACHitChkType(OFACHitChkTypeType value) {
        this.ofacHitChkType = value;
    }

    /**
     * Gets the value of the phoneChkType property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneChkTypeType }
     *     
     */
    public PhoneChkTypeType getPhoneChkType() {
        return phoneChkType;
    }

    /**
     * Sets the value of the phoneChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneChkTypeType }
     *     
     */
    public void setPhoneChkType(PhoneChkTypeType value) {
        this.phoneChkType = value;
    }

    /**
     * Gets the value of the altPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link AltPhoneArrayAType }
     *     
     */
    public AltPhoneArrayAType getAltPhoneArray() {
        return altPhoneArray;
    }

    /**
     * Sets the value of the altPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltPhoneArrayAType }
     *     
     */
    public void setAltPhoneArray(AltPhoneArrayAType value) {
        this.altPhoneArray = value;
    }

    /**
     * Gets the value of the taxIdChkType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdChkTypeType }
     *     
     */
    public TaxIdChkTypeType getTaxIdChkType() {
        return taxIdChkType;
    }

    /**
     * Sets the value of the taxIdChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdChkTypeType }
     *     
     */
    public void setTaxIdChkType(TaxIdChkTypeType value) {
        this.taxIdChkType = value;
    }

    /**
     * Gets the value of the taxIdChkText property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getTaxIdChkText() {
        return taxIdChkText;
    }

    /**
     * Sets the value of the taxIdChkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setTaxIdChkText(RmkType value) {
        this.taxIdChkText = value;
    }

    /**
     * Gets the value of the xTextRptInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link XTextRptInfoRecCType }
     *     
     */
    public XTextRptInfoRecCType getXTextRptInfoRec() {
        return xTextRptInfoRec;
    }

    /**
     * Sets the value of the xTextRptInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTextRptInfoRecCType }
     *     
     */
    public void setXTextRptInfoRec(XTextRptInfoRecCType value) {
        this.xTextRptInfoRec = value;
    }

    /**
     * Gets the value of the docSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocSetCodeType }
     *     
     */
    public DocSetCodeType getDocSetCode() {
        return docSetCode;
    }

    /**
     * Sets the value of the docSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSetCodeType }
     *     
     */
    public void setDocSetCode(DocSetCodeType value) {
        this.docSetCode = value;
    }

    /**
     * Gets the value of the docSetArray property.
     * 
     * @return
     *     possible object is
     *     {@link DocSetArrayAType }
     *     
     */
    public DocSetArrayAType getDocSetArray() {
        return docSetArray;
    }

    /**
     * Sets the value of the docSetArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocSetArrayAType }
     *     
     */
    public void setDocSetArray(DocSetArrayAType value) {
        this.docSetArray = value;
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
