
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
 * <p>Java class for x_IntnetInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_IntnetInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntnetInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="BillPayProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetIdStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetIdStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctViewAvlBalDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctViewAvlBalDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnXferAvlBalDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnXferAvlBalDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferAvlBalDesc" type="{http://jackhenry.com/jxchange/TPG/2008}XferAvlBalDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BillPayAvlBalDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BillPayAvlBalDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_IntnetInfoRec_CType", propOrder = {
    "intnetInfoRec",
    "billPayProdDesc",
    "intnetIdStatDesc",
    "acctViewAvlBalDesc",
    "trnXferAvlBalDesc",
    "xferAvlBalDesc",
    "billPayAvlBalDesc",
    "custom",
    "ver1",
    "custId",
    "ver2",
    "any"
})
public class XIntnetInfoRecCType {

    @XmlElement(name = "IntnetInfoRec")
    protected IntnetInfoRecCType intnetInfoRec;
    @XmlElement(name = "BillPayProdDesc")
    protected BillPayProdDescType billPayProdDesc;
    @XmlElement(name = "IntnetIdStatDesc")
    protected IntnetIdStatDescType intnetIdStatDesc;
    @XmlElement(name = "AcctViewAvlBalDesc")
    protected AcctViewAvlBalDescType acctViewAvlBalDesc;
    @XmlElement(name = "TrnXferAvlBalDesc")
    protected TrnXferAvlBalDescType trnXferAvlBalDesc;
    @XmlElement(name = "XferAvlBalDesc")
    protected XferAvlBalDescType xferAvlBalDesc;
    @XmlElement(name = "BillPayAvlBalDesc")
    protected BillPayAvlBalDescType billPayAvlBalDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the intnetInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetInfoRecCType }
     *     
     */
    public IntnetInfoRecCType getIntnetInfoRec() {
        return intnetInfoRec;
    }

    /**
     * Sets the value of the intnetInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetInfoRecCType }
     *     
     */
    public void setIntnetInfoRec(IntnetInfoRecCType value) {
        this.intnetInfoRec = value;
    }

    /**
     * Gets the value of the billPayProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayProdDescType }
     *     
     */
    public BillPayProdDescType getBillPayProdDesc() {
        return billPayProdDesc;
    }

    /**
     * Sets the value of the billPayProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayProdDescType }
     *     
     */
    public void setBillPayProdDesc(BillPayProdDescType value) {
        this.billPayProdDesc = value;
    }

    /**
     * Gets the value of the intnetIdStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetIdStatDescType }
     *     
     */
    public IntnetIdStatDescType getIntnetIdStatDesc() {
        return intnetIdStatDesc;
    }

    /**
     * Sets the value of the intnetIdStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetIdStatDescType }
     *     
     */
    public void setIntnetIdStatDesc(IntnetIdStatDescType value) {
        this.intnetIdStatDesc = value;
    }

    /**
     * Gets the value of the acctViewAvlBalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctViewAvlBalDescType }
     *     
     */
    public AcctViewAvlBalDescType getAcctViewAvlBalDesc() {
        return acctViewAvlBalDesc;
    }

    /**
     * Sets the value of the acctViewAvlBalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctViewAvlBalDescType }
     *     
     */
    public void setAcctViewAvlBalDesc(AcctViewAvlBalDescType value) {
        this.acctViewAvlBalDesc = value;
    }

    /**
     * Gets the value of the trnXferAvlBalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnXferAvlBalDescType }
     *     
     */
    public TrnXferAvlBalDescType getTrnXferAvlBalDesc() {
        return trnXferAvlBalDesc;
    }

    /**
     * Sets the value of the trnXferAvlBalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnXferAvlBalDescType }
     *     
     */
    public void setTrnXferAvlBalDesc(TrnXferAvlBalDescType value) {
        this.trnXferAvlBalDesc = value;
    }

    /**
     * Gets the value of the xferAvlBalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link XferAvlBalDescType }
     *     
     */
    public XferAvlBalDescType getXferAvlBalDesc() {
        return xferAvlBalDesc;
    }

    /**
     * Sets the value of the xferAvlBalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferAvlBalDescType }
     *     
     */
    public void setXferAvlBalDesc(XferAvlBalDescType value) {
        this.xferAvlBalDesc = value;
    }

    /**
     * Gets the value of the billPayAvlBalDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayAvlBalDescType }
     *     
     */
    public BillPayAvlBalDescType getBillPayAvlBalDesc() {
        return billPayAvlBalDesc;
    }

    /**
     * Sets the value of the billPayAvlBalDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayAvlBalDescType }
     *     
     */
    public void setBillPayAvlBalDesc(BillPayAvlBalDescType value) {
        this.billPayAvlBalDesc = value;
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
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
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
