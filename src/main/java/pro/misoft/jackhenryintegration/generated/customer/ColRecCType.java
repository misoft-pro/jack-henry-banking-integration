
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ColRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColQueCode" type="{http://jackhenry.com/jxchange/TPG/2008}ColQueCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColAcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}ColAcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActnTakenCode" type="{http://jackhenry.com/jxchange/TPG/2008}ActnTakenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConPartyCode" type="{http://jackhenry.com/jxchange/TPG/2008}ConPartyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConRsltCode" type="{http://jackhenry.com/jxchange/TPG/2008}ConRsltCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColPromisedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ColPromisedAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColPromisedDt" type="{http://jackhenry.com/jxchange/TPG/2008}ColPromisedDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColLtrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ColLtrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtWorkDt" type="{http://jackhenry.com/jxchange/TPG/2008}WorkDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtLtrNowType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtLtrNowType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtNonPastDueType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtNonPastDueType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemInQueType" type="{http://jackhenry.com/jxchange/TPG/2008}RemInQueType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColAddDt" type="{http://jackhenry.com/jxchange/TPG/2008}ColAddDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StayInColType" type="{http://jackhenry.com/jxchange/TPG/2008}StayInColType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncmLastUpdDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastUpdDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncmLastUpdBy" type="{http://jackhenry.com/jxchange/TPG/2008}UsrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseLastUpdDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastUpdDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseLastUpdBy" type="{http://jackhenry.com/jxchange/TPG/2008}UsrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImporMsgArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="ColIncmArray" type="{http://jackhenry.com/jxchange/TPG/2008}ColIncmArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ColExpenseArray" type="{http://jackhenry.com/jxchange/TPG/2008}ColExpenseArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ColRec_CType", propOrder = {
    "colQueCode",
    "colExpDt",
    "colAcctStat",
    "actnTakenCode",
    "conPartyCode",
    "conRsltCode",
    "colPromisedAmt",
    "colPromisedDt",
    "colLtrCode",
    "nxtWorkDt",
    "prtLtrNowType",
    "prtNonPastDueType",
    "remInQueType",
    "colAddDt",
    "stayInColType",
    "incmLastUpdDt",
    "incmLastUpdBy",
    "expenseLastUpdDt",
    "expenseLastUpdBy",
    "imporMsgArray",
    "colIncmArray",
    "colExpenseArray",
    "custom",
    "ver1",
    "any"
})
public class ColRecCType {

    @XmlElement(name = "ColQueCode")
    protected ColQueCodeType colQueCode;
    @XmlElement(name = "ColExpDt")
    protected ExpDtType colExpDt;
    @XmlElement(name = "ColAcctStat")
    protected ColAcctStatType colAcctStat;
    @XmlElement(name = "ActnTakenCode")
    protected ActnTakenCodeType actnTakenCode;
    @XmlElement(name = "ConPartyCode")
    protected ConPartyCodeType conPartyCode;
    @XmlElement(name = "ConRsltCode")
    protected ConRsltCodeType conRsltCode;
    @XmlElement(name = "ColPromisedAmt")
    protected ColPromisedAmtType colPromisedAmt;
    @XmlElement(name = "ColPromisedDt")
    protected ColPromisedDtType colPromisedDt;
    @XmlElement(name = "ColLtrCode")
    protected ColLtrCodeType colLtrCode;
    @XmlElement(name = "NxtWorkDt")
    protected WorkDtType nxtWorkDt;
    @XmlElement(name = "PrtLtrNowType")
    protected PrtLtrNowTypeType prtLtrNowType;
    @XmlElement(name = "PrtNonPastDueType")
    protected PrtNonPastDueTypeType prtNonPastDueType;
    @XmlElement(name = "RemInQueType")
    protected RemInQueTypeType remInQueType;
    @XmlElement(name = "ColAddDt")
    protected ColAddDtType colAddDt;
    @XmlElement(name = "StayInColType")
    protected StayInColTypeType stayInColType;
    @XmlElement(name = "IncmLastUpdDt")
    protected LastUpdDtType incmLastUpdDt;
    @XmlElement(name = "IncmLastUpdBy")
    protected UsrNameType incmLastUpdBy;
    @XmlElement(name = "ExpenseLastUpdDt")
    protected LastUpdDtType expenseLastUpdDt;
    @XmlElement(name = "ExpenseLastUpdBy")
    protected UsrNameType expenseLastUpdBy;
    @XmlElement(name = "ImporMsgArray")
    protected RmkAType imporMsgArray;
    @XmlElement(name = "ColIncmArray")
    protected ColIncmArrayAType colIncmArray;
    @XmlElement(name = "ColExpenseArray")
    protected ColExpenseArrayAType colExpenseArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the colQueCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColQueCodeType }
     *     
     */
    public ColQueCodeType getColQueCode() {
        return colQueCode;
    }

    /**
     * Sets the value of the colQueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColQueCodeType }
     *     
     */
    public void setColQueCode(ColQueCodeType value) {
        this.colQueCode = value;
    }

    /**
     * Gets the value of the colExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getColExpDt() {
        return colExpDt;
    }

    /**
     * Sets the value of the colExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setColExpDt(ExpDtType value) {
        this.colExpDt = value;
    }

    /**
     * Gets the value of the colAcctStat property.
     * 
     * @return
     *     possible object is
     *     {@link ColAcctStatType }
     *     
     */
    public ColAcctStatType getColAcctStat() {
        return colAcctStat;
    }

    /**
     * Sets the value of the colAcctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColAcctStatType }
     *     
     */
    public void setColAcctStat(ColAcctStatType value) {
        this.colAcctStat = value;
    }

    /**
     * Gets the value of the actnTakenCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActnTakenCodeType }
     *     
     */
    public ActnTakenCodeType getActnTakenCode() {
        return actnTakenCode;
    }

    /**
     * Sets the value of the actnTakenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActnTakenCodeType }
     *     
     */
    public void setActnTakenCode(ActnTakenCodeType value) {
        this.actnTakenCode = value;
    }

    /**
     * Gets the value of the conPartyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConPartyCodeType }
     *     
     */
    public ConPartyCodeType getConPartyCode() {
        return conPartyCode;
    }

    /**
     * Sets the value of the conPartyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConPartyCodeType }
     *     
     */
    public void setConPartyCode(ConPartyCodeType value) {
        this.conPartyCode = value;
    }

    /**
     * Gets the value of the conRsltCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConRsltCodeType }
     *     
     */
    public ConRsltCodeType getConRsltCode() {
        return conRsltCode;
    }

    /**
     * Sets the value of the conRsltCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConRsltCodeType }
     *     
     */
    public void setConRsltCode(ConRsltCodeType value) {
        this.conRsltCode = value;
    }

    /**
     * Gets the value of the colPromisedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ColPromisedAmtType }
     *     
     */
    public ColPromisedAmtType getColPromisedAmt() {
        return colPromisedAmt;
    }

    /**
     * Sets the value of the colPromisedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColPromisedAmtType }
     *     
     */
    public void setColPromisedAmt(ColPromisedAmtType value) {
        this.colPromisedAmt = value;
    }

    /**
     * Gets the value of the colPromisedDt property.
     * 
     * @return
     *     possible object is
     *     {@link ColPromisedDtType }
     *     
     */
    public ColPromisedDtType getColPromisedDt() {
        return colPromisedDt;
    }

    /**
     * Sets the value of the colPromisedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColPromisedDtType }
     *     
     */
    public void setColPromisedDt(ColPromisedDtType value) {
        this.colPromisedDt = value;
    }

    /**
     * Gets the value of the colLtrCode property.
     * 
     * @return
     *     possible object is
     *     {@link ColLtrCodeType }
     *     
     */
    public ColLtrCodeType getColLtrCode() {
        return colLtrCode;
    }

    /**
     * Sets the value of the colLtrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColLtrCodeType }
     *     
     */
    public void setColLtrCode(ColLtrCodeType value) {
        this.colLtrCode = value;
    }

    /**
     * Gets the value of the nxtWorkDt property.
     * 
     * @return
     *     possible object is
     *     {@link WorkDtType }
     *     
     */
    public WorkDtType getNxtWorkDt() {
        return nxtWorkDt;
    }

    /**
     * Sets the value of the nxtWorkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkDtType }
     *     
     */
    public void setNxtWorkDt(WorkDtType value) {
        this.nxtWorkDt = value;
    }

    /**
     * Gets the value of the prtLtrNowType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtLtrNowTypeType }
     *     
     */
    public PrtLtrNowTypeType getPrtLtrNowType() {
        return prtLtrNowType;
    }

    /**
     * Sets the value of the prtLtrNowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtLtrNowTypeType }
     *     
     */
    public void setPrtLtrNowType(PrtLtrNowTypeType value) {
        this.prtLtrNowType = value;
    }

    /**
     * Gets the value of the prtNonPastDueType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtNonPastDueTypeType }
     *     
     */
    public PrtNonPastDueTypeType getPrtNonPastDueType() {
        return prtNonPastDueType;
    }

    /**
     * Sets the value of the prtNonPastDueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtNonPastDueTypeType }
     *     
     */
    public void setPrtNonPastDueType(PrtNonPastDueTypeType value) {
        this.prtNonPastDueType = value;
    }

    /**
     * Gets the value of the remInQueType property.
     * 
     * @return
     *     possible object is
     *     {@link RemInQueTypeType }
     *     
     */
    public RemInQueTypeType getRemInQueType() {
        return remInQueType;
    }

    /**
     * Sets the value of the remInQueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemInQueTypeType }
     *     
     */
    public void setRemInQueType(RemInQueTypeType value) {
        this.remInQueType = value;
    }

    /**
     * Gets the value of the colAddDt property.
     * 
     * @return
     *     possible object is
     *     {@link ColAddDtType }
     *     
     */
    public ColAddDtType getColAddDt() {
        return colAddDt;
    }

    /**
     * Sets the value of the colAddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColAddDtType }
     *     
     */
    public void setColAddDt(ColAddDtType value) {
        this.colAddDt = value;
    }

    /**
     * Gets the value of the stayInColType property.
     * 
     * @return
     *     possible object is
     *     {@link StayInColTypeType }
     *     
     */
    public StayInColTypeType getStayInColType() {
        return stayInColType;
    }

    /**
     * Sets the value of the stayInColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayInColTypeType }
     *     
     */
    public void setStayInColType(StayInColTypeType value) {
        this.stayInColType = value;
    }

    /**
     * Gets the value of the incmLastUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastUpdDtType }
     *     
     */
    public LastUpdDtType getIncmLastUpdDt() {
        return incmLastUpdDt;
    }

    /**
     * Sets the value of the incmLastUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastUpdDtType }
     *     
     */
    public void setIncmLastUpdDt(LastUpdDtType value) {
        this.incmLastUpdDt = value;
    }

    /**
     * Gets the value of the incmLastUpdBy property.
     * 
     * @return
     *     possible object is
     *     {@link UsrNameType }
     *     
     */
    public UsrNameType getIncmLastUpdBy() {
        return incmLastUpdBy;
    }

    /**
     * Sets the value of the incmLastUpdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrNameType }
     *     
     */
    public void setIncmLastUpdBy(UsrNameType value) {
        this.incmLastUpdBy = value;
    }

    /**
     * Gets the value of the expenseLastUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastUpdDtType }
     *     
     */
    public LastUpdDtType getExpenseLastUpdDt() {
        return expenseLastUpdDt;
    }

    /**
     * Sets the value of the expenseLastUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastUpdDtType }
     *     
     */
    public void setExpenseLastUpdDt(LastUpdDtType value) {
        this.expenseLastUpdDt = value;
    }

    /**
     * Gets the value of the expenseLastUpdBy property.
     * 
     * @return
     *     possible object is
     *     {@link UsrNameType }
     *     
     */
    public UsrNameType getExpenseLastUpdBy() {
        return expenseLastUpdBy;
    }

    /**
     * Sets the value of the expenseLastUpdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrNameType }
     *     
     */
    public void setExpenseLastUpdBy(UsrNameType value) {
        this.expenseLastUpdBy = value;
    }

    /**
     * Gets the value of the imporMsgArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getImporMsgArray() {
        return imporMsgArray;
    }

    /**
     * Sets the value of the imporMsgArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setImporMsgArray(RmkAType value) {
        this.imporMsgArray = value;
    }

    /**
     * Gets the value of the colIncmArray property.
     * 
     * @return
     *     possible object is
     *     {@link ColIncmArrayAType }
     *     
     */
    public ColIncmArrayAType getColIncmArray() {
        return colIncmArray;
    }

    /**
     * Sets the value of the colIncmArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColIncmArrayAType }
     *     
     */
    public void setColIncmArray(ColIncmArrayAType value) {
        this.colIncmArray = value;
    }

    /**
     * Gets the value of the colExpenseArray property.
     * 
     * @return
     *     possible object is
     *     {@link ColExpenseArrayAType }
     *     
     */
    public ColExpenseArrayAType getColExpenseArray() {
        return colExpenseArray;
    }

    /**
     * Sets the value of the colExpenseArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColExpenseArrayAType }
     *     
     */
    public void setColExpenseArray(ColExpenseArrayAType value) {
        this.colExpenseArray = value;
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
