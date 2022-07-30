package com.example.tourisim.dto;

import lombok.Data;

@Data
public interface Order {
    Long getId(); 
    Long getCustomerid();
    Long getPackageid();
    String getName();
    Double getCost();
   String getFirstname();
  String getLastname();




}
