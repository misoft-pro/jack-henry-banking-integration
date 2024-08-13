
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RptChapInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RptChapInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RptChapExst" type="{http://jackhenry.com/jxchange/TPG/2008}RptChapExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="RptChapType" type="{http://jackhenry.com/jxchange/TPG/2008}RptChapType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSExmpCode" type="{http://jackhenry.com/jxchange/TPG/2008}IRSExmpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSExmpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IRSExmpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSRecipCode" type="{http://jackhenry.com/jxchange/TPG/2008}IRSRecipCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSRecipDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IRSRecipDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RptChapInfoRec_CType", propOrder = {
    "rptChapExst",
    "rptChapType",
    "irsExmpCode",
    "irsExmpDesc",
    "irsRecipCode",
    "irsRecipDesc",
    "custom",
    "ver1",
    "any"
})
public class RptChapInfoRecCType {

    @XmlElement(name = "RptChapExst")
    protected RptChapExstType rptChapExst;
    @XmlElement(name = "RptChapType")
    protected RptChapTypeType rptChapType;
    @XmlElement(name = "IRSExmpCode")
    protected IRSExmpCodeType irsExmpCode;
    @XmlElement(name = "IRSExmpDesc")
    protected IRSExmpDescType irsExmpDesc;
    @XmlElement(name = "IRSRecipCode")
    protected IRSRecipCodeType irsRecipCode;
    @XmlElement(name = "IRSRecipDesc")
    protected IRSRecipDescType irsRecipDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rptChapExst property.
     * 
     * @return
     *     possible object is
     *     {@link RptChapExstType }
     *     
     */
    public RptChapExstType getRptChapExst() {
        return rptChapExst;
    }

    /**
     * Sets the value of the rptChapExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RptChapExstType }
     *     
     */
    public void setRptChapExst(RptChapExstType value) {
        this.rptChapExst = value;
    }

    /**
     * Gets the value of the rptChapType property.
     * 
     * @return
     *     possible object is
     *     {@link RptChapTypeType }
     *     
     */
    public RptChapTypeType getRptChapType() {
        return rptChapType;
    }

    /**
     * Sets the value of the rptChapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RptChapTypeType }
     *     
     */
    public void setRptChapType(RptChapTypeType value) {
        this.rptChapType = value;
    }

    /**
     * Gets the value of the irsExmpCode property.
     * 
     * @return
     *     possible object is
     *     {@link IRSExmpCodeType }
     *     
     */
    public IRSExmpCodeType getIRSExmpCode() {
        return irsExmpCode;
    }

    /**
     * Sets the value of the irsExmpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRSExmpCodeType }
     *     
     */
    public void setIRSExmpCode(IRSExmpCodeType value) {
        this.irsExmpCode = value;
    }

    /**
     * Gets the value of the irsExmpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IRSExmpDescType }
     *     
     */
    public IRSExmpDescType getIRSExmpDesc() {
        return irsExmpDesc;
    }

    /**
     * Sets the value of the irsExmpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRSExmpDescType }
     *     
     */
    public void setIRSExmpDesc(IRSExmpDescType value) {
        this.irsExmpDesc = value;
    }

    /**
     * Gets the value of the irsRecipCode property.
     * 
     * @return
     *     possible object is
     *     {@link IRSRecipCodeType }
     *     
     */
    public IRSRecipCodeType getIRSRecipCode() {
        return irsRecipCode;
    }

    /**
     * Sets the value of the irsRecipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRSRecipCodeType }
     *     
     */
    public void setIRSRecipCode(IRSRecipCodeType value) {
        this.irsRecipCode = value;
    }

    /**
     * Gets the value of the irsRecipDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IRSRecipDescType }
     *     
     */
    public IRSRecipDescType getIRSRecipDesc() {
        return irsRecipDesc;
    }

    /**
     * Sets the value of the irsRecipDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRSRecipDescType }
     *     
     */
    public void setIRSRecipDesc(IRSRecipDescType value) {
        this.irsRecipDesc = value;
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
