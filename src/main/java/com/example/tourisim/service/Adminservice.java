package com.example.tourisim.service;

import java.nio.charset.StandardCharsets;

import com.example.tourisim.Encryption;
import com.example.tourisim.model.Admin;
import com.example.tourisim.repository.Loginrepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Service
@AllArgsConstructor

public class Adminservice {
    private final ModelMapper mapper;
    private final Loginrepository loginrepository;
    public Adminservice(ModelMapper mapper, Loginrepository loginrepository) {
        this.mapper = mapper;
        this.loginrepository = loginrepository;
    }
    public ModelMapper getMapper() {
        return mapper;
    }
    public Loginrepository getLoginrepository() {
        return loginrepository;
    }
    public Admin login(String email,String password){
        byte[] shaIBytes = Encryption.digest(password.getBytes(StandardCharsets.UTF_8));
        String pass=Encryption.bytesToMax(shaIBytes);
        System.out.print(pass);
        return loginrepository.loginAdmin(email, pass);
    }
    
    
}
