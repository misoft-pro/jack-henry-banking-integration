
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
 * <p>Java class for x_EFTCardBlkTrnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_EFTCardBlkTrnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardBlkTrnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkTrnInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTTrmlId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrmlId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAcptName" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcptName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAcptId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnLowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnHighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnExpType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnExpType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkMerIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkMerIdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnTypeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnTypeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTPseudoTrmlIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTPseudoTrmlIdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardPINEntryArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardPINEntryArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAcptStateArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcptStateArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAcptPostalCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcptPostalCodeArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EFTBlkPOSCondCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkPOSCondCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="EFTBlkPOSCondDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkPOSCondDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="EFTISOBlkId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTISOBlkId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_EFTCardBlkTrnInfo_CType", propOrder = {
    "eftCardBlkTrnInfo",
    "eftBlkTrnDesc",
    "eftBlkTrnStartDt",
    "eftBlkTrnEndDt",
    "eftTrmlId",
    "eftCardAcptName",
    "eftCardAcptId",
    "eftBlkTrnLowAmt",
    "eftBlkTrnHighAmt",
    "eftBlkTrnExpType",
    "eftBlkMerIdArray",
    "eftBlkTrnTypeArray",
    "eftPseudoTrmlIdArray",
    "eftCardPINEntryArray",
    "eftCardAcptStateArray",
    "eftCardAcptPostalCodeArray",
    "ver1",
    "eftBlkPOSCondCode",
    "eftBlkPOSCondDesc",
    "eftisoBlkId",
    "ver2",
    "any"
})
public class XEFTCardBlkTrnInfoCType {

    @XmlElement(name = "EFTCardBlkTrnInfo")
    protected EFTCardBlkTrnInfoCType eftCardBlkTrnInfo;
    @XmlElement(name = "EFTBlkTrnDesc")
    protected EFTBlkTrnDescType eftBlkTrnDesc;
    @XmlElement(name = "EFTBlkTrnStartDt")
    protected StartDtType eftBlkTrnStartDt;
    @XmlElement(name = "EFTBlkTrnEndDt")
    protected EndDtType eftBlkTrnEndDt;
    @XmlElement(name = "EFTTrmlId")
    protected EFTTrmlIdType eftTrmlId;
    @XmlElement(name = "EFTCardAcptName")
    protected EFTCardAcptNameType eftCardAcptName;
    @XmlElement(name = "EFTCardAcptId")
    protected EFTCardAcptIdType eftCardAcptId;
    @XmlElement(name = "EFTBlkTrnLowAmt")
    protected LowAmtType eftBlkTrnLowAmt;
    @XmlElement(name = "EFTBlkTrnHighAmt")
    protected HighAmtType eftBlkTrnHighAmt;
    @XmlElement(name = "EFTBlkTrnExpType")
    protected EFTBlkTrnExpTypeType eftBlkTrnExpType;
    @XmlElement(name = "EFTBlkMerIdArray")
    protected EFTBlkMerIdArrayAType eftBlkMerIdArray;
    @XmlElement(name = "EFTBlkTrnTypeArray")
    protected EFTBlkTrnTypeArrayAType eftBlkTrnTypeArray;
    @XmlElement(name = "EFTPseudoTrmlIdArray")
    protected EFTPseudoTrmlIdArrayAType eftPseudoTrmlIdArray;
    @XmlElement(name = "EFTCardPINEntryArray")
    protected EFTCardPINEntryArrayAType eftCardPINEntryArray;
    @XmlElement(name = "EFTCardAcptStateArray")
    protected EFTCardAcptStateArrayAType eftCardAcptStateArray;
    @XmlElement(name = "EFTCardAcptPostalCodeArray")
    protected EFTCardAcptPostalCodeArrayAType eftCardAcptPostalCodeArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EFTBlkPOSCondCode")
    protected EFTBlkPOSCondCodeType eftBlkPOSCondCode;
    @XmlElement(name = "EFTBlkPOSCondDesc")
    protected EFTBlkPOSCondDescType eftBlkPOSCondDesc;
    @XmlElement(name = "EFTISOBlkId")
    protected EFTISOBlkIdType eftisoBlkId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardBlkTrnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardBlkTrnInfoCType }
     *     
     */
    public EFTCardBlkTrnInfoCType getEFTCardBlkTrnInfo() {
        return eftCardBlkTrnInfo;
    }

    /**
     * Sets the value of the eftCardBlkTrnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardBlkTrnInfoCType }
     *     
     */
    public void setEFTCardBlkTrnInfo(EFTCardBlkTrnInfoCType value) {
        this.eftCardBlkTrnInfo = value;
    }

    /**
     * Gets the value of the eftBlkTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkTrnDescType }
     *     
     */
    public EFTBlkTrnDescType getEFTBlkTrnDesc() {
        return eftBlkTrnDesc;
    }

    /**
     * Sets the value of the eftBlkTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkTrnDescType }
     *     
     */
    public void setEFTBlkTrnDesc(EFTBlkTrnDescType value) {
        this.eftBlkTrnDesc = value;
    }

    /**
     * Gets the value of the eftBlkTrnStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getEFTBlkTrnStartDt() {
        return eftBlkTrnStartDt;
    }

    /**
     * Sets the value of the eftBlkTrnStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setEFTBlkTrnStartDt(StartDtType value) {
        this.eftBlkTrnStartDt = value;
    }

    /**
     * Gets the value of the eftBlkTrnEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getEFTBlkTrnEndDt() {
        return eftBlkTrnEndDt;
    }

    /**
     * Sets the value of the eftBlkTrnEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setEFTBlkTrnEndDt(EndDtType value) {
        this.eftBlkTrnEndDt = value;
    }

    /**
     * Gets the value of the eftTrmlId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrmlIdType }
     *     
     */
    public EFTTrmlIdType getEFTTrmlId() {
        return eftTrmlId;
    }

    /**
     * Sets the value of the eftTrmlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrmlIdType }
     *     
     */
    public void setEFTTrmlId(EFTTrmlIdType value) {
        this.eftTrmlId = value;
    }

    /**
     * Gets the value of the eftCardAcptName property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAcptNameType }
     *     
     */
    public EFTCardAcptNameType getEFTCardAcptName() {
        return eftCardAcptName;
    }

    /**
     * Sets the value of the eftCardAcptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAcptNameType }
     *     
     */
    public void setEFTCardAcptName(EFTCardAcptNameType value) {
        this.eftCardAcptName = value;
    }

    /**
     * Gets the value of the eftCardAcptId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAcptIdType }
     *     
     */
    public EFTCardAcptIdType getEFTCardAcptId() {
        return eftCardAcptId;
    }

    /**
     * Sets the value of the eftCardAcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAcptIdType }
     *     
     */
    public void setEFTCardAcptId(EFTCardAcptIdType value) {
        this.eftCardAcptId = value;
    }

    /**
     * Gets the value of the eftBlkTrnLowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LowAmtType }
     *     
     */
    public LowAmtType getEFTBlkTrnLowAmt() {
        return eftBlkTrnLowAmt;
    }

    /**
     * Sets the value of the eftBlkTrnLowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowAmtType }
     *     
     */
    public void setEFTBlkTrnLowAmt(LowAmtType value) {
        this.eftBlkTrnLowAmt = value;
    }

    /**
     * Gets the value of the eftBlkTrnHighAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HighAmtType }
     *     
     */
    public HighAmtType getEFTBlkTrnHighAmt() {
        return eftBlkTrnHighAmt;
    }

    /**
     * Sets the value of the eftBlkTrnHighAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighAmtType }
     *     
     */
    public void setEFTBlkTrnHighAmt(HighAmtType value) {
        this.eftBlkTrnHighAmt = value;
    }

    /**
     * Gets the value of the eftBlkTrnExpType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkTrnExpTypeType }
     *     
     */
    public EFTBlkTrnExpTypeType getEFTBlkTrnExpType() {
        return eftBlkTrnExpType;
    }

    /**
     * Sets the value of the eftBlkTrnExpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkTrnExpTypeType }
     *     
     */
    public void setEFTBlkTrnExpType(EFTBlkTrnExpTypeType value) {
        this.eftBlkTrnExpType = value;
    }

    /**
     * Gets the value of the eftBlkMerIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkMerIdArrayAType }
     *     
     */
    public EFTBlkMerIdArrayAType getEFTBlkMerIdArray() {
        return eftBlkMerIdArray;
    }

    /**
     * Sets the value of the eftBlkMerIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkMerIdArrayAType }
     *     
     */
    public void setEFTBlkMerIdArray(EFTBlkMerIdArrayAType value) {
        this.eftBlkMerIdArray = value;
    }

    /**
     * Gets the value of the eftBlkTrnTypeArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkTrnTypeArrayAType }
     *     
     */
    public EFTBlkTrnTypeArrayAType getEFTBlkTrnTypeArray() {
        return eftBlkTrnTypeArray;
    }

    /**
     * Sets the value of the eftBlkTrnTypeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkTrnTypeArrayAType }
     *     
     */
    public void setEFTBlkTrnTypeArray(EFTBlkTrnTypeArrayAType value) {
        this.eftBlkTrnTypeArray = value;
    }

    /**
     * Gets the value of the eftPseudoTrmlIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTPseudoTrmlIdArrayAType }
     *     
     */
    public EFTPseudoTrmlIdArrayAType getEFTPseudoTrmlIdArray() {
        return eftPseudoTrmlIdArray;
    }

    /**
     * Sets the value of the eftPseudoTrmlIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTPseudoTrmlIdArrayAType }
     *     
     */
    public void setEFTPseudoTrmlIdArray(EFTPseudoTrmlIdArrayAType value) {
        this.eftPseudoTrmlIdArray = value;
    }

    /**
     * Gets the value of the eftCardPINEntryArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardPINEntryArrayAType }
     *     
     */
    public EFTCardPINEntryArrayAType getEFTCardPINEntryArray() {
        return eftCardPINEntryArray;
    }

    /**
     * Sets the value of the eftCardPINEntryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardPINEntryArrayAType }
     *     
     */
    public void setEFTCardPINEntryArray(EFTCardPINEntryArrayAType value) {
        this.eftCardPINEntryArray = value;
    }

    /**
     * Gets the value of the eftCardAcptStateArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAcptStateArrayAType }
     *     
     */
    public EFTCardAcptStateArrayAType getEFTCardAcptStateArray() {
        return eftCardAcptStateArray;
    }

    /**
     * Sets the value of the eftCardAcptStateArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAcptStateArrayAType }
     *     
     */
    public void setEFTCardAcptStateArray(EFTCardAcptStateArrayAType value) {
        this.eftCardAcptStateArray = value;
    }

    /**
     * Gets the value of the eftCardAcptPostalCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAcptPostalCodeArrayAType }
     *     
     */
    public EFTCardAcptPostalCodeArrayAType getEFTCardAcptPostalCodeArray() {
        return eftCardAcptPostalCodeArray;
    }

    /**
     * Sets the value of the eftCardAcptPostalCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAcptPostalCodeArrayAType }
     *     
     */
    public void setEFTCardAcptPostalCodeArray(EFTCardAcptPostalCodeArrayAType value) {
        this.eftCardAcptPostalCodeArray = value;
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
     * Gets the value of the eftBlkPOSCondCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkPOSCondCodeType }
     *     
     */
    public EFTBlkPOSCondCodeType getEFTBlkPOSCondCode() {
        return eftBlkPOSCondCode;
    }

    /**
     * Sets the value of the eftBlkPOSCondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkPOSCondCodeType }
     *     
     */
    public void setEFTBlkPOSCondCode(EFTBlkPOSCondCodeType value) {
        this.eftBlkPOSCondCode = value;
    }

    /**
     * Gets the value of the eftBlkPOSCondDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkPOSCondDescType }
     *     
     */
    public EFTBlkPOSCondDescType getEFTBlkPOSCondDesc() {
        return eftBlkPOSCondDesc;
    }

    /**
     * Sets the value of the eftBlkPOSCondDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkPOSCondDescType }
     *     
     */
    public void setEFTBlkPOSCondDesc(EFTBlkPOSCondDescType value) {
        this.eftBlkPOSCondDesc = value;
    }

    /**
     * Gets the value of the eftisoBlkId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTISOBlkIdType }
     *     
     */
    public EFTISOBlkIdType getEFTISOBlkId() {
        return eftisoBlkId;
    }

    /**
     * Sets the value of the eftisoBlkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTISOBlkIdType }
     *     
     */
    public void setEFTISOBlkId(EFTISOBlkIdType value) {
        this.eftisoBlkId = value;
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
