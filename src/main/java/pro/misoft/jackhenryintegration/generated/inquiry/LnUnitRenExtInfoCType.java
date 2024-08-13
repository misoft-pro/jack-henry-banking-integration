
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
 * <p>Java class for LnUnitRenExtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitRenExtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastExtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastExtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastRenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TimesRenYTD" type="{http://jackhenry.com/jxchange/TPG/2008}TimesRenYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="TimesRenPrevYr" type="{http://jackhenry.com/jxchange/TPG/2008}TimesRenPrevYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RenCntLTD" type="{http://jackhenry.com/jxchange/TPG/2008}RenCntLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevExtDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrevExtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumPmtsExtYTD" type="{http://jackhenry.com/jxchange/TPG/2008}NumPmtsExtYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumPmtsExtLastYr" type="{http://jackhenry.com/jxchange/TPG/2008}NumPmtsExtLastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumPmtsExtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}NumPmtsExtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrevRenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtMonthsLTD" type="{http://jackhenry.com/jxchange/TPG/2008}ExtMonthsLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="TimesExtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}TimesExtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtFessYTD" type="{http://jackhenry.com/jxchange/TPG/2008}ExtFeesYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtFeesLTD" type="{http://jackhenry.com/jxchange/TPG/2008}ExtFeesLTD_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ExtFeesMTD" type="{http://jackhenry.com/jxchange/TPG/2008}ExtFeesMTD_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitRenExtInfo_CType", propOrder = {
    "lastExtDt",
    "lastRenDt",
    "timesRenYTD",
    "timesRenPrevYr",
    "renCntLTD",
    "prevExtDt",
    "numPmtsExtYTD",
    "numPmtsExtLastYr",
    "numPmtsExtLTD",
    "prevRenDt",
    "extMonthsLTD",
    "timesExtLTD",
    "extFessYTD",
    "extFeesLTD",
    "ver1",
    "extFeesMTD",
    "ver2",
    "any"
})
public class LnUnitRenExtInfoCType {

    @XmlElement(name = "LastExtDt")
    protected LastExtDtType lastExtDt;
    @XmlElement(name = "LastRenDt")
    protected LastRenDtType lastRenDt;
    @XmlElement(name = "TimesRenYTD")
    protected TimesRenYTDType timesRenYTD;
    @XmlElement(name = "TimesRenPrevYr")
    protected TimesRenPrevYrType timesRenPrevYr;
    @XmlElement(name = "RenCntLTD")
    protected RenCntLTDType renCntLTD;
    @XmlElement(name = "PrevExtDt")
    protected PrevExtDtType prevExtDt;
    @XmlElement(name = "NumPmtsExtYTD")
    protected NumPmtsExtYTDType numPmtsExtYTD;
    @XmlElement(name = "NumPmtsExtLastYr")
    protected NumPmtsExtLastYrType numPmtsExtLastYr;
    @XmlElement(name = "NumPmtsExtLTD")
    protected NumPmtsExtLTDType numPmtsExtLTD;
    @XmlElement(name = "PrevRenDt")
    protected PrevRenDtType prevRenDt;
    @XmlElement(name = "ExtMonthsLTD")
    protected ExtMonthsLTDType extMonthsLTD;
    @XmlElement(name = "TimesExtLTD")
    protected TimesExtLTDType timesExtLTD;
    @XmlElement(name = "ExtFessYTD")
    protected ExtFeesYTDType extFessYTD;
    @XmlElement(name = "ExtFeesLTD")
    protected ExtFeesLTDType extFeesLTD;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ExtFeesMTD")
    protected ExtFeesMTDType extFeesMTD;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lastExtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastExtDtType }
     *     
     */
    public LastExtDtType getLastExtDt() {
        return lastExtDt;
    }

    /**
     * Sets the value of the lastExtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastExtDtType }
     *     
     */
    public void setLastExtDt(LastExtDtType value) {
        this.lastExtDt = value;
    }

    /**
     * Gets the value of the lastRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastRenDtType }
     *     
     */
    public LastRenDtType getLastRenDt() {
        return lastRenDt;
    }

    /**
     * Sets the value of the lastRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRenDtType }
     *     
     */
    public void setLastRenDt(LastRenDtType value) {
        this.lastRenDt = value;
    }

    /**
     * Gets the value of the timesRenYTD property.
     * 
     * @return
     *     possible object is
     *     {@link TimesRenYTDType }
     *     
     */
    public TimesRenYTDType getTimesRenYTD() {
        return timesRenYTD;
    }

    /**
     * Sets the value of the timesRenYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesRenYTDType }
     *     
     */
    public void setTimesRenYTD(TimesRenYTDType value) {
        this.timesRenYTD = value;
    }

    /**
     * Gets the value of the timesRenPrevYr property.
     * 
     * @return
     *     possible object is
     *     {@link TimesRenPrevYrType }
     *     
     */
    public TimesRenPrevYrType getTimesRenPrevYr() {
        return timesRenPrevYr;
    }

    /**
     * Sets the value of the timesRenPrevYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesRenPrevYrType }
     *     
     */
    public void setTimesRenPrevYr(TimesRenPrevYrType value) {
        this.timesRenPrevYr = value;
    }

    /**
     * Gets the value of the renCntLTD property.
     * 
     * @return
     *     possible object is
     *     {@link RenCntLTDType }
     *     
     */
    public RenCntLTDType getRenCntLTD() {
        return renCntLTD;
    }

    /**
     * Sets the value of the renCntLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenCntLTDType }
     *     
     */
    public void setRenCntLTD(RenCntLTDType value) {
        this.renCntLTD = value;
    }

    /**
     * Gets the value of the prevExtDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrevExtDtType }
     *     
     */
    public PrevExtDtType getPrevExtDt() {
        return prevExtDt;
    }

    /**
     * Sets the value of the prevExtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevExtDtType }
     *     
     */
    public void setPrevExtDt(PrevExtDtType value) {
        this.prevExtDt = value;
    }

    /**
     * Gets the value of the numPmtsExtYTD property.
     * 
     * @return
     *     possible object is
     *     {@link NumPmtsExtYTDType }
     *     
     */
    public NumPmtsExtYTDType getNumPmtsExtYTD() {
        return numPmtsExtYTD;
    }

    /**
     * Sets the value of the numPmtsExtYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumPmtsExtYTDType }
     *     
     */
    public void setNumPmtsExtYTD(NumPmtsExtYTDType value) {
        this.numPmtsExtYTD = value;
    }

    /**
     * Gets the value of the numPmtsExtLastYr property.
     * 
     * @return
     *     possible object is
     *     {@link NumPmtsExtLastYrType }
     *     
     */
    public NumPmtsExtLastYrType getNumPmtsExtLastYr() {
        return numPmtsExtLastYr;
    }

    /**
     * Sets the value of the numPmtsExtLastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumPmtsExtLastYrType }
     *     
     */
    public void setNumPmtsExtLastYr(NumPmtsExtLastYrType value) {
        this.numPmtsExtLastYr = value;
    }

    /**
     * Gets the value of the numPmtsExtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link NumPmtsExtLTDType }
     *     
     */
    public NumPmtsExtLTDType getNumPmtsExtLTD() {
        return numPmtsExtLTD;
    }

    /**
     * Sets the value of the numPmtsExtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumPmtsExtLTDType }
     *     
     */
    public void setNumPmtsExtLTD(NumPmtsExtLTDType value) {
        this.numPmtsExtLTD = value;
    }

    /**
     * Gets the value of the prevRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrevRenDtType }
     *     
     */
    public PrevRenDtType getPrevRenDt() {
        return prevRenDt;
    }

    /**
     * Sets the value of the prevRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevRenDtType }
     *     
     */
    public void setPrevRenDt(PrevRenDtType value) {
        this.prevRenDt = value;
    }

    /**
     * Gets the value of the extMonthsLTD property.
     * 
     * @return
     *     possible object is
     *     {@link ExtMonthsLTDType }
     *     
     */
    public ExtMonthsLTDType getExtMonthsLTD() {
        return extMonthsLTD;
    }

    /**
     * Sets the value of the extMonthsLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtMonthsLTDType }
     *     
     */
    public void setExtMonthsLTD(ExtMonthsLTDType value) {
        this.extMonthsLTD = value;
    }

    /**
     * Gets the value of the timesExtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link TimesExtLTDType }
     *     
     */
    public TimesExtLTDType getTimesExtLTD() {
        return timesExtLTD;
    }

    /**
     * Sets the value of the timesExtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesExtLTDType }
     *     
     */
    public void setTimesExtLTD(TimesExtLTDType value) {
        this.timesExtLTD = value;
    }

    /**
     * Gets the value of the extFessYTD property.
     * 
     * @return
     *     possible object is
     *     {@link ExtFeesYTDType }
     *     
     */
    public ExtFeesYTDType getExtFessYTD() {
        return extFessYTD;
    }

    /**
     * Sets the value of the extFessYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtFeesYTDType }
     *     
     */
    public void setExtFessYTD(ExtFeesYTDType value) {
        this.extFessYTD = value;
    }

    /**
     * Gets the value of the extFeesLTD property.
     * 
     * @return
     *     possible object is
     *     {@link ExtFeesLTDType }
     *     
     */
    public ExtFeesLTDType getExtFeesLTD() {
        return extFeesLTD;
    }

    /**
     * Sets the value of the extFeesLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtFeesLTDType }
     *     
     */
    public void setExtFeesLTD(ExtFeesLTDType value) {
        this.extFeesLTD = value;
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
     * Gets the value of the extFeesMTD property.
     * 
     * @return
     *     possible object is
     *     {@link ExtFeesMTDType }
     *     
     */
    public ExtFeesMTDType getExtFeesMTD() {
        return extFeesMTD;
    }

    /**
     * Sets the value of the extFeesMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtFeesMTDType }
     *     
     */
    public void setExtFeesMTD(ExtFeesMTDType value) {
        this.extFeesMTD = value;
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
