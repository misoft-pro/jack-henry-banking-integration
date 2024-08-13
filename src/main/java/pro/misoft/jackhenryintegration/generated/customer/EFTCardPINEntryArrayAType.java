
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The array of EFT card PIN Entry
 *     methods
 * 
 * <p>Java class for EFTCardPINEntryArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardPINEntryArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardPINEntryInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardPINEntryInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardPINEntryArray_AType", propOrder = {
    "eftCardPINEntryInfo"
})
public class EFTCardPINEntryArrayAType {

    @XmlElement(name = "EFTCardPINEntryInfo", nillable = true)
    protected List<EFTCardPINEntryInfoCType> eftCardPINEntryInfo;

    /**
     * Gets the value of the eftCardPINEntryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardPINEntryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardPINEntryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardPINEntryInfoCType }
     * 
     * 
     */
    public List<EFTCardPINEntryInfoCType> getEFTCardPINEntryInfo() {
        if (eftCardPINEntryInfo == null) {
            eftCardPINEntryInfo = new ArrayList<EFTCardPINEntryInfoCType>();
        }
        return this.eftCardPINEntryInfo;
    }

}
