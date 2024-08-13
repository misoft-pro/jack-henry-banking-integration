
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
 * The complex for gathering the necessary information for adding a Tax
 *                 Plan. 
 * 
 * <p>Java class for PltfmAppTaxPlnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppTaxPlnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlnType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigOwnBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnBirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpousPlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}SpousPlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCntrbYr" type="{http://jackhenry.com/jxchange/TPG/2008}CntrbYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstContrbDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstContrbDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EmplrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="RespPrtyInfo" type="{http://jackhenry.com/jxchange/TPG/2008}RespPrtyRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="PlnCntrbArray" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCntrbArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CntrbArray" type="{http://jackhenry.com/jxchange/TPG/2008}CntrbArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BenfArray" type="{http://jackhenry.com/jxchange/TPG/2008}PlnBenfArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PlnCvrgType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCvrgType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PlnEstbDt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnEstbDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="PlnBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnBirthDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="OrigOwnName" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnName_Type" minOccurs="0"/&gt;
 *           &lt;element name="OrigOwnDeceaseDt" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnDeceaseDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="SoleSpousDistCode" type="{http://jackhenry.com/jxchange/TPG/2008}SoleSpousDistCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppTaxPlnInfo_CType", propOrder = {
    "plnType",
    "plnCode",
    "origOwnBirthDt",
    "plnFeeCode",
    "spousPlnCode",
    "plnCntrbYr",
    "firstContrbDt",
    "emplrInfo",
    "respPrtyInfo",
    "plnCntrbArray",
    "cntrbArray",
    "benfArray",
    "custom",
    "ver1",
    "plnCvrgType",
    "plnEstbDt",
    "plnBirthDt",
    "origOwnName",
    "origOwnDeceaseDt",
    "soleSpousDistCode",
    "ver2",
    "any"
})
public class PltfmAppTaxPlnInfoCType {

    @XmlElement(name = "PlnType")
    protected PlnTypeType plnType;
    @XmlElement(name = "PlnCode")
    protected PlnCodeType plnCode;
    @XmlElement(name = "OrigOwnBirthDt")
    protected OrigOwnBirthDtType origOwnBirthDt;
    @XmlElement(name = "PlnFeeCode")
    protected PlnFeeCodeType plnFeeCode;
    @XmlElement(name = "SpousPlnCode")
    protected SpousPlnCodeType spousPlnCode;
    @XmlElement(name = "PlnCntrbYr")
    protected CntrbYrType plnCntrbYr;
    @XmlElement(name = "FirstContrbDt")
    protected FirstContrbDtType firstContrbDt;
    @XmlElement(name = "EmplrInfo")
    protected EmplrInfoCType emplrInfo;
    @XmlElement(name = "RespPrtyInfo")
    protected RespPrtyRecCType respPrtyInfo;
    @XmlElement(name = "PlnCntrbArray")
    protected PlnCntrbArrayAType plnCntrbArray;
    @XmlElement(name = "CntrbArray")
    protected CntrbArrayAType cntrbArray;
    @XmlElement(name = "BenfArray")
    protected PlnBenfArrayAType benfArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PlnCvrgType")
    protected PlnCvrgTypeType plnCvrgType;
    @XmlElement(name = "PlnEstbDt")
    protected PlnEstbDtType plnEstbDt;
    @XmlElement(name = "PlnBirthDt")
    protected PlnBirthDtType plnBirthDt;
    @XmlElement(name = "OrigOwnName")
    protected OrigOwnNameType origOwnName;
    @XmlElement(name = "OrigOwnDeceaseDt")
    protected OrigOwnDeceaseDtType origOwnDeceaseDt;
    @XmlElement(name = "SoleSpousDistCode")
    protected SoleSpousDistCodeType soleSpousDistCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the plnType property.
     * 
     * @return
     *     possible object is
     *     {@link PlnTypeType }
     *     
     */
    public PlnTypeType getPlnType() {
        return plnType;
    }

    /**
     * Sets the value of the plnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnTypeType }
     *     
     */
    public void setPlnType(PlnTypeType value) {
        this.plnType = value;
    }

    /**
     * Gets the value of the plnCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCodeType }
     *     
     */
    public PlnCodeType getPlnCode() {
        return plnCode;
    }

    /**
     * Sets the value of the plnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCodeType }
     *     
     */
    public void setPlnCode(PlnCodeType value) {
        this.plnCode = value;
    }

    /**
     * Gets the value of the origOwnBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link OrigOwnBirthDtType }
     *     
     */
    public OrigOwnBirthDtType getOrigOwnBirthDt() {
        return origOwnBirthDt;
    }

    /**
     * Sets the value of the origOwnBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigOwnBirthDtType }
     *     
     */
    public void setOrigOwnBirthDt(OrigOwnBirthDtType value) {
        this.origOwnBirthDt = value;
    }

    /**
     * Gets the value of the plnFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlnFeeCodeType }
     *     
     */
    public PlnFeeCodeType getPlnFeeCode() {
        return plnFeeCode;
    }

    /**
     * Sets the value of the plnFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnFeeCodeType }
     *     
     */
    public void setPlnFeeCode(PlnFeeCodeType value) {
        this.plnFeeCode = value;
    }

    /**
     * Gets the value of the spousPlnCode property.
     * 
     * @return
     *     possible object is
     *     {@link SpousPlnCodeType }
     *     
     */
    public SpousPlnCodeType getSpousPlnCode() {
        return spousPlnCode;
    }

    /**
     * Sets the value of the spousPlnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpousPlnCodeType }
     *     
     */
    public void setSpousPlnCode(SpousPlnCodeType value) {
        this.spousPlnCode = value;
    }

    /**
     * Gets the value of the plnCntrbYr property.
     * 
     * @return
     *     possible object is
     *     {@link CntrbYrType }
     *     
     */
    public CntrbYrType getPlnCntrbYr() {
        return plnCntrbYr;
    }

    /**
     * Sets the value of the plnCntrbYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntrbYrType }
     *     
     */
    public void setPlnCntrbYr(CntrbYrType value) {
        this.plnCntrbYr = value;
    }

    /**
     * Gets the value of the firstContrbDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstContrbDtType }
     *     
     */
    public FirstContrbDtType getFirstContrbDt() {
        return firstContrbDt;
    }

    /**
     * Sets the value of the firstContrbDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstContrbDtType }
     *     
     */
    public void setFirstContrbDt(FirstContrbDtType value) {
        this.firstContrbDt = value;
    }

    /**
     * Gets the value of the emplrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EmplrInfoCType }
     *     
     */
    public EmplrInfoCType getEmplrInfo() {
        return emplrInfo;
    }

    /**
     * Sets the value of the emplrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplrInfoCType }
     *     
     */
    public void setEmplrInfo(EmplrInfoCType value) {
        this.emplrInfo = value;
    }

    /**
     * Gets the value of the respPrtyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RespPrtyRecCType }
     *     
     */
    public RespPrtyRecCType getRespPrtyInfo() {
        return respPrtyInfo;
    }

    /**
     * Sets the value of the respPrtyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespPrtyRecCType }
     *     
     */
    public void setRespPrtyInfo(RespPrtyRecCType value) {
        this.respPrtyInfo = value;
    }

    /**
     * Gets the value of the plnCntrbArray property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCntrbArrayAType }
     *     
     */
    public PlnCntrbArrayAType getPlnCntrbArray() {
        return plnCntrbArray;
    }

    /**
     * Sets the value of the plnCntrbArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCntrbArrayAType }
     *     
     */
    public void setPlnCntrbArray(PlnCntrbArrayAType value) {
        this.plnCntrbArray = value;
    }

    /**
     * Gets the value of the cntrbArray property.
     * 
     * @return
     *     possible object is
     *     {@link CntrbArrayAType }
     *     
     */
    public CntrbArrayAType getCntrbArray() {
        return cntrbArray;
    }

    /**
     * Sets the value of the cntrbArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntrbArrayAType }
     *     
     */
    public void setCntrbArray(CntrbArrayAType value) {
        this.cntrbArray = value;
    }

    /**
     * Gets the value of the benfArray property.
     * 
     * @return
     *     possible object is
     *     {@link PlnBenfArrayAType }
     *     
     */
    public PlnBenfArrayAType getBenfArray() {
        return benfArray;
    }

    /**
     * Sets the value of the benfArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnBenfArrayAType }
     *     
     */
    public void setBenfArray(PlnBenfArrayAType value) {
        this.benfArray = value;
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
     * Gets the value of the plnCvrgType property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCvrgTypeType }
     *     
     */
    public PlnCvrgTypeType getPlnCvrgType() {
        return plnCvrgType;
    }

    /**
     * Sets the value of the plnCvrgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCvrgTypeType }
     *     
     */
    public void setPlnCvrgType(PlnCvrgTypeType value) {
        this.plnCvrgType = value;
    }

    /**
     * Gets the value of the plnEstbDt property.
     * 
     * @return
     *     possible object is
     *     {@link PlnEstbDtType }
     *     
     */
    public PlnEstbDtType getPlnEstbDt() {
        return plnEstbDt;
    }

    /**
     * Sets the value of the plnEstbDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnEstbDtType }
     *     
     */
    public void setPlnEstbDt(PlnEstbDtType value) {
        this.plnEstbDt = value;
    }

    /**
     * Gets the value of the plnBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link PlnBirthDtType }
     *     
     */
    public PlnBirthDtType getPlnBirthDt() {
        return plnBirthDt;
    }

    /**
     * Sets the value of the plnBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnBirthDtType }
     *     
     */
    public void setPlnBirthDt(PlnBirthDtType value) {
        this.plnBirthDt = value;
    }

    /**
     * Gets the value of the origOwnName property.
     * 
     * @return
     *     possible object is
     *     {@link OrigOwnNameType }
     *     
     */
    public OrigOwnNameType getOrigOwnName() {
        return origOwnName;
    }

    /**
     * Sets the value of the origOwnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigOwnNameType }
     *     
     */
    public void setOrigOwnName(OrigOwnNameType value) {
        this.origOwnName = value;
    }

    /**
     * Gets the value of the origOwnDeceaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link OrigOwnDeceaseDtType }
     *     
     */
    public OrigOwnDeceaseDtType getOrigOwnDeceaseDt() {
        return origOwnDeceaseDt;
    }

    /**
     * Sets the value of the origOwnDeceaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigOwnDeceaseDtType }
     *     
     */
    public void setOrigOwnDeceaseDt(OrigOwnDeceaseDtType value) {
        this.origOwnDeceaseDt = value;
    }

    /**
     * Gets the value of the soleSpousDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link SoleSpousDistCodeType }
     *     
     */
    public SoleSpousDistCodeType getSoleSpousDistCode() {
        return soleSpousDistCode;
    }

    /**
     * Sets the value of the soleSpousDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoleSpousDistCodeType }
     *     
     */
    public void setSoleSpousDistCode(SoleSpousDistCodeType value) {
        this.soleSpousDistCode = value;
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
