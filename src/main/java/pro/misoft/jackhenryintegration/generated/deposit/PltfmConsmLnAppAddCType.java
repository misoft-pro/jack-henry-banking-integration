
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
 * The complex for submitting a Consumer loan application.
 *             
 * 
 * <p>Java class for PltfmConsmLnAppAdd_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmConsmLnAppAdd_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAppLnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppLnInfo_CType"/&gt;
 *         &lt;element name="PltfmConsmCollatInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmConsmCollatInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppBorwInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppBorwInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppCoBorwArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppCoBorwArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PltfmConsmCollatInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmConsmCollatInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmConsmLnAppAdd_CType", propOrder = {
    "pltfmAppLnInfo",
    "pltfmConsmCollatInfo",
    "pltfmAppBorwInfo",
    "pltfmAppCoBorwArray",
    "custom",
    "ver1",
    "pltfmConsmCollatInfoArray",
    "ver2",
    "any"
})
public class PltfmConsmLnAppAddCType {

    @XmlElement(name = "PltfmAppLnInfo", required = true)
    protected PltfmAppLnInfoCType pltfmAppLnInfo;
    @XmlElement(name = "PltfmConsmCollatInfo")
    protected PltfmConsmCollatInfoCType pltfmConsmCollatInfo;
    @XmlElement(name = "PltfmAppBorwInfo")
    protected PltfmAppBorwInfoCType pltfmAppBorwInfo;
    @XmlElement(name = "PltfmAppCoBorwArray")
    protected PltfmAppCoBorwArrayAType pltfmAppCoBorwArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PltfmConsmCollatInfoArray")
    protected PltfmConsmCollatInfoArrayAType pltfmConsmCollatInfoArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pltfmAppLnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppLnInfoCType }
     *     
     */
    public PltfmAppLnInfoCType getPltfmAppLnInfo() {
        return pltfmAppLnInfo;
    }

    /**
     * Sets the value of the pltfmAppLnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppLnInfoCType }
     *     
     */
    public void setPltfmAppLnInfo(PltfmAppLnInfoCType value) {
        this.pltfmAppLnInfo = value;
    }

    /**
     * Gets the value of the pltfmConsmCollatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmConsmCollatInfoCType }
     *     
     */
    public PltfmConsmCollatInfoCType getPltfmConsmCollatInfo() {
        return pltfmConsmCollatInfo;
    }

    /**
     * Sets the value of the pltfmConsmCollatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmConsmCollatInfoCType }
     *     
     */
    public void setPltfmConsmCollatInfo(PltfmConsmCollatInfoCType value) {
        this.pltfmConsmCollatInfo = value;
    }

    /**
     * Gets the value of the pltfmAppBorwInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppBorwInfoCType }
     *     
     */
    public PltfmAppBorwInfoCType getPltfmAppBorwInfo() {
        return pltfmAppBorwInfo;
    }

    /**
     * Sets the value of the pltfmAppBorwInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppBorwInfoCType }
     *     
     */
    public void setPltfmAppBorwInfo(PltfmAppBorwInfoCType value) {
        this.pltfmAppBorwInfo = value;
    }

    /**
     * Gets the value of the pltfmAppCoBorwArray property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppCoBorwArrayAType }
     *     
     */
    public PltfmAppCoBorwArrayAType getPltfmAppCoBorwArray() {
        return pltfmAppCoBorwArray;
    }

    /**
     * Sets the value of the pltfmAppCoBorwArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppCoBorwArrayAType }
     *     
     */
    public void setPltfmAppCoBorwArray(PltfmAppCoBorwArrayAType value) {
        this.pltfmAppCoBorwArray = value;
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
     * Gets the value of the pltfmConsmCollatInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmConsmCollatInfoArrayAType }
     *     
     */
    public PltfmConsmCollatInfoArrayAType getPltfmConsmCollatInfoArray() {
        return pltfmConsmCollatInfoArray;
    }

    /**
     * Sets the value of the pltfmConsmCollatInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmConsmCollatInfoArrayAType }
     *     
     */
    public void setPltfmConsmCollatInfoArray(PltfmConsmCollatInfoArrayAType value) {
        this.pltfmConsmCollatInfoArray = value;
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
