
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of affiliated entities for a
 *                 corporation
 * 
 * <p>Java class for AflEntityNameArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AflEntityNameArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AflEntityNameInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}AflEntityNameInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AflEntityNameArray_AType", propOrder = {
    "aflEntityNameInfoRec"
})
public class AflEntityNameArrayAType {

    @XmlElement(name = "AflEntityNameInfoRec")
    protected List<AflEntityNameInfoRecCType> aflEntityNameInfoRec;

    /**
     * Gets the value of the aflEntityNameInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aflEntityNameInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAflEntityNameInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AflEntityNameInfoRecCType }
     * 
     * 
     */
    public List<AflEntityNameInfoRecCType> getAflEntityNameInfoRec() {
        if (aflEntityNameInfoRec == null) {
            aflEntityNameInfoRec = new ArrayList<AflEntityNameInfoRecCType>();
        }
        return this.aflEntityNameInfoRec;
    }

}
