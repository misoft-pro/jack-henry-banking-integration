
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of day of month to make
 *                 payments
 * 
 * <p>Java class for PmtDayInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtDayInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtDayInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDayInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtDayInfoArray_AType", propOrder = {
    "pmtDayInfo"
})
public class PmtDayInfoArrayAType {

    @XmlElement(name = "PmtDayInfo")
    protected List<PmtDayInfoCType> pmtDayInfo;

    /**
     * Gets the value of the pmtDayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtDayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtDayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtDayInfoCType }
     * 
     * 
     */
    public List<PmtDayInfoCType> getPmtDayInfo() {
        if (pmtDayInfo == null) {
            pmtDayInfo = new ArrayList<PmtDayInfoCType>();
        }
        return this.pmtDayInfo;
    }

}
