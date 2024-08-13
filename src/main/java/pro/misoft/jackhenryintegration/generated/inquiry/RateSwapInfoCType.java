
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
 * <p>Java class for RateSwapInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateSwapInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PenAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PenAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPrincAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilPrincAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilIntAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilIntAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateSwapStatType" type="{http://jackhenry.com/jxchange/TPG/2008}RateSwapStatType_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SwapIdNum" type="{http://jackhenry.com/jxchange/TPG/2008}PartIdNum_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RateSwapInfo_CType", propOrder = {
    "pmtAmt",
    "intRate",
    "intPaidYTD",
    "expDt",
    "penAmt",
    "piAmt",
    "bilPrincAmt",
    "bilIntAmt",
    "rateSwapStatType",
    "ver1",
    "swapIdNum",
    "ver2",
    "any"
})
public class RateSwapInfoCType {

    @XmlElement(name = "PmtAmt")
    protected PmtAmtType pmtAmt;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "IntPaidYTD")
    protected IntPaidYTDType intPaidYTD;
    @XmlElement(name = "ExpDt")
    protected ExpDtType expDt;
    @XmlElement(name = "PenAmt")
    protected PenAmtType penAmt;
    @XmlElement(name = "PIAmt")
    protected PIAmtType piAmt;
    @XmlElement(name = "BilPrincAmt")
    protected BilPrincAmtType bilPrincAmt;
    @XmlElement(name = "BilIntAmt")
    protected BilIntAmtType bilIntAmt;
    @XmlElement(name = "RateSwapStatType")
    protected RateSwapStatTypeType rateSwapStatType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SwapIdNum")
    protected PartIdNumType swapIdNum;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setPmtAmt(PmtAmtType value) {
        this.pmtAmt = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the intPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntPaidYTDType }
     *     
     */
    public IntPaidYTDType getIntPaidYTD() {
        return intPaidYTD;
    }

    /**
     * Sets the value of the intPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPaidYTDType }
     *     
     */
    public void setIntPaidYTD(IntPaidYTDType value) {
        this.intPaidYTD = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setExpDt(ExpDtType value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the penAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PenAmtType }
     *     
     */
    public PenAmtType getPenAmt() {
        return penAmt;
    }

    /**
     * Sets the value of the penAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenAmtType }
     *     
     */
    public void setPenAmt(PenAmtType value) {
        this.penAmt = value;
    }

    /**
     * Gets the value of the piAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PIAmtType }
     *     
     */
    public PIAmtType getPIAmt() {
        return piAmt;
    }

    /**
     * Sets the value of the piAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAmtType }
     *     
     */
    public void setPIAmt(PIAmtType value) {
        this.piAmt = value;
    }

    /**
     * Gets the value of the bilPrincAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilPrincAmtType }
     *     
     */
    public BilPrincAmtType getBilPrincAmt() {
        return bilPrincAmt;
    }

    /**
     * Sets the value of the bilPrincAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPrincAmtType }
     *     
     */
    public void setBilPrincAmt(BilPrincAmtType value) {
        this.bilPrincAmt = value;
    }

    /**
     * Gets the value of the bilIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilIntAmtType }
     *     
     */
    public BilIntAmtType getBilIntAmt() {
        return bilIntAmt;
    }

    /**
     * Sets the value of the bilIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilIntAmtType }
     *     
     */
    public void setBilIntAmt(BilIntAmtType value) {
        this.bilIntAmt = value;
    }

    /**
     * Gets the value of the rateSwapStatType property.
     * 
     * @return
     *     possible object is
     *     {@link RateSwapStatTypeType }
     *     
     */
    public RateSwapStatTypeType getRateSwapStatType() {
        return rateSwapStatType;
    }

    /**
     * Sets the value of the rateSwapStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSwapStatTypeType }
     *     
     */
    public void setRateSwapStatType(RateSwapStatTypeType value) {
        this.rateSwapStatType = value;
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
     * Gets the value of the swapIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link PartIdNumType }
     *     
     */
    public PartIdNumType getSwapIdNum() {
        return swapIdNum;
    }

    /**
     * Sets the value of the swapIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartIdNumType }
     *     
     */
    public void setSwapIdNum(PartIdNumType value) {
        this.swapIdNum = value;
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
