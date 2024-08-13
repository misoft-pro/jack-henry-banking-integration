
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
 * <p>Java class for SelRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelOrder" type="{http://jackhenry.com/jxchange/TPG/2008}SelOrder_Type"/&gt;
 *         &lt;element name="SelCode" type="{http://jackhenry.com/jxchange/TPG/2008}SelCode_Type"/&gt;
 *         &lt;element name="SelOperand" type="{http://jackhenry.com/jxchange/TPG/2008}SelOperand_Type"/&gt;
 *         &lt;element name="SelVal" type="{http://jackhenry.com/jxchange/TPG/2008}SelVal_Type"/&gt;
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
@XmlType(name = "SelRec_CType", propOrder = {
    "selOrder",
    "selCode",
    "selOperand",
    "selVal",
    "custom",
    "ver1",
    "any"
})
public class SelRecCType {

    @XmlElement(name = "SelOrder", required = true)
    protected SelOrderType selOrder;
    @XmlElement(name = "SelCode", required = true)
    protected SelCodeType selCode;
    @XmlElement(name = "SelOperand", required = true)
    protected SelOperandType selOperand;
    @XmlElement(name = "SelVal", required = true)
    protected SelValType selVal;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the selOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SelOrderType }
     *     
     */
    public SelOrderType getSelOrder() {
        return selOrder;
    }

    /**
     * Sets the value of the selOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelOrderType }
     *     
     */
    public void setSelOrder(SelOrderType value) {
        this.selOrder = value;
    }

    /**
     * Gets the value of the selCode property.
     * 
     * @return
     *     possible object is
     *     {@link SelCodeType }
     *     
     */
    public SelCodeType getSelCode() {
        return selCode;
    }

    /**
     * Sets the value of the selCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelCodeType }
     *     
     */
    public void setSelCode(SelCodeType value) {
        this.selCode = value;
    }

    /**
     * Gets the value of the selOperand property.
     * 
     * @return
     *     possible object is
     *     {@link SelOperandType }
     *     
     */
    public SelOperandType getSelOperand() {
        return selOperand;
    }

    /**
     * Sets the value of the selOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelOperandType }
     *     
     */
    public void setSelOperand(SelOperandType value) {
        this.selOperand = value;
    }

    /**
     * Gets the value of the selVal property.
     * 
     * @return
     *     possible object is
     *     {@link SelValType }
     *     
     */
    public SelValType getSelVal() {
        return selVal;
    }

    /**
     * Sets the value of the selVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelValType }
     *     
     */
    public void setSelVal(SelValType value) {
        this.selVal = value;
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
