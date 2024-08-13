
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of ACH addenda records
 * 
 * <p>Java class for ACHAddendaArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHAddendaArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHAddendaInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAddendaInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHAddendaArray_AType", propOrder = {
    "achAddendaInfoRec"
})
public class ACHAddendaArrayAType {

    @XmlElement(name = "ACHAddendaInfoRec")
    protected List<ACHAddendaInfoRecCType> achAddendaInfoRec;

    /**
     * Gets the value of the achAddendaInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achAddendaInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACHAddendaInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACHAddendaInfoRecCType }
     * 
     * 
     */
    public List<ACHAddendaInfoRecCType> getACHAddendaInfoRec() {
        if (achAddendaInfoRec == null) {
            achAddendaInfoRec = new ArrayList<ACHAddendaInfoRecCType>();
        }
        return this.achAddendaInfoRec;
    }

}
