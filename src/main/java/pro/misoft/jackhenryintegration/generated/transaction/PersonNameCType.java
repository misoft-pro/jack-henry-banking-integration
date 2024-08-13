
package pro.misoft.jackhenryintegration.generated.transaction;

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
 * <p>Java class for PersonName_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonName_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://jackhenry.com/jxchange/TPG/2008}FirstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://jackhenry.com/jxchange/TPG/2008}MiddleName_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://jackhenry.com/jxchange/TPG/2008}LastName_Type" minOccurs="0"/&gt;
 *         &lt;element name="x_PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}x_PersonName_CType" minOccurs="0"/&gt;
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
@XmlType(name = "PersonName_CType", propOrder = {
    "comName",
    "firstName",
    "middleName",
    "lastName",
    "xPersonName",
    "ver1",
    "any"
})
public class PersonNameCType {

    @XmlElementRef(name = "ComName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ComNameType> comName;
    @XmlElementRef(name = "FirstName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstNameType> firstName;
    @XmlElementRef(name = "MiddleName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MiddleNameType> middleName;
    @XmlElementRef(name = "LastName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastNameType> lastName;
    @XmlElement(name = "x_PersonName")
    protected XPersonNameCType xPersonName;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the comName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public JAXBElement<ComNameType> getComName() {
        return comName;
    }

    /**
     * Sets the value of the comName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public void setComName(JAXBElement<ComNameType> value) {
        this.comName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstNameType }{@code >}
     *     
     */
    public JAXBElement<FirstNameType> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstNameType }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<FirstNameType> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MiddleNameType }{@code >}
     *     
     */
    public JAXBElement<MiddleNameType> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MiddleNameType }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<MiddleNameType> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastNameType }{@code >}
     *     
     */
    public JAXBElement<LastNameType> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastNameType }{@code >}
     *     
     */
    public void setLastName(JAXBElement<LastNameType> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the xPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link XPersonNameCType }
     *     
     */
    public XPersonNameCType getXPersonName() {
        return xPersonName;
    }

    /**
     * Sets the value of the xPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPersonNameCType }
     *     
     */
    public void setXPersonName(XPersonNameCType value) {
        this.xPersonName = value;
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
     * {@link Element }
     * {@link Object }
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
