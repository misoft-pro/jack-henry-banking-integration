
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
 * <p>Java class for EFTCardInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardText" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardText_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardSufxNum" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardSufxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardType_Type" minOccurs="0"/&gt;
 *         &lt;element name="POSCardIssuedNum" type="{http://jackhenry.com/jxchange/TPG/2008}POSCardIssuedNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCardIssuedNum" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCardIssuedNum_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EFTCardStat" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStat_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="EFTCardStatType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardStatType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "EFTCardInfoRec_CType", propOrder = {
    "eftCardText",
    "eftCardNum",
    "eftCardSufxNum",
    "eftCardType",
    "posCardIssuedNum",
    "atmCardIssuedNum",
    "ver1",
    "eftCardStat",
    "ver2",
    "eftCardStatType",
    "ver3",
    "custId",
    "ver4",
    "any"
})
public class EFTCardInfoRecCType {

    @XmlElementRef(name = "EFTCardText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardTextType> eftCardText;
    @XmlElementRef(name = "EFTCardNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardNumType> eftCardNum;
    @XmlElementRef(name = "EFTCardSufxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardSufxNumType> eftCardSufxNum;
    @XmlElementRef(name = "EFTCardType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardTypeType> eftCardType;
    @XmlElementRef(name = "POSCardIssuedNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<POSCardIssuedNumType> posCardIssuedNum;
    @XmlElementRef(name = "ATMCardIssuedNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ATMCardIssuedNumType> atmCardIssuedNum;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "EFTCardStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardStatType> eftCardStat;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "EFTCardStatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardStatTypeType> eftCardStatType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardTextType }{@code >}
     *     
     */
    public JAXBElement<EFTCardTextType> getEFTCardText() {
        return eftCardText;
    }

    /**
     * Sets the value of the eftCardText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardTextType }{@code >}
     *     
     */
    public void setEFTCardText(JAXBElement<EFTCardTextType> value) {
        this.eftCardText = value;
    }

    /**
     * Gets the value of the eftCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardNumType }{@code >}
     *     
     */
    public JAXBElement<EFTCardNumType> getEFTCardNum() {
        return eftCardNum;
    }

    /**
     * Sets the value of the eftCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardNumType }{@code >}
     *     
     */
    public void setEFTCardNum(JAXBElement<EFTCardNumType> value) {
        this.eftCardNum = value;
    }

    /**
     * Gets the value of the eftCardSufxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardSufxNumType }{@code >}
     *     
     */
    public JAXBElement<EFTCardSufxNumType> getEFTCardSufxNum() {
        return eftCardSufxNum;
    }

    /**
     * Sets the value of the eftCardSufxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardSufxNumType }{@code >}
     *     
     */
    public void setEFTCardSufxNum(JAXBElement<EFTCardSufxNumType> value) {
        this.eftCardSufxNum = value;
    }

    /**
     * Gets the value of the eftCardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardTypeType }{@code >}
     *     
     */
    public JAXBElement<EFTCardTypeType> getEFTCardType() {
        return eftCardType;
    }

    /**
     * Sets the value of the eftCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardTypeType }{@code >}
     *     
     */
    public void setEFTCardType(JAXBElement<EFTCardTypeType> value) {
        this.eftCardType = value;
    }

    /**
     * Gets the value of the posCardIssuedNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link POSCardIssuedNumType }{@code >}
     *     
     */
    public JAXBElement<POSCardIssuedNumType> getPOSCardIssuedNum() {
        return posCardIssuedNum;
    }

    /**
     * Sets the value of the posCardIssuedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link POSCardIssuedNumType }{@code >}
     *     
     */
    public void setPOSCardIssuedNum(JAXBElement<POSCardIssuedNumType> value) {
        this.posCardIssuedNum = value;
    }

    /**
     * Gets the value of the atmCardIssuedNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ATMCardIssuedNumType }{@code >}
     *     
     */
    public JAXBElement<ATMCardIssuedNumType> getATMCardIssuedNum() {
        return atmCardIssuedNum;
    }

    /**
     * Sets the value of the atmCardIssuedNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ATMCardIssuedNumType }{@code >}
     *     
     */
    public void setATMCardIssuedNum(JAXBElement<ATMCardIssuedNumType> value) {
        this.atmCardIssuedNum = value;
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
     * Gets the value of the eftCardStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardStatType }{@code >}
     *     
     */
    public JAXBElement<EFTCardStatType> getEFTCardStat() {
        return eftCardStat;
    }

    /**
     * Sets the value of the eftCardStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardStatType }{@code >}
     *     
     */
    public void setEFTCardStat(JAXBElement<EFTCardStatType> value) {
        this.eftCardStat = value;
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
     * Gets the value of the eftCardStatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardStatTypeType }{@code >}
     *     
     */
    public JAXBElement<EFTCardStatTypeType> getEFTCardStatType() {
        return eftCardStatType;
    }

    /**
     * Sets the value of the eftCardStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardStatTypeType }{@code >}
     *     
     */
    public void setEFTCardStatType(JAXBElement<EFTCardStatTypeType> value) {
        this.eftCardStatType = value;
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
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
