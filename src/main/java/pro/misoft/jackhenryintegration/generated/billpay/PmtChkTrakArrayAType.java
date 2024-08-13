
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for payment check tracking
 *     records
 * 
 * <p>Java class for PmtChkTrakArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtChkTrakArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtChkTrakRecInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtChkTrakRecInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtChkTrakArray_AType", propOrder = {
    "pmtChkTrakRecInfo"
})
public class PmtChkTrakArrayAType {

    @XmlElement(name = "PmtChkTrakRecInfo")
    protected List<PmtChkTrakRecInfoCType> pmtChkTrakRecInfo;

    /**
     * Gets the value of the pmtChkTrakRecInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtChkTrakRecInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtChkTrakRecInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtChkTrakRecInfoCType }
     * 
     * 
     */
    public List<PmtChkTrakRecInfoCType> getPmtChkTrakRecInfo() {
        if (pmtChkTrakRecInfo == null) {
            pmtChkTrakRecInfo = new ArrayList<PmtChkTrakRecInfoCType>();
        }
        return this.pmtChkTrakRecInfo;
    }

}
