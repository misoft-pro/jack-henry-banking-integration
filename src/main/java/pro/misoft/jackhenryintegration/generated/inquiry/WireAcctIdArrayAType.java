
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of account identifications permissible for
 *                 wire activity 
 * 
 * <p>Java class for WireAcctIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireAcctIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireAcctIdRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireAcctIdRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireAcctIdArray_AType", propOrder = {
    "wireAcctIdRec"
})
public class WireAcctIdArrayAType {

    @XmlElement(name = "WireAcctIdRec", nillable = true)
    protected List<WireAcctIdRecCType> wireAcctIdRec;

    /**
     * Gets the value of the wireAcctIdRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireAcctIdRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireAcctIdRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireAcctIdRecCType }
     * 
     * 
     */
    public List<WireAcctIdRecCType> getWireAcctIdRec() {
        if (wireAcctIdRec == null) {
            wireAcctIdRec = new ArrayList<WireAcctIdRecCType>();
        }
        return this.wireAcctIdRec;
    }

}
