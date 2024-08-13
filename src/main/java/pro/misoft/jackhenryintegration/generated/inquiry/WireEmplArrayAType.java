
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of employees permissible for wire
 *                 activity
 * 
 * <p>Java class for WireEmplArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireEmplArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireEmplRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireEmplRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireEmplArray_AType", propOrder = {
    "wireEmplRec"
})
public class WireEmplArrayAType {

    @XmlElement(name = "WireEmplRec", nillable = true)
    protected List<WireEmplRecCType> wireEmplRec;

    /**
     * Gets the value of the wireEmplRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireEmplRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireEmplRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireEmplRecCType }
     * 
     * 
     */
    public List<WireEmplRecCType> getWireEmplRec() {
        if (wireEmplRec == null) {
            wireEmplRec = new ArrayList<WireEmplRecCType>();
        }
        return this.wireEmplRec;
    }

}
