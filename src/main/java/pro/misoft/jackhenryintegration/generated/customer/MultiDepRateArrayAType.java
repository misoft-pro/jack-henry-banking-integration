
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of multiple deposits with different rates and
 *                 tracking 
 * 
 * <p>Java class for MultiDepRateArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiDepRateArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultiDepRateRec" type="{http://jackhenry.com/jxchange/TPG/2008}MultiDepRateRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDepRateArray_AType", propOrder = {
    "multiDepRateRec"
})
public class MultiDepRateArrayAType {

    @XmlElement(name = "MultiDepRateRec")
    protected List<MultiDepRateRecCType> multiDepRateRec;

    /**
     * Gets the value of the multiDepRateRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiDepRateRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiDepRateRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiDepRateRecCType }
     * 
     * 
     */
    public List<MultiDepRateRecCType> getMultiDepRateRec() {
        if (multiDepRateRec == null) {
            multiDepRateRec = new ArrayList<MultiDepRateRecCType>();
        }
        return this.multiDepRateRec;
    }

}
