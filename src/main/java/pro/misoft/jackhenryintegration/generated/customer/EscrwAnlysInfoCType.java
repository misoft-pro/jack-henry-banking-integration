
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for EscrwAnlysInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwAnlysInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwDefcGEPmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcGEPmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcGEPmtTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcGEPmtTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcGEPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcGEPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcLTPmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcLTPmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcLTPmtTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcLTPmtTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcLTPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcLTPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtGEPmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtGEPmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtGEPmtTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtGEPmtTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtGEPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtGEPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtLTPmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtLTPmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtLTPmtTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtLTPmtTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtLTPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtLTPmtAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwAnlysInfo_CType", propOrder = {
    "escrwDefcGEPmtTerm",
    "escrwDefcGEPmtTermUnit",
    "escrwDefcGEPmtAmt",
    "escrwDefcLTPmtTerm",
    "escrwDefcLTPmtTermUnit",
    "escrwDefcLTPmtAmt",
    "escrwShtGEPmtTerm",
    "escrwShtGEPmtTermUnit",
    "escrwShtGEPmtAmt",
    "escrwShtLTPmtTerm",
    "escrwShtLTPmtTermUnit",
    "escrwShtLTPmtAmt",
    "ver1",
    "any"
})
public class EscrwAnlysInfoCType {

    @XmlElementRef(name = "EscrwDefcGEPmtTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcGEPmtTermType> escrwDefcGEPmtTerm;
    @XmlElementRef(name = "EscrwDefcGEPmtTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcGEPmtTermUnitType> escrwDefcGEPmtTermUnit;
    @XmlElementRef(name = "EscrwDefcGEPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcGEPmtAmtType> escrwDefcGEPmtAmt;
    @XmlElementRef(name = "EscrwDefcLTPmtTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcLTPmtTermType> escrwDefcLTPmtTerm;
    @XmlElementRef(name = "EscrwDefcLTPmtTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcLTPmtTermUnitType> escrwDefcLTPmtTermUnit;
    @XmlElementRef(name = "EscrwDefcLTPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcLTPmtAmtType> escrwDefcLTPmtAmt;
    @XmlElementRef(name = "EscrwShtGEPmtTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtGEPmtTermType> escrwShtGEPmtTerm;
    @XmlElementRef(name = "EscrwShtGEPmtTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtGEPmtTermUnitType> escrwShtGEPmtTermUnit;
    @XmlElementRef(name = "EscrwShtGEPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtGEPmtAmtType> escrwShtGEPmtAmt;
    @XmlElementRef(name = "EscrwShtLTPmtTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtLTPmtTermType> escrwShtLTPmtTerm;
    @XmlElementRef(name = "EscrwShtLTPmtTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtLTPmtTermUnitType> escrwShtLTPmtTermUnit;
    @XmlElementRef(name = "EscrwShtLTPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtLTPmtAmtType> escrwShtLTPmtAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwDefcGEPmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtTermType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcGEPmtTermType> getEscrwDefcGEPmtTerm() {
        return escrwDefcGEPmtTerm;
    }

    /**
     * Sets the value of the escrwDefcGEPmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtTermType }{@code >}
     *     
     */
    public void setEscrwDefcGEPmtTerm(JAXBElement<EscrwDefcGEPmtTermType> value) {
        this.escrwDefcGEPmtTerm = value;
    }

    /**
     * Gets the value of the escrwDefcGEPmtTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtTermUnitType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcGEPmtTermUnitType> getEscrwDefcGEPmtTermUnit() {
        return escrwDefcGEPmtTermUnit;
    }

    /**
     * Sets the value of the escrwDefcGEPmtTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtTermUnitType }{@code >}
     *     
     */
    public void setEscrwDefcGEPmtTermUnit(JAXBElement<EscrwDefcGEPmtTermUnitType> value) {
        this.escrwDefcGEPmtTermUnit = value;
    }

    /**
     * Gets the value of the escrwDefcGEPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcGEPmtAmtType> getEscrwDefcGEPmtAmt() {
        return escrwDefcGEPmtAmt;
    }

    /**
     * Sets the value of the escrwDefcGEPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtAmtType }{@code >}
     *     
     */
    public void setEscrwDefcGEPmtAmt(JAXBElement<EscrwDefcGEPmtAmtType> value) {
        this.escrwDefcGEPmtAmt = value;
    }

    /**
     * Gets the value of the escrwDefcLTPmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtTermType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcLTPmtTermType> getEscrwDefcLTPmtTerm() {
        return escrwDefcLTPmtTerm;
    }

    /**
     * Sets the value of the escrwDefcLTPmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtTermType }{@code >}
     *     
     */
    public void setEscrwDefcLTPmtTerm(JAXBElement<EscrwDefcLTPmtTermType> value) {
        this.escrwDefcLTPmtTerm = value;
    }

    /**
     * Gets the value of the escrwDefcLTPmtTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtTermUnitType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcLTPmtTermUnitType> getEscrwDefcLTPmtTermUnit() {
        return escrwDefcLTPmtTermUnit;
    }

    /**
     * Sets the value of the escrwDefcLTPmtTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtTermUnitType }{@code >}
     *     
     */
    public void setEscrwDefcLTPmtTermUnit(JAXBElement<EscrwDefcLTPmtTermUnitType> value) {
        this.escrwDefcLTPmtTermUnit = value;
    }

    /**
     * Gets the value of the escrwDefcLTPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcLTPmtAmtType> getEscrwDefcLTPmtAmt() {
        return escrwDefcLTPmtAmt;
    }

    /**
     * Sets the value of the escrwDefcLTPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtAmtType }{@code >}
     *     
     */
    public void setEscrwDefcLTPmtAmt(JAXBElement<EscrwDefcLTPmtAmtType> value) {
        this.escrwDefcLTPmtAmt = value;
    }

    /**
     * Gets the value of the escrwShtGEPmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtTermType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtGEPmtTermType> getEscrwShtGEPmtTerm() {
        return escrwShtGEPmtTerm;
    }

    /**
     * Sets the value of the escrwShtGEPmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtTermType }{@code >}
     *     
     */
    public void setEscrwShtGEPmtTerm(JAXBElement<EscrwShtGEPmtTermType> value) {
        this.escrwShtGEPmtTerm = value;
    }

    /**
     * Gets the value of the escrwShtGEPmtTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtTermUnitType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtGEPmtTermUnitType> getEscrwShtGEPmtTermUnit() {
        return escrwShtGEPmtTermUnit;
    }

    /**
     * Sets the value of the escrwShtGEPmtTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtTermUnitType }{@code >}
     *     
     */
    public void setEscrwShtGEPmtTermUnit(JAXBElement<EscrwShtGEPmtTermUnitType> value) {
        this.escrwShtGEPmtTermUnit = value;
    }

    /**
     * Gets the value of the escrwShtGEPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtGEPmtAmtType> getEscrwShtGEPmtAmt() {
        return escrwShtGEPmtAmt;
    }

    /**
     * Sets the value of the escrwShtGEPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtAmtType }{@code >}
     *     
     */
    public void setEscrwShtGEPmtAmt(JAXBElement<EscrwShtGEPmtAmtType> value) {
        this.escrwShtGEPmtAmt = value;
    }

    /**
     * Gets the value of the escrwShtLTPmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtTermType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtLTPmtTermType> getEscrwShtLTPmtTerm() {
        return escrwShtLTPmtTerm;
    }

    /**
     * Sets the value of the escrwShtLTPmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtTermType }{@code >}
     *     
     */
    public void setEscrwShtLTPmtTerm(JAXBElement<EscrwShtLTPmtTermType> value) {
        this.escrwShtLTPmtTerm = value;
    }

    /**
     * Gets the value of the escrwShtLTPmtTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtTermUnitType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtLTPmtTermUnitType> getEscrwShtLTPmtTermUnit() {
        return escrwShtLTPmtTermUnit;
    }

    /**
     * Sets the value of the escrwShtLTPmtTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtTermUnitType }{@code >}
     *     
     */
    public void setEscrwShtLTPmtTermUnit(JAXBElement<EscrwShtLTPmtTermUnitType> value) {
        this.escrwShtLTPmtTermUnit = value;
    }

    /**
     * Gets the value of the escrwShtLTPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtLTPmtAmtType> getEscrwShtLTPmtAmt() {
        return escrwShtLTPmtAmt;
    }

    /**
     * Sets the value of the escrwShtLTPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtAmtType }{@code >}
     *     
     */
    public void setEscrwShtLTPmtAmt(JAXBElement<EscrwShtLTPmtAmtType> value) {
        this.escrwShtLTPmtAmt = value;
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
