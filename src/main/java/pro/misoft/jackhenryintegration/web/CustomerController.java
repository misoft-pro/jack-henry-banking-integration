package pro.misoft.jackhenryintegration.web;

import jakarta.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.misoft.jackhenryintegration.generated.customer.*;

import javax.xml.namespace.QName;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public CustAddRsMType addCustomer(@RequestBody CustomerRequest customerDetails) {
        CustAddRqMType request = convertToSoapRequest(customerDetails);

        try {
            // Call the SOAP method
            return customerService.custAdd(request);
        } catch (Exception e) {
            // Handle exceptions, e.g., MessageFault
            throw new RuntimeException("Failed to add customer: " + e.getMessage(), e);
        }
    }

    private CustAddRqMType convertToSoapRequest(CustomerRequest request) {
        // Convert the incoming customer details to the SOAP request object
        CustAddRqMType soapRequest = new CustAddRqMType();
        CustDetailCType custDetailCType = new CustDetailCType();
        PersonNameCType personNameCType = new PersonNameCType();

        FirstNameType firstNameType = new FirstNameType();
        firstNameType.setValue(request.getFirstName());
        JAXBElement<FirstNameType> jaxbElement = new JAXBElement<>(
                new QName("http://jackhenry.com/jxchange/TPG/2008", "FirstName"),
                FirstNameType.class,
                firstNameType
        );

        personNameCType.setFirstName(jaxbElement);

        // Add more fields

        custDetailCType.setPersonName(personNameCType);
        soapRequest.setCustDetail(custDetailCType);

        return soapRequest;
    }
}
