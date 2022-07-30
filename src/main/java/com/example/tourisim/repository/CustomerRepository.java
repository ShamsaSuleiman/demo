package com.example.tourisim.repository;

import com.example.tourisim.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

    @Query(value = "select * from  Customer where email=?1 and password=?2",nativeQuery = true)
    public Customer loginCustomer(String email,String password);
    
}
