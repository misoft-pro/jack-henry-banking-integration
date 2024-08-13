
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of levels with qualifications for account
 *                 relationship service charges
 * 
 * <p>Java class for SerChgLvlArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgLvlArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerChgLvlArray_AType", propOrder = {
    "serChgLvlInfoRec"
})
public class SerChgLvlArrayAType {

    @XmlElement(name = "SerChgLvlInfoRec")
    protected List<SerChgLvlInfoRecCType> serChgLvlInfoRec;

    /**
     * Gets the value of the serChgLvlInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serChgLvlInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerChgLvlInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SerChgLvlInfoRecCType }
     * 
     * 
     */
    public List<SerChgLvlInfoRecCType> getSerChgLvlInfoRec() {
        if (serChgLvlInfoRec == null) {
            serChgLvlInfoRec = new ArrayList<SerChgLvlInfoRecCType>();
        }
        return this.serChgLvlInfoRec;
    }

}
