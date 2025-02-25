package com.javatechie.spring_web_flux.router;

import com.javatechie.spring_web_flux.dao.CustomerDao;
import com.javatechie.spring_web_flux.handler.CustomerHandler;
import com.javatechie.spring_web_flux.handler.CustomerStreamHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Autowired
    private CustomerHandler customerHandler;

    @Autowired
    private CustomerStreamHandler customerStreamHandler;



    @Bean
    public RouterFunction<ServerResponse> routerFunction(){
        return RouterFunctions.route()
                .GET("/router/customers",serverRequest->customerHandler.loadCustomers(serverRequest))
                .GET("/router/customers/stream",serverRequest->customerStreamHandler.loadCustomerStream(serverRequest))
                .GET("/router/customers/{id}",serverRequest->customerHandler.findCustomerById(serverRequest))
                .POST("/router/customers/save",serverRequest->customerHandler.saveCustomer(serverRequest))
                .build();
    }
}
