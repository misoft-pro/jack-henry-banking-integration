
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of address as related to a CRM
 *                 entity
 * 
 * <p>Java class for x_CRMAddrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_CRMAddrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMAddrRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMAddrRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_CRMAddrArray_AType", propOrder = {
    "crmAddrRec"
})
public class XCRMAddrArrayAType {

    @XmlElement(name = "CRMAddrRec")
    protected List<CRMAddrRecCType> crmAddrRec;

    /**
     * Gets the value of the crmAddrRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmAddrRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMAddrRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMAddrRecCType }
     * 
     * 
     */
    public List<CRMAddrRecCType> getCRMAddrRec() {
        if (crmAddrRec == null) {
            crmAddrRec = new ArrayList<CRMAddrRecCType>();
        }
        return this.crmAddrRec;
    }

}
