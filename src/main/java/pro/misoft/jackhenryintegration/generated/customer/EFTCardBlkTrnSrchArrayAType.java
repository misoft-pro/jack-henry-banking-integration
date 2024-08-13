
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of EFT card blocked transacation settings 
 * 
 * <p>Java class for EFTCardBlkTrnSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardBlkTrnSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardBlkTrnSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardBlkTrnSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardBlkTrnSrchArray_AType", propOrder = {
    "eftCardBlkTrnSrchRec"
})
public class EFTCardBlkTrnSrchArrayAType {

    @XmlElement(name = "EFTCardBlkTrnSrchRec")
    protected List<EFTCardBlkTrnSrchRecCType> eftCardBlkTrnSrchRec;

    /**
     * Gets the value of the eftCardBlkTrnSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftCardBlkTrnSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFTCardBlkTrnSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFTCardBlkTrnSrchRecCType }
     * 
     * 
     */
    public List<EFTCardBlkTrnSrchRecCType> getEFTCardBlkTrnSrchRec() {
        if (eftCardBlkTrnSrchRec == null) {
            eftCardBlkTrnSrchRec = new ArrayList<EFTCardBlkTrnSrchRecCType>();
        }
        return this.eftCardBlkTrnSrchRec;
    }

}
