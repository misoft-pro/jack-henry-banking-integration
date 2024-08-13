
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
 * <p>Java class for FASB91InfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FASB91InfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FASB91LOC" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91LOC_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91TypeCode" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91TypeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AmrtzCode" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91AmrtzCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AutoChg" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91AutoChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AmrtzSoldCode" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91AmrtzSoldCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91Fee" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91Fee_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91Cost" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91Cost_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91OrigDt" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91OrigDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91MatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91FirstPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91PmtDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AmrtzTerm" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91AmrtzTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AmrtzTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91AmrtzTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91Proceed" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91Proceed_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91OddDayCode" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91OddDayCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91GroupCode" type="{http://jackhenry.com/jxchange/TPG/2008}GroupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91RptFee" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91RptFee_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91Yield" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91Yield_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="FASB91NxtProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91NxtProcDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FASB91InfoRec_CType", propOrder = {
    "fasb91LOC",
    "fasb91TypeCode",
    "fasb91AmrtzCode",
    "fasb91AutoChg",
    "fasb91AmrtzSoldCode",
    "fasb91Fee",
    "fasb91Cost",
    "fasb91OrigDt",
    "fasb91MatDt",
    "fasb91FirstPmtDt",
    "fasb91PmtDayOfMonth",
    "fasb91AmrtzTerm",
    "fasb91AmrtzTermUnit",
    "fasb91Proceed",
    "fasb91SemiDay1",
    "fasb91SemiDay2",
    "fasb91PmtAmt",
    "fasb91IntRate",
    "fasb91OddDayCode",
    "fasb91BrCode",
    "fasb91CustId",
    "fasb91GLCostCtr",
    "fasb91GLProdCode",
    "fasb91ProdCode",
    "fasb91GroupCode",
    "fasb91LastMainDt",
    "fasb91RptFee",
    "fasb91Yield",
    "ver1",
    "fasb91NxtProcDt",
    "ver2",
    "any"
})
public class FASB91InfoRecCType {

    @XmlElementRef(name = "FASB91LOC", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91LOCType> fasb91LOC;
    @XmlElementRef(name = "FASB91TypeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91TypeCodeType> fasb91TypeCode;
    @XmlElementRef(name = "FASB91AmrtzCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91AmrtzCodeType> fasb91AmrtzCode;
    @XmlElementRef(name = "FASB91AutoChg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91AutoChgType> fasb91AutoChg;
    @XmlElementRef(name = "FASB91AmrtzSoldCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91AmrtzSoldCodeType> fasb91AmrtzSoldCode;
    @XmlElementRef(name = "FASB91Fee", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91FeeType> fasb91Fee;
    @XmlElementRef(name = "FASB91Cost", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91CostType> fasb91Cost;
    @XmlElementRef(name = "FASB91OrigDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91OrigDtType> fasb91OrigDt;
    @XmlElementRef(name = "FASB91MatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91MatDtType> fasb91MatDt;
    @XmlElementRef(name = "FASB91FirstPmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstPmtDtType> fasb91FirstPmtDt;
    @XmlElementRef(name = "FASB91PmtDayOfMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtDayOfMonthType> fasb91PmtDayOfMonth;
    @XmlElementRef(name = "FASB91AmrtzTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91AmrtzTermType> fasb91AmrtzTerm;
    @XmlElementRef(name = "FASB91AmrtzTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91AmrtzTermUnitType> fasb91AmrtzTermUnit;
    @XmlElementRef(name = "FASB91Proceed", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91ProceedType> fasb91Proceed;
    @XmlElementRef(name = "FASB91SemiDay1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay1Type> fasb91SemiDay1;
    @XmlElementRef(name = "FASB91SemiDay2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SemiDay2Type> fasb91SemiDay2;
    @XmlElementRef(name = "FASB91PmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtAmtType> fasb91PmtAmt;
    @XmlElementRef(name = "FASB91IntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRateType> fasb91IntRate;
    @XmlElementRef(name = "FASB91OddDayCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91OddDayCodeType> fasb91OddDayCode;
    @XmlElementRef(name = "FASB91BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> fasb91BrCode;
    @XmlElementRef(name = "FASB91CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> fasb91CustId;
    @XmlElementRef(name = "FASB91GLCostCtr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLCostCtrType> fasb91GLCostCtr;
    @XmlElementRef(name = "FASB91GLProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLProdCodeType> fasb91GLProdCode;
    @XmlElementRef(name = "FASB91ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> fasb91ProdCode;
    @XmlElementRef(name = "FASB91GroupCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupCodeType> fasb91GroupCode;
    @XmlElementRef(name = "FASB91LastMainDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastMainDtType> fasb91LastMainDt;
    @XmlElementRef(name = "FASB91RptFee", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91RptFeeType> fasb91RptFee;
    @XmlElementRef(name = "FASB91Yield", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FASB91YieldType> fasb91Yield;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "FASB91NxtProcDt")
    protected FASB91NxtProcDtType fasb91NxtProcDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fasb91LOC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91LOCType }{@code >}
     *     
     */
    public JAXBElement<FASB91LOCType> getFASB91LOC() {
        return fasb91LOC;
    }

    /**
     * Sets the value of the fasb91LOC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91LOCType }{@code >}
     *     
     */
    public void setFASB91LOC(JAXBElement<FASB91LOCType> value) {
        this.fasb91LOC = value;
    }

    /**
     * Gets the value of the fasb91TypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91TypeCodeType }{@code >}
     *     
     */
    public JAXBElement<FASB91TypeCodeType> getFASB91TypeCode() {
        return fasb91TypeCode;
    }

    /**
     * Sets the value of the fasb91TypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91TypeCodeType }{@code >}
     *     
     */
    public void setFASB91TypeCode(JAXBElement<FASB91TypeCodeType> value) {
        this.fasb91TypeCode = value;
    }

    /**
     * Gets the value of the fasb91AmrtzCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzCodeType }{@code >}
     *     
     */
    public JAXBElement<FASB91AmrtzCodeType> getFASB91AmrtzCode() {
        return fasb91AmrtzCode;
    }

    /**
     * Sets the value of the fasb91AmrtzCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzCodeType }{@code >}
     *     
     */
    public void setFASB91AmrtzCode(JAXBElement<FASB91AmrtzCodeType> value) {
        this.fasb91AmrtzCode = value;
    }

    /**
     * Gets the value of the fasb91AutoChg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91AutoChgType }{@code >}
     *     
     */
    public JAXBElement<FASB91AutoChgType> getFASB91AutoChg() {
        return fasb91AutoChg;
    }

    /**
     * Sets the value of the fasb91AutoChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91AutoChgType }{@code >}
     *     
     */
    public void setFASB91AutoChg(JAXBElement<FASB91AutoChgType> value) {
        this.fasb91AutoChg = value;
    }

    /**
     * Gets the value of the fasb91AmrtzSoldCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzSoldCodeType }{@code >}
     *     
     */
    public JAXBElement<FASB91AmrtzSoldCodeType> getFASB91AmrtzSoldCode() {
        return fasb91AmrtzSoldCode;
    }

    /**
     * Sets the value of the fasb91AmrtzSoldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzSoldCodeType }{@code >}
     *     
     */
    public void setFASB91AmrtzSoldCode(JAXBElement<FASB91AmrtzSoldCodeType> value) {
        this.fasb91AmrtzSoldCode = value;
    }

    /**
     * Gets the value of the fasb91Fee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91FeeType }{@code >}
     *     
     */
    public JAXBElement<FASB91FeeType> getFASB91Fee() {
        return fasb91Fee;
    }

    /**
     * Sets the value of the fasb91Fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91FeeType }{@code >}
     *     
     */
    public void setFASB91Fee(JAXBElement<FASB91FeeType> value) {
        this.fasb91Fee = value;
    }

    /**
     * Gets the value of the fasb91Cost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91CostType }{@code >}
     *     
     */
    public JAXBElement<FASB91CostType> getFASB91Cost() {
        return fasb91Cost;
    }

    /**
     * Sets the value of the fasb91Cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91CostType }{@code >}
     *     
     */
    public void setFASB91Cost(JAXBElement<FASB91CostType> value) {
        this.fasb91Cost = value;
    }

    /**
     * Gets the value of the fasb91OrigDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91OrigDtType }{@code >}
     *     
     */
    public JAXBElement<FASB91OrigDtType> getFASB91OrigDt() {
        return fasb91OrigDt;
    }

    /**
     * Sets the value of the fasb91OrigDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91OrigDtType }{@code >}
     *     
     */
    public void setFASB91OrigDt(JAXBElement<FASB91OrigDtType> value) {
        this.fasb91OrigDt = value;
    }

    /**
     * Gets the value of the fasb91MatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91MatDtType }{@code >}
     *     
     */
    public JAXBElement<FASB91MatDtType> getFASB91MatDt() {
        return fasb91MatDt;
    }

    /**
     * Sets the value of the fasb91MatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91MatDtType }{@code >}
     *     
     */
    public void setFASB91MatDt(JAXBElement<FASB91MatDtType> value) {
        this.fasb91MatDt = value;
    }

    /**
     * Gets the value of the fasb91FirstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstPmtDtType }{@code >}
     *     
     */
    public JAXBElement<FirstPmtDtType> getFASB91FirstPmtDt() {
        return fasb91FirstPmtDt;
    }

    /**
     * Sets the value of the fasb91FirstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstPmtDtType }{@code >}
     *     
     */
    public void setFASB91FirstPmtDt(JAXBElement<FirstPmtDtType> value) {
        this.fasb91FirstPmtDt = value;
    }

    /**
     * Gets the value of the fasb91PmtDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtDayOfMonthType }{@code >}
     *     
     */
    public JAXBElement<PmtDayOfMonthType> getFASB91PmtDayOfMonth() {
        return fasb91PmtDayOfMonth;
    }

    /**
     * Sets the value of the fasb91PmtDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtDayOfMonthType }{@code >}
     *     
     */
    public void setFASB91PmtDayOfMonth(JAXBElement<PmtDayOfMonthType> value) {
        this.fasb91PmtDayOfMonth = value;
    }

    /**
     * Gets the value of the fasb91AmrtzTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzTermType }{@code >}
     *     
     */
    public JAXBElement<FASB91AmrtzTermType> getFASB91AmrtzTerm() {
        return fasb91AmrtzTerm;
    }

    /**
     * Sets the value of the fasb91AmrtzTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzTermType }{@code >}
     *     
     */
    public void setFASB91AmrtzTerm(JAXBElement<FASB91AmrtzTermType> value) {
        this.fasb91AmrtzTerm = value;
    }

    /**
     * Gets the value of the fasb91AmrtzTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzTermUnitType }{@code >}
     *     
     */
    public JAXBElement<FASB91AmrtzTermUnitType> getFASB91AmrtzTermUnit() {
        return fasb91AmrtzTermUnit;
    }

    /**
     * Sets the value of the fasb91AmrtzTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91AmrtzTermUnitType }{@code >}
     *     
     */
    public void setFASB91AmrtzTermUnit(JAXBElement<FASB91AmrtzTermUnitType> value) {
        this.fasb91AmrtzTermUnit = value;
    }

    /**
     * Gets the value of the fasb91Proceed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91ProceedType }{@code >}
     *     
     */
    public JAXBElement<FASB91ProceedType> getFASB91Proceed() {
        return fasb91Proceed;
    }

    /**
     * Sets the value of the fasb91Proceed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91ProceedType }{@code >}
     *     
     */
    public void setFASB91Proceed(JAXBElement<FASB91ProceedType> value) {
        this.fasb91Proceed = value;
    }

    /**
     * Gets the value of the fasb91SemiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay1Type> getFASB91SemiDay1() {
        return fasb91SemiDay1;
    }

    /**
     * Sets the value of the fasb91SemiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}
     *     
     */
    public void setFASB91SemiDay1(JAXBElement<SemiDay1Type> value) {
        this.fasb91SemiDay1 = value;
    }

    /**
     * Gets the value of the fasb91SemiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public JAXBElement<SemiDay2Type> getFASB91SemiDay2() {
        return fasb91SemiDay2;
    }

    /**
     * Sets the value of the fasb91SemiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}
     *     
     */
    public void setFASB91SemiDay2(JAXBElement<SemiDay2Type> value) {
        this.fasb91SemiDay2 = value;
    }

    /**
     * Gets the value of the fasb91PmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public JAXBElement<PmtAmtType> getFASB91PmtAmt() {
        return fasb91PmtAmt;
    }

    /**
     * Sets the value of the fasb91PmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtAmtType }{@code >}
     *     
     */
    public void setFASB91PmtAmt(JAXBElement<PmtAmtType> value) {
        this.fasb91PmtAmt = value;
    }

    /**
     * Gets the value of the fasb91IntRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public JAXBElement<IntRateType> getFASB91IntRate() {
        return fasb91IntRate;
    }

    /**
     * Sets the value of the fasb91IntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntRateType }{@code >}
     *     
     */
    public void setFASB91IntRate(JAXBElement<IntRateType> value) {
        this.fasb91IntRate = value;
    }

    /**
     * Gets the value of the fasb91OddDayCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91OddDayCodeType }{@code >}
     *     
     */
    public JAXBElement<FASB91OddDayCodeType> getFASB91OddDayCode() {
        return fasb91OddDayCode;
    }

    /**
     * Sets the value of the fasb91OddDayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91OddDayCodeType }{@code >}
     *     
     */
    public void setFASB91OddDayCode(JAXBElement<FASB91OddDayCodeType> value) {
        this.fasb91OddDayCode = value;
    }

    /**
     * Gets the value of the fasb91BrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getFASB91BrCode() {
        return fasb91BrCode;
    }

    /**
     * Sets the value of the fasb91BrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setFASB91BrCode(JAXBElement<BrCodeType> value) {
        this.fasb91BrCode = value;
    }

    /**
     * Gets the value of the fasb91CustId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public JAXBElement<CustIdType> getFASB91CustId() {
        return fasb91CustId;
    }

    /**
     * Sets the value of the fasb91CustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public void setFASB91CustId(JAXBElement<CustIdType> value) {
        this.fasb91CustId = value;
    }

    /**
     * Gets the value of the fasb91GLCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public JAXBElement<GLCostCtrType> getFASB91GLCostCtr() {
        return fasb91GLCostCtr;
    }

    /**
     * Sets the value of the fasb91GLCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public void setFASB91GLCostCtr(JAXBElement<GLCostCtrType> value) {
        this.fasb91GLCostCtr = value;
    }

    /**
     * Gets the value of the fasb91GLProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public JAXBElement<GLProdCodeType> getFASB91GLProdCode() {
        return fasb91GLProdCode;
    }

    /**
     * Sets the value of the fasb91GLProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public void setFASB91GLProdCode(JAXBElement<GLProdCodeType> value) {
        this.fasb91GLProdCode = value;
    }

    /**
     * Gets the value of the fasb91ProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ProdCodeType> getFASB91ProdCode() {
        return fasb91ProdCode;
    }

    /**
     * Sets the value of the fasb91ProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public void setFASB91ProdCode(JAXBElement<ProdCodeType> value) {
        this.fasb91ProdCode = value;
    }

    /**
     * Gets the value of the fasb91GroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupCodeType }{@code >}
     *     
     */
    public JAXBElement<GroupCodeType> getFASB91GroupCode() {
        return fasb91GroupCode;
    }

    /**
     * Sets the value of the fasb91GroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupCodeType }{@code >}
     *     
     */
    public void setFASB91GroupCode(JAXBElement<GroupCodeType> value) {
        this.fasb91GroupCode = value;
    }

    /**
     * Gets the value of the fasb91LastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public JAXBElement<LastMainDtType> getFASB91LastMainDt() {
        return fasb91LastMainDt;
    }

    /**
     * Sets the value of the fasb91LastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public void setFASB91LastMainDt(JAXBElement<LastMainDtType> value) {
        this.fasb91LastMainDt = value;
    }

    /**
     * Gets the value of the fasb91RptFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91RptFeeType }{@code >}
     *     
     */
    public JAXBElement<FASB91RptFeeType> getFASB91RptFee() {
        return fasb91RptFee;
    }

    /**
     * Sets the value of the fasb91RptFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91RptFeeType }{@code >}
     *     
     */
    public void setFASB91RptFee(JAXBElement<FASB91RptFeeType> value) {
        this.fasb91RptFee = value;
    }

    /**
     * Gets the value of the fasb91Yield property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FASB91YieldType }{@code >}
     *     
     */
    public JAXBElement<FASB91YieldType> getFASB91Yield() {
        return fasb91Yield;
    }

    /**
     * Sets the value of the fasb91Yield property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FASB91YieldType }{@code >}
     *     
     */
    public void setFASB91Yield(JAXBElement<FASB91YieldType> value) {
        this.fasb91Yield = value;
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
     * Gets the value of the fasb91NxtProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link FASB91NxtProcDtType }
     *     
     */
    public FASB91NxtProcDtType getFASB91NxtProcDt() {
        return fasb91NxtProcDt;
    }

    /**
     * Sets the value of the fasb91NxtProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASB91NxtProcDtType }
     *     
     */
    public void setFASB91NxtProcDt(FASB91NxtProcDtType value) {
        this.fasb91NxtProcDt = value;
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
