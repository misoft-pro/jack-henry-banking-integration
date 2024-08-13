
package pro.misoft.jackhenryintegration.generated.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt; Operation filters&lt;/ElemDesc&gt;&lt;CanonicalVal&gt;&lt;CRMEventAdd&gt;CRMEventType&lt;/CRMEventAdd&gt;&lt;CRMEventMod&gt;CRMEventType&lt;/CRMEventMod&gt;&lt;CRMEventSrch&gt;CRMEventType&lt;/CRMEventSrch&gt;&lt;CRMEventInq&gt;CRMEventType&lt;/CRMEventInq&gt;&lt;CRMActAdd&gt;CRMActType&lt;/CRMActAdd&gt;&lt;CRMActMod&gt;CRMActType&lt;/CRMActMod&gt;&lt;CRMActSrch&gt;CRMActType&lt;/CRMActSrch&gt;&lt;CRMActInq&gt;CRMActType&lt;/CRMActInq&gt;&lt;XferAdd&gt;XferType,AcctType&lt;/XferAdd&gt;&lt;XferMod&gt;XferType,AcctType&lt;/XferMod&gt;&lt;StopChkAdd&gt;AcctType&lt;/StopChkAdd&gt;&lt;AcctMod&gt;AcctType&lt;/AcctMod&gt;&lt;CustMsgAdd&gt;MsgType,AcctType&lt;/CustMsgAdd&gt;&lt;CustMsgMod&gt;MsgType,AcctType&lt;/CustMsgMod&gt;&lt;AddrAdd&gt;AddrCatUse,AddrCat2Use&lt;/AddrAdd&gt;&lt;AddrMod&gt;AddrCatUse,AddrCat2Use&lt;/AddrMod&gt;&lt;TrnAdd&gt;BrCode,GLProdCode,GLCostCtr&lt;/TrnAdd&gt;&lt;/CanonicalVal&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for OperFilterType_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperFilterType_Type"&gt;
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
@XmlType(name = "OperFilterType_Type", propOrder = {
    "value"
})
public class OperFilterTypeType {

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
