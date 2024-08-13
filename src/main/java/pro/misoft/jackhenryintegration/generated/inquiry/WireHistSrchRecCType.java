
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
 * <p>Java class for WireHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnType_Type"/&gt;
 *         &lt;element name="WireDt" type="{http://jackhenry.com/jxchange/TPG/2008}WireDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}WireSeqId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireStat" type="{http://jackhenry.com/jxchange/TPG/2008}WireStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireAmt_Type"/&gt;
 *         &lt;element name="WireSrc" type="{http://jackhenry.com/jxchange/TPG/2008}WireSrc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}WireUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAnlysCode" type="{http://jackhenry.com/jxchange/TPG/2008}WireAnlysCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAnlysDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireAnlysDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireFeeCntr" type="{http://jackhenry.com/jxchange/TPG/2008}WireFeeCntr_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireNotType" type="{http://jackhenry.com/jxchange/TPG/2008}WireNotType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireType" type="{http://jackhenry.com/jxchange/TPG/2008}WireType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSubType" type="{http://jackhenry.com/jxchange/TPG/2008}WireSubType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRefId" type="{http://jackhenry.com/jxchange/TPG/2008}WireRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIMAD" type="{http://jackhenry.com/jxchange/TPG/2008}WireIMAD_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOMAD" type="{http://jackhenry.com/jxchange/TPG/2008}WireOMAD_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignRefId" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfRefId" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSndrRtId" type="{http://jackhenry.com/jxchange/TPG/2008}WireSndrRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSndrFIName" type="{http://jackhenry.com/jxchange/TPG/2008}WireSndrFIName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSndrFIAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireFuncType" type="{http://jackhenry.com/jxchange/TPG/2008}WireFuncType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignFIId" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignFIId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignFIName" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignFIName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignFIAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireHistSrchRec_CType", propOrder = {
    "wireTrnType",
    "wireDt",
    "wireSeqId",
    "wireStat",
    "wireStatDesc",
    "wireAmt",
    "wireSrc",
    "wireUsrId",
    "wireAnlysCode",
    "wireAnlysDesc",
    "wireFeeAmt",
    "wireFeeCntr",
    "wireNotType",
    "wireType",
    "wireSubType",
    "wireRefId",
    "wireIMAD",
    "wireOMAD",
    "wireOrignAcctId",
    "wireOrignName",
    "wireOrignAddr",
    "wireBenfAcctId",
    "wireBenfName",
    "wireBenfAddr",
    "wireOrignRefId",
    "wireBenfRefId",
    "wireSndrRtId",
    "wireSndrFIName",
    "wireSndrFIAddr",
    "wireFuncType",
    "wireOrignFIId",
    "wireOrignFIName",
    "wireOrignFIAddr",
    "ver1",
    "trnRcptId",
    "ver2",
    "any"
})
public class WireHistSrchRecCType {

    @XmlElement(name = "WireTrnType", required = true)
    protected WireTrnTypeType wireTrnType;
    @XmlElement(name = "WireDt")
    protected WireDtType wireDt;
    @XmlElement(name = "WireSeqId")
    protected WireSeqIdType wireSeqId;
    @XmlElement(name = "WireStat")
    protected WireStatType wireStat;
    @XmlElement(name = "WireStatDesc")
    protected WireStatDescType wireStatDesc;
    @XmlElement(name = "WireAmt", required = true)
    protected WireAmtType wireAmt;
    @XmlElement(name = "WireSrc")
    protected WireSrcType wireSrc;
    @XmlElement(name = "WireUsrId")
    protected WireUsrIdType wireUsrId;
    @XmlElement(name = "WireAnlysCode")
    protected WireAnlysCodeType wireAnlysCode;
    @XmlElement(name = "WireAnlysDesc")
    protected WireAnlysDescType wireAnlysDesc;
    @XmlElement(name = "WireFeeAmt")
    protected WireFeeAmtType wireFeeAmt;
    @XmlElement(name = "WireFeeCntr")
    protected WireFeeCntrType wireFeeCntr;
    @XmlElement(name = "WireNotType")
    protected WireNotTypeType wireNotType;
    @XmlElement(name = "WireType")
    protected WireTypeType wireType;
    @XmlElement(name = "WireSubType")
    protected WireSubTypeType wireSubType;
    @XmlElement(name = "WireRefId")
    protected WireRefIdType wireRefId;
    @XmlElement(name = "WireIMAD")
    protected WireIMADType wireIMAD;
    @XmlElement(name = "WireOMAD")
    protected WireOMADType wireOMAD;
    @XmlElement(name = "WireOrignAcctId")
    protected AcctIdType wireOrignAcctId;
    @XmlElement(name = "WireOrignName")
    protected PersonNameCType wireOrignName;
    @XmlElement(name = "WireOrignAddr")
    protected AddrCType wireOrignAddr;
    @XmlElement(name = "WireBenfAcctId")
    protected AcctIdType wireBenfAcctId;
    @XmlElement(name = "WireBenfName")
    protected PersonNameCType wireBenfName;
    @XmlElement(name = "WireBenfAddr")
    protected AddrCType wireBenfAddr;
    @XmlElement(name = "WireOrignRefId")
    protected WireOrignRefIdType wireOrignRefId;
    @XmlElement(name = "WireBenfRefId")
    protected WireBenfRefIdType wireBenfRefId;
    @XmlElement(name = "WireSndrRtId")
    protected WireSndrRtIdType wireSndrRtId;
    @XmlElement(name = "WireSndrFIName")
    protected WireSndrFINameType wireSndrFIName;
    @XmlElement(name = "WireSndrFIAddr")
    protected AddrCType wireSndrFIAddr;
    @XmlElement(name = "WireFuncType")
    protected WireFuncTypeType wireFuncType;
    @XmlElement(name = "WireOrignFIId")
    protected WireOrignFIIdType wireOrignFIId;
    @XmlElement(name = "WireOrignFIName")
    protected WireOrignFINameType wireOrignFIName;
    @XmlElement(name = "WireOrignFIAddr")
    protected AddrCType wireOrignFIAddr;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TrnRcptId")
    protected TrnRcptIdType trnRcptId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnTypeType }
     *     
     */
    public WireTrnTypeType getWireTrnType() {
        return wireTrnType;
    }

    /**
     * Sets the value of the wireTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnTypeType }
     *     
     */
    public void setWireTrnType(WireTrnTypeType value) {
        this.wireTrnType = value;
    }

    /**
     * Gets the value of the wireDt property.
     * 
     * @return
     *     possible object is
     *     {@link WireDtType }
     *     
     */
    public WireDtType getWireDt() {
        return wireDt;
    }

    /**
     * Sets the value of the wireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDtType }
     *     
     */
    public void setWireDt(WireDtType value) {
        this.wireDt = value;
    }

    /**
     * Gets the value of the wireSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link WireSeqIdType }
     *     
     */
    public WireSeqIdType getWireSeqId() {
        return wireSeqId;
    }

    /**
     * Sets the value of the wireSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSeqIdType }
     *     
     */
    public void setWireSeqId(WireSeqIdType value) {
        this.wireSeqId = value;
    }

    /**
     * Gets the value of the wireStat property.
     * 
     * @return
     *     possible object is
     *     {@link WireStatType }
     *     
     */
    public WireStatType getWireStat() {
        return wireStat;
    }

    /**
     * Sets the value of the wireStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireStatType }
     *     
     */
    public void setWireStat(WireStatType value) {
        this.wireStat = value;
    }

    /**
     * Gets the value of the wireStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WireStatDescType }
     *     
     */
    public WireStatDescType getWireStatDesc() {
        return wireStatDesc;
    }

    /**
     * Sets the value of the wireStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireStatDescType }
     *     
     */
    public void setWireStatDesc(WireStatDescType value) {
        this.wireStatDesc = value;
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
     * Gets the value of the wireSrc property.
     * 
     * @return
     *     possible object is
     *     {@link WireSrcType }
     *     
     */
    public WireSrcType getWireSrc() {
        return wireSrc;
    }

    /**
     * Sets the value of the wireSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSrcType }
     *     
     */
    public void setWireSrc(WireSrcType value) {
        this.wireSrc = value;
    }

    /**
     * Gets the value of the wireUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link WireUsrIdType }
     *     
     */
    public WireUsrIdType getWireUsrId() {
        return wireUsrId;
    }

    /**
     * Sets the value of the wireUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireUsrIdType }
     *     
     */
    public void setWireUsrId(WireUsrIdType value) {
        this.wireUsrId = value;
    }

    /**
     * Gets the value of the wireAnlysCode property.
     * 
     * @return
     *     possible object is
     *     {@link WireAnlysCodeType }
     *     
     */
    public WireAnlysCodeType getWireAnlysCode() {
        return wireAnlysCode;
    }

    /**
     * Sets the value of the wireAnlysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAnlysCodeType }
     *     
     */
    public void setWireAnlysCode(WireAnlysCodeType value) {
        this.wireAnlysCode = value;
    }

    /**
     * Gets the value of the wireAnlysDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WireAnlysDescType }
     *     
     */
    public WireAnlysDescType getWireAnlysDesc() {
        return wireAnlysDesc;
    }

    /**
     * Sets the value of the wireAnlysDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAnlysDescType }
     *     
     */
    public void setWireAnlysDesc(WireAnlysDescType value) {
        this.wireAnlysDesc = value;
    }

    /**
     * Gets the value of the wireFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireFeeAmtType }
     *     
     */
    public WireFeeAmtType getWireFeeAmt() {
        return wireFeeAmt;
    }

    /**
     * Sets the value of the wireFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFeeAmtType }
     *     
     */
    public void setWireFeeAmt(WireFeeAmtType value) {
        this.wireFeeAmt = value;
    }

    /**
     * Gets the value of the wireFeeCntr property.
     * 
     * @return
     *     possible object is
     *     {@link WireFeeCntrType }
     *     
     */
    public WireFeeCntrType getWireFeeCntr() {
        return wireFeeCntr;
    }

    /**
     * Sets the value of the wireFeeCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFeeCntrType }
     *     
     */
    public void setWireFeeCntr(WireFeeCntrType value) {
        this.wireFeeCntr = value;
    }

    /**
     * Gets the value of the wireNotType property.
     * 
     * @return
     *     possible object is
     *     {@link WireNotTypeType }
     *     
     */
    public WireNotTypeType getWireNotType() {
        return wireNotType;
    }

    /**
     * Sets the value of the wireNotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireNotTypeType }
     *     
     */
    public void setWireNotType(WireNotTypeType value) {
        this.wireNotType = value;
    }

    /**
     * Gets the value of the wireType property.
     * 
     * @return
     *     possible object is
     *     {@link WireTypeType }
     *     
     */
    public WireTypeType getWireType() {
        return wireType;
    }

    /**
     * Sets the value of the wireType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTypeType }
     *     
     */
    public void setWireType(WireTypeType value) {
        this.wireType = value;
    }

    /**
     * Gets the value of the wireSubType property.
     * 
     * @return
     *     possible object is
     *     {@link WireSubTypeType }
     *     
     */
    public WireSubTypeType getWireSubType() {
        return wireSubType;
    }

    /**
     * Sets the value of the wireSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSubTypeType }
     *     
     */
    public void setWireSubType(WireSubTypeType value) {
        this.wireSubType = value;
    }

    /**
     * Gets the value of the wireRefId property.
     * 
     * @return
     *     possible object is
     *     {@link WireRefIdType }
     *     
     */
    public WireRefIdType getWireRefId() {
        return wireRefId;
    }

    /**
     * Sets the value of the wireRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireRefIdType }
     *     
     */
    public void setWireRefId(WireRefIdType value) {
        this.wireRefId = value;
    }

    /**
     * Gets the value of the wireIMAD property.
     * 
     * @return
     *     possible object is
     *     {@link WireIMADType }
     *     
     */
    public WireIMADType getWireIMAD() {
        return wireIMAD;
    }

    /**
     * Sets the value of the wireIMAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIMADType }
     *     
     */
    public void setWireIMAD(WireIMADType value) {
        this.wireIMAD = value;
    }

    /**
     * Gets the value of the wireOMAD property.
     * 
     * @return
     *     possible object is
     *     {@link WireOMADType }
     *     
     */
    public WireOMADType getWireOMAD() {
        return wireOMAD;
    }

    /**
     * Sets the value of the wireOMAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOMADType }
     *     
     */
    public void setWireOMAD(WireOMADType value) {
        this.wireOMAD = value;
    }

    /**
     * Gets the value of the wireOrignAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getWireOrignAcctId() {
        return wireOrignAcctId;
    }

    /**
     * Sets the value of the wireOrignAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setWireOrignAcctId(AcctIdType value) {
        this.wireOrignAcctId = value;
    }

    /**
     * Gets the value of the wireOrignName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getWireOrignName() {
        return wireOrignName;
    }

    /**
     * Sets the value of the wireOrignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setWireOrignName(PersonNameCType value) {
        this.wireOrignName = value;
    }

    /**
     * Gets the value of the wireOrignAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireOrignAddr() {
        return wireOrignAddr;
    }

    /**
     * Sets the value of the wireOrignAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireOrignAddr(AddrCType value) {
        this.wireOrignAddr = value;
    }

    /**
     * Gets the value of the wireBenfAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getWireBenfAcctId() {
        return wireBenfAcctId;
    }

    /**
     * Sets the value of the wireBenfAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setWireBenfAcctId(AcctIdType value) {
        this.wireBenfAcctId = value;
    }

    /**
     * Gets the value of the wireBenfName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getWireBenfName() {
        return wireBenfName;
    }

    /**
     * Sets the value of the wireBenfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setWireBenfName(PersonNameCType value) {
        this.wireBenfName = value;
    }

    /**
     * Gets the value of the wireBenfAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireBenfAddr() {
        return wireBenfAddr;
    }

    /**
     * Sets the value of the wireBenfAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireBenfAddr(AddrCType value) {
        this.wireBenfAddr = value;
    }

    /**
     * Gets the value of the wireOrignRefId property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignRefIdType }
     *     
     */
    public WireOrignRefIdType getWireOrignRefId() {
        return wireOrignRefId;
    }

    /**
     * Sets the value of the wireOrignRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignRefIdType }
     *     
     */
    public void setWireOrignRefId(WireOrignRefIdType value) {
        this.wireOrignRefId = value;
    }

    /**
     * Gets the value of the wireBenfRefId property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfRefIdType }
     *     
     */
    public WireBenfRefIdType getWireBenfRefId() {
        return wireBenfRefId;
    }

    /**
     * Sets the value of the wireBenfRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfRefIdType }
     *     
     */
    public void setWireBenfRefId(WireBenfRefIdType value) {
        this.wireBenfRefId = value;
    }

    /**
     * Gets the value of the wireSndrRtId property.
     * 
     * @return
     *     possible object is
     *     {@link WireSndrRtIdType }
     *     
     */
    public WireSndrRtIdType getWireSndrRtId() {
        return wireSndrRtId;
    }

    /**
     * Sets the value of the wireSndrRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSndrRtIdType }
     *     
     */
    public void setWireSndrRtId(WireSndrRtIdType value) {
        this.wireSndrRtId = value;
    }

    /**
     * Gets the value of the wireSndrFIName property.
     * 
     * @return
     *     possible object is
     *     {@link WireSndrFINameType }
     *     
     */
    public WireSndrFINameType getWireSndrFIName() {
        return wireSndrFIName;
    }

    /**
     * Sets the value of the wireSndrFIName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSndrFINameType }
     *     
     */
    public void setWireSndrFIName(WireSndrFINameType value) {
        this.wireSndrFIName = value;
    }

    /**
     * Gets the value of the wireSndrFIAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireSndrFIAddr() {
        return wireSndrFIAddr;
    }

    /**
     * Sets the value of the wireSndrFIAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireSndrFIAddr(AddrCType value) {
        this.wireSndrFIAddr = value;
    }

    /**
     * Gets the value of the wireFuncType property.
     * 
     * @return
     *     possible object is
     *     {@link WireFuncTypeType }
     *     
     */
    public WireFuncTypeType getWireFuncType() {
        return wireFuncType;
    }

    /**
     * Sets the value of the wireFuncType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFuncTypeType }
     *     
     */
    public void setWireFuncType(WireFuncTypeType value) {
        this.wireFuncType = value;
    }

    /**
     * Gets the value of the wireOrignFIId property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignFIIdType }
     *     
     */
    public WireOrignFIIdType getWireOrignFIId() {
        return wireOrignFIId;
    }

    /**
     * Sets the value of the wireOrignFIId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignFIIdType }
     *     
     */
    public void setWireOrignFIId(WireOrignFIIdType value) {
        this.wireOrignFIId = value;
    }

    /**
     * Gets the value of the wireOrignFIName property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignFINameType }
     *     
     */
    public WireOrignFINameType getWireOrignFIName() {
        return wireOrignFIName;
    }

    /**
     * Sets the value of the wireOrignFIName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignFINameType }
     *     
     */
    public void setWireOrignFIName(WireOrignFINameType value) {
        this.wireOrignFIName = value;
    }

    /**
     * Gets the value of the wireOrignFIAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireOrignFIAddr() {
        return wireOrignFIAddr;
    }

    /**
     * Sets the value of the wireOrignFIAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireOrignFIAddr(AddrCType value) {
        this.wireOrignFIAddr = value;
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
     * Gets the value of the trnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRcptIdType }
     *     
     */
    public TrnRcptIdType getTrnRcptId() {
        return trnRcptId;
    }

    /**
     * Sets the value of the trnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRcptIdType }
     *     
     */
    public void setTrnRcptId(TrnRcptIdType value) {
        this.trnRcptId = value;
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
