
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
 * <p>Java class for FileMainSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileMainSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileMainWsId" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainWsId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileMainUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileMainTime" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="FieldDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FieldDesc_Type"/&gt;
 *         &lt;element name="FieldOrigVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldOrigVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="FieldNewVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldNewVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomFileMainSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *           &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FileMainSrchRec_CType", propOrder = {
    "fileMainWsId",
    "fileMainUsrId",
    "fileMainDt",
    "fileMainTime",
    "fieldDesc",
    "fieldOrigVal",
    "fieldNewVal",
    "brCode",
    "brDesc",
    "customFileMainSrchRec",
    "ver1",
    "glCostCtr",
    "prodCode",
    "ver2",
    "any"
})
public class FileMainSrchRecCType {

    @XmlElement(name = "FileMainWsId")
    protected FileMainWsIdType fileMainWsId;
    @XmlElement(name = "FileMainUsrId")
    protected FileMainUsrIdType fileMainUsrId;
    @XmlElement(name = "FileMainDt")
    protected FileMainDtType fileMainDt;
    @XmlElement(name = "FileMainTime")
    protected FileMainTimeType fileMainTime;
    @XmlElement(name = "FieldDesc", required = true)
    protected FieldDescType fieldDesc;
    @XmlElement(name = "FieldOrigVal")
    protected FieldOrigValType fieldOrigVal;
    @XmlElement(name = "FieldNewVal")
    protected FieldNewValType fieldNewVal;
    @XmlElement(name = "BrCode")
    protected BrCodeType brCode;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "CustomFileMainSrchRec")
    protected CustomCType customFileMainSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "GLCostCtr")
    protected GLCostCtrType glCostCtr;
    @XmlElement(name = "ProdCode")
    protected ProdCodeType prodCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fileMainWsId property.
     * 
     * @return
     *     possible object is
     *     {@link FileMainWsIdType }
     *     
     */
    public FileMainWsIdType getFileMainWsId() {
        return fileMainWsId;
    }

    /**
     * Sets the value of the fileMainWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMainWsIdType }
     *     
     */
    public void setFileMainWsId(FileMainWsIdType value) {
        this.fileMainWsId = value;
    }

    /**
     * Gets the value of the fileMainUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link FileMainUsrIdType }
     *     
     */
    public FileMainUsrIdType getFileMainUsrId() {
        return fileMainUsrId;
    }

    /**
     * Sets the value of the fileMainUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMainUsrIdType }
     *     
     */
    public void setFileMainUsrId(FileMainUsrIdType value) {
        this.fileMainUsrId = value;
    }

    /**
     * Gets the value of the fileMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link FileMainDtType }
     *     
     */
    public FileMainDtType getFileMainDt() {
        return fileMainDt;
    }

    /**
     * Sets the value of the fileMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMainDtType }
     *     
     */
    public void setFileMainDt(FileMainDtType value) {
        this.fileMainDt = value;
    }

    /**
     * Gets the value of the fileMainTime property.
     * 
     * @return
     *     possible object is
     *     {@link FileMainTimeType }
     *     
     */
    public FileMainTimeType getFileMainTime() {
        return fileMainTime;
    }

    /**
     * Sets the value of the fileMainTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileMainTimeType }
     *     
     */
    public void setFileMainTime(FileMainTimeType value) {
        this.fileMainTime = value;
    }

    /**
     * Gets the value of the fieldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDescType }
     *     
     */
    public FieldDescType getFieldDesc() {
        return fieldDesc;
    }

    /**
     * Sets the value of the fieldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDescType }
     *     
     */
    public void setFieldDesc(FieldDescType value) {
        this.fieldDesc = value;
    }

    /**
     * Gets the value of the fieldOrigVal property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOrigValType }
     *     
     */
    public FieldOrigValType getFieldOrigVal() {
        return fieldOrigVal;
    }

    /**
     * Sets the value of the fieldOrigVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOrigValType }
     *     
     */
    public void setFieldOrigVal(FieldOrigValType value) {
        this.fieldOrigVal = value;
    }

    /**
     * Gets the value of the fieldNewVal property.
     * 
     * @return
     *     possible object is
     *     {@link FieldNewValType }
     *     
     */
    public FieldNewValType getFieldNewVal() {
        return fieldNewVal;
    }

    /**
     * Sets the value of the fieldNewVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldNewValType }
     *     
     */
    public void setFieldNewVal(FieldNewValType value) {
        this.fieldNewVal = value;
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
     * Gets the value of the customFileMainSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomFileMainSrchRec() {
        return customFileMainSrchRec;
    }

    /**
     * Sets the value of the customFileMainSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomFileMainSrchRec(CustomCType value) {
        this.customFileMainSrchRec = value;
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
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setProdCode(ProdCodeType value) {
        this.prodCode = value;
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
