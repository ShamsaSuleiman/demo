package com.example.tourisim.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.tourisim.dto.Order;
import com.example.tourisim.dto.TouristorderDto;
import com.example.tourisim.dto.TouristorderDtoAll;
import com.example.tourisim.model.Customer;
import com.example.tourisim.model.Tourismpackages;
import com.example.tourisim.model.Touristorder;
import com.example.tourisim.repository.Touristorderrepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Service
@AllArgsConstructor
public class Touristorderservice {
    @Autowired
    private final Touristorderrepository touristorderrepository;
    private final ModelMapper mapper;

    public Touristorderservice(Touristorderrepository touristorderrepository, ModelMapper mapper) {
        this.touristorderrepository = touristorderrepository;
        this.mapper = mapper;
    }

    public Touristorder addorder(TouristorderDto touristorderDto) {
        Touristorder touristorder = new Touristorder();
        Customer customer = new Customer();
        customer.setId(touristorderDto.getCustomerid());
        Tourismpackages tourismpackages = new Tourismpackages();
        tourismpackages.setId(touristorderDto.getPackageid());
        touristorder.setCustomer(customer);
        touristorder.setPackageid(tourismpackages);
        return touristorderrepository.save(touristorder);
    }

    public List<TouristorderDtoAll> getAllCustomer() {
        List<Touristorder> touristorders = touristorderrepository.findAll();
        List<TouristorderDtoAll> touristoderDtos = new ArrayList<>();
        for (Touristorder touristorder : touristorders) {
            touristoderDtos.add(mapper.map(touristorder, TouristorderDtoAll.class));

        }
        return touristoderDtos;
    }
    public List<Order> getalloOrders(){
        return touristorderrepository.getOrder();
    }

    public Order getoderssss(Long customerid,Long packageid){
        System.out.print(customerid +packageid);
        return touristorderrepository.getOrderbyid(customerid, packageid); 
    }
    //  public List<Order> getOrderss (LocalDate date1,LocalDate date2){
    //    return touristorderrepository.getOrderbyid(date1, date2);
    //  }

}
