
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for Multi Level Lending (MLL)
 *     search for the commitment records.
 * 
 * <p>Java class for CommitSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CommitSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitSrchRecArray_AType", propOrder = {
    "commitSrchRec"
})
public class CommitSrchRecArrayAType {

    @XmlElement(name = "CommitSrchRec")
    protected List<CommitSrchRecCType> commitSrchRec;

    /**
     * Gets the value of the commitSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitSrchRecCType }
     * 
     * 
     */
    public List<CommitSrchRecCType> getCommitSrchRec() {
        if (commitSrchRec == null) {
            commitSrchRec = new ArrayList<CommitSrchRecCType>();
        }
        return this.commitSrchRec;
    }

}
