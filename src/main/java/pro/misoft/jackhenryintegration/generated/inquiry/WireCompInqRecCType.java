
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WireCompInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireCompInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireCompInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireCompId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireCompInqRec_CType", propOrder = {
    "wireCompInfoRec",
    "wireCompId",
    "ver1",
    "any"
})
public class WireCompInqRecCType {

    @XmlElement(name = "WireCompInfoRec")
    protected WireCompInfoRecCType wireCompInfoRec;
    @XmlElement(name = "WireCompId")
    protected WireCompIdType wireCompId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireCompInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireCompInfoRecCType }
     *     
     */
    public WireCompInfoRecCType getWireCompInfoRec() {
        return wireCompInfoRec;
    }

    /**
     * Sets the value of the wireCompInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCompInfoRecCType }
     *     
     */
    public void setWireCompInfoRec(WireCompInfoRecCType value) {
        this.wireCompInfoRec = value;
    }

    /**
     * Gets the value of the wireCompId property.
     * 
     * @return
     *     possible object is
     *     {@link WireCompIdType }
     *     
     */
    public WireCompIdType getWireCompId() {
        return wireCompId;
    }

    /**
     * Sets the value of the wireCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCompIdType }
     *     
     */
    public void setWireCompId(WireCompIdType value) {
        this.wireCompId = value;
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
