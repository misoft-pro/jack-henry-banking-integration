
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
 * <p>Java class for ImgItemsInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImgItemsInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrioritySeq" type="{http://jackhenry.com/jxchange/TPG/2008}PrioritySeq_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgTitle" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItem" type="{http://jackhenry.com/jxchange/TPG/2008}PrstImg_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItemFormat" type="{http://jackhenry.com/jxchange/TPG/2008}PrstImgFormatType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ImgItemsInfoRec_CType", propOrder = {
    "prioritySeq",
    "imgTitle",
    "imgItem",
    "imgItemFormat",
    "ver1",
    "any"
})
public class ImgItemsInfoRecCType {

    @XmlElement(name = "PrioritySeq")
    protected PrioritySeqType prioritySeq;
    @XmlElement(name = "ImgTitle")
    protected RmkType imgTitle;
    @XmlElement(name = "ImgItem")
    protected PrstImgType imgItem;
    @XmlElement(name = "ImgItemFormat")
    protected PrstImgFormatTypeType imgItemFormat;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the prioritySeq property.
     * 
     * @return
     *     possible object is
     *     {@link PrioritySeqType }
     *     
     */
    public PrioritySeqType getPrioritySeq() {
        return prioritySeq;
    }

    /**
     * Sets the value of the prioritySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrioritySeqType }
     *     
     */
    public void setPrioritySeq(PrioritySeqType value) {
        this.prioritySeq = value;
    }

    /**
     * Gets the value of the imgTitle property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getImgTitle() {
        return imgTitle;
    }

    /**
     * Sets the value of the imgTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setImgTitle(RmkType value) {
        this.imgTitle = value;
    }

    /**
     * Gets the value of the imgItem property.
     * 
     * @return
     *     possible object is
     *     {@link PrstImgType }
     *     
     */
    public PrstImgType getImgItem() {
        return imgItem;
    }

    /**
     * Sets the value of the imgItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrstImgType }
     *     
     */
    public void setImgItem(PrstImgType value) {
        this.imgItem = value;
    }

    /**
     * Gets the value of the imgItemFormat property.
     * 
     * @return
     *     possible object is
     *     {@link PrstImgFormatTypeType }
     *     
     */
    public PrstImgFormatTypeType getImgItemFormat() {
        return imgItemFormat;
    }

    /**
     * Sets the value of the imgItemFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrstImgFormatTypeType }
     *     
     */
    public void setImgItemFormat(PrstImgFormatTypeType value) {
        this.imgItemFormat = value;
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
