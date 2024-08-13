
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of addresses related to an entity
 *    
 * 
 * <p>Java class for EntityAddrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityAddrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityAddrRec" type="{http://jackhenry.com/jxchange/TPG/2008}EntityAddrRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityAddrArray_AType", propOrder = {
    "entityAddrRec"
})
public class EntityAddrArrayAType {

    @XmlElement(name = "EntityAddrRec")
    protected List<EntityAddrRecCType> entityAddrRec;

    /**
     * Gets the value of the entityAddrRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityAddrRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityAddrRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityAddrRecCType }
     * 
     * 
     */
    public List<EntityAddrRecCType> getEntityAddrRec() {
        if (entityAddrRec == null) {
            entityAddrRec = new ArrayList<EntityAddrRecCType>();
        }
        return this.entityAddrRec;
    }

}
