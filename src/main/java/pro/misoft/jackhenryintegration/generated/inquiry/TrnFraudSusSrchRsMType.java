
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
 * <p>Java class for TrnFraudSusSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnFraudSusSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="TrnFraudCatType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudCatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudRuleCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudRuleCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EndTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudSusSrchArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudSusSrchArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "TrnFraudSusSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "trnFraudCatType",
    "accountId",
    "eftCardNum",
    "trnFraudRuleCode",
    "startTimeDt",
    "endTimeDt",
    "trnFraudSusSrchArray",
    "custom",
    "ver1",
    "any"
})
public class TrnFraudSusSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "TrnFraudCatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnFraudCatTypeType> trnFraudCatType;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "EFTCardNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardNumType> eftCardNum;
    @XmlElementRef(name = "TrnFraudRuleCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnFraudRuleCodeType> trnFraudRuleCode;
    @XmlElementRef(name = "StartTimeDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartTimeDtType> startTimeDt;
    @XmlElementRef(name = "EndTimeDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndTimeDtType> endTimeDt;
    @XmlElementRef(name = "TrnFraudSusSrchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnFraudSusSrchArrayAType> trnFraudSusSrchArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public SrchMsgRsHdrCType getSrchMsgRsHdr() {
        return srchMsgRsHdr;
    }

    /**
     * Sets the value of the srchMsgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public void setSrchMsgRsHdr(SrchMsgRsHdrCType value) {
        this.srchMsgRsHdr = value;
    }

    /**
     * Gets the value of the trnFraudCatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudCatTypeType }{@code >}
     *     
     */
    public JAXBElement<TrnFraudCatTypeType> getTrnFraudCatType() {
        return trnFraudCatType;
    }

    /**
     * Sets the value of the trnFraudCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudCatTypeType }{@code >}
     *     
     */
    public void setTrnFraudCatType(JAXBElement<TrnFraudCatTypeType> value) {
        this.trnFraudCatType = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the eftCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardNumType }{@code >}
     *     
     */
    public JAXBElement<EFTCardNumType> getEFTCardNum() {
        return eftCardNum;
    }

    /**
     * Sets the value of the eftCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardNumType }{@code >}
     *     
     */
    public void setEFTCardNum(JAXBElement<EFTCardNumType> value) {
        this.eftCardNum = value;
    }

    /**
     * Gets the value of the trnFraudRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudRuleCodeType }{@code >}
     *     
     */
    public JAXBElement<TrnFraudRuleCodeType> getTrnFraudRuleCode() {
        return trnFraudRuleCode;
    }

    /**
     * Sets the value of the trnFraudRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudRuleCodeType }{@code >}
     *     
     */
    public void setTrnFraudRuleCode(JAXBElement<TrnFraudRuleCodeType> value) {
        this.trnFraudRuleCode = value;
    }

    /**
     * Gets the value of the startTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartTimeDtType }{@code >}
     *     
     */
    public JAXBElement<StartTimeDtType> getStartTimeDt() {
        return startTimeDt;
    }

    /**
     * Sets the value of the startTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartTimeDtType }{@code >}
     *     
     */
    public void setStartTimeDt(JAXBElement<StartTimeDtType> value) {
        this.startTimeDt = value;
    }

    /**
     * Gets the value of the endTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndTimeDtType }{@code >}
     *     
     */
    public JAXBElement<EndTimeDtType> getEndTimeDt() {
        return endTimeDt;
    }

    /**
     * Sets the value of the endTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndTimeDtType }{@code >}
     *     
     */
    public void setEndTimeDt(JAXBElement<EndTimeDtType> value) {
        this.endTimeDt = value;
    }

    /**
     * Gets the value of the trnFraudSusSrchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudSusSrchArrayAType }{@code >}
     *     
     */
    public JAXBElement<TrnFraudSusSrchArrayAType> getTrnFraudSusSrchArray() {
        return trnFraudSusSrchArray;
    }

    /**
     * Sets the value of the trnFraudSusSrchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnFraudSusSrchArrayAType }{@code >}
     *     
     */
    public void setTrnFraudSusSrchArray(JAXBElement<TrnFraudSusSrchArrayAType> value) {
        this.trnFraudSusSrchArray = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
