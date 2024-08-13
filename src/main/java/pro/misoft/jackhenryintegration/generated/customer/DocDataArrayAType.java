
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array containing Name/Value pair data associated
 *     with document; Number of Copies, watermark, duplex, etc
 * 
 * <p>Java class for DocDataArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocDataArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocDataInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}DocDataInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocDataArray_AType", propOrder = {
    "docDataInfoRec"
})
public class DocDataArrayAType {

    @XmlElement(name = "DocDataInfoRec")
    protected List<DocDataInfoRecCType> docDataInfoRec;

    /**
     * Gets the value of the docDataInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docDataInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocDataInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDataInfoRecCType }
     * 
     * 
     */
    public List<DocDataInfoRecCType> getDocDataInfoRec() {
        if (docDataInfoRec == null) {
            docDataInfoRec = new ArrayList<DocDataInfoRecCType>();
        }
        return this.docDataInfoRec;
    }

}
