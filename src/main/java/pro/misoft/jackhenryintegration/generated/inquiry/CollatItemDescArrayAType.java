
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of Collateral item descriptions
 *             
 * 
 * <p>Java class for CollatItemDescArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatItemDescArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatItemDescInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemDescInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollatItemDescArray_AType", propOrder = {
    "collatItemDescInfo"
})
public class CollatItemDescArrayAType {

    @XmlElement(name = "CollatItemDescInfo", nillable = true)
    protected List<CollatItemDescInfoCType> collatItemDescInfo;

    /**
     * Gets the value of the collatItemDescInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collatItemDescInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollatItemDescInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollatItemDescInfoCType }
     * 
     * 
     */
    public List<CollatItemDescInfoCType> getCollatItemDescInfo() {
        if (collatItemDescInfo == null) {
            collatItemDescInfo = new ArrayList<CollatItemDescInfoCType>();
        }
        return this.collatItemDescInfo;
    }

}
