
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for tax plan beneficiary
 *     search.
 * 
 * <p>Java class for BenfSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenfSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BenfSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}BenfSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenfSrchRecArray_AType", propOrder = {
    "benfSrchRec"
})
public class BenfSrchRecArrayAType {

    @XmlElement(name = "BenfSrchRec")
    protected List<BenfSrchRecCType> benfSrchRec;

    /**
     * Gets the value of the benfSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benfSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenfSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenfSrchRecCType }
     * 
     * 
     */
    public List<BenfSrchRecCType> getBenfSrchRec() {
        if (benfSrchRec == null) {
            benfSrchRec = new ArrayList<BenfSrchRecCType>();
        }
        return this.benfSrchRec;
    }

}
