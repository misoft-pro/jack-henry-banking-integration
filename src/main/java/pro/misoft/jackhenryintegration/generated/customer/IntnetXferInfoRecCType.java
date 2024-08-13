
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for IntnetXferInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetXferInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferAlw" type="{http://jackhenry.com/jxchange/TPG/2008}XferAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferTypeLvl" type="{http://jackhenry.com/jxchange/TPG/2008}XferTypeLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferDspType" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferDspType_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFromArray" type="{http://jackhenry.com/jxchange/TPG/2008}XferFromArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetXferInfoRec_CType", propOrder = {
    "xferAlw",
    "xferTypeLvl",
    "futXferDspType",
    "xferFromArray",
    "ver1",
    "any"
})
public class IntnetXferInfoRecCType {

    @XmlElement(name = "XferAlw")
    protected XferAlwType xferAlw;
    @XmlElement(name = "XferTypeLvl")
    protected XferTypeLvlType xferTypeLvl;
    @XmlElement(name = "FutXferDspType")
    protected FutXferDspTypeType futXferDspType;
    @XmlElement(name = "XferFromArray")
    protected XferFromArrayAType xferFromArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xferAlw property.
     * 
     * @return
     *     possible object is
     *     {@link XferAlwType }
     *     
     */
    public XferAlwType getXferAlw() {
        return xferAlw;
    }

    /**
     * Sets the value of the xferAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferAlwType }
     *     
     */
    public void setXferAlw(XferAlwType value) {
        this.xferAlw = value;
    }

    /**
     * Gets the value of the xferTypeLvl property.
     * 
     * @return
     *     possible object is
     *     {@link XferTypeLvlType }
     *     
     */
    public XferTypeLvlType getXferTypeLvl() {
        return xferTypeLvl;
    }

    /**
     * Sets the value of the xferTypeLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferTypeLvlType }
     *     
     */
    public void setXferTypeLvl(XferTypeLvlType value) {
        this.xferTypeLvl = value;
    }

    /**
     * Gets the value of the futXferDspType property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferDspTypeType }
     *     
     */
    public FutXferDspTypeType getFutXferDspType() {
        return futXferDspType;
    }

    /**
     * Sets the value of the futXferDspType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferDspTypeType }
     *     
     */
    public void setFutXferDspType(FutXferDspTypeType value) {
        this.futXferDspType = value;
    }

    /**
     * Gets the value of the xferFromArray property.
     * 
     * @return
     *     possible object is
     *     {@link XferFromArrayAType }
     *     
     */
    public XferFromArrayAType getXferFromArray() {
        return xferFromArray;
    }

    /**
     * Sets the value of the xferFromArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferFromArrayAType }
     *     
     */
    public void setXferFromArray(XferFromArrayAType value) {
        this.xferFromArray = value;
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
