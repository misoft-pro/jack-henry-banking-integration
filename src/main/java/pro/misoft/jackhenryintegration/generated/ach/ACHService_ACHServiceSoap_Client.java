
package pro.misoft.jackhenryintegration.generated.ach;

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
 * 2024-08-12T14:24:28.189+03:00
 * Generated source version: 3.2.5
 *
 */
public final class ACHService_ACHServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://jackhenry.com/jxchange/TPG/2008", "ACHService");

    private ACHService_ACHServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ACHService_Service.WSDL_LOCATION;
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

        ACHService_Service ss = new ACHService_Service(wsdlURL, SERVICE_NAME);
        ACHService port = ss.getACHServiceSoap();

        {
        System.out.println("Invoking achFltrInq...");
        pro.misoft.jackhenryintegration.generated.ach.ACHFltrInqRqMType _achFltrInq_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHFltrInqRsMType _achFltrInq__return = port.achFltrInq(_achFltrInq_parameters);
            System.out.println("achFltrInq.result=" + _achFltrInq__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achFileAdd...");
        pro.misoft.jackhenryintegration.generated.ach.ACHFileAddRqMType _achFileAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHFileAddRsMType _achFileAdd__return = port.achFileAdd(_achFileAdd_parameters);
            System.out.println("achFileAdd.result=" + _achFileAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achRetNOCSrch...");
        pro.misoft.jackhenryintegration.generated.ach.ACHRetNOCSrchRqMType _achRetNOCSrch_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHRetNOCSrchRsMType _achRetNOCSrch__return = port.achRetNOCSrch(_achRetNOCSrch_parameters);
            System.out.println("achRetNOCSrch.result=" + _achRetNOCSrch__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achFltrAdd...");
        pro.misoft.jackhenryintegration.generated.ach.ACHFltrAddRqMType _achFltrAdd_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHFltrAddRsMType _achFltrAdd__return = port.achFltrAdd(_achFltrAdd_parameters);
            System.out.println("achFltrAdd.result=" + _achFltrAdd__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achFileInq...");
        pro.misoft.jackhenryintegration.generated.ach.ACHFileInqRqMType _achFileInq_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHFileInqRsMType _achFileInq__return = port.achFileInq(_achFileInq_parameters);
            System.out.println("achFileInq.result=" + _achFileInq__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achCompMod...");
        pro.misoft.jackhenryintegration.generated.ach.ACHCompModRqMType _achCompMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHCompModRsMType _achCompMod__return = port.achCompMod(_achCompMod_parameters);
            System.out.println("achCompMod.result=" + _achCompMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achRetNOCInq...");
        pro.misoft.jackhenryintegration.generated.ach.ACHRetNOCInqRqMType _achRetNOCInq_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHRetNOCInqRsMType _achRetNOCInq__return = port.achRetNOCInq(_achRetNOCInq_parameters);
            System.out.println("achRetNOCInq.result=" + _achRetNOCInq__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achFltrMod...");
        pro.misoft.jackhenryintegration.generated.ach.ACHFltrModRqMType _achFltrMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHFltrModRsMType _achFltrMod__return = port.achFltrMod(_achFltrMod_parameters);
            System.out.println("achFltrMod.result=" + _achFltrMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking achFileMod...");
        pro.misoft.jackhenryintegration.generated.ach.ACHFileModRqMType _achFileMod_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.ACHFileModRsMType _achFileMod__return = port.achFileMod(_achFileMod_parameters);
            System.out.println("achFileMod.result=" + _achFileMod__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking ping...");
        pro.misoft.jackhenryintegration.generated.ach.PingRqMType _ping_parameters = null;
        try {
            pro.misoft.jackhenryintegration.generated.ach.PingRsMType _ping__return = port.ping(_ping_parameters);
            System.out.println("ping.result=" + _ping__return);

        } catch (MessageFault e) {
            System.out.println("Expected exception: MessageFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
