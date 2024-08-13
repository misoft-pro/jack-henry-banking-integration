
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of customers related to a collateral
 *     item
 * 
 * <p>Java class for CustIdCollatRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustIdCollatRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustIdCollatItemRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustIdCollatItemRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustIdCollatRecArray_AType", propOrder = {
    "custIdCollatItemRec"
})
public class CustIdCollatRecArrayAType {

    @XmlElement(name = "CustIdCollatItemRec")
    protected List<CustIdCollatItemRecCType> custIdCollatItemRec;

    /**
     * Gets the value of the custIdCollatItemRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custIdCollatItemRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustIdCollatItemRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustIdCollatItemRecCType }
     * 
     * 
     */
    public List<CustIdCollatItemRecCType> getCustIdCollatItemRec() {
        if (custIdCollatItemRec == null) {
            custIdCollatItemRec = new ArrayList<CustIdCollatItemRecCType>();
        }
        return this.custIdCollatItemRec;
    }

}
