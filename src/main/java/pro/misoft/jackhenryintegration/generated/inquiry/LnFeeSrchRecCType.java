
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnFeeSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnFeeSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeId" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeAssmntDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeAssmntDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeNxtPayDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtPayDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeFreq" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeFreq_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeeFreqUnits" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeeFreqUnits_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnFeeSrchRec_CType", propOrder = {
    "lnAcctId",
    "lnFeeId",
    "lnUnitId",
    "lnUnitDesc",
    "lnFeeCode",
    "lnFeeDesc",
    "lnFeeAmt",
    "lnFeeAssmntDt",
    "lnFeeNxtPayDt",
    "lnFeeFreq",
    "lnFeeFreqUnits",
    "ver1",
    "any"
})
public class LnFeeSrchRecCType {

    @XmlElement(name = "LnAcctId")
    protected AccountIdCType lnAcctId;
    @XmlElement(name = "LnFeeId")
    protected LnFeeIdType lnFeeId;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "LnUnitDesc")
    protected LnUnitDescType lnUnitDesc;
    @XmlElement(name = "LnFeeCode")
    protected LnFeeCodeType lnFeeCode;
    @XmlElement(name = "LnFeeDesc")
    protected LnFeeDescType lnFeeDesc;
    @XmlElement(name = "LnFeeAmt")
    protected LnFeeAmtType lnFeeAmt;
    @XmlElement(name = "LnFeeAssmntDt")
    protected LnFeeAssmntDtType lnFeeAssmntDt;
    @XmlElement(name = "LnFeeNxtPayDt")
    protected NxtPayDtType lnFeeNxtPayDt;
    @XmlElement(name = "LnFeeFreq")
    protected LnFeeFreqType lnFeeFreq;
    @XmlElement(name = "LnFeeFreqUnits")
    protected LnFeeFreqUnitsType lnFeeFreqUnits;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getLnAcctId() {
        return lnAcctId;
    }

    /**
     * Sets the value of the lnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setLnAcctId(AccountIdCType value) {
        this.lnAcctId = value;
    }

    /**
     * Gets the value of the lnFeeId property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeIdType }
     *     
     */
    public LnFeeIdType getLnFeeId() {
        return lnFeeId;
    }

    /**
     * Sets the value of the lnFeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeIdType }
     *     
     */
    public void setLnFeeId(LnFeeIdType value) {
        this.lnFeeId = value;
    }

    /**
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setLnUnitId(LnUnitIdType value) {
        this.lnUnitId = value;
    }

    /**
     * Gets the value of the lnUnitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitDescType }
     *     
     */
    public LnUnitDescType getLnUnitDesc() {
        return lnUnitDesc;
    }

    /**
     * Sets the value of the lnUnitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitDescType }
     *     
     */
    public void setLnUnitDesc(LnUnitDescType value) {
        this.lnUnitDesc = value;
    }

    /**
     * Gets the value of the lnFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeCodeType }
     *     
     */
    public LnFeeCodeType getLnFeeCode() {
        return lnFeeCode;
    }

    /**
     * Sets the value of the lnFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeCodeType }
     *     
     */
    public void setLnFeeCode(LnFeeCodeType value) {
        this.lnFeeCode = value;
    }

    /**
     * Gets the value of the lnFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeDescType }
     *     
     */
    public LnFeeDescType getLnFeeDesc() {
        return lnFeeDesc;
    }

    /**
     * Sets the value of the lnFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeDescType }
     *     
     */
    public void setLnFeeDesc(LnFeeDescType value) {
        this.lnFeeDesc = value;
    }

    /**
     * Gets the value of the lnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeAmtType }
     *     
     */
    public LnFeeAmtType getLnFeeAmt() {
        return lnFeeAmt;
    }

    /**
     * Sets the value of the lnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeAmtType }
     *     
     */
    public void setLnFeeAmt(LnFeeAmtType value) {
        this.lnFeeAmt = value;
    }

    /**
     * Gets the value of the lnFeeAssmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeAssmntDtType }
     *     
     */
    public LnFeeAssmntDtType getLnFeeAssmntDt() {
        return lnFeeAssmntDt;
    }

    /**
     * Sets the value of the lnFeeAssmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeAssmntDtType }
     *     
     */
    public void setLnFeeAssmntDt(LnFeeAssmntDtType value) {
        this.lnFeeAssmntDt = value;
    }

    /**
     * Gets the value of the lnFeeNxtPayDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtPayDtType }
     *     
     */
    public NxtPayDtType getLnFeeNxtPayDt() {
        return lnFeeNxtPayDt;
    }

    /**
     * Sets the value of the lnFeeNxtPayDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtPayDtType }
     *     
     */
    public void setLnFeeNxtPayDt(NxtPayDtType value) {
        this.lnFeeNxtPayDt = value;
    }

    /**
     * Gets the value of the lnFeeFreq property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeFreqType }
     *     
     */
    public LnFeeFreqType getLnFeeFreq() {
        return lnFeeFreq;
    }

    /**
     * Sets the value of the lnFeeFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeFreqType }
     *     
     */
    public void setLnFeeFreq(LnFeeFreqType value) {
        this.lnFeeFreq = value;
    }

    /**
     * Gets the value of the lnFeeFreqUnits property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeeFreqUnitsType }
     *     
     */
    public LnFeeFreqUnitsType getLnFeeFreqUnits() {
        return lnFeeFreqUnits;
    }

    /**
     * Sets the value of the lnFeeFreqUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeeFreqUnitsType }
     *     
     */
    public void setLnFeeFreqUnits(LnFeeFreqUnitsType value) {
        this.lnFeeFreqUnits = value;
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
