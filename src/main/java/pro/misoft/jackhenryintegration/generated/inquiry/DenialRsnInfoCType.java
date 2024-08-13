
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
 * <p>Java class for DenialRsnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenialRsnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DenialRsnText" type="{http://jackhenry.com/jxchange/TPG/2008}DenialRsnText_Type" minOccurs="0"/&gt;
 *         &lt;element name="DenialRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}DenialRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DenialRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DenialRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="DenialRsnVal" type="{http://jackhenry.com/jxchange/TPG/2008}DenialRsnVal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DenialRsnInfo_CType", propOrder = {
    "denialRsnText",
    "denialRsnCode",
    "denialRsnDesc",
    "ver1",
    "denialRsnVal",
    "ver2",
    "any"
})
public class DenialRsnInfoCType {

    @XmlElementRef(name = "DenialRsnText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DenialRsnTextType> denialRsnText;
    @XmlElementRef(name = "DenialRsnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DenialRsnCodeType> denialRsnCode;
    @XmlElementRef(name = "DenialRsnDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DenialRsnDescType> denialRsnDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "DenialRsnVal")
    protected DenialRsnValType denialRsnVal;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the denialRsnText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DenialRsnTextType }{@code >}
     *     
     */
    public JAXBElement<DenialRsnTextType> getDenialRsnText() {
        return denialRsnText;
    }

    /**
     * Sets the value of the denialRsnText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DenialRsnTextType }{@code >}
     *     
     */
    public void setDenialRsnText(JAXBElement<DenialRsnTextType> value) {
        this.denialRsnText = value;
    }

    /**
     * Gets the value of the denialRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DenialRsnCodeType }{@code >}
     *     
     */
    public JAXBElement<DenialRsnCodeType> getDenialRsnCode() {
        return denialRsnCode;
    }

    /**
     * Sets the value of the denialRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DenialRsnCodeType }{@code >}
     *     
     */
    public void setDenialRsnCode(JAXBElement<DenialRsnCodeType> value) {
        this.denialRsnCode = value;
    }

    /**
     * Gets the value of the denialRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DenialRsnDescType }{@code >}
     *     
     */
    public JAXBElement<DenialRsnDescType> getDenialRsnDesc() {
        return denialRsnDesc;
    }

    /**
     * Sets the value of the denialRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DenialRsnDescType }{@code >}
     *     
     */
    public void setDenialRsnDesc(JAXBElement<DenialRsnDescType> value) {
        this.denialRsnDesc = value;
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
     * Gets the value of the denialRsnVal property.
     * 
     * @return
     *     possible object is
     *     {@link DenialRsnValType }
     *     
     */
    public DenialRsnValType getDenialRsnVal() {
        return denialRsnVal;
    }

    /**
     * Sets the value of the denialRsnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenialRsnValType }
     *     
     */
    public void setDenialRsnVal(DenialRsnValType value) {
        this.denialRsnVal = value;
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
