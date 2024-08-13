
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Platform Companion
 *                 Products
 * 
 * <p>Java class for CrossSellProdArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossSellProdArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrossSellProdInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrossSellProdInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossSellProdArray_AType", propOrder = {
    "crossSellProdInfoRec"
})
public class CrossSellProdArrayAType {

    @XmlElement(name = "CrossSellProdInfoRec")
    protected List<CrossSellProdInfoRecCType> crossSellProdInfoRec;

    /**
     * Gets the value of the crossSellProdInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossSellProdInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossSellProdInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossSellProdInfoRecCType }
     * 
     * 
     */
    public List<CrossSellProdInfoRecCType> getCrossSellProdInfoRec() {
        if (crossSellProdInfoRec == null) {
            crossSellProdInfoRec = new ArrayList<CrossSellProdInfoRecCType>();
        }
        return this.crossSellProdInfoRec;
    }

}
