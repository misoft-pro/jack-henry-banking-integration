
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of applications to determine count qualifications
 *                 for waiving service charges
 * 
 * <p>Java class for SerChgLvlAppCntArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgLvlAppCntArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlAppCntInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAppCntInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerChgLvlAppCntArray_AType", propOrder = {
    "serChgLvlAppCntInfoRec"
})
public class SerChgLvlAppCntArrayAType {

    @XmlElement(name = "SerChgLvlAppCntInfoRec")
    protected List<SerChgLvlAppCntInfoRecCType> serChgLvlAppCntInfoRec;

    /**
     * Gets the value of the serChgLvlAppCntInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serChgLvlAppCntInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerChgLvlAppCntInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerChgLvlAppCntInfoRecCType }
     * 
     * 
     */
    public List<SerChgLvlAppCntInfoRecCType> getSerChgLvlAppCntInfoRec() {
        if (serChgLvlAppCntInfoRec == null) {
            serChgLvlAppCntInfoRec = new ArrayList<SerChgLvlAppCntInfoRecCType>();
        }
        return this.serChgLvlAppCntInfoRec;
    }

}
