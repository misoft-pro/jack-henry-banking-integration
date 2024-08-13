
package pro.misoft.jackhenryintegration.generated.transaction;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pro.misoft.jackhenryintegration.generated.transaction package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _SignatureValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValue");
    private final static QName _SignedInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfo");
    private final static QName _CanonicalizationMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethod");
    private final static QName _SignatureMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethod");
    private final static QName _W3Reference_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "W3Reference");
    private final static QName _Transforms_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transforms");
    private final static QName _Transform_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Transform");
    private final static QName _DigestMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _KeyInfo_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _KeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyValue");
    private final static QName _RetrievalMethod_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethod");
    private final static QName _X509Data_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Data");
    private final static QName _PGPData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPData");
    private final static QName _SPKIData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKIData");
    private final static QName _Object_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Object");
    private final static QName _Manifest_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Manifest");
    private final static QName _SignatureProperties_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperties");
    private final static QName _SignatureProperty_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SignatureProperty");
    private final static QName _DSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue");
    private final static QName _RSAKeyValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValue");
    private final static QName _Ping_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Ping");
    private final static QName _PingResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PingResponse");
    private final static QName _HdrFault_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "HdrFault");
    private final static QName _StopChkAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkAdd");
    private final static QName _StopChkAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkAddResponse");
    private final static QName _XferAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferAdd");
    private final static QName _XferAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferAddResponse");
    private final static QName _StopChkCan_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkCan");
    private final static QName _StopChkCanResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkCanResponse");
    private final static QName _TrnAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAdd");
    private final static QName _TrnAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddResponse");
    private final static QName _XferMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferMod");
    private final static QName _XferModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferModResponse");
    private final static QName _TrnMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnMod");
    private final static QName _TrnModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnModResponse");
    private final static QName _XferAddValidate_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferAddValidate");
    private final static QName _XferAddValidateResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferAddValidateResponse");
    private final static QName _TrnAddValidate_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddValidate");
    private final static QName _TrnAddValidateResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddValidateResponse");
    private final static QName _StopChkAddValidate_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkAddValidate");
    private final static QName _StopChkAddValidateResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkAddValidateResponse");
    private final static QName _AcctAnlysTrnAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctAnlysTrnAdd");
    private final static QName _AcctAnlysTrnAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctAnlysTrnAddResponse");
    private final static QName _AcctAnlysTrnMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctAnlysTrnMod");
    private final static QName _AcctAnlysTrnModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctAnlysTrnModResponse");
    private final static QName _AcctNSFTrnMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctNSFTrnMod");
    private final static QName _AcctNSFTrnModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctNSFTrnModResponse");
    private final static QName _TrnAddQuote_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuote");
    private final static QName _TrnAddQuoteResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteResponse");
    private final static QName _TrnAddQuoteCan_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteCan");
    private final static QName _TrnAddQuoteCanResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteCanResponse");
    private final static QName _TrnAddQuoteComm_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteComm");
    private final static QName _TrnAddQuoteCommResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteCommResponse");
    private final static QName _SafeDepPmtAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SafeDepPmtAdd");
    private final static QName _SafeDepPmtAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SafeDepPmtAddResponse");
    private final static QName _SafeDepPmtMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SafeDepPmtMod");
    private final static QName _SafeDepPmtModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SafeDepPmtModResponse");
    private final static QName _IssItemMultiAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IssItemMultiAdd");
    private final static QName _IssItemMultiAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IssItemMultiAddResponse");
    private final static QName _PosPayItemMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PosPayItemMod");
    private final static QName _PosPayItemModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PosPayItemModResponse");
    private final static QName _WireTrnAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireTrnAdd");
    private final static QName _WireTrnAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireTrnAddResponse");
    private final static QName _IntlWireTrnAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IntlWireTrnAdd");
    private final static QName _IntlWireTrnAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IntlWireTrnAddResponse");
    private final static QName _SvcFeeTrnAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SvcFeeTrnAdd");
    private final static QName _SvcFeeTrnAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SvcFeeTrnAddResponse");
    private final static QName _SvcFeeTrnMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SvcFeeTrnMod");
    private final static QName _SvcFeeTrnModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SvcFeeTrnModResponse");
    private final static QName _AcctReconItemMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctReconItemMod");
    private final static QName _AcctReconItemModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctReconItemModResponse");
    private final static QName _PmtHubCrXferAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubCrXferAdd");
    private final static QName _PmtHubCrXferAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubCrXferAddResponse");
    private final static QName _PmtHubCrXferMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubCrXferMod");
    private final static QName _PmtHubCrXferModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubCrXferModResponse");
    private final static QName _PmtHubPmtRqAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubPmtRqAdd");
    private final static QName _PmtHubPmtRqAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubPmtRqAddResponse");
    private final static QName _PmtHubPmtRqMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubPmtRqMod");
    private final static QName _PmtHubPmtRqModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubPmtRqModResponse");
    private final static QName _AcctExcTrnMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctExcTrnMod");
    private final static QName _AcctExcTrnModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctExcTrnModResponse");
    private final static QName _StopChkMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkMod");
    private final static QName _StopChkModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkModResponse");
    private final static QName _PromoXferAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PromoXferAdd");
    private final static QName _PromoXferAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PromoXferAddResponse");
    private final static QName _PromoXferMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PromoXferMod");
    private final static QName _PromoXferModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PromoXferModResponse");
    private final static QName _WireTrnAddValidate_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireTrnAddValidate");
    private final static QName _WireTrnAddValidateResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireTrnAddValidateResponse");
    private final static QName _Timestamp_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Timestamp");
    private final static QName _Expires_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Expires");
    private final static QName _Created_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Created");
    private final static QName _UsernameToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "UsernameToken");
    private final static QName _BinarySecurityToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "BinarySecurityToken");
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Reference");
    private final static QName _Embedded_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
    private final static QName _KeyIdentifier_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
    private final static QName _SecurityTokenReference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
    private final static QName _Security_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
    private final static QName _TransformationParameters_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
    private final static QName _Password_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Password");
    private final static QName _Nonce_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Nonce");
    private final static QName _UserDefInfoCTypeUserDefTxt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "UserDefTxt");
    private final static QName _UserDefInfoCTypeUserDefCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "UserDefCode");
    private final static QName _UserDefInfoCTypeUserDefDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "UserDefDesc");
    private final static QName _UserDefInfoCTypeUserDefDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "UserDefDt");
    private final static QName _UserDefInfoCTypeUserDefInfo1_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "UserDefInfo1");
    private final static QName _UserDefInfoCTypeUserDefInfo2_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "UserDefInfo2");
    private final static QName _UserDefInfoCTypeUserDefInfo3_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "UserDefInfo3");
    private final static QName _EmailInfoCTypeEmailAddr_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "EmailAddr");
    private final static QName _EmailInfoCTypeEmailType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "EmailType");
    private final static QName _WireIntlTrnInfoRecCTypeCustom_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Custom");
    private final static QName _MobPhoneInfoCTypeMobPrvdCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobPrvdCode");
    private final static QName _MobPhoneInfoCTypeMobPrvdCodeDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobPrvdCodeDesc");
    private final static QName _MobPhoneInfoCTypeMobPrvdDom_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobPrvdDom");
    private final static QName _MobPhoneInfoCTypeMobBB_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobBB");
    private final static QName _MobPhoneInfoCTypeMobSendTestText_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobSendTestText");
    private final static QName _PhoneInfoCTypePhoneNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneNum");
    private final static QName _PhoneInfoCTypePhoneType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneType");
    private final static QName _PhoneInfoCTypePhoneTime_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneTime");
    private final static QName _PhoneInfoCTypePhoneExt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneExt");
    private final static QName _XPersonNameCTypeTitlePrefix_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TitlePrefix");
    private final static QName _XPersonNameCTypeNameSuffix_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "NameSuffix");
    private final static QName _XPersonNameCTypeLegalName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "LegalName");
    private final static QName _XPersonNameCTypeSalName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SalName");
    private final static QName _PersonNameCTypeComName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ComName");
    private final static QName _PersonNameCTypeFirstName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FirstName");
    private final static QName _PersonNameCTypeMiddleName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MiddleName");
    private final static QName _PersonNameCTypeLastName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "LastName");
    private final static QName _AddrLineInfoCTypeAddrLine_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AddrLine");
    private final static QName _AddrCTypeStreetAddr1_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StreetAddr1");
    private final static QName _AddrCTypeStreetAddr2_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StreetAddr2");
    private final static QName _AddrCTypeCity_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "City");
    private final static QName _AddrCTypeStateProv_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StateProv");
    private final static QName _AddrCTypeStateCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StateCode");
    private final static QName _AddrCTypePostalCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PostalCode");
    private final static QName _AddrCTypeDlvryPt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "DlvryPt");
    private final static QName _AddrCTypeCounty_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "County");
    private final static QName _AddrCTypeCntry_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Cntry");
    private final static QName _AddrCTypeCntryType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CntryType");
    private final static QName _AddrCTypeBusAddr_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BusAddr");
    private final static QName _AddrCTypeFornAddr_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FornAddr");
    private final static QName _AddrCTypeInvAddr_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "InvAddr");
    private final static QName _AddrCTypeStreetAddr3_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StreetAddr3");
    private final static QName _FutXferRecCTypeAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Amt");
    private final static QName _FutXferRecCTypeRedPrinc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "RedPrinc");
    private final static QName _FutXferRecCTypeTrnCodeCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnCodeCode");
    private final static QName _FutXferRecCTypePrtRcpt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PrtRcpt");
    private final static QName _FutXferRecCTypeSemiDay1_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SemiDay1");
    private final static QName _FutXferRecCTypeSemiDay2_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SemiDay2");
    private final static QName _FutXferRecCTypeFutXferFirstDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferFirstDt");
    private final static QName _FutXferRecCTypeFutXferNextDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferNextDt");
    private final static QName _FutXferRecCTypeFutXferExpDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferExpDt");
    private final static QName _FutXferRecCTypeFutXferSuspStartDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferSuspStartDt");
    private final static QName _FutXferRecCTypeFutXferSuspEndDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferSuspEndDt");
    private final static QName _FutXferRecCTypeFutXferDayOfMonth_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferDayOfMonth");
    private final static QName _FutXferRecCTypeFutXferFreq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferFreq");
    private final static QName _FutXferRecCTypeFutXferFreqUnits_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferFreqUnits");
    private final static QName _FutXferRecCTypeFutXferAmtLTD_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferAmtLTD");
    private final static QName _FutXferRecCTypeFutXferUseLnAmtCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferUseLnAmtCode");
    private final static QName _FutXferRecCTypeFutXferUseLnDtCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferUseLnDtCode");
    private final static QName _FutXferRecCTypeFutXferNSFCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferNSFCode");
    private final static QName _FutXferRecCTypeFutXferLateChgCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferLateChgCode");
    private final static QName _FutXferRecCTypeFutXferOccr_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferOccr");
    private final static QName _ACHIntlAddendaInfoRecCTypeACHCompName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCompName");
    private final static QName _ACHIntlAddendaInfoRecCTypeFinInstName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FinInstName");
    private final static QName _ACHIntlAddendaInfoRecCTypeFinInstQualId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FinInstQualId");
    private final static QName _ACHIntlAddendaInfoRecCTypeInstRtld_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "InstRtld");
    private final static QName _ACHIntlInfoRecCTypeACHIntlType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHIntlType");
    private final static QName _ACHIntlInfoRecCTypeFornExchType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FornExchType");
    private final static QName _ACHIntlInfoRecCTypeFornExchRefType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FornExchRefType");
    private final static QName _ACHIntlInfoRecCTypeFornExchRef_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FornExchRef");
    private final static QName _ACHIntlInfoRecCTypeISODestCntry_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ISODestCntry");
    private final static QName _ACHIntlInfoRecCTypeISOOrigCur_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ISOOrigCur");
    private final static QName _ACHIntlInfoRecCTypeISODestCur_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ISODestCur");
    private final static QName _ACHIntlInfoRecCTypeACHStdEntryClass_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHStdEntryClass");
    private final static QName _ACHIntlInfoRecCTypeFornPmtAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FornPmtAmt");
    private final static QName _ACHIntlInfoRecCTypeACHRecvId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHRecvId");
    private final static QName _ACHAddendaInfoRecCTypeACHAddenda_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHAddenda");
    private final static QName _ACHXferRecCTypeACHDrName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHDrName");
    private final static QName _ACHXferRecCTypeACHDrRtNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHDrRtNum");
    private final static QName _ACHXferRecCTypeACHDrAcctId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHDrAcctId");
    private final static QName _ACHXferRecCTypeACHDrAcctType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHDrAcctType");
    private final static QName _ACHXferRecCTypeACHDrBrCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHDrBrCode");
    private final static QName _ACHXferRecCTypeACHDrTrnCodeCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHDrTrnCodeCode");
    private final static QName _ACHXferRecCTypeACHCrName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCrName");
    private final static QName _ACHXferRecCTypeACHCrRtNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCrRtNum");
    private final static QName _ACHXferRecCTypeACHCrAcctId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCrAcctId");
    private final static QName _ACHXferRecCTypeACHCrAcctType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCrAcctType");
    private final static QName _ACHXferRecCTypeACHCrBrCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCrBrCode");
    private final static QName _ACHXferRecCTypeACHCrTrnCodeCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCrTrnCodeCode");
    private final static QName _ACHXferRecCTypeACHXferAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHXferAmt");
    private final static QName _ACHXferRecCTypeACHXferAmtLTD_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHXferAmtLTD");
    private final static QName _ACHXferRecCTypeACHFeeAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeAmt");
    private final static QName _ACHXferRecCTypeACHFeeAmtLTD_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeAmtLTD");
    private final static QName _ACHXferRecCTypeACHSendPreNoteCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHSendPreNoteCode");
    private final static QName _ACHXferRecCTypeACHOneTime_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHOneTime");
    private final static QName _ACHXferRecCTypeACHUseLnDtCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHUseLnDtCode");
    private final static QName _ACHXferRecCTypeACHUseLnAmtCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHUseLnAmtCode");
    private final static QName _ACHXferRecCTypeACHNSFCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHNSFCode");
    private final static QName _ACHXferRecCTypeACHTermCnt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHTermCnt");
    private final static QName _ACHXferRecCTypeACHTermUnits_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHTermUnits");
    private final static QName _ACHXferRecCTypeACHDayAdv_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHDayAdv");
    private final static QName _ACHXferRecCTypeACHSemiDay1_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHSemiDay1");
    private final static QName _ACHXferRecCTypeACHSemiDay2_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHSemiDay2");
    private final static QName _ACHXferRecCTypeACHOpenDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHOpenDt");
    private final static QName _ACHXferRecCTypeACHLastXferDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHLastXferDt");
    private final static QName _ACHXferRecCTypeACHNextXferDay_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHNextXferDay");
    private final static QName _ACHXferRecCTypeACHNextXferDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHNextXferDt");
    private final static QName _ACHXferRecCTypeACHXferExpireDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHXferExpireDt");
    private final static QName _ACHXferRecCTypeACHCompDiscrData_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCompDiscrData");
    private final static QName _ACHXferRecCTypeACHCompEntryDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCompEntryDesc");
    private final static QName _ACHXferRecCTypeACHCompId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHCompId");
    private final static QName _ACHXferRecCTypeACHFeeDrRtNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeDrRtNum");
    private final static QName _ACHXferRecCTypeACHFeeDrAcctId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeDrAcctId");
    private final static QName _ACHXferRecCTypeACHFeeDrAcctType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeDrAcctType");
    private final static QName _ACHXferRecCTypeACHFeeDrBrCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeDrBrCode");
    private final static QName _ACHXferRecCTypeACHFeeDrTrnCodeCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeDrTrnCodeCode");
    private final static QName _ACHXferRecCTypeACHFeeCrRtNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeCrRtNum");
    private final static QName _ACHXferRecCTypeACHFeeCrAcctId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeCrAcctId");
    private final static QName _ACHXferRecCTypeACHFeeCrAcctType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeCrAcctType");
    private final static QName _ACHXferRecCTypeACHFeeCrBrCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeCrBrCode");
    private final static QName _ACHXferRecCTypeACHFeeCrTrnCodeCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHFeeCrTrnCodeCode");
    private final static QName _ACHXferRecCTypeACHAcctStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHAcctStat");
    private final static QName _ACHXferRecCTypeACHLastMainDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHLastMainDt");
    private final static QName _ACHXferRecCTypeACHIndvId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHIndvId");
    private final static QName _ACHXferRecCTypeACHAltCompName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHAltCompName");
    private final static QName _EftDescInfoCTypeEftDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "EftDesc");
    private final static QName _XferRecCTypeFee_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Fee");
    private final static QName _XferRecCTypeOffCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "OffCode");
    private final static QName _XferRecCTypeAvlBalCalcCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AvlBalCalcCode");
    private final static QName _XferRecCTypeXferSrcType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferSrcType");
    private final static QName _XferRecCTypeDrTrnCodeCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "DrTrnCodeCode");
    private final static QName _RmkInfoCTypeRmk_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Rmk");
    private final static QName _WireTrnAddValidateRsMTypeRsStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "RsStat");
    private final static QName _PromoXferModRqMTypeErrOvrRdInfoArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ErrOvrRdInfoArray");
    private final static QName _PromoXferModRqMTypeDlt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Dlt");
    private final static QName _PromoXferModRqMTypePromoXferRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PromoXferRec");
    private final static QName _PromoXferAddRsMTypeCrAcctId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CrAcctId");
    private final static QName _PromoXferAddRsMTypeXferRecText_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferRecText");
    private final static QName _StopChkModRqMTypeStopChkInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopChkInfo");
    private final static QName _StopChkModRqMTypeActIntentKey_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ActIntentKey");
    private final static QName _AcctExcTrnModRqMTypeExcTrnRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ExcTrnRec");
    private final static QName _AcctExcTrnModRqMTypeModRmkArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ModRmkArray");
    private final static QName _AcctExcTrnModRqMTypeLnUnitId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "LnUnitId");
    private final static QName _PmtHubPmtRqModRqMTypePmtBatchId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtBatchId");
    private final static QName _PmtHubPmtRqModRqMTypePmtRqId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtRqId");
    private final static QName _PmtHubPmtRqAddRsMTypePmtRqRsArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtRqRsArray");
    private final static QName _PmtHubPmtRqAddRqMTypeRqUsrTokenType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "RqUsrTokenType");
    private final static QName _PmtHubPmtRqAddRqMTypePmtRqDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtRqDesc");
    private final static QName _PmtHubPmtRqAddRqMTypePmtRqExpDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtRqExpDt");
    private final static QName _PmtHubPmtRqAddRqMTypePmtRqTermDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtRqTermDesc");
    private final static QName _PmtHubPmtRqAddRqMTypeInvoiceId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "InvoiceId");
    private final static QName _PmtHubPmtRqAddRqMTypePurchOrderId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PurchOrderId");
    private final static QName _PmtHubPmtRqAddRqMTypePmtRqArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtRqArray");
    private final static QName _PmtHubCrXferModRqMTypeTrnRcptId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnRcptId");
    private final static QName _PmtHubCrXferModRqMTypePmtHubCrXferModRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHubCrXferModRec");
    private final static QName _PmtHubCrXferAddRqMTypeCrUsrToken_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CrUsrToken");
    private final static QName _PmtHubCrXferAddRqMTypeCrXferFinInstId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CrXferFinInstId");
    private final static QName _AcctReconItemModRqMTypeIssItemCrtDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IssItemCrtDt");
    private final static QName _AcctReconItemModRqMTypeChkNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ChkNum");
    private final static QName _AcctReconItemModRqMTypeBatchNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BatchNum");
    private final static QName _AcctReconItemModRqMTypeSeqNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SeqNum");
    private final static QName _AcctReconItemModRqMTypeAcctReconItemRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctReconItemRec");
    private final static QName _SvcFeeTrnModRqMTypeSvcFeeTrnInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SvcFeeTrnInfo");
    private final static QName _IntlWireTrnAddRsMTypeFornCurrAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FornCurrAmt");
    private final static QName _IntlWireTrnAddRsMTypeWireBankFeeAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireBankFeeAmt");
    private final static QName _IntlWireTrnAddRsMTypeWireBankTaxAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireBankTaxAmt");
    private final static QName _IntlWireTrnAddRsMTypeSttlCostAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SttlCostAmt");
    private final static QName _IntlWireTrnAddRsMTypeCurrExchRate_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CurrExchRate");
    private final static QName _IntlWireTrnAddRqMTypeWireAcctType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireAcctType");
    private final static QName _IntlWireTrnAddRqMTypeWireQuoteId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireQuoteId");
    private final static QName _IntlWireTrnAddRqMTypeWireContrRefId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireContrRefId");
    private final static QName _IntlWireTrnAddRqMTypeFundMthdType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FundMthdType");
    private final static QName _IntlWireTrnAddRqMTypeWireIntlQuoteRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireIntlQuoteRec");
    private final static QName _IntlWireTrnAddRqMTypeWireUsrId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireUsrId");
    private final static QName _IntlWireTrnAddRqMTypeIntnetFinInstId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IntnetFinInstId");
    private final static QName _IntlWireTrnAddRqMTypeWireCompId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireCompId");
    private final static QName _IntlWireTrnAddRqMTypeWireCompEmplId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireCompEmplId");
    private final static QName _IntlWireTrnAddRqMTypeWireCompEmplName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireCompEmplName");
    private final static QName _IntlWireTrnAddRqMTypeWireCompVerifId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireCompVerifId");
    private final static QName _IntlWireTrnAddRqMTypeWireCompVerifName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireCompVerifName");
    private final static QName _IntlWireTrnAddRqMTypeFraudRefId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FraudRefId");
    private final static QName _WireTrnAddRsMTypeWireTmpltId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireTmpltId");
    private final static QName _WireTrnAddRqMTypeWireVerifId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireVerifId");
    private final static QName _WireTrnAddRqMTypeWireTmpltCrt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireTmpltCrt");
    private final static QName _WireTrnAddRqMTypeWireCorrelId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "WireCorrelId");
    private final static QName _PosPayItemModRqMTypePosPayItemInfoRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PosPayItemInfoRec");
    private final static QName _IssItemMultiAddRsMTypeIssItemRsInfoArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IssItemRsInfoArray");
    private final static QName _SafeDepPmtModRqMTypeSafeDepPmtInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SafeDepPmtInfo");
    private final static QName _TrnAddQuoteRsMTypeTrnAddQuoteRsArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteRsArray");
    private final static QName _TrnAddQuoteRsMTypeTrnAddQuoteId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteId");
    private final static QName _TrnAddQuoteRsMTypeTrnAddQuoteTimeLmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnAddQuoteTimeLmt");
    private final static QName _AcctNSFTrnModRqMTypeNSFItemTrnRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "NSFItemTrnRec");
    private final static QName _AcctAnlysTrnModRqMTypeAcctAnlysTrnInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctAnlysTrnInfo");
    private final static QName _TrnModRqMTypeTrnModInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TrnModInfo");
    private final static QName _XferModRqMTypeAcctIdFrom_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctIdFrom");
    private final static QName _XferModRqMTypeAcctIdTo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctIdTo");
    private final static QName _XferModRqMTypeXferKey_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferKey");
    private final static QName _XferModRqMTypeXferRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferRec");
    private final static QName _XferModRqMTypeXferType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferType");
    private final static QName _XferModRqMTypeACHXferRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHXferRec");
    private final static QName _XferModRqMTypeFutXferRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutXferRec");
    private final static QName _StopChkAddRsMTypeStopSeq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StopSeq");
    private final static QName _HdrFaultMTypeFaultRecInfoArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FaultRecInfoArray");
    private final static QName _SPKIDataTypeSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");
    private final static QName _PGPDataTypePGPKeyID_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyID");
    private final static QName _PGPDataTypePGPKeyPacket_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "PGPKeyPacket");
    private final static QName _X509DataTypeX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataTypeX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataTypeX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataTypeX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _X509DataTypeX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _TransformTypeXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _SignatureMethodTypeHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pro.misoft.jackhenryintegration.generated.transaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     * 
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     * 
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link DigestMethodType }
     * 
     */
    public DigestMethodType createDigestMethodType() {
        return new DigestMethodType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link RetrievalMethodType }
     * 
     */
    public RetrievalMethodType createRetrievalMethodType() {
        return new RetrievalMethodType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link PGPDataType }
     * 
     */
    public PGPDataType createPGPDataType() {
        return new PGPDataType();
    }

    /**
     * Create an instance of {@link SPKIDataType }
     * 
     */
    public SPKIDataType createSPKIDataType() {
        return new SPKIDataType();
    }

    /**
     * Create an instance of {@link ObjectType }
     * 
     */
    public ObjectType createObjectType() {
        return new ObjectType();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link SignaturePropertiesType }
     * 
     */
    public SignaturePropertiesType createSignaturePropertiesType() {
        return new SignaturePropertiesType();
    }

    /**
     * Create an instance of {@link SignaturePropertyType }
     * 
     */
    public SignaturePropertyType createSignaturePropertyType() {
        return new SignaturePropertyType();
    }

    /**
     * Create an instance of {@link DSAKeyValueType }
     * 
     */
    public DSAKeyValueType createDSAKeyValueType() {
        return new DSAKeyValueType();
    }

    /**
     * Create an instance of {@link RSAKeyValueType }
     * 
     */
    public RSAKeyValueType createRSAKeyValueType() {
        return new RSAKeyValueType();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link PingRqMType }
     * 
     */
    public PingRqMType createPingRqMType() {
        return new PingRqMType();
    }

    /**
     * Create an instance of {@link PingRsMType }
     * 
     */
    public PingRsMType createPingRsMType() {
        return new PingRsMType();
    }

    /**
     * Create an instance of {@link HdrFaultMType }
     * 
     */
    public HdrFaultMType createHdrFaultMType() {
        return new HdrFaultMType();
    }

    /**
     * Create an instance of {@link StopChkAddRqMType }
     * 
     */
    public StopChkAddRqMType createStopChkAddRqMType() {
        return new StopChkAddRqMType();
    }

    /**
     * Create an instance of {@link StopChkAddRsMType }
     * 
     */
    public StopChkAddRsMType createStopChkAddRsMType() {
        return new StopChkAddRsMType();
    }

    /**
     * Create an instance of {@link XferAddRqMType }
     * 
     */
    public XferAddRqMType createXferAddRqMType() {
        return new XferAddRqMType();
    }

    /**
     * Create an instance of {@link XferAddRsMType }
     * 
     */
    public XferAddRsMType createXferAddRsMType() {
        return new XferAddRsMType();
    }

    /**
     * Create an instance of {@link StopChkCanRqMType }
     * 
     */
    public StopChkCanRqMType createStopChkCanRqMType() {
        return new StopChkCanRqMType();
    }

    /**
     * Create an instance of {@link StopChkCanRsMType }
     * 
     */
    public StopChkCanRsMType createStopChkCanRsMType() {
        return new StopChkCanRsMType();
    }

    /**
     * Create an instance of {@link TrnAddRqMType }
     * 
     */
    public TrnAddRqMType createTrnAddRqMType() {
        return new TrnAddRqMType();
    }

    /**
     * Create an instance of {@link TrnAddRsMType }
     * 
     */
    public TrnAddRsMType createTrnAddRsMType() {
        return new TrnAddRsMType();
    }

    /**
     * Create an instance of {@link XferModRqMType }
     * 
     */
    public XferModRqMType createXferModRqMType() {
        return new XferModRqMType();
    }

    /**
     * Create an instance of {@link XferModRsMType }
     * 
     */
    public XferModRsMType createXferModRsMType() {
        return new XferModRsMType();
    }

    /**
     * Create an instance of {@link TrnModRqMType }
     * 
     */
    public TrnModRqMType createTrnModRqMType() {
        return new TrnModRqMType();
    }

    /**
     * Create an instance of {@link TrnModRsMType }
     * 
     */
    public TrnModRsMType createTrnModRsMType() {
        return new TrnModRsMType();
    }

    /**
     * Create an instance of {@link XferAddValidateRqMType }
     * 
     */
    public XferAddValidateRqMType createXferAddValidateRqMType() {
        return new XferAddValidateRqMType();
    }

    /**
     * Create an instance of {@link XferAddValidateRsMType }
     * 
     */
    public XferAddValidateRsMType createXferAddValidateRsMType() {
        return new XferAddValidateRsMType();
    }

    /**
     * Create an instance of {@link TrnAddValidateRqMType }
     * 
     */
    public TrnAddValidateRqMType createTrnAddValidateRqMType() {
        return new TrnAddValidateRqMType();
    }

    /**
     * Create an instance of {@link TrnAddValidateRsMType }
     * 
     */
    public TrnAddValidateRsMType createTrnAddValidateRsMType() {
        return new TrnAddValidateRsMType();
    }

    /**
     * Create an instance of {@link StopChkAddValidateRqMType }
     * 
     */
    public StopChkAddValidateRqMType createStopChkAddValidateRqMType() {
        return new StopChkAddValidateRqMType();
    }

    /**
     * Create an instance of {@link StopChkAddValidateRsMType }
     * 
     */
    public StopChkAddValidateRsMType createStopChkAddValidateRsMType() {
        return new StopChkAddValidateRsMType();
    }

    /**
     * Create an instance of {@link AcctAnlysTrnAddRqMType }
     * 
     */
    public AcctAnlysTrnAddRqMType createAcctAnlysTrnAddRqMType() {
        return new AcctAnlysTrnAddRqMType();
    }

    /**
     * Create an instance of {@link AcctAnlysTrnAddRsMType }
     * 
     */
    public AcctAnlysTrnAddRsMType createAcctAnlysTrnAddRsMType() {
        return new AcctAnlysTrnAddRsMType();
    }

    /**
     * Create an instance of {@link AcctAnlysTrnModRqMType }
     * 
     */
    public AcctAnlysTrnModRqMType createAcctAnlysTrnModRqMType() {
        return new AcctAnlysTrnModRqMType();
    }

    /**
     * Create an instance of {@link AcctAnlysTrnModRsMType }
     * 
     */
    public AcctAnlysTrnModRsMType createAcctAnlysTrnModRsMType() {
        return new AcctAnlysTrnModRsMType();
    }

    /**
     * Create an instance of {@link AcctNSFTrnModRqMType }
     * 
     */
    public AcctNSFTrnModRqMType createAcctNSFTrnModRqMType() {
        return new AcctNSFTrnModRqMType();
    }

    /**
     * Create an instance of {@link AcctNSFTrnModRsMType }
     * 
     */
    public AcctNSFTrnModRsMType createAcctNSFTrnModRsMType() {
        return new AcctNSFTrnModRsMType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteRqMType }
     * 
     */
    public TrnAddQuoteRqMType createTrnAddQuoteRqMType() {
        return new TrnAddQuoteRqMType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteRsMType }
     * 
     */
    public TrnAddQuoteRsMType createTrnAddQuoteRsMType() {
        return new TrnAddQuoteRsMType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteCanRqMType }
     * 
     */
    public TrnAddQuoteCanRqMType createTrnAddQuoteCanRqMType() {
        return new TrnAddQuoteCanRqMType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteCanRsMType }
     * 
     */
    public TrnAddQuoteCanRsMType createTrnAddQuoteCanRsMType() {
        return new TrnAddQuoteCanRsMType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteCommRqMType }
     * 
     */
    public TrnAddQuoteCommRqMType createTrnAddQuoteCommRqMType() {
        return new TrnAddQuoteCommRqMType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteCommRsMType }
     * 
     */
    public TrnAddQuoteCommRsMType createTrnAddQuoteCommRsMType() {
        return new TrnAddQuoteCommRsMType();
    }

    /**
     * Create an instance of {@link SafeDepPmtAddRqMType }
     * 
     */
    public SafeDepPmtAddRqMType createSafeDepPmtAddRqMType() {
        return new SafeDepPmtAddRqMType();
    }

    /**
     * Create an instance of {@link SafeDepPmtAddRsMType }
     * 
     */
    public SafeDepPmtAddRsMType createSafeDepPmtAddRsMType() {
        return new SafeDepPmtAddRsMType();
    }

    /**
     * Create an instance of {@link SafeDepPmtModRqMType }
     * 
     */
    public SafeDepPmtModRqMType createSafeDepPmtModRqMType() {
        return new SafeDepPmtModRqMType();
    }

    /**
     * Create an instance of {@link SafeDepPmtModRsMType }
     * 
     */
    public SafeDepPmtModRsMType createSafeDepPmtModRsMType() {
        return new SafeDepPmtModRsMType();
    }

    /**
     * Create an instance of {@link IssItemMultiAddRqMType }
     * 
     */
    public IssItemMultiAddRqMType createIssItemMultiAddRqMType() {
        return new IssItemMultiAddRqMType();
    }

    /**
     * Create an instance of {@link IssItemMultiAddRsMType }
     * 
     */
    public IssItemMultiAddRsMType createIssItemMultiAddRsMType() {
        return new IssItemMultiAddRsMType();
    }

    /**
     * Create an instance of {@link PosPayItemModRqMType }
     * 
     */
    public PosPayItemModRqMType createPosPayItemModRqMType() {
        return new PosPayItemModRqMType();
    }

    /**
     * Create an instance of {@link PosPayItemModRsMType }
     * 
     */
    public PosPayItemModRsMType createPosPayItemModRsMType() {
        return new PosPayItemModRsMType();
    }

    /**
     * Create an instance of {@link WireTrnAddRqMType }
     * 
     */
    public WireTrnAddRqMType createWireTrnAddRqMType() {
        return new WireTrnAddRqMType();
    }

    /**
     * Create an instance of {@link WireTrnAddRsMType }
     * 
     */
    public WireTrnAddRsMType createWireTrnAddRsMType() {
        return new WireTrnAddRsMType();
    }

    /**
     * Create an instance of {@link IntlWireTrnAddRqMType }
     * 
     */
    public IntlWireTrnAddRqMType createIntlWireTrnAddRqMType() {
        return new IntlWireTrnAddRqMType();
    }

    /**
     * Create an instance of {@link IntlWireTrnAddRsMType }
     * 
     */
    public IntlWireTrnAddRsMType createIntlWireTrnAddRsMType() {
        return new IntlWireTrnAddRsMType();
    }

    /**
     * Create an instance of {@link SvcFeeTrnAddRqMType }
     * 
     */
    public SvcFeeTrnAddRqMType createSvcFeeTrnAddRqMType() {
        return new SvcFeeTrnAddRqMType();
    }

    /**
     * Create an instance of {@link SvcFeeTrnAddRsMType }
     * 
     */
    public SvcFeeTrnAddRsMType createSvcFeeTrnAddRsMType() {
        return new SvcFeeTrnAddRsMType();
    }

    /**
     * Create an instance of {@link SvcFeeTrnModRqMType }
     * 
     */
    public SvcFeeTrnModRqMType createSvcFeeTrnModRqMType() {
        return new SvcFeeTrnModRqMType();
    }

    /**
     * Create an instance of {@link SvcFeeTrnModRsMType }
     * 
     */
    public SvcFeeTrnModRsMType createSvcFeeTrnModRsMType() {
        return new SvcFeeTrnModRsMType();
    }

    /**
     * Create an instance of {@link AcctReconItemModRqMType }
     * 
     */
    public AcctReconItemModRqMType createAcctReconItemModRqMType() {
        return new AcctReconItemModRqMType();
    }

    /**
     * Create an instance of {@link AcctReconItemModRsMType }
     * 
     */
    public AcctReconItemModRsMType createAcctReconItemModRsMType() {
        return new AcctReconItemModRsMType();
    }

    /**
     * Create an instance of {@link PmtHubCrXferAddRqMType }
     * 
     */
    public PmtHubCrXferAddRqMType createPmtHubCrXferAddRqMType() {
        return new PmtHubCrXferAddRqMType();
    }

    /**
     * Create an instance of {@link PmtHubCrXferAddRsMType }
     * 
     */
    public PmtHubCrXferAddRsMType createPmtHubCrXferAddRsMType() {
        return new PmtHubCrXferAddRsMType();
    }

    /**
     * Create an instance of {@link PmtHubCrXferModRqMType }
     * 
     */
    public PmtHubCrXferModRqMType createPmtHubCrXferModRqMType() {
        return new PmtHubCrXferModRqMType();
    }

    /**
     * Create an instance of {@link PmtHubCrXferModRsMType }
     * 
     */
    public PmtHubCrXferModRsMType createPmtHubCrXferModRsMType() {
        return new PmtHubCrXferModRsMType();
    }

    /**
     * Create an instance of {@link PmtHubPmtRqAddRqMType }
     * 
     */
    public PmtHubPmtRqAddRqMType createPmtHubPmtRqAddRqMType() {
        return new PmtHubPmtRqAddRqMType();
    }

    /**
     * Create an instance of {@link PmtHubPmtRqAddRsMType }
     * 
     */
    public PmtHubPmtRqAddRsMType createPmtHubPmtRqAddRsMType() {
        return new PmtHubPmtRqAddRsMType();
    }

    /**
     * Create an instance of {@link PmtHubPmtRqModRqMType }
     * 
     */
    public PmtHubPmtRqModRqMType createPmtHubPmtRqModRqMType() {
        return new PmtHubPmtRqModRqMType();
    }

    /**
     * Create an instance of {@link PmtHubPmtRqModRsMType }
     * 
     */
    public PmtHubPmtRqModRsMType createPmtHubPmtRqModRsMType() {
        return new PmtHubPmtRqModRsMType();
    }

    /**
     * Create an instance of {@link AcctExcTrnModRqMType }
     * 
     */
    public AcctExcTrnModRqMType createAcctExcTrnModRqMType() {
        return new AcctExcTrnModRqMType();
    }

    /**
     * Create an instance of {@link AcctExcTrnModRsMType }
     * 
     */
    public AcctExcTrnModRsMType createAcctExcTrnModRsMType() {
        return new AcctExcTrnModRsMType();
    }

    /**
     * Create an instance of {@link StopChkModRqMType }
     * 
     */
    public StopChkModRqMType createStopChkModRqMType() {
        return new StopChkModRqMType();
    }

    /**
     * Create an instance of {@link StopChkModRsMType }
     * 
     */
    public StopChkModRsMType createStopChkModRsMType() {
        return new StopChkModRsMType();
    }

    /**
     * Create an instance of {@link PromoXferAddRqMType }
     * 
     */
    public PromoXferAddRqMType createPromoXferAddRqMType() {
        return new PromoXferAddRqMType();
    }

    /**
     * Create an instance of {@link PromoXferAddRsMType }
     * 
     */
    public PromoXferAddRsMType createPromoXferAddRsMType() {
        return new PromoXferAddRsMType();
    }

    /**
     * Create an instance of {@link PromoXferModRqMType }
     * 
     */
    public PromoXferModRqMType createPromoXferModRqMType() {
        return new PromoXferModRqMType();
    }

    /**
     * Create an instance of {@link PromoXferModRsMType }
     * 
     */
    public PromoXferModRsMType createPromoXferModRsMType() {
        return new PromoXferModRsMType();
    }

    /**
     * Create an instance of {@link WireTrnAddValidateRqMType }
     * 
     */
    public WireTrnAddValidateRqMType createWireTrnAddValidateRqMType() {
        return new WireTrnAddValidateRqMType();
    }

    /**
     * Create an instance of {@link WireTrnAddValidateRsMType }
     * 
     */
    public WireTrnAddValidateRsMType createWireTrnAddValidateRsMType() {
        return new WireTrnAddValidateRsMType();
    }

    /**
     * Create an instance of {@link PingRqType }
     * 
     */
    public PingRqType createPingRqType() {
        return new PingRqType();
    }

    /**
     * Create an instance of {@link Ver1CType }
     * 
     */
    public Ver1CType createVer1CType() {
        return new Ver1CType();
    }

    /**
     * Create an instance of {@link PingRsType }
     * 
     */
    public PingRsType createPingRsType() {
        return new PingRsType();
    }

    /**
     * Create an instance of {@link ProdVerType }
     * 
     */
    public ProdVerType createProdVerType() {
        return new ProdVerType();
    }

    /**
     * Create an instance of {@link Ver2CType }
     * 
     */
    public Ver2CType createVer2CType() {
        return new Ver2CType();
    }

    /**
     * Create an instance of {@link FaultHdrCType }
     * 
     */
    public FaultHdrCType createFaultHdrCType() {
        return new FaultHdrCType();
    }

    /**
     * Create an instance of {@link FaultJxVerType }
     * 
     */
    public FaultJxVerType createFaultJxVerType() {
        return new FaultJxVerType();
    }

    /**
     * Create an instance of {@link FaultAuditUsrIdType }
     * 
     */
    public FaultAuditUsrIdType createFaultAuditUsrIdType() {
        return new FaultAuditUsrIdType();
    }

    /**
     * Create an instance of {@link FaultAuditWsIdType }
     * 
     */
    public FaultAuditWsIdType createFaultAuditWsIdType() {
        return new FaultAuditWsIdType();
    }

    /**
     * Create an instance of {@link FaultAuthenUsrIdType }
     * 
     */
    public FaultAuthenUsrIdType createFaultAuthenUsrIdType() {
        return new FaultAuthenUsrIdType();
    }

    /**
     * Create an instance of {@link FaultConsumerNameType }
     * 
     */
    public FaultConsumerNameType createFaultConsumerNameType() {
        return new FaultConsumerNameType();
    }

    /**
     * Create an instance of {@link FaultConsumerProdType }
     * 
     */
    public FaultConsumerProdType createFaultConsumerProdType() {
        return new FaultConsumerProdType();
    }

    /**
     * Create an instance of {@link FaultVer1CType }
     * 
     */
    public FaultVer1CType createFaultVer1CType() {
        return new FaultVer1CType();
    }

    /**
     * Create an instance of {@link FaultjXLogTrackingIdType }
     * 
     */
    public FaultjXLogTrackingIdType createFaultjXLogTrackingIdType() {
        return new FaultjXLogTrackingIdType();
    }

    /**
     * Create an instance of {@link FaultVer2CType }
     * 
     */
    public FaultVer2CType createFaultVer2CType() {
        return new FaultVer2CType();
    }

    /**
     * Create an instance of {@link InstRtIdType }
     * 
     */
    public InstRtIdType createInstRtIdType() {
        return new InstRtIdType();
    }

    /**
     * Create an instance of {@link InstEnvType }
     * 
     */
    public InstEnvType createInstEnvType() {
        return new InstEnvType();
    }

    /**
     * Create an instance of {@link FaultVer3CType }
     * 
     */
    public FaultVer3CType createFaultVer3CType() {
        return new FaultVer3CType();
    }

    /**
     * Create an instance of {@link BusCorrelIdType }
     * 
     */
    public BusCorrelIdType createBusCorrelIdType() {
        return new BusCorrelIdType();
    }

    /**
     * Create an instance of {@link FaultVer4CType }
     * 
     */
    public FaultVer4CType createFaultVer4CType() {
        return new FaultVer4CType();
    }

    /**
     * Create an instance of {@link WorkflowCorrelIdType }
     * 
     */
    public WorkflowCorrelIdType createWorkflowCorrelIdType() {
        return new WorkflowCorrelIdType();
    }

    /**
     * Create an instance of {@link FaultVer5CType }
     * 
     */
    public FaultVer5CType createFaultVer5CType() {
        return new FaultVer5CType();
    }

    /**
     * Create an instance of {@link ValidConsmNameType }
     * 
     */
    public ValidConsmNameType createValidConsmNameType() {
        return new ValidConsmNameType();
    }

    /**
     * Create an instance of {@link ValidConsmProdType }
     * 
     */
    public ValidConsmProdType createValidConsmProdType() {
        return new ValidConsmProdType();
    }

    /**
     * Create an instance of {@link FaultVer6CType }
     * 
     */
    public FaultVer6CType createFaultVer6CType() {
        return new FaultVer6CType();
    }

    /**
     * Create an instance of {@link FaultRecInfoArrayAType }
     * 
     */
    public FaultRecInfoArrayAType createFaultRecInfoArrayAType() {
        return new FaultRecInfoArrayAType();
    }

    /**
     * Create an instance of {@link FaultMsgRecCType }
     * 
     */
    public FaultMsgRecCType createFaultMsgRecCType() {
        return new FaultMsgRecCType();
    }

    /**
     * Create an instance of {@link FaultErrCodeType }
     * 
     */
    public FaultErrCodeType createFaultErrCodeType() {
        return new FaultErrCodeType();
    }

    /**
     * Create an instance of {@link FaultErrCatType }
     * 
     */
    public FaultErrCatType createFaultErrCatType() {
        return new FaultErrCatType();
    }

    /**
     * Create an instance of {@link FaultErrDescType }
     * 
     */
    public FaultErrDescType createFaultErrDescType() {
        return new FaultErrDescType();
    }

    /**
     * Create an instance of {@link FaultErrElemType }
     * 
     */
    public FaultErrElemType createFaultErrElemType() {
        return new FaultErrElemType();
    }

    /**
     * Create an instance of {@link FaultErrElemValType }
     * 
     */
    public FaultErrElemValType createFaultErrElemValType() {
        return new FaultErrElemValType();
    }

    /**
     * Create an instance of {@link FaultErrLocType }
     * 
     */
    public FaultErrLocType createFaultErrLocType() {
        return new FaultErrLocType();
    }

    /**
     * Create an instance of {@link MsgRqHdrCType }
     * 
     */
    public MsgRqHdrCType createMsgRqHdrCType() {
        return new MsgRqHdrCType();
    }

    /**
     * Create an instance of {@link JXchangeHdrCType }
     * 
     */
    public JXchangeHdrCType createJXchangeHdrCType() {
        return new JXchangeHdrCType();
    }

    /**
     * Create an instance of {@link JxVerType }
     * 
     */
    public JxVerType createJxVerType() {
        return new JxVerType();
    }

    /**
     * Create an instance of {@link AuditUsrIdType }
     * 
     */
    public AuditUsrIdType createAuditUsrIdType() {
        return new AuditUsrIdType();
    }

    /**
     * Create an instance of {@link AuditWsIdType }
     * 
     */
    public AuditWsIdType createAuditWsIdType() {
        return new AuditWsIdType();
    }

    /**
     * Create an instance of {@link AuthenUsrIdType }
     * 
     */
    public AuthenUsrIdType createAuthenUsrIdType() {
        return new AuthenUsrIdType();
    }

    /**
     * Create an instance of {@link ConsumerNameType }
     * 
     */
    public ConsumerNameType createConsumerNameType() {
        return new ConsumerNameType();
    }

    /**
     * Create an instance of {@link ConsumerProdType }
     * 
     */
    public ConsumerProdType createConsumerProdType() {
        return new ConsumerProdType();
    }

    /**
     * Create an instance of {@link JXLogTrackingIdType }
     * 
     */
    public JXLogTrackingIdType createJXLogTrackingIdType() {
        return new JXLogTrackingIdType();
    }

    /**
     * Create an instance of {@link Ver3CType }
     * 
     */
    public Ver3CType createVer3CType() {
        return new Ver3CType();
    }

    /**
     * Create an instance of {@link Ver4CType }
     * 
     */
    public Ver4CType createVer4CType() {
        return new Ver4CType();
    }

    /**
     * Create an instance of {@link Ver5CType }
     * 
     */
    public Ver5CType createVer5CType() {
        return new Ver5CType();
    }

    /**
     * Create an instance of {@link Ver6CType }
     * 
     */
    public Ver6CType createVer6CType() {
        return new Ver6CType();
    }

    /**
     * Create an instance of {@link AuthenUsrCredCType }
     * 
     */
    public AuthenUsrCredCType createAuthenUsrCredCType() {
        return new AuthenUsrCredCType();
    }

    /**
     * Create an instance of {@link AuthenProdCredCType }
     * 
     */
    public AuthenProdCredCType createAuthenProdCredCType() {
        return new AuthenProdCredCType();
    }

    /**
     * Create an instance of {@link ErrOvrRdInfoArrayAType }
     * 
     */
    public ErrOvrRdInfoArrayAType createErrOvrRdInfoArrayAType() {
        return new ErrOvrRdInfoArrayAType();
    }

    /**
     * Create an instance of {@link ErrOvrRdCType }
     * 
     */
    public ErrOvrRdCType createErrOvrRdCType() {
        return new ErrOvrRdCType();
    }

    /**
     * Create an instance of {@link ErrCodeType }
     * 
     */
    public ErrCodeType createErrCodeType() {
        return new ErrCodeType();
    }

    /**
     * Create an instance of {@link BusSvcTypeType }
     * 
     */
    public BusSvcTypeType createBusSvcTypeType() {
        return new BusSvcTypeType();
    }

    /**
     * Create an instance of {@link AccountIdCType }
     * 
     */
    public AccountIdCType createAccountIdCType() {
        return new AccountIdCType();
    }

    /**
     * Create an instance of {@link AcctIdType }
     * 
     */
    public AcctIdType createAcctIdType() {
        return new AcctIdType();
    }

    /**
     * Create an instance of {@link AcctTypeType }
     * 
     */
    public AcctTypeType createAcctTypeType() {
        return new AcctTypeType();
    }

    /**
     * Create an instance of {@link StopHldTypeType }
     * 
     */
    public StopHldTypeType createStopHldTypeType() {
        return new StopHldTypeType();
    }

    /**
     * Create an instance of {@link StopChkInfoCType }
     * 
     */
    public StopChkInfoCType createStopChkInfoCType() {
        return new StopChkInfoCType();
    }

    /**
     * Create an instance of {@link OffCodeType }
     * 
     */
    public OffCodeType createOffCodeType() {
        return new OffCodeType();
    }

    /**
     * Create an instance of {@link ExpDtType }
     * 
     */
    public ExpDtType createExpDtType() {
        return new ExpDtType();
    }

    /**
     * Create an instance of {@link LowAmtType }
     * 
     */
    public LowAmtType createLowAmtType() {
        return new LowAmtType();
    }

    /**
     * Create an instance of {@link HighAmtType }
     * 
     */
    public HighAmtType createHighAmtType() {
        return new HighAmtType();
    }

    /**
     * Create an instance of {@link ChkDtType }
     * 
     */
    public ChkDtType createChkDtType() {
        return new ChkDtType();
    }

    /**
     * Create an instance of {@link ChkNumStartType }
     * 
     */
    public ChkNumStartType createChkNumStartType() {
        return new ChkNumStartType();
    }

    /**
     * Create an instance of {@link ChkNumEndType }
     * 
     */
    public ChkNumEndType createChkNumEndType() {
        return new ChkNumEndType();
    }

    /**
     * Create an instance of {@link StopChgType }
     * 
     */
    public StopChgType createStopChgType() {
        return new StopChgType();
    }

    /**
     * Create an instance of {@link PayeeNameType }
     * 
     */
    public PayeeNameType createPayeeNameType() {
        return new PayeeNameType();
    }

    /**
     * Create an instance of {@link ACHCompIdType }
     * 
     */
    public ACHCompIdType createACHCompIdType() {
        return new ACHCompIdType();
    }

    /**
     * Create an instance of {@link ACHStdEntryClassType }
     * 
     */
    public ACHStdEntryClassType createACHStdEntryClassType() {
        return new ACHStdEntryClassType();
    }

    /**
     * Create an instance of {@link ACHDrCRAllType }
     * 
     */
    public ACHDrCRAllType createACHDrCRAllType() {
        return new ACHDrCRAllType();
    }

    /**
     * Create an instance of {@link RmkAType }
     * 
     */
    public RmkAType createRmkAType() {
        return new RmkAType();
    }

    /**
     * Create an instance of {@link RmkInfoCType }
     * 
     */
    public RmkInfoCType createRmkInfoCType() {
        return new RmkInfoCType();
    }

    /**
     * Create an instance of {@link RmkType }
     * 
     */
    public RmkType createRmkType() {
        return new RmkType();
    }

    /**
     * Create an instance of {@link HldEntireBalType }
     * 
     */
    public HldEntireBalType createHldEntireBalType() {
        return new HldEntireBalType();
    }

    /**
     * Create an instance of {@link StopNotCodeType }
     * 
     */
    public StopNotCodeType createStopNotCodeType() {
        return new StopNotCodeType();
    }

    /**
     * Create an instance of {@link EffDtType }
     * 
     */
    public EffDtType createEffDtType() {
        return new EffDtType();
    }

    /**
     * Create an instance of {@link RelAcctIdType }
     * 
     */
    public RelAcctIdType createRelAcctIdType() {
        return new RelAcctIdType();
    }

    /**
     * Create an instance of {@link RelAcctTypeType }
     * 
     */
    public RelAcctTypeType createRelAcctTypeType() {
        return new RelAcctTypeType();
    }

    /**
     * Create an instance of {@link PostAdvCodeType }
     * 
     */
    public PostAdvCodeType createPostAdvCodeType() {
        return new PostAdvCodeType();
    }

    /**
     * Create an instance of {@link AvlBalEffDtType }
     * 
     */
    public AvlBalEffDtType createAvlBalEffDtType() {
        return new AvlBalEffDtType();
    }

    /**
     * Create an instance of {@link ApprvOffInfoArrayAType }
     * 
     */
    public ApprvOffInfoArrayAType createApprvOffInfoArrayAType() {
        return new ApprvOffInfoArrayAType();
    }

    /**
     * Create an instance of {@link ApprvOffInfoRecCType }
     * 
     */
    public ApprvOffInfoRecCType createApprvOffInfoRecCType() {
        return new ApprvOffInfoRecCType();
    }

    /**
     * Create an instance of {@link ApprvTypeType }
     * 
     */
    public ApprvTypeType createApprvTypeType() {
        return new ApprvTypeType();
    }

    /**
     * Create an instance of {@link OffDescType }
     * 
     */
    public OffDescType createOffDescType() {
        return new OffDescType();
    }

    /**
     * Create an instance of {@link CustomCType }
     * 
     */
    public CustomCType createCustomCType() {
        return new CustomCType();
    }

    /**
     * Create an instance of {@link MsgRsHdrCType }
     * 
     */
    public MsgRsHdrCType createMsgRsHdrCType() {
        return new MsgRsHdrCType();
    }

    /**
     * Create an instance of {@link MsgRecInfoArrayAType }
     * 
     */
    public MsgRecInfoArrayAType createMsgRecInfoArrayAType() {
        return new MsgRecInfoArrayAType();
    }

    /**
     * Create an instance of {@link MsgRecCType }
     * 
     */
    public MsgRecCType createMsgRecCType() {
        return new MsgRecCType();
    }

    /**
     * Create an instance of {@link ErrCatType }
     * 
     */
    public ErrCatType createErrCatType() {
        return new ErrCatType();
    }

    /**
     * Create an instance of {@link ErrDescType }
     * 
     */
    public ErrDescType createErrDescType() {
        return new ErrDescType();
    }

    /**
     * Create an instance of {@link ErrElemType }
     * 
     */
    public ErrElemType createErrElemType() {
        return new ErrElemType();
    }

    /**
     * Create an instance of {@link ErrElemValType }
     * 
     */
    public ErrElemValType createErrElemValType() {
        return new ErrElemValType();
    }

    /**
     * Create an instance of {@link ErrLocType }
     * 
     */
    public ErrLocType createErrLocType() {
        return new ErrLocType();
    }

    /**
     * Create an instance of {@link StopSeqType }
     * 
     */
    public StopSeqType createStopSeqType() {
        return new StopSeqType();
    }

    /**
     * Create an instance of {@link RsStatType }
     * 
     */
    public RsStatType createRsStatType() {
        return new RsStatType();
    }

    /**
     * Create an instance of {@link AcctIdFromCType }
     * 
     */
    public AcctIdFromCType createAcctIdFromCType() {
        return new AcctIdFromCType();
    }

    /**
     * Create an instance of {@link AcctIdToCType }
     * 
     */
    public AcctIdToCType createAcctIdToCType() {
        return new AcctIdToCType();
    }

    /**
     * Create an instance of {@link XferRecCType }
     * 
     */
    public XferRecCType createXferRecCType() {
        return new XferRecCType();
    }

    /**
     * Create an instance of {@link AmtType }
     * 
     */
    public AmtType createAmtType() {
        return new AmtType();
    }

    /**
     * Create an instance of {@link EftDescAType }
     * 
     */
    public EftDescAType createEftDescAType() {
        return new EftDescAType();
    }

    /**
     * Create an instance of {@link EftDescInfoCType }
     * 
     */
    public EftDescInfoCType createEftDescInfoCType() {
        return new EftDescInfoCType();
    }

    /**
     * Create an instance of {@link EftDescType }
     * 
     */
    public EftDescType createEftDescType() {
        return new EftDescType();
    }

    /**
     * Create an instance of {@link PrtRcptType }
     * 
     */
    public PrtRcptType createPrtRcptType() {
        return new PrtRcptType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link RedPrincType }
     * 
     */
    public RedPrincType createRedPrincType() {
        return new RedPrincType();
    }

    /**
     * Create an instance of {@link TrnCodeCodeType }
     * 
     */
    public TrnCodeCodeType createTrnCodeCodeType() {
        return new TrnCodeCodeType();
    }

    /**
     * Create an instance of {@link AvlBalCalcCodeType }
     * 
     */
    public AvlBalCalcCodeType createAvlBalCalcCodeType() {
        return new AvlBalCalcCodeType();
    }

    /**
     * Create an instance of {@link XferSrcTypeType }
     * 
     */
    public XferSrcTypeType createXferSrcTypeType() {
        return new XferSrcTypeType();
    }

    /**
     * Create an instance of {@link XferSrcDestRstrArrayAType }
     * 
     */
    public XferSrcDestRstrArrayAType createXferSrcDestRstrArrayAType() {
        return new XferSrcDestRstrArrayAType();
    }

    /**
     * Create an instance of {@link XferSrcDestRstrInfoCType }
     * 
     */
    public XferSrcDestRstrInfoCType createXferSrcDestRstrInfoCType() {
        return new XferSrcDestRstrInfoCType();
    }

    /**
     * Create an instance of {@link XferSrcDestTypeType }
     * 
     */
    public XferSrcDestTypeType createXferSrcDestTypeType() {
        return new XferSrcDestTypeType();
    }

    /**
     * Create an instance of {@link RstrExcTypeType }
     * 
     */
    public RstrExcTypeType createRstrExcTypeType() {
        return new RstrExcTypeType();
    }

    /**
     * Create an instance of {@link EFTTrnIdType }
     * 
     */
    public EFTTrnIdType createEFTTrnIdType() {
        return new EFTTrnIdType();
    }

    /**
     * Create an instance of {@link TrnAcptTimeDtType }
     * 
     */
    public TrnAcptTimeDtType createTrnAcptTimeDtType() {
        return new TrnAcptTimeDtType();
    }

    /**
     * Create an instance of {@link Ver7CType }
     * 
     */
    public Ver7CType createVer7CType() {
        return new Ver7CType();
    }

    /**
     * Create an instance of {@link LnUnitIdType }
     * 
     */
    public LnUnitIdType createLnUnitIdType() {
        return new LnUnitIdType();
    }

    /**
     * Create an instance of {@link Ver8CType }
     * 
     */
    public Ver8CType createVer8CType() {
        return new Ver8CType();
    }

    /**
     * Create an instance of {@link XferTypeType }
     * 
     */
    public XferTypeType createXferTypeType() {
        return new XferTypeType();
    }

    /**
     * Create an instance of {@link ACHXferRecCType }
     * 
     */
    public ACHXferRecCType createACHXferRecCType() {
        return new ACHXferRecCType();
    }

    /**
     * Create an instance of {@link ACHDrNameType }
     * 
     */
    public ACHDrNameType createACHDrNameType() {
        return new ACHDrNameType();
    }

    /**
     * Create an instance of {@link ACHDrRtNumType }
     * 
     */
    public ACHDrRtNumType createACHDrRtNumType() {
        return new ACHDrRtNumType();
    }

    /**
     * Create an instance of {@link ACHDrAcctIdType }
     * 
     */
    public ACHDrAcctIdType createACHDrAcctIdType() {
        return new ACHDrAcctIdType();
    }

    /**
     * Create an instance of {@link ACHDrAcctTypeType }
     * 
     */
    public ACHDrAcctTypeType createACHDrAcctTypeType() {
        return new ACHDrAcctTypeType();
    }

    /**
     * Create an instance of {@link ACHDrBrCodeType }
     * 
     */
    public ACHDrBrCodeType createACHDrBrCodeType() {
        return new ACHDrBrCodeType();
    }

    /**
     * Create an instance of {@link ACHDrTrnCodeCodeType }
     * 
     */
    public ACHDrTrnCodeCodeType createACHDrTrnCodeCodeType() {
        return new ACHDrTrnCodeCodeType();
    }

    /**
     * Create an instance of {@link ACHCrNameType }
     * 
     */
    public ACHCrNameType createACHCrNameType() {
        return new ACHCrNameType();
    }

    /**
     * Create an instance of {@link ACHCrRtNumType }
     * 
     */
    public ACHCrRtNumType createACHCrRtNumType() {
        return new ACHCrRtNumType();
    }

    /**
     * Create an instance of {@link ACHCrAcctIdType }
     * 
     */
    public ACHCrAcctIdType createACHCrAcctIdType() {
        return new ACHCrAcctIdType();
    }

    /**
     * Create an instance of {@link ACHCrAcctTypeType }
     * 
     */
    public ACHCrAcctTypeType createACHCrAcctTypeType() {
        return new ACHCrAcctTypeType();
    }

    /**
     * Create an instance of {@link ACHCrBrCodeType }
     * 
     */
    public ACHCrBrCodeType createACHCrBrCodeType() {
        return new ACHCrBrCodeType();
    }

    /**
     * Create an instance of {@link ACHCrTrnCodeCodeType }
     * 
     */
    public ACHCrTrnCodeCodeType createACHCrTrnCodeCodeType() {
        return new ACHCrTrnCodeCodeType();
    }

    /**
     * Create an instance of {@link ACHXferAmtType }
     * 
     */
    public ACHXferAmtType createACHXferAmtType() {
        return new ACHXferAmtType();
    }

    /**
     * Create an instance of {@link ACHXferAmtLTDType }
     * 
     */
    public ACHXferAmtLTDType createACHXferAmtLTDType() {
        return new ACHXferAmtLTDType();
    }

    /**
     * Create an instance of {@link ACHFeeAmtType }
     * 
     */
    public ACHFeeAmtType createACHFeeAmtType() {
        return new ACHFeeAmtType();
    }

    /**
     * Create an instance of {@link ACHFeeAmtLTDType }
     * 
     */
    public ACHFeeAmtLTDType createACHFeeAmtLTDType() {
        return new ACHFeeAmtLTDType();
    }

    /**
     * Create an instance of {@link ACHSendPreNoteCodeType }
     * 
     */
    public ACHSendPreNoteCodeType createACHSendPreNoteCodeType() {
        return new ACHSendPreNoteCodeType();
    }

    /**
     * Create an instance of {@link ACHOneTimeType }
     * 
     */
    public ACHOneTimeType createACHOneTimeType() {
        return new ACHOneTimeType();
    }

    /**
     * Create an instance of {@link ACHUseLnDtCodeType }
     * 
     */
    public ACHUseLnDtCodeType createACHUseLnDtCodeType() {
        return new ACHUseLnDtCodeType();
    }

    /**
     * Create an instance of {@link ACHUseLnAmtCodeType }
     * 
     */
    public ACHUseLnAmtCodeType createACHUseLnAmtCodeType() {
        return new ACHUseLnAmtCodeType();
    }

    /**
     * Create an instance of {@link ACHNSFCodeType }
     * 
     */
    public ACHNSFCodeType createACHNSFCodeType() {
        return new ACHNSFCodeType();
    }

    /**
     * Create an instance of {@link TermCntType }
     * 
     */
    public TermCntType createTermCntType() {
        return new TermCntType();
    }

    /**
     * Create an instance of {@link TermUnitsType }
     * 
     */
    public TermUnitsType createTermUnitsType() {
        return new TermUnitsType();
    }

    /**
     * Create an instance of {@link ACHDayAdvType }
     * 
     */
    public ACHDayAdvType createACHDayAdvType() {
        return new ACHDayAdvType();
    }

    /**
     * Create an instance of {@link SemiDay1Type }
     * 
     */
    public SemiDay1Type createSemiDay1Type() {
        return new SemiDay1Type();
    }

    /**
     * Create an instance of {@link SemiDay2Type }
     * 
     */
    public SemiDay2Type createSemiDay2Type() {
        return new SemiDay2Type();
    }

    /**
     * Create an instance of {@link OpenDtType }
     * 
     */
    public OpenDtType createOpenDtType() {
        return new OpenDtType();
    }

    /**
     * Create an instance of {@link ACHLastXferDtType }
     * 
     */
    public ACHLastXferDtType createACHLastXferDtType() {
        return new ACHLastXferDtType();
    }

    /**
     * Create an instance of {@link ACHNextXferDayType }
     * 
     */
    public ACHNextXferDayType createACHNextXferDayType() {
        return new ACHNextXferDayType();
    }

    /**
     * Create an instance of {@link ACHNextXferDtType }
     * 
     */
    public ACHNextXferDtType createACHNextXferDtType() {
        return new ACHNextXferDtType();
    }

    /**
     * Create an instance of {@link ACHXferExpireDtType }
     * 
     */
    public ACHXferExpireDtType createACHXferExpireDtType() {
        return new ACHXferExpireDtType();
    }

    /**
     * Create an instance of {@link ACHCompDiscrDataType }
     * 
     */
    public ACHCompDiscrDataType createACHCompDiscrDataType() {
        return new ACHCompDiscrDataType();
    }

    /**
     * Create an instance of {@link ACHCompEntryDescType }
     * 
     */
    public ACHCompEntryDescType createACHCompEntryDescType() {
        return new ACHCompEntryDescType();
    }

    /**
     * Create an instance of {@link ACHCompNameType }
     * 
     */
    public ACHCompNameType createACHCompNameType() {
        return new ACHCompNameType();
    }

    /**
     * Create an instance of {@link ACHFeeDrRtNumType }
     * 
     */
    public ACHFeeDrRtNumType createACHFeeDrRtNumType() {
        return new ACHFeeDrRtNumType();
    }

    /**
     * Create an instance of {@link ACHFeeDrAcctIdType }
     * 
     */
    public ACHFeeDrAcctIdType createACHFeeDrAcctIdType() {
        return new ACHFeeDrAcctIdType();
    }

    /**
     * Create an instance of {@link ACHFeeDrAcctTypeType }
     * 
     */
    public ACHFeeDrAcctTypeType createACHFeeDrAcctTypeType() {
        return new ACHFeeDrAcctTypeType();
    }

    /**
     * Create an instance of {@link ACHFeeDrBrCodeType }
     * 
     */
    public ACHFeeDrBrCodeType createACHFeeDrBrCodeType() {
        return new ACHFeeDrBrCodeType();
    }

    /**
     * Create an instance of {@link ACHFeeDrTrnCodeCodeType }
     * 
     */
    public ACHFeeDrTrnCodeCodeType createACHFeeDrTrnCodeCodeType() {
        return new ACHFeeDrTrnCodeCodeType();
    }

    /**
     * Create an instance of {@link ACHFeeCrRtNumType }
     * 
     */
    public ACHFeeCrRtNumType createACHFeeCrRtNumType() {
        return new ACHFeeCrRtNumType();
    }

    /**
     * Create an instance of {@link ACHFeeCrAcctIdType }
     * 
     */
    public ACHFeeCrAcctIdType createACHFeeCrAcctIdType() {
        return new ACHFeeCrAcctIdType();
    }

    /**
     * Create an instance of {@link ACHFeeCrAcctTypeType }
     * 
     */
    public ACHFeeCrAcctTypeType createACHFeeCrAcctTypeType() {
        return new ACHFeeCrAcctTypeType();
    }

    /**
     * Create an instance of {@link ACHFeeCrBrCodeType }
     * 
     */
    public ACHFeeCrBrCodeType createACHFeeCrBrCodeType() {
        return new ACHFeeCrBrCodeType();
    }

    /**
     * Create an instance of {@link ACHFeeCrTrnCodeCodeType }
     * 
     */
    public ACHFeeCrTrnCodeCodeType createACHFeeCrTrnCodeCodeType() {
        return new ACHFeeCrTrnCodeCodeType();
    }

    /**
     * Create an instance of {@link AcctStatType }
     * 
     */
    public AcctStatType createAcctStatType() {
        return new AcctStatType();
    }

    /**
     * Create an instance of {@link LastMainDtType }
     * 
     */
    public LastMainDtType createLastMainDtType() {
        return new LastMainDtType();
    }

    /**
     * Create an instance of {@link ACHIndvIdType }
     * 
     */
    public ACHIndvIdType createACHIndvIdType() {
        return new ACHIndvIdType();
    }

    /**
     * Create an instance of {@link ACHAltCompNameType }
     * 
     */
    public ACHAltCompNameType createACHAltCompNameType() {
        return new ACHAltCompNameType();
    }

    /**
     * Create an instance of {@link ACHAddendaArrayAType }
     * 
     */
    public ACHAddendaArrayAType createACHAddendaArrayAType() {
        return new ACHAddendaArrayAType();
    }

    /**
     * Create an instance of {@link ACHAddendaInfoRecCType }
     * 
     */
    public ACHAddendaInfoRecCType createACHAddendaInfoRecCType() {
        return new ACHAddendaInfoRecCType();
    }

    /**
     * Create an instance of {@link ACHAddendaType }
     * 
     */
    public ACHAddendaType createACHAddendaType() {
        return new ACHAddendaType();
    }

    /**
     * Create an instance of {@link ACHIntlInfoRecCType }
     * 
     */
    public ACHIntlInfoRecCType createACHIntlInfoRecCType() {
        return new ACHIntlInfoRecCType();
    }

    /**
     * Create an instance of {@link ACHIntlTypeType }
     * 
     */
    public ACHIntlTypeType createACHIntlTypeType() {
        return new ACHIntlTypeType();
    }

    /**
     * Create an instance of {@link FornExchTypeType }
     * 
     */
    public FornExchTypeType createFornExchTypeType() {
        return new FornExchTypeType();
    }

    /**
     * Create an instance of {@link FornExchRefTypeType }
     * 
     */
    public FornExchRefTypeType createFornExchRefTypeType() {
        return new FornExchRefTypeType();
    }

    /**
     * Create an instance of {@link FornExchRefType }
     * 
     */
    public FornExchRefType createFornExchRefType() {
        return new FornExchRefType();
    }

    /**
     * Create an instance of {@link ISODestCntryType }
     * 
     */
    public ISODestCntryType createISODestCntryType() {
        return new ISODestCntryType();
    }

    /**
     * Create an instance of {@link ISOOrigCurrType }
     * 
     */
    public ISOOrigCurrType createISOOrigCurrType() {
        return new ISOOrigCurrType();
    }

    /**
     * Create an instance of {@link ISODestCurrType }
     * 
     */
    public ISODestCurrType createISODestCurrType() {
        return new ISODestCurrType();
    }

    /**
     * Create an instance of {@link FornPmtAmtType }
     * 
     */
    public FornPmtAmtType createFornPmtAmtType() {
        return new FornPmtAmtType();
    }

    /**
     * Create an instance of {@link ACHRecvIdType }
     * 
     */
    public ACHRecvIdType createACHRecvIdType() {
        return new ACHRecvIdType();
    }

    /**
     * Create an instance of {@link ACHIntlAddendaArrayAType }
     * 
     */
    public ACHIntlAddendaArrayAType createACHIntlAddendaArrayAType() {
        return new ACHIntlAddendaArrayAType();
    }

    /**
     * Create an instance of {@link ACHIntlAddendaInfoRecCType }
     * 
     */
    public ACHIntlAddendaInfoRecCType createACHIntlAddendaInfoRecCType() {
        return new ACHIntlAddendaInfoRecCType();
    }

    /**
     * Create an instance of {@link ACHIntlAddendaTypeType }
     * 
     */
    public ACHIntlAddendaTypeType createACHIntlAddendaTypeType() {
        return new ACHIntlAddendaTypeType();
    }

    /**
     * Create an instance of {@link StreetAddr1Type }
     * 
     */
    public StreetAddr1Type createStreetAddr1Type() {
        return new StreetAddr1Type();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link StateProvType }
     * 
     */
    public StateProvType createStateProvType() {
        return new StateProvType();
    }

    /**
     * Create an instance of {@link CntryType }
     * 
     */
    public CntryType createCntryType() {
        return new CntryType();
    }

    /**
     * Create an instance of {@link PostalCodeType }
     * 
     */
    public PostalCodeType createPostalCodeType() {
        return new PostalCodeType();
    }

    /**
     * Create an instance of {@link FinInstNameType }
     * 
     */
    public FinInstNameType createFinInstNameType() {
        return new FinInstNameType();
    }

    /**
     * Create an instance of {@link FinInstQualIdType }
     * 
     */
    public FinInstQualIdType createFinInstQualIdType() {
        return new FinInstQualIdType();
    }

    /**
     * Create an instance of {@link CntryTypeType }
     * 
     */
    public CntryTypeType createCntryTypeType() {
        return new CntryTypeType();
    }

    /**
     * Create an instance of {@link XferBalTypeType }
     * 
     */
    public XferBalTypeType createXferBalTypeType() {
        return new XferBalTypeType();
    }

    /**
     * Create an instance of {@link ACHXferMatPmtCodeType }
     * 
     */
    public ACHXferMatPmtCodeType createACHXferMatPmtCodeType() {
        return new ACHXferMatPmtCodeType();
    }

    /**
     * Create an instance of {@link Ver9CType }
     * 
     */
    public Ver9CType createVer9CType() {
        return new Ver9CType();
    }

    /**
     * Create an instance of {@link FutXferRecCType }
     * 
     */
    public FutXferRecCType createFutXferRecCType() {
        return new FutXferRecCType();
    }

    /**
     * Create an instance of {@link FutXferFirstDtType }
     * 
     */
    public FutXferFirstDtType createFutXferFirstDtType() {
        return new FutXferFirstDtType();
    }

    /**
     * Create an instance of {@link FutXferNextDtType }
     * 
     */
    public FutXferNextDtType createFutXferNextDtType() {
        return new FutXferNextDtType();
    }

    /**
     * Create an instance of {@link FutXferExpDtType }
     * 
     */
    public FutXferExpDtType createFutXferExpDtType() {
        return new FutXferExpDtType();
    }

    /**
     * Create an instance of {@link FutXferSuspStartDtType }
     * 
     */
    public FutXferSuspStartDtType createFutXferSuspStartDtType() {
        return new FutXferSuspStartDtType();
    }

    /**
     * Create an instance of {@link FutXferSuspEndDtType }
     * 
     */
    public FutXferSuspEndDtType createFutXferSuspEndDtType() {
        return new FutXferSuspEndDtType();
    }

    /**
     * Create an instance of {@link FutXferDayOfMonthType }
     * 
     */
    public FutXferDayOfMonthType createFutXferDayOfMonthType() {
        return new FutXferDayOfMonthType();
    }

    /**
     * Create an instance of {@link FutXferFreqType }
     * 
     */
    public FutXferFreqType createFutXferFreqType() {
        return new FutXferFreqType();
    }

    /**
     * Create an instance of {@link FutXferFreqUnitsType }
     * 
     */
    public FutXferFreqUnitsType createFutXferFreqUnitsType() {
        return new FutXferFreqUnitsType();
    }

    /**
     * Create an instance of {@link FutXferAmtLTDType }
     * 
     */
    public FutXferAmtLTDType createFutXferAmtLTDType() {
        return new FutXferAmtLTDType();
    }

    /**
     * Create an instance of {@link FutXferUseLnAmtCodeType }
     * 
     */
    public FutXferUseLnAmtCodeType createFutXferUseLnAmtCodeType() {
        return new FutXferUseLnAmtCodeType();
    }

    /**
     * Create an instance of {@link FutXferUseLnDtCodeType }
     * 
     */
    public FutXferUseLnDtCodeType createFutXferUseLnDtCodeType() {
        return new FutXferUseLnDtCodeType();
    }

    /**
     * Create an instance of {@link FutXferNSFCodeType }
     * 
     */
    public FutXferNSFCodeType createFutXferNSFCodeType() {
        return new FutXferNSFCodeType();
    }

    /**
     * Create an instance of {@link FutXferLateChgCodeType }
     * 
     */
    public FutXferLateChgCodeType createFutXferLateChgCodeType() {
        return new FutXferLateChgCodeType();
    }

    /**
     * Create an instance of {@link FutXferOccrType }
     * 
     */
    public FutXferOccrType createFutXferOccrType() {
        return new FutXferOccrType();
    }

    /**
     * Create an instance of {@link FutXferMatPmtCodeType }
     * 
     */
    public FutXferMatPmtCodeType createFutXferMatPmtCodeType() {
        return new FutXferMatPmtCodeType();
    }

    /**
     * Create an instance of {@link RcptDlvryMthdType }
     * 
     */
    public RcptDlvryMthdType createRcptDlvryMthdType() {
        return new RcptDlvryMthdType();
    }

    /**
     * Create an instance of {@link PrtPartRcptType }
     * 
     */
    public PrtPartRcptType createPrtPartRcptType() {
        return new PrtPartRcptType();
    }

    /**
     * Create an instance of {@link DayOfWeekType }
     * 
     */
    public DayOfWeekType createDayOfWeekType() {
        return new DayOfWeekType();
    }

    /**
     * Create an instance of {@link DayOfWeekOccurType }
     * 
     */
    public DayOfWeekOccurType createDayOfWeekOccurType() {
        return new DayOfWeekOccurType();
    }

    /**
     * Create an instance of {@link XferKeyType }
     * 
     */
    public XferKeyType createXferKeyType() {
        return new XferKeyType();
    }

    /**
     * Create an instance of {@link TrnInfoCType }
     * 
     */
    public TrnInfoCType createTrnInfoCType() {
        return new TrnInfoCType();
    }

    /**
     * Create an instance of {@link EftTypeType }
     * 
     */
    public EftTypeType createEftTypeType() {
        return new EftTypeType();
    }

    /**
     * Create an instance of {@link SrcCodeType }
     * 
     */
    public SrcCodeType createSrcCodeType() {
        return new SrcCodeType();
    }

    /**
     * Create an instance of {@link BatchNumType }
     * 
     */
    public BatchNumType createBatchNumType() {
        return new BatchNumType();
    }

    /**
     * Create an instance of {@link ChkNumType }
     * 
     */
    public ChkNumType createChkNumType() {
        return new ChkNumType();
    }

    /**
     * Create an instance of {@link DrCrType }
     * 
     */
    public DrCrType createDrCrType() {
        return new DrCrType();
    }

    /**
     * Create an instance of {@link RefDescCodeType }
     * 
     */
    public RefDescCodeType createRefDescCodeType() {
        return new RefDescCodeType();
    }

    /**
     * Create an instance of {@link BrCodeType }
     * 
     */
    public BrCodeType createBrCodeType() {
        return new BrCodeType();
    }

    /**
     * Create an instance of {@link GLCostCtrType }
     * 
     */
    public GLCostCtrType createGLCostCtrType() {
        return new GLCostCtrType();
    }

    /**
     * Create an instance of {@link GLProdCodeType }
     * 
     */
    public GLProdCodeType createGLProdCodeType() {
        return new GLProdCodeType();
    }

    /**
     * Create an instance of {@link GLInterfaceCodeType }
     * 
     */
    public GLInterfaceCodeType createGLInterfaceCodeType() {
        return new GLInterfaceCodeType();
    }

    /**
     * Create an instance of {@link RunNumType }
     * 
     */
    public RunNumType createRunNumType() {
        return new RunNumType();
    }

    /**
     * Create an instance of {@link RtNumType }
     * 
     */
    public RtNumType createRtNumType() {
        return new RtNumType();
    }

    /**
     * Create an instance of {@link FltSchedCodeType }
     * 
     */
    public FltSchedCodeType createFltSchedCodeType() {
        return new FltSchedCodeType();
    }

    /**
     * Create an instance of {@link FltDaysType }
     * 
     */
    public FltDaysType createFltDaysType() {
        return new FltDaysType();
    }

    /**
     * Create an instance of {@link ImgNumType }
     * 
     */
    public ImgNumType createImgNumType() {
        return new ImgNumType();
    }

    /**
     * Create an instance of {@link MemoPostOnlyType }
     * 
     */
    public MemoPostOnlyType createMemoPostOnlyType() {
        return new MemoPostOnlyType();
    }

    /**
     * Create an instance of {@link ColBalAmtType }
     * 
     */
    public ColBalAmtType createColBalAmtType() {
        return new ColBalAmtType();
    }

    /**
     * Create an instance of {@link AvlBalAmtType }
     * 
     */
    public AvlBalAmtType createAvlBalAmtType() {
        return new AvlBalAmtType();
    }

    /**
     * Create an instance of {@link LdgrBalAmtType }
     * 
     */
    public LdgrBalAmtType createLdgrBalAmtType() {
        return new LdgrBalAmtType();
    }

    /**
     * Create an instance of {@link SrcFundsCodeType }
     * 
     */
    public SrcFundsCodeType createSrcFundsCodeType() {
        return new SrcFundsCodeType();
    }

    /**
     * Create an instance of {@link ChkDlvryMthdType }
     * 
     */
    public ChkDlvryMthdType createChkDlvryMthdType() {
        return new ChkDlvryMthdType();
    }

    /**
     * Create an instance of {@link MemoPostHldOvrType }
     * 
     */
    public MemoPostHldOvrType createMemoPostHldOvrType() {
        return new MemoPostHldOvrType();
    }

    /**
     * Create an instance of {@link LnSvcTrnCodeType }
     * 
     */
    public LnSvcTrnCodeType createLnSvcTrnCodeType() {
        return new LnSvcTrnCodeType();
    }

    /**
     * Create an instance of {@link EFTTrnAuthAmtType }
     * 
     */
    public EFTTrnAuthAmtType createEFTTrnAuthAmtType() {
        return new EFTTrnAuthAmtType();
    }

    /**
     * Create an instance of {@link TrnAuthBalAmtType }
     * 
     */
    public TrnAuthBalAmtType createTrnAuthBalAmtType() {
        return new TrnAuthBalAmtType();
    }

    /**
     * Create an instance of {@link SeqNumType }
     * 
     */
    public SeqNumType createSeqNumType() {
        return new SeqNumType();
    }

    /**
     * Create an instance of {@link TrnRcptIdType }
     * 
     */
    public TrnRcptIdType createTrnRcptIdType() {
        return new TrnRcptIdType();
    }

    /**
     * Create an instance of {@link DltType }
     * 
     */
    public DltType createDltType() {
        return new DltType();
    }

    /**
     * Create an instance of {@link TrnModInfoCType }
     * 
     */
    public TrnModInfoCType createTrnModInfoCType() {
        return new TrnModInfoCType();
    }

    /**
     * Create an instance of {@link AcctAnlysTrnInfoCType }
     * 
     */
    public AcctAnlysTrnInfoCType createAcctAnlysTrnInfoCType() {
        return new AcctAnlysTrnInfoCType();
    }

    /**
     * Create an instance of {@link AcctAnlysTrnCodeType }
     * 
     */
    public AcctAnlysTrnCodeType createAcctAnlysTrnCodeType() {
        return new AcctAnlysTrnCodeType();
    }

    /**
     * Create an instance of {@link AcctAnlysUnitCntType }
     * 
     */
    public AcctAnlysUnitCntType createAcctAnlysUnitCntType() {
        return new AcctAnlysUnitCntType();
    }

    /**
     * Create an instance of {@link AcctAnlysUnitAmtType }
     * 
     */
    public AcctAnlysUnitAmtType createAcctAnlysUnitAmtType() {
        return new AcctAnlysUnitAmtType();
    }

    /**
     * Create an instance of {@link NSFItemIdType }
     * 
     */
    public NSFItemIdType createNSFItemIdType() {
        return new NSFItemIdType();
    }

    /**
     * Create an instance of {@link NSFItemTrnRecCType }
     * 
     */
    public NSFItemTrnRecCType createNSFItemTrnRecCType() {
        return new NSFItemTrnRecCType();
    }

    /**
     * Create an instance of {@link ExcResolveTypeType }
     * 
     */
    public ExcResolveTypeType createExcResolveTypeType() {
        return new ExcResolveTypeType();
    }

    /**
     * Create an instance of {@link ExcDispCodeType }
     * 
     */
    public ExcDispCodeType createExcDispCodeType() {
        return new ExcDispCodeType();
    }

    /**
     * Create an instance of {@link ExcRetRsnCodeType }
     * 
     */
    public ExcRetRsnCodeType createExcRetRsnCodeType() {
        return new ExcRetRsnCodeType();
    }

    /**
     * Create an instance of {@link ExcActnCodeType }
     * 
     */
    public ExcActnCodeType createExcActnCodeType() {
        return new ExcActnCodeType();
    }

    /**
     * Create an instance of {@link NSFChgWavRsnCodeType }
     * 
     */
    public NSFChgWavRsnCodeType createNSFChgWavRsnCodeType() {
        return new NSFChgWavRsnCodeType();
    }

    /**
     * Create an instance of {@link ActIntentKeyType }
     * 
     */
    public ActIntentKeyType createActIntentKeyType() {
        return new ActIntentKeyType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteRqArrayAType }
     * 
     */
    public TrnAddQuoteRqArrayAType createTrnAddQuoteRqArrayAType() {
        return new TrnAddQuoteRqArrayAType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteInfoCType }
     * 
     */
    public TrnAddQuoteInfoCType createTrnAddQuoteInfoCType() {
        return new TrnAddQuoteInfoCType();
    }

    /**
     * Create an instance of {@link OffPswdType }
     * 
     */
    public OffPswdType createOffPswdType() {
        return new OffPswdType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteRsArrayAType }
     * 
     */
    public TrnAddQuoteRsArrayAType createTrnAddQuoteRsArrayAType() {
        return new TrnAddQuoteRsArrayAType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteRsInfoCType }
     * 
     */
    public TrnAddQuoteRsInfoCType createTrnAddQuoteRsInfoCType() {
        return new TrnAddQuoteRsInfoCType();
    }

    /**
     * Create an instance of {@link TrnAddQuotePriorInfoCType }
     * 
     */
    public TrnAddQuotePriorInfoCType createTrnAddQuotePriorInfoCType() {
        return new TrnAddQuotePriorInfoCType();
    }

    /**
     * Create an instance of {@link CurBalType }
     * 
     */
    public CurBalType createCurBalType() {
        return new CurBalType();
    }

    /**
     * Create an instance of {@link AccrIntType }
     * 
     */
    public AccrIntType createAccrIntType() {
        return new AccrIntType();
    }

    /**
     * Create an instance of {@link LateChgAmtType }
     * 
     */
    public LateChgAmtType createLateChgAmtType() {
        return new LateChgAmtType();
    }

    /**
     * Create an instance of {@link CurPayOffType }
     * 
     */
    public CurPayOffType createCurPayOffType() {
        return new CurPayOffType();
    }

    /**
     * Create an instance of {@link OthChgAmtType }
     * 
     */
    public OthChgAmtType createOthChgAmtType() {
        return new OthChgAmtType();
    }

    /**
     * Create an instance of {@link PartPmtAmtType }
     * 
     */
    public PartPmtAmtType createPartPmtAmtType() {
        return new PartPmtAmtType();
    }

    /**
     * Create an instance of {@link AmrtzPmtSuspType }
     * 
     */
    public AmrtzPmtSuspType createAmrtzPmtSuspType() {
        return new AmrtzPmtSuspType();
    }

    /**
     * Create an instance of {@link PmtDueDtType }
     * 
     */
    public PmtDueDtType createPmtDueDtType() {
        return new PmtDueDtType();
    }

    /**
     * Create an instance of {@link PmtAmtType }
     * 
     */
    public PmtAmtType createPmtAmtType() {
        return new PmtAmtType();
    }

    /**
     * Create an instance of {@link PIAmtType }
     * 
     */
    public PIAmtType createPIAmtType() {
        return new PIAmtType();
    }

    /**
     * Create an instance of {@link IntPaidYTDType }
     * 
     */
    public IntPaidYTDType createIntPaidYTDType() {
        return new IntPaidYTDType();
    }

    /**
     * Create an instance of {@link NegColAmtType }
     * 
     */
    public NegColAmtType createNegColAmtType() {
        return new NegColAmtType();
    }

    /**
     * Create an instance of {@link NSFNegBalAmtType }
     * 
     */
    public NSFNegBalAmtType createNSFNegBalAmtType() {
        return new NSFNegBalAmtType();
    }

    /**
     * Create an instance of {@link ODNegBalAmtType }
     * 
     */
    public ODNegBalAmtType createODNegBalAmtType() {
        return new ODNegBalAmtType();
    }

    /**
     * Create an instance of {@link EscrwAmtType }
     * 
     */
    public EscrwAmtType createEscrwAmtType() {
        return new EscrwAmtType();
    }

    /**
     * Create an instance of {@link TrnAddQuotePostInfoCType }
     * 
     */
    public TrnAddQuotePostInfoCType createTrnAddQuotePostInfoCType() {
        return new TrnAddQuotePostInfoCType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteIdType }
     * 
     */
    public TrnAddQuoteIdType createTrnAddQuoteIdType() {
        return new TrnAddQuoteIdType();
    }

    /**
     * Create an instance of {@link TrnAddQuoteTimeLmtType }
     * 
     */
    public TrnAddQuoteTimeLmtType createTrnAddQuoteTimeLmtType() {
        return new TrnAddQuoteTimeLmtType();
    }

    /**
     * Create an instance of {@link SafeDepPmtInfoCType }
     * 
     */
    public SafeDepPmtInfoCType createSafeDepPmtInfoCType() {
        return new SafeDepPmtInfoCType();
    }

    /**
     * Create an instance of {@link RentAmtType }
     * 
     */
    public RentAmtType createRentAmtType() {
        return new RentAmtType();
    }

    /**
     * Create an instance of {@link SalesTaxDueAmtType }
     * 
     */
    public SalesTaxDueAmtType createSalesTaxDueAmtType() {
        return new SalesTaxDueAmtType();
    }

    /**
     * Create an instance of {@link LateChgDueAmtType }
     * 
     */
    public LateChgDueAmtType createLateChgDueAmtType() {
        return new LateChgDueAmtType();
    }

    /**
     * Create an instance of {@link NxtPayDtType }
     * 
     */
    public NxtPayDtType createNxtPayDtType() {
        return new NxtPayDtType();
    }

    /**
     * Create an instance of {@link IssItemInfoArrayAType }
     * 
     */
    public IssItemInfoArrayAType createIssItemInfoArrayAType() {
        return new IssItemInfoArrayAType();
    }

    /**
     * Create an instance of {@link IssItemInfoCType }
     * 
     */
    public IssItemInfoCType createIssItemInfoCType() {
        return new IssItemInfoCType();
    }

    /**
     * Create an instance of {@link IssItemIdType }
     * 
     */
    public IssItemIdType createIssItemIdType() {
        return new IssItemIdType();
    }

    /**
     * Create an instance of {@link IssItemTypeType }
     * 
     */
    public IssItemTypeType createIssItemTypeType() {
        return new IssItemTypeType();
    }

    /**
     * Create an instance of {@link ChkVoidDtType }
     * 
     */
    public ChkVoidDtType createChkVoidDtType() {
        return new ChkVoidDtType();
    }

    /**
     * Create an instance of {@link AddrCType }
     * 
     */
    public AddrCType createAddrCType() {
        return new AddrCType();
    }

    /**
     * Create an instance of {@link FreeFormAddrAType }
     * 
     */
    public FreeFormAddrAType createFreeFormAddrAType() {
        return new FreeFormAddrAType();
    }

    /**
     * Create an instance of {@link AddrLineInfoCType }
     * 
     */
    public AddrLineInfoCType createAddrLineInfoCType() {
        return new AddrLineInfoCType();
    }

    /**
     * Create an instance of {@link AddrLineType }
     * 
     */
    public AddrLineType createAddrLineType() {
        return new AddrLineType();
    }

    /**
     * Create an instance of {@link StreetAddr2Type }
     * 
     */
    public StreetAddr2Type createStreetAddr2Type() {
        return new StreetAddr2Type();
    }

    /**
     * Create an instance of {@link StateCodeType }
     * 
     */
    public StateCodeType createStateCodeType() {
        return new StateCodeType();
    }

    /**
     * Create an instance of {@link DlvryPtType }
     * 
     */
    public DlvryPtType createDlvryPtType() {
        return new DlvryPtType();
    }

    /**
     * Create an instance of {@link CountyType }
     * 
     */
    public CountyType createCountyType() {
        return new CountyType();
    }

    /**
     * Create an instance of {@link BusAddrType }
     * 
     */
    public BusAddrType createBusAddrType() {
        return new BusAddrType();
    }

    /**
     * Create an instance of {@link FornAddrType }
     * 
     */
    public FornAddrType createFornAddrType() {
        return new FornAddrType();
    }

    /**
     * Create an instance of {@link InvAddrType }
     * 
     */
    public InvAddrType createInvAddrType() {
        return new InvAddrType();
    }

    /**
     * Create an instance of {@link StreetAddr3Type }
     * 
     */
    public StreetAddr3Type createStreetAddr3Type() {
        return new StreetAddr3Type();
    }

    /**
     * Create an instance of {@link IssItemRsInfoArrayAType }
     * 
     */
    public IssItemRsInfoArrayAType createIssItemRsInfoArrayAType() {
        return new IssItemRsInfoArrayAType();
    }

    /**
     * Create an instance of {@link IssItemRsInfoCType }
     * 
     */
    public IssItemRsInfoCType createIssItemRsInfoCType() {
        return new IssItemRsInfoCType();
    }

    /**
     * Create an instance of {@link PosPayItemIdType }
     * 
     */
    public PosPayItemIdType createPosPayItemIdType() {
        return new PosPayItemIdType();
    }

    /**
     * Create an instance of {@link PosPayItemInfoRecCType }
     * 
     */
    public PosPayItemInfoRecCType createPosPayItemInfoRecCType() {
        return new PosPayItemInfoRecCType();
    }

    /**
     * Create an instance of {@link PosPayItemStatTypeType }
     * 
     */
    public PosPayItemStatTypeType createPosPayItemStatTypeType() {
        return new PosPayItemStatTypeType();
    }

    /**
     * Create an instance of {@link PosPayViolTypeType }
     * 
     */
    public PosPayViolTypeType createPosPayViolTypeType() {
        return new PosPayViolTypeType();
    }

    /**
     * Create an instance of {@link IsLockTypeType }
     * 
     */
    public IsLockTypeType createIsLockTypeType() {
        return new IsLockTypeType();
    }

    /**
     * Create an instance of {@link PosPayViolArrayAType }
     * 
     */
    public PosPayViolArrayAType createPosPayViolArrayAType() {
        return new PosPayViolArrayAType();
    }

    /**
     * Create an instance of {@link PosPayViolDetailCType }
     * 
     */
    public PosPayViolDetailCType createPosPayViolDetailCType() {
        return new PosPayViolDetailCType();
    }

    /**
     * Create an instance of {@link RetRsnCodeType }
     * 
     */
    public RetRsnCodeType createRetRsnCodeType() {
        return new RetRsnCodeType();
    }

    /**
     * Create an instance of {@link WireAcctIdType }
     * 
     */
    public WireAcctIdType createWireAcctIdType() {
        return new WireAcctIdType();
    }

    /**
     * Create an instance of {@link WireTrnInfoRecCType }
     * 
     */
    public WireTrnInfoRecCType createWireTrnInfoRecCType() {
        return new WireTrnInfoRecCType();
    }

    /**
     * Create an instance of {@link WireAmtType }
     * 
     */
    public WireAmtType createWireAmtType() {
        return new WireAmtType();
    }

    /**
     * Create an instance of {@link WireTrnTypeType }
     * 
     */
    public WireTrnTypeType createWireTrnTypeType() {
        return new WireTrnTypeType();
    }

    /**
     * Create an instance of {@link TaxIdType }
     * 
     */
    public TaxIdType createTaxIdType() {
        return new TaxIdType();
    }

    /**
     * Create an instance of {@link WireAnlysCodeType }
     * 
     */
    public WireAnlysCodeType createWireAnlysCodeType() {
        return new WireAnlysCodeType();
    }

    /**
     * Create an instance of {@link WireFeeAmtType }
     * 
     */
    public WireFeeAmtType createWireFeeAmtType() {
        return new WireFeeAmtType();
    }

    /**
     * Create an instance of {@link WireTmpltDescType }
     * 
     */
    public WireTmpltDescType createWireTmpltDescType() {
        return new WireTmpltDescType();
    }

    /**
     * Create an instance of {@link WireStatType }
     * 
     */
    public WireStatType createWireStatType() {
        return new WireStatType();
    }

    /**
     * Create an instance of {@link WireNotTypeType }
     * 
     */
    public WireNotTypeType createWireNotTypeType() {
        return new WireNotTypeType();
    }

    /**
     * Create an instance of {@link WireTrfTypeCodeType }
     * 
     */
    public WireTrfTypeCodeType createWireTrfTypeCodeType() {
        return new WireTrfTypeCodeType();
    }

    /**
     * Create an instance of {@link WireTypeType }
     * 
     */
    public WireTypeType createWireTypeType() {
        return new WireTypeType();
    }

    /**
     * Create an instance of {@link WireSubTypeType }
     * 
     */
    public WireSubTypeType createWireSubTypeType() {
        return new WireSubTypeType();
    }

    /**
     * Create an instance of {@link WireFuncTypeType }
     * 
     */
    public WireFuncTypeType createWireFuncTypeType() {
        return new WireFuncTypeType();
    }

    /**
     * Create an instance of {@link WireRefIdType }
     * 
     */
    public WireRefIdType createWireRefIdType() {
        return new WireRefIdType();
    }

    /**
     * Create an instance of {@link WireSrcType }
     * 
     */
    public WireSrcType createWireSrcType() {
        return new WireSrcType();
    }

    /**
     * Create an instance of {@link IntnetFinInstIdType }
     * 
     */
    public IntnetFinInstIdType createIntnetFinInstIdType() {
        return new IntnetFinInstIdType();
    }

    /**
     * Create an instance of {@link WireRecvFinInstRtIdType }
     * 
     */
    public WireRecvFinInstRtIdType createWireRecvFinInstRtIdType() {
        return new WireRecvFinInstRtIdType();
    }

    /**
     * Create an instance of {@link WireRecvFinInstNameType }
     * 
     */
    public WireRecvFinInstNameType createWireRecvFinInstNameType() {
        return new WireRecvFinInstNameType();
    }

    /**
     * Create an instance of {@link PersonNameCType }
     * 
     */
    public PersonNameCType createPersonNameCType() {
        return new PersonNameCType();
    }

    /**
     * Create an instance of {@link ComNameType }
     * 
     */
    public ComNameType createComNameType() {
        return new ComNameType();
    }

    /**
     * Create an instance of {@link FirstNameType }
     * 
     */
    public FirstNameType createFirstNameType() {
        return new FirstNameType();
    }

    /**
     * Create an instance of {@link MiddleNameType }
     * 
     */
    public MiddleNameType createMiddleNameType() {
        return new MiddleNameType();
    }

    /**
     * Create an instance of {@link LastNameType }
     * 
     */
    public LastNameType createLastNameType() {
        return new LastNameType();
    }

    /**
     * Create an instance of {@link XPersonNameCType }
     * 
     */
    public XPersonNameCType createXPersonNameCType() {
        return new XPersonNameCType();
    }

    /**
     * Create an instance of {@link TitlePrefixType }
     * 
     */
    public TitlePrefixType createTitlePrefixType() {
        return new TitlePrefixType();
    }

    /**
     * Create an instance of {@link NameSuffixType }
     * 
     */
    public NameSuffixType createNameSuffixType() {
        return new NameSuffixType();
    }

    /**
     * Create an instance of {@link LegalNameType }
     * 
     */
    public LegalNameType createLegalNameType() {
        return new LegalNameType();
    }

    /**
     * Create an instance of {@link SalNameType }
     * 
     */
    public SalNameType createSalNameType() {
        return new SalNameType();
    }

    /**
     * Create an instance of {@link AbbNameType }
     * 
     */
    public AbbNameType createAbbNameType() {
        return new AbbNameType();
    }

    /**
     * Create an instance of {@link WireOthXferInfoRecCType }
     * 
     */
    public WireOthXferInfoRecCType createWireOthXferInfoRecCType() {
        return new WireOthXferInfoRecCType();
    }

    /**
     * Create an instance of {@link DetOfChgTypeType }
     * 
     */
    public DetOfChgTypeType createDetOfChgTypeType() {
        return new DetOfChgTypeType();
    }

    /**
     * Create an instance of {@link WireSndChgArrayAType }
     * 
     */
    public WireSndChgArrayAType createWireSndChgArrayAType() {
        return new WireSndChgArrayAType();
    }

    /**
     * Create an instance of {@link WireSndChgRecCType }
     * 
     */
    public WireSndChgRecCType createWireSndChgRecCType() {
        return new WireSndChgRecCType();
    }

    /**
     * Create an instance of {@link WireSndrChgOrderType }
     * 
     */
    public WireSndrChgOrderType createWireSndrChgOrderType() {
        return new WireSndrChgOrderType();
    }

    /**
     * Create an instance of {@link SndrChgType }
     * 
     */
    public SndrChgType createSndrChgType() {
        return new SndrChgType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link CurrExchRateType }
     * 
     */
    public CurrExchRateType createCurrExchRateType() {
        return new CurrExchRateType();
    }

    /**
     * Create an instance of {@link WireBenfInfoRecCType }
     * 
     */
    public WireBenfInfoRecCType createWireBenfInfoRecCType() {
        return new WireBenfInfoRecCType();
    }

    /**
     * Create an instance of {@link WireFinInstIdTypeType }
     * 
     */
    public WireFinInstIdTypeType createWireFinInstIdTypeType() {
        return new WireFinInstIdTypeType();
    }

    /**
     * Create an instance of {@link WireIntmdFinInstIdType }
     * 
     */
    public WireIntmdFinInstIdType createWireIntmdFinInstIdType() {
        return new WireIntmdFinInstIdType();
    }

    /**
     * Create an instance of {@link WireIntmdFinInstNameType }
     * 
     */
    public WireIntmdFinInstNameType createWireIntmdFinInstNameType() {
        return new WireIntmdFinInstNameType();
    }

    /**
     * Create an instance of {@link WireBenfIdType }
     * 
     */
    public WireBenfIdType createWireBenfIdType() {
        return new WireBenfIdType();
    }

    /**
     * Create an instance of {@link WireBenfIdTypeType }
     * 
     */
    public WireBenfIdTypeType createWireBenfIdTypeType() {
        return new WireBenfIdTypeType();
    }

    /**
     * Create an instance of {@link WireBenfFinInstIdType }
     * 
     */
    public WireBenfFinInstIdType createWireBenfFinInstIdType() {
        return new WireBenfFinInstIdType();
    }

    /**
     * Create an instance of {@link WireBenfFinInstNameType }
     * 
     */
    public WireBenfFinInstNameType createWireBenfFinInstNameType() {
        return new WireBenfFinInstNameType();
    }

    /**
     * Create an instance of {@link WireBenfNameType }
     * 
     */
    public WireBenfNameType createWireBenfNameType() {
        return new WireBenfNameType();
    }

    /**
     * Create an instance of {@link WireBenfRefType }
     * 
     */
    public WireBenfRefType createWireBenfRefType() {
        return new WireBenfRefType();
    }

    /**
     * Create an instance of {@link WireDrFinInstIdType }
     * 
     */
    public WireDrFinInstIdType createWireDrFinInstIdType() {
        return new WireDrFinInstIdType();
    }

    /**
     * Create an instance of {@link WireDrFinInstNameType }
     * 
     */
    public WireDrFinInstNameType createWireDrFinInstNameType() {
        return new WireDrFinInstNameType();
    }

    /**
     * Create an instance of {@link WireOrignInfoRecCType }
     * 
     */
    public WireOrignInfoRecCType createWireOrignInfoRecCType() {
        return new WireOrignInfoRecCType();
    }

    /**
     * Create an instance of {@link WireOrignFinInstIdType }
     * 
     */
    public WireOrignFinInstIdType createWireOrignFinInstIdType() {
        return new WireOrignFinInstIdType();
    }

    /**
     * Create an instance of {@link WireOrignFinInstNameType }
     * 
     */
    public WireOrignFinInstNameType createWireOrignFinInstNameType() {
        return new WireOrignFinInstNameType();
    }

    /**
     * Create an instance of {@link WireInstrFinInstIdType }
     * 
     */
    public WireInstrFinInstIdType createWireInstrFinInstIdType() {
        return new WireInstrFinInstIdType();
    }

    /**
     * Create an instance of {@link WireInstrFinInstNameType }
     * 
     */
    public WireInstrFinInstNameType createWireInstrFinInstNameType() {
        return new WireInstrFinInstNameType();
    }

    /**
     * Create an instance of {@link WireDrwDwnCrFinInstAcctIdType }
     * 
     */
    public WireDrwDwnCrFinInstAcctIdType createWireDrwDwnCrFinInstAcctIdType() {
        return new WireDrwDwnCrFinInstAcctIdType();
    }

    /**
     * Create an instance of {@link WireOrignToBenfInfoRecCType }
     * 
     */
    public WireOrignToBenfInfoRecCType createWireOrignToBenfInfoRecCType() {
        return new WireOrignToBenfInfoRecCType();
    }

    /**
     * Create an instance of {@link WireFinInstToFinInstInfoRecCType }
     * 
     */
    public WireFinInstToFinInstInfoRecCType createWireFinInstToFinInstInfoRecCType() {
        return new WireFinInstToFinInstInfoRecCType();
    }

    /**
     * Create an instance of {@link WirePmtMthdType }
     * 
     */
    public WirePmtMthdType createWirePmtMthdType() {
        return new WirePmtMthdType();
    }

    /**
     * Create an instance of {@link WireSchedRecArrayAType }
     * 
     */
    public WireSchedRecArrayAType createWireSchedRecArrayAType() {
        return new WireSchedRecArrayAType();
    }

    /**
     * Create an instance of {@link WireSchedRecCType }
     * 
     */
    public WireSchedRecCType createWireSchedRecCType() {
        return new WireSchedRecCType();
    }

    /**
     * Create an instance of {@link WireSchedStatType }
     * 
     */
    public WireSchedStatType createWireSchedStatType() {
        return new WireSchedStatType();
    }

    /**
     * Create an instance of {@link WireInitDtType }
     * 
     */
    public WireInitDtType createWireInitDtType() {
        return new WireInitDtType();
    }

    /**
     * Create an instance of {@link WireInitTimeType }
     * 
     */
    public WireInitTimeType createWireInitTimeType() {
        return new WireInitTimeType();
    }

    /**
     * Create an instance of {@link WireUsrIdType }
     * 
     */
    public WireUsrIdType createWireUsrIdType() {
        return new WireUsrIdType();
    }

    /**
     * Create an instance of {@link WireVerifIdType }
     * 
     */
    public WireVerifIdType createWireVerifIdType() {
        return new WireVerifIdType();
    }

    /**
     * Create an instance of {@link WireTmpltCrtType }
     * 
     */
    public WireTmpltCrtType createWireTmpltCrtType() {
        return new WireTmpltCrtType();
    }

    /**
     * Create an instance of {@link WireCompIdType }
     * 
     */
    public WireCompIdType createWireCompIdType() {
        return new WireCompIdType();
    }

    /**
     * Create an instance of {@link EmplIdType }
     * 
     */
    public EmplIdType createEmplIdType() {
        return new EmplIdType();
    }

    /**
     * Create an instance of {@link EmplNameType }
     * 
     */
    public EmplNameType createEmplNameType() {
        return new EmplNameType();
    }

    /**
     * Create an instance of {@link WireCorrelIdType }
     * 
     */
    public WireCorrelIdType createWireCorrelIdType() {
        return new WireCorrelIdType();
    }

    /**
     * Create an instance of {@link FraudRefIdType }
     * 
     */
    public FraudRefIdType createFraudRefIdType() {
        return new FraudRefIdType();
    }

    /**
     * Create an instance of {@link WireTmpltIdType }
     * 
     */
    public WireTmpltIdType createWireTmpltIdType() {
        return new WireTmpltIdType();
    }

    /**
     * Create an instance of {@link WireQuoteIdType }
     * 
     */
    public WireQuoteIdType createWireQuoteIdType() {
        return new WireQuoteIdType();
    }

    /**
     * Create an instance of {@link WireContrRefIdType }
     * 
     */
    public WireContrRefIdType createWireContrRefIdType() {
        return new WireContrRefIdType();
    }

    /**
     * Create an instance of {@link FundMthdTypeType }
     * 
     */
    public FundMthdTypeType createFundMthdTypeType() {
        return new FundMthdTypeType();
    }

    /**
     * Create an instance of {@link WireIntlQuoteRecCType }
     * 
     */
    public WireIntlQuoteRecCType createWireIntlQuoteRecCType() {
        return new WireIntlQuoteRecCType();
    }

    /**
     * Create an instance of {@link WireTrnTimeDtType }
     * 
     */
    public WireTrnTimeDtType createWireTrnTimeDtType() {
        return new WireTrnTimeDtType();
    }

    /**
     * Create an instance of {@link CurrPmtTypeType }
     * 
     */
    public CurrPmtTypeType createCurrPmtTypeType() {
        return new CurrPmtTypeType();
    }

    /**
     * Create an instance of {@link FornCurrAmtType }
     * 
     */
    public FornCurrAmtType createFornCurrAmtType() {
        return new FornCurrAmtType();
    }

    /**
     * Create an instance of {@link SttlCostAmtType }
     * 
     */
    public SttlCostAmtType createSttlCostAmtType() {
        return new SttlCostAmtType();
    }

    /**
     * Create an instance of {@link WireBankFeeAmtType }
     * 
     */
    public WireBankFeeAmtType createWireBankFeeAmtType() {
        return new WireBankFeeAmtType();
    }

    /**
     * Create an instance of {@link WireBankTaxAmtType }
     * 
     */
    public WireBankTaxAmtType createWireBankTaxAmtType() {
        return new WireBankTaxAmtType();
    }

    /**
     * Create an instance of {@link FeeAmtType }
     * 
     */
    public FeeAmtType createFeeAmtType() {
        return new FeeAmtType();
    }

    /**
     * Create an instance of {@link CurrTypeType }
     * 
     */
    public CurrTypeType createCurrTypeType() {
        return new CurrTypeType();
    }

    /**
     * Create an instance of {@link SttlNetCostAmtType }
     * 
     */
    public SttlNetCostAmtType createSttlNetCostAmtType() {
        return new SttlNetCostAmtType();
    }

    /**
     * Create an instance of {@link WireIntlCustInfoRecCType }
     * 
     */
    public WireIntlCustInfoRecCType createWireIntlCustInfoRecCType() {
        return new WireIntlCustInfoRecCType();
    }

    /**
     * Create an instance of {@link IdVerifyCodeType }
     * 
     */
    public IdVerifyCodeType createIdVerifyCodeType() {
        return new IdVerifyCodeType();
    }

    /**
     * Create an instance of {@link IdVerifyValType }
     * 
     */
    public IdVerifyValType createIdVerifyValType() {
        return new IdVerifyValType();
    }

    /**
     * Create an instance of {@link CustTypeType }
     * 
     */
    public CustTypeType createCustTypeType() {
        return new CustTypeType();
    }

    /**
     * Create an instance of {@link CustIdType }
     * 
     */
    public CustIdType createCustIdType() {
        return new CustIdType();
    }

    /**
     * Create an instance of {@link WireCustInfoCType }
     * 
     */
    public WireCustInfoCType createWireCustInfoCType() {
        return new WireCustInfoCType();
    }

    /**
     * Create an instance of {@link PhoneArrayAType }
     * 
     */
    public PhoneArrayAType createPhoneArrayAType() {
        return new PhoneArrayAType();
    }

    /**
     * Create an instance of {@link PhoneInfoCType }
     * 
     */
    public PhoneInfoCType createPhoneInfoCType() {
        return new PhoneInfoCType();
    }

    /**
     * Create an instance of {@link PhoneNumType }
     * 
     */
    public PhoneNumType createPhoneNumType() {
        return new PhoneNumType();
    }

    /**
     * Create an instance of {@link PhoneTypeType }
     * 
     */
    public PhoneTypeType createPhoneTypeType() {
        return new PhoneTypeType();
    }

    /**
     * Create an instance of {@link PhoneTimeType }
     * 
     */
    public PhoneTimeType createPhoneTimeType() {
        return new PhoneTimeType();
    }

    /**
     * Create an instance of {@link PhoneExtType }
     * 
     */
    public PhoneExtType createPhoneExtType() {
        return new PhoneExtType();
    }

    /**
     * Create an instance of {@link ConStartTimeType }
     * 
     */
    public ConStartTimeType createConStartTimeType() {
        return new ConStartTimeType();
    }

    /**
     * Create an instance of {@link ConEndTimeType }
     * 
     */
    public ConEndTimeType createConEndTimeType() {
        return new ConEndTimeType();
    }

    /**
     * Create an instance of {@link MobPhoneInfoCType }
     * 
     */
    public MobPhoneInfoCType createMobPhoneInfoCType() {
        return new MobPhoneInfoCType();
    }

    /**
     * Create an instance of {@link MobPrvdCodeType }
     * 
     */
    public MobPrvdCodeType createMobPrvdCodeType() {
        return new MobPrvdCodeType();
    }

    /**
     * Create an instance of {@link MobPrvdCodeDescType }
     * 
     */
    public MobPrvdCodeDescType createMobPrvdCodeDescType() {
        return new MobPrvdCodeDescType();
    }

    /**
     * Create an instance of {@link MobPrvdDomType }
     * 
     */
    public MobPrvdDomType createMobPrvdDomType() {
        return new MobPrvdDomType();
    }

    /**
     * Create an instance of {@link MobBBType }
     * 
     */
    public MobBBType createMobBBType() {
        return new MobBBType();
    }

    /**
     * Create an instance of {@link MobSendTestTextType }
     * 
     */
    public MobSendTestTextType createMobSendTestTextType() {
        return new MobSendTestTextType();
    }

    /**
     * Create an instance of {@link PrioritySeqType }
     * 
     */
    public PrioritySeqType createPrioritySeqType() {
        return new PrioritySeqType();
    }

    /**
     * Create an instance of {@link PhoneNumDspType }
     * 
     */
    public PhoneNumDspType createPhoneNumDspType() {
        return new PhoneNumDspType();
    }

    /**
     * Create an instance of {@link WireConArrayAType }
     * 
     */
    public WireConArrayAType createWireConArrayAType() {
        return new WireConArrayAType();
    }

    /**
     * Create an instance of {@link WireConInfoCType }
     * 
     */
    public WireConInfoCType createWireConInfoCType() {
        return new WireConInfoCType();
    }

    /**
     * Create an instance of {@link WireIntlTrnInfoRecCType }
     * 
     */
    public WireIntlTrnInfoRecCType createWireIntlTrnInfoRecCType() {
        return new WireIntlTrnInfoRecCType();
    }

    /**
     * Create an instance of {@link WireIntlBenfInfoRecCType }
     * 
     */
    public WireIntlBenfInfoRecCType createWireIntlBenfInfoRecCType() {
        return new WireIntlBenfInfoRecCType();
    }

    /**
     * Create an instance of {@link EmailArrayAType }
     * 
     */
    public EmailArrayAType createEmailArrayAType() {
        return new EmailArrayAType();
    }

    /**
     * Create an instance of {@link EmailInfoCType }
     * 
     */
    public EmailInfoCType createEmailInfoCType() {
        return new EmailInfoCType();
    }

    /**
     * Create an instance of {@link EmailAddrType }
     * 
     */
    public EmailAddrType createEmailAddrType() {
        return new EmailAddrType();
    }

    /**
     * Create an instance of {@link EmailTypeType }
     * 
     */
    public EmailTypeType createEmailTypeType() {
        return new EmailTypeType();
    }

    /**
     * Create an instance of {@link FinInstRtIdType }
     * 
     */
    public FinInstRtIdType createFinInstRtIdType() {
        return new FinInstRtIdType();
    }

    /**
     * Create an instance of {@link SvcFeeTrnInfoCType }
     * 
     */
    public SvcFeeTrnInfoCType createSvcFeeTrnInfoCType() {
        return new SvcFeeTrnInfoCType();
    }

    /**
     * Create an instance of {@link SvcFeeCodeType }
     * 
     */
    public SvcFeeCodeType createSvcFeeCodeType() {
        return new SvcFeeCodeType();
    }

    /**
     * Create an instance of {@link SvcFeeChgDtType }
     * 
     */
    public SvcFeeChgDtType createSvcFeeChgDtType() {
        return new SvcFeeChgDtType();
    }

    /**
     * Create an instance of {@link RefBalAffTypeType }
     * 
     */
    public RefBalAffTypeType createRefBalAffTypeType() {
        return new RefBalAffTypeType();
    }

    /**
     * Create an instance of {@link IssItemCrtDtType }
     * 
     */
    public IssItemCrtDtType createIssItemCrtDtType() {
        return new IssItemCrtDtType();
    }

    /**
     * Create an instance of {@link AcctReconItemRecCType }
     * 
     */
    public AcctReconItemRecCType createAcctReconItemRecCType() {
        return new AcctReconItemRecCType();
    }

    /**
     * Create an instance of {@link TrnTypeType }
     * 
     */
    public TrnTypeType createTrnTypeType() {
        return new TrnTypeType();
    }

    /**
     * Create an instance of {@link UserDefInfoArrayAType }
     * 
     */
    public UserDefInfoArrayAType createUserDefInfoArrayAType() {
        return new UserDefInfoArrayAType();
    }

    /**
     * Create an instance of {@link UserDefInfoCType }
     * 
     */
    public UserDefInfoCType createUserDefInfoCType() {
        return new UserDefInfoCType();
    }

    /**
     * Create an instance of {@link UserDefTxtType }
     * 
     */
    public UserDefTxtType createUserDefTxtType() {
        return new UserDefTxtType();
    }

    /**
     * Create an instance of {@link UserDefCodeType }
     * 
     */
    public UserDefCodeType createUserDefCodeType() {
        return new UserDefCodeType();
    }

    /**
     * Create an instance of {@link UserDefDescType }
     * 
     */
    public UserDefDescType createUserDefDescType() {
        return new UserDefDescType();
    }

    /**
     * Create an instance of {@link UserDefDtType }
     * 
     */
    public UserDefDtType createUserDefDtType() {
        return new UserDefDtType();
    }

    /**
     * Create an instance of {@link UserDefInfoType }
     * 
     */
    public UserDefInfoType createUserDefInfoType() {
        return new UserDefInfoType();
    }

    /**
     * Create an instance of {@link UsrTokenType }
     * 
     */
    public UsrTokenType createUsrTokenType() {
        return new UsrTokenType();
    }

    /**
     * Create an instance of {@link PmtIdType }
     * 
     */
    public PmtIdType createPmtIdType() {
        return new PmtIdType();
    }

    /**
     * Create an instance of {@link ImmedInfoRecCType }
     * 
     */
    public ImmedInfoRecCType createImmedInfoRecCType() {
        return new ImmedInfoRecCType();
    }

    /**
     * Create an instance of {@link PmtRailTypeType }
     * 
     */
    public PmtRailTypeType createPmtRailTypeType() {
        return new PmtRailTypeType();
    }

    /**
     * Create an instance of {@link UsrIPAddrType }
     * 
     */
    public UsrIPAddrType createUsrIPAddrType() {
        return new UsrIPAddrType();
    }

    /**
     * Create an instance of {@link MobDevIdType }
     * 
     */
    public MobDevIdType createMobDevIdType() {
        return new MobDevIdType();
    }

    /**
     * Create an instance of {@link DrCustInfoRecCType }
     * 
     */
    public DrCustInfoRecCType createDrCustInfoRecCType() {
        return new DrCustInfoRecCType();
    }

    /**
     * Create an instance of {@link PmtCustTypeType }
     * 
     */
    public PmtCustTypeType createPmtCustTypeType() {
        return new PmtCustTypeType();
    }

    /**
     * Create an instance of {@link BirthDtType }
     * 
     */
    public BirthDtType createBirthDtType() {
        return new BirthDtType();
    }

    /**
     * Create an instance of {@link UsrTokenTypeType }
     * 
     */
    public UsrTokenTypeType createUsrTokenTypeType() {
        return new UsrTokenTypeType();
    }

    /**
     * Create an instance of {@link CrCustInfoRecCType }
     * 
     */
    public CrCustInfoRecCType createCrCustInfoRecCType() {
        return new CrCustInfoRecCType();
    }

    /**
     * Create an instance of {@link RemitPmtArrayAType }
     * 
     */
    public RemitPmtArrayAType createRemitPmtArrayAType() {
        return new RemitPmtArrayAType();
    }

    /**
     * Create an instance of {@link RemitPmtInfoCType }
     * 
     */
    public RemitPmtInfoCType createRemitPmtInfoCType() {
        return new RemitPmtInfoCType();
    }

    /**
     * Create an instance of {@link PmtBatchIdType }
     * 
     */
    public PmtBatchIdType createPmtBatchIdType() {
        return new PmtBatchIdType();
    }

    /**
     * Create an instance of {@link PmtHubCrXferModRecCType }
     * 
     */
    public PmtHubCrXferModRecCType createPmtHubCrXferModRecCType() {
        return new PmtHubCrXferModRecCType();
    }

    /**
     * Create an instance of {@link PmtHubActStatType }
     * 
     */
    public PmtHubActStatType createPmtHubActStatType() {
        return new PmtHubActStatType();
    }

    /**
     * Create an instance of {@link PmtRqDescType }
     * 
     */
    public PmtRqDescType createPmtRqDescType() {
        return new PmtRqDescType();
    }

    /**
     * Create an instance of {@link PmtRqTermDescType }
     * 
     */
    public PmtRqTermDescType createPmtRqTermDescType() {
        return new PmtRqTermDescType();
    }

    /**
     * Create an instance of {@link InvoiceIdType }
     * 
     */
    public InvoiceIdType createInvoiceIdType() {
        return new InvoiceIdType();
    }

    /**
     * Create an instance of {@link PurchOrderIdType }
     * 
     */
    public PurchOrderIdType createPurchOrderIdType() {
        return new PurchOrderIdType();
    }

    /**
     * Create an instance of {@link PmtRqArrayAType }
     * 
     */
    public PmtRqArrayAType createPmtRqArrayAType() {
        return new PmtRqArrayAType();
    }

    /**
     * Create an instance of {@link PmtRqInfoCType }
     * 
     */
    public PmtRqInfoCType createPmtRqInfoCType() {
        return new PmtRqInfoCType();
    }

    /**
     * Create an instance of {@link PmtRqAmtType }
     * 
     */
    public PmtRqAmtType createPmtRqAmtType() {
        return new PmtRqAmtType();
    }

    /**
     * Create an instance of {@link PmtRqRsArrayAType }
     * 
     */
    public PmtRqRsArrayAType createPmtRqRsArrayAType() {
        return new PmtRqRsArrayAType();
    }

    /**
     * Create an instance of {@link PmtRqRsInfoCType }
     * 
     */
    public PmtRqRsInfoCType createPmtRqRsInfoCType() {
        return new PmtRqRsInfoCType();
    }

    /**
     * Create an instance of {@link PmtRqRespStatTypeType }
     * 
     */
    public PmtRqRespStatTypeType createPmtRqRespStatTypeType() {
        return new PmtRqRespStatTypeType();
    }

    /**
     * Create an instance of {@link ExcItemIdType }
     * 
     */
    public ExcItemIdType createExcItemIdType() {
        return new ExcItemIdType();
    }

    /**
     * Create an instance of {@link ExcTrnRecCType }
     * 
     */
    public ExcTrnRecCType createExcTrnRecCType() {
        return new ExcTrnRecCType();
    }

    /**
     * Create an instance of {@link ExcRetSrcCodeType }
     * 
     */
    public ExcRetSrcCodeType createExcRetSrcCodeType() {
        return new ExcRetSrcCodeType();
    }

    /**
     * Create an instance of {@link ACHRetRsnCodeType }
     * 
     */
    public ACHRetRsnCodeType createACHRetRsnCodeType() {
        return new ACHRetRsnCodeType();
    }

    /**
     * Create an instance of {@link PromoXferRecCType }
     * 
     */
    public PromoXferRecCType createPromoXferRecCType() {
        return new PromoXferRecCType();
    }

    /**
     * Create an instance of {@link XferRecTextType }
     * 
     */
    public XferRecTextType createXferRecTextType() {
        return new XferRecTextType();
    }

    /**
     * Create an instance of {@link PromoCodeType }
     * 
     */
    public PromoCodeType createPromoCodeType() {
        return new PromoCodeType();
    }

    /**
     * Create an instance of {@link FutXferLastDtType }
     * 
     */
    public FutXferLastDtType createFutXferLastDtType() {
        return new FutXferLastDtType();
    }

    /**
     * Create an instance of {@link FutXferEnterDtType }
     * 
     */
    public FutXferEnterDtType createFutXferEnterDtType() {
        return new FutXferEnterDtType();
    }

    /**
     * Create an instance of {@link ForcePostTypeType }
     * 
     */
    public ForcePostTypeType createForcePostTypeType() {
        return new ForcePostTypeType();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link AttributedDateTime }
     * 
     */
    public AttributedDateTime createAttributedDateTime() {
        return new AttributedDateTime();
    }

    /**
     * Create an instance of {@link AttributedURI }
     * 
     */
    public AttributedURI createAttributedURI() {
        return new AttributedURI();
    }

    /**
     * Create an instance of {@link UsernameTokenType }
     * 
     */
    public UsernameTokenType createUsernameTokenType() {
        return new UsernameTokenType();
    }

    /**
     * Create an instance of {@link BinarySecurityTokenType }
     * 
     */
    public BinarySecurityTokenType createBinarySecurityTokenType() {
        return new BinarySecurityTokenType();
    }

    /**
     * Create an instance of {@link ReferenceType2 }
     * 
     */
    public ReferenceType2 createReferenceType2() {
        return new ReferenceType2();
    }

    /**
     * Create an instance of {@link EmbeddedType }
     * 
     */
    public EmbeddedType createEmbeddedType() {
        return new EmbeddedType();
    }

    /**
     * Create an instance of {@link KeyIdentifierType }
     * 
     */
    public KeyIdentifierType createKeyIdentifierType() {
        return new KeyIdentifierType();
    }

    /**
     * Create an instance of {@link SecurityTokenReferenceType }
     * 
     */
    public SecurityTokenReferenceType createSecurityTokenReferenceType() {
        return new SecurityTokenReferenceType();
    }

    /**
     * Create an instance of {@link SecurityHeaderType }
     * 
     */
    public SecurityHeaderType createSecurityHeaderType() {
        return new SecurityHeaderType();
    }

    /**
     * Create an instance of {@link TransformationParametersType }
     * 
     */
    public TransformationParametersType createTransformationParametersType() {
        return new TransformationParametersType();
    }

    /**
     * Create an instance of {@link PasswordString }
     * 
     */
    public PasswordString createPasswordString() {
        return new PasswordString();
    }

    /**
     * Create an instance of {@link EncodedString }
     * 
     */
    public EncodedString createEncodedString() {
        return new EncodedString();
    }

    /**
     * Create an instance of {@link AttributedString }
     * 
     */
    public AttributedString createAttributedString() {
        return new AttributedString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureValue")
    public JAXBElement<SignatureValueType> createSignatureValue(SignatureValueType value) {
        return new JAXBElement<SignatureValueType>(_SignatureValue_QNAME, SignatureValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignedInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignedInfo")
    public JAXBElement<SignedInfoType> createSignedInfo(SignedInfoType value) {
        return new JAXBElement<SignedInfoType>(_SignedInfo_QNAME, SignedInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<CanonicalizationMethodType>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<SignatureMethodType>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "W3Reference")
    public JAXBElement<ReferenceType> createW3Reference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_W3Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transforms")
    public JAXBElement<TransformsType> createTransforms(TransformsType value) {
        return new JAXBElement<TransformsType>(_Transforms_QNAME, TransformsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Transform")
    public JAXBElement<TransformType> createTransform(TransformType value) {
        return new JAXBElement<TransformType>(_Transform_QNAME, TransformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestMethod")
    public JAXBElement<DigestMethodType> createDigestMethod(DigestMethodType value) {
        return new JAXBElement<DigestMethodType>(_DigestMethod_QNAME, DigestMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyInfo")
    public JAXBElement<KeyInfoType> createKeyInfo(KeyInfoType value) {
        return new JAXBElement<KeyInfoType>(_KeyInfo_QNAME, KeyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyValue")
    public JAXBElement<KeyValueType> createKeyValue(KeyValueType value) {
        return new JAXBElement<KeyValueType>(_KeyValue_QNAME, KeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RetrievalMethod")
    public JAXBElement<RetrievalMethodType> createRetrievalMethod(RetrievalMethodType value) {
        return new JAXBElement<RetrievalMethodType>(_RetrievalMethod_QNAME, RetrievalMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Data")
    public JAXBElement<X509DataType> createX509Data(X509DataType value) {
        return new JAXBElement<X509DataType>(_X509Data_QNAME, X509DataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPData")
    public JAXBElement<PGPDataType> createPGPData(PGPDataType value) {
        return new JAXBElement<PGPDataType>(_PGPData_QNAME, PGPDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKIData")
    public JAXBElement<SPKIDataType> createSPKIData(SPKIDataType value) {
        return new JAXBElement<SPKIDataType>(_SPKIData_QNAME, SPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<ObjectType>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManifestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Manifest")
    public JAXBElement<ManifestType> createManifest(ManifestType value) {
        return new JAXBElement<ManifestType>(_Manifest_QNAME, ManifestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperties")
    public JAXBElement<SignaturePropertiesType> createSignatureProperties(SignaturePropertiesType value) {
        return new JAXBElement<SignaturePropertiesType>(_SignatureProperties_QNAME, SignaturePropertiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SignatureProperty")
    public JAXBElement<SignaturePropertyType> createSignatureProperty(SignaturePropertyType value) {
        return new JAXBElement<SignaturePropertyType>(_SignatureProperty_QNAME, SignaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DSAKeyValue")
    public JAXBElement<DSAKeyValueType> createDSAKeyValue(DSAKeyValueType value) {
        return new JAXBElement<DSAKeyValueType>(_DSAKeyValue_QNAME, DSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSAKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "RSAKeyValue")
    public JAXBElement<RSAKeyValueType> createRSAKeyValue(RSAKeyValueType value) {
        return new JAXBElement<RSAKeyValueType>(_RSAKeyValue_QNAME, RSAKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Ping")
    public JAXBElement<PingRqMType> createPing(PingRqMType value) {
        return new JAXBElement<PingRqMType>(_Ping_QNAME, PingRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PingResponse")
    public JAXBElement<PingRsMType> createPingResponse(PingRsMType value) {
        return new JAXBElement<PingRsMType>(_PingResponse_QNAME, PingRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HdrFaultMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "HdrFault")
    public JAXBElement<HdrFaultMType> createHdrFault(HdrFaultMType value) {
        return new JAXBElement<HdrFaultMType>(_HdrFault_QNAME, HdrFaultMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkAdd")
    public JAXBElement<StopChkAddRqMType> createStopChkAdd(StopChkAddRqMType value) {
        return new JAXBElement<StopChkAddRqMType>(_StopChkAdd_QNAME, StopChkAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkAddResponse")
    public JAXBElement<StopChkAddRsMType> createStopChkAddResponse(StopChkAddRsMType value) {
        return new JAXBElement<StopChkAddRsMType>(_StopChkAddResponse_QNAME, StopChkAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferAdd")
    public JAXBElement<XferAddRqMType> createXferAdd(XferAddRqMType value) {
        return new JAXBElement<XferAddRqMType>(_XferAdd_QNAME, XferAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferAddResponse")
    public JAXBElement<XferAddRsMType> createXferAddResponse(XferAddRsMType value) {
        return new JAXBElement<XferAddRsMType>(_XferAddResponse_QNAME, XferAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkCanRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkCan")
    public JAXBElement<StopChkCanRqMType> createStopChkCan(StopChkCanRqMType value) {
        return new JAXBElement<StopChkCanRqMType>(_StopChkCan_QNAME, StopChkCanRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkCanRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkCanResponse")
    public JAXBElement<StopChkCanRsMType> createStopChkCanResponse(StopChkCanRsMType value) {
        return new JAXBElement<StopChkCanRsMType>(_StopChkCanResponse_QNAME, StopChkCanRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAdd")
    public JAXBElement<TrnAddRqMType> createTrnAdd(TrnAddRqMType value) {
        return new JAXBElement<TrnAddRqMType>(_TrnAdd_QNAME, TrnAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddResponse")
    public JAXBElement<TrnAddRsMType> createTrnAddResponse(TrnAddRsMType value) {
        return new JAXBElement<TrnAddRsMType>(_TrnAddResponse_QNAME, TrnAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferMod")
    public JAXBElement<XferModRqMType> createXferMod(XferModRqMType value) {
        return new JAXBElement<XferModRqMType>(_XferMod_QNAME, XferModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferModResponse")
    public JAXBElement<XferModRsMType> createXferModResponse(XferModRsMType value) {
        return new JAXBElement<XferModRsMType>(_XferModResponse_QNAME, XferModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnMod")
    public JAXBElement<TrnModRqMType> createTrnMod(TrnModRqMType value) {
        return new JAXBElement<TrnModRqMType>(_TrnMod_QNAME, TrnModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnModResponse")
    public JAXBElement<TrnModRsMType> createTrnModResponse(TrnModRsMType value) {
        return new JAXBElement<TrnModRsMType>(_TrnModResponse_QNAME, TrnModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferAddValidateRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferAddValidate")
    public JAXBElement<XferAddValidateRqMType> createXferAddValidate(XferAddValidateRqMType value) {
        return new JAXBElement<XferAddValidateRqMType>(_XferAddValidate_QNAME, XferAddValidateRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferAddValidateRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferAddValidateResponse")
    public JAXBElement<XferAddValidateRsMType> createXferAddValidateResponse(XferAddValidateRsMType value) {
        return new JAXBElement<XferAddValidateRsMType>(_XferAddValidateResponse_QNAME, XferAddValidateRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddValidateRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddValidate")
    public JAXBElement<TrnAddValidateRqMType> createTrnAddValidate(TrnAddValidateRqMType value) {
        return new JAXBElement<TrnAddValidateRqMType>(_TrnAddValidate_QNAME, TrnAddValidateRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddValidateRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddValidateResponse")
    public JAXBElement<TrnAddValidateRsMType> createTrnAddValidateResponse(TrnAddValidateRsMType value) {
        return new JAXBElement<TrnAddValidateRsMType>(_TrnAddValidateResponse_QNAME, TrnAddValidateRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkAddValidateRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkAddValidate")
    public JAXBElement<StopChkAddValidateRqMType> createStopChkAddValidate(StopChkAddValidateRqMType value) {
        return new JAXBElement<StopChkAddValidateRqMType>(_StopChkAddValidate_QNAME, StopChkAddValidateRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkAddValidateRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkAddValidateResponse")
    public JAXBElement<StopChkAddValidateRsMType> createStopChkAddValidateResponse(StopChkAddValidateRsMType value) {
        return new JAXBElement<StopChkAddValidateRsMType>(_StopChkAddValidateResponse_QNAME, StopChkAddValidateRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctAnlysTrnAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctAnlysTrnAdd")
    public JAXBElement<AcctAnlysTrnAddRqMType> createAcctAnlysTrnAdd(AcctAnlysTrnAddRqMType value) {
        return new JAXBElement<AcctAnlysTrnAddRqMType>(_AcctAnlysTrnAdd_QNAME, AcctAnlysTrnAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctAnlysTrnAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctAnlysTrnAddResponse")
    public JAXBElement<AcctAnlysTrnAddRsMType> createAcctAnlysTrnAddResponse(AcctAnlysTrnAddRsMType value) {
        return new JAXBElement<AcctAnlysTrnAddRsMType>(_AcctAnlysTrnAddResponse_QNAME, AcctAnlysTrnAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctAnlysTrnModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctAnlysTrnMod")
    public JAXBElement<AcctAnlysTrnModRqMType> createAcctAnlysTrnMod(AcctAnlysTrnModRqMType value) {
        return new JAXBElement<AcctAnlysTrnModRqMType>(_AcctAnlysTrnMod_QNAME, AcctAnlysTrnModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctAnlysTrnModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctAnlysTrnModResponse")
    public JAXBElement<AcctAnlysTrnModRsMType> createAcctAnlysTrnModResponse(AcctAnlysTrnModRsMType value) {
        return new JAXBElement<AcctAnlysTrnModRsMType>(_AcctAnlysTrnModResponse_QNAME, AcctAnlysTrnModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctNSFTrnModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctNSFTrnMod")
    public JAXBElement<AcctNSFTrnModRqMType> createAcctNSFTrnMod(AcctNSFTrnModRqMType value) {
        return new JAXBElement<AcctNSFTrnModRqMType>(_AcctNSFTrnMod_QNAME, AcctNSFTrnModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctNSFTrnModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctNSFTrnModResponse")
    public JAXBElement<AcctNSFTrnModRsMType> createAcctNSFTrnModResponse(AcctNSFTrnModRsMType value) {
        return new JAXBElement<AcctNSFTrnModRsMType>(_AcctNSFTrnModResponse_QNAME, AcctNSFTrnModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuote")
    public JAXBElement<TrnAddQuoteRqMType> createTrnAddQuote(TrnAddQuoteRqMType value) {
        return new JAXBElement<TrnAddQuoteRqMType>(_TrnAddQuote_QNAME, TrnAddQuoteRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteResponse")
    public JAXBElement<TrnAddQuoteRsMType> createTrnAddQuoteResponse(TrnAddQuoteRsMType value) {
        return new JAXBElement<TrnAddQuoteRsMType>(_TrnAddQuoteResponse_QNAME, TrnAddQuoteRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteCanRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteCan")
    public JAXBElement<TrnAddQuoteCanRqMType> createTrnAddQuoteCan(TrnAddQuoteCanRqMType value) {
        return new JAXBElement<TrnAddQuoteCanRqMType>(_TrnAddQuoteCan_QNAME, TrnAddQuoteCanRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteCanRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteCanResponse")
    public JAXBElement<TrnAddQuoteCanRsMType> createTrnAddQuoteCanResponse(TrnAddQuoteCanRsMType value) {
        return new JAXBElement<TrnAddQuoteCanRsMType>(_TrnAddQuoteCanResponse_QNAME, TrnAddQuoteCanRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteCommRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteComm")
    public JAXBElement<TrnAddQuoteCommRqMType> createTrnAddQuoteComm(TrnAddQuoteCommRqMType value) {
        return new JAXBElement<TrnAddQuoteCommRqMType>(_TrnAddQuoteComm_QNAME, TrnAddQuoteCommRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteCommRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteCommResponse")
    public JAXBElement<TrnAddQuoteCommRsMType> createTrnAddQuoteCommResponse(TrnAddQuoteCommRsMType value) {
        return new JAXBElement<TrnAddQuoteCommRsMType>(_TrnAddQuoteCommResponse_QNAME, TrnAddQuoteCommRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeDepPmtAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SafeDepPmtAdd")
    public JAXBElement<SafeDepPmtAddRqMType> createSafeDepPmtAdd(SafeDepPmtAddRqMType value) {
        return new JAXBElement<SafeDepPmtAddRqMType>(_SafeDepPmtAdd_QNAME, SafeDepPmtAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeDepPmtAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SafeDepPmtAddResponse")
    public JAXBElement<SafeDepPmtAddRsMType> createSafeDepPmtAddResponse(SafeDepPmtAddRsMType value) {
        return new JAXBElement<SafeDepPmtAddRsMType>(_SafeDepPmtAddResponse_QNAME, SafeDepPmtAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeDepPmtModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SafeDepPmtMod")
    public JAXBElement<SafeDepPmtModRqMType> createSafeDepPmtMod(SafeDepPmtModRqMType value) {
        return new JAXBElement<SafeDepPmtModRqMType>(_SafeDepPmtMod_QNAME, SafeDepPmtModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeDepPmtModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SafeDepPmtModResponse")
    public JAXBElement<SafeDepPmtModRsMType> createSafeDepPmtModResponse(SafeDepPmtModRsMType value) {
        return new JAXBElement<SafeDepPmtModRsMType>(_SafeDepPmtModResponse_QNAME, SafeDepPmtModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssItemMultiAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IssItemMultiAdd")
    public JAXBElement<IssItemMultiAddRqMType> createIssItemMultiAdd(IssItemMultiAddRqMType value) {
        return new JAXBElement<IssItemMultiAddRqMType>(_IssItemMultiAdd_QNAME, IssItemMultiAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssItemMultiAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IssItemMultiAddResponse")
    public JAXBElement<IssItemMultiAddRsMType> createIssItemMultiAddResponse(IssItemMultiAddRsMType value) {
        return new JAXBElement<IssItemMultiAddRsMType>(_IssItemMultiAddResponse_QNAME, IssItemMultiAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosPayItemModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PosPayItemMod")
    public JAXBElement<PosPayItemModRqMType> createPosPayItemMod(PosPayItemModRqMType value) {
        return new JAXBElement<PosPayItemModRqMType>(_PosPayItemMod_QNAME, PosPayItemModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosPayItemModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PosPayItemModResponse")
    public JAXBElement<PosPayItemModRsMType> createPosPayItemModResponse(PosPayItemModRsMType value) {
        return new JAXBElement<PosPayItemModRsMType>(_PosPayItemModResponse_QNAME, PosPayItemModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireTrnAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireTrnAdd")
    public JAXBElement<WireTrnAddRqMType> createWireTrnAdd(WireTrnAddRqMType value) {
        return new JAXBElement<WireTrnAddRqMType>(_WireTrnAdd_QNAME, WireTrnAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireTrnAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireTrnAddResponse")
    public JAXBElement<WireTrnAddRsMType> createWireTrnAddResponse(WireTrnAddRsMType value) {
        return new JAXBElement<WireTrnAddRsMType>(_WireTrnAddResponse_QNAME, WireTrnAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntlWireTrnAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IntlWireTrnAdd")
    public JAXBElement<IntlWireTrnAddRqMType> createIntlWireTrnAdd(IntlWireTrnAddRqMType value) {
        return new JAXBElement<IntlWireTrnAddRqMType>(_IntlWireTrnAdd_QNAME, IntlWireTrnAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntlWireTrnAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IntlWireTrnAddResponse")
    public JAXBElement<IntlWireTrnAddRsMType> createIntlWireTrnAddResponse(IntlWireTrnAddRsMType value) {
        return new JAXBElement<IntlWireTrnAddRsMType>(_IntlWireTrnAddResponse_QNAME, IntlWireTrnAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcFeeTrnAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SvcFeeTrnAdd")
    public JAXBElement<SvcFeeTrnAddRqMType> createSvcFeeTrnAdd(SvcFeeTrnAddRqMType value) {
        return new JAXBElement<SvcFeeTrnAddRqMType>(_SvcFeeTrnAdd_QNAME, SvcFeeTrnAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcFeeTrnAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SvcFeeTrnAddResponse")
    public JAXBElement<SvcFeeTrnAddRsMType> createSvcFeeTrnAddResponse(SvcFeeTrnAddRsMType value) {
        return new JAXBElement<SvcFeeTrnAddRsMType>(_SvcFeeTrnAddResponse_QNAME, SvcFeeTrnAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcFeeTrnModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SvcFeeTrnMod")
    public JAXBElement<SvcFeeTrnModRqMType> createSvcFeeTrnMod(SvcFeeTrnModRqMType value) {
        return new JAXBElement<SvcFeeTrnModRqMType>(_SvcFeeTrnMod_QNAME, SvcFeeTrnModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcFeeTrnModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SvcFeeTrnModResponse")
    public JAXBElement<SvcFeeTrnModRsMType> createSvcFeeTrnModResponse(SvcFeeTrnModRsMType value) {
        return new JAXBElement<SvcFeeTrnModRsMType>(_SvcFeeTrnModResponse_QNAME, SvcFeeTrnModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctReconItemModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctReconItemMod")
    public JAXBElement<AcctReconItemModRqMType> createAcctReconItemMod(AcctReconItemModRqMType value) {
        return new JAXBElement<AcctReconItemModRqMType>(_AcctReconItemMod_QNAME, AcctReconItemModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctReconItemModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctReconItemModResponse")
    public JAXBElement<AcctReconItemModRsMType> createAcctReconItemModResponse(AcctReconItemModRsMType value) {
        return new JAXBElement<AcctReconItemModRsMType>(_AcctReconItemModResponse_QNAME, AcctReconItemModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubCrXferAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubCrXferAdd")
    public JAXBElement<PmtHubCrXferAddRqMType> createPmtHubCrXferAdd(PmtHubCrXferAddRqMType value) {
        return new JAXBElement<PmtHubCrXferAddRqMType>(_PmtHubCrXferAdd_QNAME, PmtHubCrXferAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubCrXferAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubCrXferAddResponse")
    public JAXBElement<PmtHubCrXferAddRsMType> createPmtHubCrXferAddResponse(PmtHubCrXferAddRsMType value) {
        return new JAXBElement<PmtHubCrXferAddRsMType>(_PmtHubCrXferAddResponse_QNAME, PmtHubCrXferAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubCrXferModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubCrXferMod")
    public JAXBElement<PmtHubCrXferModRqMType> createPmtHubCrXferMod(PmtHubCrXferModRqMType value) {
        return new JAXBElement<PmtHubCrXferModRqMType>(_PmtHubCrXferMod_QNAME, PmtHubCrXferModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubCrXferModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubCrXferModResponse")
    public JAXBElement<PmtHubCrXferModRsMType> createPmtHubCrXferModResponse(PmtHubCrXferModRsMType value) {
        return new JAXBElement<PmtHubCrXferModRsMType>(_PmtHubCrXferModResponse_QNAME, PmtHubCrXferModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubPmtRqAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubPmtRqAdd")
    public JAXBElement<PmtHubPmtRqAddRqMType> createPmtHubPmtRqAdd(PmtHubPmtRqAddRqMType value) {
        return new JAXBElement<PmtHubPmtRqAddRqMType>(_PmtHubPmtRqAdd_QNAME, PmtHubPmtRqAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubPmtRqAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubPmtRqAddResponse")
    public JAXBElement<PmtHubPmtRqAddRsMType> createPmtHubPmtRqAddResponse(PmtHubPmtRqAddRsMType value) {
        return new JAXBElement<PmtHubPmtRqAddRsMType>(_PmtHubPmtRqAddResponse_QNAME, PmtHubPmtRqAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubPmtRqModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubPmtRqMod")
    public JAXBElement<PmtHubPmtRqModRqMType> createPmtHubPmtRqMod(PmtHubPmtRqModRqMType value) {
        return new JAXBElement<PmtHubPmtRqModRqMType>(_PmtHubPmtRqMod_QNAME, PmtHubPmtRqModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubPmtRqModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubPmtRqModResponse")
    public JAXBElement<PmtHubPmtRqModRsMType> createPmtHubPmtRqModResponse(PmtHubPmtRqModRsMType value) {
        return new JAXBElement<PmtHubPmtRqModRsMType>(_PmtHubPmtRqModResponse_QNAME, PmtHubPmtRqModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctExcTrnModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctExcTrnMod")
    public JAXBElement<AcctExcTrnModRqMType> createAcctExcTrnMod(AcctExcTrnModRqMType value) {
        return new JAXBElement<AcctExcTrnModRqMType>(_AcctExcTrnMod_QNAME, AcctExcTrnModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctExcTrnModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctExcTrnModResponse")
    public JAXBElement<AcctExcTrnModRsMType> createAcctExcTrnModResponse(AcctExcTrnModRsMType value) {
        return new JAXBElement<AcctExcTrnModRsMType>(_AcctExcTrnModResponse_QNAME, AcctExcTrnModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkMod")
    public JAXBElement<StopChkModRqMType> createStopChkMod(StopChkModRqMType value) {
        return new JAXBElement<StopChkModRqMType>(_StopChkMod_QNAME, StopChkModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkModResponse")
    public JAXBElement<StopChkModRsMType> createStopChkModResponse(StopChkModRsMType value) {
        return new JAXBElement<StopChkModRsMType>(_StopChkModResponse_QNAME, StopChkModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromoXferAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PromoXferAdd")
    public JAXBElement<PromoXferAddRqMType> createPromoXferAdd(PromoXferAddRqMType value) {
        return new JAXBElement<PromoXferAddRqMType>(_PromoXferAdd_QNAME, PromoXferAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromoXferAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PromoXferAddResponse")
    public JAXBElement<PromoXferAddRsMType> createPromoXferAddResponse(PromoXferAddRsMType value) {
        return new JAXBElement<PromoXferAddRsMType>(_PromoXferAddResponse_QNAME, PromoXferAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromoXferModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PromoXferMod")
    public JAXBElement<PromoXferModRqMType> createPromoXferMod(PromoXferModRqMType value) {
        return new JAXBElement<PromoXferModRqMType>(_PromoXferMod_QNAME, PromoXferModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromoXferModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PromoXferModResponse")
    public JAXBElement<PromoXferModRsMType> createPromoXferModResponse(PromoXferModRsMType value) {
        return new JAXBElement<PromoXferModRsMType>(_PromoXferModResponse_QNAME, PromoXferModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireTrnAddValidateRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireTrnAddValidate")
    public JAXBElement<WireTrnAddValidateRqMType> createWireTrnAddValidate(WireTrnAddValidateRqMType value) {
        return new JAXBElement<WireTrnAddValidateRqMType>(_WireTrnAddValidate_QNAME, WireTrnAddValidateRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireTrnAddValidateRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireTrnAddValidateResponse")
    public JAXBElement<WireTrnAddValidateRsMType> createWireTrnAddValidateResponse(WireTrnAddValidateRsMType value) {
        return new JAXBElement<WireTrnAddValidateRsMType>(_WireTrnAddValidateResponse_QNAME, WireTrnAddValidateRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Timestamp")
    public JAXBElement<TimestampType> createTimestamp(TimestampType value) {
        return new JAXBElement<TimestampType>(_Timestamp_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Expires")
    public JAXBElement<AttributedDateTime> createExpires(AttributedDateTime value) {
        return new JAXBElement<AttributedDateTime>(_Expires_QNAME, AttributedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Created")
    public JAXBElement<AttributedDateTime> createCreated(AttributedDateTime value) {
        return new JAXBElement<AttributedDateTime>(_Created_QNAME, AttributedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsernameTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "UsernameToken")
    public JAXBElement<UsernameTokenType> createUsernameToken(UsernameTokenType value) {
        return new JAXBElement<UsernameTokenType>(_UsernameToken_QNAME, UsernameTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySecurityTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "BinarySecurityToken")
    public JAXBElement<BinarySecurityTokenType> createBinarySecurityToken(BinarySecurityTokenType value) {
        return new JAXBElement<BinarySecurityTokenType>(_BinarySecurityToken_QNAME, BinarySecurityTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Reference")
    public JAXBElement<ReferenceType2> createReference(ReferenceType2 value) {
        return new JAXBElement<ReferenceType2>(_Reference_QNAME, ReferenceType2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbeddedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Embedded")
    public JAXBElement<EmbeddedType> createEmbedded(EmbeddedType value) {
        return new JAXBElement<EmbeddedType>(_Embedded_QNAME, EmbeddedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "KeyIdentifier")
    public JAXBElement<KeyIdentifierType> createKeyIdentifier(KeyIdentifierType value) {
        return new JAXBElement<KeyIdentifierType>(_KeyIdentifier_QNAME, KeyIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityTokenReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "SecurityTokenReference")
    public JAXBElement<SecurityTokenReferenceType> createSecurityTokenReference(SecurityTokenReferenceType value) {
        return new JAXBElement<SecurityTokenReferenceType>(_SecurityTokenReference_QNAME, SecurityTokenReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Security")
    public JAXBElement<SecurityHeaderType> createSecurity(SecurityHeaderType value) {
        return new JAXBElement<SecurityHeaderType>(_Security_QNAME, SecurityHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformationParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "TransformationParameters")
    public JAXBElement<TransformationParametersType> createTransformationParameters(TransformationParametersType value) {
        return new JAXBElement<TransformationParametersType>(_TransformationParameters_QNAME, TransformationParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Password")
    public JAXBElement<PasswordString> createPassword(PasswordString value) {
        return new JAXBElement<PasswordString>(_Password_QNAME, PasswordString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodedString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Nonce")
    public JAXBElement<EncodedString> createNonce(EncodedString value) {
        return new JAXBElement<EncodedString>(_Nonce_QNAME, EncodedString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefTxtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "UserDefTxt", scope = UserDefInfoCType.class)
    public JAXBElement<UserDefTxtType> createUserDefInfoCTypeUserDefTxt(UserDefTxtType value) {
        return new JAXBElement<UserDefTxtType>(_UserDefInfoCTypeUserDefTxt_QNAME, UserDefTxtType.class, UserDefInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "UserDefCode", scope = UserDefInfoCType.class)
    public JAXBElement<UserDefCodeType> createUserDefInfoCTypeUserDefCode(UserDefCodeType value) {
        return new JAXBElement<UserDefCodeType>(_UserDefInfoCTypeUserDefCode_QNAME, UserDefCodeType.class, UserDefInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "UserDefDesc", scope = UserDefInfoCType.class)
    public JAXBElement<UserDefDescType> createUserDefInfoCTypeUserDefDesc(UserDefDescType value) {
        return new JAXBElement<UserDefDescType>(_UserDefInfoCTypeUserDefDesc_QNAME, UserDefDescType.class, UserDefInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "UserDefDt", scope = UserDefInfoCType.class)
    public JAXBElement<UserDefDtType> createUserDefInfoCTypeUserDefDt(UserDefDtType value) {
        return new JAXBElement<UserDefDtType>(_UserDefInfoCTypeUserDefDt_QNAME, UserDefDtType.class, UserDefInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "UserDefInfo1", scope = UserDefInfoCType.class)
    public JAXBElement<UserDefInfoType> createUserDefInfoCTypeUserDefInfo1(UserDefInfoType value) {
        return new JAXBElement<UserDefInfoType>(_UserDefInfoCTypeUserDefInfo1_QNAME, UserDefInfoType.class, UserDefInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "UserDefInfo2", scope = UserDefInfoCType.class)
    public JAXBElement<UserDefInfoType> createUserDefInfoCTypeUserDefInfo2(UserDefInfoType value) {
        return new JAXBElement<UserDefInfoType>(_UserDefInfoCTypeUserDefInfo2_QNAME, UserDefInfoType.class, UserDefInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "UserDefInfo3", scope = UserDefInfoCType.class)
    public JAXBElement<UserDefInfoType> createUserDefInfoCTypeUserDefInfo3(UserDefInfoType value) {
        return new JAXBElement<UserDefInfoType>(_UserDefInfoCTypeUserDefInfo3_QNAME, UserDefInfoType.class, UserDefInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "EmailAddr", scope = EmailInfoCType.class)
    public JAXBElement<EmailAddrType> createEmailInfoCTypeEmailAddr(EmailAddrType value) {
        return new JAXBElement<EmailAddrType>(_EmailInfoCTypeEmailAddr_QNAME, EmailAddrType.class, EmailInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "EmailType", scope = EmailInfoCType.class)
    public JAXBElement<EmailTypeType> createEmailInfoCTypeEmailType(EmailTypeType value) {
        return new JAXBElement<EmailTypeType>(_EmailInfoCTypeEmailType_QNAME, EmailTypeType.class, EmailInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireIntlTrnInfoRecCType.class)
    public JAXBElement<CustomCType> createWireIntlTrnInfoRecCTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireIntlTrnInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireConInfoCType.class)
    public JAXBElement<CustomCType> createWireConInfoCTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireConInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobPrvdCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobPrvdCode", scope = MobPhoneInfoCType.class)
    public JAXBElement<MobPrvdCodeType> createMobPhoneInfoCTypeMobPrvdCode(MobPrvdCodeType value) {
        return new JAXBElement<MobPrvdCodeType>(_MobPhoneInfoCTypeMobPrvdCode_QNAME, MobPrvdCodeType.class, MobPhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobPrvdCodeDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobPrvdCodeDesc", scope = MobPhoneInfoCType.class)
    public JAXBElement<MobPrvdCodeDescType> createMobPhoneInfoCTypeMobPrvdCodeDesc(MobPrvdCodeDescType value) {
        return new JAXBElement<MobPrvdCodeDescType>(_MobPhoneInfoCTypeMobPrvdCodeDesc_QNAME, MobPrvdCodeDescType.class, MobPhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobPrvdDomType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobPrvdDom", scope = MobPhoneInfoCType.class)
    public JAXBElement<MobPrvdDomType> createMobPhoneInfoCTypeMobPrvdDom(MobPrvdDomType value) {
        return new JAXBElement<MobPrvdDomType>(_MobPhoneInfoCTypeMobPrvdDom_QNAME, MobPrvdDomType.class, MobPhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobBBType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobBB", scope = MobPhoneInfoCType.class)
    public JAXBElement<MobBBType> createMobPhoneInfoCTypeMobBB(MobBBType value) {
        return new JAXBElement<MobBBType>(_MobPhoneInfoCTypeMobBB_QNAME, MobBBType.class, MobPhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobSendTestTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobSendTestText", scope = MobPhoneInfoCType.class)
    public JAXBElement<MobSendTestTextType> createMobPhoneInfoCTypeMobSendTestText(MobSendTestTextType value) {
        return new JAXBElement<MobSendTestTextType>(_MobPhoneInfoCTypeMobSendTestText_QNAME, MobSendTestTextType.class, MobPhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PhoneNum", scope = PhoneInfoCType.class)
    public JAXBElement<PhoneNumType> createPhoneInfoCTypePhoneNum(PhoneNumType value) {
        return new JAXBElement<PhoneNumType>(_PhoneInfoCTypePhoneNum_QNAME, PhoneNumType.class, PhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PhoneType", scope = PhoneInfoCType.class)
    public JAXBElement<PhoneTypeType> createPhoneInfoCTypePhoneType(PhoneTypeType value) {
        return new JAXBElement<PhoneTypeType>(_PhoneInfoCTypePhoneType_QNAME, PhoneTypeType.class, PhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PhoneTime", scope = PhoneInfoCType.class)
    public JAXBElement<PhoneTimeType> createPhoneInfoCTypePhoneTime(PhoneTimeType value) {
        return new JAXBElement<PhoneTimeType>(_PhoneInfoCTypePhoneTime_QNAME, PhoneTimeType.class, PhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneExtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PhoneExt", scope = PhoneInfoCType.class)
    public JAXBElement<PhoneExtType> createPhoneInfoCTypePhoneExt(PhoneExtType value) {
        return new JAXBElement<PhoneExtType>(_PhoneInfoCTypePhoneExt_QNAME, PhoneExtType.class, PhoneInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireCustInfoCType.class)
    public JAXBElement<CustomCType> createWireCustInfoCTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireCustInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireIntlCustInfoRecCType.class)
    public JAXBElement<CustomCType> createWireIntlCustInfoRecCTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireIntlCustInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitlePrefixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TitlePrefix", scope = XPersonNameCType.class)
    public JAXBElement<TitlePrefixType> createXPersonNameCTypeTitlePrefix(TitlePrefixType value) {
        return new JAXBElement<TitlePrefixType>(_XPersonNameCTypeTitlePrefix_QNAME, TitlePrefixType.class, XPersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "NameSuffix", scope = XPersonNameCType.class)
    public JAXBElement<NameSuffixType> createXPersonNameCTypeNameSuffix(NameSuffixType value) {
        return new JAXBElement<NameSuffixType>(_XPersonNameCTypeNameSuffix_QNAME, NameSuffixType.class, XPersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "LegalName", scope = XPersonNameCType.class)
    public JAXBElement<LegalNameType> createXPersonNameCTypeLegalName(LegalNameType value) {
        return new JAXBElement<LegalNameType>(_XPersonNameCTypeLegalName_QNAME, LegalNameType.class, XPersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SalName", scope = XPersonNameCType.class)
    public JAXBElement<SalNameType> createXPersonNameCTypeSalName(SalNameType value) {
        return new JAXBElement<SalNameType>(_XPersonNameCTypeSalName_QNAME, SalNameType.class, XPersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ComName", scope = PersonNameCType.class)
    public JAXBElement<ComNameType> createPersonNameCTypeComName(ComNameType value) {
        return new JAXBElement<ComNameType>(_PersonNameCTypeComName_QNAME, ComNameType.class, PersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FirstName", scope = PersonNameCType.class)
    public JAXBElement<FirstNameType> createPersonNameCTypeFirstName(FirstNameType value) {
        return new JAXBElement<FirstNameType>(_PersonNameCTypeFirstName_QNAME, FirstNameType.class, PersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiddleNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MiddleName", scope = PersonNameCType.class)
    public JAXBElement<MiddleNameType> createPersonNameCTypeMiddleName(MiddleNameType value) {
        return new JAXBElement<MiddleNameType>(_PersonNameCTypeMiddleName_QNAME, MiddleNameType.class, PersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "LastName", scope = PersonNameCType.class)
    public JAXBElement<LastNameType> createPersonNameCTypeLastName(LastNameType value) {
        return new JAXBElement<LastNameType>(_PersonNameCTypeLastName_QNAME, LastNameType.class, PersonNameCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddrLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AddrLine", scope = AddrLineInfoCType.class)
    public JAXBElement<AddrLineType> createAddrLineInfoCTypeAddrLine(AddrLineType value) {
        return new JAXBElement<AddrLineType>(_AddrLineInfoCTypeAddrLine_QNAME, AddrLineType.class, AddrLineInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StreetAddr1", scope = AddrCType.class)
    public JAXBElement<StreetAddr1Type> createAddrCTypeStreetAddr1(StreetAddr1Type value) {
        return new JAXBElement<StreetAddr1Type>(_AddrCTypeStreetAddr1_QNAME, StreetAddr1Type.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetAddr2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StreetAddr2", scope = AddrCType.class)
    public JAXBElement<StreetAddr2Type> createAddrCTypeStreetAddr2(StreetAddr2Type value) {
        return new JAXBElement<StreetAddr2Type>(_AddrCTypeStreetAddr2_QNAME, StreetAddr2Type.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "City", scope = AddrCType.class)
    public JAXBElement<CityType> createAddrCTypeCity(CityType value) {
        return new JAXBElement<CityType>(_AddrCTypeCity_QNAME, CityType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StateProv", scope = AddrCType.class)
    public JAXBElement<StateProvType> createAddrCTypeStateProv(StateProvType value) {
        return new JAXBElement<StateProvType>(_AddrCTypeStateProv_QNAME, StateProvType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StateCode", scope = AddrCType.class)
    public JAXBElement<StateCodeType> createAddrCTypeStateCode(StateCodeType value) {
        return new JAXBElement<StateCodeType>(_AddrCTypeStateCode_QNAME, StateCodeType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PostalCode", scope = AddrCType.class)
    public JAXBElement<PostalCodeType> createAddrCTypePostalCode(PostalCodeType value) {
        return new JAXBElement<PostalCodeType>(_AddrCTypePostalCode_QNAME, PostalCodeType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DlvryPtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "DlvryPt", scope = AddrCType.class)
    public JAXBElement<DlvryPtType> createAddrCTypeDlvryPt(DlvryPtType value) {
        return new JAXBElement<DlvryPtType>(_AddrCTypeDlvryPt_QNAME, DlvryPtType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "County", scope = AddrCType.class)
    public JAXBElement<CountyType> createAddrCTypeCounty(CountyType value) {
        return new JAXBElement<CountyType>(_AddrCTypeCounty_QNAME, CountyType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Cntry", scope = AddrCType.class)
    public JAXBElement<CntryType> createAddrCTypeCntry(CntryType value) {
        return new JAXBElement<CntryType>(_AddrCTypeCntry_QNAME, CntryType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CntryType", scope = AddrCType.class)
    public JAXBElement<CntryTypeType> createAddrCTypeCntryType(CntryTypeType value) {
        return new JAXBElement<CntryTypeType>(_AddrCTypeCntryType_QNAME, CntryTypeType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BusAddr", scope = AddrCType.class)
    public JAXBElement<BusAddrType> createAddrCTypeBusAddr(BusAddrType value) {
        return new JAXBElement<BusAddrType>(_AddrCTypeBusAddr_QNAME, BusAddrType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FornAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FornAddr", scope = AddrCType.class)
    public JAXBElement<FornAddrType> createAddrCTypeFornAddr(FornAddrType value) {
        return new JAXBElement<FornAddrType>(_AddrCTypeFornAddr_QNAME, FornAddrType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "InvAddr", scope = AddrCType.class)
    public JAXBElement<InvAddrType> createAddrCTypeInvAddr(InvAddrType value) {
        return new JAXBElement<InvAddrType>(_AddrCTypeInvAddr_QNAME, InvAddrType.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetAddr3Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StreetAddr3", scope = AddrCType.class)
    public JAXBElement<StreetAddr3Type> createAddrCTypeStreetAddr3(StreetAddr3Type value) {
        return new JAXBElement<StreetAddr3Type>(_AddrCTypeStreetAddr3_QNAME, StreetAddr3Type.class, AddrCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Amt", scope = FutXferRecCType.class)
    public JAXBElement<AmtType> createFutXferRecCTypeAmt(AmtType value) {
        return new JAXBElement<AmtType>(_FutXferRecCTypeAmt_QNAME, AmtType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedPrincType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RedPrinc", scope = FutXferRecCType.class)
    public JAXBElement<RedPrincType> createFutXferRecCTypeRedPrinc(RedPrincType value) {
        return new JAXBElement<RedPrincType>(_FutXferRecCTypeRedPrinc_QNAME, RedPrincType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnCodeCode", scope = FutXferRecCType.class)
    public JAXBElement<TrnCodeCodeType> createFutXferRecCTypeTrnCodeCode(TrnCodeCodeType value) {
        return new JAXBElement<TrnCodeCodeType>(_FutXferRecCTypeTrnCodeCode_QNAME, TrnCodeCodeType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PrtRcpt", scope = FutXferRecCType.class)
    public JAXBElement<PrtRcptType> createFutXferRecCTypePrtRcpt(PrtRcptType value) {
        return new JAXBElement<PrtRcptType>(_FutXferRecCTypePrtRcpt_QNAME, PrtRcptType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SemiDay1", scope = FutXferRecCType.class)
    public JAXBElement<SemiDay1Type> createFutXferRecCTypeSemiDay1(SemiDay1Type value) {
        return new JAXBElement<SemiDay1Type>(_FutXferRecCTypeSemiDay1_QNAME, SemiDay1Type.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SemiDay2", scope = FutXferRecCType.class)
    public JAXBElement<SemiDay2Type> createFutXferRecCTypeSemiDay2(SemiDay2Type value) {
        return new JAXBElement<SemiDay2Type>(_FutXferRecCTypeSemiDay2_QNAME, SemiDay2Type.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferFirstDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferFirstDt", scope = FutXferRecCType.class)
    public JAXBElement<FutXferFirstDtType> createFutXferRecCTypeFutXferFirstDt(FutXferFirstDtType value) {
        return new JAXBElement<FutXferFirstDtType>(_FutXferRecCTypeFutXferFirstDt_QNAME, FutXferFirstDtType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferNextDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferNextDt", scope = FutXferRecCType.class)
    public JAXBElement<FutXferNextDtType> createFutXferRecCTypeFutXferNextDt(FutXferNextDtType value) {
        return new JAXBElement<FutXferNextDtType>(_FutXferRecCTypeFutXferNextDt_QNAME, FutXferNextDtType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferExpDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferExpDt", scope = FutXferRecCType.class)
    public JAXBElement<FutXferExpDtType> createFutXferRecCTypeFutXferExpDt(FutXferExpDtType value) {
        return new JAXBElement<FutXferExpDtType>(_FutXferRecCTypeFutXferExpDt_QNAME, FutXferExpDtType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferSuspStartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferSuspStartDt", scope = FutXferRecCType.class)
    public JAXBElement<FutXferSuspStartDtType> createFutXferRecCTypeFutXferSuspStartDt(FutXferSuspStartDtType value) {
        return new JAXBElement<FutXferSuspStartDtType>(_FutXferRecCTypeFutXferSuspStartDt_QNAME, FutXferSuspStartDtType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferSuspEndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferSuspEndDt", scope = FutXferRecCType.class)
    public JAXBElement<FutXferSuspEndDtType> createFutXferRecCTypeFutXferSuspEndDt(FutXferSuspEndDtType value) {
        return new JAXBElement<FutXferSuspEndDtType>(_FutXferRecCTypeFutXferSuspEndDt_QNAME, FutXferSuspEndDtType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferDayOfMonthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferDayOfMonth", scope = FutXferRecCType.class)
    public JAXBElement<FutXferDayOfMonthType> createFutXferRecCTypeFutXferDayOfMonth(FutXferDayOfMonthType value) {
        return new JAXBElement<FutXferDayOfMonthType>(_FutXferRecCTypeFutXferDayOfMonth_QNAME, FutXferDayOfMonthType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferFreqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferFreq", scope = FutXferRecCType.class)
    public JAXBElement<FutXferFreqType> createFutXferRecCTypeFutXferFreq(FutXferFreqType value) {
        return new JAXBElement<FutXferFreqType>(_FutXferRecCTypeFutXferFreq_QNAME, FutXferFreqType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferFreqUnitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferFreqUnits", scope = FutXferRecCType.class)
    public JAXBElement<FutXferFreqUnitsType> createFutXferRecCTypeFutXferFreqUnits(FutXferFreqUnitsType value) {
        return new JAXBElement<FutXferFreqUnitsType>(_FutXferRecCTypeFutXferFreqUnits_QNAME, FutXferFreqUnitsType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferAmtLTDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferAmtLTD", scope = FutXferRecCType.class)
    public JAXBElement<FutXferAmtLTDType> createFutXferRecCTypeFutXferAmtLTD(FutXferAmtLTDType value) {
        return new JAXBElement<FutXferAmtLTDType>(_FutXferRecCTypeFutXferAmtLTD_QNAME, FutXferAmtLTDType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferUseLnAmtCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferUseLnAmtCode", scope = FutXferRecCType.class)
    public JAXBElement<FutXferUseLnAmtCodeType> createFutXferRecCTypeFutXferUseLnAmtCode(FutXferUseLnAmtCodeType value) {
        return new JAXBElement<FutXferUseLnAmtCodeType>(_FutXferRecCTypeFutXferUseLnAmtCode_QNAME, FutXferUseLnAmtCodeType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferUseLnDtCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferUseLnDtCode", scope = FutXferRecCType.class)
    public JAXBElement<FutXferUseLnDtCodeType> createFutXferRecCTypeFutXferUseLnDtCode(FutXferUseLnDtCodeType value) {
        return new JAXBElement<FutXferUseLnDtCodeType>(_FutXferRecCTypeFutXferUseLnDtCode_QNAME, FutXferUseLnDtCodeType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferNSFCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferNSFCode", scope = FutXferRecCType.class)
    public JAXBElement<FutXferNSFCodeType> createFutXferRecCTypeFutXferNSFCode(FutXferNSFCodeType value) {
        return new JAXBElement<FutXferNSFCodeType>(_FutXferRecCTypeFutXferNSFCode_QNAME, FutXferNSFCodeType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferLateChgCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferLateChgCode", scope = FutXferRecCType.class)
    public JAXBElement<FutXferLateChgCodeType> createFutXferRecCTypeFutXferLateChgCode(FutXferLateChgCodeType value) {
        return new JAXBElement<FutXferLateChgCodeType>(_FutXferRecCTypeFutXferLateChgCode_QNAME, FutXferLateChgCodeType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferOccrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferOccr", scope = FutXferRecCType.class)
    public JAXBElement<FutXferOccrType> createFutXferRecCTypeFutXferOccr(FutXferOccrType value) {
        return new JAXBElement<FutXferOccrType>(_FutXferRecCTypeFutXferOccr_QNAME, FutXferOccrType.class, FutXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCompName", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<ACHCompNameType> createACHIntlAddendaInfoRecCTypeACHCompName(ACHCompNameType value) {
        return new JAXBElement<ACHCompNameType>(_ACHIntlAddendaInfoRecCTypeACHCompName_QNAME, ACHCompNameType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StreetAddr1", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<StreetAddr1Type> createACHIntlAddendaInfoRecCTypeStreetAddr1(StreetAddr1Type value) {
        return new JAXBElement<StreetAddr1Type>(_AddrCTypeStreetAddr1_QNAME, StreetAddr1Type.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "City", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<CityType> createACHIntlAddendaInfoRecCTypeCity(CityType value) {
        return new JAXBElement<CityType>(_AddrCTypeCity_QNAME, CityType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StateProv", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<StateProvType> createACHIntlAddendaInfoRecCTypeStateProv(StateProvType value) {
        return new JAXBElement<StateProvType>(_AddrCTypeStateProv_QNAME, StateProvType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Cntry", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<CntryType> createACHIntlAddendaInfoRecCTypeCntry(CntryType value) {
        return new JAXBElement<CntryType>(_AddrCTypeCntry_QNAME, CntryType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PostalCode", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<PostalCodeType> createACHIntlAddendaInfoRecCTypePostalCode(PostalCodeType value) {
        return new JAXBElement<PostalCodeType>(_AddrCTypePostalCode_QNAME, PostalCodeType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinInstNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FinInstName", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<FinInstNameType> createACHIntlAddendaInfoRecCTypeFinInstName(FinInstNameType value) {
        return new JAXBElement<FinInstNameType>(_ACHIntlAddendaInfoRecCTypeFinInstName_QNAME, FinInstNameType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinInstQualIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FinInstQualId", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<FinInstQualIdType> createACHIntlAddendaInfoRecCTypeFinInstQualId(FinInstQualIdType value) {
        return new JAXBElement<FinInstQualIdType>(_ACHIntlAddendaInfoRecCTypeFinInstQualId_QNAME, FinInstQualIdType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "InstRtld", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<InstRtIdType> createACHIntlAddendaInfoRecCTypeInstRtld(InstRtIdType value) {
        return new JAXBElement<InstRtIdType>(_ACHIntlAddendaInfoRecCTypeInstRtld_QNAME, InstRtIdType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CntryType", scope = ACHIntlAddendaInfoRecCType.class)
    public JAXBElement<CntryTypeType> createACHIntlAddendaInfoRecCTypeCntryType(CntryTypeType value) {
        return new JAXBElement<CntryTypeType>(_AddrCTypeCntryType_QNAME, CntryTypeType.class, ACHIntlAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHIntlTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHIntlType", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<ACHIntlTypeType> createACHIntlInfoRecCTypeACHIntlType(ACHIntlTypeType value) {
        return new JAXBElement<ACHIntlTypeType>(_ACHIntlInfoRecCTypeACHIntlType_QNAME, ACHIntlTypeType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FornExchTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FornExchType", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<FornExchTypeType> createACHIntlInfoRecCTypeFornExchType(FornExchTypeType value) {
        return new JAXBElement<FornExchTypeType>(_ACHIntlInfoRecCTypeFornExchType_QNAME, FornExchTypeType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FornExchRefTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FornExchRefType", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<FornExchRefTypeType> createACHIntlInfoRecCTypeFornExchRefType(FornExchRefTypeType value) {
        return new JAXBElement<FornExchRefTypeType>(_ACHIntlInfoRecCTypeFornExchRefType_QNAME, FornExchRefTypeType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FornExchRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FornExchRef", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<FornExchRefType> createACHIntlInfoRecCTypeFornExchRef(FornExchRefType value) {
        return new JAXBElement<FornExchRefType>(_ACHIntlInfoRecCTypeFornExchRef_QNAME, FornExchRefType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISODestCntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ISODestCntry", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<ISODestCntryType> createACHIntlInfoRecCTypeISODestCntry(ISODestCntryType value) {
        return new JAXBElement<ISODestCntryType>(_ACHIntlInfoRecCTypeISODestCntry_QNAME, ISODestCntryType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISOOrigCurrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ISOOrigCur", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<ISOOrigCurrType> createACHIntlInfoRecCTypeISOOrigCur(ISOOrigCurrType value) {
        return new JAXBElement<ISOOrigCurrType>(_ACHIntlInfoRecCTypeISOOrigCur_QNAME, ISOOrigCurrType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISODestCurrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ISODestCur", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<ISODestCurrType> createACHIntlInfoRecCTypeISODestCur(ISODestCurrType value) {
        return new JAXBElement<ISODestCurrType>(_ACHIntlInfoRecCTypeISODestCur_QNAME, ISODestCurrType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHStdEntryClass", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<ACHStdEntryClassType> createACHIntlInfoRecCTypeACHStdEntryClass(ACHStdEntryClassType value) {
        return new JAXBElement<ACHStdEntryClassType>(_ACHIntlInfoRecCTypeACHStdEntryClass_QNAME, ACHStdEntryClassType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FornPmtAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FornPmtAmt", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<FornPmtAmtType> createACHIntlInfoRecCTypeFornPmtAmt(FornPmtAmtType value) {
        return new JAXBElement<FornPmtAmtType>(_ACHIntlInfoRecCTypeFornPmtAmt_QNAME, FornPmtAmtType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHRecvIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHRecvId", scope = ACHIntlInfoRecCType.class)
    public JAXBElement<ACHRecvIdType> createACHIntlInfoRecCTypeACHRecvId(ACHRecvIdType value) {
        return new JAXBElement<ACHRecvIdType>(_ACHIntlInfoRecCTypeACHRecvId_QNAME, ACHRecvIdType.class, ACHIntlInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHAddendaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHAddenda", scope = ACHAddendaInfoRecCType.class)
    public JAXBElement<ACHAddendaType> createACHAddendaInfoRecCTypeACHAddenda(ACHAddendaType value) {
        return new JAXBElement<ACHAddendaType>(_ACHAddendaInfoRecCTypeACHAddenda_QNAME, ACHAddendaType.class, ACHAddendaInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHDrNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHDrName", scope = ACHXferRecCType.class)
    public JAXBElement<ACHDrNameType> createACHXferRecCTypeACHDrName(ACHDrNameType value) {
        return new JAXBElement<ACHDrNameType>(_ACHXferRecCTypeACHDrName_QNAME, ACHDrNameType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHDrRtNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHDrRtNum", scope = ACHXferRecCType.class)
    public JAXBElement<ACHDrRtNumType> createACHXferRecCTypeACHDrRtNum(ACHDrRtNumType value) {
        return new JAXBElement<ACHDrRtNumType>(_ACHXferRecCTypeACHDrRtNum_QNAME, ACHDrRtNumType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHDrAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHDrAcctId", scope = ACHXferRecCType.class)
    public JAXBElement<ACHDrAcctIdType> createACHXferRecCTypeACHDrAcctId(ACHDrAcctIdType value) {
        return new JAXBElement<ACHDrAcctIdType>(_ACHXferRecCTypeACHDrAcctId_QNAME, ACHDrAcctIdType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHDrAcctTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHDrAcctType", scope = ACHXferRecCType.class)
    public JAXBElement<ACHDrAcctTypeType> createACHXferRecCTypeACHDrAcctType(ACHDrAcctTypeType value) {
        return new JAXBElement<ACHDrAcctTypeType>(_ACHXferRecCTypeACHDrAcctType_QNAME, ACHDrAcctTypeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHDrBrCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHDrBrCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHDrBrCodeType> createACHXferRecCTypeACHDrBrCode(ACHDrBrCodeType value) {
        return new JAXBElement<ACHDrBrCodeType>(_ACHXferRecCTypeACHDrBrCode_QNAME, ACHDrBrCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHDrTrnCodeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHDrTrnCodeCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHDrTrnCodeCodeType> createACHXferRecCTypeACHDrTrnCodeCode(ACHDrTrnCodeCodeType value) {
        return new JAXBElement<ACHDrTrnCodeCodeType>(_ACHXferRecCTypeACHDrTrnCodeCode_QNAME, ACHDrTrnCodeCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCrNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCrName", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCrNameType> createACHXferRecCTypeACHCrName(ACHCrNameType value) {
        return new JAXBElement<ACHCrNameType>(_ACHXferRecCTypeACHCrName_QNAME, ACHCrNameType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCrRtNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCrRtNum", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCrRtNumType> createACHXferRecCTypeACHCrRtNum(ACHCrRtNumType value) {
        return new JAXBElement<ACHCrRtNumType>(_ACHXferRecCTypeACHCrRtNum_QNAME, ACHCrRtNumType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCrAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCrAcctId", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCrAcctIdType> createACHXferRecCTypeACHCrAcctId(ACHCrAcctIdType value) {
        return new JAXBElement<ACHCrAcctIdType>(_ACHXferRecCTypeACHCrAcctId_QNAME, ACHCrAcctIdType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCrAcctTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCrAcctType", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCrAcctTypeType> createACHXferRecCTypeACHCrAcctType(ACHCrAcctTypeType value) {
        return new JAXBElement<ACHCrAcctTypeType>(_ACHXferRecCTypeACHCrAcctType_QNAME, ACHCrAcctTypeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCrBrCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCrBrCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCrBrCodeType> createACHXferRecCTypeACHCrBrCode(ACHCrBrCodeType value) {
        return new JAXBElement<ACHCrBrCodeType>(_ACHXferRecCTypeACHCrBrCode_QNAME, ACHCrBrCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCrTrnCodeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCrTrnCodeCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCrTrnCodeCodeType> createACHXferRecCTypeACHCrTrnCodeCode(ACHCrTrnCodeCodeType value) {
        return new JAXBElement<ACHCrTrnCodeCodeType>(_ACHXferRecCTypeACHCrTrnCodeCode_QNAME, ACHCrTrnCodeCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHXferAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHXferAmt", scope = ACHXferRecCType.class)
    public JAXBElement<ACHXferAmtType> createACHXferRecCTypeACHXferAmt(ACHXferAmtType value) {
        return new JAXBElement<ACHXferAmtType>(_ACHXferRecCTypeACHXferAmt_QNAME, ACHXferAmtType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHXferAmtLTDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHXferAmtLTD", scope = ACHXferRecCType.class)
    public JAXBElement<ACHXferAmtLTDType> createACHXferRecCTypeACHXferAmtLTD(ACHXferAmtLTDType value) {
        return new JAXBElement<ACHXferAmtLTDType>(_ACHXferRecCTypeACHXferAmtLTD_QNAME, ACHXferAmtLTDType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeAmt", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeAmtType> createACHXferRecCTypeACHFeeAmt(ACHFeeAmtType value) {
        return new JAXBElement<ACHFeeAmtType>(_ACHXferRecCTypeACHFeeAmt_QNAME, ACHFeeAmtType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeAmtLTDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeAmtLTD", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeAmtLTDType> createACHXferRecCTypeACHFeeAmtLTD(ACHFeeAmtLTDType value) {
        return new JAXBElement<ACHFeeAmtLTDType>(_ACHXferRecCTypeACHFeeAmtLTD_QNAME, ACHFeeAmtLTDType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHSendPreNoteCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHSendPreNoteCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHSendPreNoteCodeType> createACHXferRecCTypeACHSendPreNoteCode(ACHSendPreNoteCodeType value) {
        return new JAXBElement<ACHSendPreNoteCodeType>(_ACHXferRecCTypeACHSendPreNoteCode_QNAME, ACHSendPreNoteCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHOneTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHOneTime", scope = ACHXferRecCType.class)
    public JAXBElement<ACHOneTimeType> createACHXferRecCTypeACHOneTime(ACHOneTimeType value) {
        return new JAXBElement<ACHOneTimeType>(_ACHXferRecCTypeACHOneTime_QNAME, ACHOneTimeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHUseLnDtCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHUseLnDtCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHUseLnDtCodeType> createACHXferRecCTypeACHUseLnDtCode(ACHUseLnDtCodeType value) {
        return new JAXBElement<ACHUseLnDtCodeType>(_ACHXferRecCTypeACHUseLnDtCode_QNAME, ACHUseLnDtCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHUseLnAmtCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHUseLnAmtCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHUseLnAmtCodeType> createACHXferRecCTypeACHUseLnAmtCode(ACHUseLnAmtCodeType value) {
        return new JAXBElement<ACHUseLnAmtCodeType>(_ACHXferRecCTypeACHUseLnAmtCode_QNAME, ACHUseLnAmtCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHNSFCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHNSFCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHNSFCodeType> createACHXferRecCTypeACHNSFCode(ACHNSFCodeType value) {
        return new JAXBElement<ACHNSFCodeType>(_ACHXferRecCTypeACHNSFCode_QNAME, ACHNSFCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermCntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHTermCnt", scope = ACHXferRecCType.class)
    public JAXBElement<TermCntType> createACHXferRecCTypeACHTermCnt(TermCntType value) {
        return new JAXBElement<TermCntType>(_ACHXferRecCTypeACHTermCnt_QNAME, TermCntType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHTermUnits", scope = ACHXferRecCType.class)
    public JAXBElement<TermUnitsType> createACHXferRecCTypeACHTermUnits(TermUnitsType value) {
        return new JAXBElement<TermUnitsType>(_ACHXferRecCTypeACHTermUnits_QNAME, TermUnitsType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHDayAdvType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHDayAdv", scope = ACHXferRecCType.class)
    public JAXBElement<ACHDayAdvType> createACHXferRecCTypeACHDayAdv(ACHDayAdvType value) {
        return new JAXBElement<ACHDayAdvType>(_ACHXferRecCTypeACHDayAdv_QNAME, ACHDayAdvType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SemiDay1Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHSemiDay1", scope = ACHXferRecCType.class)
    public JAXBElement<SemiDay1Type> createACHXferRecCTypeACHSemiDay1(SemiDay1Type value) {
        return new JAXBElement<SemiDay1Type>(_ACHXferRecCTypeACHSemiDay1_QNAME, SemiDay1Type.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SemiDay2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHSemiDay2", scope = ACHXferRecCType.class)
    public JAXBElement<SemiDay2Type> createACHXferRecCTypeACHSemiDay2(SemiDay2Type value) {
        return new JAXBElement<SemiDay2Type>(_ACHXferRecCTypeACHSemiDay2_QNAME, SemiDay2Type.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHOpenDt", scope = ACHXferRecCType.class)
    public JAXBElement<OpenDtType> createACHXferRecCTypeACHOpenDt(OpenDtType value) {
        return new JAXBElement<OpenDtType>(_ACHXferRecCTypeACHOpenDt_QNAME, OpenDtType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHLastXferDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHLastXferDt", scope = ACHXferRecCType.class)
    public JAXBElement<ACHLastXferDtType> createACHXferRecCTypeACHLastXferDt(ACHLastXferDtType value) {
        return new JAXBElement<ACHLastXferDtType>(_ACHXferRecCTypeACHLastXferDt_QNAME, ACHLastXferDtType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHNextXferDayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHNextXferDay", scope = ACHXferRecCType.class)
    public JAXBElement<ACHNextXferDayType> createACHXferRecCTypeACHNextXferDay(ACHNextXferDayType value) {
        return new JAXBElement<ACHNextXferDayType>(_ACHXferRecCTypeACHNextXferDay_QNAME, ACHNextXferDayType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHNextXferDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHNextXferDt", scope = ACHXferRecCType.class)
    public JAXBElement<ACHNextXferDtType> createACHXferRecCTypeACHNextXferDt(ACHNextXferDtType value) {
        return new JAXBElement<ACHNextXferDtType>(_ACHXferRecCTypeACHNextXferDt_QNAME, ACHNextXferDtType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHXferExpireDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHXferExpireDt", scope = ACHXferRecCType.class)
    public JAXBElement<ACHXferExpireDtType> createACHXferRecCTypeACHXferExpireDt(ACHXferExpireDtType value) {
        return new JAXBElement<ACHXferExpireDtType>(_ACHXferRecCTypeACHXferExpireDt_QNAME, ACHXferExpireDtType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCompDiscrDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCompDiscrData", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCompDiscrDataType> createACHXferRecCTypeACHCompDiscrData(ACHCompDiscrDataType value) {
        return new JAXBElement<ACHCompDiscrDataType>(_ACHXferRecCTypeACHCompDiscrData_QNAME, ACHCompDiscrDataType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCompEntryDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCompEntryDesc", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCompEntryDescType> createACHXferRecCTypeACHCompEntryDesc(ACHCompEntryDescType value) {
        return new JAXBElement<ACHCompEntryDescType>(_ACHXferRecCTypeACHCompEntryDesc_QNAME, ACHCompEntryDescType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCompIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCompId", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCompIdType> createACHXferRecCTypeACHCompId(ACHCompIdType value) {
        return new JAXBElement<ACHCompIdType>(_ACHXferRecCTypeACHCompId_QNAME, ACHCompIdType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHCompName", scope = ACHXferRecCType.class)
    public JAXBElement<ACHCompNameType> createACHXferRecCTypeACHCompName(ACHCompNameType value) {
        return new JAXBElement<ACHCompNameType>(_ACHIntlAddendaInfoRecCTypeACHCompName_QNAME, ACHCompNameType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHStdEntryClass", scope = ACHXferRecCType.class)
    public JAXBElement<ACHStdEntryClassType> createACHXferRecCTypeACHStdEntryClass(ACHStdEntryClassType value) {
        return new JAXBElement<ACHStdEntryClassType>(_ACHIntlInfoRecCTypeACHStdEntryClass_QNAME, ACHStdEntryClassType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeDrRtNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeDrRtNum", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeDrRtNumType> createACHXferRecCTypeACHFeeDrRtNum(ACHFeeDrRtNumType value) {
        return new JAXBElement<ACHFeeDrRtNumType>(_ACHXferRecCTypeACHFeeDrRtNum_QNAME, ACHFeeDrRtNumType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeDrAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeDrAcctId", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeDrAcctIdType> createACHXferRecCTypeACHFeeDrAcctId(ACHFeeDrAcctIdType value) {
        return new JAXBElement<ACHFeeDrAcctIdType>(_ACHXferRecCTypeACHFeeDrAcctId_QNAME, ACHFeeDrAcctIdType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeDrAcctTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeDrAcctType", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeDrAcctTypeType> createACHXferRecCTypeACHFeeDrAcctType(ACHFeeDrAcctTypeType value) {
        return new JAXBElement<ACHFeeDrAcctTypeType>(_ACHXferRecCTypeACHFeeDrAcctType_QNAME, ACHFeeDrAcctTypeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeDrBrCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeDrBrCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeDrBrCodeType> createACHXferRecCTypeACHFeeDrBrCode(ACHFeeDrBrCodeType value) {
        return new JAXBElement<ACHFeeDrBrCodeType>(_ACHXferRecCTypeACHFeeDrBrCode_QNAME, ACHFeeDrBrCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeDrTrnCodeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeDrTrnCodeCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeDrTrnCodeCodeType> createACHXferRecCTypeACHFeeDrTrnCodeCode(ACHFeeDrTrnCodeCodeType value) {
        return new JAXBElement<ACHFeeDrTrnCodeCodeType>(_ACHXferRecCTypeACHFeeDrTrnCodeCode_QNAME, ACHFeeDrTrnCodeCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeCrRtNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeCrRtNum", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeCrRtNumType> createACHXferRecCTypeACHFeeCrRtNum(ACHFeeCrRtNumType value) {
        return new JAXBElement<ACHFeeCrRtNumType>(_ACHXferRecCTypeACHFeeCrRtNum_QNAME, ACHFeeCrRtNumType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeCrAcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeCrAcctId", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeCrAcctIdType> createACHXferRecCTypeACHFeeCrAcctId(ACHFeeCrAcctIdType value) {
        return new JAXBElement<ACHFeeCrAcctIdType>(_ACHXferRecCTypeACHFeeCrAcctId_QNAME, ACHFeeCrAcctIdType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeCrAcctTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeCrAcctType", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeCrAcctTypeType> createACHXferRecCTypeACHFeeCrAcctType(ACHFeeCrAcctTypeType value) {
        return new JAXBElement<ACHFeeCrAcctTypeType>(_ACHXferRecCTypeACHFeeCrAcctType_QNAME, ACHFeeCrAcctTypeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeCrBrCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeCrBrCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeCrBrCodeType> createACHXferRecCTypeACHFeeCrBrCode(ACHFeeCrBrCodeType value) {
        return new JAXBElement<ACHFeeCrBrCodeType>(_ACHXferRecCTypeACHFeeCrBrCode_QNAME, ACHFeeCrBrCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHFeeCrTrnCodeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHFeeCrTrnCodeCode", scope = ACHXferRecCType.class)
    public JAXBElement<ACHFeeCrTrnCodeCodeType> createACHXferRecCTypeACHFeeCrTrnCodeCode(ACHFeeCrTrnCodeCodeType value) {
        return new JAXBElement<ACHFeeCrTrnCodeCodeType>(_ACHXferRecCTypeACHFeeCrTrnCodeCode_QNAME, ACHFeeCrTrnCodeCodeType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHAcctStat", scope = ACHXferRecCType.class)
    public JAXBElement<AcctStatType> createACHXferRecCTypeACHAcctStat(AcctStatType value) {
        return new JAXBElement<AcctStatType>(_ACHXferRecCTypeACHAcctStat_QNAME, AcctStatType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHLastMainDt", scope = ACHXferRecCType.class)
    public JAXBElement<LastMainDtType> createACHXferRecCTypeACHLastMainDt(LastMainDtType value) {
        return new JAXBElement<LastMainDtType>(_ACHXferRecCTypeACHLastMainDt_QNAME, LastMainDtType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHIndvIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHIndvId", scope = ACHXferRecCType.class)
    public JAXBElement<ACHIndvIdType> createACHXferRecCTypeACHIndvId(ACHIndvIdType value) {
        return new JAXBElement<ACHIndvIdType>(_ACHXferRecCTypeACHIndvId_QNAME, ACHIndvIdType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHAltCompNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHAltCompName", scope = ACHXferRecCType.class)
    public JAXBElement<ACHAltCompNameType> createACHXferRecCTypeACHAltCompName(ACHAltCompNameType value) {
        return new JAXBElement<ACHAltCompNameType>(_ACHXferRecCTypeACHAltCompName_QNAME, ACHAltCompNameType.class, ACHXferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EftDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "EftDesc", scope = EftDescInfoCType.class)
    public JAXBElement<EftDescType> createEftDescInfoCTypeEftDesc(EftDescType value) {
        return new JAXBElement<EftDescType>(_EftDescInfoCTypeEftDesc_QNAME, EftDescType.class, EftDescInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Amt", scope = XferRecCType.class)
    public JAXBElement<AmtType> createXferRecCTypeAmt(AmtType value) {
        return new JAXBElement<AmtType>(_FutXferRecCTypeAmt_QNAME, AmtType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PrtRcpt", scope = XferRecCType.class)
    public JAXBElement<PrtRcptType> createXferRecCTypePrtRcpt(PrtRcptType value) {
        return new JAXBElement<PrtRcptType>(_FutXferRecCTypePrtRcpt_QNAME, PrtRcptType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Fee", scope = XferRecCType.class)
    public JAXBElement<FeeType> createXferRecCTypeFee(FeeType value) {
        return new JAXBElement<FeeType>(_XferRecCTypeFee_QNAME, FeeType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedPrincType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RedPrinc", scope = XferRecCType.class)
    public JAXBElement<RedPrincType> createXferRecCTypeRedPrinc(RedPrincType value) {
        return new JAXBElement<RedPrincType>(_FutXferRecCTypeRedPrinc_QNAME, RedPrincType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "OffCode", scope = XferRecCType.class)
    public JAXBElement<OffCodeType> createXferRecCTypeOffCode(OffCodeType value) {
        return new JAXBElement<OffCodeType>(_XferRecCTypeOffCode_QNAME, OffCodeType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnCodeCode", scope = XferRecCType.class)
    public JAXBElement<TrnCodeCodeType> createXferRecCTypeTrnCodeCode(TrnCodeCodeType value) {
        return new JAXBElement<TrnCodeCodeType>(_FutXferRecCTypeTrnCodeCode_QNAME, TrnCodeCodeType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AvlBalCalcCode", scope = XferRecCType.class)
    public JAXBElement<AvlBalCalcCodeType> createXferRecCTypeAvlBalCalcCode(AvlBalCalcCodeType value) {
        return new JAXBElement<AvlBalCalcCodeType>(_XferRecCTypeAvlBalCalcCode_QNAME, AvlBalCalcCodeType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferSrcTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferSrcType", scope = XferRecCType.class)
    public JAXBElement<XferSrcTypeType> createXferRecCTypeXferSrcType(XferSrcTypeType value) {
        return new JAXBElement<XferSrcTypeType>(_XferRecCTypeXferSrcType_QNAME, XferSrcTypeType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "DrTrnCodeCode", scope = XferRecCType.class)
    public JAXBElement<TrnCodeCodeType> createXferRecCTypeDrTrnCodeCode(TrnCodeCodeType value) {
        return new JAXBElement<TrnCodeCodeType>(_XferRecCTypeDrTrnCodeCode_QNAME, TrnCodeCodeType.class, XferRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RmkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Rmk", scope = RmkInfoCType.class)
    public JAXBElement<RmkType> createRmkInfoCTypeRmk(RmkType value) {
        return new JAXBElement<RmkType>(_RmkInfoCTypeRmk_QNAME, RmkType.class, RmkInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = WireTrnAddValidateRsMType.class)
    public JAXBElement<RsStatType> createWireTrnAddValidateRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, WireTrnAddValidateRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireTrnAddValidateRsMType.class)
    public JAXBElement<CustomCType> createWireTrnAddValidateRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireTrnAddValidateRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireTrnAddValidateRqMType.class)
    public JAXBElement<CustomCType> createWireTrnAddValidateRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireTrnAddValidateRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = PromoXferModRsMType.class)
    public JAXBElement<CustomCType> createPromoXferModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, PromoXferModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = PromoXferModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createPromoXferModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, PromoXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = PromoXferModRqMType.class)
    public JAXBElement<DltType> createPromoXferModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, PromoXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromoXferRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PromoXferRec", scope = PromoXferModRqMType.class)
    public JAXBElement<PromoXferRecCType> createPromoXferModRqMTypePromoXferRec(PromoXferRecCType value) {
        return new JAXBElement<PromoXferRecCType>(_PromoXferModRqMTypePromoXferRec_QNAME, PromoXferRecCType.class, PromoXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = PromoXferModRqMType.class)
    public JAXBElement<CustomCType> createPromoXferModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, PromoXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdToCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CrAcctId", scope = PromoXferAddRsMType.class)
    public JAXBElement<AcctIdToCType> createPromoXferAddRsMTypeCrAcctId(AcctIdToCType value) {
        return new JAXBElement<AcctIdToCType>(_PromoXferAddRsMTypeCrAcctId_QNAME, AcctIdToCType.class, PromoXferAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferRecTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferRecText", scope = PromoXferAddRsMType.class)
    public JAXBElement<XferRecTextType> createPromoXferAddRsMTypeXferRecText(XferRecTextType value) {
        return new JAXBElement<XferRecTextType>(_PromoXferAddRsMTypeXferRecText_QNAME, XferRecTextType.class, PromoXferAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = PromoXferAddRsMType.class)
    public JAXBElement<CustomCType> createPromoXferAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, PromoXferAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = PromoXferAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createPromoXferAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, PromoXferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = PromoXferAddRqMType.class)
    public JAXBElement<CustomCType> createPromoXferAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, PromoXferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkModRsMType.class)
    public JAXBElement<CustomCType> createStopChkModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = StopChkModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createStopChkModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, StopChkModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkInfo", scope = StopChkModRqMType.class)
    public JAXBElement<StopChkInfoCType> createStopChkModRqMTypeStopChkInfo(StopChkInfoCType value) {
        return new JAXBElement<StopChkInfoCType>(_StopChkModRqMTypeStopChkInfo_QNAME, StopChkInfoCType.class, StopChkModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = StopChkModRqMType.class)
    public JAXBElement<DltType> createStopChkModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, StopChkModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkModRqMType.class)
    public JAXBElement<CustomCType> createStopChkModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntentKey", scope = StopChkModRqMType.class)
    public JAXBElement<ActIntentKeyType> createStopChkModRqMTypeActIntentKey(ActIntentKeyType value) {
        return new JAXBElement<ActIntentKeyType>(_StopChkModRqMTypeActIntentKey_QNAME, ActIntentKeyType.class, StopChkModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = AcctExcTrnModRsMType.class)
    public JAXBElement<RsStatType> createAcctExcTrnModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, AcctExcTrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctExcTrnModRsMType.class)
    public JAXBElement<CustomCType> createAcctExcTrnModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctExcTrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExcTrnRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ExcTrnRec", scope = AcctExcTrnModRqMType.class)
    public JAXBElement<ExcTrnRecCType> createAcctExcTrnModRqMTypeExcTrnRec(ExcTrnRecCType value) {
        return new JAXBElement<ExcTrnRecCType>(_AcctExcTrnModRqMTypeExcTrnRec_QNAME, ExcTrnRecCType.class, AcctExcTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = AcctExcTrnModRqMType.class)
    public JAXBElement<DltType> createAcctExcTrnModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, AcctExcTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RmkAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ModRmkArray", scope = AcctExcTrnModRqMType.class)
    public JAXBElement<RmkAType> createAcctExcTrnModRqMTypeModRmkArray(RmkAType value) {
        return new JAXBElement<RmkAType>(_AcctExcTrnModRqMTypeModRmkArray_QNAME, RmkAType.class, AcctExcTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctExcTrnModRqMType.class)
    public JAXBElement<CustomCType> createAcctExcTrnModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctExcTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LnUnitIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "LnUnitId", scope = AcctExcTrnModRqMType.class)
    public JAXBElement<LnUnitIdType> createAcctExcTrnModRqMTypeLnUnitId(LnUnitIdType value) {
        return new JAXBElement<LnUnitIdType>(_AcctExcTrnModRqMTypeLnUnitId_QNAME, LnUnitIdType.class, AcctExcTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = PmtHubPmtRqModRsMType.class)
    public JAXBElement<RsStatType> createPmtHubPmtRqModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, PmtHubPmtRqModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtBatchId", scope = PmtHubPmtRqModRqMType.class)
    public JAXBElement<PmtBatchIdType> createPmtHubPmtRqModRqMTypePmtBatchId(PmtBatchIdType value) {
        return new JAXBElement<PmtBatchIdType>(_PmtHubPmtRqModRqMTypePmtBatchId_QNAME, PmtBatchIdType.class, PmtHubPmtRqModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqId", scope = PmtHubPmtRqModRqMType.class)
    public JAXBElement<PmtIdType> createPmtHubPmtRqModRqMTypePmtRqId(PmtIdType value) {
        return new JAXBElement<PmtIdType>(_PmtHubPmtRqModRqMTypePmtRqId_QNAME, PmtIdType.class, PmtHubPmtRqModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = PmtHubPmtRqModRqMType.class)
    public JAXBElement<DltType> createPmtHubPmtRqModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, PmtHubPmtRqModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RmkAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ModRmkArray", scope = PmtHubPmtRqModRqMType.class)
    public JAXBElement<RmkAType> createPmtHubPmtRqModRqMTypeModRmkArray(RmkAType value) {
        return new JAXBElement<RmkAType>(_AcctExcTrnModRqMTypeModRmkArray_QNAME, RmkAType.class, PmtHubPmtRqModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtBatchId", scope = PmtHubPmtRqAddRsMType.class)
    public JAXBElement<PmtBatchIdType> createPmtHubPmtRqAddRsMTypePmtBatchId(PmtBatchIdType value) {
        return new JAXBElement<PmtBatchIdType>(_PmtHubPmtRqModRqMTypePmtBatchId_QNAME, PmtBatchIdType.class, PmtHubPmtRqAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtRqRsArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqRsArray", scope = PmtHubPmtRqAddRsMType.class)
    public JAXBElement<PmtRqRsArrayAType> createPmtHubPmtRqAddRsMTypePmtRqRsArray(PmtRqRsArrayAType value) {
        return new JAXBElement<PmtRqRsArrayAType>(_PmtHubPmtRqAddRsMTypePmtRqRsArray_QNAME, PmtRqRsArrayAType.class, PmtHubPmtRqAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = PmtHubPmtRqAddRsMType.class)
    public JAXBElement<RsStatType> createPmtHubPmtRqAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, PmtHubPmtRqAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsrTokenTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RqUsrTokenType", scope = PmtHubPmtRqAddRqMType.class)
    public JAXBElement<UsrTokenTypeType> createPmtHubPmtRqAddRqMTypeRqUsrTokenType(UsrTokenTypeType value) {
        return new JAXBElement<UsrTokenTypeType>(_PmtHubPmtRqAddRqMTypeRqUsrTokenType_QNAME, UsrTokenTypeType.class, PmtHubPmtRqAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtRqDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqDesc", scope = PmtHubPmtRqAddRqMType.class)
    public JAXBElement<PmtRqDescType> createPmtHubPmtRqAddRqMTypePmtRqDesc(PmtRqDescType value) {
        return new JAXBElement<PmtRqDescType>(_PmtHubPmtRqAddRqMTypePmtRqDesc_QNAME, PmtRqDescType.class, PmtHubPmtRqAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqExpDt", scope = PmtHubPmtRqAddRqMType.class)
    public JAXBElement<ExpDtType> createPmtHubPmtRqAddRqMTypePmtRqExpDt(ExpDtType value) {
        return new JAXBElement<ExpDtType>(_PmtHubPmtRqAddRqMTypePmtRqExpDt_QNAME, ExpDtType.class, PmtHubPmtRqAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtRqTermDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqTermDesc", scope = PmtHubPmtRqAddRqMType.class)
    public JAXBElement<PmtRqTermDescType> createPmtHubPmtRqAddRqMTypePmtRqTermDesc(PmtRqTermDescType value) {
        return new JAXBElement<PmtRqTermDescType>(_PmtHubPmtRqAddRqMTypePmtRqTermDesc_QNAME, PmtRqTermDescType.class, PmtHubPmtRqAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "InvoiceId", scope = PmtHubPmtRqAddRqMType.class)
    public JAXBElement<InvoiceIdType> createPmtHubPmtRqAddRqMTypeInvoiceId(InvoiceIdType value) {
        return new JAXBElement<InvoiceIdType>(_PmtHubPmtRqAddRqMTypeInvoiceId_QNAME, InvoiceIdType.class, PmtHubPmtRqAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchOrderIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PurchOrderId", scope = PmtHubPmtRqAddRqMType.class)
    public JAXBElement<PurchOrderIdType> createPmtHubPmtRqAddRqMTypePurchOrderId(PurchOrderIdType value) {
        return new JAXBElement<PurchOrderIdType>(_PmtHubPmtRqAddRqMTypePurchOrderId_QNAME, PurchOrderIdType.class, PmtHubPmtRqAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtRqArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqArray", scope = PmtHubPmtRqAddRqMType.class)
    public JAXBElement<PmtRqArrayAType> createPmtHubPmtRqAddRqMTypePmtRqArray(PmtRqArrayAType value) {
        return new JAXBElement<PmtRqArrayAType>(_PmtHubPmtRqAddRqMTypePmtRqArray_QNAME, PmtRqArrayAType.class, PmtHubPmtRqAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = PmtHubCrXferModRsMType.class)
    public JAXBElement<RsStatType> createPmtHubCrXferModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, PmtHubCrXferModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnRcptId", scope = PmtHubCrXferModRqMType.class)
    public JAXBElement<TrnRcptIdType> createPmtHubCrXferModRqMTypeTrnRcptId(TrnRcptIdType value) {
        return new JAXBElement<TrnRcptIdType>(_PmtHubCrXferModRqMTypeTrnRcptId_QNAME, TrnRcptIdType.class, PmtHubCrXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqId", scope = PmtHubCrXferModRqMType.class)
    public JAXBElement<PmtIdType> createPmtHubCrXferModRqMTypePmtRqId(PmtIdType value) {
        return new JAXBElement<PmtIdType>(_PmtHubPmtRqModRqMTypePmtRqId_QNAME, PmtIdType.class, PmtHubCrXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtHubCrXferModRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHubCrXferModRec", scope = PmtHubCrXferModRqMType.class)
    public JAXBElement<PmtHubCrXferModRecCType> createPmtHubCrXferModRqMTypePmtHubCrXferModRec(PmtHubCrXferModRecCType value) {
        return new JAXBElement<PmtHubCrXferModRecCType>(_PmtHubCrXferModRqMTypePmtHubCrXferModRec_QNAME, PmtHubCrXferModRecCType.class, PmtHubCrXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RmkAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ModRmkArray", scope = PmtHubCrXferModRqMType.class)
    public JAXBElement<RmkAType> createPmtHubCrXferModRqMTypeModRmkArray(RmkAType value) {
        return new JAXBElement<RmkAType>(_AcctExcTrnModRqMTypeModRmkArray_QNAME, RmkAType.class, PmtHubCrXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = PmtHubCrXferModRqMType.class)
    public JAXBElement<DltType> createPmtHubCrXferModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, PmtHubCrXferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnRcptId", scope = PmtHubCrXferAddRsMType.class)
    public JAXBElement<TrnRcptIdType> createPmtHubCrXferAddRsMTypeTrnRcptId(TrnRcptIdType value) {
        return new JAXBElement<TrnRcptIdType>(_PmtHubCrXferModRqMTypeTrnRcptId_QNAME, TrnRcptIdType.class, PmtHubCrXferAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtBatchIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtBatchId", scope = PmtHubCrXferAddRsMType.class)
    public JAXBElement<PmtBatchIdType> createPmtHubCrXferAddRsMTypePmtBatchId(PmtBatchIdType value) {
        return new JAXBElement<PmtBatchIdType>(_PmtHubPmtRqModRqMTypePmtBatchId_QNAME, PmtBatchIdType.class, PmtHubCrXferAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CrAcctId", scope = PmtHubCrXferAddRqMType.class)
    public JAXBElement<AcctIdType> createPmtHubCrXferAddRqMTypeCrAcctId(AcctIdType value) {
        return new JAXBElement<AcctIdType>(_PromoXferAddRsMTypeCrAcctId_QNAME, AcctIdType.class, PmtHubCrXferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsrTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CrUsrToken", scope = PmtHubCrXferAddRqMType.class)
    public JAXBElement<UsrTokenType> createPmtHubCrXferAddRqMTypeCrUsrToken(UsrTokenType value) {
        return new JAXBElement<UsrTokenType>(_PmtHubCrXferAddRqMTypeCrUsrToken_QNAME, UsrTokenType.class, PmtHubCrXferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtRqId", scope = PmtHubCrXferAddRqMType.class)
    public JAXBElement<PmtIdType> createPmtHubCrXferAddRqMTypePmtRqId(PmtIdType value) {
        return new JAXBElement<PmtIdType>(_PmtHubPmtRqModRqMTypePmtRqId_QNAME, PmtIdType.class, PmtHubCrXferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstRtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CrXferFinInstId", scope = PmtHubCrXferAddRqMType.class)
    public JAXBElement<InstRtIdType> createPmtHubCrXferAddRqMTypeCrXferFinInstId(InstRtIdType value) {
        return new JAXBElement<InstRtIdType>(_PmtHubCrXferAddRqMTypeCrXferFinInstId_QNAME, InstRtIdType.class, PmtHubCrXferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = AcctReconItemModRsMType.class)
    public JAXBElement<RsStatType> createAcctReconItemModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, AcctReconItemModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctReconItemModRsMType.class)
    public JAXBElement<CustomCType> createAcctReconItemModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctReconItemModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssItemCrtDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IssItemCrtDt", scope = AcctReconItemModRqMType.class)
    public JAXBElement<IssItemCrtDtType> createAcctReconItemModRqMTypeIssItemCrtDt(IssItemCrtDtType value) {
        return new JAXBElement<IssItemCrtDtType>(_AcctReconItemModRqMTypeIssItemCrtDt_QNAME, IssItemCrtDtType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ChkNum", scope = AcctReconItemModRqMType.class)
    public JAXBElement<ChkNumType> createAcctReconItemModRqMTypeChkNum(ChkNumType value) {
        return new JAXBElement<ChkNumType>(_AcctReconItemModRqMTypeChkNum_QNAME, ChkNumType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = AcctReconItemModRqMType.class)
    public JAXBElement<BatchNumType> createAcctReconItemModRqMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SeqNum", scope = AcctReconItemModRqMType.class)
    public JAXBElement<SeqNumType> createAcctReconItemModRqMTypeSeqNum(SeqNumType value) {
        return new JAXBElement<SeqNumType>(_AcctReconItemModRqMTypeSeqNum_QNAME, SeqNumType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctReconItemRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctReconItemRec", scope = AcctReconItemModRqMType.class)
    public JAXBElement<AcctReconItemRecCType> createAcctReconItemModRqMTypeAcctReconItemRec(AcctReconItemRecCType value) {
        return new JAXBElement<AcctReconItemRecCType>(_AcctReconItemModRqMTypeAcctReconItemRec_QNAME, AcctReconItemRecCType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = AcctReconItemModRqMType.class)
    public JAXBElement<DltType> createAcctReconItemModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RmkAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ModRmkArray", scope = AcctReconItemModRqMType.class)
    public JAXBElement<RmkAType> createAcctReconItemModRqMTypeModRmkArray(RmkAType value) {
        return new JAXBElement<RmkAType>(_AcctExcTrnModRqMTypeModRmkArray_QNAME, RmkAType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctReconItemModRqMType.class)
    public JAXBElement<CustomCType> createAcctReconItemModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctReconItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SvcFeeTrnModRsMType.class)
    public JAXBElement<CustomCType> createSvcFeeTrnModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SvcFeeTrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = SvcFeeTrnModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createSvcFeeTrnModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, SvcFeeTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcFeeTrnInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SvcFeeTrnInfo", scope = SvcFeeTrnModRqMType.class)
    public JAXBElement<SvcFeeTrnInfoCType> createSvcFeeTrnModRqMTypeSvcFeeTrnInfo(SvcFeeTrnInfoCType value) {
        return new JAXBElement<SvcFeeTrnInfoCType>(_SvcFeeTrnModRqMTypeSvcFeeTrnInfo_QNAME, SvcFeeTrnInfoCType.class, SvcFeeTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = SvcFeeTrnModRqMType.class)
    public JAXBElement<DltType> createSvcFeeTrnModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, SvcFeeTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SvcFeeTrnModRqMType.class)
    public JAXBElement<CustomCType> createSvcFeeTrnModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SvcFeeTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SeqNum", scope = SvcFeeTrnAddRsMType.class)
    public JAXBElement<SeqNumType> createSvcFeeTrnAddRsMTypeSeqNum(SeqNumType value) {
        return new JAXBElement<SeqNumType>(_AcctReconItemModRqMTypeSeqNum_QNAME, SeqNumType.class, SvcFeeTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = SvcFeeTrnAddRsMType.class)
    public JAXBElement<RsStatType> createSvcFeeTrnAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, SvcFeeTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SvcFeeTrnAddRsMType.class)
    public JAXBElement<CustomCType> createSvcFeeTrnAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SvcFeeTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = SvcFeeTrnAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createSvcFeeTrnAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, SvcFeeTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SvcFeeTrnAddRqMType.class)
    public JAXBElement<CustomCType> createSvcFeeTrnAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SvcFeeTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnRcptId", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<TrnRcptIdType> createIntlWireTrnAddRsMTypeTrnRcptId(TrnRcptIdType value) {
        return new JAXBElement<TrnRcptIdType>(_PmtHubCrXferModRqMTypeTrnRcptId_QNAME, TrnRcptIdType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FornCurrAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FornCurrAmt", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<FornCurrAmtType> createIntlWireTrnAddRsMTypeFornCurrAmt(FornCurrAmtType value) {
        return new JAXBElement<FornCurrAmtType>(_IntlWireTrnAddRsMTypeFornCurrAmt_QNAME, FornCurrAmtType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireBankFeeAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireBankFeeAmt", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<WireBankFeeAmtType> createIntlWireTrnAddRsMTypeWireBankFeeAmt(WireBankFeeAmtType value) {
        return new JAXBElement<WireBankFeeAmtType>(_IntlWireTrnAddRsMTypeWireBankFeeAmt_QNAME, WireBankFeeAmtType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireBankTaxAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireBankTaxAmt", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<WireBankTaxAmtType> createIntlWireTrnAddRsMTypeWireBankTaxAmt(WireBankTaxAmtType value) {
        return new JAXBElement<WireBankTaxAmtType>(_IntlWireTrnAddRsMTypeWireBankTaxAmt_QNAME, WireBankTaxAmtType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SttlCostAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SttlCostAmt", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<SttlCostAmtType> createIntlWireTrnAddRsMTypeSttlCostAmt(SttlCostAmtType value) {
        return new JAXBElement<SttlCostAmtType>(_IntlWireTrnAddRsMTypeSttlCostAmt_QNAME, SttlCostAmtType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrExchRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CurrExchRate", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<CurrExchRateType> createIntlWireTrnAddRsMTypeCurrExchRate(CurrExchRateType value) {
        return new JAXBElement<CurrExchRateType>(_IntlWireTrnAddRsMTypeCurrExchRate_QNAME, CurrExchRateType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<RsStatType> createIntlWireTrnAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = IntlWireTrnAddRsMType.class)
    public JAXBElement<CustomCType> createIntlWireTrnAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, IntlWireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createIntlWireTrnAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireAcctType", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<AcctTypeType> createIntlWireTrnAddRqMTypeWireAcctType(AcctTypeType value) {
        return new JAXBElement<AcctTypeType>(_IntlWireTrnAddRqMTypeWireAcctType_QNAME, AcctTypeType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireQuoteIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireQuoteId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<WireQuoteIdType> createIntlWireTrnAddRqMTypeWireQuoteId(WireQuoteIdType value) {
        return new JAXBElement<WireQuoteIdType>(_IntlWireTrnAddRqMTypeWireQuoteId_QNAME, WireQuoteIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireContrRefIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireContrRefId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<WireContrRefIdType> createIntlWireTrnAddRqMTypeWireContrRefId(WireContrRefIdType value) {
        return new JAXBElement<WireContrRefIdType>(_IntlWireTrnAddRqMTypeWireContrRefId_QNAME, WireContrRefIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FundMthdTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FundMthdType", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<FundMthdTypeType> createIntlWireTrnAddRqMTypeFundMthdType(FundMthdTypeType value) {
        return new JAXBElement<FundMthdTypeType>(_IntlWireTrnAddRqMTypeFundMthdType_QNAME, FundMthdTypeType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireIntlQuoteRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireIntlQuoteRec", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<WireIntlQuoteRecCType> createIntlWireTrnAddRqMTypeWireIntlQuoteRec(WireIntlQuoteRecCType value) {
        return new JAXBElement<WireIntlQuoteRecCType>(_IntlWireTrnAddRqMTypeWireIntlQuoteRec_QNAME, WireIntlQuoteRecCType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireUsrIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireUsrId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<WireUsrIdType> createIntlWireTrnAddRqMTypeWireUsrId(WireUsrIdType value) {
        return new JAXBElement<WireUsrIdType>(_IntlWireTrnAddRqMTypeWireUsrId_QNAME, WireUsrIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntnetFinInstIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IntnetFinInstId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<IntnetFinInstIdType> createIntlWireTrnAddRqMTypeIntnetFinInstId(IntnetFinInstIdType value) {
        return new JAXBElement<IntnetFinInstIdType>(_IntlWireTrnAddRqMTypeIntnetFinInstId_QNAME, IntnetFinInstIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AvlBalCalcCode", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<AvlBalCalcCodeType> createIntlWireTrnAddRqMTypeAvlBalCalcCode(AvlBalCalcCodeType value) {
        return new JAXBElement<AvlBalCalcCodeType>(_XferRecCTypeAvlBalCalcCode_QNAME, AvlBalCalcCodeType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<CustomCType> createIntlWireTrnAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireCompIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<WireCompIdType> createIntlWireTrnAddRqMTypeWireCompId(WireCompIdType value) {
        return new JAXBElement<WireCompIdType>(_IntlWireTrnAddRqMTypeWireCompId_QNAME, WireCompIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmplIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompEmplId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<EmplIdType> createIntlWireTrnAddRqMTypeWireCompEmplId(EmplIdType value) {
        return new JAXBElement<EmplIdType>(_IntlWireTrnAddRqMTypeWireCompEmplId_QNAME, EmplIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompEmplName", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<EmplNameType> createIntlWireTrnAddRqMTypeWireCompEmplName(EmplNameType value) {
        return new JAXBElement<EmplNameType>(_IntlWireTrnAddRqMTypeWireCompEmplName_QNAME, EmplNameType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompVerifId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<WireVerifIdType> createIntlWireTrnAddRqMTypeWireCompVerifId(WireVerifIdType value) {
        return new JAXBElement<WireVerifIdType>(_IntlWireTrnAddRqMTypeWireCompVerifId_QNAME, WireVerifIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompVerifName", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<EmplNameType> createIntlWireTrnAddRqMTypeWireCompVerifName(EmplNameType value) {
        return new JAXBElement<EmplNameType>(_IntlWireTrnAddRqMTypeWireCompVerifName_QNAME, EmplNameType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FraudRefId", scope = IntlWireTrnAddRqMType.class)
    public JAXBElement<FraudRefIdType> createIntlWireTrnAddRqMTypeFraudRefId(FraudRefIdType value) {
        return new JAXBElement<FraudRefIdType>(_IntlWireTrnAddRqMTypeFraudRefId_QNAME, FraudRefIdType.class, IntlWireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnRcptId", scope = WireTrnAddRsMType.class)
    public JAXBElement<TrnRcptIdType> createWireTrnAddRsMTypeTrnRcptId(TrnRcptIdType value) {
        return new JAXBElement<TrnRcptIdType>(_PmtHubCrXferModRqMTypeTrnRcptId_QNAME, TrnRcptIdType.class, WireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireTmpltIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireTmpltId", scope = WireTrnAddRsMType.class)
    public JAXBElement<WireTmpltIdType> createWireTrnAddRsMTypeWireTmpltId(WireTmpltIdType value) {
        return new JAXBElement<WireTmpltIdType>(_WireTrnAddRsMTypeWireTmpltId_QNAME, WireTmpltIdType.class, WireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = WireTrnAddRsMType.class)
    public JAXBElement<RsStatType> createWireTrnAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, WireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireTrnAddRsMType.class)
    public JAXBElement<CustomCType> createWireTrnAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = WireTrnAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createWireTrnAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireAcctType", scope = WireTrnAddRqMType.class)
    public JAXBElement<AcctTypeType> createWireTrnAddRqMTypeWireAcctType(AcctTypeType value) {
        return new JAXBElement<AcctTypeType>(_IntlWireTrnAddRqMTypeWireAcctType_QNAME, AcctTypeType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireUsrIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireUsrId", scope = WireTrnAddRqMType.class)
    public JAXBElement<WireUsrIdType> createWireTrnAddRqMTypeWireUsrId(WireUsrIdType value) {
        return new JAXBElement<WireUsrIdType>(_IntlWireTrnAddRqMTypeWireUsrId_QNAME, WireUsrIdType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireVerifId", scope = WireTrnAddRqMType.class)
    public JAXBElement<WireVerifIdType> createWireTrnAddRqMTypeWireVerifId(WireVerifIdType value) {
        return new JAXBElement<WireVerifIdType>(_WireTrnAddRqMTypeWireVerifId_QNAME, WireVerifIdType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireTmpltCrtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireTmpltCrt", scope = WireTrnAddRqMType.class)
    public JAXBElement<WireTmpltCrtType> createWireTrnAddRqMTypeWireTmpltCrt(WireTmpltCrtType value) {
        return new JAXBElement<WireTmpltCrtType>(_WireTrnAddRqMTypeWireTmpltCrt_QNAME, WireTmpltCrtType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AvlBalCalcCode", scope = WireTrnAddRqMType.class)
    public JAXBElement<AvlBalCalcCodeType> createWireTrnAddRqMTypeAvlBalCalcCode(AvlBalCalcCodeType value) {
        return new JAXBElement<AvlBalCalcCodeType>(_XferRecCTypeAvlBalCalcCode_QNAME, AvlBalCalcCodeType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = WireTrnAddRqMType.class)
    public JAXBElement<CustomCType> createWireTrnAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireCompIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompId", scope = WireTrnAddRqMType.class)
    public JAXBElement<WireCompIdType> createWireTrnAddRqMTypeWireCompId(WireCompIdType value) {
        return new JAXBElement<WireCompIdType>(_IntlWireTrnAddRqMTypeWireCompId_QNAME, WireCompIdType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmplIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompEmplId", scope = WireTrnAddRqMType.class)
    public JAXBElement<EmplIdType> createWireTrnAddRqMTypeWireCompEmplId(EmplIdType value) {
        return new JAXBElement<EmplIdType>(_IntlWireTrnAddRqMTypeWireCompEmplId_QNAME, EmplIdType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompEmplName", scope = WireTrnAddRqMType.class)
    public JAXBElement<EmplNameType> createWireTrnAddRqMTypeWireCompEmplName(EmplNameType value) {
        return new JAXBElement<EmplNameType>(_IntlWireTrnAddRqMTypeWireCompEmplName_QNAME, EmplNameType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireVerifIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompVerifId", scope = WireTrnAddRqMType.class)
    public JAXBElement<WireVerifIdType> createWireTrnAddRqMTypeWireCompVerifId(WireVerifIdType value) {
        return new JAXBElement<WireVerifIdType>(_IntlWireTrnAddRqMTypeWireCompVerifId_QNAME, WireVerifIdType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmplNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCompVerifName", scope = WireTrnAddRqMType.class)
    public JAXBElement<EmplNameType> createWireTrnAddRqMTypeWireCompVerifName(EmplNameType value) {
        return new JAXBElement<EmplNameType>(_IntlWireTrnAddRqMTypeWireCompVerifName_QNAME, EmplNameType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WireCorrelIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "WireCorrelId", scope = WireTrnAddRqMType.class)
    public JAXBElement<WireCorrelIdType> createWireTrnAddRqMTypeWireCorrelId(WireCorrelIdType value) {
        return new JAXBElement<WireCorrelIdType>(_WireTrnAddRqMTypeWireCorrelId_QNAME, WireCorrelIdType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FraudRefIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FraudRefId", scope = WireTrnAddRqMType.class)
    public JAXBElement<FraudRefIdType> createWireTrnAddRqMTypeFraudRefId(FraudRefIdType value) {
        return new JAXBElement<FraudRefIdType>(_IntlWireTrnAddRqMTypeFraudRefId_QNAME, FraudRefIdType.class, WireTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = PosPayItemModRsMType.class)
    public JAXBElement<RsStatType> createPosPayItemModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, PosPayItemModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = PosPayItemModRsMType.class)
    public JAXBElement<CustomCType> createPosPayItemModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, PosPayItemModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PosPayItemInfoRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PosPayItemInfoRec", scope = PosPayItemModRqMType.class)
    public JAXBElement<PosPayItemInfoRecCType> createPosPayItemModRqMTypePosPayItemInfoRec(PosPayItemInfoRecCType value) {
        return new JAXBElement<PosPayItemInfoRecCType>(_PosPayItemModRqMTypePosPayItemInfoRec_QNAME, PosPayItemInfoRecCType.class, PosPayItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = PosPayItemModRqMType.class)
    public JAXBElement<DltType> createPosPayItemModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, PosPayItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = PosPayItemModRqMType.class)
    public JAXBElement<CustomCType> createPosPayItemModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, PosPayItemModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = IssItemMultiAddRsMType.class)
    public JAXBElement<RsStatType> createIssItemMultiAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, IssItemMultiAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssItemRsInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IssItemRsInfoArray", scope = IssItemMultiAddRsMType.class)
    public JAXBElement<IssItemRsInfoArrayAType> createIssItemMultiAddRsMTypeIssItemRsInfoArray(IssItemRsInfoArrayAType value) {
        return new JAXBElement<IssItemRsInfoArrayAType>(_IssItemMultiAddRsMTypeIssItemRsInfoArray_QNAME, IssItemRsInfoArrayAType.class, IssItemMultiAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = IssItemMultiAddRsMType.class)
    public JAXBElement<CustomCType> createIssItemMultiAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, IssItemMultiAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = IssItemMultiAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createIssItemMultiAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, IssItemMultiAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = IssItemMultiAddRqMType.class)
    public JAXBElement<CustomCType> createIssItemMultiAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, IssItemMultiAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = SafeDepPmtModRsMType.class)
    public JAXBElement<RsStatType> createSafeDepPmtModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, SafeDepPmtModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SafeDepPmtModRsMType.class)
    public JAXBElement<CustomCType> createSafeDepPmtModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SafeDepPmtModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = SafeDepPmtModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createSafeDepPmtModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, SafeDepPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeDepPmtInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SafeDepPmtInfo", scope = SafeDepPmtModRqMType.class)
    public JAXBElement<SafeDepPmtInfoCType> createSafeDepPmtModRqMTypeSafeDepPmtInfo(SafeDepPmtInfoCType value) {
        return new JAXBElement<SafeDepPmtInfoCType>(_SafeDepPmtModRqMTypeSafeDepPmtInfo_QNAME, SafeDepPmtInfoCType.class, SafeDepPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = SafeDepPmtModRqMType.class)
    public JAXBElement<DltType> createSafeDepPmtModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, SafeDepPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SafeDepPmtModRqMType.class)
    public JAXBElement<CustomCType> createSafeDepPmtModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SafeDepPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = SafeDepPmtAddRsMType.class)
    public JAXBElement<RsStatType> createSafeDepPmtAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, SafeDepPmtAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SeqNum", scope = SafeDepPmtAddRsMType.class)
    public JAXBElement<SeqNumType> createSafeDepPmtAddRsMTypeSeqNum(SeqNumType value) {
        return new JAXBElement<SeqNumType>(_AcctReconItemModRqMTypeSeqNum_QNAME, SeqNumType.class, SafeDepPmtAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SafeDepPmtAddRsMType.class)
    public JAXBElement<CustomCType> createSafeDepPmtAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SafeDepPmtAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = SafeDepPmtAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createSafeDepPmtAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, SafeDepPmtAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = SafeDepPmtAddRqMType.class)
    public JAXBElement<CustomCType> createSafeDepPmtAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, SafeDepPmtAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = TrnAddQuoteCommRsMType.class)
    public JAXBElement<RsStatType> createTrnAddQuoteCommRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, TrnAddQuoteCommRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddQuoteCommRsMType.class)
    public JAXBElement<CustomCType> createTrnAddQuoteCommRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddQuoteCommRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = TrnAddQuoteCommRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createTrnAddQuoteCommRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, TrnAddQuoteCommRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddQuoteCommRqMType.class)
    public JAXBElement<CustomCType> createTrnAddQuoteCommRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddQuoteCommRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = TrnAddQuoteCanRsMType.class)
    public JAXBElement<RsStatType> createTrnAddQuoteCanRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, TrnAddQuoteCanRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddQuoteCanRsMType.class)
    public JAXBElement<CustomCType> createTrnAddQuoteCanRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddQuoteCanRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = TrnAddQuoteCanRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createTrnAddQuoteCanRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, TrnAddQuoteCanRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddQuoteCanRqMType.class)
    public JAXBElement<CustomCType> createTrnAddQuoteCanRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddQuoteCanRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = TrnAddQuoteRsMType.class)
    public JAXBElement<BatchNumType> createTrnAddQuoteRsMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, TrnAddQuoteRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteRsArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteRsArray", scope = TrnAddQuoteRsMType.class)
    public JAXBElement<TrnAddQuoteRsArrayAType> createTrnAddQuoteRsMTypeTrnAddQuoteRsArray(TrnAddQuoteRsArrayAType value) {
        return new JAXBElement<TrnAddQuoteRsArrayAType>(_TrnAddQuoteRsMTypeTrnAddQuoteRsArray_QNAME, TrnAddQuoteRsArrayAType.class, TrnAddQuoteRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteId", scope = TrnAddQuoteRsMType.class)
    public JAXBElement<TrnAddQuoteIdType> createTrnAddQuoteRsMTypeTrnAddQuoteId(TrnAddQuoteIdType value) {
        return new JAXBElement<TrnAddQuoteIdType>(_TrnAddQuoteRsMTypeTrnAddQuoteId_QNAME, TrnAddQuoteIdType.class, TrnAddQuoteRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnAddQuoteTimeLmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnAddQuoteTimeLmt", scope = TrnAddQuoteRsMType.class)
    public JAXBElement<TrnAddQuoteTimeLmtType> createTrnAddQuoteRsMTypeTrnAddQuoteTimeLmt(TrnAddQuoteTimeLmtType value) {
        return new JAXBElement<TrnAddQuoteTimeLmtType>(_TrnAddQuoteRsMTypeTrnAddQuoteTimeLmt_QNAME, TrnAddQuoteTimeLmtType.class, TrnAddQuoteRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = TrnAddQuoteRsMType.class)
    public JAXBElement<RsStatType> createTrnAddQuoteRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, TrnAddQuoteRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddQuoteRsMType.class)
    public JAXBElement<CustomCType> createTrnAddQuoteRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddQuoteRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = TrnAddQuoteRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createTrnAddQuoteRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, TrnAddQuoteRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = TrnAddQuoteRqMType.class)
    public JAXBElement<BatchNumType> createTrnAddQuoteRqMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, TrnAddQuoteRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddQuoteRqMType.class)
    public JAXBElement<CustomCType> createTrnAddQuoteRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddQuoteRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = AcctNSFTrnModRsMType.class)
    public JAXBElement<RsStatType> createAcctNSFTrnModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, AcctNSFTrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctNSFTrnModRsMType.class)
    public JAXBElement<CustomCType> createAcctNSFTrnModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctNSFTrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NSFItemTrnRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "NSFItemTrnRec", scope = AcctNSFTrnModRqMType.class)
    public JAXBElement<NSFItemTrnRecCType> createAcctNSFTrnModRqMTypeNSFItemTrnRec(NSFItemTrnRecCType value) {
        return new JAXBElement<NSFItemTrnRecCType>(_AcctNSFTrnModRqMTypeNSFItemTrnRec_QNAME, NSFItemTrnRecCType.class, AcctNSFTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntentKey", scope = AcctNSFTrnModRqMType.class)
    public JAXBElement<ActIntentKeyType> createAcctNSFTrnModRqMTypeActIntentKey(ActIntentKeyType value) {
        return new JAXBElement<ActIntentKeyType>(_StopChkModRqMTypeActIntentKey_QNAME, ActIntentKeyType.class, AcctNSFTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = AcctNSFTrnModRqMType.class)
    public JAXBElement<DltType> createAcctNSFTrnModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, AcctNSFTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctNSFTrnModRqMType.class)
    public JAXBElement<CustomCType> createAcctNSFTrnModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctNSFTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = AcctNSFTrnModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createAcctNSFTrnModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, AcctNSFTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = AcctAnlysTrnModRsMType.class)
    public JAXBElement<RsStatType> createAcctAnlysTrnModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, AcctAnlysTrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctAnlysTrnModRsMType.class)
    public JAXBElement<CustomCType> createAcctAnlysTrnModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctAnlysTrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = AcctAnlysTrnModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createAcctAnlysTrnModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, AcctAnlysTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = AcctAnlysTrnModRqMType.class)
    public JAXBElement<BatchNumType> createAcctAnlysTrnModRqMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, AcctAnlysTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctAnlysTrnInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctAnlysTrnInfo", scope = AcctAnlysTrnModRqMType.class)
    public JAXBElement<AcctAnlysTrnInfoCType> createAcctAnlysTrnModRqMTypeAcctAnlysTrnInfo(AcctAnlysTrnInfoCType value) {
        return new JAXBElement<AcctAnlysTrnInfoCType>(_AcctAnlysTrnModRqMTypeAcctAnlysTrnInfo_QNAME, AcctAnlysTrnInfoCType.class, AcctAnlysTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = AcctAnlysTrnModRqMType.class)
    public JAXBElement<DltType> createAcctAnlysTrnModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, AcctAnlysTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctAnlysTrnModRqMType.class)
    public JAXBElement<CustomCType> createAcctAnlysTrnModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctAnlysTrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = AcctAnlysTrnAddRsMType.class)
    public JAXBElement<BatchNumType> createAcctAnlysTrnAddRsMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, AcctAnlysTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SeqNum", scope = AcctAnlysTrnAddRsMType.class)
    public JAXBElement<SeqNumType> createAcctAnlysTrnAddRsMTypeSeqNum(SeqNumType value) {
        return new JAXBElement<SeqNumType>(_AcctReconItemModRqMTypeSeqNum_QNAME, SeqNumType.class, AcctAnlysTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = AcctAnlysTrnAddRsMType.class)
    public JAXBElement<RsStatType> createAcctAnlysTrnAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, AcctAnlysTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctAnlysTrnAddRsMType.class)
    public JAXBElement<CustomCType> createAcctAnlysTrnAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctAnlysTrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = AcctAnlysTrnAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createAcctAnlysTrnAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, AcctAnlysTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = AcctAnlysTrnAddRqMType.class)
    public JAXBElement<BatchNumType> createAcctAnlysTrnAddRqMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, AcctAnlysTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = AcctAnlysTrnAddRqMType.class)
    public JAXBElement<CustomCType> createAcctAnlysTrnAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, AcctAnlysTrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = StopChkAddValidateRsMType.class)
    public JAXBElement<RsStatType> createStopChkAddValidateRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, StopChkAddValidateRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkAddValidateRsMType.class)
    public JAXBElement<CustomCType> createStopChkAddValidateRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkAddValidateRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkAddValidateRqMType.class)
    public JAXBElement<CustomCType> createStopChkAddValidateRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkAddValidateRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = TrnAddValidateRsMType.class)
    public JAXBElement<RsStatType> createTrnAddValidateRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_WireTrnAddValidateRsMTypeRsStat_QNAME, RsStatType.class, TrnAddValidateRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddValidateRsMType.class)
    public JAXBElement<CustomCType> createTrnAddValidateRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddValidateRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddValidateRqMType.class)
    public JAXBElement<CustomCType> createTrnAddValidateRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddValidateRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = XferAddValidateRsMType.class)
    public JAXBElement<CustomCType> createXferAddValidateRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, XferAddValidateRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = XferAddValidateRqMType.class)
    public JAXBElement<CustomCType> createXferAddValidateRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, XferAddValidateRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnModRsMType.class)
    public JAXBElement<CustomCType> createTrnModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = TrnModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createTrnModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = TrnModRqMType.class)
    public JAXBElement<BatchNumType> createTrnModRqMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SeqNum", scope = TrnModRqMType.class)
    public JAXBElement<SeqNumType> createTrnModRqMTypeSeqNum(SeqNumType value) {
        return new JAXBElement<SeqNumType>(_AcctReconItemModRqMTypeSeqNum_QNAME, SeqNumType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnModInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnModInfo", scope = TrnModRqMType.class)
    public JAXBElement<TrnModInfoCType> createTrnModRqMTypeTrnModInfo(TrnModInfoCType value) {
        return new JAXBElement<TrnModInfoCType>(_TrnModRqMTypeTrnModInfo_QNAME, TrnModInfoCType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = TrnModRqMType.class)
    public JAXBElement<DltType> createTrnModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnModRqMType.class)
    public JAXBElement<CustomCType> createTrnModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AvlBalCalcCode", scope = TrnModRqMType.class)
    public JAXBElement<AvlBalCalcCodeType> createTrnModRqMTypeAvlBalCalcCode(AvlBalCalcCodeType value) {
        return new JAXBElement<AvlBalCalcCodeType>(_XferRecCTypeAvlBalCalcCode_QNAME, AvlBalCalcCodeType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnRcptId", scope = TrnModRqMType.class)
    public JAXBElement<TrnRcptIdType> createTrnModRqMTypeTrnRcptId(TrnRcptIdType value) {
        return new JAXBElement<TrnRcptIdType>(_PmtHubCrXferModRqMTypeTrnRcptId_QNAME, TrnRcptIdType.class, TrnModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = XferModRsMType.class)
    public JAXBElement<CustomCType> createXferModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, XferModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = XferModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createXferModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdFromCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctIdFrom", scope = XferModRqMType.class)
    public JAXBElement<AcctIdFromCType> createXferModRqMTypeAcctIdFrom(AcctIdFromCType value) {
        return new JAXBElement<AcctIdFromCType>(_XferModRqMTypeAcctIdFrom_QNAME, AcctIdFromCType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdToCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctIdTo", scope = XferModRqMType.class)
    public JAXBElement<AcctIdToCType> createXferModRqMTypeAcctIdTo(AcctIdToCType value) {
        return new JAXBElement<AcctIdToCType>(_XferModRqMTypeAcctIdTo_QNAME, AcctIdToCType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferKey", scope = XferModRqMType.class)
    public JAXBElement<XferKeyType> createXferModRqMTypeXferKey(XferKeyType value) {
        return new JAXBElement<XferKeyType>(_XferModRqMTypeXferKey_QNAME, XferKeyType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = XferModRqMType.class)
    public JAXBElement<DltType> createXferModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_PromoXferModRqMTypeDlt_QNAME, DltType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferRec", scope = XferModRqMType.class)
    public JAXBElement<XferRecCType> createXferModRqMTypeXferRec(XferRecCType value) {
        return new JAXBElement<XferRecCType>(_XferModRqMTypeXferRec_QNAME, XferRecCType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = XferModRqMType.class)
    public JAXBElement<CustomCType> createXferModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferType", scope = XferModRqMType.class)
    public JAXBElement<XferTypeType> createXferModRqMTypeXferType(XferTypeType value) {
        return new JAXBElement<XferTypeType>(_XferModRqMTypeXferType_QNAME, XferTypeType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHXferRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHXferRec", scope = XferModRqMType.class)
    public JAXBElement<ACHXferRecCType> createXferModRqMTypeACHXferRec(ACHXferRecCType value) {
        return new JAXBElement<ACHXferRecCType>(_XferModRqMTypeACHXferRec_QNAME, ACHXferRecCType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferRec", scope = XferModRqMType.class)
    public JAXBElement<FutXferRecCType> createXferModRqMTypeFutXferRec(FutXferRecCType value) {
        return new JAXBElement<FutXferRecCType>(_XferModRqMTypeFutXferRec_QNAME, FutXferRecCType.class, XferModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BatchNum", scope = TrnAddRsMType.class)
    public JAXBElement<BatchNumType> createTrnAddRsMTypeBatchNum(BatchNumType value) {
        return new JAXBElement<BatchNumType>(_AcctReconItemModRqMTypeBatchNum_QNAME, BatchNumType.class, TrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SeqNum", scope = TrnAddRsMType.class)
    public JAXBElement<SeqNumType> createTrnAddRsMTypeSeqNum(SeqNumType value) {
        return new JAXBElement<SeqNumType>(_AcctReconItemModRqMTypeSeqNum_QNAME, SeqNumType.class, TrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddRsMType.class)
    public JAXBElement<CustomCType> createTrnAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TrnRcptId", scope = TrnAddRsMType.class)
    public JAXBElement<TrnRcptIdType> createTrnAddRsMTypeTrnRcptId(TrnRcptIdType value) {
        return new JAXBElement<TrnRcptIdType>(_PmtHubCrXferModRqMTypeTrnRcptId_QNAME, TrnRcptIdType.class, TrnAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = TrnAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createTrnAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, TrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = TrnAddRqMType.class)
    public JAXBElement<CustomCType> createTrnAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, TrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AvlBalCalcCode", scope = TrnAddRqMType.class)
    public JAXBElement<AvlBalCalcCodeType> createTrnAddRqMTypeAvlBalCalcCode(AvlBalCalcCodeType value) {
        return new JAXBElement<AvlBalCalcCodeType>(_XferRecCTypeAvlBalCalcCode_QNAME, AvlBalCalcCodeType.class, TrnAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkCanRsMType.class)
    public JAXBElement<CustomCType> createStopChkCanRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkCanRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkCanRqMType.class)
    public JAXBElement<CustomCType> createStopChkCanRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkCanRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferKey", scope = XferAddRsMType.class)
    public JAXBElement<XferKeyType> createXferAddRsMTypeXferKey(XferKeyType value) {
        return new JAXBElement<XferKeyType>(_XferModRqMTypeXferKey_QNAME, XferKeyType.class, XferAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = XferAddRsMType.class)
    public JAXBElement<CustomCType> createXferAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, XferAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = XferAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createXferAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, XferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdToCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctIdTo", scope = XferAddRqMType.class)
    public JAXBElement<AcctIdToCType> createXferAddRqMTypeAcctIdTo(AcctIdToCType value) {
        return new JAXBElement<AcctIdToCType>(_XferModRqMTypeAcctIdTo_QNAME, AcctIdToCType.class, XferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferRec", scope = XferAddRqMType.class)
    public JAXBElement<XferRecCType> createXferAddRqMTypeXferRec(XferRecCType value) {
        return new JAXBElement<XferRecCType>(_XferModRqMTypeXferRec_QNAME, XferRecCType.class, XferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = XferAddRqMType.class)
    public JAXBElement<CustomCType> createXferAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, XferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferType", scope = XferAddRqMType.class)
    public JAXBElement<XferTypeType> createXferAddRqMTypeXferType(XferTypeType value) {
        return new JAXBElement<XferTypeType>(_XferModRqMTypeXferType_QNAME, XferTypeType.class, XferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACHXferRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ACHXferRec", scope = XferAddRqMType.class)
    public JAXBElement<ACHXferRecCType> createXferAddRqMTypeACHXferRec(ACHXferRecCType value) {
        return new JAXBElement<ACHXferRecCType>(_XferModRqMTypeACHXferRec_QNAME, ACHXferRecCType.class, XferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutXferRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutXferRec", scope = XferAddRqMType.class)
    public JAXBElement<FutXferRecCType> createXferAddRqMTypeFutXferRec(FutXferRecCType value) {
        return new JAXBElement<FutXferRecCType>(_XferModRqMTypeFutXferRec_QNAME, FutXferRecCType.class, XferAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopSeqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopSeq", scope = StopChkAddRsMType.class)
    public JAXBElement<StopSeqType> createStopChkAddRsMTypeStopSeq(StopSeqType value) {
        return new JAXBElement<StopSeqType>(_StopChkAddRsMTypeStopSeq_QNAME, StopSeqType.class, StopChkAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkAddRsMType.class)
    public JAXBElement<CustomCType> createStopChkAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = StopChkAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createStopChkAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_PromoXferModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, StopChkAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopChkInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StopChkInfo", scope = StopChkAddRqMType.class)
    public JAXBElement<StopChkInfoCType> createStopChkAddRqMTypeStopChkInfo(StopChkInfoCType value) {
        return new JAXBElement<StopChkInfoCType>(_StopChkModRqMTypeStopChkInfo_QNAME, StopChkInfoCType.class, StopChkAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = StopChkAddRqMType.class)
    public JAXBElement<CustomCType> createStopChkAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_WireIntlTrnInfoRecCTypeCustom_QNAME, CustomCType.class, StopChkAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultRecInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FaultRecInfoArray", scope = HdrFaultMType.class)
    public JAXBElement<FaultRecInfoArrayAType> createHdrFaultMTypeFaultRecInfoArray(FaultRecInfoArrayAType value) {
        return new JAXBElement<FaultRecInfoArrayAType>(_HdrFaultMTypeFaultRecInfoArray_QNAME, FaultRecInfoArrayAType.class, HdrFaultMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIDataType.class)
    public JAXBElement<byte[]> createSPKIDataTypeSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataTypeSPKISexp_QNAME, byte[].class, SPKIDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyID", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyID(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyID_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "PGPKeyPacket", scope = PGPDataType.class)
    public JAXBElement<byte[]> createPGPDataTypePGPKeyPacket(byte[] value) {
        return new JAXBElement<byte[]>(_PGPDataTypePGPKeyPacket_QNAME, byte[].class, PGPDataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509DataType.class)
    public JAXBElement<X509IssuerSerialType> createX509DataTypeX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<X509IssuerSerialType>(_X509DataTypeX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509SKI(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509SKI_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509DataType.class)
    public JAXBElement<String> createX509DataTypeX509SubjectName(String value) {
        return new JAXBElement<String>(_X509DataTypeX509SubjectName_QNAME, String.class, X509DataType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509Certificate_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509DataType.class)
    public JAXBElement<byte[]> createX509DataTypeX509CRL(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataTypeX509CRL_QNAME, byte[].class, X509DataType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = TransformType.class)
    public JAXBElement<String> createTransformTypeXPath(String value) {
        return new JAXBElement<String>(_TransformTypeXPath_QNAME, String.class, TransformType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethodType.class)
    public JAXBElement<BigInteger> createSignatureMethodTypeHMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethodTypeHMACOutputLength_QNAME, BigInteger.class, SignatureMethodType.class, value);
    }

}
