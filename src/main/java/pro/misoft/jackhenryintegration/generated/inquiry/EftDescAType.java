
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of EFT Descriptions 
 * 
 * <p>Java class for EftDesc_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EftDesc_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EftDescInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EftDescInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EftDesc_AType", propOrder = {
    "eftDescInfo"
})
public class EftDescAType {

    @XmlElement(name = "EftDescInfo", nillable = true)
    protected List<EftDescInfoCType> eftDescInfo;

    /**
     * Gets the value of the eftDescInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eftDescInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEftDescInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EftDescInfoCType }
     * 
     * 
     */
    public List<EftDescInfoCType> getEftDescInfo() {
        if (eftDescInfo == null) {
            eftDescInfo = new ArrayList<EftDescInfoCType>();
        }
        return this.eftDescInfo;
    }

}
