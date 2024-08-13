
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of customer identifiers.
 * 
 * <p>Java class for CustIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustIdInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustIdInfoRec_CType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustIdArray_AType", propOrder = {
    "custIdInfoRec"
})
public class CustIdArrayAType {

    @XmlElement(name = "CustIdInfoRec", required = true)
    protected List<CustIdInfoRecCType> custIdInfoRec;

    /**
     * Gets the value of the custIdInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custIdInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustIdInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustIdInfoRecCType }
     * 
     * 
     */
    public List<CustIdInfoRecCType> getCustIdInfoRec() {
        if (custIdInfoRec == null) {
            custIdInfoRec = new ArrayList<CustIdInfoRecCType>();
        }
        return this.custIdInfoRec;
    }

}
