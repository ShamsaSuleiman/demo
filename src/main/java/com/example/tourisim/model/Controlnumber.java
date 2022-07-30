package com.example.tourisim.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Controlnumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String controlno;
    
    public Controlnumber(Long id, String controlno) {
        this.id = id;
        this.controlno = controlno;
    }

    public Controlnumber() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getControlno() {
        return controlno;
    }

    public void setControlno(String controlno) {
        this.controlno = controlno;
    }

    
    
}
