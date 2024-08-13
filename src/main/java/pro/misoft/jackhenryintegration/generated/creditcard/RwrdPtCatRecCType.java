
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RwrdPtCatRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RwrdPtCatRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RwrdPtCatType" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtCatType_Type"/&gt;
 *         &lt;element name="RwrdPtDailyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtCycleAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtPrevCycleAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtMTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtQTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtYTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtLTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RwrdPtCatRec_CType", propOrder = {
    "rwrdPtCatType",
    "rwrdPtDailyAmt",
    "rwrdPtCycleAmt",
    "rwrdPtPrevCycleAmt",
    "rwrdPtMTDAmt",
    "rwrdPtQTDAmt",
    "rwrdPtYTDAmt",
    "rwrdPtLTDAmt",
    "custom",
    "ver1",
    "any"
})
public class RwrdPtCatRecCType {

    @XmlElement(name = "RwrdPtCatType", required = true)
    protected RwrdPtCatTypeType rwrdPtCatType;
    @XmlElement(name = "RwrdPtDailyAmt")
    protected RwrdPtAmtType rwrdPtDailyAmt;
    @XmlElement(name = "RwrdPtCycleAmt")
    protected RwrdPtAmtType rwrdPtCycleAmt;
    @XmlElement(name = "RwrdPtPrevCycleAmt")
    protected RwrdPtAmtType rwrdPtPrevCycleAmt;
    @XmlElement(name = "RwrdPtMTDAmt")
    protected RwrdPtAmtType rwrdPtMTDAmt;
    @XmlElement(name = "RwrdPtQTDAmt")
    protected RwrdPtAmtType rwrdPtQTDAmt;
    @XmlElement(name = "RwrdPtYTDAmt")
    protected RwrdPtAmtType rwrdPtYTDAmt;
    @XmlElement(name = "RwrdPtLTDAmt")
    protected RwrdPtAmtType rwrdPtLTDAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rwrdPtCatType property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtCatTypeType }
     *     
     */
    public RwrdPtCatTypeType getRwrdPtCatType() {
        return rwrdPtCatType;
    }

    /**
     * Sets the value of the rwrdPtCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtCatTypeType }
     *     
     */
    public void setRwrdPtCatType(RwrdPtCatTypeType value) {
        this.rwrdPtCatType = value;
    }

    /**
     * Gets the value of the rwrdPtDailyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public RwrdPtAmtType getRwrdPtDailyAmt() {
        return rwrdPtDailyAmt;
    }

    /**
     * Sets the value of the rwrdPtDailyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public void setRwrdPtDailyAmt(RwrdPtAmtType value) {
        this.rwrdPtDailyAmt = value;
    }

    /**
     * Gets the value of the rwrdPtCycleAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public RwrdPtAmtType getRwrdPtCycleAmt() {
        return rwrdPtCycleAmt;
    }

    /**
     * Sets the value of the rwrdPtCycleAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public void setRwrdPtCycleAmt(RwrdPtAmtType value) {
        this.rwrdPtCycleAmt = value;
    }

    /**
     * Gets the value of the rwrdPtPrevCycleAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public RwrdPtAmtType getRwrdPtPrevCycleAmt() {
        return rwrdPtPrevCycleAmt;
    }

    /**
     * Sets the value of the rwrdPtPrevCycleAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public void setRwrdPtPrevCycleAmt(RwrdPtAmtType value) {
        this.rwrdPtPrevCycleAmt = value;
    }

    /**
     * Gets the value of the rwrdPtMTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public RwrdPtAmtType getRwrdPtMTDAmt() {
        return rwrdPtMTDAmt;
    }

    /**
     * Sets the value of the rwrdPtMTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public void setRwrdPtMTDAmt(RwrdPtAmtType value) {
        this.rwrdPtMTDAmt = value;
    }

    /**
     * Gets the value of the rwrdPtQTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public RwrdPtAmtType getRwrdPtQTDAmt() {
        return rwrdPtQTDAmt;
    }

    /**
     * Sets the value of the rwrdPtQTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public void setRwrdPtQTDAmt(RwrdPtAmtType value) {
        this.rwrdPtQTDAmt = value;
    }

    /**
     * Gets the value of the rwrdPtYTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public RwrdPtAmtType getRwrdPtYTDAmt() {
        return rwrdPtYTDAmt;
    }

    /**
     * Sets the value of the rwrdPtYTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public void setRwrdPtYTDAmt(RwrdPtAmtType value) {
        this.rwrdPtYTDAmt = value;
    }

    /**
     * Gets the value of the rwrdPtLTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public RwrdPtAmtType getRwrdPtLTDAmt() {
        return rwrdPtLTDAmt;
    }

    /**
     * Sets the value of the rwrdPtLTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAmtType }
     *     
     */
    public void setRwrdPtLTDAmt(RwrdPtAmtType value) {
        this.rwrdPtLTDAmt = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
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
