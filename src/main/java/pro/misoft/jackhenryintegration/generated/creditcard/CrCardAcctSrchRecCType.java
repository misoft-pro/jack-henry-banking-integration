
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
 * <p>Java class for CrCardAcctSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardAcctSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdEmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}SecdEmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStat" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStatDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardAcctSrchRec_CType", propOrder = {
    "crCardAcctId",
    "embosName",
    "secdEmbosName",
    "city",
    "stateCode",
    "postalCode",
    "acctStat",
    "acctStatDesc",
    "locStat",
    "locStatDesc",
    "custom",
    "ver1",
    "any"
})
public class CrCardAcctSrchRecCType {

    @XmlElement(name = "CrCardAcctId", required = true)
    protected AcctIdType crCardAcctId;
    @XmlElement(name = "EmbosName")
    protected EmbosNameType embosName;
    @XmlElement(name = "SecdEmbosName")
    protected SecdEmbosNameType secdEmbosName;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "StateCode")
    protected StateCodeType stateCode;
    @XmlElement(name = "PostalCode")
    protected PostalCodeType postalCode;
    @XmlElement(name = "AcctStat")
    protected AcctStatType acctStat;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "LOCStat")
    protected LOCStatType locStat;
    @XmlElement(name = "LOCStatDesc")
    protected LOCStatDescType locStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getCrCardAcctId() {
        return crCardAcctId;
    }

    /**
     * Sets the value of the crCardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setCrCardAcctId(AcctIdType value) {
        this.crCardAcctId = value;
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
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setStateCode(StateCodeType value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeType }
     *     
     */
    public PostalCodeType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeType }
     *     
     */
    public void setPostalCode(PostalCodeType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the acctStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getAcctStat() {
        return acctStat;
    }

    /**
     * Sets the value of the acctStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setAcctStat(AcctStatType value) {
        this.acctStat = value;
    }

    /**
     * Gets the value of the acctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatDescType }
     *     
     */
    public AcctStatDescType getAcctStatDesc() {
        return acctStatDesc;
    }

    /**
     * Sets the value of the acctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatDescType }
     *     
     */
    public void setAcctStatDesc(AcctStatDescType value) {
        this.acctStatDesc = value;
    }

    /**
     * Gets the value of the locStat property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatType }
     *     
     */
    public LOCStatType getLOCStat() {
        return locStat;
    }

    /**
     * Sets the value of the locStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatType }
     *     
     */
    public void setLOCStat(LOCStatType value) {
        this.locStat = value;
    }

    /**
     * Gets the value of the locStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatDescType }
     *     
     */
    public LOCStatDescType getLOCStatDesc() {
        return locStatDesc;
    }

    /**
     * Sets the value of the locStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatDescType }
     *     
     */
    public void setLOCStatDesc(LOCStatDescType value) {
        this.locStatDesc = value;
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
