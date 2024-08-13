
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of internet financial institutions cash
 *     management user identifications
 * 
 * <p>Java class for IntnetFinInstIdUsrInqArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstIdUsrInqArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntnetFinInstIdUsrRec" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstIdUsrRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntnetFinInstIdUsrInqArray_AType", propOrder = {
    "intnetFinInstIdUsrRec"
})
public class IntnetFinInstIdUsrInqArrayAType {

    @XmlElement(name = "IntnetFinInstIdUsrRec")
    protected List<IntnetFinInstIdUsrRecCType> intnetFinInstIdUsrRec;

    /**
     * Gets the value of the intnetFinInstIdUsrRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intnetFinInstIdUsrRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntnetFinInstIdUsrRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntnetFinInstIdUsrRecCType }
     * 
     * 
     */
    public List<IntnetFinInstIdUsrRecCType> getIntnetFinInstIdUsrRec() {
        if (intnetFinInstIdUsrRec == null) {
            intnetFinInstIdUsrRec = new ArrayList<IntnetFinInstIdUsrRecCType>();
        }
        return this.intnetFinInstIdUsrRec;
    }

}
