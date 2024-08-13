
package pro.misoft.jackhenryintegration.generated.billpay;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The bill pay product type&lt;/ElemDesc&gt;&lt;CanonicalVal&gt;Consm,Bus,iSB&lt;/CanonicalVal&gt;&lt;ElemCanocType&gt;The values represent the following options: Consm - consumer Bus
 *                         - business iSB - service API &lt;/ElemCanocType&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BilPayProdType_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayProdType_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://jackhenry.com/jxchange/TPG/2008&gt;ClosedEnum_Type"&gt;
 *       &lt;attribute name="JHANull" type="{http://jackhenry.com/jxchange/TPG/2008}JHANull_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilPayProdType_Type", propOrder = {
    "value"
})
public class BilPayProdTypeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "JHANull")
    protected String jhaNull;

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

}
