
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
 * <p>Java class for EntityMatchBatchInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchBatchInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="EntityBatchSrcType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityBatchSrcType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityNameArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityNameArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityListCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SelArray" type="{http://jackhenry.com/jxchange/TPG/2008}SelArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityConfdScore" type="{http://jackhenry.com/jxchange/TPG/2008}EntityConfdScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDtTolr" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDtTolr_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityBatchRefId" type="{http://jackhenry.com/jxchange/TPG/2008}EntityBatchRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="RsStat" type="{http://jackhenry.com/jxchange/TPG/2008}RsStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EntityBatchSrcArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityBatchSrcArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "EntityMatchBatchInqRs_MType", propOrder = {
    "msgRsHdr",
    "entityBatchSrcType",
    "entityNameArray",
    "entityListCodeArray",
    "selArray",
    "entityConfdScore",
    "birthDtTolr",
    "entityBatchRefId",
    "rsStat",
    "custom",
    "ver1",
    "entityBatchSrcArray",
    "ver2",
    "any"
})
public class EntityMatchBatchInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "EntityBatchSrcType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityBatchSrcTypeType> entityBatchSrcType;
    @XmlElementRef(name = "EntityNameArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityNameArrayAType> entityNameArray;
    @XmlElementRef(name = "EntityListCodeArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityListCodeArrayAType> entityListCodeArray;
    @XmlElementRef(name = "SelArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SelArrayAType> selArray;
    @XmlElementRef(name = "EntityConfdScore", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityConfdScoreType> entityConfdScore;
    @XmlElementRef(name = "BirthDtTolr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BirthDtTolrType> birthDtTolr;
    @XmlElementRef(name = "EntityBatchRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityBatchRefIdType> entityBatchRefId;
    @XmlElementRef(name = "RsStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RsStatType> rsStat;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "EntityBatchSrcArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityBatchSrcArrayAType> entityBatchSrcArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the entityBatchSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchSrcTypeType }{@code >}
     *     
     */
    public JAXBElement<EntityBatchSrcTypeType> getEntityBatchSrcType() {
        return entityBatchSrcType;
    }

    /**
     * Sets the value of the entityBatchSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchSrcTypeType }{@code >}
     *     
     */
    public void setEntityBatchSrcType(JAXBElement<EntityBatchSrcTypeType> value) {
        this.entityBatchSrcType = value;
    }

    /**
     * Gets the value of the entityNameArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityNameArrayAType }{@code >}
     *     
     */
    public JAXBElement<EntityNameArrayAType> getEntityNameArray() {
        return entityNameArray;
    }

    /**
     * Sets the value of the entityNameArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityNameArrayAType }{@code >}
     *     
     */
    public void setEntityNameArray(JAXBElement<EntityNameArrayAType> value) {
        this.entityNameArray = value;
    }

    /**
     * Gets the value of the entityListCodeArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityListCodeArrayAType }{@code >}
     *     
     */
    public JAXBElement<EntityListCodeArrayAType> getEntityListCodeArray() {
        return entityListCodeArray;
    }

    /**
     * Sets the value of the entityListCodeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityListCodeArrayAType }{@code >}
     *     
     */
    public void setEntityListCodeArray(JAXBElement<EntityListCodeArrayAType> value) {
        this.entityListCodeArray = value;
    }

    /**
     * Gets the value of the selArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SelArrayAType }{@code >}
     *     
     */
    public JAXBElement<SelArrayAType> getSelArray() {
        return selArray;
    }

    /**
     * Sets the value of the selArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SelArrayAType }{@code >}
     *     
     */
    public void setSelArray(JAXBElement<SelArrayAType> value) {
        this.selArray = value;
    }

    /**
     * Gets the value of the entityConfdScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityConfdScoreType }{@code >}
     *     
     */
    public JAXBElement<EntityConfdScoreType> getEntityConfdScore() {
        return entityConfdScore;
    }

    /**
     * Sets the value of the entityConfdScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityConfdScoreType }{@code >}
     *     
     */
    public void setEntityConfdScore(JAXBElement<EntityConfdScoreType> value) {
        this.entityConfdScore = value;
    }

    /**
     * Gets the value of the birthDtTolr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BirthDtTolrType }{@code >}
     *     
     */
    public JAXBElement<BirthDtTolrType> getBirthDtTolr() {
        return birthDtTolr;
    }

    /**
     * Sets the value of the birthDtTolr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BirthDtTolrType }{@code >}
     *     
     */
    public void setBirthDtTolr(JAXBElement<BirthDtTolrType> value) {
        this.birthDtTolr = value;
    }

    /**
     * Gets the value of the entityBatchRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchRefIdType }{@code >}
     *     
     */
    public JAXBElement<EntityBatchRefIdType> getEntityBatchRefId() {
        return entityBatchRefId;
    }

    /**
     * Sets the value of the entityBatchRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchRefIdType }{@code >}
     *     
     */
    public void setEntityBatchRefId(JAXBElement<EntityBatchRefIdType> value) {
        this.entityBatchRefId = value;
    }

    /**
     * Gets the value of the rsStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RsStatType }{@code >}
     *     
     */
    public JAXBElement<RsStatType> getRsStat() {
        return rsStat;
    }

    /**
     * Sets the value of the rsStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RsStatType }{@code >}
     *     
     */
    public void setRsStat(JAXBElement<RsStatType> value) {
        this.rsStat = value;
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
     * Gets the value of the entityBatchSrcArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchSrcArrayAType }{@code >}
     *     
     */
    public JAXBElement<EntityBatchSrcArrayAType> getEntityBatchSrcArray() {
        return entityBatchSrcArray;
    }

    /**
     * Sets the value of the entityBatchSrcArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchSrcArrayAType }{@code >}
     *     
     */
    public void setEntityBatchSrcArray(JAXBElement<EntityBatchSrcArrayAType> value) {
        this.entityBatchSrcArray = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
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
