
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of account identifications transfer from
 *                 permission set
 * 
 * <p>Java class for XferFromArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferFromArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferFromInfo" type="{http://jackhenry.com/jxchange/TPG/2008}XferFromInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferFromArray_AType", propOrder = {
    "xferFromInfo"
})
public class XferFromArrayAType {

    @XmlElement(name = "XferFromInfo", nillable = true)
    protected List<XferFromInfoCType> xferFromInfo;

    /**
     * Gets the value of the xferFromInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferFromInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferFromInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XferFromInfoCType }
     * 
     * 
     */
    public List<XferFromInfoCType> getXferFromInfo() {
        if (xferFromInfo == null) {
            xferFromInfo = new ArrayList<XferFromInfoCType>();
        }
        return this.xferFromInfo;
    }

}
