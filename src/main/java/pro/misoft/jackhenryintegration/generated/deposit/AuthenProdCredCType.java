
package pro.misoft.jackhenryintegration.generated.deposit;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Authentication of the Consumer Product Credentials in the form of a
 *                 WS Security Element that contains a single SAML V2.0 Assertion.
 *                 http://docs.oasis-open.org/security/saml/v2.0/saml-core-2.0-os.pdf
 *             
 * 
 * <p>Java class for AuthenProdCred_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenProdCred_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}Security"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenProdCred_CType", propOrder = {
    "security"
})
public class AuthenProdCredCType {

    @XmlElement(name = "Security", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", required = true)
    protected SecurityHeaderType security;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityHeaderType }
     *     
     */
    public SecurityHeaderType getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityHeaderType }
     *     
     */
    public void setSecurity(SecurityHeaderType value) {
        this.security = value;
    }

}
