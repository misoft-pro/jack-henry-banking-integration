
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of Co-Borrowers for a loan
 * 
 * <p>Java class for PltfmAppCoBorwArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppCoBorwArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAppCoBorwInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppCoBorwInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmAppCoBorwArray_AType", propOrder = {
    "pltfmAppCoBorwInfoRec"
})
public class PltfmAppCoBorwArrayAType {

    @XmlElement(name = "PltfmAppCoBorwInfoRec")
    protected List<PltfmAppCoBorwInfoRecCType> pltfmAppCoBorwInfoRec;

    /**
     * Gets the value of the pltfmAppCoBorwInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltfmAppCoBorwInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltfmAppCoBorwInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PltfmAppCoBorwInfoRecCType }
     * 
     * 
     */
    public List<PltfmAppCoBorwInfoRecCType> getPltfmAppCoBorwInfoRec() {
        if (pltfmAppCoBorwInfoRec == null) {
            pltfmAppCoBorwInfoRec = new ArrayList<PltfmAppCoBorwInfoRecCType>();
        }
        return this.pltfmAppCoBorwInfoRec;
    }

}
