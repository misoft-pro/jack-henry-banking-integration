
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of bill pay product type details
 * 
 * <p>Java class for BilPayProdTypeInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayProdTypeInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilPayProdTypeInfo" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProdTypeInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilPayProdTypeInfoArray_AType", propOrder = {
    "bilPayProdTypeInfo"
})
public class BilPayProdTypeInfoArrayAType {

    @XmlElement(name = "BilPayProdTypeInfo")
    protected List<BilPayProdTypeInfoCType> bilPayProdTypeInfo;

    /**
     * Gets the value of the bilPayProdTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilPayProdTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilPayProdTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilPayProdTypeInfoCType }
     * 
     * 
     */
    public List<BilPayProdTypeInfoCType> getBilPayProdTypeInfo() {
        if (bilPayProdTypeInfo == null) {
            bilPayProdTypeInfo = new ArrayList<BilPayProdTypeInfoCType>();
        }
        return this.bilPayProdTypeInfo;
    }

}
