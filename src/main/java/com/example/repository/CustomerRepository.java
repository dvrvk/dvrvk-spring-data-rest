package com.example.repository;

import com.example.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Esto es mi repositorio y controlador a la vez
    // Entrar en http://localhost:8080 para descubrir las URLs

    // Filtrar por email - http://localhost:8080/customers/search/findByEmail?email=cust1@gmail.com
    List<Customer> findByEmail(String email);

    // Filtrar por email - http://localhost:8080/customers/search/findByEmailStartsWith?email=cust1@gmail.com
    // Para acortar el nombre email-start
    @RestResource(path = "email-starts", rel = "email-starts")
    List<Customer> findByEmailStartsWith(String email);

    // http://localhost:8080/customers/search/category-department?category=cat1&department=dep2
    @RestResource(path = "category-department", rel = "category-department")
    List<Customer> findByCategoryAndDepartment(String category, String department);

    // http://localhost:8080/customers/search/category-department-in?category=cat2&department=dep1&department=dep2
    @RestResource(path = "category-department-in", rel = "category-department-in")
    List<Customer> findByCategoryAndDepartmentIn(String category, List<String> department);
}
