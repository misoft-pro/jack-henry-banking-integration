
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
 * <p>Java class for x_TimeDepAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_TimeDepAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeDepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="HldMailDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PenDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PenDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaperLessDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PaperLessDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctLvlSecDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcFundsDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SrcFundsDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PrtIntNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtIntNotDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_TimeDepAcctInfo_CType", propOrder = {
    "timeDepAcctInfo",
    "hldMailDesc",
    "penDesc",
    "paperLessDesc",
    "acctLvlSecDesc",
    "srcFundsDesc",
    "custom",
    "ver1",
    "prtIntNotDesc",
    "ver2",
    "any"
})
public class XTimeDepAcctInfoCType {

    @XmlElement(name = "TimeDepAcctInfo")
    protected TimeDepAcctInfoCType timeDepAcctInfo;
    @XmlElement(name = "HldMailDesc")
    protected HldMailDescType hldMailDesc;
    @XmlElement(name = "PenDesc")
    protected PenDescType penDesc;
    @XmlElement(name = "PaperLessDesc")
    protected PaperLessDescType paperLessDesc;
    @XmlElement(name = "AcctLvlSecDesc")
    protected AcctLvlSecDescType acctLvlSecDesc;
    @XmlElement(name = "SrcFundsDesc")
    protected SrcFundsDescType srcFundsDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PrtIntNotDesc")
    protected PrtIntNotDescType prtIntNotDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timeDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepAcctInfoCType }
     *     
     */
    public TimeDepAcctInfoCType getTimeDepAcctInfo() {
        return timeDepAcctInfo;
    }

    /**
     * Sets the value of the timeDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepAcctInfoCType }
     *     
     */
    public void setTimeDepAcctInfo(TimeDepAcctInfoCType value) {
        this.timeDepAcctInfo = value;
    }

    /**
     * Gets the value of the hldMailDesc property.
     * 
     * @return
     *     possible object is
     *     {@link HldMailDescType }
     *     
     */
    public HldMailDescType getHldMailDesc() {
        return hldMailDesc;
    }

    /**
     * Sets the value of the hldMailDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldMailDescType }
     *     
     */
    public void setHldMailDesc(HldMailDescType value) {
        this.hldMailDesc = value;
    }

    /**
     * Gets the value of the penDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PenDescType }
     *     
     */
    public PenDescType getPenDesc() {
        return penDesc;
    }

    /**
     * Sets the value of the penDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenDescType }
     *     
     */
    public void setPenDesc(PenDescType value) {
        this.penDesc = value;
    }

    /**
     * Gets the value of the paperLessDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PaperLessDescType }
     *     
     */
    public PaperLessDescType getPaperLessDesc() {
        return paperLessDesc;
    }

    /**
     * Sets the value of the paperLessDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperLessDescType }
     *     
     */
    public void setPaperLessDesc(PaperLessDescType value) {
        this.paperLessDesc = value;
    }

    /**
     * Gets the value of the acctLvlSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctLvlSecDescType }
     *     
     */
    public AcctLvlSecDescType getAcctLvlSecDesc() {
        return acctLvlSecDesc;
    }

    /**
     * Sets the value of the acctLvlSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctLvlSecDescType }
     *     
     */
    public void setAcctLvlSecDesc(AcctLvlSecDescType value) {
        this.acctLvlSecDesc = value;
    }

    /**
     * Gets the value of the srcFundsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SrcFundsDescType }
     *     
     */
    public SrcFundsDescType getSrcFundsDesc() {
        return srcFundsDesc;
    }

    /**
     * Sets the value of the srcFundsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcFundsDescType }
     *     
     */
    public void setSrcFundsDesc(SrcFundsDescType value) {
        this.srcFundsDesc = value;
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
     * Gets the value of the prtIntNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtIntNotDescType }
     *     
     */
    public PrtIntNotDescType getPrtIntNotDesc() {
        return prtIntNotDesc;
    }

    /**
     * Sets the value of the prtIntNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtIntNotDescType }
     *     
     */
    public void setPrtIntNotDesc(PrtIntNotDescType value) {
        this.prtIntNotDesc = value;
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
