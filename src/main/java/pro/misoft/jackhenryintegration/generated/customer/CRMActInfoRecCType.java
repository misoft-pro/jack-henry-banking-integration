
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CRMActInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMActInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMActDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActCrtOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActOffArray" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ActCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActRecv" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRMActSumCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActSumCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="MeetLocCode" type="{http://jackhenry.com/jxchange/TPG/2008}MeetLocCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ActExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CRMRelEventInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CRMRelEventInfo_CType" minOccurs="0"/&gt;
 *             &lt;element name="CRMActTime" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActTime_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="MeetStartTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartTimeDt_Type" minOccurs="0"/&gt;
 *               &lt;element name="MeetEndTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndTimeDt_Type" minOccurs="0"/&gt;
 *               &lt;element name="CRAMeetType" type="{http://jackhenry.com/jxchange/TPG/2008}CRAMeetType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="WorkflowProcStat" type="{http://jackhenry.com/jxchange/TPG/2008}WorkflowProcStat_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMActInfoRec_CType", propOrder = {
    "crmActDt",
    "actCrtOffCode",
    "actOffArray",
    "actCmnt",
    "crmActRecv",
    "crmActStatCode",
    "custom",
    "ver1",
    "purpCode",
    "crmActSumCode",
    "meetLocCode",
    "actExpDt",
    "ver2",
    "crmRelEventInfo",
    "crmActTime",
    "ver3",
    "meetStartTimeDt",
    "meetEndTimeDt",
    "craMeetType",
    "ver4",
    "workflowProcStat",
    "ver5",
    "any"
})
public class CRMActInfoRecCType {

    @XmlElement(name = "CRMActDt")
    protected CRMActDtType crmActDt;
    @XmlElement(name = "ActCrtOffCode")
    protected CRMOffCodeType actCrtOffCode;
    @XmlElement(name = "ActOffArray")
    protected CRMOffArrayAType actOffArray;
    @XmlElement(name = "ActCmnt")
    protected CRMCmntType actCmnt;
    @XmlElement(name = "CRMActRecv")
    protected CRMActRecvType crmActRecv;
    @XmlElement(name = "CRMActStatCode")
    protected CRMActStatCodeType crmActStatCode;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PurpCode")
    protected PurpCodeType purpCode;
    @XmlElement(name = "CRMActSumCode")
    protected CRMActSumCodeType crmActSumCode;
    @XmlElement(name = "MeetLocCode")
    protected MeetLocCodeType meetLocCode;
    @XmlElement(name = "ActExpDt")
    protected ExpDtType actExpDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CRMRelEventInfo")
    protected CRMRelEventInfoCType crmRelEventInfo;
    @XmlElement(name = "CRMActTime")
    protected CRMActTimeType crmActTime;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "MeetStartTimeDt")
    protected StartTimeDtType meetStartTimeDt;
    @XmlElement(name = "MeetEndTimeDt")
    protected EndTimeDtType meetEndTimeDt;
    @XmlElement(name = "CRAMeetType")
    protected CRAMeetTypeType craMeetType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "WorkflowProcStat")
    protected WorkflowProcStatType workflowProcStat;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the crmActDt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActDtType }
     *     
     */
    public CRMActDtType getCRMActDt() {
        return crmActDt;
    }

    /**
     * Sets the value of the crmActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActDtType }
     *     
     */
    public void setCRMActDt(CRMActDtType value) {
        this.crmActDt = value;
    }

    /**
     * Gets the value of the actCrtOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getActCrtOffCode() {
        return actCrtOffCode;
    }

    /**
     * Sets the value of the actCrtOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setActCrtOffCode(CRMOffCodeType value) {
        this.actCrtOffCode = value;
    }

    /**
     * Gets the value of the actOffArray property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public CRMOffArrayAType getActOffArray() {
        return actOffArray;
    }

    /**
     * Sets the value of the actOffArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public void setActOffArray(CRMOffArrayAType value) {
        this.actOffArray = value;
    }

    /**
     * Gets the value of the actCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMCmntType }
     *     
     */
    public CRMCmntType getActCmnt() {
        return actCmnt;
    }

    /**
     * Sets the value of the actCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMCmntType }
     *     
     */
    public void setActCmnt(CRMCmntType value) {
        this.actCmnt = value;
    }

    /**
     * Gets the value of the crmActRecv property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActRecvType }
     *     
     */
    public CRMActRecvType getCRMActRecv() {
        return crmActRecv;
    }

    /**
     * Sets the value of the crmActRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActRecvType }
     *     
     */
    public void setCRMActRecv(CRMActRecvType value) {
        this.crmActRecv = value;
    }

    /**
     * Gets the value of the crmActStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActStatCodeType }
     *     
     */
    public CRMActStatCodeType getCRMActStatCode() {
        return crmActStatCode;
    }

    /**
     * Sets the value of the crmActStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActStatCodeType }
     *     
     */
    public void setCRMActStatCode(CRMActStatCodeType value) {
        this.crmActStatCode = value;
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
     * Gets the value of the purpCode property.
     * 
     * @return
     *     possible object is
     *     {@link PurpCodeType }
     *     
     */
    public PurpCodeType getPurpCode() {
        return purpCode;
    }

    /**
     * Sets the value of the purpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpCodeType }
     *     
     */
    public void setPurpCode(PurpCodeType value) {
        this.purpCode = value;
    }

    /**
     * Gets the value of the crmActSumCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActSumCodeType }
     *     
     */
    public CRMActSumCodeType getCRMActSumCode() {
        return crmActSumCode;
    }

    /**
     * Sets the value of the crmActSumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActSumCodeType }
     *     
     */
    public void setCRMActSumCode(CRMActSumCodeType value) {
        this.crmActSumCode = value;
    }

    /**
     * Gets the value of the meetLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeetLocCodeType }
     *     
     */
    public MeetLocCodeType getMeetLocCode() {
        return meetLocCode;
    }

    /**
     * Sets the value of the meetLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetLocCodeType }
     *     
     */
    public void setMeetLocCode(MeetLocCodeType value) {
        this.meetLocCode = value;
    }

    /**
     * Gets the value of the actExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getActExpDt() {
        return actExpDt;
    }

    /**
     * Sets the value of the actExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setActExpDt(ExpDtType value) {
        this.actExpDt = value;
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
     * Gets the value of the crmRelEventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CRMRelEventInfoCType }
     *     
     */
    public CRMRelEventInfoCType getCRMRelEventInfo() {
        return crmRelEventInfo;
    }

    /**
     * Sets the value of the crmRelEventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMRelEventInfoCType }
     *     
     */
    public void setCRMRelEventInfo(CRMRelEventInfoCType value) {
        this.crmRelEventInfo = value;
    }

    /**
     * Gets the value of the crmActTime property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActTimeType }
     *     
     */
    public CRMActTimeType getCRMActTime() {
        return crmActTime;
    }

    /**
     * Sets the value of the crmActTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActTimeType }
     *     
     */
    public void setCRMActTime(CRMActTimeType value) {
        this.crmActTime = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
    }

    /**
     * Gets the value of the meetStartTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartTimeDtType }
     *     
     */
    public StartTimeDtType getMeetStartTimeDt() {
        return meetStartTimeDt;
    }

    /**
     * Sets the value of the meetStartTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTimeDtType }
     *     
     */
    public void setMeetStartTimeDt(StartTimeDtType value) {
        this.meetStartTimeDt = value;
    }

    /**
     * Gets the value of the meetEndTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndTimeDtType }
     *     
     */
    public EndTimeDtType getMeetEndTimeDt() {
        return meetEndTimeDt;
    }

    /**
     * Sets the value of the meetEndTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndTimeDtType }
     *     
     */
    public void setMeetEndTimeDt(EndTimeDtType value) {
        this.meetEndTimeDt = value;
    }

    /**
     * Gets the value of the craMeetType property.
     * 
     * @return
     *     possible object is
     *     {@link CRAMeetTypeType }
     *     
     */
    public CRAMeetTypeType getCRAMeetType() {
        return craMeetType;
    }

    /**
     * Sets the value of the craMeetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRAMeetTypeType }
     *     
     */
    public void setCRAMeetType(CRAMeetTypeType value) {
        this.craMeetType = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
    }

    /**
     * Gets the value of the workflowProcStat property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowProcStatType }
     *     
     */
    public WorkflowProcStatType getWorkflowProcStat() {
        return workflowProcStat;
    }

    /**
     * Sets the value of the workflowProcStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowProcStatType }
     *     
     */
    public void setWorkflowProcStat(WorkflowProcStatType value) {
        this.workflowProcStat = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
