
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  An Array of responses for wire
 *                 schedules.
 * 
 * <p>Java class for WireSchedRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireSchedRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireSchedRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireSchedRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireSchedRecArray_AType", propOrder = {
    "wireSchedRec"
})
public class WireSchedRecArrayAType {

    @XmlElement(name = "WireSchedRec")
    protected List<WireSchedRecCType> wireSchedRec;

    /**
     * Gets the value of the wireSchedRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireSchedRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireSchedRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireSchedRecCType }
     * 
     * 
     */
    public List<WireSchedRecCType> getWireSchedRec() {
        if (wireSchedRec == null) {
            wireSchedRec = new ArrayList<WireSchedRecCType>();
        }
        return this.wireSchedRec;
    }

}
