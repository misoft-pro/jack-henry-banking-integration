
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of ACH international addenda
 *                 records
 * 
 * <p>Java class for ACHIntlAddendaArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHIntlAddendaArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHIntlAddendaInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIntlAddendaInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHIntlAddendaArray_AType", propOrder = {
    "achIntlAddendaInfoRec"
})
public class ACHIntlAddendaArrayAType {

    @XmlElement(name = "ACHIntlAddendaInfoRec")
    protected List<ACHIntlAddendaInfoRecCType> achIntlAddendaInfoRec;

    /**
     * Gets the value of the achIntlAddendaInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achIntlAddendaInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACHIntlAddendaInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACHIntlAddendaInfoRecCType }
     * 
     * 
     */
    public List<ACHIntlAddendaInfoRecCType> getACHIntlAddendaInfoRec() {
        if (achIntlAddendaInfoRec == null) {
            achIntlAddendaInfoRec = new ArrayList<ACHIntlAddendaInfoRecCType>();
        }
        return this.achIntlAddendaInfoRec;
    }

}
