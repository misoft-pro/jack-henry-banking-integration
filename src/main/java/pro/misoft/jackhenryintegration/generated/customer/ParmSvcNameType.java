
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;The service that relates to the jX element name. This name will behave
 *                         as a router for the element parameter search.&lt;/ElemDesc&gt;&lt;CanonicalVal&gt;AddrAdd,AddrMod,CustAdd,CustMod,CustRelAdd,CustRelMod,IdVerifyAdd,IdVerifyMod,EFTCardAdd,CustMsgAdd,CustMsgMod,AcctAdd,AcctMod,
 *                         TaxPlnAdd,TaxPlnMod,TaxPlnBenfAdd,TaxPlnBenfMod,CollatTrackAdd,CollatTrackMod,EscrwAdd,EscrwMod,FASB91Add,FASB91Mod,LnAcctAdd,LnAcctMod,
 *                         LOCAdd,LOCMod,RealEstatePropAdd,RealEstatePropMod,LnPltfmAppAdd,PltfmAppAdd,CrBurInfoAdd,CrBurInfoMod,LnAppRgtrAdd,LnAppRgtrMod,LnPmtExt,
 *                         LnPmtSchedAdd,LnPmtSchedMod,LnRen,StopChkAdd,TrnAdd,XferAdd,XferMod,DocImgAdd,AcctSweepAdd,EFTCardMod,AcctSweepAdd,AcctSweepMod,
 *                         AcctCombStmtAdd,AcctCombStmtMod,EmplAppAdd&lt;/CanonicalVal&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ParmSvcName_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParmSvcName_Type"&gt;
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
@XmlType(name = "ParmSvcName_Type", propOrder = {
    "value"
})
public class ParmSvcNameType {

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
