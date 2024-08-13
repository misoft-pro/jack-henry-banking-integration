
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for Multi Level Lending (MLL)
 *     search for the tranche records.
 * 
 * <p>Java class for TrancheSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrancheSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrancheSrchRecArray_AType", propOrder = {
    "trancheSrchRec"
})
public class TrancheSrchRecArrayAType {

    @XmlElement(name = "TrancheSrchRec")
    protected List<TrancheSrchRecCType> trancheSrchRec;

    /**
     * Gets the value of the trancheSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trancheSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrancheSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrancheSrchRecCType }
     * 
     * 
     */
    public List<TrancheSrchRecCType> getTrancheSrchRec() {
        if (trancheSrchRec == null) {
            trancheSrchRec = new ArrayList<TrancheSrchRecCType>();
        }
        return this.trancheSrchRec;
    }

}
