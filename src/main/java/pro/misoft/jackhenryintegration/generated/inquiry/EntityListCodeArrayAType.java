
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of entity list codes
 * 
 * <p>Java class for EntityListCodeArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityListCodeArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityListCodeRec" type="{http://jackhenry.com/jxchange/TPG/2008}EntityListCodeRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityListCodeArray_AType", propOrder = {
    "entityListCodeRec"
})
public class EntityListCodeArrayAType {

    @XmlElement(name = "EntityListCodeRec")
    protected List<EntityListCodeRecCType> entityListCodeRec;

    /**
     * Gets the value of the entityListCodeRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityListCodeRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityListCodeRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityListCodeRecCType }
     * 
     * 
     */
    public List<EntityListCodeRecCType> getEntityListCodeRec() {
        if (entityListCodeRec == null) {
            entityListCodeRec = new ArrayList<EntityListCodeRecCType>();
        }
        return this.entityListCodeRec;
    }

}
