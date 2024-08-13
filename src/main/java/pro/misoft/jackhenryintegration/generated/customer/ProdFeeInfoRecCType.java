
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
 * <p>Java class for ProdFeeInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdFeeInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeePct" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeePct_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ProdFeeInfoRec_CType", propOrder = {
    "feeCode",
    "feeDesc",
    "feeAmt",
    "feePct",
    "ver1",
    "any"
})
public class ProdFeeInfoRecCType {

    @XmlElement(name = "FeeCode")
    protected SvcFeeCodeType feeCode;
    @XmlElement(name = "FeeDesc")
    protected SvcFeeDescType feeDesc;
    @XmlElement(name = "FeeAmt")
    protected SvcFeeAmtType feeAmt;
    @XmlElement(name = "FeePct")
    protected SvcFeePctType feePct;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the feeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeCodeType }
     *     
     */
    public SvcFeeCodeType getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the value of the feeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeCodeType }
     *     
     */
    public void setFeeCode(SvcFeeCodeType value) {
        this.feeCode = value;
    }

    /**
     * Gets the value of the feeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeDescType }
     *     
     */
    public SvcFeeDescType getFeeDesc() {
        return feeDesc;
    }

    /**
     * Sets the value of the feeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeDescType }
     *     
     */
    public void setFeeDesc(SvcFeeDescType value) {
        this.feeDesc = value;
    }

    /**
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeAmtType }
     *     
     */
    public SvcFeeAmtType getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeAmtType }
     *     
     */
    public void setFeeAmt(SvcFeeAmtType value) {
        this.feeAmt = value;
    }

    /**
     * Gets the value of the feePct property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeePctType }
     *     
     */
    public SvcFeePctType getFeePct() {
        return feePct;
    }

    /**
     * Sets the value of the feePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeePctType }
     *     
     */
    public void setFeePct(SvcFeePctType value) {
        this.feePct = value;
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
