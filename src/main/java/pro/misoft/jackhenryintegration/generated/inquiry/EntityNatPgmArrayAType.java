
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of entity national program names
 *    
 * 
 * <p>Java class for EntityNatPgmArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityNatPgmArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityNatPgmRec" type="{http://jackhenry.com/jxchange/TPG/2008}EntityNatPgmRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityNatPgmArray_AType", propOrder = {
    "entityNatPgmRec"
})
public class EntityNatPgmArrayAType {

    @XmlElement(name = "EntityNatPgmRec")
    protected List<EntityNatPgmRecCType> entityNatPgmRec;

    /**
     * Gets the value of the entityNatPgmRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityNatPgmRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityNatPgmRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityNatPgmRecCType }
     * 
     * 
     */
    public List<EntityNatPgmRecCType> getEntityNatPgmRec() {
        if (entityNatPgmRec == null) {
            entityNatPgmRec = new ArrayList<EntityNatPgmRecCType>();
        }
        return this.entityNatPgmRec;
    }

}
