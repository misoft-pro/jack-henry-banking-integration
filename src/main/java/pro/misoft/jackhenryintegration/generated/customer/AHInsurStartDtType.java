
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The date the accident and health insurance will begin to
 *                         accrue&lt;/ElemDesc&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Silverlake xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemSPMap&gt;NA&lt;/ElemSPMap&gt;&lt;/Silverlake&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AHInsurStartDt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AHInsurStartDt_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
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
@XmlType(name = "AHInsurStartDt_Type", propOrder = {
    "value"
})
public class AHInsurStartDtType {

    @XmlValue
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar value;
    @XmlAttribute(name = "JHANull")
    protected String jhaNull;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
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
