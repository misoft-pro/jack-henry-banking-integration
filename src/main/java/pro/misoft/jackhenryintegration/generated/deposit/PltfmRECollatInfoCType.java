
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
 * <p>Java class for PltfmRECollatInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmRECollatInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="PropLegalInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PropLegalInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumUnit" type="{http://jackhenry.com/jxchange/TPG/2008}NumUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="YrBuilt" type="{http://jackhenry.com/jxchange/TPG/2008}YrBuilt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropCode" type="{http://jackhenry.com/jxchange/TPG/2008}PropCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="YrLotAcq" type="{http://jackhenry.com/jxchange/TPG/2008}YrLotAcq_Type" minOccurs="0"/&gt;
 *         &lt;element name="YrPropAcq" type="{http://jackhenry.com/jxchange/TPG/2008}YrPropAcq_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigPropCostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OrigPropCostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatLienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatLienAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LotValAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LotValAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImprovCostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ImprovCostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RefinPurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}RefinPurpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RefinImprovInfo" type="{http://jackhenry.com/jxchange/TPG/2008}RefinImprovInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="RefinImprovCost" type="{http://jackhenry.com/jxchange/TPG/2008}RefinImprovCost_Type" minOccurs="0"/&gt;
 *         &lt;element name="RefinImprovExst" type="{http://jackhenry.com/jxchange/TPG/2008}RefinImprovExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropAcctTitle" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropTitleType" type="{http://jackhenry.com/jxchange/TPG/2008}PropTitleType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropEstateType" type="{http://jackhenry.com/jxchange/TPG/2008}PropEstateType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropLeaseExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}PropLeaseExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DownPmtSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}DownPmtSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PropEstVal" type="{http://jackhenry.com/jxchange/TPG/2008}PropEstVal_Type" minOccurs="0"/&gt;
 *           &lt;element name="OccupProp" type="{http://jackhenry.com/jxchange/TPG/2008}OccupProp_Type" minOccurs="0"/&gt;
 *           &lt;element name="ResType" type="{http://jackhenry.com/jxchange/TPG/2008}ResType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PropType" type="{http://jackhenry.com/jxchange/TPG/2008}PropType_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatHolderName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;element name="CollatHolderAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ApprDt" type="{http://jackhenry.com/jxchange/TPG/2008}ApprDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CollatInsurArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatInsurArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="CollatOwnArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatOwnArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="LienExstArray" type="{http://jackhenry.com/jxchange/TPG/2008}LienExstArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmRECollatInfo_CType", propOrder = {
    "propAddr",
    "propLegalInfo",
    "numUnit",
    "yrBuilt",
    "propCode",
    "yrLotAcq",
    "yrPropAcq",
    "origPropCostAmt",
    "collatLienAmt",
    "lotValAmt",
    "improvCostAmt",
    "refinPurpCode",
    "refinImprovInfo",
    "refinImprovCost",
    "refinImprovExst",
    "propAcctTitle",
    "propTitleType",
    "propEstateType",
    "propLeaseExpDt",
    "downPmtSrcCode",
    "ver1",
    "collatCode",
    "propEstVal",
    "occupProp",
    "resType",
    "propType",
    "collatHolderName",
    "collatHolderAddr",
    "ver2",
    "apprDt",
    "collatInsurArray",
    "collatOwnArray",
    "lienExstArray",
    "ver3",
    "any"
})
public class PltfmRECollatInfoCType {

    @XmlElement(name = "PropAddr")
    protected AddrCType propAddr;
    @XmlElement(name = "PropLegalInfo")
    protected PropLegalInfoType propLegalInfo;
    @XmlElement(name = "NumUnit")
    protected NumUnitType numUnit;
    @XmlElement(name = "YrBuilt")
    protected YrBuiltType yrBuilt;
    @XmlElement(name = "PropCode")
    protected PropCodeType propCode;
    @XmlElement(name = "YrLotAcq")
    protected YrLotAcqType yrLotAcq;
    @XmlElement(name = "YrPropAcq")
    protected YrPropAcqType yrPropAcq;
    @XmlElement(name = "OrigPropCostAmt")
    protected OrigPropCostAmtType origPropCostAmt;
    @XmlElement(name = "CollatLienAmt")
    protected CollatLienAmtType collatLienAmt;
    @XmlElement(name = "LotValAmt")
    protected LotValAmtType lotValAmt;
    @XmlElement(name = "ImprovCostAmt")
    protected ImprovCostAmtType improvCostAmt;
    @XmlElement(name = "RefinPurpCode")
    protected RefinPurpCodeType refinPurpCode;
    @XmlElement(name = "RefinImprovInfo")
    protected RefinImprovInfoType refinImprovInfo;
    @XmlElement(name = "RefinImprovCost")
    protected RefinImprovCostType refinImprovCost;
    @XmlElement(name = "RefinImprovExst")
    protected RefinImprovExstType refinImprovExst;
    @XmlElement(name = "PropAcctTitle")
    protected AcctTitleType propAcctTitle;
    @XmlElement(name = "PropTitleType")
    protected PropTitleTypeType propTitleType;
    @XmlElement(name = "PropEstateType")
    protected PropEstateTypeType propEstateType;
    @XmlElement(name = "PropLeaseExpDt")
    protected PropLeaseExpDtType propLeaseExpDt;
    @XmlElement(name = "DownPmtSrcCode")
    protected DownPmtSrcCodeType downPmtSrcCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CollatCode")
    protected CollatCodeType collatCode;
    @XmlElement(name = "PropEstVal")
    protected PropEstValType propEstVal;
    @XmlElement(name = "OccupProp")
    protected OccupPropType occupProp;
    @XmlElement(name = "ResType")
    protected ResTypeType resType;
    @XmlElement(name = "PropType")
    protected PropTypeType propType;
    @XmlElement(name = "CollatHolderName")
    protected PersonNameCType collatHolderName;
    @XmlElement(name = "CollatHolderAddr")
    protected AddrCType collatHolderAddr;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ApprDt")
    protected ApprDtType apprDt;
    @XmlElement(name = "CollatInsurArray")
    protected CollatInsurArrayAType collatInsurArray;
    @XmlElement(name = "CollatOwnArray")
    protected CollatOwnArrayAType collatOwnArray;
    @XmlElement(name = "LienExstArray")
    protected LienExstArrayAType lienExstArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the propAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getPropAddr() {
        return propAddr;
    }

    /**
     * Sets the value of the propAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setPropAddr(AddrCType value) {
        this.propAddr = value;
    }

    /**
     * Gets the value of the propLegalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PropLegalInfoType }
     *     
     */
    public PropLegalInfoType getPropLegalInfo() {
        return propLegalInfo;
    }

    /**
     * Sets the value of the propLegalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropLegalInfoType }
     *     
     */
    public void setPropLegalInfo(PropLegalInfoType value) {
        this.propLegalInfo = value;
    }

    /**
     * Gets the value of the numUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NumUnitType }
     *     
     */
    public NumUnitType getNumUnit() {
        return numUnit;
    }

    /**
     * Sets the value of the numUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumUnitType }
     *     
     */
    public void setNumUnit(NumUnitType value) {
        this.numUnit = value;
    }

    /**
     * Gets the value of the yrBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link YrBuiltType }
     *     
     */
    public YrBuiltType getYrBuilt() {
        return yrBuilt;
    }

    /**
     * Sets the value of the yrBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link YrBuiltType }
     *     
     */
    public void setYrBuilt(YrBuiltType value) {
        this.yrBuilt = value;
    }

    /**
     * Gets the value of the propCode property.
     * 
     * @return
     *     possible object is
     *     {@link PropCodeType }
     *     
     */
    public PropCodeType getPropCode() {
        return propCode;
    }

    /**
     * Sets the value of the propCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropCodeType }
     *     
     */
    public void setPropCode(PropCodeType value) {
        this.propCode = value;
    }

    /**
     * Gets the value of the yrLotAcq property.
     * 
     * @return
     *     possible object is
     *     {@link YrLotAcqType }
     *     
     */
    public YrLotAcqType getYrLotAcq() {
        return yrLotAcq;
    }

    /**
     * Sets the value of the yrLotAcq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YrLotAcqType }
     *     
     */
    public void setYrLotAcq(YrLotAcqType value) {
        this.yrLotAcq = value;
    }

    /**
     * Gets the value of the yrPropAcq property.
     * 
     * @return
     *     possible object is
     *     {@link YrPropAcqType }
     *     
     */
    public YrPropAcqType getYrPropAcq() {
        return yrPropAcq;
    }

    /**
     * Sets the value of the yrPropAcq property.
     * 
     * @param value
     *     allowed object is
     *     {@link YrPropAcqType }
     *     
     */
    public void setYrPropAcq(YrPropAcqType value) {
        this.yrPropAcq = value;
    }

    /**
     * Gets the value of the origPropCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OrigPropCostAmtType }
     *     
     */
    public OrigPropCostAmtType getOrigPropCostAmt() {
        return origPropCostAmt;
    }

    /**
     * Sets the value of the origPropCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigPropCostAmtType }
     *     
     */
    public void setOrigPropCostAmt(OrigPropCostAmtType value) {
        this.origPropCostAmt = value;
    }

    /**
     * Gets the value of the collatLienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollatLienAmtType }
     *     
     */
    public CollatLienAmtType getCollatLienAmt() {
        return collatLienAmt;
    }

    /**
     * Sets the value of the collatLienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatLienAmtType }
     *     
     */
    public void setCollatLienAmt(CollatLienAmtType value) {
        this.collatLienAmt = value;
    }

    /**
     * Gets the value of the lotValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LotValAmtType }
     *     
     */
    public LotValAmtType getLotValAmt() {
        return lotValAmt;
    }

    /**
     * Sets the value of the lotValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotValAmtType }
     *     
     */
    public void setLotValAmt(LotValAmtType value) {
        this.lotValAmt = value;
    }

    /**
     * Gets the value of the improvCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImprovCostAmtType }
     *     
     */
    public ImprovCostAmtType getImprovCostAmt() {
        return improvCostAmt;
    }

    /**
     * Sets the value of the improvCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImprovCostAmtType }
     *     
     */
    public void setImprovCostAmt(ImprovCostAmtType value) {
        this.improvCostAmt = value;
    }

    /**
     * Gets the value of the refinPurpCode property.
     * 
     * @return
     *     possible object is
     *     {@link RefinPurpCodeType }
     *     
     */
    public RefinPurpCodeType getRefinPurpCode() {
        return refinPurpCode;
    }

    /**
     * Sets the value of the refinPurpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefinPurpCodeType }
     *     
     */
    public void setRefinPurpCode(RefinPurpCodeType value) {
        this.refinPurpCode = value;
    }

    /**
     * Gets the value of the refinImprovInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RefinImprovInfoType }
     *     
     */
    public RefinImprovInfoType getRefinImprovInfo() {
        return refinImprovInfo;
    }

    /**
     * Sets the value of the refinImprovInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefinImprovInfoType }
     *     
     */
    public void setRefinImprovInfo(RefinImprovInfoType value) {
        this.refinImprovInfo = value;
    }

    /**
     * Gets the value of the refinImprovCost property.
     * 
     * @return
     *     possible object is
     *     {@link RefinImprovCostType }
     *     
     */
    public RefinImprovCostType getRefinImprovCost() {
        return refinImprovCost;
    }

    /**
     * Sets the value of the refinImprovCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefinImprovCostType }
     *     
     */
    public void setRefinImprovCost(RefinImprovCostType value) {
        this.refinImprovCost = value;
    }

    /**
     * Gets the value of the refinImprovExst property.
     * 
     * @return
     *     possible object is
     *     {@link RefinImprovExstType }
     *     
     */
    public RefinImprovExstType getRefinImprovExst() {
        return refinImprovExst;
    }

    /**
     * Sets the value of the refinImprovExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefinImprovExstType }
     *     
     */
    public void setRefinImprovExst(RefinImprovExstType value) {
        this.refinImprovExst = value;
    }

    /**
     * Gets the value of the propAcctTitle property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleType }
     *     
     */
    public AcctTitleType getPropAcctTitle() {
        return propAcctTitle;
    }

    /**
     * Sets the value of the propAcctTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleType }
     *     
     */
    public void setPropAcctTitle(AcctTitleType value) {
        this.propAcctTitle = value;
    }

    /**
     * Gets the value of the propTitleType property.
     * 
     * @return
     *     possible object is
     *     {@link PropTitleTypeType }
     *     
     */
    public PropTitleTypeType getPropTitleType() {
        return propTitleType;
    }

    /**
     * Sets the value of the propTitleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropTitleTypeType }
     *     
     */
    public void setPropTitleType(PropTitleTypeType value) {
        this.propTitleType = value;
    }

    /**
     * Gets the value of the propEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link PropEstateTypeType }
     *     
     */
    public PropEstateTypeType getPropEstateType() {
        return propEstateType;
    }

    /**
     * Sets the value of the propEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEstateTypeType }
     *     
     */
    public void setPropEstateType(PropEstateTypeType value) {
        this.propEstateType = value;
    }

    /**
     * Gets the value of the propLeaseExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link PropLeaseExpDtType }
     *     
     */
    public PropLeaseExpDtType getPropLeaseExpDt() {
        return propLeaseExpDt;
    }

    /**
     * Sets the value of the propLeaseExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropLeaseExpDtType }
     *     
     */
    public void setPropLeaseExpDt(PropLeaseExpDtType value) {
        this.propLeaseExpDt = value;
    }

    /**
     * Gets the value of the downPmtSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link DownPmtSrcCodeType }
     *     
     */
    public DownPmtSrcCodeType getDownPmtSrcCode() {
        return downPmtSrcCode;
    }

    /**
     * Sets the value of the downPmtSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownPmtSrcCodeType }
     *     
     */
    public void setDownPmtSrcCode(DownPmtSrcCodeType value) {
        this.downPmtSrcCode = value;
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
     * Gets the value of the collatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatCodeType }
     *     
     */
    public CollatCodeType getCollatCode() {
        return collatCode;
    }

    /**
     * Sets the value of the collatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatCodeType }
     *     
     */
    public void setCollatCode(CollatCodeType value) {
        this.collatCode = value;
    }

    /**
     * Gets the value of the propEstVal property.
     * 
     * @return
     *     possible object is
     *     {@link PropEstValType }
     *     
     */
    public PropEstValType getPropEstVal() {
        return propEstVal;
    }

    /**
     * Sets the value of the propEstVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropEstValType }
     *     
     */
    public void setPropEstVal(PropEstValType value) {
        this.propEstVal = value;
    }

    /**
     * Gets the value of the occupProp property.
     * 
     * @return
     *     possible object is
     *     {@link OccupPropType }
     *     
     */
    public OccupPropType getOccupProp() {
        return occupProp;
    }

    /**
     * Sets the value of the occupProp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupPropType }
     *     
     */
    public void setOccupProp(OccupPropType value) {
        this.occupProp = value;
    }

    /**
     * Gets the value of the resType property.
     * 
     * @return
     *     possible object is
     *     {@link ResTypeType }
     *     
     */
    public ResTypeType getResType() {
        return resType;
    }

    /**
     * Sets the value of the resType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResTypeType }
     *     
     */
    public void setResType(ResTypeType value) {
        this.resType = value;
    }

    /**
     * Gets the value of the propType property.
     * 
     * @return
     *     possible object is
     *     {@link PropTypeType }
     *     
     */
    public PropTypeType getPropType() {
        return propType;
    }

    /**
     * Sets the value of the propType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropTypeType }
     *     
     */
    public void setPropType(PropTypeType value) {
        this.propType = value;
    }

    /**
     * Gets the value of the collatHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCollatHolderName() {
        return collatHolderName;
    }

    /**
     * Sets the value of the collatHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCollatHolderName(PersonNameCType value) {
        this.collatHolderName = value;
    }

    /**
     * Gets the value of the collatHolderAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCollatHolderAddr() {
        return collatHolderAddr;
    }

    /**
     * Sets the value of the collatHolderAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCollatHolderAddr(AddrCType value) {
        this.collatHolderAddr = value;
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
     * Gets the value of the apprDt property.
     * 
     * @return
     *     possible object is
     *     {@link ApprDtType }
     *     
     */
    public ApprDtType getApprDt() {
        return apprDt;
    }

    /**
     * Sets the value of the apprDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprDtType }
     *     
     */
    public void setApprDt(ApprDtType value) {
        this.apprDt = value;
    }

    /**
     * Gets the value of the collatInsurArray property.
     * 
     * @return
     *     possible object is
     *     {@link CollatInsurArrayAType }
     *     
     */
    public CollatInsurArrayAType getCollatInsurArray() {
        return collatInsurArray;
    }

    /**
     * Sets the value of the collatInsurArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatInsurArrayAType }
     *     
     */
    public void setCollatInsurArray(CollatInsurArrayAType value) {
        this.collatInsurArray = value;
    }

    /**
     * Gets the value of the collatOwnArray property.
     * 
     * @return
     *     possible object is
     *     {@link CollatOwnArrayAType }
     *     
     */
    public CollatOwnArrayAType getCollatOwnArray() {
        return collatOwnArray;
    }

    /**
     * Sets the value of the collatOwnArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatOwnArrayAType }
     *     
     */
    public void setCollatOwnArray(CollatOwnArrayAType value) {
        this.collatOwnArray = value;
    }

    /**
     * Gets the value of the lienExstArray property.
     * 
     * @return
     *     possible object is
     *     {@link LienExstArrayAType }
     *     
     */
    public LienExstArrayAType getLienExstArray() {
        return lienExstArray;
    }

    /**
     * Sets the value of the lienExstArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienExstArrayAType }
     *     
     */
    public void setLienExstArray(LienExstArrayAType value) {
        this.lienExstArray = value;
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
