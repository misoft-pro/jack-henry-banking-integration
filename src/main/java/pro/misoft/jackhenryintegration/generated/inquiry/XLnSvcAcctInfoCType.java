
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
 * <p>Java class for x_LnSvcAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnSvcAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnSvcAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnSvcAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="InvGroupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}InvGroupDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcActnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcActnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcReclassProcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcReclassProcDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnSvcAcctInfo_CType", propOrder = {
    "lnSvcAcctInfo",
    "invGroupDesc",
    "svcActnDesc",
    "svcReclassProcDesc",
    "custom",
    "ver1",
    "any"
})
public class XLnSvcAcctInfoCType {

    @XmlElement(name = "LnSvcAcctInfo")
    protected LnSvcAcctInfoCType lnSvcAcctInfo;
    @XmlElement(name = "InvGroupDesc")
    protected InvGroupDescType invGroupDesc;
    @XmlElement(name = "SvcActnDesc")
    protected SvcActnDescType svcActnDesc;
    @XmlElement(name = "SvcReclassProcDesc")
    protected SvcReclassProcDescType svcReclassProcDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnSvcAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnSvcAcctInfoCType }
     *     
     */
    public LnSvcAcctInfoCType getLnSvcAcctInfo() {
        return lnSvcAcctInfo;
    }

    /**
     * Sets the value of the lnSvcAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnSvcAcctInfoCType }
     *     
     */
    public void setLnSvcAcctInfo(LnSvcAcctInfoCType value) {
        this.lnSvcAcctInfo = value;
    }

    /**
     * Gets the value of the invGroupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InvGroupDescType }
     *     
     */
    public InvGroupDescType getInvGroupDesc() {
        return invGroupDesc;
    }

    /**
     * Sets the value of the invGroupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGroupDescType }
     *     
     */
    public void setInvGroupDesc(InvGroupDescType value) {
        this.invGroupDesc = value;
    }

    /**
     * Gets the value of the svcActnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcActnDescType }
     *     
     */
    public SvcActnDescType getSvcActnDesc() {
        return svcActnDesc;
    }

    /**
     * Sets the value of the svcActnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcActnDescType }
     *     
     */
    public void setSvcActnDesc(SvcActnDescType value) {
        this.svcActnDesc = value;
    }

    /**
     * Gets the value of the svcReclassProcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcReclassProcDescType }
     *     
     */
    public SvcReclassProcDescType getSvcReclassProcDesc() {
        return svcReclassProcDesc;
    }

    /**
     * Sets the value of the svcReclassProcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcReclassProcDescType }
     *     
     */
    public void setSvcReclassProcDesc(SvcReclassProcDescType value) {
        this.svcReclassProcDesc = value;
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
