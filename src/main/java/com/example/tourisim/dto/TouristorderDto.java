package com.example.tourisim.dto;

public class TouristorderDto {
    private long customerid;
    private long packageid;
    
    public TouristorderDto() {
    }

    public TouristorderDto(long customerid, long packageid) {
        this.customerid = customerid;
        this.packageid = packageid;
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
 