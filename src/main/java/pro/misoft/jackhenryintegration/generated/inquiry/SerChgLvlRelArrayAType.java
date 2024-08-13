
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of account relationships that is considered for
 *                 account override service charges
 * 
 * <p>Java class for SerChgLvlRelArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgLvlRelArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlRelInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlRelInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerChgLvlRelArray_AType", propOrder = {
    "serChgLvlRelInfoRec"
})
public class SerChgLvlRelArrayAType {

    @XmlElement(name = "SerChgLvlRelInfoRec")
    protected List<SerChgLvlRelInfoRecCType> serChgLvlRelInfoRec;

    /**
     * Gets the value of the serChgLvlRelInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serChgLvlRelInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerChgLvlRelInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerChgLvlRelInfoRecCType }
     * 
     * 
     */
    public List<SerChgLvlRelInfoRecCType> getSerChgLvlRelInfoRec() {
        if (serChgLvlRelInfoRec == null) {
            serChgLvlRelInfoRec = new ArrayList<SerChgLvlRelInfoRecCType>();
        }
        return this.serChgLvlRelInfoRec;
    }

}
