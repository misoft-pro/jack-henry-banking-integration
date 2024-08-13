
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Alternate Birth dates, responses may be masked
 *     with day to '00' (10/00/2018) 
 * 
 * <p>Java class for AltBirthDtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltBirthDtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AltBirthDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AltBirthDtInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltBirthDtArray_AType", propOrder = {
    "altBirthDtInfo"
})
public class AltBirthDtArrayAType {

    @XmlElement(name = "AltBirthDtInfo")
    protected List<AltBirthDtInfoCType> altBirthDtInfo;

    /**
     * Gets the value of the altBirthDtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altBirthDtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltBirthDtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltBirthDtInfoCType }
     * 
     * 
     */
    public List<AltBirthDtInfoCType> getAltBirthDtInfo() {
        if (altBirthDtInfo == null) {
            altBirthDtInfo = new ArrayList<AltBirthDtInfoCType>();
        }
        return this.altBirthDtInfo;
    }

}
