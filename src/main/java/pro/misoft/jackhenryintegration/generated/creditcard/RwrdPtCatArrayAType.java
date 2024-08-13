
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reward point categories
 * 
 * <p>Java class for RwrdPtCatArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RwrdPtCatArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RwrdPtCatRec" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtCatRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RwrdPtCatArray_AType", propOrder = {
    "rwrdPtCatRec"
})
public class RwrdPtCatArrayAType {

    @XmlElement(name = "RwrdPtCatRec")
    protected List<RwrdPtCatRecCType> rwrdPtCatRec;

    /**
     * Gets the value of the rwrdPtCatRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rwrdPtCatRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRwrdPtCatRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RwrdPtCatRecCType }
     * 
     * 
     */
    public List<RwrdPtCatRecCType> getRwrdPtCatRec() {
        if (rwrdPtCatRec == null) {
            rwrdPtCatRec = new ArrayList<RwrdPtCatRecCType>();
        }
        return this.rwrdPtCatRec;
    }

}
