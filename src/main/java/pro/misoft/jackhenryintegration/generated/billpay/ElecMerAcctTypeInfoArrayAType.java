
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of electronic merchant account types
 * 
 * <p>Java class for ElecMerAcctTypeInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecMerAcctTypeInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecMerAcctTypeInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAcctTypeInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElecMerAcctTypeInfoArray_AType", propOrder = {
    "elecMerAcctTypeInfoRec"
})
public class ElecMerAcctTypeInfoArrayAType {

    @XmlElement(name = "ElecMerAcctTypeInfoRec")
    protected List<ElecMerAcctTypeInfoRecCType> elecMerAcctTypeInfoRec;

    /**
     * Gets the value of the elecMerAcctTypeInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elecMerAcctTypeInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElecMerAcctTypeInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElecMerAcctTypeInfoRecCType }
     * 
     * 
     */
    public List<ElecMerAcctTypeInfoRecCType> getElecMerAcctTypeInfoRec() {
        if (elecMerAcctTypeInfoRec == null) {
            elecMerAcctTypeInfoRec = new ArrayList<ElecMerAcctTypeInfoRecCType>();
        }
        return this.elecMerAcctTypeInfoRec;
    }

}
