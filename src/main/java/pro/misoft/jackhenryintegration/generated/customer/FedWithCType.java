
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
 * <p>Java class for FedWith_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FedWith_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FedWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithAltAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithAltAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithAltAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithAltAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithAltRate" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithAltRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithFixAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithFixAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithMTD" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithMTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithQTD" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithQTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithYTD" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="FedWithLastYR" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithLastYR_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="FedWithCycleAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithCycleAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FedWith_CType", propOrder = {
    "fedWithCode",
    "fedWithDesc",
    "fedWithEffDt",
    "fedWithAltAcctId",
    "fedWithAltAcctType",
    "fedWithAltRate",
    "fedWithFixAmt",
    "fedWithMTD",
    "fedWithQTD",
    "fedWithYTD",
    "fedWithLastYR",
    "ver1",
    "fedWithCycleAmt",
    "ver2",
    "any"
})
public class FedWithCType {

    @XmlElementRef(name = "FedWithCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithCodeType> fedWithCode;
    @XmlElementRef(name = "FedWithDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithDescType> fedWithDesc;
    @XmlElementRef(name = "FedWithEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithEffDtType> fedWithEffDt;
    @XmlElementRef(name = "FedWithAltAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithAltAcctIdType> fedWithAltAcctId;
    @XmlElementRef(name = "FedWithAltAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithAltAcctTypeType> fedWithAltAcctType;
    @XmlElementRef(name = "FedWithAltRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithAltRateType> fedWithAltRate;
    @XmlElementRef(name = "FedWithFixAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithFixAmtType> fedWithFixAmt;
    @XmlElementRef(name = "FedWithMTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithMTDType> fedWithMTD;
    @XmlElementRef(name = "FedWithQTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithQTDType> fedWithQTD;
    @XmlElementRef(name = "FedWithYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithYTDType> fedWithYTD;
    @XmlElementRef(name = "FedWithLastYR", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FedWithLastYRType> fedWithLastYR;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "FedWithCycleAmt")
    protected FedWithCycleAmtType fedWithCycleAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fedWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithCodeType }{@code >}
     *     
     */
    public JAXBElement<FedWithCodeType> getFedWithCode() {
        return fedWithCode;
    }

    /**
     * Sets the value of the fedWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithCodeType }{@code >}
     *     
     */
    public void setFedWithCode(JAXBElement<FedWithCodeType> value) {
        this.fedWithCode = value;
    }

    /**
     * Gets the value of the fedWithDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithDescType }{@code >}
     *     
     */
    public JAXBElement<FedWithDescType> getFedWithDesc() {
        return fedWithDesc;
    }

    /**
     * Sets the value of the fedWithDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithDescType }{@code >}
     *     
     */
    public void setFedWithDesc(JAXBElement<FedWithDescType> value) {
        this.fedWithDesc = value;
    }

    /**
     * Gets the value of the fedWithEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithEffDtType }{@code >}
     *     
     */
    public JAXBElement<FedWithEffDtType> getFedWithEffDt() {
        return fedWithEffDt;
    }

    /**
     * Sets the value of the fedWithEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithEffDtType }{@code >}
     *     
     */
    public void setFedWithEffDt(JAXBElement<FedWithEffDtType> value) {
        this.fedWithEffDt = value;
    }

    /**
     * Gets the value of the fedWithAltAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithAltAcctIdType }{@code >}
     *     
     */
    public JAXBElement<FedWithAltAcctIdType> getFedWithAltAcctId() {
        return fedWithAltAcctId;
    }

    /**
     * Sets the value of the fedWithAltAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithAltAcctIdType }{@code >}
     *     
     */
    public void setFedWithAltAcctId(JAXBElement<FedWithAltAcctIdType> value) {
        this.fedWithAltAcctId = value;
    }

    /**
     * Gets the value of the fedWithAltAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithAltAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<FedWithAltAcctTypeType> getFedWithAltAcctType() {
        return fedWithAltAcctType;
    }

    /**
     * Sets the value of the fedWithAltAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithAltAcctTypeType }{@code >}
     *     
     */
    public void setFedWithAltAcctType(JAXBElement<FedWithAltAcctTypeType> value) {
        this.fedWithAltAcctType = value;
    }

    /**
     * Gets the value of the fedWithAltRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithAltRateType }{@code >}
     *     
     */
    public JAXBElement<FedWithAltRateType> getFedWithAltRate() {
        return fedWithAltRate;
    }

    /**
     * Sets the value of the fedWithAltRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithAltRateType }{@code >}
     *     
     */
    public void setFedWithAltRate(JAXBElement<FedWithAltRateType> value) {
        this.fedWithAltRate = value;
    }

    /**
     * Gets the value of the fedWithFixAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithFixAmtType }{@code >}
     *     
     */
    public JAXBElement<FedWithFixAmtType> getFedWithFixAmt() {
        return fedWithFixAmt;
    }

    /**
     * Sets the value of the fedWithFixAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithFixAmtType }{@code >}
     *     
     */
    public void setFedWithFixAmt(JAXBElement<FedWithFixAmtType> value) {
        this.fedWithFixAmt = value;
    }

    /**
     * Gets the value of the fedWithMTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithMTDType }{@code >}
     *     
     */
    public JAXBElement<FedWithMTDType> getFedWithMTD() {
        return fedWithMTD;
    }

    /**
     * Sets the value of the fedWithMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithMTDType }{@code >}
     *     
     */
    public void setFedWithMTD(JAXBElement<FedWithMTDType> value) {
        this.fedWithMTD = value;
    }

    /**
     * Gets the value of the fedWithQTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithQTDType }{@code >}
     *     
     */
    public JAXBElement<FedWithQTDType> getFedWithQTD() {
        return fedWithQTD;
    }

    /**
     * Sets the value of the fedWithQTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithQTDType }{@code >}
     *     
     */
    public void setFedWithQTD(JAXBElement<FedWithQTDType> value) {
        this.fedWithQTD = value;
    }

    /**
     * Gets the value of the fedWithYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithYTDType }{@code >}
     *     
     */
    public JAXBElement<FedWithYTDType> getFedWithYTD() {
        return fedWithYTD;
    }

    /**
     * Sets the value of the fedWithYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithYTDType }{@code >}
     *     
     */
    public void setFedWithYTD(JAXBElement<FedWithYTDType> value) {
        this.fedWithYTD = value;
    }

    /**
     * Gets the value of the fedWithLastYR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FedWithLastYRType }{@code >}
     *     
     */
    public JAXBElement<FedWithLastYRType> getFedWithLastYR() {
        return fedWithLastYR;
    }

    /**
     * Sets the value of the fedWithLastYR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FedWithLastYRType }{@code >}
     *     
     */
    public void setFedWithLastYR(JAXBElement<FedWithLastYRType> value) {
        this.fedWithLastYR = value;
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
     * Gets the value of the fedWithCycleAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FedWithCycleAmtType }
     *     
     */
    public FedWithCycleAmtType getFedWithCycleAmt() {
        return fedWithCycleAmt;
    }

    /**
     * Sets the value of the fedWithCycleAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedWithCycleAmtType }
     *     
     */
    public void setFedWithCycleAmt(FedWithCycleAmtType value) {
        this.fedWithCycleAmt = value;
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
