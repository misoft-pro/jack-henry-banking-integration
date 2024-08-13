
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a payment status change
 *     history
 * 
 * <p>Java class for PmtStatHistInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtStatHistInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtStatChngDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtStatChngDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtExcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtExcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChngBy" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChngBy_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtStatHistInfo_CType", propOrder = {
    "pmtStat",
    "pmtStatChngDt",
    "pmtExcDesc",
    "pmtChngBy",
    "custom",
    "ver1",
    "any"
})
public class PmtStatHistInfoCType {

    @XmlElement(name = "PmtStat")
    protected PmtStatType pmtStat;
    @XmlElement(name = "PmtStatChngDt")
    protected PmtStatChngDtType pmtStatChngDt;
    @XmlElement(name = "PmtExcDesc")
    protected PmtExcDescType pmtExcDesc;
    @XmlElement(name = "PmtChngBy")
    protected PmtChngByType pmtChngBy;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtStat property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatType }
     *     
     */
    public PmtStatType getPmtStat() {
        return pmtStat;
    }

    /**
     * Sets the value of the pmtStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatType }
     *     
     */
    public void setPmtStat(PmtStatType value) {
        this.pmtStat = value;
    }

    /**
     * Gets the value of the pmtStatChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatChngDtType }
     *     
     */
    public PmtStatChngDtType getPmtStatChngDt() {
        return pmtStatChngDt;
    }

    /**
     * Sets the value of the pmtStatChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatChngDtType }
     *     
     */
    public void setPmtStatChngDt(PmtStatChngDtType value) {
        this.pmtStatChngDt = value;
    }

    /**
     * Gets the value of the pmtExcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtExcDescType }
     *     
     */
    public PmtExcDescType getPmtExcDesc() {
        return pmtExcDesc;
    }

    /**
     * Sets the value of the pmtExcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtExcDescType }
     *     
     */
    public void setPmtExcDesc(PmtExcDescType value) {
        this.pmtExcDesc = value;
    }

    /**
     * Gets the value of the pmtChngBy property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChngByType }
     *     
     */
    public PmtChngByType getPmtChngBy() {
        return pmtChngBy;
    }

    /**
     * Sets the value of the pmtChngBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChngByType }
     *     
     */
    public void setPmtChngBy(PmtChngByType value) {
        this.pmtChngBy = value;
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
