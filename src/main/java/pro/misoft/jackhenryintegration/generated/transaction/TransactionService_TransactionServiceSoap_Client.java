
package pro.misoft.jackhenryintegration.generated.transaction;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2024-08-12T14:24:51.143+03:00
 * Generated source version: 3.2.5
 *
 */
public final class TransactionService_TransactionServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "TransactionService");

    private TransactionService_TransactionServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TransactionService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        TransactionService_Service ss = new TransactionService_Service(wsdlURL, SERVICE_NAME);
        TransactionService port = ss.getTransactionServiceSoap();

        {
        System.out.println("Invoking intlWireTrnAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.IntlWireTrnAddRqMType _intlWireTrnAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.IntlWireTrnAddRsMType _intlWireTrnAdd__return = port.intlWireTrnAdd(_intlWireTrnAdd_parameters);
            System.out.println("intlWireTrnAdd.result=" + _intlWireTrnAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking trnAddQuoteCan...");
        pro.misoft.jackhenryintegration.generated.transaction.TrnAddQuoteCanRqMType _trnAddQuoteCan_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.TrnAddQuoteCanRsMType _trnAddQuoteCan__return = port.trnAddQuoteCan(_trnAddQuoteCan_parameters);
            System.out.println("trnAddQuoteCan.result=" + _trnAddQuoteCan__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking trnAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.TrnAddRqMType _trnAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.TrnAddRsMType _trnAdd__return = port.trnAdd(_trnAdd_parameters);
            System.out.println("trnAdd.result=" + _trnAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking stopChkCan...");
        pro.misoft.jackhenryintegration.generated.transaction.StopChkCanRqMType _stopChkCan_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.StopChkCanRsMType _stopChkCan__return = port.stopChkCan(_stopChkCan_parameters);
            System.out.println("stopChkCan.result=" + _stopChkCan__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking issItemMultiAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.IssItemMultiAddRqMType _issItemMultiAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.IssItemMultiAddRsMType _issItemMultiAdd__return = port.issItemMultiAdd(_issItemMultiAdd_parameters);
            System.out.println("issItemMultiAdd.result=" + _issItemMultiAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking xferAddValidate...");
        pro.misoft.jackhenryintegration.generated.transaction.XferAddValidateRqMType _xferAddValidate_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.XferAddValidateRsMType _xferAddValidate__return = port.xferAddValidate(_xferAddValidate_parameters);
            System.out.println("xferAddValidate.result=" + _xferAddValidate__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking posPayItemMod...");
        pro.misoft.jackhenryintegration.generated.transaction.PosPayItemModRqMType _posPayItemMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PosPayItemModRsMType _posPayItemMod__return = port.posPayItemMod(_posPayItemMod_parameters);
            System.out.println("posPayItemMod.result=" + _posPayItemMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking wireTrnAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.WireTrnAddRqMType _wireTrnAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.WireTrnAddRsMType _wireTrnAdd__return = port.wireTrnAdd(_wireTrnAdd_parameters);
            System.out.println("wireTrnAdd.result=" + _wireTrnAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking svcFeeTrnMod...");
        pro.misoft.jackhenryintegration.generated.transaction.SvcFeeTrnModRqMType _svcFeeTrnMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.SvcFeeTrnModRsMType _svcFeeTrnMod__return = port.svcFeeTrnMod(_svcFeeTrnMod_parameters);
            System.out.println("svcFeeTrnMod.result=" + _svcFeeTrnMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pmtHubCrXferAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.PmtHubCrXferAddRqMType _pmtHubCrXferAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PmtHubCrXferAddRsMType _pmtHubCrXferAdd__return = port.pmtHubCrXferAdd(_pmtHubCrXferAdd_parameters);
            System.out.println("pmtHubCrXferAdd.result=" + _pmtHubCrXferAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctExcTrnMod...");
        pro.misoft.jackhenryintegration.generated.transaction.AcctExcTrnModRqMType _acctExcTrnMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.AcctExcTrnModRsMType _acctExcTrnMod__return = port.acctExcTrnMod(_acctExcTrnMod_parameters);
            System.out.println("acctExcTrnMod.result=" + _acctExcTrnMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctAnlysTrnAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.AcctAnlysTrnAddRqMType _acctAnlysTrnAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.AcctAnlysTrnAddRsMType _acctAnlysTrnAdd__return = port.acctAnlysTrnAdd(_acctAnlysTrnAdd_parameters);
            System.out.println("acctAnlysTrnAdd.result=" + _acctAnlysTrnAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking promoXferAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.PromoXferAddRqMType _promoXferAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PromoXferAddRsMType _promoXferAdd__return = port.promoXferAdd(_promoXferAdd_parameters);
            System.out.println("promoXferAdd.result=" + _promoXferAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking stopChkAddValidate...");
        pro.misoft.jackhenryintegration.generated.transaction.StopChkAddValidateRqMType _stopChkAddValidate_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.StopChkAddValidateRsMType _stopChkAddValidate__return = port.stopChkAddValidate(_stopChkAddValidate_parameters);
            System.out.println("stopChkAddValidate.result=" + _stopChkAddValidate__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctNSFTrnMod...");
        pro.misoft.jackhenryintegration.generated.transaction.AcctNSFTrnModRqMType _acctNSFTrnMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.AcctNSFTrnModRsMType _acctNSFTrnMod__return = port.acctNSFTrnMod(_acctNSFTrnMod_parameters);
            System.out.println("acctNSFTrnMod.result=" + _acctNSFTrnMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking xferMod...");
        pro.misoft.jackhenryintegration.generated.transaction.XferModRqMType _xferMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.XferModRsMType _xferMod__return = port.xferMod(_xferMod_parameters);
            System.out.println("xferMod.result=" + _xferMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking stopChkAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.StopChkAddRqMType _stopChkAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.StopChkAddRsMType _stopChkAdd__return = port.stopChkAdd(_stopChkAdd_parameters);
            System.out.println("stopChkAdd.result=" + _stopChkAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking trnAddValidate...");
        pro.misoft.jackhenryintegration.generated.transaction.TrnAddValidateRqMType _trnAddValidate_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.TrnAddValidateRsMType _trnAddValidate__return = port.trnAddValidate(_trnAddValidate_parameters);
            System.out.println("trnAddValidate.result=" + _trnAddValidate__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking safeDepPmtMod...");
        pro.misoft.jackhenryintegration.generated.transaction.SafeDepPmtModRqMType _safeDepPmtMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.SafeDepPmtModRsMType _safeDepPmtMod__return = port.safeDepPmtMod(_safeDepPmtMod_parameters);
            System.out.println("safeDepPmtMod.result=" + _safeDepPmtMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pmtHubPmtRqMod...");
        pro.misoft.jackhenryintegration.generated.transaction.PmtHubPmtRqModRqMType _pmtHubPmtRqMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PmtHubPmtRqModRsMType _pmtHubPmtRqMod__return = port.pmtHubPmtRqMod(_pmtHubPmtRqMod_parameters);
            System.out.println("pmtHubPmtRqMod.result=" + _pmtHubPmtRqMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking ping...");
        pro.misoft.jackhenryintegration.generated.transaction.PingRqMType _ping_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PingRsMType _ping__return = port.ping(_ping_parameters);
            System.out.println("ping.result=" + _ping__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking promoXferMod...");
        pro.misoft.jackhenryintegration.generated.transaction.PromoXferModRqMType _promoXferMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PromoXferModRsMType _promoXferMod__return = port.promoXferMod(_promoXferMod_parameters);
            System.out.println("promoXferMod.result=" + _promoXferMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking svcFeeTrnAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.SvcFeeTrnAddRqMType _svcFeeTrnAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.SvcFeeTrnAddRsMType _svcFeeTrnAdd__return = port.svcFeeTrnAdd(_svcFeeTrnAdd_parameters);
            System.out.println("svcFeeTrnAdd.result=" + _svcFeeTrnAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctReconItemMod...");
        pro.misoft.jackhenryintegration.generated.transaction.AcctReconItemModRqMType _acctReconItemMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.AcctReconItemModRsMType _acctReconItemMod__return = port.acctReconItemMod(_acctReconItemMod_parameters);
            System.out.println("acctReconItemMod.result=" + _acctReconItemMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking trnAddQuoteComm...");
        pro.misoft.jackhenryintegration.generated.transaction.TrnAddQuoteCommRqMType _trnAddQuoteComm_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.TrnAddQuoteCommRsMType _trnAddQuoteComm__return = port.trnAddQuoteComm(_trnAddQuoteComm_parameters);
            System.out.println("trnAddQuoteComm.result=" + _trnAddQuoteComm__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking trnMod...");
        pro.misoft.jackhenryintegration.generated.transaction.TrnModRqMType _trnMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.TrnModRsMType _trnMod__return = port.trnMod(_trnMod_parameters);
            System.out.println("trnMod.result=" + _trnMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pmtHubCrXferMod...");
        pro.misoft.jackhenryintegration.generated.transaction.PmtHubCrXferModRqMType _pmtHubCrXferMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PmtHubCrXferModRsMType _pmtHubCrXferMod__return = port.pmtHubCrXferMod(_pmtHubCrXferMod_parameters);
            System.out.println("pmtHubCrXferMod.result=" + _pmtHubCrXferMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking trnAddQuote...");
        pro.misoft.jackhenryintegration.generated.transaction.TrnAddQuoteRqMType _trnAddQuote_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.TrnAddQuoteRsMType _trnAddQuote__return = port.trnAddQuote(_trnAddQuote_parameters);
            System.out.println("trnAddQuote.result=" + _trnAddQuote__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking xferAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.XferAddRqMType _xferAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.XferAddRsMType _xferAdd__return = port.xferAdd(_xferAdd_parameters);
            System.out.println("xferAdd.result=" + _xferAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking stopChkMod...");
        pro.misoft.jackhenryintegration.generated.transaction.StopChkModRqMType _stopChkMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.StopChkModRsMType _stopChkMod__return = port.stopChkMod(_stopChkMod_parameters);
            System.out.println("stopChkMod.result=" + _stopChkMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pmtHubPmtRqAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.PmtHubPmtRqAddRqMType _pmtHubPmtRqAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.PmtHubPmtRqAddRsMType _pmtHubPmtRqAdd__return = port.pmtHubPmtRqAdd(_pmtHubPmtRqAdd_parameters);
            System.out.println("pmtHubPmtRqAdd.result=" + _pmtHubPmtRqAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking wireTrnAddValidate...");
        pro.misoft.jackhenryintegration.generated.transaction.WireTrnAddValidateRqMType _wireTrnAddValidate_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.WireTrnAddValidateRsMType _wireTrnAddValidate__return = port.wireTrnAddValidate(_wireTrnAddValidate_parameters);
            System.out.println("wireTrnAddValidate.result=" + _wireTrnAddValidate__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctAnlysTrnMod...");
        pro.misoft.jackhenryintegration.generated.transaction.AcctAnlysTrnModRqMType _acctAnlysTrnMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.AcctAnlysTrnModRsMType _acctAnlysTrnMod__return = port.acctAnlysTrnMod(_acctAnlysTrnMod_parameters);
            System.out.println("acctAnlysTrnMod.result=" + _acctAnlysTrnMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking safeDepPmtAdd...");
        pro.misoft.jackhenryintegration.generated.transaction.SafeDepPmtAddRqMType _safeDepPmtAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.transaction.SafeDepPmtAddRsMType _safeDepPmtAdd__return = port.safeDepPmtAdd(_safeDepPmtAdd_parameters);
            System.out.println("safeDepPmtAdd.result=" + _safeDepPmtAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
