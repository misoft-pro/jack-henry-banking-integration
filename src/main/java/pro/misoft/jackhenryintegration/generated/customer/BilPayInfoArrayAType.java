
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of accounts that participate in internet
 *     banking bill pay
 * 
 * <p>Java class for BilPayInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilPayInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilPayInfoArray_AType", propOrder = {
    "bilPayInfo"
})
public class BilPayInfoArrayAType {

    @XmlElement(name = "BilPayInfo", nillable = true)
    protected List<BilPayInfoCType> bilPayInfo;

    /**
     * Gets the value of the bilPayInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilPayInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilPayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilPayInfoCType }
     * 
     * 
     */
    public List<BilPayInfoCType> getBilPayInfo() {
        if (bilPayInfo == null) {
            bilPayInfo = new ArrayList<BilPayInfoCType>();
        }
        return this.bilPayInfo;
    }

}
