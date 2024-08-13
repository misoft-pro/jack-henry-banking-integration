
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
 * <p>Java class for LOCAcctInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCAcctInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LOCRec" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="LOCDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCPrtcpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrtcpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCStmtFreqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCallRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCollatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCRiskDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCRiskDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCClsDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LOCClsDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCHistArray" type="{http://jackhenry.com/jxchange/TPG/2008}LOCHistArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LOCGdnceBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceBal_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCGdnceAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceAvlBal_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCPrincRedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCPrincRedAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCGdnceOrder" type="{http://jackhenry.com/jxchange/TPG/2008}LOCGdnceOrder_Type" minOccurs="0"/&gt;
 *           &lt;element name="LOCMasterAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCMasterAcctId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ConstBdgType" type="{http://jackhenry.com/jxchange/TPG/2008}ConstBdgType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LOCAcctInqRec_CType", propOrder = {
    "locRec",
    "locDesc",
    "locStatDesc",
    "locBrDesc",
    "locOffDesc",
    "locPrtcpDesc",
    "locStmtFreqDesc",
    "locCallRptDesc",
    "locCollatDesc",
    "locRiskDesc",
    "locClsDesc",
    "locHistArray",
    "custom",
    "ver1",
    "locGdnceBal",
    "locGdnceAvlBal",
    "locPrincRedAmt",
    "locGdnceOrder",
    "locMasterAcctId",
    "ver2",
    "constBdgType",
    "ver3",
    "any"
})
public class LOCAcctInqRecCType {

    @XmlElement(name = "LOCRec")
    protected LOCRecCType locRec;
    @XmlElement(name = "LOCDesc")
    protected LOCDescType locDesc;
    @XmlElement(name = "LOCStatDesc")
    protected LOCStatDescType locStatDesc;
    @XmlElement(name = "LOCBrDesc")
    protected BrDescType locBrDesc;
    @XmlElement(name = "LOCOffDesc")
    protected OffDescType locOffDesc;
    @XmlElement(name = "LOCPrtcpDesc")
    protected LOCPrtcpDescType locPrtcpDesc;
    @XmlElement(name = "LOCStmtFreqDesc")
    protected StmtFreqDescType locStmtFreqDesc;
    @XmlElement(name = "LOCCallRptDesc")
    protected CallRptDescType locCallRptDesc;
    @XmlElement(name = "LOCCollatDesc")
    protected CollatDescType locCollatDesc;
    @XmlElement(name = "LOCRiskDesc")
    protected LOCRiskDescType locRiskDesc;
    @XmlElement(name = "LOCClsDesc")
    protected LOCClsDescType locClsDesc;
    @XmlElement(name = "LOCHistArray")
    protected LOCHistArrayAType locHistArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "LOCGdnceBal")
    protected LOCGdnceBalType locGdnceBal;
    @XmlElement(name = "LOCGdnceAvlBal")
    protected LOCGdnceAvlBalType locGdnceAvlBal;
    @XmlElement(name = "LOCPrincRedAmt")
    protected LOCPrincRedAmtType locPrincRedAmt;
    @XmlElement(name = "LOCGdnceOrder")
    protected LOCGdnceOrderType locGdnceOrder;
    @XmlElement(name = "LOCMasterAcctId")
    protected LOCMasterAcctIdType locMasterAcctId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ConstBdgType")
    protected ConstBdgTypeType constBdgType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the locRec property.
     * 
     * @return
     *     possible object is
     *     {@link LOCRecCType }
     *     
     */
    public LOCRecCType getLOCRec() {
        return locRec;
    }

    /**
     * Sets the value of the locRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCRecCType }
     *     
     */
    public void setLOCRec(LOCRecCType value) {
        this.locRec = value;
    }

    /**
     * Gets the value of the locDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCDescType }
     *     
     */
    public LOCDescType getLOCDesc() {
        return locDesc;
    }

    /**
     * Sets the value of the locDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCDescType }
     *     
     */
    public void setLOCDesc(LOCDescType value) {
        this.locDesc = value;
    }

    /**
     * Gets the value of the locStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCStatDescType }
     *     
     */
    public LOCStatDescType getLOCStatDesc() {
        return locStatDesc;
    }

    /**
     * Sets the value of the locStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCStatDescType }
     *     
     */
    public void setLOCStatDesc(LOCStatDescType value) {
        this.locStatDesc = value;
    }

    /**
     * Gets the value of the locBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getLOCBrDesc() {
        return locBrDesc;
    }

    /**
     * Sets the value of the locBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setLOCBrDesc(BrDescType value) {
        this.locBrDesc = value;
    }

    /**
     * Gets the value of the locOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getLOCOffDesc() {
        return locOffDesc;
    }

    /**
     * Sets the value of the locOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setLOCOffDesc(OffDescType value) {
        this.locOffDesc = value;
    }

    /**
     * Gets the value of the locPrtcpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPrtcpDescType }
     *     
     */
    public LOCPrtcpDescType getLOCPrtcpDesc() {
        return locPrtcpDesc;
    }

    /**
     * Sets the value of the locPrtcpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPrtcpDescType }
     *     
     */
    public void setLOCPrtcpDesc(LOCPrtcpDescType value) {
        this.locPrtcpDesc = value;
    }

    /**
     * Gets the value of the locStmtFreqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFreqDescType }
     *     
     */
    public StmtFreqDescType getLOCStmtFreqDesc() {
        return locStmtFreqDesc;
    }

    /**
     * Sets the value of the locStmtFreqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFreqDescType }
     *     
     */
    public void setLOCStmtFreqDesc(StmtFreqDescType value) {
        this.locStmtFreqDesc = value;
    }

    /**
     * Gets the value of the locCallRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CallRptDescType }
     *     
     */
    public CallRptDescType getLOCCallRptDesc() {
        return locCallRptDesc;
    }

    /**
     * Sets the value of the locCallRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRptDescType }
     *     
     */
    public void setLOCCallRptDesc(CallRptDescType value) {
        this.locCallRptDesc = value;
    }

    /**
     * Gets the value of the locCollatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDescType }
     *     
     */
    public CollatDescType getLOCCollatDesc() {
        return locCollatDesc;
    }

    /**
     * Sets the value of the locCollatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDescType }
     *     
     */
    public void setLOCCollatDesc(CollatDescType value) {
        this.locCollatDesc = value;
    }

    /**
     * Gets the value of the locRiskDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCRiskDescType }
     *     
     */
    public LOCRiskDescType getLOCRiskDesc() {
        return locRiskDesc;
    }

    /**
     * Sets the value of the locRiskDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCRiskDescType }
     *     
     */
    public void setLOCRiskDesc(LOCRiskDescType value) {
        this.locRiskDesc = value;
    }

    /**
     * Gets the value of the locClsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LOCClsDescType }
     *     
     */
    public LOCClsDescType getLOCClsDesc() {
        return locClsDesc;
    }

    /**
     * Sets the value of the locClsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCClsDescType }
     *     
     */
    public void setLOCClsDesc(LOCClsDescType value) {
        this.locClsDesc = value;
    }

    /**
     * Gets the value of the locHistArray property.
     * 
     * @return
     *     possible object is
     *     {@link LOCHistArrayAType }
     *     
     */
    public LOCHistArrayAType getLOCHistArray() {
        return locHistArray;
    }

    /**
     * Sets the value of the locHistArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCHistArrayAType }
     *     
     */
    public void setLOCHistArray(LOCHistArrayAType value) {
        this.locHistArray = value;
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
     * Gets the value of the locGdnceBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceBalType }
     *     
     */
    public LOCGdnceBalType getLOCGdnceBal() {
        return locGdnceBal;
    }

    /**
     * Sets the value of the locGdnceBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceBalType }
     *     
     */
    public void setLOCGdnceBal(LOCGdnceBalType value) {
        this.locGdnceBal = value;
    }

    /**
     * Gets the value of the locGdnceAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceAvlBalType }
     *     
     */
    public LOCGdnceAvlBalType getLOCGdnceAvlBal() {
        return locGdnceAvlBal;
    }

    /**
     * Sets the value of the locGdnceAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceAvlBalType }
     *     
     */
    public void setLOCGdnceAvlBal(LOCGdnceAvlBalType value) {
        this.locGdnceAvlBal = value;
    }

    /**
     * Gets the value of the locPrincRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCPrincRedAmtType }
     *     
     */
    public LOCPrincRedAmtType getLOCPrincRedAmt() {
        return locPrincRedAmt;
    }

    /**
     * Sets the value of the locPrincRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCPrincRedAmtType }
     *     
     */
    public void setLOCPrincRedAmt(LOCPrincRedAmtType value) {
        this.locPrincRedAmt = value;
    }

    /**
     * Gets the value of the locGdnceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link LOCGdnceOrderType }
     *     
     */
    public LOCGdnceOrderType getLOCGdnceOrder() {
        return locGdnceOrder;
    }

    /**
     * Sets the value of the locGdnceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCGdnceOrderType }
     *     
     */
    public void setLOCGdnceOrder(LOCGdnceOrderType value) {
        this.locGdnceOrder = value;
    }

    /**
     * Gets the value of the locMasterAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCMasterAcctIdType }
     *     
     */
    public LOCMasterAcctIdType getLOCMasterAcctId() {
        return locMasterAcctId;
    }

    /**
     * Sets the value of the locMasterAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCMasterAcctIdType }
     *     
     */
    public void setLOCMasterAcctId(LOCMasterAcctIdType value) {
        this.locMasterAcctId = value;
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
     * Gets the value of the constBdgType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstBdgTypeType }
     *     
     */
    public ConstBdgTypeType getConstBdgType() {
        return constBdgType;
    }

    /**
     * Sets the value of the constBdgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstBdgTypeType }
     *     
     */
    public void setConstBdgType(ConstBdgTypeType value) {
        this.constBdgType = value;
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
