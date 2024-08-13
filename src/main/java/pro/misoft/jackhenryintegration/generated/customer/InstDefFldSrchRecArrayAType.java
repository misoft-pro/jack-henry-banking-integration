
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for institution defined fields
 *    
 * 
 * <p>Java class for InstDefFldSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstDefFldSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstDefFldSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}InstDefFldSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstDefFldSrchRecArray_AType", propOrder = {
    "instDefFldSrchRec"
})
public class InstDefFldSrchRecArrayAType {

    @XmlElement(name = "InstDefFldSrchRec")
    protected List<InstDefFldSrchRecCType> instDefFldSrchRec;

    /**
     * Gets the value of the instDefFldSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instDefFldSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstDefFldSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstDefFldSrchRecCType }
     * 
     * 
     */
    public List<InstDefFldSrchRecCType> getInstDefFldSrchRec() {
        if (instDefFldSrchRec == null) {
            instDefFldSrchRec = new ArrayList<InstDefFldSrchRecCType>();
        }
        return this.instDefFldSrchRec;
    }

}
