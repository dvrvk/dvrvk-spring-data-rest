package com.example.config;

import com.example.validation.CustomerValidatior;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ValidationConfig implements RepositoryRestConfigurer {
    @Override
    public void configureValidatingRepositoryEventListener(
            ValidatingRepositoryEventListener listener) {
        // Lo configuro
        listener.addValidator("beforeCreate", new CustomerValidatior());
    }
}
