
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of installed applications for a financial
 *     institution
 * 
 * <p>Java class for EnrollAppInqArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollAppInqArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnrollAppInqInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EnrollAppInqInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollAppInqArray_AType", propOrder = {
    "enrollAppInqInfo"
})
public class EnrollAppInqArrayAType {

    @XmlElement(name = "EnrollAppInqInfo", nillable = true)
    protected List<EnrollAppInqInfoCType> enrollAppInqInfo;

    /**
     * Gets the value of the enrollAppInqInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrollAppInqInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrollAppInqInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnrollAppInqInfoCType }
     * 
     * 
     */
    public List<EnrollAppInqInfoCType> getEnrollAppInqInfo() {
        if (enrollAppInqInfo == null) {
            enrollAppInqInfo = new ArrayList<EnrollAppInqInfoCType>();
        }
        return this.enrollAppInqInfo;
    }

}
