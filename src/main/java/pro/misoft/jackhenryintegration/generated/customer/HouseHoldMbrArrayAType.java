
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of household members
 * 
 * <p>Java class for HouseHoldMbrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseHoldMbrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HouseHoldMbrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}HouseHoldMbrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseHoldMbrArray_AType", propOrder = {
    "houseHoldMbrInfo"
})
public class HouseHoldMbrArrayAType {

    @XmlElement(name = "HouseHoldMbrInfo")
    protected List<HouseHoldMbrInfoCType> houseHoldMbrInfo;

    /**
     * Gets the value of the houseHoldMbrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseHoldMbrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseHoldMbrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseHoldMbrInfoCType }
     * 
     * 
     */
    public List<HouseHoldMbrInfoCType> getHouseHoldMbrInfo() {
        if (houseHoldMbrInfo == null) {
            houseHoldMbrInfo = new ArrayList<HouseHoldMbrInfoCType>();
        }
        return this.houseHoldMbrInfo;
    }

}
