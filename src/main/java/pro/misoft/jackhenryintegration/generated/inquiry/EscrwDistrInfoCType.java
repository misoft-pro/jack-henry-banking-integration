
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
 * <p>Java class for EscrwDistrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwDistrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwDistrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AgentName" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtAgentDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AgentPhoneNumArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrType" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrPerChkCnt" type="{http://jackhenry.com/jxchange/TPG/2008}DistrPerChkCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrChkRefType" type="{http://jackhenry.com/jxchange/TPG/2008}DistrChkRefType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrRptType" type="{http://jackhenry.com/jxchange/TPG/2008}DistrRptType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistrResrvPct" type="{http://jackhenry.com/jxchange/TPG/2008}DistrResrvPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtDistrPdNotType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtDistrPdNotType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwDistrInfo_CType", propOrder = {
    "escrwDistrDesc",
    "agentName",
    "distrAddr",
    "agentPhoneNumArray",
    "escrwDistrType",
    "distrAcctId",
    "distrAcctType",
    "achInstRtId",
    "distrPerChkCnt",
    "distrChkRefType",
    "distrRptType",
    "distrResrvPct",
    "prtDistrPdNotType",
    "custom",
    "ver1",
    "any"
})
public class EscrwDistrInfoCType {

    @XmlElement(name = "EscrwDistrDesc")
    protected EscrwDistrDescType escrwDistrDesc;
    @XmlElement(name = "AgentName")
    protected EscrwPmtAgentDescType agentName;
    @XmlElement(name = "DistrAddr")
    protected AddrCType distrAddr;
    @XmlElement(name = "AgentPhoneNumArray")
    protected PhoneArrayAType agentPhoneNumArray;
    @XmlElement(name = "EscrwDistrType")
    protected EscrwDistrTypeType escrwDistrType;
    @XmlElement(name = "DistrAcctId")
    protected AcctIdType distrAcctId;
    @XmlElement(name = "DistrAcctType")
    protected AcctTypeType distrAcctType;
    @XmlElement(name = "ACHInstRtId")
    protected InstRtIdType achInstRtId;
    @XmlElement(name = "DistrPerChkCnt")
    protected DistrPerChkCntType distrPerChkCnt;
    @XmlElement(name = "DistrChkRefType")
    protected DistrChkRefTypeType distrChkRefType;
    @XmlElement(name = "DistrRptType")
    protected DistrRptTypeType distrRptType;
    @XmlElement(name = "DistrResrvPct")
    protected DistrResrvPctType distrResrvPct;
    @XmlElement(name = "PrtDistrPdNotType")
    protected PrtDistrPdNotTypeType prtDistrPdNotType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwDistrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwDistrDescType }
     *     
     */
    public EscrwDistrDescType getEscrwDistrDesc() {
        return escrwDistrDesc;
    }

    /**
     * Sets the value of the escrwDistrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwDistrDescType }
     *     
     */
    public void setEscrwDistrDesc(EscrwDistrDescType value) {
        this.escrwDistrDesc = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPmtAgentDescType }
     *     
     */
    public EscrwPmtAgentDescType getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPmtAgentDescType }
     *     
     */
    public void setAgentName(EscrwPmtAgentDescType value) {
        this.agentName = value;
    }

    /**
     * Gets the value of the distrAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getDistrAddr() {
        return distrAddr;
    }

    /**
     * Sets the value of the distrAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setDistrAddr(AddrCType value) {
        this.distrAddr = value;
    }

    /**
     * Gets the value of the agentPhoneNumArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getAgentPhoneNumArray() {
        return agentPhoneNumArray;
    }

    /**
     * Sets the value of the agentPhoneNumArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setAgentPhoneNumArray(PhoneArrayAType value) {
        this.agentPhoneNumArray = value;
    }

    /**
     * Gets the value of the escrwDistrType property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwDistrTypeType }
     *     
     */
    public EscrwDistrTypeType getEscrwDistrType() {
        return escrwDistrType;
    }

    /**
     * Sets the value of the escrwDistrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwDistrTypeType }
     *     
     */
    public void setEscrwDistrType(EscrwDistrTypeType value) {
        this.escrwDistrType = value;
    }

    /**
     * Gets the value of the distrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getDistrAcctId() {
        return distrAcctId;
    }

    /**
     * Sets the value of the distrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setDistrAcctId(AcctIdType value) {
        this.distrAcctId = value;
    }

    /**
     * Gets the value of the distrAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getDistrAcctType() {
        return distrAcctType;
    }

    /**
     * Sets the value of the distrAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setDistrAcctType(AcctTypeType value) {
        this.distrAcctType = value;
    }

    /**
     * Gets the value of the achInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getACHInstRtId() {
        return achInstRtId;
    }

    /**
     * Sets the value of the achInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setACHInstRtId(InstRtIdType value) {
        this.achInstRtId = value;
    }

    /**
     * Gets the value of the distrPerChkCnt property.
     * 
     * @return
     *     possible object is
     *     {@link DistrPerChkCntType }
     *     
     */
    public DistrPerChkCntType getDistrPerChkCnt() {
        return distrPerChkCnt;
    }

    /**
     * Sets the value of the distrPerChkCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrPerChkCntType }
     *     
     */
    public void setDistrPerChkCnt(DistrPerChkCntType value) {
        this.distrPerChkCnt = value;
    }

    /**
     * Gets the value of the distrChkRefType property.
     * 
     * @return
     *     possible object is
     *     {@link DistrChkRefTypeType }
     *     
     */
    public DistrChkRefTypeType getDistrChkRefType() {
        return distrChkRefType;
    }

    /**
     * Sets the value of the distrChkRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrChkRefTypeType }
     *     
     */
    public void setDistrChkRefType(DistrChkRefTypeType value) {
        this.distrChkRefType = value;
    }

    /**
     * Gets the value of the distrRptType property.
     * 
     * @return
     *     possible object is
     *     {@link DistrRptTypeType }
     *     
     */
    public DistrRptTypeType getDistrRptType() {
        return distrRptType;
    }

    /**
     * Sets the value of the distrRptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrRptTypeType }
     *     
     */
    public void setDistrRptType(DistrRptTypeType value) {
        this.distrRptType = value;
    }

    /**
     * Gets the value of the distrResrvPct property.
     * 
     * @return
     *     possible object is
     *     {@link DistrResrvPctType }
     *     
     */
    public DistrResrvPctType getDistrResrvPct() {
        return distrResrvPct;
    }

    /**
     * Sets the value of the distrResrvPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrResrvPctType }
     *     
     */
    public void setDistrResrvPct(DistrResrvPctType value) {
        this.distrResrvPct = value;
    }

    /**
     * Gets the value of the prtDistrPdNotType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtDistrPdNotTypeType }
     *     
     */
    public PrtDistrPdNotTypeType getPrtDistrPdNotType() {
        return prtDistrPdNotType;
    }

    /**
     * Sets the value of the prtDistrPdNotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtDistrPdNotTypeType }
     *     
     */
    public void setPrtDistrPdNotType(PrtDistrPdNotTypeType value) {
        this.prtDistrPdNotType = value;
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
