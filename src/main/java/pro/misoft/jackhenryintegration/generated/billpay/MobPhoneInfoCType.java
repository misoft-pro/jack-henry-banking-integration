
package pro.misoft.jackhenryintegration.generated.billpay;

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
 * <p>Java class for MobPhoneInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobPhoneInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobPrvdCode" type="{http://jackhenry.com/jxchange/TPG/2008}MobPrvdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MobPrvdCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MobPrvdCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MobPrvdDom" type="{http://jackhenry.com/jxchange/TPG/2008}MobPrvdDom_Type" minOccurs="0"/&gt;
 *         &lt;element name="MobBB" type="{http://jackhenry.com/jxchange/TPG/2008}MobBB_Type" minOccurs="0"/&gt;
 *         &lt;element name="MobSendTestText" type="{http://jackhenry.com/jxchange/TPG/2008}MobSendTestText_Type" minOccurs="0"/&gt;
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
@XmlType(name = "MobPhoneInfo_CType", propOrder = {
    "mobPrvdCode",
    "mobPrvdCodeDesc",
    "mobPrvdDom",
    "mobBB",
    "mobSendTestText",
    "ver1",
    "any"
})
public class MobPhoneInfoCType {

    @XmlElementRef(name = "MobPrvdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MobPrvdCodeType> mobPrvdCode;
    @XmlElementRef(name = "MobPrvdCodeDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MobPrvdCodeDescType> mobPrvdCodeDesc;
    @XmlElementRef(name = "MobPrvdDom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MobPrvdDomType> mobPrvdDom;
    @XmlElementRef(name = "MobBB", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MobBBType> mobBB;
    @XmlElementRef(name = "MobSendTestText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MobSendTestTextType> mobSendTestText;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the mobPrvdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobPrvdCodeType }{@code >}
     *     
     */
    public JAXBElement<MobPrvdCodeType> getMobPrvdCode() {
        return mobPrvdCode;
    }

    /**
     * Sets the value of the mobPrvdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobPrvdCodeType }{@code >}
     *     
     */
    public void setMobPrvdCode(JAXBElement<MobPrvdCodeType> value) {
        this.mobPrvdCode = value;
    }

    /**
     * Gets the value of the mobPrvdCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobPrvdCodeDescType }{@code >}
     *     
     */
    public JAXBElement<MobPrvdCodeDescType> getMobPrvdCodeDesc() {
        return mobPrvdCodeDesc;
    }

    /**
     * Sets the value of the mobPrvdCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobPrvdCodeDescType }{@code >}
     *     
     */
    public void setMobPrvdCodeDesc(JAXBElement<MobPrvdCodeDescType> value) {
        this.mobPrvdCodeDesc = value;
    }

    /**
     * Gets the value of the mobPrvdDom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobPrvdDomType }{@code >}
     *     
     */
    public JAXBElement<MobPrvdDomType> getMobPrvdDom() {
        return mobPrvdDom;
    }

    /**
     * Sets the value of the mobPrvdDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobPrvdDomType }{@code >}
     *     
     */
    public void setMobPrvdDom(JAXBElement<MobPrvdDomType> value) {
        this.mobPrvdDom = value;
    }

    /**
     * Gets the value of the mobBB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobBBType }{@code >}
     *     
     */
    public JAXBElement<MobBBType> getMobBB() {
        return mobBB;
    }

    /**
     * Sets the value of the mobBB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobBBType }{@code >}
     *     
     */
    public void setMobBB(JAXBElement<MobBBType> value) {
        this.mobBB = value;
    }

    /**
     * Gets the value of the mobSendTestText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobSendTestTextType }{@code >}
     *     
     */
    public JAXBElement<MobSendTestTextType> getMobSendTestText() {
        return mobSendTestText;
    }

    /**
     * Sets the value of the mobSendTestText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobSendTestTextType }{@code >}
     *     
     */
    public void setMobSendTestText(JAXBElement<MobSendTestTextType> value) {
        this.mobSendTestText = value;
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
     * {@link Element }
     * {@link Object }
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
