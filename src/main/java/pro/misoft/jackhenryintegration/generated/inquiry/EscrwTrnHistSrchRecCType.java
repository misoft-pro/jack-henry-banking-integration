
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
 * <p>Java class for EscrwTrnHistSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwTrnHistSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwId" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwId_Type"/&gt;
 *         &lt;element name="PostDt" type="{http://jackhenry.com/jxchange/TPG/2008}PostDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDistrDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDistrDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwTypeCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwTypeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwTypeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}SrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SrcCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPayeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPayeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPayeeAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="PropParcelId" type="{http://jackhenry.com/jxchange/TPG/2008}PropParcelId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropLegalInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PropLegalInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwTrnHistSrchRec_CType", propOrder = {
    "escrwId",
    "postDt",
    "effDt",
    "escrwDistrDt",
    "trnCodeCode",
    "trnCodeDesc",
    "amt",
    "trnType",
    "escrwTypeCode",
    "escrwTypeDesc",
    "srcCode",
    "srcCodeDesc",
    "escrwPayeeDesc",
    "escrwPayeeAddr",
    "propParcelId",
    "propLegalInfo",
    "custom",
    "ver1",
    "any"
})
public class EscrwTrnHistSrchRecCType {

    @XmlElement(name = "EscrwId", required = true)
    protected EscrwIdType escrwId;
    @XmlElement(name = "PostDt")
    protected PostDtType postDt;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "EscrwDistrDt")
    protected EscrwDistrDtType escrwDistrDt;
    @XmlElement(name = "TrnCodeCode")
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc")
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "TrnType")
    protected TrnTypeType trnType;
    @XmlElement(name = "EscrwTypeCode")
    protected EscrwTypeCodeType escrwTypeCode;
    @XmlElement(name = "EscrwTypeDesc")
    protected EscrwTypeDescType escrwTypeDesc;
    @XmlElement(name = "SrcCode")
    protected SrcCodeType srcCode;
    @XmlElement(name = "SrcCodeDesc")
    protected SrcCodeDescType srcCodeDesc;
    @XmlElement(name = "EscrwPayeeDesc")
    protected EscrwPayeeDescType escrwPayeeDesc;
    @XmlElement(name = "EscrwPayeeAddr")
    protected AddrCType escrwPayeeAddr;
    @XmlElement(name = "PropParcelId")
    protected PropParcelIdType propParcelId;
    @XmlElement(name = "PropLegalInfo")
    protected PropLegalInfoType propLegalInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwId property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwIdType }
     *     
     */
    public EscrwIdType getEscrwId() {
        return escrwId;
    }

    /**
     * Sets the value of the escrwId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwIdType }
     *     
     */
    public void setEscrwId(EscrwIdType value) {
        this.escrwId = value;
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
     * Gets the value of the escrwDistrDt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwDistrDtType }
     *     
     */
    public EscrwDistrDtType getEscrwDistrDt() {
        return escrwDistrDt;
    }

    /**
     * Sets the value of the escrwDistrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwDistrDtType }
     *     
     */
    public void setEscrwDistrDt(EscrwDistrDtType value) {
        this.escrwDistrDt = value;
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
     * Gets the value of the trnType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTypeType }
     *     
     */
    public TrnTypeType getTrnType() {
        return trnType;
    }

    /**
     * Sets the value of the trnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTypeType }
     *     
     */
    public void setTrnType(TrnTypeType value) {
        this.trnType = value;
    }

    /**
     * Gets the value of the escrwTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwTypeCodeType }
     *     
     */
    public EscrwTypeCodeType getEscrwTypeCode() {
        return escrwTypeCode;
    }

    /**
     * Sets the value of the escrwTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwTypeCodeType }
     *     
     */
    public void setEscrwTypeCode(EscrwTypeCodeType value) {
        this.escrwTypeCode = value;
    }

    /**
     * Gets the value of the escrwTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwTypeDescType }
     *     
     */
    public EscrwTypeDescType getEscrwTypeDesc() {
        return escrwTypeDesc;
    }

    /**
     * Sets the value of the escrwTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwTypeDescType }
     *     
     */
    public void setEscrwTypeDesc(EscrwTypeDescType value) {
        this.escrwTypeDesc = value;
    }

    /**
     * Gets the value of the srcCode property.
     * 
     * @return
     *     possible object is
     *     {@link SrcCodeType }
     *     
     */
    public SrcCodeType getSrcCode() {
        return srcCode;
    }

    /**
     * Sets the value of the srcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcCodeType }
     *     
     */
    public void setSrcCode(SrcCodeType value) {
        this.srcCode = value;
    }

    /**
     * Gets the value of the srcCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SrcCodeDescType }
     *     
     */
    public SrcCodeDescType getSrcCodeDesc() {
        return srcCodeDesc;
    }

    /**
     * Sets the value of the srcCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcCodeDescType }
     *     
     */
    public void setSrcCodeDesc(SrcCodeDescType value) {
        this.srcCodeDesc = value;
    }

    /**
     * Gets the value of the escrwPayeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPayeeDescType }
     *     
     */
    public EscrwPayeeDescType getEscrwPayeeDesc() {
        return escrwPayeeDesc;
    }

    /**
     * Sets the value of the escrwPayeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPayeeDescType }
     *     
     */
    public void setEscrwPayeeDesc(EscrwPayeeDescType value) {
        this.escrwPayeeDesc = value;
    }

    /**
     * Gets the value of the escrwPayeeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getEscrwPayeeAddr() {
        return escrwPayeeAddr;
    }

    /**
     * Sets the value of the escrwPayeeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setEscrwPayeeAddr(AddrCType value) {
        this.escrwPayeeAddr = value;
    }

    /**
     * Gets the value of the propParcelId property.
     * 
     * @return
     *     possible object is
     *     {@link PropParcelIdType }
     *     
     */
    public PropParcelIdType getPropParcelId() {
        return propParcelId;
    }

    /**
     * Sets the value of the propParcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropParcelIdType }
     *     
     */
    public void setPropParcelId(PropParcelIdType value) {
        this.propParcelId = value;
    }

    /**
     * Gets the value of the propLegalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PropLegalInfoType }
     *     
     */
    public PropLegalInfoType getPropLegalInfo() {
        return propLegalInfo;
    }

    /**
     * Sets the value of the propLegalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropLegalInfoType }
     *     
     */
    public void setPropLegalInfo(PropLegalInfoType value) {
        this.propLegalInfo = value;
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
