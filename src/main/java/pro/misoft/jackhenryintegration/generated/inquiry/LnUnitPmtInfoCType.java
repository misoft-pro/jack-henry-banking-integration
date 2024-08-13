
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
 * <p>Java class for LnUnitPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OthChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OthChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnpaidChgs" type="{http://jackhenry.com/jxchange/TPG/2008}UnpaidChgs_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPrincAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilPrincAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilIntAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilIntAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilLateChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilLateChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilOtherChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilOtherChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilLeadDays" type="{http://jackhenry.com/jxchange/TPG/2008}BilLeadDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdAccr" type="{http://jackhenry.com/jxchange/TPG/2008}SecdAccr_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CrtBilDOM" type="{http://jackhenry.com/jxchange/TPG/2008}CrtBilDOM_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="UnitPostSeq" type="{http://jackhenry.com/jxchange/TPG/2008}UnitPostSeq_Type" minOccurs="0"/&gt;
 *             &lt;element name="NSFFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFFeeAmt_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrePmtPenYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenYTD_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrePmtPenPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenPYTD_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrePmtPenLTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenLTD_Type" minOccurs="0"/&gt;
 *             &lt;element name="LastPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtAmt_Type" minOccurs="0"/&gt;
 *             &lt;element name="LnUnitFeeArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="ChgYrFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}ChgYrFeeCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitPmtInfo_CType", propOrder = {
    "othChgAmt",
    "unpaidChgs",
    "bilPrincAmt",
    "bilIntAmt",
    "bilLateChgAmt",
    "bilOtherChgAmt",
    "bilLeadDays",
    "secdAccr",
    "ver1",
    "crtBilDOM",
    "ver2",
    "unitPostSeq",
    "nsfFeeAmt",
    "prePmtPenYTD",
    "prePmtPenPYTD",
    "prePmtPenLTD",
    "lastPmtAmt",
    "lnUnitFeeArray",
    "chgYrFeeCode",
    "ver3",
    "any"
})
public class LnUnitPmtInfoCType {

    @XmlElement(name = "OthChgAmt")
    protected OthChgAmtType othChgAmt;
    @XmlElement(name = "UnpaidChgs")
    protected UnpaidChgsType unpaidChgs;
    @XmlElement(name = "BilPrincAmt")
    protected BilPrincAmtType bilPrincAmt;
    @XmlElement(name = "BilIntAmt")
    protected BilIntAmtType bilIntAmt;
    @XmlElement(name = "BilLateChgAmt")
    protected BilLateChgAmtType bilLateChgAmt;
    @XmlElement(name = "BilOtherChgAmt")
    protected BilOtherChgAmtType bilOtherChgAmt;
    @XmlElement(name = "BilLeadDays")
    protected BilLeadDaysType bilLeadDays;
    @XmlElement(name = "SecdAccr")
    protected SecdAccrType secdAccr;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CrtBilDOM")
    protected CrtBilDOMType crtBilDOM;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "UnitPostSeq")
    protected UnitPostSeqType unitPostSeq;
    @XmlElement(name = "NSFFeeAmt")
    protected NSFFeeAmtType nsfFeeAmt;
    @XmlElement(name = "PrePmtPenYTD")
    protected PrePmtPenYTDType prePmtPenYTD;
    @XmlElement(name = "PrePmtPenPYTD")
    protected PrePmtPenPYTDType prePmtPenPYTD;
    @XmlElement(name = "PrePmtPenLTD")
    protected PrePmtPenLTDType prePmtPenLTD;
    @XmlElement(name = "LastPmtAmt")
    protected LastPmtAmtType lastPmtAmt;
    @XmlElement(name = "LnUnitFeeArray")
    protected LnFeeArrayAType lnUnitFeeArray;
    @XmlElement(name = "ChgYrFeeCode")
    protected ChgYrFeeCodeType chgYrFeeCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the unpaidChgs property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidChgsType }
     *     
     */
    public UnpaidChgsType getUnpaidChgs() {
        return unpaidChgs;
    }

    /**
     * Sets the value of the unpaidChgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidChgsType }
     *     
     */
    public void setUnpaidChgs(UnpaidChgsType value) {
        this.unpaidChgs = value;
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
     * Gets the value of the bilLateChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilLateChgAmtType }
     *     
     */
    public BilLateChgAmtType getBilLateChgAmt() {
        return bilLateChgAmt;
    }

    /**
     * Sets the value of the bilLateChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilLateChgAmtType }
     *     
     */
    public void setBilLateChgAmt(BilLateChgAmtType value) {
        this.bilLateChgAmt = value;
    }

    /**
     * Gets the value of the bilOtherChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilOtherChgAmtType }
     *     
     */
    public BilOtherChgAmtType getBilOtherChgAmt() {
        return bilOtherChgAmt;
    }

    /**
     * Sets the value of the bilOtherChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilOtherChgAmtType }
     *     
     */
    public void setBilOtherChgAmt(BilOtherChgAmtType value) {
        this.bilOtherChgAmt = value;
    }

    /**
     * Gets the value of the bilLeadDays property.
     * 
     * @return
     *     possible object is
     *     {@link BilLeadDaysType }
     *     
     */
    public BilLeadDaysType getBilLeadDays() {
        return bilLeadDays;
    }

    /**
     * Sets the value of the bilLeadDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilLeadDaysType }
     *     
     */
    public void setBilLeadDays(BilLeadDaysType value) {
        this.bilLeadDays = value;
    }

    /**
     * Gets the value of the secdAccr property.
     * 
     * @return
     *     possible object is
     *     {@link SecdAccrType }
     *     
     */
    public SecdAccrType getSecdAccr() {
        return secdAccr;
    }

    /**
     * Sets the value of the secdAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdAccrType }
     *     
     */
    public void setSecdAccr(SecdAccrType value) {
        this.secdAccr = value;
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
     * Gets the value of the crtBilDOM property.
     * 
     * @return
     *     possible object is
     *     {@link CrtBilDOMType }
     *     
     */
    public CrtBilDOMType getCrtBilDOM() {
        return crtBilDOM;
    }

    /**
     * Sets the value of the crtBilDOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrtBilDOMType }
     *     
     */
    public void setCrtBilDOM(CrtBilDOMType value) {
        this.crtBilDOM = value;
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
     * Gets the value of the unitPostSeq property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPostSeqType }
     *     
     */
    public UnitPostSeqType getUnitPostSeq() {
        return unitPostSeq;
    }

    /**
     * Sets the value of the unitPostSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPostSeqType }
     *     
     */
    public void setUnitPostSeq(UnitPostSeqType value) {
        this.unitPostSeq = value;
    }

    /**
     * Gets the value of the nsfFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NSFFeeAmtType }
     *     
     */
    public NSFFeeAmtType getNSFFeeAmt() {
        return nsfFeeAmt;
    }

    /**
     * Sets the value of the nsfFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFFeeAmtType }
     *     
     */
    public void setNSFFeeAmt(NSFFeeAmtType value) {
        this.nsfFeeAmt = value;
    }

    /**
     * Gets the value of the prePmtPenYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenYTDType }
     *     
     */
    public PrePmtPenYTDType getPrePmtPenYTD() {
        return prePmtPenYTD;
    }

    /**
     * Sets the value of the prePmtPenYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenYTDType }
     *     
     */
    public void setPrePmtPenYTD(PrePmtPenYTDType value) {
        this.prePmtPenYTD = value;
    }

    /**
     * Gets the value of the prePmtPenPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenPYTDType }
     *     
     */
    public PrePmtPenPYTDType getPrePmtPenPYTD() {
        return prePmtPenPYTD;
    }

    /**
     * Sets the value of the prePmtPenPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenPYTDType }
     *     
     */
    public void setPrePmtPenPYTD(PrePmtPenPYTDType value) {
        this.prePmtPenPYTD = value;
    }

    /**
     * Gets the value of the prePmtPenLTD property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenLTDType }
     *     
     */
    public PrePmtPenLTDType getPrePmtPenLTD() {
        return prePmtPenLTD;
    }

    /**
     * Sets the value of the prePmtPenLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenLTDType }
     *     
     */
    public void setPrePmtPenLTD(PrePmtPenLTDType value) {
        this.prePmtPenLTD = value;
    }

    /**
     * Gets the value of the lastPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtAmtType }
     *     
     */
    public LastPmtAmtType getLastPmtAmt() {
        return lastPmtAmt;
    }

    /**
     * Sets the value of the lastPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtAmtType }
     *     
     */
    public void setLastPmtAmt(LastPmtAmtType value) {
        this.lastPmtAmt = value;
    }

    /**
     * Gets the value of the lnUnitFeeArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeArrayAType }
     *     
     */
    public LnFeeArrayAType getLnUnitFeeArray() {
        return lnUnitFeeArray;
    }

    /**
     * Sets the value of the lnUnitFeeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeArrayAType }
     *     
     */
    public void setLnUnitFeeArray(LnFeeArrayAType value) {
        this.lnUnitFeeArray = value;
    }

    /**
     * Gets the value of the chgYrFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChgYrFeeCodeType }
     *     
     */
    public ChgYrFeeCodeType getChgYrFeeCode() {
        return chgYrFeeCode;
    }

    /**
     * Sets the value of the chgYrFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgYrFeeCodeType }
     *     
     */
    public void setChgYrFeeCode(ChgYrFeeCodeType value) {
        this.chgYrFeeCode = value;
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
