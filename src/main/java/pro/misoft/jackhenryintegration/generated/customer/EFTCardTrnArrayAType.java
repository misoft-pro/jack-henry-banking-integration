
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of EFT Card Transactional
 *     Activity
 * 
 * <p>Java class for EFTCardTrnArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardTrnArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardTrnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrnInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardTrnArray_AType", propOrder = {
    "eftCardTrnInfo"
})
public class EFTCardTrnArrayAType {

    @XmlElement(name = "EFTCardTrnInfo", nillable = true)
    protected List<EFTCardTrnInfoCType> eftCardTrnInfo;

    /**
     * Gets the value of the eftCardTrnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardTrnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardTrnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardTrnInfoCType }
     * 
     * 
     */
    public List<EFTCardTrnInfoCType> getEFTCardTrnInfo() {
        if (eftCardTrnInfo == null) {
            eftCardTrnInfo = new ArrayList<EFTCardTrnInfoCType>();
        }
        return this.eftCardTrnInfo;
    }

}
