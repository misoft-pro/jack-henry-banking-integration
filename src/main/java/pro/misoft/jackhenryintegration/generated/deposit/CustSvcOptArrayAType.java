
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Service Options available for the
 *                 Customer.
 * 
 * <p>Java class for CustSvcOptArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSvcOptArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustSvcOptInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustSvcOptInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustSvcOptArray_AType", propOrder = {
    "custSvcOptInfoRec"
})
public class CustSvcOptArrayAType {

    @XmlElement(name = "CustSvcOptInfoRec")
    protected List<CustSvcOptInfoCType> custSvcOptInfoRec;

    /**
     * Gets the value of the custSvcOptInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custSvcOptInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustSvcOptInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustSvcOptInfoCType }
     * 
     * 
     */
    public List<CustSvcOptInfoCType> getCustSvcOptInfoRec() {
        if (custSvcOptInfoRec == null) {
            custSvcOptInfoRec = new ArrayList<CustSvcOptInfoCType>();
        }
        return this.custSvcOptInfoRec;
    }

}
