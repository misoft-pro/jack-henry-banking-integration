
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of branches that are locked from working NSF
 *     items
 * 
 * <p>Java class for NSFProcStateSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSFProcStateSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NSFProcStateSrchInfo" type="{http://jackhenry.com/jxchange/TPG/2008}NSFProcStateSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NSFProcStateSrchArray_AType", propOrder = {
    "nsfProcStateSrchInfo"
})
public class NSFProcStateSrchArrayAType {

    @XmlElement(name = "NSFProcStateSrchInfo")
    protected List<NSFProcStateSrchRecCType> nsfProcStateSrchInfo;

    /**
     * Gets the value of the nsfProcStateSrchInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsfProcStateSrchInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNSFProcStateSrchInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NSFProcStateSrchRecCType }
     * 
     * 
     */
    public List<NSFProcStateSrchRecCType> getNSFProcStateSrchInfo() {
        if (nsfProcStateSrchInfo == null) {
            nsfProcStateSrchInfo = new ArrayList<NSFProcStateSrchRecCType>();
        }
        return this.nsfProcStateSrchInfo;
    }

}
