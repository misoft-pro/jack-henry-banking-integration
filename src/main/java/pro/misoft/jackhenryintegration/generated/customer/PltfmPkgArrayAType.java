
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Platform Cross Sell/Marketing Packages that a product is in.
 *     Platform Products can be in Multiple packages.
 * 
 * <p>Java class for PltfmPkgArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmPkgArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmPkgRec" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmPkgRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmPkgArray_AType", propOrder = {
    "pltfmPkgRec"
})
public class PltfmPkgArrayAType {

    @XmlElement(name = "PltfmPkgRec")
    protected List<PltfmPkgRecCType> pltfmPkgRec;

    /**
     * Gets the value of the pltfmPkgRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltfmPkgRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltfmPkgRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PltfmPkgRecCType }
     * 
     * 
     */
    public List<PltfmPkgRecCType> getPltfmPkgRec() {
        if (pltfmPkgRec == null) {
            pltfmPkgRec = new ArrayList<PltfmPkgRecCType>();
        }
        return this.pltfmPkgRec;
    }

}
