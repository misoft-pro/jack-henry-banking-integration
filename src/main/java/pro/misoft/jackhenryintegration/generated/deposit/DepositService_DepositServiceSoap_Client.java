
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * 2024-08-12T14:24:25.476+03:00
 * Generated source version: 3.2.5
 *
 */
public final class DepositService_DepositServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "DepositService");

    private DepositService_DepositServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DepositService_Service.WSDL_LOCATION;
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

        DepositService_Service ss = new DepositService_Service(wsdlURL, SERVICE_NAME);
        DepositService port = ss.getDepositServiceSoap();

        {
        System.out.println("Invoking taxPlnAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.TaxPlnAddRqMType _taxPlnAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.TaxPlnAddRsMType _taxPlnAdd__return = port.taxPlnAdd(_taxPlnAdd_parameters);
            System.out.println("taxPlnAdd.result=" + _taxPlnAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctProdOvrrdMod...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctProdOvrrdModRqMType _acctProdOvrrdMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctProdOvrrdModRsMType _acctProdOvrrdMod__return = port.acctProdOvrrdMod(_acctProdOvrrdMod_parameters);
            System.out.println("acctProdOvrrdMod.result=" + _acctProdOvrrdMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking taxPlnBenfAddValidate...");
        pro.misoft.jackhenryintegration.generated.deposit.TaxPlnBenfAddValidateRqMType _taxPlnBenfAddValidate_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.TaxPlnBenfAddValidateRsMType _taxPlnBenfAddValidate__return = port.taxPlnBenfAddValidate(_taxPlnBenfAddValidate_parameters);
            System.out.println("taxPlnBenfAddValidate.result=" + _taxPlnBenfAddValidate__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking safeDepAuditAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.SafeDepAuditAddRqMType _safeDepAuditAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.SafeDepAuditAddRsMType _safeDepAuditAdd__return = port.safeDepAuditAdd(_safeDepAuditAdd_parameters);
            System.out.println("safeDepAuditAdd.result=" + _safeDepAuditAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctAddValidate...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctAddValidateRqMType _acctAddValidate_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctAddValidateRsMType _acctAddValidate__return = port.acctAddValidate(_acctAddValidate_parameters);
            System.out.println("acctAddValidate.result=" + _acctAddValidate__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pltfmStatMod...");
        pro.misoft.jackhenryintegration.generated.deposit.PltfmStatModRqMType _pltfmStatMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.PltfmStatModRsMType _pltfmStatMod__return = port.pltfmStatMod(_pltfmStatMod_parameters);
            System.out.println("pltfmStatMod.result=" + _pltfmStatMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctAddRqMType _acctAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctAddRsMType _acctAdd__return = port.acctAdd(_acctAdd_parameters);
            System.out.println("acctAdd.result=" + _acctAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctAnlysMod...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctAnlysModRqMType _acctAnlysMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctAnlysModRsMType _acctAnlysMod__return = port.acctAnlysMod(_acctAnlysMod_parameters);
            System.out.println("acctAnlysMod.result=" + _acctAnlysMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking taxPlnBenfMod...");
        pro.misoft.jackhenryintegration.generated.deposit.TaxPlnBenfModRqMType _taxPlnBenfMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.TaxPlnBenfModRsMType _taxPlnBenfMod__return = port.taxPlnBenfMod(_taxPlnBenfMod_parameters);
            System.out.println("taxPlnBenfMod.result=" + _taxPlnBenfMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking taxPlnBenfAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.TaxPlnBenfAddRqMType _taxPlnBenfAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.TaxPlnBenfAddRsMType _taxPlnBenfAdd__return = port.taxPlnBenfAdd(_taxPlnBenfAdd_parameters);
            System.out.println("taxPlnBenfAdd.result=" + _taxPlnBenfAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking wireTmpltMod...");
        pro.misoft.jackhenryintegration.generated.deposit.WireTmpltModRqMType _wireTmpltMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.WireTmpltModRsMType _wireTmpltMod__return = port.wireTmpltMod(_wireTmpltMod_parameters);
            System.out.println("wireTmpltMod.result=" + _wireTmpltMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctBenfMod...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctBenfModRqMType _acctBenfMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctBenfModRsMType _acctBenfMod__return = port.acctBenfMod(_acctBenfMod_parameters);
            System.out.println("acctBenfMod.result=" + _acctBenfMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctCombStmtAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctCombStmtAddRqMType _acctCombStmtAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctCombStmtAddRsMType _acctCombStmtAdd__return = port.acctCombStmtAdd(_acctCombStmtAdd_parameters);
            System.out.println("acctCombStmtAdd.result=" + _acctCombStmtAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking timeDepRenOvrrd...");
        pro.misoft.jackhenryintegration.generated.deposit.TimeDepRenOvrrdRqMType _timeDepRenOvrrd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.TimeDepRenOvrrdRsMType _timeDepRenOvrrd__return = port.timeDepRenOvrrd(_timeDepRenOvrrd_parameters);
            System.out.println("timeDepRenOvrrd.result=" + _timeDepRenOvrrd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctSweepAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctSweepAddRqMType _acctSweepAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctSweepAddRsMType _acctSweepAdd__return = port.acctSweepAdd(_acctSweepAdd_parameters);
            System.out.println("acctSweepAdd.result=" + _acctSweepAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pltfmAppInq...");
        pro.misoft.jackhenryintegration.generated.deposit.PltfmAppInqRqMType _pltfmAppInq_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.PltfmAppInqRsMType _pltfmAppInq__return = port.pltfmAppInq(_pltfmAppInq_parameters);
            System.out.println("pltfmAppInq.result=" + _pltfmAppInq__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pltfmAppSrch...");
        pro.misoft.jackhenryintegration.generated.deposit.PltfmAppSrchRqMType _pltfmAppSrch_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.PltfmAppSrchRsMType _pltfmAppSrch__return = port.pltfmAppSrch(_pltfmAppSrch_parameters);
            System.out.println("pltfmAppSrch.result=" + _pltfmAppSrch__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking ping...");
        pro.misoft.jackhenryintegration.generated.deposit.PingRqMType _ping_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.PingRsMType _ping__return = port.ping(_ping_parameters);
            System.out.println("ping.result=" + _ping__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctProdOvrrdAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctProdOvrrdAddRqMType _acctProdOvrrdAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctProdOvrrdAddRsMType _acctProdOvrrdAdd__return = port.acctProdOvrrdAdd(_acctProdOvrrdAdd_parameters);
            System.out.println("acctProdOvrrdAdd.result=" + _acctProdOvrrdAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pltfmAppAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.PltfmAppAddRqMType _pltfmAppAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.PltfmAppAddRsMType _pltfmAppAdd__return = port.pltfmAppAdd(_pltfmAppAdd_parameters);
            System.out.println("pltfmAppAdd.result=" + _pltfmAppAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking taxPlnMod...");
        pro.misoft.jackhenryintegration.generated.deposit.TaxPlnModRqMType _taxPlnMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.TaxPlnModRsMType _taxPlnMod__return = port.taxPlnMod(_taxPlnMod_parameters);
            System.out.println("taxPlnMod.result=" + _taxPlnMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctMod...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctModRqMType _acctMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctModRsMType _acctMod__return = port.acctMod(_acctMod_parameters);
            System.out.println("acctMod.result=" + _acctMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctAnlysAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctAnlysAddRqMType _acctAnlysAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctAnlysAddRsMType _acctAnlysAdd__return = port.acctAnlysAdd(_acctAnlysAdd_parameters);
            System.out.println("acctAnlysAdd.result=" + _acctAnlysAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctBenfAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctBenfAddRqMType _acctBenfAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctBenfAddRsMType _acctBenfAdd__return = port.acctBenfAdd(_acctBenfAdd_parameters);
            System.out.println("acctBenfAdd.result=" + _acctBenfAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctCombStmtMod...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctCombStmtModRqMType _acctCombStmtMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctCombStmtModRsMType _acctCombStmtMod__return = port.acctCombStmtMod(_acctCombStmtMod_parameters);
            System.out.println("acctCombStmtMod.result=" + _acctCombStmtMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctSweepMod...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctSweepModRqMType _acctSweepMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctSweepModRsMType _acctSweepMod__return = port.acctSweepMod(_acctSweepMod_parameters);
            System.out.println("acctSweepMod.result=" + _acctSweepMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking taxPlnAddValidate...");
        pro.misoft.jackhenryintegration.generated.deposit.TaxPlnAddValidateRqMType _taxPlnAddValidate_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.TaxPlnAddValidateRsMType _taxPlnAddValidate__return = port.taxPlnAddValidate(_taxPlnAddValidate_parameters);
            System.out.println("taxPlnAddValidate.result=" + _taxPlnAddValidate__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking wireTmpltAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.WireTmpltAddRqMType _wireTmpltAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.WireTmpltAddRsMType _wireTmpltAdd__return = port.wireTmpltAdd(_wireTmpltAdd_parameters);
            System.out.println("wireTmpltAdd.result=" + _wireTmpltAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking pltfmStatInq...");
        pro.misoft.jackhenryintegration.generated.deposit.PltfmStatInqRqMType _pltfmStatInq_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.PltfmStatInqRsMType _pltfmStatInq__return = port.pltfmStatInq(_pltfmStatInq_parameters);
            System.out.println("pltfmStatInq.result=" + _pltfmStatInq__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking acctCommAdd...");
        pro.misoft.jackhenryintegration.generated.deposit.AcctCommAddRqMType _acctCommAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.deposit.AcctCommAddRsMType _acctCommAdd__return = port.acctCommAdd(_acctCommAdd_parameters);
            System.out.println("acctCommAdd.result=" + _acctCommAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
