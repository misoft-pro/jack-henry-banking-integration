
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for Customer Relationship
 *     Management customer search
 * 
 * <p>Java class for CRMCustSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMCustSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMCustSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMCustSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMCustSrchArray_AType", propOrder = {
    "crmCustSrchRec"
})
public class CRMCustSrchArrayAType {

    @XmlElement(name = "CRMCustSrchRec")
    protected List<CRMCustSrchRecCType> crmCustSrchRec;

    /**
     * Gets the value of the crmCustSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmCustSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMCustSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMCustSrchRecCType }
     * 
     * 
     */
    public List<CRMCustSrchRecCType> getCRMCustSrchRec() {
        if (crmCustSrchRec == null) {
            crmCustSrchRec = new ArrayList<CRMCustSrchRecCType>();
        }
        return this.crmCustSrchRec;
    }

}
