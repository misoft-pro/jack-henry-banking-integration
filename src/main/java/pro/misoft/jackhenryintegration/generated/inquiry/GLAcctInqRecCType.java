
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
 * <p>Java class for GLAcctInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLAcctInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLAcctInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}GLAcctInfoRec_CType"/&gt;
 *         &lt;element name="AcctTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTypeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt1Desc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt2Desc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt3Desc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRpt4Desc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="YestBal" type="{http://jackhenry.com/jxchange/TPG/2008}YestBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlyBalChngAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DlyBalChngAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BegYrBal" type="{http://jackhenry.com/jxchange/TPG/2008}BegYrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BegLastYrBal" type="{http://jackhenry.com/jxchange/TPG/2008}BegLastYrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BegPrevYrBal" type="{http://jackhenry.com/jxchange/TPG/2008}BegPrevYrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvgYTDBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgYTDBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BalYTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BalYTDAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "GLAcctInqRec_CType", propOrder = {
    "glAcctInfoRec",
    "acctTypeDesc",
    "brDesc",
    "offDesc",
    "glProdDesc",
    "callRpt1Desc",
    "callRpt2Desc",
    "callRpt3Desc",
    "callRpt4Desc",
    "acctStatDesc",
    "curBal",
    "yestBal",
    "dlyBalChngAmt",
    "begYrBal",
    "begLastYrBal",
    "begPrevYrBal",
    "avgYTDBal",
    "balYTDAmt",
    "ver1",
    "any"
})
public class GLAcctInqRecCType {

    @XmlElement(name = "GLAcctInfoRec", required = true)
    protected GLAcctInfoRecCType glAcctInfoRec;
    @XmlElement(name = "AcctTypeDesc")
    protected AcctTypeDescType acctTypeDesc;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "GLProdDesc")
    protected GLProdDescType glProdDesc;
    @XmlElement(name = "CallRpt1Desc")
    protected CallRptDescType callRpt1Desc;
    @XmlElement(name = "CallRpt2Desc")
    protected CallRptDescType callRpt2Desc;
    @XmlElement(name = "CallRpt3Desc")
    protected CallRptDescType callRpt3Desc;
    @XmlElement(name = "CallRpt4Desc")
    protected CallRptDescType callRpt4Desc;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "YestBal")
    protected YestBalType yestBal;
    @XmlElement(name = "DlyBalChngAmt")
    protected DlyBalChngAmtType dlyBalChngAmt;
    @XmlElement(name = "BegYrBal")
    protected BegYrBalType begYrBal;
    @XmlElement(name = "BegLastYrBal")
    protected BegLastYrBalType begLastYrBal;
    @XmlElement(name = "BegPrevYrBal")
    protected BegPrevYrBalType begPrevYrBal;
    @XmlElement(name = "AvgYTDBal")
    protected AvgYTDBalType avgYTDBal;
    @XmlElement(name = "BalYTDAmt")
    protected BalYTDAmtType balYTDAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the glAcctInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link GLAcctInfoRecCType }
     *     
     */
    public GLAcctInfoRecCType getGLAcctInfoRec() {
        return glAcctInfoRec;
    }

    /**
     * Sets the value of the glAcctInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLAcctInfoRecCType }
     *     
     */
    public void setGLAcctInfoRec(GLAcctInfoRecCType value) {
        this.glAcctInfoRec = value;
    }

    /**
     * Gets the value of the acctTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeDescType }
     *     
     */
    public AcctTypeDescType getAcctTypeDesc() {
        return acctTypeDesc;
    }

    /**
     * Sets the value of the acctTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeDescType }
     *     
     */
    public void setAcctTypeDesc(AcctTypeDescType value) {
        this.acctTypeDesc = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the glProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdDescType }
     *     
     */
    public GLProdDescType getGLProdDesc() {
        return glProdDesc;
    }

    /**
     * Sets the value of the glProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdDescType }
     *     
     */
    public void setGLProdDesc(GLProdDescType value) {
        this.glProdDesc = value;
    }

    /**
     * Gets the value of the callRpt1Desc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getCallRpt1Desc() {
        return callRpt1Desc;
    }

    /**
     * Sets the value of the callRpt1Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setCallRpt1Desc(CallRptDescType value) {
        this.callRpt1Desc = value;
    }

    /**
     * Gets the value of the callRpt2Desc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getCallRpt2Desc() {
        return callRpt2Desc;
    }

    /**
     * Sets the value of the callRpt2Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setCallRpt2Desc(CallRptDescType value) {
        this.callRpt2Desc = value;
    }

    /**
     * Gets the value of the callRpt3Desc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getCallRpt3Desc() {
        return callRpt3Desc;
    }

    /**
     * Sets the value of the callRpt3Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setCallRpt3Desc(CallRptDescType value) {
        this.callRpt3Desc = value;
    }

    /**
     * Gets the value of the callRpt4Desc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getCallRpt4Desc() {
        return callRpt4Desc;
    }

    /**
     * Sets the value of the callRpt4Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setCallRpt4Desc(CallRptDescType value) {
        this.callRpt4Desc = value;
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
     * Gets the value of the dlyBalChngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DlyBalChngAmtType }
     *     
     */
    public DlyBalChngAmtType getDlyBalChngAmt() {
        return dlyBalChngAmt;
    }

    /**
     * Sets the value of the dlyBalChngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlyBalChngAmtType }
     *     
     */
    public void setDlyBalChngAmt(DlyBalChngAmtType value) {
        this.dlyBalChngAmt = value;
    }

    /**
     * Gets the value of the begYrBal property.
     * 
     * @return
     *     possible object is
     *     {@link BegYrBalType }
     *     
     */
    public BegYrBalType getBegYrBal() {
        return begYrBal;
    }

    /**
     * Sets the value of the begYrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BegYrBalType }
     *     
     */
    public void setBegYrBal(BegYrBalType value) {
        this.begYrBal = value;
    }

    /**
     * Gets the value of the begLastYrBal property.
     * 
     * @return
     *     possible object is
     *     {@link BegLastYrBalType }
     *     
     */
    public BegLastYrBalType getBegLastYrBal() {
        return begLastYrBal;
    }

    /**
     * Sets the value of the begLastYrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BegLastYrBalType }
     *     
     */
    public void setBegLastYrBal(BegLastYrBalType value) {
        this.begLastYrBal = value;
    }

    /**
     * Gets the value of the begPrevYrBal property.
     * 
     * @return
     *     possible object is
     *     {@link BegPrevYrBalType }
     *     
     */
    public BegPrevYrBalType getBegPrevYrBal() {
        return begPrevYrBal;
    }

    /**
     * Sets the value of the begPrevYrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BegPrevYrBalType }
     *     
     */
    public void setBegPrevYrBal(BegPrevYrBalType value) {
        this.begPrevYrBal = value;
    }

    /**
     * Gets the value of the avgYTDBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvgYTDBalType }
     *     
     */
    public AvgYTDBalType getAvgYTDBal() {
        return avgYTDBal;
    }

    /**
     * Sets the value of the avgYTDBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgYTDBalType }
     *     
     */
    public void setAvgYTDBal(AvgYTDBalType value) {
        this.avgYTDBal = value;
    }

    /**
     * Gets the value of the balYTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BalYTDAmtType }
     *     
     */
    public BalYTDAmtType getBalYTDAmt() {
        return balYTDAmt;
    }

    /**
     * Sets the value of the balYTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalYTDAmtType }
     *     
     */
    public void setBalYTDAmt(BalYTDAmtType value) {
        this.balYTDAmt = value;
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
