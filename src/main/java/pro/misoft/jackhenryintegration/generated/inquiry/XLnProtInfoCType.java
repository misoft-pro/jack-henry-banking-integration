
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
 * <p>Java class for x_LnProtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnProtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnProtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnProtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="ProtAcctBal" type="{http://jackhenry.com/jxchange/TPG/2008}ProtAcctBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDDANSFDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDDANSFDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODProtPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ODProtPmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctBalDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctBalDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctBal" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ExclHldXferDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExclHldXferDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnProtInfo_CType", propOrder = {
    "lnProtInfo",
    "protAcctBal",
    "pmtDDANSFDesc",
    "odProtPmtDesc",
    "drAcctBalDesc",
    "drAcctBal",
    "custom",
    "ver1",
    "exclHldXferDesc",
    "ver2",
    "any"
})
public class XLnProtInfoCType {

    @XmlElement(name = "LnProtInfo")
    protected LnProtInfoCType lnProtInfo;
    @XmlElement(name = "ProtAcctBal")
    protected ProtAcctBalType protAcctBal;
    @XmlElement(name = "PmtDDANSFDesc")
    protected PmtDDANSFDescType pmtDDANSFDesc;
    @XmlElement(name = "ODProtPmtDesc")
    protected ODProtPmtDescType odProtPmtDesc;
    @XmlElement(name = "DrAcctBalDesc")
    protected DrAcctBalDescType drAcctBalDesc;
    @XmlElement(name = "DrAcctBal")
    protected DrAcctBalType drAcctBal;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ExclHldXferDesc")
    protected ExclHldXferDescType exclHldXferDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnProtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnProtInfoCType }
     *     
     */
    public LnProtInfoCType getLnProtInfo() {
        return lnProtInfo;
    }

    /**
     * Sets the value of the lnProtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnProtInfoCType }
     *     
     */
    public void setLnProtInfo(LnProtInfoCType value) {
        this.lnProtInfo = value;
    }

    /**
     * Gets the value of the protAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link ProtAcctBalType }
     *     
     */
    public ProtAcctBalType getProtAcctBal() {
        return protAcctBal;
    }

    /**
     * Sets the value of the protAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtAcctBalType }
     *     
     */
    public void setProtAcctBal(ProtAcctBalType value) {
        this.protAcctBal = value;
    }

    /**
     * Gets the value of the pmtDDANSFDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDDANSFDescType }
     *     
     */
    public PmtDDANSFDescType getPmtDDANSFDesc() {
        return pmtDDANSFDesc;
    }

    /**
     * Sets the value of the pmtDDANSFDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDDANSFDescType }
     *     
     */
    public void setPmtDDANSFDesc(PmtDDANSFDescType value) {
        this.pmtDDANSFDesc = value;
    }

    /**
     * Gets the value of the odProtPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ODProtPmtDescType }
     *     
     */
    public ODProtPmtDescType getODProtPmtDesc() {
        return odProtPmtDesc;
    }

    /**
     * Sets the value of the odProtPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODProtPmtDescType }
     *     
     */
    public void setODProtPmtDesc(ODProtPmtDescType value) {
        this.odProtPmtDesc = value;
    }

    /**
     * Gets the value of the drAcctBalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DrAcctBalDescType }
     *     
     */
    public DrAcctBalDescType getDrAcctBalDesc() {
        return drAcctBalDesc;
    }

    /**
     * Sets the value of the drAcctBalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrAcctBalDescType }
     *     
     */
    public void setDrAcctBalDesc(DrAcctBalDescType value) {
        this.drAcctBalDesc = value;
    }

    /**
     * Gets the value of the drAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link DrAcctBalType }
     *     
     */
    public DrAcctBalType getDrAcctBal() {
        return drAcctBal;
    }

    /**
     * Sets the value of the drAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrAcctBalType }
     *     
     */
    public void setDrAcctBal(DrAcctBalType value) {
        this.drAcctBal = value;
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
     * Gets the value of the exclHldXferDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExclHldXferDescType }
     *     
     */
    public ExclHldXferDescType getExclHldXferDesc() {
        return exclHldXferDesc;
    }

    /**
     * Sets the value of the exclHldXferDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclHldXferDescType }
     *     
     */
    public void setExclHldXferDesc(ExclHldXferDescType value) {
        this.exclHldXferDesc = value;
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
