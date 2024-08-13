
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
 * <p>Java class for XferSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="ToOrFrom" type="{http://jackhenry.com/jxchange/TPG/2008}ToOrFrom_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferSrchRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrchRecArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="XferType" type="{http://jackhenry.com/jxchange/TPG/2008}XferType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHXferSrchRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferSrchRecArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FutXferSrchRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferSrchRecArray_AType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
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
@XmlType(name = "XferSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "toOrFrom",
    "xferSrchRecArray",
    "custom",
    "ver1",
    "xferType",
    "achXferSrchRecArray",
    "ver2",
    "futXferSrchRecArray",
    "ver3",
    "any"
})
public class XferSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "ToOrFrom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ToOrFromType> toOrFrom;
    @XmlElementRef(name = "XferSrchRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferSrchRecArrayAType> xferSrchRecArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "XferType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferTypeType> xferType;
    @XmlElementRef(name = "ACHXferSrchRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHXferSrchRecArrayAType> achXferSrchRecArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "FutXferSrchRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FutXferSrchRecArrayAType> futXferSrchRecArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
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
     * Gets the value of the toOrFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ToOrFromType }{@code >}
     *     
     */
    public JAXBElement<ToOrFromType> getToOrFrom() {
        return toOrFrom;
    }

    /**
     * Sets the value of the toOrFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ToOrFromType }{@code >}
     *     
     */
    public void setToOrFrom(JAXBElement<ToOrFromType> value) {
        this.toOrFrom = value;
    }

    /**
     * Gets the value of the xferSrchRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferSrchRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<XferSrchRecArrayAType> getXferSrchRecArray() {
        return xferSrchRecArray;
    }

    /**
     * Sets the value of the xferSrchRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferSrchRecArrayAType }{@code >}
     *     
     */
    public void setXferSrchRecArray(JAXBElement<XferSrchRecArrayAType> value) {
        this.xferSrchRecArray = value;
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
     * Gets the value of the xferType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferTypeType }{@code >}
     *     
     */
    public JAXBElement<XferTypeType> getXferType() {
        return xferType;
    }

    /**
     * Sets the value of the xferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferTypeType }{@code >}
     *     
     */
    public void setXferType(JAXBElement<XferTypeType> value) {
        this.xferType = value;
    }

    /**
     * Gets the value of the achXferSrchRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHXferSrchRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<ACHXferSrchRecArrayAType> getACHXferSrchRecArray() {
        return achXferSrchRecArray;
    }

    /**
     * Sets the value of the achXferSrchRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHXferSrchRecArrayAType }{@code >}
     *     
     */
    public void setACHXferSrchRecArray(JAXBElement<ACHXferSrchRecArrayAType> value) {
        this.achXferSrchRecArray = value;
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
     * Gets the value of the futXferSrchRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FutXferSrchRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<FutXferSrchRecArrayAType> getFutXferSrchRecArray() {
        return futXferSrchRecArray;
    }

    /**
     * Sets the value of the futXferSrchRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FutXferSrchRecArrayAType }{@code >}
     *     
     */
    public void setFutXferSrchRecArray(JAXBElement<FutXferSrchRecArrayAType> value) {
        this.futXferSrchRecArray = value;
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
