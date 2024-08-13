
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Discounts available for the product.
 *             
 * 
 * <p>Java class for DiscArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}DiscInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscArray_AType", propOrder = {
    "discInfoRec"
})
public class DiscArrayAType {

    @XmlElement(name = "DiscInfoRec")
    protected List<DiscInfoRecCType> discInfoRec;

    /**
     * Gets the value of the discInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscInfoRecCType }
     * 
     * 
     */
    public List<DiscInfoRecCType> getDiscInfoRec() {
        if (discInfoRec == null) {
            discInfoRec = new ArrayList<DiscInfoRecCType>();
        }
        return this.discInfoRec;
    }

}
