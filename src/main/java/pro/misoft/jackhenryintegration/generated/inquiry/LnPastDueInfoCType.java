
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
 * <p>Java class for LnPastDueInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPastDueInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PastDue90YTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue90YTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue90LTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue90LTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue90LastYr" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue90LastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue60YTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue60YTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue60LTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue60LTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue60LastYr" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue60LastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue30YTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue30YTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue30LTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue30LTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue30LastYr" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue30LastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue180YTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue180YTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue180LTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue180LTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue180LastYr" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue180LastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue150YTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue150YTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue150LTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue150LTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue150LastYr" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue150LastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue120YTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue120YTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue120LTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue120LTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue120LastYr" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue120LastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue10YTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue10YTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue10LTD" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue10LTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="PastDue10LastYr" type="{http://jackhenry.com/jxchange/TPG/2008}PastDue10LastYr_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PastDueArray" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="DlqConDt" type="{http://jackhenry.com/jxchange/TPG/2008}DlqConDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnPastDueInfo_CType", propOrder = {
    "pastDue90YTD",
    "pastDue90LTD",
    "pastDue90LastYr",
    "pastDue60YTD",
    "pastDue60LTD",
    "pastDue60LastYr",
    "pastDue30YTD",
    "pastDue30LTD",
    "pastDue30LastYr",
    "pastDue180YTD",
    "pastDue180LTD",
    "pastDue180LastYr",
    "pastDue150YTD",
    "pastDue150LTD",
    "pastDue150LastYr",
    "pastDue120YTD",
    "pastDue120LTD",
    "pastDue120LastYr",
    "pastDue10YTD",
    "pastDue10LTD",
    "pastDue10LastYr",
    "ver1",
    "pastDueArray",
    "ver2",
    "dlqConDt",
    "ver3",
    "any"
})
public class LnPastDueInfoCType {

    @XmlElementRef(name = "PastDue90YTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue90YTDType> pastDue90YTD;
    @XmlElementRef(name = "PastDue90LTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue90LTDType> pastDue90LTD;
    @XmlElementRef(name = "PastDue90LastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue90LastYrType> pastDue90LastYr;
    @XmlElementRef(name = "PastDue60YTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue60YTDType> pastDue60YTD;
    @XmlElementRef(name = "PastDue60LTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue60LTDType> pastDue60LTD;
    @XmlElementRef(name = "PastDue60LastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue60LastYrType> pastDue60LastYr;
    @XmlElementRef(name = "PastDue30YTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue30YTDType> pastDue30YTD;
    @XmlElementRef(name = "PastDue30LTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue30LTDType> pastDue30LTD;
    @XmlElementRef(name = "PastDue30LastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue30LastYrType> pastDue30LastYr;
    @XmlElementRef(name = "PastDue180YTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue180YTDType> pastDue180YTD;
    @XmlElementRef(name = "PastDue180LTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue180LTDType> pastDue180LTD;
    @XmlElementRef(name = "PastDue180LastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue180LastYrType> pastDue180LastYr;
    @XmlElementRef(name = "PastDue150YTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue150YTDType> pastDue150YTD;
    @XmlElementRef(name = "PastDue150LTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue150LTDType> pastDue150LTD;
    @XmlElementRef(name = "PastDue150LastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue150LastYrType> pastDue150LastYr;
    @XmlElementRef(name = "PastDue120YTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue120YTDType> pastDue120YTD;
    @XmlElementRef(name = "PastDue120LTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue120LTDType> pastDue120LTD;
    @XmlElementRef(name = "PastDue120LastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue120LastYrType> pastDue120LastYr;
    @XmlElementRef(name = "PastDue10YTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue10YTDType> pastDue10YTD;
    @XmlElementRef(name = "PastDue10LTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue10LTDType> pastDue10LTD;
    @XmlElementRef(name = "PastDue10LastYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PastDue10LastYrType> pastDue10LastYr;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PastDueArray")
    protected PastDueArrayAType pastDueArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "DlqConDt")
    protected DlqConDtType dlqConDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pastDue90YTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue90YTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue90YTDType> getPastDue90YTD() {
        return pastDue90YTD;
    }

    /**
     * Sets the value of the pastDue90YTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue90YTDType }{@code >}
     *     
     */
    public void setPastDue90YTD(JAXBElement<PastDue90YTDType> value) {
        this.pastDue90YTD = value;
    }

    /**
     * Gets the value of the pastDue90LTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue90LTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue90LTDType> getPastDue90LTD() {
        return pastDue90LTD;
    }

    /**
     * Sets the value of the pastDue90LTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue90LTDType }{@code >}
     *     
     */
    public void setPastDue90LTD(JAXBElement<PastDue90LTDType> value) {
        this.pastDue90LTD = value;
    }

    /**
     * Gets the value of the pastDue90LastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue90LastYrType }{@code >}
     *     
     */
    public JAXBElement<PastDue90LastYrType> getPastDue90LastYr() {
        return pastDue90LastYr;
    }

    /**
     * Sets the value of the pastDue90LastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue90LastYrType }{@code >}
     *     
     */
    public void setPastDue90LastYr(JAXBElement<PastDue90LastYrType> value) {
        this.pastDue90LastYr = value;
    }

    /**
     * Gets the value of the pastDue60YTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue60YTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue60YTDType> getPastDue60YTD() {
        return pastDue60YTD;
    }

    /**
     * Sets the value of the pastDue60YTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue60YTDType }{@code >}
     *     
     */
    public void setPastDue60YTD(JAXBElement<PastDue60YTDType> value) {
        this.pastDue60YTD = value;
    }

    /**
     * Gets the value of the pastDue60LTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue60LTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue60LTDType> getPastDue60LTD() {
        return pastDue60LTD;
    }

    /**
     * Sets the value of the pastDue60LTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue60LTDType }{@code >}
     *     
     */
    public void setPastDue60LTD(JAXBElement<PastDue60LTDType> value) {
        this.pastDue60LTD = value;
    }

    /**
     * Gets the value of the pastDue60LastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue60LastYrType }{@code >}
     *     
     */
    public JAXBElement<PastDue60LastYrType> getPastDue60LastYr() {
        return pastDue60LastYr;
    }

    /**
     * Sets the value of the pastDue60LastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue60LastYrType }{@code >}
     *     
     */
    public void setPastDue60LastYr(JAXBElement<PastDue60LastYrType> value) {
        this.pastDue60LastYr = value;
    }

    /**
     * Gets the value of the pastDue30YTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue30YTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue30YTDType> getPastDue30YTD() {
        return pastDue30YTD;
    }

    /**
     * Sets the value of the pastDue30YTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue30YTDType }{@code >}
     *     
     */
    public void setPastDue30YTD(JAXBElement<PastDue30YTDType> value) {
        this.pastDue30YTD = value;
    }

    /**
     * Gets the value of the pastDue30LTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue30LTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue30LTDType> getPastDue30LTD() {
        return pastDue30LTD;
    }

    /**
     * Sets the value of the pastDue30LTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue30LTDType }{@code >}
     *     
     */
    public void setPastDue30LTD(JAXBElement<PastDue30LTDType> value) {
        this.pastDue30LTD = value;
    }

    /**
     * Gets the value of the pastDue30LastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue30LastYrType }{@code >}
     *     
     */
    public JAXBElement<PastDue30LastYrType> getPastDue30LastYr() {
        return pastDue30LastYr;
    }

    /**
     * Sets the value of the pastDue30LastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue30LastYrType }{@code >}
     *     
     */
    public void setPastDue30LastYr(JAXBElement<PastDue30LastYrType> value) {
        this.pastDue30LastYr = value;
    }

    /**
     * Gets the value of the pastDue180YTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue180YTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue180YTDType> getPastDue180YTD() {
        return pastDue180YTD;
    }

    /**
     * Sets the value of the pastDue180YTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue180YTDType }{@code >}
     *     
     */
    public void setPastDue180YTD(JAXBElement<PastDue180YTDType> value) {
        this.pastDue180YTD = value;
    }

    /**
     * Gets the value of the pastDue180LTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue180LTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue180LTDType> getPastDue180LTD() {
        return pastDue180LTD;
    }

    /**
     * Sets the value of the pastDue180LTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue180LTDType }{@code >}
     *     
     */
    public void setPastDue180LTD(JAXBElement<PastDue180LTDType> value) {
        this.pastDue180LTD = value;
    }

    /**
     * Gets the value of the pastDue180LastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue180LastYrType }{@code >}
     *     
     */
    public JAXBElement<PastDue180LastYrType> getPastDue180LastYr() {
        return pastDue180LastYr;
    }

    /**
     * Sets the value of the pastDue180LastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue180LastYrType }{@code >}
     *     
     */
    public void setPastDue180LastYr(JAXBElement<PastDue180LastYrType> value) {
        this.pastDue180LastYr = value;
    }

    /**
     * Gets the value of the pastDue150YTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue150YTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue150YTDType> getPastDue150YTD() {
        return pastDue150YTD;
    }

    /**
     * Sets the value of the pastDue150YTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue150YTDType }{@code >}
     *     
     */
    public void setPastDue150YTD(JAXBElement<PastDue150YTDType> value) {
        this.pastDue150YTD = value;
    }

    /**
     * Gets the value of the pastDue150LTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue150LTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue150LTDType> getPastDue150LTD() {
        return pastDue150LTD;
    }

    /**
     * Sets the value of the pastDue150LTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue150LTDType }{@code >}
     *     
     */
    public void setPastDue150LTD(JAXBElement<PastDue150LTDType> value) {
        this.pastDue150LTD = value;
    }

    /**
     * Gets the value of the pastDue150LastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue150LastYrType }{@code >}
     *     
     */
    public JAXBElement<PastDue150LastYrType> getPastDue150LastYr() {
        return pastDue150LastYr;
    }

    /**
     * Sets the value of the pastDue150LastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue150LastYrType }{@code >}
     *     
     */
    public void setPastDue150LastYr(JAXBElement<PastDue150LastYrType> value) {
        this.pastDue150LastYr = value;
    }

    /**
     * Gets the value of the pastDue120YTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue120YTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue120YTDType> getPastDue120YTD() {
        return pastDue120YTD;
    }

    /**
     * Sets the value of the pastDue120YTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue120YTDType }{@code >}
     *     
     */
    public void setPastDue120YTD(JAXBElement<PastDue120YTDType> value) {
        this.pastDue120YTD = value;
    }

    /**
     * Gets the value of the pastDue120LTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue120LTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue120LTDType> getPastDue120LTD() {
        return pastDue120LTD;
    }

    /**
     * Sets the value of the pastDue120LTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue120LTDType }{@code >}
     *     
     */
    public void setPastDue120LTD(JAXBElement<PastDue120LTDType> value) {
        this.pastDue120LTD = value;
    }

    /**
     * Gets the value of the pastDue120LastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue120LastYrType }{@code >}
     *     
     */
    public JAXBElement<PastDue120LastYrType> getPastDue120LastYr() {
        return pastDue120LastYr;
    }

    /**
     * Sets the value of the pastDue120LastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue120LastYrType }{@code >}
     *     
     */
    public void setPastDue120LastYr(JAXBElement<PastDue120LastYrType> value) {
        this.pastDue120LastYr = value;
    }

    /**
     * Gets the value of the pastDue10YTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue10YTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue10YTDType> getPastDue10YTD() {
        return pastDue10YTD;
    }

    /**
     * Sets the value of the pastDue10YTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue10YTDType }{@code >}
     *     
     */
    public void setPastDue10YTD(JAXBElement<PastDue10YTDType> value) {
        this.pastDue10YTD = value;
    }

    /**
     * Gets the value of the pastDue10LTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue10LTDType }{@code >}
     *     
     */
    public JAXBElement<PastDue10LTDType> getPastDue10LTD() {
        return pastDue10LTD;
    }

    /**
     * Sets the value of the pastDue10LTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue10LTDType }{@code >}
     *     
     */
    public void setPastDue10LTD(JAXBElement<PastDue10LTDType> value) {
        this.pastDue10LTD = value;
    }

    /**
     * Gets the value of the pastDue10LastYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PastDue10LastYrType }{@code >}
     *     
     */
    public JAXBElement<PastDue10LastYrType> getPastDue10LastYr() {
        return pastDue10LastYr;
    }

    /**
     * Sets the value of the pastDue10LastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PastDue10LastYrType }{@code >}
     *     
     */
    public void setPastDue10LastYr(JAXBElement<PastDue10LastYrType> value) {
        this.pastDue10LastYr = value;
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
     * Gets the value of the pastDueArray property.
     * 
     * @return
     *     possible object is
     *     {@link PastDueArrayAType }
     *     
     */
    public PastDueArrayAType getPastDueArray() {
        return pastDueArray;
    }

    /**
     * Sets the value of the pastDueArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PastDueArrayAType }
     *     
     */
    public void setPastDueArray(PastDueArrayAType value) {
        this.pastDueArray = value;
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
     * Gets the value of the dlqConDt property.
     * 
     * @return
     *     possible object is
     *     {@link DlqConDtType }
     *     
     */
    public DlqConDtType getDlqConDt() {
        return dlqConDt;
    }

    /**
     * Sets the value of the dlqConDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlqConDtType }
     *     
     */
    public void setDlqConDt(DlqConDtType value) {
        this.dlqConDt = value;
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
