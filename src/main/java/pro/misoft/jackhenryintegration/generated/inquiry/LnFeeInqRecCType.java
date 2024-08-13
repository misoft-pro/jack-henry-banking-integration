
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
 * <p>Java class for LnFeeInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnFeeInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnFeeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeId" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnFeeInqRec_CType", propOrder = {
    "lnFeeInfo",
    "lnFeeCode",
    "lnFeeDesc",
    "lnFeeId",
    "lnFeeOffDesc",
    "custom",
    "ver1",
    "any"
})
public class LnFeeInqRecCType {

    @XmlElement(name = "LnFeeInfo")
    protected LnFeeInfoCType lnFeeInfo;
    @XmlElement(name = "LnFeeCode")
    protected LnFeeCodeType lnFeeCode;
    @XmlElement(name = "LnFeeDesc")
    protected LnFeeDescType lnFeeDesc;
    @XmlElement(name = "LnFeeId")
    protected LnFeeIdType lnFeeId;
    @XmlElement(name = "LnFeeOffDesc")
    protected OffDescType lnFeeOffDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeInfoCType }
     *     
     */
    public LnFeeInfoCType getLnFeeInfo() {
        return lnFeeInfo;
    }

    /**
     * Sets the value of the lnFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeInfoCType }
     *     
     */
    public void setLnFeeInfo(LnFeeInfoCType value) {
        this.lnFeeInfo = value;
    }

    /**
     * Gets the value of the lnFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeCodeType }
     *     
     */
    public LnFeeCodeType getLnFeeCode() {
        return lnFeeCode;
    }

    /**
     * Sets the value of the lnFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeCodeType }
     *     
     */
    public void setLnFeeCode(LnFeeCodeType value) {
        this.lnFeeCode = value;
    }

    /**
     * Gets the value of the lnFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeDescType }
     *     
     */
    public LnFeeDescType getLnFeeDesc() {
        return lnFeeDesc;
    }

    /**
     * Sets the value of the lnFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeDescType }
     *     
     */
    public void setLnFeeDesc(LnFeeDescType value) {
        this.lnFeeDesc = value;
    }

    /**
     * Gets the value of the lnFeeId property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeIdType }
     *     
     */
    public LnFeeIdType getLnFeeId() {
        return lnFeeId;
    }

    /**
     * Sets the value of the lnFeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeIdType }
     *     
     */
    public void setLnFeeId(LnFeeIdType value) {
        this.lnFeeId = value;
    }

    /**
     * Gets the value of the lnFeeOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getLnFeeOffDesc() {
        return lnFeeOffDesc;
    }

    /**
     * Sets the value of the lnFeeOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setLnFeeOffDesc(OffDescType value) {
        this.lnFeeOffDesc = value;
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
