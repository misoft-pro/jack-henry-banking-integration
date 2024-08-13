
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of EFT cards issued to an
 *                 account
 * 
 * <p>Java class for EFTCardInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardInfoArray_AType", propOrder = {
    "eftCardInfoRec"
})
public class EFTCardInfoArrayAType {

    @XmlElement(name = "EFTCardInfoRec")
    protected List<EFTCardInfoRecCType> eftCardInfoRec;

    /**
     * Gets the value of the eftCardInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardInfoRecCType }
     * 
     * 
     */
    public List<EFTCardInfoRecCType> getEFTCardInfoRec() {
        if (eftCardInfoRec == null) {
            eftCardInfoRec = new ArrayList<EFTCardInfoRecCType>();
        }
        return this.eftCardInfoRec;
    }

}
