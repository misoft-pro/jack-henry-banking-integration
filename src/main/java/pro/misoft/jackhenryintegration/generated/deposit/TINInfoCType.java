
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for TINInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TINInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TINCode" type="{http://jackhenry.com/jxchange/TPG/2008}TINCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TINDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TINDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdMod" type="{http://jackhenry.com/jxchange/TPG/2008}TaxIdMod_Type" minOccurs="0"/&gt;
 *         &lt;element name="CertCode" type="{http://jackhenry.com/jxchange/TPG/2008}CertCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CertCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CertCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CertCodeDt" type="{http://jackhenry.com/jxchange/TPG/2008}CertCodeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BNotStat" type="{http://jackhenry.com/jxchange/TPG/2008}BNotStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="BNotIRSDt" type="{http://jackhenry.com/jxchange/TPG/2008}BNotIRSDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TaxIdOwnerName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="TINMatchType" type="{http://jackhenry.com/jxchange/TPG/2008}TINMatchType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TINInfo_CType", propOrder = {
    "tinCode",
    "tinDesc",
    "taxId",
    "taxIdMod",
    "certCode",
    "certCodeDesc",
    "certCodeDt",
    "bNotStat",
    "bNotIRSDt",
    "ver1",
    "taxIdOwnerName",
    "ver2",
    "tinMatchType",
    "ver3",
    "any"
})
public class TINInfoCType {

    @XmlElementRef(name = "TINCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TINCodeType> tinCode;
    @XmlElementRef(name = "TINDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TINDescType> tinDesc;
    @XmlElementRef(name = "TaxId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdType> taxId;
    @XmlElementRef(name = "TaxIdMod", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxIdModType> taxIdMod;
    @XmlElementRef(name = "CertCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CertCodeType> certCode;
    @XmlElementRef(name = "CertCodeDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CertCodeDescType> certCodeDesc;
    @XmlElementRef(name = "CertCodeDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CertCodeDtType> certCodeDt;
    @XmlElementRef(name = "BNotStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BNotStatType> bNotStat;
    @XmlElementRef(name = "BNotIRSDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BNotIRSDtType> bNotIRSDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TaxIdOwnerName")
    protected PersonNameCType taxIdOwnerName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "TINMatchType")
    protected TINMatchTypeType tinMatchType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tinCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TINCodeType }{@code >}
     *     
     */
    public JAXBElement<TINCodeType> getTINCode() {
        return tinCode;
    }

    /**
     * Sets the value of the tinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TINCodeType }{@code >}
     *     
     */
    public void setTINCode(JAXBElement<TINCodeType> value) {
        this.tinCode = value;
    }

    /**
     * Gets the value of the tinDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TINDescType }{@code >}
     *     
     */
    public JAXBElement<TINDescType> getTINDesc() {
        return tinDesc;
    }

    /**
     * Sets the value of the tinDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TINDescType }{@code >}
     *     
     */
    public void setTINDesc(JAXBElement<TINDescType> value) {
        this.tinDesc = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public JAXBElement<TaxIdType> getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}
     *     
     */
    public void setTaxId(JAXBElement<TaxIdType> value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the taxIdMod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxIdModType }{@code >}
     *     
     */
    public JAXBElement<TaxIdModType> getTaxIdMod() {
        return taxIdMod;
    }

    /**
     * Sets the value of the taxIdMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxIdModType }{@code >}
     *     
     */
    public void setTaxIdMod(JAXBElement<TaxIdModType> value) {
        this.taxIdMod = value;
    }

    /**
     * Gets the value of the certCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertCodeType }{@code >}
     *     
     */
    public JAXBElement<CertCodeType> getCertCode() {
        return certCode;
    }

    /**
     * Sets the value of the certCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertCodeType }{@code >}
     *     
     */
    public void setCertCode(JAXBElement<CertCodeType> value) {
        this.certCode = value;
    }

    /**
     * Gets the value of the certCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertCodeDescType }{@code >}
     *     
     */
    public JAXBElement<CertCodeDescType> getCertCodeDesc() {
        return certCodeDesc;
    }

    /**
     * Sets the value of the certCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertCodeDescType }{@code >}
     *     
     */
    public void setCertCodeDesc(JAXBElement<CertCodeDescType> value) {
        this.certCodeDesc = value;
    }

    /**
     * Gets the value of the certCodeDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CertCodeDtType }{@code >}
     *     
     */
    public JAXBElement<CertCodeDtType> getCertCodeDt() {
        return certCodeDt;
    }

    /**
     * Sets the value of the certCodeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CertCodeDtType }{@code >}
     *     
     */
    public void setCertCodeDt(JAXBElement<CertCodeDtType> value) {
        this.certCodeDt = value;
    }

    /**
     * Gets the value of the bNotStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BNotStatType }{@code >}
     *     
     */
    public JAXBElement<BNotStatType> getBNotStat() {
        return bNotStat;
    }

    /**
     * Sets the value of the bNotStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BNotStatType }{@code >}
     *     
     */
    public void setBNotStat(JAXBElement<BNotStatType> value) {
        this.bNotStat = value;
    }

    /**
     * Gets the value of the bNotIRSDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BNotIRSDtType }{@code >}
     *     
     */
    public JAXBElement<BNotIRSDtType> getBNotIRSDt() {
        return bNotIRSDt;
    }

    /**
     * Sets the value of the bNotIRSDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BNotIRSDtType }{@code >}
     *     
     */
    public void setBNotIRSDt(JAXBElement<BNotIRSDtType> value) {
        this.bNotIRSDt = value;
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
     * Gets the value of the taxIdOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getTaxIdOwnerName() {
        return taxIdOwnerName;
    }

    /**
     * Sets the value of the taxIdOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setTaxIdOwnerName(PersonNameCType value) {
        this.taxIdOwnerName = value;
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
     * Gets the value of the tinMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link TINMatchTypeType }
     *     
     */
    public TINMatchTypeType getTINMatchType() {
        return tinMatchType;
    }

    /**
     * Sets the value of the tinMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINMatchTypeType }
     *     
     */
    public void setTINMatchType(TINMatchTypeType value) {
        this.tinMatchType = value;
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
