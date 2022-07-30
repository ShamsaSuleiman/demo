package com.example.tourisim.repository;

import com.example.tourisim.model.Controlnumber;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Controlnumberepository  extends JpaRepository<Controlnumber,Long>{
    
    @Query(value = "select * from  Controlnumber where controlno=?1" ,nativeQuery = true)
    public Controlnumber controll(String controlno);

}

    


