
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
 * <p>Java class for LnFeeInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnFeeInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnFeeText" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeText_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAssmntDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAssmntDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeFreq" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeChgCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeChgCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LnFeeNxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnFeeLastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnFeeRemAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeRemAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnFeeCaplze" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeCaplze_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnFeeId" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeId_Type" minOccurs="0"/&gt;
 *           &lt;element name="LnFeeStat" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeStat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnFeeInfoRec_CType", propOrder = {
    "lnFeeText",
    "lnFeeCode",
    "lnFeeAmt",
    "lnFeeAssmntDt",
    "lnFeeFreq",
    "lnFeeFreqUnits",
    "lnFeeDayOfMonth",
    "lnFeeChgCode",
    "ver1",
    "lnFeeNxtPayDt",
    "lnFeeLastPmtDt",
    "lnFeeRemAmt",
    "lnFeeCaplze",
    "lnFeeId",
    "lnFeeStat",
    "ver2",
    "any"
})
public class LnFeeInfoRecCType {

    @XmlElementRef(name = "LnFeeText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeTextType> lnFeeText;
    @XmlElementRef(name = "LnFeeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeCodeType> lnFeeCode;
    @XmlElementRef(name = "LnFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeAmtType> lnFeeAmt;
    @XmlElementRef(name = "LnFeeAssmntDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeAssmntDtType> lnFeeAssmntDt;
    @XmlElementRef(name = "LnFeeFreq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeFreqType> lnFeeFreq;
    @XmlElementRef(name = "LnFeeFreqUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeFreqUnitsType> lnFeeFreqUnits;
    @XmlElementRef(name = "LnFeeDayOfMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeDayOfMonthType> lnFeeDayOfMonth;
    @XmlElementRef(name = "LnFeeChgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnFeeChgCodeType> lnFeeChgCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "LnFeeNxtPayDt")
    protected NxtPayDtType lnFeeNxtPayDt;
    @XmlElement(name = "LnFeeLastPmtDt")
    protected LastPmtDtType lnFeeLastPmtDt;
    @XmlElement(name = "LnFeeRemAmt")
    protected LnFeeRemAmtType lnFeeRemAmt;
    @XmlElement(name = "LnFeeCaplze")
    protected LnFeeCaplzeType lnFeeCaplze;
    @XmlElement(name = "LnFeeId")
    protected LnFeeIdType lnFeeId;
    @XmlElement(name = "LnFeeStat")
    protected LnFeeStatType lnFeeStat;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnFeeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeTextType }{@code >}
     *     
     */
    public JAXBElement<LnFeeTextType> getLnFeeText() {
        return lnFeeText;
    }

    /**
     * Sets the value of the lnFeeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeTextType }{@code >}
     *     
     */
    public void setLnFeeText(JAXBElement<LnFeeTextType> value) {
        this.lnFeeText = value;
    }

    /**
     * Gets the value of the lnFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeCodeType }{@code >}
     *     
     */
    public JAXBElement<LnFeeCodeType> getLnFeeCode() {
        return lnFeeCode;
    }

    /**
     * Sets the value of the lnFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeCodeType }{@code >}
     *     
     */
    public void setLnFeeCode(JAXBElement<LnFeeCodeType> value) {
        this.lnFeeCode = value;
    }

    /**
     * Gets the value of the lnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<LnFeeAmtType> getLnFeeAmt() {
        return lnFeeAmt;
    }

    /**
     * Sets the value of the lnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeAmtType }{@code >}
     *     
     */
    public void setLnFeeAmt(JAXBElement<LnFeeAmtType> value) {
        this.lnFeeAmt = value;
    }

    /**
     * Gets the value of the lnFeeAssmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeAssmntDtType }{@code >}
     *     
     */
    public JAXBElement<LnFeeAssmntDtType> getLnFeeAssmntDt() {
        return lnFeeAssmntDt;
    }

    /**
     * Sets the value of the lnFeeAssmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeAssmntDtType }{@code >}
     *     
     */
    public void setLnFeeAssmntDt(JAXBElement<LnFeeAssmntDtType> value) {
        this.lnFeeAssmntDt = value;
    }

    /**
     * Gets the value of the lnFeeFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeFreqType }{@code >}
     *     
     */
    public JAXBElement<LnFeeFreqType> getLnFeeFreq() {
        return lnFeeFreq;
    }

    /**
     * Sets the value of the lnFeeFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeFreqType }{@code >}
     *     
     */
    public void setLnFeeFreq(JAXBElement<LnFeeFreqType> value) {
        this.lnFeeFreq = value;
    }

    /**
     * Gets the value of the lnFeeFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeFreqUnitsType }{@code >}
     *     
     */
    public JAXBElement<LnFeeFreqUnitsType> getLnFeeFreqUnits() {
        return lnFeeFreqUnits;
    }

    /**
     * Sets the value of the lnFeeFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeFreqUnitsType }{@code >}
     *     
     */
    public void setLnFeeFreqUnits(JAXBElement<LnFeeFreqUnitsType> value) {
        this.lnFeeFreqUnits = value;
    }

    /**
     * Gets the value of the lnFeeDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeDayOfMonthType }{@code >}
     *     
     */
    public JAXBElement<LnFeeDayOfMonthType> getLnFeeDayOfMonth() {
        return lnFeeDayOfMonth;
    }

    /**
     * Sets the value of the lnFeeDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeDayOfMonthType }{@code >}
     *     
     */
    public void setLnFeeDayOfMonth(JAXBElement<LnFeeDayOfMonthType> value) {
        this.lnFeeDayOfMonth = value;
    }

    /**
     * Gets the value of the lnFeeChgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnFeeChgCodeType }{@code >}
     *     
     */
    public JAXBElement<LnFeeChgCodeType> getLnFeeChgCode() {
        return lnFeeChgCode;
    }

    /**
     * Sets the value of the lnFeeChgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnFeeChgCodeType }{@code >}
     *     
     */
    public void setLnFeeChgCode(JAXBElement<LnFeeChgCodeType> value) {
        this.lnFeeChgCode = value;
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
     * Gets the value of the lnFeeNxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getLnFeeNxtPayDt() {
        return lnFeeNxtPayDt;
    }

    /**
     * Sets the value of the lnFeeNxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setLnFeeNxtPayDt(NxtPayDtType value) {
        this.lnFeeNxtPayDt = value;
    }

    /**
     * Gets the value of the lnFeeLastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtDtType }
     *     
     */
    public LastPmtDtType getLnFeeLastPmtDt() {
        return lnFeeLastPmtDt;
    }

    /**
     * Sets the value of the lnFeeLastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtDtType }
     *     
     */
    public void setLnFeeLastPmtDt(LastPmtDtType value) {
        this.lnFeeLastPmtDt = value;
    }

    /**
     * Gets the value of the lnFeeRemAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeRemAmtType }
     *     
     */
    public LnFeeRemAmtType getLnFeeRemAmt() {
        return lnFeeRemAmt;
    }

    /**
     * Sets the value of the lnFeeRemAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeRemAmtType }
     *     
     */
    public void setLnFeeRemAmt(LnFeeRemAmtType value) {
        this.lnFeeRemAmt = value;
    }

    /**
     * Gets the value of the lnFeeCaplze property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeCaplzeType }
     *     
     */
    public LnFeeCaplzeType getLnFeeCaplze() {
        return lnFeeCaplze;
    }

    /**
     * Sets the value of the lnFeeCaplze property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeCaplzeType }
     *     
     */
    public void setLnFeeCaplze(LnFeeCaplzeType value) {
        this.lnFeeCaplze = value;
    }

    /**
     * Gets the value of the lnFeeId property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeIdType }
     *     
     */
    public LnFeeIdType getLnFeeId() {
        return lnFeeId;
    }

    /**
     * Sets the value of the lnFeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeIdType }
     *     
     */
    public void setLnFeeId(LnFeeIdType value) {
        this.lnFeeId = value;
    }

    /**
     * Gets the value of the lnFeeStat property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeStatType }
     *     
     */
    public LnFeeStatType getLnFeeStat() {
        return lnFeeStat;
    }

    /**
     * Sets the value of the lnFeeStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeStatType }
     *     
     */
    public void setLnFeeStat(LnFeeStatType value) {
        this.lnFeeStat = value;
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
