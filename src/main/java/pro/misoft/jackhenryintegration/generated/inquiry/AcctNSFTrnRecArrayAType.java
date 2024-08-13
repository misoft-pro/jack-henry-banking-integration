
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of account NSF items
 * 
 * <p>Java class for AcctNSFTrnRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctNSFTrnRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctNSFTrnRecInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctNSFTrnRecInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctNSFTrnRecArray_AType", propOrder = {
    "acctNSFTrnRecInfo"
})
public class AcctNSFTrnRecArrayAType {

    @XmlElement(name = "AcctNSFTrnRecInfo")
    protected List<AcctNSFTrnRecInfoCType> acctNSFTrnRecInfo;

    /**
     * Gets the value of the acctNSFTrnRecInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctNSFTrnRecInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctNSFTrnRecInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctNSFTrnRecInfoCType }
     * 
     * 
     */
    public List<AcctNSFTrnRecInfoCType> getAcctNSFTrnRecInfo() {
        if (acctNSFTrnRecInfo == null) {
            acctNSFTrnRecInfo = new ArrayList<AcctNSFTrnRecInfoCType>();
        }
        return this.acctNSFTrnRecInfo;
    }

}
