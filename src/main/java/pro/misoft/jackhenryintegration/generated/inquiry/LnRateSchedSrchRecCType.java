
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnRateSchedSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRateSchedSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateRevStat" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}RateRevDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewRate" type="{http://jackhenry.com/jxchange/TPG/2008}NewRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewRateEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}NewRateEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrimeRateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}PrimeRateIdx_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnRateSchedSrchRec_CType", propOrder = {
    "rateRevStat",
    "rateRevDt",
    "newRate",
    "newRateEffDt",
    "primeRateIdx",
    "lnUnitId",
    "ver1",
    "any"
})
public class LnRateSchedSrchRecCType {

    @XmlElement(name = "RateRevStat")
    protected RateRevStatType rateRevStat;
    @XmlElement(name = "RateRevDt")
    protected RateRevDtType rateRevDt;
    @XmlElement(name = "NewRate")
    protected NewRateType newRate;
    @XmlElement(name = "NewRateEffDt")
    protected NewRateEffDtType newRateEffDt;
    @XmlElement(name = "PrimeRateIdx")
    protected PrimeRateIdxType primeRateIdx;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rateRevStat property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevStatType }
     *     
     */
    public RateRevStatType getRateRevStat() {
        return rateRevStat;
    }

    /**
     * Sets the value of the rateRevStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevStatType }
     *     
     */
    public void setRateRevStat(RateRevStatType value) {
        this.rateRevStat = value;
    }

    /**
     * Gets the value of the rateRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link RateRevDtType }
     *     
     */
    public RateRevDtType getRateRevDt() {
        return rateRevDt;
    }

    /**
     * Sets the value of the rateRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRevDtType }
     *     
     */
    public void setRateRevDt(RateRevDtType value) {
        this.rateRevDt = value;
    }

    /**
     * Gets the value of the newRate property.
     * 
     * @return
     *     possible object is
     *     {@link NewRateType }
     *     
     */
    public NewRateType getNewRate() {
        return newRate;
    }

    /**
     * Sets the value of the newRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRateType }
     *     
     */
    public void setNewRate(NewRateType value) {
        this.newRate = value;
    }

    /**
     * Gets the value of the newRateEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link NewRateEffDtType }
     *     
     */
    public NewRateEffDtType getNewRateEffDt() {
        return newRateEffDt;
    }

    /**
     * Sets the value of the newRateEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRateEffDtType }
     *     
     */
    public void setNewRateEffDt(NewRateEffDtType value) {
        this.newRateEffDt = value;
    }

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
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setLnUnitId(LnUnitIdType value) {
        this.lnUnitId = value;
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
