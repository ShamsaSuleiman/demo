package com.example.tourisim.repository;

import com.example.tourisim.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface Loginrepository extends JpaRepository <Admin,Long>{
    @Query(value = "select * from  admin where email=?1 and password=?2",nativeQuery = true)
    public Admin loginAdmin(String email,String password);
    
}
