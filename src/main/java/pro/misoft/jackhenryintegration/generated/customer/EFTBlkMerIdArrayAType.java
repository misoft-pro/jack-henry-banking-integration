
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The array of EFT merchant identifications that is
 *     blocked from transaction processing
 * 
 * <p>Java class for EFTBlkMerIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTBlkMerIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTBlkMerIdInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkMerIdInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTBlkMerIdArray_AType", propOrder = {
    "eftBlkMerIdInfo"
})
public class EFTBlkMerIdArrayAType {

    @XmlElement(name = "EFTBlkMerIdInfo", nillable = true)
    protected List<EFTBlkMerIdInfoCType> eftBlkMerIdInfo;

    /**
     * Gets the value of the eftBlkMerIdInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftBlkMerIdInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTBlkMerIdInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTBlkMerIdInfoCType }
     * 
     * 
     */
    public List<EFTBlkMerIdInfoCType> getEFTBlkMerIdInfo() {
        if (eftBlkMerIdInfo == null) {
            eftBlkMerIdInfo = new ArrayList<EFTBlkMerIdInfoCType>();
        }
        return this.eftBlkMerIdInfo;
    }

}
