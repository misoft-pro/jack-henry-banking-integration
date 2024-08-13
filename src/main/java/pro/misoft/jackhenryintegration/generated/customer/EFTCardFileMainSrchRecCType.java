
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EFTCardFileMainSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardFileMainSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardSufxNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardSufxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileMainWsId" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainWsId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileMainUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FileMainTime" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="FieldDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FieldDesc_Type"/&gt;
 *         &lt;element name="FieldOrigVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldOrigVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="FieldNewVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldNewVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomEFTCardFileMainSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardFileMainSrchRec_CType", propOrder = {
    "eftCardSufxNum",
    "fileMainWsId",
    "fileMainUsrId",
    "fileMainDt",
    "fileMainTime",
    "fieldDesc",
    "fieldOrigVal",
    "fieldNewVal",
    "customEFTCardFileMainSrchRec",
    "ver1",
    "any"
})
public class EFTCardFileMainSrchRecCType {

    @XmlElement(name = "EFTCardSufxNum")
    protected EFTCardSufxNumType eftCardSufxNum;
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
    @XmlElement(name = "CustomEFTCardFileMainSrchRec")
    protected CustomCType customEFTCardFileMainSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardSufxNum property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public EFTCardSufxNumType getEFTCardSufxNum() {
        return eftCardSufxNum;
    }

    /**
     * Sets the value of the eftCardSufxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardSufxNumType }
     *     
     */
    public void setEFTCardSufxNum(EFTCardSufxNumType value) {
        this.eftCardSufxNum = value;
    }

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
     * Gets the value of the customEFTCardFileMainSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomEFTCardFileMainSrchRec() {
        return customEFTCardFileMainSrchRec;
    }

    /**
     * Sets the value of the customEFTCardFileMainSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomEFTCardFileMainSrchRec(CustomCType value) {
        this.customEFTCardFileMainSrchRec = value;
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
