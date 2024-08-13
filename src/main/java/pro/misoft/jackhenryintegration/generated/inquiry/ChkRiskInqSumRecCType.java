
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
 * <p>Java class for ChkRiskInqSumRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkRiskInqSumRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChkRiskAbbCode" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskAbbCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskAbbDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskAbbDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHasAlerts" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHasAlerts_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHoldDays" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHoldDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkHoldAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkHoldAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkRiskActDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChkRiskActDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskStatArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ChkRiskInqSumRec_CType", propOrder = {
    "chkRiskAbbCode",
    "chkRiskAbbDesc",
    "chkHasAlerts",
    "chkHoldDays",
    "chkHoldAmt",
    "chkRiskActDesc",
    "trnRcptId",
    "trnRiskStatArray",
    "ver1",
    "any"
})
public class ChkRiskInqSumRecCType {

    @XmlElement(name = "ChkRiskAbbCode")
    protected ChkRiskAbbCodeType chkRiskAbbCode;
    @XmlElement(name = "ChkRiskAbbDesc")
    protected ChkRiskAbbDescType chkRiskAbbDesc;
    @XmlElement(name = "ChkHasAlerts")
    protected ChkHasAlertsType chkHasAlerts;
    @XmlElement(name = "ChkHoldDays")
    protected ChkHoldDaysType chkHoldDays;
    @XmlElement(name = "ChkHoldAmt")
    protected ChkHoldAmtType chkHoldAmt;
    @XmlElement(name = "ChkRiskActDesc")
    protected ChkRiskActDescType chkRiskActDesc;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElement(name = "TrnRiskStatArray")
    protected TrnRiskStatArrayAType trnRiskStatArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the chkRiskAbbCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskAbbCodeType }
     *     
     */
    public ChkRiskAbbCodeType getChkRiskAbbCode() {
        return chkRiskAbbCode;
    }

    /**
     * Sets the value of the chkRiskAbbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskAbbCodeType }
     *     
     */
    public void setChkRiskAbbCode(ChkRiskAbbCodeType value) {
        this.chkRiskAbbCode = value;
    }

    /**
     * Gets the value of the chkRiskAbbDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskAbbDescType }
     *     
     */
    public ChkRiskAbbDescType getChkRiskAbbDesc() {
        return chkRiskAbbDesc;
    }

    /**
     * Sets the value of the chkRiskAbbDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskAbbDescType }
     *     
     */
    public void setChkRiskAbbDesc(ChkRiskAbbDescType value) {
        this.chkRiskAbbDesc = value;
    }

    /**
     * Gets the value of the chkHasAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link ChkHasAlertsType }
     *     
     */
    public ChkHasAlertsType getChkHasAlerts() {
        return chkHasAlerts;
    }

    /**
     * Sets the value of the chkHasAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkHasAlertsType }
     *     
     */
    public void setChkHasAlerts(ChkHasAlertsType value) {
        this.chkHasAlerts = value;
    }

    /**
     * Gets the value of the chkHoldDays property.
     * 
     * @return
     *     possible object is
     *     {@link ChkHoldDaysType }
     *     
     */
    public ChkHoldDaysType getChkHoldDays() {
        return chkHoldDays;
    }

    /**
     * Sets the value of the chkHoldDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkHoldDaysType }
     *     
     */
    public void setChkHoldDays(ChkHoldDaysType value) {
        this.chkHoldDays = value;
    }

    /**
     * Gets the value of the chkHoldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkHoldAmtType }
     *     
     */
    public ChkHoldAmtType getChkHoldAmt() {
        return chkHoldAmt;
    }

    /**
     * Sets the value of the chkHoldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkHoldAmtType }
     *     
     */
    public void setChkHoldAmt(ChkHoldAmtType value) {
        this.chkHoldAmt = value;
    }

    /**
     * Gets the value of the chkRiskActDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChkRiskActDescType }
     *     
     */
    public ChkRiskActDescType getChkRiskActDesc() {
        return chkRiskActDesc;
    }

    /**
     * Sets the value of the chkRiskActDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkRiskActDescType }
     *     
     */
    public void setChkRiskActDesc(ChkRiskActDescType value) {
        this.chkRiskActDesc = value;
    }

    /**
     * Gets the value of the trnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public JAXBElement<TrnRcptIdType> getTrnRcptId() {
        return trnRcptId;
    }

    /**
     * Sets the value of the trnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public void setTrnRcptId(JAXBElement<TrnRcptIdType> value) {
        this.trnRcptId = value;
    }

    /**
     * Gets the value of the trnRiskStatArray property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatArrayAType }
     *     
     */
    public TrnRiskStatArrayAType getTrnRiskStatArray() {
        return trnRiskStatArray;
    }

    /**
     * Sets the value of the trnRiskStatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatArrayAType }
     *     
     */
    public void setTrnRiskStatArray(TrnRiskStatArrayAType value) {
        this.trnRiskStatArray = value;
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
