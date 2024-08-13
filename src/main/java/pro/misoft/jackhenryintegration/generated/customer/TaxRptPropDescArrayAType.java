
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of tax reporting property
 *                 descriptions
 * 
 * <p>Java class for TaxRptPropDescArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRptPropDescArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxRptPropDescRec" type="{http://jackhenry.com/jxchange/TPG/2008}TaxRptPropDescRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRptPropDescArray_AType", propOrder = {
    "taxRptPropDescRec"
})
public class TaxRptPropDescArrayAType {

    @XmlElement(name = "TaxRptPropDescRec", nillable = true)
    protected List<TaxRptPropDescRecCType> taxRptPropDescRec;

    /**
     * Gets the value of the taxRptPropDescRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRptPropDescRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRptPropDescRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRptPropDescRecCType }
     * 
     * 
     */
    public List<TaxRptPropDescRecCType> getTaxRptPropDescRec() {
        if (taxRptPropDescRec == null) {
            taxRptPropDescRec = new ArrayList<TaxRptPropDescRecCType>();
        }
        return this.taxRptPropDescRec;
    }

}
