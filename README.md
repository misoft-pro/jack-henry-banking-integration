# Jack Henry Banking Integration via Generated SOAP Client

This repository provides a Spring Boot web application that integrates with the Jack Henry Enterprise SOAP API. It includes a RESTful controller that translates internal RESTful API requests into external SOAP web service calls, enabling seamless communication between modern RESTful clients and the legacy SOAP-based Jack Henry banking systems.

The project also includes detailed guide for generating a SOAP Java client from the WSDL web service contracts provided by the Jack Henry Enterprise SOAP API. By leveraging this generated client, the application ensures efficient and reliable interaction with Jack Henry's banking services.

---
## How to create SOAP java client from WSDL file

1. Install [Apache CXF](https://cxf.apache.org/download.html). Version 3.2.5 is tested.
2. Generate SOAP java client from wsdl files
   ```bash
   wsdl2java -client -verbose -autoNameResolution -d src/main/java -p pro.misoft.jackhenryintegration.generated.customer docs/API/TPG_Customer.wsdl
   wsdl2java -client -verbose -autoNameResolution -d src/main/java -p pro.misoft.jackhenryintegration.generated.deposit ./docs/API/TPG_Deposit.wsdl
   wsdl2java -client -verbose -autoNameResolution -d src/main/java -p pro.misoft.jackhenryintegration.generated.ach ./docs/API/TPG_ACH.wsdl
   wsdl2java -client -verbose -autoNameResolution -d src/main/java -p pro.misoft.jackhenryintegration.generated.billpay ./docs/API/TPG_BillPay.wsdl
   wsdl2java -client -verbose -autoNameResolution -d src/main/java -p pro.misoft.jackhenryintegration.generated.creditcard ./docs/API/TPG_CrCard.wsdl
   wsdl2java -client -verbose -autoNameResolution -d src/main/java -p pro.misoft.jackhenryintegration.generated.inquiry ./docs/API/TPG_Inquiry.wsdl
   wsdl2java -client -verbose -autoNameResolution -d src/main/java -p pro.misoft.jackhenryintegration.generated.transaction ./docs/API/TPG_Transaction.wsdl
   ```
3. Use generated SOAP clients such as `pro.misoft.jackhenryintegration.generated.inquiry.InquiryService_Service`, which is annotated with `@WebServiceClient`.   
  Take a look into client code usage example here `pro.misoft.jackhenryintegration.web.CustomerController` and here `pro.misoft.jackhenryintegration.generated.inquiry.InquiryService_InquiryServiceSoap_Client`.