
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of the accounts that are part of an EFT Card
 *                 account 
 * 
 * <p>Java class for EFTCardAcctIdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardAcctIdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardAcctIdInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAcctIdInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardAcctIdArray_AType", propOrder = {
    "eftCardAcctIdInfo"
})
public class EFTCardAcctIdArrayAType {

    @XmlElement(name = "EFTCardAcctIdInfo", nillable = true)
    protected List<EFTCardAcctIdInfoCType> eftCardAcctIdInfo;

    /**
     * Gets the value of the eftCardAcctIdInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardAcctIdInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardAcctIdInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardAcctIdInfoCType }
     * 
     * 
     */
    public List<EFTCardAcctIdInfoCType> getEFTCardAcctIdInfo() {
        if (eftCardAcctIdInfo == null) {
            eftCardAcctIdInfo = new ArrayList<EFTCardAcctIdInfoCType>();
        }
        return this.eftCardAcctIdInfo;
    }

}
