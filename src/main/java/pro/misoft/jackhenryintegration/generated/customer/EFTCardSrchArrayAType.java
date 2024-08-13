
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for EFT card
 *     Search
 * 
 * <p>Java class for EFTCardSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardSrchArray_AType", propOrder = {
    "eftCardSrchRec"
})
public class EFTCardSrchArrayAType {

    @XmlElement(name = "EFTCardSrchRec")
    protected List<EFTCardSrchRecCType> eftCardSrchRec;

    /**
     * Gets the value of the eftCardSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardSrchRecCType }
     * 
     * 
     */
    public List<EFTCardSrchRecCType> getEFTCardSrchRec() {
        if (eftCardSrchRec == null) {
            eftCardSrchRec = new ArrayList<EFTCardSrchRecCType>();
        }
        return this.eftCardSrchRec;
    }

}
