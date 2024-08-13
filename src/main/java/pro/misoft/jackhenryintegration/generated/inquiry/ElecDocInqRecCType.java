
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
 * <p>Java class for ElecDocInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecDocInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecDocRec" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="ElecDocEnrollId" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocEnrollId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDocStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDocPrtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocPrtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItemsFrntBackDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ImgItemsFrntBackDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ElecDocInqRec_CType", propOrder = {
    "elecDocRec",
    "elecDocEnrollId",
    "elecDocDesc",
    "elecDocStatDesc",
    "elecDocPrtDesc",
    "imgItemsFrntBackDesc",
    "customElecDocInqRec",
    "ver1",
    "any"
})
public class ElecDocInqRecCType {

    @XmlElement(name = "ElecDocRec")
    protected ElecDocRecCType elecDocRec;
    @XmlElement(name = "ElecDocEnrollId")
    protected ElecDocEnrollIdType elecDocEnrollId;
    @XmlElement(name = "ElecDocDesc")
    protected ElecDocDescType elecDocDesc;
    @XmlElement(name = "ElecDocStatDesc")
    protected ElecDocStatDescType elecDocStatDesc;
    @XmlElement(name = "ElecDocPrtDesc")
    protected ElecDocPrtDescType elecDocPrtDesc;
    @XmlElement(name = "ImgItemsFrntBackDesc")
    protected ImgItemsFrntBackDescType imgItemsFrntBackDesc;
    @XmlElement(name = "CustomElecDocInqRec")
    protected CustomCType customElecDocInqRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elecDocRec property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocRecCType }
     *     
     */
    public ElecDocRecCType getElecDocRec() {
        return elecDocRec;
    }

    /**
     * Sets the value of the elecDocRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocRecCType }
     *     
     */
    public void setElecDocRec(ElecDocRecCType value) {
        this.elecDocRec = value;
    }

    /**
     * Gets the value of the elecDocEnrollId property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocEnrollIdType }
     *     
     */
    public ElecDocEnrollIdType getElecDocEnrollId() {
        return elecDocEnrollId;
    }

    /**
     * Sets the value of the elecDocEnrollId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocEnrollIdType }
     *     
     */
    public void setElecDocEnrollId(ElecDocEnrollIdType value) {
        this.elecDocEnrollId = value;
    }

    /**
     * Gets the value of the elecDocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocDescType }
     *     
     */
    public ElecDocDescType getElecDocDesc() {
        return elecDocDesc;
    }

    /**
     * Sets the value of the elecDocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocDescType }
     *     
     */
    public void setElecDocDesc(ElecDocDescType value) {
        this.elecDocDesc = value;
    }

    /**
     * Gets the value of the elecDocStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocStatDescType }
     *     
     */
    public ElecDocStatDescType getElecDocStatDesc() {
        return elecDocStatDesc;
    }

    /**
     * Sets the value of the elecDocStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocStatDescType }
     *     
     */
    public void setElecDocStatDesc(ElecDocStatDescType value) {
        this.elecDocStatDesc = value;
    }

    /**
     * Gets the value of the elecDocPrtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDocPrtDescType }
     *     
     */
    public ElecDocPrtDescType getElecDocPrtDesc() {
        return elecDocPrtDesc;
    }

    /**
     * Sets the value of the elecDocPrtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDocPrtDescType }
     *     
     */
    public void setElecDocPrtDesc(ElecDocPrtDescType value) {
        this.elecDocPrtDesc = value;
    }

    /**
     * Gets the value of the imgItemsFrntBackDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ImgItemsFrntBackDescType }
     *     
     */
    public ImgItemsFrntBackDescType getImgItemsFrntBackDesc() {
        return imgItemsFrntBackDesc;
    }

    /**
     * Sets the value of the imgItemsFrntBackDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgItemsFrntBackDescType }
     *     
     */
    public void setImgItemsFrntBackDesc(ImgItemsFrntBackDescType value) {
        this.imgItemsFrntBackDesc = value;
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
