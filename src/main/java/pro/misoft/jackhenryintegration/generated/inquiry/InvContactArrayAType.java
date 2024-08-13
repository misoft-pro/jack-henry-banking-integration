
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of contacts for a serviced
 *     loans.
 * 
 * <p>Java class for InvContactArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvContactArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvContactRec" type="{http://jackhenry.com/jxchange/TPG/2008}InvContactRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvContactArray_AType", propOrder = {
    "invContactRec"
})
public class InvContactArrayAType {

    @XmlElement(name = "InvContactRec")
    protected List<InvContactRecCType> invContactRec;

    /**
     * Gets the value of the invContactRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invContactRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvContactRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvContactRecCType }
     * 
     * 
     */
    public List<InvContactRecCType> getInvContactRec() {
        if (invContactRec == null) {
            invContactRec = new ArrayList<InvContactRecCType>();
        }
        return this.invContactRec;
    }

}
