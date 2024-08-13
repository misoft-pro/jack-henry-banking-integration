
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of elements that indicates the restrictions that could exist on
 *                 the transfer account
 * 
 * <p>Java class for XferSrcDestRstrArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferSrcDestRstrArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferSrcDestRstrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcDestRstrInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferSrcDestRstrArray_AType", propOrder = {
    "xferSrcDestRstrInfo"
})
public class XferSrcDestRstrArrayAType {

    @XmlElement(name = "XferSrcDestRstrInfo")
    protected List<XferSrcDestRstrInfoCType> xferSrcDestRstrInfo;

    /**
     * Gets the value of the xferSrcDestRstrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferSrcDestRstrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferSrcDestRstrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XferSrcDestRstrInfoCType }
     * 
     * 
     */
    public List<XferSrcDestRstrInfoCType> getXferSrcDestRstrInfo() {
        if (xferSrcDestRstrInfo == null) {
            xferSrcDestRstrInfo = new ArrayList<XferSrcDestRstrInfoCType>();
        }
        return this.xferSrcDestRstrInfo;
    }

}
