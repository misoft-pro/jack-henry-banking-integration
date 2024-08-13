
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of Due Diligence requirements completed by
 *                 supported Provider 
 * 
 * <p>Java class for DueDilgntCmpltArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DueDilgntCmpltArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DueDilgntCmpltInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DueDilgntCmpltInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DueDilgntCmpltArray_AType", propOrder = {
    "dueDilgntCmpltInfo"
})
public class DueDilgntCmpltArrayAType {

    @XmlElement(name = "DueDilgntCmpltInfo")
    protected List<DueDilgntCmpltInfoCType> dueDilgntCmpltInfo;

    /**
     * Gets the value of the dueDilgntCmpltInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dueDilgntCmpltInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDueDilgntCmpltInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DueDilgntCmpltInfoCType }
     * 
     * 
     */
    public List<DueDilgntCmpltInfoCType> getDueDilgntCmpltInfo() {
        if (dueDilgntCmpltInfo == null) {
            dueDilgntCmpltInfo = new ArrayList<DueDilgntCmpltInfoCType>();
        }
        return this.dueDilgntCmpltInfo;
    }

}
