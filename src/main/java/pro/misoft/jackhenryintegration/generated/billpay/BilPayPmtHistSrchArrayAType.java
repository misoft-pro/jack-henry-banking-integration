
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for a payment history search 
 * 
 * <p>Java class for BilPayPmtHistSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayPmtHistSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilPayPmtHistSrchInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayPmtHistSrchInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilPayPmtHistSrchArray_AType", propOrder = {
    "bilPayPmtHistSrchInfo"
})
public class BilPayPmtHistSrchArrayAType {

    @XmlElement(name = "BilPayPmtHistSrchInfo")
    protected List<BilPayPmtHistSrchInfoCType> bilPayPmtHistSrchInfo;

    /**
     * Gets the value of the bilPayPmtHistSrchInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilPayPmtHistSrchInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilPayPmtHistSrchInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilPayPmtHistSrchInfoCType }
     * 
     * 
     */
    public List<BilPayPmtHistSrchInfoCType> getBilPayPmtHistSrchInfo() {
        if (bilPayPmtHistSrchInfo == null) {
            bilPayPmtHistSrchInfo = new ArrayList<BilPayPmtHistSrchInfoCType>();
        }
        return this.bilPayPmtHistSrchInfo;
    }

}
