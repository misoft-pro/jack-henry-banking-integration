
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
 * <p>Java class for ACHCompMultiInqRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHCompMultiInqRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type"/&gt;
 *         &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "ACHCompMultiInqRq_MType", propOrder = {
    "msgRqHdr",
    "achCompName",
    "actIntent",
    "custom",
    "ver1",
    "any"
})
public class ACHCompMultiInqRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElement(name = "ACHCompName", required = true)
    protected ACHCompNameType achCompName;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public MsgRqHdrCType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrCType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompNameType }
     *     
     */
    public ACHCompNameType getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompNameType }
     *     
     */
    public void setACHCompName(ACHCompNameType value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the actIntent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public JAXBElement<ActIntentType> getActIntent() {
        return actIntent;
    }

    /**
     * Sets the value of the actIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public void setActIntent(JAXBElement<ActIntentType> value) {
        this.actIntent = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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

}
