
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for an address search 
 * 
 * <p>Java class for EFTCardAddrSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardAddrSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAddrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardAddrSrchArray_AType", propOrder = {
    "eftCardAddrInfo"
})
public class EFTCardAddrSrchArrayAType {

    @XmlElement(name = "EFTCardAddrInfo")
    protected List<EFTCardAddrInfoCType> eftCardAddrInfo;

    /**
     * Gets the value of the eftCardAddrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardAddrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardAddrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardAddrInfoCType }
     * 
     * 
     */
    public List<EFTCardAddrInfoCType> getEFTCardAddrInfo() {
        if (eftCardAddrInfo == null) {
            eftCardAddrInfo = new ArrayList<EFTCardAddrInfoCType>();
        }
        return this.eftCardAddrInfo;
    }

}
