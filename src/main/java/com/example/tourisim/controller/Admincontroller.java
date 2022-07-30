package com.example.tourisim.controller;

import com.example.tourisim.model.Admin;

import com.example.tourisim.service.Adminservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@CrossOrigin
@RestController
@RequestMapping("admin")
@Data
public class Admincontroller {

   

    @Autowired
    private Adminservice adminservice;
    
    @GetMapping("/login/email/{email}/password/{password}")
     public Admin logins(@PathVariable("email") String email,@PathVariable("password")String password) {
         return adminservice.login(email, password);
     }
}



    

