
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for legal entity
 *     owners
 * 
 * <p>Java class for LegalEntitySrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEntitySrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LegalEntitySrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}LegalEntitySrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEntitySrchRecArray_AType", propOrder = {
    "legalEntitySrchRec"
})
public class LegalEntitySrchRecArrayAType {

    @XmlElement(name = "LegalEntitySrchRec")
    protected List<LegalEntitySrchRecCType> legalEntitySrchRec;

    /**
     * Gets the value of the legalEntitySrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalEntitySrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalEntitySrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEntitySrchRecCType }
     * 
     * 
     */
    public List<LegalEntitySrchRecCType> getLegalEntitySrchRec() {
        if (legalEntitySrchRec == null) {
            legalEntitySrchRec = new ArrayList<LegalEntitySrchRecCType>();
        }
        return this.legalEntitySrchRec;
    }

}
