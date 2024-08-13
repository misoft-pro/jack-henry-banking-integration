
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
 * <p>Java class for TrancheInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrancheRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="TrancheInqInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheInqInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="TrancheInqAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheInqAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TrancheInqPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheInqPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TrancheInqRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheInqRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TrancheInqLOCInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheInqLOCInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "TrancheInqRec_CType", propOrder = {
    "trancheRec",
    "trancheInqInfoRec",
    "trancheInqAcctInfo",
    "trancheInqPmtInfo",
    "trancheInqRateInfo",
    "custom",
    "ver1",
    "trancheInqLOCInfo",
    "ver2",
    "any"
})
public class TrancheInqRecCType {

    @XmlElement(name = "TrancheRec")
    protected TrancheRecCType trancheRec;
    @XmlElement(name = "TrancheInqInfoRec")
    protected TrancheInqInfoRecCType trancheInqInfoRec;
    @XmlElement(name = "TrancheInqAcctInfo")
    protected TrancheInqAcctInfoCType trancheInqAcctInfo;
    @XmlElement(name = "TrancheInqPmtInfo")
    protected TrancheInqPmtInfoCType trancheInqPmtInfo;
    @XmlElement(name = "TrancheInqRateInfo")
    protected TrancheInqRateInfoCType trancheInqRateInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TrancheInqLOCInfo")
    protected TrancheInqLOCInfoCType trancheInqLOCInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trancheRec property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheRecCType }
     *     
     */
    public TrancheRecCType getTrancheRec() {
        return trancheRec;
    }

    /**
     * Sets the value of the trancheRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheRecCType }
     *     
     */
    public void setTrancheRec(TrancheRecCType value) {
        this.trancheRec = value;
    }

    /**
     * Gets the value of the trancheInqInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheInqInfoRecCType }
     *     
     */
    public TrancheInqInfoRecCType getTrancheInqInfoRec() {
        return trancheInqInfoRec;
    }

    /**
     * Sets the value of the trancheInqInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheInqInfoRecCType }
     *     
     */
    public void setTrancheInqInfoRec(TrancheInqInfoRecCType value) {
        this.trancheInqInfoRec = value;
    }

    /**
     * Gets the value of the trancheInqAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheInqAcctInfoCType }
     *     
     */
    public TrancheInqAcctInfoCType getTrancheInqAcctInfo() {
        return trancheInqAcctInfo;
    }

    /**
     * Sets the value of the trancheInqAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheInqAcctInfoCType }
     *     
     */
    public void setTrancheInqAcctInfo(TrancheInqAcctInfoCType value) {
        this.trancheInqAcctInfo = value;
    }

    /**
     * Gets the value of the trancheInqPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheInqPmtInfoCType }
     *     
     */
    public TrancheInqPmtInfoCType getTrancheInqPmtInfo() {
        return trancheInqPmtInfo;
    }

    /**
     * Sets the value of the trancheInqPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheInqPmtInfoCType }
     *     
     */
    public void setTrancheInqPmtInfo(TrancheInqPmtInfoCType value) {
        this.trancheInqPmtInfo = value;
    }

    /**
     * Gets the value of the trancheInqRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheInqRateInfoCType }
     *     
     */
    public TrancheInqRateInfoCType getTrancheInqRateInfo() {
        return trancheInqRateInfo;
    }

    /**
     * Sets the value of the trancheInqRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheInqRateInfoCType }
     *     
     */
    public void setTrancheInqRateInfo(TrancheInqRateInfoCType value) {
        this.trancheInqRateInfo = value;
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
     * Gets the value of the trancheInqLOCInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheInqLOCInfoCType }
     *     
     */
    public TrancheInqLOCInfoCType getTrancheInqLOCInfo() {
        return trancheInqLOCInfo;
    }

    /**
     * Sets the value of the trancheInqLOCInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheInqLOCInfoCType }
     *     
     */
    public void setTrancheInqLOCInfo(TrancheInqLOCInfoCType value) {
        this.trancheInqLOCInfo = value;
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
