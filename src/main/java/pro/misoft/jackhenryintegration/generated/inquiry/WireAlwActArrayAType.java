
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of processes that are allowable for wire
 *                 activity
 * 
 * <p>Java class for WireAlwActArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireAlwActArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireAlwActRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireAlwActRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireAlwActArray_AType", propOrder = {
    "wireAlwActRec"
})
public class WireAlwActArrayAType {

    @XmlElement(name = "WireAlwActRec", nillable = true)
    protected List<WireAlwActRecCType> wireAlwActRec;

    /**
     * Gets the value of the wireAlwActRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireAlwActRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireAlwActRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireAlwActRecCType }
     * 
     * 
     */
    public List<WireAlwActRecCType> getWireAlwActRec() {
        if (wireAlwActRec == null) {
            wireAlwActRec = new ArrayList<WireAlwActRecCType>();
        }
        return this.wireAlwActRec;
    }

}
