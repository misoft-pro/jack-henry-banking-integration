
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
 * <p>Java class for PrePmtPenInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrePmtPenInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrePmtPenBillCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenBillCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenBillDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenBillDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenStartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenBillTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenBillTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenRenTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenRenTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CurtPenCode" type="{http://jackhenry.com/jxchange/TPG/2008}CurtPenCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CurtPenDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CurtPenDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CurtPenAffPrtcp" type="{http://jackhenry.com/jxchange/TPG/2008}CurtPenAffPrtcp_Type" minOccurs="0"/&gt;
 *           &lt;element name="RecoupPenAffPrtcp" type="{http://jackhenry.com/jxchange/TPG/2008}RecoupPenAffPrtcp_Type" minOccurs="0"/&gt;
 *           &lt;element name="RecoupPenAffPrtcpPct" type="{http://jackhenry.com/jxchange/TPG/2008}RecoupPenAffPrtcpPct_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrePmtPenRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenRenDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PayoffPrePmtPenStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenStartDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="PayoffPrePmtPenExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenExpDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "PrePmtPenInfoRec_CType", propOrder = {
    "prePmtPenBillCode",
    "prePmtPenBillDesc",
    "prePmtPenStartDt",
    "prePmtPenExpDt",
    "prePmtPenBillTerm",
    "prePmtPenBillTermUnits",
    "prePmtPenRenTerm",
    "prePmtPenRenTermUnits",
    "ver1",
    "curtPenCode",
    "curtPenDesc",
    "curtPenAffPrtcp",
    "recoupPenAffPrtcp",
    "recoupPenAffPrtcpPct",
    "prePmtPenRenDt",
    "ver2",
    "payoffPrePmtPenStartDt",
    "payoffPrePmtPenExpDt",
    "ver3",
    "any"
})
public class PrePmtPenInfoRecCType {

    @XmlElementRef(name = "PrePmtPenBillCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenBillCodeType> prePmtPenBillCode;
    @XmlElementRef(name = "PrePmtPenBillDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenBillDescType> prePmtPenBillDesc;
    @XmlElementRef(name = "PrePmtPenStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenStartDtType> prePmtPenStartDt;
    @XmlElementRef(name = "PrePmtPenExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenExpDtType> prePmtPenExpDt;
    @XmlElementRef(name = "PrePmtPenBillTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> prePmtPenBillTerm;
    @XmlElementRef(name = "PrePmtPenBillTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> prePmtPenBillTermUnits;
    @XmlElementRef(name = "PrePmtPenRenTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> prePmtPenRenTerm;
    @XmlElementRef(name = "PrePmtPenRenTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> prePmtPenRenTermUnits;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CurtPenCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurtPenCodeType> curtPenCode;
    @XmlElementRef(name = "CurtPenDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurtPenDescType> curtPenDesc;
    @XmlElementRef(name = "CurtPenAffPrtcp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurtPenAffPrtcpType> curtPenAffPrtcp;
    @XmlElementRef(name = "RecoupPenAffPrtcp", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecoupPenAffPrtcpType> recoupPenAffPrtcp;
    @XmlElementRef(name = "RecoupPenAffPrtcpPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecoupPenAffPrtcpPctType> recoupPenAffPrtcpPct;
    @XmlElementRef(name = "PrePmtPenRenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrePmtPenRenDtType> prePmtPenRenDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PayoffPrePmtPenStartDt")
    protected PrePmtPenStartDtType payoffPrePmtPenStartDt;
    @XmlElement(name = "PayoffPrePmtPenExpDt")
    protected PrePmtPenExpDtType payoffPrePmtPenExpDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the prePmtPenBillCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenBillCodeType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenBillCodeType> getPrePmtPenBillCode() {
        return prePmtPenBillCode;
    }

    /**
     * Sets the value of the prePmtPenBillCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenBillCodeType }{@code >}
     *     
     */
    public void setPrePmtPenBillCode(JAXBElement<PrePmtPenBillCodeType> value) {
        this.prePmtPenBillCode = value;
    }

    /**
     * Gets the value of the prePmtPenBillDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenBillDescType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenBillDescType> getPrePmtPenBillDesc() {
        return prePmtPenBillDesc;
    }

    /**
     * Sets the value of the prePmtPenBillDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenBillDescType }{@code >}
     *     
     */
    public void setPrePmtPenBillDesc(JAXBElement<PrePmtPenBillDescType> value) {
        this.prePmtPenBillDesc = value;
    }

    /**
     * Gets the value of the prePmtPenStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenStartDtType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenStartDtType> getPrePmtPenStartDt() {
        return prePmtPenStartDt;
    }

    /**
     * Sets the value of the prePmtPenStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenStartDtType }{@code >}
     *     
     */
    public void setPrePmtPenStartDt(JAXBElement<PrePmtPenStartDtType> value) {
        this.prePmtPenStartDt = value;
    }

    /**
     * Gets the value of the prePmtPenExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenExpDtType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenExpDtType> getPrePmtPenExpDt() {
        return prePmtPenExpDt;
    }

    /**
     * Sets the value of the prePmtPenExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenExpDtType }{@code >}
     *     
     */
    public void setPrePmtPenExpDt(JAXBElement<PrePmtPenExpDtType> value) {
        this.prePmtPenExpDt = value;
    }

    /**
     * Gets the value of the prePmtPenBillTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getPrePmtPenBillTerm() {
        return prePmtPenBillTerm;
    }

    /**
     * Sets the value of the prePmtPenBillTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setPrePmtPenBillTerm(JAXBElement<TermCntType> value) {
        this.prePmtPenBillTerm = value;
    }

    /**
     * Gets the value of the prePmtPenBillTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getPrePmtPenBillTermUnits() {
        return prePmtPenBillTermUnits;
    }

    /**
     * Sets the value of the prePmtPenBillTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setPrePmtPenBillTermUnits(JAXBElement<TermUnitsType> value) {
        this.prePmtPenBillTermUnits = value;
    }

    /**
     * Gets the value of the prePmtPenRenTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getPrePmtPenRenTerm() {
        return prePmtPenRenTerm;
    }

    /**
     * Sets the value of the prePmtPenRenTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setPrePmtPenRenTerm(JAXBElement<TermCntType> value) {
        this.prePmtPenRenTerm = value;
    }

    /**
     * Gets the value of the prePmtPenRenTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getPrePmtPenRenTermUnits() {
        return prePmtPenRenTermUnits;
    }

    /**
     * Sets the value of the prePmtPenRenTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setPrePmtPenRenTermUnits(JAXBElement<TermUnitsType> value) {
        this.prePmtPenRenTermUnits = value;
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
     * Gets the value of the curtPenCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurtPenCodeType }{@code >}
     *     
     */
    public JAXBElement<CurtPenCodeType> getCurtPenCode() {
        return curtPenCode;
    }

    /**
     * Sets the value of the curtPenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurtPenCodeType }{@code >}
     *     
     */
    public void setCurtPenCode(JAXBElement<CurtPenCodeType> value) {
        this.curtPenCode = value;
    }

    /**
     * Gets the value of the curtPenDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurtPenDescType }{@code >}
     *     
     */
    public JAXBElement<CurtPenDescType> getCurtPenDesc() {
        return curtPenDesc;
    }

    /**
     * Sets the value of the curtPenDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurtPenDescType }{@code >}
     *     
     */
    public void setCurtPenDesc(JAXBElement<CurtPenDescType> value) {
        this.curtPenDesc = value;
    }

    /**
     * Gets the value of the curtPenAffPrtcp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurtPenAffPrtcpType }{@code >}
     *     
     */
    public JAXBElement<CurtPenAffPrtcpType> getCurtPenAffPrtcp() {
        return curtPenAffPrtcp;
    }

    /**
     * Sets the value of the curtPenAffPrtcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurtPenAffPrtcpType }{@code >}
     *     
     */
    public void setCurtPenAffPrtcp(JAXBElement<CurtPenAffPrtcpType> value) {
        this.curtPenAffPrtcp = value;
    }

    /**
     * Gets the value of the recoupPenAffPrtcp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecoupPenAffPrtcpType }{@code >}
     *     
     */
    public JAXBElement<RecoupPenAffPrtcpType> getRecoupPenAffPrtcp() {
        return recoupPenAffPrtcp;
    }

    /**
     * Sets the value of the recoupPenAffPrtcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecoupPenAffPrtcpType }{@code >}
     *     
     */
    public void setRecoupPenAffPrtcp(JAXBElement<RecoupPenAffPrtcpType> value) {
        this.recoupPenAffPrtcp = value;
    }

    /**
     * Gets the value of the recoupPenAffPrtcpPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecoupPenAffPrtcpPctType }{@code >}
     *     
     */
    public JAXBElement<RecoupPenAffPrtcpPctType> getRecoupPenAffPrtcpPct() {
        return recoupPenAffPrtcpPct;
    }

    /**
     * Sets the value of the recoupPenAffPrtcpPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecoupPenAffPrtcpPctType }{@code >}
     *     
     */
    public void setRecoupPenAffPrtcpPct(JAXBElement<RecoupPenAffPrtcpPctType> value) {
        this.recoupPenAffPrtcpPct = value;
    }

    /**
     * Gets the value of the prePmtPenRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenRenDtType }{@code >}
     *     
     */
    public JAXBElement<PrePmtPenRenDtType> getPrePmtPenRenDt() {
        return prePmtPenRenDt;
    }

    /**
     * Sets the value of the prePmtPenRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrePmtPenRenDtType }{@code >}
     *     
     */
    public void setPrePmtPenRenDt(JAXBElement<PrePmtPenRenDtType> value) {
        this.prePmtPenRenDt = value;
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
     * Gets the value of the payoffPrePmtPenStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenStartDtType }
     *     
     */
    public PrePmtPenStartDtType getPayoffPrePmtPenStartDt() {
        return payoffPrePmtPenStartDt;
    }

    /**
     * Sets the value of the payoffPrePmtPenStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenStartDtType }
     *     
     */
    public void setPayoffPrePmtPenStartDt(PrePmtPenStartDtType value) {
        this.payoffPrePmtPenStartDt = value;
    }

    /**
     * Gets the value of the payoffPrePmtPenExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenExpDtType }
     *     
     */
    public PrePmtPenExpDtType getPayoffPrePmtPenExpDt() {
        return payoffPrePmtPenExpDt;
    }

    /**
     * Sets the value of the payoffPrePmtPenExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenExpDtType }
     *     
     */
    public void setPayoffPrePmtPenExpDt(PrePmtPenExpDtType value) {
        this.payoffPrePmtPenExpDt = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
