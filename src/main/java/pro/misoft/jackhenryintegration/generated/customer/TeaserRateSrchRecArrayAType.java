
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses related to a promotion/teaser rate search
 *    
 * 
 * <p>Java class for TeaserRateSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeaserRateSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TeaserRateSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}TeaserRateSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeaserRateSrchRecArray_AType", propOrder = {
    "teaserRateSrchRec"
})
public class TeaserRateSrchRecArrayAType {

    @XmlElement(name = "TeaserRateSrchRec")
    protected List<TeaserRateSrchRecCType> teaserRateSrchRec;

    /**
     * Gets the value of the teaserRateSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teaserRateSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeaserRateSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeaserRateSrchRecCType }
     * 
     * 
     */
    public List<TeaserRateSrchRecCType> getTeaserRateSrchRec() {
        if (teaserRateSrchRec == null) {
            teaserRateSrchRec = new ArrayList<TeaserRateSrchRecCType>();
        }
        return this.teaserRateSrchRec;
    }

}
