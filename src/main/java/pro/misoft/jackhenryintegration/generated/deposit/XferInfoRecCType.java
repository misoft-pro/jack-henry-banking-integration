
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for XferInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferFee" type="{http://jackhenry.com/jxchange/TPG/2008}Fee_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferPrtRcpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRcpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XferEFTDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
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
@XmlType(name = "XferInfoRec_CType", propOrder = {
    "xferFee",
    "xferPrtRcpt",
    "xferEFTDescArray",
    "ver1",
    "any"
})
public class XferInfoRecCType {

    @XmlElementRef(name = "XferFee", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FeeType> xferFee;
    @XmlElementRef(name = "XferPrtRcpt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtRcptType> xferPrtRcpt;
    @XmlElement(name = "XferEFTDescArray")
    protected EftDescAType xferEFTDescArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xferFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeeType }{@code >}
     *     
     */
    public JAXBElement<FeeType> getXferFee() {
        return xferFee;
    }

    /**
     * Sets the value of the xferFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeeType }{@code >}
     *     
     */
    public void setXferFee(JAXBElement<FeeType> value) {
        this.xferFee = value;
    }

    /**
     * Gets the value of the xferPrtRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public JAXBElement<PrtRcptType> getXferPrtRcpt() {
        return xferPrtRcpt;
    }

    /**
     * Sets the value of the xferPrtRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public void setXferPrtRcpt(JAXBElement<PrtRcptType> value) {
        this.xferPrtRcpt = value;
    }

    /**
     * Gets the value of the xferEFTDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link EftDescAType }
     *     
     */
    public EftDescAType getXferEFTDescArray() {
        return xferEFTDescArray;
    }

    /**
     * Sets the value of the xferEFTDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftDescAType }
     *     
     */
    public void setXferEFTDescArray(EftDescAType value) {
        this.xferEFTDescArray = value;
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
