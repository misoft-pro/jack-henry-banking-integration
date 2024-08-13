
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of Loan Payment Breakdown
 *     Information
 * 
 * <p>Java class for LnHistPmtInfoSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnHistPmtInfoSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnHistPmtInfoSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnHistPmtInfoSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnHistPmtInfoSrchArray_AType", propOrder = {
    "lnHistPmtInfoSrchRec"
})
public class LnHistPmtInfoSrchArrayAType {

    @XmlElement(name = "LnHistPmtInfoSrchRec")
    protected List<LnHistPmtInfoSrchRecCType> lnHistPmtInfoSrchRec;

    /**
     * Gets the value of the lnHistPmtInfoSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnHistPmtInfoSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnHistPmtInfoSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnHistPmtInfoSrchRecCType }
     * 
     * 
     */
    public List<LnHistPmtInfoSrchRecCType> getLnHistPmtInfoSrchRec() {
        if (lnHistPmtInfoSrchRec == null) {
            lnHistPmtInfoSrchRec = new ArrayList<LnHistPmtInfoSrchRecCType>();
        }
        return this.lnHistPmtInfoSrchRec;
    }

}
