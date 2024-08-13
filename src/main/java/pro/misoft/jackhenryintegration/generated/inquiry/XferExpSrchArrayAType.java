
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of expiring transfers
 * 
 * <p>Java class for XferExpSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferExpSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferExpSrchInfo" type="{http://jackhenry.com/jxchange/TPG/2008}XferExpSrchInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferExpSrchArray_AType", propOrder = {
    "xferExpSrchInfo"
})
public class XferExpSrchArrayAType {

    @XmlElement(name = "XferExpSrchInfo")
    protected List<XferExpSrchInfoCType> xferExpSrchInfo;

    /**
     * Gets the value of the xferExpSrchInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferExpSrchInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferExpSrchInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XferExpSrchInfoCType }
     * 
     * 
     */
    public List<XferExpSrchInfoCType> getXferExpSrchInfo() {
        if (xferExpSrchInfo == null) {
            xferExpSrchInfo = new ArrayList<XferExpSrchInfoCType>();
        }
        return this.xferExpSrchInfo;
    }

}
