
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
 * <p>Java class for InsurPayoffInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsurPayoffInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsurType" type="{http://jackhenry.com/jxchange/TPG/2008}InsurType_Type"/&gt;
 *         &lt;element name="InsurDesc" type="{http://jackhenry.com/jxchange/TPG/2008}InsurDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyPremium" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyPremium_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurRebate" type="{http://jackhenry.com/jxchange/TPG/2008}InsurRebate_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurAccrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurAccrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclInsurAmtType" type="{http://jackhenry.com/jxchange/TPG/2008}ExclInsurAmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomInsurPayoffRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "InsurPayoffInfo_CType", propOrder = {
    "insurType",
    "insurDesc",
    "insurPlcyPremium",
    "insurRebate",
    "insurAccrAmt",
    "exclInsurAmtType",
    "customInsurPayoffRec",
    "ver1",
    "any"
})
public class InsurPayoffInfoCType {

    @XmlElement(name = "InsurType", required = true)
    protected InsurTypeType insurType;
    @XmlElement(name = "InsurDesc")
    protected InsurDescType insurDesc;
    @XmlElement(name = "InsurPlcyPremium")
    protected InsurPlcyPremiumType insurPlcyPremium;
    @XmlElement(name = "InsurRebate")
    protected InsurRebateType insurRebate;
    @XmlElement(name = "InsurAccrAmt")
    protected InsurAccrAmtType insurAccrAmt;
    @XmlElement(name = "ExclInsurAmtType")
    protected ExclInsurAmtTypeType exclInsurAmtType;
    @XmlElement(name = "CustomInsurPayoffRec")
    protected CustomCType customInsurPayoffRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the insurType property.
     * 
     * @return
     *     possible object is
     *     {@link InsurTypeType }
     *     
     */
    public InsurTypeType getInsurType() {
        return insurType;
    }

    /**
     * Sets the value of the insurType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurTypeType }
     *     
     */
    public void setInsurType(InsurTypeType value) {
        this.insurType = value;
    }

    /**
     * Gets the value of the insurDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InsurDescType }
     *     
     */
    public InsurDescType getInsurDesc() {
        return insurDesc;
    }

    /**
     * Sets the value of the insurDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurDescType }
     *     
     */
    public void setInsurDesc(InsurDescType value) {
        this.insurDesc = value;
    }

    /**
     * Gets the value of the insurPlcyPremium property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyPremiumType }
     *     
     */
    public InsurPlcyPremiumType getInsurPlcyPremium() {
        return insurPlcyPremium;
    }

    /**
     * Sets the value of the insurPlcyPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyPremiumType }
     *     
     */
    public void setInsurPlcyPremium(InsurPlcyPremiumType value) {
        this.insurPlcyPremium = value;
    }

    /**
     * Gets the value of the insurRebate property.
     * 
     * @return
     *     possible object is
     *     {@link InsurRebateType }
     *     
     */
    public InsurRebateType getInsurRebate() {
        return insurRebate;
    }

    /**
     * Sets the value of the insurRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurRebateType }
     *     
     */
    public void setInsurRebate(InsurRebateType value) {
        this.insurRebate = value;
    }

    /**
     * Gets the value of the insurAccrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InsurAccrAmtType }
     *     
     */
    public InsurAccrAmtType getInsurAccrAmt() {
        return insurAccrAmt;
    }

    /**
     * Sets the value of the insurAccrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurAccrAmtType }
     *     
     */
    public void setInsurAccrAmt(InsurAccrAmtType value) {
        this.insurAccrAmt = value;
    }

    /**
     * Gets the value of the exclInsurAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link ExclInsurAmtTypeType }
     *     
     */
    public ExclInsurAmtTypeType getExclInsurAmtType() {
        return exclInsurAmtType;
    }

    /**
     * Sets the value of the exclInsurAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclInsurAmtTypeType }
     *     
     */
    public void setExclInsurAmtType(ExclInsurAmtTypeType value) {
        this.exclInsurAmtType = value;
    }

    /**
     * Gets the value of the customInsurPayoffRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomInsurPayoffRec() {
        return customInsurPayoffRec;
    }

    /**
     * Sets the value of the customInsurPayoffRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomInsurPayoffRec(CustomCType value) {
        this.customInsurPayoffRec = value;
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
