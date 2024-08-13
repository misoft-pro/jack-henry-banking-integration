
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
 * <p>Java class for SerChgLvlAppAmtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgLvlAppAmtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlAppOrder" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAppOrder_Type"/&gt;
 *         &lt;element name="SerChgLvlAlgSym" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAlgSymb_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlTolrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlTolrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlAppDetArray" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAppDetArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SerChgLvlAppAmtInfoRec_CType", propOrder = {
    "serChgLvlAppOrder",
    "serChgLvlAlgSym",
    "serChgLvlTolrAmt",
    "serChgLvlAppDetArray",
    "ver1",
    "any"
})
public class SerChgLvlAppAmtInfoRecCType {

    @XmlElement(name = "SerChgLvlAppOrder", required = true)
    protected SerChgLvlAppOrderType serChgLvlAppOrder;
    @XmlElementRef(name = "SerChgLvlAlgSym", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgLvlAlgSymbType> serChgLvlAlgSym;
    @XmlElementRef(name = "SerChgLvlTolrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgLvlTolrAmtType> serChgLvlTolrAmt;
    @XmlElement(name = "SerChgLvlAppDetArray")
    protected SerChgLvlAppDetArrayAType serChgLvlAppDetArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the serChgLvlAppOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgLvlAppOrderType }
     *     
     */
    public SerChgLvlAppOrderType getSerChgLvlAppOrder() {
        return serChgLvlAppOrder;
    }

    /**
     * Sets the value of the serChgLvlAppOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgLvlAppOrderType }
     *     
     */
    public void setSerChgLvlAppOrder(SerChgLvlAppOrderType value) {
        this.serChgLvlAppOrder = value;
    }

    /**
     * Gets the value of the serChgLvlAlgSym property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlAlgSymbType }{@code >}
     *     
     */
    public JAXBElement<SerChgLvlAlgSymbType> getSerChgLvlAlgSym() {
        return serChgLvlAlgSym;
    }

    /**
     * Sets the value of the serChgLvlAlgSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlAlgSymbType }{@code >}
     *     
     */
    public void setSerChgLvlAlgSym(JAXBElement<SerChgLvlAlgSymbType> value) {
        this.serChgLvlAlgSym = value;
    }

    /**
     * Gets the value of the serChgLvlTolrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlTolrAmtType }{@code >}
     *     
     */
    public JAXBElement<SerChgLvlTolrAmtType> getSerChgLvlTolrAmt() {
        return serChgLvlTolrAmt;
    }

    /**
     * Sets the value of the serChgLvlTolrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlTolrAmtType }{@code >}
     *     
     */
    public void setSerChgLvlTolrAmt(JAXBElement<SerChgLvlTolrAmtType> value) {
        this.serChgLvlTolrAmt = value;
    }

    /**
     * Gets the value of the serChgLvlAppDetArray property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgLvlAppDetArrayAType }
     *     
     */
    public SerChgLvlAppDetArrayAType getSerChgLvlAppDetArray() {
        return serChgLvlAppDetArray;
    }

    /**
     * Sets the value of the serChgLvlAppDetArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgLvlAppDetArrayAType }
     *     
     */
    public void setSerChgLvlAppDetArray(SerChgLvlAppDetArrayAType value) {
        this.serChgLvlAppDetArray = value;
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
