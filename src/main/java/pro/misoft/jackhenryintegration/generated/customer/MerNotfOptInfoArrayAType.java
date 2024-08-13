
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of Opt Out Codes for merchant
 *                 notification
 * 
 * <p>Java class for MerNotfOptInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerNotfOptInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerNotfOptInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}MerNotfOptInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerNotfOptInfoArray_AType", propOrder = {
    "merNotfOptInfoRec"
})
public class MerNotfOptInfoArrayAType {

    @XmlElement(name = "MerNotfOptInfoRec")
    protected List<MerNotfOptInfoRecCType> merNotfOptInfoRec;

    /**
     * Gets the value of the merNotfOptInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the merNotfOptInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerNotfOptInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerNotfOptInfoRecCType }
     * 
     * 
     */
    public List<MerNotfOptInfoRecCType> getMerNotfOptInfoRec() {
        if (merNotfOptInfoRec == null) {
            merNotfOptInfoRec = new ArrayList<MerNotfOptInfoRecCType>();
        }
        return this.merNotfOptInfoRec;
    }

}
