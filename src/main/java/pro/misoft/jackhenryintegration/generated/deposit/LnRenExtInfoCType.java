
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for LnRenExtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRenExtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimesRenYTD" type="{http://jackhenry.com/jxchange/TPG/2008}TimesRenYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="TimesRenPrevYr" type="{http://jackhenry.com/jxchange/TPG/2008}TimesRenPrevYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="TimesExtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}TimesExtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="RenCntLTD" type="{http://jackhenry.com/jxchange/TPG/2008}RenCntLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrevRenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevExtDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrevExtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumPmtsExtYTD" type="{http://jackhenry.com/jxchange/TPG/2008}NumPmtsExtYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumPmtsExtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}NumPmtsExtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumPmtsExtLastYr" type="{http://jackhenry.com/jxchange/TPG/2008}NumPmtsExtLastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastRenExtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastRenExtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastRenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastRenBal" type="{http://jackhenry.com/jxchange/TPG/2008}LastRenBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastExtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastExtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtMonthsLTD" type="{http://jackhenry.com/jxchange/TPG/2008}ExtMonthsLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtFeesYTD" type="{http://jackhenry.com/jxchange/TPG/2008}ExtFeesYTD_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnRenExtInfo_CType", propOrder = {
    "timesRenYTD",
    "timesRenPrevYr",
    "timesExtLTD",
    "renCntLTD",
    "prevRenDt",
    "prevExtDt",
    "numPmtsExtYTD",
    "numPmtsExtLTD",
    "numPmtsExtLastYr",
    "lastRenExtDt",
    "lastRenDt",
    "lastRenBal",
    "lastExtDt",
    "extMonthsLTD",
    "extFeesYTD",
    "extFeesLTD",
    "ver1",
    "extFeesMTD",
    "ver2",
    "any"
})
public class LnRenExtInfoCType {

    @XmlElementRef(name = "TimesRenYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimesRenYTDType> timesRenYTD;
    @XmlElementRef(name = "TimesRenPrevYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimesRenPrevYrType> timesRenPrevYr;
    @XmlElementRef(name = "TimesExtLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TimesExtLTDType> timesExtLTD;
    @XmlElementRef(name = "RenCntLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RenCntLTDType> renCntLTD;
    @XmlElementRef(name = "PrevRenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevRenDtType> prevRenDt;
    @XmlElementRef(name = "PrevExtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevExtDtType> prevExtDt;
    @XmlElementRef(name = "NumPmtsExtYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumPmtsExtYTDType> numPmtsExtYTD;
    @XmlElementRef(name = "NumPmtsExtLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumPmtsExtLTDType> numPmtsExtLTD;
    @XmlElementRef(name = "NumPmtsExtLastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumPmtsExtLastYrType> numPmtsExtLastYr;
    @XmlElementRef(name = "LastRenExtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastRenExtDtType> lastRenExtDt;
    @XmlElementRef(name = "LastRenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastRenDtType> lastRenDt;
    @XmlElementRef(name = "LastRenBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastRenBalType> lastRenBal;
    @XmlElementRef(name = "LastExtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastExtDtType> lastExtDt;
    @XmlElementRef(name = "ExtMonthsLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtMonthsLTDType> extMonthsLTD;
    @XmlElementRef(name = "ExtFeesYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtFeesYTDType> extFeesYTD;
    @XmlElementRef(name = "ExtFeesLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtFeesLTDType> extFeesLTD;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ExtFeesMTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtFeesMTDType> extFeesMTD;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timesRenYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimesRenYTDType }{@code >}
     *     
     */
    public JAXBElement<TimesRenYTDType> getTimesRenYTD() {
        return timesRenYTD;
    }

    /**
     * Sets the value of the timesRenYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimesRenYTDType }{@code >}
     *     
     */
    public void setTimesRenYTD(JAXBElement<TimesRenYTDType> value) {
        this.timesRenYTD = value;
    }

    /**
     * Gets the value of the timesRenPrevYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimesRenPrevYrType }{@code >}
     *     
     */
    public JAXBElement<TimesRenPrevYrType> getTimesRenPrevYr() {
        return timesRenPrevYr;
    }

    /**
     * Sets the value of the timesRenPrevYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimesRenPrevYrType }{@code >}
     *     
     */
    public void setTimesRenPrevYr(JAXBElement<TimesRenPrevYrType> value) {
        this.timesRenPrevYr = value;
    }

    /**
     * Gets the value of the timesExtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimesExtLTDType }{@code >}
     *     
     */
    public JAXBElement<TimesExtLTDType> getTimesExtLTD() {
        return timesExtLTD;
    }

    /**
     * Sets the value of the timesExtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimesExtLTDType }{@code >}
     *     
     */
    public void setTimesExtLTD(JAXBElement<TimesExtLTDType> value) {
        this.timesExtLTD = value;
    }

    /**
     * Gets the value of the renCntLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RenCntLTDType }{@code >}
     *     
     */
    public JAXBElement<RenCntLTDType> getRenCntLTD() {
        return renCntLTD;
    }

    /**
     * Sets the value of the renCntLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RenCntLTDType }{@code >}
     *     
     */
    public void setRenCntLTD(JAXBElement<RenCntLTDType> value) {
        this.renCntLTD = value;
    }

    /**
     * Gets the value of the prevRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevRenDtType }{@code >}
     *     
     */
    public JAXBElement<PrevRenDtType> getPrevRenDt() {
        return prevRenDt;
    }

    /**
     * Sets the value of the prevRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevRenDtType }{@code >}
     *     
     */
    public void setPrevRenDt(JAXBElement<PrevRenDtType> value) {
        this.prevRenDt = value;
    }

    /**
     * Gets the value of the prevExtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevExtDtType }{@code >}
     *     
     */
    public JAXBElement<PrevExtDtType> getPrevExtDt() {
        return prevExtDt;
    }

    /**
     * Sets the value of the prevExtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevExtDtType }{@code >}
     *     
     */
    public void setPrevExtDt(JAXBElement<PrevExtDtType> value) {
        this.prevExtDt = value;
    }

    /**
     * Gets the value of the numPmtsExtYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumPmtsExtYTDType }{@code >}
     *     
     */
    public JAXBElement<NumPmtsExtYTDType> getNumPmtsExtYTD() {
        return numPmtsExtYTD;
    }

    /**
     * Sets the value of the numPmtsExtYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumPmtsExtYTDType }{@code >}
     *     
     */
    public void setNumPmtsExtYTD(JAXBElement<NumPmtsExtYTDType> value) {
        this.numPmtsExtYTD = value;
    }

    /**
     * Gets the value of the numPmtsExtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumPmtsExtLTDType }{@code >}
     *     
     */
    public JAXBElement<NumPmtsExtLTDType> getNumPmtsExtLTD() {
        return numPmtsExtLTD;
    }

    /**
     * Sets the value of the numPmtsExtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumPmtsExtLTDType }{@code >}
     *     
     */
    public void setNumPmtsExtLTD(JAXBElement<NumPmtsExtLTDType> value) {
        this.numPmtsExtLTD = value;
    }

    /**
     * Gets the value of the numPmtsExtLastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumPmtsExtLastYrType }{@code >}
     *     
     */
    public JAXBElement<NumPmtsExtLastYrType> getNumPmtsExtLastYr() {
        return numPmtsExtLastYr;
    }

    /**
     * Sets the value of the numPmtsExtLastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumPmtsExtLastYrType }{@code >}
     *     
     */
    public void setNumPmtsExtLastYr(JAXBElement<NumPmtsExtLastYrType> value) {
        this.numPmtsExtLastYr = value;
    }

    /**
     * Gets the value of the lastRenExtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastRenExtDtType }{@code >}
     *     
     */
    public JAXBElement<LastRenExtDtType> getLastRenExtDt() {
        return lastRenExtDt;
    }

    /**
     * Sets the value of the lastRenExtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastRenExtDtType }{@code >}
     *     
     */
    public void setLastRenExtDt(JAXBElement<LastRenExtDtType> value) {
        this.lastRenExtDt = value;
    }

    /**
     * Gets the value of the lastRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastRenDtType }{@code >}
     *     
     */
    public JAXBElement<LastRenDtType> getLastRenDt() {
        return lastRenDt;
    }

    /**
     * Sets the value of the lastRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastRenDtType }{@code >}
     *     
     */
    public void setLastRenDt(JAXBElement<LastRenDtType> value) {
        this.lastRenDt = value;
    }

    /**
     * Gets the value of the lastRenBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastRenBalType }{@code >}
     *     
     */
    public JAXBElement<LastRenBalType> getLastRenBal() {
        return lastRenBal;
    }

    /**
     * Sets the value of the lastRenBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastRenBalType }{@code >}
     *     
     */
    public void setLastRenBal(JAXBElement<LastRenBalType> value) {
        this.lastRenBal = value;
    }

    /**
     * Gets the value of the lastExtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastExtDtType }{@code >}
     *     
     */
    public JAXBElement<LastExtDtType> getLastExtDt() {
        return lastExtDt;
    }

    /**
     * Sets the value of the lastExtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastExtDtType }{@code >}
     *     
     */
    public void setLastExtDt(JAXBElement<LastExtDtType> value) {
        this.lastExtDt = value;
    }

    /**
     * Gets the value of the extMonthsLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtMonthsLTDType }{@code >}
     *     
     */
    public JAXBElement<ExtMonthsLTDType> getExtMonthsLTD() {
        return extMonthsLTD;
    }

    /**
     * Sets the value of the extMonthsLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtMonthsLTDType }{@code >}
     *     
     */
    public void setExtMonthsLTD(JAXBElement<ExtMonthsLTDType> value) {
        this.extMonthsLTD = value;
    }

    /**
     * Gets the value of the extFeesYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtFeesYTDType }{@code >}
     *     
     */
    public JAXBElement<ExtFeesYTDType> getExtFeesYTD() {
        return extFeesYTD;
    }

    /**
     * Sets the value of the extFeesYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtFeesYTDType }{@code >}
     *     
     */
    public void setExtFeesYTD(JAXBElement<ExtFeesYTDType> value) {
        this.extFeesYTD = value;
    }

    /**
     * Gets the value of the extFeesLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtFeesLTDType }{@code >}
     *     
     */
    public JAXBElement<ExtFeesLTDType> getExtFeesLTD() {
        return extFeesLTD;
    }

    /**
     * Sets the value of the extFeesLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtFeesLTDType }{@code >}
     *     
     */
    public void setExtFeesLTD(JAXBElement<ExtFeesLTDType> value) {
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
     *     {@link JAXBElement }{@code <}{@link ExtFeesMTDType }{@code >}
     *     
     */
    public JAXBElement<ExtFeesMTDType> getExtFeesMTD() {
        return extFeesMTD;
    }

    /**
     * Sets the value of the extFeesMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtFeesMTDType }{@code >}
     *     
     */
    public void setExtFeesMTD(JAXBElement<ExtFeesMTDType> value) {
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
