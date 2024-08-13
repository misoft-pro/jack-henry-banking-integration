
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - Free Form array of address lines 1 - 11 in a
 *                 printable/usable form - Generally not parsed 
 * 
 * <p>Java class for FreeFormAddr_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeFormAddr_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddrLineInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AddrLineInfo_CType" maxOccurs="11" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeFormAddr_AType", propOrder = {
    "addrLineInfo"
})
public class FreeFormAddrAType {

    @XmlElement(name = "AddrLineInfo", nillable = true)
    protected List<AddrLineInfoCType> addrLineInfo;

    /**
     * Gets the value of the addrLineInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addrLineInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddrLineInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddrLineInfoCType }
     * 
     * 
     */
    public List<AddrLineInfoCType> getAddrLineInfo() {
        if (addrLineInfo == null) {
            addrLineInfo = new ArrayList<AddrLineInfoCType>();
        }
        return this.addrLineInfo;
    }

}
