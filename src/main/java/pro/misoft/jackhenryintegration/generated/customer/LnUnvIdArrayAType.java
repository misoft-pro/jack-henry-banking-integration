
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of delivered Loan Universal
 *                 Identifiers
 * 
 * <p>Java class for LnUnvIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnvIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnUnvIdRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnvIdRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnUnvIdArray_AType", propOrder = {
    "lnUnvIdRec"
})
public class LnUnvIdArrayAType {

    @XmlElement(name = "LnUnvIdRec")
    protected List<LnUnvIdRecCType> lnUnvIdRec;

    /**
     * Gets the value of the lnUnvIdRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnUnvIdRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnUnvIdRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnUnvIdRecCType }
     * 
     * 
     */
    public List<LnUnvIdRecCType> getLnUnvIdRec() {
        if (lnUnvIdRec == null) {
            lnUnvIdRec = new ArrayList<LnUnvIdRecCType>();
        }
        return this.lnUnvIdRec;
    }

}
