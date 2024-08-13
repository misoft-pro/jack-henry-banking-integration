
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
 * <p>Java class for CrCardStmtGenRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardStmtGenRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="CrCardAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocId" type="{http://jackhenry.com/jxchange/TPG/2008}DocId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtId" type="{http://jackhenry.com/jxchange/TPG/2008}StmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtLoc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtLoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtImg" type="{http://jackhenry.com/jxchange/TPG/2008}DocImg_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardStmtGenRs_MType", propOrder = {
    "msgRsHdr",
    "crCardAcctId",
    "docId",
    "stmtId",
    "stmtDt",
    "stmtLoc",
    "stmtImg",
    "custom",
    "ver1",
    "any"
})
public class CrCardStmtGenRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "CrCardAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctIdType> crCardAcctId;
    @XmlElementRef(name = "DocId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocIdType> docId;
    @XmlElementRef(name = "StmtId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtIdType> stmtId;
    @XmlElementRef(name = "StmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtDtType> stmtDt;
    @XmlElementRef(name = "StmtLoc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtLocType> stmtLoc;
    @XmlElementRef(name = "StmtImg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocImgType> stmtImg;
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
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocIdType }{@code >}
     *     
     */
    public JAXBElement<DocIdType> getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocIdType }{@code >}
     *     
     */
    public void setDocId(JAXBElement<DocIdType> value) {
        this.docId = value;
    }

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtIdType }{@code >}
     *     
     */
    public JAXBElement<StmtIdType> getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtIdType }{@code >}
     *     
     */
    public void setStmtId(JAXBElement<StmtIdType> value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtDtType }{@code >}
     *     
     */
    public JAXBElement<StmtDtType> getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtDtType }{@code >}
     *     
     */
    public void setStmtDt(JAXBElement<StmtDtType> value) {
        this.stmtDt = value;
    }

    /**
     * Gets the value of the stmtLoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtLocType }{@code >}
     *     
     */
    public JAXBElement<StmtLocType> getStmtLoc() {
        return stmtLoc;
    }

    /**
     * Sets the value of the stmtLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtLocType }{@code >}
     *     
     */
    public void setStmtLoc(JAXBElement<StmtLocType> value) {
        this.stmtLoc = value;
    }

    /**
     * Gets the value of the stmtImg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocImgType }{@code >}
     *     
     */
    public JAXBElement<DocImgType> getStmtImg() {
        return stmtImg;
    }

    /**
     * Sets the value of the stmtImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocImgType }{@code >}
     *     
     */
    public void setStmtImg(JAXBElement<DocImgType> value) {
        this.stmtImg = value;
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
