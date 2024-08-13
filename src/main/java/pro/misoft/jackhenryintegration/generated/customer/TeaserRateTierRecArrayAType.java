
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for the tier values related to a promotion/teaser
 *     rate
 * 
 * <p>Java class for TeaserRateTierRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeaserRateTierRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TeaserRateTierRec" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateTierRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeaserRateTierRecArray_AType", propOrder = {
    "teaserRateTierRec"
})
public class TeaserRateTierRecArrayAType {

    @XmlElement(name = "TeaserRateTierRec")
    protected List<TeaserRateTierRecCType> teaserRateTierRec;

    /**
     * Gets the value of the teaserRateTierRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teaserRateTierRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeaserRateTierRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeaserRateTierRecCType }
     * 
     * 
     */
    public List<TeaserRateTierRecCType> getTeaserRateTierRec() {
        if (teaserRateTierRec == null) {
            teaserRateTierRec = new ArrayList<TeaserRateTierRecCType>();
        }
        return this.teaserRateTierRec;
    }

}
