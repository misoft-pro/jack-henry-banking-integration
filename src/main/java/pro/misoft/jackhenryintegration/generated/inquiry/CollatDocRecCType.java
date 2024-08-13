
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for CollatDocRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatDocRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatDocBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocExcDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocExcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocExcLtrId" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocExcLtrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocExcLtrNoSent" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocExcLtrNoSent_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocExcDay" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocExcDay_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocLocCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocLocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocPrvStat" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocPrvStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocRecvDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocRecvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocRcptLtrId" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocRcptLtrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocPrtRcpt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocPrtRcpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocStat" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocStatDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocStatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocWavDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocWavDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *             &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *             &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CollatDocRec_CType", propOrder = {
    "collatDocBrCode",
    "collatDocExcDt",
    "collatDocDt",
    "collatDocInfoArray",
    "collatDocCode",
    "collatDocExcLtrId",
    "collatDocExcLtrNoSent",
    "collatDocExcDay",
    "collatDocExpDt",
    "collatDocLocCode",
    "collatDocPrvStat",
    "collatDocRecvDt",
    "collatDocRcptLtrId",
    "collatDocPrtRcpt",
    "collatDocStat",
    "collatDocStatDt",
    "collatDocWavDt",
    "collatDocOffCode",
    "ver1",
    "custom",
    "ver2",
    "acctId",
    "acctType",
    "custId",
    "ver3",
    "any"
})
public class CollatDocRecCType {

    @XmlElementRef(name = "CollatDocBrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> collatDocBrCode;
    @XmlElementRef(name = "CollatDocExcDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocExcDtType> collatDocExcDt;
    @XmlElementRef(name = "CollatDocDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocDtType> collatDocDt;
    @XmlElement(name = "CollatDocInfoArray")
    protected CollatDocInfoArrayAType collatDocInfoArray;
    @XmlElementRef(name = "CollatDocCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocCodeType> collatDocCode;
    @XmlElementRef(name = "CollatDocExcLtrId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocExcLtrIdType> collatDocExcLtrId;
    @XmlElementRef(name = "CollatDocExcLtrNoSent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocExcLtrNoSentType> collatDocExcLtrNoSent;
    @XmlElementRef(name = "CollatDocExcDay", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocExcDayType> collatDocExcDay;
    @XmlElementRef(name = "CollatDocExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocExpDtType> collatDocExpDt;
    @XmlElementRef(name = "CollatDocLocCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocLocCodeType> collatDocLocCode;
    @XmlElementRef(name = "CollatDocPrvStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocPrvStatType> collatDocPrvStat;
    @XmlElementRef(name = "CollatDocRecvDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocRecvDtType> collatDocRecvDt;
    @XmlElementRef(name = "CollatDocRcptLtrId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocRcptLtrIdType> collatDocRcptLtrId;
    @XmlElementRef(name = "CollatDocPrtRcpt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocPrtRcptType> collatDocPrtRcpt;
    @XmlElementRef(name = "CollatDocStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocStatType> collatDocStat;
    @XmlElementRef(name = "CollatDocStatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocStatDtType> collatDocStatDt;
    @XmlElementRef(name = "CollatDocWavDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatDocWavDtType> collatDocWavDt;
    @XmlElementRef(name = "CollatDocOffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> collatDocOffCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AcctId")
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the collatDocBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getCollatDocBrCode() {
        return collatDocBrCode;
    }

    /**
     * Sets the value of the collatDocBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setCollatDocBrCode(JAXBElement<BrCodeType> value) {
        this.collatDocBrCode = value;
    }

    /**
     * Gets the value of the collatDocExcDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcDtType }{@code >}
     *     
     */
    public JAXBElement<CollatDocExcDtType> getCollatDocExcDt() {
        return collatDocExcDt;
    }

    /**
     * Sets the value of the collatDocExcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcDtType }{@code >}
     *     
     */
    public void setCollatDocExcDt(JAXBElement<CollatDocExcDtType> value) {
        this.collatDocExcDt = value;
    }

    /**
     * Gets the value of the collatDocDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocDtType }{@code >}
     *     
     */
    public JAXBElement<CollatDocDtType> getCollatDocDt() {
        return collatDocDt;
    }

    /**
     * Sets the value of the collatDocDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocDtType }{@code >}
     *     
     */
    public void setCollatDocDt(JAXBElement<CollatDocDtType> value) {
        this.collatDocDt = value;
    }

    /**
     * Gets the value of the collatDocInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocInfoArrayAType }
     *     
     */
    public CollatDocInfoArrayAType getCollatDocInfoArray() {
        return collatDocInfoArray;
    }

    /**
     * Sets the value of the collatDocInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocInfoArrayAType }
     *     
     */
    public void setCollatDocInfoArray(CollatDocInfoArrayAType value) {
        this.collatDocInfoArray = value;
    }

    /**
     * Gets the value of the collatDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatDocCodeType> getCollatDocCode() {
        return collatDocCode;
    }

    /**
     * Sets the value of the collatDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocCodeType }{@code >}
     *     
     */
    public void setCollatDocCode(JAXBElement<CollatDocCodeType> value) {
        this.collatDocCode = value;
    }

    /**
     * Gets the value of the collatDocExcLtrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcLtrIdType }{@code >}
     *     
     */
    public JAXBElement<CollatDocExcLtrIdType> getCollatDocExcLtrId() {
        return collatDocExcLtrId;
    }

    /**
     * Sets the value of the collatDocExcLtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcLtrIdType }{@code >}
     *     
     */
    public void setCollatDocExcLtrId(JAXBElement<CollatDocExcLtrIdType> value) {
        this.collatDocExcLtrId = value;
    }

    /**
     * Gets the value of the collatDocExcLtrNoSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcLtrNoSentType }{@code >}
     *     
     */
    public JAXBElement<CollatDocExcLtrNoSentType> getCollatDocExcLtrNoSent() {
        return collatDocExcLtrNoSent;
    }

    /**
     * Sets the value of the collatDocExcLtrNoSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcLtrNoSentType }{@code >}
     *     
     */
    public void setCollatDocExcLtrNoSent(JAXBElement<CollatDocExcLtrNoSentType> value) {
        this.collatDocExcLtrNoSent = value;
    }

    /**
     * Gets the value of the collatDocExcDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcDayType }{@code >}
     *     
     */
    public JAXBElement<CollatDocExcDayType> getCollatDocExcDay() {
        return collatDocExcDay;
    }

    /**
     * Sets the value of the collatDocExcDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExcDayType }{@code >}
     *     
     */
    public void setCollatDocExcDay(JAXBElement<CollatDocExcDayType> value) {
        this.collatDocExcDay = value;
    }

    /**
     * Gets the value of the collatDocExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExpDtType }{@code >}
     *     
     */
    public JAXBElement<CollatDocExpDtType> getCollatDocExpDt() {
        return collatDocExpDt;
    }

    /**
     * Sets the value of the collatDocExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocExpDtType }{@code >}
     *     
     */
    public void setCollatDocExpDt(JAXBElement<CollatDocExpDtType> value) {
        this.collatDocExpDt = value;
    }

    /**
     * Gets the value of the collatDocLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocLocCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatDocLocCodeType> getCollatDocLocCode() {
        return collatDocLocCode;
    }

    /**
     * Sets the value of the collatDocLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocLocCodeType }{@code >}
     *     
     */
    public void setCollatDocLocCode(JAXBElement<CollatDocLocCodeType> value) {
        this.collatDocLocCode = value;
    }

    /**
     * Gets the value of the collatDocPrvStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocPrvStatType }{@code >}
     *     
     */
    public JAXBElement<CollatDocPrvStatType> getCollatDocPrvStat() {
        return collatDocPrvStat;
    }

    /**
     * Sets the value of the collatDocPrvStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocPrvStatType }{@code >}
     *     
     */
    public void setCollatDocPrvStat(JAXBElement<CollatDocPrvStatType> value) {
        this.collatDocPrvStat = value;
    }

    /**
     * Gets the value of the collatDocRecvDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocRecvDtType }{@code >}
     *     
     */
    public JAXBElement<CollatDocRecvDtType> getCollatDocRecvDt() {
        return collatDocRecvDt;
    }

    /**
     * Sets the value of the collatDocRecvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocRecvDtType }{@code >}
     *     
     */
    public void setCollatDocRecvDt(JAXBElement<CollatDocRecvDtType> value) {
        this.collatDocRecvDt = value;
    }

    /**
     * Gets the value of the collatDocRcptLtrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocRcptLtrIdType }{@code >}
     *     
     */
    public JAXBElement<CollatDocRcptLtrIdType> getCollatDocRcptLtrId() {
        return collatDocRcptLtrId;
    }

    /**
     * Sets the value of the collatDocRcptLtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocRcptLtrIdType }{@code >}
     *     
     */
    public void setCollatDocRcptLtrId(JAXBElement<CollatDocRcptLtrIdType> value) {
        this.collatDocRcptLtrId = value;
    }

    /**
     * Gets the value of the collatDocPrtRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocPrtRcptType }{@code >}
     *     
     */
    public JAXBElement<CollatDocPrtRcptType> getCollatDocPrtRcpt() {
        return collatDocPrtRcpt;
    }

    /**
     * Sets the value of the collatDocPrtRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocPrtRcptType }{@code >}
     *     
     */
    public void setCollatDocPrtRcpt(JAXBElement<CollatDocPrtRcptType> value) {
        this.collatDocPrtRcpt = value;
    }

    /**
     * Gets the value of the collatDocStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocStatType }{@code >}
     *     
     */
    public JAXBElement<CollatDocStatType> getCollatDocStat() {
        return collatDocStat;
    }

    /**
     * Sets the value of the collatDocStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocStatType }{@code >}
     *     
     */
    public void setCollatDocStat(JAXBElement<CollatDocStatType> value) {
        this.collatDocStat = value;
    }

    /**
     * Gets the value of the collatDocStatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocStatDtType }{@code >}
     *     
     */
    public JAXBElement<CollatDocStatDtType> getCollatDocStatDt() {
        return collatDocStatDt;
    }

    /**
     * Sets the value of the collatDocStatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocStatDtType }{@code >}
     *     
     */
    public void setCollatDocStatDt(JAXBElement<CollatDocStatDtType> value) {
        this.collatDocStatDt = value;
    }

    /**
     * Gets the value of the collatDocWavDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatDocWavDtType }{@code >}
     *     
     */
    public JAXBElement<CollatDocWavDtType> getCollatDocWavDt() {
        return collatDocWavDt;
    }

    /**
     * Sets the value of the collatDocWavDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatDocWavDtType }{@code >}
     *     
     */
    public void setCollatDocWavDt(JAXBElement<CollatDocWavDtType> value) {
        this.collatDocWavDt = value;
    }

    /**
     * Gets the value of the collatDocOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getCollatDocOffCode() {
        return collatDocOffCode;
    }

    /**
     * Sets the value of the collatDocOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setCollatDocOffCode(JAXBElement<OffCodeType> value) {
        this.collatDocOffCode = value;
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
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
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
