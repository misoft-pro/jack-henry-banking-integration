
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of Platform Application Tasks
 *             
 * 
 * <p>Java class for PltfmAppTaskArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppTaskArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAppTaskInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppTaskInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmAppTaskArray_AType", propOrder = {
    "pltfmAppTaskInfo"
})
public class PltfmAppTaskArrayAType {

    @XmlElement(name = "PltfmAppTaskInfo")
    protected List<PltfmAppTaskInfoCType> pltfmAppTaskInfo;

    /**
     * Gets the value of the pltfmAppTaskInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltfmAppTaskInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltfmAppTaskInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PltfmAppTaskInfoCType }
     * 
     * 
     */
    public List<PltfmAppTaskInfoCType> getPltfmAppTaskInfo() {
        if (pltfmAppTaskInfo == null) {
            pltfmAppTaskInfo = new ArrayList<PltfmAppTaskInfoCType>();
        }
        return this.pltfmAppTaskInfo;
    }

}
