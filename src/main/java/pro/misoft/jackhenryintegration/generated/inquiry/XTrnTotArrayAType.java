
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of Historical Transaction Information
 *    
 * 
 * <p>Java class for x_TrnTotArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_TrnTotArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnTotInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrnTotInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_TrnTotArray_AType", propOrder = {
    "trnTotInfo"
})
public class XTrnTotArrayAType {

    @XmlElement(name = "TrnTotInfo", nillable = true)
    protected List<TrnTotInfoCType> trnTotInfo;

    /**
     * Gets the value of the trnTotInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnTotInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnTotInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrnTotInfoCType }
     * 
     * 
     */
    public List<TrnTotInfoCType> getTrnTotInfo() {
        if (trnTotInfo == null) {
            trnTotInfo = new ArrayList<TrnTotInfoCType>();
        }
        return this.trnTotInfo;
    }

}
