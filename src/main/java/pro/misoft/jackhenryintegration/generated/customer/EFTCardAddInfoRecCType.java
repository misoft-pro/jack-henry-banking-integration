
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
 * <p>Java class for EFTCardAddInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardAddInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdEmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}SecdEmbosName_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EFTCardStyleId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStyleId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EFTCardCat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardCat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardAddInfoRec_CType", propOrder = {
    "embosName",
    "secdEmbosName",
    "ver1",
    "eftCardStyleId",
    "ver2",
    "eftCardCat",
    "ver3",
    "any"
})
public class EFTCardAddInfoRecCType {

    @XmlElementRef(name = "EmbosName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmbosNameType> embosName;
    @XmlElementRef(name = "SecdEmbosName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdEmbosNameType> secdEmbosName;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EFTCardStyleId")
    protected EFTCardStyleIdType eftCardStyleId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "EFTCardCat")
    protected EFTCardCatType eftCardCat;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the embosName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmbosNameType }{@code >}
     *     
     */
    public JAXBElement<EmbosNameType> getEmbosName() {
        return embosName;
    }

    /**
     * Sets the value of the embosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmbosNameType }{@code >}
     *     
     */
    public void setEmbosName(JAXBElement<EmbosNameType> value) {
        this.embosName = value;
    }

    /**
     * Gets the value of the secdEmbosName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdEmbosNameType }{@code >}
     *     
     */
    public JAXBElement<SecdEmbosNameType> getSecdEmbosName() {
        return secdEmbosName;
    }

    /**
     * Sets the value of the secdEmbosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdEmbosNameType }{@code >}
     *     
     */
    public void setSecdEmbosName(JAXBElement<SecdEmbosNameType> value) {
        this.secdEmbosName = value;
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
     * Gets the value of the eftCardStyleId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStyleIdType }
     *     
     */
    public EFTCardStyleIdType getEFTCardStyleId() {
        return eftCardStyleId;
    }

    /**
     * Sets the value of the eftCardStyleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStyleIdType }
     *     
     */
    public void setEFTCardStyleId(EFTCardStyleIdType value) {
        this.eftCardStyleId = value;
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
     * Gets the value of the eftCardCat property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardCatType }
     *     
     */
    public EFTCardCatType getEFTCardCat() {
        return eftCardCat;
    }

    /**
     * Sets the value of the eftCardCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardCatType }
     *     
     */
    public void setEFTCardCat(EFTCardCatType value) {
        this.eftCardCat = value;
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
