
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of responses for a subscriber search 
 * 
 * <p>Java class for BilPaySubSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPaySubSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilPaySubSrchInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPaySubSrchInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilPaySubSrchArray_AType", propOrder = {
    "bilPaySubSrchInfo"
})
public class BilPaySubSrchArrayAType {

    @XmlElement(name = "BilPaySubSrchInfo")
    protected List<BilPaySubSrchInfoCType> bilPaySubSrchInfo;

    /**
     * Gets the value of the bilPaySubSrchInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilPaySubSrchInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilPaySubSrchInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilPaySubSrchInfoCType }
     * 
     * 
     */
    public List<BilPaySubSrchInfoCType> getBilPaySubSrchInfo() {
        if (bilPaySubSrchInfo == null) {
            bilPaySubSrchInfo = new ArrayList<BilPaySubSrchInfoCType>();
        }
        return this.bilPaySubSrchInfo;
    }

}
