
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of loan stop functions 
 * 
 * <p>Java class for LnStopInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnStopInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnStopFuncInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnStopFuncInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LnStopInfoArray_AType", propOrder = {
    "lnStopFuncInfo"
})
public class LnStopInfoArrayAType {

    @XmlElement(name = "LnStopFuncInfo", nillable = true)
    protected List<LnStopFuncInfoCType> lnStopFuncInfo;

    /**
     * Gets the value of the lnStopFuncInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnStopFuncInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnStopFuncInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LnStopFuncInfoCType }
     * 
     * 
     */
    public List<LnStopFuncInfoCType> getLnStopFuncInfo() {
        if (lnStopFuncInfo == null) {
            lnStopFuncInfo = new ArrayList<LnStopFuncInfoCType>();
        }
        return this.lnStopFuncInfo;
    }

}
