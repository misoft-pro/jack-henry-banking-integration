
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
 * <p>Java class for SvcFeeSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcFeeSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcFeeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeInfo_CType"/&gt;
 *         &lt;element name="SvcFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SvcFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *           &lt;element name="SvcFeeOrigTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="SvcFeeDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "SvcFeeSrchRec_CType", propOrder = {
    "svcFeeInfo",
    "svcFeeCode",
    "svcFeeDesc",
    "ver1",
    "svcFeeAmt",
    "svcFeeOrigTrnCode",
    "svcFeeDescArray",
    "ver2",
    "custom",
    "ver3",
    "any"
})
public class SvcFeeSrchRecCType {

    @XmlElement(name = "SvcFeeInfo", required = true)
    protected SvcFeeInfoCType svcFeeInfo;
    @XmlElement(name = "SvcFeeCode")
    protected SvcFeeCodeType svcFeeCode;
    @XmlElement(name = "SvcFeeDesc")
    protected SvcFeeDescType svcFeeDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SvcFeeAmt")
    protected AmtType svcFeeAmt;
    @XmlElement(name = "SvcFeeOrigTrnCode")
    protected TrnCodeCodeType svcFeeOrigTrnCode;
    @XmlElement(name = "SvcFeeDescArray")
    protected RmkAType svcFeeDescArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeInfoCType }
     *     
     */
    public SvcFeeInfoCType getSvcFeeInfo() {
        return svcFeeInfo;
    }

    /**
     * Sets the value of the svcFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeInfoCType }
     *     
     */
    public void setSvcFeeInfo(SvcFeeInfoCType value) {
        this.svcFeeInfo = value;
    }

    /**
     * Gets the value of the svcFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeCodeType }
     *     
     */
    public SvcFeeCodeType getSvcFeeCode() {
        return svcFeeCode;
    }

    /**
     * Sets the value of the svcFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeCodeType }
     *     
     */
    public void setSvcFeeCode(SvcFeeCodeType value) {
        this.svcFeeCode = value;
    }

    /**
     * Gets the value of the svcFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeDescType }
     *     
     */
    public SvcFeeDescType getSvcFeeDesc() {
        return svcFeeDesc;
    }

    /**
     * Sets the value of the svcFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeDescType }
     *     
     */
    public void setSvcFeeDesc(SvcFeeDescType value) {
        this.svcFeeDesc = value;
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
     * Gets the value of the svcFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getSvcFeeAmt() {
        return svcFeeAmt;
    }

    /**
     * Sets the value of the svcFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setSvcFeeAmt(AmtType value) {
        this.svcFeeAmt = value;
    }

    /**
     * Gets the value of the svcFeeOrigTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getSvcFeeOrigTrnCode() {
        return svcFeeOrigTrnCode;
    }

    /**
     * Sets the value of the svcFeeOrigTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setSvcFeeOrigTrnCode(TrnCodeCodeType value) {
        this.svcFeeOrigTrnCode = value;
    }

    /**
     * Gets the value of the svcFeeDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getSvcFeeDescArray() {
        return svcFeeDescArray;
    }

    /**
     * Sets the value of the svcFeeDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setSvcFeeDescArray(RmkAType value) {
        this.svcFeeDescArray = value;
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
