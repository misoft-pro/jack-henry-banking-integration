
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a recurring scheduled
 *                 payment
 * 
 * <p>Java class for BilPayRecurPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayRecurPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartPmtProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartPmtProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StartPmtEstArvDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartPmtEstArvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}PmtFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDayOfWeek" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDayOfWeek_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDayInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDayInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PayDtInstr" type="{http://jackhenry.com/jxchange/TPG/2008}PayDtInstr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtOccur" type="{http://jackhenry.com/jxchange/TPG/2008}PmtOccur_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtSerExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtSerExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtSerFinite" type="{http://jackhenry.com/jxchange/TPG/2008}PmtSerFinite_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtFinalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RetroToOrigPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}RetroToOrigPmtDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayRecurPmtInfo_CType", propOrder = {
    "startPmtProcDt",
    "startPmtEstArvDt",
    "pmtFreqUnits",
    "pmtDayOfWeek",
    "pmtDayInfoArray",
    "payDtInstr",
    "pmtOccur",
    "pmtSerExpDt",
    "pmtSerFinite",
    "pmtFinalAmt",
    "custom",
    "ver1",
    "retroToOrigPmtDt",
    "ver2",
    "any"
})
public class BilPayRecurPmtInfoCType {

    @XmlElement(name = "StartPmtProcDt")
    protected StartPmtProcDtType startPmtProcDt;
    @XmlElement(name = "StartPmtEstArvDt")
    protected StartPmtEstArvDtType startPmtEstArvDt;
    @XmlElement(name = "PmtFreqUnits")
    protected PmtFreqUnitsType pmtFreqUnits;
    @XmlElement(name = "PmtDayOfWeek")
    protected PmtDayOfWeekType pmtDayOfWeek;
    @XmlElement(name = "PmtDayInfoArray")
    protected PmtDayInfoArrayAType pmtDayInfoArray;
    @XmlElement(name = "PayDtInstr")
    protected PayDtInstrType payDtInstr;
    @XmlElement(name = "PmtOccur")
    protected PmtOccurType pmtOccur;
    @XmlElement(name = "PmtSerExpDt")
    protected PmtSerExpDtType pmtSerExpDt;
    @XmlElement(name = "PmtSerFinite")
    protected PmtSerFiniteType pmtSerFinite;
    @XmlElement(name = "PmtFinalAmt")
    protected PmtAmtType pmtFinalAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RetroToOrigPmtDt")
    protected RetroToOrigPmtDtType retroToOrigPmtDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the startPmtProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartPmtProcDtType }
     *     
     */
    public StartPmtProcDtType getStartPmtProcDt() {
        return startPmtProcDt;
    }

    /**
     * Sets the value of the startPmtProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartPmtProcDtType }
     *     
     */
    public void setStartPmtProcDt(StartPmtProcDtType value) {
        this.startPmtProcDt = value;
    }

    /**
     * Gets the value of the startPmtEstArvDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartPmtEstArvDtType }
     *     
     */
    public StartPmtEstArvDtType getStartPmtEstArvDt() {
        return startPmtEstArvDt;
    }

    /**
     * Sets the value of the startPmtEstArvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartPmtEstArvDtType }
     *     
     */
    public void setStartPmtEstArvDt(StartPmtEstArvDtType value) {
        this.startPmtEstArvDt = value;
    }

    /**
     * Gets the value of the pmtFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PmtFreqUnitsType }
     *     
     */
    public PmtFreqUnitsType getPmtFreqUnits() {
        return pmtFreqUnits;
    }

    /**
     * Sets the value of the pmtFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtFreqUnitsType }
     *     
     */
    public void setPmtFreqUnits(PmtFreqUnitsType value) {
        this.pmtFreqUnits = value;
    }

    /**
     * Gets the value of the pmtDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDayOfWeekType }
     *     
     */
    public PmtDayOfWeekType getPmtDayOfWeek() {
        return pmtDayOfWeek;
    }

    /**
     * Sets the value of the pmtDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDayOfWeekType }
     *     
     */
    public void setPmtDayOfWeek(PmtDayOfWeekType value) {
        this.pmtDayOfWeek = value;
    }

    /**
     * Gets the value of the pmtDayInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDayInfoArrayAType }
     *     
     */
    public PmtDayInfoArrayAType getPmtDayInfoArray() {
        return pmtDayInfoArray;
    }

    /**
     * Sets the value of the pmtDayInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDayInfoArrayAType }
     *     
     */
    public void setPmtDayInfoArray(PmtDayInfoArrayAType value) {
        this.pmtDayInfoArray = value;
    }

    /**
     * Gets the value of the payDtInstr property.
     * 
     * @return
     *     possible object is
     *     {@link PayDtInstrType }
     *     
     */
    public PayDtInstrType getPayDtInstr() {
        return payDtInstr;
    }

    /**
     * Sets the value of the payDtInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayDtInstrType }
     *     
     */
    public void setPayDtInstr(PayDtInstrType value) {
        this.payDtInstr = value;
    }

    /**
     * Gets the value of the pmtOccur property.
     * 
     * @return
     *     possible object is
     *     {@link PmtOccurType }
     *     
     */
    public PmtOccurType getPmtOccur() {
        return pmtOccur;
    }

    /**
     * Sets the value of the pmtOccur property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtOccurType }
     *     
     */
    public void setPmtOccur(PmtOccurType value) {
        this.pmtOccur = value;
    }

    /**
     * Gets the value of the pmtSerExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtSerExpDtType }
     *     
     */
    public PmtSerExpDtType getPmtSerExpDt() {
        return pmtSerExpDt;
    }

    /**
     * Sets the value of the pmtSerExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtSerExpDtType }
     *     
     */
    public void setPmtSerExpDt(PmtSerExpDtType value) {
        this.pmtSerExpDt = value;
    }

    /**
     * Gets the value of the pmtSerFinite property.
     * 
     * @return
     *     possible object is
     *     {@link PmtSerFiniteType }
     *     
     */
    public PmtSerFiniteType getPmtSerFinite() {
        return pmtSerFinite;
    }

    /**
     * Sets the value of the pmtSerFinite property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtSerFiniteType }
     *     
     */
    public void setPmtSerFinite(PmtSerFiniteType value) {
        this.pmtSerFinite = value;
    }

    /**
     * Gets the value of the pmtFinalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getPmtFinalAmt() {
        return pmtFinalAmt;
    }

    /**
     * Sets the value of the pmtFinalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setPmtFinalAmt(PmtAmtType value) {
        this.pmtFinalAmt = value;
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
     * Gets the value of the retroToOrigPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link RetroToOrigPmtDtType }
     *     
     */
    public RetroToOrigPmtDtType getRetroToOrigPmtDt() {
        return retroToOrigPmtDt;
    }

    /**
     * Sets the value of the retroToOrigPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetroToOrigPmtDtType }
     *     
     */
    public void setRetroToOrigPmtDt(RetroToOrigPmtDtType value) {
        this.retroToOrigPmtDt = value;
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
     * {@link Element }
     * {@link Object }
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
