
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Resolving Parties on a commercial account.
 *             
 * 
 * <p>Java class for ResolvingPartyArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolvingPartyArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResolvingPartyInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ResolvingPartyInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolvingPartyArray_AType", propOrder = {
    "resolvingPartyInfo"
})
public class ResolvingPartyArrayAType {

    @XmlElement(name = "ResolvingPartyInfo")
    protected List<ResolvingPartyInfoCType> resolvingPartyInfo;

    /**
     * Gets the value of the resolvingPartyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolvingPartyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolvingPartyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResolvingPartyInfoCType }
     * 
     * 
     */
    public List<ResolvingPartyInfoCType> getResolvingPartyInfo() {
        if (resolvingPartyInfo == null) {
            resolvingPartyInfo = new ArrayList<ResolvingPartyInfoCType>();
        }
        return this.resolvingPartyInfo;
    }

}
