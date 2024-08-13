
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
 * <p>Java class for PmtHubCrXferAddRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubCrXferAddRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="XferAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type"/&gt;
 *         &lt;element name="CrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrUsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrXferFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImmedInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ImmedInfoRec_CType"/&gt;
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
@XmlType(name = "PmtHubCrXferAddRq_MType", propOrder = {
    "msgRqHdr",
    "xferAmt",
    "crAcctId",
    "crUsrToken",
    "pmtRqId",
    "crXferFinInstId",
    "immedInfoRec",
    "ver1",
    "any"
})
public class PmtHubCrXferAddRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElement(name = "XferAmt", required = true)
    protected AmtType xferAmt;
    @XmlElementRef(name = "CrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctIdType> crAcctId;
    @XmlElementRef(name = "CrUsrToken", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UsrTokenType> crUsrToken;
    @XmlElementRef(name = "PmtRqId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtIdType> pmtRqId;
    @XmlElementRef(name = "CrXferFinInstId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InstRtIdType> crXferFinInstId;
    @XmlElement(name = "ImmedInfoRec", required = true)
    protected ImmedInfoRecCType immedInfoRec;
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
     * Gets the value of the xferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getXferAmt() {
        return xferAmt;
    }

    /**
     * Sets the value of the xferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setXferAmt(AmtType value) {
        this.xferAmt = value;
    }

    /**
     * Gets the value of the crAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public JAXBElement<AcctIdType> getCrAcctId() {
        return crAcctId;
    }

    /**
     * Sets the value of the crAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     *     
     */
    public void setCrAcctId(JAXBElement<AcctIdType> value) {
        this.crAcctId = value;
    }

    /**
     * Gets the value of the crUsrToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsrTokenType }{@code >}
     *     
     */
    public JAXBElement<UsrTokenType> getCrUsrToken() {
        return crUsrToken;
    }

    /**
     * Sets the value of the crUsrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsrTokenType }{@code >}
     *     
     */
    public void setCrUsrToken(JAXBElement<UsrTokenType> value) {
        this.crUsrToken = value;
    }

    /**
     * Gets the value of the pmtRqId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}
     *     
     */
    public JAXBElement<PmtIdType> getPmtRqId() {
        return pmtRqId;
    }

    /**
     * Sets the value of the pmtRqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}
     *     
     */
    public void setPmtRqId(JAXBElement<PmtIdType> value) {
        this.pmtRqId = value;
    }

    /**
     * Gets the value of the crXferFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}
     *     
     */
    public JAXBElement<InstRtIdType> getCrXferFinInstId() {
        return crXferFinInstId;
    }

    /**
     * Sets the value of the crXferFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}
     *     
     */
    public void setCrXferFinInstId(JAXBElement<InstRtIdType> value) {
        this.crXferFinInstId = value;
    }

    /**
     * Gets the value of the immedInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link ImmedInfoRecCType }
     *     
     */
    public ImmedInfoRecCType getImmedInfoRec() {
        return immedInfoRec;
    }

    /**
     * Sets the value of the immedInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmedInfoRecCType }
     *     
     */
    public void setImmedInfoRec(ImmedInfoRecCType value) {
        this.immedInfoRec = value;
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
