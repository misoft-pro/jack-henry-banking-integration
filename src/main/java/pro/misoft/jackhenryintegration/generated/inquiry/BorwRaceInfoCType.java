
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
 * <p>Java class for BorwRaceInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorwRaceInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BorwRaceType" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwRaceCode" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BorwRaceDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="BorwRaceVal" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceVal_Type" minOccurs="0"/&gt;
 *             &lt;element name="BorwRaceColType" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceColType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "BorwRaceInfo_CType", propOrder = {
    "borwRaceType",
    "borwRaceCode",
    "ver1",
    "borwRaceDesc",
    "ver2",
    "borwRaceVal",
    "borwRaceColType",
    "ver3",
    "any"
})
public class BorwRaceInfoCType {

    @XmlElementRef(name = "BorwRaceType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwRaceTypeType> borwRaceType;
    @XmlElementRef(name = "BorwRaceCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwRaceCodeType> borwRaceCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BorwRaceDesc")
    protected BorwRaceDescType borwRaceDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "BorwRaceVal")
    protected BorwRaceValType borwRaceVal;
    @XmlElement(name = "BorwRaceColType")
    protected BorwRaceColTypeType borwRaceColType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the borwRaceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceTypeType }{@code >}
     *     
     */
    public JAXBElement<BorwRaceTypeType> getBorwRaceType() {
        return borwRaceType;
    }

    /**
     * Sets the value of the borwRaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceTypeType }{@code >}
     *     
     */
    public void setBorwRaceType(JAXBElement<BorwRaceTypeType> value) {
        this.borwRaceType = value;
    }

    /**
     * Gets the value of the borwRaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceCodeType }{@code >}
     *     
     */
    public JAXBElement<BorwRaceCodeType> getBorwRaceCode() {
        return borwRaceCode;
    }

    /**
     * Sets the value of the borwRaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceCodeType }{@code >}
     *     
     */
    public void setBorwRaceCode(JAXBElement<BorwRaceCodeType> value) {
        this.borwRaceCode = value;
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
     * Gets the value of the borwRaceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BorwRaceDescType }
     *     
     */
    public BorwRaceDescType getBorwRaceDesc() {
        return borwRaceDesc;
    }

    /**
     * Sets the value of the borwRaceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwRaceDescType }
     *     
     */
    public void setBorwRaceDesc(BorwRaceDescType value) {
        this.borwRaceDesc = value;
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
     * Gets the value of the borwRaceVal property.
     * 
     * @return
     *     possible object is
     *     {@link BorwRaceValType }
     *     
     */
    public BorwRaceValType getBorwRaceVal() {
        return borwRaceVal;
    }

    /**
     * Sets the value of the borwRaceVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwRaceValType }
     *     
     */
    public void setBorwRaceVal(BorwRaceValType value) {
        this.borwRaceVal = value;
    }

    /**
     * Gets the value of the borwRaceColType property.
     * 
     * @return
     *     possible object is
     *     {@link BorwRaceColTypeType }
     *     
     */
    public BorwRaceColTypeType getBorwRaceColType() {
        return borwRaceColType;
    }

    /**
     * Sets the value of the borwRaceColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwRaceColTypeType }
     *     
     */
    public void setBorwRaceColType(BorwRaceColTypeType value) {
        this.borwRaceColType = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
