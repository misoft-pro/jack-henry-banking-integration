
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for LnPltfmDocInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPltfmDocInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="PltfmId" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocSetCode" type="{http://jackhenry.com/jxchange/TPG/2008}DocSetCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocId" type="{http://jackhenry.com/jxchange/TPG/2008}DocId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocInstcId" type="{http://jackhenry.com/jxchange/TPG/2008}DocInstcId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmDocDlvryCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmDocDlvryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmDocLoc" type="{http://jackhenry.com/jxchange/TPG/2008}DocLoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmDocStatId" type="{http://jackhenry.com/jxchange/TPG/2008}DocStatId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmDocArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmDocArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LnPltfmDocInqRs_MType", propOrder = {
    "msgRsHdr",
    "pltfmId",
    "trnRcptId",
    "docSetCode",
    "docId",
    "docInstcId",
    "pltfmDocDlvryCode",
    "pltfmDocLoc",
    "pltfmDocStatId",
    "pltfmDocArray",
    "custom",
    "ver1",
    "any"
})
public class LnPltfmDocInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "PltfmId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmIdType> pltfmId;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElementRef(name = "DocSetCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocSetCodeType> docSetCode;
    @XmlElementRef(name = "DocId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocIdType> docId;
    @XmlElementRef(name = "DocInstcId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocInstcIdType> docInstcId;
    @XmlElement(name = "PltfmDocDlvryCode")
    protected PltfmDocDlvryCodeType pltfmDocDlvryCode;
    @XmlElement(name = "PltfmDocLoc")
    protected DocLocType pltfmDocLoc;
    @XmlElementRef(name = "PltfmDocStatId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocStatIdType> pltfmDocStatId;
    @XmlElementRef(name = "PltfmDocArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmDocArrayAType> pltfmDocArray;
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
     * Gets the value of the docSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocSetCodeType }{@code >}
     *     
     */
    public JAXBElement<DocSetCodeType> getDocSetCode() {
        return docSetCode;
    }

    /**
     * Sets the value of the docSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocSetCodeType }{@code >}
     *     
     */
    public void setDocSetCode(JAXBElement<DocSetCodeType> value) {
        this.docSetCode = value;
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
     * Gets the value of the docInstcId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocInstcIdType }{@code >}
     *     
     */
    public JAXBElement<DocInstcIdType> getDocInstcId() {
        return docInstcId;
    }

    /**
     * Sets the value of the docInstcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocInstcIdType }{@code >}
     *     
     */
    public void setDocInstcId(JAXBElement<DocInstcIdType> value) {
        this.docInstcId = value;
    }

    /**
     * Gets the value of the pltfmDocDlvryCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmDocDlvryCodeType }
     *     
     */
    public PltfmDocDlvryCodeType getPltfmDocDlvryCode() {
        return pltfmDocDlvryCode;
    }

    /**
     * Sets the value of the pltfmDocDlvryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmDocDlvryCodeType }
     *     
     */
    public void setPltfmDocDlvryCode(PltfmDocDlvryCodeType value) {
        this.pltfmDocDlvryCode = value;
    }

    /**
     * Gets the value of the pltfmDocLoc property.
     * 
     * @return
     *     possible object is
     *     {@link DocLocType }
     *     
     */
    public DocLocType getPltfmDocLoc() {
        return pltfmDocLoc;
    }

    /**
     * Sets the value of the pltfmDocLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocLocType }
     *     
     */
    public void setPltfmDocLoc(DocLocType value) {
        this.pltfmDocLoc = value;
    }

    /**
     * Gets the value of the pltfmDocStatId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocStatIdType }{@code >}
     *     
     */
    public JAXBElement<DocStatIdType> getPltfmDocStatId() {
        return pltfmDocStatId;
    }

    /**
     * Sets the value of the pltfmDocStatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocStatIdType }{@code >}
     *     
     */
    public void setPltfmDocStatId(JAXBElement<DocStatIdType> value) {
        this.pltfmDocStatId = value;
    }

    /**
     * Gets the value of the pltfmDocArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmDocArrayAType }{@code >}
     *     
     */
    public JAXBElement<PltfmDocArrayAType> getPltfmDocArray() {
        return pltfmDocArray;
    }

    /**
     * Sets the value of the pltfmDocArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmDocArrayAType }{@code >}
     *     
     */
    public void setPltfmDocArray(JAXBElement<PltfmDocArrayAType> value) {
        this.pltfmDocArray = value;
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
