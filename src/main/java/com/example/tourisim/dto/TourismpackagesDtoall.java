package com.example.tourisim.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class TourismpackagesDtoall {
    
    private Long id;
    private String name;
   // private double cost;
    private String description;
    private Date startdate;
    private Date finishdate;
    private String image;
    public TourismpackagesDtoall() {
    }
    public TourismpackagesDtoall(Long id, String name, double cost, String description, Date startdate, Date finishdate,
            String image) {
        this.id = id;
        this.name = name;
       // this.cost = cost;
        this.description = description;
        this.startdate = startdate;
        this.finishdate = finishdate;
        this.image = image;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//    public double getCost() {
//         return cost;
//     }
//     public void setCost(double cost) {
//         this.cost = cost;
//     }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getStartdate() {
        return startdate;
    }
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
    public Date getFinishdate() {
        return finishdate;
    }
    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    
    
}
