
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of job experience for a job
 *                 applicant
 * 
 * <p>Java class for JobExpcArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobExpcArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobExpcInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}JobExpcInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobExpcArray_AType", propOrder = {
    "jobExpcInfoRec"
})
public class JobExpcArrayAType {

    @XmlElement(name = "JobExpcInfoRec", nillable = true)
    protected List<JobExpcInfoRecCType> jobExpcInfoRec;

    /**
     * Gets the value of the jobExpcInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobExpcInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobExpcInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobExpcInfoRecCType }
     * 
     * 
     */
    public List<JobExpcInfoRecCType> getJobExpcInfoRec() {
        if (jobExpcInfoRec == null) {
            jobExpcInfoRec = new ArrayList<JobExpcInfoRecCType>();
        }
        return this.jobExpcInfoRec;
    }

}
