
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of elements that convey the reason for a loan application
 *                 denial 
 * 
 * <p>Java class for DenialRsnArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DenialRsnArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DenialRsnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DenialRsnInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DenialRsnArray_AType", propOrder = {
    "denialRsnInfo"
})
public class DenialRsnArrayAType {

    @XmlElement(name = "DenialRsnInfo")
    protected List<DenialRsnInfoCType> denialRsnInfo;

    /**
     * Gets the value of the denialRsnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denialRsnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenialRsnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DenialRsnInfoCType }
     * 
     * 
     */
    public List<DenialRsnInfoCType> getDenialRsnInfo() {
        if (denialRsnInfo == null) {
            denialRsnInfo = new ArrayList<DenialRsnInfoCType>();
        }
        return this.denialRsnInfo;
    }

}
