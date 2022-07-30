package com.example.tourisim.service;

import com.example.tourisim.dto.CustomerAllDto;
import com.example.tourisim.dto.CustomerDto;
import com.example.tourisim.model.Customer;
import com.example.tourisim.repository.CustomerRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final ModelMapper mapper;

    public CustomerService(CustomerRepository customerRepository, ModelMapper mapper) {
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }

    public Customer addCustomer(CustomerDto customerDto) {
        Customer customer = mapper.map(customerDto, Customer.class);
        return customerRepository.save(customer);
    }

    public List<CustomerAllDto> getAllCustomer() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerAllDto> customersDtos = new ArrayList<>();
        for (Customer customer : customers) {
            customersDtos.add(mapper.map(customer, CustomerAllDto.class));
            

        }
        return customersDtos;
    }

    public CustomerAllDto login(String email,String password){
        return mapper.map( customerRepository.loginCustomer(email, password),CustomerAllDto.class);
    }

}

