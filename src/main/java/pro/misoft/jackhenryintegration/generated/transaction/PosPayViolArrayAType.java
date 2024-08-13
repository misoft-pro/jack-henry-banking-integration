
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of positive pay violatons
 * 
 * <p>Java class for PosPayViolArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosPayViolArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PosPayViolDetail" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayViolDetail_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosPayViolArray_AType", propOrder = {
    "posPayViolDetail"
})
public class PosPayViolArrayAType {

    @XmlElement(name = "PosPayViolDetail", nillable = true)
    protected List<PosPayViolDetailCType> posPayViolDetail;

    /**
     * Gets the value of the posPayViolDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posPayViolDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosPayViolDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosPayViolDetailCType }
     * 
     * 
     */
    public List<PosPayViolDetailCType> getPosPayViolDetail() {
        if (posPayViolDetail == null) {
            posPayViolDetail = new ArrayList<PosPayViolDetailCType>();
        }
        return this.posPayViolDetail;
    }

}
