
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of branches as related to a Financial
 *     Institution
 * 
 * <p>Java class for FinInstBrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinInstBrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstBrRec" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstBrRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinInstBrArray_AType", propOrder = {
    "finInstBrRec"
})
public class FinInstBrArrayAType {

    @XmlElement(name = "FinInstBrRec")
    protected List<FinInstBrRecCType> finInstBrRec;

    /**
     * Gets the value of the finInstBrRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstBrRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstBrRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinInstBrRecCType }
     * 
     * 
     */
    public List<FinInstBrRecCType> getFinInstBrRec() {
        if (finInstBrRec == null) {
            finInstBrRec = new ArrayList<FinInstBrRecCType>();
        }
        return this.finInstBrRec;
    }

}
