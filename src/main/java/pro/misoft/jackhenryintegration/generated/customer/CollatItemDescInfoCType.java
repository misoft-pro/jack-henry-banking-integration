
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
 * <p>Java class for CollatItemDescInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatItemDescInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatItemDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatItemDescText" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemDescText_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CollatItemDetDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatItemDetDescText" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemDescText_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CollatItemDescInfo_CType", propOrder = {
    "collatItemDesc",
    "collatItemDescText",
    "ver1",
    "collatItemDetDesc",
    "collatItemDetDescText",
    "ver2",
    "any"
})
public class CollatItemDescInfoCType {

    @XmlElement(name = "CollatItemDesc")
    protected CollatItemDescType collatItemDesc;
    @XmlElement(name = "CollatItemDescText")
    protected CollatItemDescTextType collatItemDescText;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CollatItemDetDesc")
    protected CollatItemDescType collatItemDetDesc;
    @XmlElement(name = "CollatItemDetDescText")
    protected CollatItemDescTextType collatItemDetDescText;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the collatItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatItemDescType }
     *     
     */
    public CollatItemDescType getCollatItemDesc() {
        return collatItemDesc;
    }

    /**
     * Sets the value of the collatItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatItemDescType }
     *     
     */
    public void setCollatItemDesc(CollatItemDescType value) {
        this.collatItemDesc = value;
    }

    /**
     * Gets the value of the collatItemDescText property.
     * 
     * @return
     *     possible object is
     *     {@link CollatItemDescTextType }
     *     
     */
    public CollatItemDescTextType getCollatItemDescText() {
        return collatItemDescText;
    }

    /**
     * Sets the value of the collatItemDescText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatItemDescTextType }
     *     
     */
    public void setCollatItemDescText(CollatItemDescTextType value) {
        this.collatItemDescText = value;
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
     * Gets the value of the collatItemDetDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatItemDescType }
     *     
     */
    public CollatItemDescType getCollatItemDetDesc() {
        return collatItemDetDesc;
    }

    /**
     * Sets the value of the collatItemDetDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatItemDescType }
     *     
     */
    public void setCollatItemDetDesc(CollatItemDescType value) {
        this.collatItemDetDesc = value;
    }

    /**
     * Gets the value of the collatItemDetDescText property.
     * 
     * @return
     *     possible object is
     *     {@link CollatItemDescTextType }
     *     
     */
    public CollatItemDescTextType getCollatItemDetDescText() {
        return collatItemDetDescText;
    }

    /**
     * Sets the value of the collatItemDetDescText property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatItemDescTextType }
     *     
     */
    public void setCollatItemDetDescText(CollatItemDescTextType value) {
        this.collatItemDetDescText = value;
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
