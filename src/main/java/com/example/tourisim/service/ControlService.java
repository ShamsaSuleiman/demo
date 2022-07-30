package com.example.tourisim.service;

import java.util.ArrayList;
import java.util.List;

import com.example.tourisim.dto.Controlnumberdto;
import com.example.tourisim.dto.Controlnumberdtoall;
import com.example.tourisim.model.Controlnumber;
import com.example.tourisim.repository.Controlnumberepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ControlService {
    private final ModelMapper mapper;
    private  final Controlnumberepository controlnumberepository;
    



    public ControlService(ModelMapper mapper, Controlnumberepository controlnumberepository) {
        this.mapper = mapper;
        this.controlnumberepository = controlnumberepository;
    }
    public void addControl(Controlnumberdto controlnumberdto) {
        Controlnumber controlnumber = mapper.map(controlnumberdto, Controlnumber.class);
        controlnumberepository.save(controlnumber);
    }
    public List<Controlnumberdtoall> getContr() {
        List<Controlnumber> controlno = controlnumberepository.findAll();
        List<Controlnumberdtoall> control = new ArrayList<>();
        for (Controlnumber controlnumber : controlno) {
            control.add(mapper.map(controlnumber, Controlnumberdtoall.class));
        

        }
        return control;
    }

    public List<Controlnumberdtoall> getAllControl() {
        return null;
    }
    public Controlnumberdto control(String controlno){
        return mapper.map( controlnumberepository.controll(controlno),Controlnumberdto.class);
    } 

    
}

    

