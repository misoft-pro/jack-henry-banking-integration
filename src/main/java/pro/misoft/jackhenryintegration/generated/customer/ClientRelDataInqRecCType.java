
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ClientRelDataInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientRelDataInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="x_XtendInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}XtendInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_ClientIntArray" type="{http://jackhenry.com/jxchange/TPG/2008}ClientIntArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_ClientDemogrArray" type="{http://jackhenry.com/jxchange/TPG/2008}ClientDemogrArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientRelDataInqRec_CType", propOrder = {
    "xXtendInfoArray",
    "xClientIntArray",
    "xClientDemogrArray",
    "custom",
    "ver1",
    "any"
})
public class ClientRelDataInqRecCType {

    @XmlElement(name = "x_XtendInfoArray")
    protected XtendInfoArrayAType xXtendInfoArray;
    @XmlElement(name = "x_ClientIntArray")
    protected ClientIntArrayAType xClientIntArray;
    @XmlElement(name = "x_ClientDemogrArray")
    protected ClientDemogrArrayAType xClientDemogrArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the xXtendInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link XtendInfoArrayAType }
     *     
     */
    public XtendInfoArrayAType getXXtendInfoArray() {
        return xXtendInfoArray;
    }

    /**
     * Sets the value of the xXtendInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XtendInfoArrayAType }
     *     
     */
    public void setXXtendInfoArray(XtendInfoArrayAType value) {
        this.xXtendInfoArray = value;
    }

    /**
     * Gets the value of the xClientIntArray property.
     * 
     * @return
     *     possible object is
     *     {@link ClientIntArrayAType }
     *     
     */
    public ClientIntArrayAType getXClientIntArray() {
        return xClientIntArray;
    }

    /**
     * Sets the value of the xClientIntArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIntArrayAType }
     *     
     */
    public void setXClientIntArray(ClientIntArrayAType value) {
        this.xClientIntArray = value;
    }

    /**
     * Gets the value of the xClientDemogrArray property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDemogrArrayAType }
     *     
     */
    public ClientDemogrArrayAType getXClientDemogrArray() {
        return xClientDemogrArray;
    }

    /**
     * Sets the value of the xClientDemogrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDemogrArrayAType }
     *     
     */
    public void setXClientDemogrArray(ClientDemogrArrayAType value) {
        this.xClientDemogrArray = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
