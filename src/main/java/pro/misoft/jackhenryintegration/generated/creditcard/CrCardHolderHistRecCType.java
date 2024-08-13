
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardHolderHistRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardHolderHistRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardIssueRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardIssueRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardIssueRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardIssueRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardShipDt" type="{http://jackhenry.com/jxchange/TPG/2008}CardShipDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardProdType" type="{http://jackhenry.com/jxchange/TPG/2008}CardProdType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardHolderHistRec_CType", propOrder = {
    "crCardIssueRsnDesc",
    "crCardIssueRsnCode",
    "crCardProdDesc",
    "cardShipDt",
    "cardProdType",
    "custom",
    "ver1",
    "any"
})
public class CrCardHolderHistRecCType {

    @XmlElement(name = "CrCardIssueRsnDesc")
    protected CrCardIssueRsnDescType crCardIssueRsnDesc;
    @XmlElement(name = "CrCardIssueRsnCode")
    protected CrCardIssueRsnCodeType crCardIssueRsnCode;
    @XmlElement(name = "CrCardProdDesc")
    protected CrCardProdDescType crCardProdDesc;
    @XmlElement(name = "CardShipDt")
    protected CardShipDtType cardShipDt;
    @XmlElement(name = "CardProdType")
    protected CardProdTypeType cardProdType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCardIssueRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardIssueRsnDescType }
     *     
     */
    public CrCardIssueRsnDescType getCrCardIssueRsnDesc() {
        return crCardIssueRsnDesc;
    }

    /**
     * Sets the value of the crCardIssueRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardIssueRsnDescType }
     *     
     */
    public void setCrCardIssueRsnDesc(CrCardIssueRsnDescType value) {
        this.crCardIssueRsnDesc = value;
    }

    /**
     * Gets the value of the crCardIssueRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardIssueRsnCodeType }
     *     
     */
    public CrCardIssueRsnCodeType getCrCardIssueRsnCode() {
        return crCardIssueRsnCode;
    }

    /**
     * Sets the value of the crCardIssueRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardIssueRsnCodeType }
     *     
     */
    public void setCrCardIssueRsnCode(CrCardIssueRsnCodeType value) {
        this.crCardIssueRsnCode = value;
    }

    /**
     * Gets the value of the crCardProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardProdDescType }
     *     
     */
    public CrCardProdDescType getCrCardProdDesc() {
        return crCardProdDesc;
    }

    /**
     * Sets the value of the crCardProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardProdDescType }
     *     
     */
    public void setCrCardProdDesc(CrCardProdDescType value) {
        this.crCardProdDesc = value;
    }

    /**
     * Gets the value of the cardShipDt property.
     * 
     * @return
     *     possible object is
     *     {@link CardShipDtType }
     *     
     */
    public CardShipDtType getCardShipDt() {
        return cardShipDt;
    }

    /**
     * Sets the value of the cardShipDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardShipDtType }
     *     
     */
    public void setCardShipDt(CardShipDtType value) {
        this.cardShipDt = value;
    }

    /**
     * Gets the value of the cardProdType property.
     * 
     * @return
     *     possible object is
     *     {@link CardProdTypeType }
     *     
     */
    public CardProdTypeType getCardProdType() {
        return cardProdType;
    }

    /**
     * Sets the value of the cardProdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProdTypeType }
     *     
     */
    public void setCardProdType(CardProdTypeType value) {
        this.cardProdType = value;
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
