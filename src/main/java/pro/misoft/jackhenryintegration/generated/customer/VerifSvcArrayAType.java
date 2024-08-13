
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of verifications that will be performed for a
 *                 request 
 * 
 * <p>Java class for VerifSvcArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifSvcArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VerifSvcInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}VerifSvcInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifSvcArray_AType", propOrder = {
    "verifSvcInfoRec"
})
public class VerifSvcArrayAType {

    @XmlElement(name = "VerifSvcInfoRec")
    protected List<VerifSvcInfoRecCType> verifSvcInfoRec;

    /**
     * Gets the value of the verifSvcInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifSvcInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifSvcInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerifSvcInfoRecCType }
     * 
     * 
     */
    public List<VerifSvcInfoRecCType> getVerifSvcInfoRec() {
        if (verifSvcInfoRec == null) {
            verifSvcInfoRec = new ArrayList<VerifSvcInfoRecCType>();
        }
        return this.verifSvcInfoRec;
    }

}
