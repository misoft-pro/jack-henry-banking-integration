
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for BusResInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusResInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusResCode" type="{http://jackhenry.com/jxchange/TPG/2008}BusResCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResCmpltDt" type="{http://jackhenry.com/jxchange/TPG/2008}ResCmpltDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CertifierName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="FilingOffc" type="{http://jackhenry.com/jxchange/TPG/2008}FilingOffc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AttestorName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAuthorized" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="ResolvingPartyArray" type="{http://jackhenry.com/jxchange/TPG/2008}ResolvingPartyArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ResEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}ResEffDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="CertifierTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *           &lt;element name="AttestorTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BusResInfo_CType", propOrder = {
    "busResCode",
    "resCmpltDt",
    "certifierName",
    "filingOffc",
    "attestorName",
    "acctAuthorized",
    "resolvingPartyArray",
    "ver1",
    "resEffDt",
    "certifierTitle",
    "attestorTitle",
    "ver2",
    "any"
})
public class BusResInfoCType {

    @XmlElement(name = "BusResCode")
    protected BusResCodeType busResCode;
    @XmlElement(name = "ResCmpltDt")
    protected ResCmpltDtType resCmpltDt;
    @XmlElement(name = "CertifierName")
    protected ComNameType certifierName;
    @XmlElement(name = "FilingOffc")
    protected FilingOffcType filingOffc;
    @XmlElement(name = "AttestorName")
    protected ComNameType attestorName;
    @XmlElement(name = "AcctAuthorized")
    protected AccountIdCType acctAuthorized;
    @XmlElement(name = "ResolvingPartyArray")
    protected ResolvingPartyArrayAType resolvingPartyArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ResEffDt")
    protected ResEffDtType resEffDt;
    @XmlElement(name = "CertifierTitle")
    protected EmplTitleType certifierTitle;
    @XmlElement(name = "AttestorTitle")
    protected EmplTitleType attestorTitle;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the busResCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusResCodeType }
     *     
     */
    public BusResCodeType getBusResCode() {
        return busResCode;
    }

    /**
     * Sets the value of the busResCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusResCodeType }
     *     
     */
    public void setBusResCode(BusResCodeType value) {
        this.busResCode = value;
    }

    /**
     * Gets the value of the resCmpltDt property.
     * 
     * @return
     *     possible object is
     *     {@link ResCmpltDtType }
     *     
     */
    public ResCmpltDtType getResCmpltDt() {
        return resCmpltDt;
    }

    /**
     * Sets the value of the resCmpltDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResCmpltDtType }
     *     
     */
    public void setResCmpltDt(ResCmpltDtType value) {
        this.resCmpltDt = value;
    }

    /**
     * Gets the value of the certifierName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getCertifierName() {
        return certifierName;
    }

    /**
     * Sets the value of the certifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setCertifierName(ComNameType value) {
        this.certifierName = value;
    }

    /**
     * Gets the value of the filingOffc property.
     * 
     * @return
     *     possible object is
     *     {@link FilingOffcType }
     *     
     */
    public FilingOffcType getFilingOffc() {
        return filingOffc;
    }

    /**
     * Sets the value of the filingOffc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingOffcType }
     *     
     */
    public void setFilingOffc(FilingOffcType value) {
        this.filingOffc = value;
    }

    /**
     * Gets the value of the attestorName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getAttestorName() {
        return attestorName;
    }

    /**
     * Sets the value of the attestorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setAttestorName(ComNameType value) {
        this.attestorName = value;
    }

    /**
     * Gets the value of the acctAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAcctAuthorized() {
        return acctAuthorized;
    }

    /**
     * Sets the value of the acctAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAcctAuthorized(AccountIdCType value) {
        this.acctAuthorized = value;
    }

    /**
     * Gets the value of the resolvingPartyArray property.
     * 
     * @return
     *     possible object is
     *     {@link ResolvingPartyArrayAType }
     *     
     */
    public ResolvingPartyArrayAType getResolvingPartyArray() {
        return resolvingPartyArray;
    }

    /**
     * Sets the value of the resolvingPartyArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolvingPartyArrayAType }
     *     
     */
    public void setResolvingPartyArray(ResolvingPartyArrayAType value) {
        this.resolvingPartyArray = value;
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
     * Gets the value of the resEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link ResEffDtType }
     *     
     */
    public ResEffDtType getResEffDt() {
        return resEffDt;
    }

    /**
     * Sets the value of the resEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResEffDtType }
     *     
     */
    public void setResEffDt(ResEffDtType value) {
        this.resEffDt = value;
    }

    /**
     * Gets the value of the certifierTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getCertifierTitle() {
        return certifierTitle;
    }

    /**
     * Sets the value of the certifierTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setCertifierTitle(EmplTitleType value) {
        this.certifierTitle = value;
    }

    /**
     * Gets the value of the attestorTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getAttestorTitle() {
        return attestorTitle;
    }

    /**
     * Sets the value of the attestorTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setAttestorTitle(EmplTitleType value) {
        this.attestorTitle = value;
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
