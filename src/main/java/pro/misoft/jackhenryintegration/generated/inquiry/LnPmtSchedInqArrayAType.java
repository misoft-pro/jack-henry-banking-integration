
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of elements for a loan payment schedule that is returned in the
 *     inquiry service
 * 
 * <p>Java class for LnPmtSchedInqArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPmtSchedInqArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnPmtSchedInqInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtSchedInqInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnPmtSchedInqArray_AType", propOrder = {
    "lnPmtSchedInqInfo"
})
public class LnPmtSchedInqArrayAType {

    @XmlElement(name = "LnPmtSchedInqInfo")
    protected List<LnPmtSchedInqInfoCType> lnPmtSchedInqInfo;

    /**
     * Gets the value of the lnPmtSchedInqInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnPmtSchedInqInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnPmtSchedInqInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnPmtSchedInqInfoCType }
     * 
     * 
     */
    public List<LnPmtSchedInqInfoCType> getLnPmtSchedInqInfo() {
        if (lnPmtSchedInqInfo == null) {
            lnPmtSchedInqInfo = new ArrayList<LnPmtSchedInqInfoCType>();
        }
        return this.lnPmtSchedInqInfo;
    }

}
