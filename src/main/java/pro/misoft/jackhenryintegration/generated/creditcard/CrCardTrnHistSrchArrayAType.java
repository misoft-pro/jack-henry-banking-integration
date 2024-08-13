
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for account historycredit card
 *     transaction history search.
 * 
 * <p>Java class for CrCardTrnHistSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardTrnHistSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardTrnHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardTrnHistSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrCardTrnHistSrchArray_AType", propOrder = {
    "crCardTrnHistSrchRec"
})
public class CrCardTrnHistSrchArrayAType {

    @XmlElement(name = "CrCardTrnHistSrchRec")
    protected List<CrCardTrnHistSrchRecCType> crCardTrnHistSrchRec;

    /**
     * Gets the value of the crCardTrnHistSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crCardTrnHistSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrCardTrnHistSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrCardTrnHistSrchRecCType }
     * 
     * 
     */
    public List<CrCardTrnHistSrchRecCType> getCrCardTrnHistSrchRec() {
        if (crCardTrnHistSrchRec == null) {
            crCardTrnHistSrchRec = new ArrayList<CrCardTrnHistSrchRecCType>();
        }
        return this.crCardTrnHistSrchRec;
    }

}
