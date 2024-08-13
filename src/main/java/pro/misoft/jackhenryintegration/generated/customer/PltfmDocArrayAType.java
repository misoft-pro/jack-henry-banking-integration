
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for Platform documents
 * 
 * <p>Java class for PltfmDocArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmDocArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmDocInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmDocInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmDocArray_AType", propOrder = {
    "pltfmDocInfoRec"
})
public class PltfmDocArrayAType {

    @XmlElement(name = "PltfmDocInfoRec")
    protected List<PltfmDocInfoRecCType> pltfmDocInfoRec;

    /**
     * Gets the value of the pltfmDocInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltfmDocInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltfmDocInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PltfmDocInfoRecCType }
     * 
     * 
     */
    public List<PltfmDocInfoRecCType> getPltfmDocInfoRec() {
        if (pltfmDocInfoRec == null) {
            pltfmDocInfoRec = new ArrayList<PltfmDocInfoRecCType>();
        }
        return this.pltfmDocInfoRec;
    }

}
