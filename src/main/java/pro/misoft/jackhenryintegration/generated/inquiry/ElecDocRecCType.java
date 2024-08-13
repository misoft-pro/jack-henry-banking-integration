
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
 * <p>Java class for ElecDocRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecDocRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecDocCode" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDocStat" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDocPrtCode" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocPrtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItemsFrntBackCode" type="{http://jackhenry.com/jxchange/TPG/2008}ImgItemsFrntBackCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CustomElecDocInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "ElecDocRec_CType", propOrder = {
    "elecDocCode",
    "elecDocStat",
    "elecDocPrtCode",
    "imgItemsFrntBackCode",
    "emailArray",
    "customElecDocInqRec",
    "ver1",
    "any"
})
public class ElecDocRecCType {

    @XmlElement(name = "ElecDocCode")
    protected ElecDocCodeType elecDocCode;
    @XmlElement(name = "ElecDocStat")
    protected ElecDocStatType elecDocStat;
    @XmlElement(name = "ElecDocPrtCode")
    protected ElecDocPrtCodeType elecDocPrtCode;
    @XmlElement(name = "ImgItemsFrntBackCode")
    protected ImgItemsFrntBackCodeType imgItemsFrntBackCode;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "CustomElecDocInqRec")
    protected CustomCType customElecDocInqRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elecDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocCodeType }
     *     
     */
    public ElecDocCodeType getElecDocCode() {
        return elecDocCode;
    }

    /**
     * Sets the value of the elecDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocCodeType }
     *     
     */
    public void setElecDocCode(ElecDocCodeType value) {
        this.elecDocCode = value;
    }

    /**
     * Gets the value of the elecDocStat property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocStatType }
     *     
     */
    public ElecDocStatType getElecDocStat() {
        return elecDocStat;
    }

    /**
     * Sets the value of the elecDocStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocStatType }
     *     
     */
    public void setElecDocStat(ElecDocStatType value) {
        this.elecDocStat = value;
    }

    /**
     * Gets the value of the elecDocPrtCode property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocPrtCodeType }
     *     
     */
    public ElecDocPrtCodeType getElecDocPrtCode() {
        return elecDocPrtCode;
    }

    /**
     * Sets the value of the elecDocPrtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocPrtCodeType }
     *     
     */
    public void setElecDocPrtCode(ElecDocPrtCodeType value) {
        this.elecDocPrtCode = value;
    }

    /**
     * Gets the value of the imgItemsFrntBackCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImgItemsFrntBackCodeType }
     *     
     */
    public ImgItemsFrntBackCodeType getImgItemsFrntBackCode() {
        return imgItemsFrntBackCode;
    }

    /**
     * Sets the value of the imgItemsFrntBackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgItemsFrntBackCodeType }
     *     
     */
    public void setImgItemsFrntBackCode(ImgItemsFrntBackCodeType value) {
        this.imgItemsFrntBackCode = value;
    }

    /**
     * Gets the value of the emailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getEmailArray() {
        return emailArray;
    }

    /**
     * Sets the value of the emailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setEmailArray(EmailArrayAType value) {
        this.emailArray = value;
    }

    /**
     * Gets the value of the customElecDocInqRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomElecDocInqRec() {
        return customElecDocInqRec;
    }

    /**
     * Sets the value of the customElecDocInqRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomElecDocInqRec(CustomCType value) {
        this.customElecDocInqRec = value;
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
