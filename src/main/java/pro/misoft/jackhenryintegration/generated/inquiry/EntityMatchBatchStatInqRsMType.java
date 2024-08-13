
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
 * <p>Java class for EntityMatchBatchStatInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMatchBatchStatInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="EntityBatchStat" type="{http://jackhenry.com/jxchange/TPG/2008}EntityBatchStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="EntityMatchBatchRsRec" type="{http://jackhenry.com/jxchange/TPG/2008}EntityMatchBatchRsRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="RsStat" type="{http://jackhenry.com/jxchange/TPG/2008}RsStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="OFIFileName" type="{http://jackhenry.com/jxchange/TPG/2008}OFIFileName_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EntityMatchBatchStatInqRs_MType", propOrder = {
    "msgRsHdr",
    "entityBatchStat",
    "entityMatchBatchRsRec",
    "rsStat",
    "custom",
    "ver1",
    "ofiFileName",
    "ver2",
    "any"
})
public class EntityMatchBatchStatInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "EntityBatchStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityBatchStatType> entityBatchStat;
    @XmlElementRef(name = "EntityMatchBatchRsRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityMatchBatchRsRecCType> entityMatchBatchRsRec;
    @XmlElementRef(name = "RsStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RsStatType> rsStat;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "OFIFileName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OFIFileNameType> ofiFileName;
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
     * Gets the value of the entityBatchStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchStatType }{@code >}
     *     
     */
    public JAXBElement<EntityBatchStatType> getEntityBatchStat() {
        return entityBatchStat;
    }

    /**
     * Sets the value of the entityBatchStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityBatchStatType }{@code >}
     *     
     */
    public void setEntityBatchStat(JAXBElement<EntityBatchStatType> value) {
        this.entityBatchStat = value;
    }

    /**
     * Gets the value of the entityMatchBatchRsRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchBatchRsRecCType }{@code >}
     *     
     */
    public JAXBElement<EntityMatchBatchRsRecCType> getEntityMatchBatchRsRec() {
        return entityMatchBatchRsRec;
    }

    /**
     * Sets the value of the entityMatchBatchRsRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityMatchBatchRsRecCType }{@code >}
     *     
     */
    public void setEntityMatchBatchRsRec(JAXBElement<EntityMatchBatchRsRecCType> value) {
        this.entityMatchBatchRsRec = value;
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
