
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TrnAddQuotePostInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnAddQuotePostInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurPayOff" type="{http://jackhenry.com/jxchange/TPG/2008}CurPayOff_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OthChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PartPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AmrtzPmtSusp" type="{http://jackhenry.com/jxchange/TPG/2008}AmrtzPmtSusp_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegColAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NegColAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFNegBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFNegBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODNegBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODNegBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EscrwAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrnAddQuotePostInfo_CType", propOrder = {
    "curBal",
    "accrInt",
    "lateChgAmt",
    "curPayOff",
    "othChgAmt",
    "partPmtAmt",
    "amrtzPmtSusp",
    "pmtDueDt",
    "pmtAmt",
    "piAmt",
    "intPaidYTD",
    "negColAmt",
    "nsfNegBalAmt",
    "odNegBalAmt",
    "ver1",
    "escrwAmt",
    "ver2",
    "any"
})
public class TrnAddQuotePostInfoCType {

    @XmlElement(name = "CurBal", required = true)
    protected CurBalType curBal;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "LateChgAmt")
    protected LateChgAmtType lateChgAmt;
    @XmlElement(name = "CurPayOff")
    protected CurPayOffType curPayOff;
    @XmlElement(name = "OthChgAmt")
    protected OthChgAmtType othChgAmt;
    @XmlElement(name = "PartPmtAmt")
    protected PartPmtAmtType partPmtAmt;
    @XmlElement(name = "AmrtzPmtSusp")
    protected AmrtzPmtSuspType amrtzPmtSusp;
    @XmlElement(name = "PmtDueDt")
    protected PmtDueDtType pmtDueDt;
    @XmlElement(name = "PmtAmt")
    protected PmtAmtType pmtAmt;
    @XmlElement(name = "PIAmt")
    protected PIAmtType piAmt;
    @XmlElement(name = "IntPaidYTD")
    protected IntPaidYTDType intPaidYTD;
    @XmlElement(name = "NegColAmt")
    protected NegColAmtType negColAmt;
    @XmlElement(name = "NSFNegBalAmt")
    protected NSFNegBalAmtType nsfNegBalAmt;
    @XmlElement(name = "ODNegBalAmt")
    protected ODNegBalAmtType odNegBalAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EscrwAmt")
    protected EscrwAmtType escrwAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the accrInt property.
     * 
     * @return
     *     possible object is
     *     {@link AccrIntType }
     *     
     */
    public AccrIntType getAccrInt() {
        return accrInt;
    }

    /**
     * Sets the value of the accrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrIntType }
     *     
     */
    public void setAccrInt(AccrIntType value) {
        this.accrInt = value;
    }

    /**
     * Gets the value of the lateChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgAmtType }
     *     
     */
    public LateChgAmtType getLateChgAmt() {
        return lateChgAmt;
    }

    /**
     * Sets the value of the lateChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgAmtType }
     *     
     */
    public void setLateChgAmt(LateChgAmtType value) {
        this.lateChgAmt = value;
    }

    /**
     * Gets the value of the curPayOff property.
     * 
     * @return
     *     possible object is
     *     {@link CurPayOffType }
     *     
     */
    public CurPayOffType getCurPayOff() {
        return curPayOff;
    }

    /**
     * Sets the value of the curPayOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurPayOffType }
     *     
     */
    public void setCurPayOff(CurPayOffType value) {
        this.curPayOff = value;
    }

    /**
     * Gets the value of the othChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OthChgAmtType }
     *     
     */
    public OthChgAmtType getOthChgAmt() {
        return othChgAmt;
    }

    /**
     * Sets the value of the othChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthChgAmtType }
     *     
     */
    public void setOthChgAmt(OthChgAmtType value) {
        this.othChgAmt = value;
    }

    /**
     * Gets the value of the partPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartPmtAmtType }
     *     
     */
    public PartPmtAmtType getPartPmtAmt() {
        return partPmtAmt;
    }

    /**
     * Sets the value of the partPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPmtAmtType }
     *     
     */
    public void setPartPmtAmt(PartPmtAmtType value) {
        this.partPmtAmt = value;
    }

    /**
     * Gets the value of the amrtzPmtSusp property.
     * 
     * @return
     *     possible object is
     *     {@link AmrtzPmtSuspType }
     *     
     */
    public AmrtzPmtSuspType getAmrtzPmtSusp() {
        return amrtzPmtSusp;
    }

    /**
     * Sets the value of the amrtzPmtSusp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmrtzPmtSuspType }
     *     
     */
    public void setAmrtzPmtSusp(AmrtzPmtSuspType value) {
        this.amrtzPmtSusp = value;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDueDtType }
     *     
     */
    public PmtDueDtType getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDueDtType }
     *     
     */
    public void setPmtDueDt(PmtDueDtType value) {
        this.pmtDueDt = value;
    }

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
     * Gets the value of the negColAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NegColAmtType }
     *     
     */
    public NegColAmtType getNegColAmt() {
        return negColAmt;
    }

    /**
     * Sets the value of the negColAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegColAmtType }
     *     
     */
    public void setNegColAmt(NegColAmtType value) {
        this.negColAmt = value;
    }

    /**
     * Gets the value of the nsfNegBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NSFNegBalAmtType }
     *     
     */
    public NSFNegBalAmtType getNSFNegBalAmt() {
        return nsfNegBalAmt;
    }

    /**
     * Sets the value of the nsfNegBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFNegBalAmtType }
     *     
     */
    public void setNSFNegBalAmt(NSFNegBalAmtType value) {
        this.nsfNegBalAmt = value;
    }

    /**
     * Gets the value of the odNegBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ODNegBalAmtType }
     *     
     */
    public ODNegBalAmtType getODNegBalAmt() {
        return odNegBalAmt;
    }

    /**
     * Sets the value of the odNegBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODNegBalAmtType }
     *     
     */
    public void setODNegBalAmt(ODNegBalAmtType value) {
        this.odNegBalAmt = value;
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
     * Gets the value of the escrwAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwAmtType }
     *     
     */
    public EscrwAmtType getEscrwAmt() {
        return escrwAmt;
    }

    /**
     * Sets the value of the escrwAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwAmtType }
     *     
     */
    public void setEscrwAmt(EscrwAmtType value) {
        this.escrwAmt = value;
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
