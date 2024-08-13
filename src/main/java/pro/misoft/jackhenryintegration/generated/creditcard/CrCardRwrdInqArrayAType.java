
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reward values for
 *     inquiry
 * 
 * <p>Java class for CrCardRwrdInqArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardRwrdInqArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardRwrdInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardRwrdInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrCardRwrdInqArray_AType", propOrder = {
    "crCardRwrdInqRec"
})
public class CrCardRwrdInqArrayAType {

    @XmlElement(name = "CrCardRwrdInqRec")
    protected List<CrCardRwrdInqRecCType> crCardRwrdInqRec;

    /**
     * Gets the value of the crCardRwrdInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crCardRwrdInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrCardRwrdInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrCardRwrdInqRecCType }
     * 
     * 
     */
    public List<CrCardRwrdInqRecCType> getCrCardRwrdInqRec() {
        if (crCardRwrdInqRec == null) {
            crCardRwrdInqRec = new ArrayList<CrCardRwrdInqRecCType>();
        }
        return this.crCardRwrdInqRec;
    }

}
