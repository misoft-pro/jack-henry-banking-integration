
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for Multi Level Lending (MLL)
 *     search for the Loan records.
 * 
 * <p>Java class for MasterLoanSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterLoanSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterLoanSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}MasterLoanSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterLoanSrchRecArray_AType", propOrder = {
    "masterLoanSrchRec"
})
public class MasterLoanSrchRecArrayAType {

    @XmlElement(name = "MasterLoanSrchRec")
    protected List<MasterLoanSrchRecCType> masterLoanSrchRec;

    /**
     * Gets the value of the masterLoanSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterLoanSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterLoanSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterLoanSrchRecCType }
     * 
     * 
     */
    public List<MasterLoanSrchRecCType> getMasterLoanSrchRec() {
        if (masterLoanSrchRec == null) {
            masterLoanSrchRec = new ArrayList<MasterLoanSrchRecCType>();
        }
        return this.masterLoanSrchRec;
    }

}
