
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
 * <p>Java class for x_LnRegRptInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnRegRptInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="NAICSDesc" type="{http://jackhenry.com/jxchange/TPG/2008}NAICSDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ExclRealEstateRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExclRealEstateRptDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="ARGOProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ARGOProdDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="RegLTVDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RegLTVDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="RegSeniorLienDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RegSeniorLienDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="RegRptConvARMDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RegRptConvARMDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="SCRANotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SCRANotDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="GroupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GroupDesc_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="LienPositDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LienPositDesc_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "x_LnRegRptInfo_CType", propOrder = {
    "lnRegRptInfo",
    "naicsDesc",
    "callRptDesc",
    "custom",
    "ver1",
    "exclRealEstateRptDesc",
    "argoProdDesc",
    "regLTVDesc",
    "regSeniorLienDesc",
    "regRptConvARMDesc",
    "ver2",
    "scraNotDesc",
    "ver3",
    "groupDesc",
    "ver4",
    "lienPositDesc",
    "ver5",
    "any"
})
public class XLnRegRptInfoCType {

    @XmlElement(name = "LnRegRptInfo")
    protected LnRegRptInfoCType lnRegRptInfo;
    @XmlElement(name = "NAICSDesc")
    protected NAICSDescType naicsDesc;
    @XmlElement(name = "CallRptDesc")
    protected CallRptDescType callRptDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ExclRealEstateRptDesc")
    protected ExclRealEstateRptDescType exclRealEstateRptDesc;
    @XmlElement(name = "ARGOProdDesc")
    protected ARGOProdDescType argoProdDesc;
    @XmlElement(name = "RegLTVDesc")
    protected RegLTVDescType regLTVDesc;
    @XmlElement(name = "RegSeniorLienDesc")
    protected RegSeniorLienDescType regSeniorLienDesc;
    @XmlElement(name = "RegRptConvARMDesc")
    protected RegRptConvARMDescType regRptConvARMDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "SCRANotDesc")
    protected SCRANotDescType scraNotDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "GroupDesc")
    protected GroupDescType groupDesc;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "LienPositDesc")
    protected LienPositDescType lienPositDesc;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnRegRptInfoCType }
     *     
     */
    public LnRegRptInfoCType getLnRegRptInfo() {
        return lnRegRptInfo;
    }

    /**
     * Sets the value of the lnRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnRegRptInfoCType }
     *     
     */
    public void setLnRegRptInfo(LnRegRptInfoCType value) {
        this.lnRegRptInfo = value;
    }

    /**
     * Gets the value of the naicsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link NAICSDescType }
     *     
     */
    public NAICSDescType getNAICSDesc() {
        return naicsDesc;
    }

    /**
     * Sets the value of the naicsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAICSDescType }
     *     
     */
    public void setNAICSDesc(NAICSDescType value) {
        this.naicsDesc = value;
    }

    /**
     * Gets the value of the callRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getCallRptDesc() {
        return callRptDesc;
    }

    /**
     * Sets the value of the callRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setCallRptDesc(CallRptDescType value) {
        this.callRptDesc = value;
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
     * Gets the value of the exclRealEstateRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExclRealEstateRptDescType }
     *     
     */
    public ExclRealEstateRptDescType getExclRealEstateRptDesc() {
        return exclRealEstateRptDesc;
    }

    /**
     * Sets the value of the exclRealEstateRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclRealEstateRptDescType }
     *     
     */
    public void setExclRealEstateRptDesc(ExclRealEstateRptDescType value) {
        this.exclRealEstateRptDesc = value;
    }

    /**
     * Gets the value of the argoProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ARGOProdDescType }
     *     
     */
    public ARGOProdDescType getARGOProdDesc() {
        return argoProdDesc;
    }

    /**
     * Sets the value of the argoProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARGOProdDescType }
     *     
     */
    public void setARGOProdDesc(ARGOProdDescType value) {
        this.argoProdDesc = value;
    }

    /**
     * Gets the value of the regLTVDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RegLTVDescType }
     *     
     */
    public RegLTVDescType getRegLTVDesc() {
        return regLTVDesc;
    }

    /**
     * Sets the value of the regLTVDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegLTVDescType }
     *     
     */
    public void setRegLTVDesc(RegLTVDescType value) {
        this.regLTVDesc = value;
    }

    /**
     * Gets the value of the regSeniorLienDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RegSeniorLienDescType }
     *     
     */
    public RegSeniorLienDescType getRegSeniorLienDesc() {
        return regSeniorLienDesc;
    }

    /**
     * Sets the value of the regSeniorLienDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegSeniorLienDescType }
     *     
     */
    public void setRegSeniorLienDesc(RegSeniorLienDescType value) {
        this.regSeniorLienDesc = value;
    }

    /**
     * Gets the value of the regRptConvARMDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RegRptConvARMDescType }
     *     
     */
    public RegRptConvARMDescType getRegRptConvARMDesc() {
        return regRptConvARMDesc;
    }

    /**
     * Sets the value of the regRptConvARMDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegRptConvARMDescType }
     *     
     */
    public void setRegRptConvARMDesc(RegRptConvARMDescType value) {
        this.regRptConvARMDesc = value;
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
     * Gets the value of the scraNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SCRANotDescType }
     *     
     */
    public SCRANotDescType getSCRANotDesc() {
        return scraNotDesc;
    }

    /**
     * Sets the value of the scraNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCRANotDescType }
     *     
     */
    public void setSCRANotDesc(SCRANotDescType value) {
        this.scraNotDesc = value;
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
     * Gets the value of the groupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GroupDescType }
     *     
     */
    public GroupDescType getGroupDesc() {
        return groupDesc;
    }

    /**
     * Sets the value of the groupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDescType }
     *     
     */
    public void setGroupDesc(GroupDescType value) {
        this.groupDesc = value;
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
     * Gets the value of the lienPositDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LienPositDescType }
     *     
     */
    public LienPositDescType getLienPositDesc() {
        return lienPositDesc;
    }

    /**
     * Sets the value of the lienPositDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienPositDescType }
     *     
     */
    public void setLienPositDesc(LienPositDescType value) {
        this.lienPositDesc = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
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
