
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses of collateral items a specific
 *     customer.
 * 
 * <p>Java class for CustCollatSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustCollatSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustCollatSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustCollatSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustCollatSrchRecArray_AType", propOrder = {
    "custCollatSrchRec"
})
public class CustCollatSrchRecArrayAType {

    @XmlElement(name = "CustCollatSrchRec")
    protected List<CustCollatSrchRecCType> custCollatSrchRec;

    /**
     * Gets the value of the custCollatSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custCollatSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustCollatSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustCollatSrchRecCType }
     * 
     * 
     */
    public List<CustCollatSrchRecCType> getCustCollatSrchRec() {
        if (custCollatSrchRec == null) {
            custCollatSrchRec = new ArrayList<CustCollatSrchRecCType>();
        }
        return this.custCollatSrchRec;
    }

}
