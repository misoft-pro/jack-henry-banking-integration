
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of applications to determine balance
 *                 qualifications for waiving service charges
 * 
 * <p>Java class for SerChgLvlAppAmtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgLvlAppAmtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlAppAmtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAppAmtInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerChgLvlAppAmtArray_AType", propOrder = {
    "serChgLvlAppAmtInfoRec"
})
public class SerChgLvlAppAmtArrayAType {

    @XmlElement(name = "SerChgLvlAppAmtInfoRec")
    protected List<SerChgLvlAppAmtInfoRecCType> serChgLvlAppAmtInfoRec;

    /**
     * Gets the value of the serChgLvlAppAmtInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serChgLvlAppAmtInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerChgLvlAppAmtInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerChgLvlAppAmtInfoRecCType }
     * 
     * 
     */
    public List<SerChgLvlAppAmtInfoRecCType> getSerChgLvlAppAmtInfoRec() {
        if (serChgLvlAppAmtInfoRec == null) {
            serChgLvlAppAmtInfoRec = new ArrayList<SerChgLvlAppAmtInfoRecCType>();
        }
        return this.serChgLvlAppAmtInfoRec;
    }

}
