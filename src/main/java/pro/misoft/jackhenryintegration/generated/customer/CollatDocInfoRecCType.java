
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
 * <p>Java class for CollatDocInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatDocInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatDocInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocInfoText" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocInfoText_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CollatDocDetInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocInfo_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatDocDetInfoText" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocInfoText_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CollatDocInfoRec_CType", propOrder = {
    "collatDocInfo",
    "collatDocInfoText",
    "ver1",
    "collatDocDetInfo",
    "collatDocDetInfoText",
    "ver2",
    "any"
})
public class CollatDocInfoRecCType {

    @XmlElementRef(name = "CollatDocInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocInfoType> collatDocInfo;
    @XmlElementRef(name = "CollatDocInfoText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocInfoTextType> collatDocInfoText;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CollatDocDetInfo")
    protected CollatDocInfoType collatDocDetInfo;
    @XmlElement(name = "CollatDocDetInfoText")
    protected CollatDocInfoTextType collatDocDetInfoText;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the collatDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocInfoType }{@code >}
     *     
     */
    public JAXBElement<CollatDocInfoType> getCollatDocInfo() {
        return collatDocInfo;
    }

    /**
     * Sets the value of the collatDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocInfoType }{@code >}
     *     
     */
    public void setCollatDocInfo(JAXBElement<CollatDocInfoType> value) {
        this.collatDocInfo = value;
    }

    /**
     * Gets the value of the collatDocInfoText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocInfoTextType }{@code >}
     *     
     */
    public JAXBElement<CollatDocInfoTextType> getCollatDocInfoText() {
        return collatDocInfoText;
    }

    /**
     * Sets the value of the collatDocInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocInfoTextType }{@code >}
     *     
     */
    public void setCollatDocInfoText(JAXBElement<CollatDocInfoTextType> value) {
        this.collatDocInfoText = value;
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
     * Gets the value of the collatDocDetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocInfoType }
     *     
     */
    public CollatDocInfoType getCollatDocDetInfo() {
        return collatDocDetInfo;
    }

    /**
     * Sets the value of the collatDocDetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocInfoType }
     *     
     */
    public void setCollatDocDetInfo(CollatDocInfoType value) {
        this.collatDocDetInfo = value;
    }

    /**
     * Gets the value of the collatDocDetInfoText property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocInfoTextType }
     *     
     */
    public CollatDocInfoTextType getCollatDocDetInfoText() {
        return collatDocDetInfoText;
    }

    /**
     * Sets the value of the collatDocDetInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocInfoTextType }
     *     
     */
    public void setCollatDocDetInfoText(CollatDocInfoTextType value) {
        this.collatDocDetInfoText = value;
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
