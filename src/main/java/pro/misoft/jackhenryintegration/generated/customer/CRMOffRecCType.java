
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
 * <p>Java class for CRMOffRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMOffRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMOffCodeText" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCodeText_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CRMOffRec_CType", propOrder = {
    "crmOffCodeText",
    "crmOffCode",
    "crmOffDesc",
    "ver1",
    "any"
})
public class CRMOffRecCType {

    @XmlElementRef(name = "CRMOffCodeText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRMOffCodeTextType> crmOffCodeText;
    @XmlElementRef(name = "CRMOffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRMOffCodeType> crmOffCode;
    @XmlElementRef(name = "CRMOffDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRMOffDescType> crmOffDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crmOffCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRMOffCodeTextType }{@code >}
     *     
     */
    public JAXBElement<CRMOffCodeTextType> getCRMOffCodeText() {
        return crmOffCodeText;
    }

    /**
     * Sets the value of the crmOffCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRMOffCodeTextType }{@code >}
     *     
     */
    public void setCRMOffCodeText(JAXBElement<CRMOffCodeTextType> value) {
        this.crmOffCodeText = value;
    }

    /**
     * Gets the value of the crmOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRMOffCodeType }{@code >}
     *     
     */
    public JAXBElement<CRMOffCodeType> getCRMOffCode() {
        return crmOffCode;
    }

    /**
     * Sets the value of the crmOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRMOffCodeType }{@code >}
     *     
     */
    public void setCRMOffCode(JAXBElement<CRMOffCodeType> value) {
        this.crmOffCode = value;
    }

    /**
     * Gets the value of the crmOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRMOffDescType }{@code >}
     *     
     */
    public JAXBElement<CRMOffDescType> getCRMOffDesc() {
        return crmOffDesc;
    }

    /**
     * Sets the value of the crmOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRMOffDescType }{@code >}
     *     
     */
    public void setCRMOffDesc(JAXBElement<CRMOffDescType> value) {
        this.crmOffDesc = value;
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
