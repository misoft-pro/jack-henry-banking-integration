
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
 * <p>Java class for PmtHubCrXferModRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubCrXferModRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRqHdr_CType"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubCrXferModRec" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubCrXferModRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="ModRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtHubCrXferModRq_MType", propOrder = {
    "msgRqHdr",
    "trnRcptId",
    "pmtRqId",
    "pmtHubCrXferModRec",
    "modRmkArray",
    "dlt",
    "ver1",
    "any"
})
public class PmtHubCrXferModRqMType {

    @XmlElement(name = "MsgRqHdr", required = true)
    protected MsgRqHdrCType msgRqHdr;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElementRef(name = "PmtRqId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtIdType> pmtRqId;
    @XmlElementRef(name = "PmtHubCrXferModRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtHubCrXferModRecCType> pmtHubCrXferModRec;
    @XmlElementRef(name = "ModRmkArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RmkAType> modRmkArray;
    @XmlElementRef(name = "Dlt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DltType> dlt;
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
     * Gets the value of the pmtHubCrXferModRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtHubCrXferModRecCType }{@code >}
     *     
     */
    public JAXBElement<PmtHubCrXferModRecCType> getPmtHubCrXferModRec() {
        return pmtHubCrXferModRec;
    }

    /**
     * Sets the value of the pmtHubCrXferModRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtHubCrXferModRecCType }{@code >}
     *     
     */
    public void setPmtHubCrXferModRec(JAXBElement<PmtHubCrXferModRecCType> value) {
        this.pmtHubCrXferModRec = value;
    }

    /**
     * Gets the value of the modRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RmkAType }{@code >}
     *     
     */
    public JAXBElement<RmkAType> getModRmkArray() {
        return modRmkArray;
    }

    /**
     * Sets the value of the modRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RmkAType }{@code >}
     *     
     */
    public void setModRmkArray(JAXBElement<RmkAType> value) {
        this.modRmkArray = value;
    }

    /**
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public JAXBElement<DltType> getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public void setDlt(JAXBElement<DltType> value) {
        this.dlt = value;
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
