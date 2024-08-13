
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Jx xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ElemDesc&gt;Filters that can be used to provide the consumer a means to define the
 *                         specific dictionary values for a specific service &lt;/ElemDesc&gt;&lt;CanonicalVal&gt;&lt;AcctAdd&gt;AcctType,ProdCode,BrCode,RegionCode,AcctId&lt;/AcctAdd&gt;&lt;XferAdd&gt;XferType,FromAcctId,FromAcctType,ToAcctId,ToAcctType&lt;/XferAdd&gt;&lt;TrnAdd&gt;AcctType,BrCode&lt;/TrnAdd&gt;&lt;StopChkAdd&gt;AcctType,ProdCode,StopHldType,AcctId&lt;/StopChkAdd&gt;&lt;TaxPlnAdd&gt;PlnCode&lt;/TaxPlnAdd&gt;&lt;CollatTrackAdd&gt;CollatItem,CollatDoc,AcctType,AcctId,CollatDocCode,CustId,CollatCode&lt;/CollatTrackAdd&gt;&lt;EscrwAdd&gt;AcctType,EscrwTypeCode,AcctId&lt;/EscrwAdd&gt;&lt;FASB91Add&gt;AcctType,AcctId,FASB91Cat&lt;/FASB91Add&gt;&lt;BilPaySubInq&gt;MobPrvdCode&lt;/BilPaySubInq&gt;&lt;BilPaySubMod&gt;MobPrvdCode&lt;/BilPaySubMod&gt;&lt;CRMEventAdd&gt;CRMEventType,EventCatCode,TaxId,CustId,EventPrivType,EventOffCode,EventCatDesc&lt;/CRMEventAdd&gt;&lt;CRMEventMod&gt;CRMEventType,EventCatCode,TaxId,CustId,EventPrivType,EventOffCode,CRMEventId,EventCatDesc&lt;/CRMEventMod&gt;&lt;CRMEventInq&gt;CRMEventType&lt;/CRMEventInq&gt;&lt;CRMActAdd&gt;CRMActType&lt;/CRMActAdd&gt;&lt;CRMActMod&gt;CRMActType&lt;/CRMActMod&gt;&lt;CRMActInq&gt;CRMActType&lt;/CRMActInq&gt;&lt;CRMReferMod&gt;ReferId,ReferOffCode&lt;/CRMReferMod&gt;&lt;CRMReferAdd&gt;ReferOffCode,CustId&lt;/CRMReferAdd&gt;&lt;LnFeeAdd&gt;AcctType,AcctId,LnFeeCode&lt;/LnFeeAdd&gt;&lt;WireTmpltAdd&gt;WireAcctId,WireAcctType&lt;/WireTmpltAdd&gt;&lt;LnAppRgtrAdd&gt;AppDt&lt;/LnAppRgtrAdd&gt;&lt;LnAppRgtrAddValidate&gt;AppDt&lt;/LnAppRgtrAddValidate&gt;&lt;LnAppRgtrMod&gt;AppDt&lt;/LnAppRgtrMod&gt;&lt;DocImgAdd&gt;DocImgIdxType&lt;/DocImgAdd&gt;&lt;LobbyQueAdd&gt;BrCode&lt;/LobbyQueAdd&gt;&lt;LnUnitAdd&gt;AcctId,AcctType&lt;/LnUnitAdd&gt;&lt;CustRelAdd&gt;RelAcctType&lt;/CustRelAdd&gt;&lt;CustRelMod&gt;RelAcctType&lt;/CustRelMod&gt;&lt;AcctSweepAdd&gt;AcctId,AcctType&lt;/AcctSweepAdd&gt;&lt;/CanonicalVal&gt;&lt;/Jx&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Synapsys xmlns="http://jackhenry.com/jxchange/TPG/2008" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The TaxId and CustId filters for the CRMEventAdd and CRMEventMod are an
 *                     exception to the rule. The results can differ per customer per specific
 *                     event&lt;/Synapsys&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SvcDictFilterCode_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcDictFilterCode_Type"&gt;
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
@XmlType(name = "SvcDictFilterCode_Type", propOrder = {
    "value"
})
public class SvcDictFilterCodeType {

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
