
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
 * <p>Java class for HouseHoldMbrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseHoldMbrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HouseHoldMbrText" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldMbrText_Type" minOccurs="0"/&gt;
 *         &lt;element name="HouseHoldMbrName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="HouseHoldMbrBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HouseHoldMbrRel" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldMbrRel_Type" minOccurs="0"/&gt;
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
@XmlType(name = "HouseHoldMbrInfo_CType", propOrder = {
    "houseHoldMbrText",
    "houseHoldMbrName",
    "houseHoldMbrBirthDt",
    "houseHoldMbrRel",
    "ver1",
    "any"
})
public class HouseHoldMbrInfoCType {

    @XmlElementRef(name = "HouseHoldMbrText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HouseHoldMbrTextType> houseHoldMbrText;
    @XmlElement(name = "HouseHoldMbrName")
    protected PersonNameCType houseHoldMbrName;
    @XmlElementRef(name = "HouseHoldMbrBirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BirthDtType> houseHoldMbrBirthDt;
    @XmlElementRef(name = "HouseHoldMbrRel", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HouseHoldMbrRelType> houseHoldMbrRel;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the houseHoldMbrText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldMbrTextType }{@code >}
     *     
     */
    public JAXBElement<HouseHoldMbrTextType> getHouseHoldMbrText() {
        return houseHoldMbrText;
    }

    /**
     * Sets the value of the houseHoldMbrText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldMbrTextType }{@code >}
     *     
     */
    public void setHouseHoldMbrText(JAXBElement<HouseHoldMbrTextType> value) {
        this.houseHoldMbrText = value;
    }

    /**
     * Gets the value of the houseHoldMbrName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getHouseHoldMbrName() {
        return houseHoldMbrName;
    }

    /**
     * Sets the value of the houseHoldMbrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setHouseHoldMbrName(PersonNameCType value) {
        this.houseHoldMbrName = value;
    }

    /**
     * Gets the value of the houseHoldMbrBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public JAXBElement<BirthDtType> getHouseHoldMbrBirthDt() {
        return houseHoldMbrBirthDt;
    }

    /**
     * Sets the value of the houseHoldMbrBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public void setHouseHoldMbrBirthDt(JAXBElement<BirthDtType> value) {
        this.houseHoldMbrBirthDt = value;
    }

    /**
     * Gets the value of the houseHoldMbrRel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldMbrRelType }{@code >}
     *     
     */
    public JAXBElement<HouseHoldMbrRelType> getHouseHoldMbrRel() {
        return houseHoldMbrRel;
    }

    /**
     * Sets the value of the houseHoldMbrRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HouseHoldMbrRelType }{@code >}
     *     
     */
    public void setHouseHoldMbrRel(JAXBElement<HouseHoldMbrRelType> value) {
        this.houseHoldMbrRel = value;
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
