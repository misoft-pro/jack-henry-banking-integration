
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of processing days and types related to an
 *     Financial Institution
 * 
 * <p>Java class for FinInstInfoProcRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinInstInfoProcRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstInfoProcRec" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstInfoProcRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinInstInfoProcRecArray_AType", propOrder = {
    "finInstInfoProcRec"
})
public class FinInstInfoProcRecArrayAType {

    @XmlElement(name = "FinInstInfoProcRec")
    protected List<FinInstInfoProcRecCType> finInstInfoProcRec;

    /**
     * Gets the value of the finInstInfoProcRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstInfoProcRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstInfoProcRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinInstInfoProcRecCType }
     * 
     * 
     */
    public List<FinInstInfoProcRecCType> getFinInstInfoProcRec() {
        if (finInstInfoProcRec == null) {
            finInstInfoProcRec = new ArrayList<FinInstInfoProcRecCType>();
        }
        return this.finInstInfoProcRec;
    }

}
