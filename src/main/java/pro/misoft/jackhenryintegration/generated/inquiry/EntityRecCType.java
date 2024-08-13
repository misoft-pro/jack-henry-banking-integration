
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
 * <p>Java class for EntityRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityId" type="{http://jackhenry.com/jxchange/TPG/2008}EntityId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntitySrcId" type="{http://jackhenry.com/jxchange/TPG/2008}EntitySrcId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityConfdScore" type="{http://jackhenry.com/jxchange/TPG/2008}EntityConfdScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="ComName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://jackhenry.com/jxchange/TPG/2008}FirstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://jackhenry.com/jxchange/TPG/2008}LastName_Type" minOccurs="0"/&gt;
 *         &lt;element name="Rmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasExactMatchType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityExactMatchType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrExactMatchType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityExactMatchType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdExactMatchType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityExactMatchType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityNatPgmArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityNatPgmArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityAliasArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityAliasArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityAddrArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityIdArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EntityRec_CType", propOrder = {
    "entityId",
    "entitySrcId",
    "entityType",
    "entityConfdScore",
    "comName",
    "firstName",
    "lastName",
    "rmk",
    "aliasExactMatchType",
    "addrExactMatchType",
    "idExactMatchType",
    "entityNatPgmArray",
    "entityAliasArray",
    "entityAddrArray",
    "entityIdArray",
    "custom",
    "ver1",
    "any"
})
public class EntityRecCType {

    @XmlElement(name = "EntityId")
    protected EntityIdType entityId;
    @XmlElement(name = "EntitySrcId")
    protected EntitySrcIdType entitySrcId;
    @XmlElement(name = "EntityType")
    protected EntityTypeType entityType;
    @XmlElement(name = "EntityConfdScore")
    protected EntityConfdScoreType entityConfdScore;
    @XmlElement(name = "ComName")
    protected ComNameType comName;
    @XmlElement(name = "FirstName")
    protected FirstNameType firstName;
    @XmlElement(name = "LastName")
    protected LastNameType lastName;
    @XmlElement(name = "Rmk")
    protected RmkType rmk;
    @XmlElement(name = "AliasExactMatchType")
    protected EntityExactMatchTypeType aliasExactMatchType;
    @XmlElement(name = "AddrExactMatchType")
    protected EntityExactMatchTypeType addrExactMatchType;
    @XmlElement(name = "IdExactMatchType")
    protected EntityExactMatchTypeType idExactMatchType;
    @XmlElement(name = "EntityNatPgmArray")
    protected EntityNatPgmArrayAType entityNatPgmArray;
    @XmlElement(name = "EntityAliasArray")
    protected EntityAliasArrayAType entityAliasArray;
    @XmlElement(name = "EntityAddrArray")
    protected EntityAddrArrayAType entityAddrArray;
    @XmlElement(name = "EntityIdArray")
    protected EntityIdArrayAType entityIdArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdType }
     *     
     */
    public EntityIdType getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdType }
     *     
     */
    public void setEntityId(EntityIdType value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the entitySrcId property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySrcIdType }
     *     
     */
    public EntitySrcIdType getEntitySrcId() {
        return entitySrcId;
    }

    /**
     * Sets the value of the entitySrcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySrcIdType }
     *     
     */
    public void setEntitySrcId(EntitySrcIdType value) {
        this.entitySrcId = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeType }
     *     
     */
    public EntityTypeType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeType }
     *     
     */
    public void setEntityType(EntityTypeType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entityConfdScore property.
     * 
     * @return
     *     possible object is
     *     {@link EntityConfdScoreType }
     *     
     */
    public EntityConfdScoreType getEntityConfdScore() {
        return entityConfdScore;
    }

    /**
     * Sets the value of the entityConfdScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityConfdScoreType }
     *     
     */
    public void setEntityConfdScore(EntityConfdScoreType value) {
        this.entityConfdScore = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link FirstNameType }
     *     
     */
    public FirstNameType getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstNameType }
     *     
     */
    public void setFirstName(FirstNameType value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link LastNameType }
     *     
     */
    public LastNameType getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastNameType }
     *     
     */
    public void setLastName(LastNameType value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the rmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getRmk() {
        return rmk;
    }

    /**
     * Sets the value of the rmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setRmk(RmkType value) {
        this.rmk = value;
    }

    /**
     * Gets the value of the aliasExactMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityExactMatchTypeType }
     *     
     */
    public EntityExactMatchTypeType getAliasExactMatchType() {
        return aliasExactMatchType;
    }

    /**
     * Sets the value of the aliasExactMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExactMatchTypeType }
     *     
     */
    public void setAliasExactMatchType(EntityExactMatchTypeType value) {
        this.aliasExactMatchType = value;
    }

    /**
     * Gets the value of the addrExactMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityExactMatchTypeType }
     *     
     */
    public EntityExactMatchTypeType getAddrExactMatchType() {
        return addrExactMatchType;
    }

    /**
     * Sets the value of the addrExactMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExactMatchTypeType }
     *     
     */
    public void setAddrExactMatchType(EntityExactMatchTypeType value) {
        this.addrExactMatchType = value;
    }

    /**
     * Gets the value of the idExactMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityExactMatchTypeType }
     *     
     */
    public EntityExactMatchTypeType getIdExactMatchType() {
        return idExactMatchType;
    }

    /**
     * Sets the value of the idExactMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExactMatchTypeType }
     *     
     */
    public void setIdExactMatchType(EntityExactMatchTypeType value) {
        this.idExactMatchType = value;
    }

    /**
     * Gets the value of the entityNatPgmArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNatPgmArrayAType }
     *     
     */
    public EntityNatPgmArrayAType getEntityNatPgmArray() {
        return entityNatPgmArray;
    }

    /**
     * Sets the value of the entityNatPgmArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNatPgmArrayAType }
     *     
     */
    public void setEntityNatPgmArray(EntityNatPgmArrayAType value) {
        this.entityNatPgmArray = value;
    }

    /**
     * Gets the value of the entityAliasArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAliasArrayAType }
     *     
     */
    public EntityAliasArrayAType getEntityAliasArray() {
        return entityAliasArray;
    }

    /**
     * Sets the value of the entityAliasArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAliasArrayAType }
     *     
     */
    public void setEntityAliasArray(EntityAliasArrayAType value) {
        this.entityAliasArray = value;
    }

    /**
     * Gets the value of the entityAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAddrArrayAType }
     *     
     */
    public EntityAddrArrayAType getEntityAddrArray() {
        return entityAddrArray;
    }

    /**
     * Sets the value of the entityAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAddrArrayAType }
     *     
     */
    public void setEntityAddrArray(EntityAddrArrayAType value) {
        this.entityAddrArray = value;
    }

    /**
     * Gets the value of the entityIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityIdArrayAType }
     *     
     */
    public EntityIdArrayAType getEntityIdArray() {
        return entityIdArray;
    }

    /**
     * Sets the value of the entityIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityIdArrayAType }
     *     
     */
    public void setEntityIdArray(EntityIdArrayAType value) {
        this.entityIdArray = value;
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
