
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
 * <p>Java class for LnStopInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnStopInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnStopCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnStopInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LnStopInfo_CType", propOrder = {
    "lnStopCode",
    "lnStopInfoArray",
    "ver1",
    "any"
})
public class LnStopInfoCType {

    @XmlElementRef(name = "LnStopCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnStopCodeType> lnStopCode;
    @XmlElement(name = "LnStopInfoArray")
    protected LnStopInfoArrayAType lnStopInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnStopCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnStopCodeType }{@code >}
     *     
     */
    public JAXBElement<LnStopCodeType> getLnStopCode() {
        return lnStopCode;
    }

    /**
     * Sets the value of the lnStopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnStopCodeType }{@code >}
     *     
     */
    public void setLnStopCode(JAXBElement<LnStopCodeType> value) {
        this.lnStopCode = value;
    }

    /**
     * Gets the value of the lnStopInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnStopInfoArrayAType }
     *     
     */
    public LnStopInfoArrayAType getLnStopInfoArray() {
        return lnStopInfoArray;
    }

    /**
     * Sets the value of the lnStopInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnStopInfoArrayAType }
     *     
     */
    public void setLnStopInfoArray(LnStopInfoArrayAType value) {
        this.lnStopInfoArray = value;
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
