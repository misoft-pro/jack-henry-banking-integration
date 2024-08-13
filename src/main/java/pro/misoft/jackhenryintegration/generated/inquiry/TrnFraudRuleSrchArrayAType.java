
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for transaction fraud rule search
 *    
 * 
 * <p>Java class for TrnFraudRuleSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnFraudRuleSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnFraudRuleSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudRuleSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnFraudRuleSrchArray_AType", propOrder = {
    "trnFraudRuleSrchRec"
})
public class TrnFraudRuleSrchArrayAType {

    @XmlElement(name = "TrnFraudRuleSrchRec")
    protected List<TrnFraudRuleSrchRecCType> trnFraudRuleSrchRec;

    /**
     * Gets the value of the trnFraudRuleSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnFraudRuleSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnFraudRuleSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrnFraudRuleSrchRecCType }
     * 
     * 
     */
    public List<TrnFraudRuleSrchRecCType> getTrnFraudRuleSrchRec() {
        if (trnFraudRuleSrchRec == null) {
            trnFraudRuleSrchRec = new ArrayList<TrnFraudRuleSrchRecCType>();
        }
        return this.trnFraudRuleSrchRec;
    }

}
