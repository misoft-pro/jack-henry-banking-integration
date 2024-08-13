
package pro.misoft.jackhenryintegration.generated.transaction;

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
 * <p>Java class for IntlWireTrnAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntlWireTrnAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCorrelId_Type"/&gt;
 *         &lt;element name="WireAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}WireAcctId_Type"/&gt;
 *         &lt;element name="WireAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireQuoteId" type="{http://jackhenry.com/jxchange/TPG/2008}WireQuoteId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireContrRefId" type="{http://jackhenry.com/jxchange/TPG/2008}WireContrRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FundMthdType" type="{http://jackhenry.com/jxchange/TPG/2008}FundMthdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireIntlQuoteRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntlQuoteRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WireIntlCustInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntlCustInfoRec_CType"/&gt;
 *         &lt;element name="WireIntlTrnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireIntlTrnInfoRec_CType"/&gt;
 *         &lt;element name="WireUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}WireUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlBalCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalCalcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="WireCompId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompId_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompEmplId" type="{http://jackhenry.com/jxchange/TPG/2008}EmplId_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompEmplName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompVerifId" type="{http://jackhenry.com/jxchange/TPG/2008}WireVerifId_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireCompVerifName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FraudRefId" type="{http://jackhenry.com/jxchange/TPG/2008}FraudRefId_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "IntlWireTrnAddRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "wireCorrelId",
    "wireAcctId",
    "wireAcctType",
    "wireQuoteId",
    "wireContrRefId",
    "fundMthdType",
    "wireIntlQuoteRec",
    "wireIntlCustInfoRec",
    "wireIntlTrnInfoRec",
    "wireUsrId",
    "intnetFinInstId",
    "avlBalCalcCode",
    "custom",
    "ver1",
    "wireCompId",
    "wireCompEmplId",
    "wireCompEmplName",
    "wireCompVerifId",
    "wireCompVerifName",
    "ver2",
    "fraudRefId",
    "ver3",
    "any"
})
public class IntlWireTrnAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "WireCorrelId", required = true)
    protected WireCorrelIdType wireCorrelId;
    @XmlElement(name = "WireAcctId", required = true)
    protected WireAcctIdType wireAcctId;
    @XmlElementRef(name = "WireAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctTypeType> wireAcctType;
    @XmlElementRef(name = "WireQuoteId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireQuoteIdType> wireQuoteId;
    @XmlElementRef(name = "WireContrRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireContrRefIdType> wireContrRefId;
    @XmlElementRef(name = "FundMthdType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FundMthdTypeType> fundMthdType;
    @XmlElementRef(name = "WireIntlQuoteRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireIntlQuoteRecCType> wireIntlQuoteRec;
    @XmlElement(name = "WireIntlCustInfoRec", required = true)
    protected WireIntlCustInfoRecCType wireIntlCustInfoRec;
    @XmlElement(name = "WireIntlTrnInfoRec", required = true)
    protected WireIntlTrnInfoRecCType wireIntlTrnInfoRec;
    @XmlElementRef(name = "WireUsrId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireUsrIdType> wireUsrId;
    @XmlElementRef(name = "IntnetFinInstId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntnetFinInstIdType> intnetFinInstId;
    @XmlElementRef(name = "AvlBalCalcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvlBalCalcCodeType> avlBalCalcCode;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "WireCompId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireCompIdType> wireCompId;
    @XmlElementRef(name = "WireCompEmplId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplIdType> wireCompEmplId;
    @XmlElementRef(name = "WireCompEmplName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplNameType> wireCompEmplName;
    @XmlElementRef(name = "WireCompVerifId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireVerifIdType> wireCompVerifId;
    @XmlElementRef(name = "WireCompVerifName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmplNameType> wireCompVerifName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "FraudRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudRefIdType> fraudRefId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public MsgRqHdrCType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrCType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the errOvrRdInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<ErrOvrRdInfoArrayAType> getErrOvrRdInfoArray() {
        return errOvrRdInfoArray;
    }

    /**
     * Sets the value of the errOvrRdInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public void setErrOvrRdInfoArray(JAXBElement<ErrOvrRdInfoArrayAType> value) {
        this.errOvrRdInfoArray = value;
    }

    /**
     * Gets the value of the wireCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link WireCorrelIdType }
     *     
     */
    public WireCorrelIdType getWireCorrelId() {
        return wireCorrelId;
    }

    /**
     * Sets the value of the wireCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCorrelIdType }
     *     
     */
    public void setWireCorrelId(WireCorrelIdType value) {
        this.wireCorrelId = value;
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
     * Gets the value of the wireAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public JAXBElement<AcctTypeType> getWireAcctType() {
        return wireAcctType;
    }

    /**
     * Sets the value of the wireAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public void setWireAcctType(JAXBElement<AcctTypeType> value) {
        this.wireAcctType = value;
    }

    /**
     * Gets the value of the wireQuoteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireQuoteIdType }{@code >}
     *     
     */
    public JAXBElement<WireQuoteIdType> getWireQuoteId() {
        return wireQuoteId;
    }

    /**
     * Sets the value of the wireQuoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireQuoteIdType }{@code >}
     *     
     */
    public void setWireQuoteId(JAXBElement<WireQuoteIdType> value) {
        this.wireQuoteId = value;
    }

    /**
     * Gets the value of the wireContrRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireContrRefIdType }{@code >}
     *     
     */
    public JAXBElement<WireContrRefIdType> getWireContrRefId() {
        return wireContrRefId;
    }

    /**
     * Sets the value of the wireContrRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireContrRefIdType }{@code >}
     *     
     */
    public void setWireContrRefId(JAXBElement<WireContrRefIdType> value) {
        this.wireContrRefId = value;
    }

    /**
     * Gets the value of the fundMthdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FundMthdTypeType }{@code >}
     *     
     */
    public JAXBElement<FundMthdTypeType> getFundMthdType() {
        return fundMthdType;
    }

    /**
     * Sets the value of the fundMthdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FundMthdTypeType }{@code >}
     *     
     */
    public void setFundMthdType(JAXBElement<FundMthdTypeType> value) {
        this.fundMthdType = value;
    }

    /**
     * Gets the value of the wireIntlQuoteRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireIntlQuoteRecCType }{@code >}
     *     
     */
    public JAXBElement<WireIntlQuoteRecCType> getWireIntlQuoteRec() {
        return wireIntlQuoteRec;
    }

    /**
     * Sets the value of the wireIntlQuoteRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireIntlQuoteRecCType }{@code >}
     *     
     */
    public void setWireIntlQuoteRec(JAXBElement<WireIntlQuoteRecCType> value) {
        this.wireIntlQuoteRec = value;
    }

    /**
     * Gets the value of the wireIntlCustInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireIntlCustInfoRecCType }
     *     
     */
    public WireIntlCustInfoRecCType getWireIntlCustInfoRec() {
        return wireIntlCustInfoRec;
    }

    /**
     * Sets the value of the wireIntlCustInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIntlCustInfoRecCType }
     *     
     */
    public void setWireIntlCustInfoRec(WireIntlCustInfoRecCType value) {
        this.wireIntlCustInfoRec = value;
    }

    /**
     * Gets the value of the wireIntlTrnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireIntlTrnInfoRecCType }
     *     
     */
    public WireIntlTrnInfoRecCType getWireIntlTrnInfoRec() {
        return wireIntlTrnInfoRec;
    }

    /**
     * Sets the value of the wireIntlTrnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireIntlTrnInfoRecCType }
     *     
     */
    public void setWireIntlTrnInfoRec(WireIntlTrnInfoRecCType value) {
        this.wireIntlTrnInfoRec = value;
    }

    /**
     * Gets the value of the wireUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireUsrIdType }{@code >}
     *     
     */
    public JAXBElement<WireUsrIdType> getWireUsrId() {
        return wireUsrId;
    }

    /**
     * Sets the value of the wireUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireUsrIdType }{@code >}
     *     
     */
    public void setWireUsrId(JAXBElement<WireUsrIdType> value) {
        this.wireUsrId = value;
    }

    /**
     * Gets the value of the intnetFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstIdType }{@code >}
     *     
     */
    public JAXBElement<IntnetFinInstIdType> getIntnetFinInstId() {
        return intnetFinInstId;
    }

    /**
     * Sets the value of the intnetFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntnetFinInstIdType }{@code >}
     *     
     */
    public void setIntnetFinInstId(JAXBElement<IntnetFinInstIdType> value) {
        this.intnetFinInstId = value;
    }

    /**
     * Gets the value of the avlBalCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public JAXBElement<AvlBalCalcCodeType> getAvlBalCalcCode() {
        return avlBalCalcCode;
    }

    /**
     * Sets the value of the avlBalCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public void setAvlBalCalcCode(JAXBElement<AvlBalCalcCodeType> value) {
        this.avlBalCalcCode = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
     * Gets the value of the wireCompId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireCompIdType }{@code >}
     *     
     */
    public JAXBElement<WireCompIdType> getWireCompId() {
        return wireCompId;
    }

    /**
     * Sets the value of the wireCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireCompIdType }{@code >}
     *     
     */
    public void setWireCompId(JAXBElement<WireCompIdType> value) {
        this.wireCompId = value;
    }

    /**
     * Gets the value of the wireCompEmplId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplIdType }{@code >}
     *     
     */
    public JAXBElement<EmplIdType> getWireCompEmplId() {
        return wireCompEmplId;
    }

    /**
     * Sets the value of the wireCompEmplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplIdType }{@code >}
     *     
     */
    public void setWireCompEmplId(JAXBElement<EmplIdType> value) {
        this.wireCompEmplId = value;
    }

    /**
     * Gets the value of the wireCompEmplName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public JAXBElement<EmplNameType> getWireCompEmplName() {
        return wireCompEmplName;
    }

    /**
     * Sets the value of the wireCompEmplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public void setWireCompEmplName(JAXBElement<EmplNameType> value) {
        this.wireCompEmplName = value;
    }

    /**
     * Gets the value of the wireCompVerifId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}
     *     
     */
    public JAXBElement<WireVerifIdType> getWireCompVerifId() {
        return wireCompVerifId;
    }

    /**
     * Sets the value of the wireCompVerifId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}
     *     
     */
    public void setWireCompVerifId(JAXBElement<WireVerifIdType> value) {
        this.wireCompVerifId = value;
    }

    /**
     * Gets the value of the wireCompVerifName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public JAXBElement<EmplNameType> getWireCompVerifName() {
        return wireCompVerifName;
    }

    /**
     * Sets the value of the wireCompVerifName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}
     *     
     */
    public void setWireCompVerifName(JAXBElement<EmplNameType> value) {
        this.wireCompVerifName = value;
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
     * Gets the value of the fraudRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}
     *     
     */
    public JAXBElement<FraudRefIdType> getFraudRefId() {
        return fraudRefId;
    }

    /**
     * Sets the value of the fraudRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}
     *     
     */
    public void setFraudRefId(JAXBElement<FraudRefIdType> value) {
        this.fraudRefId = value;
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
     * {@link Element }
     * {@link Object }
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
