
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of participated sold loan
 *     fees
 * 
 * <p>Java class for PrtcpFeeSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrtcpFeeSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrtcpFeeSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpFeeSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrtcpFeeSrchArray_AType", propOrder = {
    "prtcpFeeSrchRec"
})
public class PrtcpFeeSrchArrayAType {

    @XmlElement(name = "PrtcpFeeSrchRec")
    protected List<PrtcpFeeSrchRecCType> prtcpFeeSrchRec;

    /**
     * Gets the value of the prtcpFeeSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtcpFeeSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtcpFeeSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrtcpFeeSrchRecCType }
     * 
     * 
     */
    public List<PrtcpFeeSrchRecCType> getPrtcpFeeSrchRec() {
        if (prtcpFeeSrchRec == null) {
            prtcpFeeSrchRec = new ArrayList<PrtcpFeeSrchRecCType>();
        }
        return this.prtcpFeeSrchRec;
    }

}
