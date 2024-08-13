
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
 * <p>Java class for ChkRiskAlertRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkRiskAlertRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkSignerName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="ChkSignerAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="MonstrInstrType" type="{http://jackhenry.com/jxchange/TPG/2008}MontrInstrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskActDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskActDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrivAlrtType" type="{http://jackhenry.com/jxchange/TPG/2008}PrivAlrtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlrtCrtTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}AlrtEventTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastRiskRptTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastRiskRptTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskStatArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ChkRiskAlertRec_CType", propOrder = {
    "trnInstRtId",
    "trnAcctId",
    "chkNum",
    "amt",
    "chkSignerName",
    "chkSignerAddr",
    "monstrInstrType",
    "chkRiskActDesc",
    "privAlrtType",
    "alrtCrtTimeDt",
    "lastRiskRptTimeDt",
    "trnRiskStatArray",
    "ver1",
    "any"
})
public class ChkRiskAlertRecCType {

    @XmlElement(name = "TrnInstRtId")
    protected InstRtIdType trnInstRtId;
    @XmlElement(name = "TrnAcctId")
    protected AcctIdType trnAcctId;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "ChkSignerName")
    protected PersonNameCType chkSignerName;
    @XmlElement(name = "ChkSignerAddr")
    protected AddrCType chkSignerAddr;
    @XmlElement(name = "MonstrInstrType")
    protected MontrInstrTypeType monstrInstrType;
    @XmlElement(name = "ChkRiskActDesc")
    protected ChkRiskActDescType chkRiskActDesc;
    @XmlElement(name = "PrivAlrtType")
    protected PrivAlrtTypeType privAlrtType;
    @XmlElement(name = "AlrtCrtTimeDt")
    protected AlrtEventTimeDtType alrtCrtTimeDt;
    @XmlElement(name = "LastRiskRptTimeDt")
    protected LastRiskRptTimeDtType lastRiskRptTimeDt;
    @XmlElement(name = "TrnRiskStatArray")
    protected TrnRiskStatArrayAType trnRiskStatArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trnInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getTrnInstRtId() {
        return trnInstRtId;
    }

    /**
     * Sets the value of the trnInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setTrnInstRtId(InstRtIdType value) {
        this.trnInstRtId = value;
    }

    /**
     * Gets the value of the trnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getTrnAcctId() {
        return trnAcctId;
    }

    /**
     * Sets the value of the trnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setTrnAcctId(AcctIdType value) {
        this.trnAcctId = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setChkNum(ChkNumType value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the chkSignerName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getChkSignerName() {
        return chkSignerName;
    }

    /**
     * Sets the value of the chkSignerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setChkSignerName(PersonNameCType value) {
        this.chkSignerName = value;
    }

    /**
     * Gets the value of the chkSignerAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getChkSignerAddr() {
        return chkSignerAddr;
    }

    /**
     * Sets the value of the chkSignerAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setChkSignerAddr(AddrCType value) {
        this.chkSignerAddr = value;
    }

    /**
     * Gets the value of the monstrInstrType property.
     * 
     * @return
     *     possible object is
     *     {@link MontrInstrTypeType }
     *     
     */
    public MontrInstrTypeType getMonstrInstrType() {
        return monstrInstrType;
    }

    /**
     * Sets the value of the monstrInstrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MontrInstrTypeType }
     *     
     */
    public void setMonstrInstrType(MontrInstrTypeType value) {
        this.monstrInstrType = value;
    }

    /**
     * Gets the value of the chkRiskActDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskActDescType }
     *     
     */
    public ChkRiskActDescType getChkRiskActDesc() {
        return chkRiskActDesc;
    }

    /**
     * Sets the value of the chkRiskActDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskActDescType }
     *     
     */
    public void setChkRiskActDesc(ChkRiskActDescType value) {
        this.chkRiskActDesc = value;
    }

    /**
     * Gets the value of the privAlrtType property.
     * 
     * @return
     *     possible object is
     *     {@link PrivAlrtTypeType }
     *     
     */
    public PrivAlrtTypeType getPrivAlrtType() {
        return privAlrtType;
    }

    /**
     * Sets the value of the privAlrtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivAlrtTypeType }
     *     
     */
    public void setPrivAlrtType(PrivAlrtTypeType value) {
        this.privAlrtType = value;
    }

    /**
     * Gets the value of the alrtCrtTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link AlrtEventTimeDtType }
     *     
     */
    public AlrtEventTimeDtType getAlrtCrtTimeDt() {
        return alrtCrtTimeDt;
    }

    /**
     * Sets the value of the alrtCrtTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlrtEventTimeDtType }
     *     
     */
    public void setAlrtCrtTimeDt(AlrtEventTimeDtType value) {
        this.alrtCrtTimeDt = value;
    }

    /**
     * Gets the value of the lastRiskRptTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastRiskRptTimeDtType }
     *     
     */
    public LastRiskRptTimeDtType getLastRiskRptTimeDt() {
        return lastRiskRptTimeDt;
    }

    /**
     * Sets the value of the lastRiskRptTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRiskRptTimeDtType }
     *     
     */
    public void setLastRiskRptTimeDt(LastRiskRptTimeDtType value) {
        this.lastRiskRptTimeDt = value;
    }

    /**
     * Gets the value of the trnRiskStatArray property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatArrayAType }
     *     
     */
    public TrnRiskStatArrayAType getTrnRiskStatArray() {
        return trnRiskStatArray;
    }

    /**
     * Sets the value of the trnRiskStatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatArrayAType }
     *     
     */
    public void setTrnRiskStatArray(TrnRiskStatArrayAType value) {
        this.trnRiskStatArray = value;
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
