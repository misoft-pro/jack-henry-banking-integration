
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ElecMerPayeeCredInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecMerPayeeCredInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecMerCredType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerCredType_Type"/&gt;
 *         &lt;element name="ElecMerCredTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerCredTypeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerCredVal" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerCredVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerCredRegEx" type="{http://jackhenry.com/jxchange/TPG/2008}VrblRegEx_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ElecMerPayeeCredInfoRec_CType", propOrder = {
    "elecMerCredType",
    "elecMerCredTypeDesc",
    "elecMerCredVal",
    "elecMerCredRegEx",
    "custom",
    "ver1",
    "any"
})
public class ElecMerPayeeCredInfoRecCType {

    @XmlElement(name = "ElecMerCredType", required = true)
    protected ElecMerCredTypeType elecMerCredType;
    @XmlElement(name = "ElecMerCredTypeDesc")
    protected ElecMerCredTypeDescType elecMerCredTypeDesc;
    @XmlElement(name = "ElecMerCredVal")
    protected ElecMerCredValType elecMerCredVal;
    @XmlElement(name = "ElecMerCredRegEx")
    protected VrblRegExType elecMerCredRegEx;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elecMerCredType property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerCredTypeType }
     *     
     */
    public ElecMerCredTypeType getElecMerCredType() {
        return elecMerCredType;
    }

    /**
     * Sets the value of the elecMerCredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerCredTypeType }
     *     
     */
    public void setElecMerCredType(ElecMerCredTypeType value) {
        this.elecMerCredType = value;
    }

    /**
     * Gets the value of the elecMerCredTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerCredTypeDescType }
     *     
     */
    public ElecMerCredTypeDescType getElecMerCredTypeDesc() {
        return elecMerCredTypeDesc;
    }

    /**
     * Sets the value of the elecMerCredTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerCredTypeDescType }
     *     
     */
    public void setElecMerCredTypeDesc(ElecMerCredTypeDescType value) {
        this.elecMerCredTypeDesc = value;
    }

    /**
     * Gets the value of the elecMerCredVal property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerCredValType }
     *     
     */
    public ElecMerCredValType getElecMerCredVal() {
        return elecMerCredVal;
    }

    /**
     * Sets the value of the elecMerCredVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerCredValType }
     *     
     */
    public void setElecMerCredVal(ElecMerCredValType value) {
        this.elecMerCredVal = value;
    }

    /**
     * Gets the value of the elecMerCredRegEx property.
     * 
     * @return
     *     possible object is
     *     {@link VrblRegExType }
     *     
     */
    public VrblRegExType getElecMerCredRegEx() {
        return elecMerCredRegEx;
    }

    /**
     * Sets the value of the elecMerCredRegEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VrblRegExType }
     *     
     */
    public void setElecMerCredRegEx(VrblRegExType value) {
        this.elecMerCredRegEx = value;
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
     * {@link Element }
     * {@link Object }
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
