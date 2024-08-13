
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
 * <p>Java class for EntityMatchBatchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchBatchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr2" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr2_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WhiteListType" type="{http://jackhenry.com/jxchange/TPG/2008}WhiteListType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityACHId" type="{http://jackhenry.com/jxchange/TPG/2008}EntityId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityListDt" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityListCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BlkCntryArray" type="{http://jackhenry.com/jxchange/TPG/2008}BlkCntryArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EntityMatchBatchRec_CType", propOrder = {
    "entityName",
    "streetAddr1",
    "streetAddr2",
    "city",
    "stateCode",
    "cntryType",
    "whiteListType",
    "entityACHId",
    "entityListDt",
    "entityListCodeArray",
    "entityArray",
    "blkCntryArray",
    "custom",
    "ver1",
    "any"
})
public class EntityMatchBatchRecCType {

    @XmlElement(name = "EntityName")
    protected ComNameType entityName;
    @XmlElement(name = "StreetAddr1")
    protected StreetAddr1Type streetAddr1;
    @XmlElement(name = "StreetAddr2")
    protected StreetAddr2Type streetAddr2;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "StateCode")
    protected StateCodeType stateCode;
    @XmlElement(name = "CntryType")
    protected CntryTypeType cntryType;
    @XmlElement(name = "WhiteListType")
    protected WhiteListTypeType whiteListType;
    @XmlElement(name = "EntityACHId")
    protected EntityIdType entityACHId;
    @XmlElement(name = "EntityListDt")
    protected EntityListDtType entityListDt;
    @XmlElement(name = "EntityListCodeArray")
    protected EntityListCodeArrayAType entityListCodeArray;
    @XmlElement(name = "EntityArray")
    protected EntityArrayAType entityArray;
    @XmlElement(name = "BlkCntryArray")
    protected BlkCntryArrayAType blkCntryArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setEntityName(ComNameType value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the streetAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr1Type }
     *     
     */
    public StreetAddr1Type getStreetAddr1() {
        return streetAddr1;
    }

    /**
     * Sets the value of the streetAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr1Type }
     *     
     */
    public void setStreetAddr1(StreetAddr1Type value) {
        this.streetAddr1 = value;
    }

    /**
     * Gets the value of the streetAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddr2Type }
     *     
     */
    public StreetAddr2Type getStreetAddr2() {
        return streetAddr2;
    }

    /**
     * Sets the value of the streetAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddr2Type }
     *     
     */
    public void setStreetAddr2(StreetAddr2Type value) {
        this.streetAddr2 = value;
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
     * Gets the value of the cntryType property.
     * 
     * @return
     *     possible object is
     *     {@link CntryTypeType }
     *     
     */
    public CntryTypeType getCntryType() {
        return cntryType;
    }

    /**
     * Sets the value of the cntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryTypeType }
     *     
     */
    public void setCntryType(CntryTypeType value) {
        this.cntryType = value;
    }

    /**
     * Gets the value of the whiteListType property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteListTypeType }
     *     
     */
    public WhiteListTypeType getWhiteListType() {
        return whiteListType;
    }

    /**
     * Sets the value of the whiteListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteListTypeType }
     *     
     */
    public void setWhiteListType(WhiteListTypeType value) {
        this.whiteListType = value;
    }

    /**
     * Gets the value of the entityACHId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getEntityACHId() {
        return entityACHId;
    }

    /**
     * Sets the value of the entityACHId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setEntityACHId(EntityIdType value) {
        this.entityACHId = value;
    }

    /**
     * Gets the value of the entityListDt property.
     * 
     * @return
     *     possible object is
     *     {@link EntityListDtType }
     *     
     */
    public EntityListDtType getEntityListDt() {
        return entityListDt;
    }

    /**
     * Sets the value of the entityListDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityListDtType }
     *     
     */
    public void setEntityListDt(EntityListDtType value) {
        this.entityListDt = value;
    }

    /**
     * Gets the value of the entityListCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityListCodeArrayAType }
     *     
     */
    public EntityListCodeArrayAType getEntityListCodeArray() {
        return entityListCodeArray;
    }

    /**
     * Sets the value of the entityListCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityListCodeArrayAType }
     *     
     */
    public void setEntityListCodeArray(EntityListCodeArrayAType value) {
        this.entityListCodeArray = value;
    }

    /**
     * Gets the value of the entityArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityArrayAType }
     *     
     */
    public EntityArrayAType getEntityArray() {
        return entityArray;
    }

    /**
     * Sets the value of the entityArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityArrayAType }
     *     
     */
    public void setEntityArray(EntityArrayAType value) {
        this.entityArray = value;
    }

    /**
     * Gets the value of the blkCntryArray property.
     * 
     * @return
     *     possible object is
     *     {@link BlkCntryArrayAType }
     *     
     */
    public BlkCntryArrayAType getBlkCntryArray() {
        return blkCntryArray;
    }

    /**
     * Sets the value of the blkCntryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlkCntryArrayAType }
     *     
     */
    public void setBlkCntryArray(BlkCntryArrayAType value) {
        this.blkCntryArray = value;
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
