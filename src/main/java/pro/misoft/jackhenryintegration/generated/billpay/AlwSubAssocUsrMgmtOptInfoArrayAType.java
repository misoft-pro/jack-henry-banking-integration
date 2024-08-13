
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of options for managing associated subscriber
 *                 users
 * 
 * <p>Java class for AlwSubAssocUsrMgmtOptInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlwSubAssocUsrMgmtOptInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlwSubAssocUsrMgmtOptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AlwSubAssocUsrMgmtOptInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlwSubAssocUsrMgmtOptInfoArray_AType", propOrder = {
    "alwSubAssocUsrMgmtOptInfo"
})
public class AlwSubAssocUsrMgmtOptInfoArrayAType {

    @XmlElement(name = "AlwSubAssocUsrMgmtOptInfo")
    protected List<AlwSubAssocUsrMgmtOptInfoCType> alwSubAssocUsrMgmtOptInfo;

    /**
     * Gets the value of the alwSubAssocUsrMgmtOptInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alwSubAssocUsrMgmtOptInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlwSubAssocUsrMgmtOptInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlwSubAssocUsrMgmtOptInfoCType }
     * 
     * 
     */
    public List<AlwSubAssocUsrMgmtOptInfoCType> getAlwSubAssocUsrMgmtOptInfo() {
        if (alwSubAssocUsrMgmtOptInfo == null) {
            alwSubAssocUsrMgmtOptInfo = new ArrayList<AlwSubAssocUsrMgmtOptInfoCType>();
        }
        return this.alwSubAssocUsrMgmtOptInfo;
    }

}
