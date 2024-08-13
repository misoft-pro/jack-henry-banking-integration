
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of chargable fees related to an internet
 *                 identifier
 * 
 * <p>Java class for IntnetFeeChgArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFeeChgArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntnetFeeChgInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFeeChgInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntnetFeeChgArray_AType", propOrder = {
    "intnetFeeChgInfo"
})
public class IntnetFeeChgArrayAType {

    @XmlElement(name = "IntnetFeeChgInfo", nillable = true)
    protected List<IntnetFeeChgInfoCType> intnetFeeChgInfo;

    /**
     * Gets the value of the intnetFeeChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intnetFeeChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntnetFeeChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntnetFeeChgInfoCType }
     * 
     * 
     */
    public List<IntnetFeeChgInfoCType> getIntnetFeeChgInfo() {
        if (intnetFeeChgInfo == null) {
            intnetFeeChgInfo = new ArrayList<IntnetFeeChgInfoCType>();
        }
        return this.intnetFeeChgInfo;
    }

}
