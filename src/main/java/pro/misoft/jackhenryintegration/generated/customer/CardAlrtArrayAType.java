
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of alerts related to a specific
 *     card
 * 
 * <p>Java class for CardAlrtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAlrtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardAlrtRec" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAlrtArray_AType", propOrder = {
    "cardAlrtRec"
})
public class CardAlrtArrayAType {

    @XmlElement(name = "CardAlrtRec")
    protected List<CardAlrtRecCType> cardAlrtRec;

    /**
     * Gets the value of the cardAlrtRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardAlrtRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardAlrtRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAlrtRecCType }
     * 
     * 
     */
    public List<CardAlrtRecCType> getCardAlrtRec() {
        if (cardAlrtRec == null) {
            cardAlrtRec = new ArrayList<CardAlrtRecCType>();
        }
        return this.cardAlrtRec;
    }

}
