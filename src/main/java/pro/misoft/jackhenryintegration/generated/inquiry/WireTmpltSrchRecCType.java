
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
 * <p>Java class for WireTmpltSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTmpltSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireTmpltId" type="{http://jackhenry.com/jxchange/TPG/2008}WireTmpltId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTmpltDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireTmpltDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}WireAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfName" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfId" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRecvFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireRecvFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSched" type="{http://jackhenry.com/jxchange/TPG/2008}WireSched_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedStat" type="{http://jackhenry.com/jxchange/TPG/2008}WireSchedStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedNextDt" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferNextDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedFreq" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferFreqUnits_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EntityTmpltCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}BusCorrelId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireTmpltSrchRec_CType", propOrder = {
    "wireTmpltId",
    "wireTmpltDesc",
    "wireAcctId",
    "custId",
    "wireAmt",
    "wireBenfName",
    "wireBenfId",
    "wireRecvFinInstName",
    "intnetFinInstId",
    "wireAcctType",
    "wireSched",
    "wireSchedStat",
    "wireSchedNextDt",
    "wireSchedFreq",
    "wireSchedFreqUnits",
    "ver1",
    "entityTmpltCorrelId",
    "ver2",
    "any"
})
public class WireTmpltSrchRecCType {

    @XmlElement(name = "WireTmpltId")
    protected WireTmpltIdType wireTmpltId;
    @XmlElement(name = "WireTmpltDesc")
    protected WireTmpltDescType wireTmpltDesc;
    @XmlElement(name = "WireAcctId")
    protected WireAcctIdType wireAcctId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "WireAmt")
    protected WireAmtType wireAmt;
    @XmlElement(name = "WireBenfName")
    protected WireBenfNameType wireBenfName;
    @XmlElement(name = "WireBenfId")
    protected WireBenfIdType wireBenfId;
    @XmlElement(name = "WireRecvFinInstName")
    protected WireRecvFinInstNameType wireRecvFinInstName;
    @XmlElement(name = "IntnetFinInstId")
    protected IntnetFinInstIdType intnetFinInstId;
    @XmlElement(name = "WireAcctType")
    protected AcctTypeType wireAcctType;
    @XmlElement(name = "WireSched")
    protected WireSchedType wireSched;
    @XmlElement(name = "WireSchedStat")
    protected WireSchedStatType wireSchedStat;
    @XmlElement(name = "WireSchedNextDt")
    protected FutXferNextDtType wireSchedNextDt;
    @XmlElement(name = "WireSchedFreq")
    protected FutXferFreqType wireSchedFreq;
    @XmlElement(name = "WireSchedFreqUnits")
    protected FutXferFreqUnitsType wireSchedFreqUnits;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EntityTmpltCorrelId")
    protected BusCorrelIdType entityTmpltCorrelId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireTmpltId property.
     * 
     * @return
     *     possible object is
     *     {@link WireTmpltIdType }
     *     
     */
    public WireTmpltIdType getWireTmpltId() {
        return wireTmpltId;
    }

    /**
     * Sets the value of the wireTmpltId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTmpltIdType }
     *     
     */
    public void setWireTmpltId(WireTmpltIdType value) {
        this.wireTmpltId = value;
    }

    /**
     * Gets the value of the wireTmpltDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WireTmpltDescType }
     *     
     */
    public WireTmpltDescType getWireTmpltDesc() {
        return wireTmpltDesc;
    }

    /**
     * Sets the value of the wireTmpltDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTmpltDescType }
     *     
     */
    public void setWireTmpltDesc(WireTmpltDescType value) {
        this.wireTmpltDesc = value;
    }

    /**
     * Gets the value of the wireAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link WireAcctIdType }
     *     
     */
    public WireAcctIdType getWireAcctId() {
        return wireAcctId;
    }

    /**
     * Sets the value of the wireAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAcctIdType }
     *     
     */
    public void setWireAcctId(WireAcctIdType value) {
        this.wireAcctId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the wireAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireAmtType }
     *     
     */
    public WireAmtType getWireAmt() {
        return wireAmt;
    }

    /**
     * Sets the value of the wireAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAmtType }
     *     
     */
    public void setWireAmt(WireAmtType value) {
        this.wireAmt = value;
    }

    /**
     * Gets the value of the wireBenfName property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfNameType }
     *     
     */
    public WireBenfNameType getWireBenfName() {
        return wireBenfName;
    }

    /**
     * Sets the value of the wireBenfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfNameType }
     *     
     */
    public void setWireBenfName(WireBenfNameType value) {
        this.wireBenfName = value;
    }

    /**
     * Gets the value of the wireBenfId property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfIdType }
     *     
     */
    public WireBenfIdType getWireBenfId() {
        return wireBenfId;
    }

    /**
     * Sets the value of the wireBenfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfIdType }
     *     
     */
    public void setWireBenfId(WireBenfIdType value) {
        this.wireBenfId = value;
    }

    /**
     * Gets the value of the wireRecvFinInstName property.
     * 
     * @return
     *     possible object is
     *     {@link WireRecvFinInstNameType }
     *     
     */
    public WireRecvFinInstNameType getWireRecvFinInstName() {
        return wireRecvFinInstName;
    }

    /**
     * Sets the value of the wireRecvFinInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireRecvFinInstNameType }
     *     
     */
    public void setWireRecvFinInstName(WireRecvFinInstNameType value) {
        this.wireRecvFinInstName = value;
    }

    /**
     * Gets the value of the intnetFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstIdType }
     *     
     */
    public IntnetFinInstIdType getIntnetFinInstId() {
        return intnetFinInstId;
    }

    /**
     * Sets the value of the intnetFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstIdType }
     *     
     */
    public void setIntnetFinInstId(IntnetFinInstIdType value) {
        this.intnetFinInstId = value;
    }

    /**
     * Gets the value of the wireAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getWireAcctType() {
        return wireAcctType;
    }

    /**
     * Sets the value of the wireAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setWireAcctType(AcctTypeType value) {
        this.wireAcctType = value;
    }

    /**
     * Gets the value of the wireSched property.
     * 
     * @return
     *     possible object is
     *     {@link WireSchedType }
     *     
     */
    public WireSchedType getWireSched() {
        return wireSched;
    }

    /**
     * Sets the value of the wireSched property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSchedType }
     *     
     */
    public void setWireSched(WireSchedType value) {
        this.wireSched = value;
    }

    /**
     * Gets the value of the wireSchedStat property.
     * 
     * @return
     *     possible object is
     *     {@link WireSchedStatType }
     *     
     */
    public WireSchedStatType getWireSchedStat() {
        return wireSchedStat;
    }

    /**
     * Sets the value of the wireSchedStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSchedStatType }
     *     
     */
    public void setWireSchedStat(WireSchedStatType value) {
        this.wireSchedStat = value;
    }

    /**
     * Gets the value of the wireSchedNextDt property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferNextDtType }
     *     
     */
    public FutXferNextDtType getWireSchedNextDt() {
        return wireSchedNextDt;
    }

    /**
     * Sets the value of the wireSchedNextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferNextDtType }
     *     
     */
    public void setWireSchedNextDt(FutXferNextDtType value) {
        this.wireSchedNextDt = value;
    }

    /**
     * Gets the value of the wireSchedFreq property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqType }
     *     
     */
    public FutXferFreqType getWireSchedFreq() {
        return wireSchedFreq;
    }

    /**
     * Sets the value of the wireSchedFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqType }
     *     
     */
    public void setWireSchedFreq(FutXferFreqType value) {
        this.wireSchedFreq = value;
    }

    /**
     * Gets the value of the wireSchedFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public FutXferFreqUnitsType getWireSchedFreqUnits() {
        return wireSchedFreqUnits;
    }

    /**
     * Sets the value of the wireSchedFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferFreqUnitsType }
     *     
     */
    public void setWireSchedFreqUnits(FutXferFreqUnitsType value) {
        this.wireSchedFreqUnits = value;
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
     * Gets the value of the entityTmpltCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link BusCorrelIdType }
     *     
     */
    public BusCorrelIdType getEntityTmpltCorrelId() {
        return entityTmpltCorrelId;
    }

    /**
     * Sets the value of the entityTmpltCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusCorrelIdType }
     *     
     */
    public void setEntityTmpltCorrelId(BusCorrelIdType value) {
        this.entityTmpltCorrelId = value;
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
