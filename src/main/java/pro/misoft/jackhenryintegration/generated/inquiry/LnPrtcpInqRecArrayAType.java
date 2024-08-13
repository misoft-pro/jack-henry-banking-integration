
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for loan participation
 *     inquiry.
 * 
 * <p>Java class for LnPrtcpInqRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnPrtcpInqRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnPrtcpInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnPrtcpInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnPrtcpInqRecArray_AType", propOrder = {
    "lnPrtcpInqRec"
})
public class LnPrtcpInqRecArrayAType {

    @XmlElement(name = "LnPrtcpInqRec")
    protected List<LnPrtcpInqRecCType> lnPrtcpInqRec;

    /**
     * Gets the value of the lnPrtcpInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnPrtcpInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnPrtcpInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnPrtcpInqRecCType }
     * 
     * 
     */
    public List<LnPrtcpInqRecCType> getLnPrtcpInqRec() {
        if (lnPrtcpInqRec == null) {
            lnPrtcpInqRec = new ArrayList<LnPrtcpInqRecCType>();
        }
        return this.lnPrtcpInqRec;
    }

}
