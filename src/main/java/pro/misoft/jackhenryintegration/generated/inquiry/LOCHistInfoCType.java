
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
 * <p>Java class for LOCHistInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCHistInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCHistText" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHistText_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCHighHist" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHighHist_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLowHist" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLowHist_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvgHist" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvgHist_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LOCHistInfo_CType", propOrder = {
    "locHistText",
    "locHighHist",
    "locLowHist",
    "locAvgHist",
    "ver1",
    "any"
})
public class LOCHistInfoCType {

    @XmlElement(name = "LOCHistText")
    protected LOCHistTextType locHistText;
    @XmlElement(name = "LOCHighHist")
    protected LOCHighHistType locHighHist;
    @XmlElement(name = "LOCLowHist")
    protected LOCLowHistType locLowHist;
    @XmlElement(name = "LOCAvgHist")
    protected LOCAvgHistType locAvgHist;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the locHistText property.
     * 
     * @return
     *     possible object is
     *     {@link LOCHistTextType }
     *     
     */
    public LOCHistTextType getLOCHistText() {
        return locHistText;
    }

    /**
     * Sets the value of the locHistText property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCHistTextType }
     *     
     */
    public void setLOCHistText(LOCHistTextType value) {
        this.locHistText = value;
    }

    /**
     * Gets the value of the locHighHist property.
     * 
     * @return
     *     possible object is
     *     {@link LOCHighHistType }
     *     
     */
    public LOCHighHistType getLOCHighHist() {
        return locHighHist;
    }

    /**
     * Sets the value of the locHighHist property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCHighHistType }
     *     
     */
    public void setLOCHighHist(LOCHighHistType value) {
        this.locHighHist = value;
    }

    /**
     * Gets the value of the locLowHist property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLowHistType }
     *     
     */
    public LOCLowHistType getLOCLowHist() {
        return locLowHist;
    }

    /**
     * Sets the value of the locLowHist property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLowHistType }
     *     
     */
    public void setLOCLowHist(LOCLowHistType value) {
        this.locLowHist = value;
    }

    /**
     * Gets the value of the locAvgHist property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvgHistType }
     *     
     */
    public LOCAvgHistType getLOCAvgHist() {
        return locAvgHist;
    }

    /**
     * Sets the value of the locAvgHist property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvgHistType }
     *     
     */
    public void setLOCAvgHist(LOCAvgHistType value) {
        this.locAvgHist = value;
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
