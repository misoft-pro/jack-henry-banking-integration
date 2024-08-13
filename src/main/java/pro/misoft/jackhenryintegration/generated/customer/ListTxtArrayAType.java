
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of bullet list items
 * 
 * <p>Java class for ListTxtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListTxtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListTxtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ListTxtInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTxtArray_AType", propOrder = {
    "listTxtInfoRec"
})
public class ListTxtArrayAType {

    @XmlElement(name = "ListTxtInfoRec")
    protected List<ListTxtInfoRecCType> listTxtInfoRec;

    /**
     * Gets the value of the listTxtInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listTxtInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListTxtInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListTxtInfoRecCType }
     * 
     * 
     */
    public List<ListTxtInfoRecCType> getListTxtInfoRec() {
        if (listTxtInfoRec == null) {
            listTxtInfoRec = new ArrayList<ListTxtInfoRecCType>();
        }
        return this.listTxtInfoRec;
    }

}
