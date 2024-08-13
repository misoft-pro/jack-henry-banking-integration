
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Array of elements for positive pay iems
 * 
 * <p>Java class for PosPayItemSrchArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosPayItemSrchArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PosPayItemSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayItemSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosPayItemSrchArray_AType", propOrder = {
    "posPayItemSrchRec"
})
public class PosPayItemSrchArrayAType {

    @XmlElement(name = "PosPayItemSrchRec")
    protected List<PosPayItemSrchRecCType> posPayItemSrchRec;

    /**
     * Gets the value of the posPayItemSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posPayItemSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosPayItemSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PosPayItemSrchRecCType }
     * 
     * 
     */
    public List<PosPayItemSrchRecCType> getPosPayItemSrchRec() {
        if (posPayItemSrchRec == null) {
            posPayItemSrchRec = new ArrayList<PosPayItemSrchRecCType>();
        }
        return this.posPayItemSrchRec;
    }

}
