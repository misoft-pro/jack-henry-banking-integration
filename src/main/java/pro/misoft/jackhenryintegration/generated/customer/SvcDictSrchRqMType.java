
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
 * <p>Java class for SvcDictSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDictSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="SvcDictName" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictName_Type"/&gt;
 *         &lt;element name="SvcDictType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictType_Type"/&gt;
 *         &lt;element name="ElemName" type="{http://jackhenry.com/jxchange/TPG/2008}ElemName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcDictFilterArray" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictFilterArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="IncXtendElemArray" type="{http://jackhenry.com/jxchange/TPG/2008}IncXtendElem_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SvcDictSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "svcDictName",
    "svcDictType",
    "elemName",
    "svcDictFilterArray",
    "incXtendElemArray",
    "ver1",
    "any"
})
public class SvcDictSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElement(name = "SvcDictName", required = true)
    protected SvcDictNameType svcDictName;
    @XmlElement(name = "SvcDictType", required = true)
    protected SvcDictTypeType svcDictType;
    @XmlElementRef(name = "ElemName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ElemNameType> elemName;
    @XmlElementRef(name = "SvcDictFilterArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcDictFilterArrayAType> svcDictFilterArray;
    @XmlElementRef(name = "IncXtendElemArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncXtendElemAType> incXtendElemArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public SrchMsgRqHdrCType getSrchMsgRqHdr() {
        return srchMsgRqHdr;
    }

    /**
     * Sets the value of the srchMsgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public void setSrchMsgRqHdr(SrchMsgRqHdrCType value) {
        this.srchMsgRqHdr = value;
    }

    /**
     * Gets the value of the svcDictName property.
     * 
     * @return
     *     possible object is
     *     {@link SvcDictNameType }
     *     
     */
    public SvcDictNameType getSvcDictName() {
        return svcDictName;
    }

    /**
     * Sets the value of the svcDictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcDictNameType }
     *     
     */
    public void setSvcDictName(SvcDictNameType value) {
        this.svcDictName = value;
    }

    /**
     * Gets the value of the svcDictType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcDictTypeType }
     *     
     */
    public SvcDictTypeType getSvcDictType() {
        return svcDictType;
    }

    /**
     * Sets the value of the svcDictType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcDictTypeType }
     *     
     */
    public void setSvcDictType(SvcDictTypeType value) {
        this.svcDictType = value;
    }

    /**
     * Gets the value of the elemName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElemNameType }{@code >}
     *     
     */
    public JAXBElement<ElemNameType> getElemName() {
        return elemName;
    }

    /**
     * Sets the value of the elemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElemNameType }{@code >}
     *     
     */
    public void setElemName(JAXBElement<ElemNameType> value) {
        this.elemName = value;
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
     * Gets the value of the incXtendElemArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncXtendElemAType }{@code >}
     *     
     */
    public JAXBElement<IncXtendElemAType> getIncXtendElemArray() {
        return incXtendElemArray;
    }

    /**
     * Sets the value of the incXtendElemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncXtendElemAType }{@code >}
     *     
     */
    public void setIncXtendElemArray(JAXBElement<IncXtendElemAType> value) {
        this.incXtendElemArray = value;
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
