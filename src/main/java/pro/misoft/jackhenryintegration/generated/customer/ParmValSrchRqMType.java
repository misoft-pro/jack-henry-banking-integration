
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for ParmValSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParmValSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="ParmName" type="{http://jackhenry.com/jxchange/TPG/2008}ParmName_Type"/&gt;
 *         &lt;element name="ParmCallLvl" type="{http://jackhenry.com/jxchange/TPG/2008}ParmCallLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="ParmCriteriaArray" type="{http://jackhenry.com/jxchange/TPG/2008}ParmCriteriaArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ParmSvcName" type="{http://jackhenry.com/jxchange/TPG/2008}ParmSvcName_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ParmValSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "parmName",
    "parmCallLvl",
    "parmCriteriaArray",
    "custom",
    "ver1",
    "parmSvcName",
    "ver2",
    "any"
})
public class ParmValSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElement(name = "ParmName", required = true)
    protected ParmNameType parmName;
    @XmlElementRef(name = "ParmCallLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ParmCallLvlType> parmCallLvl;
    @XmlElementRef(name = "ParmCriteriaArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ParmCriteriaArrayAType> parmCriteriaArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ParmSvcName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ParmSvcNameType> parmSvcName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public SrchMsgRqHdrCType getSrchMsgRqHdr() {
        return srchMsgRqHdr;
    }

    /**
     * Sets the value of the srchMsgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public void setSrchMsgRqHdr(SrchMsgRqHdrCType value) {
        this.srchMsgRqHdr = value;
    }

    /**
     * Gets the value of the parmName property.
     * 
     * @return
     *     possible object is
     *     {@link ParmNameType }
     *     
     */
    public ParmNameType getParmName() {
        return parmName;
    }

    /**
     * Sets the value of the parmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParmNameType }
     *     
     */
    public void setParmName(ParmNameType value) {
        this.parmName = value;
    }

    /**
     * Gets the value of the parmCallLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParmCallLvlType }{@code >}
     *     
     */
    public JAXBElement<ParmCallLvlType> getParmCallLvl() {
        return parmCallLvl;
    }

    /**
     * Sets the value of the parmCallLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParmCallLvlType }{@code >}
     *     
     */
    public void setParmCallLvl(JAXBElement<ParmCallLvlType> value) {
        this.parmCallLvl = value;
    }

    /**
     * Gets the value of the parmCriteriaArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParmCriteriaArrayAType }{@code >}
     *     
     */
    public JAXBElement<ParmCriteriaArrayAType> getParmCriteriaArray() {
        return parmCriteriaArray;
    }

    /**
     * Sets the value of the parmCriteriaArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParmCriteriaArrayAType }{@code >}
     *     
     */
    public void setParmCriteriaArray(JAXBElement<ParmCriteriaArrayAType> value) {
        this.parmCriteriaArray = value;
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
     * Gets the value of the parmSvcName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParmSvcNameType }{@code >}
     *     
     */
    public JAXBElement<ParmSvcNameType> getParmSvcName() {
        return parmSvcName;
    }

    /**
     * Sets the value of the parmSvcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParmSvcNameType }{@code >}
     *     
     */
    public void setParmSvcName(JAXBElement<ParmSvcNameType> value) {
        this.parmSvcName = value;
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
