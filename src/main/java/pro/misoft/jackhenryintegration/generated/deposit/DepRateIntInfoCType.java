
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
 * <p>Java class for DepRateIntInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepRateIntInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="YTDInt" type="{http://jackhenry.com/jxchange/TPG/2008}YTDInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="AltAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AltAccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AmtLastIntPd" type="{http://jackhenry.com/jxchange/TPG/2008}AmtLastIntPd_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevYTDIntPaid" type="{http://jackhenry.com/jxchange/TPG/2008}PrevYTDIntPaid_Type" minOccurs="0"/&gt;
 *         &lt;element name="VarIntRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}VarIntRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntDisp" type="{http://jackhenry.com/jxchange/TPG/2008}IntDisp_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDispAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}IntDispAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDispAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}IntDispAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBasis" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasis_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrMeth" type="{http://jackhenry.com/jxchange/TPG/2008}AccrMeth_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtIntChkCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtIntChkCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayIntEOMCode" type="{http://jackhenry.com/jxchange/TPG/2008}PayIntEOMCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LastPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPayDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="TeaserRate" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRate_Type" minOccurs="0"/&gt;
 *             &lt;element name="TeaserRateEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateEffDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="TeaserRateExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateExpDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="TeaserRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateCode_Type" minOccurs="0"/&gt;
 *               &lt;element name="TeaserRateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *               &lt;element name="TeaserRateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="MTDAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}MTDAccrInt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="MTDAccrDays" type="{http://jackhenry.com/jxchange/TPG/2008}MTDAccrDays_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "DepRateIntInfo_CType", propOrder = {
    "ytdInt",
    "intRate",
    "altAccrInt",
    "amtLastIntPd",
    "prevYTDIntPaid",
    "varIntRateInfo",
    "intDisp",
    "intDispAcctId",
    "intDispAcctType",
    "intBasis",
    "accrMeth",
    "prtIntChkCode",
    "payIntEOMCode",
    "ver1",
    "lastPayDt",
    "ver2",
    "teaserRate",
    "teaserRateEffDt",
    "teaserRateExpDt",
    "ver3",
    "teaserRateCode",
    "teaserRateVarCode",
    "teaserRateVar",
    "ver4",
    "mtdAccrInt",
    "mtdAccrDays",
    "ver5",
    "any"
})
public class DepRateIntInfoCType {

    @XmlElementRef(name = "YTDInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YTDIntType> ytdInt;
    @XmlElementRef(name = "IntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateType> intRate;
    @XmlElementRef(name = "AltAccrInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AltAccrIntType> altAccrInt;
    @XmlElementRef(name = "AmtLastIntPd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmtLastIntPdType> amtLastIntPd;
    @XmlElementRef(name = "PrevYTDIntPaid", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevYTDIntPaidType> prevYTDIntPaid;
    @XmlElement(name = "VarIntRateInfo")
    protected VarIntRateInfoCType varIntRateInfo;
    @XmlElementRef(name = "IntDisp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDispType> intDisp;
    @XmlElementRef(name = "IntDispAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDispAcctIdType> intDispAcctId;
    @XmlElementRef(name = "IntDispAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntDispAcctTypeType> intDispAcctType;
    @XmlElementRef(name = "IntBasis", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntBasisType> intBasis;
    @XmlElementRef(name = "AccrMeth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccrMethType> accrMeth;
    @XmlElementRef(name = "PrtIntChkCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtIntChkCodeType> prtIntChkCode;
    @XmlElementRef(name = "PayIntEOMCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PayIntEOMCodeType> payIntEOMCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "LastPayDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastPayDtType> lastPayDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "TeaserRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateType> teaserRate;
    @XmlElementRef(name = "TeaserRateEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateEffDtType> teaserRateEffDt;
    @XmlElementRef(name = "TeaserRateExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TeaserRateExpDtType> teaserRateExpDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "TeaserRateCode")
    protected TeaserRateCodeType teaserRateCode;
    @XmlElement(name = "TeaserRateVarCode")
    protected RateVarCodeType teaserRateVarCode;
    @XmlElement(name = "TeaserRateVar")
    protected RateVarType teaserRateVar;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "MTDAccrInt")
    protected MTDAccrIntType mtdAccrInt;
    @XmlElement(name = "MTDAccrDays")
    protected MTDAccrDaysType mtdAccrDays;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the ytdInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YTDIntType }{@code >}
     *     
     */
    public JAXBElement<YTDIntType> getYTDInt() {
        return ytdInt;
    }

    /**
     * Sets the value of the ytdInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YTDIntType }{@code >}
     *     
     */
    public void setYTDInt(JAXBElement<YTDIntType> value) {
        this.ytdInt = value;
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
     * Gets the value of the altAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AltAccrIntType }{@code >}
     *     
     */
    public JAXBElement<AltAccrIntType> getAltAccrInt() {
        return altAccrInt;
    }

    /**
     * Sets the value of the altAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AltAccrIntType }{@code >}
     *     
     */
    public void setAltAccrInt(JAXBElement<AltAccrIntType> value) {
        this.altAccrInt = value;
    }

    /**
     * Gets the value of the amtLastIntPd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmtLastIntPdType }{@code >}
     *     
     */
    public JAXBElement<AmtLastIntPdType> getAmtLastIntPd() {
        return amtLastIntPd;
    }

    /**
     * Sets the value of the amtLastIntPd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmtLastIntPdType }{@code >}
     *     
     */
    public void setAmtLastIntPd(JAXBElement<AmtLastIntPdType> value) {
        this.amtLastIntPd = value;
    }

    /**
     * Gets the value of the prevYTDIntPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevYTDIntPaidType }{@code >}
     *     
     */
    public JAXBElement<PrevYTDIntPaidType> getPrevYTDIntPaid() {
        return prevYTDIntPaid;
    }

    /**
     * Sets the value of the prevYTDIntPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevYTDIntPaidType }{@code >}
     *     
     */
    public void setPrevYTDIntPaid(JAXBElement<PrevYTDIntPaidType> value) {
        this.prevYTDIntPaid = value;
    }

    /**
     * Gets the value of the varIntRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VarIntRateInfoCType }
     *     
     */
    public VarIntRateInfoCType getVarIntRateInfo() {
        return varIntRateInfo;
    }

    /**
     * Sets the value of the varIntRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarIntRateInfoCType }
     *     
     */
    public void setVarIntRateInfo(VarIntRateInfoCType value) {
        this.varIntRateInfo = value;
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
     * Gets the value of the intDispAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctIdType }{@code >}
     *     
     */
    public JAXBElement<IntDispAcctIdType> getIntDispAcctId() {
        return intDispAcctId;
    }

    /**
     * Sets the value of the intDispAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctIdType }{@code >}
     *     
     */
    public void setIntDispAcctId(JAXBElement<IntDispAcctIdType> value) {
        this.intDispAcctId = value;
    }

    /**
     * Gets the value of the intDispAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<IntDispAcctTypeType> getIntDispAcctType() {
        return intDispAcctType;
    }

    /**
     * Sets the value of the intDispAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntDispAcctTypeType }{@code >}
     *     
     */
    public void setIntDispAcctType(JAXBElement<IntDispAcctTypeType> value) {
        this.intDispAcctType = value;
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
     * Gets the value of the prtIntChkCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtIntChkCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtIntChkCodeType> getPrtIntChkCode() {
        return prtIntChkCode;
    }

    /**
     * Sets the value of the prtIntChkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtIntChkCodeType }{@code >}
     *     
     */
    public void setPrtIntChkCode(JAXBElement<PrtIntChkCodeType> value) {
        this.prtIntChkCode = value;
    }

    /**
     * Gets the value of the payIntEOMCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayIntEOMCodeType }{@code >}
     *     
     */
    public JAXBElement<PayIntEOMCodeType> getPayIntEOMCode() {
        return payIntEOMCode;
    }

    /**
     * Sets the value of the payIntEOMCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayIntEOMCodeType }{@code >}
     *     
     */
    public void setPayIntEOMCode(JAXBElement<PayIntEOMCodeType> value) {
        this.payIntEOMCode = value;
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
     * Gets the value of the lastPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastPayDtType }{@code >}
     *     
     */
    public JAXBElement<LastPayDtType> getLastPayDt() {
        return lastPayDt;
    }

    /**
     * Sets the value of the lastPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastPayDtType }{@code >}
     *     
     */
    public void setLastPayDt(JAXBElement<LastPayDtType> value) {
        this.lastPayDt = value;
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
     * Gets the value of the teaserRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateType> getTeaserRate() {
        return teaserRate;
    }

    /**
     * Sets the value of the teaserRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateType }{@code >}
     *     
     */
    public void setTeaserRate(JAXBElement<TeaserRateType> value) {
        this.teaserRate = value;
    }

    /**
     * Gets the value of the teaserRateEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateEffDtType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateEffDtType> getTeaserRateEffDt() {
        return teaserRateEffDt;
    }

    /**
     * Sets the value of the teaserRateEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateEffDtType }{@code >}
     *     
     */
    public void setTeaserRateEffDt(JAXBElement<TeaserRateEffDtType> value) {
        this.teaserRateEffDt = value;
    }

    /**
     * Gets the value of the teaserRateExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateExpDtType }{@code >}
     *     
     */
    public JAXBElement<TeaserRateExpDtType> getTeaserRateExpDt() {
        return teaserRateExpDt;
    }

    /**
     * Sets the value of the teaserRateExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeaserRateExpDtType }{@code >}
     *     
     */
    public void setTeaserRateExpDt(JAXBElement<TeaserRateExpDtType> value) {
        this.teaserRateExpDt = value;
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
     * Gets the value of the teaserRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link TeaserRateCodeType }
     *     
     */
    public TeaserRateCodeType getTeaserRateCode() {
        return teaserRateCode;
    }

    /**
     * Sets the value of the teaserRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeaserRateCodeType }
     *     
     */
    public void setTeaserRateCode(TeaserRateCodeType value) {
        this.teaserRateCode = value;
    }

    /**
     * Gets the value of the teaserRateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getTeaserRateVarCode() {
        return teaserRateVarCode;
    }

    /**
     * Sets the value of the teaserRateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setTeaserRateVarCode(RateVarCodeType value) {
        this.teaserRateVarCode = value;
    }

    /**
     * Gets the value of the teaserRateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getTeaserRateVar() {
        return teaserRateVar;
    }

    /**
     * Sets the value of the teaserRateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setTeaserRateVar(RateVarType value) {
        this.teaserRateVar = value;
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
     * Gets the value of the mtdAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link MTDAccrIntType }
     *     
     */
    public MTDAccrIntType getMTDAccrInt() {
        return mtdAccrInt;
    }

    /**
     * Sets the value of the mtdAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTDAccrIntType }
     *     
     */
    public void setMTDAccrInt(MTDAccrIntType value) {
        this.mtdAccrInt = value;
    }

    /**
     * Gets the value of the mtdAccrDays property.
     * 
     * @return
     *     possible object is
     *     {@link MTDAccrDaysType }
     *     
     */
    public MTDAccrDaysType getMTDAccrDays() {
        return mtdAccrDays;
    }

    /**
     * Sets the value of the mtdAccrDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link MTDAccrDaysType }
     *     
     */
    public void setMTDAccrDays(MTDAccrDaysType value) {
        this.mtdAccrDays = value;
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

}
