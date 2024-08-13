
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EFTCardTrvInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardTrvInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrvNotType" type="{http://jackhenry.com/jxchange/TPG/2008}TrvNotType_Type"/&gt;
 *         &lt;element name="TrvStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrvEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrvRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrvPhoneArray" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="VacStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="VacEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="VacRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *           &lt;element name="CardHolderConFraudType" type="{http://jackhenry.com/jxchange/TPG/2008}CardHolderConFraudType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardTrvInfo_CType", propOrder = {
    "trvNotType",
    "trvStartDt",
    "trvEndDt",
    "trvRmk",
    "trvPhoneArray",
    "ver1",
    "vacStartDt",
    "vacEndDt",
    "vacRmk",
    "cardHolderConFraudType",
    "ver2",
    "any"
})
public class EFTCardTrvInfoCType {

    @XmlElement(name = "TrvNotType", required = true)
    protected TrvNotTypeType trvNotType;
    @XmlElement(name = "TrvStartDt")
    protected StartDtType trvStartDt;
    @XmlElement(name = "TrvEndDt")
    protected EndDtType trvEndDt;
    @XmlElement(name = "TrvRmk")
    protected RmkType trvRmk;
    @XmlElement(name = "TrvPhoneArray")
    protected PhoneArrayAType trvPhoneArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "VacStartDt")
    protected StartDtType vacStartDt;
    @XmlElement(name = "VacEndDt")
    protected EndDtType vacEndDt;
    @XmlElement(name = "VacRmk")
    protected RmkType vacRmk;
    @XmlElement(name = "CardHolderConFraudType")
    protected CardHolderConFraudTypeType cardHolderConFraudType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trvNotType property.
     * 
     * @return
     *     possible object is
     *     {@link TrvNotTypeType }
     *     
     */
    public TrvNotTypeType getTrvNotType() {
        return trvNotType;
    }

    /**
     * Sets the value of the trvNotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrvNotTypeType }
     *     
     */
    public void setTrvNotType(TrvNotTypeType value) {
        this.trvNotType = value;
    }

    /**
     * Gets the value of the trvStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getTrvStartDt() {
        return trvStartDt;
    }

    /**
     * Sets the value of the trvStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setTrvStartDt(StartDtType value) {
        this.trvStartDt = value;
    }

    /**
     * Gets the value of the trvEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getTrvEndDt() {
        return trvEndDt;
    }

    /**
     * Sets the value of the trvEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setTrvEndDt(EndDtType value) {
        this.trvEndDt = value;
    }

    /**
     * Gets the value of the trvRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getTrvRmk() {
        return trvRmk;
    }

    /**
     * Sets the value of the trvRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setTrvRmk(RmkType value) {
        this.trvRmk = value;
    }

    /**
     * Gets the value of the trvPhoneArray property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneArrayAType }
     *     
     */
    public PhoneArrayAType getTrvPhoneArray() {
        return trvPhoneArray;
    }

    /**
     * Sets the value of the trvPhoneArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneArrayAType }
     *     
     */
    public void setTrvPhoneArray(PhoneArrayAType value) {
        this.trvPhoneArray = value;
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
     * Gets the value of the vacStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getVacStartDt() {
        return vacStartDt;
    }

    /**
     * Sets the value of the vacStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setVacStartDt(StartDtType value) {
        this.vacStartDt = value;
    }

    /**
     * Gets the value of the vacEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getVacEndDt() {
        return vacEndDt;
    }

    /**
     * Sets the value of the vacEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setVacEndDt(EndDtType value) {
        this.vacEndDt = value;
    }

    /**
     * Gets the value of the vacRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getVacRmk() {
        return vacRmk;
    }

    /**
     * Sets the value of the vacRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setVacRmk(RmkType value) {
        this.vacRmk = value;
    }

    /**
     * Gets the value of the cardHolderConFraudType property.
     * 
     * @return
     *     possible object is
     *     {@link CardHolderConFraudTypeType }
     *     
     */
    public CardHolderConFraudTypeType getCardHolderConFraudType() {
        return cardHolderConFraudType;
    }

    /**
     * Sets the value of the cardHolderConFraudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardHolderConFraudTypeType }
     *     
     */
    public void setCardHolderConFraudType(CardHolderConFraudTypeType value) {
        this.cardHolderConFraudType = value;
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
