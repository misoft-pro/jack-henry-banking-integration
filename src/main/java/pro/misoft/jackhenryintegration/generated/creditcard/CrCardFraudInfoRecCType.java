
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardFraudInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardFraudInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FraudScore" type="{http://jackhenry.com/jxchange/TPG/2008}FraudScore_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudScoreDt" type="{http://jackhenry.com/jxchange/TPG/2008}FraudScoreDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudPlanCode" type="{http://jackhenry.com/jxchange/TPG/2008}FraudPlanCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSusDt" type="{http://jackhenry.com/jxchange/TPG/2008}FraudSusDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSuspPlanSuspStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}FraudPlanSuspDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSuspPlanSuspEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}FraudPlanSuspDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FraudSuspPlanCode" type="{http://jackhenry.com/jxchange/TPG/2008}FraudPlanCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardFraudInfoRec_CType", propOrder = {
    "fraudScore",
    "fraudScoreDt",
    "fraudPlanCode",
    "fraudSusDt",
    "fraudSuspPlanSuspStartDt",
    "fraudSuspPlanSuspEndDt",
    "fraudSuspPlanCode",
    "custom",
    "ver1",
    "any"
})
public class CrCardFraudInfoRecCType {

    @XmlElement(name = "FraudScore")
    protected FraudScoreType fraudScore;
    @XmlElement(name = "FraudScoreDt")
    protected FraudScoreDtType fraudScoreDt;
    @XmlElement(name = "FraudPlanCode")
    protected FraudPlanCodeType fraudPlanCode;
    @XmlElement(name = "FraudSusDt")
    protected FraudSusDtType fraudSusDt;
    @XmlElement(name = "FraudSuspPlanSuspStartDt")
    protected FraudPlanSuspDtType fraudSuspPlanSuspStartDt;
    @XmlElement(name = "FraudSuspPlanSuspEndDt")
    protected FraudPlanSuspDtType fraudSuspPlanSuspEndDt;
    @XmlElement(name = "FraudSuspPlanCode")
    protected FraudPlanCodeType fraudSuspPlanCode;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fraudScore property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScoreType }
     *     
     */
    public FraudScoreType getFraudScore() {
        return fraudScore;
    }

    /**
     * Sets the value of the fraudScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScoreType }
     *     
     */
    public void setFraudScore(FraudScoreType value) {
        this.fraudScore = value;
    }

    /**
     * Gets the value of the fraudScoreDt property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScoreDtType }
     *     
     */
    public FraudScoreDtType getFraudScoreDt() {
        return fraudScoreDt;
    }

    /**
     * Sets the value of the fraudScoreDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScoreDtType }
     *     
     */
    public void setFraudScoreDt(FraudScoreDtType value) {
        this.fraudScoreDt = value;
    }

    /**
     * Gets the value of the fraudPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPlanCodeType }
     *     
     */
    public FraudPlanCodeType getFraudPlanCode() {
        return fraudPlanCode;
    }

    /**
     * Sets the value of the fraudPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPlanCodeType }
     *     
     */
    public void setFraudPlanCode(FraudPlanCodeType value) {
        this.fraudPlanCode = value;
    }

    /**
     * Gets the value of the fraudSusDt property.
     * 
     * @return
     *     possible object is
     *     {@link FraudSusDtType }
     *     
     */
    public FraudSusDtType getFraudSusDt() {
        return fraudSusDt;
    }

    /**
     * Sets the value of the fraudSusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudSusDtType }
     *     
     */
    public void setFraudSusDt(FraudSusDtType value) {
        this.fraudSusDt = value;
    }

    /**
     * Gets the value of the fraudSuspPlanSuspStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public FraudPlanSuspDtType getFraudSuspPlanSuspStartDt() {
        return fraudSuspPlanSuspStartDt;
    }

    /**
     * Sets the value of the fraudSuspPlanSuspStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public void setFraudSuspPlanSuspStartDt(FraudPlanSuspDtType value) {
        this.fraudSuspPlanSuspStartDt = value;
    }

    /**
     * Gets the value of the fraudSuspPlanSuspEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public FraudPlanSuspDtType getFraudSuspPlanSuspEndDt() {
        return fraudSuspPlanSuspEndDt;
    }

    /**
     * Sets the value of the fraudSuspPlanSuspEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPlanSuspDtType }
     *     
     */
    public void setFraudSuspPlanSuspEndDt(FraudPlanSuspDtType value) {
        this.fraudSuspPlanSuspEndDt = value;
    }

    /**
     * Gets the value of the fraudSuspPlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link FraudPlanCodeType }
     *     
     */
    public FraudPlanCodeType getFraudSuspPlanCode() {
        return fraudSuspPlanCode;
    }

    /**
     * Sets the value of the fraudSuspPlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudPlanCodeType }
     *     
     */
    public void setFraudSuspPlanCode(FraudPlanCodeType value) {
        this.fraudSuspPlanCode = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
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
     * {@link Element }
     * {@link Object }
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
