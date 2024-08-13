
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of payee addresses 
 * 
 * <p>Java class for PayeeAddrInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeAddrInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeAddrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeAddrInfoArray_AType", propOrder = {
    "payeeAddrInfo"
})
public class PayeeAddrInfoArrayAType {

    @XmlElement(name = "PayeeAddrInfo")
    protected List<PayeeAddrInfoCType> payeeAddrInfo;

    /**
     * Gets the value of the payeeAddrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payeeAddrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayeeAddrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayeeAddrInfoCType }
     * 
     * 
     */
    public List<PayeeAddrInfoCType> getPayeeAddrInfo() {
        if (payeeAddrInfo == null) {
            payeeAddrInfo = new ArrayList<PayeeAddrInfoCType>();
        }
        return this.payeeAddrInfo;
    }

}
