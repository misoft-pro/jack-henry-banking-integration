
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
 * <p>Java class for AcctExcTrnSrchRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctExcTrnSrchRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRsHdr_CType"/&gt;
 *         &lt;element name="InAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumStart" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNumStart_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumEnd" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNumEnd_Type" minOccurs="0"/&gt;
 *         &lt;element name="StartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnResolveOnly" type="{http://jackhenry.com/jxchange/TPG/2008}UnResolveOnly_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcTrnSrchRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}ExcTrnSrchRecArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctExcTrnSrchRs_MType", propOrder = {
    "srchMsgRsHdr",
    "inAcctId",
    "chkNumStart",
    "chkNumEnd",
    "startDt",
    "endDt",
    "lowAmt",
    "highAmt",
    "unResolveOnly",
    "excRsnCode",
    "excTrnSrchRecArray",
    "custom",
    "ver1",
    "any"
})
public class AcctExcTrnSrchRsMType {

    @XmlElement(name = "SrchMsgRsHdr", required = true)
    protected SrchMsgRsHdrCType srchMsgRsHdr;
    @XmlElementRef(name = "InAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> inAcctId;
    @XmlElementRef(name = "ChkNumStart", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkNumStartType> chkNumStart;
    @XmlElementRef(name = "ChkNumEnd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkNumEndType> chkNumEnd;
    @XmlElementRef(name = "StartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDtType> startDt;
    @XmlElementRef(name = "EndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndDtType> endDt;
    @XmlElementRef(name = "LowAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LowAmtType> lowAmt;
    @XmlElementRef(name = "HighAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HighAmtType> highAmt;
    @XmlElementRef(name = "UnResolveOnly", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnResolveOnlyType> unResolveOnly;
    @XmlElementRef(name = "ExcRsnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcRsnCodeType> excRsnCode;
    @XmlElementRef(name = "ExcTrnSrchRecArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ExcTrnSrchRecArrayAType> excTrnSrchRecArray;
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
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public SrchMsgRsHdrCType getSrchMsgRsHdr() {
        return srchMsgRsHdr;
    }

    /**
     * Sets the value of the srchMsgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRsHdrCType }
     *     
     */
    public void setSrchMsgRsHdr(SrchMsgRsHdrCType value) {
        this.srchMsgRsHdr = value;
    }

    /**
     * Gets the value of the inAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getInAcctId() {
        return inAcctId;
    }

    /**
     * Sets the value of the inAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setInAcctId(JAXBElement<AccountIdCType> value) {
        this.inAcctId = value;
    }

    /**
     * Gets the value of the chkNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkNumStartType }{@code >}
     *     
     */
    public JAXBElement<ChkNumStartType> getChkNumStart() {
        return chkNumStart;
    }

    /**
     * Sets the value of the chkNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkNumStartType }{@code >}
     *     
     */
    public void setChkNumStart(JAXBElement<ChkNumStartType> value) {
        this.chkNumStart = value;
    }

    /**
     * Gets the value of the chkNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkNumEndType }{@code >}
     *     
     */
    public JAXBElement<ChkNumEndType> getChkNumEnd() {
        return chkNumEnd;
    }

    /**
     * Sets the value of the chkNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkNumEndType }{@code >}
     *     
     */
    public void setChkNumEnd(JAXBElement<ChkNumEndType> value) {
        this.chkNumEnd = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public JAXBElement<StartDtType> getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public void setStartDt(JAXBElement<StartDtType> value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public JAXBElement<EndDtType> getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public void setEndDt(JAXBElement<EndDtType> value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the lowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}
     *     
     */
    public JAXBElement<LowAmtType> getLowAmt() {
        return lowAmt;
    }

    /**
     * Sets the value of the lowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}
     *     
     */
    public void setLowAmt(JAXBElement<LowAmtType> value) {
        this.lowAmt = value;
    }

    /**
     * Gets the value of the highAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}
     *     
     */
    public JAXBElement<HighAmtType> getHighAmt() {
        return highAmt;
    }

    /**
     * Sets the value of the highAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}
     *     
     */
    public void setHighAmt(JAXBElement<HighAmtType> value) {
        this.highAmt = value;
    }

    /**
     * Gets the value of the unResolveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnResolveOnlyType }{@code >}
     *     
     */
    public JAXBElement<UnResolveOnlyType> getUnResolveOnly() {
        return unResolveOnly;
    }

    /**
     * Sets the value of the unResolveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnResolveOnlyType }{@code >}
     *     
     */
    public void setUnResolveOnly(JAXBElement<UnResolveOnlyType> value) {
        this.unResolveOnly = value;
    }

    /**
     * Gets the value of the excRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcRsnCodeType }{@code >}
     *     
     */
    public JAXBElement<ExcRsnCodeType> getExcRsnCode() {
        return excRsnCode;
    }

    /**
     * Sets the value of the excRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcRsnCodeType }{@code >}
     *     
     */
    public void setExcRsnCode(JAXBElement<ExcRsnCodeType> value) {
        this.excRsnCode = value;
    }

    /**
     * Gets the value of the excTrnSrchRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcTrnSrchRecArrayAType }{@code >}
     *     
     */
    public JAXBElement<ExcTrnSrchRecArrayAType> getExcTrnSrchRecArray() {
        return excTrnSrchRecArray;
    }

    /**
     * Sets the value of the excTrnSrchRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcTrnSrchRecArrayAType }{@code >}
     *     
     */
    public void setExcTrnSrchRecArray(JAXBElement<ExcTrnSrchRecArrayAType> value) {
        this.excTrnSrchRecArray = value;
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
