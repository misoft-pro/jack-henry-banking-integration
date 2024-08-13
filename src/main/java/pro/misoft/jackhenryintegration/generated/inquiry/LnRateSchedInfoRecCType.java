
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
 * <p>Java class for LnRateSchedInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRateSchedInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateRevStat" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewRate" type="{http://jackhenry.com/jxchange/TPG/2008}NewRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewRateEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}NewRateEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RevDtRate" type="{http://jackhenry.com/jxchange/TPG/2008}RevDtRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrevRate" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrevRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurIdx" type="{http://jackhenry.com/jxchange/TPG/2008}CurIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevIdxVal" type="{http://jackhenry.com/jxchange/TPG/2008}PrevIdxVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevStatDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevStatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtRateChgNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRateChgNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrinIntPmt" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrinIntPmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrimeRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}PrimeRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReAmrtzPmt" type="{http://jackhenry.com/jxchange/TPG/2008}ReAmrtzPmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTermUnits_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LnRateSchedInfoRec_CType", propOrder = {
    "rateRevStat",
    "rateRevDt",
    "newRate",
    "newRateEffDt",
    "revDtRate",
    "newPrevRate",
    "curIdx",
    "prevIdxVal",
    "rateRevStatDt",
    "prtRateChgNotCode",
    "rateRevDayOfMonth",
    "newPrinIntPmt",
    "primeRateIdx",
    "rateVar",
    "rateVarCode",
    "reAmrtzPmt",
    "rateRevTerm",
    "rateRevTermUnits",
    "ver1",
    "any"
})
public class LnRateSchedInfoRecCType {

    @XmlElement(name = "RateRevStat")
    protected RateRevStatType rateRevStat;
    @XmlElement(name = "RateRevDt")
    protected RateRevDtType rateRevDt;
    @XmlElement(name = "NewRate")
    protected NewRateType newRate;
    @XmlElement(name = "NewRateEffDt")
    protected NewRateEffDtType newRateEffDt;
    @XmlElement(name = "RevDtRate")
    protected RevDtRateType revDtRate;
    @XmlElement(name = "NewPrevRate")
    protected NewPrevRateType newPrevRate;
    @XmlElement(name = "CurIdx")
    protected CurIdxType curIdx;
    @XmlElement(name = "PrevIdxVal")
    protected PrevIdxValType prevIdxVal;
    @XmlElement(name = "RateRevStatDt")
    protected RateRevStatDtType rateRevStatDt;
    @XmlElement(name = "PrtRateChgNotCode")
    protected PrtRateChgNotCodeType prtRateChgNotCode;
    @XmlElement(name = "RateRevDayOfMonth")
    protected RateRevDayOfMonthType rateRevDayOfMonth;
    @XmlElement(name = "NewPrinIntPmt")
    protected NewPrinIntPmtType newPrinIntPmt;
    @XmlElement(name = "PrimeRateIdx")
    protected PrimeRateIdxType primeRateIdx;
    @XmlElement(name = "RateVar")
    protected RateVarType rateVar;
    @XmlElement(name = "RateVarCode")
    protected RateVarCodeType rateVarCode;
    @XmlElement(name = "ReAmrtzPmt")
    protected ReAmrtzPmtType reAmrtzPmt;
    @XmlElement(name = "RateRevTerm")
    protected RateRevTermType rateRevTerm;
    @XmlElement(name = "RateRevTermUnits")
    protected RateRevTermUnitsType rateRevTermUnits;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rateRevStat property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevStatType }
     *     
     */
    public RateRevStatType getRateRevStat() {
        return rateRevStat;
    }

    /**
     * Sets the value of the rateRevStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevStatType }
     *     
     */
    public void setRateRevStat(RateRevStatType value) {
        this.rateRevStat = value;
    }

    /**
     * Gets the value of the rateRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevDtType }
     *     
     */
    public RateRevDtType getRateRevDt() {
        return rateRevDt;
    }

    /**
     * Sets the value of the rateRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevDtType }
     *     
     */
    public void setRateRevDt(RateRevDtType value) {
        this.rateRevDt = value;
    }

    /**
     * Gets the value of the newRate property.
     * 
     * @return
     *     possible object is
     *     {@link NewRateType }
     *     
     */
    public NewRateType getNewRate() {
        return newRate;
    }

    /**
     * Sets the value of the newRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRateType }
     *     
     */
    public void setNewRate(NewRateType value) {
        this.newRate = value;
    }

    /**
     * Gets the value of the newRateEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link NewRateEffDtType }
     *     
     */
    public NewRateEffDtType getNewRateEffDt() {
        return newRateEffDt;
    }

    /**
     * Sets the value of the newRateEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRateEffDtType }
     *     
     */
    public void setNewRateEffDt(NewRateEffDtType value) {
        this.newRateEffDt = value;
    }

    /**
     * Gets the value of the revDtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RevDtRateType }
     *     
     */
    public RevDtRateType getRevDtRate() {
        return revDtRate;
    }

    /**
     * Sets the value of the revDtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevDtRateType }
     *     
     */
    public void setRevDtRate(RevDtRateType value) {
        this.revDtRate = value;
    }

    /**
     * Gets the value of the newPrevRate property.
     * 
     * @return
     *     possible object is
     *     {@link NewPrevRateType }
     *     
     */
    public NewPrevRateType getNewPrevRate() {
        return newPrevRate;
    }

    /**
     * Sets the value of the newPrevRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPrevRateType }
     *     
     */
    public void setNewPrevRate(NewPrevRateType value) {
        this.newPrevRate = value;
    }

    /**
     * Gets the value of the curIdx property.
     * 
     * @return
     *     possible object is
     *     {@link CurIdxType }
     *     
     */
    public CurIdxType getCurIdx() {
        return curIdx;
    }

    /**
     * Sets the value of the curIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurIdxType }
     *     
     */
    public void setCurIdx(CurIdxType value) {
        this.curIdx = value;
    }

    /**
     * Gets the value of the prevIdxVal property.
     * 
     * @return
     *     possible object is
     *     {@link PrevIdxValType }
     *     
     */
    public PrevIdxValType getPrevIdxVal() {
        return prevIdxVal;
    }

    /**
     * Sets the value of the prevIdxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevIdxValType }
     *     
     */
    public void setPrevIdxVal(PrevIdxValType value) {
        this.prevIdxVal = value;
    }

    /**
     * Gets the value of the rateRevStatDt property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevStatDtType }
     *     
     */
    public RateRevStatDtType getRateRevStatDt() {
        return rateRevStatDt;
    }

    /**
     * Sets the value of the rateRevStatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevStatDtType }
     *     
     */
    public void setRateRevStatDt(RateRevStatDtType value) {
        this.rateRevStatDt = value;
    }

    /**
     * Gets the value of the prtRateChgNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtRateChgNotCodeType }
     *     
     */
    public PrtRateChgNotCodeType getPrtRateChgNotCode() {
        return prtRateChgNotCode;
    }

    /**
     * Sets the value of the prtRateChgNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtRateChgNotCodeType }
     *     
     */
    public void setPrtRateChgNotCode(PrtRateChgNotCodeType value) {
        this.prtRateChgNotCode = value;
    }

    /**
     * Gets the value of the rateRevDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevDayOfMonthType }
     *     
     */
    public RateRevDayOfMonthType getRateRevDayOfMonth() {
        return rateRevDayOfMonth;
    }

    /**
     * Sets the value of the rateRevDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevDayOfMonthType }
     *     
     */
    public void setRateRevDayOfMonth(RateRevDayOfMonthType value) {
        this.rateRevDayOfMonth = value;
    }

    /**
     * Gets the value of the newPrinIntPmt property.
     * 
     * @return
     *     possible object is
     *     {@link NewPrinIntPmtType }
     *     
     */
    public NewPrinIntPmtType getNewPrinIntPmt() {
        return newPrinIntPmt;
    }

    /**
     * Sets the value of the newPrinIntPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPrinIntPmtType }
     *     
     */
    public void setNewPrinIntPmt(NewPrinIntPmtType value) {
        this.newPrinIntPmt = value;
    }

    /**
     * Gets the value of the primeRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeRateIdxType }
     *     
     */
    public PrimeRateIdxType getPrimeRateIdx() {
        return primeRateIdx;
    }

    /**
     * Sets the value of the primeRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeRateIdxType }
     *     
     */
    public void setPrimeRateIdx(PrimeRateIdxType value) {
        this.primeRateIdx = value;
    }

    /**
     * Gets the value of the rateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getRateVar() {
        return rateVar;
    }

    /**
     * Sets the value of the rateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setRateVar(RateVarType value) {
        this.rateVar = value;
    }

    /**
     * Gets the value of the rateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getRateVarCode() {
        return rateVarCode;
    }

    /**
     * Sets the value of the rateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setRateVarCode(RateVarCodeType value) {
        this.rateVarCode = value;
    }

    /**
     * Gets the value of the reAmrtzPmt property.
     * 
     * @return
     *     possible object is
     *     {@link ReAmrtzPmtType }
     *     
     */
    public ReAmrtzPmtType getReAmrtzPmt() {
        return reAmrtzPmt;
    }

    /**
     * Sets the value of the reAmrtzPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReAmrtzPmtType }
     *     
     */
    public void setReAmrtzPmt(ReAmrtzPmtType value) {
        this.reAmrtzPmt = value;
    }

    /**
     * Gets the value of the rateRevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevTermType }
     *     
     */
    public RateRevTermType getRateRevTerm() {
        return rateRevTerm;
    }

    /**
     * Sets the value of the rateRevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevTermType }
     *     
     */
    public void setRateRevTerm(RateRevTermType value) {
        this.rateRevTerm = value;
    }

    /**
     * Gets the value of the rateRevTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevTermUnitsType }
     *     
     */
    public RateRevTermUnitsType getRateRevTermUnits() {
        return rateRevTermUnits;
    }

    /**
     * Sets the value of the rateRevTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevTermUnitsType }
     *     
     */
    public void setRateRevTermUnits(RateRevTermUnitsType value) {
        this.rateRevTermUnits = value;
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
