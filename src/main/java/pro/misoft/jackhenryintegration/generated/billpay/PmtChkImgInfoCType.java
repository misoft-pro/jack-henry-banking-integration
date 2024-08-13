
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
 * A package of data related to a payment check
 *     image
 * 
 * <p>Java class for PmtChkImgInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtChkImgInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChkImgFormat" type="{http://jackhenry.com/jxchange/TPG/2008}ChkImgFormat_Type" minOccurs="0"/&gt;
 *         &lt;element name="FrontChkImgLength" type="{http://jackhenry.com/jxchange/TPG/2008}FrontChkImgLength_Type" minOccurs="0"/&gt;
 *         &lt;element name="FrontChkImg" type="{http://jackhenry.com/jxchange/TPG/2008}FrontChkImg_Type" minOccurs="0"/&gt;
 *         &lt;element name="BackChkImgLength" type="{http://jackhenry.com/jxchange/TPG/2008}BackChkImgLength_Type" minOccurs="0"/&gt;
 *         &lt;element name="BackChkImg" type="{http://jackhenry.com/jxchange/TPG/2008}BackChkImg_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtChkImgInfo_CType", propOrder = {
    "chkImgFormat",
    "frontChkImgLength",
    "frontChkImg",
    "backChkImgLength",
    "backChkImg",
    "custom",
    "ver1",
    "any"
})
public class PmtChkImgInfoCType {

    @XmlElement(name = "ChkImgFormat")
    protected ChkImgFormatType chkImgFormat;
    @XmlElement(name = "FrontChkImgLength")
    protected FrontChkImgLengthType frontChkImgLength;
    @XmlElement(name = "FrontChkImg")
    protected FrontChkImgType frontChkImg;
    @XmlElement(name = "BackChkImgLength")
    protected BackChkImgLengthType backChkImgLength;
    @XmlElement(name = "BackChkImg")
    protected BackChkImgType backChkImg;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the chkImgFormat property.
     * 
     * @return
     *     possible object is
     *     {@link ChkImgFormatType }
     *     
     */
    public ChkImgFormatType getChkImgFormat() {
        return chkImgFormat;
    }

    /**
     * Sets the value of the chkImgFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkImgFormatType }
     *     
     */
    public void setChkImgFormat(ChkImgFormatType value) {
        this.chkImgFormat = value;
    }

    /**
     * Gets the value of the frontChkImgLength property.
     * 
     * @return
     *     possible object is
     *     {@link FrontChkImgLengthType }
     *     
     */
    public FrontChkImgLengthType getFrontChkImgLength() {
        return frontChkImgLength;
    }

    /**
     * Sets the value of the frontChkImgLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrontChkImgLengthType }
     *     
     */
    public void setFrontChkImgLength(FrontChkImgLengthType value) {
        this.frontChkImgLength = value;
    }

    /**
     * Gets the value of the frontChkImg property.
     * 
     * @return
     *     possible object is
     *     {@link FrontChkImgType }
     *     
     */
    public FrontChkImgType getFrontChkImg() {
        return frontChkImg;
    }

    /**
     * Sets the value of the frontChkImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrontChkImgType }
     *     
     */
    public void setFrontChkImg(FrontChkImgType value) {
        this.frontChkImg = value;
    }

    /**
     * Gets the value of the backChkImgLength property.
     * 
     * @return
     *     possible object is
     *     {@link BackChkImgLengthType }
     *     
     */
    public BackChkImgLengthType getBackChkImgLength() {
        return backChkImgLength;
    }

    /**
     * Sets the value of the backChkImgLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackChkImgLengthType }
     *     
     */
    public void setBackChkImgLength(BackChkImgLengthType value) {
        this.backChkImgLength = value;
    }

    /**
     * Gets the value of the backChkImg property.
     * 
     * @return
     *     possible object is
     *     {@link BackChkImgType }
     *     
     */
    public BackChkImgType getBackChkImg() {
        return backChkImg;
    }

    /**
     * Sets the value of the backChkImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackChkImgType }
     *     
     */
    public void setBackChkImg(BackChkImgType value) {
        this.backChkImg = value;
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
