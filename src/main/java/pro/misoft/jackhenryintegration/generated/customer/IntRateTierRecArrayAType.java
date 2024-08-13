
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for the tier values for a interest rate search
 *             
 * 
 * <p>Java class for IntRateTierRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntRateTierRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntRateTierRec" type="{http://jackhenry.com/jxchange/TPG/2008}IntRateTierRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRateTierRecArray_AType", propOrder = {
    "intRateTierRec"
})
public class IntRateTierRecArrayAType {

    @XmlElement(name = "IntRateTierRec")
    protected List<IntRateTierRecCType> intRateTierRec;

    /**
     * Gets the value of the intRateTierRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intRateTierRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntRateTierRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntRateTierRecCType }
     * 
     * 
     */
    public List<IntRateTierRecCType> getIntRateTierRec() {
        if (intRateTierRec == null) {
            intRateTierRec = new ArrayList<IntRateTierRecCType>();
        }
        return this.intRateTierRec;
    }

}
