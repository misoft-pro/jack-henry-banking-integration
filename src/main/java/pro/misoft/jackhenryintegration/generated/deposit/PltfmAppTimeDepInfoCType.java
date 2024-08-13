
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
 * <p>Java class for PltfmAppTimeDepInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppTimeDepInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenBal" type="{http://jackhenry.com/jxchange/TPG/2008}OpenBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcFundsCode" type="{http://jackhenry.com/jxchange/TPG/2008}SrcFundsCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDisp" type="{http://jackhenry.com/jxchange/TPG/2008}IntDisp_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDispAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}IntDispAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDispAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}IntDispAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctOwnType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctOwnType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PltfmClsfPrimType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmClsfPrimType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PltfmOwnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmOwnCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="FedWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="IRSExmpCode" type="{http://jackhenry.com/jxchange/TPG/2008}IRSExmpCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctClsfCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctClsfCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *           &lt;element name="SalesPerson" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPerson_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctLvlSecCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ScsrCstdnName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *           &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="CDTerm" type="{http://jackhenry.com/jxchange/TPG/2008}CDTerm_Type" minOccurs="0"/&gt;
 *           &lt;element name="CDTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}CDTermUnits_Type" minOccurs="0"/&gt;
 *           &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="StmtFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AutoRenType" type="{http://jackhenry.com/jxchange/TPG/2008}AutoRenType_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateType" type="{http://jackhenry.com/jxchange/TPG/2008}RateType_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *           &lt;element name="VarIntRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}VarIntRateInfo_CType" minOccurs="0"/&gt;
 *           &lt;element name="IntTerm" type="{http://jackhenry.com/jxchange/TPG/2008}IntTerm_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}IntTermUnits_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntPmtStrtDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntCalcCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntYrBaseCode" type="{http://jackhenry.com/jxchange/TPG/2008}IntYrBaseCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PenCode" type="{http://jackhenry.com/jxchange/TPG/2008}PenCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="SrcFundsArray" type="{http://jackhenry.com/jxchange/TPG/2008}SrcFundsArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="OffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}OffInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="RateSchedArray" type="{http://jackhenry.com/jxchange/TPG/2008}RateSchedArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="BenfArray" type="{http://jackhenry.com/jxchange/TPG/2008}BenfArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *             &lt;element name="CallRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="IntDayMonth" type="{http://jackhenry.com/jxchange/TPG/2008}IntDayMonth_Type" minOccurs="0"/&gt;
 *             &lt;element name="CRARec" type="{http://jackhenry.com/jxchange/TPG/2008}CRARec_CType" minOccurs="0"/&gt;
 *             &lt;element name="RateTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RateTypeDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="AcctResDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctResDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="PltfmAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAddrArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PODRegType" type="{http://jackhenry.com/jxchange/TPG/2008}PODRegType_Type" minOccurs="0"/&gt;
 *               &lt;element name="AcctTitleArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_AType" minOccurs="0"/&gt;
 *               &lt;element name="DueDilgntCmpltArray" type="{http://jackhenry.com/jxchange/TPG/2008}DueDilgntCmpltArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="EstbPersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *                 &lt;element name="EstbPersonTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *                 &lt;element name="CommAuthArray" type="{http://jackhenry.com/jxchange/TPG/2008}CommAuthArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="AcctPurp" type="{http://jackhenry.com/jxchange/TPG/2008}AcctPurp_Type" minOccurs="0"/&gt;
 *                   &lt;element name="BusResInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BusResInfo_CType" minOccurs="0"/&gt;
 *                   &lt;element name="ProdSvcOptArray" type="{http://jackhenry.com/jxchange/TPG/2008}ProdSvcOptArray_AType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="IncSoleProprtrNameType" type="{http://jackhenry.com/jxchange/TPG/2008}IncSoleProprtrNameType_Type" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "PltfmAppTimeDepInfo_CType", propOrder = {
    "prodCode",
    "openBal",
    "srcFundsCode",
    "intDisp",
    "intDispAcctId",
    "intDispAcctType",
    "achCrAcctId",
    "achCrName",
    "achCrRtNum",
    "achTrnCode",
    "ver1",
    "regionCode",
    "brCode",
    "acctOwnType",
    "pltfmClsfPrimType",
    "pltfmOwnCode",
    "fedWithCode",
    "irsExmpCode",
    "acctClsfCode",
    "accountId",
    "salesPerson",
    "acctLvlSecCode",
    "scsrCstdnName",
    "openDt",
    "cdTerm",
    "cdTermUnits",
    "matDt",
    "stmtFreqCode",
    "autoRenType",
    "rateType",
    "intRate",
    "varIntRateInfo",
    "intTerm",
    "intTermUnits",
    "intPmtStrtDt",
    "intCalcCode",
    "intYrBaseCode",
    "penCode",
    "srcFundsArray",
    "offInfoArray",
    "rateSchedArray",
    "userDefInfoArray",
    "benfArray",
    "ver2",
    "glProdCode",
    "glCostCtr",
    "callRptCode",
    "intDayMonth",
    "craRec",
    "rateTypeDesc",
    "acctResDesc",
    "pltfmAddrArray",
    "ver3",
    "podRegType",
    "acctTitleArray",
    "dueDilgntCmpltArray",
    "ver4",
    "estbPersonName",
    "estbPersonTitle",
    "commAuthArray",
    "ver5",
    "acctPurp",
    "busResInfo",
    "prodSvcOptArray",
    "ver6",
    "incSoleProprtrNameType",
    "ver7",
    "any"
})
public class PltfmAppTimeDepInfoCType {

    @XmlElement(name = "ProdCode")
    protected ProdCodeType prodCode;
    @XmlElement(name = "OpenBal")
    protected OpenBalType openBal;
    @XmlElement(name = "SrcFundsCode")
    protected SrcFundsCodeType srcFundsCode;
    @XmlElement(name = "IntDisp")
    protected IntDispType intDisp;
    @XmlElement(name = "IntDispAcctId")
    protected IntDispAcctIdType intDispAcctId;
    @XmlElement(name = "IntDispAcctType")
    protected IntDispAcctTypeType intDispAcctType;
    @XmlElement(name = "ACHCrAcctId")
    protected ACHCrAcctIdType achCrAcctId;
    @XmlElement(name = "ACHCrName")
    protected ACHCrNameType achCrName;
    @XmlElement(name = "ACHCrRtNum")
    protected ACHCrRtNumType achCrRtNum;
    @XmlElement(name = "ACHTrnCode")
    protected ACHTrnCodeType achTrnCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RegionCode")
    protected RegionCodeType regionCode;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "AcctOwnType")
    protected AcctOwnTypeType acctOwnType;
    @XmlElement(name = "PltfmClsfPrimType")
    protected PltfmClsfPrimTypeType pltfmClsfPrimType;
    @XmlElement(name = "PltfmOwnCode")
    protected PltfmOwnCodeType pltfmOwnCode;
    @XmlElement(name = "FedWithCode")
    protected FedWithCodeType fedWithCode;
    @XmlElement(name = "IRSExmpCode")
    protected IRSExmpCodeType irsExmpCode;
    @XmlElement(name = "AcctClsfCode")
    protected AcctClsfCodeType acctClsfCode;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "SalesPerson")
    protected SalesPersonType salesPerson;
    @XmlElement(name = "AcctLvlSecCode")
    protected AcctLvlSecCodeType acctLvlSecCode;
    @XmlElement(name = "ScsrCstdnName")
    protected ComNameType scsrCstdnName;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "CDTerm")
    protected CDTermType cdTerm;
    @XmlElement(name = "CDTermUnits")
    protected CDTermUnitsType cdTermUnits;
    @XmlElement(name = "MatDt")
    protected MatDtType matDt;
    @XmlElement(name = "StmtFreqCode")
    protected StmtFreqCodeType stmtFreqCode;
    @XmlElement(name = "AutoRenType")
    protected AutoRenTypeType autoRenType;
    @XmlElement(name = "RateType")
    protected RateTypeType rateType;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "VarIntRateInfo")
    protected VarIntRateInfoCType varIntRateInfo;
    @XmlElement(name = "IntTerm")
    protected IntTermType intTerm;
    @XmlElement(name = "IntTermUnits")
    protected IntTermUnitsType intTermUnits;
    @XmlElement(name = "IntPmtStrtDt")
    protected NxtPayDtType intPmtStrtDt;
    @XmlElement(name = "IntCalcCode")
    protected IntCalcCodeType intCalcCode;
    @XmlElement(name = "IntYrBaseCode")
    protected IntYrBaseCodeType intYrBaseCode;
    @XmlElement(name = "PenCode")
    protected PenCodeType penCode;
    @XmlElement(name = "SrcFundsArray")
    protected SrcFundsArrayAType srcFundsArray;
    @XmlElement(name = "OffInfoArray")
    protected OffInfoArrayAType offInfoArray;
    @XmlElement(name = "RateSchedArray")
    protected RateSchedArrayAType rateSchedArray;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "BenfArray")
    protected BenfArrayAType benfArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "CallRptCode")
    protected CallRptCodeType callRptCode;
    @XmlElement(name = "IntDayMonth")
    protected IntDayMonthType intDayMonth;
    @XmlElement(name = "CRARec")
    protected CRARecCType craRec;
    @XmlElement(name = "RateTypeDesc")
    protected RateTypeDescType rateTypeDesc;
    @XmlElement(name = "AcctResDesc")
    protected AcctResDescType acctResDesc;
    @XmlElement(name = "PltfmAddrArray")
    protected PltfmAddrArrayAType pltfmAddrArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PODRegType")
    protected PODRegTypeType podRegType;
    @XmlElement(name = "AcctTitleArray")
    protected AcctTitleAType acctTitleArray;
    @XmlElement(name = "DueDilgntCmpltArray")
    protected DueDilgntCmpltArrayAType dueDilgntCmpltArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "EstbPersonName")
    protected PersonNameCType estbPersonName;
    @XmlElement(name = "EstbPersonTitle")
    protected EmplTitleType estbPersonTitle;
    @XmlElement(name = "CommAuthArray")
    protected CommAuthArrayAType commAuthArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "AcctPurp")
    protected AcctPurpType acctPurp;
    @XmlElement(name = "BusResInfo")
    protected BusResInfoCType busResInfo;
    @XmlElement(name = "ProdSvcOptArray")
    protected ProdSvcOptArrayAType prodSvcOptArray;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "IncSoleProprtrNameType")
    protected IncSoleProprtrNameTypeType incSoleProprtrNameType;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setProdCode(ProdCodeType value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the openBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpenBalType }
     *     
     */
    public OpenBalType getOpenBal() {
        return openBal;
    }

    /**
     * Sets the value of the openBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenBalType }
     *     
     */
    public void setOpenBal(OpenBalType value) {
        this.openBal = value;
    }

    /**
     * Gets the value of the srcFundsCode property.
     * 
     * @return
     *     possible object is
     *     {@link SrcFundsCodeType }
     *     
     */
    public SrcFundsCodeType getSrcFundsCode() {
        return srcFundsCode;
    }

    /**
     * Sets the value of the srcFundsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcFundsCodeType }
     *     
     */
    public void setSrcFundsCode(SrcFundsCodeType value) {
        this.srcFundsCode = value;
    }

    /**
     * Gets the value of the intDisp property.
     * 
     * @return
     *     possible object is
     *     {@link IntDispType }
     *     
     */
    public IntDispType getIntDisp() {
        return intDisp;
    }

    /**
     * Sets the value of the intDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDispType }
     *     
     */
    public void setIntDisp(IntDispType value) {
        this.intDisp = value;
    }

    /**
     * Gets the value of the intDispAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link IntDispAcctIdType }
     *     
     */
    public IntDispAcctIdType getIntDispAcctId() {
        return intDispAcctId;
    }

    /**
     * Sets the value of the intDispAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDispAcctIdType }
     *     
     */
    public void setIntDispAcctId(IntDispAcctIdType value) {
        this.intDispAcctId = value;
    }

    /**
     * Gets the value of the intDispAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link IntDispAcctTypeType }
     *     
     */
    public IntDispAcctTypeType getIntDispAcctType() {
        return intDispAcctType;
    }

    /**
     * Sets the value of the intDispAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDispAcctTypeType }
     *     
     */
    public void setIntDispAcctType(IntDispAcctTypeType value) {
        this.intDispAcctType = value;
    }

    /**
     * Gets the value of the achCrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCrAcctIdType }
     *     
     */
    public ACHCrAcctIdType getACHCrAcctId() {
        return achCrAcctId;
    }

    /**
     * Sets the value of the achCrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCrAcctIdType }
     *     
     */
    public void setACHCrAcctId(ACHCrAcctIdType value) {
        this.achCrAcctId = value;
    }

    /**
     * Gets the value of the achCrName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCrNameType }
     *     
     */
    public ACHCrNameType getACHCrName() {
        return achCrName;
    }

    /**
     * Sets the value of the achCrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCrNameType }
     *     
     */
    public void setACHCrName(ACHCrNameType value) {
        this.achCrName = value;
    }

    /**
     * Gets the value of the achCrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCrRtNumType }
     *     
     */
    public ACHCrRtNumType getACHCrRtNum() {
        return achCrRtNum;
    }

    /**
     * Sets the value of the achCrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCrRtNumType }
     *     
     */
    public void setACHCrRtNum(ACHCrRtNumType value) {
        this.achCrRtNum = value;
    }

    /**
     * Gets the value of the achTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTrnCodeType }
     *     
     */
    public ACHTrnCodeType getACHTrnCode() {
        return achTrnCode;
    }

    /**
     * Sets the value of the achTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTrnCodeType }
     *     
     */
    public void setACHTrnCode(ACHTrnCodeType value) {
        this.achTrnCode = value;
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
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeType }
     *     
     */
    public RegionCodeType getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeType }
     *     
     */
    public void setRegionCode(RegionCodeType value) {
        this.regionCode = value;
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
     * Gets the value of the acctOwnType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctOwnTypeType }
     *     
     */
    public AcctOwnTypeType getAcctOwnType() {
        return acctOwnType;
    }

    /**
     * Sets the value of the acctOwnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctOwnTypeType }
     *     
     */
    public void setAcctOwnType(AcctOwnTypeType value) {
        this.acctOwnType = value;
    }

    /**
     * Gets the value of the pltfmClsfPrimType property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmClsfPrimTypeType }
     *     
     */
    public PltfmClsfPrimTypeType getPltfmClsfPrimType() {
        return pltfmClsfPrimType;
    }

    /**
     * Sets the value of the pltfmClsfPrimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmClsfPrimTypeType }
     *     
     */
    public void setPltfmClsfPrimType(PltfmClsfPrimTypeType value) {
        this.pltfmClsfPrimType = value;
    }

    /**
     * Gets the value of the pltfmOwnCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmOwnCodeType }
     *     
     */
    public PltfmOwnCodeType getPltfmOwnCode() {
        return pltfmOwnCode;
    }

    /**
     * Sets the value of the pltfmOwnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmOwnCodeType }
     *     
     */
    public void setPltfmOwnCode(PltfmOwnCodeType value) {
        this.pltfmOwnCode = value;
    }

    /**
     * Gets the value of the fedWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link FedWithCodeType }
     *     
     */
    public FedWithCodeType getFedWithCode() {
        return fedWithCode;
    }

    /**
     * Sets the value of the fedWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedWithCodeType }
     *     
     */
    public void setFedWithCode(FedWithCodeType value) {
        this.fedWithCode = value;
    }

    /**
     * Gets the value of the irsExmpCode property.
     * 
     * @return
     *     possible object is
     *     {@link IRSExmpCodeType }
     *     
     */
    public IRSExmpCodeType getIRSExmpCode() {
        return irsExmpCode;
    }

    /**
     * Sets the value of the irsExmpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IRSExmpCodeType }
     *     
     */
    public void setIRSExmpCode(IRSExmpCodeType value) {
        this.irsExmpCode = value;
    }

    /**
     * Gets the value of the acctClsfCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctClsfCodeType }
     *     
     */
    public AcctClsfCodeType getAcctClsfCode() {
        return acctClsfCode;
    }

    /**
     * Sets the value of the acctClsfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctClsfCodeType }
     *     
     */
    public void setAcctClsfCode(AcctClsfCodeType value) {
        this.acctClsfCode = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the salesPerson property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersonType }
     *     
     */
    public SalesPersonType getSalesPerson() {
        return salesPerson;
    }

    /**
     * Sets the value of the salesPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersonType }
     *     
     */
    public void setSalesPerson(SalesPersonType value) {
        this.salesPerson = value;
    }

    /**
     * Gets the value of the acctLvlSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctLvlSecCodeType }
     *     
     */
    public AcctLvlSecCodeType getAcctLvlSecCode() {
        return acctLvlSecCode;
    }

    /**
     * Sets the value of the acctLvlSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctLvlSecCodeType }
     *     
     */
    public void setAcctLvlSecCode(AcctLvlSecCodeType value) {
        this.acctLvlSecCode = value;
    }

    /**
     * Gets the value of the scsrCstdnName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getScsrCstdnName() {
        return scsrCstdnName;
    }

    /**
     * Sets the value of the scsrCstdnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setScsrCstdnName(ComNameType value) {
        this.scsrCstdnName = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDtType }
     *     
     */
    public OpenDtType getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDtType }
     *     
     */
    public void setOpenDt(OpenDtType value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the cdTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CDTermType }
     *     
     */
    public CDTermType getCDTerm() {
        return cdTerm;
    }

    /**
     * Sets the value of the cdTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDTermType }
     *     
     */
    public void setCDTerm(CDTermType value) {
        this.cdTerm = value;
    }

    /**
     * Gets the value of the cdTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CDTermUnitsType }
     *     
     */
    public CDTermUnitsType getCDTermUnits() {
        return cdTermUnits;
    }

    /**
     * Sets the value of the cdTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDTermUnitsType }
     *     
     */
    public void setCDTermUnits(CDTermUnitsType value) {
        this.cdTermUnits = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link MatDtType }
     *     
     */
    public MatDtType getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatDtType }
     *     
     */
    public void setMatDt(MatDtType value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the stmtFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFreqCodeType }
     *     
     */
    public StmtFreqCodeType getStmtFreqCode() {
        return stmtFreqCode;
    }

    /**
     * Sets the value of the stmtFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFreqCodeType }
     *     
     */
    public void setStmtFreqCode(StmtFreqCodeType value) {
        this.stmtFreqCode = value;
    }

    /**
     * Gets the value of the autoRenType property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRenTypeType }
     *     
     */
    public AutoRenTypeType getAutoRenType() {
        return autoRenType;
    }

    /**
     * Sets the value of the autoRenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRenTypeType }
     *     
     */
    public void setAutoRenType(AutoRenTypeType value) {
        this.autoRenType = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeType }
     *     
     */
    public RateTypeType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeType }
     *     
     */
    public void setRateType(RateTypeType value) {
        this.rateType = value;
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
     * Gets the value of the varIntRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VarIntRateInfoCType }
     *     
     */
    public VarIntRateInfoCType getVarIntRateInfo() {
        return varIntRateInfo;
    }

    /**
     * Sets the value of the varIntRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarIntRateInfoCType }
     *     
     */
    public void setVarIntRateInfo(VarIntRateInfoCType value) {
        this.varIntRateInfo = value;
    }

    /**
     * Gets the value of the intTerm property.
     * 
     * @return
     *     possible object is
     *     {@link IntTermType }
     *     
     */
    public IntTermType getIntTerm() {
        return intTerm;
    }

    /**
     * Sets the value of the intTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTermType }
     *     
     */
    public void setIntTerm(IntTermType value) {
        this.intTerm = value;
    }

    /**
     * Gets the value of the intTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link IntTermUnitsType }
     *     
     */
    public IntTermUnitsType getIntTermUnits() {
        return intTermUnits;
    }

    /**
     * Sets the value of the intTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntTermUnitsType }
     *     
     */
    public void setIntTermUnits(IntTermUnitsType value) {
        this.intTermUnits = value;
    }

    /**
     * Gets the value of the intPmtStrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getIntPmtStrtDt() {
        return intPmtStrtDt;
    }

    /**
     * Sets the value of the intPmtStrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setIntPmtStrtDt(NxtPayDtType value) {
        this.intPmtStrtDt = value;
    }

    /**
     * Gets the value of the intCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntCalcCodeType }
     *     
     */
    public IntCalcCodeType getIntCalcCode() {
        return intCalcCode;
    }

    /**
     * Sets the value of the intCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCalcCodeType }
     *     
     */
    public void setIntCalcCode(IntCalcCodeType value) {
        this.intCalcCode = value;
    }

    /**
     * Gets the value of the intYrBaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntYrBaseCodeType }
     *     
     */
    public IntYrBaseCodeType getIntYrBaseCode() {
        return intYrBaseCode;
    }

    /**
     * Sets the value of the intYrBaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntYrBaseCodeType }
     *     
     */
    public void setIntYrBaseCode(IntYrBaseCodeType value) {
        this.intYrBaseCode = value;
    }

    /**
     * Gets the value of the penCode property.
     * 
     * @return
     *     possible object is
     *     {@link PenCodeType }
     *     
     */
    public PenCodeType getPenCode() {
        return penCode;
    }

    /**
     * Sets the value of the penCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenCodeType }
     *     
     */
    public void setPenCode(PenCodeType value) {
        this.penCode = value;
    }

    /**
     * Gets the value of the srcFundsArray property.
     * 
     * @return
     *     possible object is
     *     {@link SrcFundsArrayAType }
     *     
     */
    public SrcFundsArrayAType getSrcFundsArray() {
        return srcFundsArray;
    }

    /**
     * Sets the value of the srcFundsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcFundsArrayAType }
     *     
     */
    public void setSrcFundsArray(SrcFundsArrayAType value) {
        this.srcFundsArray = value;
    }

    /**
     * Gets the value of the offInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public OffInfoArrayAType getOffInfoArray() {
        return offInfoArray;
    }

    /**
     * Sets the value of the offInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffInfoArrayAType }
     *     
     */
    public void setOffInfoArray(OffInfoArrayAType value) {
        this.offInfoArray = value;
    }

    /**
     * Gets the value of the rateSchedArray property.
     * 
     * @return
     *     possible object is
     *     {@link RateSchedArrayAType }
     *     
     */
    public RateSchedArrayAType getRateSchedArray() {
        return rateSchedArray;
    }

    /**
     * Sets the value of the rateSchedArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSchedArrayAType }
     *     
     */
    public void setRateSchedArray(RateSchedArrayAType value) {
        this.rateSchedArray = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
    }

    /**
     * Gets the value of the benfArray property.
     * 
     * @return
     *     possible object is
     *     {@link BenfArrayAType }
     *     
     */
    public BenfArrayAType getBenfArray() {
        return benfArray;
    }

    /**
     * Sets the value of the benfArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfArrayAType }
     *     
     */
    public void setBenfArray(BenfArrayAType value) {
        this.benfArray = value;
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
     * Gets the value of the callRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptCodeType }
     *     
     */
    public CallRptCodeType getCallRptCode() {
        return callRptCode;
    }

    /**
     * Sets the value of the callRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptCodeType }
     *     
     */
    public void setCallRptCode(CallRptCodeType value) {
        this.callRptCode = value;
    }

    /**
     * Gets the value of the intDayMonth property.
     * 
     * @return
     *     possible object is
     *     {@link IntDayMonthType }
     *     
     */
    public IntDayMonthType getIntDayMonth() {
        return intDayMonth;
    }

    /**
     * Sets the value of the intDayMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDayMonthType }
     *     
     */
    public void setIntDayMonth(IntDayMonthType value) {
        this.intDayMonth = value;
    }

    /**
     * Gets the value of the craRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRARecCType }
     *     
     */
    public CRARecCType getCRARec() {
        return craRec;
    }

    /**
     * Sets the value of the craRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRARecCType }
     *     
     */
    public void setCRARec(CRARecCType value) {
        this.craRec = value;
    }

    /**
     * Gets the value of the rateTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeDescType }
     *     
     */
    public RateTypeDescType getRateTypeDesc() {
        return rateTypeDesc;
    }

    /**
     * Sets the value of the rateTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeDescType }
     *     
     */
    public void setRateTypeDesc(RateTypeDescType value) {
        this.rateTypeDesc = value;
    }

    /**
     * Gets the value of the acctResDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctResDescType }
     *     
     */
    public AcctResDescType getAcctResDesc() {
        return acctResDesc;
    }

    /**
     * Sets the value of the acctResDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctResDescType }
     *     
     */
    public void setAcctResDesc(AcctResDescType value) {
        this.acctResDesc = value;
    }

    /**
     * Gets the value of the pltfmAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAddrArrayAType }
     *     
     */
    public PltfmAddrArrayAType getPltfmAddrArray() {
        return pltfmAddrArray;
    }

    /**
     * Sets the value of the pltfmAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAddrArrayAType }
     *     
     */
    public void setPltfmAddrArray(PltfmAddrArrayAType value) {
        this.pltfmAddrArray = value;
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
     * Gets the value of the podRegType property.
     * 
     * @return
     *     possible object is
     *     {@link PODRegTypeType }
     *     
     */
    public PODRegTypeType getPODRegType() {
        return podRegType;
    }

    /**
     * Sets the value of the podRegType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PODRegTypeType }
     *     
     */
    public void setPODRegType(PODRegTypeType value) {
        this.podRegType = value;
    }

    /**
     * Gets the value of the acctTitleArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleAType }
     *     
     */
    public AcctTitleAType getAcctTitleArray() {
        return acctTitleArray;
    }

    /**
     * Sets the value of the acctTitleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleAType }
     *     
     */
    public void setAcctTitleArray(AcctTitleAType value) {
        this.acctTitleArray = value;
    }

    /**
     * Gets the value of the dueDilgntCmpltArray property.
     * 
     * @return
     *     possible object is
     *     {@link DueDilgntCmpltArrayAType }
     *     
     */
    public DueDilgntCmpltArrayAType getDueDilgntCmpltArray() {
        return dueDilgntCmpltArray;
    }

    /**
     * Sets the value of the dueDilgntCmpltArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueDilgntCmpltArrayAType }
     *     
     */
    public void setDueDilgntCmpltArray(DueDilgntCmpltArrayAType value) {
        this.dueDilgntCmpltArray = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
    }

    /**
     * Gets the value of the estbPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getEstbPersonName() {
        return estbPersonName;
    }

    /**
     * Sets the value of the estbPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setEstbPersonName(PersonNameCType value) {
        this.estbPersonName = value;
    }

    /**
     * Gets the value of the estbPersonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getEstbPersonTitle() {
        return estbPersonTitle;
    }

    /**
     * Sets the value of the estbPersonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setEstbPersonTitle(EmplTitleType value) {
        this.estbPersonTitle = value;
    }

    /**
     * Gets the value of the commAuthArray property.
     * 
     * @return
     *     possible object is
     *     {@link CommAuthArrayAType }
     *     
     */
    public CommAuthArrayAType getCommAuthArray() {
        return commAuthArray;
    }

    /**
     * Sets the value of the commAuthArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommAuthArrayAType }
     *     
     */
    public void setCommAuthArray(CommAuthArrayAType value) {
        this.commAuthArray = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
    }

    /**
     * Gets the value of the acctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link AcctPurpType }
     *     
     */
    public AcctPurpType getAcctPurp() {
        return acctPurp;
    }

    /**
     * Sets the value of the acctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctPurpType }
     *     
     */
    public void setAcctPurp(AcctPurpType value) {
        this.acctPurp = value;
    }

    /**
     * Gets the value of the busResInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BusResInfoCType }
     *     
     */
    public BusResInfoCType getBusResInfo() {
        return busResInfo;
    }

    /**
     * Sets the value of the busResInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusResInfoCType }
     *     
     */
    public void setBusResInfo(BusResInfoCType value) {
        this.busResInfo = value;
    }

    /**
     * Gets the value of the prodSvcOptArray property.
     * 
     * @return
     *     possible object is
     *     {@link ProdSvcOptArrayAType }
     *     
     */
    public ProdSvcOptArrayAType getProdSvcOptArray() {
        return prodSvcOptArray;
    }

    /**
     * Sets the value of the prodSvcOptArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdSvcOptArrayAType }
     *     
     */
    public void setProdSvcOptArray(ProdSvcOptArrayAType value) {
        this.prodSvcOptArray = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
    }

    /**
     * Gets the value of the incSoleProprtrNameType property.
     * 
     * @return
     *     possible object is
     *     {@link IncSoleProprtrNameTypeType }
     *     
     */
    public IncSoleProprtrNameTypeType getIncSoleProprtrNameType() {
        return incSoleProprtrNameType;
    }

    /**
     * Sets the value of the incSoleProprtrNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncSoleProprtrNameTypeType }
     *     
     */
    public void setIncSoleProprtrNameType(IncSoleProprtrNameTypeType value) {
        this.incSoleProprtrNameType = value;
    }

    /**
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
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
