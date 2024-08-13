
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for x_RegDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_RegDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegDetail" type="{http://jackhenry.com/jxchange/TPG/2008}RegDetail_CType" minOccurs="0"/&gt;
 *         &lt;element name="DoNotCallDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DoNotCallDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegPOptOutDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RegPOptOutDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflOptOutDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AflOptOutDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AflOptOutExcptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AflOptOutExcptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RiskRateByDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RiskRateByDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BenflOwnExclDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BenflOwnExclDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="ExcPctRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcPctRsnDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_RegDetail_CType", propOrder = {
    "regDetail",
    "doNotCallDesc",
    "regPOptOutDesc",
    "aflOptOutDesc",
    "aflOptOutExcptDesc",
    "riskRateDesc",
    "riskRateByDesc",
    "ver1",
    "benflOwnExclDesc",
    "excPctRsnDesc",
    "ver2",
    "any"
})
public class XRegDetailCType {

    @XmlElement(name = "RegDetail")
    protected RegDetailCType regDetail;
    @XmlElement(name = "DoNotCallDesc")
    protected DoNotCallDescType doNotCallDesc;
    @XmlElement(name = "RegPOptOutDesc")
    protected RegPOptOutDescType regPOptOutDesc;
    @XmlElement(name = "AflOptOutDesc")
    protected AflOptOutDescType aflOptOutDesc;
    @XmlElement(name = "AflOptOutExcptDesc")
    protected AflOptOutExcptDescType aflOptOutExcptDesc;
    @XmlElement(name = "RiskRateDesc")
    protected RiskRateDescType riskRateDesc;
    @XmlElement(name = "RiskRateByDesc")
    protected RiskRateByDescType riskRateByDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BenflOwnExclDesc")
    protected BenflOwnExclDescType benflOwnExclDesc;
    @XmlElement(name = "ExcPctRsnDesc")
    protected ExcPctRsnDescType excPctRsnDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the regDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RegDetailCType }
     *     
     */
    public RegDetailCType getRegDetail() {
        return regDetail;
    }

    /**
     * Sets the value of the regDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegDetailCType }
     *     
     */
    public void setRegDetail(RegDetailCType value) {
        this.regDetail = value;
    }

    /**
     * Gets the value of the doNotCallDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DoNotCallDescType }
     *     
     */
    public DoNotCallDescType getDoNotCallDesc() {
        return doNotCallDesc;
    }

    /**
     * Sets the value of the doNotCallDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoNotCallDescType }
     *     
     */
    public void setDoNotCallDesc(DoNotCallDescType value) {
        this.doNotCallDesc = value;
    }

    /**
     * Gets the value of the regPOptOutDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RegPOptOutDescType }
     *     
     */
    public RegPOptOutDescType getRegPOptOutDesc() {
        return regPOptOutDesc;
    }

    /**
     * Sets the value of the regPOptOutDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegPOptOutDescType }
     *     
     */
    public void setRegPOptOutDesc(RegPOptOutDescType value) {
        this.regPOptOutDesc = value;
    }

    /**
     * Gets the value of the aflOptOutDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AflOptOutDescType }
     *     
     */
    public AflOptOutDescType getAflOptOutDesc() {
        return aflOptOutDesc;
    }

    /**
     * Sets the value of the aflOptOutDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflOptOutDescType }
     *     
     */
    public void setAflOptOutDesc(AflOptOutDescType value) {
        this.aflOptOutDesc = value;
    }

    /**
     * Gets the value of the aflOptOutExcptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AflOptOutExcptDescType }
     *     
     */
    public AflOptOutExcptDescType getAflOptOutExcptDesc() {
        return aflOptOutExcptDesc;
    }

    /**
     * Sets the value of the aflOptOutExcptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AflOptOutExcptDescType }
     *     
     */
    public void setAflOptOutExcptDesc(AflOptOutExcptDescType value) {
        this.aflOptOutExcptDesc = value;
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
     * Gets the value of the riskRateByDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRateByDescType }
     *     
     */
    public RiskRateByDescType getRiskRateByDesc() {
        return riskRateByDesc;
    }

    /**
     * Sets the value of the riskRateByDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRateByDescType }
     *     
     */
    public void setRiskRateByDesc(RiskRateByDescType value) {
        this.riskRateByDesc = value;
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
     * Gets the value of the benflOwnExclDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BenflOwnExclDescType }
     *     
     */
    public BenflOwnExclDescType getBenflOwnExclDesc() {
        return benflOwnExclDesc;
    }

    /**
     * Sets the value of the benflOwnExclDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenflOwnExclDescType }
     *     
     */
    public void setBenflOwnExclDesc(BenflOwnExclDescType value) {
        this.benflOwnExclDesc = value;
    }

    /**
     * Gets the value of the excPctRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcPctRsnDescType }
     *     
     */
    public ExcPctRsnDescType getExcPctRsnDesc() {
        return excPctRsnDesc;
    }

    /**
     * Sets the value of the excPctRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcPctRsnDescType }
     *     
     */
    public void setExcPctRsnDesc(ExcPctRsnDescType value) {
        this.excPctRsnDesc = value;
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
