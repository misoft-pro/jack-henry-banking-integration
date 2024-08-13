
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CustIncmInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustIncmInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppType" type="{http://jackhenry.com/jxchange/TPG/2008}AppType_Type"/&gt;
 *         &lt;element name="AppIncmMTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppIncmMTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppIncmQTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppIncmQTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppIncmYTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppIncmYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppIncmLTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppIncmLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppWavIncmMTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppWavIncmMTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppWavIncmQTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppWavIncmQTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppWavIncmYTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppWavIncmYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppWavIncmLTD" type="{http://jackhenry.com/jxchange/TPG/2008}AppWavIncmLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomCustIncmInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CustIncmInqRec_CType", propOrder = {
    "appType",
    "appIncmMTD",
    "appIncmQTD",
    "appIncmYTD",
    "appIncmLTD",
    "appWavIncmMTD",
    "appWavIncmQTD",
    "appWavIncmYTD",
    "appWavIncmLTD",
    "customCustIncmInqRec",
    "ver1",
    "any"
})
public class CustIncmInqRecCType {

    @XmlElement(name = "AppType", required = true)
    protected AppTypeType appType;
    @XmlElement(name = "AppIncmMTD")
    protected AppIncmMTDType appIncmMTD;
    @XmlElement(name = "AppIncmQTD")
    protected AppIncmQTDType appIncmQTD;
    @XmlElement(name = "AppIncmYTD")
    protected AppIncmYTDType appIncmYTD;
    @XmlElement(name = "AppIncmLTD")
    protected AppIncmLTDType appIncmLTD;
    @XmlElement(name = "AppWavIncmMTD")
    protected AppWavIncmMTDType appWavIncmMTD;
    @XmlElement(name = "AppWavIncmQTD")
    protected AppWavIncmQTDType appWavIncmQTD;
    @XmlElement(name = "AppWavIncmYTD")
    protected AppWavIncmYTDType appWavIncmYTD;
    @XmlElement(name = "AppWavIncmLTD")
    protected AppWavIncmLTDType appWavIncmLTD;
    @XmlElement(name = "CustomCustIncmInqRec")
    protected CustomCType customCustIncmInqRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the appType property.
     * 
     * @return
     *     possible object is
     *     {@link AppTypeType }
     *     
     */
    public AppTypeType getAppType() {
        return appType;
    }

    /**
     * Sets the value of the appType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppTypeType }
     *     
     */
    public void setAppType(AppTypeType value) {
        this.appType = value;
    }

    /**
     * Gets the value of the appIncmMTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppIncmMTDType }
     *     
     */
    public AppIncmMTDType getAppIncmMTD() {
        return appIncmMTD;
    }

    /**
     * Sets the value of the appIncmMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppIncmMTDType }
     *     
     */
    public void setAppIncmMTD(AppIncmMTDType value) {
        this.appIncmMTD = value;
    }

    /**
     * Gets the value of the appIncmQTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppIncmQTDType }
     *     
     */
    public AppIncmQTDType getAppIncmQTD() {
        return appIncmQTD;
    }

    /**
     * Sets the value of the appIncmQTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppIncmQTDType }
     *     
     */
    public void setAppIncmQTD(AppIncmQTDType value) {
        this.appIncmQTD = value;
    }

    /**
     * Gets the value of the appIncmYTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppIncmYTDType }
     *     
     */
    public AppIncmYTDType getAppIncmYTD() {
        return appIncmYTD;
    }

    /**
     * Sets the value of the appIncmYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppIncmYTDType }
     *     
     */
    public void setAppIncmYTD(AppIncmYTDType value) {
        this.appIncmYTD = value;
    }

    /**
     * Gets the value of the appIncmLTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppIncmLTDType }
     *     
     */
    public AppIncmLTDType getAppIncmLTD() {
        return appIncmLTD;
    }

    /**
     * Sets the value of the appIncmLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppIncmLTDType }
     *     
     */
    public void setAppIncmLTD(AppIncmLTDType value) {
        this.appIncmLTD = value;
    }

    /**
     * Gets the value of the appWavIncmMTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppWavIncmMTDType }
     *     
     */
    public AppWavIncmMTDType getAppWavIncmMTD() {
        return appWavIncmMTD;
    }

    /**
     * Sets the value of the appWavIncmMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppWavIncmMTDType }
     *     
     */
    public void setAppWavIncmMTD(AppWavIncmMTDType value) {
        this.appWavIncmMTD = value;
    }

    /**
     * Gets the value of the appWavIncmQTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppWavIncmQTDType }
     *     
     */
    public AppWavIncmQTDType getAppWavIncmQTD() {
        return appWavIncmQTD;
    }

    /**
     * Sets the value of the appWavIncmQTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppWavIncmQTDType }
     *     
     */
    public void setAppWavIncmQTD(AppWavIncmQTDType value) {
        this.appWavIncmQTD = value;
    }

    /**
     * Gets the value of the appWavIncmYTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppWavIncmYTDType }
     *     
     */
    public AppWavIncmYTDType getAppWavIncmYTD() {
        return appWavIncmYTD;
    }

    /**
     * Sets the value of the appWavIncmYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppWavIncmYTDType }
     *     
     */
    public void setAppWavIncmYTD(AppWavIncmYTDType value) {
        this.appWavIncmYTD = value;
    }

    /**
     * Gets the value of the appWavIncmLTD property.
     * 
     * @return
     *     possible object is
     *     {@link AppWavIncmLTDType }
     *     
     */
    public AppWavIncmLTDType getAppWavIncmLTD() {
        return appWavIncmLTD;
    }

    /**
     * Sets the value of the appWavIncmLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppWavIncmLTDType }
     *     
     */
    public void setAppWavIncmLTD(AppWavIncmLTDType value) {
        this.appWavIncmLTD = value;
    }

    /**
     * Gets the value of the customCustIncmInqRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomCustIncmInqRec() {
        return customCustIncmInqRec;
    }

    /**
     * Sets the value of the customCustIncmInqRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomCustIncmInqRec(CustomCType value) {
        this.customCustIncmInqRec = value;
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
