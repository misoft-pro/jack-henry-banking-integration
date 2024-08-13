
package pro.misoft.jackhenryintegration.generated.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The conditions that exist on an account or customer to notify the
 *                         consumer to use another service. Canonical Values: Msg; AlertMsg; CollatMsg;
 *                         ColMsg; Stops; StopPay; StopHold; StopAlerts; MemoPost; StopSpecInstr;
 *                         AddrOvrrd; AddrSeasonal; AddrAcct; AddrNot; AddrStmt; AddrIRSRpt; AddrPmts;
 *                         FraudAlert; LineOfCr; PlanBenf. &lt;/ElemDesc&gt;&lt;CanonicalVal&gt;Msg,AlertMsg,CollatMsg,ColMsg,Stops,StopPay,StopHld,StopAlerts,MemoPost,StopSpecInstr,AddrOvrrd,AddrSeasonal,AddrAcct,AddrNot,AddrStmt,AddrIRSRpt,AddrPmts,
 *                         ODProt,FraudAlert,LineOfCr,PlnBenf,CollatTrack,FASB91,Escrw,RealEstateProp,XferACH,XferFut,LnPmtSched,AcctSweep,AcctCombStmt,AcctProdOvrrd,TimeDepRenOvrrd,DebtProt,AcctAnlys,LnRateSched,
 *                         ACHEDI,AcctRecon,EnhAcctAnlys,InstDefFld,RateSwap,LnShdw,LnUnit&lt;/CanonicalVal&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CondNotf_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondNotf_Type"&gt;
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
@XmlType(name = "CondNotf_Type", propOrder = {
    "value"
})
public class CondNotfType {

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
