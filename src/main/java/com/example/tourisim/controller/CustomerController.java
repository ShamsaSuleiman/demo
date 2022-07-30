package com.example.tourisim.controller;

import java.util.List;

import com.example.tourisim.dto.CustomerAllDto;
import com.example.tourisim.dto.CustomerDto;
import com.example.tourisim.model.Customer;
import com.example.tourisim.repository.CustomerRepository;
import com.example.tourisim.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.Data;

@CrossOrigin
@RestController
@RequestMapping("customer")
@Data
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;
    
    
    @GetMapping("/customer")
    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/Regcustomer")
    public Customer createcustomer(@RequestBody CustomerDto customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/Viewcustomer")
    public List<CustomerAllDto> getCustomeModele(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/login/email/{email}/password/{password}")
     public CustomerAllDto login(@PathVariable("email") String email,@PathVariable("password")String password) {
         return customerService.login(email, password);
     }
}