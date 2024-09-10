package com.example.handler;

import com.example.model.Customer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class CustomerEventHandler {
    //Existen diferentes handlers
    @HandleBeforeCreate
    public void handlerCustomerBeforeCreate(Customer customer) {
        // Por ejemplo introducir una fecha de creacion
        System.out.println("HandleBeforeCreate " + customer);
    }
}
