
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
 * <p>Java class for ElemCanocRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElemCanocRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElemCanocVal" type="{http://jackhenry.com/jxchange/TPG/2008}ElemCanocVal_Type"/&gt;
 *         &lt;element name="ElemCanocValDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ElemCanocValDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CanocValInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}CanocValInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ElemCanocRec_CType", propOrder = {
    "elemCanocVal",
    "elemCanocValDesc",
    "canocValInfoArray",
    "ver1",
    "any"
})
public class ElemCanocRecCType {

    @XmlElement(name = "ElemCanocVal", required = true)
    protected ElemCanocValType elemCanocVal;
    @XmlElement(name = "ElemCanocValDesc")
    protected ElemCanocValDescType elemCanocValDesc;
    @XmlElement(name = "CanocValInfoArray")
    protected CanocValInfoArrayAType canocValInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elemCanocVal property.
     * 
     * @return
     *     possible object is
     *     {@link ElemCanocValType }
     *     
     */
    public ElemCanocValType getElemCanocVal() {
        return elemCanocVal;
    }

    /**
     * Sets the value of the elemCanocVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemCanocValType }
     *     
     */
    public void setElemCanocVal(ElemCanocValType value) {
        this.elemCanocVal = value;
    }

    /**
     * Gets the value of the elemCanocValDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ElemCanocValDescType }
     *     
     */
    public ElemCanocValDescType getElemCanocValDesc() {
        return elemCanocValDesc;
    }

    /**
     * Sets the value of the elemCanocValDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemCanocValDescType }
     *     
     */
    public void setElemCanocValDesc(ElemCanocValDescType value) {
        this.elemCanocValDesc = value;
    }

    /**
     * Gets the value of the canocValInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link CanocValInfoArrayAType }
     *     
     */
    public CanocValInfoArrayAType getCanocValInfoArray() {
        return canocValInfoArray;
    }

    /**
     * Sets the value of the canocValInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanocValInfoArrayAType }
     *     
     */
    public void setCanocValInfoArray(CanocValInfoArrayAType value) {
        this.canocValInfoArray = value;
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
