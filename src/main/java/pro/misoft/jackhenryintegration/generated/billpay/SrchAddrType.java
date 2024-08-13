
package pro.misoft.jackhenryintegration.generated.billpay;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The street address for a search&lt;/ElemDesc&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SrchAddr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SrchAddr_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="SrchType" type="{http://jackhenry.com/jxchange/TPG/2008}SrchType_Type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrchAddr_Type", propOrder = {
    "value"
})
public class SrchAddrType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "SrchType")
    protected String srchType;

    /**
     * Gets the value of the value property.
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
     * Gets the value of the srchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrchType() {
        return srchType;
    }

    /**
     * Sets the value of the srchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrchType(String value) {
        this.srchType = value;
    }

}
