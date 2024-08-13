
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of Overdraft Privilege option
 *                 settings
 * 
 * <p>Java class for ODPrvlgOptInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODPrvlgOptInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ODPrvlgOptInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgOptInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODPrvlgOptInfoArray_AType", propOrder = {
    "odPrvlgOptInfoRec"
})
public class ODPrvlgOptInfoArrayAType {

    @XmlElement(name = "ODPrvlgOptInfoRec", nillable = true)
    protected List<ODPrvlgOptInfoRecCType> odPrvlgOptInfoRec;

    /**
     * Gets the value of the odPrvlgOptInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odPrvlgOptInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getODPrvlgOptInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODPrvlgOptInfoRecCType }
     * 
     * 
     */
    public List<ODPrvlgOptInfoRecCType> getODPrvlgOptInfoRec() {
        if (odPrvlgOptInfoRec == null) {
            odPrvlgOptInfoRec = new ArrayList<ODPrvlgOptInfoRecCType>();
        }
        return this.odPrvlgOptInfoRec;
    }

}
