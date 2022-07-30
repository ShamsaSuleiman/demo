package com.example.tourisim.controller;
import java.util.List;

import com.example.tourisim.dto.Order;
import com.example.tourisim.dto.TouristorderDto;

import com.example.tourisim.model.Touristorder;

import com.example.tourisim.repository.Touristorderrepository;
import com.example.tourisim.service.Touristorderservice;
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
@RequestMapping("Touristorder")
@Data
public class Touristordercontroller {
    @Autowired
    private Touristorderrepository touristorderrepository;

    @Autowired
    private  Touristorderservice touristorderservice;
    
    
    @GetMapping("/")
    public Touristorderrepository getTouristorderrepository() {
        return touristorderrepository;
    }

    public void setTouristorderrepository(Touristorderrepository touristorderrepository) {
        this.touristorderrepository = touristorderrepository;
    }

    public Touristorderservice getTouristorderservice() {
        return touristorderservice;
    }

    public void setTourismpackegasservice(Touristorderservice touristorderservice) {
        this.touristorderservice = touristorderservice;
    }

    @PostMapping("/addOrder")
    public Touristorder addOrder(@RequestBody TouristorderDto touristorderDto){
        return touristorderservice.addorder(touristorderDto);
    }

   
    
    @GetMapping("/Vieworder")
    public List<Order> getOrder(){
        return touristorderservice.getalloOrders();

    }
    @GetMapping("/customerdetails/cust_id/{customerid}/p_id/{packageid}")
    public Order getoderssss(@PathVariable("customerid")Long customerid,@PathVariable("packageid")Long packageid){
        return touristorderservice.getoderssss(customerid, packageid);
    }



    

    
}
