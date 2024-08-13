
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of cash management users
 * 
 * <p>Java class for CashMgmtUsrInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashMgmtUsrInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashMgmtUsrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CashMgmtUsrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMgmtUsrInfoArray_AType", propOrder = {
    "cashMgmtUsrInfo"
})
public class CashMgmtUsrInfoArrayAType {

    @XmlElement(name = "CashMgmtUsrInfo", nillable = true)
    protected List<CashMgmtUsrInfoCType> cashMgmtUsrInfo;

    /**
     * Gets the value of the cashMgmtUsrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashMgmtUsrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashMgmtUsrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashMgmtUsrInfoCType }
     * 
     * 
     */
    public List<CashMgmtUsrInfoCType> getCashMgmtUsrInfo() {
        if (cashMgmtUsrInfo == null) {
            cashMgmtUsrInfo = new ArrayList<CashMgmtUsrInfoCType>();
        }
        return this.cashMgmtUsrInfo;
    }

}
