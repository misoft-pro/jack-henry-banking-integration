
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
 * <p>Java class for SerChgTierInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgTierInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierChgOrder" type="{http://jackhenry.com/jxchange/TPG/2008}TierChgOrder_Type"/&gt;
 *         &lt;element name="TierChgLgclOprnd" type="{http://jackhenry.com/jxchange/TPG/2008}TierChgLgclOprnd_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TierChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgTierBalInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgTierBalInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SerChgTierInfoRec_CType", propOrder = {
    "tierChgOrder",
    "tierChgLgclOprnd",
    "tierChgAmt",
    "serChgTierBalInfoArray",
    "ver1",
    "any"
})
public class SerChgTierInfoRecCType {

    @XmlElement(name = "TierChgOrder", required = true)
    protected TierChgOrderType tierChgOrder;
    @XmlElementRef(name = "TierChgLgclOprnd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TierChgLgclOprndType> tierChgLgclOprnd;
    @XmlElementRef(name = "TierChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TierChgAmtType> tierChgAmt;
    @XmlElement(name = "SerChgTierBalInfoArray")
    protected SerChgTierBalInfoArrayAType serChgTierBalInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tierChgOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TierChgOrderType }
     *     
     */
    public TierChgOrderType getTierChgOrder() {
        return tierChgOrder;
    }

    /**
     * Sets the value of the tierChgOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierChgOrderType }
     *     
     */
    public void setTierChgOrder(TierChgOrderType value) {
        this.tierChgOrder = value;
    }

    /**
     * Gets the value of the tierChgLgclOprnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TierChgLgclOprndType }{@code >}
     *     
     */
    public JAXBElement<TierChgLgclOprndType> getTierChgLgclOprnd() {
        return tierChgLgclOprnd;
    }

    /**
     * Sets the value of the tierChgLgclOprnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TierChgLgclOprndType }{@code >}
     *     
     */
    public void setTierChgLgclOprnd(JAXBElement<TierChgLgclOprndType> value) {
        this.tierChgLgclOprnd = value;
    }

    /**
     * Gets the value of the tierChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TierChgAmtType }{@code >}
     *     
     */
    public JAXBElement<TierChgAmtType> getTierChgAmt() {
        return tierChgAmt;
    }

    /**
     * Sets the value of the tierChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TierChgAmtType }{@code >}
     *     
     */
    public void setTierChgAmt(JAXBElement<TierChgAmtType> value) {
        this.tierChgAmt = value;
    }

    /**
     * Gets the value of the serChgTierBalInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgTierBalInfoArrayAType }
     *     
     */
    public SerChgTierBalInfoArrayAType getSerChgTierBalInfoArray() {
        return serChgTierBalInfoArray;
    }

    /**
     * Sets the value of the serChgTierBalInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgTierBalInfoArrayAType }
     *     
     */
    public void setSerChgTierBalInfoArray(SerChgTierBalInfoArrayAType value) {
        this.serChgTierBalInfoArray = value;
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
