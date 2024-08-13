
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of insurance classifications not addressed as an
 *                 individual element. For example, Credit Life, A and H, Unemployment
 *             
 * 
 * <p>Java class for OthInsurArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OthInsurArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OthInsurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OthInsurArray_AType", propOrder = {
    "othInsurInfoRec"
})
public class OthInsurArrayAType {

    @XmlElement(name = "OthInsurInfoRec")
    protected List<OthInsurInfoRecCType> othInsurInfoRec;

    /**
     * Gets the value of the othInsurInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othInsurInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthInsurInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OthInsurInfoRecCType }
     * 
     * 
     */
    public List<OthInsurInfoRecCType> getOthInsurInfoRec() {
        if (othInsurInfoRec == null) {
            othInsurInfoRec = new ArrayList<OthInsurInfoRecCType>();
        }
        return this.othInsurInfoRec;
    }

}
