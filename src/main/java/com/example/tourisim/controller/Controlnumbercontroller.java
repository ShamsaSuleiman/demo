package com.example.tourisim.controller;

import java.util.List;

import com.example.tourisim.dto.Controlnumberdto;
import com.example.tourisim.dto.Controlnumberdtoall;
import com.example.tourisim.model.Controlnumber;
import com.example.tourisim.repository.Controlnumberepository;
import com.example.tourisim.service.ControlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@CrossOrigin
@RestController
@RequestMapping("c")
@Data
public class Controlnumbercontroller {
    @Autowired
    private Controlnumberepository controlnumberepository;



    @Autowired
    private ControlService controlService;


    
@PostMapping("/Regcontrol")
public void createcontrol(@RequestBody Controlnumberdto Controlnumber){
    controlService.addControl(Controlnumber);
}

@GetMapping("/Viewcontrol")
public List<Controlnumberdtoall> getcontrol(){
    return controlService.getContr();
}

@GetMapping("/package/{id}")
public ResponseEntity<Controlnumber> getPackagebyId(@PathVariable long id){
 Controlnumber controlnumber=controlnumberepository.findById(id).orElseThrow();
 return ResponseEntity.ok(controlnumber);
}

@PutMapping("/edit")
public ResponseEntity<Controlnumber> editPackage(@RequestBody Controlnumber tourismpackages){
    Controlnumber editPackage= controlnumberepository.save(tourismpackages);
    return ResponseEntity.ok(editPackage);
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable long id ){
    controlnumberepository.deleteById(id);
}

@GetMapping("/control/{controlno}")
public Controlnumberdto control(@PathVariable("controlno") String controlno) {
    return controlService.control(controlno);
}

}

