
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
 * <p>Java class for TrancheAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtCycle" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsOnZeroBal" type="{http://jackhenry.com/jxchange/TPG/2008}ClsOnZeroBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtPastDueNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtPastDueNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SynAgentId" type="{http://jackhenry.com/jxchange/TPG/2008}SynAgentId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SynMemberId" type="{http://jackhenry.com/jxchange/TPG/2008}SynMemberId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartIdNum" type="{http://jackhenry.com/jxchange/TPG/2008}PartIdNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HldMailCode" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FundLmt" type="{http://jackhenry.com/jxchange/TPG/2008}FundLmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrancheAcctInfo_CType", propOrder = {
    "firstPmtDt",
    "stmtCycle",
    "prtBilNotCode",
    "clsOnZeroBal",
    "prtPastDueNotCode",
    "synAgentId",
    "synMemberId",
    "partIdNum",
    "prtcpCode",
    "hldMailCode",
    "prtcpAcctId",
    "prtcpAcctType",
    "fundLmt",
    "custom",
    "ver1",
    "any"
})
public class TrancheAcctInfoCType {

    @XmlElement(name = "FirstPmtDt")
    protected FirstPmtDtType firstPmtDt;
    @XmlElement(name = "StmtCycle")
    protected StmtCycleType stmtCycle;
    @XmlElement(name = "PrtBilNotCode")
    protected PrtBilNotCodeType prtBilNotCode;
    @XmlElement(name = "ClsOnZeroBal")
    protected ClsOnZeroBalType clsOnZeroBal;
    @XmlElement(name = "PrtPastDueNotCode")
    protected PrtPastDueNotCodeType prtPastDueNotCode;
    @XmlElement(name = "SynAgentId")
    protected SynAgentIdType synAgentId;
    @XmlElement(name = "SynMemberId")
    protected SynMemberIdType synMemberId;
    @XmlElement(name = "PartIdNum")
    protected PartIdNumType partIdNum;
    @XmlElement(name = "PrtcpCode")
    protected PrtcpCodeType prtcpCode;
    @XmlElement(name = "HldMailCode")
    protected HldMailCodeType hldMailCode;
    @XmlElement(name = "PrtcpAcctId")
    protected PrtcpAcctIdType prtcpAcctId;
    @XmlElement(name = "PrtcpAcctType")
    protected PrtcpAcctTypeType prtcpAcctType;
    @XmlElement(name = "FundLmt")
    protected FundLmtType fundLmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the firstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstPmtDtType }
     *     
     */
    public FirstPmtDtType getFirstPmtDt() {
        return firstPmtDt;
    }

    /**
     * Sets the value of the firstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstPmtDtType }
     *     
     */
    public void setFirstPmtDt(FirstPmtDtType value) {
        this.firstPmtDt = value;
    }

    /**
     * Gets the value of the stmtCycle property.
     * 
     * @return
     *     possible object is
     *     {@link StmtCycleType }
     *     
     */
    public StmtCycleType getStmtCycle() {
        return stmtCycle;
    }

    /**
     * Sets the value of the stmtCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtCycleType }
     *     
     */
    public void setStmtCycle(StmtCycleType value) {
        this.stmtCycle = value;
    }

    /**
     * Gets the value of the prtBilNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public PrtBilNotCodeType getPrtBilNotCode() {
        return prtBilNotCode;
    }

    /**
     * Sets the value of the prtBilNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public void setPrtBilNotCode(PrtBilNotCodeType value) {
        this.prtBilNotCode = value;
    }

    /**
     * Gets the value of the clsOnZeroBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClsOnZeroBalType }
     *     
     */
    public ClsOnZeroBalType getClsOnZeroBal() {
        return clsOnZeroBal;
    }

    /**
     * Sets the value of the clsOnZeroBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsOnZeroBalType }
     *     
     */
    public void setClsOnZeroBal(ClsOnZeroBalType value) {
        this.clsOnZeroBal = value;
    }

    /**
     * Gets the value of the prtPastDueNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtPastDueNotCodeType }
     *     
     */
    public PrtPastDueNotCodeType getPrtPastDueNotCode() {
        return prtPastDueNotCode;
    }

    /**
     * Sets the value of the prtPastDueNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtPastDueNotCodeType }
     *     
     */
    public void setPrtPastDueNotCode(PrtPastDueNotCodeType value) {
        this.prtPastDueNotCode = value;
    }

    /**
     * Gets the value of the synAgentId property.
     * 
     * @return
     *     possible object is
     *     {@link SynAgentIdType }
     *     
     */
    public SynAgentIdType getSynAgentId() {
        return synAgentId;
    }

    /**
     * Sets the value of the synAgentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynAgentIdType }
     *     
     */
    public void setSynAgentId(SynAgentIdType value) {
        this.synAgentId = value;
    }

    /**
     * Gets the value of the synMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link SynMemberIdType }
     *     
     */
    public SynMemberIdType getSynMemberId() {
        return synMemberId;
    }

    /**
     * Sets the value of the synMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynMemberIdType }
     *     
     */
    public void setSynMemberId(SynMemberIdType value) {
        this.synMemberId = value;
    }

    /**
     * Gets the value of the partIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link PartIdNumType }
     *     
     */
    public PartIdNumType getPartIdNum() {
        return partIdNum;
    }

    /**
     * Sets the value of the partIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartIdNumType }
     *     
     */
    public void setPartIdNum(PartIdNumType value) {
        this.partIdNum = value;
    }

    /**
     * Gets the value of the prtcpCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpCodeType }
     *     
     */
    public PrtcpCodeType getPrtcpCode() {
        return prtcpCode;
    }

    /**
     * Sets the value of the prtcpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpCodeType }
     *     
     */
    public void setPrtcpCode(PrtcpCodeType value) {
        this.prtcpCode = value;
    }

    /**
     * Gets the value of the hldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link HldMailCodeType }
     *     
     */
    public HldMailCodeType getHldMailCode() {
        return hldMailCode;
    }

    /**
     * Sets the value of the hldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldMailCodeType }
     *     
     */
    public void setHldMailCode(HldMailCodeType value) {
        this.hldMailCode = value;
    }

    /**
     * Gets the value of the prtcpAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpAcctIdType }
     *     
     */
    public PrtcpAcctIdType getPrtcpAcctId() {
        return prtcpAcctId;
    }

    /**
     * Sets the value of the prtcpAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpAcctIdType }
     *     
     */
    public void setPrtcpAcctId(PrtcpAcctIdType value) {
        this.prtcpAcctId = value;
    }

    /**
     * Gets the value of the prtcpAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpAcctTypeType }
     *     
     */
    public PrtcpAcctTypeType getPrtcpAcctType() {
        return prtcpAcctType;
    }

    /**
     * Sets the value of the prtcpAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpAcctTypeType }
     *     
     */
    public void setPrtcpAcctType(PrtcpAcctTypeType value) {
        this.prtcpAcctType = value;
    }

    /**
     * Gets the value of the fundLmt property.
     * 
     * @return
     *     possible object is
     *     {@link FundLmtType }
     *     
     */
    public FundLmtType getFundLmt() {
        return fundLmt;
    }

    /**
     * Sets the value of the fundLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundLmtType }
     *     
     */
    public void setFundLmt(FundLmtType value) {
        this.fundLmt = value;
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
