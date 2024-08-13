
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of thresholds related to a specific
 *     alert
 * 
 * <p>Java class for CardAlrtThldArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAlrtThldArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardAlrtThldRec" type="{http://jackhenry.com/jxchange/TPG/2008}CardAlrtThldRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAlrtThldArray_AType", propOrder = {
    "cardAlrtThldRec"
})
public class CardAlrtThldArrayAType {

    @XmlElement(name = "CardAlrtThldRec")
    protected List<CardAlrtThldRecCType> cardAlrtThldRec;

    /**
     * Gets the value of the cardAlrtThldRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardAlrtThldRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardAlrtThldRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAlrtThldRecCType }
     * 
     * 
     */
    public List<CardAlrtThldRecCType> getCardAlrtThldRec() {
        if (cardAlrtThldRec == null) {
            cardAlrtThldRec = new ArrayList<CardAlrtThldRecCType>();
        }
        return this.cardAlrtThldRec;
    }

}
