
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of balances for tier service
 *                 charges
 * 
 * <p>Java class for SerChgTierBalInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgTierBalInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgTierBalInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgTierBalInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerChgTierBalInfoArray_AType", propOrder = {
    "serChgTierBalInfoRec"
})
public class SerChgTierBalInfoArrayAType {

    @XmlElement(name = "SerChgTierBalInfoRec")
    protected List<SerChgTierBalInfoRecCType> serChgTierBalInfoRec;

    /**
     * Gets the value of the serChgTierBalInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serChgTierBalInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerChgTierBalInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerChgTierBalInfoRecCType }
     * 
     * 
     */
    public List<SerChgTierBalInfoRecCType> getSerChgTierBalInfoRec() {
        if (serChgTierBalInfoRec == null) {
            serChgTierBalInfoRec = new ArrayList<SerChgTierBalInfoRecCType>();
        }
        return this.serChgTierBalInfoRec;
    }

}
