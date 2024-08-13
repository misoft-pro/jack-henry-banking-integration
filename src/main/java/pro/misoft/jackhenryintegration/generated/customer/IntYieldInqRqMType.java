
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for IntYieldInqRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntYieldInqRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasis_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrMeth" type="{http://jackhenry.com/jxchange/TPG/2008}AccrMeth_Type" minOccurs="0"/&gt;
 *         &lt;element name="MndtryIntWthdwl" type="{http://jackhenry.com/jxchange/TPG/2008}MndtryIntWthdwl_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IntDisp" type="{http://jackhenry.com/jxchange/TPG/2008}IntDisp_Type" minOccurs="0"/&gt;
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
@XmlType(name = "IntYieldInqRq_MType", propOrder = {
    "msgRqHdr",
    "acctType",
    "intRate",
    "rateIdxNum",
    "curBal",
    "rateTerm",
    "intTerm",
    "intBasis",
    "accrMeth",
    "mndtryIntWthdwl",
    "custom",
    "ver1",
    "intDisp",
    "ver2",
    "any"
})
public class IntYieldInqRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElement(name = "AcctType", required = true)
    protected AcctTypeType acctType;
    @XmlElementRef(name = "IntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateType> intRate;
    @XmlElementRef(name = "RateIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateIdxNumType> rateIdxNum;
    @XmlElementRef(name = "CurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurBalType> curBal;
    @XmlElementRef(name = "RateTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCType> rateTerm;
    @XmlElementRef(name = "IntTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCType> intTerm;
    @XmlElementRef(name = "IntBasis", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntBasisType> intBasis;
    @XmlElementRef(name = "AccrMeth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccrMethType> accrMeth;
    @XmlElementRef(name = "MndtryIntWthdwl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MndtryIntWthdwlType> mndtryIntWthdwl;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "IntDisp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDispType> intDisp;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public MsgRqHdrCType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrCType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public JAXBElement<IntRateType> getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public void setIntRate(JAXBElement<IntRateType> value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the rateIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateIdxNumType }{@code >}
     *     
     */
    public JAXBElement<RateIdxNumType> getRateIdxNum() {
        return rateIdxNum;
    }

    /**
     * Sets the value of the rateIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateIdxNumType }{@code >}
     *     
     */
    public void setRateIdxNum(JAXBElement<RateIdxNumType> value) {
        this.rateIdxNum = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public JAXBElement<CurBalType> getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public void setCurBal(JAXBElement<CurBalType> value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the rateTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCType }{@code >}
     *     
     */
    public JAXBElement<TermCType> getRateTerm() {
        return rateTerm;
    }

    /**
     * Sets the value of the rateTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCType }{@code >}
     *     
     */
    public void setRateTerm(JAXBElement<TermCType> value) {
        this.rateTerm = value;
    }

    /**
     * Gets the value of the intTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCType }{@code >}
     *     
     */
    public JAXBElement<TermCType> getIntTerm() {
        return intTerm;
    }

    /**
     * Sets the value of the intTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCType }{@code >}
     *     
     */
    public void setIntTerm(JAXBElement<TermCType> value) {
        this.intTerm = value;
    }

    /**
     * Gets the value of the intBasis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntBasisType }{@code >}
     *     
     */
    public JAXBElement<IntBasisType> getIntBasis() {
        return intBasis;
    }

    /**
     * Sets the value of the intBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntBasisType }{@code >}
     *     
     */
    public void setIntBasis(JAXBElement<IntBasisType> value) {
        this.intBasis = value;
    }

    /**
     * Gets the value of the accrMeth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccrMethType }{@code >}
     *     
     */
    public JAXBElement<AccrMethType> getAccrMeth() {
        return accrMeth;
    }

    /**
     * Sets the value of the accrMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccrMethType }{@code >}
     *     
     */
    public void setAccrMeth(JAXBElement<AccrMethType> value) {
        this.accrMeth = value;
    }

    /**
     * Gets the value of the mndtryIntWthdwl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MndtryIntWthdwlType }{@code >}
     *     
     */
    public JAXBElement<MndtryIntWthdwlType> getMndtryIntWthdwl() {
        return mndtryIntWthdwl;
    }

    /**
     * Sets the value of the mndtryIntWthdwl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MndtryIntWthdwlType }{@code >}
     *     
     */
    public void setMndtryIntWthdwl(JAXBElement<MndtryIntWthdwlType> value) {
        this.mndtryIntWthdwl = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
     * Gets the value of the intDisp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntDispType }{@code >}
     *     
     */
    public JAXBElement<IntDispType> getIntDisp() {
        return intDisp;
    }

    /**
     * Sets the value of the intDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntDispType }{@code >}
     *     
     */
    public void setIntDisp(JAXBElement<IntDispType> value) {
        this.intDisp = value;
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
