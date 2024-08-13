
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
 * <p>Java class for EscrwPayoffInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwPayoffInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwTypeCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwTypeCode_Type"/&gt;
 *         &lt;element name="EscrwTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwTypeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclEscrwAmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ExclEscrwAmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomEscrwPayoffRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EscrwIntWithAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwIntWithAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExclEscrwIntAmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ExclEscrwIntAmtType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwPayoffInfo_CType", propOrder = {
    "escrwTypeCode",
    "escrwTypeDesc",
    "escrwCurBal",
    "escrwAccrInt",
    "exclEscrwAmtType",
    "customEscrwPayoffRec",
    "ver1",
    "escrwIntWithAmt",
    "exclEscrwIntAmtType",
    "ver2",
    "any"
})
public class EscrwPayoffInfoCType {

    @XmlElement(name = "EscrwTypeCode", required = true)
    protected EscrwTypeCodeType escrwTypeCode;
    @XmlElement(name = "EscrwTypeDesc")
    protected EscrwTypeDescType escrwTypeDesc;
    @XmlElement(name = "EscrwCurBal")
    protected EscrwCurBalType escrwCurBal;
    @XmlElement(name = "EscrwAccrInt")
    protected EscrwAccrIntType escrwAccrInt;
    @XmlElement(name = "ExclEscrwAmtType")
    protected ExclEscrwAmtTypeType exclEscrwAmtType;
    @XmlElement(name = "CustomEscrwPayoffRec")
    protected CustomCType customEscrwPayoffRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EscrwIntWithAmt")
    protected EscrwIntWithAmtType escrwIntWithAmt;
    @XmlElement(name = "ExclEscrwIntAmtType")
    protected ExclEscrwIntAmtTypeType exclEscrwIntAmtType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwTypeCodeType }
     *     
     */
    public EscrwTypeCodeType getEscrwTypeCode() {
        return escrwTypeCode;
    }

    /**
     * Sets the value of the escrwTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwTypeCodeType }
     *     
     */
    public void setEscrwTypeCode(EscrwTypeCodeType value) {
        this.escrwTypeCode = value;
    }

    /**
     * Gets the value of the escrwTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwTypeDescType }
     *     
     */
    public EscrwTypeDescType getEscrwTypeDesc() {
        return escrwTypeDesc;
    }

    /**
     * Sets the value of the escrwTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwTypeDescType }
     *     
     */
    public void setEscrwTypeDesc(EscrwTypeDescType value) {
        this.escrwTypeDesc = value;
    }

    /**
     * Gets the value of the escrwCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwCurBalType }
     *     
     */
    public EscrwCurBalType getEscrwCurBal() {
        return escrwCurBal;
    }

    /**
     * Sets the value of the escrwCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwCurBalType }
     *     
     */
    public void setEscrwCurBal(EscrwCurBalType value) {
        this.escrwCurBal = value;
    }

    /**
     * Gets the value of the escrwAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwAccrIntType }
     *     
     */
    public EscrwAccrIntType getEscrwAccrInt() {
        return escrwAccrInt;
    }

    /**
     * Sets the value of the escrwAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwAccrIntType }
     *     
     */
    public void setEscrwAccrInt(EscrwAccrIntType value) {
        this.escrwAccrInt = value;
    }

    /**
     * Gets the value of the exclEscrwAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link ExclEscrwAmtTypeType }
     *     
     */
    public ExclEscrwAmtTypeType getExclEscrwAmtType() {
        return exclEscrwAmtType;
    }

    /**
     * Sets the value of the exclEscrwAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclEscrwAmtTypeType }
     *     
     */
    public void setExclEscrwAmtType(ExclEscrwAmtTypeType value) {
        this.exclEscrwAmtType = value;
    }

    /**
     * Gets the value of the customEscrwPayoffRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomEscrwPayoffRec() {
        return customEscrwPayoffRec;
    }

    /**
     * Sets the value of the customEscrwPayoffRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomEscrwPayoffRec(CustomCType value) {
        this.customEscrwPayoffRec = value;
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
     * Gets the value of the escrwIntWithAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwIntWithAmtType }
     *     
     */
    public EscrwIntWithAmtType getEscrwIntWithAmt() {
        return escrwIntWithAmt;
    }

    /**
     * Sets the value of the escrwIntWithAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwIntWithAmtType }
     *     
     */
    public void setEscrwIntWithAmt(EscrwIntWithAmtType value) {
        this.escrwIntWithAmt = value;
    }

    /**
     * Gets the value of the exclEscrwIntAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link ExclEscrwIntAmtTypeType }
     *     
     */
    public ExclEscrwIntAmtTypeType getExclEscrwIntAmtType() {
        return exclEscrwIntAmtType;
    }

    /**
     * Sets the value of the exclEscrwIntAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclEscrwIntAmtTypeType }
     *     
     */
    public void setExclEscrwIntAmtType(ExclEscrwIntAmtTypeType value) {
        this.exclEscrwIntAmtType = value;
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
