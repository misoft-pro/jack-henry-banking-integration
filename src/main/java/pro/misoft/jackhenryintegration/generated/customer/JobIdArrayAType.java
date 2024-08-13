
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of job identifications
 * 
 * <p>Java class for JobIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobIdInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}JobIdInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobIdArray_AType", propOrder = {
    "jobIdInfoRec"
})
public class JobIdArrayAType {

    @XmlElement(name = "JobIdInfoRec", nillable = true)
    protected List<JobIdInfoRecCType> jobIdInfoRec;

    /**
     * Gets the value of the jobIdInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobIdInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobIdInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobIdInfoRecCType }
     * 
     * 
     */
    public List<JobIdInfoRecCType> getJobIdInfoRec() {
        if (jobIdInfoRec == null) {
            jobIdInfoRec = new ArrayList<JobIdInfoRecCType>();
        }
        return this.jobIdInfoRec;
    }

}
