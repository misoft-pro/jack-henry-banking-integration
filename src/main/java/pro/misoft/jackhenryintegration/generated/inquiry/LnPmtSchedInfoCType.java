
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
 * <p>Java class for LnPmtSchedInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPmtSchedInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}PmtTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtSchedNum" type="{http://jackhenry.com/jxchange/TPG/2008}PmtSchedNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RepPmtSchedTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="SuspPmtSchedCode" type="{http://jackhenry.com/jxchange/TPG/2008}SuspPmtSchedCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RepPmtSchedNum" type="{http://jackhenry.com/jxchange/TPG/2008}RepPmtSchedNum_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="NumPmtsPaid" type="{http://jackhenry.com/jxchange/TPG/2008}NumPmtsPaid_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnPmtSchedInfo_CType", propOrder = {
    "pmtTerm",
    "pmtTermUnits",
    "semiDay1",
    "semiDay2",
    "pmtSchedNum",
    "pmtCode",
    "piAmt",
    "pmtAmt",
    "escrwPmtAmt",
    "pmtStartDt",
    "pmtEndDt",
    "repPmtSchedTerm",
    "suspPmtSchedCode",
    "repPmtSchedNum",
    "ver1",
    "numPmtsPaid",
    "ver2",
    "custom",
    "ver3",
    "any"
})
public class LnPmtSchedInfoCType {

    @XmlElementRef(name = "PmtTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtTermType> pmtTerm;
    @XmlElementRef(name = "PmtTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtTermUnitsType> pmtTermUnits;
    @XmlElementRef(name = "SemiDay1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay1Type> semiDay1;
    @XmlElementRef(name = "SemiDay2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay2Type> semiDay2;
    @XmlElement(name = "PmtSchedNum")
    protected PmtSchedNumType pmtSchedNum;
    @XmlElementRef(name = "PmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtCodeType> pmtCode;
    @XmlElementRef(name = "PIAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PIAmtType> piAmt;
    @XmlElementRef(name = "PmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtAmtType> pmtAmt;
    @XmlElementRef(name = "EscrwPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtAmtType> escrwPmtAmt;
    @XmlElementRef(name = "PmtStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDtType> pmtStartDt;
    @XmlElementRef(name = "PmtEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndDtType> pmtEndDt;
    @XmlElement(name = "RepPmtSchedTerm")
    protected TermCType repPmtSchedTerm;
    @XmlElementRef(name = "SuspPmtSchedCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SuspPmtSchedCodeType> suspPmtSchedCode;
    @XmlElementRef(name = "RepPmtSchedNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RepPmtSchedNumType> repPmtSchedNum;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "NumPmtsPaid")
    protected NumPmtsPaidType numPmtsPaid;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtTermType }{@code >}
     *     
     */
    public JAXBElement<PmtTermType> getPmtTerm() {
        return pmtTerm;
    }

    /**
     * Sets the value of the pmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtTermType }{@code >}
     *     
     */
    public void setPmtTerm(JAXBElement<PmtTermType> value) {
        this.pmtTerm = value;
    }

    /**
     * Gets the value of the pmtTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtTermUnitsType }{@code >}
     *     
     */
    public JAXBElement<PmtTermUnitsType> getPmtTermUnits() {
        return pmtTermUnits;
    }

    /**
     * Sets the value of the pmtTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtTermUnitsType }{@code >}
     *     
     */
    public void setPmtTermUnits(JAXBElement<PmtTermUnitsType> value) {
        this.pmtTermUnits = value;
    }

    /**
     * Gets the value of the semiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay1Type> getSemiDay1() {
        return semiDay1;
    }

    /**
     * Sets the value of the semiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public void setSemiDay1(JAXBElement<SemiDay1Type> value) {
        this.semiDay1 = value;
    }

    /**
     * Gets the value of the semiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay2Type> getSemiDay2() {
        return semiDay2;
    }

    /**
     * Sets the value of the semiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public void setSemiDay2(JAXBElement<SemiDay2Type> value) {
        this.semiDay2 = value;
    }

    /**
     * Gets the value of the pmtSchedNum property.
     * 
     * @return
     *     possible object is
     *     {@link PmtSchedNumType }
     *     
     */
    public PmtSchedNumType getPmtSchedNum() {
        return pmtSchedNum;
    }

    /**
     * Sets the value of the pmtSchedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtSchedNumType }
     *     
     */
    public void setPmtSchedNum(PmtSchedNumType value) {
        this.pmtSchedNum = value;
    }

    /**
     * Gets the value of the pmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtCodeType }{@code >}
     *     
     */
    public JAXBElement<PmtCodeType> getPmtCode() {
        return pmtCode;
    }

    /**
     * Sets the value of the pmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtCodeType }{@code >}
     *     
     */
    public void setPmtCode(JAXBElement<PmtCodeType> value) {
        this.pmtCode = value;
    }

    /**
     * Gets the value of the piAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PIAmtType }{@code >}
     *     
     */
    public JAXBElement<PIAmtType> getPIAmt() {
        return piAmt;
    }

    /**
     * Sets the value of the piAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PIAmtType }{@code >}
     *     
     */
    public void setPIAmt(JAXBElement<PIAmtType> value) {
        this.piAmt = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public JAXBElement<PmtAmtType> getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public void setPmtAmt(JAXBElement<PmtAmtType> value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the escrwPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtAmtType> getEscrwPmtAmt() {
        return escrwPmtAmt;
    }

    /**
     * Sets the value of the escrwPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAmtType }{@code >}
     *     
     */
    public void setEscrwPmtAmt(JAXBElement<EscrwPmtAmtType> value) {
        this.escrwPmtAmt = value;
    }

    /**
     * Gets the value of the pmtStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public JAXBElement<StartDtType> getPmtStartDt() {
        return pmtStartDt;
    }

    /**
     * Sets the value of the pmtStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public void setPmtStartDt(JAXBElement<StartDtType> value) {
        this.pmtStartDt = value;
    }

    /**
     * Gets the value of the pmtEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public JAXBElement<EndDtType> getPmtEndDt() {
        return pmtEndDt;
    }

    /**
     * Sets the value of the pmtEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public void setPmtEndDt(JAXBElement<EndDtType> value) {
        this.pmtEndDt = value;
    }

    /**
     * Gets the value of the repPmtSchedTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getRepPmtSchedTerm() {
        return repPmtSchedTerm;
    }

    /**
     * Sets the value of the repPmtSchedTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setRepPmtSchedTerm(TermCType value) {
        this.repPmtSchedTerm = value;
    }

    /**
     * Gets the value of the suspPmtSchedCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SuspPmtSchedCodeType }{@code >}
     *     
     */
    public JAXBElement<SuspPmtSchedCodeType> getSuspPmtSchedCode() {
        return suspPmtSchedCode;
    }

    /**
     * Sets the value of the suspPmtSchedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SuspPmtSchedCodeType }{@code >}
     *     
     */
    public void setSuspPmtSchedCode(JAXBElement<SuspPmtSchedCodeType> value) {
        this.suspPmtSchedCode = value;
    }

    /**
     * Gets the value of the repPmtSchedNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RepPmtSchedNumType }{@code >}
     *     
     */
    public JAXBElement<RepPmtSchedNumType> getRepPmtSchedNum() {
        return repPmtSchedNum;
    }

    /**
     * Sets the value of the repPmtSchedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RepPmtSchedNumType }{@code >}
     *     
     */
    public void setRepPmtSchedNum(JAXBElement<RepPmtSchedNumType> value) {
        this.repPmtSchedNum = value;
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
     * Gets the value of the numPmtsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link NumPmtsPaidType }
     *     
     */
    public NumPmtsPaidType getNumPmtsPaid() {
        return numPmtsPaid;
    }

    /**
     * Sets the value of the numPmtsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumPmtsPaidType }
     *     
     */
    public void setNumPmtsPaid(NumPmtsPaidType value) {
        this.numPmtsPaid = value;
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
