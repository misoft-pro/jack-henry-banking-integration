
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
 * <p>Java class for EFTCardInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTSCCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSCCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTSCDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTSCDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardInfo_CType", propOrder = {
    "eftscCode",
    "eftscDesc",
    "eftCardInfoArray",
    "ver1",
    "any"
})
public class EFTCardInfoCType {

    @XmlElementRef(name = "EFTSCCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTSCCodeType> eftscCode;
    @XmlElementRef(name = "EFTSCDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTSCDescType> eftscDesc;
    @XmlElementRef(name = "EFTCardInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardInfoArrayAType> eftCardInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftscCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTSCCodeType }{@code >}
     *     
     */
    public JAXBElement<EFTSCCodeType> getEFTSCCode() {
        return eftscCode;
    }

    /**
     * Sets the value of the eftscCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTSCCodeType }{@code >}
     *     
     */
    public void setEFTSCCode(JAXBElement<EFTSCCodeType> value) {
        this.eftscCode = value;
    }

    /**
     * Gets the value of the eftscDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTSCDescType }{@code >}
     *     
     */
    public JAXBElement<EFTSCDescType> getEFTSCDesc() {
        return eftscDesc;
    }

    /**
     * Sets the value of the eftscDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTSCDescType }{@code >}
     *     
     */
    public void setEFTSCDesc(JAXBElement<EFTSCDescType> value) {
        this.eftscDesc = value;
    }

    /**
     * Gets the value of the eftCardInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<EFTCardInfoArrayAType> getEFTCardInfoArray() {
        return eftCardInfoArray;
    }

    /**
     * Sets the value of the eftCardInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardInfoArrayAType }{@code >}
     *     
     */
    public void setEFTCardInfoArray(JAXBElement<EFTCardInfoArrayAType> value) {
        this.eftCardInfoArray = value;
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
