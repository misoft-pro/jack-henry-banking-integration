
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of overrides for faults 
 * 
 * <p>Java class for ErrOvrRdInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrOvrRdInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrOvrRd" type="{http://jackhenry.com/jxchange/TPG/2008}ErrOvrRd_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrOvrRdInfoArray_AType", propOrder = {
    "errOvrRd"
})
public class ErrOvrRdInfoArrayAType {

    @XmlElement(name = "ErrOvrRd")
    protected List<ErrOvrRdCType> errOvrRd;

    /**
     * Gets the value of the errOvrRd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errOvrRd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrOvrRd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrOvrRdCType }
     * 
     * 
     */
    public List<ErrOvrRdCType> getErrOvrRd() {
        if (errOvrRd == null) {
            errOvrRd = new ArrayList<ErrOvrRdCType>();
        }
        return this.errOvrRd;
    }

}
