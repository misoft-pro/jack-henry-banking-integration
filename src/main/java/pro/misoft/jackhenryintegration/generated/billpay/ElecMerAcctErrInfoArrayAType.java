
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of electronic merchant errors that require
 *                 remediation
 * 
 * <p>Java class for ElecMerAcctErrInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecMerAcctErrInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecMerAcctErrInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ElecMerAcctErrInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElecMerAcctErrInfoArray_AType", propOrder = {
    "elecMerAcctErrInfoRec"
})
public class ElecMerAcctErrInfoArrayAType {

    @XmlElement(name = "ElecMerAcctErrInfoRec")
    protected List<ElecMerAcctErrInfoRecCType> elecMerAcctErrInfoRec;

    /**
     * Gets the value of the elecMerAcctErrInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elecMerAcctErrInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElecMerAcctErrInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElecMerAcctErrInfoRecCType }
     * 
     * 
     */
    public List<ElecMerAcctErrInfoRecCType> getElecMerAcctErrInfoRec() {
        if (elecMerAcctErrInfoRec == null) {
            elecMerAcctErrInfoRec = new ArrayList<ElecMerAcctErrInfoRecCType>();
        }
        return this.elecMerAcctErrInfoRec;
    }

}
