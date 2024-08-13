
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Multiple Collateral Items
 * 
 * <p>Java class for PltfmRECollatInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmRECollatInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmRECollatInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmRECollatInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmRECollatInfoArray_AType", propOrder = {
    "pltfmRECollatInfo"
})
public class PltfmRECollatInfoArrayAType {

    @XmlElement(name = "PltfmRECollatInfo")
    protected List<PltfmRECollatInfoCType> pltfmRECollatInfo;

    /**
     * Gets the value of the pltfmRECollatInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltfmRECollatInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltfmRECollatInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PltfmRECollatInfoCType }
     * 
     * 
     */
    public List<PltfmRECollatInfoCType> getPltfmRECollatInfo() {
        if (pltfmRECollatInfo == null) {
            pltfmRECollatInfo = new ArrayList<PltfmRECollatInfoCType>();
        }
        return this.pltfmRECollatInfo;
    }

}
