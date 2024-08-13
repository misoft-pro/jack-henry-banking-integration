
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of CRM Related Activities
 * 
 * <p>Java class for x_CRMRelActArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_CRMRelActArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMRelActInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CRMRelActInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_CRMRelActArray_AType", propOrder = {
    "crmRelActInfo"
})
public class XCRMRelActArrayAType {

    @XmlElement(name = "CRMRelActInfo")
    protected List<CRMRelActInfoRecCType> crmRelActInfo;

    /**
     * Gets the value of the crmRelActInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmRelActInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMRelActInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMRelActInfoRecCType }
     * 
     * 
     */
    public List<CRMRelActInfoRecCType> getCRMRelActInfo() {
        if (crmRelActInfo == null) {
            crmRelActInfo = new ArrayList<CRMRelActInfoRecCType>();
        }
        return this.crmRelActInfo;
    }

}
