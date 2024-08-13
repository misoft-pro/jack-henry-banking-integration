
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
 * <p>Java class for EFTCardBlkTrnInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardBlkTrnInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlkTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ISOBlkId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTISOBlkId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkTrnStatType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkTrnStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkTrnOvrrdStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkTrnOvrrdEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkTrnOvrrdExistType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkTrnOvrrdExistType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkNewAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkNewAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BlkRuleArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkRuleArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardBlkTrnInqRec_CType", propOrder = {
    "blkTrnCode",
    "blkTrnDesc",
    "isoBlkId",
    "blkStartDt",
    "blkEndDt",
    "blkTrnStatType",
    "blkTrnOvrrdStartDt",
    "blkTrnOvrrdEndDt",
    "blkTrnOvrrdExistType",
    "blkNewAcctType",
    "blkRuleArray",
    "custom",
    "ver1",
    "any"
})
public class EFTCardBlkTrnInqRecCType {

    @XmlElement(name = "BlkTrnCode")
    protected EFTBlkTrnCodeType blkTrnCode;
    @XmlElement(name = "BlkTrnDesc")
    protected EFTBlkTrnDescType blkTrnDesc;
    @XmlElement(name = "ISOBlkId")
    protected EFTISOBlkIdType isoBlkId;
    @XmlElement(name = "BlkStartDt")
    protected StartDtType blkStartDt;
    @XmlElement(name = "BlkEndDt")
    protected EndDtType blkEndDt;
    @XmlElement(name = "BlkTrnStatType")
    protected EFTCardBlkTrnStatTypeType blkTrnStatType;
    @XmlElement(name = "BlkTrnOvrrdStartDt")
    protected StartDtType blkTrnOvrrdStartDt;
    @XmlElement(name = "BlkTrnOvrrdEndDt")
    protected EndDtType blkTrnOvrrdEndDt;
    @XmlElement(name = "BlkTrnOvrrdExistType")
    protected EFTCardBlkTrnOvrrdExistTypeType blkTrnOvrrdExistType;
    @XmlElement(name = "BlkNewAcctType")
    protected EFTCardBlkNewAcctTypeType blkNewAcctType;
    @XmlElement(name = "BlkRuleArray")
    protected EFTCardBlkRuleArrayAType blkRuleArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the blkTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkTrnCodeType }
     *     
     */
    public EFTBlkTrnCodeType getBlkTrnCode() {
        return blkTrnCode;
    }

    /**
     * Sets the value of the blkTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkTrnCodeType }
     *     
     */
    public void setBlkTrnCode(EFTBlkTrnCodeType value) {
        this.blkTrnCode = value;
    }

    /**
     * Gets the value of the blkTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkTrnDescType }
     *     
     */
    public EFTBlkTrnDescType getBlkTrnDesc() {
        return blkTrnDesc;
    }

    /**
     * Sets the value of the blkTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkTrnDescType }
     *     
     */
    public void setBlkTrnDesc(EFTBlkTrnDescType value) {
        this.blkTrnDesc = value;
    }

    /**
     * Gets the value of the isoBlkId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTISOBlkIdType }
     *     
     */
    public EFTISOBlkIdType getISOBlkId() {
        return isoBlkId;
    }

    /**
     * Sets the value of the isoBlkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTISOBlkIdType }
     *     
     */
    public void setISOBlkId(EFTISOBlkIdType value) {
        this.isoBlkId = value;
    }

    /**
     * Gets the value of the blkStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getBlkStartDt() {
        return blkStartDt;
    }

    /**
     * Sets the value of the blkStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setBlkStartDt(StartDtType value) {
        this.blkStartDt = value;
    }

    /**
     * Gets the value of the blkEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getBlkEndDt() {
        return blkEndDt;
    }

    /**
     * Sets the value of the blkEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setBlkEndDt(EndDtType value) {
        this.blkEndDt = value;
    }

    /**
     * Gets the value of the blkTrnStatType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBlkTrnStatTypeType }
     *     
     */
    public EFTCardBlkTrnStatTypeType getBlkTrnStatType() {
        return blkTrnStatType;
    }

    /**
     * Sets the value of the blkTrnStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBlkTrnStatTypeType }
     *     
     */
    public void setBlkTrnStatType(EFTCardBlkTrnStatTypeType value) {
        this.blkTrnStatType = value;
    }

    /**
     * Gets the value of the blkTrnOvrrdStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getBlkTrnOvrrdStartDt() {
        return blkTrnOvrrdStartDt;
    }

    /**
     * Sets the value of the blkTrnOvrrdStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setBlkTrnOvrrdStartDt(StartDtType value) {
        this.blkTrnOvrrdStartDt = value;
    }

    /**
     * Gets the value of the blkTrnOvrrdEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getBlkTrnOvrrdEndDt() {
        return blkTrnOvrrdEndDt;
    }

    /**
     * Sets the value of the blkTrnOvrrdEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setBlkTrnOvrrdEndDt(EndDtType value) {
        this.blkTrnOvrrdEndDt = value;
    }

    /**
     * Gets the value of the blkTrnOvrrdExistType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBlkTrnOvrrdExistTypeType }
     *     
     */
    public EFTCardBlkTrnOvrrdExistTypeType getBlkTrnOvrrdExistType() {
        return blkTrnOvrrdExistType;
    }

    /**
     * Sets the value of the blkTrnOvrrdExistType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBlkTrnOvrrdExistTypeType }
     *     
     */
    public void setBlkTrnOvrrdExistType(EFTCardBlkTrnOvrrdExistTypeType value) {
        this.blkTrnOvrrdExistType = value;
    }

    /**
     * Gets the value of the blkNewAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBlkNewAcctTypeType }
     *     
     */
    public EFTCardBlkNewAcctTypeType getBlkNewAcctType() {
        return blkNewAcctType;
    }

    /**
     * Sets the value of the blkNewAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBlkNewAcctTypeType }
     *     
     */
    public void setBlkNewAcctType(EFTCardBlkNewAcctTypeType value) {
        this.blkNewAcctType = value;
    }

    /**
     * Gets the value of the blkRuleArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBlkRuleArrayAType }
     *     
     */
    public EFTCardBlkRuleArrayAType getBlkRuleArray() {
        return blkRuleArray;
    }

    /**
     * Sets the value of the blkRuleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBlkRuleArrayAType }
     *     
     */
    public void setBlkRuleArray(EFTCardBlkRuleArrayAType value) {
        this.blkRuleArray = value;
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
