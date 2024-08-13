
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
 * <p>Java class for EntityMatchBatchRsRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchBatchRsRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityConfdScore" type="{http://jackhenry.com/jxchange/TPG/2008}EntityConfdScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityBatchRefId" type="{http://jackhenry.com/jxchange/TPG/2008}EntityBatchRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityListDt" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityListCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityMatchBatchArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityMatchBatchArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EntityMatchBatchRsRec_CType", propOrder = {
    "entityConfdScore",
    "entityBatchRefId",
    "entityListDt",
    "entityListCodeArray",
    "entityMatchBatchArray",
    "custom",
    "ver1",
    "any"
})
public class EntityMatchBatchRsRecCType {

    @XmlElement(name = "EntityConfdScore")
    protected EntityConfdScoreType entityConfdScore;
    @XmlElement(name = "EntityBatchRefId")
    protected EntityBatchRefIdType entityBatchRefId;
    @XmlElement(name = "EntityListDt")
    protected EntityListDtType entityListDt;
    @XmlElement(name = "EntityListCodeArray")
    protected EntityListCodeArrayAType entityListCodeArray;
    @XmlElement(name = "EntityMatchBatchArray")
    protected EntityMatchBatchArrayAType entityMatchBatchArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the entityBatchRefId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityBatchRefIdType }
     *     
     */
    public EntityBatchRefIdType getEntityBatchRefId() {
        return entityBatchRefId;
    }

    /**
     * Sets the value of the entityBatchRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityBatchRefIdType }
     *     
     */
    public void setEntityBatchRefId(EntityBatchRefIdType value) {
        this.entityBatchRefId = value;
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
     * Gets the value of the entityMatchBatchArray property.
     * 
     * @return
     *     possible object is
     *     {@link EntityMatchBatchArrayAType }
     *     
     */
    public EntityMatchBatchArrayAType getEntityMatchBatchArray() {
        return entityMatchBatchArray;
    }

    /**
     * Sets the value of the entityMatchBatchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityMatchBatchArrayAType }
     *     
     */
    public void setEntityMatchBatchArray(EntityMatchBatchArrayAType value) {
        this.entityMatchBatchArray = value;
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
