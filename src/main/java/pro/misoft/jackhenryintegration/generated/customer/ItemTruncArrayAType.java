
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Item Truncation options available for the
 *                 product.
 * 
 * <p>Java class for ItemTruncArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemTruncArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemTruncInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ItemTruncInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTruncArray_AType", propOrder = {
    "itemTruncInfoRec"
})
public class ItemTruncArrayAType {

    @XmlElement(name = "ItemTruncInfoRec")
    protected List<ItemTruncInfoRecCType> itemTruncInfoRec;

    /**
     * Gets the value of the itemTruncInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemTruncInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemTruncInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemTruncInfoRecCType }
     * 
     * 
     */
    public List<ItemTruncInfoRecCType> getItemTruncInfoRec() {
        if (itemTruncInfoRec == null) {
            itemTruncInfoRec = new ArrayList<ItemTruncInfoRecCType>();
        }
        return this.itemTruncInfoRec;
    }

}
