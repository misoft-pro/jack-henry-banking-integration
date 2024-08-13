
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
 * <p>Java class for SerChgLvlInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgLvlInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlOrder" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlOrder_Type"/&gt;
 *         &lt;element name="SerChgLvlLgclOprnd" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlLgclOprnd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlAppAmtArray" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAppAmtArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlAppCntArray" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAppCntArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SerChgLvlInfoRec_CType", propOrder = {
    "serChgLvlOrder",
    "serChgLvlLgclOprnd",
    "serChgLvlAppAmtArray",
    "serChgLvlAppCntArray",
    "ver1",
    "any"
})
public class SerChgLvlInfoRecCType {

    @XmlElement(name = "SerChgLvlOrder", required = true)
    protected SerChgLvlOrderType serChgLvlOrder;
    @XmlElementRef(name = "SerChgLvlLgclOprnd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgLvlLgclOprndType> serChgLvlLgclOprnd;
    @XmlElement(name = "SerChgLvlAppAmtArray")
    protected SerChgLvlAppAmtArrayAType serChgLvlAppAmtArray;
    @XmlElement(name = "SerChgLvlAppCntArray")
    protected SerChgLvlAppCntArrayAType serChgLvlAppCntArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the serChgLvlOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgLvlOrderType }
     *     
     */
    public SerChgLvlOrderType getSerChgLvlOrder() {
        return serChgLvlOrder;
    }

    /**
     * Sets the value of the serChgLvlOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgLvlOrderType }
     *     
     */
    public void setSerChgLvlOrder(SerChgLvlOrderType value) {
        this.serChgLvlOrder = value;
    }

    /**
     * Gets the value of the serChgLvlLgclOprnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlLgclOprndType }{@code >}
     *     
     */
    public JAXBElement<SerChgLvlLgclOprndType> getSerChgLvlLgclOprnd() {
        return serChgLvlLgclOprnd;
    }

    /**
     * Sets the value of the serChgLvlLgclOprnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlLgclOprndType }{@code >}
     *     
     */
    public void setSerChgLvlLgclOprnd(JAXBElement<SerChgLvlLgclOprndType> value) {
        this.serChgLvlLgclOprnd = value;
    }

    /**
     * Gets the value of the serChgLvlAppAmtArray property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgLvlAppAmtArrayAType }
     *     
     */
    public SerChgLvlAppAmtArrayAType getSerChgLvlAppAmtArray() {
        return serChgLvlAppAmtArray;
    }

    /**
     * Sets the value of the serChgLvlAppAmtArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgLvlAppAmtArrayAType }
     *     
     */
    public void setSerChgLvlAppAmtArray(SerChgLvlAppAmtArrayAType value) {
        this.serChgLvlAppAmtArray = value;
    }

    /**
     * Gets the value of the serChgLvlAppCntArray property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgLvlAppCntArrayAType }
     *     
     */
    public SerChgLvlAppCntArrayAType getSerChgLvlAppCntArray() {
        return serChgLvlAppCntArray;
    }

    /**
     * Sets the value of the serChgLvlAppCntArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgLvlAppCntArrayAType }
     *     
     */
    public void setSerChgLvlAppCntArray(SerChgLvlAppCntArrayAType value) {
        this.serChgLvlAppCntArray = value;
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
