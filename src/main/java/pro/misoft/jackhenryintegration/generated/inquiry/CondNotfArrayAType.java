
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of Condition Notifier. 
 * 
 * <p>Java class for CondNotfArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondNotfArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CondNotfInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CondNotfInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondNotfArray_AType", propOrder = {
    "condNotfInfo"
})
public class CondNotfArrayAType {

    @XmlElement(name = "CondNotfInfo", nillable = true)
    protected List<CondNotfInfoCType> condNotfInfo;

    /**
     * Gets the value of the condNotfInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condNotfInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondNotfInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CondNotfInfoCType }
     * 
     * 
     */
    public List<CondNotfInfoCType> getCondNotfInfo() {
        if (condNotfInfo == null) {
            condNotfInfo = new ArrayList<CondNotfInfoCType>();
        }
        return this.condNotfInfo;
    }

}
