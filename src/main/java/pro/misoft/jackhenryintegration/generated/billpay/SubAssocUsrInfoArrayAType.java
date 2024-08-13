
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of associated subscriber users
 * 
 * <p>Java class for SubAssocUsrInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubAssocUsrInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubAssocUsrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SubAssocUsrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAssocUsrInfoArray_AType", propOrder = {
    "subAssocUsrInfo"
})
public class SubAssocUsrInfoArrayAType {

    @XmlElement(name = "SubAssocUsrInfo")
    protected List<SubAssocUsrInfoCType> subAssocUsrInfo;

    /**
     * Gets the value of the subAssocUsrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAssocUsrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAssocUsrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAssocUsrInfoCType }
     * 
     * 
     */
    public List<SubAssocUsrInfoCType> getSubAssocUsrInfo() {
        if (subAssocUsrInfo == null) {
            subAssocUsrInfo = new ArrayList<SubAssocUsrInfoCType>();
        }
        return this.subAssocUsrInfo;
    }

}
