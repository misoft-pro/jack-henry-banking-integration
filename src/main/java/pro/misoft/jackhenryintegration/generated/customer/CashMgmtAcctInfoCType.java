
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for CashMgmtAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashMgmtAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="ComName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorDayTrnAlw" type="{http://jackhenry.com/jxchange/TPG/2008}PriorDayTrnAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorDayTrnAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}PriorDayTrnAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorDayTrnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PriorDayTrnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurDayTrnAlw" type="{http://jackhenry.com/jxchange/TPG/2008}CurDayTrnAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurDayTrnAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}CurDayTrnAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurDayTrnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurDayTrnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistAlw" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtAddAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtAddAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtAddAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtAddAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtAddFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtAddFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtInqAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtInqAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtInqAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtInqAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopPmtInqFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}StopPmtInqFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtRetrvAlw" type="{http://jackhenry.com/jxchange/TPG/2008}StmtRetrvAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtRetrvAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}StmtRetrvAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtRetrvFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtRetrvFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferAlw" type="{http://jackhenry.com/jxchange/TPG/2008}XferAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}XferAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}XferFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferBalType" type="{http://jackhenry.com/jxchange/TPG/2008}XferBalType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcAlw" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcAlw_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExtcFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ExtcFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportPosPayData" type="{http://jackhenry.com/jxchange/TPG/2008}ImportPosPayData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportPosPayAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}ImportPosPayAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportPosPayFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ImportPosPayFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncCombAcct" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombAcct_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrtPrtExtcType" type="{http://jackhenry.com/jxchange/TPG/2008}CrtPrtExtcType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportAcctReconData" type="{http://jackhenry.com/jxchange/TPG/2008}ImportAcctReconData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportAcctReconAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}ImportAcctReconAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportAcctReconFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ImportAcctReconFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportAcctReconPlnData" type="{http://jackhenry.com/jxchange/TPG/2008}ImportAcctReconPlnData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportAcctReconPlnAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}ImportAcctReconPlnAnlysId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImportAcctReconPlnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ImportAcctReconPlnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtAlw_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="WireRepTrnEntryAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireRepTrnEntryAlw_Type" minOccurs="0"/&gt;
 *           &lt;element name="WireTrnEntryAlw" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnEntryAlw_Type" minOccurs="0"/&gt;
 *           &lt;element name="StmtSerChg" type="{http://jackhenry.com/jxchange/TPG/2008}StmtSerChg_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrinPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}PrinPmtAlw_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntPmtAlw" type="{http://jackhenry.com/jxchange/TPG/2008}IntPmtAlw_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CashMgmtAcctInfo_CType", propOrder = {
    "accountId",
    "comName",
    "priorDayTrnAlw",
    "priorDayTrnAnlysId",
    "priorDayTrnFeeAmt",
    "curDayTrnAlw",
    "curDayTrnAnlysId",
    "curDayTrnFeeAmt",
    "trnHistAlw",
    "trnHistAnlysId",
    "trnHistFeeAmt",
    "stopPmtAddAlw",
    "stopPmtAddAnlysId",
    "stopPmtAddFeeAmt",
    "stopPmtInqAlw",
    "stopPmtInqAnlysId",
    "stopPmtInqFeeAmt",
    "stmtRetrvAlw",
    "stmtRetrvAnlysId",
    "stmtRetrvFeeAmt",
    "xferAlw",
    "xferAnlysId",
    "xferFeeAmt",
    "xferBalType",
    "extcAlw",
    "extcAnlysId",
    "extcFeeAmt",
    "importPosPayData",
    "importPosPayAnlysId",
    "importPosPayFeeAmt",
    "incCombAcct",
    "crtPrtExtcType",
    "importAcctReconData",
    "importAcctReconAnlysId",
    "importAcctReconFeeAmt",
    "importAcctReconPlnData",
    "importAcctReconPlnAnlysId",
    "importAcctReconPlnFeeAmt",
    "lnPmtAlw",
    "ver1",
    "wireRepTrnEntryAlw",
    "wireTrnEntryAlw",
    "stmtSerChg",
    "prinPmtAlw",
    "intPmtAlw",
    "ver2",
    "any"
})
public class CashMgmtAcctInfoCType {

    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "ComName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ComNameType> comName;
    @XmlElementRef(name = "PriorDayTrnAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PriorDayTrnAlwType> priorDayTrnAlw;
    @XmlElementRef(name = "PriorDayTrnAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PriorDayTrnAnlysIdType> priorDayTrnAnlysId;
    @XmlElementRef(name = "PriorDayTrnFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PriorDayTrnFeeAmtType> priorDayTrnFeeAmt;
    @XmlElementRef(name = "CurDayTrnAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurDayTrnAlwType> curDayTrnAlw;
    @XmlElementRef(name = "CurDayTrnAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurDayTrnAnlysIdType> curDayTrnAnlysId;
    @XmlElementRef(name = "CurDayTrnFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurDayTrnFeeAmtType> curDayTrnFeeAmt;
    @XmlElementRef(name = "TrnHistAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnHistAlwType> trnHistAlw;
    @XmlElementRef(name = "TrnHistAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnHistAnlysIdType> trnHistAnlysId;
    @XmlElementRef(name = "TrnHistFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnHistFeeAmtType> trnHistFeeAmt;
    @XmlElementRef(name = "StopPmtAddAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtAddAlwType> stopPmtAddAlw;
    @XmlElementRef(name = "StopPmtAddAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtAddAnlysIdType> stopPmtAddAnlysId;
    @XmlElementRef(name = "StopPmtAddFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtAddFeeAmtType> stopPmtAddFeeAmt;
    @XmlElementRef(name = "StopPmtInqAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtInqAlwType> stopPmtInqAlw;
    @XmlElementRef(name = "StopPmtInqAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtInqAnlysIdType> stopPmtInqAnlysId;
    @XmlElementRef(name = "StopPmtInqFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StopPmtInqFeeAmtType> stopPmtInqFeeAmt;
    @XmlElementRef(name = "StmtRetrvAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtRetrvAlwType> stmtRetrvAlw;
    @XmlElementRef(name = "StmtRetrvAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtRetrvAnlysIdType> stmtRetrvAnlysId;
    @XmlElementRef(name = "StmtRetrvFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtRetrvFeeAmtType> stmtRetrvFeeAmt;
    @XmlElementRef(name = "XferAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferAlwType> xferAlw;
    @XmlElementRef(name = "XferAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferAnlysIdType> xferAnlysId;
    @XmlElementRef(name = "XferFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferFeeAmtType> xferFeeAmt;
    @XmlElementRef(name = "XferBalType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferBalTypeType> xferBalType;
    @XmlElementRef(name = "ExtcAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtcAlwType> extcAlw;
    @XmlElementRef(name = "ExtcAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtcAnlysIdType> extcAnlysId;
    @XmlElementRef(name = "ExtcFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtcFeeAmtType> extcFeeAmt;
    @XmlElementRef(name = "ImportPosPayData", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportPosPayDataType> importPosPayData;
    @XmlElementRef(name = "ImportPosPayAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportPosPayAnlysIdType> importPosPayAnlysId;
    @XmlElementRef(name = "ImportPosPayFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportPosPayFeeAmtType> importPosPayFeeAmt;
    @XmlElementRef(name = "IncCombAcct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncCombAcctType> incCombAcct;
    @XmlElementRef(name = "CrtPrtExtcType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrtPrtExtcTypeType> crtPrtExtcType;
    @XmlElementRef(name = "ImportAcctReconData", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportAcctReconDataType> importAcctReconData;
    @XmlElementRef(name = "ImportAcctReconAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportAcctReconAnlysIdType> importAcctReconAnlysId;
    @XmlElementRef(name = "ImportAcctReconFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportAcctReconFeeAmtType> importAcctReconFeeAmt;
    @XmlElementRef(name = "ImportAcctReconPlnData", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportAcctReconPlnDataType> importAcctReconPlnData;
    @XmlElementRef(name = "ImportAcctReconPlnAnlysId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportAcctReconPlnAnlysIdType> importAcctReconPlnAnlysId;
    @XmlElementRef(name = "ImportAcctReconPlnFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ImportAcctReconPlnFeeAmtType> importAcctReconPlnFeeAmt;
    @XmlElementRef(name = "LnPmtAlw", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnPmtAlwType> lnPmtAlw;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "WireRepTrnEntryAlw")
    protected WireRepTrnEntryAlwType wireRepTrnEntryAlw;
    @XmlElement(name = "WireTrnEntryAlw")
    protected WireTrnEntryAlwType wireTrnEntryAlw;
    @XmlElement(name = "StmtSerChg")
    protected StmtSerChgType stmtSerChg;
    @XmlElement(name = "PrinPmtAlw")
    protected PrinPmtAlwType prinPmtAlw;
    @XmlElement(name = "IntPmtAlw")
    protected IntPmtAlwType intPmtAlw;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the comName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public JAXBElement<ComNameType> getComName() {
        return comName;
    }

    /**
     * Sets the value of the comName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public void setComName(JAXBElement<ComNameType> value) {
        this.comName = value;
    }

    /**
     * Gets the value of the priorDayTrnAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorDayTrnAlwType }{@code >}
     *     
     */
    public JAXBElement<PriorDayTrnAlwType> getPriorDayTrnAlw() {
        return priorDayTrnAlw;
    }

    /**
     * Sets the value of the priorDayTrnAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorDayTrnAlwType }{@code >}
     *     
     */
    public void setPriorDayTrnAlw(JAXBElement<PriorDayTrnAlwType> value) {
        this.priorDayTrnAlw = value;
    }

    /**
     * Gets the value of the priorDayTrnAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorDayTrnAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<PriorDayTrnAnlysIdType> getPriorDayTrnAnlysId() {
        return priorDayTrnAnlysId;
    }

    /**
     * Sets the value of the priorDayTrnAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorDayTrnAnlysIdType }{@code >}
     *     
     */
    public void setPriorDayTrnAnlysId(JAXBElement<PriorDayTrnAnlysIdType> value) {
        this.priorDayTrnAnlysId = value;
    }

    /**
     * Gets the value of the priorDayTrnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorDayTrnFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<PriorDayTrnFeeAmtType> getPriorDayTrnFeeAmt() {
        return priorDayTrnFeeAmt;
    }

    /**
     * Sets the value of the priorDayTrnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorDayTrnFeeAmtType }{@code >}
     *     
     */
    public void setPriorDayTrnFeeAmt(JAXBElement<PriorDayTrnFeeAmtType> value) {
        this.priorDayTrnFeeAmt = value;
    }

    /**
     * Gets the value of the curDayTrnAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurDayTrnAlwType }{@code >}
     *     
     */
    public JAXBElement<CurDayTrnAlwType> getCurDayTrnAlw() {
        return curDayTrnAlw;
    }

    /**
     * Sets the value of the curDayTrnAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurDayTrnAlwType }{@code >}
     *     
     */
    public void setCurDayTrnAlw(JAXBElement<CurDayTrnAlwType> value) {
        this.curDayTrnAlw = value;
    }

    /**
     * Gets the value of the curDayTrnAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurDayTrnAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<CurDayTrnAnlysIdType> getCurDayTrnAnlysId() {
        return curDayTrnAnlysId;
    }

    /**
     * Sets the value of the curDayTrnAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurDayTrnAnlysIdType }{@code >}
     *     
     */
    public void setCurDayTrnAnlysId(JAXBElement<CurDayTrnAnlysIdType> value) {
        this.curDayTrnAnlysId = value;
    }

    /**
     * Gets the value of the curDayTrnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurDayTrnFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<CurDayTrnFeeAmtType> getCurDayTrnFeeAmt() {
        return curDayTrnFeeAmt;
    }

    /**
     * Sets the value of the curDayTrnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurDayTrnFeeAmtType }{@code >}
     *     
     */
    public void setCurDayTrnFeeAmt(JAXBElement<CurDayTrnFeeAmtType> value) {
        this.curDayTrnFeeAmt = value;
    }

    /**
     * Gets the value of the trnHistAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnHistAlwType }{@code >}
     *     
     */
    public JAXBElement<TrnHistAlwType> getTrnHistAlw() {
        return trnHistAlw;
    }

    /**
     * Sets the value of the trnHistAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnHistAlwType }{@code >}
     *     
     */
    public void setTrnHistAlw(JAXBElement<TrnHistAlwType> value) {
        this.trnHistAlw = value;
    }

    /**
     * Gets the value of the trnHistAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnHistAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<TrnHistAnlysIdType> getTrnHistAnlysId() {
        return trnHistAnlysId;
    }

    /**
     * Sets the value of the trnHistAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnHistAnlysIdType }{@code >}
     *     
     */
    public void setTrnHistAnlysId(JAXBElement<TrnHistAnlysIdType> value) {
        this.trnHistAnlysId = value;
    }

    /**
     * Gets the value of the trnHistFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnHistFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<TrnHistFeeAmtType> getTrnHistFeeAmt() {
        return trnHistFeeAmt;
    }

    /**
     * Sets the value of the trnHistFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnHistFeeAmtType }{@code >}
     *     
     */
    public void setTrnHistFeeAmt(JAXBElement<TrnHistFeeAmtType> value) {
        this.trnHistFeeAmt = value;
    }

    /**
     * Gets the value of the stopPmtAddAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddAlwType }{@code >}
     *     
     */
    public JAXBElement<StopPmtAddAlwType> getStopPmtAddAlw() {
        return stopPmtAddAlw;
    }

    /**
     * Sets the value of the stopPmtAddAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddAlwType }{@code >}
     *     
     */
    public void setStopPmtAddAlw(JAXBElement<StopPmtAddAlwType> value) {
        this.stopPmtAddAlw = value;
    }

    /**
     * Gets the value of the stopPmtAddAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<StopPmtAddAnlysIdType> getStopPmtAddAnlysId() {
        return stopPmtAddAnlysId;
    }

    /**
     * Sets the value of the stopPmtAddAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddAnlysIdType }{@code >}
     *     
     */
    public void setStopPmtAddAnlysId(JAXBElement<StopPmtAddAnlysIdType> value) {
        this.stopPmtAddAnlysId = value;
    }

    /**
     * Gets the value of the stopPmtAddFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<StopPmtAddFeeAmtType> getStopPmtAddFeeAmt() {
        return stopPmtAddFeeAmt;
    }

    /**
     * Sets the value of the stopPmtAddFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtAddFeeAmtType }{@code >}
     *     
     */
    public void setStopPmtAddFeeAmt(JAXBElement<StopPmtAddFeeAmtType> value) {
        this.stopPmtAddFeeAmt = value;
    }

    /**
     * Gets the value of the stopPmtInqAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtInqAlwType }{@code >}
     *     
     */
    public JAXBElement<StopPmtInqAlwType> getStopPmtInqAlw() {
        return stopPmtInqAlw;
    }

    /**
     * Sets the value of the stopPmtInqAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtInqAlwType }{@code >}
     *     
     */
    public void setStopPmtInqAlw(JAXBElement<StopPmtInqAlwType> value) {
        this.stopPmtInqAlw = value;
    }

    /**
     * Gets the value of the stopPmtInqAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtInqAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<StopPmtInqAnlysIdType> getStopPmtInqAnlysId() {
        return stopPmtInqAnlysId;
    }

    /**
     * Sets the value of the stopPmtInqAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtInqAnlysIdType }{@code >}
     *     
     */
    public void setStopPmtInqAnlysId(JAXBElement<StopPmtInqAnlysIdType> value) {
        this.stopPmtInqAnlysId = value;
    }

    /**
     * Gets the value of the stopPmtInqFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopPmtInqFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<StopPmtInqFeeAmtType> getStopPmtInqFeeAmt() {
        return stopPmtInqFeeAmt;
    }

    /**
     * Sets the value of the stopPmtInqFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopPmtInqFeeAmtType }{@code >}
     *     
     */
    public void setStopPmtInqFeeAmt(JAXBElement<StopPmtInqFeeAmtType> value) {
        this.stopPmtInqFeeAmt = value;
    }

    /**
     * Gets the value of the stmtRetrvAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvAlwType }{@code >}
     *     
     */
    public JAXBElement<StmtRetrvAlwType> getStmtRetrvAlw() {
        return stmtRetrvAlw;
    }

    /**
     * Sets the value of the stmtRetrvAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvAlwType }{@code >}
     *     
     */
    public void setStmtRetrvAlw(JAXBElement<StmtRetrvAlwType> value) {
        this.stmtRetrvAlw = value;
    }

    /**
     * Gets the value of the stmtRetrvAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<StmtRetrvAnlysIdType> getStmtRetrvAnlysId() {
        return stmtRetrvAnlysId;
    }

    /**
     * Sets the value of the stmtRetrvAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvAnlysIdType }{@code >}
     *     
     */
    public void setStmtRetrvAnlysId(JAXBElement<StmtRetrvAnlysIdType> value) {
        this.stmtRetrvAnlysId = value;
    }

    /**
     * Gets the value of the stmtRetrvFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<StmtRetrvFeeAmtType> getStmtRetrvFeeAmt() {
        return stmtRetrvFeeAmt;
    }

    /**
     * Sets the value of the stmtRetrvFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtRetrvFeeAmtType }{@code >}
     *     
     */
    public void setStmtRetrvFeeAmt(JAXBElement<StmtRetrvFeeAmtType> value) {
        this.stmtRetrvFeeAmt = value;
    }

    /**
     * Gets the value of the xferAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferAlwType }{@code >}
     *     
     */
    public JAXBElement<XferAlwType> getXferAlw() {
        return xferAlw;
    }

    /**
     * Sets the value of the xferAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferAlwType }{@code >}
     *     
     */
    public void setXferAlw(JAXBElement<XferAlwType> value) {
        this.xferAlw = value;
    }

    /**
     * Gets the value of the xferAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<XferAnlysIdType> getXferAnlysId() {
        return xferAnlysId;
    }

    /**
     * Sets the value of the xferAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferAnlysIdType }{@code >}
     *     
     */
    public void setXferAnlysId(JAXBElement<XferAnlysIdType> value) {
        this.xferAnlysId = value;
    }

    /**
     * Gets the value of the xferFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<XferFeeAmtType> getXferFeeAmt() {
        return xferFeeAmt;
    }

    /**
     * Sets the value of the xferFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferFeeAmtType }{@code >}
     *     
     */
    public void setXferFeeAmt(JAXBElement<XferFeeAmtType> value) {
        this.xferFeeAmt = value;
    }

    /**
     * Gets the value of the xferBalType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferBalTypeType }{@code >}
     *     
     */
    public JAXBElement<XferBalTypeType> getXferBalType() {
        return xferBalType;
    }

    /**
     * Sets the value of the xferBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferBalTypeType }{@code >}
     *     
     */
    public void setXferBalType(JAXBElement<XferBalTypeType> value) {
        this.xferBalType = value;
    }

    /**
     * Gets the value of the extcAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtcAlwType }{@code >}
     *     
     */
    public JAXBElement<ExtcAlwType> getExtcAlw() {
        return extcAlw;
    }

    /**
     * Sets the value of the extcAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtcAlwType }{@code >}
     *     
     */
    public void setExtcAlw(JAXBElement<ExtcAlwType> value) {
        this.extcAlw = value;
    }

    /**
     * Gets the value of the extcAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtcAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<ExtcAnlysIdType> getExtcAnlysId() {
        return extcAnlysId;
    }

    /**
     * Sets the value of the extcAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtcAnlysIdType }{@code >}
     *     
     */
    public void setExtcAnlysId(JAXBElement<ExtcAnlysIdType> value) {
        this.extcAnlysId = value;
    }

    /**
     * Gets the value of the extcFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtcFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<ExtcFeeAmtType> getExtcFeeAmt() {
        return extcFeeAmt;
    }

    /**
     * Sets the value of the extcFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtcFeeAmtType }{@code >}
     *     
     */
    public void setExtcFeeAmt(JAXBElement<ExtcFeeAmtType> value) {
        this.extcFeeAmt = value;
    }

    /**
     * Gets the value of the importPosPayData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportPosPayDataType }{@code >}
     *     
     */
    public JAXBElement<ImportPosPayDataType> getImportPosPayData() {
        return importPosPayData;
    }

    /**
     * Sets the value of the importPosPayData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportPosPayDataType }{@code >}
     *     
     */
    public void setImportPosPayData(JAXBElement<ImportPosPayDataType> value) {
        this.importPosPayData = value;
    }

    /**
     * Gets the value of the importPosPayAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportPosPayAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<ImportPosPayAnlysIdType> getImportPosPayAnlysId() {
        return importPosPayAnlysId;
    }

    /**
     * Sets the value of the importPosPayAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportPosPayAnlysIdType }{@code >}
     *     
     */
    public void setImportPosPayAnlysId(JAXBElement<ImportPosPayAnlysIdType> value) {
        this.importPosPayAnlysId = value;
    }

    /**
     * Gets the value of the importPosPayFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportPosPayFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<ImportPosPayFeeAmtType> getImportPosPayFeeAmt() {
        return importPosPayFeeAmt;
    }

    /**
     * Sets the value of the importPosPayFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportPosPayFeeAmtType }{@code >}
     *     
     */
    public void setImportPosPayFeeAmt(JAXBElement<ImportPosPayFeeAmtType> value) {
        this.importPosPayFeeAmt = value;
    }

    /**
     * Gets the value of the incCombAcct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncCombAcctType }{@code >}
     *     
     */
    public JAXBElement<IncCombAcctType> getIncCombAcct() {
        return incCombAcct;
    }

    /**
     * Sets the value of the incCombAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncCombAcctType }{@code >}
     *     
     */
    public void setIncCombAcct(JAXBElement<IncCombAcctType> value) {
        this.incCombAcct = value;
    }

    /**
     * Gets the value of the crtPrtExtcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrtPrtExtcTypeType }{@code >}
     *     
     */
    public JAXBElement<CrtPrtExtcTypeType> getCrtPrtExtcType() {
        return crtPrtExtcType;
    }

    /**
     * Sets the value of the crtPrtExtcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrtPrtExtcTypeType }{@code >}
     *     
     */
    public void setCrtPrtExtcType(JAXBElement<CrtPrtExtcTypeType> value) {
        this.crtPrtExtcType = value;
    }

    /**
     * Gets the value of the importAcctReconData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconDataType }{@code >}
     *     
     */
    public JAXBElement<ImportAcctReconDataType> getImportAcctReconData() {
        return importAcctReconData;
    }

    /**
     * Sets the value of the importAcctReconData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconDataType }{@code >}
     *     
     */
    public void setImportAcctReconData(JAXBElement<ImportAcctReconDataType> value) {
        this.importAcctReconData = value;
    }

    /**
     * Gets the value of the importAcctReconAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<ImportAcctReconAnlysIdType> getImportAcctReconAnlysId() {
        return importAcctReconAnlysId;
    }

    /**
     * Sets the value of the importAcctReconAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconAnlysIdType }{@code >}
     *     
     */
    public void setImportAcctReconAnlysId(JAXBElement<ImportAcctReconAnlysIdType> value) {
        this.importAcctReconAnlysId = value;
    }

    /**
     * Gets the value of the importAcctReconFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<ImportAcctReconFeeAmtType> getImportAcctReconFeeAmt() {
        return importAcctReconFeeAmt;
    }

    /**
     * Sets the value of the importAcctReconFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconFeeAmtType }{@code >}
     *     
     */
    public void setImportAcctReconFeeAmt(JAXBElement<ImportAcctReconFeeAmtType> value) {
        this.importAcctReconFeeAmt = value;
    }

    /**
     * Gets the value of the importAcctReconPlnData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconPlnDataType }{@code >}
     *     
     */
    public JAXBElement<ImportAcctReconPlnDataType> getImportAcctReconPlnData() {
        return importAcctReconPlnData;
    }

    /**
     * Sets the value of the importAcctReconPlnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconPlnDataType }{@code >}
     *     
     */
    public void setImportAcctReconPlnData(JAXBElement<ImportAcctReconPlnDataType> value) {
        this.importAcctReconPlnData = value;
    }

    /**
     * Gets the value of the importAcctReconPlnAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconPlnAnlysIdType }{@code >}
     *     
     */
    public JAXBElement<ImportAcctReconPlnAnlysIdType> getImportAcctReconPlnAnlysId() {
        return importAcctReconPlnAnlysId;
    }

    /**
     * Sets the value of the importAcctReconPlnAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconPlnAnlysIdType }{@code >}
     *     
     */
    public void setImportAcctReconPlnAnlysId(JAXBElement<ImportAcctReconPlnAnlysIdType> value) {
        this.importAcctReconPlnAnlysId = value;
    }

    /**
     * Gets the value of the importAcctReconPlnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconPlnFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<ImportAcctReconPlnFeeAmtType> getImportAcctReconPlnFeeAmt() {
        return importAcctReconPlnFeeAmt;
    }

    /**
     * Sets the value of the importAcctReconPlnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImportAcctReconPlnFeeAmtType }{@code >}
     *     
     */
    public void setImportAcctReconPlnFeeAmt(JAXBElement<ImportAcctReconPlnFeeAmtType> value) {
        this.importAcctReconPlnFeeAmt = value;
    }

    /**
     * Gets the value of the lnPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnPmtAlwType }{@code >}
     *     
     */
    public JAXBElement<LnPmtAlwType> getLnPmtAlw() {
        return lnPmtAlw;
    }

    /**
     * Sets the value of the lnPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnPmtAlwType }{@code >}
     *     
     */
    public void setLnPmtAlw(JAXBElement<LnPmtAlwType> value) {
        this.lnPmtAlw = value;
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
     * Gets the value of the wireRepTrnEntryAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireRepTrnEntryAlwType }
     *     
     */
    public WireRepTrnEntryAlwType getWireRepTrnEntryAlw() {
        return wireRepTrnEntryAlw;
    }

    /**
     * Sets the value of the wireRepTrnEntryAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireRepTrnEntryAlwType }
     *     
     */
    public void setWireRepTrnEntryAlw(WireRepTrnEntryAlwType value) {
        this.wireRepTrnEntryAlw = value;
    }

    /**
     * Gets the value of the wireTrnEntryAlw property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnEntryAlwType }
     *     
     */
    public WireTrnEntryAlwType getWireTrnEntryAlw() {
        return wireTrnEntryAlw;
    }

    /**
     * Sets the value of the wireTrnEntryAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnEntryAlwType }
     *     
     */
    public void setWireTrnEntryAlw(WireTrnEntryAlwType value) {
        this.wireTrnEntryAlw = value;
    }

    /**
     * Gets the value of the stmtSerChg property.
     * 
     * @return
     *     possible object is
     *     {@link StmtSerChgType }
     *     
     */
    public StmtSerChgType getStmtSerChg() {
        return stmtSerChg;
    }

    /**
     * Sets the value of the stmtSerChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtSerChgType }
     *     
     */
    public void setStmtSerChg(StmtSerChgType value) {
        this.stmtSerChg = value;
    }

    /**
     * Gets the value of the prinPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link PrinPmtAlwType }
     *     
     */
    public PrinPmtAlwType getPrinPmtAlw() {
        return prinPmtAlw;
    }

    /**
     * Sets the value of the prinPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrinPmtAlwType }
     *     
     */
    public void setPrinPmtAlw(PrinPmtAlwType value) {
        this.prinPmtAlw = value;
    }

    /**
     * Gets the value of the intPmtAlw property.
     * 
     * @return
     *     possible object is
     *     {@link IntPmtAlwType }
     *     
     */
    public IntPmtAlwType getIntPmtAlw() {
        return intPmtAlw;
    }

    /**
     * Sets the value of the intPmtAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPmtAlwType }
     *     
     */
    public void setIntPmtAlw(IntPmtAlwType value) {
        this.intPmtAlw = value;
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
