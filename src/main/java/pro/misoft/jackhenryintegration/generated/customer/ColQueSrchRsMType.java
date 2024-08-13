
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
 * <p>Java class for ColQueSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColQueSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="ColOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColQueCode" type="{http://jackhenry.com/jxchange/TPG/2008}ColQueCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColQueSrchRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}ColQueSrchRecArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ColQueSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "colOffCode",
    "colQueCode",
    "colQueSrchRecArray",
    "custom",
    "ver1",
    "any"
})
public class ColQueSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "ColOffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> colOffCode;
    @XmlElementRef(name = "ColQueCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ColQueCodeType> colQueCode;
    @XmlElementRef(name = "ColQueSrchRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ColQueSrchRecArrayAType> colQueSrchRecArray;
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
     * Gets the value of the colOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getColOffCode() {
        return colOffCode;
    }

    /**
     * Sets the value of the colOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setColOffCode(JAXBElement<OffCodeType> value) {
        this.colOffCode = value;
    }

    /**
     * Gets the value of the colQueCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ColQueCodeType }{@code >}
     *     
     */
    public JAXBElement<ColQueCodeType> getColQueCode() {
        return colQueCode;
    }

    /**
     * Sets the value of the colQueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ColQueCodeType }{@code >}
     *     
     */
    public void setColQueCode(JAXBElement<ColQueCodeType> value) {
        this.colQueCode = value;
    }

    /**
     * Gets the value of the colQueSrchRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ColQueSrchRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<ColQueSrchRecArrayAType> getColQueSrchRecArray() {
        return colQueSrchRecArray;
    }

    /**
     * Sets the value of the colQueSrchRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ColQueSrchRecArrayAType }{@code >}
     *     
     */
    public void setColQueSrchRecArray(JAXBElement<ColQueSrchRecArrayAType> value) {
        this.colQueSrchRecArray = value;
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
