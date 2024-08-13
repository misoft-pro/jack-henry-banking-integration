
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of errors/faults/warnings that could be
 *     returned for a specific element
 * 
 * <p>Java class for x_SvcPrvdErrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_SvcPrvdErrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcPrvdErrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdErrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_SvcPrvdErrArray_AType", propOrder = {
    "svcPrvdErrInfo"
})
public class XSvcPrvdErrArrayAType {

    @XmlElement(name = "SvcPrvdErrInfo")
    protected List<SvcPrvdErrInfoCType> svcPrvdErrInfo;

    /**
     * Gets the value of the svcPrvdErrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcPrvdErrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcPrvdErrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcPrvdErrInfoCType }
     * 
     * 
     */
    public List<SvcPrvdErrInfoCType> getSvcPrvdErrInfo() {
        if (svcPrvdErrInfo == null) {
            svcPrvdErrInfo = new ArrayList<SvcPrvdErrInfoCType>();
        }
        return this.svcPrvdErrInfo;
    }

}
