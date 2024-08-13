
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of elements for account reconciliation items
 *    
 * 
 * <p>Java class for AcctReconItemSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctReconItemSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctReconItemSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconItemSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctReconItemSrchArray_AType", propOrder = {
    "acctReconItemSrchRec"
})
public class AcctReconItemSrchArrayAType {

    @XmlElement(name = "AcctReconItemSrchRec")
    protected List<AcctReconItemSrchRecCType> acctReconItemSrchRec;

    /**
     * Gets the value of the acctReconItemSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctReconItemSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctReconItemSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctReconItemSrchRecCType }
     * 
     * 
     */
    public List<AcctReconItemSrchRecCType> getAcctReconItemSrchRec() {
        if (acctReconItemSrchRec == null) {
            acctReconItemSrchRec = new ArrayList<AcctReconItemSrchRecCType>();
        }
        return this.acctReconItemSrchRec;
    }

}
