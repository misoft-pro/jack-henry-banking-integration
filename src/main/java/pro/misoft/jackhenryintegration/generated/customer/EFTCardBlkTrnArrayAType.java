
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The array of EFT transactions that should be blocked by
 *     the Card processor
 * 
 * <p>Java class for EFTCardBlkTrnArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardBlkTrnArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardBlkTrnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkTrnInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardBlkTrnArray_AType", propOrder = {
    "eftCardBlkTrnInfo"
})
public class EFTCardBlkTrnArrayAType {

    @XmlElement(name = "EFTCardBlkTrnInfo", nillable = true)
    protected List<EFTCardBlkTrnInfoCType> eftCardBlkTrnInfo;

    /**
     * Gets the value of the eftCardBlkTrnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardBlkTrnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardBlkTrnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardBlkTrnInfoCType }
     * 
     * 
     */
    public List<EFTCardBlkTrnInfoCType> getEFTCardBlkTrnInfo() {
        if (eftCardBlkTrnInfo == null) {
            eftCardBlkTrnInfo = new ArrayList<EFTCardBlkTrnInfoCType>();
        }
        return this.eftCardBlkTrnInfo;
    }

}
