
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
 * <p>Java class for EFTCardSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type"/&gt;
 *         &lt;element name="EFTCardSufxNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardSufxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdEmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}SecdEmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardStat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardSrchCustom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EFTCardStatType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStatType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EFTCardBINCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBINCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="EFTCardBINDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBINDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardSrchRec_CType", propOrder = {
    "eftCardNum",
    "eftCardSufxNum",
    "custId",
    "taxId",
    "embosName",
    "secdEmbosName",
    "eftCardStat",
    "eftCardStatDesc",
    "lastActDt",
    "eftCardSrchCustom",
    "ver1",
    "eftCardStatType",
    "ver2",
    "eftCardBINCode",
    "eftCardBINDesc",
    "ver3",
    "any"
})
public class EFTCardSrchRecCType {

    @XmlElement(name = "EFTCardNum", required = true)
    protected EFTCardNumType eftCardNum;
    @XmlElement(name = "EFTCardSufxNum")
    protected EFTCardSufxNumType eftCardSufxNum;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "EmbosName")
    protected EmbosNameType embosName;
    @XmlElement(name = "SecdEmbosName")
    protected SecdEmbosNameType secdEmbosName;
    @XmlElement(name = "EFTCardStat")
    protected EFTCardStatType eftCardStat;
    @XmlElement(name = "EFTCardStatDesc")
    protected EFTCardStatDescType eftCardStatDesc;
    @XmlElement(name = "LastActDt")
    protected LastActDtType lastActDt;
    @XmlElementRef(name = "EFTCardSrchCustom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> eftCardSrchCustom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EFTCardStatType")
    protected EFTCardStatTypeType eftCardStatType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "EFTCardBINCode")
    protected EFTCardBINCodeType eftCardBINCode;
    @XmlElement(name = "EFTCardBINDesc")
    protected EFTCardBINDescType eftCardBINDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardNumType }
     *     
     */
    public EFTCardNumType getEFTCardNum() {
        return eftCardNum;
    }

    /**
     * Sets the value of the eftCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardNumType }
     *     
     */
    public void setEFTCardNum(EFTCardNumType value) {
        this.eftCardNum = value;
    }

    /**
     * Gets the value of the eftCardSufxNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public EFTCardSufxNumType getEFTCardSufxNum() {
        return eftCardSufxNum;
    }

    /**
     * Sets the value of the eftCardSufxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public void setEFTCardSufxNum(EFTCardSufxNumType value) {
        this.eftCardSufxNum = value;
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
     * Gets the value of the eftCardStat property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStatType }
     *     
     */
    public EFTCardStatType getEFTCardStat() {
        return eftCardStat;
    }

    /**
     * Sets the value of the eftCardStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStatType }
     *     
     */
    public void setEFTCardStat(EFTCardStatType value) {
        this.eftCardStat = value;
    }

    /**
     * Gets the value of the eftCardStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStatDescType }
     *     
     */
    public EFTCardStatDescType getEFTCardStatDesc() {
        return eftCardStatDesc;
    }

    /**
     * Sets the value of the eftCardStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStatDescType }
     *     
     */
    public void setEFTCardStatDesc(EFTCardStatDescType value) {
        this.eftCardStatDesc = value;
    }

    /**
     * Gets the value of the lastActDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastActDtType }
     *     
     */
    public LastActDtType getLastActDt() {
        return lastActDt;
    }

    /**
     * Sets the value of the lastActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastActDtType }
     *     
     */
    public void setLastActDt(LastActDtType value) {
        this.lastActDt = value;
    }

    /**
     * Gets the value of the eftCardSrchCustom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getEFTCardSrchCustom() {
        return eftCardSrchCustom;
    }

    /**
     * Sets the value of the eftCardSrchCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setEFTCardSrchCustom(JAXBElement<CustomCType> value) {
        this.eftCardSrchCustom = value;
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
     * Gets the value of the eftCardStatType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardStatTypeType }
     *     
     */
    public EFTCardStatTypeType getEFTCardStatType() {
        return eftCardStatType;
    }

    /**
     * Sets the value of the eftCardStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardStatTypeType }
     *     
     */
    public void setEFTCardStatType(EFTCardStatTypeType value) {
        this.eftCardStatType = value;
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
     * Gets the value of the eftCardBINCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBINCodeType }
     *     
     */
    public EFTCardBINCodeType getEFTCardBINCode() {
        return eftCardBINCode;
    }

    /**
     * Sets the value of the eftCardBINCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBINCodeType }
     *     
     */
    public void setEFTCardBINCode(EFTCardBINCodeType value) {
        this.eftCardBINCode = value;
    }

    /**
     * Gets the value of the eftCardBINDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBINDescType }
     *     
     */
    public EFTCardBINDescType getEFTCardBINDesc() {
        return eftCardBINDesc;
    }

    /**
     * Sets the value of the eftCardBINDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBINDescType }
     *     
     */
    public void setEFTCardBINDesc(EFTCardBINDescType value) {
        this.eftCardBINDesc = value;
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
