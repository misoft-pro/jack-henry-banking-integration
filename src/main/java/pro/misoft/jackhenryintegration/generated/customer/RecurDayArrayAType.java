
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of days for weekly
 *     recurrene
 * 
 * <p>Java class for RecurDayArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurDayArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecurDayInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}RecurDayInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurDayArray_AType", propOrder = {
    "recurDayInfoRec"
})
public class RecurDayArrayAType {

    @XmlElement(name = "RecurDayInfoRec")
    protected List<RecurDayInfoRecCType> recurDayInfoRec;

    /**
     * Gets the value of the recurDayInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurDayInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurDayInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurDayInfoRecCType }
     * 
     * 
     */
    public List<RecurDayInfoRecCType> getRecurDayInfoRec() {
        if (recurDayInfoRec == null) {
            recurDayInfoRec = new ArrayList<RecurDayInfoRecCType>();
        }
        return this.recurDayInfoRec;
    }

}
