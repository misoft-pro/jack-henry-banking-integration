
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for BrandInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrandCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrandDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrandDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrandCodeDftType" type="{http://jackhenry.com/jxchange/TPG/2008}BrandCodeDftType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BrandInfoRec_CType", propOrder = {
    "brandCode",
    "brandDesc",
    "brandCodeDftType",
    "custom",
    "ver1",
    "any"
})
public class BrandInfoRecCType {

    @XmlElement(name = "BrandCode")
    protected BrandCodeType brandCode;
    @XmlElement(name = "BrandDesc")
    protected BrandDescType brandDesc;
    @XmlElement(name = "BrandCodeDftType")
    protected BrandCodeDftTypeType brandCodeDftType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrandCodeType }
     *     
     */
    public BrandCodeType getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandCodeType }
     *     
     */
    public void setBrandCode(BrandCodeType value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the brandDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrandDescType }
     *     
     */
    public BrandDescType getBrandDesc() {
        return brandDesc;
    }

    /**
     * Sets the value of the brandDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandDescType }
     *     
     */
    public void setBrandDesc(BrandDescType value) {
        this.brandDesc = value;
    }

    /**
     * Gets the value of the brandCodeDftType property.
     * 
     * @return
     *     possible object is
     *     {@link BrandCodeDftTypeType }
     *     
     */
    public BrandCodeDftTypeType getBrandCodeDftType() {
        return brandCodeDftType;
    }

    /**
     * Sets the value of the brandCodeDftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandCodeDftTypeType }
     *     
     */
    public void setBrandCodeDftType(BrandCodeDftTypeType value) {
        this.brandCodeDftType = value;
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
