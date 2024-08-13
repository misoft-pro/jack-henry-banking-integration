
package pro.misoft.jackhenryintegration.generated.creditcard;

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
 * <p>Java class for CrCardTrnAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardTrnAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="ErrOvrRdInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRdInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CrCardAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="CrCardTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardTrnType_Type"/&gt;
 *         &lt;element name="CrCardPmtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardPmtInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="CrCardAdvInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardAdvInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardTrnAddRq_MType", propOrder = {
    "msgRqHdr",
    "errOvrRdInfoArray",
    "crCardAcctId",
    "crCardTrnType",
    "crCardPmtInfoRec",
    "crCardAdvInfoRec",
    "custom",
    "ver1",
    "any"
})
public class CrCardTrnAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "ErrOvrRdInfoArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrOvrRdInfoArrayAType> errOvrRdInfoArray;
    @XmlElement(name = "CrCardAcctId", required = true)
    protected AcctIdType crCardAcctId;
    @XmlElement(name = "CrCardTrnType", required = true)
    protected CrCardTrnTypeType crCardTrnType;
    @XmlElementRef(name = "CrCardPmtInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrCardPmtInfoRecCType> crCardPmtInfoRec;
    @XmlElementRef(name = "CrCardAdvInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrCardAdvInfoRecCType> crCardAdvInfoRec;
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
     * Gets the value of the crCardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getCrCardAcctId() {
        return crCardAcctId;
    }

    /**
     * Sets the value of the crCardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setCrCardAcctId(AcctIdType value) {
        this.crCardAcctId = value;
    }

    /**
     * Gets the value of the crCardTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardTrnTypeType }
     *     
     */
    public CrCardTrnTypeType getCrCardTrnType() {
        return crCardTrnType;
    }

    /**
     * Sets the value of the crCardTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardTrnTypeType }
     *     
     */
    public void setCrCardTrnType(CrCardTrnTypeType value) {
        this.crCardTrnType = value;
    }

    /**
     * Gets the value of the crCardPmtInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrCardPmtInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<CrCardPmtInfoRecCType> getCrCardPmtInfoRec() {
        return crCardPmtInfoRec;
    }

    /**
     * Sets the value of the crCardPmtInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrCardPmtInfoRecCType }{@code >}
     *     
     */
    public void setCrCardPmtInfoRec(JAXBElement<CrCardPmtInfoRecCType> value) {
        this.crCardPmtInfoRec = value;
    }

    /**
     * Gets the value of the crCardAdvInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrCardAdvInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<CrCardAdvInfoRecCType> getCrCardAdvInfoRec() {
        return crCardAdvInfoRec;
    }

    /**
     * Sets the value of the crCardAdvInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrCardAdvInfoRecCType }{@code >}
     *     
     */
    public void setCrCardAdvInfoRec(JAXBElement<CrCardAdvInfoRecCType> value) {
        this.crCardAdvInfoRec = value;
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
     * {@link Element }
     * {@link Object }
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
