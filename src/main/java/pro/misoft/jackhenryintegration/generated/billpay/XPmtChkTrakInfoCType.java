
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
 * A package of data related to a payment check
 *     tracking
 * 
 * <p>Java class for x_PmtChkTrakInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_PmtChkTrakInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtChkTrakCarr" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakCarr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkTrakId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtChkTrakArray" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "x_PmtChkTrakInfo_CType", propOrder = {
    "pmtChkTrakCarr",
    "pmtChkTrakId",
    "pmtChkTrakArray",
    "custom",
    "ver1",
    "any"
})
public class XPmtChkTrakInfoCType {

    @XmlElement(name = "PmtChkTrakCarr")
    protected PmtChkTrakCarrType pmtChkTrakCarr;
    @XmlElement(name = "PmtChkTrakId")
    protected PmtChkTrakIdType pmtChkTrakId;
    @XmlElement(name = "PmtChkTrakArray")
    protected PmtChkTrakArrayAType pmtChkTrakArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtChkTrakCarr property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkTrakCarrType }
     *     
     */
    public PmtChkTrakCarrType getPmtChkTrakCarr() {
        return pmtChkTrakCarr;
    }

    /**
     * Sets the value of the pmtChkTrakCarr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkTrakCarrType }
     *     
     */
    public void setPmtChkTrakCarr(PmtChkTrakCarrType value) {
        this.pmtChkTrakCarr = value;
    }

    /**
     * Gets the value of the pmtChkTrakId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkTrakIdType }
     *     
     */
    public PmtChkTrakIdType getPmtChkTrakId() {
        return pmtChkTrakId;
    }

    /**
     * Sets the value of the pmtChkTrakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkTrakIdType }
     *     
     */
    public void setPmtChkTrakId(PmtChkTrakIdType value) {
        this.pmtChkTrakId = value;
    }

    /**
     * Gets the value of the pmtChkTrakArray property.
     * 
     * @return
     *     possible object is
     *     {@link PmtChkTrakArrayAType }
     *     
     */
    public PmtChkTrakArrayAType getPmtChkTrakArray() {
        return pmtChkTrakArray;
    }

    /**
     * Sets the value of the pmtChkTrakArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtChkTrakArrayAType }
     *     
     */
    public void setPmtChkTrakArray(PmtChkTrakArrayAType value) {
        this.pmtChkTrakArray = value;
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
