
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
 * <p>Java class for AcctBalInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctBalInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="YestBal" type="{http://jackhenry.com/jxchange/TPG/2008}YestBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="FltAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FltAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HldAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODProtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODProtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnceProtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BnceProtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODLmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MemoDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MemoDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MemoCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MemoCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PODDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PODDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PODCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PODCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TellerDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TellerDrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TellerCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TellerCrPostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepAvlDrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAvlDrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepAvlCrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAvlCrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvestAcctDrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InvestAcctDrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvestAcctCrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InvestAcctCrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomAcctBalInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RealTimeTrnDrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnDrPostAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="RealTimeTrnCrPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCrPostAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctBalInqRec_CType", propOrder = {
    "yestBal",
    "fltAmt",
    "hldAmt",
    "odProtAmt",
    "bnceProtAmt",
    "odLmt",
    "accrInt",
    "trnDrPostAmt",
    "trnCrPostAmt",
    "memoDrPostAmt",
    "memoCrPostAmt",
    "achDrPostAmt",
    "achCrPostAmt",
    "podDrPostAmt",
    "podCrPostAmt",
    "atmDrPostAmt",
    "atmCrPostAmt",
    "tellerDrPostAmt",
    "tellerCrPostAmt",
    "sweepAvlDrAmt",
    "sweepAvlCrAmt",
    "investAcctDrAmt",
    "investAcctCrAmt",
    "customAcctBalInqRec",
    "ver1",
    "realTimeTrnDrPostAmt",
    "realTimeTrnCrPostAmt",
    "ver2",
    "any"
})
public class AcctBalInqRecCType {

    @XmlElement(name = "YestBal")
    protected YestBalType yestBal;
    @XmlElement(name = "FltAmt")
    protected FltAmtType fltAmt;
    @XmlElement(name = "HldAmt")
    protected HldAmtType hldAmt;
    @XmlElement(name = "ODProtAmt")
    protected ODProtAmtType odProtAmt;
    @XmlElement(name = "BnceProtAmt")
    protected BnceProtAmtType bnceProtAmt;
    @XmlElement(name = "ODLmt")
    protected ODLmtType odLmt;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "TrnDrPostAmt")
    protected TrnDrPostAmtType trnDrPostAmt;
    @XmlElement(name = "TrnCrPostAmt")
    protected TrnCrPostAmtType trnCrPostAmt;
    @XmlElement(name = "MemoDrPostAmt")
    protected MemoDrPostAmtType memoDrPostAmt;
    @XmlElement(name = "MemoCrPostAmt")
    protected MemoCrPostAmtType memoCrPostAmt;
    @XmlElement(name = "ACHDrPostAmt")
    protected ACHDrPostAmtType achDrPostAmt;
    @XmlElement(name = "ACHCrPostAmt")
    protected ACHCrPostAmtType achCrPostAmt;
    @XmlElement(name = "PODDrPostAmt")
    protected PODDrPostAmtType podDrPostAmt;
    @XmlElement(name = "PODCrPostAmt")
    protected PODCrPostAmtType podCrPostAmt;
    @XmlElement(name = "ATMDrPostAmt")
    protected ATMDrPostAmtType atmDrPostAmt;
    @XmlElement(name = "ATMCrPostAmt")
    protected ATMCrPostAmtType atmCrPostAmt;
    @XmlElement(name = "TellerDrPostAmt")
    protected TellerDrPostAmtType tellerDrPostAmt;
    @XmlElement(name = "TellerCrPostAmt")
    protected TellerCrPostAmtType tellerCrPostAmt;
    @XmlElement(name = "SweepAvlDrAmt")
    protected SweepAvlDrAmtType sweepAvlDrAmt;
    @XmlElement(name = "SweepAvlCrAmt")
    protected SweepAvlCrAmtType sweepAvlCrAmt;
    @XmlElement(name = "InvestAcctDrAmt")
    protected InvestAcctDrAmtType investAcctDrAmt;
    @XmlElement(name = "InvestAcctCrAmt")
    protected InvestAcctCrAmtType investAcctCrAmt;
    @XmlElement(name = "CustomAcctBalInqRec")
    protected CustomCType customAcctBalInqRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RealTimeTrnDrPostAmt")
    protected TrnDrPostAmtType realTimeTrnDrPostAmt;
    @XmlElement(name = "RealTimeTrnCrPostAmt")
    protected TrnCrPostAmtType realTimeTrnCrPostAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the trnDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnDrPostAmtType }
     *     
     */
    public TrnDrPostAmtType getTrnDrPostAmt() {
        return trnDrPostAmt;
    }

    /**
     * Sets the value of the trnDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnDrPostAmtType }
     *     
     */
    public void setTrnDrPostAmt(TrnDrPostAmtType value) {
        this.trnDrPostAmt = value;
    }

    /**
     * Gets the value of the trnCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCrPostAmtType }
     *     
     */
    public TrnCrPostAmtType getTrnCrPostAmt() {
        return trnCrPostAmt;
    }

    /**
     * Sets the value of the trnCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCrPostAmtType }
     *     
     */
    public void setTrnCrPostAmt(TrnCrPostAmtType value) {
        this.trnCrPostAmt = value;
    }

    /**
     * Gets the value of the memoDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MemoDrPostAmtType }
     *     
     */
    public MemoDrPostAmtType getMemoDrPostAmt() {
        return memoDrPostAmt;
    }

    /**
     * Sets the value of the memoDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoDrPostAmtType }
     *     
     */
    public void setMemoDrPostAmt(MemoDrPostAmtType value) {
        this.memoDrPostAmt = value;
    }

    /**
     * Gets the value of the memoCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MemoCrPostAmtType }
     *     
     */
    public MemoCrPostAmtType getMemoCrPostAmt() {
        return memoCrPostAmt;
    }

    /**
     * Sets the value of the memoCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoCrPostAmtType }
     *     
     */
    public void setMemoCrPostAmt(MemoCrPostAmtType value) {
        this.memoCrPostAmt = value;
    }

    /**
     * Gets the value of the achDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrPostAmtType }
     *     
     */
    public ACHDrPostAmtType getACHDrPostAmt() {
        return achDrPostAmt;
    }

    /**
     * Sets the value of the achDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrPostAmtType }
     *     
     */
    public void setACHDrPostAmt(ACHDrPostAmtType value) {
        this.achDrPostAmt = value;
    }

    /**
     * Gets the value of the achCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCrPostAmtType }
     *     
     */
    public ACHCrPostAmtType getACHCrPostAmt() {
        return achCrPostAmt;
    }

    /**
     * Sets the value of the achCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCrPostAmtType }
     *     
     */
    public void setACHCrPostAmt(ACHCrPostAmtType value) {
        this.achCrPostAmt = value;
    }

    /**
     * Gets the value of the podDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PODDrPostAmtType }
     *     
     */
    public PODDrPostAmtType getPODDrPostAmt() {
        return podDrPostAmt;
    }

    /**
     * Sets the value of the podDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PODDrPostAmtType }
     *     
     */
    public void setPODDrPostAmt(PODDrPostAmtType value) {
        this.podDrPostAmt = value;
    }

    /**
     * Gets the value of the podCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PODCrPostAmtType }
     *     
     */
    public PODCrPostAmtType getPODCrPostAmt() {
        return podCrPostAmt;
    }

    /**
     * Sets the value of the podCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PODCrPostAmtType }
     *     
     */
    public void setPODCrPostAmt(PODCrPostAmtType value) {
        this.podCrPostAmt = value;
    }

    /**
     * Gets the value of the atmDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDrPostAmtType }
     *     
     */
    public ATMDrPostAmtType getATMDrPostAmt() {
        return atmDrPostAmt;
    }

    /**
     * Sets the value of the atmDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDrPostAmtType }
     *     
     */
    public void setATMDrPostAmt(ATMDrPostAmtType value) {
        this.atmDrPostAmt = value;
    }

    /**
     * Gets the value of the atmCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCrPostAmtType }
     *     
     */
    public ATMCrPostAmtType getATMCrPostAmt() {
        return atmCrPostAmt;
    }

    /**
     * Sets the value of the atmCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCrPostAmtType }
     *     
     */
    public void setATMCrPostAmt(ATMCrPostAmtType value) {
        this.atmCrPostAmt = value;
    }

    /**
     * Gets the value of the tellerDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TellerDrPostAmtType }
     *     
     */
    public TellerDrPostAmtType getTellerDrPostAmt() {
        return tellerDrPostAmt;
    }

    /**
     * Sets the value of the tellerDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TellerDrPostAmtType }
     *     
     */
    public void setTellerDrPostAmt(TellerDrPostAmtType value) {
        this.tellerDrPostAmt = value;
    }

    /**
     * Gets the value of the tellerCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TellerCrPostAmtType }
     *     
     */
    public TellerCrPostAmtType getTellerCrPostAmt() {
        return tellerCrPostAmt;
    }

    /**
     * Sets the value of the tellerCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TellerCrPostAmtType }
     *     
     */
    public void setTellerCrPostAmt(TellerCrPostAmtType value) {
        this.tellerCrPostAmt = value;
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
     * Gets the value of the customAcctBalInqRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomAcctBalInqRec() {
        return customAcctBalInqRec;
    }

    /**
     * Sets the value of the customAcctBalInqRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomAcctBalInqRec(CustomCType value) {
        this.customAcctBalInqRec = value;
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
     * Gets the value of the realTimeTrnDrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnDrPostAmtType }
     *     
     */
    public TrnDrPostAmtType getRealTimeTrnDrPostAmt() {
        return realTimeTrnDrPostAmt;
    }

    /**
     * Sets the value of the realTimeTrnDrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnDrPostAmtType }
     *     
     */
    public void setRealTimeTrnDrPostAmt(TrnDrPostAmtType value) {
        this.realTimeTrnDrPostAmt = value;
    }

    /**
     * Gets the value of the realTimeTrnCrPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCrPostAmtType }
     *     
     */
    public TrnCrPostAmtType getRealTimeTrnCrPostAmt() {
        return realTimeTrnCrPostAmt;
    }

    /**
     * Sets the value of the realTimeTrnCrPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCrPostAmtType }
     *     
     */
    public void setRealTimeTrnCrPostAmt(TrnCrPostAmtType value) {
        this.realTimeTrnCrPostAmt = value;
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
