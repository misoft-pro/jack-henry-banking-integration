
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
 * <p>Java class for EntityACHBatchInqRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityACHBatchInqRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ACHNACHAFile" type="{http://jackhenry.com/jxchange/TPG/2008}ACHNACHAFile_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFileType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFileType_Type"/&gt;
 *         &lt;element name="EntityConfdScore" type="{http://jackhenry.com/jxchange/TPG/2008}EntityConfdScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="OFIFileName" type="{http://jackhenry.com/jxchange/TPG/2008}OFIFileName_Type" minOccurs="0"/&gt;
 *           &lt;element name="OFIRsDlvryType" type="{http://jackhenry.com/jxchange/TPG/2008}OFIRsDlvryType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ConsmRefId" type="{http://jackhenry.com/jxchange/TPG/2008}ConsmRefId_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="EntityListCodeArray" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "EntityACHBatchInqRq_MType", propOrder = {
    "msgRqHdr",
    "achnachaFile",
    "achFileType",
    "entityConfdScore",
    "custom",
    "ver1",
    "ofiFileName",
    "ofiRsDlvryType",
    "ver2",
    "consmRefId",
    "ver3",
    "entityListCodeArray",
    "ver4",
    "any"
})
public class EntityACHBatchInqRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ACHNACHAFile", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHNACHAFileType> achnachaFile;
    @XmlElement(name = "ACHFileType", required = true)
    protected ACHFileTypeType achFileType;
    @XmlElement(name = "EntityConfdScore")
    protected EntityConfdScoreType entityConfdScore;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "OFIFileName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OFIFileNameType> ofiFileName;
    @XmlElementRef(name = "OFIRsDlvryType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OFIRsDlvryTypeType> ofiRsDlvryType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "ConsmRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsmRefIdType> consmRefId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElementRef(name = "EntityListCodeArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityListCodeArrayAType> entityListCodeArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public MsgRqHdrCType getMsgRqHdr() {
        return msgRqHdr;
    }

    /**
     * Sets the value of the msgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRqHdrCType }
     *     
     */
    public void setMsgRqHdr(MsgRqHdrCType value) {
        this.msgRqHdr = value;
    }

    /**
     * Gets the value of the achnachaFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHNACHAFileType }{@code >}
     *     
     */
    public JAXBElement<ACHNACHAFileType> getACHNACHAFile() {
        return achnachaFile;
    }

    /**
     * Sets the value of the achnachaFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHNACHAFileType }{@code >}
     *     
     */
    public void setACHNACHAFile(JAXBElement<ACHNACHAFileType> value) {
        this.achnachaFile = value;
    }

    /**
     * Gets the value of the achFileType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHFileTypeType }
     *     
     */
    public ACHFileTypeType getACHFileType() {
        return achFileType;
    }

    /**
     * Sets the value of the achFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHFileTypeType }
     *     
     */
    public void setACHFileType(ACHFileTypeType value) {
        this.achFileType = value;
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
     * Gets the value of the ofiFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OFIFileNameType }{@code >}
     *     
     */
    public JAXBElement<OFIFileNameType> getOFIFileName() {
        return ofiFileName;
    }

    /**
     * Sets the value of the ofiFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OFIFileNameType }{@code >}
     *     
     */
    public void setOFIFileName(JAXBElement<OFIFileNameType> value) {
        this.ofiFileName = value;
    }

    /**
     * Gets the value of the ofiRsDlvryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OFIRsDlvryTypeType }{@code >}
     *     
     */
    public JAXBElement<OFIRsDlvryTypeType> getOFIRsDlvryType() {
        return ofiRsDlvryType;
    }

    /**
     * Sets the value of the ofiRsDlvryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OFIRsDlvryTypeType }{@code >}
     *     
     */
    public void setOFIRsDlvryType(JAXBElement<OFIRsDlvryTypeType> value) {
        this.ofiRsDlvryType = value;
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
     * Gets the value of the consmRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsmRefIdType }{@code >}
     *     
     */
    public JAXBElement<ConsmRefIdType> getConsmRefId() {
        return consmRefId;
    }

    /**
     * Sets the value of the consmRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsmRefIdType }{@code >}
     *     
     */
    public void setConsmRefId(JAXBElement<ConsmRefIdType> value) {
        this.consmRefId = value;
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
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
