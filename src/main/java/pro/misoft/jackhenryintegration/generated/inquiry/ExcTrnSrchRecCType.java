
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
 * <p>Java class for ExcTrnSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcTrnSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcItemId" type="{http://jackhenry.com/jxchange/TPG/2008}ExcItemId_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFItemId" type="{http://jackhenry.com/jxchange/TPG/2008}NSFItemId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcResolveType" type="{http://jackhenry.com/jxchange/TPG/2008}ExcResolveType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcDispCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcDispDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcActnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcActnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcActnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ExcActnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRsnRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRsnRecArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *           &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "ExcTrnSrchRec_CType", propOrder = {
    "excItemId",
    "nsfItemId",
    "postDt",
    "effDt",
    "chkNum",
    "amt",
    "excResolveType",
    "trnCodeCode",
    "trnCodeDesc",
    "excDispCode",
    "excDispDesc",
    "excActnCode",
    "excActnDesc",
    "excRsnRecArray",
    "ver1",
    "achCompName",
    "achStdEntryClass",
    "eftDescArray",
    "ver2",
    "custom",
    "ver3",
    "any"
})
public class ExcTrnSrchRecCType {

    @XmlElement(name = "ExcItemId")
    protected ExcItemIdType excItemId;
    @XmlElement(name = "NSFItemId")
    protected NSFItemIdType nsfItemId;
    @XmlElement(name = "PostDt")
    protected PostDtType postDt;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "ExcResolveType")
    protected ExcResolveTypeType excResolveType;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc")
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "ExcDispCode")
    protected ExcDispCodeType excDispCode;
    @XmlElement(name = "ExcDispDesc")
    protected ExcDispDescType excDispDesc;
    @XmlElement(name = "ExcActnCode")
    protected ExcActnCodeType excActnCode;
    @XmlElement(name = "ExcActnDesc")
    protected ExcActnDescType excActnDesc;
    @XmlElement(name = "ExcRsnRecArray")
    protected ExcRsnRecArrayAType excRsnRecArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ACHCompName")
    protected ACHCompNameType achCompName;
    @XmlElement(name = "ACHStdEntryClass")
    protected ACHStdEntryClassType achStdEntryClass;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the excItemId property.
     * 
     * @return
     *     possible object is
     *     {@link ExcItemIdType }
     *     
     */
    public ExcItemIdType getExcItemId() {
        return excItemId;
    }

    /**
     * Sets the value of the excItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcItemIdType }
     *     
     */
    public void setExcItemId(ExcItemIdType value) {
        this.excItemId = value;
    }

    /**
     * Gets the value of the nsfItemId property.
     * 
     * @return
     *     possible object is
     *     {@link NSFItemIdType }
     *     
     */
    public NSFItemIdType getNSFItemId() {
        return nsfItemId;
    }

    /**
     * Sets the value of the nsfItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFItemIdType }
     *     
     */
    public void setNSFItemId(NSFItemIdType value) {
        this.nsfItemId = value;
    }

    /**
     * Gets the value of the postDt property.
     * 
     * @return
     *     possible object is
     *     {@link PostDtType }
     *     
     */
    public PostDtType getPostDt() {
        return postDt;
    }

    /**
     * Sets the value of the postDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostDtType }
     *     
     */
    public void setPostDt(PostDtType value) {
        this.postDt = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setEffDt(EffDtType value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setChkNum(ChkNumType value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the excResolveType property.
     * 
     * @return
     *     possible object is
     *     {@link ExcResolveTypeType }
     *     
     */
    public ExcResolveTypeType getExcResolveType() {
        return excResolveType;
    }

    /**
     * Sets the value of the excResolveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcResolveTypeType }
     *     
     */
    public void setExcResolveType(ExcResolveTypeType value) {
        this.excResolveType = value;
    }

    /**
     * Gets the value of the trnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getTrnCodeCode() {
        return trnCodeCode;
    }

    /**
     * Sets the value of the trnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setTrnCodeCode(TrnCodeCodeType value) {
        this.trnCodeCode = value;
    }

    /**
     * Gets the value of the trnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeDescType }
     *     
     */
    public TrnCodeDescType getTrnCodeDesc() {
        return trnCodeDesc;
    }

    /**
     * Sets the value of the trnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeDescType }
     *     
     */
    public void setTrnCodeDesc(TrnCodeDescType value) {
        this.trnCodeDesc = value;
    }

    /**
     * Gets the value of the excDispCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcDispCodeType }
     *     
     */
    public ExcDispCodeType getExcDispCode() {
        return excDispCode;
    }

    /**
     * Sets the value of the excDispCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcDispCodeType }
     *     
     */
    public void setExcDispCode(ExcDispCodeType value) {
        this.excDispCode = value;
    }

    /**
     * Gets the value of the excDispDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcDispDescType }
     *     
     */
    public ExcDispDescType getExcDispDesc() {
        return excDispDesc;
    }

    /**
     * Sets the value of the excDispDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcDispDescType }
     *     
     */
    public void setExcDispDesc(ExcDispDescType value) {
        this.excDispDesc = value;
    }

    /**
     * Gets the value of the excActnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcActnCodeType }
     *     
     */
    public ExcActnCodeType getExcActnCode() {
        return excActnCode;
    }

    /**
     * Sets the value of the excActnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcActnCodeType }
     *     
     */
    public void setExcActnCode(ExcActnCodeType value) {
        this.excActnCode = value;
    }

    /**
     * Gets the value of the excActnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcActnDescType }
     *     
     */
    public ExcActnDescType getExcActnDesc() {
        return excActnDesc;
    }

    /**
     * Sets the value of the excActnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcActnDescType }
     *     
     */
    public void setExcActnDesc(ExcActnDescType value) {
        this.excActnDesc = value;
    }

    /**
     * Gets the value of the excRsnRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRsnRecArrayAType }
     *     
     */
    public ExcRsnRecArrayAType getExcRsnRecArray() {
        return excRsnRecArray;
    }

    /**
     * Sets the value of the excRsnRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRsnRecArrayAType }
     *     
     */
    public void setExcRsnRecArray(ExcRsnRecArrayAType value) {
        this.excRsnRecArray = value;
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
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompNameType }
     *     
     */
    public ACHCompNameType getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompNameType }
     *     
     */
    public void setACHCompName(ACHCompNameType value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public ACHStdEntryClassType getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public void setACHStdEntryClass(ACHStdEntryClassType value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the eftDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link EftDescAType }
     *     
     */
    public EftDescAType getEftDescArray() {
        return eftDescArray;
    }

    /**
     * Sets the value of the eftDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftDescAType }
     *     
     */
    public void setEftDescArray(EftDescAType value) {
        this.eftDescArray = value;
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
