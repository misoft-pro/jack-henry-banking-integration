
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of reponses for escrow flood insurance
 *     search.
 * 
 * <p>Java class for x_EscrwFldInsurArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_EscrwFldInsurArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwFldInsur" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwFldInsur_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_EscrwFldInsurArray_AType", propOrder = {
    "escrwFldInsur"
})
public class XEscrwFldInsurArrayAType {

    @XmlElement(name = "EscrwFldInsur")
    protected List<EscrwFldInsurCType> escrwFldInsur;

    /**
     * Gets the value of the escrwFldInsur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escrwFldInsur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscrwFldInsur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EscrwFldInsurCType }
     * 
     * 
     */
    public List<EscrwFldInsurCType> getEscrwFldInsur() {
        if (escrwFldInsur == null) {
            escrwFldInsur = new ArrayList<EscrwFldInsurCType>();
        }
        return this.escrwFldInsur;
    }

}
