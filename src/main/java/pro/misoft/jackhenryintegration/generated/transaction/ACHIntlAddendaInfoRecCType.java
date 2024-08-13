
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
 * <p>Java class for ACHIntlAddendaInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHIntlAddendaInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHIntlAddendaType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIntlAddendaType_Type"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateProv" type="{http://jackhenry.com/jxchange/TPG/2008}StateProv_Type" minOccurs="0"/&gt;
 *         &lt;element name="Cntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinInstQualId" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstQualId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InstRtld" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ACHIntlAddendaInfoRec_CType", propOrder = {
    "achIntlAddendaType",
    "achCompName",
    "streetAddr1",
    "city",
    "stateProv",
    "cntry",
    "postalCode",
    "finInstName",
    "finInstQualId",
    "instRtld",
    "cntryType",
    "ver1",
    "any"
})
public class ACHIntlAddendaInfoRecCType {

    @XmlElement(name = "ACHIntlAddendaType", required = true, nillable = true)
    protected ACHIntlAddendaTypeType achIntlAddendaType;
    @XmlElementRef(name = "ACHCompName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompNameType> achCompName;
    @XmlElementRef(name = "StreetAddr1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetAddr1Type> streetAddr1;
    @XmlElementRef(name = "City", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CityType> city;
    @XmlElementRef(name = "StateProv", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateProvType> stateProv;
    @XmlElementRef(name = "Cntry", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntryType> cntry;
    @XmlElementRef(name = "PostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostalCodeType> postalCode;
    @XmlElementRef(name = "FinInstName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FinInstNameType> finInstName;
    @XmlElementRef(name = "FinInstQualId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FinInstQualIdType> finInstQualId;
    @XmlElementRef(name = "InstRtld", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InstRtIdType> instRtld;
    @XmlElementRef(name = "CntryType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntryTypeType> cntryType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achIntlAddendaType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIntlAddendaTypeType }
     *     
     */
    public ACHIntlAddendaTypeType getACHIntlAddendaType() {
        return achIntlAddendaType;
    }

    /**
     * Sets the value of the achIntlAddendaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIntlAddendaTypeType }
     *     
     */
    public void setACHIntlAddendaType(ACHIntlAddendaTypeType value) {
        this.achIntlAddendaType = value;
    }

    /**
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}
     *     
     */
    public JAXBElement<ACHCompNameType> getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}
     *     
     */
    public void setACHCompName(JAXBElement<ACHCompNameType> value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the streetAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public JAXBElement<StreetAddr1Type> getStreetAddr1() {
        return streetAddr1;
    }

    /**
     * Sets the value of the streetAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public void setStreetAddr1(JAXBElement<StreetAddr1Type> value) {
        this.streetAddr1 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public JAXBElement<CityType> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public void setCity(JAXBElement<CityType> value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateProvType }{@code >}
     *     
     */
    public JAXBElement<StateProvType> getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateProvType }{@code >}
     *     
     */
    public void setStateProv(JAXBElement<StateProvType> value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the cntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntryType }{@code >}
     *     
     */
    public JAXBElement<CntryType> getCntry() {
        return cntry;
    }

    /**
     * Sets the value of the cntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntryType }{@code >}
     *     
     */
    public void setCntry(JAXBElement<CntryType> value) {
        this.cntry = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public JAXBElement<PostalCodeType> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<PostalCodeType> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the finInstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinInstNameType }{@code >}
     *     
     */
    public JAXBElement<FinInstNameType> getFinInstName() {
        return finInstName;
    }

    /**
     * Sets the value of the finInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinInstNameType }{@code >}
     *     
     */
    public void setFinInstName(JAXBElement<FinInstNameType> value) {
        this.finInstName = value;
    }

    /**
     * Gets the value of the finInstQualId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FinInstQualIdType }{@code >}
     *     
     */
    public JAXBElement<FinInstQualIdType> getFinInstQualId() {
        return finInstQualId;
    }

    /**
     * Sets the value of the finInstQualId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FinInstQualIdType }{@code >}
     *     
     */
    public void setFinInstQualId(JAXBElement<FinInstQualIdType> value) {
        this.finInstQualId = value;
    }

    /**
     * Gets the value of the instRtld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}
     *     
     */
    public JAXBElement<InstRtIdType> getInstRtld() {
        return instRtld;
    }

    /**
     * Sets the value of the instRtld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}
     *     
     */
    public void setInstRtld(JAXBElement<InstRtIdType> value) {
        this.instRtld = value;
    }

    /**
     * Gets the value of the cntryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public JAXBElement<CntryTypeType> getCntryType() {
        return cntryType;
    }

    /**
     * Sets the value of the cntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public void setCntryType(JAXBElement<CntryTypeType> value) {
        this.cntryType = value;
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
