
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
 * <p>Java class for EntityMatchSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="EntityName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr2" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr2_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Cntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityListCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EntityType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityConfdScore" type="{http://jackhenry.com/jxchange/TPG/2008}EntityConfdScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BirthDtTolr" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDtTolr_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityIdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityMatchListType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityMatchListType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityMatchSrchRsArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityMatchSrchRsArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EntityBatchId" type="{http://jackhenry.com/jxchange/TPG/2008}EntityBatchId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="TrnRef" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRef_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "EntityMatchSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "entityName",
    "streetAddr1",
    "streetAddr2",
    "city",
    "stateCode",
    "postalCode",
    "cntryType",
    "cntry",
    "entityListCodeArray",
    "entityType",
    "entityConfdScore",
    "custId",
    "birthDt",
    "birthDtTolr",
    "entityIdArray",
    "trnRcptId",
    "entityMatchListType",
    "entityMatchSrchRsArray",
    "custom",
    "ver1",
    "entityBatchId",
    "ver2",
    "trnRef",
    "ver3",
    "any"
})
public class EntityMatchSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "EntityName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ComNameType> entityName;
    @XmlElement(name = "StreetAddr1")
    protected StreetAddr1Type streetAddr1;
    @XmlElement(name = "StreetAddr2")
    protected StreetAddr2Type streetAddr2;
    @XmlElementRef(name = "City", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CityType> city;
    @XmlElementRef(name = "StateCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateCodeType> stateCode;
    @XmlElementRef(name = "PostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostalCodeType> postalCode;
    @XmlElementRef(name = "CntryType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntryTypeType> cntryType;
    @XmlElementRef(name = "Cntry", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntryType> cntry;
    @XmlElementRef(name = "EntityListCodeArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityListCodeArrayAType> entityListCodeArray;
    @XmlElementRef(name = "EntityType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityTypeType> entityType;
    @XmlElementRef(name = "EntityConfdScore", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityConfdScoreType> entityConfdScore;
    @XmlElementRef(name = "CustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustIdType> custId;
    @XmlElementRef(name = "BirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BirthDtType> birthDt;
    @XmlElementRef(name = "BirthDtTolr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BirthDtTolrType> birthDtTolr;
    @XmlElementRef(name = "EntityIdArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityIdArrayAType> entityIdArray;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElementRef(name = "EntityMatchListType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityMatchListTypeType> entityMatchListType;
    @XmlElementRef(name = "EntityMatchSrchRsArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityMatchSrchRsArrayAType> entityMatchSrchRsArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "EntityBatchId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityBatchIdType> entityBatchId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "TrnRef", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRefType> trnRef;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
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
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public JAXBElement<ComNameType> getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComNameType }{@code >}
     *     
     */
    public void setEntityName(JAXBElement<ComNameType> value) {
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
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public JAXBElement<CityType> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public void setCity(JAXBElement<CityType> value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateCodeType }{@code >}
     *     
     */
    public JAXBElement<StateCodeType> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateCodeType }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<StateCodeType> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public JAXBElement<PostalCodeType> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<PostalCodeType> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the cntryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public JAXBElement<CntryTypeType> getCntryType() {
        return cntryType;
    }

    /**
     * Sets the value of the cntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public void setCntryType(JAXBElement<CntryTypeType> value) {
        this.cntryType = value;
    }

    /**
     * Gets the value of the cntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntryType }{@code >}
     *     
     */
    public JAXBElement<CntryType> getCntry() {
        return cntry;
    }

    /**
     * Sets the value of the cntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntryType }{@code >}
     *     
     */
    public void setCntry(JAXBElement<CntryType> value) {
        this.cntry = value;
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
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityTypeType }{@code >}
     *     
     */
    public JAXBElement<EntityTypeType> getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityTypeType }{@code >}
     *     
     */
    public void setEntityType(JAXBElement<EntityTypeType> value) {
        this.entityType = value;
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
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public JAXBElement<CustIdType> getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustIdType }{@code >}
     *     
     */
    public void setCustId(JAXBElement<CustIdType> value) {
        this.custId = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public JAXBElement<BirthDtType> getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}
     *     
     */
    public void setBirthDt(JAXBElement<BirthDtType> value) {
        this.birthDt = value;
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
     * Gets the value of the entityIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityIdArrayAType }{@code >}
     *     
     */
    public JAXBElement<EntityIdArrayAType> getEntityIdArray() {
        return entityIdArray;
    }

    /**
     * Sets the value of the entityIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityIdArrayAType }{@code >}
     *     
     */
    public void setEntityIdArray(JAXBElement<EntityIdArrayAType> value) {
        this.entityIdArray = value;
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
     * Gets the value of the entityMatchListType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchListTypeType }{@code >}
     *     
     */
    public JAXBElement<EntityMatchListTypeType> getEntityMatchListType() {
        return entityMatchListType;
    }

    /**
     * Sets the value of the entityMatchListType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchListTypeType }{@code >}
     *     
     */
    public void setEntityMatchListType(JAXBElement<EntityMatchListTypeType> value) {
        this.entityMatchListType = value;
    }

    /**
     * Gets the value of the entityMatchSrchRsArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchSrchRsArrayAType }{@code >}
     *     
     */
    public JAXBElement<EntityMatchSrchRsArrayAType> getEntityMatchSrchRsArray() {
        return entityMatchSrchRsArray;
    }

    /**
     * Sets the value of the entityMatchSrchRsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchSrchRsArrayAType }{@code >}
     *     
     */
    public void setEntityMatchSrchRsArray(JAXBElement<EntityMatchSrchRsArrayAType> value) {
        this.entityMatchSrchRsArray = value;
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
     * Gets the value of the entityBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchIdType }{@code >}
     *     
     */
    public JAXBElement<EntityBatchIdType> getEntityBatchId() {
        return entityBatchId;
    }

    /**
     * Sets the value of the entityBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchIdType }{@code >}
     *     
     */
    public void setEntityBatchId(JAXBElement<EntityBatchIdType> value) {
        this.entityBatchId = value;
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
     * Gets the value of the trnRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnRefType }{@code >}
     *     
     */
    public JAXBElement<TrnRefType> getTrnRef() {
        return trnRef;
    }

    /**
     * Sets the value of the trnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnRefType }{@code >}
     *     
     */
    public void setTrnRef(JAXBElement<TrnRefType> value) {
        this.trnRef = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
