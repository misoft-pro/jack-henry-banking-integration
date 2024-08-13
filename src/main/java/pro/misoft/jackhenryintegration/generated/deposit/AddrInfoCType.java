
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
 * <p>Java class for AddrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="SeasonBegDt" type="{http://jackhenry.com/jxchange/TPG/2008}SeasonBegDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SeasonEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}SeasonEndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SeasonReocur" type="{http://jackhenry.com/jxchange/TPG/2008}SeasonReocur_Type" minOccurs="0"/&gt;
 *         &lt;element name="MailDirCode" type="{http://jackhenry.com/jxchange/TPG/2008}MailDirCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrLastVerify" type="{http://jackhenry.com/jxchange/TPG/2008}AddrLastVerify_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrLastChng" type="{http://jackhenry.com/jxchange/TPG/2008}AddrLastChng_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AddrInfo_CType", propOrder = {
    "addr",
    "seasonBegDt",
    "seasonEndDt",
    "seasonReocur",
    "mailDirCode",
    "addrLastVerify",
    "addrLastChng",
    "ver1",
    "any"
})
public class AddrInfoCType {

    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElementRef(name = "SeasonBegDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SeasonBegDtType> seasonBegDt;
    @XmlElementRef(name = "SeasonEndDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SeasonEndDtType> seasonEndDt;
    @XmlElementRef(name = "SeasonReocur", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SeasonReocurType> seasonReocur;
    @XmlElementRef(name = "MailDirCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MailDirCodeType> mailDirCode;
    @XmlElementRef(name = "AddrLastVerify", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrLastVerifyType> addrLastVerify;
    @XmlElementRef(name = "AddrLastChng", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AddrLastChngType> addrLastChng;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAddr(AddrCType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the seasonBegDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SeasonBegDtType }{@code >}
     *     
     */
    public JAXBElement<SeasonBegDtType> getSeasonBegDt() {
        return seasonBegDt;
    }

    /**
     * Sets the value of the seasonBegDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SeasonBegDtType }{@code >}
     *     
     */
    public void setSeasonBegDt(JAXBElement<SeasonBegDtType> value) {
        this.seasonBegDt = value;
    }

    /**
     * Gets the value of the seasonEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SeasonEndDtType }{@code >}
     *     
     */
    public JAXBElement<SeasonEndDtType> getSeasonEndDt() {
        return seasonEndDt;
    }

    /**
     * Sets the value of the seasonEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SeasonEndDtType }{@code >}
     *     
     */
    public void setSeasonEndDt(JAXBElement<SeasonEndDtType> value) {
        this.seasonEndDt = value;
    }

    /**
     * Gets the value of the seasonReocur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SeasonReocurType }{@code >}
     *     
     */
    public JAXBElement<SeasonReocurType> getSeasonReocur() {
        return seasonReocur;
    }

    /**
     * Sets the value of the seasonReocur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SeasonReocurType }{@code >}
     *     
     */
    public void setSeasonReocur(JAXBElement<SeasonReocurType> value) {
        this.seasonReocur = value;
    }

    /**
     * Gets the value of the mailDirCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MailDirCodeType }{@code >}
     *     
     */
    public JAXBElement<MailDirCodeType> getMailDirCode() {
        return mailDirCode;
    }

    /**
     * Sets the value of the mailDirCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MailDirCodeType }{@code >}
     *     
     */
    public void setMailDirCode(JAXBElement<MailDirCodeType> value) {
        this.mailDirCode = value;
    }

    /**
     * Gets the value of the addrLastVerify property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrLastVerifyType }{@code >}
     *     
     */
    public JAXBElement<AddrLastVerifyType> getAddrLastVerify() {
        return addrLastVerify;
    }

    /**
     * Sets the value of the addrLastVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrLastVerifyType }{@code >}
     *     
     */
    public void setAddrLastVerify(JAXBElement<AddrLastVerifyType> value) {
        this.addrLastVerify = value;
    }

    /**
     * Gets the value of the addrLastChng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddrLastChngType }{@code >}
     *     
     */
    public JAXBElement<AddrLastChngType> getAddrLastChng() {
        return addrLastChng;
    }

    /**
     * Sets the value of the addrLastChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddrLastChngType }{@code >}
     *     
     */
    public void setAddrLastChng(JAXBElement<AddrLastChngType> value) {
        this.addrLastChng = value;
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
