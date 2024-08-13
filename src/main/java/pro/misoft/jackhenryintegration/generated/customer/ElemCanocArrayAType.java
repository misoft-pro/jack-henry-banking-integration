
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of canonical values as related to a specific
 *     element
 * 
 * <p>Java class for ElemCanocArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElemCanocArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElemCanocRec" type="{http://jackhenry.com/jxchange/TPG/2008}ElemCanocRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElemCanocArray_AType", propOrder = {
    "elemCanocRec"
})
public class ElemCanocArrayAType {

    @XmlElement(name = "ElemCanocRec")
    protected List<ElemCanocRecCType> elemCanocRec;

    /**
     * Gets the value of the elemCanocRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elemCanocRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElemCanocRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElemCanocRecCType }
     * 
     * 
     */
    public List<ElemCanocRecCType> getElemCanocRec() {
        if (elemCanocRec == null) {
            elemCanocRec = new ArrayList<ElemCanocRecCType>();
        }
        return this.elemCanocRec;
    }

}
