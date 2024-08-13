
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
 * <p>Java class for CardAlrtThldRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAlrtThldRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardAlrtThldCode" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldCode_Type"/&gt;
 *         &lt;element name="CardAlrtThldDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtThldVal" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardAlrtThldActType" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldActType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CardAlrtThldRec_CType", propOrder = {
    "cardAlrtThldCode",
    "cardAlrtThldDesc",
    "cardAlrtThldVal",
    "cardAlrtThldActType",
    "ver1",
    "any"
})
public class CardAlrtThldRecCType {

    @XmlElement(name = "CardAlrtThldCode", required = true)
    protected CardAlrtThldCodeType cardAlrtThldCode;
    @XmlElement(name = "CardAlrtThldDesc")
    protected CardAlrtThldDescType cardAlrtThldDesc;
    @XmlElement(name = "CardAlrtThldVal")
    protected CardAlrtThldValType cardAlrtThldVal;
    @XmlElement(name = "CardAlrtThldActType")
    protected CardAlrtThldActTypeType cardAlrtThldActType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the cardAlrtThldCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtThldCodeType }
     *     
     */
    public CardAlrtThldCodeType getCardAlrtThldCode() {
        return cardAlrtThldCode;
    }

    /**
     * Sets the value of the cardAlrtThldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtThldCodeType }
     *     
     */
    public void setCardAlrtThldCode(CardAlrtThldCodeType value) {
        this.cardAlrtThldCode = value;
    }

    /**
     * Gets the value of the cardAlrtThldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtThldDescType }
     *     
     */
    public CardAlrtThldDescType getCardAlrtThldDesc() {
        return cardAlrtThldDesc;
    }

    /**
     * Sets the value of the cardAlrtThldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtThldDescType }
     *     
     */
    public void setCardAlrtThldDesc(CardAlrtThldDescType value) {
        this.cardAlrtThldDesc = value;
    }

    /**
     * Gets the value of the cardAlrtThldVal property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtThldValType }
     *     
     */
    public CardAlrtThldValType getCardAlrtThldVal() {
        return cardAlrtThldVal;
    }

    /**
     * Sets the value of the cardAlrtThldVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtThldValType }
     *     
     */
    public void setCardAlrtThldVal(CardAlrtThldValType value) {
        this.cardAlrtThldVal = value;
    }

    /**
     * Gets the value of the cardAlrtThldActType property.
     * 
     * @return
     *     possible object is
     *     {@link CardAlrtThldActTypeType }
     *     
     */
    public CardAlrtThldActTypeType getCardAlrtThldActType() {
        return cardAlrtThldActType;
    }

    /**
     * Sets the value of the cardAlrtThldActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAlrtThldActTypeType }
     *     
     */
    public void setCardAlrtThldActType(CardAlrtThldActTypeType value) {
        this.cardAlrtThldActType = value;
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
