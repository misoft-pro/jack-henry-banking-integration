
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for borrowers
 *     income
 * 
 * <p>Java class for ColIncmArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColIncmArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColIncmInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ColIncmInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColIncmArray_AType", propOrder = {
    "colIncmInfo"
})
public class ColIncmArrayAType {

    @XmlElement(name = "ColIncmInfo")
    protected List<ColIncmInfoCType> colIncmInfo;

    /**
     * Gets the value of the colIncmInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colIncmInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColIncmInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColIncmInfoCType }
     * 
     * 
     */
    public List<ColIncmInfoCType> getColIncmInfo() {
        if (colIncmInfo == null) {
            colIncmInfo = new ArrayList<ColIncmInfoCType>();
        }
        return this.colIncmInfo;
    }

}
