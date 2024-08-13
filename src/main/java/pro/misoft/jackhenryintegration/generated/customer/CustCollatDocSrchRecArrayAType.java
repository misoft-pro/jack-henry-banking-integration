
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of collateral documents.
 * 
 * <p>Java class for CustCollatDocSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustCollatDocSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustCollatDocSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}CustCollatDocSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustCollatDocSrchRecArray_AType", propOrder = {
    "custCollatDocSrchRec"
})
public class CustCollatDocSrchRecArrayAType {

    @XmlElement(name = "CustCollatDocSrchRec")
    protected List<CustCollatDocSrchRecCType> custCollatDocSrchRec;

    /**
     * Gets the value of the custCollatDocSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custCollatDocSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustCollatDocSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustCollatDocSrchRecCType }
     * 
     * 
     */
    public List<CustCollatDocSrchRecCType> getCustCollatDocSrchRec() {
        if (custCollatDocSrchRec == null) {
            custCollatDocSrchRec = new ArrayList<CustCollatDocSrchRecCType>();
        }
        return this.custCollatDocSrchRec;
    }

}
