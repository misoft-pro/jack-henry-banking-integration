
package pro.misoft.jackhenryintegration.generated.billpay;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;An identification provided by the consumer that defines the
 *                         environment in which the institution is operating.&lt;/ElemDesc&gt;&lt;CanonicalVal&gt;PROD&lt;/CanonicalVal&gt;&lt;ElemUsage&gt;This is the Environment in which the Institution is operating.
 *                         Example: [ PROD, TEST, AUDIT, SYM001, SYM101, ... ] The absence of this
 *                         element will equate to "PROD" = Production Environment. It will be the
 *                         responsibility of the sender to send the appropriate data to identify the
 *                         environment if necessary.&lt;/ElemUsage&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for InstEnv_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstEnv_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://jackhenry.com/jxchange/TPG/2008&gt;OpenEnum_Type"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstEnv_Type", propOrder = {
    "value"
})
public class InstEnvType {

    @XmlValue
    protected String value;

    /**
     * Defines a string type which is Enum but is Bank defined
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

}
