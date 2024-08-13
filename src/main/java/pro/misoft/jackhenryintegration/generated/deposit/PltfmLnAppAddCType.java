
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * The complex for submitting a loan application. This complex element
 *                 is a documented choice statement. One of the complex objects must be submitted
 *                 depending upon the type of loan application.
 * 
 * <p>Java class for PltfmLnAppAdd_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmLnAppAdd_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmCommLnAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCommLnAppAdd_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmConsmLnAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmConsmLnAppAdd_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmResLnAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmResLnAppAdd_CType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmLnAppAdd_CType", propOrder = {
    "pltfmCommLnAppAdd",
    "pltfmConsmLnAppAdd",
    "pltfmResLnAppAdd",
    "custom",
    "ver1",
    "any"
})
public class PltfmLnAppAddCType {

    @XmlElement(name = "PltfmCommLnAppAdd")
    protected PltfmCommLnAppAddCType pltfmCommLnAppAdd;
    @XmlElement(name = "PltfmConsmLnAppAdd")
    protected PltfmConsmLnAppAddCType pltfmConsmLnAppAdd;
    @XmlElement(name = "PltfmResLnAppAdd")
    protected PltfmResLnAppAddCType pltfmResLnAppAdd;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pltfmCommLnAppAdd property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmCommLnAppAddCType }
     *     
     */
    public PltfmCommLnAppAddCType getPltfmCommLnAppAdd() {
        return pltfmCommLnAppAdd;
    }

    /**
     * Sets the value of the pltfmCommLnAppAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmCommLnAppAddCType }
     *     
     */
    public void setPltfmCommLnAppAdd(PltfmCommLnAppAddCType value) {
        this.pltfmCommLnAppAdd = value;
    }

    /**
     * Gets the value of the pltfmConsmLnAppAdd property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmConsmLnAppAddCType }
     *     
     */
    public PltfmConsmLnAppAddCType getPltfmConsmLnAppAdd() {
        return pltfmConsmLnAppAdd;
    }

    /**
     * Sets the value of the pltfmConsmLnAppAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmConsmLnAppAddCType }
     *     
     */
    public void setPltfmConsmLnAppAdd(PltfmConsmLnAppAddCType value) {
        this.pltfmConsmLnAppAdd = value;
    }

    /**
     * Gets the value of the pltfmResLnAppAdd property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmResLnAppAddCType }
     *     
     */
    public PltfmResLnAppAddCType getPltfmResLnAppAdd() {
        return pltfmResLnAppAdd;
    }

    /**
     * Sets the value of the pltfmResLnAppAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmResLnAppAddCType }
     *     
     */
    public void setPltfmResLnAppAdd(PltfmResLnAppAddCType value) {
        this.pltfmResLnAppAdd = value;
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
