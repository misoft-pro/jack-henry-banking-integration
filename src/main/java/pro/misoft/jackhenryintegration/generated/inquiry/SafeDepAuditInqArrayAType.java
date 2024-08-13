
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of safe deposit inquiry audit
 *     records
 * 
 * <p>Java class for SafeDepAuditInqArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeDepAuditInqArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SafeDepAuditInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}SafeDepAuditInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeDepAuditInqArray_AType", propOrder = {
    "safeDepAuditInqRec"
})
public class SafeDepAuditInqArrayAType {

    @XmlElement(name = "SafeDepAuditInqRec", nillable = true)
    protected List<SafeDepAuditInqRecCType> safeDepAuditInqRec;

    /**
     * Gets the value of the safeDepAuditInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safeDepAuditInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafeDepAuditInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafeDepAuditInqRecCType }
     * 
     * 
     */
    public List<SafeDepAuditInqRecCType> getSafeDepAuditInqRec() {
        if (safeDepAuditInqRec == null) {
            safeDepAuditInqRec = new ArrayList<SafeDepAuditInqRecCType>();
        }
        return this.safeDepAuditInqRec;
    }

}
