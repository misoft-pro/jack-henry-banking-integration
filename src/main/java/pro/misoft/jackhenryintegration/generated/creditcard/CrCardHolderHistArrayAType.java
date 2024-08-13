
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of cardholders card order history
 * 
 * <p>Java class for CrCardHolderHistArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardHolderHistArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardHolderHistRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardHolderHistRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrCardHolderHistArray_AType", propOrder = {
    "crCardHolderHistRec"
})
public class CrCardHolderHistArrayAType {

    @XmlElement(name = "CrCardHolderHistRec")
    protected List<CrCardHolderHistRecCType> crCardHolderHistRec;

    /**
     * Gets the value of the crCardHolderHistRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crCardHolderHistRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrCardHolderHistRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrCardHolderHistRecCType }
     * 
     * 
     */
    public List<CrCardHolderHistRecCType> getCrCardHolderHistRec() {
        if (crCardHolderHistRec == null) {
            crCardHolderHistRec = new ArrayList<CrCardHolderHistRecCType>();
        }
        return this.crCardHolderHistRec;
    }

}
