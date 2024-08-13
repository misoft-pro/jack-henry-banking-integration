
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
 * The complex for submitting an deposit or savings account application.
 *             
 * 
 * <p>Java class for PltfmDepAppAdd_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmDepAppAdd_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAppCustArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppCustArray_AType"/&gt;
 *         &lt;element name="PltfmAppDepInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppDepInfo_CType"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PltfmAppSigInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppSigInfo_CType"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PltfmAppTaxPlnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppTaxPlnInfo_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "PltfmDepAppAdd_CType", propOrder = {
    "pltfmAppCustArray",
    "pltfmAppDepInfo",
    "custom",
    "ver1",
    "pltfmAppSigInfo",
    "ver2",
    "pltfmAppTaxPlnInfo",
    "ver3",
    "any"
})
public class PltfmDepAppAddCType {

    @XmlElement(name = "PltfmAppCustArray", required = true)
    protected PltfmAppCustArrayAType pltfmAppCustArray;
    @XmlElement(name = "PltfmAppDepInfo", required = true)
    protected PltfmAppDepInfoCType pltfmAppDepInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PltfmAppSigInfo")
    protected PltfmAppSigInfoCType pltfmAppSigInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PltfmAppTaxPlnInfo")
    protected PltfmAppTaxPlnInfoCType pltfmAppTaxPlnInfo;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pltfmAppCustArray property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppCustArrayAType }
     *     
     */
    public PltfmAppCustArrayAType getPltfmAppCustArray() {
        return pltfmAppCustArray;
    }

    /**
     * Sets the value of the pltfmAppCustArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppCustArrayAType }
     *     
     */
    public void setPltfmAppCustArray(PltfmAppCustArrayAType value) {
        this.pltfmAppCustArray = value;
    }

    /**
     * Gets the value of the pltfmAppDepInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppDepInfoCType }
     *     
     */
    public PltfmAppDepInfoCType getPltfmAppDepInfo() {
        return pltfmAppDepInfo;
    }

    /**
     * Sets the value of the pltfmAppDepInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppDepInfoCType }
     *     
     */
    public void setPltfmAppDepInfo(PltfmAppDepInfoCType value) {
        this.pltfmAppDepInfo = value;
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
     * Gets the value of the pltfmAppSigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppSigInfoCType }
     *     
     */
    public PltfmAppSigInfoCType getPltfmAppSigInfo() {
        return pltfmAppSigInfo;
    }

    /**
     * Sets the value of the pltfmAppSigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppSigInfoCType }
     *     
     */
    public void setPltfmAppSigInfo(PltfmAppSigInfoCType value) {
        this.pltfmAppSigInfo = value;
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
     * Gets the value of the pltfmAppTaxPlnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppTaxPlnInfoCType }
     *     
     */
    public PltfmAppTaxPlnInfoCType getPltfmAppTaxPlnInfo() {
        return pltfmAppTaxPlnInfo;
    }

    /**
     * Sets the value of the pltfmAppTaxPlnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppTaxPlnInfoCType }
     *     
     */
    public void setPltfmAppTaxPlnInfo(PltfmAppTaxPlnInfoCType value) {
        this.pltfmAppTaxPlnInfo = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
