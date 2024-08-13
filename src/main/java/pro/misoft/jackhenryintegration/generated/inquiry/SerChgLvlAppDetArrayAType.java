
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of detail applications to determine balance
 *                 qualifications for waiving service charges
 * 
 * <p>Java class for SerChgLvlAppDetArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgLvlAppDetArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlAppDetInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAppDetInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerChgLvlAppDetArray_AType", propOrder = {
    "serChgLvlAppDetInfoRec"
})
public class SerChgLvlAppDetArrayAType {

    @XmlElement(name = "SerChgLvlAppDetInfoRec")
    protected List<SerChgLvlAppDetInfoRecCType> serChgLvlAppDetInfoRec;

    /**
     * Gets the value of the serChgLvlAppDetInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serChgLvlAppDetInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerChgLvlAppDetInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerChgLvlAppDetInfoRecCType }
     * 
     * 
     */
    public List<SerChgLvlAppDetInfoRecCType> getSerChgLvlAppDetInfoRec() {
        if (serChgLvlAppDetInfoRec == null) {
            serChgLvlAppDetInfoRec = new ArrayList<SerChgLvlAppDetInfoRecCType>();
        }
        return this.serChgLvlAppDetInfoRec;
    }

}
