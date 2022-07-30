package com.example.tourisim.dto;

import lombok.Data;

@Data
public class Controlnumberdtoall {
    private Long id;
    private String controlno;

    
    public Controlnumberdtoall(Long id, String controlno) {
        this.id = id;
        this.controlno = controlno;
    }
    public Controlnumberdtoall() {
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
