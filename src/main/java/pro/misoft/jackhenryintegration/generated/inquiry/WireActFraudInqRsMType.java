
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
 * <p>Java class for WireActFraudInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireActFraudInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}WireAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudRefId" type="{http://jackhenry.com/jxchange/TPG/2008}FraudRefId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSusType" type="{http://jackhenry.com/jxchange/TPG/2008}FraudSusType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSusRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "WireActFraudInqRs_MType", propOrder = {
    "msgRsHdr",
    "trnRcptId",
    "wireAcctId",
    "wireAcctType",
    "fraudRefId",
    "fraudSusType",
    "fraudSusRmkArray",
    "custom",
    "ver1",
    "any"
})
public class WireActFraudInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElementRef(name = "WireAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireAcctIdType> wireAcctId;
    @XmlElementRef(name = "WireAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctTypeType> wireAcctType;
    @XmlElementRef(name = "FraudRefId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudRefIdType> fraudRefId;
    @XmlElementRef(name = "FraudSusType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FraudSusTypeType> fraudSusType;
    @XmlElementRef(name = "FraudSusRmkArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RmkAType> fraudSusRmkArray;
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
     * Gets the value of the wireAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireAcctIdType }{@code >}
     *     
     */
    public JAXBElement<WireAcctIdType> getWireAcctId() {
        return wireAcctId;
    }

    /**
     * Sets the value of the wireAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireAcctIdType }{@code >}
     *     
     */
    public void setWireAcctId(JAXBElement<WireAcctIdType> value) {
        this.wireAcctId = value;
    }

    /**
     * Gets the value of the wireAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public JAXBElement<AcctTypeType> getWireAcctType() {
        return wireAcctType;
    }

    /**
     * Sets the value of the wireAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public void setWireAcctType(JAXBElement<AcctTypeType> value) {
        this.wireAcctType = value;
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
     * Gets the value of the fraudSusType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FraudSusTypeType }{@code >}
     *     
     */
    public JAXBElement<FraudSusTypeType> getFraudSusType() {
        return fraudSusType;
    }

    /**
     * Sets the value of the fraudSusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FraudSusTypeType }{@code >}
     *     
     */
    public void setFraudSusType(JAXBElement<FraudSusTypeType> value) {
        this.fraudSusType = value;
    }

    /**
     * Gets the value of the fraudSusRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RmkAType }{@code >}
     *     
     */
    public JAXBElement<RmkAType> getFraudSusRmkArray() {
        return fraudSusRmkArray;
    }

    /**
     * Sets the value of the fraudSusRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RmkAType }{@code >}
     *     
     */
    public void setFraudSusRmkArray(JAXBElement<RmkAType> value) {
        this.fraudSusRmkArray = value;
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
