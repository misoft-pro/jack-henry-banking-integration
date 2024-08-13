
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of log summaries returned in the inquiry
 *     request
 * 
 * <p>Java class for SvcGtwyLogSumInqRsArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcGtwyLogSumInqRsArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcGtwyLogSumInqRsRec" type="{http://jackhenry.com/jxchange/TPG/2008}SvcGtwyLogSumInqRsRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcGtwyLogSumInqRsArray_AType", propOrder = {
    "svcGtwyLogSumInqRsRec"
})
public class SvcGtwyLogSumInqRsArrayAType {

    @XmlElement(name = "SvcGtwyLogSumInqRsRec")
    protected List<SvcGtwyLogSumInqRsRecCType> svcGtwyLogSumInqRsRec;

    /**
     * Gets the value of the svcGtwyLogSumInqRsRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcGtwyLogSumInqRsRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcGtwyLogSumInqRsRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcGtwyLogSumInqRsRecCType }
     * 
     * 
     */
    public List<SvcGtwyLogSumInqRsRecCType> getSvcGtwyLogSumInqRsRec() {
        if (svcGtwyLogSumInqRsRec == null) {
            svcGtwyLogSumInqRsRec = new ArrayList<SvcGtwyLogSumInqRsRecCType>();
        }
        return this.svcGtwyLogSumInqRsRec;
    }

}
