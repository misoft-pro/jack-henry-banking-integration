
package pro.misoft.jackhenryintegration.generated.billpay;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pro.misoft.jackhenryintegration.enerated.billpay package. 
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
    private final static QName _BilPayPayeeSrch_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeSrch");
    private final static QName _BilPayPayeeSrchResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeSrchResponse");
    private final static QName _BilPayPayeeInq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeInq");
    private final static QName _BilPayPayeeInqResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeInqResponse");
    private final static QName _BilPayPayeeAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeAdd");
    private final static QName _BilPayPayeeAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeAddResponse");
    private final static QName _BilPayPayeeMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeMod");
    private final static QName _BilPayPayeeModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeModResponse");
    private final static QName _BilPaySchedPmtSrch_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtSrch");
    private final static QName _BilPaySchedPmtSrchResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtSrchResponse");
    private final static QName _BilPaySchedPmtInq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtInq");
    private final static QName _BilPaySchedPmtInqResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtInqResponse");
    private final static QName _BilPaySchedPmtAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtAdd");
    private final static QName _BilPaySchedPmtAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtAddResponse");
    private final static QName _BilPaySchedPmtMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtMod");
    private final static QName _BilPaySchedPmtModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtModResponse");
    private final static QName _BilPaySchedPmtApprv_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtApprv");
    private final static QName _BilPaySchedPmtApprvResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtApprvResponse");
    private final static QName _BilPayPmtHistSrch_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPmtHistSrch");
    private final static QName _BilPayPmtHistSrchResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPmtHistSrchResponse");
    private final static QName _BilPayPmtHistInq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPmtHistInq");
    private final static QName _BilPayPmtHistInqResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPmtHistInqResponse");
    private final static QName _BilPaySubSrch_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubSrch");
    private final static QName _BilPaySubSrchResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubSrchResponse");
    private final static QName _BilPaySubInq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubInq");
    private final static QName _BilPaySubInqResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubInqResponse");
    private final static QName _BilPaySubAdd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubAdd");
    private final static QName _BilPaySubAddResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubAddResponse");
    private final static QName _BilPaySubMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubMod");
    private final static QName _BilPaySubModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubModResponse");
    private final static QName _BilPaySubConsmCustInq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubConsmCustInq");
    private final static QName _BilPaySubConsmCustInqResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubConsmCustInqResponse");
    private final static QName _BilPayChanInq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayChanInq");
    private final static QName _BilPayChanInqResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayChanInqResponse");
    private final static QName _BilPayElecBilSchedSrch_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedSrch");
    private final static QName _BilPayElecBilSchedSrchResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedSrchResponse");
    private final static QName _BilPayElecBilSchedInq_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedInq");
    private final static QName _BilPayElecBilSchedInqResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedInqResponse");
    private final static QName _BilPayElecBilSchedMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedMod");
    private final static QName _BilPayElecBilSchedModResponse_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedModResponse");
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
    private final static QName _TINInfoCTypeTINCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TINCode");
    private final static QName _TINInfoCTypeTINDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TINDesc");
    private final static QName _TINInfoCTypeTaxId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TaxId");
    private final static QName _TINInfoCTypeTaxIdMod_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TaxIdMod");
    private final static QName _TINInfoCTypeCertCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CertCode");
    private final static QName _TINInfoCTypeCertCodeDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CertCodeDesc");
    private final static QName _TINInfoCTypeCertCodeDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CertCodeDt");
    private final static QName _TINInfoCTypeBNotStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BNotStat");
    private final static QName _TINInfoCTypeBNotIRSDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BNotIRSDt");
    private final static QName _AcctTitleInfoCTypeAcctTitle_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AcctTitle");
    private final static QName _AcctTitleInfoCTypeAddlBirthDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AddlBirthDt");
    private final static QName _AcctTitleInfoCTypeAddlPhoneArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AddlPhoneArray");
    private final static QName _AcctTitleInfoCTypeAddlNameStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AddlNameStat");
    private final static QName _BilPaySubSrchInfoCTypeSubType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SubType");
    private final static QName _BilPaySubSrchInfoCTypeSubStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SubStat");
    private final static QName _BilPayPmtPayeeInfoCTypeCustom_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Custom");
    private final static QName _ElecMerAcctIdInfoRecCTypeElecMerAcctBal_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecMerAcctBal");
    private final static QName _ElecMerPayeeInfoRecCTypeAuthenQuesArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AuthenQuesArray");
    private final static QName _EmailInfoCTypeEmailAddr_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "EmailAddr");
    private final static QName _EmailInfoCTypeEmailType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "EmailType");
    private final static QName _MobPhoneInfoCTypeMobPrvdCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobPrvdCode");
    private final static QName _MobPhoneInfoCTypeMobPrvdCodeDesc_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobPrvdCodeDesc");
    private final static QName _MobPhoneInfoCTypeMobPrvdDom_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobPrvdDom");
    private final static QName _MobPhoneInfoCTypeMobBB_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobBB");
    private final static QName _MobPhoneInfoCTypeMobSendTestText_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobSendTestText");
    private final static QName _PhoneInfoCTypePhoneNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneNum");
    private final static QName _PhoneInfoCTypePhoneType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneType");
    private final static QName _PhoneInfoCTypePhoneTime_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneTime");
    private final static QName _PhoneInfoCTypePhoneExt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PhoneExt");
    private final static QName _IncXtendElemInfoCTypeXtendElem_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XtendElem");
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
    private final static QName _XPersonNameCTypeTitlePrefix_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TitlePrefix");
    private final static QName _XPersonNameCTypeNameSuffix_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "NameSuffix");
    private final static QName _XPersonNameCTypeLegalName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "LegalName");
    private final static QName _XPersonNameCTypeSalName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SalName");
    private final static QName _PersonNameCTypeComName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ComName");
    private final static QName _PersonNameCTypeFirstName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FirstName");
    private final static QName _PersonNameCTypeMiddleName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MiddleName");
    private final static QName _PersonNameCTypeLastName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "LastName");
    private final static QName _BilPayElecBilSchedModRsMTypeRsStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "RsStat");
    private final static QName _BilPayElecBilSchedModRqMTypeBilPayProd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayProd");
    private final static QName _BilPayElecBilSchedModRqMTypeBilPayElecBilSchedModInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedModInfo");
    private final static QName _BilPayElecBilSchedModRqMTypeDlt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Dlt");
    private final static QName _BilPayElecBilSchedInqRsMTypeSubId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SubId");
    private final static QName _BilPayElecBilSchedInqRsMTypeElecBilId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecBilId");
    private final static QName _BilPayElecBilSchedInqRsMTypeActIntent_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ActIntent");
    private final static QName _BilPayElecBilSchedInqRsMTypeActIntentKey_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ActIntentKey");
    private final static QName _BilPayElecBilSchedInqRsMTypeBilPayElecBilSchedInqInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedInqInfo");
    private final static QName _BilPayElecBilSchedInqRsMTypeMobDevType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobDevType");
    private final static QName _BilPayElecBilSchedInqRsMTypeMobDevResoType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "MobDevResoType");
    private final static QName _BilPayElecBilSchedInqRsMTypeOrientation_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "Orientation");
    private final static QName _BilPayElecBilSchedSrchRsMTypePmtStartDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtStartDt");
    private final static QName _BilPayElecBilSchedSrchRsMTypePmtEndDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtEndDt");
    private final static QName _BilPayElecBilSchedSrchRsMTypePayeeName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PayeeName");
    private final static QName _BilPayElecBilSchedSrchRsMTypeElecBilStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecBilStat");
    private final static QName _BilPayElecBilSchedSrchRsMTypeBilPayElecBilSchedSrchArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayElecBilSchedSrchArray");
    private final static QName _BilPayElecBilSchedSrchRsMTypeElecBilPayeeAcctId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecBilPayeeAcctId");
    private final static QName _BilPayElecBilSchedSrchRqMTypeStartDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "StartDt");
    private final static QName _BilPayElecBilSchedSrchRqMTypeEndDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "EndDt");
    private final static QName _BilPayChanInqRsMTypeBilPayProdType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayProdType");
    private final static QName _BilPayChanInqRsMTypeBilPayChanInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayChanInfo");
    private final static QName _BilPaySubConsmCustInqRsMTypeSubConsmCustId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SubConsmCustId");
    private final static QName _BilPaySubConsmCustInqRsMTypeSubComId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SubComId");
    private final static QName _BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ErrOvrRdInfoArray");
    private final static QName _BilPaySubModRqMTypeBilPaySubInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubInfo");
    private final static QName _BilPaySubSrchRsMTypePersonName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PersonName");
    private final static QName _BilPaySubSrchRsMTypeSrchAddr_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SrchAddr");
    private final static QName _BilPaySubSrchRsMTypeSrchCity_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SrchCity");
    private final static QName _BilPaySubSrchRsMTypeBilPaySubSrchArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySubSrchArray");
    private final static QName _BilPaySubSrchRsMTypePayFromAcctId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PayFromAcctId");
    private final static QName _BilPayPmtHistInqRsMTypePmtId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtId");
    private final static QName _BilPayPmtHistInqRsMTypeIncChkImg_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IncChkImg");
    private final static QName _BilPayPmtHistInqRsMTypeBilPayPmtInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPmtInfo");
    private final static QName _BilPayPmtHistInqRsMTypePmtCrtDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtCrtDt");
    private final static QName _BilPayPmtHistInqRsMTypePmtStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtStat");
    private final static QName _BilPayPmtHistInqRsMTypePmtMthd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtMthd");
    private final static QName _BilPayPmtHistInqRsMTypeXPmtStatHistArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "x_PmtStatHistArray");
    private final static QName _BilPayPmtHistInqRsMTypeXPmtChkStatHistArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "x_PmtChkStatHistArray");
    private final static QName _BilPayPmtHistInqRsMTypeXPmtChkTrakInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "x_PmtChkTrakInfo");
    private final static QName _BilPayPmtHistInqRsMTypePmtChkNum_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtChkNum");
    private final static QName _BilPayPmtHistInqRsMTypePmtChkStat_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtChkStat");
    private final static QName _BilPayPmtHistInqRsMTypePmtChkImgInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtChkImgInfo");
    private final static QName _BilPayPmtHistInqRsMTypeXElecBilPmtInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "x_ElecBilPmtInfo");
    private final static QName _BilPayPmtHistInqRqMTypeIncXtendElemArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IncXtendElemArray");
    private final static QName _BilPayPmtHistSrchRsMTypePmtLowAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtLowAmt");
    private final static QName _BilPayPmtHistSrchRsMTypePmtHighAmt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtHighAmt");
    private final static QName _BilPayPmtHistSrchRsMTypePayeeId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PayeeId");
    private final static QName _BilPayPmtHistSrchRsMTypeBilPayPmtHistSrchArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPmtHistSrchArray");
    private final static QName _BilPayPmtHistSrchRsMTypePayeePmtMthd_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PayeePmtMthd");
    private final static QName _BilPayPmtHistSrchRsMTypeP2PFilter_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "P2PFilter");
    private final static QName _BilPayPmtHistSrchRsMTypeRecurFilter_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "RecurFilter");
    private final static QName _BilPayPmtHistSrchRsMTypePmtIntentType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PmtIntentType");
    private final static QName _BilPayPmtHistSrchRsMTypeXferFilter_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "XferFilter");
    private final static QName _BilPayPmtHistSrchRsMTypeCardPayFilter_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "CardPayFilter");
    private final static QName _BilPaySchedPmtModRqMTypeBilPaySchedPmtInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtInfo");
    private final static QName _BilPaySchedPmtModRqMTypeFutPmtId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "FutPmtId");
    private final static QName _BilPaySchedPmtModRqMTypeSkipPmtOccur_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "SkipPmtOccur");
    private final static QName _BilPaySchedPmtModRqMTypeDltRecur_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "DltRecur");
    private final static QName _BilPaySchedPmtInqRsMTypeBilPayeeElecPmtInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayeeElecPmtInfo");
    private final static QName _BilPaySchedPmtSrchRsMTypeBilPaySchedPmtSrchArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPaySchedPmtSrchArray");
    private final static QName _BilPayPayeeModRsMTypePayeeModId_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PayeeModId");
    private final static QName _BilPayPayeeModRsMTypeElecMerAcctIdArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecMerAcctIdArray");
    private final static QName _BilPayPayeeModRqMTypeBilPayPayeeInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeInfo");
    private final static QName _BilPayPayeeModRqMTypeElecMerPayeeInfoRec_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecMerPayeeInfoRec");
    private final static QName _BilPayPayeeModRqMTypeElecMerAcctErrCode_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecMerAcctErrCode");
    private final static QName _BilPayPayeeInqRsMTypeXElecMerPayeeInfo_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "x_ElecMerPayeeInfo");
    private final static QName _BilPayPayeeInqRsMTypeAlwCardFundedType_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "AlwCardFundedType");
    private final static QName _BilPayPayeeInqRsMTypeXCardFundedPayeeArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "x_CardFundedPayeeArray");
    private final static QName _BilPayPayeeSrchRsMTypePayeeCatName_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "PayeeCatName");
    private final static QName _BilPayPayeeSrchRsMTypeExclNonAct_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ExclNonAct");
    private final static QName _BilPayPayeeSrchRsMTypeIncDlt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "IncDlt");
    private final static QName _BilPayPayeeSrchRsMTypeBilPayPayeeSrchArray_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "BilPayPayeeSrchArray");
    private final static QName _BilPayPayeeSrchRsMTypeElecMerPayeeOnly_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ElecMerPayeeOnly");
    private final static QName _BilPayPayeeSrchRsMTypeLastMainStartDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "LastMainStartDt");
    private final static QName _BilPayPayeeSrchRsMTypeLastMainEndDt_QNAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "LastMainEndDt");
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pro.misoft.jackhenryintegration.enerated.billpay
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
     * Create an instance of {@link BilPayPayeeSrchRqMType }
     * 
     */
    public BilPayPayeeSrchRqMType createBilPayPayeeSrchRqMType() {
        return new BilPayPayeeSrchRqMType();
    }

    /**
     * Create an instance of {@link BilPayPayeeSrchRsMType }
     * 
     */
    public BilPayPayeeSrchRsMType createBilPayPayeeSrchRsMType() {
        return new BilPayPayeeSrchRsMType();
    }

    /**
     * Create an instance of {@link BilPayPayeeInqRqMType }
     * 
     */
    public BilPayPayeeInqRqMType createBilPayPayeeInqRqMType() {
        return new BilPayPayeeInqRqMType();
    }

    /**
     * Create an instance of {@link BilPayPayeeInqRsMType }
     * 
     */
    public BilPayPayeeInqRsMType createBilPayPayeeInqRsMType() {
        return new BilPayPayeeInqRsMType();
    }

    /**
     * Create an instance of {@link BilPayPayeeAddRqMType }
     * 
     */
    public BilPayPayeeAddRqMType createBilPayPayeeAddRqMType() {
        return new BilPayPayeeAddRqMType();
    }

    /**
     * Create an instance of {@link BilPayPayeeAddRsMType }
     * 
     */
    public BilPayPayeeAddRsMType createBilPayPayeeAddRsMType() {
        return new BilPayPayeeAddRsMType();
    }

    /**
     * Create an instance of {@link BilPayPayeeModRqMType }
     * 
     */
    public BilPayPayeeModRqMType createBilPayPayeeModRqMType() {
        return new BilPayPayeeModRqMType();
    }

    /**
     * Create an instance of {@link BilPayPayeeModRsMType }
     * 
     */
    public BilPayPayeeModRsMType createBilPayPayeeModRsMType() {
        return new BilPayPayeeModRsMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtSrchRqMType }
     * 
     */
    public BilPaySchedPmtSrchRqMType createBilPaySchedPmtSrchRqMType() {
        return new BilPaySchedPmtSrchRqMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtSrchRsMType }
     * 
     */
    public BilPaySchedPmtSrchRsMType createBilPaySchedPmtSrchRsMType() {
        return new BilPaySchedPmtSrchRsMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtInqRqMType }
     * 
     */
    public BilPaySchedPmtInqRqMType createBilPaySchedPmtInqRqMType() {
        return new BilPaySchedPmtInqRqMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtInqRsMType }
     * 
     */
    public BilPaySchedPmtInqRsMType createBilPaySchedPmtInqRsMType() {
        return new BilPaySchedPmtInqRsMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtAddRqMType }
     * 
     */
    public BilPaySchedPmtAddRqMType createBilPaySchedPmtAddRqMType() {
        return new BilPaySchedPmtAddRqMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtAddRsMType }
     * 
     */
    public BilPaySchedPmtAddRsMType createBilPaySchedPmtAddRsMType() {
        return new BilPaySchedPmtAddRsMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtModRqMType }
     * 
     */
    public BilPaySchedPmtModRqMType createBilPaySchedPmtModRqMType() {
        return new BilPaySchedPmtModRqMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtModRsMType }
     * 
     */
    public BilPaySchedPmtModRsMType createBilPaySchedPmtModRsMType() {
        return new BilPaySchedPmtModRsMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtApprvRqMType }
     * 
     */
    public BilPaySchedPmtApprvRqMType createBilPaySchedPmtApprvRqMType() {
        return new BilPaySchedPmtApprvRqMType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtApprvRsMType }
     * 
     */
    public BilPaySchedPmtApprvRsMType createBilPaySchedPmtApprvRsMType() {
        return new BilPaySchedPmtApprvRsMType();
    }

    /**
     * Create an instance of {@link BilPayPmtHistSrchRqMType }
     * 
     */
    public BilPayPmtHistSrchRqMType createBilPayPmtHistSrchRqMType() {
        return new BilPayPmtHistSrchRqMType();
    }

    /**
     * Create an instance of {@link BilPayPmtHistSrchRsMType }
     * 
     */
    public BilPayPmtHistSrchRsMType createBilPayPmtHistSrchRsMType() {
        return new BilPayPmtHistSrchRsMType();
    }

    /**
     * Create an instance of {@link BilPayPmtHistInqRqMType }
     * 
     */
    public BilPayPmtHistInqRqMType createBilPayPmtHistInqRqMType() {
        return new BilPayPmtHistInqRqMType();
    }

    /**
     * Create an instance of {@link BilPayPmtHistInqRsMType }
     * 
     */
    public BilPayPmtHistInqRsMType createBilPayPmtHistInqRsMType() {
        return new BilPayPmtHistInqRsMType();
    }

    /**
     * Create an instance of {@link BilPaySubSrchRqMType }
     * 
     */
    public BilPaySubSrchRqMType createBilPaySubSrchRqMType() {
        return new BilPaySubSrchRqMType();
    }

    /**
     * Create an instance of {@link BilPaySubSrchRsMType }
     * 
     */
    public BilPaySubSrchRsMType createBilPaySubSrchRsMType() {
        return new BilPaySubSrchRsMType();
    }

    /**
     * Create an instance of {@link BilPaySubInqRqMType }
     * 
     */
    public BilPaySubInqRqMType createBilPaySubInqRqMType() {
        return new BilPaySubInqRqMType();
    }

    /**
     * Create an instance of {@link BilPaySubInqRsMType }
     * 
     */
    public BilPaySubInqRsMType createBilPaySubInqRsMType() {
        return new BilPaySubInqRsMType();
    }

    /**
     * Create an instance of {@link BilPaySubAddRqMType }
     * 
     */
    public BilPaySubAddRqMType createBilPaySubAddRqMType() {
        return new BilPaySubAddRqMType();
    }

    /**
     * Create an instance of {@link BilPaySubAddRsMType }
     * 
     */
    public BilPaySubAddRsMType createBilPaySubAddRsMType() {
        return new BilPaySubAddRsMType();
    }

    /**
     * Create an instance of {@link BilPaySubModRqMType }
     * 
     */
    public BilPaySubModRqMType createBilPaySubModRqMType() {
        return new BilPaySubModRqMType();
    }

    /**
     * Create an instance of {@link BilPaySubModRsMType }
     * 
     */
    public BilPaySubModRsMType createBilPaySubModRsMType() {
        return new BilPaySubModRsMType();
    }

    /**
     * Create an instance of {@link BilPaySubConsmCustInqRqMType }
     * 
     */
    public BilPaySubConsmCustInqRqMType createBilPaySubConsmCustInqRqMType() {
        return new BilPaySubConsmCustInqRqMType();
    }

    /**
     * Create an instance of {@link BilPaySubConsmCustInqRsMType }
     * 
     */
    public BilPaySubConsmCustInqRsMType createBilPaySubConsmCustInqRsMType() {
        return new BilPaySubConsmCustInqRsMType();
    }

    /**
     * Create an instance of {@link BilPayChanInqRqMType }
     * 
     */
    public BilPayChanInqRqMType createBilPayChanInqRqMType() {
        return new BilPayChanInqRqMType();
    }

    /**
     * Create an instance of {@link BilPayChanInqRsMType }
     * 
     */
    public BilPayChanInqRsMType createBilPayChanInqRsMType() {
        return new BilPayChanInqRsMType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedSrchRqMType }
     * 
     */
    public BilPayElecBilSchedSrchRqMType createBilPayElecBilSchedSrchRqMType() {
        return new BilPayElecBilSchedSrchRqMType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedSrchRsMType }
     * 
     */
    public BilPayElecBilSchedSrchRsMType createBilPayElecBilSchedSrchRsMType() {
        return new BilPayElecBilSchedSrchRsMType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedInqRqMType }
     * 
     */
    public BilPayElecBilSchedInqRqMType createBilPayElecBilSchedInqRqMType() {
        return new BilPayElecBilSchedInqRqMType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedInqRsMType }
     * 
     */
    public BilPayElecBilSchedInqRsMType createBilPayElecBilSchedInqRsMType() {
        return new BilPayElecBilSchedInqRsMType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedModRqMType }
     * 
     */
    public BilPayElecBilSchedModRqMType createBilPayElecBilSchedModRqMType() {
        return new BilPayElecBilSchedModRqMType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedModRsMType }
     * 
     */
    public BilPayElecBilSchedModRsMType createBilPayElecBilSchedModRsMType() {
        return new BilPayElecBilSchedModRsMType();
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
     * Create an instance of {@link SrchMsgRqHdrCType }
     * 
     */
    public SrchMsgRqHdrCType createSrchMsgRqHdrCType() {
        return new SrchMsgRqHdrCType();
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
     * Create an instance of {@link MaxRecType }
     * 
     */
    public MaxRecType createMaxRecType() {
        return new MaxRecType();
    }

    /**
     * Create an instance of {@link CursorType }
     * 
     */
    public CursorType createCursorType() {
        return new CursorType();
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
     * Create an instance of {@link BilPayProdType }
     * 
     */
    public BilPayProdType createBilPayProdType() {
        return new BilPayProdType();
    }

    /**
     * Create an instance of {@link SubIdType }
     * 
     */
    public SubIdType createSubIdType() {
        return new SubIdType();
    }

    /**
     * Create an instance of {@link PayeeCatNameType }
     * 
     */
    public PayeeCatNameType createPayeeCatNameType() {
        return new PayeeCatNameType();
    }

    /**
     * Create an instance of {@link ExclNonActType }
     * 
     */
    public ExclNonActType createExclNonActType() {
        return new ExclNonActType();
    }

    /**
     * Create an instance of {@link IncDltType }
     * 
     */
    public IncDltType createIncDltType() {
        return new IncDltType();
    }

    /**
     * Create an instance of {@link CustomCType }
     * 
     */
    public CustomCType createCustomCType() {
        return new CustomCType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeOnlyType }
     * 
     */
    public ElecMerPayeeOnlyType createElecMerPayeeOnlyType() {
        return new ElecMerPayeeOnlyType();
    }

    /**
     * Create an instance of {@link StartDtType }
     * 
     */
    public StartDtType createStartDtType() {
        return new StartDtType();
    }

    /**
     * Create an instance of {@link EndDtType }
     * 
     */
    public EndDtType createEndDtType() {
        return new EndDtType();
    }

    /**
     * Create an instance of {@link CardPayFilterType }
     * 
     */
    public CardPayFilterType createCardPayFilterType() {
        return new CardPayFilterType();
    }

    /**
     * Create an instance of {@link SrchMsgRsHdrCType }
     * 
     */
    public SrchMsgRsHdrCType createSrchMsgRsHdrCType() {
        return new SrchMsgRsHdrCType();
    }

    /**
     * Create an instance of {@link SentRecType }
     * 
     */
    public SentRecType createSentRecType() {
        return new SentRecType();
    }

    /**
     * Create an instance of {@link MoreRecType }
     * 
     */
    public MoreRecType createMoreRecType() {
        return new MoreRecType();
    }

    /**
     * Create an instance of {@link TotRecType }
     * 
     */
    public TotRecType createTotRecType() {
        return new TotRecType();
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
     * Create an instance of {@link ErrCodeType }
     * 
     */
    public ErrCodeType createErrCodeType() {
        return new ErrCodeType();
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
     * Create an instance of {@link BilPayPayeeSrchArrayAType }
     * 
     */
    public BilPayPayeeSrchArrayAType createBilPayPayeeSrchArrayAType() {
        return new BilPayPayeeSrchArrayAType();
    }

    /**
     * Create an instance of {@link BilPayPayeeSrchInfoCType }
     * 
     */
    public BilPayPayeeSrchInfoCType createBilPayPayeeSrchInfoCType() {
        return new BilPayPayeeSrchInfoCType();
    }

    /**
     * Create an instance of {@link PayeeIdType }
     * 
     */
    public PayeeIdType createPayeeIdType() {
        return new PayeeIdType();
    }

    /**
     * Create an instance of {@link PayeeNameType }
     * 
     */
    public PayeeNameType createPayeeNameType() {
        return new PayeeNameType();
    }

    /**
     * Create an instance of {@link PayeeNicknameType }
     * 
     */
    public PayeeNicknameType createPayeeNicknameType() {
        return new PayeeNicknameType();
    }

    /**
     * Create an instance of {@link PayeeClsfType }
     * 
     */
    public PayeeClsfType createPayeeClsfType() {
        return new PayeeClsfType();
    }

    /**
     * Create an instance of {@link PmtMthdType }
     * 
     */
    public PmtMthdType createPmtMthdType() {
        return new PmtMthdType();
    }

    /**
     * Create an instance of {@link PayeeLastPdAmtType }
     * 
     */
    public PayeeLastPdAmtType createPayeeLastPdAmtType() {
        return new PayeeLastPdAmtType();
    }

    /**
     * Create an instance of {@link PayeeLastPdDtType }
     * 
     */
    public PayeeLastPdDtType createPayeeLastPdDtType() {
        return new PayeeLastPdDtType();
    }

    /**
     * Create an instance of {@link CanRushType }
     * 
     */
    public CanRushType createCanRushType() {
        return new CanRushType();
    }

    /**
     * Create an instance of {@link PayFromAcctInfoCType }
     * 
     */
    public PayFromAcctInfoCType createPayFromAcctInfoCType() {
        return new PayFromAcctInfoCType();
    }

    /**
     * Create an instance of {@link PayFromIdType }
     * 
     */
    public PayFromIdType createPayFromIdType() {
        return new PayFromIdType();
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
     * Create an instance of {@link PayFromAcctNameType }
     * 
     */
    public PayFromAcctNameType createPayFromAcctNameType() {
        return new PayFromAcctNameType();
    }

    /**
     * Create an instance of {@link PayFromAcctDftType }
     * 
     */
    public PayFromAcctDftType createPayFromAcctDftType() {
        return new PayFromAcctDftType();
    }

    /**
     * Create an instance of {@link ChkNumType }
     * 
     */
    public ChkNumType createChkNumType() {
        return new ChkNumType();
    }

    /**
     * Create an instance of {@link PayFromAcctStatType }
     * 
     */
    public PayFromAcctStatType createPayFromAcctStatType() {
        return new PayFromAcctStatType();
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
     * Create an instance of {@link StreetAddr1Type }
     * 
     */
    public StreetAddr1Type createStreetAddr1Type() {
        return new StreetAddr1Type();
    }

    /**
     * Create an instance of {@link StreetAddr2Type }
     * 
     */
    public StreetAddr2Type createStreetAddr2Type() {
        return new StreetAddr2Type();
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
     * Create an instance of {@link StateCodeType }
     * 
     */
    public StateCodeType createStateCodeType() {
        return new StateCodeType();
    }

    /**
     * Create an instance of {@link PostalCodeType }
     * 
     */
    public PostalCodeType createPostalCodeType() {
        return new PostalCodeType();
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
     * Create an instance of {@link CntryType }
     * 
     */
    public CntryType createCntryType() {
        return new CntryType();
    }

    /**
     * Create an instance of {@link CntryTypeType }
     * 
     */
    public CntryTypeType createCntryTypeType() {
        return new CntryTypeType();
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
     * Create an instance of {@link CardPayAcctInfoCType }
     * 
     */
    public CardPayAcctInfoCType createCardPayAcctInfoCType() {
        return new CardPayAcctInfoCType();
    }

    /**
     * Create an instance of {@link EmbosNameType }
     * 
     */
    public EmbosNameType createEmbosNameType() {
        return new EmbosNameType();
    }

    /**
     * Create an instance of {@link ExpDtType }
     * 
     */
    public ExpDtType createExpDtType() {
        return new ExpDtType();
    }

    /**
     * Create an instance of {@link CardSecCodeIdType }
     * 
     */
    public CardSecCodeIdType createCardSecCodeIdType() {
        return new CardSecCodeIdType();
    }

    /**
     * Create an instance of {@link PayeeStatType }
     * 
     */
    public PayeeStatType createPayeeStatType() {
        return new PayeeStatType();
    }

    /**
     * Create an instance of {@link ElecBilPayeeTypeType }
     * 
     */
    public ElecBilPayeeTypeType createElecBilPayeeTypeType() {
        return new ElecBilPayeeTypeType();
    }

    /**
     * Create an instance of {@link ElecBilAcctErrExistType }
     * 
     */
    public ElecBilAcctErrExistType createElecBilAcctErrExistType() {
        return new ElecBilAcctErrExistType();
    }

    /**
     * Create an instance of {@link FirstAvlProcDtType }
     * 
     */
    public FirstAvlProcDtType createFirstAvlProcDtType() {
        return new FirstAvlProcDtType();
    }

    /**
     * Create an instance of {@link FirstAvlEstArvDtType }
     * 
     */
    public FirstAvlEstArvDtType createFirstAvlEstArvDtType() {
        return new FirstAvlEstArvDtType();
    }

    /**
     * Create an instance of {@link PmtIntentTypeType }
     * 
     */
    public PmtIntentTypeType createPmtIntentTypeType() {
        return new PmtIntentTypeType();
    }

    /**
     * Create an instance of {@link SubMerAcctIdType }
     * 
     */
    public SubMerAcctIdType createSubMerAcctIdType() {
        return new SubMerAcctIdType();
    }

    /**
     * Create an instance of {@link RushOptArrayAType }
     * 
     */
    public RushOptArrayAType createRushOptArrayAType() {
        return new RushOptArrayAType();
    }

    /**
     * Create an instance of {@link RushOptInfoCType }
     * 
     */
    public RushOptInfoCType createRushOptInfoCType() {
        return new RushOptInfoCType();
    }

    /**
     * Create an instance of {@link RushOptType }
     * 
     */
    public RushOptType createRushOptType() {
        return new RushOptType();
    }

    /**
     * Create an instance of {@link RushOptFeeAmtType }
     * 
     */
    public RushOptFeeAmtType createRushOptFeeAmtType() {
        return new RushOptFeeAmtType();
    }

    /**
     * Create an instance of {@link RushOptSurChgType }
     * 
     */
    public RushOptSurChgType createRushOptSurChgType() {
        return new RushOptSurChgType();
    }

    /**
     * Create an instance of {@link LastMainDtType }
     * 
     */
    public LastMainDtType createLastMainDtType() {
        return new LastMainDtType();
    }

    /**
     * Create an instance of {@link Ver7CType }
     * 
     */
    public Ver7CType createVer7CType() {
        return new Ver7CType();
    }

    /**
     * Create an instance of {@link ElecBilPayeeCatTypeType }
     * 
     */
    public ElecBilPayeeCatTypeType createElecBilPayeeCatTypeType() {
        return new ElecBilPayeeCatTypeType();
    }

    /**
     * Create an instance of {@link Ver8CType }
     * 
     */
    public Ver8CType createVer8CType() {
        return new Ver8CType();
    }

    /**
     * Create an instance of {@link MsgRqHdrCType }
     * 
     */
    public MsgRqHdrCType createMsgRqHdrCType() {
        return new MsgRqHdrCType();
    }

    /**
     * Create an instance of {@link ActIntentType }
     * 
     */
    public ActIntentType createActIntentType() {
        return new ActIntentType();
    }

    /**
     * Create an instance of {@link IncXtendElemAType }
     * 
     */
    public IncXtendElemAType createIncXtendElemAType() {
        return new IncXtendElemAType();
    }

    /**
     * Create an instance of {@link IncXtendElemInfoCType }
     * 
     */
    public IncXtendElemInfoCType createIncXtendElemInfoCType() {
        return new IncXtendElemInfoCType();
    }

    /**
     * Create an instance of {@link XtendElemType }
     * 
     */
    public XtendElemType createXtendElemType() {
        return new XtendElemType();
    }

    /**
     * Create an instance of {@link MsgRsHdrCType }
     * 
     */
    public MsgRsHdrCType createMsgRsHdrCType() {
        return new MsgRsHdrCType();
    }

    /**
     * Create an instance of {@link BilPayPayeeInfoCType }
     * 
     */
    public BilPayPayeeInfoCType createBilPayPayeeInfoCType() {
        return new BilPayPayeeInfoCType();
    }

    /**
     * Create an instance of {@link PayeeAddrInfoArrayAType }
     * 
     */
    public PayeeAddrInfoArrayAType createPayeeAddrInfoArrayAType() {
        return new PayeeAddrInfoArrayAType();
    }

    /**
     * Create an instance of {@link PayeeAddrInfoCType }
     * 
     */
    public PayeeAddrInfoCType createPayeeAddrInfoCType() {
        return new PayeeAddrInfoCType();
    }

    /**
     * Create an instance of {@link PayeeAddrIdType }
     * 
     */
    public PayeeAddrIdType createPayeeAddrIdType() {
        return new PayeeAddrIdType();
    }

    /**
     * Create an instance of {@link PayeeAddrTypeType }
     * 
     */
    public PayeeAddrTypeType createPayeeAddrTypeType() {
        return new PayeeAddrTypeType();
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
     * Create an instance of {@link PayeeEmailSharedSecretType }
     * 
     */
    public PayeeEmailSharedSecretType createPayeeEmailSharedSecretType() {
        return new PayeeEmailSharedSecretType();
    }

    /**
     * Create an instance of {@link FIAcctInfoCType }
     * 
     */
    public FIAcctInfoCType createFIAcctInfoCType() {
        return new FIAcctInfoCType();
    }

    /**
     * Create an instance of {@link SubMerPayerNameType }
     * 
     */
    public SubMerPayerNameType createSubMerPayerNameType() {
        return new SubMerPayerNameType();
    }

    /**
     * Create an instance of {@link BilPaySvcFeeArrayAType }
     * 
     */
    public BilPaySvcFeeArrayAType createBilPaySvcFeeArrayAType() {
        return new BilPaySvcFeeArrayAType();
    }

    /**
     * Create an instance of {@link BilPaySvcFeeInfoRecCType }
     * 
     */
    public BilPaySvcFeeInfoRecCType createBilPaySvcFeeInfoRecCType() {
        return new BilPaySvcFeeInfoRecCType();
    }

    /**
     * Create an instance of {@link SvcFeeCodeType }
     * 
     */
    public SvcFeeCodeType createSvcFeeCodeType() {
        return new SvcFeeCodeType();
    }

    /**
     * Create an instance of {@link SvcFeeDescType }
     * 
     */
    public SvcFeeDescType createSvcFeeDescType() {
        return new SvcFeeDescType();
    }

    /**
     * Create an instance of {@link AmtType }
     * 
     */
    public AmtType createAmtType() {
        return new AmtType();
    }

    /**
     * Create an instance of {@link PayeeP2PTypeType }
     * 
     */
    public PayeeP2PTypeType createPayeeP2PTypeType() {
        return new PayeeP2PTypeType();
    }

    /**
     * Create an instance of {@link ActIntentKeyType }
     * 
     */
    public ActIntentKeyType createActIntentKeyType() {
        return new ActIntentKeyType();
    }

    /**
     * Create an instance of {@link SubModMerAcctIdType }
     * 
     */
    public SubModMerAcctIdType createSubModMerAcctIdType() {
        return new SubModMerAcctIdType();
    }

    /**
     * Create an instance of {@link XElecMerPayeeInfoCType }
     * 
     */
    public XElecMerPayeeInfoCType createXElecMerPayeeInfoCType() {
        return new XElecMerPayeeInfoCType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeInfoArrayAType }
     * 
     */
    public ElecMerPayeeInfoArrayAType createElecMerPayeeInfoArrayAType() {
        return new ElecMerPayeeInfoArrayAType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeInfoRecCType }
     * 
     */
    public ElecMerPayeeInfoRecCType createElecMerPayeeInfoRecCType() {
        return new ElecMerPayeeInfoRecCType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeURLType }
     * 
     */
    public ElecMerPayeeURLType createElecMerPayeeURLType() {
        return new ElecMerPayeeURLType();
    }

    /**
     * Create an instance of {@link ElecMerAcctTypeInfoArrayAType }
     * 
     */
    public ElecMerAcctTypeInfoArrayAType createElecMerAcctTypeInfoArrayAType() {
        return new ElecMerAcctTypeInfoArrayAType();
    }

    /**
     * Create an instance of {@link ElecMerAcctTypeInfoRecCType }
     * 
     */
    public ElecMerAcctTypeInfoRecCType createElecMerAcctTypeInfoRecCType() {
        return new ElecMerAcctTypeInfoRecCType();
    }

    /**
     * Create an instance of {@link AcctTypeDescType }
     * 
     */
    public AcctTypeDescType createAcctTypeDescType() {
        return new AcctTypeDescType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeToSStatType }
     * 
     */
    public ElecMerPayeeToSStatType createElecMerPayeeToSStatType() {
        return new ElecMerPayeeToSStatType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeToSType }
     * 
     */
    public ElecMerPayeeToSType createElecMerPayeeToSType() {
        return new ElecMerPayeeToSType();
    }

    /**
     * Create an instance of {@link ElecMerAcctStatType }
     * 
     */
    public ElecMerAcctStatType createElecMerAcctStatType() {
        return new ElecMerAcctStatType();
    }

    /**
     * Create an instance of {@link ElecMerSuspExpDtType }
     * 
     */
    public ElecMerSuspExpDtType createElecMerSuspExpDtType() {
        return new ElecMerSuspExpDtType();
    }

    /**
     * Create an instance of {@link ElecMerPendTerDtType }
     * 
     */
    public ElecMerPendTerDtType createElecMerPendTerDtType() {
        return new ElecMerPendTerDtType();
    }

    /**
     * Create an instance of {@link ElecMerAutoPmtAlwType }
     * 
     */
    public ElecMerAutoPmtAlwType createElecMerAutoPmtAlwType() {
        return new ElecMerAutoPmtAlwType();
    }

    /**
     * Create an instance of {@link ElecBilPmtAmtTypeType }
     * 
     */
    public ElecBilPmtAmtTypeType createElecBilPmtAmtTypeType() {
        return new ElecBilPmtAmtTypeType();
    }

    /**
     * Create an instance of {@link ElecBilPmtRuleAlgSymbType }
     * 
     */
    public ElecBilPmtRuleAlgSymbType createElecBilPmtRuleAlgSymbType() {
        return new ElecBilPmtRuleAlgSymbType();
    }

    /**
     * Create an instance of {@link PmtAmtType }
     * 
     */
    public PmtAmtType createPmtAmtType() {
        return new PmtAmtType();
    }

    /**
     * Create an instance of {@link ElecBilPmtInstrTypeType }
     * 
     */
    public ElecBilPmtInstrTypeType createElecBilPmtInstrTypeType() {
        return new ElecBilPmtInstrTypeType();
    }

    /**
     * Create an instance of {@link ElecMerAutoSuspTypeType }
     * 
     */
    public ElecMerAutoSuspTypeType createElecMerAutoSuspTypeType() {
        return new ElecMerAutoSuspTypeType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeCredInfoArrayAType }
     * 
     */
    public ElecMerPayeeCredInfoArrayAType createElecMerPayeeCredInfoArrayAType() {
        return new ElecMerPayeeCredInfoArrayAType();
    }

    /**
     * Create an instance of {@link ElecMerPayeeCredInfoRecCType }
     * 
     */
    public ElecMerPayeeCredInfoRecCType createElecMerPayeeCredInfoRecCType() {
        return new ElecMerPayeeCredInfoRecCType();
    }

    /**
     * Create an instance of {@link ElecMerCredTypeType }
     * 
     */
    public ElecMerCredTypeType createElecMerCredTypeType() {
        return new ElecMerCredTypeType();
    }

    /**
     * Create an instance of {@link ElecMerCredTypeDescType }
     * 
     */
    public ElecMerCredTypeDescType createElecMerCredTypeDescType() {
        return new ElecMerCredTypeDescType();
    }

    /**
     * Create an instance of {@link ElecMerCredValType }
     * 
     */
    public ElecMerCredValType createElecMerCredValType() {
        return new ElecMerCredValType();
    }

    /**
     * Create an instance of {@link VrblRegExType }
     * 
     */
    public VrblRegExType createVrblRegExType() {
        return new VrblRegExType();
    }

    /**
     * Create an instance of {@link ElecMerAcctErrInfoArrayAType }
     * 
     */
    public ElecMerAcctErrInfoArrayAType createElecMerAcctErrInfoArrayAType() {
        return new ElecMerAcctErrInfoArrayAType();
    }

    /**
     * Create an instance of {@link ElecMerAcctErrInfoRecCType }
     * 
     */
    public ElecMerAcctErrInfoRecCType createElecMerAcctErrInfoRecCType() {
        return new ElecMerAcctErrInfoRecCType();
    }

    /**
     * Create an instance of {@link AuthenQuesArrayAType }
     * 
     */
    public AuthenQuesArrayAType createAuthenQuesArrayAType() {
        return new AuthenQuesArrayAType();
    }

    /**
     * Create an instance of {@link AuthenQuesRecCType }
     * 
     */
    public AuthenQuesRecCType createAuthenQuesRecCType() {
        return new AuthenQuesRecCType();
    }

    /**
     * Create an instance of {@link AuthenQuesCodeType }
     * 
     */
    public AuthenQuesCodeType createAuthenQuesCodeType() {
        return new AuthenQuesCodeType();
    }

    /**
     * Create an instance of {@link AuthenQuesDescType }
     * 
     */
    public AuthenQuesDescType createAuthenQuesDescType() {
        return new AuthenQuesDescType();
    }

    /**
     * Create an instance of {@link AuthenAnswDescType }
     * 
     */
    public AuthenAnswDescType createAuthenAnswDescType() {
        return new AuthenAnswDescType();
    }

    /**
     * Create an instance of {@link AlwCardFundedTypeType }
     * 
     */
    public AlwCardFundedTypeType createAlwCardFundedTypeType() {
        return new AlwCardFundedTypeType();
    }

    /**
     * Create an instance of {@link XCardFundedPayeeArrayAType }
     * 
     */
    public XCardFundedPayeeArrayAType createXCardFundedPayeeArrayAType() {
        return new XCardFundedPayeeArrayAType();
    }

    /**
     * Create an instance of {@link CardFundedPayeeInfoCType }
     * 
     */
    public CardFundedPayeeInfoCType createCardFundedPayeeInfoCType() {
        return new CardFundedPayeeInfoCType();
    }

    /**
     * Create an instance of {@link WebPgURLType }
     * 
     */
    public WebPgURLType createWebPgURLType() {
        return new WebPgURLType();
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
     * Create an instance of {@link BusSvcTypeType }
     * 
     */
    public BusSvcTypeType createBusSvcTypeType() {
        return new BusSvcTypeType();
    }

    /**
     * Create an instance of {@link RsStatType }
     * 
     */
    public RsStatType createRsStatType() {
        return new RsStatType();
    }

    /**
     * Create an instance of {@link DltType }
     * 
     */
    public DltType createDltType() {
        return new DltType();
    }

    /**
     * Create an instance of {@link PayeeModIdType }
     * 
     */
    public PayeeModIdType createPayeeModIdType() {
        return new PayeeModIdType();
    }

    /**
     * Create an instance of {@link ElecMerAcctIdArrayAType }
     * 
     */
    public ElecMerAcctIdArrayAType createElecMerAcctIdArrayAType() {
        return new ElecMerAcctIdArrayAType();
    }

    /**
     * Create an instance of {@link ElecMerAcctIdInfoRecCType }
     * 
     */
    public ElecMerAcctIdInfoRecCType createElecMerAcctIdInfoRecCType() {
        return new ElecMerAcctIdInfoRecCType();
    }

    /**
     * Create an instance of {@link AliasAcctNameType }
     * 
     */
    public AliasAcctNameType createAliasAcctNameType() {
        return new AliasAcctNameType();
    }

    /**
     * Create an instance of {@link CurBalType }
     * 
     */
    public CurBalType createCurBalType() {
        return new CurBalType();
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
     * Create an instance of {@link PmtStatType }
     * 
     */
    public PmtStatType createPmtStatType() {
        return new PmtStatType();
    }

    /**
     * Create an instance of {@link P2PFilterType }
     * 
     */
    public P2PFilterType createP2PFilterType() {
        return new P2PFilterType();
    }

    /**
     * Create an instance of {@link RecurFilterType }
     * 
     */
    public RecurFilterType createRecurFilterType() {
        return new RecurFilterType();
    }

    /**
     * Create an instance of {@link XferFilterType }
     * 
     */
    public XferFilterType createXferFilterType() {
        return new XferFilterType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtSrchArrayAType }
     * 
     */
    public BilPaySchedPmtSrchArrayAType createBilPaySchedPmtSrchArrayAType() {
        return new BilPaySchedPmtSrchArrayAType();
    }

    /**
     * Create an instance of {@link BilPaySchedPmtSrchInfoCType }
     * 
     */
    public BilPaySchedPmtSrchInfoCType createBilPaySchedPmtSrchInfoCType() {
        return new BilPaySchedPmtSrchInfoCType();
    }

    /**
     * Create an instance of {@link PmtIdType }
     * 
     */
    public PmtIdType createPmtIdType() {
        return new PmtIdType();
    }

    /**
     * Create an instance of {@link PmtProcDtType }
     * 
     */
    public PmtProcDtType createPmtProcDtType() {
        return new PmtProcDtType();
    }

    /**
     * Create an instance of {@link PmtEstArvDtType }
     * 
     */
    public PmtEstArvDtType createPmtEstArvDtType() {
        return new PmtEstArvDtType();
    }

    /**
     * Create an instance of {@link PmtFreqUnitsType }
     * 
     */
    public PmtFreqUnitsType createPmtFreqUnitsType() {
        return new PmtFreqUnitsType();
    }

    /**
     * Create an instance of {@link P2PTypeType }
     * 
     */
    public P2PTypeType createP2PTypeType() {
        return new P2PTypeType();
    }

    /**
     * Create an instance of {@link ElecMerBilPmtType }
     * 
     */
    public ElecMerBilPmtType createElecMerBilPmtType() {
        return new ElecMerBilPmtType();
    }

    /**
     * Create an instance of {@link BilPayPmtInfoCType }
     * 
     */
    public BilPayPmtInfoCType createBilPayPmtInfoCType() {
        return new BilPayPmtInfoCType();
    }

    /**
     * Create an instance of {@link BilPayPmtPayeeInfoCType }
     * 
     */
    public BilPayPmtPayeeInfoCType createBilPayPmtPayeeInfoCType() {
        return new BilPayPmtPayeeInfoCType();
    }

    /**
     * Create an instance of {@link PmtCmntType }
     * 
     */
    public PmtCmntType createPmtCmntType() {
        return new PmtCmntType();
    }

    /**
     * Create an instance of {@link PmtChkMemoType }
     * 
     */
    public PmtChkMemoType createPmtChkMemoType() {
        return new PmtChkMemoType();
    }

    /**
     * Create an instance of {@link BilPayRecurPmtInfoCType }
     * 
     */
    public BilPayRecurPmtInfoCType createBilPayRecurPmtInfoCType() {
        return new BilPayRecurPmtInfoCType();
    }

    /**
     * Create an instance of {@link StartPmtProcDtType }
     * 
     */
    public StartPmtProcDtType createStartPmtProcDtType() {
        return new StartPmtProcDtType();
    }

    /**
     * Create an instance of {@link StartPmtEstArvDtType }
     * 
     */
    public StartPmtEstArvDtType createStartPmtEstArvDtType() {
        return new StartPmtEstArvDtType();
    }

    /**
     * Create an instance of {@link PmtDayOfWeekType }
     * 
     */
    public PmtDayOfWeekType createPmtDayOfWeekType() {
        return new PmtDayOfWeekType();
    }

    /**
     * Create an instance of {@link PmtDayInfoArrayAType }
     * 
     */
    public PmtDayInfoArrayAType createPmtDayInfoArrayAType() {
        return new PmtDayInfoArrayAType();
    }

    /**
     * Create an instance of {@link PmtDayInfoCType }
     * 
     */
    public PmtDayInfoCType createPmtDayInfoCType() {
        return new PmtDayInfoCType();
    }

    /**
     * Create an instance of {@link PmtDayOfMonthType }
     * 
     */
    public PmtDayOfMonthType createPmtDayOfMonthType() {
        return new PmtDayOfMonthType();
    }

    /**
     * Create an instance of {@link PmtUseLastBusDayType }
     * 
     */
    public PmtUseLastBusDayType createPmtUseLastBusDayType() {
        return new PmtUseLastBusDayType();
    }

    /**
     * Create an instance of {@link PayDtInstrType }
     * 
     */
    public PayDtInstrType createPayDtInstrType() {
        return new PayDtInstrType();
    }

    /**
     * Create an instance of {@link PmtOccurType }
     * 
     */
    public PmtOccurType createPmtOccurType() {
        return new PmtOccurType();
    }

    /**
     * Create an instance of {@link PmtSerExpDtType }
     * 
     */
    public PmtSerExpDtType createPmtSerExpDtType() {
        return new PmtSerExpDtType();
    }

    /**
     * Create an instance of {@link PmtSerFiniteType }
     * 
     */
    public PmtSerFiniteType createPmtSerFiniteType() {
        return new PmtSerFiniteType();
    }

    /**
     * Create an instance of {@link RetroToOrigPmtDtType }
     * 
     */
    public RetroToOrigPmtDtType createRetroToOrigPmtDtType() {
        return new RetroToOrigPmtDtType();
    }

    /**
     * Create an instance of {@link InvoiceInfoArrayAType }
     * 
     */
    public InvoiceInfoArrayAType createInvoiceInfoArrayAType() {
        return new InvoiceInfoArrayAType();
    }

    /**
     * Create an instance of {@link InvoiceInfoCType }
     * 
     */
    public InvoiceInfoCType createInvoiceInfoCType() {
        return new InvoiceInfoCType();
    }

    /**
     * Create an instance of {@link InvoiceIdType }
     * 
     */
    public InvoiceIdType createInvoiceIdType() {
        return new InvoiceIdType();
    }

    /**
     * Create an instance of {@link InvoiceNumType }
     * 
     */
    public InvoiceNumType createInvoiceNumType() {
        return new InvoiceNumType();
    }

    /**
     * Create an instance of {@link InvoiceCatType }
     * 
     */
    public InvoiceCatType createInvoiceCatType() {
        return new InvoiceCatType();
    }

    /**
     * Create an instance of {@link InvoiceDescType }
     * 
     */
    public InvoiceDescType createInvoiceDescType() {
        return new InvoiceDescType();
    }

    /**
     * Create an instance of {@link InvoiceAmtPosType }
     * 
     */
    public InvoiceAmtPosType createInvoiceAmtPosType() {
        return new InvoiceAmtPosType();
    }

    /**
     * Create an instance of {@link InvoiceAmtNegType }
     * 
     */
    public InvoiceAmtNegType createInvoiceAmtNegType() {
        return new InvoiceAmtNegType();
    }

    /**
     * Create an instance of {@link RmkType }
     * 
     */
    public RmkType createRmkType() {
        return new RmkType();
    }

    /**
     * Create an instance of {@link PmtCrtDtType }
     * 
     */
    public PmtCrtDtType createPmtCrtDtType() {
        return new PmtCrtDtType();
    }

    /**
     * Create an instance of {@link XFutPmtInfoArrayAType }
     * 
     */
    public XFutPmtInfoArrayAType createXFutPmtInfoArrayAType() {
        return new XFutPmtInfoArrayAType();
    }

    /**
     * Create an instance of {@link FutPmtInfoCType }
     * 
     */
    public FutPmtInfoCType createFutPmtInfoCType() {
        return new FutPmtInfoCType();
    }

    /**
     * Create an instance of {@link FutPmtOrigProcDtType }
     * 
     */
    public FutPmtOrigProcDtType createFutPmtOrigProcDtType() {
        return new FutPmtOrigProcDtType();
    }

    /**
     * Create an instance of {@link FutPmtModUsrIdType }
     * 
     */
    public FutPmtModUsrIdType createFutPmtModUsrIdType() {
        return new FutPmtModUsrIdType();
    }

    /**
     * Create an instance of {@link BilPayeeElecPmtInfoCType }
     * 
     */
    public BilPayeeElecPmtInfoCType createBilPayeeElecPmtInfoCType() {
        return new BilPayeeElecPmtInfoCType();
    }

    /**
     * Create an instance of {@link StmtDtType }
     * 
     */
    public StmtDtType createStmtDtType() {
        return new StmtDtType();
    }

    /**
     * Create an instance of {@link PmtDueDtType }
     * 
     */
    public PmtDueDtType createPmtDueDtType() {
        return new PmtDueDtType();
    }

    /**
     * Create an instance of {@link StmtBalType }
     * 
     */
    public StmtBalType createStmtBalType() {
        return new StmtBalType();
    }

    /**
     * Create an instance of {@link PmtAmtDueType }
     * 
     */
    public PmtAmtDueType createPmtAmtDueType() {
        return new PmtAmtDueType();
    }

    /**
     * Create an instance of {@link MinPmtAmtType }
     * 
     */
    public MinPmtAmtType createMinPmtAmtType() {
        return new MinPmtAmtType();
    }

    /**
     * Create an instance of {@link ElecBilPmtAutoType }
     * 
     */
    public ElecBilPmtAutoType createElecBilPmtAutoType() {
        return new ElecBilPmtAutoType();
    }

    /**
     * Create an instance of {@link SkipPmtOccurType }
     * 
     */
    public SkipPmtOccurType createSkipPmtOccurType() {
        return new SkipPmtOccurType();
    }

    /**
     * Create an instance of {@link BilPayPmtHistSrchArrayAType }
     * 
     */
    public BilPayPmtHistSrchArrayAType createBilPayPmtHistSrchArrayAType() {
        return new BilPayPmtHistSrchArrayAType();
    }

    /**
     * Create an instance of {@link BilPayPmtHistSrchInfoCType }
     * 
     */
    public BilPayPmtHistSrchInfoCType createBilPayPmtHistSrchInfoCType() {
        return new BilPayPmtHistSrchInfoCType();
    }

    /**
     * Create an instance of {@link IncChkImgType }
     * 
     */
    public IncChkImgType createIncChkImgType() {
        return new IncChkImgType();
    }

    /**
     * Create an instance of {@link XPmtStatHistArrayAType }
     * 
     */
    public XPmtStatHistArrayAType createXPmtStatHistArrayAType() {
        return new XPmtStatHistArrayAType();
    }

    /**
     * Create an instance of {@link PmtStatHistInfoCType }
     * 
     */
    public PmtStatHistInfoCType createPmtStatHistInfoCType() {
        return new PmtStatHistInfoCType();
    }

    /**
     * Create an instance of {@link PmtStatChngDtType }
     * 
     */
    public PmtStatChngDtType createPmtStatChngDtType() {
        return new PmtStatChngDtType();
    }

    /**
     * Create an instance of {@link PmtExcDescType }
     * 
     */
    public PmtExcDescType createPmtExcDescType() {
        return new PmtExcDescType();
    }

    /**
     * Create an instance of {@link PmtChngByType }
     * 
     */
    public PmtChngByType createPmtChngByType() {
        return new PmtChngByType();
    }

    /**
     * Create an instance of {@link XPmtChkStatHistArrayAType }
     * 
     */
    public XPmtChkStatHistArrayAType createXPmtChkStatHistArrayAType() {
        return new XPmtChkStatHistArrayAType();
    }

    /**
     * Create an instance of {@link PmtChkStatHistInfoCType }
     * 
     */
    public PmtChkStatHistInfoCType createPmtChkStatHistInfoCType() {
        return new PmtChkStatHistInfoCType();
    }

    /**
     * Create an instance of {@link PmtChkStatType }
     * 
     */
    public PmtChkStatType createPmtChkStatType() {
        return new PmtChkStatType();
    }

    /**
     * Create an instance of {@link PmtChkStatChngDtType }
     * 
     */
    public PmtChkStatChngDtType createPmtChkStatChngDtType() {
        return new PmtChkStatChngDtType();
    }

    /**
     * Create an instance of {@link XPmtChkTrakInfoCType }
     * 
     */
    public XPmtChkTrakInfoCType createXPmtChkTrakInfoCType() {
        return new XPmtChkTrakInfoCType();
    }

    /**
     * Create an instance of {@link PmtChkTrakCarrType }
     * 
     */
    public PmtChkTrakCarrType createPmtChkTrakCarrType() {
        return new PmtChkTrakCarrType();
    }

    /**
     * Create an instance of {@link PmtChkTrakIdType }
     * 
     */
    public PmtChkTrakIdType createPmtChkTrakIdType() {
        return new PmtChkTrakIdType();
    }

    /**
     * Create an instance of {@link PmtChkTrakArrayAType }
     * 
     */
    public PmtChkTrakArrayAType createPmtChkTrakArrayAType() {
        return new PmtChkTrakArrayAType();
    }

    /**
     * Create an instance of {@link PmtChkTrakRecInfoCType }
     * 
     */
    public PmtChkTrakRecInfoCType createPmtChkTrakRecInfoCType() {
        return new PmtChkTrakRecInfoCType();
    }

    /**
     * Create an instance of {@link PmtChkTrakDtType }
     * 
     */
    public PmtChkTrakDtType createPmtChkTrakDtType() {
        return new PmtChkTrakDtType();
    }

    /**
     * Create an instance of {@link PmtChkTrakLocType }
     * 
     */
    public PmtChkTrakLocType createPmtChkTrakLocType() {
        return new PmtChkTrakLocType();
    }

    /**
     * Create an instance of {@link PmtChkTrakStatType }
     * 
     */
    public PmtChkTrakStatType createPmtChkTrakStatType() {
        return new PmtChkTrakStatType();
    }

    /**
     * Create an instance of {@link PmtChkTrakCmntType }
     * 
     */
    public PmtChkTrakCmntType createPmtChkTrakCmntType() {
        return new PmtChkTrakCmntType();
    }

    /**
     * Create an instance of {@link PmtChkNumType }
     * 
     */
    public PmtChkNumType createPmtChkNumType() {
        return new PmtChkNumType();
    }

    /**
     * Create an instance of {@link PmtChkImgInfoCType }
     * 
     */
    public PmtChkImgInfoCType createPmtChkImgInfoCType() {
        return new PmtChkImgInfoCType();
    }

    /**
     * Create an instance of {@link ChkImgFormatType }
     * 
     */
    public ChkImgFormatType createChkImgFormatType() {
        return new ChkImgFormatType();
    }

    /**
     * Create an instance of {@link FrontChkImgLengthType }
     * 
     */
    public FrontChkImgLengthType createFrontChkImgLengthType() {
        return new FrontChkImgLengthType();
    }

    /**
     * Create an instance of {@link FrontChkImgType }
     * 
     */
    public FrontChkImgType createFrontChkImgType() {
        return new FrontChkImgType();
    }

    /**
     * Create an instance of {@link BackChkImgLengthType }
     * 
     */
    public BackChkImgLengthType createBackChkImgLengthType() {
        return new BackChkImgLengthType();
    }

    /**
     * Create an instance of {@link BackChkImgType }
     * 
     */
    public BackChkImgType createBackChkImgType() {
        return new BackChkImgType();
    }

    /**
     * Create an instance of {@link XElecBilPmtInfoCType }
     * 
     */
    public XElecBilPmtInfoCType createXElecBilPmtInfoCType() {
        return new XElecBilPmtInfoCType();
    }

    /**
     * Create an instance of {@link SrchAddrType }
     * 
     */
    public SrchAddrType createSrchAddrType() {
        return new SrchAddrType();
    }

    /**
     * Create an instance of {@link SrchCityType }
     * 
     */
    public SrchCityType createSrchCityType() {
        return new SrchCityType();
    }

    /**
     * Create an instance of {@link SubTypeType }
     * 
     */
    public SubTypeType createSubTypeType() {
        return new SubTypeType();
    }

    /**
     * Create an instance of {@link SubStatType }
     * 
     */
    public SubStatType createSubStatType() {
        return new SubStatType();
    }

    /**
     * Create an instance of {@link TaxIdType }
     * 
     */
    public TaxIdType createTaxIdType() {
        return new TaxIdType();
    }

    /**
     * Create an instance of {@link EFTCardNumType }
     * 
     */
    public EFTCardNumType createEFTCardNumType() {
        return new EFTCardNumType();
    }

    /**
     * Create an instance of {@link BilPaySubSrchArrayAType }
     * 
     */
    public BilPaySubSrchArrayAType createBilPaySubSrchArrayAType() {
        return new BilPaySubSrchArrayAType();
    }

    /**
     * Create an instance of {@link BilPaySubSrchInfoCType }
     * 
     */
    public BilPaySubSrchInfoCType createBilPaySubSrchInfoCType() {
        return new BilPaySubSrchInfoCType();
    }

    /**
     * Create an instance of {@link AcctTitleAType }
     * 
     */
    public AcctTitleAType createAcctTitleAType() {
        return new AcctTitleAType();
    }

    /**
     * Create an instance of {@link AcctTitleInfoCType }
     * 
     */
    public AcctTitleInfoCType createAcctTitleInfoCType() {
        return new AcctTitleInfoCType();
    }

    /**
     * Create an instance of {@link AcctTitleType }
     * 
     */
    public AcctTitleType createAcctTitleType() {
        return new AcctTitleType();
    }

    /**
     * Create an instance of {@link TINInfoCType }
     * 
     */
    public TINInfoCType createTINInfoCType() {
        return new TINInfoCType();
    }

    /**
     * Create an instance of {@link TINCodeType }
     * 
     */
    public TINCodeType createTINCodeType() {
        return new TINCodeType();
    }

    /**
     * Create an instance of {@link TINDescType }
     * 
     */
    public TINDescType createTINDescType() {
        return new TINDescType();
    }

    /**
     * Create an instance of {@link TaxIdModType }
     * 
     */
    public TaxIdModType createTaxIdModType() {
        return new TaxIdModType();
    }

    /**
     * Create an instance of {@link CertCodeType }
     * 
     */
    public CertCodeType createCertCodeType() {
        return new CertCodeType();
    }

    /**
     * Create an instance of {@link CertCodeDescType }
     * 
     */
    public CertCodeDescType createCertCodeDescType() {
        return new CertCodeDescType();
    }

    /**
     * Create an instance of {@link CertCodeDtType }
     * 
     */
    public CertCodeDtType createCertCodeDtType() {
        return new CertCodeDtType();
    }

    /**
     * Create an instance of {@link BNotStatType }
     * 
     */
    public BNotStatType createBNotStatType() {
        return new BNotStatType();
    }

    /**
     * Create an instance of {@link BNotIRSDtType }
     * 
     */
    public BNotIRSDtType createBNotIRSDtType() {
        return new BNotIRSDtType();
    }

    /**
     * Create an instance of {@link TINMatchTypeType }
     * 
     */
    public TINMatchTypeType createTINMatchTypeType() {
        return new TINMatchTypeType();
    }

    /**
     * Create an instance of {@link BirthDtType }
     * 
     */
    public BirthDtType createBirthDtType() {
        return new BirthDtType();
    }

    /**
     * Create an instance of {@link AddlNameStatType }
     * 
     */
    public AddlNameStatType createAddlNameStatType() {
        return new AddlNameStatType();
    }

    /**
     * Create an instance of {@link EnrollDtType }
     * 
     */
    public EnrollDtType createEnrollDtType() {
        return new EnrollDtType();
    }

    /**
     * Create an instance of {@link SubAssocUsrIdType }
     * 
     */
    public SubAssocUsrIdType createSubAssocUsrIdType() {
        return new SubAssocUsrIdType();
    }

    /**
     * Create an instance of {@link BilPaySubInfoCType }
     * 
     */
    public BilPaySubInfoCType createBilPaySubInfoCType() {
        return new BilPaySubInfoCType();
    }

    /**
     * Create an instance of {@link PayFromAcctInfoArrayAType }
     * 
     */
    public PayFromAcctInfoArrayAType createPayFromAcctInfoArrayAType() {
        return new PayFromAcctInfoArrayAType();
    }

    /**
     * Create an instance of {@link SubComIdType }
     * 
     */
    public SubComIdType createSubComIdType() {
        return new SubComIdType();
    }

    /**
     * Create an instance of {@link SubConsmCustIdType }
     * 
     */
    public SubConsmCustIdType createSubConsmCustIdType() {
        return new SubConsmCustIdType();
    }

    /**
     * Create an instance of {@link MktgOptInfoArrayAType }
     * 
     */
    public MktgOptInfoArrayAType createMktgOptInfoArrayAType() {
        return new MktgOptInfoArrayAType();
    }

    /**
     * Create an instance of {@link MktgOptInfoCType }
     * 
     */
    public MktgOptInfoCType createMktgOptInfoCType() {
        return new MktgOptInfoCType();
    }

    /**
     * Create an instance of {@link OptTypeType }
     * 
     */
    public OptTypeType createOptTypeType() {
        return new OptTypeType();
    }

    /**
     * Create an instance of {@link OptValType }
     * 
     */
    public OptValType createOptValType() {
        return new OptValType();
    }

    /**
     * Create an instance of {@link TempPswdType }
     * 
     */
    public TempPswdType createTempPswdType() {
        return new TempPswdType();
    }

    /**
     * Create an instance of {@link PmtApprvReqType }
     * 
     */
    public PmtApprvReqType createPmtApprvReqType() {
        return new PmtApprvReqType();
    }

    /**
     * Create an instance of {@link PswdChgFreqType }
     * 
     */
    public PswdChgFreqType createPswdChgFreqType() {
        return new PswdChgFreqType();
    }

    /**
     * Create an instance of {@link SubAssocUsrInfoArrayAType }
     * 
     */
    public SubAssocUsrInfoArrayAType createSubAssocUsrInfoArrayAType() {
        return new SubAssocUsrInfoArrayAType();
    }

    /**
     * Create an instance of {@link SubAssocUsrInfoCType }
     * 
     */
    public SubAssocUsrInfoCType createSubAssocUsrInfoCType() {
        return new SubAssocUsrInfoCType();
    }

    /**
     * Create an instance of {@link SubAssocUsrRoleType }
     * 
     */
    public SubAssocUsrRoleType createSubAssocUsrRoleType() {
        return new SubAssocUsrRoleType();
    }

    /**
     * Create an instance of {@link SubAssocUsrCmntType }
     * 
     */
    public SubAssocUsrCmntType createSubAssocUsrCmntType() {
        return new SubAssocUsrCmntType();
    }

    /**
     * Create an instance of {@link SubAssocUsrPerInfoArrayAType }
     * 
     */
    public SubAssocUsrPerInfoArrayAType createSubAssocUsrPerInfoArrayAType() {
        return new SubAssocUsrPerInfoArrayAType();
    }

    /**
     * Create an instance of {@link SubAssocUsrPerInfoCType }
     * 
     */
    public SubAssocUsrPerInfoCType createSubAssocUsrPerInfoCType() {
        return new SubAssocUsrPerInfoCType();
    }

    /**
     * Create an instance of {@link PerCodeType }
     * 
     */
    public PerCodeType createPerCodeType() {
        return new PerCodeType();
    }

    /**
     * Create an instance of {@link PerValueType }
     * 
     */
    public PerValueType createPerValueType() {
        return new PerValueType();
    }

    /**
     * Create an instance of {@link SubAssocUsrCapInfoArrayAType }
     * 
     */
    public SubAssocUsrCapInfoArrayAType createSubAssocUsrCapInfoArrayAType() {
        return new SubAssocUsrCapInfoArrayAType();
    }

    /**
     * Create an instance of {@link SubAssocUsrCapInfoCType }
     * 
     */
    public SubAssocUsrCapInfoCType createSubAssocUsrCapInfoCType() {
        return new SubAssocUsrCapInfoCType();
    }

    /**
     * Create an instance of {@link CapCodeType }
     * 
     */
    public CapCodeType createCapCodeType() {
        return new CapCodeType();
    }

    /**
     * Create an instance of {@link CapAssocPayeeIdType }
     * 
     */
    public CapAssocPayeeIdType createCapAssocPayeeIdType() {
        return new CapAssocPayeeIdType();
    }

    /**
     * Create an instance of {@link CapAmtType }
     * 
     */
    public CapAmtType createCapAmtType() {
        return new CapAmtType();
    }

    /**
     * Create an instance of {@link SubInActRsnTypeType }
     * 
     */
    public SubInActRsnTypeType createSubInActRsnTypeType() {
        return new SubInActRsnTypeType();
    }

    /**
     * Create an instance of {@link SubConsmCapArrayAType }
     * 
     */
    public SubConsmCapArrayAType createSubConsmCapArrayAType() {
        return new SubConsmCapArrayAType();
    }

    /**
     * Create an instance of {@link SubConsmCapInfoCType }
     * 
     */
    public SubConsmCapInfoCType createSubConsmCapInfoCType() {
        return new SubConsmCapInfoCType();
    }

    /**
     * Create an instance of {@link SubAssocUsrIdInfoArrayAType }
     * 
     */
    public SubAssocUsrIdInfoArrayAType createSubAssocUsrIdInfoArrayAType() {
        return new SubAssocUsrIdInfoArrayAType();
    }

    /**
     * Create an instance of {@link SubAssocUsrIdInfoCType }
     * 
     */
    public SubAssocUsrIdInfoCType createSubAssocUsrIdInfoCType() {
        return new SubAssocUsrIdInfoCType();
    }

    /**
     * Create an instance of {@link BilPayProdTypeType }
     * 
     */
    public BilPayProdTypeType createBilPayProdTypeType() {
        return new BilPayProdTypeType();
    }

    /**
     * Create an instance of {@link BilPayChanInfoCType }
     * 
     */
    public BilPayChanInfoCType createBilPayChanInfoCType() {
        return new BilPayChanInfoCType();
    }

    /**
     * Create an instance of {@link FinInstNameType }
     * 
     */
    public FinInstNameType createFinInstNameType() {
        return new FinInstNameType();
    }

    /**
     * Create an instance of {@link PmtCutoffTimeType }
     * 
     */
    public PmtCutoffTimeType createPmtCutoffTimeType() {
        return new PmtCutoffTimeType();
    }

    /**
     * Create an instance of {@link StorMosType }
     * 
     */
    public StorMosType createStorMosType() {
        return new StorMosType();
    }

    /**
     * Create an instance of {@link ChkImgStorMosType }
     * 
     */
    public ChkImgStorMosType createChkImgStorMosType() {
        return new ChkImgStorMosType();
    }

    /**
     * Create an instance of {@link ChkFundModelType }
     * 
     */
    public ChkFundModelType createChkFundModelType() {
        return new ChkFundModelType();
    }

    /**
     * Create an instance of {@link FundVerifType }
     * 
     */
    public FundVerifType createFundVerifType() {
        return new FundVerifType();
    }

    /**
     * Create an instance of {@link NonProcDtInfoArrayAType }
     * 
     */
    public NonProcDtInfoArrayAType createNonProcDtInfoArrayAType() {
        return new NonProcDtInfoArrayAType();
    }

    /**
     * Create an instance of {@link NonProcDtInfoCType }
     * 
     */
    public NonProcDtInfoCType createNonProcDtInfoCType() {
        return new NonProcDtInfoCType();
    }

    /**
     * Create an instance of {@link NonProcDtType }
     * 
     */
    public NonProcDtType createNonProcDtType() {
        return new NonProcDtType();
    }

    /**
     * Create an instance of {@link BilPayProdTypeInfoArrayAType }
     * 
     */
    public BilPayProdTypeInfoArrayAType createBilPayProdTypeInfoArrayAType() {
        return new BilPayProdTypeInfoArrayAType();
    }

    /**
     * Create an instance of {@link BilPayProdTypeInfoCType }
     * 
     */
    public BilPayProdTypeInfoCType createBilPayProdTypeInfoCType() {
        return new BilPayProdTypeInfoCType();
    }

    /**
     * Create an instance of {@link PmtDtModelType }
     * 
     */
    public PmtDtModelType createPmtDtModelType() {
        return new PmtDtModelType();
    }

    /**
     * Create an instance of {@link MaxPmtAmtType }
     * 
     */
    public MaxPmtAmtType createMaxPmtAmtType() {
        return new MaxPmtAmtType();
    }

    /**
     * Create an instance of {@link MaxEmailPmtAmtType }
     * 
     */
    public MaxEmailPmtAmtType createMaxEmailPmtAmtType() {
        return new MaxEmailPmtAmtType();
    }

    /**
     * Create an instance of {@link MaxEmailDlyAmtType }
     * 
     */
    public MaxEmailDlyAmtType createMaxEmailDlyAmtType() {
        return new MaxEmailDlyAmtType();
    }

    /**
     * Create an instance of {@link AlwSecdPersonType }
     * 
     */
    public AlwSecdPersonType createAlwSecdPersonType() {
        return new AlwSecdPersonType();
    }

    /**
     * Create an instance of {@link AlwAddPayFromAcctType }
     * 
     */
    public AlwAddPayFromAcctType createAlwAddPayFromAcctType() {
        return new AlwAddPayFromAcctType();
    }

    /**
     * Create an instance of {@link BilPayFeturInfoArrayAType }
     * 
     */
    public BilPayFeturInfoArrayAType createBilPayFeturInfoArrayAType() {
        return new BilPayFeturInfoArrayAType();
    }

    /**
     * Create an instance of {@link BilPayFeturInfoCType }
     * 
     */
    public BilPayFeturInfoCType createBilPayFeturInfoCType() {
        return new BilPayFeturInfoCType();
    }

    /**
     * Create an instance of {@link FeturTypeType }
     * 
     */
    public FeturTypeType createFeturTypeType() {
        return new FeturTypeType();
    }

    /**
     * Create an instance of {@link FeturActType }
     * 
     */
    public FeturActType createFeturActType() {
        return new FeturActType();
    }

    /**
     * Create an instance of {@link SubTypeAccessFeturInfoArrayAType }
     * 
     */
    public SubTypeAccessFeturInfoArrayAType createSubTypeAccessFeturInfoArrayAType() {
        return new SubTypeAccessFeturInfoArrayAType();
    }

    /**
     * Create an instance of {@link SubTypeAccessFeturInfoCType }
     * 
     */
    public SubTypeAccessFeturInfoCType createSubTypeAccessFeturInfoCType() {
        return new SubTypeAccessFeturInfoCType();
    }

    /**
     * Create an instance of {@link DlyElecRiskLmtType }
     * 
     */
    public DlyElecRiskLmtType createDlyElecRiskLmtType() {
        return new DlyElecRiskLmtType();
    }

    /**
     * Create an instance of {@link MthlyElecRiskLmtType }
     * 
     */
    public MthlyElecRiskLmtType createMthlyElecRiskLmtType() {
        return new MthlyElecRiskLmtType();
    }

    /**
     * Create an instance of {@link TaxIdReqType }
     * 
     */
    public TaxIdReqType createTaxIdReqType() {
        return new TaxIdReqType();
    }

    /**
     * Create an instance of {@link CanSetStartChkNumType }
     * 
     */
    public CanSetStartChkNumType createCanSetStartChkNumType() {
        return new CanSetStartChkNumType();
    }

    /**
     * Create an instance of {@link CanPayFromSavAcctType }
     * 
     */
    public CanPayFromSavAcctType createCanPayFromSavAcctType() {
        return new CanPayFromSavAcctType();
    }

    /**
     * Create an instance of {@link DualSignOnReqType }
     * 
     */
    public DualSignOnReqType createDualSignOnReqType() {
        return new DualSignOnReqType();
    }

    /**
     * Create an instance of {@link SubLogInIdRstrCType }
     * 
     */
    public SubLogInIdRstrCType createSubLogInIdRstrCType() {
        return new SubLogInIdRstrCType();
    }

    /**
     * Create an instance of {@link MinLenCharValType }
     * 
     */
    public MinLenCharValType createMinLenCharValType() {
        return new MinLenCharValType();
    }

    /**
     * Create an instance of {@link MaxLenCharValType }
     * 
     */
    public MaxLenCharValType createMaxLenCharValType() {
        return new MaxLenCharValType();
    }

    /**
     * Create an instance of {@link MinAlphaCharValType }
     * 
     */
    public MinAlphaCharValType createMinAlphaCharValType() {
        return new MinAlphaCharValType();
    }

    /**
     * Create an instance of {@link MinNumCharValType }
     * 
     */
    public MinNumCharValType createMinNumCharValType() {
        return new MinNumCharValType();
    }

    /**
     * Create an instance of {@link MinSpecCharValType }
     * 
     */
    public MinSpecCharValType createMinSpecCharValType() {
        return new MinSpecCharValType();
    }

    /**
     * Create an instance of {@link MinLowCaseValType }
     * 
     */
    public MinLowCaseValType createMinLowCaseValType() {
        return new MinLowCaseValType();
    }

    /**
     * Create an instance of {@link MinUpCaseValType }
     * 
     */
    public MinUpCaseValType createMinUpCaseValType() {
        return new MinUpCaseValType();
    }

    /**
     * Create an instance of {@link SpecCharRstrArrayAType }
     * 
     */
    public SpecCharRstrArrayAType createSpecCharRstrArrayAType() {
        return new SpecCharRstrArrayAType();
    }

    /**
     * Create an instance of {@link SpecCharRstrRecCType }
     * 
     */
    public SpecCharRstrRecCType createSpecCharRstrRecCType() {
        return new SpecCharRstrRecCType();
    }

    /**
     * Create an instance of {@link SpecCharRstrTypeType }
     * 
     */
    public SpecCharRstrTypeType createSpecCharRstrTypeType() {
        return new SpecCharRstrTypeType();
    }

    /**
     * Create an instance of {@link CanAddPayFromOwnInfoType }
     * 
     */
    public CanAddPayFromOwnInfoType createCanAddPayFromOwnInfoType() {
        return new CanAddPayFromOwnInfoType();
    }

    /**
     * Create an instance of {@link ConsmOwnSubUsrPerType }
     * 
     */
    public ConsmOwnSubUsrPerType createConsmOwnSubUsrPerType() {
        return new ConsmOwnSubUsrPerType();
    }

    /**
     * Create an instance of {@link AlwSubAssocUsrMgmtOptInfoArrayAType }
     * 
     */
    public AlwSubAssocUsrMgmtOptInfoArrayAType createAlwSubAssocUsrMgmtOptInfoArrayAType() {
        return new AlwSubAssocUsrMgmtOptInfoArrayAType();
    }

    /**
     * Create an instance of {@link AlwSubAssocUsrMgmtOptInfoCType }
     * 
     */
    public AlwSubAssocUsrMgmtOptInfoCType createAlwSubAssocUsrMgmtOptInfoCType() {
        return new AlwSubAssocUsrMgmtOptInfoCType();
    }

    /**
     * Create an instance of {@link AlwSubAssocUsrMgmtOptType }
     * 
     */
    public AlwSubAssocUsrMgmtOptType createAlwSubAssocUsrMgmtOptType() {
        return new AlwSubAssocUsrMgmtOptType();
    }

    /**
     * Create an instance of {@link HidSubAssocUsrConsmCustIdType }
     * 
     */
    public HidSubAssocUsrConsmCustIdType createHidSubAssocUsrConsmCustIdType() {
        return new HidSubAssocUsrConsmCustIdType();
    }

    /**
     * Create an instance of {@link HidSubAssocUsrSubComIdType }
     * 
     */
    public HidSubAssocUsrSubComIdType createHidSubAssocUsrSubComIdType() {
        return new HidSubAssocUsrSubComIdType();
    }

    /**
     * Create an instance of {@link AlwSubTypeType }
     * 
     */
    public AlwSubTypeType createAlwSubTypeType() {
        return new AlwSubTypeType();
    }

    /**
     * Create an instance of {@link MaxIndvPmtAmtType }
     * 
     */
    public MaxIndvPmtAmtType createMaxIndvPmtAmtType() {
        return new MaxIndvPmtAmtType();
    }

    /**
     * Create an instance of {@link MaxIndvDlyAmtType }
     * 
     */
    public MaxIndvDlyAmtType createMaxIndvDlyAmtType() {
        return new MaxIndvDlyAmtType();
    }

    /**
     * Create an instance of {@link AvlCardBINArrayAType }
     * 
     */
    public AvlCardBINArrayAType createAvlCardBINArrayAType() {
        return new AvlCardBINArrayAType();
    }

    /**
     * Create an instance of {@link AvlCardBINInfoCType }
     * 
     */
    public AvlCardBINInfoCType createAvlCardBINInfoCType() {
        return new AvlCardBINInfoCType();
    }

    /**
     * Create an instance of {@link EFTCardBINType }
     * 
     */
    public EFTCardBINType createEFTCardBINType() {
        return new EFTCardBINType();
    }

    /**
     * Create an instance of {@link Ver9CType }
     * 
     */
    public Ver9CType createVer9CType() {
        return new Ver9CType();
    }

    /**
     * Create an instance of {@link ElecBilStatType }
     * 
     */
    public ElecBilStatType createElecBilStatType() {
        return new ElecBilStatType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedSrchArrayAType }
     * 
     */
    public BilPayElecBilSchedSrchArrayAType createBilPayElecBilSchedSrchArrayAType() {
        return new BilPayElecBilSchedSrchArrayAType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedSrchInfoCType }
     * 
     */
    public BilPayElecBilSchedSrchInfoCType createBilPayElecBilSchedSrchInfoCType() {
        return new BilPayElecBilSchedSrchInfoCType();
    }

    /**
     * Create an instance of {@link ElecBilIdType }
     * 
     */
    public ElecBilIdType createElecBilIdType() {
        return new ElecBilIdType();
    }

    /**
     * Create an instance of {@link MobDevTypeType }
     * 
     */
    public MobDevTypeType createMobDevTypeType() {
        return new MobDevTypeType();
    }

    /**
     * Create an instance of {@link MobDevResoTypeType }
     * 
     */
    public MobDevResoTypeType createMobDevResoTypeType() {
        return new MobDevResoTypeType();
    }

    /**
     * Create an instance of {@link OrientationType }
     * 
     */
    public OrientationType createOrientationType() {
        return new OrientationType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedInqInfoCType }
     * 
     */
    public BilPayElecBilSchedInqInfoCType createBilPayElecBilSchedInqInfoCType() {
        return new BilPayElecBilSchedInqInfoCType();
    }

    /**
     * Create an instance of {@link ElecBilPmtMthdType }
     * 
     */
    public ElecBilPmtMthdType createElecBilPmtMthdType() {
        return new ElecBilPmtMthdType();
    }

    /**
     * Create an instance of {@link WebPgTokenType }
     * 
     */
    public WebPgTokenType createWebPgTokenType() {
        return new WebPgTokenType();
    }

    /**
     * Create an instance of {@link TokenExpTimeDtType }
     * 
     */
    public TokenExpTimeDtType createTokenExpTimeDtType() {
        return new TokenExpTimeDtType();
    }

    /**
     * Create an instance of {@link BilPayElecBilSchedModInfoCType }
     * 
     */
    public BilPayElecBilSchedModInfoCType createBilPayElecBilSchedModInfoCType() {
        return new BilPayElecBilSchedModInfoCType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeSrchRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeSrch")
    public JAXBElement<BilPayPayeeSrchRqMType> createBilPayPayeeSrch(BilPayPayeeSrchRqMType value) {
        return new JAXBElement<BilPayPayeeSrchRqMType>(_BilPayPayeeSrch_QNAME, BilPayPayeeSrchRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeSrchRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeSrchResponse")
    public JAXBElement<BilPayPayeeSrchRsMType> createBilPayPayeeSrchResponse(BilPayPayeeSrchRsMType value) {
        return new JAXBElement<BilPayPayeeSrchRsMType>(_BilPayPayeeSrchResponse_QNAME, BilPayPayeeSrchRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeInqRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeInq")
    public JAXBElement<BilPayPayeeInqRqMType> createBilPayPayeeInq(BilPayPayeeInqRqMType value) {
        return new JAXBElement<BilPayPayeeInqRqMType>(_BilPayPayeeInq_QNAME, BilPayPayeeInqRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeInqRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeInqResponse")
    public JAXBElement<BilPayPayeeInqRsMType> createBilPayPayeeInqResponse(BilPayPayeeInqRsMType value) {
        return new JAXBElement<BilPayPayeeInqRsMType>(_BilPayPayeeInqResponse_QNAME, BilPayPayeeInqRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeAdd")
    public JAXBElement<BilPayPayeeAddRqMType> createBilPayPayeeAdd(BilPayPayeeAddRqMType value) {
        return new JAXBElement<BilPayPayeeAddRqMType>(_BilPayPayeeAdd_QNAME, BilPayPayeeAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeAddResponse")
    public JAXBElement<BilPayPayeeAddRsMType> createBilPayPayeeAddResponse(BilPayPayeeAddRsMType value) {
        return new JAXBElement<BilPayPayeeAddRsMType>(_BilPayPayeeAddResponse_QNAME, BilPayPayeeAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeMod")
    public JAXBElement<BilPayPayeeModRqMType> createBilPayPayeeMod(BilPayPayeeModRqMType value) {
        return new JAXBElement<BilPayPayeeModRqMType>(_BilPayPayeeMod_QNAME, BilPayPayeeModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeModResponse")
    public JAXBElement<BilPayPayeeModRsMType> createBilPayPayeeModResponse(BilPayPayeeModRsMType value) {
        return new JAXBElement<BilPayPayeeModRsMType>(_BilPayPayeeModResponse_QNAME, BilPayPayeeModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtSrchRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtSrch")
    public JAXBElement<BilPaySchedPmtSrchRqMType> createBilPaySchedPmtSrch(BilPaySchedPmtSrchRqMType value) {
        return new JAXBElement<BilPaySchedPmtSrchRqMType>(_BilPaySchedPmtSrch_QNAME, BilPaySchedPmtSrchRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtSrchRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtSrchResponse")
    public JAXBElement<BilPaySchedPmtSrchRsMType> createBilPaySchedPmtSrchResponse(BilPaySchedPmtSrchRsMType value) {
        return new JAXBElement<BilPaySchedPmtSrchRsMType>(_BilPaySchedPmtSrchResponse_QNAME, BilPaySchedPmtSrchRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtInqRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtInq")
    public JAXBElement<BilPaySchedPmtInqRqMType> createBilPaySchedPmtInq(BilPaySchedPmtInqRqMType value) {
        return new JAXBElement<BilPaySchedPmtInqRqMType>(_BilPaySchedPmtInq_QNAME, BilPaySchedPmtInqRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtInqRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtInqResponse")
    public JAXBElement<BilPaySchedPmtInqRsMType> createBilPaySchedPmtInqResponse(BilPaySchedPmtInqRsMType value) {
        return new JAXBElement<BilPaySchedPmtInqRsMType>(_BilPaySchedPmtInqResponse_QNAME, BilPaySchedPmtInqRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtAdd")
    public JAXBElement<BilPaySchedPmtAddRqMType> createBilPaySchedPmtAdd(BilPaySchedPmtAddRqMType value) {
        return new JAXBElement<BilPaySchedPmtAddRqMType>(_BilPaySchedPmtAdd_QNAME, BilPaySchedPmtAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtAddResponse")
    public JAXBElement<BilPaySchedPmtAddRsMType> createBilPaySchedPmtAddResponse(BilPaySchedPmtAddRsMType value) {
        return new JAXBElement<BilPaySchedPmtAddRsMType>(_BilPaySchedPmtAddResponse_QNAME, BilPaySchedPmtAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtMod")
    public JAXBElement<BilPaySchedPmtModRqMType> createBilPaySchedPmtMod(BilPaySchedPmtModRqMType value) {
        return new JAXBElement<BilPaySchedPmtModRqMType>(_BilPaySchedPmtMod_QNAME, BilPaySchedPmtModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtModResponse")
    public JAXBElement<BilPaySchedPmtModRsMType> createBilPaySchedPmtModResponse(BilPaySchedPmtModRsMType value) {
        return new JAXBElement<BilPaySchedPmtModRsMType>(_BilPaySchedPmtModResponse_QNAME, BilPaySchedPmtModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtApprvRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtApprv")
    public JAXBElement<BilPaySchedPmtApprvRqMType> createBilPaySchedPmtApprv(BilPaySchedPmtApprvRqMType value) {
        return new JAXBElement<BilPaySchedPmtApprvRqMType>(_BilPaySchedPmtApprv_QNAME, BilPaySchedPmtApprvRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtApprvRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtApprvResponse")
    public JAXBElement<BilPaySchedPmtApprvRsMType> createBilPaySchedPmtApprvResponse(BilPaySchedPmtApprvRsMType value) {
        return new JAXBElement<BilPaySchedPmtApprvRsMType>(_BilPaySchedPmtApprvResponse_QNAME, BilPaySchedPmtApprvRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtHistSrchRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPmtHistSrch")
    public JAXBElement<BilPayPmtHistSrchRqMType> createBilPayPmtHistSrch(BilPayPmtHistSrchRqMType value) {
        return new JAXBElement<BilPayPmtHistSrchRqMType>(_BilPayPmtHistSrch_QNAME, BilPayPmtHistSrchRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtHistSrchRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPmtHistSrchResponse")
    public JAXBElement<BilPayPmtHistSrchRsMType> createBilPayPmtHistSrchResponse(BilPayPmtHistSrchRsMType value) {
        return new JAXBElement<BilPayPmtHistSrchRsMType>(_BilPayPmtHistSrchResponse_QNAME, BilPayPmtHistSrchRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtHistInqRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPmtHistInq")
    public JAXBElement<BilPayPmtHistInqRqMType> createBilPayPmtHistInq(BilPayPmtHistInqRqMType value) {
        return new JAXBElement<BilPayPmtHistInqRqMType>(_BilPayPmtHistInq_QNAME, BilPayPmtHistInqRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtHistInqRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPmtHistInqResponse")
    public JAXBElement<BilPayPmtHistInqRsMType> createBilPayPmtHistInqResponse(BilPayPmtHistInqRsMType value) {
        return new JAXBElement<BilPayPmtHistInqRsMType>(_BilPayPmtHistInqResponse_QNAME, BilPayPmtHistInqRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubSrchRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubSrch")
    public JAXBElement<BilPaySubSrchRqMType> createBilPaySubSrch(BilPaySubSrchRqMType value) {
        return new JAXBElement<BilPaySubSrchRqMType>(_BilPaySubSrch_QNAME, BilPaySubSrchRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubSrchRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubSrchResponse")
    public JAXBElement<BilPaySubSrchRsMType> createBilPaySubSrchResponse(BilPaySubSrchRsMType value) {
        return new JAXBElement<BilPaySubSrchRsMType>(_BilPaySubSrchResponse_QNAME, BilPaySubSrchRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubInqRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubInq")
    public JAXBElement<BilPaySubInqRqMType> createBilPaySubInq(BilPaySubInqRqMType value) {
        return new JAXBElement<BilPaySubInqRqMType>(_BilPaySubInq_QNAME, BilPaySubInqRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubInqRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubInqResponse")
    public JAXBElement<BilPaySubInqRsMType> createBilPaySubInqResponse(BilPaySubInqRsMType value) {
        return new JAXBElement<BilPaySubInqRsMType>(_BilPaySubInqResponse_QNAME, BilPaySubInqRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubAddRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubAdd")
    public JAXBElement<BilPaySubAddRqMType> createBilPaySubAdd(BilPaySubAddRqMType value) {
        return new JAXBElement<BilPaySubAddRqMType>(_BilPaySubAdd_QNAME, BilPaySubAddRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubAddRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubAddResponse")
    public JAXBElement<BilPaySubAddRsMType> createBilPaySubAddResponse(BilPaySubAddRsMType value) {
        return new JAXBElement<BilPaySubAddRsMType>(_BilPaySubAddResponse_QNAME, BilPaySubAddRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubMod")
    public JAXBElement<BilPaySubModRqMType> createBilPaySubMod(BilPaySubModRqMType value) {
        return new JAXBElement<BilPaySubModRqMType>(_BilPaySubMod_QNAME, BilPaySubModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubModResponse")
    public JAXBElement<BilPaySubModRsMType> createBilPaySubModResponse(BilPaySubModRsMType value) {
        return new JAXBElement<BilPaySubModRsMType>(_BilPaySubModResponse_QNAME, BilPaySubModRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubConsmCustInqRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubConsmCustInq")
    public JAXBElement<BilPaySubConsmCustInqRqMType> createBilPaySubConsmCustInq(BilPaySubConsmCustInqRqMType value) {
        return new JAXBElement<BilPaySubConsmCustInqRqMType>(_BilPaySubConsmCustInq_QNAME, BilPaySubConsmCustInqRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubConsmCustInqRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubConsmCustInqResponse")
    public JAXBElement<BilPaySubConsmCustInqRsMType> createBilPaySubConsmCustInqResponse(BilPaySubConsmCustInqRsMType value) {
        return new JAXBElement<BilPaySubConsmCustInqRsMType>(_BilPaySubConsmCustInqResponse_QNAME, BilPaySubConsmCustInqRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayChanInqRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayChanInq")
    public JAXBElement<BilPayChanInqRqMType> createBilPayChanInq(BilPayChanInqRqMType value) {
        return new JAXBElement<BilPayChanInqRqMType>(_BilPayChanInq_QNAME, BilPayChanInqRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayChanInqRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayChanInqResponse")
    public JAXBElement<BilPayChanInqRsMType> createBilPayChanInqResponse(BilPayChanInqRsMType value) {
        return new JAXBElement<BilPayChanInqRsMType>(_BilPayChanInqResponse_QNAME, BilPayChanInqRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedSrchRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedSrch")
    public JAXBElement<BilPayElecBilSchedSrchRqMType> createBilPayElecBilSchedSrch(BilPayElecBilSchedSrchRqMType value) {
        return new JAXBElement<BilPayElecBilSchedSrchRqMType>(_BilPayElecBilSchedSrch_QNAME, BilPayElecBilSchedSrchRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedSrchRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedSrchResponse")
    public JAXBElement<BilPayElecBilSchedSrchRsMType> createBilPayElecBilSchedSrchResponse(BilPayElecBilSchedSrchRsMType value) {
        return new JAXBElement<BilPayElecBilSchedSrchRsMType>(_BilPayElecBilSchedSrchResponse_QNAME, BilPayElecBilSchedSrchRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedInqRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedInq")
    public JAXBElement<BilPayElecBilSchedInqRqMType> createBilPayElecBilSchedInq(BilPayElecBilSchedInqRqMType value) {
        return new JAXBElement<BilPayElecBilSchedInqRqMType>(_BilPayElecBilSchedInq_QNAME, BilPayElecBilSchedInqRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedInqRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedInqResponse")
    public JAXBElement<BilPayElecBilSchedInqRsMType> createBilPayElecBilSchedInqResponse(BilPayElecBilSchedInqRsMType value) {
        return new JAXBElement<BilPayElecBilSchedInqRsMType>(_BilPayElecBilSchedInqResponse_QNAME, BilPayElecBilSchedInqRsMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedModRqMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedMod")
    public JAXBElement<BilPayElecBilSchedModRqMType> createBilPayElecBilSchedMod(BilPayElecBilSchedModRqMType value) {
        return new JAXBElement<BilPayElecBilSchedModRqMType>(_BilPayElecBilSchedMod_QNAME, BilPayElecBilSchedModRqMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedModRsMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedModResponse")
    public JAXBElement<BilPayElecBilSchedModRsMType> createBilPayElecBilSchedModResponse(BilPayElecBilSchedModRsMType value) {
        return new JAXBElement<BilPayElecBilSchedModRsMType>(_BilPayElecBilSchedModResponse_QNAME, BilPayElecBilSchedModRsMType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TINCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TINCode", scope = TINInfoCType.class)
    public JAXBElement<TINCodeType> createTINInfoCTypeTINCode(TINCodeType value) {
        return new JAXBElement<TINCodeType>(_TINInfoCTypeTINCode_QNAME, TINCodeType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TINDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TINDesc", scope = TINInfoCType.class)
    public JAXBElement<TINDescType> createTINInfoCTypeTINDesc(TINDescType value) {
        return new JAXBElement<TINDescType>(_TINInfoCTypeTINDesc_QNAME, TINDescType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TaxId", scope = TINInfoCType.class)
    public JAXBElement<TaxIdType> createTINInfoCTypeTaxId(TaxIdType value) {
        return new JAXBElement<TaxIdType>(_TINInfoCTypeTaxId_QNAME, TaxIdType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxIdModType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TaxIdMod", scope = TINInfoCType.class)
    public JAXBElement<TaxIdModType> createTINInfoCTypeTaxIdMod(TaxIdModType value) {
        return new JAXBElement<TaxIdModType>(_TINInfoCTypeTaxIdMod_QNAME, TaxIdModType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CertCode", scope = TINInfoCType.class)
    public JAXBElement<CertCodeType> createTINInfoCTypeCertCode(CertCodeType value) {
        return new JAXBElement<CertCodeType>(_TINInfoCTypeCertCode_QNAME, CertCodeType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertCodeDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CertCodeDesc", scope = TINInfoCType.class)
    public JAXBElement<CertCodeDescType> createTINInfoCTypeCertCodeDesc(CertCodeDescType value) {
        return new JAXBElement<CertCodeDescType>(_TINInfoCTypeCertCodeDesc_QNAME, CertCodeDescType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertCodeDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CertCodeDt", scope = TINInfoCType.class)
    public JAXBElement<CertCodeDtType> createTINInfoCTypeCertCodeDt(CertCodeDtType value) {
        return new JAXBElement<CertCodeDtType>(_TINInfoCTypeCertCodeDt_QNAME, CertCodeDtType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BNotStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BNotStat", scope = TINInfoCType.class)
    public JAXBElement<BNotStatType> createTINInfoCTypeBNotStat(BNotStatType value) {
        return new JAXBElement<BNotStatType>(_TINInfoCTypeBNotStat_QNAME, BNotStatType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BNotIRSDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BNotIRSDt", scope = TINInfoCType.class)
    public JAXBElement<BNotIRSDtType> createTINInfoCTypeBNotIRSDt(BNotIRSDtType value) {
        return new JAXBElement<BNotIRSDtType>(_TINInfoCTypeBNotIRSDt_QNAME, BNotIRSDtType.class, TINInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTitleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AcctTitle", scope = AcctTitleInfoCType.class)
    public JAXBElement<AcctTitleType> createAcctTitleInfoCTypeAcctTitle(AcctTitleType value) {
        return new JAXBElement<AcctTitleType>(_AcctTitleInfoCTypeAcctTitle_QNAME, AcctTitleType.class, AcctTitleInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BirthDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AddlBirthDt", scope = AcctTitleInfoCType.class)
    public JAXBElement<BirthDtType> createAcctTitleInfoCTypeAddlBirthDt(BirthDtType value) {
        return new JAXBElement<BirthDtType>(_AcctTitleInfoCTypeAddlBirthDt_QNAME, BirthDtType.class, AcctTitleInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AddlPhoneArray", scope = AcctTitleInfoCType.class)
    public JAXBElement<PhoneArrayAType> createAcctTitleInfoCTypeAddlPhoneArray(PhoneArrayAType value) {
        return new JAXBElement<PhoneArrayAType>(_AcctTitleInfoCTypeAddlPhoneArray_QNAME, PhoneArrayAType.class, AcctTitleInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddlNameStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AddlNameStat", scope = AcctTitleInfoCType.class)
    public JAXBElement<AddlNameStatType> createAcctTitleInfoCTypeAddlNameStat(AddlNameStatType value) {
        return new JAXBElement<AddlNameStatType>(_AcctTitleInfoCTypeAddlNameStat_QNAME, AddlNameStatType.class, AcctTitleInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubType", scope = BilPaySubSrchInfoCType.class)
    public JAXBElement<SubTypeType> createBilPaySubSrchInfoCTypeSubType(SubTypeType value) {
        return new JAXBElement<SubTypeType>(_BilPaySubSrchInfoCTypeSubType_QNAME, SubTypeType.class, BilPaySubSrchInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubStat", scope = BilPaySubSrchInfoCType.class)
    public JAXBElement<SubStatType> createBilPaySubSrchInfoCTypeSubStat(SubStatType value) {
        return new JAXBElement<SubStatType>(_BilPaySubSrchInfoCTypeSubStat_QNAME, SubStatType.class, BilPaySubSrchInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPmtPayeeInfoCType.class)
    public JAXBElement<CustomCType> createBilPayPmtPayeeInfoCTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPmtPayeeInfoCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurBalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecMerAcctBal", scope = ElecMerAcctIdInfoRecCType.class)
    public JAXBElement<CurBalType> createElecMerAcctIdInfoRecCTypeElecMerAcctBal(CurBalType value) {
        return new JAXBElement<CurBalType>(_ElecMerAcctIdInfoRecCTypeElecMerAcctBal_QNAME, CurBalType.class, ElecMerAcctIdInfoRecCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenQuesArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AuthenQuesArray", scope = ElecMerPayeeInfoRecCType.class)
    public JAXBElement<AuthenQuesArrayAType> createElecMerPayeeInfoRecCTypeAuthenQuesArray(AuthenQuesArrayAType value) {
        return new JAXBElement<AuthenQuesArrayAType>(_ElecMerPayeeInfoRecCTypeAuthenQuesArray_QNAME, AuthenQuesArrayAType.class, ElecMerPayeeInfoRecCType.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XtendElemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XtendElem", scope = IncXtendElemInfoCType.class)
    public JAXBElement<XtendElemType> createIncXtendElemInfoCTypeXtendElem(XtendElemType value) {
        return new JAXBElement<XtendElemType>(_IncXtendElemInfoCTypeXtendElem_QNAME, XtendElemType.class, IncXtendElemInfoCType.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPayElecBilSchedModRsMType.class)
    public JAXBElement<RsStatType> createBilPayElecBilSchedModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPayElecBilSchedModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayElecBilSchedModRsMType.class)
    public JAXBElement<CustomCType> createBilPayElecBilSchedModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayElecBilSchedModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayElecBilSchedModRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayElecBilSchedModRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayElecBilSchedModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedModInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedModInfo", scope = BilPayElecBilSchedModRqMType.class)
    public JAXBElement<BilPayElecBilSchedModInfoCType> createBilPayElecBilSchedModRqMTypeBilPayElecBilSchedModInfo(BilPayElecBilSchedModInfoCType value) {
        return new JAXBElement<BilPayElecBilSchedModInfoCType>(_BilPayElecBilSchedModRqMTypeBilPayElecBilSchedModInfo_QNAME, BilPayElecBilSchedModInfoCType.class, BilPayElecBilSchedModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = BilPayElecBilSchedModRqMType.class)
    public JAXBElement<DltType> createBilPayElecBilSchedModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_BilPayElecBilSchedModRqMTypeDlt_QNAME, DltType.class, BilPayElecBilSchedModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayElecBilSchedModRqMType.class)
    public JAXBElement<CustomCType> createBilPayElecBilSchedModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayElecBilSchedModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<BilPayProdType> createBilPayElecBilSchedInqRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<SubIdType> createBilPayElecBilSchedInqRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElecBilIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecBilId", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<ElecBilIdType> createBilPayElecBilSchedInqRsMTypeElecBilId(ElecBilIdType value) {
        return new JAXBElement<ElecBilIdType>(_BilPayElecBilSchedInqRsMTypeElecBilId_QNAME, ElecBilIdType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<ActIntentType> createBilPayElecBilSchedInqRsMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntentKey", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<ActIntentKeyType> createBilPayElecBilSchedInqRsMTypeActIntentKey(ActIntentKeyType value) {
        return new JAXBElement<ActIntentKeyType>(_BilPayElecBilSchedInqRsMTypeActIntentKey_QNAME, ActIntentKeyType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedInqInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedInqInfo", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<BilPayElecBilSchedInqInfoCType> createBilPayElecBilSchedInqRsMTypeBilPayElecBilSchedInqInfo(BilPayElecBilSchedInqInfoCType value) {
        return new JAXBElement<BilPayElecBilSchedInqInfoCType>(_BilPayElecBilSchedInqRsMTypeBilPayElecBilSchedInqInfo_QNAME, BilPayElecBilSchedInqInfoCType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<CustomCType> createBilPayElecBilSchedInqRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobDevTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobDevType", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<MobDevTypeType> createBilPayElecBilSchedInqRsMTypeMobDevType(MobDevTypeType value) {
        return new JAXBElement<MobDevTypeType>(_BilPayElecBilSchedInqRsMTypeMobDevType_QNAME, MobDevTypeType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobDevResoTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobDevResoType", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<MobDevResoTypeType> createBilPayElecBilSchedInqRsMTypeMobDevResoType(MobDevResoTypeType value) {
        return new JAXBElement<MobDevResoTypeType>(_BilPayElecBilSchedInqRsMTypeMobDevResoType_QNAME, MobDevResoTypeType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Orientation", scope = BilPayElecBilSchedInqRsMType.class)
    public JAXBElement<OrientationType> createBilPayElecBilSchedInqRsMTypeOrientation(OrientationType value) {
        return new JAXBElement<OrientationType>(_BilPayElecBilSchedInqRsMTypeOrientation_QNAME, OrientationType.class, BilPayElecBilSchedInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayElecBilSchedInqRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayElecBilSchedInqRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayElecBilSchedInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPayElecBilSchedInqRqMType.class)
    public JAXBElement<ActIntentType> createBilPayElecBilSchedInqRqMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPayElecBilSchedInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayElecBilSchedInqRqMType.class)
    public JAXBElement<CustomCType> createBilPayElecBilSchedInqRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayElecBilSchedInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobDevTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobDevType", scope = BilPayElecBilSchedInqRqMType.class)
    public JAXBElement<MobDevTypeType> createBilPayElecBilSchedInqRqMTypeMobDevType(MobDevTypeType value) {
        return new JAXBElement<MobDevTypeType>(_BilPayElecBilSchedInqRsMTypeMobDevType_QNAME, MobDevTypeType.class, BilPayElecBilSchedInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobDevResoTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "MobDevResoType", scope = BilPayElecBilSchedInqRqMType.class)
    public JAXBElement<MobDevResoTypeType> createBilPayElecBilSchedInqRqMTypeMobDevResoType(MobDevResoTypeType value) {
        return new JAXBElement<MobDevResoTypeType>(_BilPayElecBilSchedInqRsMTypeMobDevResoType_QNAME, MobDevResoTypeType.class, BilPayElecBilSchedInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Orientation", scope = BilPayElecBilSchedInqRqMType.class)
    public JAXBElement<OrientationType> createBilPayElecBilSchedInqRqMTypeOrientation(OrientationType value) {
        return new JAXBElement<OrientationType>(_BilPayElecBilSchedInqRsMTypeOrientation_QNAME, OrientationType.class, BilPayElecBilSchedInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<BilPayProdType> createBilPayElecBilSchedSrchRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<SubIdType> createBilPayElecBilSchedSrchRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStartDt", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<StartDtType> createBilPayElecBilSchedSrchRsMTypePmtStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayElecBilSchedSrchRsMTypePmtStartDt_QNAME, StartDtType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtEndDt", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<EndDtType> createBilPayElecBilSchedSrchRsMTypePmtEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayElecBilSchedSrchRsMTypePmtEndDt_QNAME, EndDtType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeName", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<PayeeNameType> createBilPayElecBilSchedSrchRsMTypePayeeName(PayeeNameType value) {
        return new JAXBElement<PayeeNameType>(_BilPayElecBilSchedSrchRsMTypePayeeName_QNAME, PayeeNameType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElecBilStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecBilStat", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<ElecBilStatType> createBilPayElecBilSchedSrchRsMTypeElecBilStat(ElecBilStatType value) {
        return new JAXBElement<ElecBilStatType>(_BilPayElecBilSchedSrchRsMTypeElecBilStat_QNAME, ElecBilStatType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayElecBilSchedSrchArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayElecBilSchedSrchArray", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<BilPayElecBilSchedSrchArrayAType> createBilPayElecBilSchedSrchRsMTypeBilPayElecBilSchedSrchArray(BilPayElecBilSchedSrchArrayAType value) {
        return new JAXBElement<BilPayElecBilSchedSrchArrayAType>(_BilPayElecBilSchedSrchRsMTypeBilPayElecBilSchedSrchArray_QNAME, BilPayElecBilSchedSrchArrayAType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<CustomCType> createBilPayElecBilSchedSrchRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecBilPayeeAcctId", scope = BilPayElecBilSchedSrchRsMType.class)
    public JAXBElement<AcctIdType> createBilPayElecBilSchedSrchRsMTypeElecBilPayeeAcctId(AcctIdType value) {
        return new JAXBElement<AcctIdType>(_BilPayElecBilSchedSrchRsMTypeElecBilPayeeAcctId_QNAME, AcctIdType.class, BilPayElecBilSchedSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayElecBilSchedSrchRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayElecBilSchedSrchRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayElecBilSchedSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "StartDt", scope = BilPayElecBilSchedSrchRqMType.class)
    public JAXBElement<StartDtType> createBilPayElecBilSchedSrchRqMTypeStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayElecBilSchedSrchRqMTypeStartDt_QNAME, StartDtType.class, BilPayElecBilSchedSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "EndDt", scope = BilPayElecBilSchedSrchRqMType.class)
    public JAXBElement<EndDtType> createBilPayElecBilSchedSrchRqMTypeEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayElecBilSchedSrchRqMTypeEndDt_QNAME, EndDtType.class, BilPayElecBilSchedSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeName", scope = BilPayElecBilSchedSrchRqMType.class)
    public JAXBElement<PayeeNameType> createBilPayElecBilSchedSrchRqMTypePayeeName(PayeeNameType value) {
        return new JAXBElement<PayeeNameType>(_BilPayElecBilSchedSrchRsMTypePayeeName_QNAME, PayeeNameType.class, BilPayElecBilSchedSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElecBilStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecBilStat", scope = BilPayElecBilSchedSrchRqMType.class)
    public JAXBElement<ElecBilStatType> createBilPayElecBilSchedSrchRqMTypeElecBilStat(ElecBilStatType value) {
        return new JAXBElement<ElecBilStatType>(_BilPayElecBilSchedSrchRsMTypeElecBilStat_QNAME, ElecBilStatType.class, BilPayElecBilSchedSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayElecBilSchedSrchRqMType.class)
    public JAXBElement<CustomCType> createBilPayElecBilSchedSrchRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayElecBilSchedSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecBilPayeeAcctId", scope = BilPayElecBilSchedSrchRqMType.class)
    public JAXBElement<AcctIdType> createBilPayElecBilSchedSrchRqMTypeElecBilPayeeAcctId(AcctIdType value) {
        return new JAXBElement<AcctIdType>(_BilPayElecBilSchedSrchRsMTypeElecBilPayeeAcctId_QNAME, AcctIdType.class, BilPayElecBilSchedSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayChanInqRsMType.class)
    public JAXBElement<BilPayProdType> createBilPayChanInqRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayChanInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProdType", scope = BilPayChanInqRsMType.class)
    public JAXBElement<BilPayProdTypeType> createBilPayChanInqRsMTypeBilPayProdType(BilPayProdTypeType value) {
        return new JAXBElement<BilPayProdTypeType>(_BilPayChanInqRsMTypeBilPayProdType_QNAME, BilPayProdTypeType.class, BilPayChanInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayChanInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayChanInfo", scope = BilPayChanInqRsMType.class)
    public JAXBElement<BilPayChanInfoCType> createBilPayChanInqRsMTypeBilPayChanInfo(BilPayChanInfoCType value) {
        return new JAXBElement<BilPayChanInfoCType>(_BilPayChanInqRsMTypeBilPayChanInfo_QNAME, BilPayChanInfoCType.class, BilPayChanInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayChanInqRsMType.class)
    public JAXBElement<CustomCType> createBilPayChanInqRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayChanInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayChanInqRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayChanInqRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayChanInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProdType", scope = BilPayChanInqRqMType.class)
    public JAXBElement<BilPayProdTypeType> createBilPayChanInqRqMTypeBilPayProdType(BilPayProdTypeType value) {
        return new JAXBElement<BilPayProdTypeType>(_BilPayChanInqRsMTypeBilPayProdType_QNAME, BilPayProdTypeType.class, BilPayChanInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayChanInqRqMType.class)
    public JAXBElement<CustomCType> createBilPayChanInqRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayChanInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubConsmCustInqRsMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubConsmCustInqRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubConsmCustInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubConsmCustIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubConsmCustId", scope = BilPaySubConsmCustInqRsMType.class)
    public JAXBElement<SubConsmCustIdType> createBilPaySubConsmCustInqRsMTypeSubConsmCustId(SubConsmCustIdType value) {
        return new JAXBElement<SubConsmCustIdType>(_BilPaySubConsmCustInqRsMTypeSubConsmCustId_QNAME, SubConsmCustIdType.class, BilPaySubConsmCustInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubComIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubComId", scope = BilPaySubConsmCustInqRsMType.class)
    public JAXBElement<SubComIdType> createBilPaySubConsmCustInqRsMTypeSubComId(SubComIdType value) {
        return new JAXBElement<SubComIdType>(_BilPaySubConsmCustInqRsMTypeSubComId_QNAME, SubComIdType.class, BilPaySubConsmCustInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubConsmCustInqRsMType.class)
    public JAXBElement<CustomCType> createBilPaySubConsmCustInqRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubConsmCustInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubStat", scope = BilPaySubConsmCustInqRsMType.class)
    public JAXBElement<SubStatType> createBilPaySubConsmCustInqRsMTypeSubStat(SubStatType value) {
        return new JAXBElement<SubStatType>(_BilPaySubSrchInfoCTypeSubStat_QNAME, SubStatType.class, BilPaySubConsmCustInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubConsmCustInqRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubConsmCustInqRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubConsmCustInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubConsmCustIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubConsmCustId", scope = BilPaySubConsmCustInqRqMType.class)
    public JAXBElement<SubConsmCustIdType> createBilPaySubConsmCustInqRqMTypeSubConsmCustId(SubConsmCustIdType value) {
        return new JAXBElement<SubConsmCustIdType>(_BilPaySubConsmCustInqRsMTypeSubConsmCustId_QNAME, SubConsmCustIdType.class, BilPaySubConsmCustInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubComIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubComId", scope = BilPaySubConsmCustInqRqMType.class)
    public JAXBElement<SubComIdType> createBilPaySubConsmCustInqRqMTypeSubComId(SubComIdType value) {
        return new JAXBElement<SubComIdType>(_BilPaySubConsmCustInqRsMTypeSubComId_QNAME, SubComIdType.class, BilPaySubConsmCustInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubConsmCustInqRqMType.class)
    public JAXBElement<CustomCType> createBilPaySubConsmCustInqRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubConsmCustInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPaySubModRsMType.class)
    public JAXBElement<RsStatType> createBilPaySubModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPaySubModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubModRsMType.class)
    public JAXBElement<CustomCType> createBilPaySubModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = BilPaySubModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createBilPaySubModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, BilPaySubModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubModRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubModRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntentKey", scope = BilPaySubModRqMType.class)
    public JAXBElement<ActIntentKeyType> createBilPaySubModRqMTypeActIntentKey(ActIntentKeyType value) {
        return new JAXBElement<ActIntentKeyType>(_BilPayElecBilSchedInqRsMTypeActIntentKey_QNAME, ActIntentKeyType.class, BilPaySubModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubInfo", scope = BilPaySubModRqMType.class)
    public JAXBElement<BilPaySubInfoCType> createBilPaySubModRqMTypeBilPaySubInfo(BilPaySubInfoCType value) {
        return new JAXBElement<BilPaySubInfoCType>(_BilPaySubModRqMTypeBilPaySubInfo_QNAME, BilPaySubInfoCType.class, BilPaySubModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = BilPaySubModRqMType.class)
    public JAXBElement<DltType> createBilPaySubModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_BilPayElecBilSchedModRqMTypeDlt_QNAME, DltType.class, BilPaySubModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubModRqMType.class)
    public JAXBElement<CustomCType> createBilPaySubModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPaySubAddRsMType.class)
    public JAXBElement<RsStatType> createBilPaySubAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPaySubAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPaySubAddRsMType.class)
    public JAXBElement<SubIdType> createBilPaySubAddRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPaySubAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubAddRsMType.class)
    public JAXBElement<CustomCType> createBilPaySubAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = BilPaySubAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createBilPaySubAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, BilPaySubAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubAddRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubAddRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubInfo", scope = BilPaySubAddRqMType.class)
    public JAXBElement<BilPaySubInfoCType> createBilPaySubAddRqMTypeBilPaySubInfo(BilPaySubInfoCType value) {
        return new JAXBElement<BilPaySubInfoCType>(_BilPaySubModRqMTypeBilPaySubInfo_QNAME, BilPaySubInfoCType.class, BilPaySubAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubAddRqMType.class)
    public JAXBElement<CustomCType> createBilPaySubAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubInqRsMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubInqRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPaySubInqRsMType.class)
    public JAXBElement<SubIdType> createBilPaySubInqRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPaySubInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPaySubInqRsMType.class)
    public JAXBElement<ActIntentType> createBilPaySubInqRsMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPaySubInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubInfo", scope = BilPaySubInqRsMType.class)
    public JAXBElement<BilPaySubInfoCType> createBilPaySubInqRsMTypeBilPaySubInfo(BilPaySubInfoCType value) {
        return new JAXBElement<BilPaySubInfoCType>(_BilPaySubModRqMTypeBilPaySubInfo_QNAME, BilPaySubInfoCType.class, BilPaySubInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubInqRsMType.class)
    public JAXBElement<CustomCType> createBilPaySubInqRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubInqRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubInqRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPaySubInqRqMType.class)
    public JAXBElement<ActIntentType> createBilPaySubInqRqMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPaySubInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubInqRqMType.class)
    public JAXBElement<CustomCType> createBilPaySubInqRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubSrchRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PersonName", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<PersonNameCType> createBilPaySubSrchRsMTypePersonName(PersonNameCType value) {
        return new JAXBElement<PersonNameCType>(_BilPaySubSrchRsMTypePersonName_QNAME, PersonNameCType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PhoneNum", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<PhoneNumType> createBilPaySubSrchRsMTypePhoneNum(PhoneNumType value) {
        return new JAXBElement<PhoneNumType>(_PhoneInfoCTypePhoneNum_QNAME, PhoneNumType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrchAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SrchAddr", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<SrchAddrType> createBilPaySubSrchRsMTypeSrchAddr(SrchAddrType value) {
        return new JAXBElement<SrchAddrType>(_BilPaySubSrchRsMTypeSrchAddr_QNAME, SrchAddrType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrchCityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SrchCity", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<SrchCityType> createBilPaySubSrchRsMTypeSrchCity(SrchCityType value) {
        return new JAXBElement<SrchCityType>(_BilPaySubSrchRsMTypeSrchCity_QNAME, SrchCityType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubType", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<SubTypeType> createBilPaySubSrchRsMTypeSubType(SubTypeType value) {
        return new JAXBElement<SubTypeType>(_BilPaySubSrchInfoCTypeSubType_QNAME, SubTypeType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubStat", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<SubStatType> createBilPaySubSrchRsMTypeSubStat(SubStatType value) {
        return new JAXBElement<SubStatType>(_BilPaySubSrchInfoCTypeSubStat_QNAME, SubStatType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySubSrchArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySubSrchArray", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<BilPaySubSrchArrayAType> createBilPaySubSrchRsMTypeBilPaySubSrchArray(BilPaySubSrchArrayAType value) {
        return new JAXBElement<BilPaySubSrchArrayAType>(_BilPaySubSrchRsMTypeBilPaySubSrchArray_QNAME, BilPaySubSrchArrayAType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<CustomCType> createBilPaySubSrchRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayFromAcctId", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<AcctIdType> createBilPaySubSrchRsMTypePayFromAcctId(AcctIdType value) {
        return new JAXBElement<AcctIdType>(_BilPaySubSrchRsMTypePayFromAcctId_QNAME, AcctIdType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TaxId", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<TaxIdType> createBilPaySubSrchRsMTypeTaxId(TaxIdType value) {
        return new JAXBElement<TaxIdType>(_TINInfoCTypeTaxId_QNAME, TaxIdType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "EmailAddr", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<EmailAddrType> createBilPaySubSrchRsMTypeEmailAddr(EmailAddrType value) {
        return new JAXBElement<EmailAddrType>(_EmailInfoCTypeEmailAddr_QNAME, EmailAddrType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PostalCode", scope = BilPaySubSrchRsMType.class)
    public JAXBElement<PostalCodeType> createBilPaySubSrchRsMTypePostalCode(PostalCodeType value) {
        return new JAXBElement<PostalCodeType>(_AddrCTypePostalCode_QNAME, PostalCodeType.class, BilPaySubSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySubSrchRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PersonName", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<PersonNameCType> createBilPaySubSrchRqMTypePersonName(PersonNameCType value) {
        return new JAXBElement<PersonNameCType>(_BilPaySubSrchRsMTypePersonName_QNAME, PersonNameCType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PhoneNum", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<PhoneNumType> createBilPaySubSrchRqMTypePhoneNum(PhoneNumType value) {
        return new JAXBElement<PhoneNumType>(_PhoneInfoCTypePhoneNum_QNAME, PhoneNumType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrchAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SrchAddr", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<SrchAddrType> createBilPaySubSrchRqMTypeSrchAddr(SrchAddrType value) {
        return new JAXBElement<SrchAddrType>(_BilPaySubSrchRsMTypeSrchAddr_QNAME, SrchAddrType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrchCityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SrchCity", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<SrchCityType> createBilPaySubSrchRqMTypeSrchCity(SrchCityType value) {
        return new JAXBElement<SrchCityType>(_BilPaySubSrchRsMTypeSrchCity_QNAME, SrchCityType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubType", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<SubTypeType> createBilPaySubSrchRqMTypeSubType(SubTypeType value) {
        return new JAXBElement<SubTypeType>(_BilPaySubSrchInfoCTypeSubType_QNAME, SubTypeType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubStat", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<SubStatType> createBilPaySubSrchRqMTypeSubStat(SubStatType value) {
        return new JAXBElement<SubStatType>(_BilPaySubSrchInfoCTypeSubStat_QNAME, SubStatType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<CustomCType> createBilPaySubSrchRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayFromAcctId", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<AcctIdType> createBilPaySubSrchRqMTypePayFromAcctId(AcctIdType value) {
        return new JAXBElement<AcctIdType>(_BilPaySubSrchRsMTypePayFromAcctId_QNAME, AcctIdType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "TaxId", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<TaxIdType> createBilPaySubSrchRqMTypeTaxId(TaxIdType value) {
        return new JAXBElement<TaxIdType>(_TINInfoCTypeTaxId_QNAME, TaxIdType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "EmailAddr", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<EmailAddrType> createBilPaySubSrchRqMTypeEmailAddr(EmailAddrType value) {
        return new JAXBElement<EmailAddrType>(_EmailInfoCTypeEmailAddr_QNAME, EmailAddrType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PostalCode", scope = BilPaySubSrchRqMType.class)
    public JAXBElement<PostalCodeType> createBilPaySubSrchRqMTypePostalCode(PostalCodeType value) {
        return new JAXBElement<PostalCodeType>(_AddrCTypePostalCode_QNAME, PostalCodeType.class, BilPaySubSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<BilPayProdType> createBilPayPmtHistInqRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<SubIdType> createBilPayPmtHistInqRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtId", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<PmtIdType> createBilPayPmtHistInqRsMTypePmtId(PmtIdType value) {
        return new JAXBElement<PmtIdType>(_BilPayPmtHistInqRsMTypePmtId_QNAME, PmtIdType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncChkImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IncChkImg", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<IncChkImgType> createBilPayPmtHistInqRsMTypeIncChkImg(IncChkImgType value) {
        return new JAXBElement<IncChkImgType>(_BilPayPmtHistInqRsMTypeIncChkImg_QNAME, IncChkImgType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPmtInfo", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<BilPayPmtInfoCType> createBilPayPmtHistInqRsMTypeBilPayPmtInfo(BilPayPmtInfoCType value) {
        return new JAXBElement<BilPayPmtInfoCType>(_BilPayPmtHistInqRsMTypeBilPayPmtInfo_QNAME, BilPayPmtInfoCType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtCrtDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtCrtDt", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<PmtCrtDtType> createBilPayPmtHistInqRsMTypePmtCrtDt(PmtCrtDtType value) {
        return new JAXBElement<PmtCrtDtType>(_BilPayPmtHistInqRsMTypePmtCrtDt_QNAME, PmtCrtDtType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStat", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<PmtStatType> createBilPayPmtHistInqRsMTypePmtStat(PmtStatType value) {
        return new JAXBElement<PmtStatType>(_BilPayPmtHistInqRsMTypePmtStat_QNAME, PmtStatType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtMthdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtMthd", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<PmtMthdType> createBilPayPmtHistInqRsMTypePmtMthd(PmtMthdType value) {
        return new JAXBElement<PmtMthdType>(_BilPayPmtHistInqRsMTypePmtMthd_QNAME, PmtMthdType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XPmtStatHistArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "x_PmtStatHistArray", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<XPmtStatHistArrayAType> createBilPayPmtHistInqRsMTypeXPmtStatHistArray(XPmtStatHistArrayAType value) {
        return new JAXBElement<XPmtStatHistArrayAType>(_BilPayPmtHistInqRsMTypeXPmtStatHistArray_QNAME, XPmtStatHistArrayAType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XPmtChkStatHistArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "x_PmtChkStatHistArray", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<XPmtChkStatHistArrayAType> createBilPayPmtHistInqRsMTypeXPmtChkStatHistArray(XPmtChkStatHistArrayAType value) {
        return new JAXBElement<XPmtChkStatHistArrayAType>(_BilPayPmtHistInqRsMTypeXPmtChkStatHistArray_QNAME, XPmtChkStatHistArrayAType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XPmtChkTrakInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "x_PmtChkTrakInfo", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<XPmtChkTrakInfoCType> createBilPayPmtHistInqRsMTypeXPmtChkTrakInfo(XPmtChkTrakInfoCType value) {
        return new JAXBElement<XPmtChkTrakInfoCType>(_BilPayPmtHistInqRsMTypeXPmtChkTrakInfo_QNAME, XPmtChkTrakInfoCType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtChkNumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtChkNum", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<PmtChkNumType> createBilPayPmtHistInqRsMTypePmtChkNum(PmtChkNumType value) {
        return new JAXBElement<PmtChkNumType>(_BilPayPmtHistInqRsMTypePmtChkNum_QNAME, PmtChkNumType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtChkStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtChkStat", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<PmtChkStatType> createBilPayPmtHistInqRsMTypePmtChkStat(PmtChkStatType value) {
        return new JAXBElement<PmtChkStatType>(_BilPayPmtHistInqRsMTypePmtChkStat_QNAME, PmtChkStatType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtChkImgInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtChkImgInfo", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<PmtChkImgInfoCType> createBilPayPmtHistInqRsMTypePmtChkImgInfo(PmtChkImgInfoCType value) {
        return new JAXBElement<PmtChkImgInfoCType>(_BilPayPmtHistInqRsMTypePmtChkImgInfo_QNAME, PmtChkImgInfoCType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<CustomCType> createBilPayPmtHistInqRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XElecBilPmtInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "x_ElecBilPmtInfo", scope = BilPayPmtHistInqRsMType.class)
    public JAXBElement<XElecBilPmtInfoCType> createBilPayPmtHistInqRsMTypeXElecBilPmtInfo(XElecBilPmtInfoCType value) {
        return new JAXBElement<XElecBilPmtInfoCType>(_BilPayPmtHistInqRsMTypeXElecBilPmtInfo_QNAME, XElecBilPmtInfoCType.class, BilPayPmtHistInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPmtHistInqRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayPmtHistInqRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPmtHistInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncChkImgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IncChkImg", scope = BilPayPmtHistInqRqMType.class)
    public JAXBElement<IncChkImgType> createBilPayPmtHistInqRqMTypeIncChkImg(IncChkImgType value) {
        return new JAXBElement<IncChkImgType>(_BilPayPmtHistInqRsMTypeIncChkImg_QNAME, IncChkImgType.class, BilPayPmtHistInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncXtendElemAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IncXtendElemArray", scope = BilPayPmtHistInqRqMType.class)
    public JAXBElement<IncXtendElemAType> createBilPayPmtHistInqRqMTypeIncXtendElemArray(IncXtendElemAType value) {
        return new JAXBElement<IncXtendElemAType>(_BilPayPmtHistInqRqMTypeIncXtendElemArray_QNAME, IncXtendElemAType.class, BilPayPmtHistInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPmtHistInqRqMType.class)
    public JAXBElement<CustomCType> createBilPayPmtHistInqRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPmtHistInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<BilPayProdType> createBilPayPmtHistSrchRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<SubIdType> createBilPayPmtHistSrchRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStartDt", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<StartDtType> createBilPayPmtHistSrchRsMTypePmtStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayElecBilSchedSrchRsMTypePmtStartDt_QNAME, StartDtType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtEndDt", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<EndDtType> createBilPayPmtHistSrchRsMTypePmtEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayElecBilSchedSrchRsMTypePmtEndDt_QNAME, EndDtType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtLowAmt", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<LowAmtType> createBilPayPmtHistSrchRsMTypePmtLowAmt(LowAmtType value) {
        return new JAXBElement<LowAmtType>(_BilPayPmtHistSrchRsMTypePmtLowAmt_QNAME, LowAmtType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHighAmt", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<HighAmtType> createBilPayPmtHistSrchRsMTypePmtHighAmt(HighAmtType value) {
        return new JAXBElement<HighAmtType>(_BilPayPmtHistSrchRsMTypePmtHighAmt_QNAME, HighAmtType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStat", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<PmtStatType> createBilPayPmtHistSrchRsMTypePmtStat(PmtStatType value) {
        return new JAXBElement<PmtStatType>(_BilPayPmtHistInqRsMTypePmtStat_QNAME, PmtStatType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeId", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<PayeeIdType> createBilPayPmtHistSrchRsMTypePayeeId(PayeeIdType value) {
        return new JAXBElement<PayeeIdType>(_BilPayPmtHistSrchRsMTypePayeeId_QNAME, PayeeIdType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtHistSrchArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPmtHistSrchArray", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<BilPayPmtHistSrchArrayAType> createBilPayPmtHistSrchRsMTypeBilPayPmtHistSrchArray(BilPayPmtHistSrchArrayAType value) {
        return new JAXBElement<BilPayPmtHistSrchArrayAType>(_BilPayPmtHistSrchRsMTypeBilPayPmtHistSrchArray_QNAME, BilPayPmtHistSrchArrayAType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<CustomCType> createBilPayPmtHistSrchRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtMthdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeePmtMthd", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<PmtMthdType> createBilPayPmtHistSrchRsMTypePayeePmtMthd(PmtMthdType value) {
        return new JAXBElement<PmtMthdType>(_BilPayPmtHistSrchRsMTypePayeePmtMthd_QNAME, PmtMthdType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P2PFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "P2PFilter", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<P2PFilterType> createBilPayPmtHistSrchRsMTypeP2PFilter(P2PFilterType value) {
        return new JAXBElement<P2PFilterType>(_BilPayPmtHistSrchRsMTypeP2PFilter_QNAME, P2PFilterType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RecurFilter", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<RecurFilterType> createBilPayPmtHistSrchRsMTypeRecurFilter(RecurFilterType value) {
        return new JAXBElement<RecurFilterType>(_BilPayPmtHistSrchRsMTypeRecurFilter_QNAME, RecurFilterType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIntentTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtIntentType", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<PmtIntentTypeType> createBilPayPmtHistSrchRsMTypePmtIntentType(PmtIntentTypeType value) {
        return new JAXBElement<PmtIntentTypeType>(_BilPayPmtHistSrchRsMTypePmtIntentType_QNAME, PmtIntentTypeType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferFilter", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<XferFilterType> createBilPayPmtHistSrchRsMTypeXferFilter(XferFilterType value) {
        return new JAXBElement<XferFilterType>(_BilPayPmtHistSrchRsMTypeXferFilter_QNAME, XferFilterType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CardPayFilter", scope = BilPayPmtHistSrchRsMType.class)
    public JAXBElement<CardPayFilterType> createBilPayPmtHistSrchRsMTypeCardPayFilter(CardPayFilterType value) {
        return new JAXBElement<CardPayFilterType>(_BilPayPmtHistSrchRsMTypeCardPayFilter_QNAME, CardPayFilterType.class, BilPayPmtHistSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayPmtHistSrchRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStartDt", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<StartDtType> createBilPayPmtHistSrchRqMTypePmtStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayElecBilSchedSrchRsMTypePmtStartDt_QNAME, StartDtType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtEndDt", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<EndDtType> createBilPayPmtHistSrchRqMTypePmtEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayElecBilSchedSrchRsMTypePmtEndDt_QNAME, EndDtType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtLowAmt", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<LowAmtType> createBilPayPmtHistSrchRqMTypePmtLowAmt(LowAmtType value) {
        return new JAXBElement<LowAmtType>(_BilPayPmtHistSrchRsMTypePmtLowAmt_QNAME, LowAmtType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHighAmt", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<HighAmtType> createBilPayPmtHistSrchRqMTypePmtHighAmt(HighAmtType value) {
        return new JAXBElement<HighAmtType>(_BilPayPmtHistSrchRsMTypePmtHighAmt_QNAME, HighAmtType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStat", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<PmtStatType> createBilPayPmtHistSrchRqMTypePmtStat(PmtStatType value) {
        return new JAXBElement<PmtStatType>(_BilPayPmtHistInqRsMTypePmtStat_QNAME, PmtStatType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeId", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<PayeeIdType> createBilPayPmtHistSrchRqMTypePayeeId(PayeeIdType value) {
        return new JAXBElement<PayeeIdType>(_BilPayPmtHistSrchRsMTypePayeeId_QNAME, PayeeIdType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<CustomCType> createBilPayPmtHistSrchRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtMthdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeePmtMthd", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<PmtMthdType> createBilPayPmtHistSrchRqMTypePayeePmtMthd(PmtMthdType value) {
        return new JAXBElement<PmtMthdType>(_BilPayPmtHistSrchRsMTypePayeePmtMthd_QNAME, PmtMthdType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P2PFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "P2PFilter", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<P2PFilterType> createBilPayPmtHistSrchRqMTypeP2PFilter(P2PFilterType value) {
        return new JAXBElement<P2PFilterType>(_BilPayPmtHistSrchRsMTypeP2PFilter_QNAME, P2PFilterType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RecurFilter", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<RecurFilterType> createBilPayPmtHistSrchRqMTypeRecurFilter(RecurFilterType value) {
        return new JAXBElement<RecurFilterType>(_BilPayPmtHistSrchRsMTypeRecurFilter_QNAME, RecurFilterType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIntentTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtIntentType", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<PmtIntentTypeType> createBilPayPmtHistSrchRqMTypePmtIntentType(PmtIntentTypeType value) {
        return new JAXBElement<PmtIntentTypeType>(_BilPayPmtHistSrchRsMTypePmtIntentType_QNAME, PmtIntentTypeType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XferFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "XferFilter", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<XferFilterType> createBilPayPmtHistSrchRqMTypeXferFilter(XferFilterType value) {
        return new JAXBElement<XferFilterType>(_BilPayPmtHistSrchRsMTypeXferFilter_QNAME, XferFilterType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CardPayFilter", scope = BilPayPmtHistSrchRqMType.class)
    public JAXBElement<CardPayFilterType> createBilPayPmtHistSrchRqMTypeCardPayFilter(CardPayFilterType value) {
        return new JAXBElement<CardPayFilterType>(_BilPayPmtHistSrchRsMTypeCardPayFilter_QNAME, CardPayFilterType.class, BilPayPmtHistSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPaySchedPmtApprvRsMType.class)
    public JAXBElement<RsStatType> createBilPaySchedPmtApprvRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPaySchedPmtApprvRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtApprvRsMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtApprvRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtApprvRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = BilPaySchedPmtApprvRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createBilPaySchedPmtApprvRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, BilPaySchedPmtApprvRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySchedPmtApprvRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySchedPmtApprvRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySchedPmtApprvRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtApprvRqMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtApprvRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtApprvRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPaySchedPmtModRsMType.class)
    public JAXBElement<RsStatType> createBilPaySchedPmtModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPaySchedPmtModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtModRsMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createBilPaySchedPmtModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySchedPmtModRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntentKey", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<ActIntentKeyType> createBilPaySchedPmtModRqMTypeActIntentKey(ActIntentKeyType value) {
        return new JAXBElement<ActIntentKeyType>(_BilPayElecBilSchedInqRsMTypeActIntentKey_QNAME, ActIntentKeyType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtInfo", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<BilPayPmtInfoCType> createBilPaySchedPmtModRqMTypeBilPaySchedPmtInfo(BilPayPmtInfoCType value) {
        return new JAXBElement<BilPayPmtInfoCType>(_BilPaySchedPmtModRqMTypeBilPaySchedPmtInfo_QNAME, BilPayPmtInfoCType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<DltType> createBilPaySchedPmtModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_BilPayElecBilSchedModRqMTypeDlt_QNAME, DltType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "FutPmtId", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<PmtIdType> createBilPaySchedPmtModRqMTypeFutPmtId(PmtIdType value) {
        return new JAXBElement<PmtIdType>(_BilPaySchedPmtModRqMTypeFutPmtId_QNAME, PmtIdType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SkipPmtOccurType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SkipPmtOccur", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<SkipPmtOccurType> createBilPaySchedPmtModRqMTypeSkipPmtOccur(SkipPmtOccurType value) {
        return new JAXBElement<SkipPmtOccurType>(_BilPaySchedPmtModRqMTypeSkipPmtOccur_QNAME, SkipPmtOccurType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "DltRecur", scope = BilPaySchedPmtModRqMType.class)
    public JAXBElement<DltType> createBilPaySchedPmtModRqMTypeDltRecur(DltType value) {
        return new JAXBElement<DltType>(_BilPaySchedPmtModRqMTypeDltRecur_QNAME, DltType.class, BilPaySchedPmtModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtId", scope = BilPaySchedPmtAddRsMType.class)
    public JAXBElement<PmtIdType> createBilPaySchedPmtAddRsMTypePmtId(PmtIdType value) {
        return new JAXBElement<PmtIdType>(_BilPayPmtHistInqRsMTypePmtId_QNAME, PmtIdType.class, BilPaySchedPmtAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPaySchedPmtAddRsMType.class)
    public JAXBElement<RsStatType> createBilPaySchedPmtAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPaySchedPmtAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtAddRsMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = BilPaySchedPmtAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createBilPaySchedPmtAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, BilPaySchedPmtAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySchedPmtAddRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySchedPmtAddRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySchedPmtAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtAddRqMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<BilPayProdType> createBilPaySchedPmtInqRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<SubIdType> createBilPaySchedPmtInqRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtId", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<PmtIdType> createBilPaySchedPmtInqRsMTypePmtId(PmtIdType value) {
        return new JAXBElement<PmtIdType>(_BilPayPmtHistInqRsMTypePmtId_QNAME, PmtIdType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<ActIntentType> createBilPaySchedPmtInqRsMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPmtInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtInfo", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<BilPayPmtInfoCType> createBilPaySchedPmtInqRsMTypeBilPaySchedPmtInfo(BilPayPmtInfoCType value) {
        return new JAXBElement<BilPayPmtInfoCType>(_BilPaySchedPmtModRqMTypeBilPaySchedPmtInfo_QNAME, BilPayPmtInfoCType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtCrtDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtCrtDt", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<PmtCrtDtType> createBilPaySchedPmtInqRsMTypePmtCrtDt(PmtCrtDtType value) {
        return new JAXBElement<PmtCrtDtType>(_BilPayPmtHistInqRsMTypePmtCrtDt_QNAME, PmtCrtDtType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStat", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<PmtStatType> createBilPaySchedPmtInqRsMTypePmtStat(PmtStatType value) {
        return new JAXBElement<PmtStatType>(_BilPayPmtHistInqRsMTypePmtStat_QNAME, PmtStatType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntentKey", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<ActIntentKeyType> createBilPaySchedPmtInqRsMTypeActIntentKey(ActIntentKeyType value) {
        return new JAXBElement<ActIntentKeyType>(_BilPayElecBilSchedInqRsMTypeActIntentKey_QNAME, ActIntentKeyType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtInqRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayeeElecPmtInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayeeElecPmtInfo", scope = BilPaySchedPmtInqRsMType.class)
    public JAXBElement<BilPayeeElecPmtInfoCType> createBilPaySchedPmtInqRsMTypeBilPayeeElecPmtInfo(BilPayeeElecPmtInfoCType value) {
        return new JAXBElement<BilPayeeElecPmtInfoCType>(_BilPaySchedPmtInqRsMTypeBilPayeeElecPmtInfo_QNAME, BilPayeeElecPmtInfoCType.class, BilPaySchedPmtInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySchedPmtInqRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySchedPmtInqRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySchedPmtInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPaySchedPmtInqRqMType.class)
    public JAXBElement<ActIntentType> createBilPaySchedPmtInqRqMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPaySchedPmtInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtInqRqMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtInqRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncXtendElemAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IncXtendElemArray", scope = BilPaySchedPmtInqRqMType.class)
    public JAXBElement<IncXtendElemAType> createBilPaySchedPmtInqRqMTypeIncXtendElemArray(IncXtendElemAType value) {
        return new JAXBElement<IncXtendElemAType>(_BilPayPmtHistInqRqMTypeIncXtendElemArray_QNAME, IncXtendElemAType.class, BilPaySchedPmtInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<BilPayProdType> createBilPaySchedPmtSrchRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<SubIdType> createBilPaySchedPmtSrchRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStartDt", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<StartDtType> createBilPaySchedPmtSrchRsMTypePmtStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayElecBilSchedSrchRsMTypePmtStartDt_QNAME, StartDtType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtEndDt", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<EndDtType> createBilPaySchedPmtSrchRsMTypePmtEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayElecBilSchedSrchRsMTypePmtEndDt_QNAME, EndDtType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtLowAmt", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<LowAmtType> createBilPaySchedPmtSrchRsMTypePmtLowAmt(LowAmtType value) {
        return new JAXBElement<LowAmtType>(_BilPayPmtHistSrchRsMTypePmtLowAmt_QNAME, LowAmtType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHighAmt", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<HighAmtType> createBilPaySchedPmtSrchRsMTypePmtHighAmt(HighAmtType value) {
        return new JAXBElement<HighAmtType>(_BilPayPmtHistSrchRsMTypePmtHighAmt_QNAME, HighAmtType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStat", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<PmtStatType> createBilPaySchedPmtSrchRsMTypePmtStat(PmtStatType value) {
        return new JAXBElement<PmtStatType>(_BilPayPmtHistInqRsMTypePmtStat_QNAME, PmtStatType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeId", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<PayeeIdType> createBilPaySchedPmtSrchRsMTypePayeeId(PayeeIdType value) {
        return new JAXBElement<PayeeIdType>(_BilPayPmtHistSrchRsMTypePayeeId_QNAME, PayeeIdType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPaySchedPmtSrchArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPaySchedPmtSrchArray", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<BilPaySchedPmtSrchArrayAType> createBilPaySchedPmtSrchRsMTypeBilPaySchedPmtSrchArray(BilPaySchedPmtSrchArrayAType value) {
        return new JAXBElement<BilPaySchedPmtSrchArrayAType>(_BilPaySchedPmtSrchRsMTypeBilPaySchedPmtSrchArray_QNAME, BilPaySchedPmtSrchArrayAType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtSrchRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CardPayFilter", scope = BilPaySchedPmtSrchRsMType.class)
    public JAXBElement<CardPayFilterType> createBilPaySchedPmtSrchRsMTypeCardPayFilter(CardPayFilterType value) {
        return new JAXBElement<CardPayFilterType>(_BilPayPmtHistSrchRsMTypeCardPayFilter_QNAME, CardPayFilterType.class, BilPaySchedPmtSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<BilPayProdType> createBilPaySchedPmtSrchRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStartDt", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<StartDtType> createBilPaySchedPmtSrchRqMTypePmtStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayElecBilSchedSrchRsMTypePmtStartDt_QNAME, StartDtType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtEndDt", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<EndDtType> createBilPaySchedPmtSrchRqMTypePmtEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayElecBilSchedSrchRsMTypePmtEndDt_QNAME, EndDtType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtLowAmt", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<LowAmtType> createBilPaySchedPmtSrchRqMTypePmtLowAmt(LowAmtType value) {
        return new JAXBElement<LowAmtType>(_BilPayPmtHistSrchRsMTypePmtLowAmt_QNAME, LowAmtType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtHighAmt", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<HighAmtType> createBilPaySchedPmtSrchRqMTypePmtHighAmt(HighAmtType value) {
        return new JAXBElement<HighAmtType>(_BilPayPmtHistSrchRsMTypePmtHighAmt_QNAME, HighAmtType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PmtStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PmtStat", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<PmtStatType> createBilPaySchedPmtSrchRqMTypePmtStat(PmtStatType value) {
        return new JAXBElement<PmtStatType>(_BilPayPmtHistInqRsMTypePmtStat_QNAME, PmtStatType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeId", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<PayeeIdType> createBilPaySchedPmtSrchRqMTypePayeeId(PayeeIdType value) {
        return new JAXBElement<PayeeIdType>(_BilPayPmtHistSrchRsMTypePayeeId_QNAME, PayeeIdType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<CustomCType> createBilPaySchedPmtSrchRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CardPayFilter", scope = BilPaySchedPmtSrchRqMType.class)
    public JAXBElement<CardPayFilterType> createBilPaySchedPmtSrchRqMTypeCardPayFilter(CardPayFilterType value) {
        return new JAXBElement<CardPayFilterType>(_BilPayPmtHistSrchRsMTypeCardPayFilter_QNAME, CardPayFilterType.class, BilPaySchedPmtSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPayPayeeModRsMType.class)
    public JAXBElement<RsStatType> createBilPayPayeeModRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPayPayeeModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeModRsMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeModRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeModIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeModId", scope = BilPayPayeeModRsMType.class)
    public JAXBElement<PayeeModIdType> createBilPayPayeeModRsMTypePayeeModId(PayeeModIdType value) {
        return new JAXBElement<PayeeModIdType>(_BilPayPayeeModRsMTypePayeeModId_QNAME, PayeeModIdType.class, BilPayPayeeModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenQuesArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AuthenQuesArray", scope = BilPayPayeeModRsMType.class)
    public JAXBElement<AuthenQuesArrayAType> createBilPayPayeeModRsMTypeAuthenQuesArray(AuthenQuesArrayAType value) {
        return new JAXBElement<AuthenQuesArrayAType>(_ElecMerPayeeInfoRecCTypeAuthenQuesArray_QNAME, AuthenQuesArrayAType.class, BilPayPayeeModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElecMerAcctIdArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecMerAcctIdArray", scope = BilPayPayeeModRsMType.class)
    public JAXBElement<ElecMerAcctIdArrayAType> createBilPayPayeeModRsMTypeElecMerAcctIdArray(ElecMerAcctIdArrayAType value) {
        return new JAXBElement<ElecMerAcctIdArrayAType>(_BilPayPayeeModRsMTypeElecMerAcctIdArray_QNAME, ElecMerAcctIdArrayAType.class, BilPayPayeeModRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createBilPayPayeeModRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayPayeeModRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntentKey", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<ActIntentKeyType> createBilPayPayeeModRqMTypeActIntentKey(ActIntentKeyType value) {
        return new JAXBElement<ActIntentKeyType>(_BilPayElecBilSchedInqRsMTypeActIntentKey_QNAME, ActIntentKeyType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeInfo", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<BilPayPayeeInfoCType> createBilPayPayeeModRqMTypeBilPayPayeeInfo(BilPayPayeeInfoCType value) {
        return new JAXBElement<BilPayPayeeInfoCType>(_BilPayPayeeModRqMTypeBilPayPayeeInfo_QNAME, BilPayPayeeInfoCType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Dlt", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<DltType> createBilPayPayeeModRqMTypeDlt(DltType value) {
        return new JAXBElement<DltType>(_BilPayElecBilSchedModRqMTypeDlt_QNAME, DltType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeModRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElecMerPayeeInfoRecCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecMerPayeeInfoRec", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<ElecMerPayeeInfoRecCType> createBilPayPayeeModRqMTypeElecMerPayeeInfoRec(ElecMerPayeeInfoRecCType value) {
        return new JAXBElement<ElecMerPayeeInfoRecCType>(_BilPayPayeeModRqMTypeElecMerPayeeInfoRec_QNAME, ElecMerPayeeInfoRecCType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecMerAcctErrCode", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<ErrCodeType> createBilPayPayeeModRqMTypeElecMerAcctErrCode(ErrCodeType value) {
        return new JAXBElement<ErrCodeType>(_BilPayPayeeModRqMTypeElecMerAcctErrCode_QNAME, ErrCodeType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeModIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeModId", scope = BilPayPayeeModRqMType.class)
    public JAXBElement<PayeeModIdType> createBilPayPayeeModRqMTypePayeeModId(PayeeModIdType value) {
        return new JAXBElement<PayeeModIdType>(_BilPayPayeeModRsMTypePayeeModId_QNAME, PayeeModIdType.class, BilPayPayeeModRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeId", scope = BilPayPayeeAddRsMType.class)
    public JAXBElement<PayeeIdType> createBilPayPayeeAddRsMTypePayeeId(PayeeIdType value) {
        return new JAXBElement<PayeeIdType>(_BilPayPmtHistSrchRsMTypePayeeId_QNAME, PayeeIdType.class, BilPayPayeeAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RsStatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "RsStat", scope = BilPayPayeeAddRsMType.class)
    public JAXBElement<RsStatType> createBilPayPayeeAddRsMTypeRsStat(RsStatType value) {
        return new JAXBElement<RsStatType>(_BilPayElecBilSchedModRsMTypeRsStat_QNAME, RsStatType.class, BilPayPayeeAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeAddRsMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeAddRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeAddRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrOvrRdInfoArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ErrOvrRdInfoArray", scope = BilPayPayeeAddRqMType.class)
    public JAXBElement<ErrOvrRdInfoArrayAType> createBilPayPayeeAddRqMTypeErrOvrRdInfoArray(ErrOvrRdInfoArrayAType value) {
        return new JAXBElement<ErrOvrRdInfoArrayAType>(_BilPaySubModRqMTypeErrOvrRdInfoArray_QNAME, ErrOvrRdInfoArrayAType.class, BilPayPayeeAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPayeeAddRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayPayeeAddRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPayeeAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeAddRqMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeAddRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeAddRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<BilPayProdType> createBilPayPayeeInqRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<SubIdType> createBilPayPayeeInqRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeId", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<PayeeIdType> createBilPayPayeeInqRsMTypePayeeId(PayeeIdType value) {
        return new JAXBElement<PayeeIdType>(_BilPayPmtHistSrchRsMTypePayeeId_QNAME, PayeeIdType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<ActIntentType> createBilPayPayeeInqRsMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeInfo", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<BilPayPayeeInfoCType> createBilPayPayeeInqRsMTypeBilPayPayeeInfo(BilPayPayeeInfoCType value) {
        return new JAXBElement<BilPayPayeeInfoCType>(_BilPayPayeeModRqMTypeBilPayPayeeInfo_QNAME, BilPayPayeeInfoCType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeInqRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XElecMerPayeeInfoCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "x_ElecMerPayeeInfo", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<XElecMerPayeeInfoCType> createBilPayPayeeInqRsMTypeXElecMerPayeeInfo(XElecMerPayeeInfoCType value) {
        return new JAXBElement<XElecMerPayeeInfoCType>(_BilPayPayeeInqRsMTypeXElecMerPayeeInfo_QNAME, XElecMerPayeeInfoCType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlwCardFundedTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "AlwCardFundedType", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<AlwCardFundedTypeType> createBilPayPayeeInqRsMTypeAlwCardFundedType(AlwCardFundedTypeType value) {
        return new JAXBElement<AlwCardFundedTypeType>(_BilPayPayeeInqRsMTypeAlwCardFundedType_QNAME, AlwCardFundedTypeType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XCardFundedPayeeArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "x_CardFundedPayeeArray", scope = BilPayPayeeInqRsMType.class)
    public JAXBElement<XCardFundedPayeeArrayAType> createBilPayPayeeInqRsMTypeXCardFundedPayeeArray(XCardFundedPayeeArrayAType value) {
        return new JAXBElement<XCardFundedPayeeArrayAType>(_BilPayPayeeInqRsMTypeXCardFundedPayeeArray_QNAME, XCardFundedPayeeArrayAType.class, BilPayPayeeInqRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPayeeInqRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayPayeeInqRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPayeeInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ActIntent", scope = BilPayPayeeInqRqMType.class)
    public JAXBElement<ActIntentType> createBilPayPayeeInqRqMTypeActIntent(ActIntentType value) {
        return new JAXBElement<ActIntentType>(_BilPayElecBilSchedInqRsMTypeActIntent_QNAME, ActIntentType.class, BilPayPayeeInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeInqRqMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeInqRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncXtendElemAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IncXtendElemArray", scope = BilPayPayeeInqRqMType.class)
    public JAXBElement<IncXtendElemAType> createBilPayPayeeInqRqMTypeIncXtendElemArray(IncXtendElemAType value) {
        return new JAXBElement<IncXtendElemAType>(_BilPayPmtHistInqRqMTypeIncXtendElemArray_QNAME, IncXtendElemAType.class, BilPayPayeeInqRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<BilPayProdType> createBilPayPayeeSrchRsMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "SubId", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<SubIdType> createBilPayPayeeSrchRsMTypeSubId(SubIdType value) {
        return new JAXBElement<SubIdType>(_BilPayElecBilSchedInqRsMTypeSubId_QNAME, SubIdType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeCatNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeCatName", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<PayeeCatNameType> createBilPayPayeeSrchRsMTypePayeeCatName(PayeeCatNameType value) {
        return new JAXBElement<PayeeCatNameType>(_BilPayPayeeSrchRsMTypePayeeCatName_QNAME, PayeeCatNameType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclNonActType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ExclNonAct", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<ExclNonActType> createBilPayPayeeSrchRsMTypeExclNonAct(ExclNonActType value) {
        return new JAXBElement<ExclNonActType>(_BilPayPayeeSrchRsMTypeExclNonAct_QNAME, ExclNonActType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncDltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IncDlt", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<IncDltType> createBilPayPayeeSrchRsMTypeIncDlt(IncDltType value) {
        return new JAXBElement<IncDltType>(_BilPayPayeeSrchRsMTypeIncDlt_QNAME, IncDltType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayPayeeSrchArrayAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayPayeeSrchArray", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<BilPayPayeeSrchArrayAType> createBilPayPayeeSrchRsMTypeBilPayPayeeSrchArray(BilPayPayeeSrchArrayAType value) {
        return new JAXBElement<BilPayPayeeSrchArrayAType>(_BilPayPayeeSrchRsMTypeBilPayPayeeSrchArray_QNAME, BilPayPayeeSrchArrayAType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeSrchRsMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElecMerPayeeOnlyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecMerPayeeOnly", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<ElecMerPayeeOnlyType> createBilPayPayeeSrchRsMTypeElecMerPayeeOnly(ElecMerPayeeOnlyType value) {
        return new JAXBElement<ElecMerPayeeOnlyType>(_BilPayPayeeSrchRsMTypeElecMerPayeeOnly_QNAME, ElecMerPayeeOnlyType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "LastMainStartDt", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<StartDtType> createBilPayPayeeSrchRsMTypeLastMainStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayPayeeSrchRsMTypeLastMainStartDt_QNAME, StartDtType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "LastMainEndDt", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<EndDtType> createBilPayPayeeSrchRsMTypeLastMainEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayPayeeSrchRsMTypeLastMainEndDt_QNAME, EndDtType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CardPayFilter", scope = BilPayPayeeSrchRsMType.class)
    public JAXBElement<CardPayFilterType> createBilPayPayeeSrchRsMTypeCardPayFilter(CardPayFilterType value) {
        return new JAXBElement<CardPayFilterType>(_BilPayPmtHistSrchRsMTypeCardPayFilter_QNAME, CardPayFilterType.class, BilPayPayeeSrchRsMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilPayProdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "BilPayProd", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<BilPayProdType> createBilPayPayeeSrchRqMTypeBilPayProd(BilPayProdType value) {
        return new JAXBElement<BilPayProdType>(_BilPayElecBilSchedModRqMTypeBilPayProd_QNAME, BilPayProdType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayeeCatNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "PayeeCatName", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<PayeeCatNameType> createBilPayPayeeSrchRqMTypePayeeCatName(PayeeCatNameType value) {
        return new JAXBElement<PayeeCatNameType>(_BilPayPayeeSrchRsMTypePayeeCatName_QNAME, PayeeCatNameType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclNonActType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ExclNonAct", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<ExclNonActType> createBilPayPayeeSrchRqMTypeExclNonAct(ExclNonActType value) {
        return new JAXBElement<ExclNonActType>(_BilPayPayeeSrchRsMTypeExclNonAct_QNAME, ExclNonActType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncDltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "IncDlt", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<IncDltType> createBilPayPayeeSrchRqMTypeIncDlt(IncDltType value) {
        return new JAXBElement<IncDltType>(_BilPayPayeeSrchRsMTypeIncDlt_QNAME, IncDltType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomCType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "Custom", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<CustomCType> createBilPayPayeeSrchRqMTypeCustom(CustomCType value) {
        return new JAXBElement<CustomCType>(_BilPayPmtPayeeInfoCTypeCustom_QNAME, CustomCType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElecMerPayeeOnlyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "ElecMerPayeeOnly", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<ElecMerPayeeOnlyType> createBilPayPayeeSrchRqMTypeElecMerPayeeOnly(ElecMerPayeeOnlyType value) {
        return new JAXBElement<ElecMerPayeeOnlyType>(_BilPayPayeeSrchRsMTypeElecMerPayeeOnly_QNAME, ElecMerPayeeOnlyType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "LastMainStartDt", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<StartDtType> createBilPayPayeeSrchRqMTypeLastMainStartDt(StartDtType value) {
        return new JAXBElement<StartDtType>(_BilPayPayeeSrchRsMTypeLastMainStartDt_QNAME, StartDtType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "LastMainEndDt", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<EndDtType> createBilPayPayeeSrchRqMTypeLastMainEndDt(EndDtType value) {
        return new JAXBElement<EndDtType>(_BilPayPayeeSrchRsMTypeLastMainEndDt_QNAME, EndDtType.class, BilPayPayeeSrchRqMType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPayFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jackhenry.com/jxchange/TPG/2008", name = "CardPayFilter", scope = BilPayPayeeSrchRqMType.class)
    public JAXBElement<CardPayFilterType> createBilPayPayeeSrchRqMTypeCardPayFilter(CardPayFilterType value) {
        return new JAXBElement<CardPayFilterType>(_BilPayPmtHistSrchRsMTypeCardPayFilter_QNAME, CardPayFilterType.class, BilPayPayeeSrchRqMType.class, value);
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
