
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * An invoice
 * 
 * <p>Java class for InvoiceInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceId" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNum" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceCat" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceCat_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceDesc" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAmtPos" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceAmtPos_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAmtNeg" type="{http://jackhenry.com/jxchange/TPG/2008}InvoiceAmtNeg_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceInfo_CType", propOrder = {
    "invoiceId",
    "invoiceNum",
    "invoiceCat",
    "invoiceDesc",
    "invoiceAmtPos",
    "invoiceAmtNeg",
    "custom",
    "ver1",
    "any"
})
public class InvoiceInfoCType {

    @XmlElement(name = "InvoiceId")
    protected InvoiceIdType invoiceId;
    @XmlElement(name = "InvoiceNum")
    protected InvoiceNumType invoiceNum;
    @XmlElement(name = "InvoiceCat")
    protected InvoiceCatType invoiceCat;
    @XmlElement(name = "InvoiceDesc")
    protected InvoiceDescType invoiceDesc;
    @XmlElement(name = "InvoiceAmtPos")
    protected InvoiceAmtPosType invoiceAmtPos;
    @XmlElement(name = "InvoiceAmtNeg")
    protected InvoiceAmtNegType invoiceAmtNeg;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIdType }
     *     
     */
    public InvoiceIdType getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIdType }
     *     
     */
    public void setInvoiceId(InvoiceIdType value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceNumType }
     *     
     */
    public InvoiceNumType getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceNumType }
     *     
     */
    public void setInvoiceNum(InvoiceNumType value) {
        this.invoiceNum = value;
    }

    /**
     * Gets the value of the invoiceCat property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceCatType }
     *     
     */
    public InvoiceCatType getInvoiceCat() {
        return invoiceCat;
    }

    /**
     * Sets the value of the invoiceCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceCatType }
     *     
     */
    public void setInvoiceCat(InvoiceCatType value) {
        this.invoiceCat = value;
    }

    /**
     * Gets the value of the invoiceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDescType }
     *     
     */
    public InvoiceDescType getInvoiceDesc() {
        return invoiceDesc;
    }

    /**
     * Sets the value of the invoiceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDescType }
     *     
     */
    public void setInvoiceDesc(InvoiceDescType value) {
        this.invoiceDesc = value;
    }

    /**
     * Gets the value of the invoiceAmtPos property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAmtPosType }
     *     
     */
    public InvoiceAmtPosType getInvoiceAmtPos() {
        return invoiceAmtPos;
    }

    /**
     * Sets the value of the invoiceAmtPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAmtPosType }
     *     
     */
    public void setInvoiceAmtPos(InvoiceAmtPosType value) {
        this.invoiceAmtPos = value;
    }

    /**
     * Gets the value of the invoiceAmtNeg property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAmtNegType }
     *     
     */
    public InvoiceAmtNegType getInvoiceAmtNeg() {
        return invoiceAmtNeg;
    }

    /**
     * Sets the value of the invoiceAmtNeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAmtNegType }
     *     
     */
    public void setInvoiceAmtNeg(InvoiceAmtNegType value) {
        this.invoiceAmtNeg = value;
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
     * {@link Element }
     * {@link Object }
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
