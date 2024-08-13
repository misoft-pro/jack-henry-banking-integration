
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
 * <p>Java class for SvcDictInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDictInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElemName" type="{http://jackhenry.com/jxchange/TPG/2008}ElemName_Type"/&gt;
 *         &lt;element name="ElemPath" type="{http://jackhenry.com/jxchange/TPG/2008}ElemPath_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElemReq" type="{http://jackhenry.com/jxchange/TPG/2008}ElemReq_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElemDft" type="{http://jackhenry.com/jxchange/TPG/2008}ElemDft_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElemLowRngVal" type="{http://jackhenry.com/jxchange/TPG/2008}ElemLowRngVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElemHighRngVal" type="{http://jackhenry.com/jxchange/TPG/2008}ElemHighRngVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElemHelpInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ElemHelpInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElemInstHelpInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ElemHelpInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="x_SvcPrvdFldInfo" type="{http://jackhenry.com/jxchange/TPG/2008}x_SvcPrvdFldInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_SvcPrvdErrArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_SvcPrvdErrArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="ElemCanocType" type="{http://jackhenry.com/jxchange/TPG/2008}ElemCanocType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElemCanocArray" type="{http://jackhenry.com/jxchange/TPG/2008}ElemCanocArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ElemDftDt" type="{http://jackhenry.com/jxchange/TPG/2008}ElemDftDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ElemLowRngDt" type="{http://jackhenry.com/jxchange/TPG/2008}ElemLowRngDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ElemHighRngDt" type="{http://jackhenry.com/jxchange/TPG/2008}ElemHighRngDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SvcDictInfoRec_CType", propOrder = {
    "elemName",
    "elemPath",
    "elemReq",
    "elemDft",
    "elemLowRngVal",
    "elemHighRngVal",
    "elemHelpInfo",
    "elemInstHelpInfo",
    "xSvcPrvdFldInfo",
    "xSvcPrvdErrArray",
    "elemCanocType",
    "elemCanocArray",
    "ver1",
    "elemDftDt",
    "elemLowRngDt",
    "elemHighRngDt",
    "ver2",
    "any"
})
public class SvcDictInfoRecCType {

    @XmlElement(name = "ElemName", required = true)
    protected ElemNameType elemName;
    @XmlElement(name = "ElemPath")
    protected ElemPathType elemPath;
    @XmlElement(name = "ElemReq")
    protected ElemReqType elemReq;
    @XmlElement(name = "ElemDft")
    protected ElemDftType elemDft;
    @XmlElement(name = "ElemLowRngVal")
    protected ElemLowRngValType elemLowRngVal;
    @XmlElement(name = "ElemHighRngVal")
    protected ElemHighRngValType elemHighRngVal;
    @XmlElement(name = "ElemHelpInfo")
    protected ElemHelpInfoType elemHelpInfo;
    @XmlElement(name = "ElemInstHelpInfo")
    protected ElemHelpInfoType elemInstHelpInfo;
    @XmlElement(name = "x_SvcPrvdFldInfo")
    protected XSvcPrvdFldInfoCType xSvcPrvdFldInfo;
    @XmlElement(name = "x_SvcPrvdErrArray")
    protected XSvcPrvdErrArrayAType xSvcPrvdErrArray;
    @XmlElement(name = "ElemCanocType")
    protected ElemCanocTypeType elemCanocType;
    @XmlElement(name = "ElemCanocArray")
    protected ElemCanocArrayAType elemCanocArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ElemDftDt")
    protected ElemDftDtType elemDftDt;
    @XmlElement(name = "ElemLowRngDt")
    protected ElemLowRngDtType elemLowRngDt;
    @XmlElement(name = "ElemHighRngDt")
    protected ElemHighRngDtType elemHighRngDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elemName property.
     * 
     * @return
     *     possible object is
     *     {@link ElemNameType }
     *     
     */
    public ElemNameType getElemName() {
        return elemName;
    }

    /**
     * Sets the value of the elemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemNameType }
     *     
     */
    public void setElemName(ElemNameType value) {
        this.elemName = value;
    }

    /**
     * Gets the value of the elemPath property.
     * 
     * @return
     *     possible object is
     *     {@link ElemPathType }
     *     
     */
    public ElemPathType getElemPath() {
        return elemPath;
    }

    /**
     * Sets the value of the elemPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemPathType }
     *     
     */
    public void setElemPath(ElemPathType value) {
        this.elemPath = value;
    }

    /**
     * Gets the value of the elemReq property.
     * 
     * @return
     *     possible object is
     *     {@link ElemReqType }
     *     
     */
    public ElemReqType getElemReq() {
        return elemReq;
    }

    /**
     * Sets the value of the elemReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemReqType }
     *     
     */
    public void setElemReq(ElemReqType value) {
        this.elemReq = value;
    }

    /**
     * Gets the value of the elemDft property.
     * 
     * @return
     *     possible object is
     *     {@link ElemDftType }
     *     
     */
    public ElemDftType getElemDft() {
        return elemDft;
    }

    /**
     * Sets the value of the elemDft property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemDftType }
     *     
     */
    public void setElemDft(ElemDftType value) {
        this.elemDft = value;
    }

    /**
     * Gets the value of the elemLowRngVal property.
     * 
     * @return
     *     possible object is
     *     {@link ElemLowRngValType }
     *     
     */
    public ElemLowRngValType getElemLowRngVal() {
        return elemLowRngVal;
    }

    /**
     * Sets the value of the elemLowRngVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemLowRngValType }
     *     
     */
    public void setElemLowRngVal(ElemLowRngValType value) {
        this.elemLowRngVal = value;
    }

    /**
     * Gets the value of the elemHighRngVal property.
     * 
     * @return
     *     possible object is
     *     {@link ElemHighRngValType }
     *     
     */
    public ElemHighRngValType getElemHighRngVal() {
        return elemHighRngVal;
    }

    /**
     * Sets the value of the elemHighRngVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemHighRngValType }
     *     
     */
    public void setElemHighRngVal(ElemHighRngValType value) {
        this.elemHighRngVal = value;
    }

    /**
     * Gets the value of the elemHelpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ElemHelpInfoType }
     *     
     */
    public ElemHelpInfoType getElemHelpInfo() {
        return elemHelpInfo;
    }

    /**
     * Sets the value of the elemHelpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemHelpInfoType }
     *     
     */
    public void setElemHelpInfo(ElemHelpInfoType value) {
        this.elemHelpInfo = value;
    }

    /**
     * Gets the value of the elemInstHelpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ElemHelpInfoType }
     *     
     */
    public ElemHelpInfoType getElemInstHelpInfo() {
        return elemInstHelpInfo;
    }

    /**
     * Sets the value of the elemInstHelpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemHelpInfoType }
     *     
     */
    public void setElemInstHelpInfo(ElemHelpInfoType value) {
        this.elemInstHelpInfo = value;
    }

    /**
     * Gets the value of the xSvcPrvdFldInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XSvcPrvdFldInfoCType }
     *     
     */
    public XSvcPrvdFldInfoCType getXSvcPrvdFldInfo() {
        return xSvcPrvdFldInfo;
    }

    /**
     * Sets the value of the xSvcPrvdFldInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSvcPrvdFldInfoCType }
     *     
     */
    public void setXSvcPrvdFldInfo(XSvcPrvdFldInfoCType value) {
        this.xSvcPrvdFldInfo = value;
    }

    /**
     * Gets the value of the xSvcPrvdErrArray property.
     * 
     * @return
     *     possible object is
     *     {@link XSvcPrvdErrArrayAType }
     *     
     */
    public XSvcPrvdErrArrayAType getXSvcPrvdErrArray() {
        return xSvcPrvdErrArray;
    }

    /**
     * Sets the value of the xSvcPrvdErrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSvcPrvdErrArrayAType }
     *     
     */
    public void setXSvcPrvdErrArray(XSvcPrvdErrArrayAType value) {
        this.xSvcPrvdErrArray = value;
    }

    /**
     * Gets the value of the elemCanocType property.
     * 
     * @return
     *     possible object is
     *     {@link ElemCanocTypeType }
     *     
     */
    public ElemCanocTypeType getElemCanocType() {
        return elemCanocType;
    }

    /**
     * Sets the value of the elemCanocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemCanocTypeType }
     *     
     */
    public void setElemCanocType(ElemCanocTypeType value) {
        this.elemCanocType = value;
    }

    /**
     * Gets the value of the elemCanocArray property.
     * 
     * @return
     *     possible object is
     *     {@link ElemCanocArrayAType }
     *     
     */
    public ElemCanocArrayAType getElemCanocArray() {
        return elemCanocArray;
    }

    /**
     * Sets the value of the elemCanocArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemCanocArrayAType }
     *     
     */
    public void setElemCanocArray(ElemCanocArrayAType value) {
        this.elemCanocArray = value;
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
     * Gets the value of the elemDftDt property.
     * 
     * @return
     *     possible object is
     *     {@link ElemDftDtType }
     *     
     */
    public ElemDftDtType getElemDftDt() {
        return elemDftDt;
    }

    /**
     * Sets the value of the elemDftDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemDftDtType }
     *     
     */
    public void setElemDftDt(ElemDftDtType value) {
        this.elemDftDt = value;
    }

    /**
     * Gets the value of the elemLowRngDt property.
     * 
     * @return
     *     possible object is
     *     {@link ElemLowRngDtType }
     *     
     */
    public ElemLowRngDtType getElemLowRngDt() {
        return elemLowRngDt;
    }

    /**
     * Sets the value of the elemLowRngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemLowRngDtType }
     *     
     */
    public void setElemLowRngDt(ElemLowRngDtType value) {
        this.elemLowRngDt = value;
    }

    /**
     * Gets the value of the elemHighRngDt property.
     * 
     * @return
     *     possible object is
     *     {@link ElemHighRngDtType }
     *     
     */
    public ElemHighRngDtType getElemHighRngDt() {
        return elemHighRngDt;
    }

    /**
     * Sets the value of the elemHighRngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElemHighRngDtType }
     *     
     */
    public void setElemHighRngDt(ElemHighRngDtType value) {
        this.elemHighRngDt = value;
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
