
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of principal individuals that are part of a
 *                 corporation
 * 
 * <p>Java class for CorpPrincArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorpPrincArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorpPrincInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CorpPrincInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorpPrincArray_AType", propOrder = {
    "corpPrincInfoRec"
})
public class CorpPrincArrayAType {

    @XmlElement(name = "CorpPrincInfoRec")
    protected List<CorpPrincInfoRecCType> corpPrincInfoRec;

    /**
     * Gets the value of the corpPrincInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpPrincInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpPrincInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorpPrincInfoRecCType }
     * 
     * 
     */
    public List<CorpPrincInfoRecCType> getCorpPrincInfoRec() {
        if (corpPrincInfoRec == null) {
            corpPrincInfoRec = new ArrayList<CorpPrincInfoRecCType>();
        }
        return this.corpPrincInfoRec;
    }

}
