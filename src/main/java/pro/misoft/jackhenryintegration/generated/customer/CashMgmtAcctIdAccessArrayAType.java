
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of account identifications with access
 *                 permission for a cash managmenet user
 * 
 * <p>Java class for CashMgmtAcctIdAccessArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashMgmtAcctIdAccessArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashMgmtAcctIdInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CashMgmtAcctIdInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMgmtAcctIdAccessArray_AType", propOrder = {
    "cashMgmtAcctIdInfo"
})
public class CashMgmtAcctIdAccessArrayAType {

    @XmlElement(name = "CashMgmtAcctIdInfo", nillable = true)
    protected List<CashMgmtAcctIdInfoCType> cashMgmtAcctIdInfo;

    /**
     * Gets the value of the cashMgmtAcctIdInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashMgmtAcctIdInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashMgmtAcctIdInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMgmtAcctIdInfoCType }
     * 
     * 
     */
    public List<CashMgmtAcctIdInfoCType> getCashMgmtAcctIdInfo() {
        if (cashMgmtAcctIdInfo == null) {
            cashMgmtAcctIdInfo = new ArrayList<CashMgmtAcctIdInfoCType>();
        }
        return this.cashMgmtAcctIdInfo;
    }

}
