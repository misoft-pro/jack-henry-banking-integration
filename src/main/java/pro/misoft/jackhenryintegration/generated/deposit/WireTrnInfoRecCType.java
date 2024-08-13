
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WireTrnInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTrnInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAnlysCode" type="{http://jackhenry.com/jxchange/TPG/2008}WireAnlysCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTmpltDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireTmpltDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireStat" type="{http://jackhenry.com/jxchange/TPG/2008}WireStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireNotType" type="{http://jackhenry.com/jxchange/TPG/2008}WireNotType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireTrfTypeCode" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrfTypeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireType" type="{http://jackhenry.com/jxchange/TPG/2008}WireType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSubType" type="{http://jackhenry.com/jxchange/TPG/2008}WireSubType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireFuncType" type="{http://jackhenry.com/jxchange/TPG/2008}WireFuncType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRefId" type="{http://jackhenry.com/jxchange/TPG/2008}WireRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSrc" type="{http://jackhenry.com/jxchange/TPG/2008}WireSrc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRecvFinInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}WireRecvFinInstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireRecvFinInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireRecvFinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}WireRecvFinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireOthXferInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireOthXferInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireBenfInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireBenfInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireOrignToBenfInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireOrignToBenfInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireFinInstToFinInstInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireFinInstToFinInstInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireInfoRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireSchedRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireSchedRecArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "WireTrnInfoRec_CType", propOrder = {
    "wireAmt",
    "wireTrnType",
    "taxId",
    "offCode",
    "wireAnlysCode",
    "wireFeeAmt",
    "wireTmpltDesc",
    "wireStat",
    "brCode",
    "glCostCtr",
    "glProdCode",
    "wireNotType",
    "wireTrfTypeCode",
    "wireType",
    "wireSubType",
    "wireFuncType",
    "wireRefId",
    "wireSrc",
    "intnetFinInstId",
    "wireRecvFinInstRtId",
    "wireRecvFinInstAddr",
    "wireRecvFinInstName",
    "wireOrignName",
    "wireOrignAddr",
    "wireOthXferInfoRec",
    "wireBenfInfoRec",
    "wireOrignInfoRec",
    "wireOrignToBenfInfoRec",
    "wireFinInstToFinInstInfoRec",
    "wireRmkArray",
    "wireInfoRmkArray",
    "wireSchedRecArray",
    "custom",
    "ver1",
    "entityTmpltCorrelId",
    "ver2",
    "any"
})
public class WireTrnInfoRecCType {

    @XmlElement(name = "WireAmt")
    protected WireAmtType wireAmt;
    @XmlElement(name = "WireTrnType")
    protected WireTrnTypeType wireTrnType;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "WireAnlysCode")
    protected WireAnlysCodeType wireAnlysCode;
    @XmlElement(name = "WireFeeAmt")
    protected WireFeeAmtType wireFeeAmt;
    @XmlElement(name = "WireTmpltDesc")
    protected WireTmpltDescType wireTmpltDesc;
    @XmlElement(name = "WireStat")
    protected WireStatType wireStat;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "WireNotType")
    protected WireNotTypeType wireNotType;
    @XmlElement(name = "WireTrfTypeCode")
    protected WireTrfTypeCodeType wireTrfTypeCode;
    @XmlElement(name = "WireType")
    protected WireTypeType wireType;
    @XmlElement(name = "WireSubType")
    protected WireSubTypeType wireSubType;
    @XmlElement(name = "WireFuncType")
    protected WireFuncTypeType wireFuncType;
    @XmlElement(name = "WireRefId")
    protected WireRefIdType wireRefId;
    @XmlElement(name = "WireSrc")
    protected WireSrcType wireSrc;
    @XmlElement(name = "IntnetFinInstId")
    protected IntnetFinInstIdType intnetFinInstId;
    @XmlElement(name = "WireRecvFinInstRtId")
    protected WireRecvFinInstRtIdType wireRecvFinInstRtId;
    @XmlElement(name = "WireRecvFinInstAddr")
    protected AddrCType wireRecvFinInstAddr;
    @XmlElement(name = "WireRecvFinInstName")
    protected WireRecvFinInstNameType wireRecvFinInstName;
    @XmlElement(name = "WireOrignName")
    protected PersonNameCType wireOrignName;
    @XmlElement(name = "WireOrignAddr")
    protected AddrCType wireOrignAddr;
    @XmlElement(name = "WireOthXferInfoRec")
    protected WireOthXferInfoRecCType wireOthXferInfoRec;
    @XmlElement(name = "WireBenfInfoRec")
    protected WireBenfInfoRecCType wireBenfInfoRec;
    @XmlElement(name = "WireOrignInfoRec")
    protected WireOrignInfoRecCType wireOrignInfoRec;
    @XmlElement(name = "WireOrignToBenfInfoRec")
    protected WireOrignToBenfInfoRecCType wireOrignToBenfInfoRec;
    @XmlElement(name = "WireFinInstToFinInstInfoRec")
    protected WireFinInstToFinInstInfoRecCType wireFinInstToFinInstInfoRec;
    @XmlElement(name = "WireRmkArray")
    protected RmkAType wireRmkArray;
    @XmlElement(name = "WireInfoRmkArray")
    protected RmkAType wireInfoRmkArray;
    @XmlElement(name = "WireSchedRecArray")
    protected WireSchedRecArrayAType wireSchedRecArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EntityTmpltCorrelId")
    protected BusCorrelIdType entityTmpltCorrelId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
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
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setGLCostCtr(GLCostCtrType value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdCodeType }
     *     
     */
    public GLProdCodeType getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdCodeType }
     *     
     */
    public void setGLProdCode(GLProdCodeType value) {
        this.glProdCode = value;
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
     * Gets the value of the wireTrfTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrfTypeCodeType }
     *     
     */
    public WireTrfTypeCodeType getWireTrfTypeCode() {
        return wireTrfTypeCode;
    }

    /**
     * Sets the value of the wireTrfTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrfTypeCodeType }
     *     
     */
    public void setWireTrfTypeCode(WireTrfTypeCodeType value) {
        this.wireTrfTypeCode = value;
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
     * Gets the value of the wireRecvFinInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link WireRecvFinInstRtIdType }
     *     
     */
    public WireRecvFinInstRtIdType getWireRecvFinInstRtId() {
        return wireRecvFinInstRtId;
    }

    /**
     * Sets the value of the wireRecvFinInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireRecvFinInstRtIdType }
     *     
     */
    public void setWireRecvFinInstRtId(WireRecvFinInstRtIdType value) {
        this.wireRecvFinInstRtId = value;
    }

    /**
     * Gets the value of the wireRecvFinInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getWireRecvFinInstAddr() {
        return wireRecvFinInstAddr;
    }

    /**
     * Sets the value of the wireRecvFinInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setWireRecvFinInstAddr(AddrCType value) {
        this.wireRecvFinInstAddr = value;
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
     * Gets the value of the wireOthXferInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireOthXferInfoRecCType }
     *     
     */
    public WireOthXferInfoRecCType getWireOthXferInfoRec() {
        return wireOthXferInfoRec;
    }

    /**
     * Sets the value of the wireOthXferInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOthXferInfoRecCType }
     *     
     */
    public void setWireOthXferInfoRec(WireOthXferInfoRecCType value) {
        this.wireOthXferInfoRec = value;
    }

    /**
     * Gets the value of the wireBenfInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireBenfInfoRecCType }
     *     
     */
    public WireBenfInfoRecCType getWireBenfInfoRec() {
        return wireBenfInfoRec;
    }

    /**
     * Sets the value of the wireBenfInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBenfInfoRecCType }
     *     
     */
    public void setWireBenfInfoRec(WireBenfInfoRecCType value) {
        this.wireBenfInfoRec = value;
    }

    /**
     * Gets the value of the wireOrignInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignInfoRecCType }
     *     
     */
    public WireOrignInfoRecCType getWireOrignInfoRec() {
        return wireOrignInfoRec;
    }

    /**
     * Sets the value of the wireOrignInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignInfoRecCType }
     *     
     */
    public void setWireOrignInfoRec(WireOrignInfoRecCType value) {
        this.wireOrignInfoRec = value;
    }

    /**
     * Gets the value of the wireOrignToBenfInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireOrignToBenfInfoRecCType }
     *     
     */
    public WireOrignToBenfInfoRecCType getWireOrignToBenfInfoRec() {
        return wireOrignToBenfInfoRec;
    }

    /**
     * Sets the value of the wireOrignToBenfInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireOrignToBenfInfoRecCType }
     *     
     */
    public void setWireOrignToBenfInfoRec(WireOrignToBenfInfoRecCType value) {
        this.wireOrignToBenfInfoRec = value;
    }

    /**
     * Gets the value of the wireFinInstToFinInstInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireFinInstToFinInstInfoRecCType }
     *     
     */
    public WireFinInstToFinInstInfoRecCType getWireFinInstToFinInstInfoRec() {
        return wireFinInstToFinInstInfoRec;
    }

    /**
     * Sets the value of the wireFinInstToFinInstInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireFinInstToFinInstInfoRecCType }
     *     
     */
    public void setWireFinInstToFinInstInfoRec(WireFinInstToFinInstInfoRecCType value) {
        this.wireFinInstToFinInstInfoRec = value;
    }

    /**
     * Gets the value of the wireRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireRmkArray() {
        return wireRmkArray;
    }

    /**
     * Sets the value of the wireRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireRmkArray(RmkAType value) {
        this.wireRmkArray = value;
    }

    /**
     * Gets the value of the wireInfoRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireInfoRmkArray() {
        return wireInfoRmkArray;
    }

    /**
     * Sets the value of the wireInfoRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireInfoRmkArray(RmkAType value) {
        this.wireInfoRmkArray = value;
    }

    /**
     * Gets the value of the wireSchedRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link WireSchedRecArrayAType }
     *     
     */
    public WireSchedRecArrayAType getWireSchedRecArray() {
        return wireSchedRecArray;
    }

    /**
     * Sets the value of the wireSchedRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSchedRecArrayAType }
     *     
     */
    public void setWireSchedRecArray(WireSchedRecArrayAType value) {
        this.wireSchedRecArray = value;
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
