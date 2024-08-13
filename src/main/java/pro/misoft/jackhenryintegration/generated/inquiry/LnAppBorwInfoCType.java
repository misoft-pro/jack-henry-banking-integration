
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
 * <p>Java class for LnAppBorwInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAppBorwInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BorwName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BorwMartialStatType" type="{http://jackhenry.com/jxchange/TPG/2008}MartialStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwEthnicType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwRaceArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BorwGender" type="{http://jackhenry.com/jxchange/TPG/2008}BorwGender_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAge" type="{http://jackhenry.com/jxchange/TPG/2008}BorwAge_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BorwIncmAmt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BorwEthnicVal" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicVal_Type" minOccurs="0"/&gt;
 *           &lt;element name="BorwEthnicColType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicColType_Type" minOccurs="0"/&gt;
 *           &lt;element name="BorwGenderColType" type="{http://jackhenry.com/jxchange/TPG/2008}GenderColType_Type" minOccurs="0"/&gt;
 *           &lt;element name="BorwCrScoreArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwCrScoreArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="BorwEthnicArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwEthnicArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LnAppBorwInfo_CType", propOrder = {
    "borwName",
    "borwTaxId",
    "borwPhoneArray",
    "borwMartialStatType",
    "borwEthnicType",
    "borwRaceArray",
    "borwGender",
    "borwAge",
    "borwIncmAmt",
    "ver1",
    "borwEthnicVal",
    "borwEthnicColType",
    "borwGenderColType",
    "borwCrScoreArray",
    "borwEthnicArray",
    "ver2",
    "any"
})
public class LnAppBorwInfoCType {

    @XmlElement(name = "BorwName")
    protected PersonNameCType borwName;
    @XmlElementRef(name = "BorwTaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> borwTaxId;
    @XmlElement(name = "BorwPhoneArray")
    protected PhoneArrayAType borwPhoneArray;
    @XmlElementRef(name = "BorwMartialStatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MartialStatTypeType> borwMartialStatType;
    @XmlElementRef(name = "BorwEthnicType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EthnicTypeType> borwEthnicType;
    @XmlElement(name = "BorwRaceArray")
    protected BorwRaceArrayAType borwRaceArray;
    @XmlElementRef(name = "BorwGender", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwGenderType> borwGender;
    @XmlElementRef(name = "BorwAge", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwAgeType> borwAge;
    @XmlElementRef(name = "BorwIncmAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwIncmAmtType> borwIncmAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BorwEthnicVal")
    protected EthnicValType borwEthnicVal;
    @XmlElement(name = "BorwEthnicColType")
    protected EthnicColTypeType borwEthnicColType;
    @XmlElement(name = "BorwGenderColType")
    protected GenderColTypeType borwGenderColType;
    @XmlElement(name = "BorwCrScoreArray")
    protected BorwCrScoreArrayAType borwCrScoreArray;
    @XmlElement(name = "BorwEthnicArray")
    protected BorwEthnicArrayAType borwEthnicArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the borwName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getBorwName() {
        return borwName;
    }

    /**
     * Sets the value of the borwName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setBorwName(PersonNameCType value) {
        this.borwName = value;
    }

    /**
     * Gets the value of the borwTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public JAXBElement<TaxIdType> getBorwTaxId() {
        return borwTaxId;
    }

    /**
     * Sets the value of the borwTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public void setBorwTaxId(JAXBElement<TaxIdType> value) {
        this.borwTaxId = value;
    }

    /**
     * Gets the value of the borwPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getBorwPhoneArray() {
        return borwPhoneArray;
    }

    /**
     * Sets the value of the borwPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setBorwPhoneArray(PhoneArrayAType value) {
        this.borwPhoneArray = value;
    }

    /**
     * Gets the value of the borwMartialStatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MartialStatTypeType }{@code >}
     *     
     */
    public JAXBElement<MartialStatTypeType> getBorwMartialStatType() {
        return borwMartialStatType;
    }

    /**
     * Sets the value of the borwMartialStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MartialStatTypeType }{@code >}
     *     
     */
    public void setBorwMartialStatType(JAXBElement<MartialStatTypeType> value) {
        this.borwMartialStatType = value;
    }

    /**
     * Gets the value of the borwEthnicType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EthnicTypeType }{@code >}
     *     
     */
    public JAXBElement<EthnicTypeType> getBorwEthnicType() {
        return borwEthnicType;
    }

    /**
     * Sets the value of the borwEthnicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EthnicTypeType }{@code >}
     *     
     */
    public void setBorwEthnicType(JAXBElement<EthnicTypeType> value) {
        this.borwEthnicType = value;
    }

    /**
     * Gets the value of the borwRaceArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwRaceArrayAType }
     *     
     */
    public BorwRaceArrayAType getBorwRaceArray() {
        return borwRaceArray;
    }

    /**
     * Sets the value of the borwRaceArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwRaceArrayAType }
     *     
     */
    public void setBorwRaceArray(BorwRaceArrayAType value) {
        this.borwRaceArray = value;
    }

    /**
     * Gets the value of the borwGender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwGenderType }{@code >}
     *     
     */
    public JAXBElement<BorwGenderType> getBorwGender() {
        return borwGender;
    }

    /**
     * Sets the value of the borwGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwGenderType }{@code >}
     *     
     */
    public void setBorwGender(JAXBElement<BorwGenderType> value) {
        this.borwGender = value;
    }

    /**
     * Gets the value of the borwAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwAgeType }{@code >}
     *     
     */
    public JAXBElement<BorwAgeType> getBorwAge() {
        return borwAge;
    }

    /**
     * Sets the value of the borwAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwAgeType }{@code >}
     *     
     */
    public void setBorwAge(JAXBElement<BorwAgeType> value) {
        this.borwAge = value;
    }

    /**
     * Gets the value of the borwIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwIncmAmtType }{@code >}
     *     
     */
    public JAXBElement<BorwIncmAmtType> getBorwIncmAmt() {
        return borwIncmAmt;
    }

    /**
     * Sets the value of the borwIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwIncmAmtType }{@code >}
     *     
     */
    public void setBorwIncmAmt(JAXBElement<BorwIncmAmtType> value) {
        this.borwIncmAmt = value;
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
     * Gets the value of the borwEthnicVal property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicValType }
     *     
     */
    public EthnicValType getBorwEthnicVal() {
        return borwEthnicVal;
    }

    /**
     * Sets the value of the borwEthnicVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicValType }
     *     
     */
    public void setBorwEthnicVal(EthnicValType value) {
        this.borwEthnicVal = value;
    }

    /**
     * Gets the value of the borwEthnicColType property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicColTypeType }
     *     
     */
    public EthnicColTypeType getBorwEthnicColType() {
        return borwEthnicColType;
    }

    /**
     * Sets the value of the borwEthnicColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicColTypeType }
     *     
     */
    public void setBorwEthnicColType(EthnicColTypeType value) {
        this.borwEthnicColType = value;
    }

    /**
     * Gets the value of the borwGenderColType property.
     * 
     * @return
     *     possible object is
     *     {@link GenderColTypeType }
     *     
     */
    public GenderColTypeType getBorwGenderColType() {
        return borwGenderColType;
    }

    /**
     * Sets the value of the borwGenderColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderColTypeType }
     *     
     */
    public void setBorwGenderColType(GenderColTypeType value) {
        this.borwGenderColType = value;
    }

    /**
     * Gets the value of the borwCrScoreArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwCrScoreArrayAType }
     *     
     */
    public BorwCrScoreArrayAType getBorwCrScoreArray() {
        return borwCrScoreArray;
    }

    /**
     * Sets the value of the borwCrScoreArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwCrScoreArrayAType }
     *     
     */
    public void setBorwCrScoreArray(BorwCrScoreArrayAType value) {
        this.borwCrScoreArray = value;
    }

    /**
     * Gets the value of the borwEthnicArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwEthnicArrayAType }
     *     
     */
    public BorwEthnicArrayAType getBorwEthnicArray() {
        return borwEthnicArray;
    }

    /**
     * Sets the value of the borwEthnicArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwEthnicArrayAType }
     *     
     */
    public void setBorwEthnicArray(BorwEthnicArrayAType value) {
        this.borwEthnicArray = value;
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
