
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
 * <p>Java class for CrCardOrderRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardOrderRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmbosNameType" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosNameType_Type"/&gt;
 *         &lt;element name="EmbosName" type="{http://jackhenry.com/jxchange/TPG/2008}EmbosName_Type" minOccurs="0"/&gt;
 *         &lt;element name="FeeOrderType" type="{http://jackhenry.com/jxchange/TPG/2008}FeeOrderType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardProdType" type="{http://jackhenry.com/jxchange/TPG/2008}CardProdType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardOrderRec_CType", propOrder = {
    "embosNameType",
    "embosName",
    "feeOrderType",
    "cardProdType",
    "ver1",
    "any"
})
public class CrCardOrderRecCType {

    @XmlElement(name = "EmbosNameType", required = true)
    protected EmbosNameTypeType embosNameType;
    @XmlElement(name = "EmbosName")
    protected EmbosNameType embosName;
    @XmlElement(name = "FeeOrderType")
    protected FeeOrderTypeType feeOrderType;
    @XmlElement(name = "CardProdType")
    protected CardProdTypeType cardProdType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the embosNameType property.
     * 
     * @return
     *     possible object is
     *     {@link EmbosNameTypeType }
     *     
     */
    public EmbosNameTypeType getEmbosNameType() {
        return embosNameType;
    }

    /**
     * Sets the value of the embosNameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbosNameTypeType }
     *     
     */
    public void setEmbosNameType(EmbosNameTypeType value) {
        this.embosNameType = value;
    }

    /**
     * Gets the value of the embosName property.
     * 
     * @return
     *     possible object is
     *     {@link EmbosNameType }
     *     
     */
    public EmbosNameType getEmbosName() {
        return embosName;
    }

    /**
     * Sets the value of the embosName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbosNameType }
     *     
     */
    public void setEmbosName(EmbosNameType value) {
        this.embosName = value;
    }

    /**
     * Gets the value of the feeOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link FeeOrderTypeType }
     *     
     */
    public FeeOrderTypeType getFeeOrderType() {
        return feeOrderType;
    }

    /**
     * Sets the value of the feeOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeOrderTypeType }
     *     
     */
    public void setFeeOrderType(FeeOrderTypeType value) {
        this.feeOrderType = value;
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
