
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
 * <p>Java class for FeePayoffInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeePayoffInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeCode_Type"/&gt;
 *         &lt;element name="LnFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclFeeAmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ExclFeeAmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomFeePayoffRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "FeePayoffInfo_CType", propOrder = {
    "lnFeeCode",
    "lnFeeDesc",
    "lnFeeAmt",
    "exclFeeAmtType",
    "customFeePayoffRec",
    "ver1",
    "any"
})
public class FeePayoffInfoCType {

    @XmlElement(name = "LnFeeCode", required = true)
    protected LnFeeCodeType lnFeeCode;
    @XmlElement(name = "LnFeeDesc")
    protected LnFeeDescType lnFeeDesc;
    @XmlElement(name = "LnFeeAmt")
    protected LnFeeAmtType lnFeeAmt;
    @XmlElement(name = "ExclFeeAmtType")
    protected ExclFeeAmtTypeType exclFeeAmtType;
    @XmlElement(name = "CustomFeePayoffRec")
    protected CustomCType customFeePayoffRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeCodeType }
     *     
     */
    public LnFeeCodeType getLnFeeCode() {
        return lnFeeCode;
    }

    /**
     * Sets the value of the lnFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeCodeType }
     *     
     */
    public void setLnFeeCode(LnFeeCodeType value) {
        this.lnFeeCode = value;
    }

    /**
     * Gets the value of the lnFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeDescType }
     *     
     */
    public LnFeeDescType getLnFeeDesc() {
        return lnFeeDesc;
    }

    /**
     * Sets the value of the lnFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeDescType }
     *     
     */
    public void setLnFeeDesc(LnFeeDescType value) {
        this.lnFeeDesc = value;
    }

    /**
     * Gets the value of the lnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeAmtType }
     *     
     */
    public LnFeeAmtType getLnFeeAmt() {
        return lnFeeAmt;
    }

    /**
     * Sets the value of the lnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeAmtType }
     *     
     */
    public void setLnFeeAmt(LnFeeAmtType value) {
        this.lnFeeAmt = value;
    }

    /**
     * Gets the value of the exclFeeAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link ExclFeeAmtTypeType }
     *     
     */
    public ExclFeeAmtTypeType getExclFeeAmtType() {
        return exclFeeAmtType;
    }

    /**
     * Sets the value of the exclFeeAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclFeeAmtTypeType }
     *     
     */
    public void setExclFeeAmtType(ExclFeeAmtTypeType value) {
        this.exclFeeAmtType = value;
    }

    /**
     * Gets the value of the customFeePayoffRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomFeePayoffRec() {
        return customFeePayoffRec;
    }

    /**
     * Sets the value of the customFeePayoffRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomFeePayoffRec(CustomCType value) {
        this.customFeePayoffRec = value;
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
