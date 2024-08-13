
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of loans related to a customer used to
 *     calculate the regulatory loan to value ratio
 * 
 * <p>Java class for LnRegLTVInqRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRegLTVInqRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnRegLTVInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnRegLTVInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnRegLTVInqRecArray_AType", propOrder = {
    "lnRegLTVInqRec"
})
public class LnRegLTVInqRecArrayAType {

    @XmlElement(name = "LnRegLTVInqRec")
    protected List<LnRegLTVInqRecCType> lnRegLTVInqRec;

    /**
     * Gets the value of the lnRegLTVInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnRegLTVInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnRegLTVInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnRegLTVInqRecCType }
     * 
     * 
     */
    public List<LnRegLTVInqRecCType> getLnRegLTVInqRec() {
        if (lnRegLTVInqRec == null) {
            lnRegLTVInqRec = new ArrayList<LnRegLTVInqRecCType>();
        }
        return this.lnRegLTVInqRec;
    }

}
