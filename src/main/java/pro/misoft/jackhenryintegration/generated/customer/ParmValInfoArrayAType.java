
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of information for each parameter value
 *             
 * 
 * <p>Java class for ParmValInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParmValInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParmValInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ParmValInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParmValInfoArray_AType", propOrder = {
    "parmValInfo"
})
public class ParmValInfoArrayAType {

    @XmlElement(name = "ParmValInfo", nillable = true)
    protected List<ParmValInfoCType> parmValInfo;

    /**
     * Gets the value of the parmValInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parmValInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParmValInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParmValInfoCType }
     * 
     * 
     */
    public List<ParmValInfoCType> getParmValInfo() {
        if (parmValInfo == null) {
            parmValInfo = new ArrayList<ParmValInfoCType>();
        }
        return this.parmValInfo;
    }

}
