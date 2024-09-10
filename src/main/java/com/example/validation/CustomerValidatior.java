package com.example.validation;

import com.example.model.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CustomerValidatior implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        // Filtro solo funciona para esa clase
        return Customer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Casteas el objeto
        if(target instanceof Customer customer) {
            if(customer.getCategory().isEmpty()) {
                errors.reject("category", "category.blank");
            }
        }
    }
}
