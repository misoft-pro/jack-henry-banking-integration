
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardTrnHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardTrnHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardTrnStatType" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardTrnStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardCapType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardCapType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnAuthDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAuthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnAuthAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAuthAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTMerId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTMerId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerName" type="{http://jackhenry.com/jxchange/TPG/2008}MerName_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerBusCatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MerBusCatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerCity" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTMerStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerPostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardAuthId" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardAuthId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRef" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRef_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AliasCrCardId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardTrnHistSrchRec_CType", propOrder = {
    "crCardTrnStatType",
    "eftCardCapType",
    "eftTrnAuthDt",
    "eftTrnAuthAmt",
    "eftTrnProcDt",
    "eftTrnDt",
    "eftTrnAmt",
    "eftMerId",
    "merName",
    "merBusCatDesc",
    "merCity",
    "eftMerStateCode",
    "merPostalCode",
    "eftTrnCode",
    "eftTrnDesc",
    "excRsnCode",
    "excRsnDesc",
    "crCardAuthId",
    "trnRef",
    "eftDesc",
    "custom",
    "ver1",
    "aliasCrCardId",
    "ver2",
    "any"
})
public class CrCardTrnHistSrchRecCType {

    @XmlElement(name = "CrCardTrnStatType")
    protected CrCardTrnStatTypeType crCardTrnStatType;
    @XmlElement(name = "EFTCardCapType")
    protected EFTCardCapTypeType eftCardCapType;
    @XmlElement(name = "EFTTrnAuthDt")
    protected EFTTrnAuthDtType eftTrnAuthDt;
    @XmlElement(name = "EFTTrnAuthAmt")
    protected EFTTrnAuthAmtType eftTrnAuthAmt;
    @XmlElement(name = "EFTTrnProcDt")
    protected EFTTrnProcDtType eftTrnProcDt;
    @XmlElement(name = "EFTTrnDt")
    protected EFTTrnDtType eftTrnDt;
    @XmlElement(name = "EFTTrnAmt")
    protected EFTTrnAmtType eftTrnAmt;
    @XmlElement(name = "EFTMerId")
    protected EFTMerIdType eftMerId;
    @XmlElement(name = "MerName")
    protected MerNameType merName;
    @XmlElement(name = "MerBusCatDesc")
    protected MerBusCatDescType merBusCatDesc;
    @XmlElement(name = "MerCity")
    protected CityType merCity;
    @XmlElement(name = "EFTMerStateCode")
    protected StateCodeType eftMerStateCode;
    @XmlElement(name = "MerPostalCode")
    protected PostalCodeType merPostalCode;
    @XmlElement(name = "EFTTrnCode")
    protected EFTTrnCodeType eftTrnCode;
    @XmlElement(name = "EFTTrnDesc")
    protected EFTTrnDescType eftTrnDesc;
    @XmlElement(name = "ExcRsnCode")
    protected ExcRsnCodeType excRsnCode;
    @XmlElement(name = "ExcRsnDesc")
    protected ExcRsnDescType excRsnDesc;
    @XmlElement(name = "CrCardAuthId")
    protected CrCardAuthIdType crCardAuthId;
    @XmlElement(name = "TrnRef")
    protected TrnRefType trnRef;
    @XmlElement(name = "EFTDesc")
    protected EftDescType eftDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AliasCrCardId")
    protected AcctIdType aliasCrCardId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCardTrnStatType property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardTrnStatTypeType }
     *     
     */
    public CrCardTrnStatTypeType getCrCardTrnStatType() {
        return crCardTrnStatType;
    }

    /**
     * Sets the value of the crCardTrnStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardTrnStatTypeType }
     *     
     */
    public void setCrCardTrnStatType(CrCardTrnStatTypeType value) {
        this.crCardTrnStatType = value;
    }

    /**
     * Gets the value of the eftCardCapType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardCapTypeType }
     *     
     */
    public EFTCardCapTypeType getEFTCardCapType() {
        return eftCardCapType;
    }

    /**
     * Sets the value of the eftCardCapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardCapTypeType }
     *     
     */
    public void setEFTCardCapType(EFTCardCapTypeType value) {
        this.eftCardCapType = value;
    }

    /**
     * Gets the value of the eftTrnAuthDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAuthDtType }
     *     
     */
    public EFTTrnAuthDtType getEFTTrnAuthDt() {
        return eftTrnAuthDt;
    }

    /**
     * Sets the value of the eftTrnAuthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAuthDtType }
     *     
     */
    public void setEFTTrnAuthDt(EFTTrnAuthDtType value) {
        this.eftTrnAuthDt = value;
    }

    /**
     * Gets the value of the eftTrnAuthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAuthAmtType }
     *     
     */
    public EFTTrnAuthAmtType getEFTTrnAuthAmt() {
        return eftTrnAuthAmt;
    }

    /**
     * Sets the value of the eftTrnAuthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAuthAmtType }
     *     
     */
    public void setEFTTrnAuthAmt(EFTTrnAuthAmtType value) {
        this.eftTrnAuthAmt = value;
    }

    /**
     * Gets the value of the eftTrnProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnProcDtType }
     *     
     */
    public EFTTrnProcDtType getEFTTrnProcDt() {
        return eftTrnProcDt;
    }

    /**
     * Sets the value of the eftTrnProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnProcDtType }
     *     
     */
    public void setEFTTrnProcDt(EFTTrnProcDtType value) {
        this.eftTrnProcDt = value;
    }

    /**
     * Gets the value of the eftTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnDtType }
     *     
     */
    public EFTTrnDtType getEFTTrnDt() {
        return eftTrnDt;
    }

    /**
     * Sets the value of the eftTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnDtType }
     *     
     */
    public void setEFTTrnDt(EFTTrnDtType value) {
        this.eftTrnDt = value;
    }

    /**
     * Gets the value of the eftTrnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnAmtType }
     *     
     */
    public EFTTrnAmtType getEFTTrnAmt() {
        return eftTrnAmt;
    }

    /**
     * Sets the value of the eftTrnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnAmtType }
     *     
     */
    public void setEFTTrnAmt(EFTTrnAmtType value) {
        this.eftTrnAmt = value;
    }

    /**
     * Gets the value of the eftMerId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTMerIdType }
     *     
     */
    public EFTMerIdType getEFTMerId() {
        return eftMerId;
    }

    /**
     * Sets the value of the eftMerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTMerIdType }
     *     
     */
    public void setEFTMerId(EFTMerIdType value) {
        this.eftMerId = value;
    }

    /**
     * Gets the value of the merName property.
     * 
     * @return
     *     possible object is
     *     {@link MerNameType }
     *     
     */
    public MerNameType getMerName() {
        return merName;
    }

    /**
     * Sets the value of the merName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerNameType }
     *     
     */
    public void setMerName(MerNameType value) {
        this.merName = value;
    }

    /**
     * Gets the value of the merBusCatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MerBusCatDescType }
     *     
     */
    public MerBusCatDescType getMerBusCatDesc() {
        return merBusCatDesc;
    }

    /**
     * Sets the value of the merBusCatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerBusCatDescType }
     *     
     */
    public void setMerBusCatDesc(MerBusCatDescType value) {
        this.merBusCatDesc = value;
    }

    /**
     * Gets the value of the merCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getMerCity() {
        return merCity;
    }

    /**
     * Sets the value of the merCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setMerCity(CityType value) {
        this.merCity = value;
    }

    /**
     * Gets the value of the eftMerStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getEFTMerStateCode() {
        return eftMerStateCode;
    }

    /**
     * Sets the value of the eftMerStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setEFTMerStateCode(StateCodeType value) {
        this.eftMerStateCode = value;
    }

    /**
     * Gets the value of the merPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeType }
     *     
     */
    public PostalCodeType getMerPostalCode() {
        return merPostalCode;
    }

    /**
     * Sets the value of the merPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeType }
     *     
     */
    public void setMerPostalCode(PostalCodeType value) {
        this.merPostalCode = value;
    }

    /**
     * Gets the value of the eftTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnCodeType }
     *     
     */
    public EFTTrnCodeType getEFTTrnCode() {
        return eftTrnCode;
    }

    /**
     * Sets the value of the eftTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnCodeType }
     *     
     */
    public void setEFTTrnCode(EFTTrnCodeType value) {
        this.eftTrnCode = value;
    }

    /**
     * Gets the value of the eftTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnDescType }
     *     
     */
    public EFTTrnDescType getEFTTrnDesc() {
        return eftTrnDesc;
    }

    /**
     * Sets the value of the eftTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnDescType }
     *     
     */
    public void setEFTTrnDesc(EFTTrnDescType value) {
        this.eftTrnDesc = value;
    }

    /**
     * Gets the value of the excRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRsnCodeType }
     *     
     */
    public ExcRsnCodeType getExcRsnCode() {
        return excRsnCode;
    }

    /**
     * Sets the value of the excRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRsnCodeType }
     *     
     */
    public void setExcRsnCode(ExcRsnCodeType value) {
        this.excRsnCode = value;
    }

    /**
     * Gets the value of the excRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRsnDescType }
     *     
     */
    public ExcRsnDescType getExcRsnDesc() {
        return excRsnDesc;
    }

    /**
     * Sets the value of the excRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRsnDescType }
     *     
     */
    public void setExcRsnDesc(ExcRsnDescType value) {
        this.excRsnDesc = value;
    }

    /**
     * Gets the value of the crCardAuthId property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardAuthIdType }
     *     
     */
    public CrCardAuthIdType getCrCardAuthId() {
        return crCardAuthId;
    }

    /**
     * Sets the value of the crCardAuthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardAuthIdType }
     *     
     */
    public void setCrCardAuthId(CrCardAuthIdType value) {
        this.crCardAuthId = value;
    }

    /**
     * Gets the value of the trnRef property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRefType }
     *     
     */
    public TrnRefType getTrnRef() {
        return trnRef;
    }

    /**
     * Sets the value of the trnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRefType }
     *     
     */
    public void setTrnRef(TrnRefType value) {
        this.trnRef = value;
    }

    /**
     * Gets the value of the eftDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EftDescType }
     *     
     */
    public EftDescType getEFTDesc() {
        return eftDesc;
    }

    /**
     * Sets the value of the eftDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftDescType }
     *     
     */
    public void setEFTDesc(EftDescType value) {
        this.eftDesc = value;
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
     * Gets the value of the aliasCrCardId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAliasCrCardId() {
        return aliasCrCardId;
    }

    /**
     * Sets the value of the aliasCrCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAliasCrCardId(AcctIdType value) {
        this.aliasCrCardId = value;
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
