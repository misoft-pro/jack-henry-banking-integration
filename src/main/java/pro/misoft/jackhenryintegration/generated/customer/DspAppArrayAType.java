
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of applications that conveys if the user has
 *                 access for viewing
 * 
 * <p>Java class for DspAppArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DspAppArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DspAppInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DspAppInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DspAppArray_AType", propOrder = {
    "dspAppInfo"
})
public class DspAppArrayAType {

    @XmlElement(name = "DspAppInfo", nillable = true)
    protected List<DspAppInfoCType> dspAppInfo;

    /**
     * Gets the value of the dspAppInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dspAppInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDspAppInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DspAppInfoCType }
     * 
     * 
     */
    public List<DspAppInfoCType> getDspAppInfo() {
        if (dspAppInfo == null) {
            dspAppInfo = new ArrayList<DspAppInfoCType>();
        }
        return this.dspAppInfo;
    }

}
