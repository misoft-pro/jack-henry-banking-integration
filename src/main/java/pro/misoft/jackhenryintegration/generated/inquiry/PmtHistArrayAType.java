
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of a loans payment history for credit bureau
 *                 reporting
 * 
 * <p>Java class for PmtHistArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHistArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtHistInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHistInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtHistArray_AType", propOrder = {
    "pmtHistInfo"
})
public class PmtHistArrayAType {

    @XmlElement(name = "PmtHistInfo")
    protected List<PmtHistInfoCType> pmtHistInfo;

    /**
     * Gets the value of the pmtHistInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtHistInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtHistInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtHistInfoCType }
     * 
     * 
     */
    public List<PmtHistInfoCType> getPmtHistInfo() {
        if (pmtHistInfo == null) {
            pmtHistInfo = new ArrayList<PmtHistInfoCType>();
        }
        return this.pmtHistInfo;
    }

}
