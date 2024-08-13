
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of liabilities submitted on a loan
 *                 applicant.
 * 
 * <p>Java class for LiabAppArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiabAppArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LiabAppInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LiabAppInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiabAppArray_AType", propOrder = {
    "liabAppInfo"
})
public class LiabAppArrayAType {

    @XmlElement(name = "LiabAppInfo")
    protected List<LiabAppInfoCType> liabAppInfo;

    /**
     * Gets the value of the liabAppInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liabAppInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiabAppInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiabAppInfoCType }
     * 
     * 
     */
    public List<LiabAppInfoCType> getLiabAppInfo() {
        if (liabAppInfo == null) {
            liabAppInfo = new ArrayList<LiabAppInfoCType>();
        }
        return this.liabAppInfo;
    }

}
