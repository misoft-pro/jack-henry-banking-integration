
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Service Fee items related to the
 *                 product.
 * 
 * <p>Java class for ProdFeeArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdFeeArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProdFeeInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ProdFeeInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdFeeArray_AType", propOrder = {
    "prodFeeInfoRec"
})
public class ProdFeeArrayAType {

    @XmlElement(name = "ProdFeeInfoRec")
    protected List<ProdFeeInfoRecCType> prodFeeInfoRec;

    /**
     * Gets the value of the prodFeeInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodFeeInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdFeeInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdFeeInfoRecCType }
     * 
     * 
     */
    public List<ProdFeeInfoRecCType> getProdFeeInfoRec() {
        if (prodFeeInfoRec == null) {
            prodFeeInfoRec = new ArrayList<ProdFeeInfoRecCType>();
        }
        return this.prodFeeInfoRec;
    }

}
