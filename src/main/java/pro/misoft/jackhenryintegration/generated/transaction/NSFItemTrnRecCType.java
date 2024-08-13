
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for NSFItemTrnRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSFItemTrnRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcResolveType" type="{http://jackhenry.com/jxchange/TPG/2008}ExcResolveType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcDispCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRetRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcActnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcActnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFChgWavRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}NSFChgWavRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFChgWavRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgWavOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "NSFItemTrnRec_CType", propOrder = {
    "excResolveType",
    "excDispCode",
    "excRetRsnCode",
    "excActnCode",
    "nsfChgWavRsnCode",
    "nsfChgWavRmk",
    "chgWavOffCode",
    "ver1",
    "any"
})
public class NSFItemTrnRecCType {

    @XmlElement(name = "ExcResolveType")
    protected ExcResolveTypeType excResolveType;
    @XmlElement(name = "ExcDispCode")
    protected ExcDispCodeType excDispCode;
    @XmlElement(name = "ExcRetRsnCode")
    protected ExcRetRsnCodeType excRetRsnCode;
    @XmlElement(name = "ExcActnCode")
    protected ExcActnCodeType excActnCode;
    @XmlElement(name = "NSFChgWavRsnCode")
    protected NSFChgWavRsnCodeType nsfChgWavRsnCode;
    @XmlElement(name = "NSFChgWavRmk")
    protected RmkType nsfChgWavRmk;
    @XmlElement(name = "ChgWavOffCode")
    protected OffCodeType chgWavOffCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the excResolveType property.
     * 
     * @return
     *     possible object is
     *     {@link ExcResolveTypeType }
     *     
     */
    public ExcResolveTypeType getExcResolveType() {
        return excResolveType;
    }

    /**
     * Sets the value of the excResolveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcResolveTypeType }
     *     
     */
    public void setExcResolveType(ExcResolveTypeType value) {
        this.excResolveType = value;
    }

    /**
     * Gets the value of the excDispCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcDispCodeType }
     *     
     */
    public ExcDispCodeType getExcDispCode() {
        return excDispCode;
    }

    /**
     * Sets the value of the excDispCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcDispCodeType }
     *     
     */
    public void setExcDispCode(ExcDispCodeType value) {
        this.excDispCode = value;
    }

    /**
     * Gets the value of the excRetRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRetRsnCodeType }
     *     
     */
    public ExcRetRsnCodeType getExcRetRsnCode() {
        return excRetRsnCode;
    }

    /**
     * Sets the value of the excRetRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRetRsnCodeType }
     *     
     */
    public void setExcRetRsnCode(ExcRetRsnCodeType value) {
        this.excRetRsnCode = value;
    }

    /**
     * Gets the value of the excActnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcActnCodeType }
     *     
     */
    public ExcActnCodeType getExcActnCode() {
        return excActnCode;
    }

    /**
     * Sets the value of the excActnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcActnCodeType }
     *     
     */
    public void setExcActnCode(ExcActnCodeType value) {
        this.excActnCode = value;
    }

    /**
     * Gets the value of the nsfChgWavRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link NSFChgWavRsnCodeType }
     *     
     */
    public NSFChgWavRsnCodeType getNSFChgWavRsnCode() {
        return nsfChgWavRsnCode;
    }

    /**
     * Sets the value of the nsfChgWavRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFChgWavRsnCodeType }
     *     
     */
    public void setNSFChgWavRsnCode(NSFChgWavRsnCodeType value) {
        this.nsfChgWavRsnCode = value;
    }

    /**
     * Gets the value of the nsfChgWavRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getNSFChgWavRmk() {
        return nsfChgWavRmk;
    }

    /**
     * Sets the value of the nsfChgWavRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setNSFChgWavRmk(RmkType value) {
        this.nsfChgWavRmk = value;
    }

    /**
     * Gets the value of the chgWavOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getChgWavOffCode() {
        return chgWavOffCode;
    }

    /**
     * Sets the value of the chgWavOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setChgWavOffCode(OffCodeType value) {
        this.chgWavOffCode = value;
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
