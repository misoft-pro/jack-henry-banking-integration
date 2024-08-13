
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
 * <p>Java class for ColIncmInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColIncmInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncmName" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwType" type="{http://jackhenry.com/jxchange/TPG/2008}BorwType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ColIncmInfo_CType", propOrder = {
    "incmName",
    "borwType",
    "incmAmt",
    "custom",
    "ver1",
    "any"
})
public class ColIncmInfoCType {

    @XmlElement(name = "IncmName")
    protected RmkType incmName;
    @XmlElement(name = "BorwType")
    protected BorwTypeType borwType;
    @XmlElement(name = "IncmAmt")
    protected AmtType incmAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the incmName property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getIncmName() {
        return incmName;
    }

    /**
     * Sets the value of the incmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setIncmName(RmkType value) {
        this.incmName = value;
    }

    /**
     * Gets the value of the borwType property.
     * 
     * @return
     *     possible object is
     *     {@link BorwTypeType }
     *     
     */
    public BorwTypeType getBorwType() {
        return borwType;
    }

    /**
     * Sets the value of the borwType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwTypeType }
     *     
     */
    public void setBorwType(BorwTypeType value) {
        this.borwType = value;
    }

    /**
     * Gets the value of the incmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getIncmAmt() {
        return incmAmt;
    }

    /**
     * Sets the value of the incmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setIncmAmt(AmtType value) {
        this.incmAmt = value;
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
