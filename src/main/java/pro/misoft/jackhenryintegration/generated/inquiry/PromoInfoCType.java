
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
 * <p>Java class for PromoInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromoInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromoCode" type="{http://jackhenry.com/jxchange/TPG/2008}PromoCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PromoOrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PromoCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PromoCrYTD" type="{http://jackhenry.com/jxchange/TPG/2008}YTDInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PromoCrPrevYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrevYTDIntPaid_Type" minOccurs="0"/&gt;
 *         &lt;element name="PromoCrLTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidLTD_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PromoInfo_CType", propOrder = {
    "promoCode",
    "promoOrigBal",
    "promoCurBal",
    "promoCrYTD",
    "promoCrPrevYTD",
    "promoCrLTD",
    "ver1",
    "any"
})
public class PromoInfoCType {

    @XmlElementRef(name = "PromoCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PromoCodeType> promoCode;
    @XmlElementRef(name = "PromoOrigBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigBalType> promoOrigBal;
    @XmlElementRef(name = "PromoCurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurBalType> promoCurBal;
    @XmlElementRef(name = "PromoCrYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<YTDIntType> promoCrYTD;
    @XmlElementRef(name = "PromoCrPrevYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrevYTDIntPaidType> promoCrPrevYTD;
    @XmlElementRef(name = "PromoCrLTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntPaidLTDType> promoCrLTD;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PromoCodeType }{@code >}
     *     
     */
    public JAXBElement<PromoCodeType> getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PromoCodeType }{@code >}
     *     
     */
    public void setPromoCode(JAXBElement<PromoCodeType> value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the promoOrigBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigBalType }{@code >}
     *     
     */
    public JAXBElement<OrigBalType> getPromoOrigBal() {
        return promoOrigBal;
    }

    /**
     * Sets the value of the promoOrigBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigBalType }{@code >}
     *     
     */
    public void setPromoOrigBal(JAXBElement<OrigBalType> value) {
        this.promoOrigBal = value;
    }

    /**
     * Gets the value of the promoCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public JAXBElement<CurBalType> getPromoCurBal() {
        return promoCurBal;
    }

    /**
     * Sets the value of the promoCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public void setPromoCurBal(JAXBElement<CurBalType> value) {
        this.promoCurBal = value;
    }

    /**
     * Gets the value of the promoCrYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YTDIntType }{@code >}
     *     
     */
    public JAXBElement<YTDIntType> getPromoCrYTD() {
        return promoCrYTD;
    }

    /**
     * Sets the value of the promoCrYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YTDIntType }{@code >}
     *     
     */
    public void setPromoCrYTD(JAXBElement<YTDIntType> value) {
        this.promoCrYTD = value;
    }

    /**
     * Gets the value of the promoCrPrevYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrevYTDIntPaidType }{@code >}
     *     
     */
    public JAXBElement<PrevYTDIntPaidType> getPromoCrPrevYTD() {
        return promoCrPrevYTD;
    }

    /**
     * Sets the value of the promoCrPrevYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrevYTDIntPaidType }{@code >}
     *     
     */
    public void setPromoCrPrevYTD(JAXBElement<PrevYTDIntPaidType> value) {
        this.promoCrPrevYTD = value;
    }

    /**
     * Gets the value of the promoCrLTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntPaidLTDType }{@code >}
     *     
     */
    public JAXBElement<IntPaidLTDType> getPromoCrLTD() {
        return promoCrLTD;
    }

    /**
     * Sets the value of the promoCrLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntPaidLTDType }{@code >}
     *     
     */
    public void setPromoCrLTD(JAXBElement<IntPaidLTDType> value) {
        this.promoCrLTD = value;
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
