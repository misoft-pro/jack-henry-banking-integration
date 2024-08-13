
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EFTCardImgIdSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardImgIdSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImgId" type="{http://jackhenry.com/jxchange/TPG/2008}ImgId_Type"/&gt;
 *         &lt;element name="ImgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ImgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgAlbum" type="{http://jackhenry.com/jxchange/TPG/2008}ImgAlbum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardImgIdSrchRec_CType", propOrder = {
    "imgId",
    "imgDesc",
    "imgAlbum",
    "actIntentKey",
    "custom",
    "ver1",
    "any"
})
public class EFTCardImgIdSrchRecCType {

    @XmlElement(name = "ImgId", required = true)
    protected ImgIdType imgId;
    @XmlElement(name = "ImgDesc")
    protected ImgDescType imgDesc;
    @XmlElement(name = "ImgAlbum")
    protected ImgAlbumType imgAlbum;
    @XmlElement(name = "ActIntentKey")
    protected ActIntentKeyType actIntentKey;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the imgId property.
     * 
     * @return
     *     possible object is
     *     {@link ImgIdType }
     *     
     */
    public ImgIdType getImgId() {
        return imgId;
    }

    /**
     * Sets the value of the imgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgIdType }
     *     
     */
    public void setImgId(ImgIdType value) {
        this.imgId = value;
    }

    /**
     * Gets the value of the imgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ImgDescType }
     *     
     */
    public ImgDescType getImgDesc() {
        return imgDesc;
    }

    /**
     * Sets the value of the imgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgDescType }
     *     
     */
    public void setImgDesc(ImgDescType value) {
        this.imgDesc = value;
    }

    /**
     * Gets the value of the imgAlbum property.
     * 
     * @return
     *     possible object is
     *     {@link ImgAlbumType }
     *     
     */
    public ImgAlbumType getImgAlbum() {
        return imgAlbum;
    }

    /**
     * Sets the value of the imgAlbum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgAlbumType }
     *     
     */
    public void setImgAlbum(ImgAlbumType value) {
        this.imgAlbum = value;
    }

    /**
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link ActIntentKeyType }
     *     
     */
    public ActIntentKeyType getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActIntentKeyType }
     *     
     */
    public void setActIntentKey(ActIntentKeyType value) {
        this.actIntentKey = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
