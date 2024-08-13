
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
 * <p>Java class for HdrFault_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HdrFault_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaultHdr" type="{http://jackhenry.com/jxchange/TPG/2008}FaultHdr_CType"/&gt;
 *         &lt;element name="FaultRecInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}FaultRecInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}FaultVer_1_CType"/&gt;
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
@XmlType(name = "HdrFault_MType", propOrder = {
    "faultHdr",
    "faultRecInfoArray",
    "ver1",
    "any"
})
public class HdrFaultMType {

    @XmlElement(name = "FaultHdr", required = true, nillable = true)
    protected FaultHdrCType faultHdr;
    @XmlElementRef(name = "FaultRecInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FaultRecInfoArrayAType> faultRecInfoArray;
    @XmlElement(name = "Ver_1")
    protected FaultVer1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the faultHdr property.
     * 
     * @return
     *     possible object is
     *     {@link FaultHdrCType }
     *     
     */
    public FaultHdrCType getFaultHdr() {
        return faultHdr;
    }

    /**
     * Sets the value of the faultHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultHdrCType }
     *     
     */
    public void setFaultHdr(FaultHdrCType value) {
        this.faultHdr = value;
    }

    /**
     * Gets the value of the faultRecInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FaultRecInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<FaultRecInfoArrayAType> getFaultRecInfoArray() {
        return faultRecInfoArray;
    }

    /**
     * Sets the value of the faultRecInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FaultRecInfoArrayAType }{@code >}
     *     
     */
    public void setFaultRecInfoArray(JAXBElement<FaultRecInfoArrayAType> value) {
        this.faultRecInfoArray = value;
    }

    /**
     * Gets the value of the ver1 property.
     * 
     * @return
     *     possible object is
     *     {@link FaultVer1CType }
     *     
     */
    public FaultVer1CType getVer1() {
        return ver1;
    }

    /**
     * Sets the value of the ver1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultVer1CType }
     *     
     */
    public void setVer1(FaultVer1CType value) {
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
