
package pro.misoft.jackhenryintegration.generated.billpay;

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
 * <p>Java class for ElecMerPayeeInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecMerPayeeInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecMerPayeeId" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerPayeeURL" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerPayeeURL_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPayeeAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerAcctTypeInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAcctTypeInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerPayeeToSStat" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerPayeeToSStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerPayeeToS" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerPayeeToS_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerAcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerSuspExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerSuspExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerPendTerDt" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerPendTerDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerAutoPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAutoPmtAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPmtAmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPmtAmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPmtRuleAlgSymb" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPmtRuleAlgSymb_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPmtInstrType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPmtInstrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerAutoSuspType" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAutoSuspType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerPayeeCredInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerPayeeCredInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerAcctErrInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAcctErrInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AuthenQuesArray" type="{http://jackhenry.com/jxchange/TPG/2008}AuthenQuesArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ElecMerPayeeInfoRec_CType", propOrder = {
    "elecMerPayeeId",
    "elecMerPayeeURL",
    "elecBilPayeeName",
    "elecBilPayeeAcctId",
    "elecMerAcctTypeInfoArray",
    "elecMerPayeeToSStat",
    "elecMerPayeeToS",
    "elecMerAcctStat",
    "elecMerSuspExpDt",
    "elecMerPendTerDt",
    "elecMerAutoPmtAlw",
    "elecBilPmtAmtType",
    "elecBilPmtRuleAlgSymb",
    "elecBilPmtAmt",
    "elecBilPmtInstrType",
    "elecMerAutoSuspType",
    "elecMerPayeeCredInfoArray",
    "elecMerAcctErrInfoArray",
    "authenQuesArray",
    "custom",
    "ver1",
    "any"
})
public class ElecMerPayeeInfoRecCType {

    @XmlElement(name = "ElecMerPayeeId")
    protected PayeeIdType elecMerPayeeId;
    @XmlElement(name = "ElecMerPayeeURL")
    protected ElecMerPayeeURLType elecMerPayeeURL;
    @XmlElement(name = "ElecBilPayeeName")
    protected PayeeNameType elecBilPayeeName;
    @XmlElement(name = "ElecBilPayeeAcctId")
    protected AcctIdType elecBilPayeeAcctId;
    @XmlElement(name = "ElecMerAcctTypeInfoArray")
    protected ElecMerAcctTypeInfoArrayAType elecMerAcctTypeInfoArray;
    @XmlElement(name = "ElecMerPayeeToSStat")
    protected ElecMerPayeeToSStatType elecMerPayeeToSStat;
    @XmlElement(name = "ElecMerPayeeToS")
    protected ElecMerPayeeToSType elecMerPayeeToS;
    @XmlElement(name = "ElecMerAcctStat")
    protected ElecMerAcctStatType elecMerAcctStat;
    @XmlElement(name = "ElecMerSuspExpDt")
    protected ElecMerSuspExpDtType elecMerSuspExpDt;
    @XmlElement(name = "ElecMerPendTerDt")
    protected ElecMerPendTerDtType elecMerPendTerDt;
    @XmlElement(name = "ElecMerAutoPmtAlw")
    protected ElecMerAutoPmtAlwType elecMerAutoPmtAlw;
    @XmlElement(name = "ElecBilPmtAmtType")
    protected ElecBilPmtAmtTypeType elecBilPmtAmtType;
    @XmlElement(name = "ElecBilPmtRuleAlgSymb")
    protected ElecBilPmtRuleAlgSymbType elecBilPmtRuleAlgSymb;
    @XmlElement(name = "ElecBilPmtAmt")
    protected PmtAmtType elecBilPmtAmt;
    @XmlElement(name = "ElecBilPmtInstrType")
    protected ElecBilPmtInstrTypeType elecBilPmtInstrType;
    @XmlElement(name = "ElecMerAutoSuspType")
    protected ElecMerAutoSuspTypeType elecMerAutoSuspType;
    @XmlElement(name = "ElecMerPayeeCredInfoArray")
    protected ElecMerPayeeCredInfoArrayAType elecMerPayeeCredInfoArray;
    @XmlElement(name = "ElecMerAcctErrInfoArray")
    protected ElecMerAcctErrInfoArrayAType elecMerAcctErrInfoArray;
    @XmlElementRef(name = "AuthenQuesArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenQuesArrayAType> authenQuesArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elecMerPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeIdType }
     *     
     */
    public PayeeIdType getElecMerPayeeId() {
        return elecMerPayeeId;
    }

    /**
     * Sets the value of the elecMerPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeIdType }
     *     
     */
    public void setElecMerPayeeId(PayeeIdType value) {
        this.elecMerPayeeId = value;
    }

    /**
     * Gets the value of the elecMerPayeeURL property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerPayeeURLType }
     *     
     */
    public ElecMerPayeeURLType getElecMerPayeeURL() {
        return elecMerPayeeURL;
    }

    /**
     * Sets the value of the elecMerPayeeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerPayeeURLType }
     *     
     */
    public void setElecMerPayeeURL(ElecMerPayeeURLType value) {
        this.elecMerPayeeURL = value;
    }

    /**
     * Gets the value of the elecBilPayeeName property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeNameType }
     *     
     */
    public PayeeNameType getElecBilPayeeName() {
        return elecBilPayeeName;
    }

    /**
     * Sets the value of the elecBilPayeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeNameType }
     *     
     */
    public void setElecBilPayeeName(PayeeNameType value) {
        this.elecBilPayeeName = value;
    }

    /**
     * Gets the value of the elecBilPayeeAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getElecBilPayeeAcctId() {
        return elecBilPayeeAcctId;
    }

    /**
     * Sets the value of the elecBilPayeeAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setElecBilPayeeAcctId(AcctIdType value) {
        this.elecBilPayeeAcctId = value;
    }

    /**
     * Gets the value of the elecMerAcctTypeInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerAcctTypeInfoArrayAType }
     *     
     */
    public ElecMerAcctTypeInfoArrayAType getElecMerAcctTypeInfoArray() {
        return elecMerAcctTypeInfoArray;
    }

    /**
     * Sets the value of the elecMerAcctTypeInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerAcctTypeInfoArrayAType }
     *     
     */
    public void setElecMerAcctTypeInfoArray(ElecMerAcctTypeInfoArrayAType value) {
        this.elecMerAcctTypeInfoArray = value;
    }

    /**
     * Gets the value of the elecMerPayeeToSStat property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerPayeeToSStatType }
     *     
     */
    public ElecMerPayeeToSStatType getElecMerPayeeToSStat() {
        return elecMerPayeeToSStat;
    }

    /**
     * Sets the value of the elecMerPayeeToSStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerPayeeToSStatType }
     *     
     */
    public void setElecMerPayeeToSStat(ElecMerPayeeToSStatType value) {
        this.elecMerPayeeToSStat = value;
    }

    /**
     * Gets the value of the elecMerPayeeToS property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerPayeeToSType }
     *     
     */
    public ElecMerPayeeToSType getElecMerPayeeToS() {
        return elecMerPayeeToS;
    }

    /**
     * Sets the value of the elecMerPayeeToS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerPayeeToSType }
     *     
     */
    public void setElecMerPayeeToS(ElecMerPayeeToSType value) {
        this.elecMerPayeeToS = value;
    }

    /**
     * Gets the value of the elecMerAcctStat property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerAcctStatType }
     *     
     */
    public ElecMerAcctStatType getElecMerAcctStat() {
        return elecMerAcctStat;
    }

    /**
     * Sets the value of the elecMerAcctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerAcctStatType }
     *     
     */
    public void setElecMerAcctStat(ElecMerAcctStatType value) {
        this.elecMerAcctStat = value;
    }

    /**
     * Gets the value of the elecMerSuspExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerSuspExpDtType }
     *     
     */
    public ElecMerSuspExpDtType getElecMerSuspExpDt() {
        return elecMerSuspExpDt;
    }

    /**
     * Sets the value of the elecMerSuspExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerSuspExpDtType }
     *     
     */
    public void setElecMerSuspExpDt(ElecMerSuspExpDtType value) {
        this.elecMerSuspExpDt = value;
    }

    /**
     * Gets the value of the elecMerPendTerDt property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerPendTerDtType }
     *     
     */
    public ElecMerPendTerDtType getElecMerPendTerDt() {
        return elecMerPendTerDt;
    }

    /**
     * Sets the value of the elecMerPendTerDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerPendTerDtType }
     *     
     */
    public void setElecMerPendTerDt(ElecMerPendTerDtType value) {
        this.elecMerPendTerDt = value;
    }

    /**
     * Gets the value of the elecMerAutoPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerAutoPmtAlwType }
     *     
     */
    public ElecMerAutoPmtAlwType getElecMerAutoPmtAlw() {
        return elecMerAutoPmtAlw;
    }

    /**
     * Sets the value of the elecMerAutoPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerAutoPmtAlwType }
     *     
     */
    public void setElecMerAutoPmtAlw(ElecMerAutoPmtAlwType value) {
        this.elecMerAutoPmtAlw = value;
    }

    /**
     * Gets the value of the elecBilPmtAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPmtAmtTypeType }
     *     
     */
    public ElecBilPmtAmtTypeType getElecBilPmtAmtType() {
        return elecBilPmtAmtType;
    }

    /**
     * Sets the value of the elecBilPmtAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPmtAmtTypeType }
     *     
     */
    public void setElecBilPmtAmtType(ElecBilPmtAmtTypeType value) {
        this.elecBilPmtAmtType = value;
    }

    /**
     * Gets the value of the elecBilPmtRuleAlgSymb property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPmtRuleAlgSymbType }
     *     
     */
    public ElecBilPmtRuleAlgSymbType getElecBilPmtRuleAlgSymb() {
        return elecBilPmtRuleAlgSymb;
    }

    /**
     * Sets the value of the elecBilPmtRuleAlgSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPmtRuleAlgSymbType }
     *     
     */
    public void setElecBilPmtRuleAlgSymb(ElecBilPmtRuleAlgSymbType value) {
        this.elecBilPmtRuleAlgSymb = value;
    }

    /**
     * Gets the value of the elecBilPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtType }
     *     
     */
    public PmtAmtType getElecBilPmtAmt() {
        return elecBilPmtAmt;
    }

    /**
     * Sets the value of the elecBilPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtType }
     *     
     */
    public void setElecBilPmtAmt(PmtAmtType value) {
        this.elecBilPmtAmt = value;
    }

    /**
     * Gets the value of the elecBilPmtInstrType property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPmtInstrTypeType }
     *     
     */
    public ElecBilPmtInstrTypeType getElecBilPmtInstrType() {
        return elecBilPmtInstrType;
    }

    /**
     * Sets the value of the elecBilPmtInstrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPmtInstrTypeType }
     *     
     */
    public void setElecBilPmtInstrType(ElecBilPmtInstrTypeType value) {
        this.elecBilPmtInstrType = value;
    }

    /**
     * Gets the value of the elecMerAutoSuspType property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerAutoSuspTypeType }
     *     
     */
    public ElecMerAutoSuspTypeType getElecMerAutoSuspType() {
        return elecMerAutoSuspType;
    }

    /**
     * Sets the value of the elecMerAutoSuspType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerAutoSuspTypeType }
     *     
     */
    public void setElecMerAutoSuspType(ElecMerAutoSuspTypeType value) {
        this.elecMerAutoSuspType = value;
    }

    /**
     * Gets the value of the elecMerPayeeCredInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerPayeeCredInfoArrayAType }
     *     
     */
    public ElecMerPayeeCredInfoArrayAType getElecMerPayeeCredInfoArray() {
        return elecMerPayeeCredInfoArray;
    }

    /**
     * Sets the value of the elecMerPayeeCredInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerPayeeCredInfoArrayAType }
     *     
     */
    public void setElecMerPayeeCredInfoArray(ElecMerPayeeCredInfoArrayAType value) {
        this.elecMerPayeeCredInfoArray = value;
    }

    /**
     * Gets the value of the elecMerAcctErrInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ElecMerAcctErrInfoArrayAType }
     *     
     */
    public ElecMerAcctErrInfoArrayAType getElecMerAcctErrInfoArray() {
        return elecMerAcctErrInfoArray;
    }

    /**
     * Sets the value of the elecMerAcctErrInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecMerAcctErrInfoArrayAType }
     *     
     */
    public void setElecMerAcctErrInfoArray(ElecMerAcctErrInfoArrayAType value) {
        this.elecMerAcctErrInfoArray = value;
    }

    /**
     * Gets the value of the authenQuesArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthenQuesArrayAType }{@code >}
     *     
     */
    public JAXBElement<AuthenQuesArrayAType> getAuthenQuesArray() {
        return authenQuesArray;
    }

    /**
     * Sets the value of the authenQuesArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthenQuesArrayAType }{@code >}
     *     
     */
    public void setAuthenQuesArray(JAXBElement<AuthenQuesArrayAType> value) {
        this.authenQuesArray = value;
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
