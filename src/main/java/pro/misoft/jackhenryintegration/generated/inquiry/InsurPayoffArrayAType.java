
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of elements for insurance net amount provided in the
 *     payoff
 * 
 * <p>Java class for InsurPayoffArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsurPayoffArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsurPayoffInfo" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPayoffInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsurPayoffArray_AType", propOrder = {
    "insurPayoffInfo"
})
public class InsurPayoffArrayAType {

    @XmlElement(name = "InsurPayoffInfo")
    protected List<InsurPayoffInfoCType> insurPayoffInfo;

    /**
     * Gets the value of the insurPayoffInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurPayoffInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurPayoffInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurPayoffInfoCType }
     * 
     * 
     */
    public List<InsurPayoffInfoCType> getInsurPayoffInfo() {
        if (insurPayoffInfo == null) {
            insurPayoffInfo = new ArrayList<InsurPayoffInfoCType>();
        }
        return this.insurPayoffInfo;
    }

}
