
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of transaction blocking rules as related to an EFT
 *     card
 * 
 * <p>Java class for EFTCardBlkRuleArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardBlkRuleArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardBlkRuleRec" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkRuleRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardBlkRuleArray_AType", propOrder = {
    "eftCardBlkRuleRec"
})
public class EFTCardBlkRuleArrayAType {

    @XmlElement(name = "EFTCardBlkRuleRec")
    protected List<EFTCardBlkRuleRecCType> eftCardBlkRuleRec;

    /**
     * Gets the value of the eftCardBlkRuleRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardBlkRuleRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardBlkRuleRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardBlkRuleRecCType }
     * 
     * 
     */
    public List<EFTCardBlkRuleRecCType> getEFTCardBlkRuleRec() {
        if (eftCardBlkRuleRec == null) {
            eftCardBlkRuleRec = new ArrayList<EFTCardBlkRuleRecCType>();
        }
        return this.eftCardBlkRuleRec;
    }

}
