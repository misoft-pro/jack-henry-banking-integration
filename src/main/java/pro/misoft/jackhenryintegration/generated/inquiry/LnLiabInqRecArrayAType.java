
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of loan liabilities as related to a customer
 *     or a specific Loan
 * 
 * <p>Java class for LnLiabInqRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnLiabInqRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnLiabInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnLiabInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnLiabInqRecArray_AType", propOrder = {
    "lnLiabInqRec"
})
public class LnLiabInqRecArrayAType {

    @XmlElement(name = "LnLiabInqRec")
    protected List<LnLiabInqRecCType> lnLiabInqRec;

    /**
     * Gets the value of the lnLiabInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnLiabInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnLiabInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnLiabInqRecCType }
     * 
     * 
     */
    public List<LnLiabInqRecCType> getLnLiabInqRec() {
        if (lnLiabInqRec == null) {
            lnLiabInqRec = new ArrayList<LnLiabInqRecCType>();
        }
        return this.lnLiabInqRec;
    }

}
