
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of float amount by expiration date
 *                 related to a specific account
 * 
 * <p>Java class for x_AcctBalFltAmtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_AcctBalFltAmtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctBalFltAmtRec" type="{http://jackhenry.com/jxchange/TPG/2008}AcctBalFltAmtRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_AcctBalFltAmtArray_AType", propOrder = {
    "acctBalFltAmtRec"
})
public class XAcctBalFltAmtArrayAType {

    @XmlElement(name = "AcctBalFltAmtRec")
    protected List<AcctBalFltAmtRecCType> acctBalFltAmtRec;

    /**
     * Gets the value of the acctBalFltAmtRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBalFltAmtRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBalFltAmtRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBalFltAmtRecCType }
     * 
     * 
     */
    public List<AcctBalFltAmtRecCType> getAcctBalFltAmtRec() {
        if (acctBalFltAmtRec == null) {
            acctBalFltAmtRec = new ArrayList<AcctBalFltAmtRecCType>();
        }
        return this.acctBalFltAmtRec;
    }

}
