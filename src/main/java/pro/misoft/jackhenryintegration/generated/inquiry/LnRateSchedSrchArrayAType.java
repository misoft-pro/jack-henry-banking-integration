
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for loan rate schedule
 *    
 * 
 * <p>Java class for LnRateSchedSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnRateSchedSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnRateSchedSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnRateSchedSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnRateSchedSrchArray_AType", propOrder = {
    "lnRateSchedSrchRec"
})
public class LnRateSchedSrchArrayAType {

    @XmlElement(name = "LnRateSchedSrchRec")
    protected List<LnRateSchedSrchRecCType> lnRateSchedSrchRec;

    /**
     * Gets the value of the lnRateSchedSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnRateSchedSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnRateSchedSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnRateSchedSrchRecCType }
     * 
     * 
     */
    public List<LnRateSchedSrchRecCType> getLnRateSchedSrchRec() {
        if (lnRateSchedSrchRec == null) {
            lnRateSchedSrchRec = new ArrayList<LnRateSchedSrchRecCType>();
        }
        return this.lnRateSchedSrchRec;
    }

}
