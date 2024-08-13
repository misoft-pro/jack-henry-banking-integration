
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
 * <p>Java class for x_LnRealEstateInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnRealEstateInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnRealEstateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRealEstateInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="FloodInsurDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FloodInsurDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ConstLnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ConstLnDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CorrBankDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CorrBankDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="OccupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OccupDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="ProjectDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProjectDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CollatSrcValDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatSrcValDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnRealEstateInfo_CType", propOrder = {
    "lnRealEstateInfo",
    "floodInsurDesc",
    "custom",
    "ver1",
    "constLnDesc",
    "corrBankDesc",
    "occupDesc",
    "projectDesc",
    "ver2",
    "collatSrcValDesc",
    "ver3",
    "any"
})
public class XLnRealEstateInfoCType {

    @XmlElement(name = "LnRealEstateInfo")
    protected LnRealEstateInfoCType lnRealEstateInfo;
    @XmlElement(name = "FloodInsurDesc")
    protected FloodInsurDescType floodInsurDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ConstLnDesc")
    protected ConstLnDescType constLnDesc;
    @XmlElement(name = "CorrBankDesc")
    protected CorrBankDescType corrBankDesc;
    @XmlElement(name = "OccupDesc")
    protected OccupDescType occupDesc;
    @XmlElement(name = "ProjectDesc")
    protected ProjectDescType projectDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CollatSrcValDesc")
    protected CollatSrcValDescType collatSrcValDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnRealEstateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnRealEstateInfoCType }
     *     
     */
    public LnRealEstateInfoCType getLnRealEstateInfo() {
        return lnRealEstateInfo;
    }

    /**
     * Sets the value of the lnRealEstateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRealEstateInfoCType }
     *     
     */
    public void setLnRealEstateInfo(LnRealEstateInfoCType value) {
        this.lnRealEstateInfo = value;
    }

    /**
     * Gets the value of the floodInsurDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FloodInsurDescType }
     *     
     */
    public FloodInsurDescType getFloodInsurDesc() {
        return floodInsurDesc;
    }

    /**
     * Sets the value of the floodInsurDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloodInsurDescType }
     *     
     */
    public void setFloodInsurDesc(FloodInsurDescType value) {
        this.floodInsurDesc = value;
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
     * Gets the value of the constLnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ConstLnDescType }
     *     
     */
    public ConstLnDescType getConstLnDesc() {
        return constLnDesc;
    }

    /**
     * Sets the value of the constLnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstLnDescType }
     *     
     */
    public void setConstLnDesc(ConstLnDescType value) {
        this.constLnDesc = value;
    }

    /**
     * Gets the value of the corrBankDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CorrBankDescType }
     *     
     */
    public CorrBankDescType getCorrBankDesc() {
        return corrBankDesc;
    }

    /**
     * Sets the value of the corrBankDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrBankDescType }
     *     
     */
    public void setCorrBankDesc(CorrBankDescType value) {
        this.corrBankDesc = value;
    }

    /**
     * Gets the value of the occupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OccupDescType }
     *     
     */
    public OccupDescType getOccupDesc() {
        return occupDesc;
    }

    /**
     * Sets the value of the occupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupDescType }
     *     
     */
    public void setOccupDesc(OccupDescType value) {
        this.occupDesc = value;
    }

    /**
     * Gets the value of the projectDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectDescType }
     *     
     */
    public ProjectDescType getProjectDesc() {
        return projectDesc;
    }

    /**
     * Sets the value of the projectDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectDescType }
     *     
     */
    public void setProjectDesc(ProjectDescType value) {
        this.projectDesc = value;
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
     * Gets the value of the collatSrcValDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatSrcValDescType }
     *     
     */
    public CollatSrcValDescType getCollatSrcValDesc() {
        return collatSrcValDesc;
    }

    /**
     * Sets the value of the collatSrcValDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatSrcValDescType }
     *     
     */
    public void setCollatSrcValDesc(CollatSrcValDescType value) {
        this.collatSrcValDesc = value;
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
