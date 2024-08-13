
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
 * <p>Java class for x_PersonName_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_PersonName_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TitlePrefix" type="{http://jackhenry.com/jxchange/TPG/2008}TitlePrefix_Type" minOccurs="0"/&gt;
 *         &lt;element name="NameSuffix" type="{http://jackhenry.com/jxchange/TPG/2008}NameSuffix_Type" minOccurs="0"/&gt;
 *         &lt;element name="LegalName" type="{http://jackhenry.com/jxchange/TPG/2008}LegalName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalName" type="{http://jackhenry.com/jxchange/TPG/2008}SalName_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AbbName" type="{http://jackhenry.com/jxchange/TPG/2008}AbbName_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_PersonName_CType", propOrder = {
    "titlePrefix",
    "nameSuffix",
    "legalName",
    "salName",
    "ver1",
    "abbName",
    "ver2",
    "any"
})
public class XPersonNameCType {

    @XmlElementRef(name = "TitlePrefix", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TitlePrefixType> titlePrefix;
    @XmlElementRef(name = "NameSuffix", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NameSuffixType> nameSuffix;
    @XmlElementRef(name = "LegalName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LegalNameType> legalName;
    @XmlElementRef(name = "SalName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SalNameType> salName;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AbbName")
    protected AbbNameType abbName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the titlePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TitlePrefixType }{@code >}
     *     
     */
    public JAXBElement<TitlePrefixType> getTitlePrefix() {
        return titlePrefix;
    }

    /**
     * Sets the value of the titlePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TitlePrefixType }{@code >}
     *     
     */
    public void setTitlePrefix(JAXBElement<TitlePrefixType> value) {
        this.titlePrefix = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}
     *     
     */
    public JAXBElement<NameSuffixType> getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}
     *     
     */
    public void setNameSuffix(JAXBElement<NameSuffixType> value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegalNameType }{@code >}
     *     
     */
    public JAXBElement<LegalNameType> getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegalNameType }{@code >}
     *     
     */
    public void setLegalName(JAXBElement<LegalNameType> value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the salName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalNameType }{@code >}
     *     
     */
    public JAXBElement<SalNameType> getSalName() {
        return salName;
    }

    /**
     * Sets the value of the salName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalNameType }{@code >}
     *     
     */
    public void setSalName(JAXBElement<SalNameType> value) {
        this.salName = value;
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
     * Gets the value of the abbName property.
     * 
     * @return
     *     possible object is
     *     {@link AbbNameType }
     *     
     */
    public AbbNameType getAbbName() {
        return abbName;
    }

    /**
     * Sets the value of the abbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbbNameType }
     *     
     */
    public void setAbbName(AbbNameType value) {
        this.abbName = value;
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
