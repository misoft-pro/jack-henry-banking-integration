
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses of Electronic Document
 *     Inquiry.
 * 
 * <p>Java class for ElecDocInqRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecDocInqRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecDocInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDocInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElecDocInqRecArray_AType", propOrder = {
    "elecDocInqRec"
})
public class ElecDocInqRecArrayAType {

    @XmlElement(name = "ElecDocInqRec")
    protected List<ElecDocInqRecCType> elecDocInqRec;

    /**
     * Gets the value of the elecDocInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elecDocInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElecDocInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElecDocInqRecCType }
     * 
     * 
     */
    public List<ElecDocInqRecCType> getElecDocInqRec() {
        if (elecDocInqRec == null) {
            elecDocInqRec = new ArrayList<ElecDocInqRecCType>();
        }
        return this.elecDocInqRec;
    }

}
