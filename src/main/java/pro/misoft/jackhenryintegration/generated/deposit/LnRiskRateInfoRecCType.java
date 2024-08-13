
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
 * <p>Java class for LnRiskRateInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRiskRateInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RiskRateText" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateText_Type"/&gt;
 *         &lt;element name="RiskRateCode" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRatePct" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRatePct_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRateAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnRiskRateInfoRec_CType", propOrder = {
    "riskRateText",
    "riskRateCode",
    "riskRateDesc",
    "riskRatePct",
    "riskRateAmt",
    "ver1",
    "any"
})
public class LnRiskRateInfoRecCType {

    @XmlElement(name = "RiskRateText", required = true)
    protected RiskRateTextType riskRateText;
    @XmlElement(name = "RiskRateCode")
    protected RiskRateCodeType riskRateCode;
    @XmlElement(name = "RiskRateDesc")
    protected RiskRateDescType riskRateDesc;
    @XmlElement(name = "RiskRatePct")
    protected RiskRatePctType riskRatePct;
    @XmlElement(name = "RiskRateAmt")
    protected RiskRateAmtType riskRateAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the riskRateText property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRateTextType }
     *     
     */
    public RiskRateTextType getRiskRateText() {
        return riskRateText;
    }

    /**
     * Sets the value of the riskRateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRateTextType }
     *     
     */
    public void setRiskRateText(RiskRateTextType value) {
        this.riskRateText = value;
    }

    /**
     * Gets the value of the riskRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRateCodeType }
     *     
     */
    public RiskRateCodeType getRiskRateCode() {
        return riskRateCode;
    }

    /**
     * Sets the value of the riskRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRateCodeType }
     *     
     */
    public void setRiskRateCode(RiskRateCodeType value) {
        this.riskRateCode = value;
    }

    /**
     * Gets the value of the riskRateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRateDescType }
     *     
     */
    public RiskRateDescType getRiskRateDesc() {
        return riskRateDesc;
    }

    /**
     * Sets the value of the riskRateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRateDescType }
     *     
     */
    public void setRiskRateDesc(RiskRateDescType value) {
        this.riskRateDesc = value;
    }

    /**
     * Gets the value of the riskRatePct property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRatePctType }
     *     
     */
    public RiskRatePctType getRiskRatePct() {
        return riskRatePct;
    }

    /**
     * Sets the value of the riskRatePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRatePctType }
     *     
     */
    public void setRiskRatePct(RiskRatePctType value) {
        this.riskRatePct = value;
    }

    /**
     * Gets the value of the riskRateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRateAmtType }
     *     
     */
    public RiskRateAmtType getRiskRateAmt() {
        return riskRateAmt;
    }

    /**
     * Sets the value of the riskRateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRateAmtType }
     *     
     */
    public void setRiskRateAmt(RiskRateAmtType value) {
        this.riskRateAmt = value;
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
