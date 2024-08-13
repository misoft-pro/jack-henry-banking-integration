
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - Account titles - Customer Name and Additional
 *                 Names
 * 
 * <p>Java class for AcctTitle_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTitle_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctTitleInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctTitleInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTitle_AType", propOrder = {
    "acctTitleInfo"
})
public class AcctTitleAType {

    @XmlElement(name = "AcctTitleInfo", nillable = true)
    protected List<AcctTitleInfoCType> acctTitleInfo;

    /**
     * Gets the value of the acctTitleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctTitleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTitleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctTitleInfoCType }
     * 
     * 
     */
    public List<AcctTitleInfoCType> getAcctTitleInfo() {
        if (acctTitleInfo == null) {
            acctTitleInfo = new ArrayList<AcctTitleInfoCType>();
        }
        return this.acctTitleInfo;
    }

}
