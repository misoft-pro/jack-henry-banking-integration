
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
 * <p>Java class for XferFromInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferFromInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferFromDepType" type="{http://jackhenry.com/jxchange/TPG/2008}XferFromDepType_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFromLnType" type="{http://jackhenry.com/jxchange/TPG/2008}XferFromLnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFromSavType" type="{http://jackhenry.com/jxchange/TPG/2008}XferFromSavType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "XferFromInfo_CType", propOrder = {
    "xferFromDepType",
    "xferFromLnType",
    "xferFromSavType",
    "ver1",
    "any"
})
public class XferFromInfoCType {

    @XmlElementRef(name = "XferFromDepType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferFromDepTypeType> xferFromDepType;
    @XmlElementRef(name = "XferFromLnType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferFromLnTypeType> xferFromLnType;
    @XmlElementRef(name = "XferFromSavType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferFromSavTypeType> xferFromSavType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xferFromDepType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferFromDepTypeType }{@code >}
     *     
     */
    public JAXBElement<XferFromDepTypeType> getXferFromDepType() {
        return xferFromDepType;
    }

    /**
     * Sets the value of the xferFromDepType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferFromDepTypeType }{@code >}
     *     
     */
    public void setXferFromDepType(JAXBElement<XferFromDepTypeType> value) {
        this.xferFromDepType = value;
    }

    /**
     * Gets the value of the xferFromLnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferFromLnTypeType }{@code >}
     *     
     */
    public JAXBElement<XferFromLnTypeType> getXferFromLnType() {
        return xferFromLnType;
    }

    /**
     * Sets the value of the xferFromLnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferFromLnTypeType }{@code >}
     *     
     */
    public void setXferFromLnType(JAXBElement<XferFromLnTypeType> value) {
        this.xferFromLnType = value;
    }

    /**
     * Gets the value of the xferFromSavType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferFromSavTypeType }{@code >}
     *     
     */
    public JAXBElement<XferFromSavTypeType> getXferFromSavType() {
        return xferFromSavType;
    }

    /**
     * Sets the value of the xferFromSavType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferFromSavTypeType }{@code >}
     *     
     */
    public void setXferFromSavType(JAXBElement<XferFromSavTypeType> value) {
        this.xferFromSavType = value;
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
