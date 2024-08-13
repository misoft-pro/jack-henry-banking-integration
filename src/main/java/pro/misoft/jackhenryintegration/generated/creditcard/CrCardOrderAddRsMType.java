
package pro.misoft.jackhenryintegration.generated.creditcard;

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
 * <p>Java class for CrCardOrderAddRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardOrderAddRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="CrCardProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdEmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}SecdEmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="RsStat" type="{http://jackhenry.com/jxchange/TPG/2008}RsStat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardOrderAddRs_MType", propOrder = {
    "msgRsHdr",
    "crCardProdDesc",
    "embosName",
    "secdEmbosName",
    "addr",
    "rsStat",
    "custom",
    "ver1",
    "any"
})
public class CrCardOrderAddRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "CrCardProdDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrCardProdDescType> crCardProdDesc;
    @XmlElementRef(name = "EmbosName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EmbosNameType> embosName;
    @XmlElementRef(name = "SecdEmbosName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdEmbosNameType> secdEmbosName;
    @XmlElementRef(name = "Addr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrCType> addr;
    @XmlElementRef(name = "RsStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RsStatType> rsStat;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the crCardProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrCardProdDescType }{@code >}
     *     
     */
    public JAXBElement<CrCardProdDescType> getCrCardProdDesc() {
        return crCardProdDesc;
    }

    /**
     * Sets the value of the crCardProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrCardProdDescType }{@code >}
     *     
     */
    public void setCrCardProdDesc(JAXBElement<CrCardProdDescType> value) {
        this.crCardProdDesc = value;
    }

    /**
     * Gets the value of the embosName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmbosNameType }{@code >}
     *     
     */
    public JAXBElement<EmbosNameType> getEmbosName() {
        return embosName;
    }

    /**
     * Sets the value of the embosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmbosNameType }{@code >}
     *     
     */
    public void setEmbosName(JAXBElement<EmbosNameType> value) {
        this.embosName = value;
    }

    /**
     * Gets the value of the secdEmbosName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdEmbosNameType }{@code >}
     *     
     */
    public JAXBElement<SecdEmbosNameType> getSecdEmbosName() {
        return secdEmbosName;
    }

    /**
     * Sets the value of the secdEmbosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdEmbosNameType }{@code >}
     *     
     */
    public void setSecdEmbosName(JAXBElement<SecdEmbosNameType> value) {
        this.secdEmbosName = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrCType }{@code >}
     *     
     */
    public JAXBElement<AddrCType> getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrCType }{@code >}
     *     
     */
    public void setAddr(JAXBElement<AddrCType> value) {
        this.addr = value;
    }

    /**
     * Gets the value of the rsStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RsStatType }{@code >}
     *     
     */
    public JAXBElement<RsStatType> getRsStat() {
        return rsStat;
    }

    /**
     * Sets the value of the rsStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RsStatType }{@code >}
     *     
     */
    public void setRsStat(JAXBElement<RsStatType> value) {
        this.rsStat = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
