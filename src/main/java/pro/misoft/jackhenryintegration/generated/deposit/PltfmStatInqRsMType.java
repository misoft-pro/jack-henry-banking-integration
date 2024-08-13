
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
 * <p>Java class for PltfmStatInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmStatInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="PltfmId" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmStat" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PltfmAppTaskCatArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppTaskCatArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmStatInqRs_MType", propOrder = {
    "msgRsHdr",
    "pltfmId",
    "pltfmStat",
    "pltfmStatDesc",
    "accountId",
    "custom",
    "ver1",
    "pltfmAppTaskCatArray",
    "ver2",
    "any"
})
public class PltfmStatInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "PltfmId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmIdType> pltfmId;
    @XmlElementRef(name = "PltfmStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmStatType> pltfmStat;
    @XmlElementRef(name = "PltfmStatDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmStatDescType> pltfmStatDesc;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "PltfmAppTaskCatArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmAppTaskCatArrayAType> pltfmAppTaskCatArray;
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
     * Gets the value of the pltfmStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmStatType }{@code >}
     *     
     */
    public JAXBElement<PltfmStatType> getPltfmStat() {
        return pltfmStat;
    }

    /**
     * Sets the value of the pltfmStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmStatType }{@code >}
     *     
     */
    public void setPltfmStat(JAXBElement<PltfmStatType> value) {
        this.pltfmStat = value;
    }

    /**
     * Gets the value of the pltfmStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmStatDescType }{@code >}
     *     
     */
    public JAXBElement<PltfmStatDescType> getPltfmStatDesc() {
        return pltfmStatDesc;
    }

    /**
     * Sets the value of the pltfmStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmStatDescType }{@code >}
     *     
     */
    public void setPltfmStatDesc(JAXBElement<PltfmStatDescType> value) {
        this.pltfmStatDesc = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
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
     * Gets the value of the pltfmAppTaskCatArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmAppTaskCatArrayAType }{@code >}
     *     
     */
    public JAXBElement<PltfmAppTaskCatArrayAType> getPltfmAppTaskCatArray() {
        return pltfmAppTaskCatArray;
    }

    /**
     * Sets the value of the pltfmAppTaskCatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmAppTaskCatArrayAType }{@code >}
     *     
     */
    public void setPltfmAppTaskCatArray(JAXBElement<PltfmAppTaskCatArrayAType> value) {
        this.pltfmAppTaskCatArray = value;
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
