
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The array of EFT pseudo names related to EFT Terminal
 *     Identifications
 * 
 * <p>Java class for EFTPseudoTrmlIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTPseudoTrmlIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTPseudoTrmlIdInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTPseudoTrmlIdInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTPseudoTrmlIdArray_AType", propOrder = {
    "eftPseudoTrmlIdInfo"
})
public class EFTPseudoTrmlIdArrayAType {

    @XmlElement(name = "EFTPseudoTrmlIdInfo", nillable = true)
    protected List<EFTPseudoTrmlIdInfoCType> eftPseudoTrmlIdInfo;

    /**
     * Gets the value of the eftPseudoTrmlIdInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftPseudoTrmlIdInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTPseudoTrmlIdInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTPseudoTrmlIdInfoCType }
     * 
     * 
     */
    public List<EFTPseudoTrmlIdInfoCType> getEFTPseudoTrmlIdInfo() {
        if (eftPseudoTrmlIdInfo == null) {
            eftPseudoTrmlIdInfo = new ArrayList<EFTPseudoTrmlIdInfoCType>();
        }
        return this.eftPseudoTrmlIdInfo;
    }

}
