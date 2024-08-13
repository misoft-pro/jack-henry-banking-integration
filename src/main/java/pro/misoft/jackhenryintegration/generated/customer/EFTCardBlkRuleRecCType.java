
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
 * <p>Java class for EFTCardBlkRuleRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardBlkRuleRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlkRuleType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkRuleType_Type"/&gt;
 *         &lt;element name="AlgSymb" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAlgSymb_Type"/&gt;
 *         &lt;element name="BlkRuleValArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkRuleValArray_AType"/&gt;
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
@XmlType(name = "EFTCardBlkRuleRec_CType", propOrder = {
    "blkRuleType",
    "algSymb",
    "blkRuleValArray",
    "custom",
    "ver1",
    "any"
})
public class EFTCardBlkRuleRecCType {

    @XmlElement(name = "BlkRuleType", required = true)
    protected EFTCardBlkRuleTypeType blkRuleType;
    @XmlElement(name = "AlgSymb", required = true)
    protected EFTCardAlgSymbType algSymb;
    @XmlElement(name = "BlkRuleValArray", required = true)
    protected EFTCardBlkRuleValArrayAType blkRuleValArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the blkRuleType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBlkRuleTypeType }
     *     
     */
    public EFTCardBlkRuleTypeType getBlkRuleType() {
        return blkRuleType;
    }

    /**
     * Sets the value of the blkRuleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBlkRuleTypeType }
     *     
     */
    public void setBlkRuleType(EFTCardBlkRuleTypeType value) {
        this.blkRuleType = value;
    }

    /**
     * Gets the value of the algSymb property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAlgSymbType }
     *     
     */
    public EFTCardAlgSymbType getAlgSymb() {
        return algSymb;
    }

    /**
     * Sets the value of the algSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAlgSymbType }
     *     
     */
    public void setAlgSymb(EFTCardAlgSymbType value) {
        this.algSymb = value;
    }

    /**
     * Gets the value of the blkRuleValArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBlkRuleValArrayAType }
     *     
     */
    public EFTCardBlkRuleValArrayAType getBlkRuleValArray() {
        return blkRuleValArray;
    }

    /**
     * Sets the value of the blkRuleValArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBlkRuleValArrayAType }
     *     
     */
    public void setBlkRuleValArray(EFTCardBlkRuleValArrayAType value) {
        this.blkRuleValArray = value;
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
