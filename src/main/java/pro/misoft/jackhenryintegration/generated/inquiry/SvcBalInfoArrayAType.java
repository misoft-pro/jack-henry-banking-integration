
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of payments/remittance for investor loans
 *             
 * 
 * <p>Java class for SvcBalInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcBalInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcBalInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SvcBalInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcBalInfoArray_AType", propOrder = {
    "svcBalInfo"
})
public class SvcBalInfoArrayAType {

    @XmlElement(name = "SvcBalInfo", nillable = true)
    protected List<SvcBalInfoCType> svcBalInfo;

    /**
     * Gets the value of the svcBalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcBalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcBalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcBalInfoCType }
     * 
     * 
     */
    public List<SvcBalInfoCType> getSvcBalInfo() {
        if (svcBalInfo == null) {
            svcBalInfo = new ArrayList<SvcBalInfoCType>();
        }
        return this.svcBalInfo;
    }

}
