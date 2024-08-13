
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
 * <p>Java class for TaxPlnTaxInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPlnTaxInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlnFedWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithAltAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithAltAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithAltAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithAltAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithAltRate" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithAltRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithFixAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithFixAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithMTD" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithMTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithQTD" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithQTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFedWithLastYR" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFedWithLastYR_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithAltAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithAltAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithAltAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithAltAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithAltRate" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithAltRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithFixAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithFixAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithMTD" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithMTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithQTD" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithQTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnStateWithLastYR" type="{http://jackhenry.com/jxchange/TPG/2008}PlnStateWithLastYR_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TaxPlnTaxInfo_CType", propOrder = {
    "plnFedWithCode",
    "plnFedWithEffDt",
    "plnFedWithAltAcctId",
    "plnFedWithAltAcctType",
    "plnFedWithAltRate",
    "plnFedWithFixAmt",
    "plnFedWithMTD",
    "plnFedWithQTD",
    "plnFedWithYTD",
    "plnFedWithLastYR",
    "plnStateWithCode",
    "plnStateWithEffDt",
    "plnStateWithAltAcctId",
    "plnStateWithAltAcctType",
    "plnStateWithAltRate",
    "plnStateWithFixAmt",
    "plnStateWithMTD",
    "plnStateWithQTD",
    "plnStateWithYTD",
    "plnStateWithLastYR",
    "ver1",
    "any"
})
public class TaxPlnTaxInfoCType {

    @XmlElementRef(name = "PlnFedWithCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithCodeType> plnFedWithCode;
    @XmlElementRef(name = "PlnFedWithEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithEffDtType> plnFedWithEffDt;
    @XmlElementRef(name = "PlnFedWithAltAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithAltAcctIdType> plnFedWithAltAcctId;
    @XmlElementRef(name = "PlnFedWithAltAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithAltAcctTypeType> plnFedWithAltAcctType;
    @XmlElementRef(name = "PlnFedWithAltRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithAltRateType> plnFedWithAltRate;
    @XmlElementRef(name = "PlnFedWithFixAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithFixAmtType> plnFedWithFixAmt;
    @XmlElementRef(name = "PlnFedWithMTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithMTDType> plnFedWithMTD;
    @XmlElementRef(name = "PlnFedWithQTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithQTDType> plnFedWithQTD;
    @XmlElementRef(name = "PlnFedWithYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithYTDType> plnFedWithYTD;
    @XmlElementRef(name = "PlnFedWithLastYR", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFedWithLastYRType> plnFedWithLastYR;
    @XmlElementRef(name = "PlnStateWithCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithCodeType> plnStateWithCode;
    @XmlElementRef(name = "PlnStateWithEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithEffDtType> plnStateWithEffDt;
    @XmlElementRef(name = "PlnStateWithAltAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithAltAcctIdType> plnStateWithAltAcctId;
    @XmlElementRef(name = "PlnStateWithAltAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithAltAcctTypeType> plnStateWithAltAcctType;
    @XmlElementRef(name = "PlnStateWithAltRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithAltRateType> plnStateWithAltRate;
    @XmlElementRef(name = "PlnStateWithFixAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithFixAmtType> plnStateWithFixAmt;
    @XmlElementRef(name = "PlnStateWithMTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithMTDType> plnStateWithMTD;
    @XmlElementRef(name = "PlnStateWithQTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithQTDType> plnStateWithQTD;
    @XmlElementRef(name = "PlnStateWithYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithYTDType> plnStateWithYTD;
    @XmlElementRef(name = "PlnStateWithLastYR", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnStateWithLastYRType> plnStateWithLastYR;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the plnFedWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithCodeType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithCodeType> getPlnFedWithCode() {
        return plnFedWithCode;
    }

    /**
     * Sets the value of the plnFedWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithCodeType }{@code >}
     *     
     */
    public void setPlnFedWithCode(JAXBElement<PlnFedWithCodeType> value) {
        this.plnFedWithCode = value;
    }

    /**
     * Gets the value of the plnFedWithEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithEffDtType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithEffDtType> getPlnFedWithEffDt() {
        return plnFedWithEffDt;
    }

    /**
     * Sets the value of the plnFedWithEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithEffDtType }{@code >}
     *     
     */
    public void setPlnFedWithEffDt(JAXBElement<PlnFedWithEffDtType> value) {
        this.plnFedWithEffDt = value;
    }

    /**
     * Gets the value of the plnFedWithAltAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithAltAcctIdType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithAltAcctIdType> getPlnFedWithAltAcctId() {
        return plnFedWithAltAcctId;
    }

    /**
     * Sets the value of the plnFedWithAltAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithAltAcctIdType }{@code >}
     *     
     */
    public void setPlnFedWithAltAcctId(JAXBElement<PlnFedWithAltAcctIdType> value) {
        this.plnFedWithAltAcctId = value;
    }

    /**
     * Gets the value of the plnFedWithAltAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithAltAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithAltAcctTypeType> getPlnFedWithAltAcctType() {
        return plnFedWithAltAcctType;
    }

    /**
     * Sets the value of the plnFedWithAltAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithAltAcctTypeType }{@code >}
     *     
     */
    public void setPlnFedWithAltAcctType(JAXBElement<PlnFedWithAltAcctTypeType> value) {
        this.plnFedWithAltAcctType = value;
    }

    /**
     * Gets the value of the plnFedWithAltRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithAltRateType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithAltRateType> getPlnFedWithAltRate() {
        return plnFedWithAltRate;
    }

    /**
     * Sets the value of the plnFedWithAltRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithAltRateType }{@code >}
     *     
     */
    public void setPlnFedWithAltRate(JAXBElement<PlnFedWithAltRateType> value) {
        this.plnFedWithAltRate = value;
    }

    /**
     * Gets the value of the plnFedWithFixAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithFixAmtType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithFixAmtType> getPlnFedWithFixAmt() {
        return plnFedWithFixAmt;
    }

    /**
     * Sets the value of the plnFedWithFixAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithFixAmtType }{@code >}
     *     
     */
    public void setPlnFedWithFixAmt(JAXBElement<PlnFedWithFixAmtType> value) {
        this.plnFedWithFixAmt = value;
    }

    /**
     * Gets the value of the plnFedWithMTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithMTDType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithMTDType> getPlnFedWithMTD() {
        return plnFedWithMTD;
    }

    /**
     * Sets the value of the plnFedWithMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithMTDType }{@code >}
     *     
     */
    public void setPlnFedWithMTD(JAXBElement<PlnFedWithMTDType> value) {
        this.plnFedWithMTD = value;
    }

    /**
     * Gets the value of the plnFedWithQTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithQTDType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithQTDType> getPlnFedWithQTD() {
        return plnFedWithQTD;
    }

    /**
     * Sets the value of the plnFedWithQTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithQTDType }{@code >}
     *     
     */
    public void setPlnFedWithQTD(JAXBElement<PlnFedWithQTDType> value) {
        this.plnFedWithQTD = value;
    }

    /**
     * Gets the value of the plnFedWithYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithYTDType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithYTDType> getPlnFedWithYTD() {
        return plnFedWithYTD;
    }

    /**
     * Sets the value of the plnFedWithYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithYTDType }{@code >}
     *     
     */
    public void setPlnFedWithYTD(JAXBElement<PlnFedWithYTDType> value) {
        this.plnFedWithYTD = value;
    }

    /**
     * Gets the value of the plnFedWithLastYR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithLastYRType }{@code >}
     *     
     */
    public JAXBElement<PlnFedWithLastYRType> getPlnFedWithLastYR() {
        return plnFedWithLastYR;
    }

    /**
     * Sets the value of the plnFedWithLastYR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFedWithLastYRType }{@code >}
     *     
     */
    public void setPlnFedWithLastYR(JAXBElement<PlnFedWithLastYRType> value) {
        this.plnFedWithLastYR = value;
    }

    /**
     * Gets the value of the plnStateWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithCodeType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithCodeType> getPlnStateWithCode() {
        return plnStateWithCode;
    }

    /**
     * Sets the value of the plnStateWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithCodeType }{@code >}
     *     
     */
    public void setPlnStateWithCode(JAXBElement<PlnStateWithCodeType> value) {
        this.plnStateWithCode = value;
    }

    /**
     * Gets the value of the plnStateWithEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithEffDtType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithEffDtType> getPlnStateWithEffDt() {
        return plnStateWithEffDt;
    }

    /**
     * Sets the value of the plnStateWithEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithEffDtType }{@code >}
     *     
     */
    public void setPlnStateWithEffDt(JAXBElement<PlnStateWithEffDtType> value) {
        this.plnStateWithEffDt = value;
    }

    /**
     * Gets the value of the plnStateWithAltAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithAltAcctIdType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithAltAcctIdType> getPlnStateWithAltAcctId() {
        return plnStateWithAltAcctId;
    }

    /**
     * Sets the value of the plnStateWithAltAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithAltAcctIdType }{@code >}
     *     
     */
    public void setPlnStateWithAltAcctId(JAXBElement<PlnStateWithAltAcctIdType> value) {
        this.plnStateWithAltAcctId = value;
    }

    /**
     * Gets the value of the plnStateWithAltAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithAltAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithAltAcctTypeType> getPlnStateWithAltAcctType() {
        return plnStateWithAltAcctType;
    }

    /**
     * Sets the value of the plnStateWithAltAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithAltAcctTypeType }{@code >}
     *     
     */
    public void setPlnStateWithAltAcctType(JAXBElement<PlnStateWithAltAcctTypeType> value) {
        this.plnStateWithAltAcctType = value;
    }

    /**
     * Gets the value of the plnStateWithAltRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithAltRateType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithAltRateType> getPlnStateWithAltRate() {
        return plnStateWithAltRate;
    }

    /**
     * Sets the value of the plnStateWithAltRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithAltRateType }{@code >}
     *     
     */
    public void setPlnStateWithAltRate(JAXBElement<PlnStateWithAltRateType> value) {
        this.plnStateWithAltRate = value;
    }

    /**
     * Gets the value of the plnStateWithFixAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithFixAmtType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithFixAmtType> getPlnStateWithFixAmt() {
        return plnStateWithFixAmt;
    }

    /**
     * Sets the value of the plnStateWithFixAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithFixAmtType }{@code >}
     *     
     */
    public void setPlnStateWithFixAmt(JAXBElement<PlnStateWithFixAmtType> value) {
        this.plnStateWithFixAmt = value;
    }

    /**
     * Gets the value of the plnStateWithMTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithMTDType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithMTDType> getPlnStateWithMTD() {
        return plnStateWithMTD;
    }

    /**
     * Sets the value of the plnStateWithMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithMTDType }{@code >}
     *     
     */
    public void setPlnStateWithMTD(JAXBElement<PlnStateWithMTDType> value) {
        this.plnStateWithMTD = value;
    }

    /**
     * Gets the value of the plnStateWithQTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithQTDType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithQTDType> getPlnStateWithQTD() {
        return plnStateWithQTD;
    }

    /**
     * Sets the value of the plnStateWithQTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithQTDType }{@code >}
     *     
     */
    public void setPlnStateWithQTD(JAXBElement<PlnStateWithQTDType> value) {
        this.plnStateWithQTD = value;
    }

    /**
     * Gets the value of the plnStateWithYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithYTDType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithYTDType> getPlnStateWithYTD() {
        return plnStateWithYTD;
    }

    /**
     * Sets the value of the plnStateWithYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithYTDType }{@code >}
     *     
     */
    public void setPlnStateWithYTD(JAXBElement<PlnStateWithYTDType> value) {
        this.plnStateWithYTD = value;
    }

    /**
     * Gets the value of the plnStateWithLastYR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithLastYRType }{@code >}
     *     
     */
    public JAXBElement<PlnStateWithLastYRType> getPlnStateWithLastYR() {
        return plnStateWithLastYR;
    }

    /**
     * Sets the value of the plnStateWithLastYR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnStateWithLastYRType }{@code >}
     *     
     */
    public void setPlnStateWithLastYR(JAXBElement<PlnStateWithLastYRType> value) {
        this.plnStateWithLastYR = value;
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
