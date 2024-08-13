
package pro.misoft.jackhenryintegration.generated.transaction;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The time and date of the wire transaction. Expressed in ISO 8601 time
 *                         format and should contain either Zulu time or local time and the UTC offset.
 *                         Format: [-]CCYY-MM-DDThh:mm:ss[Z|(+|-)hh:mm] Valid values include:
 *                         2001-10-26T21:32:52, 2001-10-26T21:32:52+02:00, 2001-10-26T19:32:52Z,
 *                         2001-10-26T19:32:52+00:00, -2001-10-26T21:32:52, or
 *                         2001-10-26T21:32:52.12679. Examles of same moment: "18:30Z", "22:30+04",
 *                         "1130-0700", and "15:00-03:30 see [
 *                         http://books.xmlschemata.org/relaxng/ch19-77049.html or
 *                         http://en.wikipedia.org/wiki/ISO_8601 ] for further reference &lt;/ElemDesc&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for WireTrnTimeDt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTrnTimeDt_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;dateTime"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireTrnTimeDt_Type", propOrder = {
    "value"
})
public class WireTrnTimeDtType {

    @XmlValue
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;

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

}
