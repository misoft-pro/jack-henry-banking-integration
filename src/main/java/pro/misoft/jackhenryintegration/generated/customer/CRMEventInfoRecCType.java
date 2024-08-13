
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
 * <p>Java class for CRMEventInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMEventInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMEventDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMEventDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCrtOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMEventRecv" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventRecv_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventPrivType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMPrivType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}EventStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventCatCode" type="{http://jackhenry.com/jxchange/TPG/2008}EventCatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMOffArray" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CRMAcctArray" type="{http://jackhenry.com/jxchange/TPG/2008}CRMAcctArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PotSaleId" type="{http://jackhenry.com/jxchange/TPG/2008}PotSaleId_Type" minOccurs="0"/&gt;
 *           &lt;element name="EscltDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscltDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CRMTerRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *             &lt;element name="WorkflowProcStat" type="{http://jackhenry.com/jxchange/TPG/2008}WorkflowProcStat_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="RmndSchedEnable" type="{http://jackhenry.com/jxchange/TPG/2008}RmndSchedEnable_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="LobbyQueId" type="{http://jackhenry.com/jxchange/TPG/2008}LobbyQueId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CRMEventInfoRec_CType", propOrder = {
    "crmEventDt",
    "crmEventDesc",
    "eventCrtOffCode",
    "eventOffCode",
    "eventCmnt",
    "crmEventRecv",
    "eventPrivType",
    "eventDueDt",
    "eventStatCode",
    "eventCatCode",
    "crmOffArray",
    "crmAcctArray",
    "userDefInfoArray",
    "custom",
    "ver1",
    "potSaleId",
    "escltDt",
    "ver2",
    "crmTerRsnDesc",
    "workflowProcStat",
    "ver3",
    "rmndSchedEnable",
    "ver4",
    "lobbyQueId",
    "ver5",
    "any"
})
public class CRMEventInfoRecCType {

    @XmlElement(name = "CRMEventDt")
    protected CRMEventDtType crmEventDt;
    @XmlElement(name = "CRMEventDesc")
    protected CRMEventDescType crmEventDesc;
    @XmlElement(name = "EventCrtOffCode")
    protected CRMOffCodeType eventCrtOffCode;
    @XmlElement(name = "EventOffCode")
    protected CRMOffCodeType eventOffCode;
    @XmlElement(name = "EventCmnt")
    protected CRMCmntType eventCmnt;
    @XmlElement(name = "CRMEventRecv")
    protected CRMEventRecvType crmEventRecv;
    @XmlElement(name = "EventPrivType")
    protected CRMPrivTypeType eventPrivType;
    @XmlElement(name = "EventDueDt")
    protected CRMEventDueDtType eventDueDt;
    @XmlElement(name = "EventStatCode")
    protected EventStatCodeType eventStatCode;
    @XmlElement(name = "EventCatCode")
    protected EventCatCodeType eventCatCode;
    @XmlElement(name = "CRMOffArray")
    protected CRMOffArrayAType crmOffArray;
    @XmlElement(name = "CRMAcctArray")
    protected CRMAcctArrayAType crmAcctArray;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PotSaleId")
    protected PotSaleIdType potSaleId;
    @XmlElement(name = "EscltDt")
    protected EscltDtType escltDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CRMTerRsnDesc")
    protected RmkType crmTerRsnDesc;
    @XmlElement(name = "WorkflowProcStat")
    protected WorkflowProcStatType workflowProcStat;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "RmndSchedEnable")
    protected RmndSchedEnableType rmndSchedEnable;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "LobbyQueId")
    protected LobbyQueIdType lobbyQueId;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the crmEventDt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventDtType }
     *     
     */
    public CRMEventDtType getCRMEventDt() {
        return crmEventDt;
    }

    /**
     * Sets the value of the crmEventDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventDtType }
     *     
     */
    public void setCRMEventDt(CRMEventDtType value) {
        this.crmEventDt = value;
    }

    /**
     * Gets the value of the crmEventDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventDescType }
     *     
     */
    public CRMEventDescType getCRMEventDesc() {
        return crmEventDesc;
    }

    /**
     * Sets the value of the crmEventDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventDescType }
     *     
     */
    public void setCRMEventDesc(CRMEventDescType value) {
        this.crmEventDesc = value;
    }

    /**
     * Gets the value of the eventCrtOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getEventCrtOffCode() {
        return eventCrtOffCode;
    }

    /**
     * Sets the value of the eventCrtOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setEventCrtOffCode(CRMOffCodeType value) {
        this.eventCrtOffCode = value;
    }

    /**
     * Gets the value of the eventOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getEventOffCode() {
        return eventOffCode;
    }

    /**
     * Sets the value of the eventOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setEventOffCode(CRMOffCodeType value) {
        this.eventOffCode = value;
    }

    /**
     * Gets the value of the eventCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMCmntType }
     *     
     */
    public CRMCmntType getEventCmnt() {
        return eventCmnt;
    }

    /**
     * Sets the value of the eventCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMCmntType }
     *     
     */
    public void setEventCmnt(CRMCmntType value) {
        this.eventCmnt = value;
    }

    /**
     * Gets the value of the crmEventRecv property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventRecvType }
     *     
     */
    public CRMEventRecvType getCRMEventRecv() {
        return crmEventRecv;
    }

    /**
     * Sets the value of the crmEventRecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventRecvType }
     *     
     */
    public void setCRMEventRecv(CRMEventRecvType value) {
        this.crmEventRecv = value;
    }

    /**
     * Gets the value of the eventPrivType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMPrivTypeType }
     *     
     */
    public CRMPrivTypeType getEventPrivType() {
        return eventPrivType;
    }

    /**
     * Sets the value of the eventPrivType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMPrivTypeType }
     *     
     */
    public void setEventPrivType(CRMPrivTypeType value) {
        this.eventPrivType = value;
    }

    /**
     * Gets the value of the eventDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventDueDtType }
     *     
     */
    public CRMEventDueDtType getEventDueDt() {
        return eventDueDt;
    }

    /**
     * Sets the value of the eventDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventDueDtType }
     *     
     */
    public void setEventDueDt(CRMEventDueDtType value) {
        this.eventDueDt = value;
    }

    /**
     * Gets the value of the eventStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatCodeType }
     *     
     */
    public EventStatCodeType getEventStatCode() {
        return eventStatCode;
    }

    /**
     * Sets the value of the eventStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatCodeType }
     *     
     */
    public void setEventStatCode(EventStatCodeType value) {
        this.eventStatCode = value;
    }

    /**
     * Gets the value of the eventCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventCatCodeType }
     *     
     */
    public EventCatCodeType getEventCatCode() {
        return eventCatCode;
    }

    /**
     * Sets the value of the eventCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCatCodeType }
     *     
     */
    public void setEventCatCode(EventCatCodeType value) {
        this.eventCatCode = value;
    }

    /**
     * Gets the value of the crmOffArray property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public CRMOffArrayAType getCRMOffArray() {
        return crmOffArray;
    }

    /**
     * Sets the value of the crmOffArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffArrayAType }
     *     
     */
    public void setCRMOffArray(CRMOffArrayAType value) {
        this.crmOffArray = value;
    }

    /**
     * Gets the value of the crmAcctArray property.
     * 
     * @return
     *     possible object is
     *     {@link CRMAcctArrayAType }
     *     
     */
    public CRMAcctArrayAType getCRMAcctArray() {
        return crmAcctArray;
    }

    /**
     * Sets the value of the crmAcctArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMAcctArrayAType }
     *     
     */
    public void setCRMAcctArray(CRMAcctArrayAType value) {
        this.crmAcctArray = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
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
     * Gets the value of the potSaleId property.
     * 
     * @return
     *     possible object is
     *     {@link PotSaleIdType }
     *     
     */
    public PotSaleIdType getPotSaleId() {
        return potSaleId;
    }

    /**
     * Sets the value of the potSaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotSaleIdType }
     *     
     */
    public void setPotSaleId(PotSaleIdType value) {
        this.potSaleId = value;
    }

    /**
     * Gets the value of the escltDt property.
     * 
     * @return
     *     possible object is
     *     {@link EscltDtType }
     *     
     */
    public EscltDtType getEscltDt() {
        return escltDt;
    }

    /**
     * Sets the value of the escltDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscltDtType }
     *     
     */
    public void setEscltDt(EscltDtType value) {
        this.escltDt = value;
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
     * Gets the value of the crmTerRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getCRMTerRsnDesc() {
        return crmTerRsnDesc;
    }

    /**
     * Sets the value of the crmTerRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setCRMTerRsnDesc(RmkType value) {
        this.crmTerRsnDesc = value;
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
     * Gets the value of the rmndSchedEnable property.
     * 
     * @return
     *     possible object is
     *     {@link RmndSchedEnableType }
     *     
     */
    public RmndSchedEnableType getRmndSchedEnable() {
        return rmndSchedEnable;
    }

    /**
     * Sets the value of the rmndSchedEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmndSchedEnableType }
     *     
     */
    public void setRmndSchedEnable(RmndSchedEnableType value) {
        this.rmndSchedEnable = value;
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
     * Gets the value of the lobbyQueId property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyQueIdType }
     *     
     */
    public LobbyQueIdType getLobbyQueId() {
        return lobbyQueId;
    }

    /**
     * Sets the value of the lobbyQueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyQueIdType }
     *     
     */
    public void setLobbyQueId(LobbyQueIdType value) {
        this.lobbyQueId = value;
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
