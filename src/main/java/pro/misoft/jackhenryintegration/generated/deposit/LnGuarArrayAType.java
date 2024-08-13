
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of guarantors for a loan
 * 
 * <p>Java class for LnGuarArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnGuarArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnGuarInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnGuarInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnGuarArray_AType", propOrder = {
    "lnGuarInfoRec"
})
public class LnGuarArrayAType {

    @XmlElement(name = "LnGuarInfoRec")
    protected List<LnGuarInfoRecCType> lnGuarInfoRec;

    /**
     * Gets the value of the lnGuarInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnGuarInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnGuarInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnGuarInfoRecCType }
     * 
     * 
     */
    public List<LnGuarInfoRecCType> getLnGuarInfoRec() {
        if (lnGuarInfoRec == null) {
            lnGuarInfoRec = new ArrayList<LnGuarInfoRecCType>();
        }
        return this.lnGuarInfoRec;
    }

}
