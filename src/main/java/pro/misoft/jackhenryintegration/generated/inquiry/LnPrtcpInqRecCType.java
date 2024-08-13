
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
 * <p>Java class for LnPrtcpInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPrtcpInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type"/&gt;
 *         &lt;element name="PartIdNum" type="{http://jackhenry.com/jxchange/TPG/2008}PartIdNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpInvName" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpInvName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpPct" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="InvInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InvInstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="InvEmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="InvContactName" type="{http://jackhenry.com/jxchange/TPG/2008}InvContactName_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvMailReciptId" type="{http://jackhenry.com/jxchange/TPG/2008}InvMailReciptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvContactArray" type="{http://jackhenry.com/jxchange/TPG/2008}InvContactArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpAutoInterfaceType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAutoInterfaceType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpInterfaceAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpInterfaceAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpAutoAdvType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpAutoAdvType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflInterfaceBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflInterfaceBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpRemitType" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpRemitType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflInterfaceGLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflInterfaceProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflInterfaceProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}AflFinInstId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflCustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflDftBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflDftBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflDftOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflDftOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflDftPrtcpId" type="{http://jackhenry.com/jxchange/TPG/2008}AflDftPrtcpId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflDftDataId" type="{http://jackhenry.com/jxchange/TPG/2008}AflDftDataId_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AflCrtCustIdType" type="{http://jackhenry.com/jxchange/TPG/2008}AflCrtCustIdType_Type" minOccurs="0"/&gt;
 *           &lt;element name="AflCrtLnIdType" type="{http://jackhenry.com/jxchange/TPG/2008}AflCrtLnIdType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PrtcpTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrtcpBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="PrtcpCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}CorrelId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnPrtcpInqRec_CType", propOrder = {
    "acctId",
    "acctType",
    "partIdNum",
    "prtcpInvName",
    "prtcpPct",
    "curBal",
    "nxtPayDt",
    "intRate",
    "invAddr",
    "invInstRtId",
    "invPhoneArray",
    "invEmailArray",
    "invContactName",
    "invMailReciptId",
    "invContactArray",
    "prtcpAutoInterfaceType",
    "prtcpInterfaceAcctId",
    "prtcpInterfaceAcctType",
    "prtcpAutoAdvType",
    "aflInterfaceBrCode",
    "aflInterfaceBrDesc",
    "prtcpRemitType",
    "aflInterfaceGLCostCtr",
    "aflInterfaceProdCode",
    "aflInterfaceProdDesc",
    "aflFinInstId",
    "aflCustId",
    "aflDftBrCode",
    "aflDftBrDesc",
    "aflDftOffCode",
    "aflDftOffDesc",
    "aflDftPrtcpId",
    "aflDftDataId",
    "ver1",
    "aflCrtCustIdType",
    "aflCrtLnIdType",
    "ver2",
    "prtcpTaxId",
    "prtcpBrCode",
    "prtcpCorrelId",
    "ver3",
    "any"
})
public class LnPrtcpInqRecCType {

    @XmlElement(name = "AcctId", required = true)
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType", required = true)
    protected AcctTypeType acctType;
    @XmlElement(name = "PartIdNum")
    protected PartIdNumType partIdNum;
    @XmlElement(name = "PrtcpInvName")
    protected PrtcpInvNameType prtcpInvName;
    @XmlElement(name = "PrtcpPct")
    protected PrtcpPctType prtcpPct;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "NxtPayDt")
    protected NxtPayDtType nxtPayDt;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "InvAddr")
    protected AddrCType invAddr;
    @XmlElement(name = "InvInstRtId")
    protected InvInstRtIdType invInstRtId;
    @XmlElement(name = "InvPhoneArray")
    protected PhoneArrayAType invPhoneArray;
    @XmlElement(name = "InvEmailArray")
    protected EmailArrayAType invEmailArray;
    @XmlElement(name = "InvContactName")
    protected InvContactNameType invContactName;
    @XmlElement(name = "InvMailReciptId")
    protected InvMailReciptIdType invMailReciptId;
    @XmlElement(name = "InvContactArray")
    protected InvContactArrayAType invContactArray;
    @XmlElement(name = "PrtcpAutoInterfaceType")
    protected PrtcpAutoInterfaceTypeType prtcpAutoInterfaceType;
    @XmlElement(name = "PrtcpInterfaceAcctId")
    protected AcctIdType prtcpInterfaceAcctId;
    @XmlElement(name = "PrtcpInterfaceAcctType")
    protected AcctTypeType prtcpInterfaceAcctType;
    @XmlElement(name = "PrtcpAutoAdvType")
    protected PrtcpAutoAdvTypeType prtcpAutoAdvType;
    @XmlElement(name = "AflInterfaceBrCode")
    protected BrCodeType aflInterfaceBrCode;
    @XmlElement(name = "AflInterfaceBrDesc")
    protected BrDescType aflInterfaceBrDesc;
    @XmlElement(name = "PrtcpRemitType")
    protected PrtcpRemitTypeType prtcpRemitType;
    @XmlElement(name = "AflInterfaceGLCostCtr")
    protected GLCostCtrType aflInterfaceGLCostCtr;
    @XmlElement(name = "AflInterfaceProdCode")
    protected ProdCodeType aflInterfaceProdCode;
    @XmlElement(name = "AflInterfaceProdDesc")
    protected ProdDescType aflInterfaceProdDesc;
    @XmlElement(name = "AflFinInstId")
    protected AflFinInstIdType aflFinInstId;
    @XmlElement(name = "AflCustId")
    protected CustIdType aflCustId;
    @XmlElement(name = "AflDftBrCode")
    protected BrCodeType aflDftBrCode;
    @XmlElement(name = "AflDftBrDesc")
    protected BrDescType aflDftBrDesc;
    @XmlElement(name = "AflDftOffCode")
    protected OffCodeType aflDftOffCode;
    @XmlElement(name = "AflDftOffDesc")
    protected OffDescType aflDftOffDesc;
    @XmlElement(name = "AflDftPrtcpId")
    protected AflDftPrtcpIdType aflDftPrtcpId;
    @XmlElement(name = "AflDftDataId")
    protected AflDftDataIdType aflDftDataId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AflCrtCustIdType")
    protected AflCrtCustIdTypeType aflCrtCustIdType;
    @XmlElement(name = "AflCrtLnIdType")
    protected AflCrtLnIdTypeType aflCrtLnIdType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PrtcpTaxId")
    protected TaxIdType prtcpTaxId;
    @XmlElement(name = "PrtcpBrCode")
    protected BrCodeType prtcpBrCode;
    @XmlElement(name = "PrtcpCorrelId")
    protected CorrelIdType prtcpCorrelId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the partIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link PartIdNumType }
     *     
     */
    public PartIdNumType getPartIdNum() {
        return partIdNum;
    }

    /**
     * Sets the value of the partIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartIdNumType }
     *     
     */
    public void setPartIdNum(PartIdNumType value) {
        this.partIdNum = value;
    }

    /**
     * Gets the value of the prtcpInvName property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpInvNameType }
     *     
     */
    public PrtcpInvNameType getPrtcpInvName() {
        return prtcpInvName;
    }

    /**
     * Sets the value of the prtcpInvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpInvNameType }
     *     
     */
    public void setPrtcpInvName(PrtcpInvNameType value) {
        this.prtcpInvName = value;
    }

    /**
     * Gets the value of the prtcpPct property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpPctType }
     *     
     */
    public PrtcpPctType getPrtcpPct() {
        return prtcpPct;
    }

    /**
     * Sets the value of the prtcpPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpPctType }
     *     
     */
    public void setPrtcpPct(PrtcpPctType value) {
        this.prtcpPct = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the nxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getNxtPayDt() {
        return nxtPayDt;
    }

    /**
     * Sets the value of the nxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setNxtPayDt(NxtPayDtType value) {
        this.nxtPayDt = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the invAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getInvAddr() {
        return invAddr;
    }

    /**
     * Sets the value of the invAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setInvAddr(AddrCType value) {
        this.invAddr = value;
    }

    /**
     * Gets the value of the invInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link InvInstRtIdType }
     *     
     */
    public InvInstRtIdType getInvInstRtId() {
        return invInstRtId;
    }

    /**
     * Sets the value of the invInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvInstRtIdType }
     *     
     */
    public void setInvInstRtId(InvInstRtIdType value) {
        this.invInstRtId = value;
    }

    /**
     * Gets the value of the invPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getInvPhoneArray() {
        return invPhoneArray;
    }

    /**
     * Sets the value of the invPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setInvPhoneArray(PhoneArrayAType value) {
        this.invPhoneArray = value;
    }

    /**
     * Gets the value of the invEmailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getInvEmailArray() {
        return invEmailArray;
    }

    /**
     * Sets the value of the invEmailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setInvEmailArray(EmailArrayAType value) {
        this.invEmailArray = value;
    }

    /**
     * Gets the value of the invContactName property.
     * 
     * @return
     *     possible object is
     *     {@link InvContactNameType }
     *     
     */
    public InvContactNameType getInvContactName() {
        return invContactName;
    }

    /**
     * Sets the value of the invContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvContactNameType }
     *     
     */
    public void setInvContactName(InvContactNameType value) {
        this.invContactName = value;
    }

    /**
     * Gets the value of the invMailReciptId property.
     * 
     * @return
     *     possible object is
     *     {@link InvMailReciptIdType }
     *     
     */
    public InvMailReciptIdType getInvMailReciptId() {
        return invMailReciptId;
    }

    /**
     * Sets the value of the invMailReciptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvMailReciptIdType }
     *     
     */
    public void setInvMailReciptId(InvMailReciptIdType value) {
        this.invMailReciptId = value;
    }

    /**
     * Gets the value of the invContactArray property.
     * 
     * @return
     *     possible object is
     *     {@link InvContactArrayAType }
     *     
     */
    public InvContactArrayAType getInvContactArray() {
        return invContactArray;
    }

    /**
     * Sets the value of the invContactArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvContactArrayAType }
     *     
     */
    public void setInvContactArray(InvContactArrayAType value) {
        this.invContactArray = value;
    }

    /**
     * Gets the value of the prtcpAutoInterfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpAutoInterfaceTypeType }
     *     
     */
    public PrtcpAutoInterfaceTypeType getPrtcpAutoInterfaceType() {
        return prtcpAutoInterfaceType;
    }

    /**
     * Sets the value of the prtcpAutoInterfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpAutoInterfaceTypeType }
     *     
     */
    public void setPrtcpAutoInterfaceType(PrtcpAutoInterfaceTypeType value) {
        this.prtcpAutoInterfaceType = value;
    }

    /**
     * Gets the value of the prtcpInterfaceAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getPrtcpInterfaceAcctId() {
        return prtcpInterfaceAcctId;
    }

    /**
     * Sets the value of the prtcpInterfaceAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setPrtcpInterfaceAcctId(AcctIdType value) {
        this.prtcpInterfaceAcctId = value;
    }

    /**
     * Gets the value of the prtcpInterfaceAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getPrtcpInterfaceAcctType() {
        return prtcpInterfaceAcctType;
    }

    /**
     * Sets the value of the prtcpInterfaceAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setPrtcpInterfaceAcctType(AcctTypeType value) {
        this.prtcpInterfaceAcctType = value;
    }

    /**
     * Gets the value of the prtcpAutoAdvType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpAutoAdvTypeType }
     *     
     */
    public PrtcpAutoAdvTypeType getPrtcpAutoAdvType() {
        return prtcpAutoAdvType;
    }

    /**
     * Sets the value of the prtcpAutoAdvType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpAutoAdvTypeType }
     *     
     */
    public void setPrtcpAutoAdvType(PrtcpAutoAdvTypeType value) {
        this.prtcpAutoAdvType = value;
    }

    /**
     * Gets the value of the aflInterfaceBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getAflInterfaceBrCode() {
        return aflInterfaceBrCode;
    }

    /**
     * Sets the value of the aflInterfaceBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setAflInterfaceBrCode(BrCodeType value) {
        this.aflInterfaceBrCode = value;
    }

    /**
     * Gets the value of the aflInterfaceBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getAflInterfaceBrDesc() {
        return aflInterfaceBrDesc;
    }

    /**
     * Sets the value of the aflInterfaceBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setAflInterfaceBrDesc(BrDescType value) {
        this.aflInterfaceBrDesc = value;
    }

    /**
     * Gets the value of the prtcpRemitType property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpRemitTypeType }
     *     
     */
    public PrtcpRemitTypeType getPrtcpRemitType() {
        return prtcpRemitType;
    }

    /**
     * Sets the value of the prtcpRemitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpRemitTypeType }
     *     
     */
    public void setPrtcpRemitType(PrtcpRemitTypeType value) {
        this.prtcpRemitType = value;
    }

    /**
     * Gets the value of the aflInterfaceGLCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getAflInterfaceGLCostCtr() {
        return aflInterfaceGLCostCtr;
    }

    /**
     * Sets the value of the aflInterfaceGLCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setAflInterfaceGLCostCtr(GLCostCtrType value) {
        this.aflInterfaceGLCostCtr = value;
    }

    /**
     * Gets the value of the aflInterfaceProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getAflInterfaceProdCode() {
        return aflInterfaceProdCode;
    }

    /**
     * Sets the value of the aflInterfaceProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setAflInterfaceProdCode(ProdCodeType value) {
        this.aflInterfaceProdCode = value;
    }

    /**
     * Gets the value of the aflInterfaceProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDescType }
     *     
     */
    public ProdDescType getAflInterfaceProdDesc() {
        return aflInterfaceProdDesc;
    }

    /**
     * Sets the value of the aflInterfaceProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDescType }
     *     
     */
    public void setAflInterfaceProdDesc(ProdDescType value) {
        this.aflInterfaceProdDesc = value;
    }

    /**
     * Gets the value of the aflFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link AflFinInstIdType }
     *     
     */
    public AflFinInstIdType getAflFinInstId() {
        return aflFinInstId;
    }

    /**
     * Sets the value of the aflFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflFinInstIdType }
     *     
     */
    public void setAflFinInstId(AflFinInstIdType value) {
        this.aflFinInstId = value;
    }

    /**
     * Gets the value of the aflCustId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getAflCustId() {
        return aflCustId;
    }

    /**
     * Sets the value of the aflCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setAflCustId(CustIdType value) {
        this.aflCustId = value;
    }

    /**
     * Gets the value of the aflDftBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getAflDftBrCode() {
        return aflDftBrCode;
    }

    /**
     * Sets the value of the aflDftBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setAflDftBrCode(BrCodeType value) {
        this.aflDftBrCode = value;
    }

    /**
     * Gets the value of the aflDftBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getAflDftBrDesc() {
        return aflDftBrDesc;
    }

    /**
     * Sets the value of the aflDftBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setAflDftBrDesc(BrDescType value) {
        this.aflDftBrDesc = value;
    }

    /**
     * Gets the value of the aflDftOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getAflDftOffCode() {
        return aflDftOffCode;
    }

    /**
     * Sets the value of the aflDftOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setAflDftOffCode(OffCodeType value) {
        this.aflDftOffCode = value;
    }

    /**
     * Gets the value of the aflDftOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getAflDftOffDesc() {
        return aflDftOffDesc;
    }

    /**
     * Sets the value of the aflDftOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setAflDftOffDesc(OffDescType value) {
        this.aflDftOffDesc = value;
    }

    /**
     * Gets the value of the aflDftPrtcpId property.
     * 
     * @return
     *     possible object is
     *     {@link AflDftPrtcpIdType }
     *     
     */
    public AflDftPrtcpIdType getAflDftPrtcpId() {
        return aflDftPrtcpId;
    }

    /**
     * Sets the value of the aflDftPrtcpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflDftPrtcpIdType }
     *     
     */
    public void setAflDftPrtcpId(AflDftPrtcpIdType value) {
        this.aflDftPrtcpId = value;
    }

    /**
     * Gets the value of the aflDftDataId property.
     * 
     * @return
     *     possible object is
     *     {@link AflDftDataIdType }
     *     
     */
    public AflDftDataIdType getAflDftDataId() {
        return aflDftDataId;
    }

    /**
     * Sets the value of the aflDftDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflDftDataIdType }
     *     
     */
    public void setAflDftDataId(AflDftDataIdType value) {
        this.aflDftDataId = value;
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
     * Gets the value of the aflCrtCustIdType property.
     * 
     * @return
     *     possible object is
     *     {@link AflCrtCustIdTypeType }
     *     
     */
    public AflCrtCustIdTypeType getAflCrtCustIdType() {
        return aflCrtCustIdType;
    }

    /**
     * Sets the value of the aflCrtCustIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflCrtCustIdTypeType }
     *     
     */
    public void setAflCrtCustIdType(AflCrtCustIdTypeType value) {
        this.aflCrtCustIdType = value;
    }

    /**
     * Gets the value of the aflCrtLnIdType property.
     * 
     * @return
     *     possible object is
     *     {@link AflCrtLnIdTypeType }
     *     
     */
    public AflCrtLnIdTypeType getAflCrtLnIdType() {
        return aflCrtLnIdType;
    }

    /**
     * Sets the value of the aflCrtLnIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflCrtLnIdTypeType }
     *     
     */
    public void setAflCrtLnIdType(AflCrtLnIdTypeType value) {
        this.aflCrtLnIdType = value;
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
     * Gets the value of the prtcpTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getPrtcpTaxId() {
        return prtcpTaxId;
    }

    /**
     * Sets the value of the prtcpTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setPrtcpTaxId(TaxIdType value) {
        this.prtcpTaxId = value;
    }

    /**
     * Gets the value of the prtcpBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getPrtcpBrCode() {
        return prtcpBrCode;
    }

    /**
     * Sets the value of the prtcpBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setPrtcpBrCode(BrCodeType value) {
        this.prtcpBrCode = value;
    }

    /**
     * Gets the value of the prtcpCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelIdType }
     *     
     */
    public CorrelIdType getPrtcpCorrelId() {
        return prtcpCorrelId;
    }

    /**
     * Sets the value of the prtcpCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelIdType }
     *     
     */
    public void setPrtcpCorrelId(CorrelIdType value) {
        this.prtcpCorrelId = value;
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
