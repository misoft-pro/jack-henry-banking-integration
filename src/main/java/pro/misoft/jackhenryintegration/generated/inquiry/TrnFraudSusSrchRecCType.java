
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
 * <p>Java class for TrnFraudSusSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnFraudSusSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnFraudSusId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudSusId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudSusTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudSusTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ComName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudSusRiskPct" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudSusRiskPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnFraudRuleArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudRuleArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "TrnFraudSusSrchRec_CType", propOrder = {
    "trnFraudSusId",
    "trnFraudSusTimeDt",
    "accountId",
    "eftCardNum",
    "comName",
    "trnFraudSusRiskPct",
    "trnFraudRuleArray",
    "custom",
    "ver1",
    "any"
})
public class TrnFraudSusSrchRecCType {

    @XmlElement(name = "TrnFraudSusId")
    protected TrnFraudSusIdType trnFraudSusId;
    @XmlElement(name = "TrnFraudSusTimeDt")
    protected TrnFraudSusTimeDtType trnFraudSusTimeDt;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "EFTCardNum")
    protected EFTCardNumType eftCardNum;
    @XmlElement(name = "ComName")
    protected ComNameType comName;
    @XmlElement(name = "TrnFraudSusRiskPct")
    protected TrnFraudSusRiskPctType trnFraudSusRiskPct;
    @XmlElement(name = "TrnFraudRuleArray")
    protected TrnFraudRuleArrayAType trnFraudRuleArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trnFraudSusId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudSusIdType }
     *     
     */
    public TrnFraudSusIdType getTrnFraudSusId() {
        return trnFraudSusId;
    }

    /**
     * Sets the value of the trnFraudSusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudSusIdType }
     *     
     */
    public void setTrnFraudSusId(TrnFraudSusIdType value) {
        this.trnFraudSusId = value;
    }

    /**
     * Gets the value of the trnFraudSusTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudSusTimeDtType }
     *     
     */
    public TrnFraudSusTimeDtType getTrnFraudSusTimeDt() {
        return trnFraudSusTimeDt;
    }

    /**
     * Sets the value of the trnFraudSusTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudSusTimeDtType }
     *     
     */
    public void setTrnFraudSusTimeDt(TrnFraudSusTimeDtType value) {
        this.trnFraudSusTimeDt = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
    }

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
     * Gets the value of the comName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getComName() {
        return comName;
    }

    /**
     * Sets the value of the comName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setComName(ComNameType value) {
        this.comName = value;
    }

    /**
     * Gets the value of the trnFraudSusRiskPct property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudSusRiskPctType }
     *     
     */
    public TrnFraudSusRiskPctType getTrnFraudSusRiskPct() {
        return trnFraudSusRiskPct;
    }

    /**
     * Sets the value of the trnFraudSusRiskPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudSusRiskPctType }
     *     
     */
    public void setTrnFraudSusRiskPct(TrnFraudSusRiskPctType value) {
        this.trnFraudSusRiskPct = value;
    }

    /**
     * Gets the value of the trnFraudRuleArray property.
     * 
     * @return
     *     possible object is
     *     {@link TrnFraudRuleArrayAType }
     *     
     */
    public TrnFraudRuleArrayAType getTrnFraudRuleArray() {
        return trnFraudRuleArray;
    }

    /**
     * Sets the value of the trnFraudRuleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnFraudRuleArrayAType }
     *     
     */
    public void setTrnFraudRuleArray(TrnFraudRuleArrayAType value) {
        this.trnFraudRuleArray = value;
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
