package com.example.tourisim.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.example.tourisim.dto.TourismpackagesDto;
import com.example.tourisim.dto.TourismpackagesDtoall;
import com.example.tourisim.model.Tourismpackages;
import com.example.tourisim.repository.Tourismpackagerepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data

public class Tourismpackegasservice {
    private final ModelMapper mapper;
    private final  Tourismpackagerepository tourismpackagerepository;
    public Tourismpackegasservice(ModelMapper mapper, Tourismpackagerepository tourismpackagerepository) {
        this.mapper = mapper;
        this.tourismpackagerepository = tourismpackagerepository;
    }
    public void addPackage(TourismpackagesDto tourismpackagesDto) throws IOException {
        Tourismpackages tourismpackages = mapper.map(tourismpackagesDto, Tourismpackages.class);
        tourismpackages.setImage(Base64.getEncoder().encodeToString(tourismpackagesDto.getImage().getBytes()));
        tourismpackagerepository.save(tourismpackages);
    }

    public List<TourismpackagesDtoall> getAllPackage() {
        List<Tourismpackages> tourismpackagese = tourismpackagerepository.findAll();
        List<TourismpackagesDtoall> tourismDtos = new ArrayList<>();
        for (Tourismpackages tourismpackages : tourismpackagese) {
            tourismDtos.add(mapper.map(tourismpackages, TourismpackagesDtoall.class));
        

        }
        return tourismDtos;
    }


    public int getTotalCost(){
        return tourismpackagerepository.getTotalCost();
    }
    

    
}
