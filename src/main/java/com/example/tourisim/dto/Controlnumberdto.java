package com.example.tourisim.dto;

import lombok.Data;

@Data
public class Controlnumberdto {
    private String controlno;

    
    
    public Controlnumberdto() {
    }

    public Controlnumberdto(String controlno) {
        this.controlno = controlno;
    }

    public String getControlno() {
        return controlno;
    }

    public void setControlno(String controlno) {
        this.controlno = controlno;
    }

    
    
}
