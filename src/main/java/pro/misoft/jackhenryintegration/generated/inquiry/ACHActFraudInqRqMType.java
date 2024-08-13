
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
 * <p>Java class for ACHActFraudInqRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHActFraudInqRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="FraudRefId" type="{http://jackhenry.com/jxchange/TPG/2008}FraudRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFileRefId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFileRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHNACHAFile" type="{http://jackhenry.com/jxchange/TPG/2008}ACHNACHAFile_Type" minOccurs="0"/&gt;
 *         &lt;element name="OFIFileName" type="{http://jackhenry.com/jxchange/TPG/2008}OFIFileName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFileType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFileType_Type"/&gt;
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
@XmlType(name = "ACHActFraudInqRq_MType", propOrder = {
    "msgRqHdr",
    "fraudRefId",
    "achFileRefId",
    "achnachaFile",
    "ofiFileName",
    "achFileType",
    "custom",
    "ver1",
    "any"
})
public class ACHActFraudInqRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "FraudRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudRefIdType> fraudRefId;
    @XmlElementRef(name = "ACHFileRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHFileRefIdType> achFileRefId;
    @XmlElementRef(name = "ACHNACHAFile", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHNACHAFileType> achnachaFile;
    @XmlElementRef(name = "OFIFileName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OFIFileNameType> ofiFileName;
    @XmlElement(name = "ACHFileType", required = true)
    protected ACHFileTypeType achFileType;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the fraudRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}
     *     
     */
    public JAXBElement<FraudRefIdType> getFraudRefId() {
        return fraudRefId;
    }

    /**
     * Sets the value of the fraudRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}
     *     
     */
    public void setFraudRefId(JAXBElement<FraudRefIdType> value) {
        this.fraudRefId = value;
    }

    /**
     * Gets the value of the achFileRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHFileRefIdType }{@code >}
     *     
     */
    public JAXBElement<ACHFileRefIdType> getACHFileRefId() {
        return achFileRefId;
    }

    /**
     * Sets the value of the achFileRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHFileRefIdType }{@code >}
     *     
     */
    public void setACHFileRefId(JAXBElement<ACHFileRefIdType> value) {
        this.achFileRefId = value;
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
