
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for FASB 91
 *     search.
 * 
 * <p>Java class for FASB91SrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FASB91SrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FASB91SrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91SrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FASB91SrchRecArray_AType", propOrder = {
    "fasb91SrchRec"
})
public class FASB91SrchRecArrayAType {

    @XmlElement(name = "FASB91SrchRec")
    protected List<FASB91SrchRecCType> fasb91SrchRec;

    /**
     * Gets the value of the fasb91SrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fasb91SrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFASB91SrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FASB91SrchRecCType }
     * 
     * 
     */
    public List<FASB91SrchRecCType> getFASB91SrchRec() {
        if (fasb91SrchRec == null) {
            fasb91SrchRec = new ArrayList<FASB91SrchRecCType>();
        }
        return this.fasb91SrchRec;
    }

}
