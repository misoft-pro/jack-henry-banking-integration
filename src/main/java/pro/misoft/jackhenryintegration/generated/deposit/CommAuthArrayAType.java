
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of commercial authorizations necessary to open a
 *                 deposit account
 * 
 * <p>Java class for CommAuthArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommAuthArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommAuthRec" type="{http://jackhenry.com/jxchange/TPG/2008}CommAuthRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommAuthArray_AType", propOrder = {
    "commAuthRec"
})
public class CommAuthArrayAType {

    @XmlElement(name = "CommAuthRec")
    protected List<CommAuthRecCType> commAuthRec;

    /**
     * Gets the value of the commAuthRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commAuthRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommAuthRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommAuthRecCType }
     * 
     * 
     */
    public List<CommAuthRecCType> getCommAuthRec() {
        if (commAuthRec == null) {
            commAuthRec = new ArrayList<CommAuthRecCType>();
        }
        return this.commAuthRec;
    }

}
