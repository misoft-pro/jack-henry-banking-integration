
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of filters available for the service
 *     dictionary service.
 * 
 * <p>Java class for SvcDictFilterArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDictFilterArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcDictFilterInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SvcDictFilterInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcDictFilterArray_AType", propOrder = {
    "svcDictFilterInfo"
})
public class SvcDictFilterArrayAType {

    @XmlElement(name = "SvcDictFilterInfo", nillable = true)
    protected List<SvcDictFilterInfoCType> svcDictFilterInfo;

    /**
     * Gets the value of the svcDictFilterInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcDictFilterInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcDictFilterInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcDictFilterInfoCType }
     * 
     * 
     */
    public List<SvcDictFilterInfoCType> getSvcDictFilterInfo() {
        if (svcDictFilterInfo == null) {
            svcDictFilterInfo = new ArrayList<SvcDictFilterInfoCType>();
        }
        return this.svcDictFilterInfo;
    }

}
