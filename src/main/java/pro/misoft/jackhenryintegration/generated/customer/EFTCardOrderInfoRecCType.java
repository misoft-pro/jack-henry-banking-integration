
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EFTCardOrderInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardOrderInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardExpDt_Type"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdEmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}SecdEmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardTrak1Val" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrak1Val_Type"/&gt;
 *         &lt;element name="EFTCardTrak2Val" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrak2Val_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardMailAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardPINOffSetId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardPINOffSetId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardActArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardActArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CardRushOpt" type="{http://jackhenry.com/jxchange/TPG/2008}RushOpt_Type" minOccurs="0"/&gt;
 *           &lt;element name="CardRushMthdCode" type="{http://jackhenry.com/jxchange/TPG/2008}CardRushMthdCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardOrderInfoRec_CType", propOrder = {
    "eftCardExpDt",
    "embosName",
    "secdEmbosName",
    "acctType",
    "avlBal",
    "eftCardTrak1Val",
    "eftCardTrak2Val",
    "eftCardMailAddr",
    "eftCardPINOffSetId",
    "eftCardActArray",
    "custom",
    "ver1",
    "cardRushOpt",
    "cardRushMthdCode",
    "ver2",
    "any"
})
public class EFTCardOrderInfoRecCType {

    @XmlElement(name = "EFTCardExpDt", required = true)
    protected EFTCardExpDtType eftCardExpDt;
    @XmlElement(name = "EmbosName")
    protected EmbosNameType embosName;
    @XmlElement(name = "SecdEmbosName")
    protected SecdEmbosNameType secdEmbosName;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "AvlBal")
    protected AvlBalType avlBal;
    @XmlElement(name = "EFTCardTrak1Val", required = true)
    protected EFTCardTrak1ValType eftCardTrak1Val;
    @XmlElement(name = "EFTCardTrak2Val")
    protected EFTCardTrak2ValType eftCardTrak2Val;
    @XmlElement(name = "EFTCardMailAddr")
    protected AddrCType eftCardMailAddr;
    @XmlElement(name = "EFTCardPINOffSetId")
    protected EFTCardPINOffSetIdType eftCardPINOffSetId;
    @XmlElement(name = "EFTCardActArray")
    protected EFTCardActArrayAType eftCardActArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CardRushOpt")
    protected RushOptType cardRushOpt;
    @XmlElement(name = "CardRushMthdCode")
    protected CardRushMthdCodeType cardRushMthdCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardExpDtType }
     *     
     */
    public EFTCardExpDtType getEFTCardExpDt() {
        return eftCardExpDt;
    }

    /**
     * Sets the value of the eftCardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardExpDtType }
     *     
     */
    public void setEFTCardExpDt(EFTCardExpDtType value) {
        this.eftCardExpDt = value;
    }

    /**
     * Gets the value of the embosName property.
     * 
     * @return
     *     possible object is
     *     {@link EmbosNameType }
     *     
     */
    public EmbosNameType getEmbosName() {
        return embosName;
    }

    /**
     * Sets the value of the embosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbosNameType }
     *     
     */
    public void setEmbosName(EmbosNameType value) {
        this.embosName = value;
    }

    /**
     * Gets the value of the secdEmbosName property.
     * 
     * @return
     *     possible object is
     *     {@link SecdEmbosNameType }
     *     
     */
    public SecdEmbosNameType getSecdEmbosName() {
        return secdEmbosName;
    }

    /**
     * Sets the value of the secdEmbosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdEmbosNameType }
     *     
     */
    public void setSecdEmbosName(SecdEmbosNameType value) {
        this.secdEmbosName = value;
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
     * Gets the value of the avlBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvlBalType }
     *     
     */
    public AvlBalType getAvlBal() {
        return avlBal;
    }

    /**
     * Sets the value of the avlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlBalType }
     *     
     */
    public void setAvlBal(AvlBalType value) {
        this.avlBal = value;
    }

    /**
     * Gets the value of the eftCardTrak1Val property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTrak1ValType }
     *     
     */
    public EFTCardTrak1ValType getEFTCardTrak1Val() {
        return eftCardTrak1Val;
    }

    /**
     * Sets the value of the eftCardTrak1Val property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTrak1ValType }
     *     
     */
    public void setEFTCardTrak1Val(EFTCardTrak1ValType value) {
        this.eftCardTrak1Val = value;
    }

    /**
     * Gets the value of the eftCardTrak2Val property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTrak2ValType }
     *     
     */
    public EFTCardTrak2ValType getEFTCardTrak2Val() {
        return eftCardTrak2Val;
    }

    /**
     * Sets the value of the eftCardTrak2Val property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTrak2ValType }
     *     
     */
    public void setEFTCardTrak2Val(EFTCardTrak2ValType value) {
        this.eftCardTrak2Val = value;
    }

    /**
     * Gets the value of the eftCardMailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getEFTCardMailAddr() {
        return eftCardMailAddr;
    }

    /**
     * Sets the value of the eftCardMailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setEFTCardMailAddr(AddrCType value) {
        this.eftCardMailAddr = value;
    }

    /**
     * Gets the value of the eftCardPINOffSetId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardPINOffSetIdType }
     *     
     */
    public EFTCardPINOffSetIdType getEFTCardPINOffSetId() {
        return eftCardPINOffSetId;
    }

    /**
     * Sets the value of the eftCardPINOffSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardPINOffSetIdType }
     *     
     */
    public void setEFTCardPINOffSetId(EFTCardPINOffSetIdType value) {
        this.eftCardPINOffSetId = value;
    }

    /**
     * Gets the value of the eftCardActArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardActArrayAType }
     *     
     */
    public EFTCardActArrayAType getEFTCardActArray() {
        return eftCardActArray;
    }

    /**
     * Sets the value of the eftCardActArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardActArrayAType }
     *     
     */
    public void setEFTCardActArray(EFTCardActArrayAType value) {
        this.eftCardActArray = value;
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
     * Gets the value of the cardRushOpt property.
     * 
     * @return
     *     possible object is
     *     {@link RushOptType }
     *     
     */
    public RushOptType getCardRushOpt() {
        return cardRushOpt;
    }

    /**
     * Sets the value of the cardRushOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RushOptType }
     *     
     */
    public void setCardRushOpt(RushOptType value) {
        this.cardRushOpt = value;
    }

    /**
     * Gets the value of the cardRushMthdCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardRushMthdCodeType }
     *     
     */
    public CardRushMthdCodeType getCardRushMthdCode() {
        return cardRushMthdCode;
    }

    /**
     * Sets the value of the cardRushMthdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRushMthdCodeType }
     *     
     */
    public void setCardRushMthdCode(CardRushMthdCodeType value) {
        this.cardRushMthdCode = value;
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
