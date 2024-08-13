
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
 * <p>Java class for x_DepNSFODInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_DepNSFODInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepNSFODInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepNSFODInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="NSFAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostAFTNSFDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PostAFTNSFDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AllowReDepDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AllowReDepDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReDepNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ReDepNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ODStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ChgdOffAutoDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChgdOffAutoDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "x_DepNSFODInfo_CType", propOrder = {
    "depNSFODInfo",
    "nsfAmt",
    "chgODDesc",
    "postAFTNSFDesc",
    "allowReDepDesc",
    "reDepNotDesc",
    "odStatDesc",
    "custom",
    "ver1",
    "chgdOffAutoDesc",
    "ver2",
    "any"
})
public class XDepNSFODInfoCType {

    @XmlElement(name = "DepNSFODInfo")
    protected DepNSFODInfoCType depNSFODInfo;
    @XmlElement(name = "NSFAmt")
    protected NSFAmtType nsfAmt;
    @XmlElement(name = "ChgODDesc")
    protected ChgODDescType chgODDesc;
    @XmlElement(name = "PostAFTNSFDesc")
    protected PostAFTNSFDescType postAFTNSFDesc;
    @XmlElement(name = "AllowReDepDesc")
    protected AllowReDepDescType allowReDepDesc;
    @XmlElement(name = "ReDepNotDesc")
    protected ReDepNotDescType reDepNotDesc;
    @XmlElement(name = "ODStatDesc")
    protected ODStatDescType odStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ChgdOffAutoDesc")
    protected ChgdOffAutoDescType chgdOffAutoDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depNSFODInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepNSFODInfoCType }
     *     
     */
    public DepNSFODInfoCType getDepNSFODInfo() {
        return depNSFODInfo;
    }

    /**
     * Sets the value of the depNSFODInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepNSFODInfoCType }
     *     
     */
    public void setDepNSFODInfo(DepNSFODInfoCType value) {
        this.depNSFODInfo = value;
    }

    /**
     * Gets the value of the nsfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NSFAmtType }
     *     
     */
    public NSFAmtType getNSFAmt() {
        return nsfAmt;
    }

    /**
     * Sets the value of the nsfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFAmtType }
     *     
     */
    public void setNSFAmt(NSFAmtType value) {
        this.nsfAmt = value;
    }

    /**
     * Gets the value of the chgODDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChgODDescType }
     *     
     */
    public ChgODDescType getChgODDesc() {
        return chgODDesc;
    }

    /**
     * Sets the value of the chgODDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgODDescType }
     *     
     */
    public void setChgODDesc(ChgODDescType value) {
        this.chgODDesc = value;
    }

    /**
     * Gets the value of the postAFTNSFDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PostAFTNSFDescType }
     *     
     */
    public PostAFTNSFDescType getPostAFTNSFDesc() {
        return postAFTNSFDesc;
    }

    /**
     * Sets the value of the postAFTNSFDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAFTNSFDescType }
     *     
     */
    public void setPostAFTNSFDesc(PostAFTNSFDescType value) {
        this.postAFTNSFDesc = value;
    }

    /**
     * Gets the value of the allowReDepDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AllowReDepDescType }
     *     
     */
    public AllowReDepDescType getAllowReDepDesc() {
        return allowReDepDesc;
    }

    /**
     * Sets the value of the allowReDepDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowReDepDescType }
     *     
     */
    public void setAllowReDepDesc(AllowReDepDescType value) {
        this.allowReDepDesc = value;
    }

    /**
     * Gets the value of the reDepNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ReDepNotDescType }
     *     
     */
    public ReDepNotDescType getReDepNotDesc() {
        return reDepNotDesc;
    }

    /**
     * Sets the value of the reDepNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReDepNotDescType }
     *     
     */
    public void setReDepNotDesc(ReDepNotDescType value) {
        this.reDepNotDesc = value;
    }

    /**
     * Gets the value of the odStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ODStatDescType }
     *     
     */
    public ODStatDescType getODStatDesc() {
        return odStatDesc;
    }

    /**
     * Sets the value of the odStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODStatDescType }
     *     
     */
    public void setODStatDesc(ODStatDescType value) {
        this.odStatDesc = value;
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
     * Gets the value of the chgdOffAutoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChgdOffAutoDescType }
     *     
     */
    public ChgdOffAutoDescType getChgdOffAutoDesc() {
        return chgdOffAutoDesc;
    }

    /**
     * Sets the value of the chgdOffAutoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgdOffAutoDescType }
     *     
     */
    public void setChgdOffAutoDesc(ChgdOffAutoDescType value) {
        this.chgdOffAutoDesc = value;
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
