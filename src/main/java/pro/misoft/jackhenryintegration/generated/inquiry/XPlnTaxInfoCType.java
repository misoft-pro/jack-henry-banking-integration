
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
 * <p>Java class for x_PlnTaxInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_PlnTaxInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxPlnTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TaxPlnTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_PlnTaxInfo_CType", propOrder = {
    "taxPlnTaxInfo",
    "plnFedWithDesc",
    "plnStateWithDesc",
    "custom",
    "ver1",
    "any"
})
public class XPlnTaxInfoCType {

    @XmlElement(name = "TaxPlnTaxInfo")
    protected TaxPlnTaxInfoCType taxPlnTaxInfo;
    @XmlElement(name = "PlnFedWithDesc")
    protected PlnFedWithDescType plnFedWithDesc;
    @XmlElement(name = "PlnStateWithDesc")
    protected PlnStateWithDescType plnStateWithDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the taxPlnTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPlnTaxInfoCType }
     *     
     */
    public TaxPlnTaxInfoCType getTaxPlnTaxInfo() {
        return taxPlnTaxInfo;
    }

    /**
     * Sets the value of the taxPlnTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPlnTaxInfoCType }
     *     
     */
    public void setTaxPlnTaxInfo(TaxPlnTaxInfoCType value) {
        this.taxPlnTaxInfo = value;
    }

    /**
     * Gets the value of the plnFedWithDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PlnFedWithDescType }
     *     
     */
    public PlnFedWithDescType getPlnFedWithDesc() {
        return plnFedWithDesc;
    }

    /**
     * Sets the value of the plnFedWithDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnFedWithDescType }
     *     
     */
    public void setPlnFedWithDesc(PlnFedWithDescType value) {
        this.plnFedWithDesc = value;
    }

    /**
     * Gets the value of the plnStateWithDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PlnStateWithDescType }
     *     
     */
    public PlnStateWithDescType getPlnStateWithDesc() {
        return plnStateWithDesc;
    }

    /**
     * Sets the value of the plnStateWithDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnStateWithDescType }
     *     
     */
    public void setPlnStateWithDesc(PlnStateWithDescType value) {
        this.plnStateWithDesc = value;
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
