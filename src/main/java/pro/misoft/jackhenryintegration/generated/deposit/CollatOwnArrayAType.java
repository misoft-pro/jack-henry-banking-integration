
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of Collateral Owner information
 *             
 * 
 * <p>Java class for CollatOwnArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatOwnArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatOwnInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CollatOwnInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollatOwnArray_AType", propOrder = {
    "collatOwnInfo"
})
public class CollatOwnArrayAType {

    @XmlElement(name = "CollatOwnInfo")
    protected List<CollatOwnInfoCType> collatOwnInfo;

    /**
     * Gets the value of the collatOwnInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collatOwnInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollatOwnInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollatOwnInfoCType }
     * 
     * 
     */
    public List<CollatOwnInfoCType> getCollatOwnInfo() {
        if (collatOwnInfo == null) {
            collatOwnInfo = new ArrayList<CollatOwnInfoCType>();
        }
        return this.collatOwnInfo;
    }

}
