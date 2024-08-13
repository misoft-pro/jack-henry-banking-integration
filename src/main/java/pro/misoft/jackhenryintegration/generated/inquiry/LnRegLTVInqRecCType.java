
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
 * <p>Java class for LnRegLTVInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRegLTVInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropPurchaseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PropPurchaseAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SoldBal" type="{http://jackhenry.com/jxchange/TPG/2008}SoldBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorLienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PriorLienAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprVal" type="{http://jackhenry.com/jxchange/TPG/2008}ApprVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprDt" type="{http://jackhenry.com/jxchange/TPG/2008}ApprDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegLnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RegLnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProjectLnPhase" type="{http://jackhenry.com/jxchange/TPG/2008}ProjectLnPhase_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegLTV" type="{http://jackhenry.com/jxchange/TPG/2008}RegLTV_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnRegLTVInqRec_CType", propOrder = {
    "acctId",
    "acctType",
    "curBal",
    "propPurchaseAmt",
    "soldBal",
    "priorLienAmt",
    "locAvlBal",
    "apprVal",
    "apprDt",
    "regLnAmt",
    "projectLnPhase",
    "regLTV",
    "ver1",
    "any"
})
public class LnRegLTVInqRecCType {

    @XmlElement(name = "AcctId", required = true)
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "PropPurchaseAmt")
    protected PropPurchaseAmtType propPurchaseAmt;
    @XmlElement(name = "SoldBal")
    protected SoldBalType soldBal;
    @XmlElement(name = "PriorLienAmt")
    protected PriorLienAmtType priorLienAmt;
    @XmlElement(name = "LOCAvlBal")
    protected LOCAvlBalType locAvlBal;
    @XmlElement(name = "ApprVal")
    protected ApprValType apprVal;
    @XmlElement(name = "ApprDt")
    protected ApprDtType apprDt;
    @XmlElement(name = "RegLnAmt")
    protected RegLnAmtType regLnAmt;
    @XmlElement(name = "ProjectLnPhase")
    protected ProjectLnPhaseType projectLnPhase;
    @XmlElement(name = "RegLTV")
    protected RegLTVType regLTV;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
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
     * Gets the value of the propPurchaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PropPurchaseAmtType }
     *     
     */
    public PropPurchaseAmtType getPropPurchaseAmt() {
        return propPurchaseAmt;
    }

    /**
     * Sets the value of the propPurchaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropPurchaseAmtType }
     *     
     */
    public void setPropPurchaseAmt(PropPurchaseAmtType value) {
        this.propPurchaseAmt = value;
    }

    /**
     * Gets the value of the soldBal property.
     * 
     * @return
     *     possible object is
     *     {@link SoldBalType }
     *     
     */
    public SoldBalType getSoldBal() {
        return soldBal;
    }

    /**
     * Sets the value of the soldBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoldBalType }
     *     
     */
    public void setSoldBal(SoldBalType value) {
        this.soldBal = value;
    }

    /**
     * Gets the value of the priorLienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PriorLienAmtType }
     *     
     */
    public PriorLienAmtType getPriorLienAmt() {
        return priorLienAmt;
    }

    /**
     * Sets the value of the priorLienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorLienAmtType }
     *     
     */
    public void setPriorLienAmt(PriorLienAmtType value) {
        this.priorLienAmt = value;
    }

    /**
     * Gets the value of the locAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlBalType }
     *     
     */
    public LOCAvlBalType getLOCAvlBal() {
        return locAvlBal;
    }

    /**
     * Sets the value of the locAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlBalType }
     *     
     */
    public void setLOCAvlBal(LOCAvlBalType value) {
        this.locAvlBal = value;
    }

    /**
     * Gets the value of the apprVal property.
     * 
     * @return
     *     possible object is
     *     {@link ApprValType }
     *     
     */
    public ApprValType getApprVal() {
        return apprVal;
    }

    /**
     * Sets the value of the apprVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprValType }
     *     
     */
    public void setApprVal(ApprValType value) {
        this.apprVal = value;
    }

    /**
     * Gets the value of the apprDt property.
     * 
     * @return
     *     possible object is
     *     {@link ApprDtType }
     *     
     */
    public ApprDtType getApprDt() {
        return apprDt;
    }

    /**
     * Sets the value of the apprDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprDtType }
     *     
     */
    public void setApprDt(ApprDtType value) {
        this.apprDt = value;
    }

    /**
     * Gets the value of the regLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RegLnAmtType }
     *     
     */
    public RegLnAmtType getRegLnAmt() {
        return regLnAmt;
    }

    /**
     * Sets the value of the regLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegLnAmtType }
     *     
     */
    public void setRegLnAmt(RegLnAmtType value) {
        this.regLnAmt = value;
    }

    /**
     * Gets the value of the projectLnPhase property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectLnPhaseType }
     *     
     */
    public ProjectLnPhaseType getProjectLnPhase() {
        return projectLnPhase;
    }

    /**
     * Sets the value of the projectLnPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectLnPhaseType }
     *     
     */
    public void setProjectLnPhase(ProjectLnPhaseType value) {
        this.projectLnPhase = value;
    }

    /**
     * Gets the value of the regLTV property.
     * 
     * @return
     *     possible object is
     *     {@link RegLTVType }
     *     
     */
    public RegLTVType getRegLTV() {
        return regLTV;
    }

    /**
     * Sets the value of the regLTV property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegLTVType }
     *     
     */
    public void setRegLTV(RegLTVType value) {
        this.regLTV = value;
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
