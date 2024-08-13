
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of messages that can be returned in a fault message
 *             
 * 
 * <p>Java class for FaultRecInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultRecInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FaultMsgRec" type="{http://jackhenry.com/jxchange/TPG/2008}FaultMsgRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultRecInfoArray_AType", propOrder = {
    "faultMsgRec"
})
public class FaultRecInfoArrayAType {

    @XmlElement(name = "FaultMsgRec")
    protected List<FaultMsgRecCType> faultMsgRec;

    /**
     * Gets the value of the faultMsgRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultMsgRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultMsgRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultMsgRecCType }
     * 
     * 
     */
    public List<FaultMsgRecCType> getFaultMsgRec() {
        if (faultMsgRec == null) {
            faultMsgRec = new ArrayList<FaultMsgRecCType>();
        }
        return this.faultMsgRec;
    }

}
