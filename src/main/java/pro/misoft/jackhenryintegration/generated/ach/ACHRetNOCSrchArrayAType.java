
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for ACH returns and
 *     NOC
 * 
 * <p>Java class for ACHRetNOCSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHRetNOCSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHRetNOCSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetNOCSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHRetNOCSrchArray_AType", propOrder = {
    "achRetNOCSrchRec"
})
public class ACHRetNOCSrchArrayAType {

    @XmlElement(name = "ACHRetNOCSrchRec")
    protected List<ACHRetNOCSrchRecCType> achRetNOCSrchRec;

    /**
     * Gets the value of the achRetNOCSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achRetNOCSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACHRetNOCSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACHRetNOCSrchRecCType }
     * 
     * 
     */
    public List<ACHRetNOCSrchRecCType> getACHRetNOCSrchRec() {
        if (achRetNOCSrchRec == null) {
            achRetNOCSrchRec = new ArrayList<ACHRetNOCSrchRecCType>();
        }
        return this.achRetNOCSrchRec;
    }

}
