
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The mailing address for EFT Cards
 *     issuance
 * 
 * <p>Java class for x_EFTCardMailAddrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_EFTCardMailAddrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardMailAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardMailAddrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_EFTCardMailAddrInfo_CType", propOrder = {
    "eftCardMailAddrInfo"
})
public class XEFTCardMailAddrInfoCType {

    @XmlElement(name = "EFTCardMailAddrInfo", nillable = true)
    protected List<EFTCardMailAddrInfoCType> eftCardMailAddrInfo;

    /**
     * Gets the value of the eftCardMailAddrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardMailAddrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardMailAddrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardMailAddrInfoCType }
     * 
     * 
     */
    public List<EFTCardMailAddrInfoCType> getEFTCardMailAddrInfo() {
        if (eftCardMailAddrInfo == null) {
            eftCardMailAddrInfo = new ArrayList<EFTCardMailAddrInfoCType>();
        }
        return this.eftCardMailAddrInfo;
    }

}
