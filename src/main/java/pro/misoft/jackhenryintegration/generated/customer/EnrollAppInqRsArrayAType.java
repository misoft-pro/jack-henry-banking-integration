
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses to convey the applications that a
 *     customer is enrolled
 * 
 * <p>Java class for EnrollAppInqRsArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollAppInqRsArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnrollAppInqRsInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EnrollAppInqRsInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollAppInqRsArray_AType", propOrder = {
    "enrollAppInqRsInfo"
})
public class EnrollAppInqRsArrayAType {

    @XmlElement(name = "EnrollAppInqRsInfo", nillable = true)
    protected List<EnrollAppInqRsInfoCType> enrollAppInqRsInfo;

    /**
     * Gets the value of the enrollAppInqRsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrollAppInqRsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrollAppInqRsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnrollAppInqRsInfoCType }
     * 
     * 
     */
    public List<EnrollAppInqRsInfoCType> getEnrollAppInqRsInfo() {
        if (enrollAppInqRsInfo == null) {
            enrollAppInqRsInfo = new ArrayList<EnrollAppInqRsInfoCType>();
        }
        return this.enrollAppInqRsInfo;
    }

}
