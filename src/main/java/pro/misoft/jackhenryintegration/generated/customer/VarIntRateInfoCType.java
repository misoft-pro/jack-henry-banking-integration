
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
 * <p>Java class for VarIntRateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarIntRateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimeRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}PrimeRateIdx_Type"/&gt;
 *         &lt;element name="RateVarCode" type="{http://jackhenry.com/jxchange/TPG/2008}RateVarCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateVar" type="{http://jackhenry.com/jxchange/TPG/2008}RateVar_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateFlr" type="{http://jackhenry.com/jxchange/TPG/2008}RateFlr_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateCeil" type="{http://jackhenry.com/jxchange/TPG/2008}RateCeil_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevTermUnits_Type" minOccurs="0"/&gt;
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
@XmlType(name = "VarIntRateInfo_CType", propOrder = {
    "primeRateIdx",
    "rateVarCode",
    "rateVar",
    "rateFlr",
    "rateCeil",
    "rateRevDt",
    "rateRevTerm",
    "rateRevTermUnits",
    "ver1",
    "any"
})
public class VarIntRateInfoCType {

    @XmlElement(name = "PrimeRateIdx", required = true)
    protected PrimeRateIdxType primeRateIdx;
    @XmlElement(name = "RateVarCode")
    protected RateVarCodeType rateVarCode;
    @XmlElement(name = "RateVar")
    protected RateVarType rateVar;
    @XmlElement(name = "RateFlr")
    protected RateFlrType rateFlr;
    @XmlElement(name = "RateCeil")
    protected RateCeilType rateCeil;
    @XmlElementRef(name = "RateRevDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RateRevDtType> rateRevDt;
    @XmlElement(name = "RateRevTerm")
    protected RateRevTermType rateRevTerm;
    @XmlElement(name = "RateRevTermUnits")
    protected RateRevTermUnitsType rateRevTermUnits;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the primeRateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeRateIdxType }
     *     
     */
    public PrimeRateIdxType getPrimeRateIdx() {
        return primeRateIdx;
    }

    /**
     * Sets the value of the primeRateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeRateIdxType }
     *     
     */
    public void setPrimeRateIdx(PrimeRateIdxType value) {
        this.primeRateIdx = value;
    }

    /**
     * Gets the value of the rateVarCode property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarCodeType }
     *     
     */
    public RateVarCodeType getRateVarCode() {
        return rateVarCode;
    }

    /**
     * Sets the value of the rateVarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarCodeType }
     *     
     */
    public void setRateVarCode(RateVarCodeType value) {
        this.rateVarCode = value;
    }

    /**
     * Gets the value of the rateVar property.
     * 
     * @return
     *     possible object is
     *     {@link RateVarType }
     *     
     */
    public RateVarType getRateVar() {
        return rateVar;
    }

    /**
     * Sets the value of the rateVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateVarType }
     *     
     */
    public void setRateVar(RateVarType value) {
        this.rateVar = value;
    }

    /**
     * Gets the value of the rateFlr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFlrType }
     *     
     */
    public RateFlrType getRateFlr() {
        return rateFlr;
    }

    /**
     * Sets the value of the rateFlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFlrType }
     *     
     */
    public void setRateFlr(RateFlrType value) {
        this.rateFlr = value;
    }

    /**
     * Gets the value of the rateCeil property.
     * 
     * @return
     *     possible object is
     *     {@link RateCeilType }
     *     
     */
    public RateCeilType getRateCeil() {
        return rateCeil;
    }

    /**
     * Sets the value of the rateCeil property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCeilType }
     *     
     */
    public void setRateCeil(RateCeilType value) {
        this.rateCeil = value;
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
     * Gets the value of the rateRevTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevTermType }
     *     
     */
    public RateRevTermType getRateRevTerm() {
        return rateRevTerm;
    }

    /**
     * Sets the value of the rateRevTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevTermType }
     *     
     */
    public void setRateRevTerm(RateRevTermType value) {
        this.rateRevTerm = value;
    }

    /**
     * Gets the value of the rateRevTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevTermUnitsType }
     *     
     */
    public RateRevTermUnitsType getRateRevTermUnits() {
        return rateRevTermUnits;
    }

    /**
     * Sets the value of the rateRevTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevTermUnitsType }
     *     
     */
    public void setRateRevTermUnits(RateRevTermUnitsType value) {
        this.rateRevTermUnits = value;
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
