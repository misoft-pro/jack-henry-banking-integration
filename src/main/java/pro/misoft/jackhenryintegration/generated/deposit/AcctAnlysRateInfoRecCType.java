
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
 * <p>Java class for AcctAnlysRateInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysRateInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctAnlysRateType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysRateType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TierBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateLvlAlgSymb" type="{http://jackhenry.com/jxchange/TPG/2008}RateLvlAlgSymb_Type" minOccurs="0"/&gt;
 *         &lt;element name="RateIdx" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdx_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAnlysRateInfoRec_CType", propOrder = {
    "acctAnlysRateType",
    "tierBalAmt",
    "rateLvlAlgSymb",
    "rateIdx",
    "ver1",
    "any"
})
public class AcctAnlysRateInfoRecCType {

    @XmlElement(name = "AcctAnlysRateType")
    protected AcctAnlysRateTypeType acctAnlysRateType;
    @XmlElement(name = "TierBalAmt")
    protected TierBalAmtType tierBalAmt;
    @XmlElement(name = "RateLvlAlgSymb")
    protected RateLvlAlgSymbType rateLvlAlgSymb;
    @XmlElement(name = "RateIdx")
    protected RateIdxType rateIdx;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctAnlysRateType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysRateTypeType }
     *     
     */
    public AcctAnlysRateTypeType getAcctAnlysRateType() {
        return acctAnlysRateType;
    }

    /**
     * Sets the value of the acctAnlysRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysRateTypeType }
     *     
     */
    public void setAcctAnlysRateType(AcctAnlysRateTypeType value) {
        this.acctAnlysRateType = value;
    }

    /**
     * Gets the value of the tierBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TierBalAmtType }
     *     
     */
    public TierBalAmtType getTierBalAmt() {
        return tierBalAmt;
    }

    /**
     * Sets the value of the tierBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierBalAmtType }
     *     
     */
    public void setTierBalAmt(TierBalAmtType value) {
        this.tierBalAmt = value;
    }

    /**
     * Gets the value of the rateLvlAlgSymb property.
     * 
     * @return
     *     possible object is
     *     {@link RateLvlAlgSymbType }
     *     
     */
    public RateLvlAlgSymbType getRateLvlAlgSymb() {
        return rateLvlAlgSymb;
    }

    /**
     * Sets the value of the rateLvlAlgSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateLvlAlgSymbType }
     *     
     */
    public void setRateLvlAlgSymb(RateLvlAlgSymbType value) {
        this.rateLvlAlgSymb = value;
    }

    /**
     * Gets the value of the rateIdx property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxType }
     *     
     */
    public RateIdxType getRateIdx() {
        return rateIdx;
    }

    /**
     * Sets the value of the rateIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxType }
     *     
     */
    public void setRateIdx(RateIdxType value) {
        this.rateIdx = value;
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
