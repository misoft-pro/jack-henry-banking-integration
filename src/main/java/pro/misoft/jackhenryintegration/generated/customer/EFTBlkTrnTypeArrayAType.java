
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The array of EFT transaction types subject to
 *     blocking
 * 
 * <p>Java class for EFTBlkTrnTypeArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTBlkTrnTypeArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTBlkTrnTypeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnTypeInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTBlkTrnTypeArray_AType", propOrder = {
    "eftBlkTrnTypeInfo"
})
public class EFTBlkTrnTypeArrayAType {

    @XmlElement(name = "EFTBlkTrnTypeInfo", nillable = true)
    protected List<EFTBlkTrnTypeInfoCType> eftBlkTrnTypeInfo;

    /**
     * Gets the value of the eftBlkTrnTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftBlkTrnTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTBlkTrnTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTBlkTrnTypeInfoCType }
     * 
     * 
     */
    public List<EFTBlkTrnTypeInfoCType> getEFTBlkTrnTypeInfo() {
        if (eftBlkTrnTypeInfo == null) {
            eftBlkTrnTypeInfo = new ArrayList<EFTBlkTrnTypeInfoCType>();
        }
        return this.eftBlkTrnTypeInfo;
    }

}
