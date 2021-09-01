package com.nepsecafe.maverick.service;

import com.nepsecafe.maverick.model.Customer;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CustomerService {
    public List<Customer> getCustomers(){
        return List.of(new Customer(
                1L,
                "Om",
                " Narayan Singh",
                "sangam.ale.sa63@gmail.com",
                "9860026839",
                "Maverick Corp."
        ));
    }
}
