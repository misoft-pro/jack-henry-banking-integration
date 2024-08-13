
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Service Options available for the
 *                 product.
 * 
 * <p>Java class for ProdSvcOptArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdSvcOptArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProdSvcOptInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ProdSvcOptInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdSvcOptArray_AType", propOrder = {
    "prodSvcOptInfoRec"
})
public class ProdSvcOptArrayAType {

    @XmlElement(name = "ProdSvcOptInfoRec")
    protected List<ProdSvcOptInfoCType> prodSvcOptInfoRec;

    /**
     * Gets the value of the prodSvcOptInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodSvcOptInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdSvcOptInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdSvcOptInfoCType }
     * 
     * 
     */
    public List<ProdSvcOptInfoCType> getProdSvcOptInfoRec() {
        if (prodSvcOptInfoRec == null) {
            prodSvcOptInfoRec = new ArrayList<ProdSvcOptInfoCType>();
        }
        return this.prodSvcOptInfoRec;
    }

}
