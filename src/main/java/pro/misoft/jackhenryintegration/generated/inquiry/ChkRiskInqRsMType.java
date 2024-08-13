
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
 * <p>Java class for ChkRiskInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkRiskInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="TrnInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnChanType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnChanType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TellerNum" type="{http://jackhenry.com/jxchange/TPG/2008}TellerNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProcCntlId" type="{http://jackhenry.com/jxchange/TPG/2008}ProcCntlId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="HomePhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="WorkPhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerify" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerify_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskInqRsRec" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskInqRsRec_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="MontrInstrType" type="{http://jackhenry.com/jxchange/TPG/2008}MontrInstrType_Type" minOccurs="0"/&gt;
 *           &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *           &lt;element name="x_ChkRiskAuxInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_ChkRiskAuxInqRec_CType" minOccurs="0"/&gt;
 *           &lt;element name="TrnRiskStatSumArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="ChkRiskInqSumRec" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskInqSumRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "ChkRiskInqRs_MType", propOrder = {
    "msgRsHdr",
    "trnInstRtId",
    "trnAcctId",
    "trnChanType",
    "brCode",
    "tellerNum",
    "amt",
    "chkNum",
    "procCntlId",
    "personName",
    "addr",
    "homePhoneNum",
    "workPhoneNum",
    "idVerify",
    "taxId",
    "birthDt",
    "chkRiskInqRsRec",
    "ver1",
    "montrInstrType",
    "trnRcptId",
    "xChkRiskAuxInqRec",
    "trnRiskStatSumArray",
    "chkRiskInqSumRec",
    "ver2",
    "any"
})
public class ChkRiskInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "TrnInstRtId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InstRtIdType> trnInstRtId;
    @XmlElementRef(name = "TrnAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctIdType> trnAcctId;
    @XmlElementRef(name = "TrnChanType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnChanTypeType> trnChanType;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "TellerNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TellerNumType> tellerNum;
    @XmlElementRef(name = "Amt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmtType> amt;
    @XmlElementRef(name = "ChkNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkNumType> chkNum;
    @XmlElementRef(name = "ProcCntlId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcCntlIdType> procCntlId;
    @XmlElementRef(name = "PersonName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonNameCType> personName;
    @XmlElementRef(name = "Addr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrCType> addr;
    @XmlElementRef(name = "HomePhoneNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumType> homePhoneNum;
    @XmlElementRef(name = "WorkPhoneNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumType> workPhoneNum;
    @XmlElementRef(name = "IdVerify", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IdVerifyCType> idVerify;
    @XmlElementRef(name = "TaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> taxId;
    @XmlElementRef(name = "BirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BirthDtType> birthDt;
    @XmlElementRef(name = "ChkRiskInqRsRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkRiskInqRsRecCType> chkRiskInqRsRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "MontrInstrType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MontrInstrTypeType> montrInstrType;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElementRef(name = "x_ChkRiskAuxInqRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XChkRiskAuxInqRecCType> xChkRiskAuxInqRec;
    @XmlElementRef(name = "TrnRiskStatSumArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRiskStatArrayAType> trnRiskStatSumArray;
    @XmlElementRef(name = "ChkRiskInqSumRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkRiskInqSumRecCType> chkRiskInqSumRec;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the trnInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}
     *     
     */
    public JAXBElement<InstRtIdType> getTrnInstRtId() {
        return trnInstRtId;
    }

    /**
     * Sets the value of the trnInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}
     *     
     */
    public void setTrnInstRtId(JAXBElement<InstRtIdType> value) {
        this.trnInstRtId = value;
    }

    /**
     * Gets the value of the trnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public JAXBElement<AcctIdType> getTrnAcctId() {
        return trnAcctId;
    }

    /**
     * Sets the value of the trnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public void setTrnAcctId(JAXBElement<AcctIdType> value) {
        this.trnAcctId = value;
    }

    /**
     * Gets the value of the trnChanType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnChanTypeType }{@code >}
     *     
     */
    public JAXBElement<TrnChanTypeType> getTrnChanType() {
        return trnChanType;
    }

    /**
     * Sets the value of the trnChanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnChanTypeType }{@code >}
     *     
     */
    public void setTrnChanType(JAXBElement<TrnChanTypeType> value) {
        this.trnChanType = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setBrCode(JAXBElement<BrCodeType> value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the tellerNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TellerNumType }{@code >}
     *     
     */
    public JAXBElement<TellerNumType> getTellerNum() {
        return tellerNum;
    }

    /**
     * Sets the value of the tellerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TellerNumType }{@code >}
     *     
     */
    public void setTellerNum(JAXBElement<TellerNumType> value) {
        this.tellerNum = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public JAXBElement<AmtType> getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public void setAmt(JAXBElement<AmtType> value) {
        this.amt = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkNumType }{@code >}
     *     
     */
    public JAXBElement<ChkNumType> getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkNumType }{@code >}
     *     
     */
    public void setChkNum(JAXBElement<ChkNumType> value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the procCntlId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcCntlIdType }{@code >}
     *     
     */
    public JAXBElement<ProcCntlIdType> getProcCntlId() {
        return procCntlId;
    }

    /**
     * Sets the value of the procCntlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcCntlIdType }{@code >}
     *     
     */
    public void setProcCntlId(JAXBElement<ProcCntlIdType> value) {
        this.procCntlId = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public JAXBElement<PersonNameCType> getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     *     
     */
    public void setPersonName(JAXBElement<PersonNameCType> value) {
        this.personName = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrCType }{@code >}
     *     
     */
    public JAXBElement<AddrCType> getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrCType }{@code >}
     *     
     */
    public void setAddr(JAXBElement<AddrCType> value) {
        this.addr = value;
    }

    /**
     * Gets the value of the homePhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public JAXBElement<PhoneNumType> getHomePhoneNum() {
        return homePhoneNum;
    }

    /**
     * Sets the value of the homePhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public void setHomePhoneNum(JAXBElement<PhoneNumType> value) {
        this.homePhoneNum = value;
    }

    /**
     * Gets the value of the workPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public JAXBElement<PhoneNumType> getWorkPhoneNum() {
        return workPhoneNum;
    }

    /**
     * Sets the value of the workPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}
     *     
     */
    public void setWorkPhoneNum(JAXBElement<PhoneNumType> value) {
        this.workPhoneNum = value;
    }

    /**
     * Gets the value of the idVerify property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyCType }{@code >}
     *     
     */
    public JAXBElement<IdVerifyCType> getIdVerify() {
        return idVerify;
    }

    /**
     * Sets the value of the idVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyCType }{@code >}
     *     
     */
    public void setIdVerify(JAXBElement<IdVerifyCType> value) {
        this.idVerify = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public JAXBElement<TaxIdType> getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public void setTaxId(JAXBElement<TaxIdType> value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public JAXBElement<BirthDtType> getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public void setBirthDt(JAXBElement<BirthDtType> value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the chkRiskInqRsRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkRiskInqRsRecCType }{@code >}
     *     
     */
    public JAXBElement<ChkRiskInqRsRecCType> getChkRiskInqRsRec() {
        return chkRiskInqRsRec;
    }

    /**
     * Sets the value of the chkRiskInqRsRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkRiskInqRsRecCType }{@code >}
     *     
     */
    public void setChkRiskInqRsRec(JAXBElement<ChkRiskInqRsRecCType> value) {
        this.chkRiskInqRsRec = value;
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
     * Gets the value of the montrInstrType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MontrInstrTypeType }{@code >}
     *     
     */
    public JAXBElement<MontrInstrTypeType> getMontrInstrType() {
        return montrInstrType;
    }

    /**
     * Sets the value of the montrInstrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MontrInstrTypeType }{@code >}
     *     
     */
    public void setMontrInstrType(JAXBElement<MontrInstrTypeType> value) {
        this.montrInstrType = value;
    }

    /**
     * Gets the value of the trnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public JAXBElement<TrnRcptIdType> getTrnRcptId() {
        return trnRcptId;
    }

    /**
     * Sets the value of the trnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public void setTrnRcptId(JAXBElement<TrnRcptIdType> value) {
        this.trnRcptId = value;
    }

    /**
     * Gets the value of the xChkRiskAuxInqRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XChkRiskAuxInqRecCType }{@code >}
     *     
     */
    public JAXBElement<XChkRiskAuxInqRecCType> getXChkRiskAuxInqRec() {
        return xChkRiskAuxInqRec;
    }

    /**
     * Sets the value of the xChkRiskAuxInqRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XChkRiskAuxInqRecCType }{@code >}
     *     
     */
    public void setXChkRiskAuxInqRec(JAXBElement<XChkRiskAuxInqRecCType> value) {
        this.xChkRiskAuxInqRec = value;
    }

    /**
     * Gets the value of the trnRiskStatSumArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnRiskStatArrayAType }{@code >}
     *     
     */
    public JAXBElement<TrnRiskStatArrayAType> getTrnRiskStatSumArray() {
        return trnRiskStatSumArray;
    }

    /**
     * Sets the value of the trnRiskStatSumArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnRiskStatArrayAType }{@code >}
     *     
     */
    public void setTrnRiskStatSumArray(JAXBElement<TrnRiskStatArrayAType> value) {
        this.trnRiskStatSumArray = value;
    }

    /**
     * Gets the value of the chkRiskInqSumRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkRiskInqSumRecCType }{@code >}
     *     
     */
    public JAXBElement<ChkRiskInqSumRecCType> getChkRiskInqSumRec() {
        return chkRiskInqSumRec;
    }

    /**
     * Sets the value of the chkRiskInqSumRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkRiskInqSumRecCType }{@code >}
     *     
     */
    public void setChkRiskInqSumRec(JAXBElement<ChkRiskInqSumRecCType> value) {
        this.chkRiskInqSumRec = value;
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
