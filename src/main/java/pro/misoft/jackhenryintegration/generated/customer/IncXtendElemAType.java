
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - List of "x_" element by name which are to be
 *                 included in the response
 * 
 * <p>Java class for IncXtendElem_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncXtendElem_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncXtendElemInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IncXtendElemInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncXtendElem_AType", propOrder = {
    "incXtendElemInfo"
})
public class IncXtendElemAType {

    @XmlElement(name = "IncXtendElemInfo", nillable = true)
    protected List<IncXtendElemInfoCType> incXtendElemInfo;

    /**
     * Gets the value of the incXtendElemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incXtendElemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncXtendElemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncXtendElemInfoCType }
     * 
     * 
     */
    public List<IncXtendElemInfoCType> getIncXtendElemInfo() {
        if (incXtendElemInfo == null) {
            incXtendElemInfo = new ArrayList<IncXtendElemInfoCType>();
        }
        return this.incXtendElemInfo;
    }

}
