
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
 * <p>Java class for TrancheInqAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheInqAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrancheAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtPastDueNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtPastDueNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldMailDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrancheInqAcctInfo_CType", propOrder = {
    "trancheAcctInfo",
    "prtBilNotDesc",
    "prtPastDueNotDesc",
    "prtcpDesc",
    "hldMailDesc",
    "custom",
    "ver1",
    "any"
})
public class TrancheInqAcctInfoCType {

    @XmlElement(name = "TrancheAcctInfo")
    protected TrancheAcctInfoCType trancheAcctInfo;
    @XmlElement(name = "PrtBilNotDesc")
    protected PrtBilNotDescType prtBilNotDesc;
    @XmlElement(name = "PrtPastDueNotDesc")
    protected PrtPastDueNotDescType prtPastDueNotDesc;
    @XmlElement(name = "PrtcpDesc")
    protected PrtcpDescType prtcpDesc;
    @XmlElement(name = "HldMailDesc")
    protected HldMailDescType hldMailDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trancheAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheAcctInfoCType }
     *     
     */
    public TrancheAcctInfoCType getTrancheAcctInfo() {
        return trancheAcctInfo;
    }

    /**
     * Sets the value of the trancheAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheAcctInfoCType }
     *     
     */
    public void setTrancheAcctInfo(TrancheAcctInfoCType value) {
        this.trancheAcctInfo = value;
    }

    /**
     * Gets the value of the prtBilNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public PrtBilNotDescType getPrtBilNotDesc() {
        return prtBilNotDesc;
    }

    /**
     * Sets the value of the prtBilNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public void setPrtBilNotDesc(PrtBilNotDescType value) {
        this.prtBilNotDesc = value;
    }

    /**
     * Gets the value of the prtPastDueNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtPastDueNotDescType }
     *     
     */
    public PrtPastDueNotDescType getPrtPastDueNotDesc() {
        return prtPastDueNotDesc;
    }

    /**
     * Sets the value of the prtPastDueNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtPastDueNotDescType }
     *     
     */
    public void setPrtPastDueNotDesc(PrtPastDueNotDescType value) {
        this.prtPastDueNotDesc = value;
    }

    /**
     * Gets the value of the prtcpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpDescType }
     *     
     */
    public PrtcpDescType getPrtcpDesc() {
        return prtcpDesc;
    }

    /**
     * Sets the value of the prtcpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpDescType }
     *     
     */
    public void setPrtcpDesc(PrtcpDescType value) {
        this.prtcpDesc = value;
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
