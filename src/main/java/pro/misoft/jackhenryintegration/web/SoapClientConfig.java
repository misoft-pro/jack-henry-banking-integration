package pro.misoft.jackhenryintegration.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.misoft.jackhenryintegration.generated.customer.CustomerService;
import pro.misoft.jackhenryintegration.generated.customer.CustomerService_Service;

@Configuration
public class SoapClientConfig {

    @Bean
    public CustomerService customerService() {
        // Create the SOAP client proxy
        CustomerService_Service service = new CustomerService_Service();
        return service.getCustomerServiceSoap();
    }
}

