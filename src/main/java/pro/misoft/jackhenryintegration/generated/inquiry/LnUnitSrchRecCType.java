
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
 * <p>Java class for LnUnitSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitRptMthd" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitRptMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitMaster" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitMaster_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomLnUnitSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="UnitPostSeq" type="{http://jackhenry.com/jxchange/TPG/2008}UnitPostSeq_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitSrchRec_CType", propOrder = {
    "lnUnitId",
    "lnUnitDesc",
    "curBal",
    "nxtPayDt",
    "intRate",
    "acctStat",
    "acctStatDesc",
    "lnUnitRptMthd",
    "lnUnitMaster",
    "customLnUnitSrchRec",
    "ver1",
    "unitPostSeq",
    "ver2",
    "any"
})
public class LnUnitSrchRecCType {

    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "LnUnitDesc")
    protected LnUnitDescType lnUnitDesc;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "NxtPayDt")
    protected NxtPayDtType nxtPayDt;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "LnUnitRptMthd")
    protected LnUnitRptMthdType lnUnitRptMthd;
    @XmlElement(name = "LnUnitMaster")
    protected LnUnitMasterType lnUnitMaster;
    @XmlElement(name = "CustomLnUnitSrchRec")
    protected CustomCType customLnUnitSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "UnitPostSeq")
    protected UnitPostSeqType unitPostSeq;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setLnUnitId(LnUnitIdType value) {
        this.lnUnitId = value;
    }

    /**
     * Gets the value of the lnUnitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitDescType }
     *     
     */
    public LnUnitDescType getLnUnitDesc() {
        return lnUnitDesc;
    }

    /**
     * Sets the value of the lnUnitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitDescType }
     *     
     */
    public void setLnUnitDesc(LnUnitDescType value) {
        this.lnUnitDesc = value;
    }

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
     * Gets the value of the nxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getNxtPayDt() {
        return nxtPayDt;
    }

    /**
     * Sets the value of the nxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setNxtPayDt(NxtPayDtType value) {
        this.nxtPayDt = value;
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
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setAcctStat(AcctStatType value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the acctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatDescType }
     *     
     */
    public AcctStatDescType getAcctStatDesc() {
        return acctStatDesc;
    }

    /**
     * Sets the value of the acctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatDescType }
     *     
     */
    public void setAcctStatDesc(AcctStatDescType value) {
        this.acctStatDesc = value;
    }

    /**
     * Gets the value of the lnUnitRptMthd property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitRptMthdType }
     *     
     */
    public LnUnitRptMthdType getLnUnitRptMthd() {
        return lnUnitRptMthd;
    }

    /**
     * Sets the value of the lnUnitRptMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitRptMthdType }
     *     
     */
    public void setLnUnitRptMthd(LnUnitRptMthdType value) {
        this.lnUnitRptMthd = value;
    }

    /**
     * Gets the value of the lnUnitMaster property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitMasterType }
     *     
     */
    public LnUnitMasterType getLnUnitMaster() {
        return lnUnitMaster;
    }

    /**
     * Sets the value of the lnUnitMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitMasterType }
     *     
     */
    public void setLnUnitMaster(LnUnitMasterType value) {
        this.lnUnitMaster = value;
    }

    /**
     * Gets the value of the customLnUnitSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomLnUnitSrchRec() {
        return customLnUnitSrchRec;
    }

    /**
     * Sets the value of the customLnUnitSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomLnUnitSrchRec(CustomCType value) {
        this.customLnUnitSrchRec = value;
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
