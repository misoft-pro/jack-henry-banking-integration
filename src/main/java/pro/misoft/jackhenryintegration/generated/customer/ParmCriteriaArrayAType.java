
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of ParmCriteriaInfo 
 * 
 * <p>Java class for ParmCriteriaArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParmCriteriaArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParmCriteriaInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ParmCriteriaInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParmCriteriaArray_AType", propOrder = {
    "parmCriteriaInfo"
})
public class ParmCriteriaArrayAType {

    @XmlElement(name = "ParmCriteriaInfo", nillable = true)
    protected List<ParmCriteriaInfoCType> parmCriteriaInfo;

    /**
     * Gets the value of the parmCriteriaInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parmCriteriaInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParmCriteriaInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParmCriteriaInfoCType }
     * 
     * 
     */
    public List<ParmCriteriaInfoCType> getParmCriteriaInfo() {
        if (parmCriteriaInfo == null) {
            parmCriteriaInfo = new ArrayList<ParmCriteriaInfoCType>();
        }
        return this.parmCriteriaInfo;
    }

}
