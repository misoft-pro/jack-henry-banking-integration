
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
 * <p>Java class for LnAppCoBorwInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAppCoBorwInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoBorwName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwMartialStatType" type="{http://jackhenry.com/jxchange/TPG/2008}MartialStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwEthnicType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwRaceArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwGender" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwGender_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwAge" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwAge_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CoBorwEthnicVal" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicVal_Type" minOccurs="0"/&gt;
 *           &lt;element name="CoBorwEthnicColType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicColType_Type" minOccurs="0"/&gt;
 *           &lt;element name="CoBorwGenderColType" type="{http://jackhenry.com/jxchange/TPG/2008}GenderColType_Type" minOccurs="0"/&gt;
 *           &lt;element name="CoBorwCrScoreArray" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwCrScoreArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="CoBorwEthnicArray" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwEthnicArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LnAppCoBorwInfo_CType", propOrder = {
    "coBorwName",
    "coBorwTaxId",
    "coBorwPhoneArray",
    "coBorwMartialStatType",
    "coBorwEthnicType",
    "coBorwRaceArray",
    "coBorwGender",
    "coBorwAge",
    "ver1",
    "coBorwEthnicVal",
    "coBorwEthnicColType",
    "coBorwGenderColType",
    "coBorwCrScoreArray",
    "coBorwEthnicArray",
    "ver2",
    "any"
})
public class LnAppCoBorwInfoCType {

    @XmlElement(name = "CoBorwName")
    protected PersonNameCType coBorwName;
    @XmlElementRef(name = "CoBorwTaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> coBorwTaxId;
    @XmlElement(name = "CoBorwPhoneArray")
    protected PhoneArrayAType coBorwPhoneArray;
    @XmlElementRef(name = "CoBorwMartialStatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MartialStatTypeType> coBorwMartialStatType;
    @XmlElementRef(name = "CoBorwEthnicType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EthnicTypeType> coBorwEthnicType;
    @XmlElement(name = "CoBorwRaceArray")
    protected BorwRaceArrayAType coBorwRaceArray;
    @XmlElementRef(name = "CoBorwGender", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CoBorwGenderType> coBorwGender;
    @XmlElementRef(name = "CoBorwAge", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CoBorwAgeType> coBorwAge;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CoBorwEthnicVal")
    protected EthnicValType coBorwEthnicVal;
    @XmlElement(name = "CoBorwEthnicColType")
    protected EthnicColTypeType coBorwEthnicColType;
    @XmlElement(name = "CoBorwGenderColType")
    protected GenderColTypeType coBorwGenderColType;
    @XmlElement(name = "CoBorwCrScoreArray")
    protected CoBorwCrScoreArrayAType coBorwCrScoreArray;
    @XmlElement(name = "CoBorwEthnicArray")
    protected CoBorwEthnicArrayAType coBorwEthnicArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the coBorwName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCoBorwName() {
        return coBorwName;
    }

    /**
     * Sets the value of the coBorwName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCoBorwName(PersonNameCType value) {
        this.coBorwName = value;
    }

    /**
     * Gets the value of the coBorwTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public JAXBElement<TaxIdType> getCoBorwTaxId() {
        return coBorwTaxId;
    }

    /**
     * Sets the value of the coBorwTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public void setCoBorwTaxId(JAXBElement<TaxIdType> value) {
        this.coBorwTaxId = value;
    }

    /**
     * Gets the value of the coBorwPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getCoBorwPhoneArray() {
        return coBorwPhoneArray;
    }

    /**
     * Sets the value of the coBorwPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setCoBorwPhoneArray(PhoneArrayAType value) {
        this.coBorwPhoneArray = value;
    }

    /**
     * Gets the value of the coBorwMartialStatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MartialStatTypeType }{@code >}
     *     
     */
    public JAXBElement<MartialStatTypeType> getCoBorwMartialStatType() {
        return coBorwMartialStatType;
    }

    /**
     * Sets the value of the coBorwMartialStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MartialStatTypeType }{@code >}
     *     
     */
    public void setCoBorwMartialStatType(JAXBElement<MartialStatTypeType> value) {
        this.coBorwMartialStatType = value;
    }

    /**
     * Gets the value of the coBorwEthnicType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EthnicTypeType }{@code >}
     *     
     */
    public JAXBElement<EthnicTypeType> getCoBorwEthnicType() {
        return coBorwEthnicType;
    }

    /**
     * Sets the value of the coBorwEthnicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EthnicTypeType }{@code >}
     *     
     */
    public void setCoBorwEthnicType(JAXBElement<EthnicTypeType> value) {
        this.coBorwEthnicType = value;
    }

    /**
     * Gets the value of the coBorwRaceArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwRaceArrayAType }
     *     
     */
    public BorwRaceArrayAType getCoBorwRaceArray() {
        return coBorwRaceArray;
    }

    /**
     * Sets the value of the coBorwRaceArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwRaceArrayAType }
     *     
     */
    public void setCoBorwRaceArray(BorwRaceArrayAType value) {
        this.coBorwRaceArray = value;
    }

    /**
     * Gets the value of the coBorwGender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoBorwGenderType }{@code >}
     *     
     */
    public JAXBElement<CoBorwGenderType> getCoBorwGender() {
        return coBorwGender;
    }

    /**
     * Sets the value of the coBorwGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoBorwGenderType }{@code >}
     *     
     */
    public void setCoBorwGender(JAXBElement<CoBorwGenderType> value) {
        this.coBorwGender = value;
    }

    /**
     * Gets the value of the coBorwAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoBorwAgeType }{@code >}
     *     
     */
    public JAXBElement<CoBorwAgeType> getCoBorwAge() {
        return coBorwAge;
    }

    /**
     * Sets the value of the coBorwAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoBorwAgeType }{@code >}
     *     
     */
    public void setCoBorwAge(JAXBElement<CoBorwAgeType> value) {
        this.coBorwAge = value;
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
     * Gets the value of the coBorwEthnicVal property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicValType }
     *     
     */
    public EthnicValType getCoBorwEthnicVal() {
        return coBorwEthnicVal;
    }

    /**
     * Sets the value of the coBorwEthnicVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicValType }
     *     
     */
    public void setCoBorwEthnicVal(EthnicValType value) {
        this.coBorwEthnicVal = value;
    }

    /**
     * Gets the value of the coBorwEthnicColType property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicColTypeType }
     *     
     */
    public EthnicColTypeType getCoBorwEthnicColType() {
        return coBorwEthnicColType;
    }

    /**
     * Sets the value of the coBorwEthnicColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicColTypeType }
     *     
     */
    public void setCoBorwEthnicColType(EthnicColTypeType value) {
        this.coBorwEthnicColType = value;
    }

    /**
     * Gets the value of the coBorwGenderColType property.
     * 
     * @return
     *     possible object is
     *     {@link GenderColTypeType }
     *     
     */
    public GenderColTypeType getCoBorwGenderColType() {
        return coBorwGenderColType;
    }

    /**
     * Sets the value of the coBorwGenderColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderColTypeType }
     *     
     */
    public void setCoBorwGenderColType(GenderColTypeType value) {
        this.coBorwGenderColType = value;
    }

    /**
     * Gets the value of the coBorwCrScoreArray property.
     * 
     * @return
     *     possible object is
     *     {@link CoBorwCrScoreArrayAType }
     *     
     */
    public CoBorwCrScoreArrayAType getCoBorwCrScoreArray() {
        return coBorwCrScoreArray;
    }

    /**
     * Sets the value of the coBorwCrScoreArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoBorwCrScoreArrayAType }
     *     
     */
    public void setCoBorwCrScoreArray(CoBorwCrScoreArrayAType value) {
        this.coBorwCrScoreArray = value;
    }

    /**
     * Gets the value of the coBorwEthnicArray property.
     * 
     * @return
     *     possible object is
     *     {@link CoBorwEthnicArrayAType }
     *     
     */
    public CoBorwEthnicArrayAType getCoBorwEthnicArray() {
        return coBorwEthnicArray;
    }

    /**
     * Sets the value of the coBorwEthnicArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoBorwEthnicArrayAType }
     *     
     */
    public void setCoBorwEthnicArray(CoBorwEthnicArrayAType value) {
        this.coBorwEthnicArray = value;
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
