
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
 * The complex for submission of a loan application for commercial
 *                 entities
 * 
 * <p>Java class for PltfmAppCommInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppCommInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalName" type="{http://jackhenry.com/jxchange/TPG/2008}LegalName_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpLegalOrgLoc" type="{http://jackhenry.com/jxchange/TPG/2008}CorpLegalOrgLoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpLegalOrgDt" type="{http://jackhenry.com/jxchange/TPG/2008}CorpLegalOrgDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FranchiseName" type="{http://jackhenry.com/jxchange/TPG/2008}FranchiseName_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflEntityNameArray" type="{http://jackhenry.com/jxchange/TPG/2008}AflEntityNameArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TradeNameArray" type="{http://jackhenry.com/jxchange/TPG/2008}TradeNameArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PrvTradeNameArray" type="{http://jackhenry.com/jxchange/TPG/2008}PrevTradeNameArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="LocalAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="ExecOffcAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="LocalPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ExecOffcPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BusActCode" type="{http://jackhenry.com/jxchange/TPG/2008}BusActCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NAICSCode" type="{http://jackhenry.com/jxchange/TPG/2008}NAICSCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpPrincArray" type="{http://jackhenry.com/jxchange/TPG/2008}CorpPrincArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AccntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AccntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CorpStmtArray" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="GuarAppInfo" type="{http://jackhenry.com/jxchange/TPG/2008}GuarAppInfo_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppCommInfo_CType", propOrder = {
    "legalName",
    "corpLegalOrgLoc",
    "corpLegalOrgDt",
    "franchiseName",
    "aflEntityNameArray",
    "tradeNameArray",
    "prvTradeNameArray",
    "localAddr",
    "execOffcAddr",
    "localPhoneArray",
    "execOffcPhoneArray",
    "taxId",
    "busActCode",
    "naicsCode",
    "corpPrincArray",
    "accntInfo",
    "corpStmtArray",
    "guarAppInfo",
    "ver1",
    "custId",
    "ver2",
    "any"
})
public class PltfmAppCommInfoCType {

    @XmlElement(name = "LegalName")
    protected LegalNameType legalName;
    @XmlElement(name = "CorpLegalOrgLoc")
    protected CorpLegalOrgLocType corpLegalOrgLoc;
    @XmlElement(name = "CorpLegalOrgDt")
    protected CorpLegalOrgDtType corpLegalOrgDt;
    @XmlElement(name = "FranchiseName")
    protected FranchiseNameType franchiseName;
    @XmlElement(name = "AflEntityNameArray")
    protected AflEntityNameArrayAType aflEntityNameArray;
    @XmlElement(name = "TradeNameArray")
    protected TradeNameArrayAType tradeNameArray;
    @XmlElement(name = "PrvTradeNameArray")
    protected PrevTradeNameArrayAType prvTradeNameArray;
    @XmlElement(name = "LocalAddr")
    protected AddrCType localAddr;
    @XmlElement(name = "ExecOffcAddr")
    protected AddrCType execOffcAddr;
    @XmlElement(name = "LocalPhoneArray")
    protected PhoneArrayAType localPhoneArray;
    @XmlElement(name = "ExecOffcPhoneArray")
    protected PhoneArrayAType execOffcPhoneArray;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "BusActCode")
    protected BusActCodeType busActCode;
    @XmlElement(name = "NAICSCode")
    protected NAICSCodeType naicsCode;
    @XmlElement(name = "CorpPrincArray")
    protected CorpPrincArrayAType corpPrincArray;
    @XmlElement(name = "AccntInfo")
    protected AccntInfoCType accntInfo;
    @XmlElement(name = "CorpStmtArray")
    protected CorpStmtArrayAType corpStmtArray;
    @XmlElement(name = "GuarAppInfo")
    protected GuarAppInfoCType guarAppInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link LegalNameType }
     *     
     */
    public LegalNameType getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalNameType }
     *     
     */
    public void setLegalName(LegalNameType value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the corpLegalOrgLoc property.
     * 
     * @return
     *     possible object is
     *     {@link CorpLegalOrgLocType }
     *     
     */
    public CorpLegalOrgLocType getCorpLegalOrgLoc() {
        return corpLegalOrgLoc;
    }

    /**
     * Sets the value of the corpLegalOrgLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpLegalOrgLocType }
     *     
     */
    public void setCorpLegalOrgLoc(CorpLegalOrgLocType value) {
        this.corpLegalOrgLoc = value;
    }

    /**
     * Gets the value of the corpLegalOrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link CorpLegalOrgDtType }
     *     
     */
    public CorpLegalOrgDtType getCorpLegalOrgDt() {
        return corpLegalOrgDt;
    }

    /**
     * Sets the value of the corpLegalOrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpLegalOrgDtType }
     *     
     */
    public void setCorpLegalOrgDt(CorpLegalOrgDtType value) {
        this.corpLegalOrgDt = value;
    }

    /**
     * Gets the value of the franchiseName property.
     * 
     * @return
     *     possible object is
     *     {@link FranchiseNameType }
     *     
     */
    public FranchiseNameType getFranchiseName() {
        return franchiseName;
    }

    /**
     * Sets the value of the franchiseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FranchiseNameType }
     *     
     */
    public void setFranchiseName(FranchiseNameType value) {
        this.franchiseName = value;
    }

    /**
     * Gets the value of the aflEntityNameArray property.
     * 
     * @return
     *     possible object is
     *     {@link AflEntityNameArrayAType }
     *     
     */
    public AflEntityNameArrayAType getAflEntityNameArray() {
        return aflEntityNameArray;
    }

    /**
     * Sets the value of the aflEntityNameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflEntityNameArrayAType }
     *     
     */
    public void setAflEntityNameArray(AflEntityNameArrayAType value) {
        this.aflEntityNameArray = value;
    }

    /**
     * Gets the value of the tradeNameArray property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNameArrayAType }
     *     
     */
    public TradeNameArrayAType getTradeNameArray() {
        return tradeNameArray;
    }

    /**
     * Sets the value of the tradeNameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNameArrayAType }
     *     
     */
    public void setTradeNameArray(TradeNameArrayAType value) {
        this.tradeNameArray = value;
    }

    /**
     * Gets the value of the prvTradeNameArray property.
     * 
     * @return
     *     possible object is
     *     {@link PrevTradeNameArrayAType }
     *     
     */
    public PrevTradeNameArrayAType getPrvTradeNameArray() {
        return prvTradeNameArray;
    }

    /**
     * Sets the value of the prvTradeNameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevTradeNameArrayAType }
     *     
     */
    public void setPrvTradeNameArray(PrevTradeNameArrayAType value) {
        this.prvTradeNameArray = value;
    }

    /**
     * Gets the value of the localAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getLocalAddr() {
        return localAddr;
    }

    /**
     * Sets the value of the localAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setLocalAddr(AddrCType value) {
        this.localAddr = value;
    }

    /**
     * Gets the value of the execOffcAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getExecOffcAddr() {
        return execOffcAddr;
    }

    /**
     * Sets the value of the execOffcAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setExecOffcAddr(AddrCType value) {
        this.execOffcAddr = value;
    }

    /**
     * Gets the value of the localPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getLocalPhoneArray() {
        return localPhoneArray;
    }

    /**
     * Sets the value of the localPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setLocalPhoneArray(PhoneArrayAType value) {
        this.localPhoneArray = value;
    }

    /**
     * Gets the value of the execOffcPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getExecOffcPhoneArray() {
        return execOffcPhoneArray;
    }

    /**
     * Sets the value of the execOffcPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setExecOffcPhoneArray(PhoneArrayAType value) {
        this.execOffcPhoneArray = value;
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
     * Gets the value of the busActCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusActCodeType }
     *     
     */
    public BusActCodeType getBusActCode() {
        return busActCode;
    }

    /**
     * Sets the value of the busActCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusActCodeType }
     *     
     */
    public void setBusActCode(BusActCodeType value) {
        this.busActCode = value;
    }

    /**
     * Gets the value of the naicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link NAICSCodeType }
     *     
     */
    public NAICSCodeType getNAICSCode() {
        return naicsCode;
    }

    /**
     * Sets the value of the naicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAICSCodeType }
     *     
     */
    public void setNAICSCode(NAICSCodeType value) {
        this.naicsCode = value;
    }

    /**
     * Gets the value of the corpPrincArray property.
     * 
     * @return
     *     possible object is
     *     {@link CorpPrincArrayAType }
     *     
     */
    public CorpPrincArrayAType getCorpPrincArray() {
        return corpPrincArray;
    }

    /**
     * Sets the value of the corpPrincArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpPrincArrayAType }
     *     
     */
    public void setCorpPrincArray(CorpPrincArrayAType value) {
        this.corpPrincArray = value;
    }

    /**
     * Gets the value of the accntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccntInfoCType }
     *     
     */
    public AccntInfoCType getAccntInfo() {
        return accntInfo;
    }

    /**
     * Sets the value of the accntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccntInfoCType }
     *     
     */
    public void setAccntInfo(AccntInfoCType value) {
        this.accntInfo = value;
    }

    /**
     * Gets the value of the corpStmtArray property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtArrayAType }
     *     
     */
    public CorpStmtArrayAType getCorpStmtArray() {
        return corpStmtArray;
    }

    /**
     * Sets the value of the corpStmtArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtArrayAType }
     *     
     */
    public void setCorpStmtArray(CorpStmtArrayAType value) {
        this.corpStmtArray = value;
    }

    /**
     * Gets the value of the guarAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GuarAppInfoCType }
     *     
     */
    public GuarAppInfoCType getGuarAppInfo() {
        return guarAppInfo;
    }

    /**
     * Sets the value of the guarAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuarAppInfoCType }
     *     
     */
    public void setGuarAppInfo(GuarAppInfoCType value) {
        this.guarAppInfo = value;
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
