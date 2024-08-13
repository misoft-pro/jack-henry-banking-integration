
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
 * <p>Java class for CrCardAcctInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardAcctInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="CrCardAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="x_CrCardAcctSumRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_CrCardAcctSumRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_CrCardAcctInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_CrCardAcctInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_CrCardFraudInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}x_CrCardFraudInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_IdVerify" type="{http://jackhenry.com/jxchange/TPG/2008}x_IdVerify_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardAcctInqRs_MType", propOrder = {
    "msgRsHdr",
    "crCardAcctId",
    "xCrCardAcctSumRec",
    "xCrCardAcctInfoRec",
    "xCrCardFraudInfoRec",
    "xIdVerify",
    "custom",
    "ver1",
    "any"
})
public class CrCardAcctInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "CrCardAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctIdType> crCardAcctId;
    @XmlElementRef(name = "x_CrCardAcctSumRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XCrCardAcctSumRecCType> xCrCardAcctSumRec;
    @XmlElementRef(name = "x_CrCardAcctInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XCrCardAcctInfoRecCType> xCrCardAcctInfoRec;
    @XmlElementRef(name = "x_CrCardFraudInfoRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XCrCardFraudInfoRecCType> xCrCardFraudInfoRec;
    @XmlElementRef(name = "x_IdVerify", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XIdVerifyCType> xIdVerify;
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
     * Gets the value of the crCardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public JAXBElement<AcctIdType> getCrCardAcctId() {
        return crCardAcctId;
    }

    /**
     * Sets the value of the crCardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public void setCrCardAcctId(JAXBElement<AcctIdType> value) {
        this.crCardAcctId = value;
    }

    /**
     * Gets the value of the xCrCardAcctSumRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XCrCardAcctSumRecCType }{@code >}
     *     
     */
    public JAXBElement<XCrCardAcctSumRecCType> getXCrCardAcctSumRec() {
        return xCrCardAcctSumRec;
    }

    /**
     * Sets the value of the xCrCardAcctSumRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XCrCardAcctSumRecCType }{@code >}
     *     
     */
    public void setXCrCardAcctSumRec(JAXBElement<XCrCardAcctSumRecCType> value) {
        this.xCrCardAcctSumRec = value;
    }

    /**
     * Gets the value of the xCrCardAcctInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XCrCardAcctInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XCrCardAcctInfoRecCType> getXCrCardAcctInfoRec() {
        return xCrCardAcctInfoRec;
    }

    /**
     * Sets the value of the xCrCardAcctInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XCrCardAcctInfoRecCType }{@code >}
     *     
     */
    public void setXCrCardAcctInfoRec(JAXBElement<XCrCardAcctInfoRecCType> value) {
        this.xCrCardAcctInfoRec = value;
    }

    /**
     * Gets the value of the xCrCardFraudInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XCrCardFraudInfoRecCType }{@code >}
     *     
     */
    public JAXBElement<XCrCardFraudInfoRecCType> getXCrCardFraudInfoRec() {
        return xCrCardFraudInfoRec;
    }

    /**
     * Sets the value of the xCrCardFraudInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XCrCardFraudInfoRecCType }{@code >}
     *     
     */
    public void setXCrCardFraudInfoRec(JAXBElement<XCrCardFraudInfoRecCType> value) {
        this.xCrCardFraudInfoRec = value;
    }

    /**
     * Gets the value of the xIdVerify property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XIdVerifyCType }{@code >}
     *     
     */
    public JAXBElement<XIdVerifyCType> getXIdVerify() {
        return xIdVerify;
    }

    /**
     * Sets the value of the xIdVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XIdVerifyCType }{@code >}
     *     
     */
    public void setXIdVerify(JAXBElement<XIdVerifyCType> value) {
        this.xIdVerify = value;
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
