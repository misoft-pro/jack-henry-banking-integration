
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PmtHubHistActRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubHistActRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtHubActStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubActStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubActStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubActStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtStatDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtStatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtStatRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtHubHistActRec_CType", propOrder = {
    "pmtHubActStat",
    "pmtHubActStatDesc",
    "pmtStatDt",
    "pmtStatRmk",
    "custom",
    "ver1",
    "any"
})
public class PmtHubHistActRecCType {

    @XmlElement(name = "PmtHubActStat")
    protected PmtHubActStatType pmtHubActStat;
    @XmlElement(name = "PmtHubActStatDesc")
    protected PmtHubActStatDescType pmtHubActStatDesc;
    @XmlElement(name = "PmtStatDt")
    protected PmtStatDtType pmtStatDt;
    @XmlElement(name = "PmtStatRmk")
    protected RmkType pmtStatRmk;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtHubActStat property.
     * 
     * @return
     *     possible object is
     *     {@link PmtHubActStatType }
     *     
     */
    public PmtHubActStatType getPmtHubActStat() {
        return pmtHubActStat;
    }

    /**
     * Sets the value of the pmtHubActStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtHubActStatType }
     *     
     */
    public void setPmtHubActStat(PmtHubActStatType value) {
        this.pmtHubActStat = value;
    }

    /**
     * Gets the value of the pmtHubActStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtHubActStatDescType }
     *     
     */
    public PmtHubActStatDescType getPmtHubActStatDesc() {
        return pmtHubActStatDesc;
    }

    /**
     * Sets the value of the pmtHubActStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtHubActStatDescType }
     *     
     */
    public void setPmtHubActStatDesc(PmtHubActStatDescType value) {
        this.pmtHubActStatDesc = value;
    }

    /**
     * Gets the value of the pmtStatDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatDtType }
     *     
     */
    public PmtStatDtType getPmtStatDt() {
        return pmtStatDt;
    }

    /**
     * Sets the value of the pmtStatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatDtType }
     *     
     */
    public void setPmtStatDt(PmtStatDtType value) {
        this.pmtStatDt = value;
    }

    /**
     * Gets the value of the pmtStatRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getPmtStatRmk() {
        return pmtStatRmk;
    }

    /**
     * Sets the value of the pmtStatRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setPmtStatRmk(RmkType value) {
        this.pmtStatRmk = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
