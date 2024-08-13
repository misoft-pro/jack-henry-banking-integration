
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - The response of payments 
 * 
 * <p>Java class for PmtRqRsArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtRqRsArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtRqRsInfo" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRqRsInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtRqRsArray_AType", propOrder = {
    "pmtRqRsInfo"
})
public class PmtRqRsArrayAType {

    @XmlElement(name = "PmtRqRsInfo", nillable = true)
    protected List<PmtRqRsInfoCType> pmtRqRsInfo;

    /**
     * Gets the value of the pmtRqRsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtRqRsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtRqRsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtRqRsInfoCType }
     * 
     * 
     */
    public List<PmtRqRsInfoCType> getPmtRqRsInfo() {
        if (pmtRqRsInfo == null) {
            pmtRqRsInfo = new ArrayList<PmtRqRsInfoCType>();
        }
        return this.pmtRqRsInfo;
    }

}
