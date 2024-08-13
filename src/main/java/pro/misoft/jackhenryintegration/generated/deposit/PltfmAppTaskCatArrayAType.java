
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of Platform Application Tasks by Category
 *             
 * 
 * <p>Java class for PltfmAppTaskCatArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppTaskCatArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAppTaskCatInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppTaskCatInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmAppTaskCatArray_AType", propOrder = {
    "pltfmAppTaskCatInfo"
})
public class PltfmAppTaskCatArrayAType {

    @XmlElement(name = "PltfmAppTaskCatInfo")
    protected List<PltfmAppTaskCatInfoCType> pltfmAppTaskCatInfo;

    /**
     * Gets the value of the pltfmAppTaskCatInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltfmAppTaskCatInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltfmAppTaskCatInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PltfmAppTaskCatInfoCType }
     * 
     * 
     */
    public List<PltfmAppTaskCatInfoCType> getPltfmAppTaskCatInfo() {
        if (pltfmAppTaskCatInfo == null) {
            pltfmAppTaskCatInfo = new ArrayList<PltfmAppTaskCatInfoCType>();
        }
        return this.pltfmAppTaskCatInfo;
    }

}
