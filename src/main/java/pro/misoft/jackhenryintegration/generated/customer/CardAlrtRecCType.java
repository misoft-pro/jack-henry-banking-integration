
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
 * <p>Java class for CardAlrtRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAlrtRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardAlrtCode" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtCatType" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtCatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlrtActType" type="{http://jackhenry.com/jxchange/TPG/2008}AlrtActType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionUsrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtRegionUsrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionLat" type="{http://jackhenry.com/jxchange/TPG/2008}GeoLat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionLong" type="{http://jackhenry.com/jxchange/TPG/2008}GeoLong_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtRegionRadius" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtRegionRadius_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtThldArray" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CardAlrtRegionId" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtRegionId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CardAlrtRec_CType", propOrder = {
    "cardAlrtCode",
    "cardAlrtDesc",
    "cardAlrtCatType",
    "alrtActType",
    "cardAlrtRegionUsrDesc",
    "cardAlrtRegionLat",
    "cardAlrtRegionLong",
    "cardAlrtRegionRadius",
    "cardAlrtThldArray",
    "ver1",
    "cardAlrtRegionId",
    "ver2",
    "any"
})
public class CardAlrtRecCType {

    @XmlElement(name = "CardAlrtCode")
    protected CardAlrtCodeType cardAlrtCode;
    @XmlElement(name = "CardAlrtDesc")
    protected CardAlrtDescType cardAlrtDesc;
    @XmlElement(name = "CardAlrtCatType")
    protected CardAlrtCatTypeType cardAlrtCatType;
    @XmlElement(name = "AlrtActType")
    protected AlrtActTypeType alrtActType;
    @XmlElement(name = "CardAlrtRegionUsrDesc")
    protected CardAlrtRegionUsrDescType cardAlrtRegionUsrDesc;
    @XmlElement(name = "CardAlrtRegionLat")
    protected GeoLatType cardAlrtRegionLat;
    @XmlElement(name = "CardAlrtRegionLong")
    protected GeoLongType cardAlrtRegionLong;
    @XmlElement(name = "CardAlrtRegionRadius")
    protected CardAlrtRegionRadiusType cardAlrtRegionRadius;
    @XmlElement(name = "CardAlrtThldArray")
    protected CardAlrtThldArrayAType cardAlrtThldArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CardAlrtRegionId")
    protected CardAlrtRegionIdType cardAlrtRegionId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the cardAlrtCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtCodeType }
     *     
     */
    public CardAlrtCodeType getCardAlrtCode() {
        return cardAlrtCode;
    }

    /**
     * Sets the value of the cardAlrtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtCodeType }
     *     
     */
    public void setCardAlrtCode(CardAlrtCodeType value) {
        this.cardAlrtCode = value;
    }

    /**
     * Gets the value of the cardAlrtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtDescType }
     *     
     */
    public CardAlrtDescType getCardAlrtDesc() {
        return cardAlrtDesc;
    }

    /**
     * Sets the value of the cardAlrtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtDescType }
     *     
     */
    public void setCardAlrtDesc(CardAlrtDescType value) {
        this.cardAlrtDesc = value;
    }

    /**
     * Gets the value of the cardAlrtCatType property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtCatTypeType }
     *     
     */
    public CardAlrtCatTypeType getCardAlrtCatType() {
        return cardAlrtCatType;
    }

    /**
     * Sets the value of the cardAlrtCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtCatTypeType }
     *     
     */
    public void setCardAlrtCatType(CardAlrtCatTypeType value) {
        this.cardAlrtCatType = value;
    }

    /**
     * Gets the value of the alrtActType property.
     * 
     * @return
     *     possible object is
     *     {@link AlrtActTypeType }
     *     
     */
    public AlrtActTypeType getAlrtActType() {
        return alrtActType;
    }

    /**
     * Sets the value of the alrtActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlrtActTypeType }
     *     
     */
    public void setAlrtActType(AlrtActTypeType value) {
        this.alrtActType = value;
    }

    /**
     * Gets the value of the cardAlrtRegionUsrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtRegionUsrDescType }
     *     
     */
    public CardAlrtRegionUsrDescType getCardAlrtRegionUsrDesc() {
        return cardAlrtRegionUsrDesc;
    }

    /**
     * Sets the value of the cardAlrtRegionUsrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtRegionUsrDescType }
     *     
     */
    public void setCardAlrtRegionUsrDesc(CardAlrtRegionUsrDescType value) {
        this.cardAlrtRegionUsrDesc = value;
    }

    /**
     * Gets the value of the cardAlrtRegionLat property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLatType }
     *     
     */
    public GeoLatType getCardAlrtRegionLat() {
        return cardAlrtRegionLat;
    }

    /**
     * Sets the value of the cardAlrtRegionLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLatType }
     *     
     */
    public void setCardAlrtRegionLat(GeoLatType value) {
        this.cardAlrtRegionLat = value;
    }

    /**
     * Gets the value of the cardAlrtRegionLong property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLongType }
     *     
     */
    public GeoLongType getCardAlrtRegionLong() {
        return cardAlrtRegionLong;
    }

    /**
     * Sets the value of the cardAlrtRegionLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLongType }
     *     
     */
    public void setCardAlrtRegionLong(GeoLongType value) {
        this.cardAlrtRegionLong = value;
    }

    /**
     * Gets the value of the cardAlrtRegionRadius property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtRegionRadiusType }
     *     
     */
    public CardAlrtRegionRadiusType getCardAlrtRegionRadius() {
        return cardAlrtRegionRadius;
    }

    /**
     * Sets the value of the cardAlrtRegionRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtRegionRadiusType }
     *     
     */
    public void setCardAlrtRegionRadius(CardAlrtRegionRadiusType value) {
        this.cardAlrtRegionRadius = value;
    }

    /**
     * Gets the value of the cardAlrtThldArray property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtThldArrayAType }
     *     
     */
    public CardAlrtThldArrayAType getCardAlrtThldArray() {
        return cardAlrtThldArray;
    }

    /**
     * Sets the value of the cardAlrtThldArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtThldArrayAType }
     *     
     */
    public void setCardAlrtThldArray(CardAlrtThldArrayAType value) {
        this.cardAlrtThldArray = value;
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
     * Gets the value of the cardAlrtRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtRegionIdType }
     *     
     */
    public CardAlrtRegionIdType getCardAlrtRegionId() {
        return cardAlrtRegionId;
    }

    /**
     * Sets the value of the cardAlrtRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtRegionIdType }
     *     
     */
    public void setCardAlrtRegionId(CardAlrtRegionIdType value) {
        this.cardAlrtRegionId = value;
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
