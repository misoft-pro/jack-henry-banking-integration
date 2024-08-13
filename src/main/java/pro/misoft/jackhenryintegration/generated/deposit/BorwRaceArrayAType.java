
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of race codes for a borrower 
 * 
 * <p>Java class for BorwRaceArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorwRaceArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BorwRaceInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorwRaceArray_AType", propOrder = {
    "borwRaceInfo"
})
public class BorwRaceArrayAType {

    @XmlElement(name = "BorwRaceInfo")
    protected List<BorwRaceInfoCType> borwRaceInfo;

    /**
     * Gets the value of the borwRaceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borwRaceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorwRaceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BorwRaceInfoCType }
     * 
     * 
     */
    public List<BorwRaceInfoCType> getBorwRaceInfo() {
        if (borwRaceInfo == null) {
            borwRaceInfo = new ArrayList<BorwRaceInfoCType>();
        }
        return this.borwRaceInfo;
    }

}
