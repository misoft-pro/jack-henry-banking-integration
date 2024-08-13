
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
 * <p>Java class for OffInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OffCodeText" type="{http://jackhenry.com/jxchange/TPG/2008}OffCodeText_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="OffRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
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
@XmlType(name = "OffInfoRec_CType", propOrder = {
    "offCodeText",
    "offCode",
    "offDesc",
    "ver1",
    "offRmk",
    "ver2",
    "any"
})
public class OffInfoRecCType {

    @XmlElementRef(name = "OffCodeText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeTextType> offCodeText;
    @XmlElementRef(name = "OffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> offCode;
    @XmlElementRef(name = "OffDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffDescType> offDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "OffRmk")
    protected RmkType offRmk;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the offCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeTextType }{@code >}
     *     
     */
    public JAXBElement<OffCodeTextType> getOffCodeText() {
        return offCodeText;
    }

    /**
     * Sets the value of the offCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeTextType }{@code >}
     *     
     */
    public void setOffCodeText(JAXBElement<OffCodeTextType> value) {
        this.offCodeText = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setOffCode(JAXBElement<OffCodeType> value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffDescType }{@code >}
     *     
     */
    public JAXBElement<OffDescType> getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffDescType }{@code >}
     *     
     */
    public void setOffDesc(JAXBElement<OffDescType> value) {
        this.offDesc = value;
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
     * Gets the value of the offRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getOffRmk() {
        return offRmk;
    }

    /**
     * Sets the value of the offRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setOffRmk(RmkType value) {
        this.offRmk = value;
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
