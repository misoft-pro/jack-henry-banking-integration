
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
 * <p>Java class for x_SafeDepAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_SafeDepAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SafeDepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SafeDepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="HldMailDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LateChgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LateChgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RstrEntryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RstrEntryDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SigVerifyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SigVerifyDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AcctLvlSecDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="RentalRateIdxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RentalRateIdxDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="AutoChgRateIdxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AutoChgRateIdxDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="SalesPersonDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPersonDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_SafeDepAcctInfo_CType", propOrder = {
    "safeDepAcctInfo",
    "hldMailDesc",
    "lateChgDesc",
    "glProdDesc",
    "rstrEntryDesc",
    "sigVerifyDesc",
    "custom",
    "ver1",
    "acctLvlSecDesc",
    "rentalRateIdxDesc",
    "autoChgRateIdxDesc",
    "ver2",
    "salesPersonDesc",
    "ver3",
    "any"
})
public class XSafeDepAcctInfoCType {

    @XmlElement(name = "SafeDepAcctInfo")
    protected SafeDepAcctInfoCType safeDepAcctInfo;
    @XmlElement(name = "HldMailDesc")
    protected HldMailDescType hldMailDesc;
    @XmlElement(name = "LateChgDesc")
    protected LateChgDescType lateChgDesc;
    @XmlElement(name = "GLProdDesc")
    protected GLProdDescType glProdDesc;
    @XmlElement(name = "RstrEntryDesc")
    protected RstrEntryDescType rstrEntryDesc;
    @XmlElement(name = "SigVerifyDesc")
    protected SigVerifyDescType sigVerifyDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AcctLvlSecDesc")
    protected AcctLvlSecDescType acctLvlSecDesc;
    @XmlElement(name = "RentalRateIdxDesc")
    protected RentalRateIdxDescType rentalRateIdxDesc;
    @XmlElement(name = "AutoChgRateIdxDesc")
    protected AutoChgRateIdxDescType autoChgRateIdxDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "SalesPersonDesc")
    protected SalesPersonDescType salesPersonDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the safeDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SafeDepAcctInfoCType }
     *     
     */
    public SafeDepAcctInfoCType getSafeDepAcctInfo() {
        return safeDepAcctInfo;
    }

    /**
     * Sets the value of the safeDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeDepAcctInfoCType }
     *     
     */
    public void setSafeDepAcctInfo(SafeDepAcctInfoCType value) {
        this.safeDepAcctInfo = value;
    }

    /**
     * Gets the value of the hldMailDesc property.
     * 
     * @return
     *     possible object is
     *     {@link HldMailDescType }
     *     
     */
    public HldMailDescType getHldMailDesc() {
        return hldMailDesc;
    }

    /**
     * Sets the value of the hldMailDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldMailDescType }
     *     
     */
    public void setHldMailDesc(HldMailDescType value) {
        this.hldMailDesc = value;
    }

    /**
     * Gets the value of the lateChgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LateChgDescType }
     *     
     */
    public LateChgDescType getLateChgDesc() {
        return lateChgDesc;
    }

    /**
     * Sets the value of the lateChgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateChgDescType }
     *     
     */
    public void setLateChgDesc(LateChgDescType value) {
        this.lateChgDesc = value;
    }

    /**
     * Gets the value of the glProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdDescType }
     *     
     */
    public GLProdDescType getGLProdDesc() {
        return glProdDesc;
    }

    /**
     * Sets the value of the glProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdDescType }
     *     
     */
    public void setGLProdDesc(GLProdDescType value) {
        this.glProdDesc = value;
    }

    /**
     * Gets the value of the rstrEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RstrEntryDescType }
     *     
     */
    public RstrEntryDescType getRstrEntryDesc() {
        return rstrEntryDesc;
    }

    /**
     * Sets the value of the rstrEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RstrEntryDescType }
     *     
     */
    public void setRstrEntryDesc(RstrEntryDescType value) {
        this.rstrEntryDesc = value;
    }

    /**
     * Gets the value of the sigVerifyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SigVerifyDescType }
     *     
     */
    public SigVerifyDescType getSigVerifyDesc() {
        return sigVerifyDesc;
    }

    /**
     * Sets the value of the sigVerifyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigVerifyDescType }
     *     
     */
    public void setSigVerifyDesc(SigVerifyDescType value) {
        this.sigVerifyDesc = value;
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
     * Gets the value of the acctLvlSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctLvlSecDescType }
     *     
     */
    public AcctLvlSecDescType getAcctLvlSecDesc() {
        return acctLvlSecDesc;
    }

    /**
     * Sets the value of the acctLvlSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctLvlSecDescType }
     *     
     */
    public void setAcctLvlSecDesc(AcctLvlSecDescType value) {
        this.acctLvlSecDesc = value;
    }

    /**
     * Gets the value of the rentalRateIdxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RentalRateIdxDescType }
     *     
     */
    public RentalRateIdxDescType getRentalRateIdxDesc() {
        return rentalRateIdxDesc;
    }

    /**
     * Sets the value of the rentalRateIdxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalRateIdxDescType }
     *     
     */
    public void setRentalRateIdxDesc(RentalRateIdxDescType value) {
        this.rentalRateIdxDesc = value;
    }

    /**
     * Gets the value of the autoChgRateIdxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AutoChgRateIdxDescType }
     *     
     */
    public AutoChgRateIdxDescType getAutoChgRateIdxDesc() {
        return autoChgRateIdxDesc;
    }

    /**
     * Sets the value of the autoChgRateIdxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoChgRateIdxDescType }
     *     
     */
    public void setAutoChgRateIdxDesc(AutoChgRateIdxDescType value) {
        this.autoChgRateIdxDesc = value;
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
     * Gets the value of the salesPersonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersonDescType }
     *     
     */
    public SalesPersonDescType getSalesPersonDesc() {
        return salesPersonDesc;
    }

    /**
     * Sets the value of the salesPersonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersonDescType }
     *     
     */
    public void setSalesPersonDesc(SalesPersonDescType value) {
        this.salesPersonDesc = value;
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
