
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
 * This message behaves like a choice statement. One of the complex
 *                 elements, PltfmDepAppAdd or PltfmTimeDepAdd should occur based on the type of
 *                 application account being established.
 * 
 * <p>Java class for PltfmAppAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmDepAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmDepAppAdd_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmTimeDepAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmTimeDepAppAdd_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PltfmLnAppAdd" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmLnAppAdd_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PltfmAppActnType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppActnType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppAddRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "pltfmDepAppAdd",
    "pltfmTimeDepAppAdd",
    "custom",
    "ver1",
    "pltfmLnAppAdd",
    "ver2",
    "pltfmAppActnType",
    "ver3",
    "any"
})
public class PltfmAppAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElementRef(name = "PltfmDepAppAdd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmDepAppAddCType> pltfmDepAppAdd;
    @XmlElementRef(name = "PltfmTimeDepAppAdd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmTimeDepAppAddCType> pltfmTimeDepAppAdd;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "PltfmLnAppAdd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmLnAppAddCType> pltfmLnAppAdd;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "PltfmAppActnType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmAppActnTypeType> pltfmAppActnType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
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
     * Gets the value of the errOvrRdInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public JAXBElement<ErrOvrRdInfoArrayAType> getErrOvrRdInfoArray() {
        return errOvrRdInfoArray;
    }

    /**
     * Sets the value of the errOvrRdInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}
     *     
     */
    public void setErrOvrRdInfoArray(JAXBElement<ErrOvrRdInfoArrayAType> value) {
        this.errOvrRdInfoArray = value;
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
     * Gets the value of the pltfmAppActnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmAppActnTypeType }{@code >}
     *     
     */
    public JAXBElement<PltfmAppActnTypeType> getPltfmAppActnType() {
        return pltfmAppActnType;
    }

    /**
     * Sets the value of the pltfmAppActnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmAppActnTypeType }{@code >}
     *     
     */
    public void setPltfmAppActnType(JAXBElement<PltfmAppActnTypeType> value) {
        this.pltfmAppActnType = value;
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
