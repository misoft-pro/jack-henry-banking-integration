
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
 * <p>Java class for EFTCardAcctIdInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardAcctIdInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardPrimAcct" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardPrimAcct_Type" minOccurs="0"/&gt;
 *         &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EFTCardFundAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardFundAcctType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardAcctIdInfo_CType", propOrder = {
    "eftCardAcctId",
    "eftCardAcctType",
    "eftCardPrimAcct",
    "dlt",
    "ver1",
    "aliasAcctName",
    "ver2",
    "eftCardFundAcctType",
    "ver3",
    "any"
})
public class EFTCardAcctIdInfoCType {

    @XmlElementRef(name = "EFTCardAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardAcctIdType> eftCardAcctId;
    @XmlElementRef(name = "EFTCardAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardAcctTypeType> eftCardAcctType;
    @XmlElementRef(name = "EFTCardPrimAcct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardPrimAcctType> eftCardPrimAcct;
    @XmlElementRef(name = "Dlt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DltType> dlt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AliasAcctName")
    protected AliasAcctNameType aliasAcctName;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "EFTCardFundAcctType")
    protected EFTCardFundAcctTypeType eftCardFundAcctType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardAcctIdType }{@code >}
     *     
     */
    public JAXBElement<EFTCardAcctIdType> getEFTCardAcctId() {
        return eftCardAcctId;
    }

    /**
     * Sets the value of the eftCardAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardAcctIdType }{@code >}
     *     
     */
    public void setEFTCardAcctId(JAXBElement<EFTCardAcctIdType> value) {
        this.eftCardAcctId = value;
    }

    /**
     * Gets the value of the eftCardAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<EFTCardAcctTypeType> getEFTCardAcctType() {
        return eftCardAcctType;
    }

    /**
     * Sets the value of the eftCardAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardAcctTypeType }{@code >}
     *     
     */
    public void setEFTCardAcctType(JAXBElement<EFTCardAcctTypeType> value) {
        this.eftCardAcctType = value;
    }

    /**
     * Gets the value of the eftCardPrimAcct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardPrimAcctType }{@code >}
     *     
     */
    public JAXBElement<EFTCardPrimAcctType> getEFTCardPrimAcct() {
        return eftCardPrimAcct;
    }

    /**
     * Sets the value of the eftCardPrimAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardPrimAcctType }{@code >}
     *     
     */
    public void setEFTCardPrimAcct(JAXBElement<EFTCardPrimAcctType> value) {
        this.eftCardPrimAcct = value;
    }

    /**
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public JAXBElement<DltType> getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DltType }{@code >}
     *     
     */
    public void setDlt(JAXBElement<DltType> value) {
        this.dlt = value;
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
     * Gets the value of the aliasAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link AliasAcctNameType }
     *     
     */
    public AliasAcctNameType getAliasAcctName() {
        return aliasAcctName;
    }

    /**
     * Sets the value of the aliasAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasAcctNameType }
     *     
     */
    public void setAliasAcctName(AliasAcctNameType value) {
        this.aliasAcctName = value;
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
     * Gets the value of the eftCardFundAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardFundAcctTypeType }
     *     
     */
    public EFTCardFundAcctTypeType getEFTCardFundAcctType() {
        return eftCardFundAcctType;
    }

    /**
     * Sets the value of the eftCardFundAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardFundAcctTypeType }
     *     
     */
    public void setEFTCardFundAcctType(EFTCardFundAcctTypeType value) {
        this.eftCardFundAcctType = value;
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
