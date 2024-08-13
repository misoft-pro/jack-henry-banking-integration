
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
 * <p>Java class for TaxDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TINInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TINInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxExtDt" type="{http://jackhenry.com/jxchange/TPG/2008}TaxExtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxRetDt" type="{http://jackhenry.com/jxchange/TPG/2008}TaxRetDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSNameCntl" type="{http://jackhenry.com/jxchange/TPG/2008}IRSNameCntl_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSPostAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="Alien" type="{http://jackhenry.com/jxchange/TPG/2008}Alien_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="FedWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="StateWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TaxDetail_CType", propOrder = {
    "tinInfo",
    "taxExtDt",
    "taxRetDt",
    "irsNameCntl",
    "irsPostAddr",
    "alien",
    "custom",
    "ver1",
    "fedWithCode",
    "stateWithCode",
    "ver2",
    "any"
})
public class TaxDetailCType {

    @XmlElement(name = "TINInfo")
    protected TINInfoCType tinInfo;
    @XmlElementRef(name = "TaxExtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxExtDtType> taxExtDt;
    @XmlElementRef(name = "TaxRetDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxRetDtType> taxRetDt;
    @XmlElementRef(name = "IRSNameCntl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IRSNameCntlType> irsNameCntl;
    @XmlElement(name = "IRSPostAddr")
    protected AddrCType irsPostAddr;
    @XmlElement(name = "Alien")
    protected AlienCType alien;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "FedWithCode")
    protected FedWithCodeType fedWithCode;
    @XmlElement(name = "StateWithCode")
    protected StateWithCodeType stateWithCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TINInfoCType }
     *     
     */
    public TINInfoCType getTINInfo() {
        return tinInfo;
    }

    /**
     * Sets the value of the tinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINInfoCType }
     *     
     */
    public void setTINInfo(TINInfoCType value) {
        this.tinInfo = value;
    }

    /**
     * Gets the value of the taxExtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxExtDtType }{@code >}
     *     
     */
    public JAXBElement<TaxExtDtType> getTaxExtDt() {
        return taxExtDt;
    }

    /**
     * Sets the value of the taxExtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxExtDtType }{@code >}
     *     
     */
    public void setTaxExtDt(JAXBElement<TaxExtDtType> value) {
        this.taxExtDt = value;
    }

    /**
     * Gets the value of the taxRetDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxRetDtType }{@code >}
     *     
     */
    public JAXBElement<TaxRetDtType> getTaxRetDt() {
        return taxRetDt;
    }

    /**
     * Sets the value of the taxRetDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxRetDtType }{@code >}
     *     
     */
    public void setTaxRetDt(JAXBElement<TaxRetDtType> value) {
        this.taxRetDt = value;
    }

    /**
     * Gets the value of the irsNameCntl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IRSNameCntlType }{@code >}
     *     
     */
    public JAXBElement<IRSNameCntlType> getIRSNameCntl() {
        return irsNameCntl;
    }

    /**
     * Sets the value of the irsNameCntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IRSNameCntlType }{@code >}
     *     
     */
    public void setIRSNameCntl(JAXBElement<IRSNameCntlType> value) {
        this.irsNameCntl = value;
    }

    /**
     * Gets the value of the irsPostAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getIRSPostAddr() {
        return irsPostAddr;
    }

    /**
     * Sets the value of the irsPostAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setIRSPostAddr(AddrCType value) {
        this.irsPostAddr = value;
    }

    /**
     * Gets the value of the alien property.
     * 
     * @return
     *     possible object is
     *     {@link AlienCType }
     *     
     */
    public AlienCType getAlien() {
        return alien;
    }

    /**
     * Sets the value of the alien property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienCType }
     *     
     */
    public void setAlien(AlienCType value) {
        this.alien = value;
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
     * Gets the value of the fedWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link FedWithCodeType }
     *     
     */
    public FedWithCodeType getFedWithCode() {
        return fedWithCode;
    }

    /**
     * Sets the value of the fedWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedWithCodeType }
     *     
     */
    public void setFedWithCode(FedWithCodeType value) {
        this.fedWithCode = value;
    }

    /**
     * Gets the value of the stateWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateWithCodeType }
     *     
     */
    public StateWithCodeType getStateWithCode() {
        return stateWithCode;
    }

    /**
     * Sets the value of the stateWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateWithCodeType }
     *     
     */
    public void setStateWithCode(StateWithCodeType value) {
        this.stateWithCode = value;
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
