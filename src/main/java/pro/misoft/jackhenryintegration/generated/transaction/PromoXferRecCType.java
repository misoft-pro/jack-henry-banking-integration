
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
 * <p>Java class for PromoXferRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromoXferRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferRecText" type="{http://jackhenry.com/jxchange/TPG/2008}XferRecText_Type" minOccurs="0"/&gt;
 *         &lt;element name="PromoCode" type="{http://jackhenry.com/jxchange/TPG/2008}PromoCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrBr" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdFrom_CType" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdTo_CType" minOccurs="0"/&gt;
 *         &lt;element name="XferFirstDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFirstDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferNextDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferNextDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferLastDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferLastDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferLastMaintDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferEnterDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferEnterDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferAmtLTD" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferAmtLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFreq" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay1" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay1_Type" minOccurs="0"/&gt;
 *         &lt;element name="SemiDay2" type="{http://jackhenry.com/jxchange/TPG/2008}SemiDay2_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferDayOfMonth" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferDayOfMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedPrinc" type="{http://jackhenry.com/jxchange/TPG/2008}RedPrinc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ForcePostType" type="{http://jackhenry.com/jxchange/TPG/2008}ForcePostType_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferSuspStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferSuspStartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferSuspEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferSuspEndDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PromoXferRec_CType", propOrder = {
    "xferRecText",
    "promoCode",
    "drBr",
    "drAcctId",
    "glCostCtr",
    "glProdCode",
    "crAcctId",
    "xferFirstDt",
    "xferNextDt",
    "xferLastDt",
    "xferExpDt",
    "xferLastMaintDt",
    "xferEnterDt",
    "amt",
    "xferAmtLTD",
    "xferFreq",
    "xferFreqUnits",
    "semiDay1",
    "semiDay2",
    "xferDayOfMonth",
    "redPrinc",
    "forcePostType",
    "xferSuspStartDt",
    "xferSuspEndDt",
    "ver1",
    "any"
})
public class PromoXferRecCType {

    @XmlElement(name = "XferRecText")
    protected XferRecTextType xferRecText;
    @XmlElement(name = "PromoCode")
    protected PromoCodeType promoCode;
    @XmlElement(name = "DrBr")
    protected BrCodeType drBr;
    @XmlElement(name = "DrAcctId")
    protected AcctIdFromCType drAcctId;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "CrAcctId")
    protected AcctIdToCType crAcctId;
    @XmlElement(name = "XferFirstDt")
    protected FutXferFirstDtType xferFirstDt;
    @XmlElement(name = "XferNextDt")
    protected FutXferNextDtType xferNextDt;
    @XmlElement(name = "XferLastDt")
    protected FutXferLastDtType xferLastDt;
    @XmlElement(name = "XferExpDt")
    protected FutXferExpDtType xferExpDt;
    @XmlElement(name = "XferLastMaintDt")
    protected LastMainDtType xferLastMaintDt;
    @XmlElement(name = "XferEnterDt")
    protected FutXferEnterDtType xferEnterDt;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "XferAmtLTD")
    protected FutXferAmtLTDType xferAmtLTD;
    @XmlElement(name = "XferFreq")
    protected FutXferFreqType xferFreq;
    @XmlElement(name = "XferFreqUnits")
    protected FutXferFreqUnitsType xferFreqUnits;
    @XmlElement(name = "SemiDay1")
    protected SemiDay1Type semiDay1;
    @XmlElement(name = "SemiDay2")
    protected SemiDay2Type semiDay2;
    @XmlElement(name = "XferDayOfMonth")
    protected FutXferDayOfMonthType xferDayOfMonth;
    @XmlElement(name = "RedPrinc")
    protected RedPrincType redPrinc;
    @XmlElement(name = "ForcePostType")
    protected ForcePostTypeType forcePostType;
    @XmlElement(name = "XferSuspStartDt")
    protected FutXferSuspStartDtType xferSuspStartDt;
    @XmlElement(name = "XferSuspEndDt")
    protected FutXferSuspEndDtType xferSuspEndDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xferRecText property.
     * 
     * @return
     *     possible object is
     *     {@link XferRecTextType }
     *     
     */
    public XferRecTextType getXferRecText() {
        return xferRecText;
    }

    /**
     * Sets the value of the xferRecText property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferRecTextType }
     *     
     */
    public void setXferRecText(XferRecTextType value) {
        this.xferRecText = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link PromoCodeType }
     *     
     */
    public PromoCodeType getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoCodeType }
     *     
     */
    public void setPromoCode(PromoCodeType value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the drBr property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getDrBr() {
        return drBr;
    }

    /**
     * Sets the value of the drBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setDrBr(BrCodeType value) {
        this.drBr = value;
    }

    /**
     * Gets the value of the drAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdFromCType }
     *     
     */
    public AcctIdFromCType getDrAcctId() {
        return drAcctId;
    }

    /**
     * Sets the value of the drAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdFromCType }
     *     
     */
    public void setDrAcctId(AcctIdFromCType value) {
        this.drAcctId = value;
    }

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setGLCostCtr(GLCostCtrType value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdCodeType }
     *     
     */
    public GLProdCodeType getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdCodeType }
     *     
     */
    public void setGLProdCode(GLProdCodeType value) {
        this.glProdCode = value;
    }

    /**
     * Gets the value of the crAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdToCType }
     *     
     */
    public AcctIdToCType getCrAcctId() {
        return crAcctId;
    }

    /**
     * Sets the value of the crAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdToCType }
     *     
     */
    public void setCrAcctId(AcctIdToCType value) {
        this.crAcctId = value;
    }

    /**
     * Gets the value of the xferFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFirstDtType }
     *     
     */
    public FutXferFirstDtType getXferFirstDt() {
        return xferFirstDt;
    }

    /**
     * Sets the value of the xferFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFirstDtType }
     *     
     */
    public void setXferFirstDt(FutXferFirstDtType value) {
        this.xferFirstDt = value;
    }

    /**
     * Gets the value of the xferNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferNextDtType }
     *     
     */
    public FutXferNextDtType getXferNextDt() {
        return xferNextDt;
    }

    /**
     * Sets the value of the xferNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferNextDtType }
     *     
     */
    public void setXferNextDt(FutXferNextDtType value) {
        this.xferNextDt = value;
    }

    /**
     * Gets the value of the xferLastDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferLastDtType }
     *     
     */
    public FutXferLastDtType getXferLastDt() {
        return xferLastDt;
    }

    /**
     * Sets the value of the xferLastDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferLastDtType }
     *     
     */
    public void setXferLastDt(FutXferLastDtType value) {
        this.xferLastDt = value;
    }

    /**
     * Gets the value of the xferExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferExpDtType }
     *     
     */
    public FutXferExpDtType getXferExpDt() {
        return xferExpDt;
    }

    /**
     * Sets the value of the xferExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferExpDtType }
     *     
     */
    public void setXferExpDt(FutXferExpDtType value) {
        this.xferExpDt = value;
    }

    /**
     * Gets the value of the xferLastMaintDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastMainDtType }
     *     
     */
    public LastMainDtType getXferLastMaintDt() {
        return xferLastMaintDt;
    }

    /**
     * Sets the value of the xferLastMaintDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMainDtType }
     *     
     */
    public void setXferLastMaintDt(LastMainDtType value) {
        this.xferLastMaintDt = value;
    }

    /**
     * Gets the value of the xferEnterDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferEnterDtType }
     *     
     */
    public FutXferEnterDtType getXferEnterDt() {
        return xferEnterDt;
    }

    /**
     * Sets the value of the xferEnterDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferEnterDtType }
     *     
     */
    public void setXferEnterDt(FutXferEnterDtType value) {
        this.xferEnterDt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the xferAmtLTD property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferAmtLTDType }
     *     
     */
    public FutXferAmtLTDType getXferAmtLTD() {
        return xferAmtLTD;
    }

    /**
     * Sets the value of the xferAmtLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferAmtLTDType }
     *     
     */
    public void setXferAmtLTD(FutXferAmtLTDType value) {
        this.xferAmtLTD = value;
    }

    /**
     * Gets the value of the xferFreq property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqType }
     *     
     */
    public FutXferFreqType getXferFreq() {
        return xferFreq;
    }

    /**
     * Sets the value of the xferFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqType }
     *     
     */
    public void setXferFreq(FutXferFreqType value) {
        this.xferFreq = value;
    }

    /**
     * Gets the value of the xferFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public FutXferFreqUnitsType getXferFreqUnits() {
        return xferFreqUnits;
    }

    /**
     * Sets the value of the xferFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public void setXferFreqUnits(FutXferFreqUnitsType value) {
        this.xferFreqUnits = value;
    }

    /**
     * Gets the value of the semiDay1 property.
     * 
     * @return
     *     possible object is
     *     {@link SemiDay1Type }
     *     
     */
    public SemiDay1Type getSemiDay1() {
        return semiDay1;
    }

    /**
     * Sets the value of the semiDay1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemiDay1Type }
     *     
     */
    public void setSemiDay1(SemiDay1Type value) {
        this.semiDay1 = value;
    }

    /**
     * Gets the value of the semiDay2 property.
     * 
     * @return
     *     possible object is
     *     {@link SemiDay2Type }
     *     
     */
    public SemiDay2Type getSemiDay2() {
        return semiDay2;
    }

    /**
     * Sets the value of the semiDay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemiDay2Type }
     *     
     */
    public void setSemiDay2(SemiDay2Type value) {
        this.semiDay2 = value;
    }

    /**
     * Gets the value of the xferDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferDayOfMonthType }
     *     
     */
    public FutXferDayOfMonthType getXferDayOfMonth() {
        return xferDayOfMonth;
    }

    /**
     * Sets the value of the xferDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferDayOfMonthType }
     *     
     */
    public void setXferDayOfMonth(FutXferDayOfMonthType value) {
        this.xferDayOfMonth = value;
    }

    /**
     * Gets the value of the redPrinc property.
     * 
     * @return
     *     possible object is
     *     {@link RedPrincType }
     *     
     */
    public RedPrincType getRedPrinc() {
        return redPrinc;
    }

    /**
     * Sets the value of the redPrinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedPrincType }
     *     
     */
    public void setRedPrinc(RedPrincType value) {
        this.redPrinc = value;
    }

    /**
     * Gets the value of the forcePostType property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePostTypeType }
     *     
     */
    public ForcePostTypeType getForcePostType() {
        return forcePostType;
    }

    /**
     * Sets the value of the forcePostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePostTypeType }
     *     
     */
    public void setForcePostType(ForcePostTypeType value) {
        this.forcePostType = value;
    }

    /**
     * Gets the value of the xferSuspStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferSuspStartDtType }
     *     
     */
    public FutXferSuspStartDtType getXferSuspStartDt() {
        return xferSuspStartDt;
    }

    /**
     * Sets the value of the xferSuspStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferSuspStartDtType }
     *     
     */
    public void setXferSuspStartDt(FutXferSuspStartDtType value) {
        this.xferSuspStartDt = value;
    }

    /**
     * Gets the value of the xferSuspEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferSuspEndDtType }
     *     
     */
    public FutXferSuspEndDtType getXferSuspEndDt() {
        return xferSuspEndDt;
    }

    /**
     * Sets the value of the xferSuspEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferSuspEndDtType }
     *     
     */
    public void setXferSuspEndDt(FutXferSuspEndDtType value) {
        this.xferSuspEndDt = value;
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
