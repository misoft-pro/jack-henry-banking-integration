
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array remittance information for
 *                 payment
 * 
 * <p>Java class for RemitPmtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemitPmtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemitPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}RemitPmtInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemitPmtArray_AType", propOrder = {
    "remitPmtInfo"
})
public class RemitPmtArrayAType {

    @XmlElement(name = "RemitPmtInfo")
    protected List<RemitPmtInfoCType> remitPmtInfo;

    /**
     * Gets the value of the remitPmtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remitPmtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemitPmtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemitPmtInfoCType }
     * 
     * 
     */
    public List<RemitPmtInfoCType> getRemitPmtInfo() {
        if (remitPmtInfo == null) {
            remitPmtInfo = new ArrayList<RemitPmtInfoCType>();
        }
        return this.remitPmtInfo;
    }

}
