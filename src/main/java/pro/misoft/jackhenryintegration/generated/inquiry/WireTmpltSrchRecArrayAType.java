
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for wire template
 *     search.
 * 
 * <p>Java class for WireTmpltSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTmpltSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireTmpltSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireTmpltSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireTmpltSrchRecArray_AType", propOrder = {
    "wireTmpltSrchRec"
})
public class WireTmpltSrchRecArrayAType {

    @XmlElement(name = "WireTmpltSrchRec")
    protected List<WireTmpltSrchRecCType> wireTmpltSrchRec;

    /**
     * Gets the value of the wireTmpltSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wireTmpltSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWireTmpltSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WireTmpltSrchRecCType }
     * 
     * 
     */
    public List<WireTmpltSrchRecCType> getWireTmpltSrchRec() {
        if (wireTmpltSrchRec == null) {
            wireTmpltSrchRec = new ArrayList<WireTmpltSrchRecCType>();
        }
        return this.wireTmpltSrchRec;
    }

}
