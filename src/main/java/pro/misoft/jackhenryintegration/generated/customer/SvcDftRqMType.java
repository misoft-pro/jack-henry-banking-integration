
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
 * <p>Java class for SvcDftRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDftRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="SvcName" type="{http://jackhenry.com/jxchange/TPG/2008}SvcName_Type"/&gt;
 *         &lt;element name="SvcCallLvl" type="{http://jackhenry.com/jxchange/TPG/2008}SvcCallLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="CriteriaArray" type="{http://jackhenry.com/jxchange/TPG/2008}CriteriaArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SvcOperName" type="{http://jackhenry.com/jxchange/TPG/2008}SvcOperName_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SvcDftRq_MType", propOrder = {
    "msgRqHdr",
    "svcName",
    "svcCallLvl",
    "criteriaArray",
    "custom",
    "ver1",
    "svcOperName",
    "ver2",
    "any"
})
public class SvcDftRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElement(name = "SvcName", required = true)
    protected SvcNameType svcName;
    @XmlElementRef(name = "SvcCallLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcCallLvlType> svcCallLvl;
    @XmlElementRef(name = "CriteriaArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CriteriaArrayAType> criteriaArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "SvcOperName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcOperNameType> svcOperName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
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
     * Gets the value of the svcName property.
     * 
     * @return
     *     possible object is
     *     {@link SvcNameType }
     *     
     */
    public SvcNameType getSvcName() {
        return svcName;
    }

    /**
     * Sets the value of the svcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcNameType }
     *     
     */
    public void setSvcName(SvcNameType value) {
        this.svcName = value;
    }

    /**
     * Gets the value of the svcCallLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcCallLvlType }{@code >}
     *     
     */
    public JAXBElement<SvcCallLvlType> getSvcCallLvl() {
        return svcCallLvl;
    }

    /**
     * Sets the value of the svcCallLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcCallLvlType }{@code >}
     *     
     */
    public void setSvcCallLvl(JAXBElement<SvcCallLvlType> value) {
        this.svcCallLvl = value;
    }

    /**
     * Gets the value of the criteriaArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CriteriaArrayAType }{@code >}
     *     
     */
    public JAXBElement<CriteriaArrayAType> getCriteriaArray() {
        return criteriaArray;
    }

    /**
     * Sets the value of the criteriaArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CriteriaArrayAType }{@code >}
     *     
     */
    public void setCriteriaArray(JAXBElement<CriteriaArrayAType> value) {
        this.criteriaArray = value;
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
     * Gets the value of the svcOperName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcOperNameType }{@code >}
     *     
     */
    public JAXBElement<SvcOperNameType> getSvcOperName() {
        return svcOperName;
    }

    /**
     * Sets the value of the svcOperName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcOperNameType }{@code >}
     *     
     */
    public void setSvcOperName(JAXBElement<SvcOperNameType> value) {
        this.svcOperName = value;
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
