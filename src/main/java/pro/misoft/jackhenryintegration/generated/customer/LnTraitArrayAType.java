
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array describing the characteristics that help define a
 *                 loan product
 * 
 * <p>Java class for LnTraitArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnTraitArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnTraitInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnTraitInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnTraitArray_AType", propOrder = {
    "lnTraitInfo"
})
public class LnTraitArrayAType {

    @XmlElement(name = "LnTraitInfo")
    protected List<LnTraitInfoCType> lnTraitInfo;

    /**
     * Gets the value of the lnTraitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnTraitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnTraitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnTraitInfoCType }
     * 
     * 
     */
    public List<LnTraitInfoCType> getLnTraitInfo() {
        if (lnTraitInfo == null) {
            lnTraitInfo = new ArrayList<LnTraitInfoCType>();
        }
        return this.lnTraitInfo;
    }

}
