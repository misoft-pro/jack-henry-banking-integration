
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
 * <p>Java class for RegDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DoNotCallExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}DoNotCallExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DoNotCallCode" type="{http://jackhenry.com/jxchange/TPG/2008}DoNotCallCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegPOptOutCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegPOptOutCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegPSentDt" type="{http://jackhenry.com/jxchange/TPG/2008}RegPSentDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRARec" type="{http://jackhenry.com/jxchange/TPG/2008}CRARec_CType" minOccurs="0"/&gt;
 *         &lt;element name="AflOptOutCode" type="{http://jackhenry.com/jxchange/TPG/2008}AflOptOutCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflOptOutExcptCode" type="{http://jackhenry.com/jxchange/TPG/2008}AflOptOutExcptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflOptOutExcptDt" type="{http://jackhenry.com/jxchange/TPG/2008}AflOptOutExcptDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflOptOutExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}AflOptOutExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustDataRtnPeriod" type="{http://jackhenry.com/jxchange/TPG/2008}CustDataRtnPeriod_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRateDt" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRateByCode" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateByCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ReqLegalEntityType" type="{http://jackhenry.com/jxchange/TPG/2008}ReqLegalEntityType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcOwnPct" type="{http://jackhenry.com/jxchange/TPG/2008}ExcOwnPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcPctRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcPctRsnCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="BenflOwnExclCode" type="{http://jackhenry.com/jxchange/TPG/2008}BenflOwnExclCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AnnRevenueAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AnnRevenueAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RegDetail_CType", propOrder = {
    "doNotCallExpDt",
    "doNotCallCode",
    "regPOptOutCode",
    "regPSentDt",
    "craRec",
    "aflOptOutCode",
    "aflOptOutExcptCode",
    "aflOptOutExcptDt",
    "aflOptOutExpDt",
    "custDataRtnPeriod",
    "riskRateCode",
    "riskRateDt",
    "riskRateByCode",
    "custom",
    "ver1",
    "reqLegalEntityType",
    "excOwnPct",
    "excPctRsnCode",
    "benflOwnExclCode",
    "ver2",
    "annRevenueAmt",
    "ver3",
    "any"
})
public class RegDetailCType {

    @XmlElementRef(name = "DoNotCallExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DoNotCallExpDtType> doNotCallExpDt;
    @XmlElementRef(name = "DoNotCallCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DoNotCallCodeType> doNotCallCode;
    @XmlElementRef(name = "RegPOptOutCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegPOptOutCodeType> regPOptOutCode;
    @XmlElementRef(name = "RegPSentDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegPSentDtType> regPSentDt;
    @XmlElement(name = "CRARec")
    protected CRARecCType craRec;
    @XmlElementRef(name = "AflOptOutCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AflOptOutCodeType> aflOptOutCode;
    @XmlElementRef(name = "AflOptOutExcptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AflOptOutExcptCodeType> aflOptOutExcptCode;
    @XmlElementRef(name = "AflOptOutExcptDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AflOptOutExcptDtType> aflOptOutExcptDt;
    @XmlElementRef(name = "AflOptOutExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AflOptOutExpDtType> aflOptOutExpDt;
    @XmlElementRef(name = "CustDataRtnPeriod", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustDataRtnPeriodType> custDataRtnPeriod;
    @XmlElementRef(name = "RiskRateCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RiskRateCodeType> riskRateCode;
    @XmlElementRef(name = "RiskRateDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RiskRateDtType> riskRateDt;
    @XmlElementRef(name = "RiskRateByCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RiskRateByCodeType> riskRateByCode;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ReqLegalEntityType")
    protected ReqLegalEntityTypeType reqLegalEntityType;
    @XmlElement(name = "ExcOwnPct")
    protected ExcOwnPctType excOwnPct;
    @XmlElement(name = "ExcPctRsnCode")
    protected ExcPctRsnCodeType excPctRsnCode;
    @XmlElement(name = "BenflOwnExclCode")
    protected BenflOwnExclCodeType benflOwnExclCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AnnRevenueAmt")
    protected AnnRevenueAmtType annRevenueAmt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the doNotCallExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DoNotCallExpDtType }{@code >}
     *     
     */
    public JAXBElement<DoNotCallExpDtType> getDoNotCallExpDt() {
        return doNotCallExpDt;
    }

    /**
     * Sets the value of the doNotCallExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DoNotCallExpDtType }{@code >}
     *     
     */
    public void setDoNotCallExpDt(JAXBElement<DoNotCallExpDtType> value) {
        this.doNotCallExpDt = value;
    }

    /**
     * Gets the value of the doNotCallCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DoNotCallCodeType }{@code >}
     *     
     */
    public JAXBElement<DoNotCallCodeType> getDoNotCallCode() {
        return doNotCallCode;
    }

    /**
     * Sets the value of the doNotCallCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DoNotCallCodeType }{@code >}
     *     
     */
    public void setDoNotCallCode(JAXBElement<DoNotCallCodeType> value) {
        this.doNotCallCode = value;
    }

    /**
     * Gets the value of the regPOptOutCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegPOptOutCodeType }{@code >}
     *     
     */
    public JAXBElement<RegPOptOutCodeType> getRegPOptOutCode() {
        return regPOptOutCode;
    }

    /**
     * Sets the value of the regPOptOutCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegPOptOutCodeType }{@code >}
     *     
     */
    public void setRegPOptOutCode(JAXBElement<RegPOptOutCodeType> value) {
        this.regPOptOutCode = value;
    }

    /**
     * Gets the value of the regPSentDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegPSentDtType }{@code >}
     *     
     */
    public JAXBElement<RegPSentDtType> getRegPSentDt() {
        return regPSentDt;
    }

    /**
     * Sets the value of the regPSentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegPSentDtType }{@code >}
     *     
     */
    public void setRegPSentDt(JAXBElement<RegPSentDtType> value) {
        this.regPSentDt = value;
    }

    /**
     * Gets the value of the craRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRARecCType }
     *     
     */
    public CRARecCType getCRARec() {
        return craRec;
    }

    /**
     * Sets the value of the craRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRARecCType }
     *     
     */
    public void setCRARec(CRARecCType value) {
        this.craRec = value;
    }

    /**
     * Gets the value of the aflOptOutCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutCodeType }{@code >}
     *     
     */
    public JAXBElement<AflOptOutCodeType> getAflOptOutCode() {
        return aflOptOutCode;
    }

    /**
     * Sets the value of the aflOptOutCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutCodeType }{@code >}
     *     
     */
    public void setAflOptOutCode(JAXBElement<AflOptOutCodeType> value) {
        this.aflOptOutCode = value;
    }

    /**
     * Gets the value of the aflOptOutExcptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutExcptCodeType }{@code >}
     *     
     */
    public JAXBElement<AflOptOutExcptCodeType> getAflOptOutExcptCode() {
        return aflOptOutExcptCode;
    }

    /**
     * Sets the value of the aflOptOutExcptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutExcptCodeType }{@code >}
     *     
     */
    public void setAflOptOutExcptCode(JAXBElement<AflOptOutExcptCodeType> value) {
        this.aflOptOutExcptCode = value;
    }

    /**
     * Gets the value of the aflOptOutExcptDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutExcptDtType }{@code >}
     *     
     */
    public JAXBElement<AflOptOutExcptDtType> getAflOptOutExcptDt() {
        return aflOptOutExcptDt;
    }

    /**
     * Sets the value of the aflOptOutExcptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutExcptDtType }{@code >}
     *     
     */
    public void setAflOptOutExcptDt(JAXBElement<AflOptOutExcptDtType> value) {
        this.aflOptOutExcptDt = value;
    }

    /**
     * Gets the value of the aflOptOutExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutExpDtType }{@code >}
     *     
     */
    public JAXBElement<AflOptOutExpDtType> getAflOptOutExpDt() {
        return aflOptOutExpDt;
    }

    /**
     * Sets the value of the aflOptOutExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AflOptOutExpDtType }{@code >}
     *     
     */
    public void setAflOptOutExpDt(JAXBElement<AflOptOutExpDtType> value) {
        this.aflOptOutExpDt = value;
    }

    /**
     * Gets the value of the custDataRtnPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustDataRtnPeriodType }{@code >}
     *     
     */
    public JAXBElement<CustDataRtnPeriodType> getCustDataRtnPeriod() {
        return custDataRtnPeriod;
    }

    /**
     * Sets the value of the custDataRtnPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustDataRtnPeriodType }{@code >}
     *     
     */
    public void setCustDataRtnPeriod(JAXBElement<CustDataRtnPeriodType> value) {
        this.custDataRtnPeriod = value;
    }

    /**
     * Gets the value of the riskRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RiskRateCodeType }{@code >}
     *     
     */
    public JAXBElement<RiskRateCodeType> getRiskRateCode() {
        return riskRateCode;
    }

    /**
     * Sets the value of the riskRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RiskRateCodeType }{@code >}
     *     
     */
    public void setRiskRateCode(JAXBElement<RiskRateCodeType> value) {
        this.riskRateCode = value;
    }

    /**
     * Gets the value of the riskRateDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RiskRateDtType }{@code >}
     *     
     */
    public JAXBElement<RiskRateDtType> getRiskRateDt() {
        return riskRateDt;
    }

    /**
     * Sets the value of the riskRateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RiskRateDtType }{@code >}
     *     
     */
    public void setRiskRateDt(JAXBElement<RiskRateDtType> value) {
        this.riskRateDt = value;
    }

    /**
     * Gets the value of the riskRateByCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RiskRateByCodeType }{@code >}
     *     
     */
    public JAXBElement<RiskRateByCodeType> getRiskRateByCode() {
        return riskRateByCode;
    }

    /**
     * Sets the value of the riskRateByCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RiskRateByCodeType }{@code >}
     *     
     */
    public void setRiskRateByCode(JAXBElement<RiskRateByCodeType> value) {
        this.riskRateByCode = value;
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
     * Gets the value of the reqLegalEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link ReqLegalEntityTypeType }
     *     
     */
    public ReqLegalEntityTypeType getReqLegalEntityType() {
        return reqLegalEntityType;
    }

    /**
     * Sets the value of the reqLegalEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqLegalEntityTypeType }
     *     
     */
    public void setReqLegalEntityType(ReqLegalEntityTypeType value) {
        this.reqLegalEntityType = value;
    }

    /**
     * Gets the value of the excOwnPct property.
     * 
     * @return
     *     possible object is
     *     {@link ExcOwnPctType }
     *     
     */
    public ExcOwnPctType getExcOwnPct() {
        return excOwnPct;
    }

    /**
     * Sets the value of the excOwnPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcOwnPctType }
     *     
     */
    public void setExcOwnPct(ExcOwnPctType value) {
        this.excOwnPct = value;
    }

    /**
     * Gets the value of the excPctRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcPctRsnCodeType }
     *     
     */
    public ExcPctRsnCodeType getExcPctRsnCode() {
        return excPctRsnCode;
    }

    /**
     * Sets the value of the excPctRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcPctRsnCodeType }
     *     
     */
    public void setExcPctRsnCode(ExcPctRsnCodeType value) {
        this.excPctRsnCode = value;
    }

    /**
     * Gets the value of the benflOwnExclCode property.
     * 
     * @return
     *     possible object is
     *     {@link BenflOwnExclCodeType }
     *     
     */
    public BenflOwnExclCodeType getBenflOwnExclCode() {
        return benflOwnExclCode;
    }

    /**
     * Sets the value of the benflOwnExclCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenflOwnExclCodeType }
     *     
     */
    public void setBenflOwnExclCode(BenflOwnExclCodeType value) {
        this.benflOwnExclCode = value;
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
     * Gets the value of the annRevenueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AnnRevenueAmtType }
     *     
     */
    public AnnRevenueAmtType getAnnRevenueAmt() {
        return annRevenueAmt;
    }

    /**
     * Sets the value of the annRevenueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnRevenueAmtType }
     *     
     */
    public void setAnnRevenueAmt(AnnRevenueAmtType value) {
        this.annRevenueAmt = value;
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
