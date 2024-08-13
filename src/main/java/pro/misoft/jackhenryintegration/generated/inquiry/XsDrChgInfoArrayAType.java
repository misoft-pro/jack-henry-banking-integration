
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of charges for excess debit
 *                 activity
 * 
 * <p>Java class for XsDrChgInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XsDrChgInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XsDrChgInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}XsDrChgInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XsDrChgInfoArray_AType", propOrder = {
    "xsDrChgInfoRec"
})
public class XsDrChgInfoArrayAType {

    @XmlElement(name = "XsDrChgInfoRec")
    protected List<XsDrChgInfoRecCType> xsDrChgInfoRec;

    /**
     * Gets the value of the xsDrChgInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xsDrChgInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXsDrChgInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XsDrChgInfoRecCType }
     * 
     * 
     */
    public List<XsDrChgInfoRecCType> getXsDrChgInfoRec() {
        if (xsDrChgInfoRec == null) {
            xsDrChgInfoRec = new ArrayList<XsDrChgInfoRecCType>();
        }
        return this.xsDrChgInfoRec;
    }

}
