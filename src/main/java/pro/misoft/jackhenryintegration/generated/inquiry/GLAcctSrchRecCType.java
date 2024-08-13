
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
 * <p>Java class for GLAcctSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLAcctSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="AcctTitle" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLTotalLvl" type="{http://jackhenry.com/jxchange/TPG/2008}GLTotalLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="GLInqType" type="{http://jackhenry.com/jxchange/TPG/2008}GLInqType_Type" minOccurs="0"/&gt;
 *           &lt;element name="GLCnsldtAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="GLCostCtrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtrDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "GLAcctSrchRec_CType", propOrder = {
    "acctId",
    "acctTitle",
    "acctType",
    "glTotalLvl",
    "curBal",
    "brCode",
    "brDesc",
    "glCostCtr",
    "glProdCode",
    "glProdDesc",
    "ver1",
    "glInqType",
    "glCnsldtAcctId",
    "glCostCtrDesc",
    "ver2",
    "any"
})
public class GLAcctSrchRecCType {

    @XmlElement(name = "AcctId", required = true)
    protected AcctIdType acctId;
    @XmlElement(name = "AcctTitle")
    protected AcctTitleType acctTitle;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "GLTotalLvl")
    protected GLTotalLvlType glTotalLvl;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "GLProdCode")
    protected GLProdCodeType glProdCode;
    @XmlElement(name = "GLProdDesc")
    protected GLProdDescType glProdDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "GLInqType")
    protected GLInqTypeType glInqType;
    @XmlElement(name = "GLCnsldtAcctId")
    protected AcctIdType glCnsldtAcctId;
    @XmlElement(name = "GLCostCtrDesc")
    protected GLCostCtrDescType glCostCtrDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctTitle property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTitleType }
     *     
     */
    public AcctTitleType getAcctTitle() {
        return acctTitle;
    }

    /**
     * Sets the value of the acctTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTitleType }
     *     
     */
    public void setAcctTitle(AcctTitleType value) {
        this.acctTitle = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the glTotalLvl property.
     * 
     * @return
     *     possible object is
     *     {@link GLTotalLvlType }
     *     
     */
    public GLTotalLvlType getGLTotalLvl() {
        return glTotalLvl;
    }

    /**
     * Sets the value of the glTotalLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLTotalLvlType }
     *     
     */
    public void setGLTotalLvl(GLTotalLvlType value) {
        this.glTotalLvl = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setBrCode(BrCodeType value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrType }
     *     
     */
    public GLCostCtrType getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrType }
     *     
     */
    public void setGLCostCtr(GLCostCtrType value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdCodeType }
     *     
     */
    public GLProdCodeType getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdCodeType }
     *     
     */
    public void setGLProdCode(GLProdCodeType value) {
        this.glProdCode = value;
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
     * Gets the value of the glInqType property.
     * 
     * @return
     *     possible object is
     *     {@link GLInqTypeType }
     *     
     */
    public GLInqTypeType getGLInqType() {
        return glInqType;
    }

    /**
     * Sets the value of the glInqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLInqTypeType }
     *     
     */
    public void setGLInqType(GLInqTypeType value) {
        this.glInqType = value;
    }

    /**
     * Gets the value of the glCnsldtAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getGLCnsldtAcctId() {
        return glCnsldtAcctId;
    }

    /**
     * Sets the value of the glCnsldtAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setGLCnsldtAcctId(AcctIdType value) {
        this.glCnsldtAcctId = value;
    }

    /**
     * Gets the value of the glCostCtrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GLCostCtrDescType }
     *     
     */
    public GLCostCtrDescType getGLCostCtrDesc() {
        return glCostCtrDesc;
    }

    /**
     * Sets the value of the glCostCtrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCostCtrDescType }
     *     
     */
    public void setGLCostCtrDesc(GLCostCtrDescType value) {
        this.glCostCtrDesc = value;
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
