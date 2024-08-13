
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
 * <p>Java class for x_DepAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_DepAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="HldMailDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctLvlSecDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HighVolAcctDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HighVolAcctDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LstPostAcctDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LstPostAcctDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PrtACHNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtACHNotDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctReOpenDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReOpenDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="FltSchedDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FltSchedDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CrBureauRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBureauRptDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="WireCompId" type="{http://jackhenry.com/jxchange/TPG/2008}WireCompId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_DepAcctInfo_CType", propOrder = {
    "depAcctInfo",
    "hldMailDesc",
    "acctLvlSecDesc",
    "highVolAcctDesc",
    "lstPostAcctDesc",
    "custom",
    "ver1",
    "prtACHNotDesc",
    "acctReOpenDesc",
    "fltSchedDesc",
    "ver2",
    "crBureauRptDesc",
    "ver3",
    "wireCompId",
    "ver4",
    "any"
})
public class XDepAcctInfoCType {

    @XmlElement(name = "DepAcctInfo")
    protected DepAcctInfoCType depAcctInfo;
    @XmlElement(name = "HldMailDesc")
    protected HldMailDescType hldMailDesc;
    @XmlElement(name = "AcctLvlSecDesc")
    protected AcctLvlSecDescType acctLvlSecDesc;
    @XmlElement(name = "HighVolAcctDesc")
    protected HighVolAcctDescType highVolAcctDesc;
    @XmlElement(name = "LstPostAcctDesc")
    protected LstPostAcctDescType lstPostAcctDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PrtACHNotDesc")
    protected PrtACHNotDescType prtACHNotDesc;
    @XmlElement(name = "AcctReOpenDesc")
    protected AcctReOpenDescType acctReOpenDesc;
    @XmlElement(name = "FltSchedDesc")
    protected FltSchedDescType fltSchedDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CrBureauRptDesc")
    protected CrBureauRptDescType crBureauRptDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "WireCompId")
    protected WireCompIdType wireCompId;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctInfoCType }
     *     
     */
    public DepAcctInfoCType getDepAcctInfo() {
        return depAcctInfo;
    }

    /**
     * Sets the value of the depAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctInfoCType }
     *     
     */
    public void setDepAcctInfo(DepAcctInfoCType value) {
        this.depAcctInfo = value;
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
     * Gets the value of the highVolAcctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link HighVolAcctDescType }
     *     
     */
    public HighVolAcctDescType getHighVolAcctDesc() {
        return highVolAcctDesc;
    }

    /**
     * Sets the value of the highVolAcctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighVolAcctDescType }
     *     
     */
    public void setHighVolAcctDesc(HighVolAcctDescType value) {
        this.highVolAcctDesc = value;
    }

    /**
     * Gets the value of the lstPostAcctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LstPostAcctDescType }
     *     
     */
    public LstPostAcctDescType getLstPostAcctDesc() {
        return lstPostAcctDesc;
    }

    /**
     * Sets the value of the lstPostAcctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstPostAcctDescType }
     *     
     */
    public void setLstPostAcctDesc(LstPostAcctDescType value) {
        this.lstPostAcctDesc = value;
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
     * Gets the value of the prtACHNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtACHNotDescType }
     *     
     */
    public PrtACHNotDescType getPrtACHNotDesc() {
        return prtACHNotDesc;
    }

    /**
     * Sets the value of the prtACHNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtACHNotDescType }
     *     
     */
    public void setPrtACHNotDesc(PrtACHNotDescType value) {
        this.prtACHNotDesc = value;
    }

    /**
     * Gets the value of the acctReOpenDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReOpenDescType }
     *     
     */
    public AcctReOpenDescType getAcctReOpenDesc() {
        return acctReOpenDesc;
    }

    /**
     * Sets the value of the acctReOpenDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReOpenDescType }
     *     
     */
    public void setAcctReOpenDesc(AcctReOpenDescType value) {
        this.acctReOpenDesc = value;
    }

    /**
     * Gets the value of the fltSchedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FltSchedDescType }
     *     
     */
    public FltSchedDescType getFltSchedDesc() {
        return fltSchedDesc;
    }

    /**
     * Sets the value of the fltSchedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltSchedDescType }
     *     
     */
    public void setFltSchedDesc(FltSchedDescType value) {
        this.fltSchedDesc = value;
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
     * Gets the value of the crBureauRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBureauRptDescType }
     *     
     */
    public CrBureauRptDescType getCrBureauRptDesc() {
        return crBureauRptDesc;
    }

    /**
     * Sets the value of the crBureauRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBureauRptDescType }
     *     
     */
    public void setCrBureauRptDesc(CrBureauRptDescType value) {
        this.crBureauRptDesc = value;
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
     * Gets the value of the wireCompId property.
     * 
     * @return
     *     possible object is
     *     {@link WireCompIdType }
     *     
     */
    public WireCompIdType getWireCompId() {
        return wireCompId;
    }

    /**
     * Sets the value of the wireCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCompIdType }
     *     
     */
    public void setWireCompId(WireCompIdType value) {
        this.wireCompId = value;
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
