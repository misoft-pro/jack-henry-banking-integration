
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of cardholders for a specific credit card account id
 * 
 * <p>Java class for CrCardHolderArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardHolderArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardHolderRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardHolderRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrCardHolderArray_AType", propOrder = {
    "crCardHolderRec"
})
public class CrCardHolderArrayAType {

    @XmlElement(name = "CrCardHolderRec")
    protected List<CrCardHolderRecCType> crCardHolderRec;

    /**
     * Gets the value of the crCardHolderRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crCardHolderRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrCardHolderRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrCardHolderRecCType }
     * 
     * 
     */
    public List<CrCardHolderRecCType> getCrCardHolderRec() {
        if (crCardHolderRec == null) {
            crCardHolderRec = new ArrayList<CrCardHolderRecCType>();
        }
        return this.crCardHolderRec;
    }

}
