
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
 * <p>Java class for LnSvcAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnSvcAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcInvId" type="{http://jackhenry.com/jxchange/TPG/2008}SvcInvId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvGroupCode" type="{http://jackhenry.com/jxchange/TPG/2008}InvGroupCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcActnGroupType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcActnGroupType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcActnCode" type="{http://jackhenry.com/jxchange/TPG/2008}SvcActnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcActnEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcActnEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcContrId" type="{http://jackhenry.com/jxchange/TPG/2008}SvcContrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcCertifId" type="{http://jackhenry.com/jxchange/TPG/2008}SvcCertifId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcDeActDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDeActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgBackSecSpecType" type="{http://jackhenry.com/jxchange/TPG/2008}MtgBackSecSpecType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcCaseId" type="{http://jackhenry.com/jxchange/TPG/2008}SvcCaseId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcNoteHolderType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcNoteHolderType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemitPayoff" type="{http://jackhenry.com/jxchange/TPG/2008}RemitPayoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgBackSecId" type="{http://jackhenry.com/jxchange/TPG/2008}MtgBackSecId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgBackSecIssDt" type="{http://jackhenry.com/jxchange/TPG/2008}MtgBackSecIssDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayoffRemTerm" type="{http://jackhenry.com/jxchange/TPG/2008}PayoffRemTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="SBAIntFromDt" type="{http://jackhenry.com/jxchange/TPG/2008}SBAIntFromDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SBAIntToDt" type="{http://jackhenry.com/jxchange/TPG/2008}SBAIntToDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevPoolId" type="{http://jackhenry.com/jxchange/TPG/2008}PrevPoolId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcReclassProcCode" type="{http://jackhenry.com/jxchange/TPG/2008}SvcReclassProcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcReclassEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcReclassEffDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnSvcAcctInfo_CType", propOrder = {
    "svcInvId",
    "invGroupCode",
    "svcActnGroupType",
    "svcActnCode",
    "svcActnEffDt",
    "prtcpAcctId",
    "svcContrId",
    "svcCertifId",
    "svcDeActDt",
    "mtgBackSecSpecType",
    "svcCaseId",
    "svcNoteHolderType",
    "remitPayoff",
    "mtgBackSecId",
    "mtgBackSecIssDt",
    "payoffRemTerm",
    "sbaIntFromDt",
    "sbaIntToDt",
    "prevPoolId",
    "svcReclassProcCode",
    "svcReclassEffDt",
    "ver1",
    "any"
})
public class LnSvcAcctInfoCType {

    @XmlElement(name = "SvcInvId")
    protected SvcInvIdType svcInvId;
    @XmlElement(name = "InvGroupCode")
    protected InvGroupCodeType invGroupCode;
    @XmlElement(name = "SvcActnGroupType")
    protected SvcActnGroupTypeType svcActnGroupType;
    @XmlElement(name = "SvcActnCode")
    protected SvcActnCodeType svcActnCode;
    @XmlElement(name = "SvcActnEffDt")
    protected SvcActnEffDtType svcActnEffDt;
    @XmlElement(name = "PrtcpAcctId")
    protected PrtcpAcctIdType prtcpAcctId;
    @XmlElement(name = "SvcContrId")
    protected SvcContrIdType svcContrId;
    @XmlElement(name = "SvcCertifId")
    protected SvcCertifIdType svcCertifId;
    @XmlElement(name = "SvcDeActDt")
    protected SvcDeActDtType svcDeActDt;
    @XmlElement(name = "MtgBackSecSpecType")
    protected MtgBackSecSpecTypeType mtgBackSecSpecType;
    @XmlElement(name = "SvcCaseId")
    protected SvcCaseIdType svcCaseId;
    @XmlElement(name = "SvcNoteHolderType")
    protected SvcNoteHolderTypeType svcNoteHolderType;
    @XmlElement(name = "RemitPayoff")
    protected RemitPayoffType remitPayoff;
    @XmlElement(name = "MtgBackSecId")
    protected MtgBackSecIdType mtgBackSecId;
    @XmlElement(name = "MtgBackSecIssDt")
    protected MtgBackSecIssDtType mtgBackSecIssDt;
    @XmlElement(name = "PayoffRemTerm")
    protected PayoffRemTermType payoffRemTerm;
    @XmlElement(name = "SBAIntFromDt")
    protected SBAIntFromDtType sbaIntFromDt;
    @XmlElement(name = "SBAIntToDt")
    protected SBAIntToDtType sbaIntToDt;
    @XmlElement(name = "PrevPoolId")
    protected PrevPoolIdType prevPoolId;
    @XmlElement(name = "SvcReclassProcCode")
    protected SvcReclassProcCodeType svcReclassProcCode;
    @XmlElement(name = "SvcReclassEffDt")
    protected SvcReclassEffDtType svcReclassEffDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcInvId property.
     * 
     * @return
     *     possible object is
     *     {@link SvcInvIdType }
     *     
     */
    public SvcInvIdType getSvcInvId() {
        return svcInvId;
    }

    /**
     * Sets the value of the svcInvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcInvIdType }
     *     
     */
    public void setSvcInvId(SvcInvIdType value) {
        this.svcInvId = value;
    }

    /**
     * Gets the value of the invGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link InvGroupCodeType }
     *     
     */
    public InvGroupCodeType getInvGroupCode() {
        return invGroupCode;
    }

    /**
     * Sets the value of the invGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGroupCodeType }
     *     
     */
    public void setInvGroupCode(InvGroupCodeType value) {
        this.invGroupCode = value;
    }

    /**
     * Gets the value of the svcActnGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcActnGroupTypeType }
     *     
     */
    public SvcActnGroupTypeType getSvcActnGroupType() {
        return svcActnGroupType;
    }

    /**
     * Sets the value of the svcActnGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcActnGroupTypeType }
     *     
     */
    public void setSvcActnGroupType(SvcActnGroupTypeType value) {
        this.svcActnGroupType = value;
    }

    /**
     * Gets the value of the svcActnCode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcActnCodeType }
     *     
     */
    public SvcActnCodeType getSvcActnCode() {
        return svcActnCode;
    }

    /**
     * Sets the value of the svcActnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcActnCodeType }
     *     
     */
    public void setSvcActnCode(SvcActnCodeType value) {
        this.svcActnCode = value;
    }

    /**
     * Gets the value of the svcActnEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcActnEffDtType }
     *     
     */
    public SvcActnEffDtType getSvcActnEffDt() {
        return svcActnEffDt;
    }

    /**
     * Sets the value of the svcActnEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcActnEffDtType }
     *     
     */
    public void setSvcActnEffDt(SvcActnEffDtType value) {
        this.svcActnEffDt = value;
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
     * Gets the value of the svcContrId property.
     * 
     * @return
     *     possible object is
     *     {@link SvcContrIdType }
     *     
     */
    public SvcContrIdType getSvcContrId() {
        return svcContrId;
    }

    /**
     * Sets the value of the svcContrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcContrIdType }
     *     
     */
    public void setSvcContrId(SvcContrIdType value) {
        this.svcContrId = value;
    }

    /**
     * Gets the value of the svcCertifId property.
     * 
     * @return
     *     possible object is
     *     {@link SvcCertifIdType }
     *     
     */
    public SvcCertifIdType getSvcCertifId() {
        return svcCertifId;
    }

    /**
     * Sets the value of the svcCertifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcCertifIdType }
     *     
     */
    public void setSvcCertifId(SvcCertifIdType value) {
        this.svcCertifId = value;
    }

    /**
     * Gets the value of the svcDeActDt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcDeActDtType }
     *     
     */
    public SvcDeActDtType getSvcDeActDt() {
        return svcDeActDt;
    }

    /**
     * Sets the value of the svcDeActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcDeActDtType }
     *     
     */
    public void setSvcDeActDt(SvcDeActDtType value) {
        this.svcDeActDt = value;
    }

    /**
     * Gets the value of the mtgBackSecSpecType property.
     * 
     * @return
     *     possible object is
     *     {@link MtgBackSecSpecTypeType }
     *     
     */
    public MtgBackSecSpecTypeType getMtgBackSecSpecType() {
        return mtgBackSecSpecType;
    }

    /**
     * Sets the value of the mtgBackSecSpecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtgBackSecSpecTypeType }
     *     
     */
    public void setMtgBackSecSpecType(MtgBackSecSpecTypeType value) {
        this.mtgBackSecSpecType = value;
    }

    /**
     * Gets the value of the svcCaseId property.
     * 
     * @return
     *     possible object is
     *     {@link SvcCaseIdType }
     *     
     */
    public SvcCaseIdType getSvcCaseId() {
        return svcCaseId;
    }

    /**
     * Sets the value of the svcCaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcCaseIdType }
     *     
     */
    public void setSvcCaseId(SvcCaseIdType value) {
        this.svcCaseId = value;
    }

    /**
     * Gets the value of the svcNoteHolderType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcNoteHolderTypeType }
     *     
     */
    public SvcNoteHolderTypeType getSvcNoteHolderType() {
        return svcNoteHolderType;
    }

    /**
     * Sets the value of the svcNoteHolderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcNoteHolderTypeType }
     *     
     */
    public void setSvcNoteHolderType(SvcNoteHolderTypeType value) {
        this.svcNoteHolderType = value;
    }

    /**
     * Gets the value of the remitPayoff property.
     * 
     * @return
     *     possible object is
     *     {@link RemitPayoffType }
     *     
     */
    public RemitPayoffType getRemitPayoff() {
        return remitPayoff;
    }

    /**
     * Sets the value of the remitPayoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitPayoffType }
     *     
     */
    public void setRemitPayoff(RemitPayoffType value) {
        this.remitPayoff = value;
    }

    /**
     * Gets the value of the mtgBackSecId property.
     * 
     * @return
     *     possible object is
     *     {@link MtgBackSecIdType }
     *     
     */
    public MtgBackSecIdType getMtgBackSecId() {
        return mtgBackSecId;
    }

    /**
     * Sets the value of the mtgBackSecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtgBackSecIdType }
     *     
     */
    public void setMtgBackSecId(MtgBackSecIdType value) {
        this.mtgBackSecId = value;
    }

    /**
     * Gets the value of the mtgBackSecIssDt property.
     * 
     * @return
     *     possible object is
     *     {@link MtgBackSecIssDtType }
     *     
     */
    public MtgBackSecIssDtType getMtgBackSecIssDt() {
        return mtgBackSecIssDt;
    }

    /**
     * Sets the value of the mtgBackSecIssDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtgBackSecIssDtType }
     *     
     */
    public void setMtgBackSecIssDt(MtgBackSecIssDtType value) {
        this.mtgBackSecIssDt = value;
    }

    /**
     * Gets the value of the payoffRemTerm property.
     * 
     * @return
     *     possible object is
     *     {@link PayoffRemTermType }
     *     
     */
    public PayoffRemTermType getPayoffRemTerm() {
        return payoffRemTerm;
    }

    /**
     * Sets the value of the payoffRemTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoffRemTermType }
     *     
     */
    public void setPayoffRemTerm(PayoffRemTermType value) {
        this.payoffRemTerm = value;
    }

    /**
     * Gets the value of the sbaIntFromDt property.
     * 
     * @return
     *     possible object is
     *     {@link SBAIntFromDtType }
     *     
     */
    public SBAIntFromDtType getSBAIntFromDt() {
        return sbaIntFromDt;
    }

    /**
     * Sets the value of the sbaIntFromDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBAIntFromDtType }
     *     
     */
    public void setSBAIntFromDt(SBAIntFromDtType value) {
        this.sbaIntFromDt = value;
    }

    /**
     * Gets the value of the sbaIntToDt property.
     * 
     * @return
     *     possible object is
     *     {@link SBAIntToDtType }
     *     
     */
    public SBAIntToDtType getSBAIntToDt() {
        return sbaIntToDt;
    }

    /**
     * Sets the value of the sbaIntToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBAIntToDtType }
     *     
     */
    public void setSBAIntToDt(SBAIntToDtType value) {
        this.sbaIntToDt = value;
    }

    /**
     * Gets the value of the prevPoolId property.
     * 
     * @return
     *     possible object is
     *     {@link PrevPoolIdType }
     *     
     */
    public PrevPoolIdType getPrevPoolId() {
        return prevPoolId;
    }

    /**
     * Sets the value of the prevPoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevPoolIdType }
     *     
     */
    public void setPrevPoolId(PrevPoolIdType value) {
        this.prevPoolId = value;
    }

    /**
     * Gets the value of the svcReclassProcCode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcReclassProcCodeType }
     *     
     */
    public SvcReclassProcCodeType getSvcReclassProcCode() {
        return svcReclassProcCode;
    }

    /**
     * Sets the value of the svcReclassProcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcReclassProcCodeType }
     *     
     */
    public void setSvcReclassProcCode(SvcReclassProcCodeType value) {
        this.svcReclassProcCode = value;
    }

    /**
     * Gets the value of the svcReclassEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcReclassEffDtType }
     *     
     */
    public SvcReclassEffDtType getSvcReclassEffDt() {
        return svcReclassEffDt;
    }

    /**
     * Sets the value of the svcReclassEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcReclassEffDtType }
     *     
     */
    public void setSvcReclassEffDt(SvcReclassEffDtType value) {
        this.svcReclassEffDt = value;
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
