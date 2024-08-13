
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for credit card account
 *     search
 * 
 * <p>Java class for CrCardAcctSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardAcctSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardAcctSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardAcctSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrCardAcctSrchArray_AType", propOrder = {
    "crCardAcctSrchRec"
})
public class CrCardAcctSrchArrayAType {

    @XmlElement(name = "CrCardAcctSrchRec")
    protected List<CrCardAcctSrchRecCType> crCardAcctSrchRec;

    /**
     * Gets the value of the crCardAcctSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crCardAcctSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrCardAcctSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrCardAcctSrchRecCType }
     * 
     * 
     */
    public List<CrCardAcctSrchRecCType> getCrCardAcctSrchRec() {
        if (crCardAcctSrchRec == null) {
            crCardAcctSrchRec = new ArrayList<CrCardAcctSrchRecCType>();
        }
        return this.crCardAcctSrchRec;
    }

}
