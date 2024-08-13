
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of day of future payments
 * 
 * <p>Java class for x_FutPmtInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_FutPmtInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FutPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}FutPmtInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_FutPmtInfoArray_AType", propOrder = {
    "futPmtInfo"
})
public class XFutPmtInfoArrayAType {

    @XmlElement(name = "FutPmtInfo")
    protected List<FutPmtInfoCType> futPmtInfo;

    /**
     * Gets the value of the futPmtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futPmtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFutPmtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FutPmtInfoCType }
     * 
     * 
     */
    public List<FutPmtInfoCType> getFutPmtInfo() {
        if (futPmtInfo == null) {
            futPmtInfo = new ArrayList<FutPmtInfoCType>();
        }
        return this.futPmtInfo;
    }

}
