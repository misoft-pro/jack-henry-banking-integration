
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of collateral documents.
 * 
 * <p>Java class for CollatDocItemRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatDocItemRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatDocItemRec" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocItemRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollatDocItemRecArray_AType", propOrder = {
    "collatDocItemRec"
})
public class CollatDocItemRecArrayAType {

    @XmlElement(name = "CollatDocItemRec")
    protected List<CollatDocItemRecCType> collatDocItemRec;

    /**
     * Gets the value of the collatDocItemRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collatDocItemRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollatDocItemRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollatDocItemRecCType }
     * 
     * 
     */
    public List<CollatDocItemRecCType> getCollatDocItemRec() {
        if (collatDocItemRec == null) {
            collatDocItemRec = new ArrayList<CollatDocItemRecCType>();
        }
        return this.collatDocItemRec;
    }

}
