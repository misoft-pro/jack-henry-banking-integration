
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PosPayItemInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosPayItemInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PosPayItemStatType" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayItemStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PosPayViolType" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayViolType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IsLockType" type="{http://jackhenry.com/jxchange/TPG/2008}IsLockType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PosPayViolArray" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayViolArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="RetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}RetRsnCode_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "PosPayItemInfoRec_CType", propOrder = {
    "posPayItemStatType",
    "posPayViolType",
    "isLockType",
    "custom",
    "ver1",
    "posPayViolArray",
    "ver2",
    "retRsnCode",
    "ver3",
    "any"
})
public class PosPayItemInfoRecCType {

    @XmlElement(name = "PosPayItemStatType")
    protected PosPayItemStatTypeType posPayItemStatType;
    @XmlElement(name = "PosPayViolType")
    protected PosPayViolTypeType posPayViolType;
    @XmlElement(name = "IsLockType")
    protected IsLockTypeType isLockType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PosPayViolArray")
    protected PosPayViolArrayAType posPayViolArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "RetRsnCode")
    protected RetRsnCodeType retRsnCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the posPayItemStatType property.
     * 
     * @return
     *     possible object is
     *     {@link PosPayItemStatTypeType }
     *     
     */
    public PosPayItemStatTypeType getPosPayItemStatType() {
        return posPayItemStatType;
    }

    /**
     * Sets the value of the posPayItemStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPayItemStatTypeType }
     *     
     */
    public void setPosPayItemStatType(PosPayItemStatTypeType value) {
        this.posPayItemStatType = value;
    }

    /**
     * Gets the value of the posPayViolType property.
     * 
     * @return
     *     possible object is
     *     {@link PosPayViolTypeType }
     *     
     */
    public PosPayViolTypeType getPosPayViolType() {
        return posPayViolType;
    }

    /**
     * Sets the value of the posPayViolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPayViolTypeType }
     *     
     */
    public void setPosPayViolType(PosPayViolTypeType value) {
        this.posPayViolType = value;
    }

    /**
     * Gets the value of the isLockType property.
     * 
     * @return
     *     possible object is
     *     {@link IsLockTypeType }
     *     
     */
    public IsLockTypeType getIsLockType() {
        return isLockType;
    }

    /**
     * Sets the value of the isLockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsLockTypeType }
     *     
     */
    public void setIsLockType(IsLockTypeType value) {
        this.isLockType = value;
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
     * Gets the value of the posPayViolArray property.
     * 
     * @return
     *     possible object is
     *     {@link PosPayViolArrayAType }
     *     
     */
    public PosPayViolArrayAType getPosPayViolArray() {
        return posPayViolArray;
    }

    /**
     * Sets the value of the posPayViolArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPayViolArrayAType }
     *     
     */
    public void setPosPayViolArray(PosPayViolArrayAType value) {
        this.posPayViolArray = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
    }

    /**
     * Gets the value of the retRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link RetRsnCodeType }
     *     
     */
    public RetRsnCodeType getRetRsnCode() {
        return retRsnCode;
    }

    /**
     * Sets the value of the retRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetRsnCodeType }
     *     
     */
    public void setRetRsnCode(RetRsnCodeType value) {
        this.retRsnCode = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
