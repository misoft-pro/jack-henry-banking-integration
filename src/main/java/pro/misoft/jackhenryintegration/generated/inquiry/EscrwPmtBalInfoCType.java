
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
 * <p>Java class for EscrwPmtBalInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwPmtBalInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwPmtBalDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtBalDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwRate" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPrevYRBal" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPrevYRBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwNewPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwNewPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwNewShtPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwNewShtPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAccrInt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EscrwPayoffExclBalType" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPayoffExclBalType_Type" minOccurs="0"/&gt;
 *           &lt;element name="EscrwPayoffExclIntType" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPayoffExclIntType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwPmtBalInfo_CType", propOrder = {
    "escrwPmtBalDesc",
    "escrwPmtAmt",
    "escrwRateIdx",
    "escrwRate",
    "escrwCurBal",
    "escrwPrevYRBal",
    "escrwNewPmtAmt",
    "escrwNewShtPmtAmt",
    "escrwAccrInt",
    "ver1",
    "escrwPayoffExclBalType",
    "escrwPayoffExclIntType",
    "ver2",
    "any"
})
public class EscrwPmtBalInfoCType {

    @XmlElementRef(name = "EscrwPmtBalDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtBalDescType> escrwPmtBalDesc;
    @XmlElementRef(name = "EscrwPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtAmtType> escrwPmtAmt;
    @XmlElementRef(name = "EscrwRateIdx", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwRateIdxType> escrwRateIdx;
    @XmlElementRef(name = "EscrwRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwRateType> escrwRate;
    @XmlElementRef(name = "EscrwCurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwCurBalType> escrwCurBal;
    @XmlElementRef(name = "EscrwPrevYRBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPrevYRBalType> escrwPrevYRBal;
    @XmlElementRef(name = "EscrwNewPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwNewPmtAmtType> escrwNewPmtAmt;
    @XmlElementRef(name = "EscrwNewShtPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwNewShtPmtAmtType> escrwNewShtPmtAmt;
    @XmlElementRef(name = "EscrwAccrInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwAccrIntType> escrwAccrInt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EscrwPayoffExclBalType")
    protected EscrwPayoffExclBalTypeType escrwPayoffExclBalType;
    @XmlElement(name = "EscrwPayoffExclIntType")
    protected EscrwPayoffExclIntTypeType escrwPayoffExclIntType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwPmtBalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtBalDescType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtBalDescType> getEscrwPmtBalDesc() {
        return escrwPmtBalDesc;
    }

    /**
     * Sets the value of the escrwPmtBalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtBalDescType }{@code >}
     *     
     */
    public void setEscrwPmtBalDesc(JAXBElement<EscrwPmtBalDescType> value) {
        this.escrwPmtBalDesc = value;
    }

    /**
     * Gets the value of the escrwPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtAmtType> getEscrwPmtAmt() {
        return escrwPmtAmt;
    }

    /**
     * Sets the value of the escrwPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtAmtType }{@code >}
     *     
     */
    public void setEscrwPmtAmt(JAXBElement<EscrwPmtAmtType> value) {
        this.escrwPmtAmt = value;
    }

    /**
     * Gets the value of the escrwRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwRateIdxType }{@code >}
     *     
     */
    public JAXBElement<EscrwRateIdxType> getEscrwRateIdx() {
        return escrwRateIdx;
    }

    /**
     * Sets the value of the escrwRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwRateIdxType }{@code >}
     *     
     */
    public void setEscrwRateIdx(JAXBElement<EscrwRateIdxType> value) {
        this.escrwRateIdx = value;
    }

    /**
     * Gets the value of the escrwRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwRateType }{@code >}
     *     
     */
    public JAXBElement<EscrwRateType> getEscrwRate() {
        return escrwRate;
    }

    /**
     * Sets the value of the escrwRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwRateType }{@code >}
     *     
     */
    public void setEscrwRate(JAXBElement<EscrwRateType> value) {
        this.escrwRate = value;
    }

    /**
     * Gets the value of the escrwCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwCurBalType }{@code >}
     *     
     */
    public JAXBElement<EscrwCurBalType> getEscrwCurBal() {
        return escrwCurBal;
    }

    /**
     * Sets the value of the escrwCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwCurBalType }{@code >}
     *     
     */
    public void setEscrwCurBal(JAXBElement<EscrwCurBalType> value) {
        this.escrwCurBal = value;
    }

    /**
     * Gets the value of the escrwPrevYRBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrevYRBalType }{@code >}
     *     
     */
    public JAXBElement<EscrwPrevYRBalType> getEscrwPrevYRBal() {
        return escrwPrevYRBal;
    }

    /**
     * Sets the value of the escrwPrevYRBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrevYRBalType }{@code >}
     *     
     */
    public void setEscrwPrevYRBal(JAXBElement<EscrwPrevYRBalType> value) {
        this.escrwPrevYRBal = value;
    }

    /**
     * Gets the value of the escrwNewPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwNewPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwNewPmtAmtType> getEscrwNewPmtAmt() {
        return escrwNewPmtAmt;
    }

    /**
     * Sets the value of the escrwNewPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwNewPmtAmtType }{@code >}
     *     
     */
    public void setEscrwNewPmtAmt(JAXBElement<EscrwNewPmtAmtType> value) {
        this.escrwNewPmtAmt = value;
    }

    /**
     * Gets the value of the escrwNewShtPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwNewShtPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwNewShtPmtAmtType> getEscrwNewShtPmtAmt() {
        return escrwNewShtPmtAmt;
    }

    /**
     * Sets the value of the escrwNewShtPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwNewShtPmtAmtType }{@code >}
     *     
     */
    public void setEscrwNewShtPmtAmt(JAXBElement<EscrwNewShtPmtAmtType> value) {
        this.escrwNewShtPmtAmt = value;
    }

    /**
     * Gets the value of the escrwAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwAccrIntType }{@code >}
     *     
     */
    public JAXBElement<EscrwAccrIntType> getEscrwAccrInt() {
        return escrwAccrInt;
    }

    /**
     * Sets the value of the escrwAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwAccrIntType }{@code >}
     *     
     */
    public void setEscrwAccrInt(JAXBElement<EscrwAccrIntType> value) {
        this.escrwAccrInt = value;
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
     * Gets the value of the escrwPayoffExclBalType property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPayoffExclBalTypeType }
     *     
     */
    public EscrwPayoffExclBalTypeType getEscrwPayoffExclBalType() {
        return escrwPayoffExclBalType;
    }

    /**
     * Sets the value of the escrwPayoffExclBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPayoffExclBalTypeType }
     *     
     */
    public void setEscrwPayoffExclBalType(EscrwPayoffExclBalTypeType value) {
        this.escrwPayoffExclBalType = value;
    }

    /**
     * Gets the value of the escrwPayoffExclIntType property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPayoffExclIntTypeType }
     *     
     */
    public EscrwPayoffExclIntTypeType getEscrwPayoffExclIntType() {
        return escrwPayoffExclIntType;
    }

    /**
     * Sets the value of the escrwPayoffExclIntType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPayoffExclIntTypeType }
     *     
     */
    public void setEscrwPayoffExclIntType(EscrwPayoffExclIntTypeType value) {
        this.escrwPayoffExclIntType = value;
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
