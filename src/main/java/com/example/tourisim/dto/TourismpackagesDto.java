package com.example.tourisim.dto;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class TourismpackagesDto {
    private String name;
    private double cost;
    private String description;
    private Date startdate;
    private MultipartFile image;
    private  Date finishdate;
    public TourismpackagesDto() {
    }
    public TourismpackagesDto(String name, double cost, String description, Date startdate, MultipartFile image,
            Date finishdate) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.startdate = startdate;
        this.image = image;
        this.finishdate = finishdate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
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
    public MultipartFile getImage() {
        return image;
    }
    public void setImage(MultipartFile image) {
        this.image = image;
    }
    public Date getFinishdate() {
        return finishdate;
    }
    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }
    
    
    
}
