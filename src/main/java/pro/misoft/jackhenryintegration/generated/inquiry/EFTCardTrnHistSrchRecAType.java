
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  An Array of responses for EFTCard Tran Hist
 *     search.
 * 
 * <p>Java class for EFTCardTrnHistSrchRec_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardTrnHistSrchRec_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardHistSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardHistSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardTrnHistSrchRec_AType", propOrder = {
    "eftCardHistSrchRec"
})
public class EFTCardTrnHistSrchRecAType {

    @XmlElement(name = "EFTCardHistSrchRec")
    protected List<EFTCardHistSrchRecCType> eftCardHistSrchRec;

    /**
     * Gets the value of the eftCardHistSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardHistSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardHistSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardHistSrchRecCType }
     * 
     * 
     */
    public List<EFTCardHistSrchRecCType> getEFTCardHistSrchRec() {
        if (eftCardHistSrchRec == null) {
            eftCardHistSrchRec = new ArrayList<EFTCardHistSrchRecCType>();
        }
        return this.eftCardHistSrchRec;
    }

}
