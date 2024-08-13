
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of ACH Exposure limits
 * 
 * <p>Java class for ACHExpsrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHExpsrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHExpsrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExpsrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHExpsrArray_AType", propOrder = {
    "achExpsrInfo"
})
public class ACHExpsrArrayAType {

    @XmlElement(name = "ACHExpsrInfo", nillable = true)
    protected List<ACHExpsrInfoCType> achExpsrInfo;

    /**
     * Gets the value of the achExpsrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achExpsrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACHExpsrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACHExpsrInfoCType }
     * 
     * 
     */
    public List<ACHExpsrInfoCType> getACHExpsrInfo() {
        if (achExpsrInfo == null) {
            achExpsrInfo = new ArrayList<ACHExpsrInfoCType>();
        }
        return this.achExpsrInfo;
    }

}
