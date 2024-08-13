
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of financial institutions
 *                 identifications
 * 
 * <p>Java class for IntnetFinInstIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntnetFinInstIdArrayInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstIdArrayInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntnetFinInstIdArray_AType", propOrder = {
    "intnetFinInstIdArrayInfo"
})
public class IntnetFinInstIdArrayAType {

    @XmlElement(name = "IntnetFinInstIdArrayInfo")
    protected List<IntnetFinInstIdArrayInfoCType> intnetFinInstIdArrayInfo;

    /**
     * Gets the value of the intnetFinInstIdArrayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intnetFinInstIdArrayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntnetFinInstIdArrayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntnetFinInstIdArrayInfoCType }
     * 
     * 
     */
    public List<IntnetFinInstIdArrayInfoCType> getIntnetFinInstIdArrayInfo() {
        if (intnetFinInstIdArrayInfo == null) {
            intnetFinInstIdArrayInfo = new ArrayList<IntnetFinInstIdArrayInfoCType>();
        }
        return this.intnetFinInstIdArrayInfo;
    }

}
