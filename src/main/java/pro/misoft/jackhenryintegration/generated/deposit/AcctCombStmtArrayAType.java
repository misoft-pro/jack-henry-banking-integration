
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of accounts/shares/loans combined with a lead
 *                 account
 * 
 * <p>Java class for AcctCombStmtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctCombStmtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctCombStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctCombStmtInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctCombStmtArray_AType", propOrder = {
    "acctCombStmtInfo"
})
public class AcctCombStmtArrayAType {

    @XmlElement(name = "AcctCombStmtInfo")
    protected List<AcctCombStmtInfoCType> acctCombStmtInfo;

    /**
     * Gets the value of the acctCombStmtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctCombStmtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctCombStmtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctCombStmtInfoCType }
     * 
     * 
     */
    public List<AcctCombStmtInfoCType> getAcctCombStmtInfo() {
        if (acctCombStmtInfo == null) {
            acctCombStmtInfo = new ArrayList<AcctCombStmtInfoCType>();
        }
        return this.acctCombStmtInfo;
    }

}
