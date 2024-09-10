package com.example.repository;

import com.example.model.Address;
import com.example.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends JpaRepository<Address, Long> {
    // Esto es mi repositorio y controlador a la vez
    // Entrar en http://localhost:8080 para descubrir las URLs


}
