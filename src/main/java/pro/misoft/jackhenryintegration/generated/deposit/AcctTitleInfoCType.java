
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
 * <p>Java class for AcctTitleInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTitleInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctTitle" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AddlName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;element name="AddlTIN" type="{http://jackhenry.com/jxchange/TPG/2008}TINInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="AddlBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="AddlPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AddlNameStat" type="{http://jackhenry.com/jxchange/TPG/2008}AddlNameStat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctTitleInfo_CType", propOrder = {
    "acctTitle",
    "ver1",
    "addlName",
    "addlTIN",
    "addlBirthDt",
    "addlPhoneArray",
    "ver2",
    "addlNameStat",
    "ver3",
    "any"
})
public class AcctTitleInfoCType {

    @XmlElementRef(name = "AcctTitle", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctTitleType> acctTitle;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AddlName")
    protected PersonNameCType addlName;
    @XmlElement(name = "AddlTIN")
    protected TINInfoCType addlTIN;
    @XmlElementRef(name = "AddlBirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BirthDtType> addlBirthDt;
    @XmlElementRef(name = "AddlPhoneArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneArrayAType> addlPhoneArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "AddlNameStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddlNameStatType> addlNameStat;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctTitleType }{@code >}
     *     
     */
    public JAXBElement<AcctTitleType> getAcctTitle() {
        return acctTitle;
    }

    /**
     * Sets the value of the acctTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctTitleType }{@code >}
     *     
     */
    public void setAcctTitle(JAXBElement<AcctTitleType> value) {
        this.acctTitle = value;
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
     * Gets the value of the addlName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getAddlName() {
        return addlName;
    }

    /**
     * Sets the value of the addlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setAddlName(PersonNameCType value) {
        this.addlName = value;
    }

    /**
     * Gets the value of the addlTIN property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoCType }
     *     
     */
    public TINInfoCType getAddlTIN() {
        return addlTIN;
    }

    /**
     * Sets the value of the addlTIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoCType }
     *     
     */
    public void setAddlTIN(TINInfoCType value) {
        this.addlTIN = value;
    }

    /**
     * Gets the value of the addlBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public JAXBElement<BirthDtType> getAddlBirthDt() {
        return addlBirthDt;
    }

    /**
     * Sets the value of the addlBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public void setAddlBirthDt(JAXBElement<BirthDtType> value) {
        this.addlBirthDt = value;
    }

    /**
     * Gets the value of the addlPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneArrayAType }{@code >}
     *     
     */
    public JAXBElement<PhoneArrayAType> getAddlPhoneArray() {
        return addlPhoneArray;
    }

    /**
     * Sets the value of the addlPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneArrayAType }{@code >}
     *     
     */
    public void setAddlPhoneArray(JAXBElement<PhoneArrayAType> value) {
        this.addlPhoneArray = value;
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
     * Gets the value of the addlNameStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddlNameStatType }{@code >}
     *     
     */
    public JAXBElement<AddlNameStatType> getAddlNameStat() {
        return addlNameStat;
    }

    /**
     * Sets the value of the addlNameStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddlNameStatType }{@code >}
     *     
     */
    public void setAddlNameStat(JAXBElement<AddlNameStatType> value) {
        this.addlNameStat = value;
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
