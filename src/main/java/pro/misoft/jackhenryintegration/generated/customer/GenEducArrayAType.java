
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of pertinent General Education
 *                 information
 * 
 * <p>Java class for GenEducArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenEducArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GenEducInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}GenEducInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenEducArray_AType", propOrder = {
    "genEducInfoRec"
})
public class GenEducArrayAType {

    @XmlElement(name = "GenEducInfoRec", nillable = true)
    protected List<GenEducInfoRecCType> genEducInfoRec;

    /**
     * Gets the value of the genEducInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genEducInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenEducInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenEducInfoRecCType }
     * 
     * 
     */
    public List<GenEducInfoRecCType> getGenEducInfoRec() {
        if (genEducInfoRec == null) {
            genEducInfoRec = new ArrayList<GenEducInfoRecCType>();
        }
        return this.genEducInfoRec;
    }

}
