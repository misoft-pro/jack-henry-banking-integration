
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of credit scores
 * 
 * <p>Java class for CrScoreArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrScoreArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrScoreInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrScoreArray_AType", propOrder = {
    "crScoreInfo"
})
public class CrScoreArrayAType {

    @XmlElement(name = "CrScoreInfo")
    protected List<CrScoreInfoCType> crScoreInfo;

    /**
     * Gets the value of the crScoreInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crScoreInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrScoreInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrScoreInfoCType }
     * 
     * 
     */
    public List<CrScoreInfoCType> getCrScoreInfo() {
        if (crScoreInfo == null) {
            crScoreInfo = new ArrayList<CrScoreInfoCType>();
        }
        return this.crScoreInfo;
    }

}
