
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array allowing for the collection of address terms
 *     in months, years, etc
 * 
 * <p>Java class for AddrTermArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddrTermArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddrTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddrTermArray_AType", propOrder = {
    "addrTerm"
})
public class AddrTermArrayAType {

    @XmlElement(name = "AddrTerm")
    protected List<TermCType> addrTerm;

    /**
     * Gets the value of the addrTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addrTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddrTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermCType }
     * 
     * 
     */
    public List<TermCType> getAddrTerm() {
        if (addrTerm == null) {
            addrTerm = new ArrayList<TermCType>();
        }
        return this.addrTerm;
    }

}
