
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of job references for a job
 *                 applicant
 * 
 * <p>Java class for JobRefArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobRefArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobRefInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}JobRefInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobRefArray_AType", propOrder = {
    "jobRefInfoRec"
})
public class JobRefArrayAType {

    @XmlElement(name = "JobRefInfoRec", nillable = true)
    protected List<JobRefInfoRecCType> jobRefInfoRec;

    /**
     * Gets the value of the jobRefInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobRefInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobRefInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobRefInfoRecCType }
     * 
     * 
     */
    public List<JobRefInfoRecCType> getJobRefInfoRec() {
        if (jobRefInfoRec == null) {
            jobRefInfoRec = new ArrayList<JobRefInfoRecCType>();
        }
        return this.jobRefInfoRec;
    }

}
