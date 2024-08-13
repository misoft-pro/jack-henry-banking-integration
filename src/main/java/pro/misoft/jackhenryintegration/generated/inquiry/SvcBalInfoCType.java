
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
 * <p>Java class for SvcBalInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcBalInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcPmtActType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPmtActType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrincAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrincAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcIntAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcIntAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcGuarAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcGuarAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SvcBalInfo_CType", propOrder = {
    "svcPmtActType",
    "svcPrincAmt",
    "svcIntAmt",
    "svcFeeAmt",
    "svcGuarAmt",
    "ver1",
    "any"
})
public class SvcBalInfoCType {

    @XmlElementRef(name = "SvcPmtActType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcPmtActTypeType> svcPmtActType;
    @XmlElementRef(name = "SvcPrincAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcPrincAmtType> svcPrincAmt;
    @XmlElementRef(name = "SvcIntAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcIntAmtType> svcIntAmt;
    @XmlElementRef(name = "SvcFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcFeeAmtType> svcFeeAmt;
    @XmlElementRef(name = "SvcGuarAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SvcGuarAmtType> svcGuarAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcPmtActType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcPmtActTypeType }{@code >}
     *     
     */
    public JAXBElement<SvcPmtActTypeType> getSvcPmtActType() {
        return svcPmtActType;
    }

    /**
     * Sets the value of the svcPmtActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcPmtActTypeType }{@code >}
     *     
     */
    public void setSvcPmtActType(JAXBElement<SvcPmtActTypeType> value) {
        this.svcPmtActType = value;
    }

    /**
     * Gets the value of the svcPrincAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcPrincAmtType }{@code >}
     *     
     */
    public JAXBElement<SvcPrincAmtType> getSvcPrincAmt() {
        return svcPrincAmt;
    }

    /**
     * Sets the value of the svcPrincAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcPrincAmtType }{@code >}
     *     
     */
    public void setSvcPrincAmt(JAXBElement<SvcPrincAmtType> value) {
        this.svcPrincAmt = value;
    }

    /**
     * Gets the value of the svcIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcIntAmtType }{@code >}
     *     
     */
    public JAXBElement<SvcIntAmtType> getSvcIntAmt() {
        return svcIntAmt;
    }

    /**
     * Sets the value of the svcIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcIntAmtType }{@code >}
     *     
     */
    public void setSvcIntAmt(JAXBElement<SvcIntAmtType> value) {
        this.svcIntAmt = value;
    }

    /**
     * Gets the value of the svcFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<SvcFeeAmtType> getSvcFeeAmt() {
        return svcFeeAmt;
    }

    /**
     * Sets the value of the svcFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcFeeAmtType }{@code >}
     *     
     */
    public void setSvcFeeAmt(JAXBElement<SvcFeeAmtType> value) {
        this.svcFeeAmt = value;
    }

    /**
     * Gets the value of the svcGuarAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SvcGuarAmtType }{@code >}
     *     
     */
    public JAXBElement<SvcGuarAmtType> getSvcGuarAmt() {
        return svcGuarAmt;
    }

    /**
     * Sets the value of the svcGuarAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SvcGuarAmtType }{@code >}
     *     
     */
    public void setSvcGuarAmt(JAXBElement<SvcGuarAmtType> value) {
        this.svcGuarAmt = value;
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
