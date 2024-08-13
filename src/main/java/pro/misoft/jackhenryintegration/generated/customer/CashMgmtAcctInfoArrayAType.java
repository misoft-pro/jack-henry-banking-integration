
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of accounts that would be considered as part
 *                 of the cash management internet banking application
 * 
 * <p>Java class for CashMgmtAcctInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashMgmtAcctInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashMgmtAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CashMgmtAcctInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMgmtAcctInfoArray_AType", propOrder = {
    "cashMgmtAcctInfo"
})
public class CashMgmtAcctInfoArrayAType {

    @XmlElement(name = "CashMgmtAcctInfo", nillable = true)
    protected List<CashMgmtAcctInfoCType> cashMgmtAcctInfo;

    /**
     * Gets the value of the cashMgmtAcctInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashMgmtAcctInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashMgmtAcctInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMgmtAcctInfoCType }
     * 
     * 
     */
    public List<CashMgmtAcctInfoCType> getCashMgmtAcctInfo() {
        if (cashMgmtAcctInfo == null) {
            cashMgmtAcctInfo = new ArrayList<CashMgmtAcctInfoCType>();
        }
        return this.cashMgmtAcctInfo;
    }

}
