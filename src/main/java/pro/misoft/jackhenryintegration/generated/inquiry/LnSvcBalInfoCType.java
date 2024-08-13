
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
 * <p>Java class for LnSvcBalInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnSvcBalInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcCutOffBal" type="{http://jackhenry.com/jxchange/TPG/2008}SvcCutOffBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrevCutOffBal" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrevCutOffBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcSchedBal" type="{http://jackhenry.com/jxchange/TPG/2008}SvcSchedBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrevSchedBal" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrevSchedBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcProjSchedBal" type="{http://jackhenry.com/jxchange/TPG/2008}SvcProjSchedBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrevProjSchedBal" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrevProjSchedBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcSaleBal" type="{http://jackhenry.com/jxchange/TPG/2008}SvcSaleBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcBalInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SvcBalInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LnSvcBalInfo_CType", propOrder = {
    "svcCutOffBal",
    "svcPrevCutOffBal",
    "svcSchedBal",
    "svcPrevSchedBal",
    "svcProjSchedBal",
    "svcPrevProjSchedBal",
    "svcSaleBal",
    "svcBalInfoArray",
    "ver1",
    "any"
})
public class LnSvcBalInfoCType {

    @XmlElement(name = "SvcCutOffBal")
    protected SvcCutOffBalType svcCutOffBal;
    @XmlElement(name = "SvcPrevCutOffBal")
    protected SvcPrevCutOffBalType svcPrevCutOffBal;
    @XmlElement(name = "SvcSchedBal")
    protected SvcSchedBalType svcSchedBal;
    @XmlElement(name = "SvcPrevSchedBal")
    protected SvcPrevSchedBalType svcPrevSchedBal;
    @XmlElement(name = "SvcProjSchedBal")
    protected SvcProjSchedBalType svcProjSchedBal;
    @XmlElement(name = "SvcPrevProjSchedBal")
    protected SvcPrevProjSchedBalType svcPrevProjSchedBal;
    @XmlElement(name = "SvcSaleBal")
    protected SvcSaleBalType svcSaleBal;
    @XmlElement(name = "SvcBalInfoArray")
    protected SvcBalInfoArrayAType svcBalInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcCutOffBal property.
     * 
     * @return
     *     possible object is
     *     {@link SvcCutOffBalType }
     *     
     */
    public SvcCutOffBalType getSvcCutOffBal() {
        return svcCutOffBal;
    }

    /**
     * Sets the value of the svcCutOffBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcCutOffBalType }
     *     
     */
    public void setSvcCutOffBal(SvcCutOffBalType value) {
        this.svcCutOffBal = value;
    }

    /**
     * Gets the value of the svcPrevCutOffBal property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrevCutOffBalType }
     *     
     */
    public SvcPrevCutOffBalType getSvcPrevCutOffBal() {
        return svcPrevCutOffBal;
    }

    /**
     * Sets the value of the svcPrevCutOffBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrevCutOffBalType }
     *     
     */
    public void setSvcPrevCutOffBal(SvcPrevCutOffBalType value) {
        this.svcPrevCutOffBal = value;
    }

    /**
     * Gets the value of the svcSchedBal property.
     * 
     * @return
     *     possible object is
     *     {@link SvcSchedBalType }
     *     
     */
    public SvcSchedBalType getSvcSchedBal() {
        return svcSchedBal;
    }

    /**
     * Sets the value of the svcSchedBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcSchedBalType }
     *     
     */
    public void setSvcSchedBal(SvcSchedBalType value) {
        this.svcSchedBal = value;
    }

    /**
     * Gets the value of the svcPrevSchedBal property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrevSchedBalType }
     *     
     */
    public SvcPrevSchedBalType getSvcPrevSchedBal() {
        return svcPrevSchedBal;
    }

    /**
     * Sets the value of the svcPrevSchedBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrevSchedBalType }
     *     
     */
    public void setSvcPrevSchedBal(SvcPrevSchedBalType value) {
        this.svcPrevSchedBal = value;
    }

    /**
     * Gets the value of the svcProjSchedBal property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProjSchedBalType }
     *     
     */
    public SvcProjSchedBalType getSvcProjSchedBal() {
        return svcProjSchedBal;
    }

    /**
     * Sets the value of the svcProjSchedBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProjSchedBalType }
     *     
     */
    public void setSvcProjSchedBal(SvcProjSchedBalType value) {
        this.svcProjSchedBal = value;
    }

    /**
     * Gets the value of the svcPrevProjSchedBal property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrevProjSchedBalType }
     *     
     */
    public SvcPrevProjSchedBalType getSvcPrevProjSchedBal() {
        return svcPrevProjSchedBal;
    }

    /**
     * Sets the value of the svcPrevProjSchedBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrevProjSchedBalType }
     *     
     */
    public void setSvcPrevProjSchedBal(SvcPrevProjSchedBalType value) {
        this.svcPrevProjSchedBal = value;
    }

    /**
     * Gets the value of the svcSaleBal property.
     * 
     * @return
     *     possible object is
     *     {@link SvcSaleBalType }
     *     
     */
    public SvcSaleBalType getSvcSaleBal() {
        return svcSaleBal;
    }

    /**
     * Sets the value of the svcSaleBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcSaleBalType }
     *     
     */
    public void setSvcSaleBal(SvcSaleBalType value) {
        this.svcSaleBal = value;
    }

    /**
     * Gets the value of the svcBalInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link SvcBalInfoArrayAType }
     *     
     */
    public SvcBalInfoArrayAType getSvcBalInfoArray() {
        return svcBalInfoArray;
    }

    /**
     * Sets the value of the svcBalInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcBalInfoArrayAType }
     *     
     */
    public void setSvcBalInfoArray(SvcBalInfoArrayAType value) {
        this.svcBalInfoArray = value;
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
