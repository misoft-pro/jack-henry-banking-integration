
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
 * <p>Java class for EntityMatchSrchRsRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchSrchRsRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityListCodeRec" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="EntityListDt" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WhiteListType" type="{http://jackhenry.com/jxchange/TPG/2008}WhiteListType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EntityMatchSrchRsRec_CType", propOrder = {
    "entityListCodeRec",
    "entityListDt",
    "whiteListType",
    "entityArray",
    "blkCntryArray",
    "custom",
    "ver1",
    "any"
})
public class EntityMatchSrchRsRecCType {

    @XmlElement(name = "EntityListCodeRec")
    protected EntityListCodeRecCType entityListCodeRec;
    @XmlElement(name = "EntityListDt")
    protected EntityListDtType entityListDt;
    @XmlElement(name = "WhiteListType")
    protected WhiteListTypeType whiteListType;
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
     * Gets the value of the entityListCodeRec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityListCodeRecCType }
     *     
     */
    public EntityListCodeRecCType getEntityListCodeRec() {
        return entityListCodeRec;
    }

    /**
     * Sets the value of the entityListCodeRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityListCodeRecCType }
     *     
     */
    public void setEntityListCodeRec(EntityListCodeRecCType value) {
        this.entityListCodeRec = value;
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
