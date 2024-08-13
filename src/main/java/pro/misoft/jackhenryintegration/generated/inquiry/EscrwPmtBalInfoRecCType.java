
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EscrwPmtBalInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwPmtBalInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwPmtBalArray" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtBalArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EscrwYTDIntPaid" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwYTDIntPaid_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPmtEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtPmtEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtPmtEffDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EscrwCouponReOrder" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwCouponReOrder_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EscrwPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPaidYTD_Type" minOccurs="0"/&gt;
 *             &lt;element name="EscrwPaidPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPaidPYTD_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="PMIPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PMIPmtAmt_Type" minOccurs="0"/&gt;
 *               &lt;element name="PMIPmtYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PMIPmtYTD_Type" minOccurs="0"/&gt;
 *               &lt;element name="PMIPmtPrevYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PMIPmtPrevYTD_Type" minOccurs="0"/&gt;
 *               &lt;element name="PMIPmtPart" type="{http://jackhenry.com/jxchange/TPG/2008}PMIPmtPart_Type" minOccurs="0"/&gt;
 *               &lt;element name="PMIPrepaidAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PMIPrepaidAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwPmtBalInfoRec_CType", propOrder = {
    "escrwPmtBalArray",
    "escrwYTDIntPaid",
    "escrwPmtEffDt",
    "escrwShtPmtEffDt",
    "ver1",
    "escrwCouponReOrder",
    "ver2",
    "escrwPaidYTD",
    "escrwPaidPYTD",
    "ver3",
    "pmiPmtAmt",
    "pmiPmtYTD",
    "pmiPmtPrevYTD",
    "pmiPmtPart",
    "pmiPrepaidAmt",
    "ver4",
    "any"
})
public class EscrwPmtBalInfoRecCType {

    @XmlElement(name = "EscrwPmtBalArray")
    protected EscrwPmtBalArrayAType escrwPmtBalArray;
    @XmlElementRef(name = "EscrwYTDIntPaid", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwYTDIntPaidType> escrwYTDIntPaid;
    @XmlElementRef(name = "EscrwPmtEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPmtEffDtType> escrwPmtEffDt;
    @XmlElementRef(name = "EscrwShtPmtEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtPmtEffDtType> escrwShtPmtEffDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "EscrwCouponReOrder", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwCouponReOrderType> escrwCouponReOrder;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "EscrwPaidYTD")
    protected EscrwPaidYTDType escrwPaidYTD;
    @XmlElement(name = "EscrwPaidPYTD")
    protected EscrwPaidPYTDType escrwPaidPYTD;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "PMIPmtAmt")
    protected PMIPmtAmtType pmiPmtAmt;
    @XmlElement(name = "PMIPmtYTD")
    protected PMIPmtYTDType pmiPmtYTD;
    @XmlElement(name = "PMIPmtPrevYTD")
    protected PMIPmtPrevYTDType pmiPmtPrevYTD;
    @XmlElement(name = "PMIPmtPart")
    protected PMIPmtPartType pmiPmtPart;
    @XmlElement(name = "PMIPrepaidAmt")
    protected PMIPrepaidAmtType pmiPrepaidAmt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwPmtBalArray property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPmtBalArrayAType }
     *     
     */
    public EscrwPmtBalArrayAType getEscrwPmtBalArray() {
        return escrwPmtBalArray;
    }

    /**
     * Sets the value of the escrwPmtBalArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPmtBalArrayAType }
     *     
     */
    public void setEscrwPmtBalArray(EscrwPmtBalArrayAType value) {
        this.escrwPmtBalArray = value;
    }

    /**
     * Gets the value of the escrwYTDIntPaid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwYTDIntPaidType }{@code >}
     *     
     */
    public JAXBElement<EscrwYTDIntPaidType> getEscrwYTDIntPaid() {
        return escrwYTDIntPaid;
    }

    /**
     * Sets the value of the escrwYTDIntPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwYTDIntPaidType }{@code >}
     *     
     */
    public void setEscrwYTDIntPaid(JAXBElement<EscrwYTDIntPaidType> value) {
        this.escrwYTDIntPaid = value;
    }

    /**
     * Gets the value of the escrwPmtEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtEffDtType }{@code >}
     *     
     */
    public JAXBElement<EscrwPmtEffDtType> getEscrwPmtEffDt() {
        return escrwPmtEffDt;
    }

    /**
     * Sets the value of the escrwPmtEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPmtEffDtType }{@code >}
     *     
     */
    public void setEscrwPmtEffDt(JAXBElement<EscrwPmtEffDtType> value) {
        this.escrwPmtEffDt = value;
    }

    /**
     * Gets the value of the escrwShtPmtEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtPmtEffDtType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtPmtEffDtType> getEscrwShtPmtEffDt() {
        return escrwShtPmtEffDt;
    }

    /**
     * Sets the value of the escrwShtPmtEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtPmtEffDtType }{@code >}
     *     
     */
    public void setEscrwShtPmtEffDt(JAXBElement<EscrwShtPmtEffDtType> value) {
        this.escrwShtPmtEffDt = value;
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
     * Gets the value of the escrwCouponReOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwCouponReOrderType }{@code >}
     *     
     */
    public JAXBElement<EscrwCouponReOrderType> getEscrwCouponReOrder() {
        return escrwCouponReOrder;
    }

    /**
     * Sets the value of the escrwCouponReOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwCouponReOrderType }{@code >}
     *     
     */
    public void setEscrwCouponReOrder(JAXBElement<EscrwCouponReOrderType> value) {
        this.escrwCouponReOrder = value;
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
     * Gets the value of the escrwPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPaidYTDType }
     *     
     */
    public EscrwPaidYTDType getEscrwPaidYTD() {
        return escrwPaidYTD;
    }

    /**
     * Sets the value of the escrwPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPaidYTDType }
     *     
     */
    public void setEscrwPaidYTD(EscrwPaidYTDType value) {
        this.escrwPaidYTD = value;
    }

    /**
     * Gets the value of the escrwPaidPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPaidPYTDType }
     *     
     */
    public EscrwPaidPYTDType getEscrwPaidPYTD() {
        return escrwPaidPYTD;
    }

    /**
     * Sets the value of the escrwPaidPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPaidPYTDType }
     *     
     */
    public void setEscrwPaidPYTD(EscrwPaidPYTDType value) {
        this.escrwPaidPYTD = value;
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
     * Gets the value of the pmiPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PMIPmtAmtType }
     *     
     */
    public PMIPmtAmtType getPMIPmtAmt() {
        return pmiPmtAmt;
    }

    /**
     * Sets the value of the pmiPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMIPmtAmtType }
     *     
     */
    public void setPMIPmtAmt(PMIPmtAmtType value) {
        this.pmiPmtAmt = value;
    }

    /**
     * Gets the value of the pmiPmtYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PMIPmtYTDType }
     *     
     */
    public PMIPmtYTDType getPMIPmtYTD() {
        return pmiPmtYTD;
    }

    /**
     * Sets the value of the pmiPmtYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMIPmtYTDType }
     *     
     */
    public void setPMIPmtYTD(PMIPmtYTDType value) {
        this.pmiPmtYTD = value;
    }

    /**
     * Gets the value of the pmiPmtPrevYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PMIPmtPrevYTDType }
     *     
     */
    public PMIPmtPrevYTDType getPMIPmtPrevYTD() {
        return pmiPmtPrevYTD;
    }

    /**
     * Sets the value of the pmiPmtPrevYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMIPmtPrevYTDType }
     *     
     */
    public void setPMIPmtPrevYTD(PMIPmtPrevYTDType value) {
        this.pmiPmtPrevYTD = value;
    }

    /**
     * Gets the value of the pmiPmtPart property.
     * 
     * @return
     *     possible object is
     *     {@link PMIPmtPartType }
     *     
     */
    public PMIPmtPartType getPMIPmtPart() {
        return pmiPmtPart;
    }

    /**
     * Sets the value of the pmiPmtPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMIPmtPartType }
     *     
     */
    public void setPMIPmtPart(PMIPmtPartType value) {
        this.pmiPmtPart = value;
    }

    /**
     * Gets the value of the pmiPrepaidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PMIPrepaidAmtType }
     *     
     */
    public PMIPrepaidAmtType getPMIPrepaidAmt() {
        return pmiPrepaidAmt;
    }

    /**
     * Sets the value of the pmiPrepaidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMIPrepaidAmtType }
     *     
     */
    public void setPMIPrepaidAmt(PMIPrepaidAmtType value) {
        this.pmiPrepaidAmt = value;
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
