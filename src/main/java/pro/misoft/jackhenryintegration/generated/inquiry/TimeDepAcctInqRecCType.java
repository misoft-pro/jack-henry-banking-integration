
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
 * <p>Java class for TimeDepAcctInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepAcctInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="x_TimeDepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TimeDepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TimeDepBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TimeDepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TimeDepRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TimeDepStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepStmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TimeDepRenInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepRenInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_TimeDepTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_TimeDepTaxInfo_CType" minOccurs="0"/&gt;
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
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepAcctInqRec_CType", propOrder = {
    "xTimeDepInfoRec",
    "xTimeDepAcctInfo",
    "xTimeDepBalDtInfo",
    "xTimeDepRateIntInfo",
    "xTimeDepRegRptInfo",
    "xTimeDepStmtInfo",
    "xTimeDepRenInfo",
    "xTimeDepTaxInfo",
    "ver1",
    "xIdVerify",
    "ver2",
    "xAcctBenf",
    "ver3",
    "xachPmtInfo",
    "ver4",
    "any"
})
public class TimeDepAcctInqRecCType {

    @XmlElement(name = "x_TimeDepInfoRec")
    protected XTimeDepInfoRecCType xTimeDepInfoRec;
    @XmlElement(name = "x_TimeDepAcctInfo")
    protected XTimeDepAcctInfoCType xTimeDepAcctInfo;
    @XmlElement(name = "x_TimeDepBalDtInfo")
    protected XTimeDepBalDtInfoCType xTimeDepBalDtInfo;
    @XmlElement(name = "x_TimeDepRateIntInfo")
    protected XTimeDepRateIntInfoCType xTimeDepRateIntInfo;
    @XmlElement(name = "x_TimeDepRegRptInfo")
    protected XTimeDepRegRptInfoCType xTimeDepRegRptInfo;
    @XmlElement(name = "x_TimeDepStmtInfo")
    protected XTimeDepStmtInfoCType xTimeDepStmtInfo;
    @XmlElement(name = "x_TimeDepRenInfo")
    protected XTimeDepRenInfoCType xTimeDepRenInfo;
    @XmlElement(name = "x_TimeDepTaxInfo")
    protected XTimeDepTaxInfoCType xTimeDepTaxInfo;
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
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the xTimeDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepInfoRecCType }
     *     
     */
    public XTimeDepInfoRecCType getXTimeDepInfoRec() {
        return xTimeDepInfoRec;
    }

    /**
     * Sets the value of the xTimeDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepInfoRecCType }
     *     
     */
    public void setXTimeDepInfoRec(XTimeDepInfoRecCType value) {
        this.xTimeDepInfoRec = value;
    }

    /**
     * Gets the value of the xTimeDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepAcctInfoCType }
     *     
     */
    public XTimeDepAcctInfoCType getXTimeDepAcctInfo() {
        return xTimeDepAcctInfo;
    }

    /**
     * Sets the value of the xTimeDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepAcctInfoCType }
     *     
     */
    public void setXTimeDepAcctInfo(XTimeDepAcctInfoCType value) {
        this.xTimeDepAcctInfo = value;
    }

    /**
     * Gets the value of the xTimeDepBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepBalDtInfoCType }
     *     
     */
    public XTimeDepBalDtInfoCType getXTimeDepBalDtInfo() {
        return xTimeDepBalDtInfo;
    }

    /**
     * Sets the value of the xTimeDepBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepBalDtInfoCType }
     *     
     */
    public void setXTimeDepBalDtInfo(XTimeDepBalDtInfoCType value) {
        this.xTimeDepBalDtInfo = value;
    }

    /**
     * Gets the value of the xTimeDepRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepRateIntInfoCType }
     *     
     */
    public XTimeDepRateIntInfoCType getXTimeDepRateIntInfo() {
        return xTimeDepRateIntInfo;
    }

    /**
     * Sets the value of the xTimeDepRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepRateIntInfoCType }
     *     
     */
    public void setXTimeDepRateIntInfo(XTimeDepRateIntInfoCType value) {
        this.xTimeDepRateIntInfo = value;
    }

    /**
     * Gets the value of the xTimeDepRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepRegRptInfoCType }
     *     
     */
    public XTimeDepRegRptInfoCType getXTimeDepRegRptInfo() {
        return xTimeDepRegRptInfo;
    }

    /**
     * Sets the value of the xTimeDepRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepRegRptInfoCType }
     *     
     */
    public void setXTimeDepRegRptInfo(XTimeDepRegRptInfoCType value) {
        this.xTimeDepRegRptInfo = value;
    }

    /**
     * Gets the value of the xTimeDepStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepStmtInfoCType }
     *     
     */
    public XTimeDepStmtInfoCType getXTimeDepStmtInfo() {
        return xTimeDepStmtInfo;
    }

    /**
     * Sets the value of the xTimeDepStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepStmtInfoCType }
     *     
     */
    public void setXTimeDepStmtInfo(XTimeDepStmtInfoCType value) {
        this.xTimeDepStmtInfo = value;
    }

    /**
     * Gets the value of the xTimeDepRenInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepRenInfoCType }
     *     
     */
    public XTimeDepRenInfoCType getXTimeDepRenInfo() {
        return xTimeDepRenInfo;
    }

    /**
     * Sets the value of the xTimeDepRenInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepRenInfoCType }
     *     
     */
    public void setXTimeDepRenInfo(XTimeDepRenInfoCType value) {
        this.xTimeDepRenInfo = value;
    }

    /**
     * Gets the value of the xTimeDepTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XTimeDepTaxInfoCType }
     *     
     */
    public XTimeDepTaxInfoCType getXTimeDepTaxInfo() {
        return xTimeDepTaxInfo;
    }

    /**
     * Sets the value of the xTimeDepTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTimeDepTaxInfoCType }
     *     
     */
    public void setXTimeDepTaxInfo(XTimeDepTaxInfoCType value) {
        this.xTimeDepTaxInfo = value;
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
