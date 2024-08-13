
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
 * <p>Java class for x_LnRateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnRateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="RateIdxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RateIdxDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrevRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrevRateDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewPrevRateChgDtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}NewPrevRateChgDtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConvVarDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ConvVarDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConvARMDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ConvARMDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TeaserRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PrtRateChgNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRateChgNotDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnRateInfo_CType", propOrder = {
    "lnRateInfo",
    "rateIdxDesc",
    "newPrevRateDesc",
    "newPrevRateChgDtDesc",
    "convVarDesc",
    "convARMDesc",
    "custom",
    "ver1",
    "teaserRateDesc",
    "ver2",
    "prtRateChgNotDesc",
    "ver3",
    "any"
})
public class XLnRateInfoCType {

    @XmlElement(name = "LnRateInfo")
    protected LnRateInfoCType lnRateInfo;
    @XmlElement(name = "RateIdxDesc")
    protected RateIdxDescType rateIdxDesc;
    @XmlElement(name = "NewPrevRateDesc")
    protected NewPrevRateDescType newPrevRateDesc;
    @XmlElement(name = "NewPrevRateChgDtDesc")
    protected NewPrevRateChgDtDescType newPrevRateChgDtDesc;
    @XmlElement(name = "ConvVarDesc")
    protected ConvVarDescType convVarDesc;
    @XmlElement(name = "ConvARMDesc")
    protected ConvARMDescType convARMDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TeaserRateDesc")
    protected TeaserRateDescType teaserRateDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PrtRateChgNotDesc")
    protected PrtRateChgNotDescType prtRateChgNotDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnRateInfoCType }
     *     
     */
    public LnRateInfoCType getLnRateInfo() {
        return lnRateInfo;
    }

    /**
     * Sets the value of the lnRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRateInfoCType }
     *     
     */
    public void setLnRateInfo(LnRateInfoCType value) {
        this.lnRateInfo = value;
    }

    /**
     * Gets the value of the rateIdxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RateIdxDescType }
     *     
     */
    public RateIdxDescType getRateIdxDesc() {
        return rateIdxDesc;
    }

    /**
     * Sets the value of the rateIdxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIdxDescType }
     *     
     */
    public void setRateIdxDesc(RateIdxDescType value) {
        this.rateIdxDesc = value;
    }

    /**
     * Gets the value of the newPrevRateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link NewPrevRateDescType }
     *     
     */
    public NewPrevRateDescType getNewPrevRateDesc() {
        return newPrevRateDesc;
    }

    /**
     * Sets the value of the newPrevRateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPrevRateDescType }
     *     
     */
    public void setNewPrevRateDesc(NewPrevRateDescType value) {
        this.newPrevRateDesc = value;
    }

    /**
     * Gets the value of the newPrevRateChgDtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link NewPrevRateChgDtDescType }
     *     
     */
    public NewPrevRateChgDtDescType getNewPrevRateChgDtDesc() {
        return newPrevRateChgDtDesc;
    }

    /**
     * Sets the value of the newPrevRateChgDtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPrevRateChgDtDescType }
     *     
     */
    public void setNewPrevRateChgDtDesc(NewPrevRateChgDtDescType value) {
        this.newPrevRateChgDtDesc = value;
    }

    /**
     * Gets the value of the convVarDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ConvVarDescType }
     *     
     */
    public ConvVarDescType getConvVarDesc() {
        return convVarDesc;
    }

    /**
     * Sets the value of the convVarDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvVarDescType }
     *     
     */
    public void setConvVarDesc(ConvVarDescType value) {
        this.convVarDesc = value;
    }

    /**
     * Gets the value of the convARMDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ConvARMDescType }
     *     
     */
    public ConvARMDescType getConvARMDesc() {
        return convARMDesc;
    }

    /**
     * Sets the value of the convARMDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvARMDescType }
     *     
     */
    public void setConvARMDesc(ConvARMDescType value) {
        this.convARMDesc = value;
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
     * Gets the value of the prtRateChgNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtRateChgNotDescType }
     *     
     */
    public PrtRateChgNotDescType getPrtRateChgNotDesc() {
        return prtRateChgNotDesc;
    }

    /**
     * Sets the value of the prtRateChgNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtRateChgNotDescType }
     *     
     */
    public void setPrtRateChgNotDesc(PrtRateChgNotDescType value) {
        this.prtRateChgNotDesc = value;
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
