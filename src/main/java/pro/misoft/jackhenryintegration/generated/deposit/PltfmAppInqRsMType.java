
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for PltfmAppInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="PltfmId" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmDepAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmDepAppAdd_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmTimeDepAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmTimeDepAppAdd_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmLnAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmLnAppAdd_CType" minOccurs="0"/&gt;
 *         &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppInqRs_MType", propOrder = {
    "msgRsHdr",
    "pltfmId",
    "pltfmDepAppAdd",
    "pltfmTimeDepAppAdd",
    "pltfmLnAppAdd",
    "actIntent",
    "actIntentKey",
    "custom",
    "ver1",
    "any"
})
public class PltfmAppInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "PltfmId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmIdType> pltfmId;
    @XmlElementRef(name = "PltfmDepAppAdd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmDepAppAddCType> pltfmDepAppAdd;
    @XmlElementRef(name = "PltfmTimeDepAppAdd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmTimeDepAppAddCType> pltfmTimeDepAppAdd;
    @XmlElementRef(name = "PltfmLnAppAdd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmLnAppAddCType> pltfmLnAppAdd;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
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
     * Gets the value of the pltfmId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmIdType }{@code >}
     *     
     */
    public JAXBElement<PltfmIdType> getPltfmId() {
        return pltfmId;
    }

    /**
     * Sets the value of the pltfmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmIdType }{@code >}
     *     
     */
    public void setPltfmId(JAXBElement<PltfmIdType> value) {
        this.pltfmId = value;
    }

    /**
     * Gets the value of the pltfmDepAppAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmDepAppAddCType }{@code >}
     *     
     */
    public JAXBElement<PltfmDepAppAddCType> getPltfmDepAppAdd() {
        return pltfmDepAppAdd;
    }

    /**
     * Sets the value of the pltfmDepAppAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmDepAppAddCType }{@code >}
     *     
     */
    public void setPltfmDepAppAdd(JAXBElement<PltfmDepAppAddCType> value) {
        this.pltfmDepAppAdd = value;
    }

    /**
     * Gets the value of the pltfmTimeDepAppAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmTimeDepAppAddCType }{@code >}
     *     
     */
    public JAXBElement<PltfmTimeDepAppAddCType> getPltfmTimeDepAppAdd() {
        return pltfmTimeDepAppAdd;
    }

    /**
     * Sets the value of the pltfmTimeDepAppAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmTimeDepAppAddCType }{@code >}
     *     
     */
    public void setPltfmTimeDepAppAdd(JAXBElement<PltfmTimeDepAppAddCType> value) {
        this.pltfmTimeDepAppAdd = value;
    }

    /**
     * Gets the value of the pltfmLnAppAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmLnAppAddCType }{@code >}
     *     
     */
    public JAXBElement<PltfmLnAppAddCType> getPltfmLnAppAdd() {
        return pltfmLnAppAdd;
    }

    /**
     * Sets the value of the pltfmLnAppAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmLnAppAddCType }{@code >}
     *     
     */
    public void setPltfmLnAppAdd(JAXBElement<PltfmLnAppAddCType> value) {
        this.pltfmLnAppAdd = value;
    }

    /**
     * Gets the value of the actIntent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public JAXBElement<ActIntentType> getActIntent() {
        return actIntent;
    }

    /**
     * Sets the value of the actIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public void setActIntent(JAXBElement<ActIntentType> value) {
        this.actIntent = value;
    }

    /**
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public JAXBElement<ActIntentKeyType> getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public void setActIntentKey(JAXBElement<ActIntentKeyType> value) {
        this.actIntentKey = value;
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
