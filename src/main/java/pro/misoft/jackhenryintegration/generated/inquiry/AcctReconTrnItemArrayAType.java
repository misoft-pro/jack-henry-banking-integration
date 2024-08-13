
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Array of different transaction types for account recon
 *    
 * 
 * <p>Java class for AcctReconTrnItemArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctReconTrnItemArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctReconTrnItemRec" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconTrnItemRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctReconTrnItemArray_AType", propOrder = {
    "acctReconTrnItemRec"
})
public class AcctReconTrnItemArrayAType {

    @XmlElement(name = "AcctReconTrnItemRec")
    protected List<AcctReconTrnItemRecCType> acctReconTrnItemRec;

    /**
     * Gets the value of the acctReconTrnItemRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctReconTrnItemRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctReconTrnItemRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctReconTrnItemRecCType }
     * 
     * 
     */
    public List<AcctReconTrnItemRecCType> getAcctReconTrnItemRec() {
        if (acctReconTrnItemRec == null) {
            acctReconTrnItemRec = new ArrayList<AcctReconTrnItemRecCType>();
        }
        return this.acctReconTrnItemRec;
    }

}
