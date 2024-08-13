
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for transaction fraud suspect
 *     search 
 * 
 * <p>Java class for TrnFraudSusSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnFraudSusSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnFraudSusSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrnFraudSusSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnFraudSusSrchArray_AType", propOrder = {
    "trnFraudSusSrchRec"
})
public class TrnFraudSusSrchArrayAType {

    @XmlElement(name = "TrnFraudSusSrchRec")
    protected List<TrnFraudSusSrchRecCType> trnFraudSusSrchRec;

    /**
     * Gets the value of the trnFraudSusSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnFraudSusSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnFraudSusSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrnFraudSusSrchRecCType }
     * 
     * 
     */
    public List<TrnFraudSusSrchRecCType> getTrnFraudSusSrchRec() {
        if (trnFraudSusSrchRec == null) {
            trnFraudSusSrchRec = new ArrayList<TrnFraudSusSrchRecCType>();
        }
        return this.trnFraudSusSrchRec;
    }

}
