
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of past due counters and their respective period of time
 *             
 * 
 * <p>Java class for PastDueArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PastDueArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PastDueInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PastDueInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PastDueArray_AType", propOrder = {
    "pastDueInfo"
})
public class PastDueArrayAType {

    @XmlElement(name = "PastDueInfo")
    protected List<PastDueInfoCType> pastDueInfo;

    /**
     * Gets the value of the pastDueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastDueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastDueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PastDueInfoCType }
     * 
     * 
     */
    public List<PastDueInfoCType> getPastDueInfo() {
        if (pastDueInfo == null) {
            pastDueInfo = new ArrayList<PastDueInfoCType>();
        }
        return this.pastDueInfo;
    }

}
