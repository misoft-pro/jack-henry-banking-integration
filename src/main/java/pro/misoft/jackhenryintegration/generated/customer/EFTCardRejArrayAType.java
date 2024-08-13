
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of EFT Card Transactional Rejected
 *     Activity
 * 
 * <p>Java class for EFTCardRejArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardRejArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardRejInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardRejInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardRejArray_AType", propOrder = {
    "eftCardRejInfo"
})
public class EFTCardRejArrayAType {

    @XmlElement(name = "EFTCardRejInfo", nillable = true)
    protected List<EFTCardRejInfoCType> eftCardRejInfo;

    /**
     * Gets the value of the eftCardRejInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardRejInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardRejInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardRejInfoCType }
     * 
     * 
     */
    public List<EFTCardRejInfoCType> getEFTCardRejInfo() {
        if (eftCardRejInfo == null) {
            eftCardRejInfo = new ArrayList<EFTCardRejInfoCType>();
        }
        return this.eftCardRejInfo;
    }

}
