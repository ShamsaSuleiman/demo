package com.example.tourisim.controller;

import java.io.IOException;
import java.util.List;
import com.example.tourisim.dto.TourismpackagesDto;
import com.example.tourisim.dto.TourismpackagesDtoall;
import com.example.tourisim.model.Tourismpackages;
import com.example.tourisim.repository.Tourismpackagerepository;
import com.example.tourisim.service.Tourismpackegasservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@CrossOrigin
@RestController
@RequestMapping("tourismpackegasAPI")
@Data
public class tourismpackegascontroller {
    @Autowired
    private Tourismpackagerepository tourismpackagerepository;

    public Tourismpackagerepository getTourismpackagerepository() {
        return tourismpackagerepository;
    }

    public void setTourismpackagerepository(Tourismpackagerepository tourismpackagerepository) {
        this.tourismpackagerepository = tourismpackagerepository;
    }

    public Tourismpackegasservice getTourismpackegasservice() {
        return tourismpackegasservice;
    }

    public void setTourismpackegasservice(Tourismpackegasservice tourismpackegasservice) {
        this.tourismpackegasservice = tourismpackegasservice;
    }

    @Autowired
    private Tourismpackegasservice tourismpackegasservice;

    @PostMapping("/Regpackages")
    public void createpackegas(@ModelAttribute TourismpackagesDto tourismpackages) throws IOException {
        tourismpackegasservice.addPackage(tourismpackages);
    }

    @GetMapping("/Viewpackages")
    public List<TourismpackagesDtoall> getpackegas() {
        return tourismpackegasservice.getAllPackage();
    }

    @GetMapping("/package/{id}")
    public ResponseEntity<Tourismpackages> getPackagebyId(@PathVariable long id) {
        Tourismpackages tourismpackages = tourismpackagerepository.findById(id).orElseThrow();
        return ResponseEntity.ok(tourismpackages);
    }

    @PutMapping("/edit")
    public ResponseEntity<Tourismpackages> editPackage(@RequestBody Tourismpackages tourismpackages) {
        Tourismpackages editPackage = tourismpackagerepository.save(tourismpackages);
        return ResponseEntity.ok(editPackage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        tourismpackagerepository.deleteById(id);
    }

    @GetMapping("/getTotalCost")
    public int getTotalCost(){
        return tourismpackagerepository.getTotalCost();
    }

}