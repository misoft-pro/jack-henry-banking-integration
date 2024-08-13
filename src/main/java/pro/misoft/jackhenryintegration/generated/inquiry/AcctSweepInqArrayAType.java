
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of elements for account sweep arrangements that is returned in
 *     the inquiry service
 * 
 * <p>Java class for AcctSweepInqArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctSweepInqArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctSweepInqInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctSweepInqInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctSweepInqArray_AType", propOrder = {
    "acctSweepInqInfo"
})
public class AcctSweepInqArrayAType {

    @XmlElement(name = "AcctSweepInqInfo")
    protected List<AcctSweepInqInfoCType> acctSweepInqInfo;

    /**
     * Gets the value of the acctSweepInqInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctSweepInqInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSweepInqInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctSweepInqInfoCType }
     * 
     * 
     */
    public List<AcctSweepInqInfoCType> getAcctSweepInqInfo() {
        if (acctSweepInqInfo == null) {
            acctSweepInqInfo = new ArrayList<AcctSweepInqInfoCType>();
        }
        return this.acctSweepInqInfo;
    }

}
