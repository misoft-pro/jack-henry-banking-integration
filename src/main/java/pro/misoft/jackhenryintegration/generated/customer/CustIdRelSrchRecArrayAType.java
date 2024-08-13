
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses describing CIF to CIF
 *     Relationships.
 * 
 * <p>Java class for CustIdRelSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustIdRelSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustIdRelSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustIdRelSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustIdRelSrchRecArray_AType", propOrder = {
    "custIdRelSrchRec"
})
public class CustIdRelSrchRecArrayAType {

    @XmlElement(name = "CustIdRelSrchRec")
    protected List<CustIdRelSrchRecCType> custIdRelSrchRec;

    /**
     * Gets the value of the custIdRelSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custIdRelSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustIdRelSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustIdRelSrchRecCType }
     * 
     * 
     */
    public List<CustIdRelSrchRecCType> getCustIdRelSrchRec() {
        if (custIdRelSrchRec == null) {
            custIdRelSrchRec = new ArrayList<CustIdRelSrchRecCType>();
        }
        return this.custIdRelSrchRec;
    }

}
