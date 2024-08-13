
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of submitted account identifications for a transaction
 *     quote
 * 
 * <p>Java class for TrnAddQuoteRqArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnAddQuoteRqArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnAddQuoteInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAddQuoteInfo_CType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnAddQuoteRqArray_AType", propOrder = {
    "trnAddQuoteInfo"
})
public class TrnAddQuoteRqArrayAType {

    @XmlElement(name = "TrnAddQuoteInfo", required = true)
    protected List<TrnAddQuoteInfoCType> trnAddQuoteInfo;

    /**
     * Gets the value of the trnAddQuoteInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnAddQuoteInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnAddQuoteInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrnAddQuoteInfoCType }
     * 
     * 
     */
    public List<TrnAddQuoteInfoCType> getTrnAddQuoteInfo() {
        if (trnAddQuoteInfo == null) {
            trnAddQuoteInfo = new ArrayList<TrnAddQuoteInfoCType>();
        }
        return this.trnAddQuoteInfo;
    }

}
