
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of related product responses for Customer
 *                 Relationship Management Potential Sale Inquiry
 * 
 * <p>Java class for PotSaleProdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PotSaleProdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PotSaleProdRec" type="{http://jackhenry.com/jxchange/TPG/2008}PotSaleProdRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PotSaleProdArray_AType", propOrder = {
    "potSaleProdRec"
})
public class PotSaleProdArrayAType {

    @XmlElement(name = "PotSaleProdRec")
    protected List<PotSaleProdRecCType> potSaleProdRec;

    /**
     * Gets the value of the potSaleProdRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the potSaleProdRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPotSaleProdRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PotSaleProdRecCType }
     * 
     * 
     */
    public List<PotSaleProdRecCType> getPotSaleProdRec() {
        if (potSaleProdRec == null) {
            potSaleProdRec = new ArrayList<PotSaleProdRecCType>();
        }
        return this.potSaleProdRec;
    }

}
