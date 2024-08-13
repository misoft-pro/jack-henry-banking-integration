
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of tier charges based on transactional
 *                 activity
 * 
 * <p>Java class for TrnActTierInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnActTierInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnActTierInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrnActTierInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnActTierInfoArray_AType", propOrder = {
    "trnActTierInfoRec"
})
public class TrnActTierInfoArrayAType {

    @XmlElement(name = "TrnActTierInfoRec")
    protected List<TrnActTierInfoRecCType> trnActTierInfoRec;

    /**
     * Gets the value of the trnActTierInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnActTierInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnActTierInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrnActTierInfoRecCType }
     * 
     * 
     */
    public List<TrnActTierInfoRecCType> getTrnActTierInfoRec() {
        if (trnActTierInfoRec == null) {
            trnActTierInfoRec = new ArrayList<TrnActTierInfoRecCType>();
        }
        return this.trnActTierInfoRec;
    }

}
