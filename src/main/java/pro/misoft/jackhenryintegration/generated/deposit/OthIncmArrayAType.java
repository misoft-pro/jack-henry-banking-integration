
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of other monthly income for a loan
 *                 applicants
 * 
 * <p>Java class for OthIncmArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OthIncmArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OthIncmInfo" type="{http://jackhenry.com/jxchange/TPG/2008}OthIncmInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OthIncmArray_AType", propOrder = {
    "othIncmInfo"
})
public class OthIncmArrayAType {

    @XmlElement(name = "OthIncmInfo")
    protected List<OthIncmInfoCType> othIncmInfo;

    /**
     * Gets the value of the othIncmInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othIncmInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthIncmInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OthIncmInfoCType }
     * 
     * 
     */
    public List<OthIncmInfoCType> getOthIncmInfo() {
        if (othIncmInfo == null) {
            othIncmInfo = new ArrayList<OthIncmInfoCType>();
        }
        return this.othIncmInfo;
    }

}
