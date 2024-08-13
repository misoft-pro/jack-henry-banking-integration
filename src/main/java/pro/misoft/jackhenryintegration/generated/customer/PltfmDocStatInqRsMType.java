
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
 * <p>Java class for PltfmDocStatInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmDocStatInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="PltfmDocStatId" type="{http://jackhenry.com/jxchange/TPG/2008}DocStatId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocRqStat" type="{http://jackhenry.com/jxchange/TPG/2008}DocRqStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocRqStatCmnt" type="{http://jackhenry.com/jxchange/TPG/2008}DocRqStatCmnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OFIFileName" type="{http://jackhenry.com/jxchange/TPG/2008}OFIFileName_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PltfmDocDlvryCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmDocDlvryCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PltfmDocLoc" type="{http://jackhenry.com/jxchange/TPG/2008}DocLoc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmDocStatInqRs_MType", propOrder = {
    "msgRsHdr",
    "pltfmDocStatId",
    "docRqStat",
    "docRqStatCmnt",
    "ofiFileName",
    "custom",
    "ver1",
    "pltfmDocDlvryCode",
    "pltfmDocLoc",
    "ver2",
    "any"
})
public class PltfmDocStatInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "PltfmDocStatId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocStatIdType> pltfmDocStatId;
    @XmlElementRef(name = "DocRqStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocRqStatType> docRqStat;
    @XmlElementRef(name = "DocRqStatCmnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocRqStatCmntType> docRqStatCmnt;
    @XmlElement(name = "OFIFileName")
    protected OFIFileNameType ofiFileName;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PltfmDocDlvryCode")
    protected PltfmDocDlvryCodeType pltfmDocDlvryCode;
    @XmlElement(name = "PltfmDocLoc")
    protected DocLocType pltfmDocLoc;
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
     * Gets the value of the docRqStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocRqStatType }{@code >}
     *     
     */
    public JAXBElement<DocRqStatType> getDocRqStat() {
        return docRqStat;
    }

    /**
     * Sets the value of the docRqStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocRqStatType }{@code >}
     *     
     */
    public void setDocRqStat(JAXBElement<DocRqStatType> value) {
        this.docRqStat = value;
    }

    /**
     * Gets the value of the docRqStatCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocRqStatCmntType }{@code >}
     *     
     */
    public JAXBElement<DocRqStatCmntType> getDocRqStatCmnt() {
        return docRqStatCmnt;
    }

    /**
     * Sets the value of the docRqStatCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocRqStatCmntType }{@code >}
     *     
     */
    public void setDocRqStatCmnt(JAXBElement<DocRqStatCmntType> value) {
        this.docRqStatCmnt = value;
    }

    /**
     * Gets the value of the ofiFileName property.
     * 
     * @return
     *     possible object is
     *     {@link OFIFileNameType }
     *     
     */
    public OFIFileNameType getOFIFileName() {
        return ofiFileName;
    }

    /**
     * Sets the value of the ofiFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFIFileNameType }
     *     
     */
    public void setOFIFileName(OFIFileNameType value) {
        this.ofiFileName = value;
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
