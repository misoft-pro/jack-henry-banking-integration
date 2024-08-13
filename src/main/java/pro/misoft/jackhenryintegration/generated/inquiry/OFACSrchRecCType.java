
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
 * <p>Java class for OFACSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFACSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OFACMatchType" type="{http://jackhenry.com/jxchange/TPG/2008}OFACMatchType_Type" minOccurs="0"/&gt;
 *         &lt;element name="OFACMatchRef" type="{http://jackhenry.com/jxchange/TPG/2008}OFACMatchRef_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecDesigNatId" type="{http://jackhenry.com/jxchange/TPG/2008}SpecDesigNatId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasId" type="{http://jackhenry.com/jxchange/TPG/2008}AliasId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecDesigNatName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecDesigNatType" type="{http://jackhenry.com/jxchange/TPG/2008}SpecDesigNatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecDesigNatPgm" type="{http://jackhenry.com/jxchange/TPG/2008}SpecDesigNatPgm_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecDesigNatAddr" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecDesigNatCity" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpecDesigNatCntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="RmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "OFACSrchRec_CType", propOrder = {
    "ofacMatchType",
    "ofacMatchRef",
    "specDesigNatId",
    "aliasId",
    "aliasName",
    "specDesigNatName",
    "specDesigNatType",
    "specDesigNatPgm",
    "specDesigNatAddr",
    "specDesigNatCity",
    "specDesigNatCntry",
    "rmkArray",
    "custom",
    "ver1",
    "any"
})
public class OFACSrchRecCType {

    @XmlElement(name = "OFACMatchType")
    protected OFACMatchTypeType ofacMatchType;
    @XmlElement(name = "OFACMatchRef")
    protected OFACMatchRefType ofacMatchRef;
    @XmlElement(name = "SpecDesigNatId")
    protected SpecDesigNatIdType specDesigNatId;
    @XmlElement(name = "AliasId")
    protected AliasIdType aliasId;
    @XmlElement(name = "AliasName")
    protected ComNameType aliasName;
    @XmlElement(name = "SpecDesigNatName")
    protected ComNameType specDesigNatName;
    @XmlElement(name = "SpecDesigNatType")
    protected SpecDesigNatTypeType specDesigNatType;
    @XmlElement(name = "SpecDesigNatPgm")
    protected SpecDesigNatPgmType specDesigNatPgm;
    @XmlElement(name = "SpecDesigNatAddr")
    protected StreetAddr1Type specDesigNatAddr;
    @XmlElement(name = "SpecDesigNatCity")
    protected CityType specDesigNatCity;
    @XmlElement(name = "SpecDesigNatCntry")
    protected CntryType specDesigNatCntry;
    @XmlElement(name = "RmkArray")
    protected RmkAType rmkArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the ofacMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link OFACMatchTypeType }
     *     
     */
    public OFACMatchTypeType getOFACMatchType() {
        return ofacMatchType;
    }

    /**
     * Sets the value of the ofacMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFACMatchTypeType }
     *     
     */
    public void setOFACMatchType(OFACMatchTypeType value) {
        this.ofacMatchType = value;
    }

    /**
     * Gets the value of the ofacMatchRef property.
     * 
     * @return
     *     possible object is
     *     {@link OFACMatchRefType }
     *     
     */
    public OFACMatchRefType getOFACMatchRef() {
        return ofacMatchRef;
    }

    /**
     * Sets the value of the ofacMatchRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFACMatchRefType }
     *     
     */
    public void setOFACMatchRef(OFACMatchRefType value) {
        this.ofacMatchRef = value;
    }

    /**
     * Gets the value of the specDesigNatId property.
     * 
     * @return
     *     possible object is
     *     {@link SpecDesigNatIdType }
     *     
     */
    public SpecDesigNatIdType getSpecDesigNatId() {
        return specDesigNatId;
    }

    /**
     * Sets the value of the specDesigNatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecDesigNatIdType }
     *     
     */
    public void setSpecDesigNatId(SpecDesigNatIdType value) {
        this.specDesigNatId = value;
    }

    /**
     * Gets the value of the aliasId property.
     * 
     * @return
     *     possible object is
     *     {@link AliasIdType }
     *     
     */
    public AliasIdType getAliasId() {
        return aliasId;
    }

    /**
     * Sets the value of the aliasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasIdType }
     *     
     */
    public void setAliasId(AliasIdType value) {
        this.aliasId = value;
    }

    /**
     * Gets the value of the aliasName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getAliasName() {
        return aliasName;
    }

    /**
     * Sets the value of the aliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setAliasName(ComNameType value) {
        this.aliasName = value;
    }

    /**
     * Gets the value of the specDesigNatName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getSpecDesigNatName() {
        return specDesigNatName;
    }

    /**
     * Sets the value of the specDesigNatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setSpecDesigNatName(ComNameType value) {
        this.specDesigNatName = value;
    }

    /**
     * Gets the value of the specDesigNatType property.
     * 
     * @return
     *     possible object is
     *     {@link SpecDesigNatTypeType }
     *     
     */
    public SpecDesigNatTypeType getSpecDesigNatType() {
        return specDesigNatType;
    }

    /**
     * Sets the value of the specDesigNatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecDesigNatTypeType }
     *     
     */
    public void setSpecDesigNatType(SpecDesigNatTypeType value) {
        this.specDesigNatType = value;
    }

    /**
     * Gets the value of the specDesigNatPgm property.
     * 
     * @return
     *     possible object is
     *     {@link SpecDesigNatPgmType }
     *     
     */
    public SpecDesigNatPgmType getSpecDesigNatPgm() {
        return specDesigNatPgm;
    }

    /**
     * Sets the value of the specDesigNatPgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecDesigNatPgmType }
     *     
     */
    public void setSpecDesigNatPgm(SpecDesigNatPgmType value) {
        this.specDesigNatPgm = value;
    }

    /**
     * Gets the value of the specDesigNatAddr property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr1Type }
     *     
     */
    public StreetAddr1Type getSpecDesigNatAddr() {
        return specDesigNatAddr;
    }

    /**
     * Sets the value of the specDesigNatAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr1Type }
     *     
     */
    public void setSpecDesigNatAddr(StreetAddr1Type value) {
        this.specDesigNatAddr = value;
    }

    /**
     * Gets the value of the specDesigNatCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getSpecDesigNatCity() {
        return specDesigNatCity;
    }

    /**
     * Sets the value of the specDesigNatCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setSpecDesigNatCity(CityType value) {
        this.specDesigNatCity = value;
    }

    /**
     * Gets the value of the specDesigNatCntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getSpecDesigNatCntry() {
        return specDesigNatCntry;
    }

    /**
     * Sets the value of the specDesigNatCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setSpecDesigNatCntry(CntryType value) {
        this.specDesigNatCntry = value;
    }

    /**
     * Gets the value of the rmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getRmkArray() {
        return rmkArray;
    }

    /**
     * Sets the value of the rmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setRmkArray(RmkAType value) {
        this.rmkArray = value;
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
