
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of debtors that reside in the same
 *                 household
 * 
 * <p>Java class for HouseHoldDebtorArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseHoldDebtorArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HouseHoldDebtorInfo" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldDebtorInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseHoldDebtorArray_AType", propOrder = {
    "houseHoldDebtorInfo"
})
public class HouseHoldDebtorArrayAType {

    @XmlElement(name = "HouseHoldDebtorInfo")
    protected List<HouseHoldDebtorInfoCType> houseHoldDebtorInfo;

    /**
     * Gets the value of the houseHoldDebtorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseHoldDebtorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseHoldDebtorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseHoldDebtorInfoCType }
     * 
     * 
     */
    public List<HouseHoldDebtorInfoCType> getHouseHoldDebtorInfo() {
        if (houseHoldDebtorInfo == null) {
            houseHoldDebtorInfo = new ArrayList<HouseHoldDebtorInfoCType>();
        }
        return this.houseHoldDebtorInfo;
    }

}
