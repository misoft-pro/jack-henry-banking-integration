
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of customers submitted for a platform
 *                 application.
 * 
 * <p>Java class for PltfmAppCustArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppCustArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAppCustInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppCustInfo_CType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmAppCustArray_AType", propOrder = {
    "pltfmAppCustInfo"
})
public class PltfmAppCustArrayAType {

    @XmlElement(name = "PltfmAppCustInfo", required = true)
    protected List<PltfmAppCustInfoCType> pltfmAppCustInfo;

    /**
     * Gets the value of the pltfmAppCustInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pltfmAppCustInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPltfmAppCustInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PltfmAppCustInfoCType }
     * 
     * 
     */
    public List<PltfmAppCustInfoCType> getPltfmAppCustInfo() {
        if (pltfmAppCustInfo == null) {
            pltfmAppCustInfo = new ArrayList<PltfmAppCustInfoCType>();
        }
        return this.pltfmAppCustInfo;
    }

}
