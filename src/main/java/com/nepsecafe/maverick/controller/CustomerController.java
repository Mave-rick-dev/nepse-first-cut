package com.nepsecafe.maverick.controller;

import com.nepsecafe.maverick.model.Customer;
import com.nepsecafe.maverick.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vi/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    @GetMapping
    public List<Customer> getStudents(){
        return customerService.getCustomers();
    }
}
