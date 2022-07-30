package com.example.tourisim.dto;

import lombok.Data;

@Data
public class TouristorderDtoAll {
   private long id;
   private long customerid;
   private long packageid;
    public TouristorderDtoAll() {
    }
    public TouristorderDtoAll(long id, long customerid, long packageid) {
        this.id = id;
        this.customerid = customerid;
        this.packageid = packageid;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCustomerid() {
        return customerid;
    }
    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }
    public long getPackageid() {
        return packageid;
    }
    public void setPackageid(long packageid) {
        this.packageid = packageid;
    }
    

}
    