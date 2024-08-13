
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for NSF history
 *     search.
 * 
 * <p>Java class for NSFHistSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSFHistSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NSFHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}NSFHistSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NSFHistSrchRecArray_AType", propOrder = {
    "nsfHistSrchRec"
})
public class NSFHistSrchRecArrayAType {

    @XmlElement(name = "NSFHistSrchRec")
    protected List<NSFHistSrchRecCType> nsfHistSrchRec;

    /**
     * Gets the value of the nsfHistSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsfHistSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNSFHistSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NSFHistSrchRecCType }
     * 
     * 
     */
    public List<NSFHistSrchRecCType> getNSFHistSrchRec() {
        if (nsfHistSrchRec == null) {
            nsfHistSrchRec = new ArrayList<NSFHistSrchRecCType>();
        }
        return this.nsfHistSrchRec;
    }

}
