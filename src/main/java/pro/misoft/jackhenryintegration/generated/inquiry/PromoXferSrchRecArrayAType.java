
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for Promotional Transfer
 *     search.
 * 
 * <p>Java class for PromoXferSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromoXferSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromoXferSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}PromoXferSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromoXferSrchRecArray_AType", propOrder = {
    "promoXferSrchRec"
})
public class PromoXferSrchRecArrayAType {

    @XmlElement(name = "PromoXferSrchRec")
    protected List<PromoXferSrchRecCType> promoXferSrchRec;

    /**
     * Gets the value of the promoXferSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promoXferSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromoXferSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromoXferSrchRecCType }
     * 
     * 
     */
    public List<PromoXferSrchRecCType> getPromoXferSrchRec() {
        if (promoXferSrchRec == null) {
            promoXferSrchRec = new ArrayList<PromoXferSrchRecCType>();
        }
        return this.promoXferSrchRec;
    }

}
