
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Alternate Driver License Numbers, responses
 *     may be masked with 'X' after first character (D80XXXXXX) 
 * 
 * <p>Java class for AltDriverLicArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltDriverLicArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AltDriverLicInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AltDriverLicInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltDriverLicArray_AType", propOrder = {
    "altDriverLicInfo"
})
public class AltDriverLicArrayAType {

    @XmlElement(name = "AltDriverLicInfo")
    protected List<AltDriverLicInfoCType> altDriverLicInfo;

    /**
     * Gets the value of the altDriverLicInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altDriverLicInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltDriverLicInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltDriverLicInfoCType }
     * 
     * 
     */
    public List<AltDriverLicInfoCType> getAltDriverLicInfo() {
        if (altDriverLicInfo == null) {
            altDriverLicInfo = new ArrayList<AltDriverLicInfoCType>();
        }
        return this.altDriverLicInfo;
    }

}
