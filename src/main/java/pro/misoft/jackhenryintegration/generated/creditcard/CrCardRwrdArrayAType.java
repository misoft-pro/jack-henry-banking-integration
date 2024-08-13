
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reward points and
 *     description
 * 
 * <p>Java class for CrCardRwrdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardRwrdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardRwrdRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardRwrdRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrCardRwrdArray_AType", propOrder = {
    "crCardRwrdRec"
})
public class CrCardRwrdArrayAType {

    @XmlElement(name = "CrCardRwrdRec")
    protected List<CrCardRwrdRecCType> crCardRwrdRec;

    /**
     * Gets the value of the crCardRwrdRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crCardRwrdRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrCardRwrdRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrCardRwrdRecCType }
     * 
     * 
     */
    public List<CrCardRwrdRecCType> getCrCardRwrdRec() {
        if (crCardRwrdRec == null) {
            crCardRwrdRec = new ArrayList<CrCardRwrdRecCType>();
        }
        return this.crCardRwrdRec;
    }

}
