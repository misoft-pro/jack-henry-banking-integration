
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
 * <p>Java class for TrnAuthBalDetRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnAuthBalDetRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnAuthBalTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAuthBalTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColBal" type="{http://jackhenry.com/jxchange/TPG/2008}ColBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="YestBal" type="{http://jackhenry.com/jxchange/TPG/2008}YestBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="FltAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FltAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HldAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODProtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODProtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NetMemoPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NetMemoPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnceProtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BnceProtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODLmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepAvlDrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAvlDrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepAvlCrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAvlCrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvestAcctDrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InvestAcctDrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvestAcctCrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InvestAcctCrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "TrnAuthBalDetRec_CType", propOrder = {
    "trnAuthBalTimeDt",
    "avlBal",
    "curBal",
    "colBal",
    "yestBal",
    "fltAmt",
    "hldAmt",
    "odProtAmt",
    "netMemoPostAmt",
    "bnceProtAmt",
    "odLmt",
    "accrInt",
    "sweepAvlDrAmt",
    "sweepAvlCrAmt",
    "investAcctDrAmt",
    "investAcctCrAmt",
    "custom",
    "ver1",
    "any"
})
public class TrnAuthBalDetRecCType {

    @XmlElement(name = "TrnAuthBalTimeDt")
    protected TrnAuthBalTimeDtType trnAuthBalTimeDt;
    @XmlElement(name = "AvlBal")
    protected AvlBalType avlBal;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "ColBal")
    protected ColBalType colBal;
    @XmlElement(name = "YestBal")
    protected YestBalType yestBal;
    @XmlElement(name = "FltAmt")
    protected FltAmtType fltAmt;
    @XmlElement(name = "HldAmt")
    protected HldAmtType hldAmt;
    @XmlElement(name = "ODProtAmt")
    protected ODProtAmtType odProtAmt;
    @XmlElement(name = "NetMemoPostAmt")
    protected NetMemoPostAmtType netMemoPostAmt;
    @XmlElement(name = "BnceProtAmt")
    protected BnceProtAmtType bnceProtAmt;
    @XmlElement(name = "ODLmt")
    protected ODLmtType odLmt;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "SweepAvlDrAmt")
    protected SweepAvlDrAmtType sweepAvlDrAmt;
    @XmlElement(name = "SweepAvlCrAmt")
    protected SweepAvlCrAmtType sweepAvlCrAmt;
    @XmlElement(name = "InvestAcctDrAmt")
    protected InvestAcctDrAmtType investAcctDrAmt;
    @XmlElement(name = "InvestAcctCrAmt")
    protected InvestAcctCrAmtType investAcctCrAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trnAuthBalTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAuthBalTimeDtType }
     *     
     */
    public TrnAuthBalTimeDtType getTrnAuthBalTimeDt() {
        return trnAuthBalTimeDt;
    }

    /**
     * Sets the value of the trnAuthBalTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAuthBalTimeDtType }
     *     
     */
    public void setTrnAuthBalTimeDt(TrnAuthBalTimeDtType value) {
        this.trnAuthBalTimeDt = value;
    }

    /**
     * Gets the value of the avlBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvlBalType }
     *     
     */
    public AvlBalType getAvlBal() {
        return avlBal;
    }

    /**
     * Sets the value of the avlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlBalType }
     *     
     */
    public void setAvlBal(AvlBalType value) {
        this.avlBal = value;
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
     * Gets the value of the colBal property.
     * 
     * @return
     *     possible object is
     *     {@link ColBalType }
     *     
     */
    public ColBalType getColBal() {
        return colBal;
    }

    /**
     * Sets the value of the colBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColBalType }
     *     
     */
    public void setColBal(ColBalType value) {
        this.colBal = value;
    }

    /**
     * Gets the value of the yestBal property.
     * 
     * @return
     *     possible object is
     *     {@link YestBalType }
     *     
     */
    public YestBalType getYestBal() {
        return yestBal;
    }

    /**
     * Sets the value of the yestBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link YestBalType }
     *     
     */
    public void setYestBal(YestBalType value) {
        this.yestBal = value;
    }

    /**
     * Gets the value of the fltAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FltAmtType }
     *     
     */
    public FltAmtType getFltAmt() {
        return fltAmt;
    }

    /**
     * Sets the value of the fltAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltAmtType }
     *     
     */
    public void setFltAmt(FltAmtType value) {
        this.fltAmt = value;
    }

    /**
     * Gets the value of the hldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HldAmtType }
     *     
     */
    public HldAmtType getHldAmt() {
        return hldAmt;
    }

    /**
     * Sets the value of the hldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldAmtType }
     *     
     */
    public void setHldAmt(HldAmtType value) {
        this.hldAmt = value;
    }

    /**
     * Gets the value of the odProtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ODProtAmtType }
     *     
     */
    public ODProtAmtType getODProtAmt() {
        return odProtAmt;
    }

    /**
     * Sets the value of the odProtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODProtAmtType }
     *     
     */
    public void setODProtAmt(ODProtAmtType value) {
        this.odProtAmt = value;
    }

    /**
     * Gets the value of the netMemoPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetMemoPostAmtType }
     *     
     */
    public NetMemoPostAmtType getNetMemoPostAmt() {
        return netMemoPostAmt;
    }

    /**
     * Sets the value of the netMemoPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetMemoPostAmtType }
     *     
     */
    public void setNetMemoPostAmt(NetMemoPostAmtType value) {
        this.netMemoPostAmt = value;
    }

    /**
     * Gets the value of the bnceProtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BnceProtAmtType }
     *     
     */
    public BnceProtAmtType getBnceProtAmt() {
        return bnceProtAmt;
    }

    /**
     * Sets the value of the bnceProtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BnceProtAmtType }
     *     
     */
    public void setBnceProtAmt(BnceProtAmtType value) {
        this.bnceProtAmt = value;
    }

    /**
     * Gets the value of the odLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ODLmtType }
     *     
     */
    public ODLmtType getODLmt() {
        return odLmt;
    }

    /**
     * Sets the value of the odLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODLmtType }
     *     
     */
    public void setODLmt(ODLmtType value) {
        this.odLmt = value;
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
     * Gets the value of the sweepAvlDrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SweepAvlDrAmtType }
     *     
     */
    public SweepAvlDrAmtType getSweepAvlDrAmt() {
        return sweepAvlDrAmt;
    }

    /**
     * Sets the value of the sweepAvlDrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SweepAvlDrAmtType }
     *     
     */
    public void setSweepAvlDrAmt(SweepAvlDrAmtType value) {
        this.sweepAvlDrAmt = value;
    }

    /**
     * Gets the value of the sweepAvlCrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SweepAvlCrAmtType }
     *     
     */
    public SweepAvlCrAmtType getSweepAvlCrAmt() {
        return sweepAvlCrAmt;
    }

    /**
     * Sets the value of the sweepAvlCrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SweepAvlCrAmtType }
     *     
     */
    public void setSweepAvlCrAmt(SweepAvlCrAmtType value) {
        this.sweepAvlCrAmt = value;
    }

    /**
     * Gets the value of the investAcctDrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InvestAcctDrAmtType }
     *     
     */
    public InvestAcctDrAmtType getInvestAcctDrAmt() {
        return investAcctDrAmt;
    }

    /**
     * Sets the value of the investAcctDrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestAcctDrAmtType }
     *     
     */
    public void setInvestAcctDrAmt(InvestAcctDrAmtType value) {
        this.investAcctDrAmt = value;
    }

    /**
     * Gets the value of the investAcctCrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InvestAcctCrAmtType }
     *     
     */
    public InvestAcctCrAmtType getInvestAcctCrAmt() {
        return investAcctCrAmt;
    }

    /**
     * Sets the value of the investAcctCrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestAcctCrAmtType }
     *     
     */
    public void setInvestAcctCrAmt(InvestAcctCrAmtType value) {
        this.investAcctCrAmt = value;
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
