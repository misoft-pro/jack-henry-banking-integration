
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SafeDepAcctInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeDepAcctInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="x_SafeDepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_SafeDepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_SafeDepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_SafeDepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="x_IdVerify" type="{http://jackhenry.com/jxchange/TPG/2008}x_IdVerify_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeDepAcctInqRec_CType", propOrder = {
    "xSafeDepInfoRec",
    "xSafeDepAcctInfo",
    "ver1",
    "xIdVerify",
    "ver2",
    "any"
})
public class SafeDepAcctInqRecCType {

    @XmlElement(name = "x_SafeDepInfoRec")
    protected XSafeDepInfoRecCType xSafeDepInfoRec;
    @XmlElement(name = "x_SafeDepAcctInfo")
    protected XSafeDepAcctInfoCType xSafeDepAcctInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "x_IdVerify")
    protected XIdVerifyCType xIdVerify;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the xSafeDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link XSafeDepInfoRecCType }
     *     
     */
    public XSafeDepInfoRecCType getXSafeDepInfoRec() {
        return xSafeDepInfoRec;
    }

    /**
     * Sets the value of the xSafeDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSafeDepInfoRecCType }
     *     
     */
    public void setXSafeDepInfoRec(XSafeDepInfoRecCType value) {
        this.xSafeDepInfoRec = value;
    }

    /**
     * Gets the value of the xSafeDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XSafeDepAcctInfoCType }
     *     
     */
    public XSafeDepAcctInfoCType getXSafeDepAcctInfo() {
        return xSafeDepAcctInfo;
    }

    /**
     * Sets the value of the xSafeDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSafeDepAcctInfoCType }
     *     
     */
    public void setXSafeDepAcctInfo(XSafeDepAcctInfoCType value) {
        this.xSafeDepAcctInfo = value;
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
     * Gets the value of the xIdVerify property.
     * 
     * @return
     *     possible object is
     *     {@link XIdVerifyCType }
     *     
     */
    public XIdVerifyCType getXIdVerify() {
        return xIdVerify;
    }

    /**
     * Sets the value of the xIdVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIdVerifyCType }
     *     
     */
    public void setXIdVerify(XIdVerifyCType value) {
        this.xIdVerify = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
