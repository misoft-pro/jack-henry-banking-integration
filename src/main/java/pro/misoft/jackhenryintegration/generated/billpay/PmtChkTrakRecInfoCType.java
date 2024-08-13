
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
 * A package of data related to a payment check tracking
 *     record
 * 
 * <p>Java class for PmtChkTrakRecInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtChkTrakRecInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtChkTrakDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkTrakLoc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakLoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkTrakStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkTrakCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakCmnt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtChkTrakRecInfo_CType", propOrder = {
    "pmtChkTrakDt",
    "pmtChkTrakLoc",
    "pmtChkTrakStat",
    "pmtChkTrakCmnt",
    "custom",
    "ver1",
    "any"
})
public class PmtChkTrakRecInfoCType {

    @XmlElement(name = "PmtChkTrakDt")
    protected PmtChkTrakDtType pmtChkTrakDt;
    @XmlElement(name = "PmtChkTrakLoc")
    protected PmtChkTrakLocType pmtChkTrakLoc;
    @XmlElement(name = "PmtChkTrakStat")
    protected PmtChkTrakStatType pmtChkTrakStat;
    @XmlElement(name = "PmtChkTrakCmnt")
    protected PmtChkTrakCmntType pmtChkTrakCmnt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtChkTrakDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkTrakDtType }
     *     
     */
    public PmtChkTrakDtType getPmtChkTrakDt() {
        return pmtChkTrakDt;
    }

    /**
     * Sets the value of the pmtChkTrakDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkTrakDtType }
     *     
     */
    public void setPmtChkTrakDt(PmtChkTrakDtType value) {
        this.pmtChkTrakDt = value;
    }

    /**
     * Gets the value of the pmtChkTrakLoc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkTrakLocType }
     *     
     */
    public PmtChkTrakLocType getPmtChkTrakLoc() {
        return pmtChkTrakLoc;
    }

    /**
     * Sets the value of the pmtChkTrakLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkTrakLocType }
     *     
     */
    public void setPmtChkTrakLoc(PmtChkTrakLocType value) {
        this.pmtChkTrakLoc = value;
    }

    /**
     * Gets the value of the pmtChkTrakStat property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkTrakStatType }
     *     
     */
    public PmtChkTrakStatType getPmtChkTrakStat() {
        return pmtChkTrakStat;
    }

    /**
     * Sets the value of the pmtChkTrakStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkTrakStatType }
     *     
     */
    public void setPmtChkTrakStat(PmtChkTrakStatType value) {
        this.pmtChkTrakStat = value;
    }

    /**
     * Gets the value of the pmtChkTrakCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkTrakCmntType }
     *     
     */
    public PmtChkTrakCmntType getPmtChkTrakCmnt() {
        return pmtChkTrakCmnt;
    }

    /**
     * Sets the value of the pmtChkTrakCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkTrakCmntType }
     *     
     */
    public void setPmtChkTrakCmnt(PmtChkTrakCmntType value) {
        this.pmtChkTrakCmnt = value;
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
