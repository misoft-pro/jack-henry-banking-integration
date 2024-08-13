
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The array of EFT postal codes where transactions are
 *     accepted
 * 
 * <p>Java class for EFTCardAcptPostalCodeArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardAcptPostalCodeArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardAcptPostalCodeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcptPostalCodeInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardAcptPostalCodeArray_AType", propOrder = {
    "eftCardAcptPostalCodeInfo"
})
public class EFTCardAcptPostalCodeArrayAType {

    @XmlElement(name = "EFTCardAcptPostalCodeInfo", nillable = true)
    protected List<EFTCardAcptPostalCodeInfoCType> eftCardAcptPostalCodeInfo;

    /**
     * Gets the value of the eftCardAcptPostalCodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardAcptPostalCodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardAcptPostalCodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardAcptPostalCodeInfoCType }
     * 
     * 
     */
    public List<EFTCardAcptPostalCodeInfoCType> getEFTCardAcptPostalCodeInfo() {
        if (eftCardAcptPostalCodeInfo == null) {
            eftCardAcptPostalCodeInfo = new ArrayList<EFTCardAcptPostalCodeInfoCType>();
        }
        return this.eftCardAcptPostalCodeInfo;
    }

}
