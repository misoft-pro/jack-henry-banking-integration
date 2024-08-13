
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
 * <p>Java class for ACHXferSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHXferSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctIdFrom" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdFrom_CType"/&gt;
 *         &lt;element name="AcctIdTo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdTo_CType"/&gt;
 *         &lt;element name="XferKey" type="{http://jackhenry.com/jxchange/TPG/2008}XferKey_Type"/&gt;
 *         &lt;element name="ACHXferRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferRec_CType"/&gt;
 *         &lt;element name="ACHDrBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrBrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrTrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrTrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrBrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrTrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrTrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHSendPreNoteDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHSendPreNoteDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHUseLnDtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHUseLnDtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHUseLnAmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHUseLnAmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHNSFDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHNSFDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeDrBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeDrBrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeDrTrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeDrTrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeCrBrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeCrBrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFeeCrTrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFeeCrTrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHAcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CustIdFrom" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;element name="CustIdTo" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ACHXferMatPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferMatPmtDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "ACHXferSrchRec_CType", propOrder = {
    "acctIdFrom",
    "acctIdTo",
    "xferKey",
    "achXferRec",
    "achDrBrDesc",
    "achDrTrnCodeDesc",
    "achCrBrDesc",
    "achCrTrnCodeDesc",
    "achSendPreNoteDesc",
    "achUseLnDtDesc",
    "achUseLnAmtDesc",
    "achnsfDesc",
    "achFeeDrBrDesc",
    "achFeeDrTrnCodeDesc",
    "achFeeCrBrDesc",
    "achFeeCrTrnCodeDesc",
    "achAcctStatDesc",
    "custom",
    "ver1",
    "custIdFrom",
    "custIdTo",
    "ver2",
    "achXferMatPmtDesc",
    "ver3",
    "lnUnitId",
    "ver4",
    "any"
})
public class ACHXferSrchRecCType {

    @XmlElement(name = "AcctIdFrom", required = true)
    protected AcctIdFromCType acctIdFrom;
    @XmlElement(name = "AcctIdTo", required = true)
    protected AcctIdToCType acctIdTo;
    @XmlElement(name = "XferKey", required = true)
    protected XferKeyType xferKey;
    @XmlElement(name = "ACHXferRec", required = true)
    protected ACHXferRecCType achXferRec;
    @XmlElement(name = "ACHDrBrDesc")
    protected ACHDrBrDescType achDrBrDesc;
    @XmlElement(name = "ACHDrTrnCodeDesc")
    protected ACHDrTrnCodeDescType achDrTrnCodeDesc;
    @XmlElement(name = "ACHCrBrDesc")
    protected ACHCrBrDescType achCrBrDesc;
    @XmlElement(name = "ACHCrTrnCodeDesc")
    protected ACHCrTrnCodeDescType achCrTrnCodeDesc;
    @XmlElement(name = "ACHSendPreNoteDesc")
    protected ACHSendPreNoteDescType achSendPreNoteDesc;
    @XmlElement(name = "ACHUseLnDtDesc")
    protected ACHUseLnDtDescType achUseLnDtDesc;
    @XmlElement(name = "ACHUseLnAmtDesc")
    protected ACHUseLnAmtDescType achUseLnAmtDesc;
    @XmlElement(name = "ACHNSFDesc")
    protected ACHNSFDescType achnsfDesc;
    @XmlElement(name = "ACHFeeDrBrDesc")
    protected ACHFeeDrBrDescType achFeeDrBrDesc;
    @XmlElement(name = "ACHFeeDrTrnCodeDesc")
    protected ACHFeeDrTrnCodeDescType achFeeDrTrnCodeDesc;
    @XmlElement(name = "ACHFeeCrBrDesc")
    protected ACHFeeCrBrDescType achFeeCrBrDesc;
    @XmlElement(name = "ACHFeeCrTrnCodeDesc")
    protected ACHFeeCrTrnCodeDescType achFeeCrTrnCodeDesc;
    @XmlElement(name = "ACHAcctStatDesc")
    protected AcctStatDescType achAcctStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CustIdFrom")
    protected CustIdType custIdFrom;
    @XmlElement(name = "CustIdTo")
    protected CustIdType custIdTo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ACHXferMatPmtDesc")
    protected ACHXferMatPmtDescType achXferMatPmtDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdFromCType }
     *     
     */
    public AcctIdFromCType getAcctIdFrom() {
        return acctIdFrom;
    }

    /**
     * Sets the value of the acctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdFromCType }
     *     
     */
    public void setAcctIdFrom(AcctIdFromCType value) {
        this.acctIdFrom = value;
    }

    /**
     * Gets the value of the acctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdToCType }
     *     
     */
    public AcctIdToCType getAcctIdTo() {
        return acctIdTo;
    }

    /**
     * Sets the value of the acctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdToCType }
     *     
     */
    public void setAcctIdTo(AcctIdToCType value) {
        this.acctIdTo = value;
    }

    /**
     * Gets the value of the xferKey property.
     * 
     * @return
     *     possible object is
     *     {@link XferKeyType }
     *     
     */
    public XferKeyType getXferKey() {
        return xferKey;
    }

    /**
     * Sets the value of the xferKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferKeyType }
     *     
     */
    public void setXferKey(XferKeyType value) {
        this.xferKey = value;
    }

    /**
     * Gets the value of the achXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link ACHXferRecCType }
     *     
     */
    public ACHXferRecCType getACHXferRec() {
        return achXferRec;
    }

    /**
     * Sets the value of the achXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHXferRecCType }
     *     
     */
    public void setACHXferRec(ACHXferRecCType value) {
        this.achXferRec = value;
    }

    /**
     * Gets the value of the achDrBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrBrDescType }
     *     
     */
    public ACHDrBrDescType getACHDrBrDesc() {
        return achDrBrDesc;
    }

    /**
     * Sets the value of the achDrBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrBrDescType }
     *     
     */
    public void setACHDrBrDesc(ACHDrBrDescType value) {
        this.achDrBrDesc = value;
    }

    /**
     * Gets the value of the achDrTrnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrTrnCodeDescType }
     *     
     */
    public ACHDrTrnCodeDescType getACHDrTrnCodeDesc() {
        return achDrTrnCodeDesc;
    }

    /**
     * Sets the value of the achDrTrnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrTrnCodeDescType }
     *     
     */
    public void setACHDrTrnCodeDesc(ACHDrTrnCodeDescType value) {
        this.achDrTrnCodeDesc = value;
    }

    /**
     * Gets the value of the achCrBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCrBrDescType }
     *     
     */
    public ACHCrBrDescType getACHCrBrDesc() {
        return achCrBrDesc;
    }

    /**
     * Sets the value of the achCrBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCrBrDescType }
     *     
     */
    public void setACHCrBrDesc(ACHCrBrDescType value) {
        this.achCrBrDesc = value;
    }

    /**
     * Gets the value of the achCrTrnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCrTrnCodeDescType }
     *     
     */
    public ACHCrTrnCodeDescType getACHCrTrnCodeDesc() {
        return achCrTrnCodeDesc;
    }

    /**
     * Sets the value of the achCrTrnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCrTrnCodeDescType }
     *     
     */
    public void setACHCrTrnCodeDesc(ACHCrTrnCodeDescType value) {
        this.achCrTrnCodeDesc = value;
    }

    /**
     * Gets the value of the achSendPreNoteDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHSendPreNoteDescType }
     *     
     */
    public ACHSendPreNoteDescType getACHSendPreNoteDesc() {
        return achSendPreNoteDesc;
    }

    /**
     * Sets the value of the achSendPreNoteDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHSendPreNoteDescType }
     *     
     */
    public void setACHSendPreNoteDesc(ACHSendPreNoteDescType value) {
        this.achSendPreNoteDesc = value;
    }

    /**
     * Gets the value of the achUseLnDtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHUseLnDtDescType }
     *     
     */
    public ACHUseLnDtDescType getACHUseLnDtDesc() {
        return achUseLnDtDesc;
    }

    /**
     * Sets the value of the achUseLnDtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHUseLnDtDescType }
     *     
     */
    public void setACHUseLnDtDesc(ACHUseLnDtDescType value) {
        this.achUseLnDtDesc = value;
    }

    /**
     * Gets the value of the achUseLnAmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHUseLnAmtDescType }
     *     
     */
    public ACHUseLnAmtDescType getACHUseLnAmtDesc() {
        return achUseLnAmtDesc;
    }

    /**
     * Sets the value of the achUseLnAmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHUseLnAmtDescType }
     *     
     */
    public void setACHUseLnAmtDesc(ACHUseLnAmtDescType value) {
        this.achUseLnAmtDesc = value;
    }

    /**
     * Gets the value of the achnsfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHNSFDescType }
     *     
     */
    public ACHNSFDescType getACHNSFDesc() {
        return achnsfDesc;
    }

    /**
     * Sets the value of the achnsfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHNSFDescType }
     *     
     */
    public void setACHNSFDesc(ACHNSFDescType value) {
        this.achnsfDesc = value;
    }

    /**
     * Gets the value of the achFeeDrBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHFeeDrBrDescType }
     *     
     */
    public ACHFeeDrBrDescType getACHFeeDrBrDesc() {
        return achFeeDrBrDesc;
    }

    /**
     * Sets the value of the achFeeDrBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHFeeDrBrDescType }
     *     
     */
    public void setACHFeeDrBrDesc(ACHFeeDrBrDescType value) {
        this.achFeeDrBrDesc = value;
    }

    /**
     * Gets the value of the achFeeDrTrnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHFeeDrTrnCodeDescType }
     *     
     */
    public ACHFeeDrTrnCodeDescType getACHFeeDrTrnCodeDesc() {
        return achFeeDrTrnCodeDesc;
    }

    /**
     * Sets the value of the achFeeDrTrnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHFeeDrTrnCodeDescType }
     *     
     */
    public void setACHFeeDrTrnCodeDesc(ACHFeeDrTrnCodeDescType value) {
        this.achFeeDrTrnCodeDesc = value;
    }

    /**
     * Gets the value of the achFeeCrBrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHFeeCrBrDescType }
     *     
     */
    public ACHFeeCrBrDescType getACHFeeCrBrDesc() {
        return achFeeCrBrDesc;
    }

    /**
     * Sets the value of the achFeeCrBrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHFeeCrBrDescType }
     *     
     */
    public void setACHFeeCrBrDesc(ACHFeeCrBrDescType value) {
        this.achFeeCrBrDesc = value;
    }

    /**
     * Gets the value of the achFeeCrTrnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHFeeCrTrnCodeDescType }
     *     
     */
    public ACHFeeCrTrnCodeDescType getACHFeeCrTrnCodeDesc() {
        return achFeeCrTrnCodeDesc;
    }

    /**
     * Sets the value of the achFeeCrTrnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHFeeCrTrnCodeDescType }
     *     
     */
    public void setACHFeeCrTrnCodeDesc(ACHFeeCrTrnCodeDescType value) {
        this.achFeeCrTrnCodeDesc = value;
    }

    /**
     * Gets the value of the achAcctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatDescType }
     *     
     */
    public AcctStatDescType getACHAcctStatDesc() {
        return achAcctStatDesc;
    }

    /**
     * Sets the value of the achAcctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatDescType }
     *     
     */
    public void setACHAcctStatDesc(AcctStatDescType value) {
        this.achAcctStatDesc = value;
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
     * Gets the value of the custIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustIdFrom() {
        return custIdFrom;
    }

    /**
     * Sets the value of the custIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustIdFrom(CustIdType value) {
        this.custIdFrom = value;
    }

    /**
     * Gets the value of the custIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustIdTo() {
        return custIdTo;
    }

    /**
     * Sets the value of the custIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustIdTo(CustIdType value) {
        this.custIdTo = value;
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
     * Gets the value of the achXferMatPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHXferMatPmtDescType }
     *     
     */
    public ACHXferMatPmtDescType getACHXferMatPmtDesc() {
        return achXferMatPmtDesc;
    }

    /**
     * Sets the value of the achXferMatPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHXferMatPmtDescType }
     *     
     */
    public void setACHXferMatPmtDesc(ACHXferMatPmtDescType value) {
        this.achXferMatPmtDesc = value;
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
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setLnUnitId(LnUnitIdType value) {
        this.lnUnitId = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
