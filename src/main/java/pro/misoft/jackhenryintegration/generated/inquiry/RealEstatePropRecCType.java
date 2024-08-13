
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for RealEstatePropRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstatePropRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="ApprVal" type="{http://jackhenry.com/jxchange/TPG/2008}ApprVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ApprDt" type="{http://jackhenry.com/jxchange/TPG/2008}ApprDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PropDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropPurchaseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PropPurchaseAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LeadLnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LeadLnAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LeadLnAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LeadLnAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorLienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PriorLienAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnRecourseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnRecourseAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrossCollatLnCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrossCollatLnCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ProjectLnPhase" type="{http://jackhenry.com/jxchange/TPG/2008}ProjectLnPhase_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RealEstatePropRec_CType", propOrder = {
    "propAddr",
    "apprVal",
    "apprDt",
    "propInfo",
    "propPurchaseAmt",
    "leadLnAcctId",
    "leadLnAcctType",
    "priorLienAmt",
    "lnRecourseAmt",
    "crossCollatLnCode",
    "ver1",
    "projectLnPhase",
    "ver2",
    "any"
})
public class RealEstatePropRecCType {

    @XmlElement(name = "PropAddr")
    protected AddrCType propAddr;
    @XmlElementRef(name = "ApprVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ApprValType> apprVal;
    @XmlElementRef(name = "ApprDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ApprDtType> apprDt;
    @XmlElementRef(name = "PropInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropDescType> propInfo;
    @XmlElementRef(name = "PropPurchaseAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PropPurchaseAmtType> propPurchaseAmt;
    @XmlElementRef(name = "LeadLnAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LeadLnAcctIdType> leadLnAcctId;
    @XmlElementRef(name = "LeadLnAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LeadLnAcctTypeType> leadLnAcctType;
    @XmlElementRef(name = "PriorLienAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PriorLienAmtType> priorLienAmt;
    @XmlElementRef(name = "LnRecourseAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnRecourseAmtType> lnRecourseAmt;
    @XmlElementRef(name = "CrossCollatLnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrossCollatLnCodeType> crossCollatLnCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ProjectLnPhase")
    protected ProjectLnPhaseType projectLnPhase;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the propAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPropAddr() {
        return propAddr;
    }

    /**
     * Sets the value of the propAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPropAddr(AddrCType value) {
        this.propAddr = value;
    }

    /**
     * Gets the value of the apprVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApprValType }{@code >}
     *     
     */
    public JAXBElement<ApprValType> getApprVal() {
        return apprVal;
    }

    /**
     * Sets the value of the apprVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApprValType }{@code >}
     *     
     */
    public void setApprVal(JAXBElement<ApprValType> value) {
        this.apprVal = value;
    }

    /**
     * Gets the value of the apprDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApprDtType }{@code >}
     *     
     */
    public JAXBElement<ApprDtType> getApprDt() {
        return apprDt;
    }

    /**
     * Sets the value of the apprDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApprDtType }{@code >}
     *     
     */
    public void setApprDt(JAXBElement<ApprDtType> value) {
        this.apprDt = value;
    }

    /**
     * Gets the value of the propInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropDescType }{@code >}
     *     
     */
    public JAXBElement<PropDescType> getPropInfo() {
        return propInfo;
    }

    /**
     * Sets the value of the propInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropDescType }{@code >}
     *     
     */
    public void setPropInfo(JAXBElement<PropDescType> value) {
        this.propInfo = value;
    }

    /**
     * Gets the value of the propPurchaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PropPurchaseAmtType }{@code >}
     *     
     */
    public JAXBElement<PropPurchaseAmtType> getPropPurchaseAmt() {
        return propPurchaseAmt;
    }

    /**
     * Sets the value of the propPurchaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PropPurchaseAmtType }{@code >}
     *     
     */
    public void setPropPurchaseAmt(JAXBElement<PropPurchaseAmtType> value) {
        this.propPurchaseAmt = value;
    }

    /**
     * Gets the value of the leadLnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LeadLnAcctIdType }{@code >}
     *     
     */
    public JAXBElement<LeadLnAcctIdType> getLeadLnAcctId() {
        return leadLnAcctId;
    }

    /**
     * Sets the value of the leadLnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LeadLnAcctIdType }{@code >}
     *     
     */
    public void setLeadLnAcctId(JAXBElement<LeadLnAcctIdType> value) {
        this.leadLnAcctId = value;
    }

    /**
     * Gets the value of the leadLnAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LeadLnAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<LeadLnAcctTypeType> getLeadLnAcctType() {
        return leadLnAcctType;
    }

    /**
     * Sets the value of the leadLnAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LeadLnAcctTypeType }{@code >}
     *     
     */
    public void setLeadLnAcctType(JAXBElement<LeadLnAcctTypeType> value) {
        this.leadLnAcctType = value;
    }

    /**
     * Gets the value of the priorLienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorLienAmtType }{@code >}
     *     
     */
    public JAXBElement<PriorLienAmtType> getPriorLienAmt() {
        return priorLienAmt;
    }

    /**
     * Sets the value of the priorLienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorLienAmtType }{@code >}
     *     
     */
    public void setPriorLienAmt(JAXBElement<PriorLienAmtType> value) {
        this.priorLienAmt = value;
    }

    /**
     * Gets the value of the lnRecourseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnRecourseAmtType }{@code >}
     *     
     */
    public JAXBElement<LnRecourseAmtType> getLnRecourseAmt() {
        return lnRecourseAmt;
    }

    /**
     * Sets the value of the lnRecourseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnRecourseAmtType }{@code >}
     *     
     */
    public void setLnRecourseAmt(JAXBElement<LnRecourseAmtType> value) {
        this.lnRecourseAmt = value;
    }

    /**
     * Gets the value of the crossCollatLnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrossCollatLnCodeType }{@code >}
     *     
     */
    public JAXBElement<CrossCollatLnCodeType> getCrossCollatLnCode() {
        return crossCollatLnCode;
    }

    /**
     * Sets the value of the crossCollatLnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrossCollatLnCodeType }{@code >}
     *     
     */
    public void setCrossCollatLnCode(JAXBElement<CrossCollatLnCodeType> value) {
        this.crossCollatLnCode = value;
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
