
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of accounts that are being protected by
 *                 another account 
 * 
 * <p>Java class for ProtAcctArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtAcctArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProtAcctRec" type="{http://jackhenry.com/jxchange/TPG/2008}ProtAcctRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtAcctArray_AType", propOrder = {
    "protAcctRec"
})
public class ProtAcctArrayAType {

    @XmlElement(name = "ProtAcctRec")
    protected List<ProtAcctRecCType> protAcctRec;

    /**
     * Gets the value of the protAcctRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protAcctRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtAcctRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtAcctRecCType }
     * 
     * 
     */
    public List<ProtAcctRecCType> getProtAcctRec() {
        if (protAcctRec == null) {
            protAcctRec = new ArrayList<ProtAcctRecCType>();
        }
        return this.protAcctRec;
    }

}
