
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoBorwCrScoreArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoBorwCrScoreArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoBorwCrScoreRec" type="{http://jackhenry.com/jxchange/TPG/2008}CoBorwCrScoreRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoBorwCrScoreArray_AType", propOrder = {
    "coBorwCrScoreRec"
})
public class CoBorwCrScoreArrayAType {

    @XmlElement(name = "CoBorwCrScoreRec")
    protected List<CoBorwCrScoreRecCType> coBorwCrScoreRec;

    /**
     * Gets the value of the coBorwCrScoreRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coBorwCrScoreRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoBorwCrScoreRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoBorwCrScoreRecCType }
     * 
     * 
     */
    public List<CoBorwCrScoreRecCType> getCoBorwCrScoreRec() {
        if (coBorwCrScoreRec == null) {
            coBorwCrScoreRec = new ArrayList<CoBorwCrScoreRecCType>();
        }
        return this.coBorwCrScoreRec;
    }

}
