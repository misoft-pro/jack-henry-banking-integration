
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for payment check status
 *     change
 * 
 * <p>Java class for x_PmtChkStatHistArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_PmtChkStatHistArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtChkStatHistInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkStatHistInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_PmtChkStatHistArray_AType", propOrder = {
    "pmtChkStatHistInfo"
})
public class XPmtChkStatHistArrayAType {

    @XmlElement(name = "PmtChkStatHistInfo")
    protected List<PmtChkStatHistInfoCType> pmtChkStatHistInfo;

    /**
     * Gets the value of the pmtChkStatHistInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtChkStatHistInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtChkStatHistInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtChkStatHistInfoCType }
     * 
     * 
     */
    public List<PmtChkStatHistInfoCType> getPmtChkStatHistInfo() {
        if (pmtChkStatHistInfo == null) {
            pmtChkStatHistInfo = new ArrayList<PmtChkStatHistInfoCType>();
        }
        return this.pmtChkStatHistInfo;
    }

}
