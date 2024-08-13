
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of delivered account numbers and
 *                 types
 * 
 * <p>Java class for IntnetFinInstAcctIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstAcctIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntnetFinInstAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstAcctId_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntnetFinInstAcctIdArray_AType", propOrder = {
    "intnetFinInstAcctId"
})
public class IntnetFinInstAcctIdArrayAType {

    @XmlElement(name = "IntnetFinInstAcctId")
    protected List<IntnetFinInstAcctIdCType> intnetFinInstAcctId;

    /**
     * Gets the value of the intnetFinInstAcctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intnetFinInstAcctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntnetFinInstAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntnetFinInstAcctIdCType }
     * 
     * 
     */
    public List<IntnetFinInstAcctIdCType> getIntnetFinInstAcctId() {
        if (intnetFinInstAcctId == null) {
            intnetFinInstAcctId = new ArrayList<IntnetFinInstAcctIdCType>();
        }
        return this.intnetFinInstAcctId;
    }

}
