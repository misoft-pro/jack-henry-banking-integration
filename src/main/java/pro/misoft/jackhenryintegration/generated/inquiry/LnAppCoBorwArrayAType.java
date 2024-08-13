
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of elements that describes the co-borrower for the application
 *                 register 
 * 
 * <p>Java class for LnAppCoBorwArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAppCoBorwArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnAppCoBorwInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppCoBorwInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnAppCoBorwArray_AType", propOrder = {
    "lnAppCoBorwInfo"
})
public class LnAppCoBorwArrayAType {

    @XmlElement(name = "LnAppCoBorwInfo")
    protected List<LnAppCoBorwInfoCType> lnAppCoBorwInfo;

    /**
     * Gets the value of the lnAppCoBorwInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnAppCoBorwInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnAppCoBorwInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnAppCoBorwInfoCType }
     * 
     * 
     */
    public List<LnAppCoBorwInfoCType> getLnAppCoBorwInfo() {
        if (lnAppCoBorwInfo == null) {
            lnAppCoBorwInfo = new ArrayList<LnAppCoBorwInfoCType>();
        }
        return this.lnAppCoBorwInfo;
    }

}
