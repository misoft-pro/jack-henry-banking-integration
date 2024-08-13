
package pro.misoft.jackhenryintegration.generated.transaction;

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
 * <p>Java class for PmtHubPmtRqAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubPmtRqAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="RqUsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type"/&gt;
 *         &lt;element name="RqUsrTokenType" type="{http://jackhenry.com/jxchange/TPG/2008}UsrTokenType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType"/&gt;
 *         &lt;element name="PmtRqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRqDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqTermDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRqTermDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceId" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PurchOrderId" type="{http://jackhenry.com/jxchange/TPG/2008}PurchOrderId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqArray" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRqArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="OrigPmtRqId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtHubPmtRqAddRq_MType", propOrder = {
    "msgRqHdr",
    "rqUsrToken",
    "rqUsrTokenType",
    "pmtRqName",
    "pmtRqDesc",
    "pmtRqExpDt",
    "pmtRqTermDesc",
    "invoiceId",
    "purchOrderId",
    "pmtRqArray",
    "ver1",
    "origPmtRqId",
    "ver2",
    "any"
})
public class PmtHubPmtRqAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElement(name = "RqUsrToken", required = true)
    protected UsrTokenType rqUsrToken;
    @XmlElementRef(name = "RqUsrTokenType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UsrTokenTypeType> rqUsrTokenType;
    @XmlElement(name = "PmtRqName", required = true)
    protected PersonNameCType pmtRqName;
    @XmlElementRef(name = "PmtRqDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtRqDescType> pmtRqDesc;
    @XmlElementRef(name = "PmtRqExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpDtType> pmtRqExpDt;
    @XmlElementRef(name = "PmtRqTermDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtRqTermDescType> pmtRqTermDesc;
    @XmlElementRef(name = "InvoiceId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InvoiceIdType> invoiceId;
    @XmlElementRef(name = "PurchOrderId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PurchOrderIdType> purchOrderId;
    @XmlElementRef(name = "PmtRqArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtRqArrayAType> pmtRqArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "OrigPmtRqId")
    protected PmtIdType origPmtRqId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
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
     * Gets the value of the rqUsrToken property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenType }
     *     
     */
    public UsrTokenType getRqUsrToken() {
        return rqUsrToken;
    }

    /**
     * Sets the value of the rqUsrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenType }
     *     
     */
    public void setRqUsrToken(UsrTokenType value) {
        this.rqUsrToken = value;
    }

    /**
     * Gets the value of the rqUsrTokenType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsrTokenTypeType }{@code >}
     *     
     */
    public JAXBElement<UsrTokenTypeType> getRqUsrTokenType() {
        return rqUsrTokenType;
    }

    /**
     * Sets the value of the rqUsrTokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsrTokenTypeType }{@code >}
     *     
     */
    public void setRqUsrTokenType(JAXBElement<UsrTokenTypeType> value) {
        this.rqUsrTokenType = value;
    }

    /**
     * Gets the value of the pmtRqName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPmtRqName() {
        return pmtRqName;
    }

    /**
     * Sets the value of the pmtRqName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPmtRqName(PersonNameCType value) {
        this.pmtRqName = value;
    }

    /**
     * Gets the value of the pmtRqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtRqDescType }{@code >}
     *     
     */
    public JAXBElement<PmtRqDescType> getPmtRqDesc() {
        return pmtRqDesc;
    }

    /**
     * Sets the value of the pmtRqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtRqDescType }{@code >}
     *     
     */
    public void setPmtRqDesc(JAXBElement<PmtRqDescType> value) {
        this.pmtRqDesc = value;
    }

    /**
     * Gets the value of the pmtRqExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpDtType }{@code >}
     *     
     */
    public JAXBElement<ExpDtType> getPmtRqExpDt() {
        return pmtRqExpDt;
    }

    /**
     * Sets the value of the pmtRqExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpDtType }{@code >}
     *     
     */
    public void setPmtRqExpDt(JAXBElement<ExpDtType> value) {
        this.pmtRqExpDt = value;
    }

    /**
     * Gets the value of the pmtRqTermDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtRqTermDescType }{@code >}
     *     
     */
    public JAXBElement<PmtRqTermDescType> getPmtRqTermDesc() {
        return pmtRqTermDesc;
    }

    /**
     * Sets the value of the pmtRqTermDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtRqTermDescType }{@code >}
     *     
     */
    public void setPmtRqTermDesc(JAXBElement<PmtRqTermDescType> value) {
        this.pmtRqTermDesc = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvoiceIdType }{@code >}
     *     
     */
    public JAXBElement<InvoiceIdType> getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvoiceIdType }{@code >}
     *     
     */
    public void setInvoiceId(JAXBElement<InvoiceIdType> value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the purchOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PurchOrderIdType }{@code >}
     *     
     */
    public JAXBElement<PurchOrderIdType> getPurchOrderId() {
        return purchOrderId;
    }

    /**
     * Sets the value of the purchOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PurchOrderIdType }{@code >}
     *     
     */
    public void setPurchOrderId(JAXBElement<PurchOrderIdType> value) {
        this.purchOrderId = value;
    }

    /**
     * Gets the value of the pmtRqArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtRqArrayAType }{@code >}
     *     
     */
    public JAXBElement<PmtRqArrayAType> getPmtRqArray() {
        return pmtRqArray;
    }

    /**
     * Sets the value of the pmtRqArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtRqArrayAType }{@code >}
     *     
     */
    public void setPmtRqArray(JAXBElement<PmtRqArrayAType> value) {
        this.pmtRqArray = value;
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
     * Gets the value of the origPmtRqId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIdType }
     *     
     */
    public PmtIdType getOrigPmtRqId() {
        return origPmtRqId;
    }

    /**
     * Sets the value of the origPmtRqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIdType }
     *     
     */
    public void setOrigPmtRqId(PmtIdType value) {
        this.origPmtRqId = value;
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
