
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  An array of sender charges for wire tag {3700}
 *             
 * 
 * <p>Java class for WireSndChgArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireSndChgArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireSndrChgRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireSndChgRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireSndChgArray_AType", propOrder = {
    "wireSndrChgRec"
})
public class WireSndChgArrayAType {

    @XmlElement(name = "WireSndrChgRec", nillable = true)
    protected List<WireSndChgRecCType> wireSndrChgRec;

    /**
     * Gets the value of the wireSndrChgRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireSndrChgRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireSndrChgRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireSndChgRecCType }
     * 
     * 
     */
    public List<WireSndChgRecCType> getWireSndrChgRec() {
        if (wireSndrChgRec == null) {
            wireSndrChgRec = new ArrayList<WireSndChgRecCType>();
        }
        return this.wireSndrChgRec;
    }

}
