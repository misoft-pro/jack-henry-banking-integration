
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
 * <p>Java class for x_DepRegRptInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_DepRegRptInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="CallRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ARGOProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ARGOProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODRegRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ODRegRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="GroupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GroupDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LmtTrnAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}LmtTrnAcctType_Type" minOccurs="0"/&gt;
 *             &lt;element name="XferDrItemCnt" type="{http://jackhenry.com/jxchange/TPG/2008}XferDrItemCnt_Type" minOccurs="0"/&gt;
 *             &lt;element name="XferDrItemCntLmt" type="{http://jackhenry.com/jxchange/TPG/2008}XferDrItemCntLmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_DepRegRptInfo_CType", propOrder = {
    "depRegRptInfo",
    "callRptDesc",
    "argoProdDesc",
    "odRegRptDesc",
    "glProdDesc",
    "custom",
    "ver1",
    "groupDesc",
    "ver2",
    "lmtTrnAcctType",
    "xferDrItemCnt",
    "xferDrItemCntLmt",
    "ver3",
    "any"
})
public class XDepRegRptInfoCType {

    @XmlElement(name = "DepRegRptInfo")
    protected DepRegRptInfoCType depRegRptInfo;
    @XmlElement(name = "CallRptDesc")
    protected CallRptDescType callRptDesc;
    @XmlElement(name = "ARGOProdDesc")
    protected ARGOProdDescType argoProdDesc;
    @XmlElement(name = "ODRegRptDesc")
    protected ODRegRptDescType odRegRptDesc;
    @XmlElement(name = "GLProdDesc")
    protected GLProdDescType glProdDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "GroupDesc")
    protected GroupDescType groupDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "LmtTrnAcctType")
    protected LmtTrnAcctTypeType lmtTrnAcctType;
    @XmlElement(name = "XferDrItemCnt")
    protected XferDrItemCntType xferDrItemCnt;
    @XmlElement(name = "XferDrItemCntLmt")
    protected XferDrItemCntLmtType xferDrItemCntLmt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepRegRptInfoCType }
     *     
     */
    public DepRegRptInfoCType getDepRegRptInfo() {
        return depRegRptInfo;
    }

    /**
     * Sets the value of the depRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepRegRptInfoCType }
     *     
     */
    public void setDepRegRptInfo(DepRegRptInfoCType value) {
        this.depRegRptInfo = value;
    }

    /**
     * Gets the value of the callRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getCallRptDesc() {
        return callRptDesc;
    }

    /**
     * Sets the value of the callRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setCallRptDesc(CallRptDescType value) {
        this.callRptDesc = value;
    }

    /**
     * Gets the value of the argoProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ARGOProdDescType }
     *     
     */
    public ARGOProdDescType getARGOProdDesc() {
        return argoProdDesc;
    }

    /**
     * Sets the value of the argoProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARGOProdDescType }
     *     
     */
    public void setARGOProdDesc(ARGOProdDescType value) {
        this.argoProdDesc = value;
    }

    /**
     * Gets the value of the odRegRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ODRegRptDescType }
     *     
     */
    public ODRegRptDescType getODRegRptDesc() {
        return odRegRptDesc;
    }

    /**
     * Sets the value of the odRegRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODRegRptDescType }
     *     
     */
    public void setODRegRptDesc(ODRegRptDescType value) {
        this.odRegRptDesc = value;
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
     * Gets the value of the groupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GroupDescType }
     *     
     */
    public GroupDescType getGroupDesc() {
        return groupDesc;
    }

    /**
     * Sets the value of the groupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDescType }
     *     
     */
    public void setGroupDesc(GroupDescType value) {
        this.groupDesc = value;
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
     * Gets the value of the lmtTrnAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link LmtTrnAcctTypeType }
     *     
     */
    public LmtTrnAcctTypeType getLmtTrnAcctType() {
        return lmtTrnAcctType;
    }

    /**
     * Sets the value of the lmtTrnAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LmtTrnAcctTypeType }
     *     
     */
    public void setLmtTrnAcctType(LmtTrnAcctTypeType value) {
        this.lmtTrnAcctType = value;
    }

    /**
     * Gets the value of the xferDrItemCnt property.
     * 
     * @return
     *     possible object is
     *     {@link XferDrItemCntType }
     *     
     */
    public XferDrItemCntType getXferDrItemCnt() {
        return xferDrItemCnt;
    }

    /**
     * Sets the value of the xferDrItemCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferDrItemCntType }
     *     
     */
    public void setXferDrItemCnt(XferDrItemCntType value) {
        this.xferDrItemCnt = value;
    }

    /**
     * Gets the value of the xferDrItemCntLmt property.
     * 
     * @return
     *     possible object is
     *     {@link XferDrItemCntLmtType }
     *     
     */
    public XferDrItemCntLmtType getXferDrItemCntLmt() {
        return xferDrItemCntLmt;
    }

    /**
     * Sets the value of the xferDrItemCntLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferDrItemCntLmtType }
     *     
     */
    public void setXferDrItemCntLmt(XferDrItemCntLmtType value) {
        this.xferDrItemCntLmt = value;
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
