
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
 * <p>Java class for LnStopFuncInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnStopFuncInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnStopFuncCode" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopFuncCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnStopFuncDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopFuncDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnStopFuncStat" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopFuncStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnStopFuncExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopFuncExpDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnStopFuncInfo_CType", propOrder = {
    "lnStopFuncCode",
    "lnStopFuncDesc",
    "lnStopFuncStat",
    "lnStopFuncExpDt",
    "ver1",
    "any"
})
public class LnStopFuncInfoCType {

    @XmlElementRef(name = "LnStopFuncCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnStopFuncCodeType> lnStopFuncCode;
    @XmlElementRef(name = "LnStopFuncDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnStopFuncDescType> lnStopFuncDesc;
    @XmlElementRef(name = "LnStopFuncStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnStopFuncStatType> lnStopFuncStat;
    @XmlElementRef(name = "LnStopFuncExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnStopFuncExpDtType> lnStopFuncExpDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnStopFuncCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncCodeType }{@code >}
     *     
     */
    public JAXBElement<LnStopFuncCodeType> getLnStopFuncCode() {
        return lnStopFuncCode;
    }

    /**
     * Sets the value of the lnStopFuncCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncCodeType }{@code >}
     *     
     */
    public void setLnStopFuncCode(JAXBElement<LnStopFuncCodeType> value) {
        this.lnStopFuncCode = value;
    }

    /**
     * Gets the value of the lnStopFuncDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncDescType }{@code >}
     *     
     */
    public JAXBElement<LnStopFuncDescType> getLnStopFuncDesc() {
        return lnStopFuncDesc;
    }

    /**
     * Sets the value of the lnStopFuncDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncDescType }{@code >}
     *     
     */
    public void setLnStopFuncDesc(JAXBElement<LnStopFuncDescType> value) {
        this.lnStopFuncDesc = value;
    }

    /**
     * Gets the value of the lnStopFuncStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncStatType }{@code >}
     *     
     */
    public JAXBElement<LnStopFuncStatType> getLnStopFuncStat() {
        return lnStopFuncStat;
    }

    /**
     * Sets the value of the lnStopFuncStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncStatType }{@code >}
     *     
     */
    public void setLnStopFuncStat(JAXBElement<LnStopFuncStatType> value) {
        this.lnStopFuncStat = value;
    }

    /**
     * Gets the value of the lnStopFuncExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncExpDtType }{@code >}
     *     
     */
    public JAXBElement<LnStopFuncExpDtType> getLnStopFuncExpDt() {
        return lnStopFuncExpDt;
    }

    /**
     * Sets the value of the lnStopFuncExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnStopFuncExpDtType }{@code >}
     *     
     */
    public void setLnStopFuncExpDt(JAXBElement<LnStopFuncExpDtType> value) {
        this.lnStopFuncExpDt = value;
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
