
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of offset accounts for ACH
 * 
 * <p>Java class for AcctOffsetArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctOffsetArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctOffsetInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctOffsetInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctOffsetArray_AType", propOrder = {
    "acctOffsetInfo"
})
public class AcctOffsetArrayAType {

    @XmlElement(name = "AcctOffsetInfo", nillable = true)
    protected List<AcctOffsetInfoCType> acctOffsetInfo;

    /**
     * Gets the value of the acctOffsetInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctOffsetInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOffsetInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctOffsetInfoCType }
     * 
     * 
     */
    public List<AcctOffsetInfoCType> getAcctOffsetInfo() {
        if (acctOffsetInfo == null) {
            acctOffsetInfo = new ArrayList<AcctOffsetInfoCType>();
        }
        return this.acctOffsetInfo;
    }

}
