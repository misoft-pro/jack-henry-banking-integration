
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of reasons for the transaction risk statues
 *    
 * 
 * <p>Java class for TrnRiskStatRsnArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnRiskStatRsnArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnRiskStatRsnRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatRsnRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnRiskStatRsnArray_AType", propOrder = {
    "trnRiskStatRsnRec"
})
public class TrnRiskStatRsnArrayAType {

    @XmlElement(name = "TrnRiskStatRsnRec")
    protected List<TrnRiskStatRsnRecCType> trnRiskStatRsnRec;

    /**
     * Gets the value of the trnRiskStatRsnRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnRiskStatRsnRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnRiskStatRsnRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrnRiskStatRsnRecCType }
     * 
     * 
     */
    public List<TrnRiskStatRsnRecCType> getTrnRiskStatRsnRec() {
        if (trnRiskStatRsnRec == null) {
            trnRiskStatRsnRec = new ArrayList<TrnRiskStatRsnRecCType>();
        }
        return this.trnRiskStatRsnRec;
    }

}
