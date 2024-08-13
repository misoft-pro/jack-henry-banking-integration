
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses for Transaction Item
 *     Search
 * 
 * <p>Java class for TrnSetItemSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnSetItemSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnSetItemSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrnSetItemSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnSetItemSrchArray_AType", propOrder = {
    "trnSetItemSrchRec"
})
public class TrnSetItemSrchArrayAType {

    @XmlElement(name = "TrnSetItemSrchRec")
    protected List<TrnSetItemSrchRecCType> trnSetItemSrchRec;

    /**
     * Gets the value of the trnSetItemSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnSetItemSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnSetItemSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrnSetItemSrchRecCType }
     * 
     * 
     */
    public List<TrnSetItemSrchRecCType> getTrnSetItemSrchRec() {
        if (trnSetItemSrchRec == null) {
            trnSetItemSrchRec = new ArrayList<TrnSetItemSrchRecCType>();
        }
        return this.trnSetItemSrchRec;
    }

}
