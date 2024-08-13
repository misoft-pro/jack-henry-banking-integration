
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
 * <p>Java class for LnGuarInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnGuarInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnGuarText" type="{http://jackhenry.com/jxchange/TPG/2008}LnGuarText_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnGuarId" type="{http://jackhenry.com/jxchange/TPG/2008}LnGuarId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnGuarName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
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
@XmlType(name = "LnGuarInfoRec_CType", propOrder = {
    "lnGuarText",
    "lnGuarId",
    "lnGuarName",
    "ver1",
    "any"
})
public class LnGuarInfoRecCType {

    @XmlElementRef(name = "LnGuarText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnGuarTextType> lnGuarText;
    @XmlElementRef(name = "LnGuarId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnGuarIdType> lnGuarId;
    @XmlElement(name = "LnGuarName")
    protected PersonNameCType lnGuarName;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnGuarText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnGuarTextType }{@code >}
     *     
     */
    public JAXBElement<LnGuarTextType> getLnGuarText() {
        return lnGuarText;
    }

    /**
     * Sets the value of the lnGuarText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnGuarTextType }{@code >}
     *     
     */
    public void setLnGuarText(JAXBElement<LnGuarTextType> value) {
        this.lnGuarText = value;
    }

    /**
     * Gets the value of the lnGuarId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnGuarIdType }{@code >}
     *     
     */
    public JAXBElement<LnGuarIdType> getLnGuarId() {
        return lnGuarId;
    }

    /**
     * Sets the value of the lnGuarId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnGuarIdType }{@code >}
     *     
     */
    public void setLnGuarId(JAXBElement<LnGuarIdType> value) {
        this.lnGuarId = value;
    }

    /**
     * Gets the value of the lnGuarName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getLnGuarName() {
        return lnGuarName;
    }

    /**
     * Sets the value of the lnGuarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setLnGuarName(PersonNameCType value) {
        this.lnGuarName = value;
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
