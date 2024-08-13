
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
 * <p>Java class for XferExpSrchInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferExpSrchInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctIdFrom" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdFrom_CType"/&gt;
 *         &lt;element name="AcctIdTo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdTo_CType"/&gt;
 *         &lt;element name="XferKey" type="{http://jackhenry.com/jxchange/TPG/2008}XferKey_Type"/&gt;
 *         &lt;element name="XferType" type="{http://jackhenry.com/jxchange/TPG/2008}XferType_Type"/&gt;
 *         &lt;element name="XferAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferNxtDt" type="{http://jackhenry.com/jxchange/TPG/2008}XferNxtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "XferExpSrchInfo_CType", propOrder = {
    "acctIdFrom",
    "acctIdTo",
    "xferKey",
    "xferType",
    "xferAmt",
    "xferNxtDt",
    "xferExpDt",
    "custom",
    "ver1",
    "lnUnitId",
    "ver2",
    "any"
})
public class XferExpSrchInfoCType {

    @XmlElement(name = "AcctIdFrom", required = true)
    protected AcctIdFromCType acctIdFrom;
    @XmlElement(name = "AcctIdTo", required = true)
    protected AcctIdToCType acctIdTo;
    @XmlElement(name = "XferKey", required = true)
    protected XferKeyType xferKey;
    @XmlElement(name = "XferType", required = true)
    protected XferTypeType xferType;
    @XmlElement(name = "XferAmt")
    protected AmtType xferAmt;
    @XmlElement(name = "XferNxtDt")
    protected XferNxtDtType xferNxtDt;
    @XmlElement(name = "XferExpDt")
    protected ExpDtType xferExpDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
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
     * Gets the value of the xferType property.
     * 
     * @return
     *     possible object is
     *     {@link XferTypeType }
     *     
     */
    public XferTypeType getXferType() {
        return xferType;
    }

    /**
     * Sets the value of the xferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferTypeType }
     *     
     */
    public void setXferType(XferTypeType value) {
        this.xferType = value;
    }

    /**
     * Gets the value of the xferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getXferAmt() {
        return xferAmt;
    }

    /**
     * Sets the value of the xferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setXferAmt(AmtType value) {
        this.xferAmt = value;
    }

    /**
     * Gets the value of the xferNxtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XferNxtDtType }
     *     
     */
    public XferNxtDtType getXferNxtDt() {
        return xferNxtDt;
    }

    /**
     * Sets the value of the xferNxtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferNxtDtType }
     *     
     */
    public void setXferNxtDt(XferNxtDtType value) {
        this.xferNxtDt = value;
    }

    /**
     * Gets the value of the xferExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getXferExpDt() {
        return xferExpDt;
    }

    /**
     * Sets the value of the xferExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setXferExpDt(ExpDtType value) {
        this.xferExpDt = value;
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
