
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for OFAC Specially Designated
 *     Nationals search 
 * 
 * <p>Java class for OFACSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFACSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OFACSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}OFACSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFACSrchArray_AType", propOrder = {
    "ofacSrchRec"
})
public class OFACSrchArrayAType {

    @XmlElement(name = "OFACSrchRec")
    protected List<OFACSrchRecCType> ofacSrchRec;

    /**
     * Gets the value of the ofacSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ofacSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOFACSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OFACSrchRecCType }
     * 
     * 
     */
    public List<OFACSrchRecCType> getOFACSrchRec() {
        if (ofacSrchRec == null) {
            ofacSrchRec = new ArrayList<OFACSrchRecCType>();
        }
        return this.ofacSrchRec;
    }

}
