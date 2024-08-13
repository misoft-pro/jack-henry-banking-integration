
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
 * <p>Java class for ColQueInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColQueInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColQueRec" type="{http://jackhenry.com/jxchange/TPG/2008}ColQueRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="ColQueDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ColQueDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ColQueInqRec_CType", propOrder = {
    "colQueRec",
    "colQueDesc",
    "colOffDesc",
    "custom",
    "ver1",
    "any"
})
public class ColQueInqRecCType {

    @XmlElement(name = "ColQueRec")
    protected ColQueRecCType colQueRec;
    @XmlElement(name = "ColQueDesc")
    protected ColQueDescType colQueDesc;
    @XmlElement(name = "ColOffDesc")
    protected OffDescType colOffDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the colQueRec property.
     * 
     * @return
     *     possible object is
     *     {@link ColQueRecCType }
     *     
     */
    public ColQueRecCType getColQueRec() {
        return colQueRec;
    }

    /**
     * Sets the value of the colQueRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColQueRecCType }
     *     
     */
    public void setColQueRec(ColQueRecCType value) {
        this.colQueRec = value;
    }

    /**
     * Gets the value of the colQueDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ColQueDescType }
     *     
     */
    public ColQueDescType getColQueDesc() {
        return colQueDesc;
    }

    /**
     * Sets the value of the colQueDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColQueDescType }
     *     
     */
    public void setColQueDesc(ColQueDescType value) {
        this.colQueDesc = value;
    }

    /**
     * Gets the value of the colOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getColOffDesc() {
        return colOffDesc;
    }

    /**
     * Sets the value of the colOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setColOffDesc(OffDescType value) {
        this.colOffDesc = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
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
