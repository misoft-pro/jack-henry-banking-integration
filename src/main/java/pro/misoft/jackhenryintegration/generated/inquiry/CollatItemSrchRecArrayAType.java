
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for collateral items
 *     search.
 * 
 * <p>Java class for CollatItemSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatItemSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatItemSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollatItemSrchRecArray_AType", propOrder = {
    "collatItemSrchRec"
})
public class CollatItemSrchRecArrayAType {

    @XmlElement(name = "CollatItemSrchRec")
    protected List<CollatItemSrchRecCType> collatItemSrchRec;

    /**
     * Gets the value of the collatItemSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collatItemSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollatItemSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollatItemSrchRecCType }
     * 
     * 
     */
    public List<CollatItemSrchRecCType> getCollatItemSrchRec() {
        if (collatItemSrchRec == null) {
            collatItemSrchRec = new ArrayList<CollatItemSrchRecCType>();
        }
        return this.collatItemSrchRec;
    }

}
