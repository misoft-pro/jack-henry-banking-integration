
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The disposition of a Platform Product record&lt;/ElemDesc&gt;&lt;CanonicalVal&gt;Orign,FulFill,OrignFulfill&lt;/CanonicalVal&gt;&lt;ElemCanocType&gt;The values represent the following options: Origination - The
 *                         customer and account data collected by the consumer should be saved to an
 *                         intermediary (platform database) and any additional work required for
 *                         account opening will be completed by the intermediary (platform system)
 *                         before delivery to final record owner. Fulfillment -The consumer’s intent is
 *                         for completion of the entire customer and account setup process including
 *                         all data gathered, data validation, document generation and signing and
 *                         uploading the customer and account record to the final record owner.
 *                         OrignFulFill - The Product returned qualifies for either Origination or
 *                         Fulfillment. The consumer will convey their selection to the provider when
 *                         submitting an application in PltfmAppAdd with the use of the
 *                         PltfmAppActnType element. &lt;/ElemCanocType&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PltfmProdDispType_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmProdDispType_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://jackhenry.com/jxchange/TPG/2008&gt;ClosedEnum_Type"&gt;
 *       &lt;attribute name="JHANull" type="{http://jackhenry.com/jxchange/TPG/2008}JHANull_Type" /&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmProdDispType_Type", propOrder = {
    "value"
})
public class PltfmProdDispTypeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "JHANull")
    protected String jhaNull;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Defines a string type which is Enum and has set values
     *             
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the jhaNull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJHANull() {
        return jhaNull;
    }

    /**
     * Sets the value of the jhaNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJHANull(String value) {
        this.jhaNull = value;
    }

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
