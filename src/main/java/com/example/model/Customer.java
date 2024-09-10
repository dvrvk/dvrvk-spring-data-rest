package com.example.model;

import jakarta.persistence.*;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name= "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String department;

    private String category;

    @OneToOne
    @JoinColumn(name = "address_id")
    @RestResource(path = "customer-address", rel = "address")
    private Address address;

    public Customer() {
    }

    public Customer(Long id, String email, String department, String category, Address address) {
        this.id = id;
        this.email = email;
        this.department = department;
        this.category = category;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", dept='" + department + '\'' +
                ", category='" + category + '\'' +
                ", address=" + address +
                '}';
    }
}
