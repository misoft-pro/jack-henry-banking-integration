
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
 * <p>Java class for FutXferSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FutXferSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctIdFrom" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdFrom_CType"/&gt;
 *         &lt;element name="AcctIdTo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdTo_CType"/&gt;
 *         &lt;element name="XferKey" type="{http://jackhenry.com/jxchange/TPG/2008}XferKey_Type"/&gt;
 *         &lt;element name="FutXferRec" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferRec_CType"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferUseLnAmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferUseLnAmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferUseLnDtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferUseLnDtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferNSFDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferNSFDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FutXferLateChgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferLateChgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CustIdFrom" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;element name="CustIdTo" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FutXferMatPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FutXferMatPmtDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FutXferSrchRec_CType", propOrder = {
    "acctIdFrom",
    "acctIdTo",
    "xferKey",
    "futXferRec",
    "trnCodeDesc",
    "futXferUseLnAmtDesc",
    "futXferUseLnDtDesc",
    "futXferNSFDesc",
    "futXferLateChgDesc",
    "custom",
    "ver1",
    "custIdFrom",
    "custIdTo",
    "ver2",
    "futXferMatPmtDesc",
    "ver3",
    "lnUnitId",
    "ver4",
    "any"
})
public class FutXferSrchRecCType {

    @XmlElement(name = "AcctIdFrom", required = true)
    protected AcctIdFromCType acctIdFrom;
    @XmlElement(name = "AcctIdTo", required = true)
    protected AcctIdToCType acctIdTo;
    @XmlElement(name = "XferKey", required = true)
    protected XferKeyType xferKey;
    @XmlElement(name = "FutXferRec", required = true)
    protected FutXferRecCType futXferRec;
    @XmlElement(name = "TrnCodeDesc")
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "FutXferUseLnAmtDesc")
    protected FutXferUseLnAmtDescType futXferUseLnAmtDesc;
    @XmlElement(name = "FutXferUseLnDtDesc")
    protected FutXferUseLnDtDescType futXferUseLnDtDesc;
    @XmlElement(name = "FutXferNSFDesc")
    protected FutXferNSFDescType futXferNSFDesc;
    @XmlElement(name = "FutXferLateChgDesc")
    protected FutXferLateChgDescType futXferLateChgDesc;
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
    @XmlElement(name = "FutXferMatPmtDesc")
    protected FutXferMatPmtDescType futXferMatPmtDesc;
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
     * Gets the value of the futXferRec property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferRecCType }
     *     
     */
    public FutXferRecCType getFutXferRec() {
        return futXferRec;
    }

    /**
     * Sets the value of the futXferRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferRecCType }
     *     
     */
    public void setFutXferRec(FutXferRecCType value) {
        this.futXferRec = value;
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
     * Gets the value of the futXferUseLnAmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferUseLnAmtDescType }
     *     
     */
    public FutXferUseLnAmtDescType getFutXferUseLnAmtDesc() {
        return futXferUseLnAmtDesc;
    }

    /**
     * Sets the value of the futXferUseLnAmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferUseLnAmtDescType }
     *     
     */
    public void setFutXferUseLnAmtDesc(FutXferUseLnAmtDescType value) {
        this.futXferUseLnAmtDesc = value;
    }

    /**
     * Gets the value of the futXferUseLnDtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferUseLnDtDescType }
     *     
     */
    public FutXferUseLnDtDescType getFutXferUseLnDtDesc() {
        return futXferUseLnDtDesc;
    }

    /**
     * Sets the value of the futXferUseLnDtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferUseLnDtDescType }
     *     
     */
    public void setFutXferUseLnDtDesc(FutXferUseLnDtDescType value) {
        this.futXferUseLnDtDesc = value;
    }

    /**
     * Gets the value of the futXferNSFDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferNSFDescType }
     *     
     */
    public FutXferNSFDescType getFutXferNSFDesc() {
        return futXferNSFDesc;
    }

    /**
     * Sets the value of the futXferNSFDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferNSFDescType }
     *     
     */
    public void setFutXferNSFDesc(FutXferNSFDescType value) {
        this.futXferNSFDesc = value;
    }

    /**
     * Gets the value of the futXferLateChgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferLateChgDescType }
     *     
     */
    public FutXferLateChgDescType getFutXferLateChgDesc() {
        return futXferLateChgDesc;
    }

    /**
     * Sets the value of the futXferLateChgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferLateChgDescType }
     *     
     */
    public void setFutXferLateChgDesc(FutXferLateChgDescType value) {
        this.futXferLateChgDesc = value;
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
     * Gets the value of the futXferMatPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FutXferMatPmtDescType }
     *     
     */
    public FutXferMatPmtDescType getFutXferMatPmtDesc() {
        return futXferMatPmtDesc;
    }

    /**
     * Sets the value of the futXferMatPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutXferMatPmtDescType }
     *     
     */
    public void setFutXferMatPmtDesc(FutXferMatPmtDescType value) {
        this.futXferMatPmtDesc = value;
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
