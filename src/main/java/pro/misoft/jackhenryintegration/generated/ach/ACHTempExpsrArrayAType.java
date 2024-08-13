
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of ACH Temporary Exposure
 *                 limits
 * 
 * <p>Java class for ACHTempExpsrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHTempExpsrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHTempExpsrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTempExpsrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACHTempExpsrArray_AType", propOrder = {
    "achTempExpsrInfo"
})
public class ACHTempExpsrArrayAType {

    @XmlElement(name = "ACHTempExpsrInfo", nillable = true)
    protected List<ACHTempExpsrInfoCType> achTempExpsrInfo;

    /**
     * Gets the value of the achTempExpsrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achTempExpsrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACHTempExpsrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACHTempExpsrInfoCType }
     * 
     * 
     */
    public List<ACHTempExpsrInfoCType> getACHTempExpsrInfo() {
        if (achTempExpsrInfo == null) {
            achTempExpsrInfo = new ArrayList<ACHTempExpsrInfoCType>();
        }
        return this.achTempExpsrInfo;
    }

}
