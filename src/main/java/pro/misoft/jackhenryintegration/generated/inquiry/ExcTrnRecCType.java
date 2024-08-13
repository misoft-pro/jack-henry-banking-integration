
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
 * <p>Java class for ExcTrnRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcTrnRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRetSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRetSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="UpdAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="UpdAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="UpdTrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcDispCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcDispCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcRetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcRetRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExcActnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ExcActnCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="UpdBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="UpdGLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *           &lt;element name="UpdGLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="UpdTrnDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *           &lt;element name="UpdRefDescCode" type="{http://jackhenry.com/jxchange/TPG/2008}RefDescCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHRetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetRsnCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="UpdLnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ExcTrnRec_CType", propOrder = {
    "updChkNum",
    "effDt",
    "excRetSrcCode",
    "updAcctId",
    "updAcctType",
    "updTrnCodeCode",
    "excDispCode",
    "excRetRsnCode",
    "excActnCode",
    "ver1",
    "updBrCode",
    "updGLCostCtr",
    "updGLProdCode",
    "updTrnDescArray",
    "updRefDescCode",
    "achRetRsnCode",
    "updLnUnitId",
    "ver2",
    "any"
})
public class ExcTrnRecCType {

    @XmlElement(name = "UpdChkNum")
    protected ChkNumType updChkNum;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "ExcRetSrcCode")
    protected ExcRetSrcCodeType excRetSrcCode;
    @XmlElement(name = "UpdAcctId")
    protected AcctIdType updAcctId;
    @XmlElement(name = "UpdAcctType")
    protected AcctTypeType updAcctType;
    @XmlElement(name = "UpdTrnCodeCode")
    protected TrnCodeCodeType updTrnCodeCode;
    @XmlElement(name = "ExcDispCode")
    protected ExcDispCodeType excDispCode;
    @XmlElement(name = "ExcRetRsnCode")
    protected ExcRetRsnCodeType excRetRsnCode;
    @XmlElement(name = "ExcActnCode")
    protected ExcActnCodeType excActnCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "UpdBrCode")
    protected BrCodeType updBrCode;
    @XmlElement(name = "UpdGLCostCtr")
    protected GLCostCtrType updGLCostCtr;
    @XmlElement(name = "UpdGLProdCode")
    protected GLProdCodeType updGLProdCode;
    @XmlElement(name = "UpdTrnDescArray")
    protected RmkAType updTrnDescArray;
    @XmlElement(name = "UpdRefDescCode")
    protected RefDescCodeType updRefDescCode;
    @XmlElement(name = "ACHRetRsnCode")
    protected ACHRetRsnCodeType achRetRsnCode;
    @XmlElement(name = "UpdLnUnitId")
    protected LnUnitIdType updLnUnitId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the updChkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getUpdChkNum() {
        return updChkNum;
    }

    /**
     * Sets the value of the updChkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setUpdChkNum(ChkNumType value) {
        this.updChkNum = value;
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
     * Gets the value of the excRetSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRetSrcCodeType }
     *     
     */
    public ExcRetSrcCodeType getExcRetSrcCode() {
        return excRetSrcCode;
    }

    /**
     * Sets the value of the excRetSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRetSrcCodeType }
     *     
     */
    public void setExcRetSrcCode(ExcRetSrcCodeType value) {
        this.excRetSrcCode = value;
    }

    /**
     * Gets the value of the updAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getUpdAcctId() {
        return updAcctId;
    }

    /**
     * Sets the value of the updAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setUpdAcctId(AcctIdType value) {
        this.updAcctId = value;
    }

    /**
     * Gets the value of the updAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getUpdAcctType() {
        return updAcctType;
    }

    /**
     * Sets the value of the updAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setUpdAcctType(AcctTypeType value) {
        this.updAcctType = value;
    }

    /**
     * Gets the value of the updTrnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getUpdTrnCodeCode() {
        return updTrnCodeCode;
    }

    /**
     * Sets the value of the updTrnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setUpdTrnCodeCode(TrnCodeCodeType value) {
        this.updTrnCodeCode = value;
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
     * Gets the value of the excRetRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExcRetRsnCodeType }
     *     
     */
    public ExcRetRsnCodeType getExcRetRsnCode() {
        return excRetRsnCode;
    }

    /**
     * Sets the value of the excRetRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcRetRsnCodeType }
     *     
     */
    public void setExcRetRsnCode(ExcRetRsnCodeType value) {
        this.excRetRsnCode = value;
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
     * Gets the value of the updBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getUpdBrCode() {
        return updBrCode;
    }

    /**
     * Sets the value of the updBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setUpdBrCode(BrCodeType value) {
        this.updBrCode = value;
    }

    /**
     * Gets the value of the updGLCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getUpdGLCostCtr() {
        return updGLCostCtr;
    }

    /**
     * Sets the value of the updGLCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setUpdGLCostCtr(GLCostCtrType value) {
        this.updGLCostCtr = value;
    }

    /**
     * Gets the value of the updGLProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdCodeType }
     *     
     */
    public GLProdCodeType getUpdGLProdCode() {
        return updGLProdCode;
    }

    /**
     * Sets the value of the updGLProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdCodeType }
     *     
     */
    public void setUpdGLProdCode(GLProdCodeType value) {
        this.updGLProdCode = value;
    }

    /**
     * Gets the value of the updTrnDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getUpdTrnDescArray() {
        return updTrnDescArray;
    }

    /**
     * Sets the value of the updTrnDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setUpdTrnDescArray(RmkAType value) {
        this.updTrnDescArray = value;
    }

    /**
     * Gets the value of the updRefDescCode property.
     * 
     * @return
     *     possible object is
     *     {@link RefDescCodeType }
     *     
     */
    public RefDescCodeType getUpdRefDescCode() {
        return updRefDescCode;
    }

    /**
     * Sets the value of the updRefDescCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDescCodeType }
     *     
     */
    public void setUpdRefDescCode(RefDescCodeType value) {
        this.updRefDescCode = value;
    }

    /**
     * Gets the value of the achRetRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRetRsnCodeType }
     *     
     */
    public ACHRetRsnCodeType getACHRetRsnCode() {
        return achRetRsnCode;
    }

    /**
     * Sets the value of the achRetRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRetRsnCodeType }
     *     
     */
    public void setACHRetRsnCode(ACHRetRsnCodeType value) {
        this.achRetRsnCode = value;
    }

    /**
     * Gets the value of the updLnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getUpdLnUnitId() {
        return updLnUnitId;
    }

    /**
     * Sets the value of the updLnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setUpdLnUnitId(LnUnitIdType value) {
        this.updLnUnitId = value;
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
