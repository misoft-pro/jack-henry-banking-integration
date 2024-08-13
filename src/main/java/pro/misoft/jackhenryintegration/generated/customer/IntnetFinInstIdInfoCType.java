
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
 * <p>Java class for IntnetFinInstIdInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstIdInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowIntnetIdDup" type="{http://jackhenry.com/jxchange/TPG/2008}AllowIntnetIdDup_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstPswdId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstPswdId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstAcctIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstAcctIdArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IntnetFinInstACHXferArray" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstACHXferArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetFinInstIdInfo_CType", propOrder = {
    "allowIntnetIdDup",
    "intnetFinInstPswdId",
    "intnetFinInstAcctIdArray",
    "ver1",
    "intnetFinInstACHXferArray",
    "ver2",
    "any"
})
public class IntnetFinInstIdInfoCType {

    @XmlElementRef(name = "AllowIntnetIdDup", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AllowIntnetIdDupType> allowIntnetIdDup;
    @XmlElementRef(name = "IntnetFinInstPswdId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntnetFinInstPswdIdType> intnetFinInstPswdId;
    @XmlElementRef(name = "IntnetFinInstAcctIdArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntnetFinInstAcctIdArrayAType> intnetFinInstAcctIdArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "IntnetFinInstACHXferArray")
    protected IntnetFinInstACHXferArrayAType intnetFinInstACHXferArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the allowIntnetIdDup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AllowIntnetIdDupType }{@code >}
     *     
     */
    public JAXBElement<AllowIntnetIdDupType> getAllowIntnetIdDup() {
        return allowIntnetIdDup;
    }

    /**
     * Sets the value of the allowIntnetIdDup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AllowIntnetIdDupType }{@code >}
     *     
     */
    public void setAllowIntnetIdDup(JAXBElement<AllowIntnetIdDupType> value) {
        this.allowIntnetIdDup = value;
    }

    /**
     * Gets the value of the intnetFinInstPswdId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstPswdIdType }{@code >}
     *     
     */
    public JAXBElement<IntnetFinInstPswdIdType> getIntnetFinInstPswdId() {
        return intnetFinInstPswdId;
    }

    /**
     * Sets the value of the intnetFinInstPswdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstPswdIdType }{@code >}
     *     
     */
    public void setIntnetFinInstPswdId(JAXBElement<IntnetFinInstPswdIdType> value) {
        this.intnetFinInstPswdId = value;
    }

    /**
     * Gets the value of the intnetFinInstAcctIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstAcctIdArrayAType }{@code >}
     *     
     */
    public JAXBElement<IntnetFinInstAcctIdArrayAType> getIntnetFinInstAcctIdArray() {
        return intnetFinInstAcctIdArray;
    }

    /**
     * Sets the value of the intnetFinInstAcctIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstAcctIdArrayAType }{@code >}
     *     
     */
    public void setIntnetFinInstAcctIdArray(JAXBElement<IntnetFinInstAcctIdArrayAType> value) {
        this.intnetFinInstAcctIdArray = value;
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
     * Gets the value of the intnetFinInstACHXferArray property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstACHXferArrayAType }
     *     
     */
    public IntnetFinInstACHXferArrayAType getIntnetFinInstACHXferArray() {
        return intnetFinInstACHXferArray;
    }

    /**
     * Sets the value of the intnetFinInstACHXferArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstACHXferArrayAType }
     *     
     */
    public void setIntnetFinInstACHXferArray(IntnetFinInstACHXferArrayAType value) {
        this.intnetFinInstACHXferArray = value;
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
