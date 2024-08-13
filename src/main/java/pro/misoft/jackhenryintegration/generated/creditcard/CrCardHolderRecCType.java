
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardHolderRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardHolderRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthUsrName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="AuthUsrCrCardCode" type="{http://jackhenry.com/jxchange/TPG/2008}AuthUsrCrCardCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AuthUsrCrCardDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AuthUsrCrCardDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardActCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardActCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardActDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardActDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardActDt" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasCrCardId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasCrCardStat" type="{http://jackhenry.com/jxchange/TPG/2008}AliasCrCardStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasCrCardStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AliasCrCardStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardType" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardIssuedNum" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardIssuedNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardImgCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardImgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReIssueCrCardCode" type="{http://jackhenry.com/jxchange/TPG/2008}ReIssueCrCardCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSuspPlanSuspStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}FraudPlanSuspDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSuspPlanSuspEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}FraudPlanSuspDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSuspPlanCode" type="{http://jackhenry.com/jxchange/TPG/2008}FraudPlanCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardHolderHistArray" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardHolderHistArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CrCardPrevExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardHolderRec_CType", propOrder = {
    "authUsrName",
    "authUsrCrCardCode",
    "authUsrCrCardDesc",
    "embosName",
    "crCardActCode",
    "crCardActDesc",
    "crCardActDt",
    "aliasCrCardId",
    "aliasCrCardStat",
    "aliasCrCardStatDesc",
    "crCardType",
    "crCardIssuedNum",
    "crCardImgCode",
    "crCardExpDt",
    "reIssueCrCardCode",
    "fraudSuspPlanSuspStartDt",
    "fraudSuspPlanSuspEndDt",
    "fraudSuspPlanCode",
    "crCardHolderHistArray",
    "custom",
    "ver1",
    "crCardPrevExpDt",
    "ver2",
    "any"
})
public class CrCardHolderRecCType {

    @XmlElement(name = "AuthUsrName")
    protected PersonNameCType authUsrName;
    @XmlElement(name = "AuthUsrCrCardCode")
    protected AuthUsrCrCardCodeType authUsrCrCardCode;
    @XmlElement(name = "AuthUsrCrCardDesc")
    protected AuthUsrCrCardDescType authUsrCrCardDesc;
    @XmlElement(name = "EmbosName")
    protected EmbosNameType embosName;
    @XmlElement(name = "CrCardActCode")
    protected CrCardActCodeType crCardActCode;
    @XmlElement(name = "CrCardActDesc")
    protected CrCardActDescType crCardActDesc;
    @XmlElement(name = "CrCardActDt")
    protected CrCardActDtType crCardActDt;
    @XmlElement(name = "AliasCrCardId")
    protected AcctIdType aliasCrCardId;
    @XmlElement(name = "AliasCrCardStat")
    protected AliasCrCardStatType aliasCrCardStat;
    @XmlElement(name = "AliasCrCardStatDesc")
    protected AliasCrCardStatDescType aliasCrCardStatDesc;
    @XmlElement(name = "CrCardType")
    protected CrCardTypeType crCardType;
    @XmlElement(name = "CrCardIssuedNum")
    protected CrCardIssuedNumType crCardIssuedNum;
    @XmlElement(name = "CrCardImgCode")
    protected CrCardImgCodeType crCardImgCode;
    @XmlElement(name = "CrCardExpDt")
    protected ExpDtType crCardExpDt;
    @XmlElement(name = "ReIssueCrCardCode")
    protected ReIssueCrCardCodeType reIssueCrCardCode;
    @XmlElement(name = "FraudSuspPlanSuspStartDt")
    protected FraudPlanSuspDtType fraudSuspPlanSuspStartDt;
    @XmlElement(name = "FraudSuspPlanSuspEndDt")
    protected FraudPlanSuspDtType fraudSuspPlanSuspEndDt;
    @XmlElement(name = "FraudSuspPlanCode")
    protected FraudPlanCodeType fraudSuspPlanCode;
    @XmlElement(name = "CrCardHolderHistArray")
    protected CrCardHolderHistArrayAType crCardHolderHistArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CrCardPrevExpDt")
    protected ExpDtType crCardPrevExpDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the authUsrName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getAuthUsrName() {
        return authUsrName;
    }

    /**
     * Sets the value of the authUsrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setAuthUsrName(PersonNameCType value) {
        this.authUsrName = value;
    }

    /**
     * Gets the value of the authUsrCrCardCode property.
     * 
     * @return
     *     possible object is
     *     {@link AuthUsrCrCardCodeType }
     *     
     */
    public AuthUsrCrCardCodeType getAuthUsrCrCardCode() {
        return authUsrCrCardCode;
    }

    /**
     * Sets the value of the authUsrCrCardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthUsrCrCardCodeType }
     *     
     */
    public void setAuthUsrCrCardCode(AuthUsrCrCardCodeType value) {
        this.authUsrCrCardCode = value;
    }

    /**
     * Gets the value of the authUsrCrCardDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AuthUsrCrCardDescType }
     *     
     */
    public AuthUsrCrCardDescType getAuthUsrCrCardDesc() {
        return authUsrCrCardDesc;
    }

    /**
     * Sets the value of the authUsrCrCardDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthUsrCrCardDescType }
     *     
     */
    public void setAuthUsrCrCardDesc(AuthUsrCrCardDescType value) {
        this.authUsrCrCardDesc = value;
    }

    /**
     * Gets the value of the embosName property.
     * 
     * @return
     *     possible object is
     *     {@link EmbosNameType }
     *     
     */
    public EmbosNameType getEmbosName() {
        return embosName;
    }

    /**
     * Sets the value of the embosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbosNameType }
     *     
     */
    public void setEmbosName(EmbosNameType value) {
        this.embosName = value;
    }

    /**
     * Gets the value of the crCardActCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardActCodeType }
     *     
     */
    public CrCardActCodeType getCrCardActCode() {
        return crCardActCode;
    }

    /**
     * Sets the value of the crCardActCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardActCodeType }
     *     
     */
    public void setCrCardActCode(CrCardActCodeType value) {
        this.crCardActCode = value;
    }

    /**
     * Gets the value of the crCardActDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardActDescType }
     *     
     */
    public CrCardActDescType getCrCardActDesc() {
        return crCardActDesc;
    }

    /**
     * Sets the value of the crCardActDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardActDescType }
     *     
     */
    public void setCrCardActDesc(CrCardActDescType value) {
        this.crCardActDesc = value;
    }

    /**
     * Gets the value of the crCardActDt property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardActDtType }
     *     
     */
    public CrCardActDtType getCrCardActDt() {
        return crCardActDt;
    }

    /**
     * Sets the value of the crCardActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardActDtType }
     *     
     */
    public void setCrCardActDt(CrCardActDtType value) {
        this.crCardActDt = value;
    }

    /**
     * Gets the value of the aliasCrCardId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAliasCrCardId() {
        return aliasCrCardId;
    }

    /**
     * Sets the value of the aliasCrCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAliasCrCardId(AcctIdType value) {
        this.aliasCrCardId = value;
    }

    /**
     * Gets the value of the aliasCrCardStat property.
     * 
     * @return
     *     possible object is
     *     {@link AliasCrCardStatType }
     *     
     */
    public AliasCrCardStatType getAliasCrCardStat() {
        return aliasCrCardStat;
    }

    /**
     * Sets the value of the aliasCrCardStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasCrCardStatType }
     *     
     */
    public void setAliasCrCardStat(AliasCrCardStatType value) {
        this.aliasCrCardStat = value;
    }

    /**
     * Gets the value of the aliasCrCardStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AliasCrCardStatDescType }
     *     
     */
    public AliasCrCardStatDescType getAliasCrCardStatDesc() {
        return aliasCrCardStatDesc;
    }

    /**
     * Sets the value of the aliasCrCardStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasCrCardStatDescType }
     *     
     */
    public void setAliasCrCardStatDesc(AliasCrCardStatDescType value) {
        this.aliasCrCardStatDesc = value;
    }

    /**
     * Gets the value of the crCardType property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardTypeType }
     *     
     */
    public CrCardTypeType getCrCardType() {
        return crCardType;
    }

    /**
     * Sets the value of the crCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardTypeType }
     *     
     */
    public void setCrCardType(CrCardTypeType value) {
        this.crCardType = value;
    }

    /**
     * Gets the value of the crCardIssuedNum property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardIssuedNumType }
     *     
     */
    public CrCardIssuedNumType getCrCardIssuedNum() {
        return crCardIssuedNum;
    }

    /**
     * Sets the value of the crCardIssuedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardIssuedNumType }
     *     
     */
    public void setCrCardIssuedNum(CrCardIssuedNumType value) {
        this.crCardIssuedNum = value;
    }

    /**
     * Gets the value of the crCardImgCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardImgCodeType }
     *     
     */
    public CrCardImgCodeType getCrCardImgCode() {
        return crCardImgCode;
    }

    /**
     * Sets the value of the crCardImgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardImgCodeType }
     *     
     */
    public void setCrCardImgCode(CrCardImgCodeType value) {
        this.crCardImgCode = value;
    }

    /**
     * Gets the value of the crCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getCrCardExpDt() {
        return crCardExpDt;
    }

    /**
     * Sets the value of the crCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setCrCardExpDt(ExpDtType value) {
        this.crCardExpDt = value;
    }

    /**
     * Gets the value of the reIssueCrCardCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReIssueCrCardCodeType }
     *     
     */
    public ReIssueCrCardCodeType getReIssueCrCardCode() {
        return reIssueCrCardCode;
    }

    /**
     * Sets the value of the reIssueCrCardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReIssueCrCardCodeType }
     *     
     */
    public void setReIssueCrCardCode(ReIssueCrCardCodeType value) {
        this.reIssueCrCardCode = value;
    }

    /**
     * Gets the value of the fraudSuspPlanSuspStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public FraudPlanSuspDtType getFraudSuspPlanSuspStartDt() {
        return fraudSuspPlanSuspStartDt;
    }

    /**
     * Sets the value of the fraudSuspPlanSuspStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public void setFraudSuspPlanSuspStartDt(FraudPlanSuspDtType value) {
        this.fraudSuspPlanSuspStartDt = value;
    }

    /**
     * Gets the value of the fraudSuspPlanSuspEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public FraudPlanSuspDtType getFraudSuspPlanSuspEndDt() {
        return fraudSuspPlanSuspEndDt;
    }

    /**
     * Sets the value of the fraudSuspPlanSuspEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public void setFraudSuspPlanSuspEndDt(FraudPlanSuspDtType value) {
        this.fraudSuspPlanSuspEndDt = value;
    }

    /**
     * Gets the value of the fraudSuspPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPlanCodeType }
     *     
     */
    public FraudPlanCodeType getFraudSuspPlanCode() {
        return fraudSuspPlanCode;
    }

    /**
     * Sets the value of the fraudSuspPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPlanCodeType }
     *     
     */
    public void setFraudSuspPlanCode(FraudPlanCodeType value) {
        this.fraudSuspPlanCode = value;
    }

    /**
     * Gets the value of the crCardHolderHistArray property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardHolderHistArrayAType }
     *     
     */
    public CrCardHolderHistArrayAType getCrCardHolderHistArray() {
        return crCardHolderHistArray;
    }

    /**
     * Sets the value of the crCardHolderHistArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardHolderHistArrayAType }
     *     
     */
    public void setCrCardHolderHistArray(CrCardHolderHistArrayAType value) {
        this.crCardHolderHistArray = value;
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
     * Gets the value of the crCardPrevExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getCrCardPrevExpDt() {
        return crCardPrevExpDt;
    }

    /**
     * Sets the value of the crCardPrevExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setCrCardPrevExpDt(ExpDtType value) {
        this.crCardPrevExpDt = value;
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
