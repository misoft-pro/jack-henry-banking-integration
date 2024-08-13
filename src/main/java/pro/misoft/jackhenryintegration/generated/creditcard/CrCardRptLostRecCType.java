
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
 * <p>Java class for CrCardRptLostRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardRptLostRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConPhoneNum" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardIssuedNum" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardIssuedNum_Type"/&gt;
 *         &lt;element name="CrCardLostNum" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardLostNum_Type"/&gt;
 *         &lt;element name="LossStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type"/&gt;
 *         &lt;element name="CrCardLostDt" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardLostDt_Type"/&gt;
 *         &lt;element name="CrCardExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardLostLocType" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardLostLocType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardPINLostType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardPINLostType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudActRptType" type="{http://jackhenry.com/jxchange/TPG/2008}FraudActRptType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrVerifType" type="{http://jackhenry.com/jxchange/TPG/2008}AddrVerifType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpdCrCardDlvryType" type="{http://jackhenry.com/jxchange/TPG/2008}ExpdCrCardDlvryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardRptLostRec_CType", propOrder = {
    "conPhoneNum",
    "crCardIssuedNum",
    "crCardLostNum",
    "lossStateCode",
    "crCardLostDt",
    "crCardExpDt",
    "crCardLostLocType",
    "rmkArray",
    "eftCardPINLostType",
    "fraudActRptType",
    "addrVerifType",
    "expdCrCardDlvryType",
    "custom",
    "ver1",
    "any"
})
public class CrCardRptLostRecCType {

    @XmlElement(name = "ConPhoneNum")
    protected PhoneNumType conPhoneNum;
    @XmlElement(name = "CrCardIssuedNum", required = true)
    protected CrCardIssuedNumType crCardIssuedNum;
    @XmlElement(name = "CrCardLostNum", required = true)
    protected CrCardLostNumType crCardLostNum;
    @XmlElement(name = "LossStateCode", required = true)
    protected StateCodeType lossStateCode;
    @XmlElement(name = "CrCardLostDt", required = true)
    protected CrCardLostDtType crCardLostDt;
    @XmlElement(name = "CrCardExpDt")
    protected ExpDtType crCardExpDt;
    @XmlElement(name = "CrCardLostLocType")
    protected CrCardLostLocTypeType crCardLostLocType;
    @XmlElement(name = "RmkArray")
    protected RmkAType rmkArray;
    @XmlElement(name = "EFTCardPINLostType")
    protected EFTCardPINLostTypeType eftCardPINLostType;
    @XmlElement(name = "FraudActRptType")
    protected FraudActRptTypeType fraudActRptType;
    @XmlElement(name = "AddrVerifType")
    protected AddrVerifTypeType addrVerifType;
    @XmlElement(name = "ExpdCrCardDlvryType")
    protected ExpdCrCardDlvryTypeType expdCrCardDlvryType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the conPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumType }
     *     
     */
    public PhoneNumType getConPhoneNum() {
        return conPhoneNum;
    }

    /**
     * Sets the value of the conPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumType }
     *     
     */
    public void setConPhoneNum(PhoneNumType value) {
        this.conPhoneNum = value;
    }

    /**
     * Gets the value of the crCardIssuedNum property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardIssuedNumType }
     *     
     */
    public CrCardIssuedNumType getCrCardIssuedNum() {
        return crCardIssuedNum;
    }

    /**
     * Sets the value of the crCardIssuedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardIssuedNumType }
     *     
     */
    public void setCrCardIssuedNum(CrCardIssuedNumType value) {
        this.crCardIssuedNum = value;
    }

    /**
     * Gets the value of the crCardLostNum property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardLostNumType }
     *     
     */
    public CrCardLostNumType getCrCardLostNum() {
        return crCardLostNum;
    }

    /**
     * Sets the value of the crCardLostNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardLostNumType }
     *     
     */
    public void setCrCardLostNum(CrCardLostNumType value) {
        this.crCardLostNum = value;
    }

    /**
     * Gets the value of the lossStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getLossStateCode() {
        return lossStateCode;
    }

    /**
     * Sets the value of the lossStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setLossStateCode(StateCodeType value) {
        this.lossStateCode = value;
    }

    /**
     * Gets the value of the crCardLostDt property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardLostDtType }
     *     
     */
    public CrCardLostDtType getCrCardLostDt() {
        return crCardLostDt;
    }

    /**
     * Sets the value of the crCardLostDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardLostDtType }
     *     
     */
    public void setCrCardLostDt(CrCardLostDtType value) {
        this.crCardLostDt = value;
    }

    /**
     * Gets the value of the crCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getCrCardExpDt() {
        return crCardExpDt;
    }

    /**
     * Sets the value of the crCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setCrCardExpDt(ExpDtType value) {
        this.crCardExpDt = value;
    }

    /**
     * Gets the value of the crCardLostLocType property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardLostLocTypeType }
     *     
     */
    public CrCardLostLocTypeType getCrCardLostLocType() {
        return crCardLostLocType;
    }

    /**
     * Sets the value of the crCardLostLocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardLostLocTypeType }
     *     
     */
    public void setCrCardLostLocType(CrCardLostLocTypeType value) {
        this.crCardLostLocType = value;
    }

    /**
     * Gets the value of the rmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getRmkArray() {
        return rmkArray;
    }

    /**
     * Sets the value of the rmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setRmkArray(RmkAType value) {
        this.rmkArray = value;
    }

    /**
     * Gets the value of the eftCardPINLostType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardPINLostTypeType }
     *     
     */
    public EFTCardPINLostTypeType getEFTCardPINLostType() {
        return eftCardPINLostType;
    }

    /**
     * Sets the value of the eftCardPINLostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardPINLostTypeType }
     *     
     */
    public void setEFTCardPINLostType(EFTCardPINLostTypeType value) {
        this.eftCardPINLostType = value;
    }

    /**
     * Gets the value of the fraudActRptType property.
     * 
     * @return
     *     possible object is
     *     {@link FraudActRptTypeType }
     *     
     */
    public FraudActRptTypeType getFraudActRptType() {
        return fraudActRptType;
    }

    /**
     * Sets the value of the fraudActRptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudActRptTypeType }
     *     
     */
    public void setFraudActRptType(FraudActRptTypeType value) {
        this.fraudActRptType = value;
    }

    /**
     * Gets the value of the addrVerifType property.
     * 
     * @return
     *     possible object is
     *     {@link AddrVerifTypeType }
     *     
     */
    public AddrVerifTypeType getAddrVerifType() {
        return addrVerifType;
    }

    /**
     * Sets the value of the addrVerifType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrVerifTypeType }
     *     
     */
    public void setAddrVerifType(AddrVerifTypeType value) {
        this.addrVerifType = value;
    }

    /**
     * Gets the value of the expdCrCardDlvryType property.
     * 
     * @return
     *     possible object is
     *     {@link ExpdCrCardDlvryTypeType }
     *     
     */
    public ExpdCrCardDlvryTypeType getExpdCrCardDlvryType() {
        return expdCrCardDlvryType;
    }

    /**
     * Sets the value of the expdCrCardDlvryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpdCrCardDlvryTypeType }
     *     
     */
    public void setExpdCrCardDlvryType(ExpdCrCardDlvryTypeType value) {
        this.expdCrCardDlvryType = value;
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
