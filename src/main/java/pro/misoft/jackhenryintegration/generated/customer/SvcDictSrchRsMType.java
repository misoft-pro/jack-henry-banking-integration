
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
 * <p>Java class for SvcDictSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDictSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="SvcDictName" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcDictType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcDictFilterArray" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictFilterArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SvcDictInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_SvcPrvdErrArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_SvcPrvdErrArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SvcDictSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "svcDictName",
    "svcDictType",
    "svcDictFilterArray",
    "svcDictInfoArray",
    "xSvcPrvdErrArray",
    "custom",
    "ver1",
    "any"
})
public class SvcDictSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "SvcDictName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcDictNameType> svcDictName;
    @XmlElementRef(name = "SvcDictType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcDictTypeType> svcDictType;
    @XmlElementRef(name = "SvcDictFilterArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcDictFilterArrayAType> svcDictFilterArray;
    @XmlElementRef(name = "SvcDictInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcDictInfoArrayAType> svcDictInfoArray;
    @XmlElementRef(name = "x_SvcPrvdErrArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XSvcPrvdErrArrayAType> xSvcPrvdErrArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public SrchMsgRsHdrCType getSrchMsgRsHdr() {
        return srchMsgRsHdr;
    }

    /**
     * Sets the value of the srchMsgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public void setSrchMsgRsHdr(SrchMsgRsHdrCType value) {
        this.srchMsgRsHdr = value;
    }

    /**
     * Gets the value of the svcDictName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcDictNameType }{@code >}
     *     
     */
    public JAXBElement<SvcDictNameType> getSvcDictName() {
        return svcDictName;
    }

    /**
     * Sets the value of the svcDictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcDictNameType }{@code >}
     *     
     */
    public void setSvcDictName(JAXBElement<SvcDictNameType> value) {
        this.svcDictName = value;
    }

    /**
     * Gets the value of the svcDictType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcDictTypeType }{@code >}
     *     
     */
    public JAXBElement<SvcDictTypeType> getSvcDictType() {
        return svcDictType;
    }

    /**
     * Sets the value of the svcDictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcDictTypeType }{@code >}
     *     
     */
    public void setSvcDictType(JAXBElement<SvcDictTypeType> value) {
        this.svcDictType = value;
    }

    /**
     * Gets the value of the svcDictFilterArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcDictFilterArrayAType }{@code >}
     *     
     */
    public JAXBElement<SvcDictFilterArrayAType> getSvcDictFilterArray() {
        return svcDictFilterArray;
    }

    /**
     * Sets the value of the svcDictFilterArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcDictFilterArrayAType }{@code >}
     *     
     */
    public void setSvcDictFilterArray(JAXBElement<SvcDictFilterArrayAType> value) {
        this.svcDictFilterArray = value;
    }

    /**
     * Gets the value of the svcDictInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcDictInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<SvcDictInfoArrayAType> getSvcDictInfoArray() {
        return svcDictInfoArray;
    }

    /**
     * Sets the value of the svcDictInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcDictInfoArrayAType }{@code >}
     *     
     */
    public void setSvcDictInfoArray(JAXBElement<SvcDictInfoArrayAType> value) {
        this.svcDictInfoArray = value;
    }

    /**
     * Gets the value of the xSvcPrvdErrArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XSvcPrvdErrArrayAType }{@code >}
     *     
     */
    public JAXBElement<XSvcPrvdErrArrayAType> getXSvcPrvdErrArray() {
        return xSvcPrvdErrArray;
    }

    /**
     * Sets the value of the xSvcPrvdErrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XSvcPrvdErrArrayAType }{@code >}
     *     
     */
    public void setXSvcPrvdErrArray(JAXBElement<XSvcPrvdErrArrayAType> value) {
        this.xSvcPrvdErrArray = value;
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
