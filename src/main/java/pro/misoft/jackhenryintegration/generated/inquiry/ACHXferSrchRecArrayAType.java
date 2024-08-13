
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for ACH transfer
 *     search.
 * 
 * <p>Java class for ACHXferSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHXferSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHXferSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHXferSrchRecArray_AType", propOrder = {
    "achXferSrchRec"
})
public class ACHXferSrchRecArrayAType {

    @XmlElement(name = "ACHXferSrchRec")
    protected List<ACHXferSrchRecCType> achXferSrchRec;

    /**
     * Gets the value of the achXferSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achXferSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACHXferSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACHXferSrchRecCType }
     * 
     * 
     */
    public List<ACHXferSrchRecCType> getACHXferSrchRec() {
        if (achXferSrchRec == null) {
            achXferSrchRec = new ArrayList<ACHXferSrchRecCType>();
        }
        return this.achXferSrchRec;
    }

}
