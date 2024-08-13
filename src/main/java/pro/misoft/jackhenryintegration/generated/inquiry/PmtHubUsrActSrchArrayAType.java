
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PENDING - An array of payment hub
 *     activity
 * 
 * <p>Java class for PmtHubUsrActSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubUsrActSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtHubUsrActSrchInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubUsrActSrchInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtHubUsrActSrchArray_AType", propOrder = {
    "pmtHubUsrActSrchInfo"
})
public class PmtHubUsrActSrchArrayAType {

    @XmlElement(name = "PmtHubUsrActSrchInfo")
    protected List<PmtHubUsrActSrchInfoCType> pmtHubUsrActSrchInfo;

    /**
     * Gets the value of the pmtHubUsrActSrchInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtHubUsrActSrchInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtHubUsrActSrchInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtHubUsrActSrchInfoCType }
     * 
     * 
     */
    public List<PmtHubUsrActSrchInfoCType> getPmtHubUsrActSrchInfo() {
        if (pmtHubUsrActSrchInfo == null) {
            pmtHubUsrActSrchInfo = new ArrayList<PmtHubUsrActSrchInfoCType>();
        }
        return this.pmtHubUsrActSrchInfo;
    }

}
