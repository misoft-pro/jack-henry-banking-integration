
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of permissible transaction activity for an account
 *             
 * 
 * <p>Java class for AllowTrnActArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowTrnActArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowTrnActInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AllowTrnActInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowTrnActArray_AType", propOrder = {
    "allowTrnActInfo"
})
public class AllowTrnActArrayAType {

    @XmlElement(name = "AllowTrnActInfo")
    protected List<AllowTrnActInfoCType> allowTrnActInfo;

    /**
     * Gets the value of the allowTrnActInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowTrnActInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowTrnActInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowTrnActInfoCType }
     * 
     * 
     */
    public List<AllowTrnActInfoCType> getAllowTrnActInfo() {
        if (allowTrnActInfo == null) {
            allowTrnActInfo = new ArrayList<AllowTrnActInfoCType>();
        }
        return this.allowTrnActInfo;
    }

}
