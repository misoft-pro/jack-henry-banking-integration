
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DepAcctInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAcctInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="x_DepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_DepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_DepBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_DepNSFODInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepNSFODInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_DepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_DepRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_DepStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepStmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_DepTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_DepTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="x_IdVerify" type="{http://jackhenry.com/jxchange/TPG/2008}x_IdVerify_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="x_AcctBenf" type="{http://jackhenry.com/jxchange/TPG/2008}x_AcctBenf_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="x_ACHPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_ACHPmtInfo_CType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="x_TrnTotArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_TrnTotArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAcctInqRec_CType", propOrder = {
    "xDepInfoRec",
    "xDepAcctInfo",
    "xDepBalDtInfo",
    "xDepNSFODInfo",
    "xDepRateIntInfo",
    "xDepRegRptInfo",
    "xDepStmtInfo",
    "xDepTaxInfo",
    "custom",
    "ver1",
    "xIdVerify",
    "ver2",
    "xAcctBenf",
    "ver3",
    "xachPmtInfo",
    "ver4",
    "xTrnTotArray",
    "ver5",
    "any"
})
public class DepAcctInqRecCType {

    @XmlElement(name = "x_DepInfoRec")
    protected XDepInfoRecCType xDepInfoRec;
    @XmlElement(name = "x_DepAcctInfo")
    protected XDepAcctInfoCType xDepAcctInfo;
    @XmlElement(name = "x_DepBalDtInfo")
    protected XDepBalDtInfoCType xDepBalDtInfo;
    @XmlElement(name = "x_DepNSFODInfo")
    protected XDepNSFODInfoCType xDepNSFODInfo;
    @XmlElement(name = "x_DepRateIntInfo")
    protected XDepRateIntInfoCType xDepRateIntInfo;
    @XmlElement(name = "x_DepRegRptInfo")
    protected XDepRegRptInfoCType xDepRegRptInfo;
    @XmlElement(name = "x_DepStmtInfo")
    protected XDepStmtInfoCType xDepStmtInfo;
    @XmlElement(name = "x_DepTaxInfo")
    protected XDepTaxInfoCType xDepTaxInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "x_IdVerify")
    protected XIdVerifyCType xIdVerify;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "x_AcctBenf")
    protected XAcctBenfCType xAcctBenf;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "x_ACHPmtInfo")
    protected XACHPmtInfoCType xachPmtInfo;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "x_TrnTotArray")
    protected XTrnTotArrayAType xTrnTotArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the xDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link XDepInfoRecCType }
     *     
     */
    public XDepInfoRecCType getXDepInfoRec() {
        return xDepInfoRec;
    }

    /**
     * Sets the value of the xDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepInfoRecCType }
     *     
     */
    public void setXDepInfoRec(XDepInfoRecCType value) {
        this.xDepInfoRec = value;
    }

    /**
     * Gets the value of the xDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XDepAcctInfoCType }
     *     
     */
    public XDepAcctInfoCType getXDepAcctInfo() {
        return xDepAcctInfo;
    }

    /**
     * Sets the value of the xDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepAcctInfoCType }
     *     
     */
    public void setXDepAcctInfo(XDepAcctInfoCType value) {
        this.xDepAcctInfo = value;
    }

    /**
     * Gets the value of the xDepBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XDepBalDtInfoCType }
     *     
     */
    public XDepBalDtInfoCType getXDepBalDtInfo() {
        return xDepBalDtInfo;
    }

    /**
     * Sets the value of the xDepBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepBalDtInfoCType }
     *     
     */
    public void setXDepBalDtInfo(XDepBalDtInfoCType value) {
        this.xDepBalDtInfo = value;
    }

    /**
     * Gets the value of the xDepNSFODInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XDepNSFODInfoCType }
     *     
     */
    public XDepNSFODInfoCType getXDepNSFODInfo() {
        return xDepNSFODInfo;
    }

    /**
     * Sets the value of the xDepNSFODInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepNSFODInfoCType }
     *     
     */
    public void setXDepNSFODInfo(XDepNSFODInfoCType value) {
        this.xDepNSFODInfo = value;
    }

    /**
     * Gets the value of the xDepRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XDepRateIntInfoCType }
     *     
     */
    public XDepRateIntInfoCType getXDepRateIntInfo() {
        return xDepRateIntInfo;
    }

    /**
     * Sets the value of the xDepRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepRateIntInfoCType }
     *     
     */
    public void setXDepRateIntInfo(XDepRateIntInfoCType value) {
        this.xDepRateIntInfo = value;
    }

    /**
     * Gets the value of the xDepRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XDepRegRptInfoCType }
     *     
     */
    public XDepRegRptInfoCType getXDepRegRptInfo() {
        return xDepRegRptInfo;
    }

    /**
     * Sets the value of the xDepRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepRegRptInfoCType }
     *     
     */
    public void setXDepRegRptInfo(XDepRegRptInfoCType value) {
        this.xDepRegRptInfo = value;
    }

    /**
     * Gets the value of the xDepStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XDepStmtInfoCType }
     *     
     */
    public XDepStmtInfoCType getXDepStmtInfo() {
        return xDepStmtInfo;
    }

    /**
     * Sets the value of the xDepStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepStmtInfoCType }
     *     
     */
    public void setXDepStmtInfo(XDepStmtInfoCType value) {
        this.xDepStmtInfo = value;
    }

    /**
     * Gets the value of the xDepTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XDepTaxInfoCType }
     *     
     */
    public XDepTaxInfoCType getXDepTaxInfo() {
        return xDepTaxInfo;
    }

    /**
     * Sets the value of the xDepTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDepTaxInfoCType }
     *     
     */
    public void setXDepTaxInfo(XDepTaxInfoCType value) {
        this.xDepTaxInfo = value;
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
     * Gets the value of the xIdVerify property.
     * 
     * @return
     *     possible object is
     *     {@link XIdVerifyCType }
     *     
     */
    public XIdVerifyCType getXIdVerify() {
        return xIdVerify;
    }

    /**
     * Sets the value of the xIdVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link XIdVerifyCType }
     *     
     */
    public void setXIdVerify(XIdVerifyCType value) {
        this.xIdVerify = value;
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
     * Gets the value of the xAcctBenf property.
     * 
     * @return
     *     possible object is
     *     {@link XAcctBenfCType }
     *     
     */
    public XAcctBenfCType getXAcctBenf() {
        return xAcctBenf;
    }

    /**
     * Sets the value of the xAcctBenf property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAcctBenfCType }
     *     
     */
    public void setXAcctBenf(XAcctBenfCType value) {
        this.xAcctBenf = value;
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
     * Gets the value of the xachPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XACHPmtInfoCType }
     *     
     */
    public XACHPmtInfoCType getXACHPmtInfo() {
        return xachPmtInfo;
    }

    /**
     * Sets the value of the xachPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XACHPmtInfoCType }
     *     
     */
    public void setXACHPmtInfo(XACHPmtInfoCType value) {
        this.xachPmtInfo = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
    }

    /**
     * Gets the value of the xTrnTotArray property.
     * 
     * @return
     *     possible object is
     *     {@link XTrnTotArrayAType }
     *     
     */
    public XTrnTotArrayAType getXTrnTotArray() {
        return xTrnTotArray;
    }

    /**
     * Sets the value of the xTrnTotArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTrnTotArrayAType }
     *     
     */
    public void setXTrnTotArray(XTrnTotArrayAType value) {
        this.xTrnTotArray = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
