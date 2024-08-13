
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of Inquiry reminder records
 *    
 * 
 * <p>Java class for CRMRmndMultiInqRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMRmndMultiInqRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMRmndMultiInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMRmndMultiInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMRmndMultiInqRecArray_AType", propOrder = {
    "crmRmndMultiInqRec"
})
public class CRMRmndMultiInqRecArrayAType {

    @XmlElement(name = "CRMRmndMultiInqRec")
    protected List<CRMRmndMultiInqRecCType> crmRmndMultiInqRec;

    /**
     * Gets the value of the crmRmndMultiInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmRmndMultiInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMRmndMultiInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMRmndMultiInqRecCType }
     * 
     * 
     */
    public List<CRMRmndMultiInqRecCType> getCRMRmndMultiInqRec() {
        if (crmRmndMultiInqRec == null) {
            crmRmndMultiInqRec = new ArrayList<CRMRmndMultiInqRecCType>();
        }
        return this.crmRmndMultiInqRec;
    }

}
