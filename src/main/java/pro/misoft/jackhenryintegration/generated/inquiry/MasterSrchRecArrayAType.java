
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for Multi Level Lending (MLL)
 *     search for the master loan records.
 * 
 * <p>Java class for MasterSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}MasterSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterSrchRecArray_AType", propOrder = {
    "masterSrchRec"
})
public class MasterSrchRecArrayAType {

    @XmlElement(name = "MasterSrchRec")
    protected List<MasterSrchRecCType> masterSrchRec;

    /**
     * Gets the value of the masterSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterSrchRecCType }
     * 
     * 
     */
    public List<MasterSrchRecCType> getMasterSrchRec() {
        if (masterSrchRec == null) {
            masterSrchRec = new ArrayList<MasterSrchRecCType>();
        }
        return this.masterSrchRec;
    }

}
