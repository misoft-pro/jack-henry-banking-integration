
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of escrow payments and balances and related
 *                 elements 
 * 
 * <p>Java class for EscrwPmtBalArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwPmtBalArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwPmtBalInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtBalInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EscrwPmtBalArray_AType", propOrder = {
    "escrwPmtBalInfo"
})
public class EscrwPmtBalArrayAType {

    @XmlElement(name = "EscrwPmtBalInfo", nillable = true)
    protected List<EscrwPmtBalInfoCType> escrwPmtBalInfo;

    /**
     * Gets the value of the escrwPmtBalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escrwPmtBalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscrwPmtBalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EscrwPmtBalInfoCType }
     * 
     * 
     */
    public List<EscrwPmtBalInfoCType> getEscrwPmtBalInfo() {
        if (escrwPmtBalInfo == null) {
            escrwPmtBalInfo = new ArrayList<EscrwPmtBalInfoCType>();
        }
        return this.escrwPmtBalInfo;
    }

}
