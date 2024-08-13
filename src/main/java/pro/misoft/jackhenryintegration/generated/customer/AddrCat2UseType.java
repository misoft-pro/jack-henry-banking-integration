
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;Address Category 2 Type - 
 *                         Cat1=Stmt has Periodic,Escrw,IRAPeriodic,LOC. 
 *                         Cat1=Pmt has Int,XMAS,IRADistr,EscrwRefund.
 *                         Cat1=Not has InsufFunds,IRAMat,PastDue,TeleTrf,Bil,AdvOfCr,OD,RateChg,EOYTax,RtnItems,CrBack 
 *                         Cat1=Cust has Phys,Seasonal,IRS
 *                         Cat1=Acct has PropAddr
 *                     &lt;/ElemDesc&gt;&lt;CanonicalVal&gt;Periodic,Escrw,IRAPeriodic,LOC,Int,XMAS,IRADistr,EscrwRefund,InsufFunds,IRAMat,PastDue,TeleTrf,Bil,AdvOfCr,OD,RateChg,
 *                         EOYTax,RtnItems,CrBack,All,Seasonal,IRS,Phys,Exc,ScsrCstdn,PropAddr&lt;/CanonicalVal&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AddrCat2Use_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddrCat2Use_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://jackhenry.com/jxchange/TPG/2008&gt;ClosedEnum_Type"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddrCat2Use_Type", propOrder = {
    "value"
})
public class AddrCat2UseType {

    @XmlValue
    protected String value;

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

}
