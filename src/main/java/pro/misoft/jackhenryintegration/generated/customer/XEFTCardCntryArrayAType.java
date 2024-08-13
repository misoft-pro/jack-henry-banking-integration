
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The array of countries that impacts EFT Transaction
 *    
 * 
 * <p>Java class for x_EFTCardCntryArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_EFTCardCntryArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardCntryInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardCntryInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_EFTCardCntryArray_AType", propOrder = {
    "eftCardCntryInfo"
})
public class XEFTCardCntryArrayAType {

    @XmlElement(name = "EFTCardCntryInfo", nillable = true)
    protected List<EFTCardCntryInfoCType> eftCardCntryInfo;

    /**
     * Gets the value of the eftCardCntryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardCntryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardCntryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardCntryInfoCType }
     * 
     * 
     */
    public List<EFTCardCntryInfoCType> getEFTCardCntryInfo() {
        if (eftCardCntryInfo == null) {
            eftCardCntryInfo = new ArrayList<EFTCardCntryInfoCType>();
        }
        return this.eftCardCntryInfo;
    }

}
