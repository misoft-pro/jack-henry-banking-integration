
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
 * <p>Java class for EFTCardBlkTrnSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardBlkTrnSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardSufxNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardSufxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTISOBlkId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTISOBlkId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTBlkTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardBlkTrnSrchArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkTrnSrchArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardBlkTrnSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "eftCardNum",
    "eftCardSufxNum",
    "eftBlkTrnCode",
    "eftisoBlkId",
    "eftBlkTrnDesc",
    "eftCardBlkTrnSrchArray",
    "custom",
    "ver1",
    "any"
})
public class EFTCardBlkTrnSrchRsMType {

    @XmlElementRef(name = "SrchMsgRsHdr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrchMsgRsHdrCType> srchMsgRsHdr;
    @XmlElementRef(name = "EFTCardNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardNumType> eftCardNum;
    @XmlElementRef(name = "EFTCardSufxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardSufxNumType> eftCardSufxNum;
    @XmlElementRef(name = "EFTBlkTrnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTBlkTrnCodeType> eftBlkTrnCode;
    @XmlElementRef(name = "EFTISOBlkId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTISOBlkIdType> eftisoBlkId;
    @XmlElementRef(name = "EFTBlkTrnDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTBlkTrnDescType> eftBlkTrnDesc;
    @XmlElementRef(name = "EFTCardBlkTrnSrchArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardBlkTrnSrchArrayAType> eftCardBlkTrnSrchArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SrchMsgRsHdrCType }{@code >}
     *     
     */
    public JAXBElement<SrchMsgRsHdrCType> getSrchMsgRsHdr() {
        return srchMsgRsHdr;
    }

    /**
     * Sets the value of the srchMsgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SrchMsgRsHdrCType }{@code >}
     *     
     */
    public void setSrchMsgRsHdr(JAXBElement<SrchMsgRsHdrCType> value) {
        this.srchMsgRsHdr = value;
    }

    /**
     * Gets the value of the eftCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardNumType }{@code >}
     *     
     */
    public JAXBElement<EFTCardNumType> getEFTCardNum() {
        return eftCardNum;
    }

    /**
     * Sets the value of the eftCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardNumType }{@code >}
     *     
     */
    public void setEFTCardNum(JAXBElement<EFTCardNumType> value) {
        this.eftCardNum = value;
    }

    /**
     * Gets the value of the eftCardSufxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardSufxNumType }{@code >}
     *     
     */
    public JAXBElement<EFTCardSufxNumType> getEFTCardSufxNum() {
        return eftCardSufxNum;
    }

    /**
     * Sets the value of the eftCardSufxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardSufxNumType }{@code >}
     *     
     */
    public void setEFTCardSufxNum(JAXBElement<EFTCardSufxNumType> value) {
        this.eftCardSufxNum = value;
    }

    /**
     * Gets the value of the eftBlkTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTBlkTrnCodeType }{@code >}
     *     
     */
    public JAXBElement<EFTBlkTrnCodeType> getEFTBlkTrnCode() {
        return eftBlkTrnCode;
    }

    /**
     * Sets the value of the eftBlkTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTBlkTrnCodeType }{@code >}
     *     
     */
    public void setEFTBlkTrnCode(JAXBElement<EFTBlkTrnCodeType> value) {
        this.eftBlkTrnCode = value;
    }

    /**
     * Gets the value of the eftisoBlkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTISOBlkIdType }{@code >}
     *     
     */
    public JAXBElement<EFTISOBlkIdType> getEFTISOBlkId() {
        return eftisoBlkId;
    }

    /**
     * Sets the value of the eftisoBlkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTISOBlkIdType }{@code >}
     *     
     */
    public void setEFTISOBlkId(JAXBElement<EFTISOBlkIdType> value) {
        this.eftisoBlkId = value;
    }

    /**
     * Gets the value of the eftBlkTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTBlkTrnDescType }{@code >}
     *     
     */
    public JAXBElement<EFTBlkTrnDescType> getEFTBlkTrnDesc() {
        return eftBlkTrnDesc;
    }

    /**
     * Sets the value of the eftBlkTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTBlkTrnDescType }{@code >}
     *     
     */
    public void setEFTBlkTrnDesc(JAXBElement<EFTBlkTrnDescType> value) {
        this.eftBlkTrnDesc = value;
    }

    /**
     * Gets the value of the eftCardBlkTrnSrchArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardBlkTrnSrchArrayAType }{@code >}
     *     
     */
    public JAXBElement<EFTCardBlkTrnSrchArrayAType> getEFTCardBlkTrnSrchArray() {
        return eftCardBlkTrnSrchArray;
    }

    /**
     * Sets the value of the eftCardBlkTrnSrchArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardBlkTrnSrchArrayAType }{@code >}
     *     
     */
    public void setEFTCardBlkTrnSrchArray(JAXBElement<EFTCardBlkTrnSrchArrayAType> value) {
        this.eftCardBlkTrnSrchArray = value;
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
