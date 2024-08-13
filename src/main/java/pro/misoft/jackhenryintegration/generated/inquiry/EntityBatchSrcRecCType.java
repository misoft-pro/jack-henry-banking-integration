
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
 * <p>Java class for EntityBatchSrcRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityBatchSrcRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityBatchSrcType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityBatchSrcType_Type"/&gt;
 *         &lt;element name="EntityNameArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityNameArray_AType"/&gt;
 *         &lt;element name="SelArray" type="{http://jackhenry.com/jxchange/TPG/2008}SelArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EntityBatchSrcRec_CType", propOrder = {
    "entityBatchSrcType",
    "entityNameArray",
    "selArray",
    "custom",
    "ver1",
    "any"
})
public class EntityBatchSrcRecCType {

    @XmlElement(name = "EntityBatchSrcType", required = true)
    protected EntityBatchSrcTypeType entityBatchSrcType;
    @XmlElement(name = "EntityNameArray", required = true)
    protected EntityNameArrayAType entityNameArray;
    @XmlElementRef(name = "SelArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SelArrayAType> selArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the entityBatchSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityBatchSrcTypeType }
     *     
     */
    public EntityBatchSrcTypeType getEntityBatchSrcType() {
        return entityBatchSrcType;
    }

    /**
     * Sets the value of the entityBatchSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityBatchSrcTypeType }
     *     
     */
    public void setEntityBatchSrcType(EntityBatchSrcTypeType value) {
        this.entityBatchSrcType = value;
    }

    /**
     * Gets the value of the entityNameArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNameArrayAType }
     *     
     */
    public EntityNameArrayAType getEntityNameArray() {
        return entityNameArray;
    }

    /**
     * Sets the value of the entityNameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNameArrayAType }
     *     
     */
    public void setEntityNameArray(EntityNameArrayAType value) {
        this.entityNameArray = value;
    }

    /**
     * Gets the value of the selArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SelArrayAType }{@code >}
     *     
     */
    public JAXBElement<SelArrayAType> getSelArray() {
        return selArray;
    }

    /**
     * Sets the value of the selArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SelArrayAType }{@code >}
     *     
     */
    public void setSelArray(JAXBElement<SelArrayAType> value) {
        this.selArray = value;
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
