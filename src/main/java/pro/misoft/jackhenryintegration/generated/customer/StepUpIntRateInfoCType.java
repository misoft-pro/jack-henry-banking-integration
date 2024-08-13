
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
 * <p>Java class for StepUpIntRateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StepUpIntRateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StepUpIntRateText" type="{http://jackhenry.com/jxchange/TPG/2008}StepUpIntRateText_Type" minOccurs="0"/&gt;
 *         &lt;element name="StepUpIntRate" type="{http://jackhenry.com/jxchange/TPG/2008}StepUpIntRate_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RateRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrimeRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}PrimeRateIdx_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *           &lt;element name="RateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "StepUpIntRateInfo_CType", propOrder = {
    "stepUpIntRateText",
    "stepUpIntRate",
    "ver1",
    "rateRevDt",
    "primeRateIdx",
    "rateVar",
    "rateVarCode",
    "ver2",
    "any"
})
public class StepUpIntRateInfoCType {

    @XmlElementRef(name = "StepUpIntRateText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StepUpIntRateTextType> stepUpIntRateText;
    @XmlElementRef(name = "StepUpIntRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StepUpIntRateType> stepUpIntRate;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "RateRevDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRevDtType> rateRevDt;
    @XmlElementRef(name = "PrimeRateIdx", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrimeRateIdxType> primeRateIdx;
    @XmlElementRef(name = "RateVar", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateVarType> rateVar;
    @XmlElementRef(name = "RateVarCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateVarCodeType> rateVarCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the stepUpIntRateText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StepUpIntRateTextType }{@code >}
     *     
     */
    public JAXBElement<StepUpIntRateTextType> getStepUpIntRateText() {
        return stepUpIntRateText;
    }

    /**
     * Sets the value of the stepUpIntRateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StepUpIntRateTextType }{@code >}
     *     
     */
    public void setStepUpIntRateText(JAXBElement<StepUpIntRateTextType> value) {
        this.stepUpIntRateText = value;
    }

    /**
     * Gets the value of the stepUpIntRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StepUpIntRateType }{@code >}
     *     
     */
    public JAXBElement<StepUpIntRateType> getStepUpIntRate() {
        return stepUpIntRate;
    }

    /**
     * Sets the value of the stepUpIntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StepUpIntRateType }{@code >}
     *     
     */
    public void setStepUpIntRate(JAXBElement<StepUpIntRateType> value) {
        this.stepUpIntRate = value;
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
     * Gets the value of the rateRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateRevDtType }{@code >}
     *     
     */
    public JAXBElement<RateRevDtType> getRateRevDt() {
        return rateRevDt;
    }

    /**
     * Sets the value of the rateRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateRevDtType }{@code >}
     *     
     */
    public void setRateRevDt(JAXBElement<RateRevDtType> value) {
        this.rateRevDt = value;
    }

    /**
     * Gets the value of the primeRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimeRateIdxType }{@code >}
     *     
     */
    public JAXBElement<PrimeRateIdxType> getPrimeRateIdx() {
        return primeRateIdx;
    }

    /**
     * Sets the value of the primeRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimeRateIdxType }{@code >}
     *     
     */
    public void setPrimeRateIdx(JAXBElement<PrimeRateIdxType> value) {
        this.primeRateIdx = value;
    }

    /**
     * Gets the value of the rateVar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateVarType }{@code >}
     *     
     */
    public JAXBElement<RateVarType> getRateVar() {
        return rateVar;
    }

    /**
     * Sets the value of the rateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateVarType }{@code >}
     *     
     */
    public void setRateVar(JAXBElement<RateVarType> value) {
        this.rateVar = value;
    }

    /**
     * Gets the value of the rateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RateVarCodeType }{@code >}
     *     
     */
    public JAXBElement<RateVarCodeType> getRateVarCode() {
        return rateVarCode;
    }

    /**
     * Sets the value of the rateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RateVarCodeType }{@code >}
     *     
     */
    public void setRateVarCode(JAXBElement<RateVarCodeType> value) {
        this.rateVarCode = value;
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
