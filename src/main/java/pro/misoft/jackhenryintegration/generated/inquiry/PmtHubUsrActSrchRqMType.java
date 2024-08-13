
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
 * <p>Java class for PmtHubUsrActSrchRq_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubUsrActSrchRq_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrchMsgRqHdr" type="{http://jackhenry.com/jxchange/TPG/2008}SrchMsgRqHdr_CType"/&gt;
 *         &lt;element name="UsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubEnrollType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubEnrollType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="LegalEntityId" type="{http://jackhenry.com/jxchange/TPG/2008}LegalEntityId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LegalEntityIdType" type="{http://jackhenry.com/jxchange/TPG/2008}LegalEntityIdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubActType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubActType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubActStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubActStat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtHubUsrActSrchRq_MType", propOrder = {
    "srchMsgRqHdr",
    "usrToken",
    "pmtHubEnrollType",
    "accountId",
    "legalEntityId",
    "legalEntityIdType",
    "actStartDt",
    "actEndDt",
    "pmtHubActType",
    "pmtHubActStat",
    "custom",
    "ver1",
    "any"
})
public class PmtHubUsrActSrchRqMType {

    @XmlElement(name = "SrchMsgRqHdr", required = true)
    protected SrchMsgRqHdrCType srchMsgRqHdr;
    @XmlElementRef(name = "UsrToken", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UsrTokenType> usrToken;
    @XmlElementRef(name = "PmtHubEnrollType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtHubEnrollTypeType> pmtHubEnrollType;
    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "LegalEntityId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LegalEntityIdType> legalEntityId;
    @XmlElementRef(name = "LegalEntityIdType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LegalEntityIdTypeType> legalEntityIdType;
    @XmlElementRef(name = "ActStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDtType> actStartDt;
    @XmlElementRef(name = "ActEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EndDtType> actEndDt;
    @XmlElementRef(name = "PmtHubActType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtHubActTypeType> pmtHubActType;
    @XmlElementRef(name = "PmtHubActStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtHubActStatType> pmtHubActStat;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the srchMsgRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public SrchMsgRqHdrCType getSrchMsgRqHdr() {
        return srchMsgRqHdr;
    }

    /**
     * Sets the value of the srchMsgRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrchMsgRqHdrCType }
     *     
     */
    public void setSrchMsgRqHdr(SrchMsgRqHdrCType value) {
        this.srchMsgRqHdr = value;
    }

    /**
     * Gets the value of the usrToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsrTokenType }{@code >}
     *     
     */
    public JAXBElement<UsrTokenType> getUsrToken() {
        return usrToken;
    }

    /**
     * Sets the value of the usrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsrTokenType }{@code >}
     *     
     */
    public void setUsrToken(JAXBElement<UsrTokenType> value) {
        this.usrToken = value;
    }

    /**
     * Gets the value of the pmtHubEnrollType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtHubEnrollTypeType }{@code >}
     *     
     */
    public JAXBElement<PmtHubEnrollTypeType> getPmtHubEnrollType() {
        return pmtHubEnrollType;
    }

    /**
     * Sets the value of the pmtHubEnrollType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtHubEnrollTypeType }{@code >}
     *     
     */
    public void setPmtHubEnrollType(JAXBElement<PmtHubEnrollTypeType> value) {
        this.pmtHubEnrollType = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the legalEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegalEntityIdType }{@code >}
     *     
     */
    public JAXBElement<LegalEntityIdType> getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Sets the value of the legalEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegalEntityIdType }{@code >}
     *     
     */
    public void setLegalEntityId(JAXBElement<LegalEntityIdType> value) {
        this.legalEntityId = value;
    }

    /**
     * Gets the value of the legalEntityIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LegalEntityIdTypeType }{@code >}
     *     
     */
    public JAXBElement<LegalEntityIdTypeType> getLegalEntityIdType() {
        return legalEntityIdType;
    }

    /**
     * Sets the value of the legalEntityIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LegalEntityIdTypeType }{@code >}
     *     
     */
    public void setLegalEntityIdType(JAXBElement<LegalEntityIdTypeType> value) {
        this.legalEntityIdType = value;
    }

    /**
     * Gets the value of the actStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public JAXBElement<StartDtType> getActStartDt() {
        return actStartDt;
    }

    /**
     * Sets the value of the actStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDtType }{@code >}
     *     
     */
    public void setActStartDt(JAXBElement<StartDtType> value) {
        this.actStartDt = value;
    }

    /**
     * Gets the value of the actEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public JAXBElement<EndDtType> getActEndDt() {
        return actEndDt;
    }

    /**
     * Sets the value of the actEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EndDtType }{@code >}
     *     
     */
    public void setActEndDt(JAXBElement<EndDtType> value) {
        this.actEndDt = value;
    }

    /**
     * Gets the value of the pmtHubActType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtHubActTypeType }{@code >}
     *     
     */
    public JAXBElement<PmtHubActTypeType> getPmtHubActType() {
        return pmtHubActType;
    }

    /**
     * Sets the value of the pmtHubActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtHubActTypeType }{@code >}
     *     
     */
    public void setPmtHubActType(JAXBElement<PmtHubActTypeType> value) {
        this.pmtHubActType = value;
    }

    /**
     * Gets the value of the pmtHubActStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtHubActStatType }{@code >}
     *     
     */
    public JAXBElement<PmtHubActStatType> getPmtHubActStat() {
        return pmtHubActStat;
    }

    /**
     * Sets the value of the pmtHubActStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtHubActStatType }{@code >}
     *     
     */
    public void setPmtHubActStat(JAXBElement<PmtHubActStatType> value) {
        this.pmtHubActStat = value;
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
