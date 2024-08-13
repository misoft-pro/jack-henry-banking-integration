
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
 * <p>Java class for x_DepRateIntInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_DepRateIntInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtIntChkDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtIntChkDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayIntEOMDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PayIntEOMDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AccrIntThruDt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrIntThruDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="TeaserRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="AnnPctYield" type="{http://jackhenry.com/jxchange/TPG/2008}AnnPctYield_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "x_DepRateIntInfo_CType", propOrder = {
    "depRateIntInfo",
    "accrInt",
    "prtIntChkDesc",
    "payIntEOMDesc",
    "custom",
    "ver1",
    "accrIntThruDt",
    "ver2",
    "teaserRateDesc",
    "ver3",
    "annPctYield",
    "ver4",
    "any"
})
public class XDepRateIntInfoCType {

    @XmlElement(name = "DepRateIntInfo")
    protected DepRateIntInfoCType depRateIntInfo;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "PrtIntChkDesc")
    protected PrtIntChkDescType prtIntChkDesc;
    @XmlElement(name = "PayIntEOMDesc")
    protected PayIntEOMDescType payIntEOMDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AccrIntThruDt")
    protected AccrIntThruDtType accrIntThruDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "TeaserRateDesc")
    protected TeaserRateDescType teaserRateDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "AnnPctYield")
    protected AnnPctYieldType annPctYield;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepRateIntInfoCType }
     *     
     */
    public DepRateIntInfoCType getDepRateIntInfo() {
        return depRateIntInfo;
    }

    /**
     * Sets the value of the depRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepRateIntInfoCType }
     *     
     */
    public void setDepRateIntInfo(DepRateIntInfoCType value) {
        this.depRateIntInfo = value;
    }

    /**
     * Gets the value of the accrInt property.
     * 
     * @return
     *     possible object is
     *     {@link AccrIntType }
     *     
     */
    public AccrIntType getAccrInt() {
        return accrInt;
    }

    /**
     * Sets the value of the accrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrIntType }
     *     
     */
    public void setAccrInt(AccrIntType value) {
        this.accrInt = value;
    }

    /**
     * Gets the value of the prtIntChkDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtIntChkDescType }
     *     
     */
    public PrtIntChkDescType getPrtIntChkDesc() {
        return prtIntChkDesc;
    }

    /**
     * Sets the value of the prtIntChkDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtIntChkDescType }
     *     
     */
    public void setPrtIntChkDesc(PrtIntChkDescType value) {
        this.prtIntChkDesc = value;
    }

    /**
     * Gets the value of the payIntEOMDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PayIntEOMDescType }
     *     
     */
    public PayIntEOMDescType getPayIntEOMDesc() {
        return payIntEOMDesc;
    }

    /**
     * Sets the value of the payIntEOMDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayIntEOMDescType }
     *     
     */
    public void setPayIntEOMDesc(PayIntEOMDescType value) {
        this.payIntEOMDesc = value;
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
     * Gets the value of the accrIntThruDt property.
     * 
     * @return
     *     possible object is
     *     {@link AccrIntThruDtType }
     *     
     */
    public AccrIntThruDtType getAccrIntThruDt() {
        return accrIntThruDt;
    }

    /**
     * Sets the value of the accrIntThruDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrIntThruDtType }
     *     
     */
    public void setAccrIntThruDt(AccrIntThruDtType value) {
        this.accrIntThruDt = value;
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
     * Gets the value of the teaserRateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TeaserRateDescType }
     *     
     */
    public TeaserRateDescType getTeaserRateDesc() {
        return teaserRateDesc;
    }

    /**
     * Sets the value of the teaserRateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeaserRateDescType }
     *     
     */
    public void setTeaserRateDesc(TeaserRateDescType value) {
        this.teaserRateDesc = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
    }

    /**
     * Gets the value of the annPctYield property.
     * 
     * @return
     *     possible object is
     *     {@link AnnPctYieldType }
     *     
     */
    public AnnPctYieldType getAnnPctYield() {
        return annPctYield;
    }

    /**
     * Sets the value of the annPctYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnPctYieldType }
     *     
     */
    public void setAnnPctYield(AnnPctYieldType value) {
        this.annPctYield = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
